import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
	public static int anInt3936;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Lclient!ek;")
	public static Class42 aClass42_52;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "Lclient!ek;")
	public static Class42 aClass42_53;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
	public static int anInt3941;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString131 = "flash3:";

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method3235(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static94.method1662(Static228.method3719(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Z")
	public static boolean method3239(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(13) int local13 = Static290.aShortArray85[arg0];
		if (local13 >= 2000) {
			local13 -= 2000;
		}
		return local13 == 1011;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method3240(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(16) String local16 = "";
			if (arg0 != null) {
				local16 = Static232.method3773(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local16 = local16 + " | ";
				}
				local16 = local16 + arg1;
			}
			Static287.method4465(local16);
			local16 = Static197.method3389("%3a", local16, ":");
			local16 = Static197.method3389("%40", local16, "@");
			local16 = Static197.method3389("%26", local16, "&");
			local16 = Static197.method3389("%23", local16, "#");
			if (Static204.aClass102_3.anApplet1 == null) {
				return;
			}
			@Pc(114) Class111 local114 = Static204.aClass102_3.method2892(new URL(Static204.aClass102_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + anInt3941 + "&u=" + Static64.aLong55 + "&v1=" + Static158.aString118 + "&v2=" + Static158.aString119 + "&e=" + local16));
			while (local114.anInt3788 == 0) {
				Static138.method2475(1L);
			}
			if (local114.anInt3788 == 1) {
				@Pc(136) DataInputStream local136 = (DataInputStream) local114.anObject4;
				local136.read();
				local136.close();
			}
		} catch (@Pc(143) Exception local143) {
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII)I")
	public static int method3241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}
}
