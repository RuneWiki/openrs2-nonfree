import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
	public static int anInt2846;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
	public static final int anInt2842 = 1400;

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "[I")
	public static final int[] anIntArray239 = new int[500];

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
	public static int anInt2845 = -1;

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
	public static void method2231() {
		if (Static75.aBoolean120) {
			return;
		}
		Static280.aBoolean347 = true;
		if (Static126.aClass67_Sub1_1.aBoolean402) {
			Static146.aFloat82 = (int) Static146.aFloat82 + 191 & 0xFFFFFF80;
		} else {
			Static8.aFloat8 += (24.0F - Static8.aFloat8) / 2.0F;
		}
		Static75.aBoolean120 = true;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
	public static void method2232() {
		for (@Pc(15) Class4_Sub13 local15 = (Class4_Sub13) Static214.aClass258_32.method5538(); local15 != null; local15 = (Class4_Sub13) Static214.aClass258_32.method5528()) {
			if (Static40.aClass53ArrayArrayArray2 == null) {
				local15.method5854();
			} else {
				@Pc(41) int local41;
				@Pc(263) Class6_Sub1 local263;
				@Pc(299) Class6_Sub1_Sub3 local299;
				@Pc(171) Class6_Sub4 local171;
				@Pc(70) Class6_Sub2 local70;
				@Pc(208) Class6_Sub3 local208;
				@Pc(190) Class6_Sub4_Sub3 local190;
				@Pc(244) Class6_Sub3_Sub3 local244;
				if (Static175.anInt3261 >= local15.anInt2487) {
					local41 = Static76.anIntArray111[local15.anInt2502];
					if (local41 == 0) {
						local263 = Static138.method1998(local15.anInt2499, local15.anInt2495, local15.anInt2492);
						if (local263 instanceof Class6_Sub1_Sub3) {
							Static310.method4277(local15.anInt2499, local15.anInt2495, local15.anInt2492);
							local299 = (Class6_Sub1_Sub3) local263;
							if (local299.aClass6_Sub1_3 != null) {
								Static206.method2947(local15.anInt2499, local15.anInt2495, local15.anInt2492, local299.aClass6_Sub1_3, null);
							}
						}
					} else if (local41 == 1) {
						local208 = Static351.method4929(local15.anInt2499, local15.anInt2495, local15.anInt2492);
						if (local208 instanceof Class6_Sub3_Sub3) {
							Static304.method4195(local15.anInt2499, local15.anInt2495, local15.anInt2492);
							local244 = (Class6_Sub3_Sub3) local208;
							if (local244.aClass6_Sub3_3 != null) {
								Static441.method3961(local15.anInt2499, local15.anInt2495, local15.anInt2492, local244.aClass6_Sub3_3, null);
							}
						}
					} else if (local41 == 2) {
						local70 = Static134.method1950(local15.anInt2499, local15.anInt2495, local15.anInt2492, ou.class);
						if (local70 instanceof Class6_Sub2_Sub2) {
							Static262.method3575(local15.anInt2499, local15.anInt2495, local15.anInt2492, ou.class);
							@Pc(439) Class6_Sub2_Sub2 local439 = (Class6_Sub2_Sub2) local70;
							if (local439.aClass6_Sub2_1 != null) {
								Static235.method3268(local439.aClass6_Sub2_1, false);
							}
						}
					} else if (local41 == 3) {
						local171 = Static40.method729(local15.anInt2499, local15.anInt2495, local15.anInt2492);
						if (local171 instanceof Class6_Sub4_Sub3) {
							Static33.method628(local15.anInt2499, local15.anInt2495, local15.anInt2492);
							local190 = (Class6_Sub4_Sub3) local171;
							if (local190.aClass6_Sub4_2 != null) {
								Static139.method2007(local15.anInt2499, local15.anInt2495, local15.anInt2492, local190.aClass6_Sub4_2);
							}
						}
					}
					local15.method5854();
				} else if (Static175.anInt3261 == local15.anInt2496) {
					local41 = Static76.anIntArray111[local15.anInt2502];
					if (local41 == 0) {
						local263 = Static138.method1998(local15.anInt2499, local15.anInt2495, local15.anInt2492);
						if (local263 instanceof Class6_Sub1_Sub3) {
							local15.method5854();
						} else if (Static3.method104(local15.anInt2499, local15.anInt2495, local15.anInt2492) == null) {
							local299 = new Class6_Sub1_Sub3(local15.anInt2502, local15.anInt2489, local15.anInt2498, local15.anInt2505, local15.anInt2491, local263);
							Static206.method2947(local15.anInt2499, local15.anInt2495, local15.anInt2492, local299, null);
						} else {
							local15.method5854();
						}
					} else if (local41 == 1) {
						local208 = Static351.method4929(local15.anInt2499, local15.anInt2495, local15.anInt2492);
						if (local208 instanceof Class6_Sub3_Sub3) {
							local15.method5854();
						} else if (Static224.method3139(local15.anInt2499, local15.anInt2495, local15.anInt2492) == null) {
							local244 = new Class6_Sub3_Sub3(local15.anInt2502, local15.anInt2489, local15.anInt2498, local15.anInt2505, local15.anInt2491, local208);
							Static441.method3961(local15.anInt2499, local15.anInt2495, local15.anInt2492, local244, null);
						} else {
							local15.method5854();
						}
					} else if (local41 == 2) {
						local70 = Static134.method1950(local15.anInt2499, local15.anInt2495, local15.anInt2492, ou.class);
						if (local70 instanceof Class6_Sub2_Sub2) {
							local15.method5854();
						} else {
							Static262.method3575(local15.anInt2499, local15.anInt2495, local15.anInt2492, ou.class);
							@Pc(99) Class71 local99 = Static2.aClass74_13.method1683(local15.anInt2503);
							@Pc(110) int local110;
							@Pc(113) int local113;
							if (local15.anInt2489 == 1 || local15.anInt2489 == 3) {
								local110 = local99.anInt2198;
								local113 = local99.anInt2169;
							} else {
								local113 = local99.anInt2198;
								local110 = local99.anInt2169;
							}
							@Pc(154) Class6_Sub2_Sub2 local154 = new Class6_Sub2_Sub2(local15.anInt2502, local15.anInt2489, local15.anInt2499, local15.anInt2498, local15.anInt2505, local15.anInt2491, local15.anInt2495, local15.anInt2495 + local110 - 1, local15.anInt2492, local15.anInt2492 + local113 - 1, local70);
							Static235.method3268(local154, false);
						}
					} else if (local41 == 3) {
						local171 = Static40.method729(local15.anInt2499, local15.anInt2495, local15.anInt2492);
						if (local171 instanceof Class6_Sub4_Sub3) {
							local15.method5854();
						} else {
							local190 = new Class6_Sub4_Sub3(local15.anInt2498, local15.anInt2505, local15.anInt2491, local171);
							Static139.method2007(local15.anInt2499, local15.anInt2495, local15.anInt2492, local190);
						}
					}
				}
			}
		}
	}
}
