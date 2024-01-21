import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "B")
	public static byte aByte5;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1104 = Static51.method932("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1105 = Static51.method932("<col=00ff00>");

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
	public static final int anInt2583 = 50;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1106 = Static51.method932("p12_full");

	@OriginalMember(owner = "client!oc", name = "v", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1107 = Static51.method932("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!oc", name = "y", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1108 = Static51.method932("leuchten3:");

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	public static void method1830() {
		aClass10_1108 = null;
		aClass10_1105 = null;
		aClass10_1104 = null;
		aClass10_1107 = null;
		aClass10_1106 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIII)V")
	public static void method1831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static44.anInt1023 == 0 && !Static69.aBoolean74) {
			Static144.method2257(0, arg0 - arg2, 39, Static101.aClass10_1020, Static63.aClass10_687, arg1 - arg3);
		}
		@Pc(29) int local29 = -1;
		for (@Pc(31) int local31 = 0; local31 < Static42.anInt1013; local31++) {
			@Pc(37) int local37 = Static42.anIntArray98[local31];
			@Pc(43) int local43 = local37 >> 29 & 0x3;
			@Pc(49) int local49 = local37 >> 14 & 0x7FFF;
			@Pc(55) int local55 = local37 >> 7 & 0x7F;
			@Pc(59) int local59 = local37 & 0x7F;
			if (local37 != local29) {
				local29 = local37;
				@Pc(182) int local182;
				if (local43 == 2 && Static180.aClass60_1.method1803(Static56.anInt1432, local59, local55, local37) >= 0) {
					@Pc(82) Class2_Sub1_Sub10 local82 = Static62.method1106(local49);
					if (local82.anIntArray234 != null) {
						local82 = local82.method1580();
					}
					if (local82 == null) {
						continue;
					}
					if (Static44.anInt1023 == 1) {
						Static144.method2257(local37, local55, 38, Static151.aClass10_1426, Static3.method36(new Class10[] { Static163.aClass10_1521, Static91.aClass10_904, local82.aClass10_939 }), local59);
					} else if (!Static69.aBoolean74) {
						@Pc(172) Class10[] local172 = local82.aClass10Array16;
						if (Static157.aBoolean150) {
							local172 = Static157.method2404(local172);
						}
						if (local172 != null) {
							for (local182 = 4; local182 >= 0; local182--) {
								if (local172[local182] != null) {
									@Pc(190) short local190 = 0;
									if (local182 == 0) {
										local190 = 42;
									}
									if (local182 == 1) {
										local190 = 5;
									}
									if (local182 == 2) {
										local190 = 3;
									}
									if (local182 == 3) {
										local190 = 15;
									}
									if (local182 == 4) {
										local190 = 1007;
									}
									Static144.method2257(local37, local55, local190, local172[local182], Static3.method36(new Class10[] { Static25.aClass10_330, local82.aClass10_939 }), local59);
								}
							}
						}
						Static144.method2257(local82.anInt2219 << 14, local55, 1002, Static142.aClass10_1386, Static3.method36(new Class10[] { Static25.aClass10_330, local82.aClass10_939 }), local59);
					} else if ((Static147.anInt3804 & 0x4) == 4) {
						Static144.method2257(local37, local55, 47, Static111.aClass10_1098, Static3.method36(new Class10[] { Static121.aClass10_1190, Static91.aClass10_904, local82.aClass10_939 }), local59);
					}
				}
				@Pc(308) int local308;
				@Pc(316) Class2_Sub1_Sub3_Sub2_Sub2 local316;
				@Pc(367) Class2_Sub1_Sub3_Sub2_Sub1 local367;
				if (local43 == 1) {
					@Pc(285) Class2_Sub1_Sub3_Sub2_Sub2 local285 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local49];
					if (local285.aClass2_Sub1_Sub2_1.anInt72 == 1 && (local285.anInt3454 & 0x7F) == 64 && (local285.anInt3499 & 0x7F) == 64) {
						for (local308 = 0; local308 < Static64.anInt1578; local308++) {
							local316 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[Static8.anIntArray15[local308]];
							if (local316 != null && local316 != local285 && local316.aClass2_Sub1_Sub2_1.anInt72 == 1 && local316.anInt3454 == local285.anInt3454 && local285.anInt3499 == local316.anInt3499) {
								Static34.method681(Static8.anIntArray15[local308], local316.aClass2_Sub1_Sub2_1, local55, local59);
							}
						}
						for (local182 = 0; local182 < Static54.anInt1354; local182++) {
							local367 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[Static66.anIntArray175[local182]];
							if (local367 != null && local285.anInt3454 == local367.anInt3454 && local367.anInt3499 == local285.anInt3499) {
								Static123.method1980(Static66.anIntArray175[local182], local367, local55, local59);
							}
						}
					}
					Static34.method681(local49, local285.aClass2_Sub1_Sub2_1, local55, local59);
				}
				if (local43 == 0) {
					@Pc(415) Class2_Sub1_Sub3_Sub2_Sub1 local415 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local49];
					if ((local415.anInt3454 & 0x7F) == 64 && (local415.anInt3499 & 0x7F) == 64) {
						for (local308 = 0; local308 < Static64.anInt1578; local308++) {
							local316 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[Static8.anIntArray15[local308]];
							if (local316 != null && local316.aClass2_Sub1_Sub2_1.anInt72 == 1 && local415.anInt3454 == local316.anInt3454 && local415.anInt3499 == local316.anInt3499) {
								Static34.method681(Static8.anIntArray15[local308], local316.aClass2_Sub1_Sub2_1, local55, local59);
							}
						}
						for (local182 = 0; local182 < Static54.anInt1354; local182++) {
							local367 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[Static66.anIntArray175[local182]];
							if (local367 != null && local415 != local367 && local415.anInt3454 == local367.anInt3454 && local415.anInt3499 == local367.anInt3499) {
								Static123.method1980(Static66.anIntArray175[local182], local367, local55, local59);
							}
						}
					}
					Static123.method1980(local49, local415, local55, local59);
				}
				if (local43 == 3) {
					@Pc(539) Class12 local539 = Static132.aClass12ArrayArrayArray1[Static56.anInt1432][local59][local55];
					if (local539 != null) {
						for (@Pc(548) Class2_Sub1_Sub3_Sub4 local548 = (Class2_Sub1_Sub3_Sub4) local539.method380(); local548 != null; local548 = (Class2_Sub1_Sub3_Sub4) local539.method377()) {
							@Pc(555) Class2_Sub1_Sub6 local555 = Static78.method577(local548.anInt1187);
							if (Static44.anInt1023 == 1) {
								Static144.method2257(local548.anInt1187, local55, 45, Static151.aClass10_1426, Static3.method36(new Class10[] { Static163.aClass10_1521, Static94.aClass10_938, local555.aClass10_662 }), local59);
							} else if (!Static69.aBoolean74) {
								@Pc(600) Class10[] local600 = local555.aClass10Array11;
								if (Static157.aBoolean150) {
									local600 = Static157.method2404(local600);
								}
								for (@Pc(608) int local608 = 4; local608 >= 0; local608--) {
									if (local600 != null && local600[local608] != null) {
										@Pc(654) byte local654 = 0;
										if (local608 == 0) {
											local654 = 57;
										}
										if (local608 == 1) {
											local654 = 44;
										}
										if (local608 == 2) {
											local654 = 49;
										}
										if (local608 == 3) {
											local654 = 30;
										}
										if (local608 == 4) {
											local654 = 26;
										}
										Static144.method2257(local548.anInt1187, local55, local654, local600[local608], Static3.method36(new Class10[] { Static150.aClass10_1549, local555.aClass10_662 }), local59);
									} else if (local608 == 2) {
										Static144.method2257(local548.anInt1187, local55, 49, Static93.aClass10_922, Static3.method36(new Class10[] { Static150.aClass10_1549, local555.aClass10_662 }), local59);
									}
								}
								Static144.method2257(local548.anInt1187, local55, 1004, Static142.aClass10_1386, Static3.method36(new Class10[] { Static150.aClass10_1549, local555.aClass10_662 }), local59);
							} else if ((Static147.anInt3804 & 0x1) == 1) {
								Static144.method2257(local548.anInt1187, local55, 37, Static111.aClass10_1098, Static3.method36(new Class10[] { Static121.aClass10_1190, Static94.aClass10_938, local555.aClass10_662 }), local59);
							}
						}
					}
				}
			}
		}
	}
}
