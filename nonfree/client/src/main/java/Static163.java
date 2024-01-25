import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fn", name = "v", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_106 = new Class288(68, -1);

	@OriginalMember(owner = "client!fn", name = "A", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_41 = new Class179(5, 11);

	@OriginalMember(owner = "client!fn", name = "C", descriptor = "Z")
	public static boolean aBoolean222 = false;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2444(@OriginalArg(0) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(11) int local11 = arg0.indexOf("--> ");
		if (local11 >= 0) {
			local7 = arg0.substring(0, local11 + 4);
			arg0 = arg0.substring(local11 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(36) int local36 = arg0.indexOf(" ", "directlogin ".length());
			if (local36 >= 0) {
				@Pc(41) int local41 = arg0.length();
				arg0 = arg0.substring(0, local36) + " ";
				for (@Pc(57) int local57 = local36 + 1; local57 < local41; local57++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method2447(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(15) String local15 = "";
			if (arg0 != null) {
				local15 = Static294.method4060(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local15 = local15 + " | ";
				}
				local15 = local15 + arg1;
			}
			Static72.method1005(local15);
			local15 = Static380.method5070(":", local15, "%3a");
			local15 = Static380.method5070("@", local15, "%40");
			local15 = Static380.method5070("&", local15, "%26");
			local15 = Static380.method5070("#", local15, "%23");
			if (Static322.anApplet1 != null) {
				@Pc(110) Class108 local110 = Static252.aClass226_3.method4846(new URL(Static322.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static641.anInt10326 + "&u=" + (Static447.aString103 == null ? String.valueOf(Static613.aLong266) : Static447.aString103) + "&v1=" + Static359.aString71 + "&v2=" + Static359.aString70 + "&e=" + local15));
				while (local110.anInt2766 == 0) {
					Static444.method6061(1L);
				}
				if (local110.anInt2766 == 1) {
					@Pc(129) DataInputStream local129 = (DataInputStream) local110.anObject6;
					local129.read();
					local129.close();
				}
			}
		} catch (@Pc(136) Exception local136) {
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 >= Static379.anInt5914 && Static624.anInt10032 >= arg5 && arg1 >= Static257.anInt4068 && Static67.anInt1214 >= arg3) {
			Static610.method8218(arg0, arg2, arg6, arg5, arg3, arg1, arg4);
		} else {
			Static177.method7515(arg3, arg6, arg1, arg0, arg4, arg5, arg2);
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2450(@OriginalArg(0) String arg0) {
		if (Class363.aString107.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class363.aString107.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class363.aString107.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
