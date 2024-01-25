import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!se", name = "u", descriptor = "Z")
	public static boolean aBoolean776;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "[I")
	public static int[] anIntArray661;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BC)B")
	public static byte method7988(@OriginalArg(1) char arg0) {
		@Pc(33) byte local33;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local33 = (byte) arg0;
		} else if (arg0 == '€') {
			local33 = -128;
		} else if (arg0 == '‚') {
			local33 = -126;
		} else if (arg0 == 'ƒ') {
			local33 = -125;
		} else if (arg0 == '„') {
			local33 = -124;
		} else if (arg0 == '…') {
			local33 = -123;
		} else if (arg0 == '†') {
			local33 = -122;
		} else if (arg0 == '‡') {
			local33 = -121;
		} else if (arg0 == 'ˆ') {
			local33 = -120;
		} else if (arg0 == '‰') {
			local33 = -119;
		} else if (arg0 == 'Š') {
			local33 = -118;
		} else if (arg0 == '‹') {
			local33 = -117;
		} else if (arg0 == 'Œ') {
			local33 = -116;
		} else if (arg0 == 'Ž') {
			local33 = -114;
		} else if (arg0 == '‘') {
			local33 = -111;
		} else if (arg0 == '’') {
			local33 = -110;
		} else if (arg0 == '“') {
			local33 = -109;
		} else if (arg0 == '”') {
			local33 = -108;
		} else if (arg0 == '•') {
			local33 = -107;
		} else if (arg0 == '–') {
			local33 = -106;
		} else if (arg0 == '—') {
			local33 = -105;
		} else if (arg0 == '˜') {
			local33 = -104;
		} else if (arg0 == '™') {
			local33 = -103;
		} else if (arg0 == 'š') {
			local33 = -102;
		} else if (arg0 == '›') {
			local33 = -101;
		} else if (arg0 == 'œ') {
			local33 = -100;
		} else if (arg0 == 'ž') {
			local33 = -98;
		} else if (arg0 == 'Ÿ') {
			local33 = -97;
		} else {
			local33 = 63;
		}
		return local33;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg3 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(36) int local36 = local7 * (Static480.aShort104 - Static369.aShort71) / 100 + Static369.aShort71;
		Static96.anInt1733 = local36 * Static96.anInt1730 >> 8;
		@Pc(48) int local48 = arg5 * local36 >> 8;
		@Pc(55) int local55 = 16384 - arg6 & 0x3FFF;
		@Pc(62) int local62 = 16384 - arg1 & 0x3FFF;
		@Pc(64) int local64 = 0;
		@Pc(66) int local66 = 0;
		@Pc(68) int local68 = local48;
		if (local55 != 0) {
			local66 = -local48 * Class145_Sub1.anIntArray761[local55] >> 14;
			local68 = local48 * Class145_Sub1.anIntArray760[local55] >> 14;
		}
		if (local62 != 0) {
			local64 = Class145_Sub1.anIntArray761[local62] * local68 >> 14;
			local68 = local68 * Class145_Sub1.anIntArray760[local62] >> 14;
		}
		Static583.anInt2354 = arg6;
		Static322.anInt4929 = 0;
		Static218.anInt3475 = arg2 - local68;
		Static611.anInt9456 = arg1;
		Static430.anInt7002 = arg4 - local64;
		Static411.anInt6731 = arg0 - local66;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method7991(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg0 - arg1;
		if (local17 < -9) {
			return "<col=ff0000>";
		} else if (local17 < -6) {
			return "<col=ff3000>";
		} else if (local17 < -3) {
			return "<col=ff7000>";
		} else if (local17 < 0) {
			return "<col=ffb000>";
		} else if (local17 > 9) {
			return "<col=00ff00>";
		} else if (local17 > 6) {
			return "<col=40ff00>";
		} else if (local17 > 3) {
			return "<col=80ff00>";
		} else if (local17 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)Z")
	public static boolean method7994(@OriginalArg(1) int arg0) {
		if (arg0 == 4 || arg0 == 23 || arg0 == 48 || arg0 == 18 || arg0 == 1010 || arg0 == 1002) {
			return true;
		} else {
			return arg0 == 30;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!lf;B)Z")
	public static boolean method7995(@OriginalArg(0) Class221 arg0) {
		try {
			return Static168.method2526(arg0);
		} catch (@Pc(17) IOException local17) {
			if (Static357.anInt5722 == 9) {
				arg0.aClass5_2 = null;
				return false;
			} else {
				Static284.method3979();
				return true;
			}
		} catch (@Pc(31) Exception local31) {
			@Pc(105) String local105 = "T2 - " + (arg0.aClass225_108 == null ? -1 : arg0.aClass225_108.method5268()) + "," + (arg0.aClass225_109 == null ? -1 : arg0.aClass225_109.method5268()) + "," + (arg0.aClass225_110 == null ? -1 : arg0.aClass225_110.method5268()) + " - " + arg0.anInt5773 + "," + (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray183[0] + Static243.anInt3820) + "," + (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray182[0] + Static224.anInt11062) + " - ";
			for (@Pc(107) int local107 = 0; arg0.anInt5773 > local107 && local107 < 50; local107++) {
				local105 = local105 + arg0.aClass2_Sub20_Sub2_2.aByteArray111[local107] + ",";
			}
			Static329.method4572(local105, local31);
			Static264.method3744(false);
			return true;
		}
	}
}
