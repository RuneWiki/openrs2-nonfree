import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "Lclient!ss;")
	public static Class219 aClass219_16 = null;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "J")
	public static long aLong194 = 0L;

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "Z")
	public static boolean aBoolean406 = true;

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "[I")
	public static final int[] anIntArray521 = new int[32];

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(CII)C")
	public static char method5113(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && arg1 != 0) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && arg1 != 0) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method5114(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V")
	public static void method5115() {
		if (Static57.anInt1183 < 0) {
			return;
		}
		@Pc(4) long local4 = Static101.method1557();
		Static57.anInt1183 = (int) ((long) Static57.anInt1183 + Static153.aLong190 - local4);
		if (Static57.anInt1183 > 0) {
			@Pc(21) int local21 = (Static57.anInt1183 << 8) / Static222.anInt6920;
			@Pc(26) int local26 = 255 - local21;
			@Pc(31) float local31 = (float) local21 / 255.0F;
			Static229.anInt5114 = ((Static91.anInt1742 & 0xFF00) * local21 + local26 * (Static109.aClass33_1.anInt735 & 0xFF00) & 0xFF0000) + ((Static109.aClass33_1.anInt735 & 0xFF00FF) * local26 + local21 * (Static91.anInt1742 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			@Pc(67) float local67 = 1.0F - local31;
			Static449.aFloat95 = (Static109.aClass33_1.aFloat18 - Static216.aFloat73) * local67 + Static216.aFloat73;
			Static153.aFloat88 = (Static109.aClass33_1.aFloat22 - Static450.aFloat96) * local67 + Static450.aFloat96;
			Static153.aFloat87 = Static60.aFloat29 + (Static109.aClass33_1.aFloat21 - Static60.aFloat29) * local67;
			Static300.aFloat82 = local67 * (Static109.aClass33_1.aFloat17 - Static189.aFloat63) + Static189.aFloat63;
			Static187.anInt4911 = (local21 * (Static183.anInt3354 & 0xFF00) + local26 * (Static109.aClass33_1.anInt732 & 0xFF00) & 0xFF0000) + (local21 * (Static183.anInt3354 & 0xFF00FF) + (local26 * (Static109.aClass33_1.anInt732 & 0xFF00FF)) & 0xFF00FF00) >>> 8;
			Static452.anInt7813 = local21 * Static32.anInt624 + local26 * Static109.aClass33_1.anInt733 >> 8;
			Static219.aFloat74 = (Static109.aClass33_1.aFloat19 - Static109.aFloat34) * local67 + Static109.aFloat34;
			Static208.aFloat69 = Static387.aFloat90 + local67 * (Static109.aClass33_1.aFloat20 - Static387.aFloat90);
			if (Static109.aClass33_1.aClass78_2 != Static441.aClass78_4) {
				Static256.aClass78_3 = Static269.aClass109_9.method4735(Static441.aClass78_4, Static109.aClass33_1.aClass78_2, local67, Static256.aClass78_3);
			}
		} else {
			Static153.aFloat88 = Static109.aClass33_1.aFloat22;
			Static452.anInt7813 = Static109.aClass33_1.anInt733;
			Static300.aFloat82 = Static109.aClass33_1.aFloat17;
			Static219.aFloat74 = Static109.aClass33_1.aFloat19;
			Static256.aClass78_3 = Static109.aClass33_1.aClass78_2;
			Static57.anInt1183 = -1;
			Static449.aFloat95 = Static109.aClass33_1.aFloat18;
			Static187.anInt4911 = Static109.aClass33_1.anInt732;
			Static229.anInt5114 = Static109.aClass33_1.anInt735;
			Static208.aFloat69 = Static109.aClass33_1.aFloat20;
			Static153.aFloat87 = Static109.aClass33_1.aFloat21;
		}
		Static153.aLong190 = local4;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(II)V")
	public static void method5116(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub1 local8 = Static258.method5559(arg0, 14);
		local8.method195();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZII)V")
	public static void method5118(@OriginalArg(1) boolean arg0) {
		Static78.anInt1548 = 22050;
		Static93.aBoolean97 = arg0;
		Static288.anInt5041 = 2;
	}
}
