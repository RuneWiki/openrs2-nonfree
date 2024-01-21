import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "[I")
	public static int[] anIntArray106;

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "Lclient!sf;")
	public static Class5 aClass5_25;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "[Lclient!sc;")
	public static Class66[] aClass66Array2 = new Class66[100];

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "Lclient!sc;")
	public static Class66 aClass66_462 = Static106.method1849("VOLL");

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "Lclient!sc;")
	private static Class66 aClass66_464 = Static106.method1849("Loaded fonts");

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "Lclient!sc;")
	public static Class66 aClass66_463 = aClass66_464;

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
	public static int anInt753 = 0;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "Lclient!he;")
	public static Class1_Sub10 aClass1_Sub10_5 = null;

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "Lclient!sc;")
	public static Class66 aClass66_465 = Static106.method1849("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method556() {
		@Pc(7) Class56 local7 = Static117.aClass56_1;
		synchronized (Static117.aClass56_1) {
			Static123.anInt2836 = Static98.anInt2484;
			@Pc(18) int local18;
			if (Static13.anInt463 < 0) {
				for (local18 = 0; local18 < 112; local18++) {
					Static122.aBooleanArray17[local18] = false;
				}
				Static13.anInt463 = Static84.anInt2215;
			} else {
				while (Static84.anInt2215 != Static13.anInt463) {
					local18 = Static81.anIntArray362[Static84.anInt2215];
					Static84.anInt2215 = Static84.anInt2215 + 1 & 0x7F;
					if (local18 < 0) {
						Static122.aBooleanArray17[~local18] = false;
					} else {
						Static122.aBooleanArray17[local18] = true;
					}
				}
			}
			Static98.anInt2484 = Static117.anInt2754;
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	public static void method557() {
		anIntArray106 = null;
		aClass66_463 = null;
		aClass66Array2 = null;
		aClass66_464 = null;
		aClass66_462 = null;
		aClass1_Sub10_5 = null;
		aByteArrayArray2 = null;
		aClass66_465 = null;
		aClass5_25 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!id;IIB)V")
	public static void method559(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static5.anInt228 >= 400) {
			return;
		}
		if (arg1.anIntArray222 != null) {
			arg1 = arg1.method1040();
		}
		if (arg1 == null || !arg1.aBoolean59) {
			return;
		}
		@Pc(28) Class66 local28 = arg1.aClass66_794;
		if (arg1.anInt1485 != 0) {
			local28 = Static41.method897(new Class66[] { local28, Static41.method901(arg1.anInt1485, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1314), Static44.aClass66_738, Static15.aClass66_1755, Static88.method1632(arg1.anInt1485), Static63.aClass66_1016 });
		}
		if (Static84.anInt2224 == 1) {
			Static98.method1749(Static11.aClass66_241, 25, arg0, arg2, arg3, Static41.method897(new Class66[] { Static42.aClass66_710, Static8.aClass66_214, local28 }));
		} else if (!Static51.aBoolean65) {
			@Pc(115) Class66[] local115 = arg1.aClass66Array7;
			if (Static89.aBoolean97) {
				local115 = Static98.method1752(local115);
			}
			@Pc(125) int local125;
			if (local115 != null) {
				for (local125 = 4; local125 >= 0; local125--) {
					if (local115[local125] != null && !local115[local125].method1843(Static116.aClass66_1568)) {
						@Pc(144) byte local144 = 0;
						if (local125 == 0) {
							local144 = 12;
						}
						if (local125 == 1) {
							local144 = 43;
						}
						if (local125 == 2) {
							local144 = 58;
						}
						if (local125 == 3) {
							local144 = 35;
						}
						if (local125 == 4) {
							local144 = 19;
						}
						Static98.method1749(local115[local125], local144, arg0, arg2, arg3, Static41.method897(new Class66[] { Static19.aClass66_363, local28 }));
					}
				}
			}
			if (local115 != null) {
				for (local125 = 4; local125 >= 0; local125--) {
					if (local115[local125] != null && local115[local125].method1843(Static116.aClass66_1568)) {
						@Pc(220) short local220 = 0;
						if (arg1.anInt1485 > Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1314) {
							local220 = 2000;
						}
						@Pc(233) int local233 = 0;
						if (local125 == 0) {
							local233 = local220 + 12;
						}
						if (local125 == 1) {
							local233 = local220 + 43;
						}
						if (local125 == 2) {
							local233 = local220 + 58;
						}
						if (local125 == 3) {
							local233 = local220 + 35;
						}
						if (local125 == 4) {
							local233 = local220 + 19;
						}
						Static98.method1749(local115[local125], local233, arg0, arg2, arg3, Static41.method897(new Class66[] { Static19.aClass66_363, local28 }));
					}
				}
			}
			Static98.method1749(Static14.aClass66_304, 1006, arg0, arg2, arg3, Static41.method897(new Class66[] { Static19.aClass66_363, local28 }));
		} else if ((Static128.anInt2909 & 0x2) == 2) {
			Static98.method1749(Static87.aClass66_1277, 45, arg0, arg2, arg3, Static41.method897(new Class66[] { Static27.aClass66_445, Static8.aClass66_214, local28 }));
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
	public static void method561(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(2) int[] local2 = new int[4];
		@Pc(8) int local8 = 1;
		local2[0] = arg1;
		@Pc(15) int[] local15 = new int[4];
		local15[0] = arg0;
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			if (Static119.anIntArray481[local21] != arg1) {
				local2[local8] = Static119.anIntArray481[local21];
				local15[local8] = Static44.anIntArray208[local21];
				local8++;
			}
		}
		Static119.anIntArray481 = local2;
		Static44.anIntArray208 = local15;
		Static33.method630(Static119.anIntArray481, 0, Static18.aClass4Array1.length - 1, Static44.anIntArray208, Static18.aClass4Array1);
	}
}
