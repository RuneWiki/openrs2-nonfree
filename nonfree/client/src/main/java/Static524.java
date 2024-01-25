import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "Lclient!gea;")
	public static Class97 aClass97_3;

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
	public static int anInt9107 = -1;

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_157 = new Class44(132, 3);

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "Z")
	public static boolean aBoolean637 = false;

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "Z")
	public static boolean aBoolean638 = false;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
	public static void method7528() {
		for (@Pc(8) Class14_Sub3_Sub21 local8 = (Class14_Sub3_Sub21) Static563.aClass73_11.method1826(); local8 != null; local8 = (Class14_Sub3_Sub21) Static563.aClass73_11.method1827()) {
			if (local8.anInt11129 > 1) {
				local8.anInt11129 = 0;
				Static228.aClass264_25.method6364(((Class14_Sub3_Sub11) local8.aClass73_13.aClass14_Sub3_20.aClass14_Sub3_67).aLong145, local8);
				local8.aClass73_13.method1819();
			}
		}
		Static313.anInt9044 = 0;
		Static569.anInt9810 = 0;
		Static16.aClass262_68.method6316();
		Static38.aClass187_6.method4076();
		Static563.aClass73_11.method1819();
		Static505.aBoolean629 = false;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIII)V")
	public static void method7529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static507.method7426(local35, false, true);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIII)Lclient!qaa;")
	public static Class144 method7530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(33) long local33 = (long) arg3 * 76724863L ^ (long) arg4 * 32147369L ^ (long) arg5 * 986053L ^ (long) arg0 * 475427L ^ (long) arg2 * 97549L ^ (long) arg1 * 67481L;
		@Pc(39) Class144 local39 = (Class144) Static16.aClass264_58.method6367(local33);
		if (local39 == null) {
			local39 = Static354.aClass137_31.method7928(arg1, arg2, arg0, arg5, arg4, arg3);
			Static16.aClass264_58.method6364(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;Z)V")
	public static void method7532(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static345.method5289(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static502.method7353(local7);
			local7 = Static337.method5263("%3a", ":", local7);
			local7 = Static337.method5263("%40", "@", local7);
			local7 = Static337.method5263("%26", "&", local7);
			local7 = Static337.method5263("%23", "#", local7);
			if (Static282.anApplet1 != null) {
				@Pc(107) Class150 local107 = Static640.aClass333_4.method8133(new URL(Static282.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static516.anInt9038 + "&u=" + (Static219.aString46 == null ? String.valueOf(Static484.aLong234) : Static219.aString46) + "&v1=" + Static565.aString94 + "&v2=" + Static565.aString95 + "&e=" + local7));
				while (local107.anInt4247 == 0) {
					Static20.method9254(1L);
				}
				if (local107.anInt4247 == 1) {
					@Pc(126) DataInputStream local126 = (DataInputStream) local107.anObject8;
					local126.read();
					local126.close();
				}
			}
		} catch (@Pc(133) Exception local133) {
		}
	}
}
