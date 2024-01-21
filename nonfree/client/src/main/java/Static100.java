import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!la", name = "v", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!la", name = "x", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!la", name = "z", descriptor = "[[I")
	public static int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!la", name = "p", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_796 = Static158.method3034("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!la", name = "u", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_799 = Static158.method3034("Click to switch");

	@OriginalMember(owner = "client!la", name = "r", descriptor = "Lclient!ob;")
	public static Class60 aClass60_797 = aClass60_799;

	@OriginalMember(owner = "client!la", name = "t", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_798 = Static158.method3034("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!la", name = "y", descriptor = "Z")
	public static boolean aBoolean111 = false;

	@OriginalMember(owner = "client!la", name = "A", descriptor = "I")
	public static int anInt2885 = -1;

	@OriginalMember(owner = "client!la", name = "B", descriptor = "[I")
	public static final int[] anIntArray332 = new int[32];

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLclient!og;)Lclient!m;")
	public static Class4_Sub4 method2284(@OriginalArg(1) Class2_Sub3 arg0) {
		return new Class4_Sub4(arg0.method219(), arg0.method219(), arg0.method219(), arg0.method219(), arg0.method239(), arg0.method239(), arg0.method218());
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIII)V")
	public static void method2285(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static29.anInt889 == 0 && !Static58.aBoolean74) {
			Static61.method1423(Static101.aClass60_807, Static185.aClass60_1277, (short) 43, 0L, arg3 - arg1, arg0 + -arg2);
		}
		@Pc(29) long local29 = -1L;
		for (@Pc(31) int local31 = 0; local31 < Static125.anInt3409; local31++) {
			@Pc(37) long local37 = Static119.aLongArray6[local31];
			@Pc(42) int local42 = (int) local37 & 0x7F;
			@Pc(49) int local49 = (int) local37 >> 7 & 0x7F;
			@Pc(56) int local56 = (int) local37 >> 29 & 0x3;
			@Pc(63) int local63 = (int) (local37 >>> 32) & Integer.MAX_VALUE;
			if (local37 != local29) {
				local29 = local37;
				@Pc(184) int local184;
				if (local56 == 2 && Static96.method2446(Static62.anInt1923, local42, local49, local37)) {
					@Pc(82) Class2_Sub1_Sub9 local82 = Static158.method3037(local63);
					if (local82.anIntArray162 != null) {
						local82 = local82.method1262();
					}
					if (local82 == null) {
						continue;
					}
					if (Static29.anInt889 == 1) {
						Static61.method1423(Static193.method3536(new Class60[] { Static162.aClass60_1102, Static2.aClass60_1151, local82.aClass60_381 }), Static56.aClass60_405, (short) 47, local37, local42, local49);
					} else if (!Static58.aBoolean74) {
						@Pc(174) Class60[] local174 = local82.aClass60Array10;
						if (Static67.aBoolean87) {
							local174 = Static174.method3268(local174);
						}
						if (local174 != null) {
							for (local184 = 4; local184 >= 0; local184--) {
								if (local174[local184] != null) {
									@Pc(192) short local192 = 0;
									if (local184 == 0) {
										local192 = 51;
									}
									if (local184 == 1) {
										local192 = 17;
									}
									if (local184 == 2) {
										local192 = 23;
									}
									if (local184 == 3) {
										local192 = 46;
									}
									if (local184 == 4) {
										local192 = 1007;
									}
									Static61.method1423(Static193.method3536(new Class60[] { Static71.aClass60_1171, local82.aClass60_381 }), local174[local184], local192, local37, local42, local49);
								}
							}
						}
						Static61.method1423(Static193.method3536(new Class60[] { Static71.aClass60_1171, local82.aClass60_381 }), Static88.aClass60_704, (short) 1004, (long) local82.anInt1653, local42, local49);
					} else if ((Static101.anInt2923 & 0x4) == 4) {
						Static61.method1423(Static193.method3536(new Class60[] { Static167.aClass60_1132, Static2.aClass60_1151, local82.aClass60_381 }), Static4.aClass60_35, (short) 5, local37, local42, local49);
					}
				}
				@Pc(299) int local299;
				@Pc(307) Class2_Sub1_Sub1_Sub3_Sub2 local307;
				@Pc(358) Class2_Sub1_Sub1_Sub3_Sub1 local358;
				if (local56 == 1) {
					@Pc(278) Class2_Sub1_Sub1_Sub3_Sub2 local278 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local63];
					if (local278.aClass2_Sub1_Sub2_1.anInt343 == 1 && (local278.anInt3302 & 0x7F) == 64 && (local278.anInt3273 & 0x7F) == 64) {
						for (local299 = 0; local299 < Static174.anInt4255; local299++) {
							local307 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[Static180.anIntArray370[local299]];
							if (local307 != null && local307 != local278 && local307.aClass2_Sub1_Sub2_1.anInt343 == 1 && local278.anInt3302 == local307.anInt3302 && local307.anInt3273 == local278.anInt3273) {
								Static11.method307(local42, Static180.anIntArray370[local299], local307.aClass2_Sub1_Sub2_1, local49);
							}
						}
						for (local184 = 0; local184 < Static166.anInt4101; local184++) {
							local358 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[Static169.anIntArray458[local184]];
							if (local358 != null && local278.anInt3302 == local358.anInt3302 && local278.anInt3273 == local358.anInt3273) {
								Static159.method3420(local49, local42, local358, Static169.anIntArray458[local184]);
							}
						}
					}
					Static11.method307(local42, local63, local278.aClass2_Sub1_Sub2_1, local49);
				}
				if (local56 == 0) {
					@Pc(403) Class2_Sub1_Sub1_Sub3_Sub1 local403 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local63];
					if ((local403.anInt3302 & 0x7F) == 64 && (local403.anInt3273 & 0x7F) == 64) {
						for (local299 = 0; local299 < Static174.anInt4255; local299++) {
							local307 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[Static180.anIntArray370[local299]];
							if (local307 != null && local307.aClass2_Sub1_Sub2_1.anInt343 == 1 && local307.anInt3302 == local403.anInt3302 && local403.anInt3273 == local307.anInt3273) {
								Static11.method307(local42, Static180.anIntArray370[local299], local307.aClass2_Sub1_Sub2_1, local49);
							}
						}
						for (local184 = 0; local184 < Static166.anInt4101; local184++) {
							local358 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[Static169.anIntArray458[local184]];
							if (local358 != null && local403 != local358 && local403.anInt3302 == local358.anInt3302 && local403.anInt3273 == local358.anInt3273) {
								Static159.method3420(local49, local42, local358, Static169.anIntArray458[local184]);
							}
						}
					}
					Static159.method3420(local49, local42, local403, local63);
				}
				if (local56 == 3) {
					@Pc(533) Class67 local533 = Static70.aClass67ArrayArrayArray1[Static62.anInt1923][local42][local49];
					if (local533 != null) {
						for (@Pc(540) Class2_Sub1_Sub1_Sub7 local540 = (Class2_Sub1_Sub1_Sub7) local533.method2849(); local540 != null; local540 = (Class2_Sub1_Sub1_Sub7) local533.method2850()) {
							@Pc(547) Class2_Sub1_Sub8 local547 = Static88.method2046(local540.anInt4182);
							if (Static29.anInt889 == 1) {
								Static61.method1423(Static193.method3536(new Class60[] { Static162.aClass60_1102, Static189.aClass60_1285, local547.aClass60_363 }), Static56.aClass60_405, (short) 38, (long) local540.anInt4182, local42, local49);
							} else if (!Static58.aBoolean74) {
								@Pc(587) Class60[] local587 = local547.aClass60Array8;
								if (Static67.aBoolean87) {
									local587 = Static174.method3268(local587);
								}
								for (@Pc(599) int local599 = 4; local599 >= 0; local599--) {
									if (local587 != null && local587[local599] != null) {
										@Pc(613) byte local613 = 0;
										if (local599 == 0) {
											local613 = 13;
										}
										if (local599 == 1) {
											local613 = 48;
										}
										if (local599 == 2) {
											local613 = 34;
										}
										if (local599 == 3) {
											local613 = 57;
										}
										if (local599 == 4) {
											local613 = 45;
										}
										Static61.method1423(Static193.method3536(new Class60[] { Static103.aClass60_840, local547.aClass60_363 }), local587[local599], local613, (long) local540.anInt4182, local42, local49);
									} else if (local599 == 2) {
										Static61.method1423(Static193.method3536(new Class60[] { Static103.aClass60_840, local547.aClass60_363 }), Static57.aClass60_413, (short) 34, (long) local540.anInt4182, local42, local49);
									}
								}
								Static61.method1423(Static193.method3536(new Class60[] { Static103.aClass60_840, local547.aClass60_363 }), Static88.aClass60_704, (short) 1005, (long) local540.anInt4182, local42, local49);
							} else if ((Static101.anInt2923 & 0x1) == 1) {
								Static61.method1423(Static193.method3536(new Class60[] { Static167.aClass60_1132, Static189.aClass60_1285, local547.aClass60_363 }), Static4.aClass60_35, (short) 26, (long) local540.anInt4182, local42, local49);
							}
						}
					}
				}
			}
		}
	}
}
