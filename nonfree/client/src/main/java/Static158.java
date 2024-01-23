import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!mb", name = "X", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
	public static int anInt3653;

	@OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
	public static int anInt3659;

	@OriginalMember(owner = "client!mb", name = "R", descriptor = "J")
	public static long aLong127 = 0L;

	@OriginalMember(owner = "client!mb", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString107 = "Loaded textures";

	@OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
	public static int anInt3656 = 0;

	@OriginalMember(owner = "client!mb", name = "fb", descriptor = "Z")
	public static boolean aBoolean189 = false;

	@OriginalMember(owner = "client!mb", name = "ib", descriptor = "[S")
	public static short[] aShortArray61 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!ek;)I")
	public static int method2960(@OriginalArg(1) Class25_Sub1_Sub2 arg0) {
		@Pc(4) Class143 local4 = arg0.aClass143_1;
		if (local4.anIntArray535 != null) {
			local4 = local4.method4065();
			if (local4 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local4.anInt5166;
		@Pc(32) Class124 local32 = arg0.method1232();
		if (local32.anInt4578 == arg0.anInt1646) {
			local28 = local4.anInt5180;
		} else if (arg0.anInt1646 == local32.anInt4571 || arg0.anInt1646 == local32.anInt4575 || arg0.anInt1646 == local32.anInt4597 || arg0.anInt1646 == local32.anInt4600) {
			local28 = local4.anInt5191;
		} else if (local32.anInt4602 == arg0.anInt1646 || arg0.anInt1646 == local32.anInt4580 || local32.anInt4584 == arg0.anInt1646 || arg0.anInt1646 == local32.anInt4573) {
			local28 = local4.anInt5168;
		}
		return local28;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIII)V")
	public static void method2961(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg0) {
			Static284.method4682(arg1, arg2, arg4, arg3);
		} else if (Static102.anInt2239 <= arg3 - arg4 && arg4 + arg3 <= Static88.anInt2052 && Static152.anInt3532 <= arg2 - arg0 && arg2 + arg0 <= Static223.anInt1245) {
			Static224.method3923(arg1, arg3, arg2, arg4, arg0);
		} else {
			Static142.method2528(arg3, arg2, arg4, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BIC)C")
	public static char method2962(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 == 'Ñ' && arg0 != 0) {
				return 'N';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 == 'ñ' && arg0 != 0) {
				return 'n';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
	public static void method2963() {
		Static59.anInt1532 = 0;
		Static4.anInt139 = 0;
		Static218.aBoolean267 = false;
		Static270.anInt5842 = 0;
		Static111.anInt2398 = 0;
		Static71.anInt1777 = 0;
		Static254.anInt5398 = -1;
		Static199.anInt4491 = -1;
		Static5.anInt141 = 0;
		Static81.aClass1_Sub16_Sub1_1.anInt3328 = 0;
		Static74.anInt1835 = -1;
		Static80.anInt1911 = -1;
		Static222.aClass1_Sub16_Sub1_3.anInt3328 = 0;
		@Pc(35) int local35;
		for (local35 = 0; local35 < Static271.aClass25_Sub1_Sub1Array1.length; local35++) {
			if (Static271.aClass25_Sub1_Sub1Array1[local35] != null) {
				Static271.aClass25_Sub1_Sub1Array1[local35].anInt1631 = -1;
			}
		}
		for (local35 = 0; local35 < Static27.aClass25_Sub1_Sub2Array1.length; local35++) {
			if (Static27.aClass25_Sub1_Sub2Array1[local35] != null) {
				Static27.aClass25_Sub1_Sub2Array1[local35].anInt1631 = -1;
			}
		}
		Static216.method3790();
		Static280.anInt5999 = 1;
		Static140.method2511(30);
		for (local35 = 0; local35 < 100; local35++) {
			Static165.aBooleanArray16[local35] = true;
		}
		Static156.method2883();
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)Z")
	public static boolean method2965() {
		if (Static130.aBoolean148) {
			try {
				Static301.method406("showVideoAd", Static43.aClass66_1.anApplet1);
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BCLjava/lang/StringBuffer;I)Ljava/lang/StringBuffer;")
	public static StringBuffer method2966(@OriginalArg(2) StringBuffer arg0) {
		@Pc(8) int local8 = arg0.length();
		arg0.setLength(0);
		for (@Pc(13) int local13 = local8; local13 < 0; local13++) {
			arg0.setCharAt(local13, ' ');
		}
		return arg0;
	}
}
