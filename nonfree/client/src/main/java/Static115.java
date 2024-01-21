import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!te", name = "qb", descriptor = "I")
	public static int anInt2885;

	@OriginalMember(owner = "client!te", name = "Y", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1507 = Static28.method504("Neuer Benutzer");

	@OriginalMember(owner = "client!te", name = "hb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1509 = Static28.method504("Loading wordpack )2 ");

	@OriginalMember(owner = "client!te", name = "fb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1508 = aClass39_1509;

	@OriginalMember(owner = "client!te", name = "jb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1510 = Static28.method504("null");

	@OriginalMember(owner = "client!te", name = "mb", descriptor = "I")
	public static int anInt2882 = -1;

	@OriginalMember(owner = "client!te", name = "ob", descriptor = "I")
	public static int anInt2883 = -1;

	@OriginalMember(owner = "client!te", name = "rb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1512 = Static28.method504(")1p");

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
	public static void method2010() {
		aClass39_1508 = null;
		aClass39_1507 = null;
		aClass39_1510 = null;
		aClass39_1512 = null;
		aClass39_1509 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)V")
	public static void method2011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static59.anInt1555 == 0 && !Static78.aBoolean101) {
			Static110.method1950(Static72.aClass39_423, Static92.aClass39_388, arg0 - arg3, 0, arg2 - arg1, 31);
		}
		@Pc(30) int local30 = -1;
		for (@Pc(32) int local32 = 0; local32 < Static124.anInt3089; local32++) {
			@Pc(38) int local38 = Static124.anIntArray342[local32];
			@Pc(42) int local42 = local38 & 0x7F;
			@Pc(48) int local48 = local38 >> 7 & 0x7F;
			@Pc(54) int local54 = local38 >> 29 & 0x3;
			@Pc(60) int local60 = local38 >> 14 & 0x7FFF;
			if (local38 != local30) {
				local30 = local38;
				@Pc(120) int local120;
				if (local54 == 2 && Static101.aClass43_1.method1075(Static131.anInt3202, local42, local48, local38) >= 0) {
					@Pc(87) Class4_Sub2_Sub10 local87 = Static73.method1207(local60);
					if (local87.anIntArray144 != null) {
						local87 = local87.method925();
					}
					if (local87 == null) {
						continue;
					}
					if (Static59.anInt1555 == 1) {
						Static110.method1950(Static62.method1123(new Class39[] { Static52.aClass39_764, Static116.aClass39_1520, local87.aClass39_787 }), Static31.aClass39_428, local48, local38, local42, 38);
					} else if (!Static78.aBoolean101) {
						@Pc(110) Class39[] local110 = local87.aClass39Array12;
						if (Static98.aBoolean44) {
							local110 = Static30.method526(local110);
						}
						if (local110 != null) {
							for (local120 = 4; local120 >= 0; local120--) {
								if (local110[local120] != null) {
									@Pc(128) short local128 = 0;
									if (local120 == 0) {
										local128 = 46;
									}
									if (local120 == 1) {
										local128 = 2;
									}
									if (local120 == 2) {
										local128 = 11;
									}
									if (local120 == 3) {
										local128 = 58;
									}
									if (local120 == 4) {
										local128 = 1001;
									}
									Static110.method1950(Static62.method1123(new Class39[] { Static2.aClass39_11, local87.aClass39_787 }), local110[local120], local48, local38, local42, local128);
								}
							}
						}
						Static110.method1950(Static62.method1123(new Class39[] { Static2.aClass39_11, local87.aClass39_787 }), Static32.aClass39_436, local48, local87.anInt1415 << 14, local42, 1006);
					} else if ((Static44.anInt1130 & 0x4) == 4) {
						Static110.method1950(Static62.method1123(new Class39[] { Static24.aClass39_299, Static116.aClass39_1520, local87.aClass39_787 }), Static104.aClass39_1338, local48, local38, local42, 12);
					}
				}
				@Pc(309) int local309;
				@Pc(317) Class4_Sub2_Sub1_Sub1_Sub2 local317;
				@Pc(364) Class4_Sub2_Sub1_Sub1_Sub1 local364;
				if (local54 == 1) {
					@Pc(288) Class4_Sub2_Sub1_Sub1_Sub2 local288 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local60];
					if (local288.aClass4_Sub2_Sub16_1.anInt2922 == 1 && (local288.anInt2643 & 0x7F) == 64 && (local288.anInt2641 & 0x7F) == 64) {
						for (local309 = 0; local309 < Static72.anInt799; local309++) {
							local317 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[Static33.anIntArray94[local309]];
							if (local317 != null && local317 != local288 && local317.aClass4_Sub2_Sub16_1.anInt2922 == 1 && local288.anInt2643 == local317.anInt2643 && local288.anInt2641 == local317.anInt2641) {
								Static18.method299(Static33.anIntArray94[local309], local48, local317.aClass4_Sub2_Sub16_1, local42);
							}
						}
						for (local120 = 0; local120 < Static122.anInt3021; local120++) {
							local364 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[Static116.anIntArray312[local120]];
							if (local364 != null && local288.anInt2643 == local364.anInt2643 && local364.anInt2641 == local288.anInt2641) {
								Static1.method1(local48, Static116.anIntArray312[local120], local364, local42);
							}
						}
					}
					Static18.method299(local60, local48, local288.aClass4_Sub2_Sub16_1, local42);
				}
				if (local54 == 0) {
					@Pc(405) Class4_Sub2_Sub1_Sub1_Sub1 local405 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local60];
					if ((local405.anInt2643 & 0x7F) == 64 && (local405.anInt2641 & 0x7F) == 64) {
						for (local309 = 0; local309 < Static72.anInt799; local309++) {
							local317 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[Static33.anIntArray94[local309]];
							if (local317 != null && local317.aClass4_Sub2_Sub16_1.anInt2922 == 1 && local317.anInt2643 == local405.anInt2643 && local317.anInt2641 == local405.anInt2641) {
								Static18.method299(Static33.anIntArray94[local309], local48, local317.aClass4_Sub2_Sub16_1, local42);
							}
						}
						for (local120 = 0; local120 < Static122.anInt3021; local120++) {
							local364 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[Static116.anIntArray312[local120]];
							if (local364 != null && local364 != local405 && local405.anInt2643 == local364.anInt2643 && local405.anInt2641 == local364.anInt2641) {
								Static1.method1(local48, Static116.anIntArray312[local120], local364, local42);
							}
						}
					}
					Static1.method1(local48, local60, local405, local42);
				}
				if (local54 == 3) {
					@Pc(531) Class61 local531 = Static26.aClass61ArrayArrayArray1[Static131.anInt3202][local42][local48];
					if (local531 != null) {
						for (@Pc(538) Class4_Sub2_Sub1_Sub7 local538 = (Class4_Sub2_Sub1_Sub7) local531.method1634(); local538 != null; local538 = (Class4_Sub2_Sub1_Sub7) local531.method1627()) {
							@Pc(545) Class4_Sub2_Sub5 local545 = Static119.method2166(local538.anInt3125);
							if (Static59.anInt1555 == 1) {
								Static110.method1950(Static62.method1123(new Class39[] { Static52.aClass39_764, Static33.aClass39_448, local545.aClass39_352 }), Static31.aClass39_428, local48, local538.anInt3125, local42, 16);
							} else if (!Static78.aBoolean101) {
								@Pc(559) Class39[] local559 = local545.aClass39Array2;
								if (Static98.aBoolean44) {
									local559 = Static30.method526(local559);
								}
								for (@Pc(567) int local567 = 4; local567 >= 0; local567--) {
									if (local559 != null && local559[local567] != null) {
										@Pc(611) byte local611 = 0;
										if (local567 == 0) {
											local611 = 45;
										}
										if (local567 == 1) {
											local611 = 49;
										}
										if (local567 == 2) {
											local611 = 7;
										}
										if (local567 == 3) {
											local611 = 6;
										}
										if (local567 == 4) {
											local611 = 35;
										}
										Static110.method1950(Static62.method1123(new Class39[] { Static104.aClass39_1337, local545.aClass39_352 }), local559[local567], local48, local538.anInt3125, local42, local611);
									} else if (local567 == 2) {
										Static110.method1950(Static62.method1123(new Class39[] { Static104.aClass39_1337, local545.aClass39_352 }), Static31.aClass39_431, local48, local538.anInt3125, local42, 7);
									}
								}
								Static110.method1950(Static62.method1123(new Class39[] { Static104.aClass39_1337, local545.aClass39_352 }), Static32.aClass39_436, local48, local538.anInt3125, local42, 1002);
							} else if ((Static44.anInt1130 & 0x1) == 1) {
								Static110.method1950(Static62.method1123(new Class39[] { Static24.aClass39_299, Static33.aClass39_448, local545.aClass39_352 }), Static104.aClass39_1338, local48, local538.anInt3125, local42, 39);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(I)[Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1[] method2014() {
		@Pc(8) Class4_Sub2_Sub3_Sub1[] local8 = new Class4_Sub2_Sub3_Sub1[Static50.anInt1308];
		for (@Pc(10) int local10 = 0; local10 < Static50.anInt1308; local10++) {
			@Pc(20) Class4_Sub2_Sub3_Sub1 local20 = local8[local10] = new Class4_Sub2_Sub3_Sub1();
			local20.anInt1342 = Static9.anInt291;
			local20.anInt1345 = Static15.anInt375;
			local20.anInt1343 = Static51.anIntArray277[local10];
			local20.anInt1340 = Static121.anIntArray320[local10];
			local20.anInt1341 = Static21.anIntArray61[local10];
			local20.anInt1344 = Static16.anIntArray49[local10];
			@Pc(50) byte[] local50 = Static70.aByteArrayArray6[local10];
			@Pc(56) int local56 = local20.anInt1344 * local20.anInt1341;
			local20.anIntArray141 = new int[local56];
			for (@Pc(62) int local62 = 0; local62 < local56; local62++) {
				local20.anIntArray141[local62] = Static114.anIntArray308[local50[local62] & 0xFF];
			}
		}
		Static120.method2049();
		return local8;
	}

	@OriginalMember(owner = "client!te", name = "g", descriptor = "(I)V")
	public static void method2015() {
		for (@Pc(11) Class4_Sub10 local11 = (Class4_Sub10) Static15.aClass42_4.method1049(); local11 != null; local11 = (Class4_Sub10) Static15.aClass42_4.method1054()) {
			@Pc(16) int local16 = local11.anInt1724;
			if (Static27.method502(local16)) {
				@Pc(22) boolean local22 = true;
				@Pc(26) Class4_Sub5[] local26 = Static109.aClass4_Sub5ArrayArray1[local16];
				for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
					if (local26[local28] != null) {
						local22 = local26[local28].aBoolean63;
						break;
					}
				}
				if (!local22) {
					@Pc(56) int local56 = (int) local11.aLong155;
					@Pc(60) Class4_Sub5 local60 = Static54.method949(local56);
					if (local60 != null) {
						Static19.method344(local60);
					}
				}
			}
		}
	}
}
