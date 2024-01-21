import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!fd", name = "mb", descriptor = "Lclient!cc;")
	public static Class11_Sub1 aClass11_Sub1_8;

	@OriginalMember(owner = "client!fd", name = "wb", descriptor = "I")
	public static int anInt1159;

	@OriginalMember(owner = "client!fd", name = "Ab", descriptor = "I")
	public static int anInt1160;

	@OriginalMember(owner = "client!fd", name = "Db", descriptor = "I")
	public static int anInt1162;

	@OriginalMember(owner = "client!fd", name = "ib", descriptor = "Lclient!lc;")
	public static Class31 aClass31_379 = Static56.method1206(" is already on your friend list");

	@OriginalMember(owner = "client!fd", name = "qb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_380 = Static56.method1206("@red@Offline");

	@OriginalMember(owner = "client!fd", name = "rb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_381 = Static56.method1206("Jul");

	@OriginalMember(owner = "client!fd", name = "sb", descriptor = "[[B")
	public static byte[][] aByteArrayArray6 = new byte[50][];

	@OriginalMember(owner = "client!fd", name = "vb", descriptor = "Lclient!fe;")
	public static Class17 aClass17_44 = new Class17(10);

	@OriginalMember(owner = "client!fd", name = "xb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_382 = Static56.method1206("System update in: ");

	@OriginalMember(owner = "client!fd", name = "yb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_383 = Static56.method1206("Loaded title screen");

	@OriginalMember(owner = "client!fd", name = "zb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_384 = Static56.method1206("Enter amount:");

	@OriginalMember(owner = "client!fd", name = "Bb", descriptor = "I")
	public static int anInt1161 = 0;

	@OriginalMember(owner = "client!fd", name = "Cb", descriptor = "Z")
	public static boolean aBoolean65 = false;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(Z)V")
	public static void method775() {
		aClass31_382 = null;
		aClass31_380 = null;
		aClass31_381 = null;
		aClass11_Sub1_8 = null;
		aClass17_44 = null;
		aByteArrayArray6 = null;
		aClass31_384 = null;
		aClass31_383 = null;
		aClass31_379 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
	public static void method776(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static44.method1063(Static83.aClass31_803, Static7.aClass31_98);
		} else if (arg0 == -2) {
			Static44.method1063(Static39.aClass31_531, Static88.aClass31_820);
		} else if (arg0 == -1) {
			Static44.method1063(Static2.aClass31_49, Static7.aClass31_98);
		} else if (arg0 == 3) {
			Static44.method1063(Static39.aClass31_531, Static2.aClass31_48);
		} else if (arg0 == 4) {
			Static44.method1063(Static21.aClass31_313, Static3.aClass31_53);
		} else if (arg0 == 5) {
			Static44.method1063(Static40.aClass31_706, Static58.aClass31_691);
		} else if (arg0 == 6) {
			Static44.method1063(Static101.aClass31_940, Static4.aClass31_55);
		} else if (arg0 == 7) {
			Static44.method1063(Static91.aClass31_858, Static99.aClass31_923);
		} else if (arg0 == 8) {
			Static44.method1063(Static11.aClass31_166, Static90.aClass31_840);
		} else if (arg0 == 9) {
			Static44.method1063(Static4.aClass31_56, Static33.aClass31_445);
		} else if (arg0 == 10) {
			Static44.method1063(Static11.aClass31_166, Static38.aClass31_517);
		} else if (arg0 == 12) {
			Static44.method1063(Static70.aClass31_773, Static75.aClass31_782);
		} else if (arg0 == 13) {
			Static44.method1063(Static4.aClass31_60, Static7.aClass31_98);
		} else if (arg0 == 14) {
			Static44.method1063(Static23.aClass31_326, Static67.aClass31_764);
		} else if (arg0 == 16) {
			Static44.method1063(Static24.aClass31_343, Static67.aClass31_764);
		} else if (arg0 == 17) {
			Static44.method1063(Static15.aClass31_200, Static91.aClass31_857);
		} else if (arg0 == 18) {
			Static44.method1063(Static46.aClass31_588, Static95.aClass31_886);
		} else if (arg0 == 20) {
			Static44.method1063(Static30.aClass31_428, Static7.aClass31_98);
		} else if (arg0 == 22) {
			Static44.method1063(Static75.aClass31_784, Static28.aClass31_387);
		} else if (arg0 == 23) {
			Static44.method1063(Static48.aClass31_619, Static67.aClass31_764);
		} else if (arg0 == 24) {
			Static44.method1063(Static46.aClass31_587, Static83.aClass31_804);
		} else if (arg0 == 25) {
			Static44.method1063(Static105.aClass31_948, Static7.aClass31_98);
		} else if (arg0 == 26) {
			Static44.method1063(Static3.aClass31_50, Static88.aClass31_819);
		} else {
			Static44.method1063(Static37.method974(new Class31[] { Static7.aClass31_103, Static89.method1499(arg0) }), Static7.aClass31_98);
		}
		Static75.method1404(10);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Graphics;B)V")
	public static void method777(@OriginalArg(0) Graphics arg0) {
		Static79.aClass9_23.method863(arg0, 357, 17);
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V")
	public static void method778() {
		if (!Static8.aBoolean27) {
			return;
		}
		Static44.aClass9_13 = null;
		Static95.aClass9_26 = null;
		Static99.aClass2_Sub1_Sub3_Sub1_19 = null;
		Static78.anIntArray320 = null;
		Static65.aClass9_17 = null;
		Static69.aClass2_Sub1_Sub3_Sub2_6 = null;
		Static92.anIntArray241 = null;
		Static41.anIntArray242 = null;
		Static4.anIntArray20 = null;
		Static25.anIntArray122 = null;
		Static76.aClass9_21 = null;
		Static105.aClass9_27 = null;
		Static98.anIntArray144 = null;
		Static19.aClass9_8 = null;
		Static82.aClass2_Sub1_Sub3_Sub1Array4 = null;
		Static14.aClass9_7 = null;
		Static64.aClass2_Sub1_Sub3_Sub2_2 = null;
		Static12.anIntArray77 = null;
		Static9.aClass9_2 = null;
		Static54.aClass9_14 = null;
		Static82.anIntArray326 = null;
		Static16.aClass2_Sub1_Sub3_Sub1_5 = null;
		Static79.method1445();
		Static55.aClass30_2.method1164(true);
		Static8.aBoolean27 = false;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	public static void method779() {
		@Pc(11) int local11 = -1;
		if (Static63.anInt2118 == 0 && Static47.anInt1737 == 0) {
			Static17.method523(Static61.anInt2102, Static101.aClass31_947, 16, 0, Static85.anInt2508);
		}
		for (@Pc(34) int local34 = 0; local34 < Static35.anInt1363; local34++) {
			@Pc(40) int local40 = Static35.anIntArray196[local34];
			@Pc(44) int local44 = local40 & 0x7F;
			@Pc(50) int local50 = local40 >> 7 & 0x7F;
			@Pc(56) int local56 = local40 >> 14 & 0x7FFF;
			@Pc(62) int local62 = local40 >> 29 & 0x3;
			if (local11 != local40) {
				local11 = local40;
				@Pc(160) int local160;
				if (local62 == 2 && Static99.aClass64_1.method1802(Static58.anInt1945, local44, local50, local40) >= 0) {
					@Pc(90) Class2_Sub1_Sub16 local90 = Static92.method1045(local56);
					if (local90.anIntArray388 != null) {
						local90 = local90.method1711();
					}
					if (local90 == null) {
						continue;
					}
					if (Static63.anInt2118 == 1) {
						Static17.method523(local50, Static37.method974(new Class31[] { Static10.aClass31_132, Static40.aClass31_711, Static78.aClass31_789, local90.aClass31_939 }), 38, local40, local44);
					} else if (Static47.anInt1737 != 1) {
						@Pc(150) Class31[] local150 = local90.aClass31Array16;
						if (Static66.aBoolean112) {
							local150 = Static92.method1049(local150);
						}
						if (local150 != null) {
							for (local160 = 4; local160 >= 0; local160--) {
								if (local150[local160] != null) {
									@Pc(172) short local172 = 0;
									if (local160 == 0) {
										local172 = 43;
									}
									if (local160 == 1) {
										local172 = 53;
									}
									if (local160 == 2) {
										local172 = 42;
									}
									if (local160 == 3) {
										local172 = 20;
									}
									if (local160 == 4) {
										local172 = 1002;
									}
									Static17.method523(local50, Static37.method974(new Class31[] { local150[local160], Static89.aClass31_826, local90.aClass31_939 }), local172, local40, local44);
								}
							}
						}
						Static17.method523(local50, Static37.method974(new Class31[] { Static47.aClass31_616, local90.aClass31_939 }), 1006, local90.anInt2720 << 14, local44);
					} else if ((Static105.anInt2787 & 0x4) == 4) {
						Static17.method523(local50, Static37.method974(new Class31[] { Static85.aClass31_866, Static89.aClass31_826, local90.aClass31_939 }), 28, local40, local44);
					}
				}
				@Pc(321) int local321;
				@Pc(329) Class2_Sub1_Sub4_Sub6_Sub2 local329;
				@Pc(380) Class2_Sub1_Sub4_Sub6_Sub1 local380;
				if (local62 == 1) {
					@Pc(298) Class2_Sub1_Sub4_Sub6_Sub2 local298 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local56];
					if (local298.aClass2_Sub1_Sub8_1.anInt1863 == 1 && (local298.anInt2006 & 0x7F) == 64 && (local298.anInt2011 & 0x7F) == 64) {
						for (local321 = 0; local321 < Static49.anInt2696; local321++) {
							local329 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[Static57.anIntArray383[local321]];
							if (local329 != null && local329 != local298 && local329.aClass2_Sub1_Sub8_1.anInt1863 == 1 && local298.anInt2006 == local329.anInt2006 && local329.anInt2011 == local298.anInt2011) {
								Static49.method1701(Static57.anIntArray383[local321], local50, local44, local329.aClass2_Sub1_Sub8_1);
							}
						}
						for (local160 = 0; local160 < Static21.anInt1007; local160++) {
							local380 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[Static78.anIntArray322[local160]];
							if (local380 != null && local380.anInt2006 == local298.anInt2006 && local298.anInt2011 == local380.anInt2011) {
								Static21.method679(Static78.anIntArray322[local160], local380, local44, local50);
							}
						}
					}
					Static49.method1701(local56, local50, local44, local298.aClass2_Sub1_Sub8_1);
				}
				if (local62 == 0) {
					@Pc(421) Class2_Sub1_Sub4_Sub6_Sub1 local421 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local56];
					if ((local421.anInt2006 & 0x7F) == 64 && (local421.anInt2011 & 0x7F) == 64) {
						for (local321 = 0; local321 < Static49.anInt2696; local321++) {
							local329 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[Static57.anIntArray383[local321]];
							if (local329 != null && local329.aClass2_Sub1_Sub8_1.anInt1863 == 1 && local421.anInt2006 == local329.anInt2006 && local329.anInt2011 == local421.anInt2011) {
								Static49.method1701(Static57.anIntArray383[local321], local50, local44, local329.aClass2_Sub1_Sub8_1);
							}
						}
						for (local160 = 0; local160 < Static21.anInt1007; local160++) {
							local380 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[Static78.anIntArray322[local160]];
							if (local380 != null && local421 != local380 && local421.anInt2006 == local380.anInt2006 && local380.anInt2011 == local421.anInt2011) {
								Static21.method679(Static78.anIntArray322[local160], local380, local44, local50);
							}
						}
					}
					Static21.method679(local56, local421, local44, local50);
				}
				if (local62 == 3) {
					@Pc(541) Class36 local541 = Static78.aClass36ArrayArrayArray1[Static58.anInt1945][local44][local50];
					if (local541 != null) {
						for (@Pc(548) Class2_Sub1_Sub4_Sub4 local548 = (Class2_Sub1_Sub4_Sub4) local541.method1367(); local548 != null; local548 = (Class2_Sub1_Sub4_Sub4) local541.method1370()) {
							@Pc(555) Class2_Sub1_Sub13 local555 = Static7.method178(local548.anInt1149);
							if (Static63.anInt2118 == 1) {
								Static17.method523(local50, Static37.method974(new Class31[] { Static10.aClass31_132, Static40.aClass31_711, Static19.aClass31_286, local555.aClass31_861 }), 12, local548.anInt1149, local44);
							} else if (Static47.anInt1737 != 1) {
								@Pc(604) Class31[] local604 = local555.aClass31Array12;
								if (Static66.aBoolean112) {
									local604 = Static92.method1049(local604);
								}
								for (@Pc(612) int local612 = 4; local612 >= 0; local612--) {
									if (local604 != null && local604[local612] != null) {
										@Pc(657) byte local657 = 0;
										if (local612 == 0) {
											local657 = 47;
										}
										if (local612 == 1) {
											local657 = 1;
										}
										if (local612 == 2) {
											local657 = 50;
										}
										if (local612 == 3) {
											local657 = 23;
										}
										if (local612 == 4) {
											local657 = 31;
										}
										Static17.method523(local50, Static37.method974(new Class31[] { local604[local612], Static11.aClass31_168, local555.aClass31_861 }), local657, local548.anInt1149, local44);
									} else if (local612 == 2) {
										Static17.method523(local50, Static37.method974(new Class31[] { Static101.aClass31_943, local555.aClass31_861 }), 50, local548.anInt1149, local44);
									}
								}
								Static17.method523(local50, Static37.method974(new Class31[] { Static75.aClass31_781, local555.aClass31_861 }), 1004, local548.anInt1149, local44);
							} else if ((Static105.anInt2787 & 0x1) == 1) {
								Static17.method523(local50, Static37.method974(new Class31[] { Static85.aClass31_866, Static11.aClass31_168, local555.aClass31_861 }), 40, local548.anInt1149, local44);
							}
						}
					}
				}
			}
		}
	}
}
