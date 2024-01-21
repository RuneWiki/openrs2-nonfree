import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!w", name = "r", descriptor = "I")
	public static int anInt3120;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "Lclient!nc;")
	public static Class2_Sub2_Sub2 aClass2_Sub2_Sub2_2;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "Z")
	public static volatile boolean aBoolean242 = false;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "[I")
	public static int[] anIntArray406 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1190 = Static2.method59(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!w", name = "e", descriptor = "I")
	public static int anInt3112 = 0;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "I")
	public static int anInt3114 = 78;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1193 = Static2.method59("Ok");

	@OriginalMember(owner = "client!w", name = "h", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1191 = aClass80_1193;

	@OriginalMember(owner = "client!w", name = "i", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1192 = Static2.method59("scape main");

	@OriginalMember(owner = "client!w", name = "o", descriptor = "[Lclient!wd;")
	public static Class80[] aClass80Array20 = new Class80[200];

	@OriginalMember(owner = "client!w", name = "t", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1194 = Static2.method59("leuchten2:");

	@OriginalMember(owner = "client!w", name = "u", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1195 = Static2.method59("headicons_prayer");

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IILclient!ff;)Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 method1970(@OriginalArg(1) int arg0, @OriginalArg(2) Class11 arg1) {
		return Static53.method968(arg0, arg1) ? Static42.method683() : null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public static void method1971() {
		aClass2_Sub2_Sub2_2 = null;
		aClass80_1195 = null;
		aClass80_1194 = null;
		aClass80_1191 = null;
		aClass80_1193 = null;
		aClass80_1190 = null;
		aClass80_1192 = null;
		Class77.anIntArray407 = null;
		anIntArray406 = null;
		aClass80Array20 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZIILclient!qa;I)V")
	public static void method1972(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub1_Sub4_Sub2 arg2, @OriginalArg(4) int arg3) {
		if (Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1 == arg2 || Static103.anInt2679 >= 400) {
			return;
		}
		@Pc(61) Class80 local61;
		if (arg2.anInt2395 == 0) {
			local61 = Static93.method1444(new Class80[] { arg2.aClass80_924, Static57.method1026(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2387, arg2.anInt2387), Static87.aClass80_899, Static105.aClass80_909, Static28.method1422(arg2.anInt2387), Static43.aClass80_486 });
		} else {
			local61 = Static93.method1444(new Class80[] { arg2.aClass80_924, Static87.aClass80_899, Static56.aClass80_612, Static28.method1422(arg2.anInt2395), Static43.aClass80_486 });
		}
		@Pc(162) int local162;
		if (Static107.anInt2862 == 1) {
			Static59.method1043(arg0, 9, Static8.aClass80_109, arg1, Static93.method1444(new Class80[] { Static67.aClass80_712, Static18.aClass80_260, local61 }), arg3);
		} else if (!Static76.aBoolean141) {
			for (local162 = 4; local162 >= 0; local162--) {
				if (Static65.aClass80Array10[local162] != null) {
					@Pc(174) short local174 = 0;
					if (Static65.aClass80Array10[local162].method2006(Static92.aClass80_883)) {
						if (arg2.anInt2387 > Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2387) {
							local174 = 2000;
						}
						if (Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2397 != 0 && arg2.anInt2397 != 0) {
							if (Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2397 == arg2.anInt2397) {
								local174 = 2000;
							} else {
								local174 = 0;
							}
						}
					} else if (Static1.aBooleanArray1[local162]) {
						local174 = 2000;
					}
					@Pc(219) int local219 = 0;
					if (local162 == 0) {
						local219 = local174 + 37;
					}
					if (local162 == 1) {
						local219 = local174 + 58;
					}
					if (local162 == 2) {
						local219 = local174 + 49;
					}
					if (local162 == 3) {
						local219 = local174 + 34;
					}
					if (local162 == 4) {
						local219 = local174 + 36;
					}
					Static59.method1043(arg0, local219, Static65.aClass80Array10[local162], arg1, Static93.method1444(new Class80[] { Static3.aClass80_38, local61 }), arg3);
				}
			}
		} else if ((Static50.anInt1524 & 0x8) == 8) {
			Static59.method1043(arg0, 26, Static68.aClass80_721, arg1, Static93.method1444(new Class80[] { Static59.aClass80_631, Static18.aClass80_260, local61 }), arg3);
		}
		for (local162 = 0; local162 < Static103.anInt2679; local162++) {
			if (Static57.anIntArray218[local162] == 55) {
				Static2.aClass80Array1[local162] = Static93.method1444(new Class80[] { Static63.aClass80_666, Static45.aClass80_832, Static3.aClass80_38, local61 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
	public static void method1973() {
		Static35.aByteArrayArrayArray2 = null;
		Static71.anIntArray248 = null;
		Static106.anIntArray359 = null;
		Static10.aByteArrayArrayArray1 = null;
		Static97.aByteArrayArrayArray6 = null;
		Static79.anIntArrayArrayArray4 = null;
		Static1.anIntArray1 = null;
		Static40.aByteArrayArrayArray3 = null;
		Static122.anIntArray405 = null;
		Static93.aByteArrayArrayArray5 = null;
		Static51.anIntArrayArray20 = null;
		Static19.anIntArray99 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ff;IBI)Z")
	public static boolean method1974(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9 = arg0.method383(arg2, arg1);
		if (local9 == null) {
			return false;
		} else {
			Static39.method375(local9);
			return true;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BLclient!va;)Lclient!va;")
	public static Class2_Sub1_Sub17 method1975(@OriginalArg(1) Class2_Sub1_Sub17 arg0) {
		@Pc(7) Class2_Sub1_Sub17 local7 = Static44.method739(arg0);
		if (local7 == null) {
			local7 = arg0.aClass2_Sub1_Sub17_6;
		}
		return local7;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IZ)Lclient!va;")
	public static Class2_Sub1_Sub17 method1976(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static51.aClass2_Sub1_Sub17ArrayArray1[local7] == null || Static51.aClass2_Sub1_Sub17ArrayArray1[local7][local16] == null) {
			@Pc(30) boolean local30 = Static122.method1969(local7);
			if (!local30) {
				return null;
			}
		}
		return Static51.aClass2_Sub1_Sub17ArrayArray1[local7][local16];
	}
}
