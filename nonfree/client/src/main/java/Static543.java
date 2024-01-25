import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray19 = new int[2][][];

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "Z")
	public static final boolean aBoolean668 = false;

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
	public static int anInt8918 = 0;

	@OriginalMember(owner = "client!tf", name = "hb", descriptor = "[I")
	public static final int[] anIntArray608 = new int[2];

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILclient!ha;B)V")
	public static void method7493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class95 arg2) {
		if (arg1 < 0 || arg0 < 0 || Static447.anInt8771 == 0 || Static201.anInt3403 == 0) {
			return;
		}
		@Pc(45) Class177 local45;
		@Pc(32) int local32;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(36) int local36;
		@Pc(55) int local55;
		@Pc(60) int local60;
		if (Static319.aBoolean356) {
			Static421.method5624(false);
			local45 = arg2.method6979();
			@Pc(71) int[] local71 = arg2.Y();
			local32 = local71[0];
			local34 = local71[2];
			local30 = local71[1];
			local36 = local71[3];
			local55 = Static89.method6486(false) + arg1;
			local60 = Static512.method7194(false) + arg0;
		} else {
			arg2.DA(Static297.anInt4862, Static578.anInt9407, Static447.anInt8771, Static201.anInt3403);
			local30 = Static578.anInt9407;
			local32 = Static297.anInt4862;
			local34 = Static447.anInt8771;
			local36 = Static201.anInt3403;
			arg2.KA(Static145.anInt2640, Static200.anInt3399, Static447.anInt8771, Static201.anInt3403);
			local45 = arg2.method7001();
			local45.method7881(Static183.anInt3166, Static500.anInt8135, Static129.anInt9000, Static93.anInt1715, Static376.anInt5906, Static430.anInt8345);
			local55 = arg1;
			arg2.method6941(local45);
			local60 = arg0;
		}
		if (local36 == 0) {
			local36 = 1;
		}
		Static296.method4089(true);
		if (local34 == 0) {
			local34 = 1;
		}
		@Pc(131) int local131;
		@Pc(141) int local141;
		@Pc(158) int local158;
		@Pc(266) int local266;
		@Pc(275) int local275;
		@Pc(286) int local286;
		@Pc(297) int local297;
		@Pc(123) int local123;
		@Pc(343) int local343;
		if (Static462.aClass76Array3 != null && (!Static8.aBoolean11 || (Static241.anInt3917 & 0x40) != 0)) {
			local123 = -1;
			@Pc(125) int local125 = -1;
			@Pc(128) int local128 = arg2.i();
			local131 = arg2.XA();
			@Pc(166) int local166;
			@Pc(150) int local150;
			if (Static449.aBoolean538) {
				local141 = local150 = Static638.anInt7982 * (local55 - local32) / local34;
				local166 = local158 = Static638.anInt7982 * (local60 - local30) / local36;
			} else {
				local141 = (local55 - local32) * local128 / local34;
				local150 = (local55 - local32) * local131 / local34;
				local158 = (local60 - local30) * local131 / local36;
				local166 = (local60 - local30) * local128 / local36;
			}
			@Pc(205) int[] local205 = new int[] { local141, local166, local128 };
			@Pc(220) int[] local220 = new int[] { local150, local158, local131 };
			local45.method7878(local205);
			local45.method7878(local220);
			@Pc(254) float local254 = Static5.method103((float) local205[2], 4, (float) local220[0], (float) local205[0], (float) local220[1], (float) local205[1], (float) local220[2]);
			if (local254 > 0.0F) {
				local266 = local220[0] - local205[0];
				local275 = local220[2] - local205[2];
				local286 = (int) ((float) local205[0] + local254 * (float) local266);
				local297 = (int) ((float) local205[2] + (float) local275 * local254);
				local123 = local286 + (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.method3950() - 1 << 8) >> 9;
				local125 = local297 + (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.method3950() - 1 << 8) >> 9;
				@Pc(325) byte local325 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127;
				if (local325 < 3 && (Static27.aByteArrayArrayArray1[1][local286 >> 9][local297 >> 9] & 0x2) != 0) {
					local343 = local325 + 1;
				}
			}
			if (local123 != -1 && local125 != -1) {
				if (Static8.aBoolean11 && (Static241.anInt3917 & 0x40) != 0) {
					@Pc(362) Class261 local362 = Static98.method1508(Static301.anInt4926, Static620.anInt9955);
					if (local362 == null) {
						Static618.method8289();
					} else {
						Static564.method7726(true, local123, -1, Static83.anInt1494, false, local125, (long) (local125 | local123 << 0), Static577.aString105, 0L, 4, true, " ->");
					}
				} else {
					if (Static344.aBoolean390) {
						Static564.method7726(true, local123, -1, -1, false, local125, (long) (local125 | local123 << 0), Static434.aClass271_27.method5972(Static483.anInt7694), 0L, 48, true, "");
					}
					Static564.method7726(true, local123, -1, Static480.anInt10368, false, local125, (long) (local123 << 0 | local125), Static356.aString65, 0L, 12, true, "");
				}
			}
		}
		if (Static319.aBoolean356) {
			Static547.method7554();
		}
		for (local123 = 0; local123 < (Static319.aBoolean356 ? 2 : 1); local123++) {
			@Pc(450) boolean local450 = local123 == 0;
			@Pc(456) Class94 local456 = local450 ? Static219.aClass94_4 : Static3.aClass94_7;
			local131 = arg1;
			local141 = arg0;
			if (Static319.aBoolean356) {
				Static421.method5624(local450);
				local131 = arg1 + Static89.method6486(local450);
				local141 = arg0 + Static512.method7194(local450);
			}
			@Pc(480) Class171 local480 = local456.aClass171_3;
			for (@Pc(485) Class13_Sub6 local485 = (Class13_Sub6) local480.method3745(); local485 != null; local485 = (Class13_Sub6) local480.method3744()) {
				if ((Static265.aBoolean291 || Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127 == local485.aClass13_Sub1_2.aByte127) && local485.method3777(local141, local131, arg2)) {
					@Pc(526) int local526;
					if (local485.aClass13_Sub1_2 instanceof Class13_Sub1_Sub1) {
						local158 = ((Class13_Sub1_Sub1) local485.aClass13_Sub1_2).aShort117;
						local526 = ((Class13_Sub1_Sub1) local485.aClass13_Sub1_2).aShort119;
					} else {
						local158 = local485.aClass13_Sub1_2.anInt10090 >> 9;
						local526 = local485.aClass13_Sub1_2.anInt10089 >> 9;
					}
					@Pc(644) int local644;
					@Pc(655) int local655;
					@Pc(764) int local764;
					@Pc(550) int local550;
					if (local485.aClass13_Sub1_2 instanceof Class13_Sub1_Sub1_Sub1_Sub2) {
						@Pc(546) Class13_Sub1_Sub1_Sub1_Sub2 local546 = (Class13_Sub1_Sub1_Sub1_Sub2) local485.aClass13_Sub1_2;
						local550 = local546.method3950();
						if ((local550 & 0x1) == 0 && (local546.anInt10090 & 0x1FF) == 0 && (local546.anInt10089 & 0x1FF) == 0 || (local550 & 0x1) == 1 && (local546.anInt10090 & 0x1FF) == 256 && (local546.anInt10089 & 0x1FF) == 256) {
							local266 = local546.anInt10090 - (local546.method3950() - 1 << 8);
							local275 = local546.anInt10089 - (local546.method3950() - 1 << 8);
							for (local286 = 0; local286 < Static639.anInt10306; local286++) {
								@Pc(619) Class2_Sub43 local619 = (Class2_Sub43) Static440.aClass118_41.method2595((long) Static147.anIntArray182[local286]);
								if (local619 != null) {
									@Pc(624) Class13_Sub1_Sub1_Sub1_Sub1 local624 = local619.aClass13_Sub1_Sub1_Sub1_Sub1_2;
									if (Static262.anInt5597 != local624.anInt4615 && local624.aBoolean317) {
										local644 = local624.anInt10090 - (local624.aClass150_1.anInt3793 - 1 << 8);
										local655 = local624.anInt10089 - (local624.aClass150_1.anInt3793 - 1 << 8);
										if (local266 <= local644 && local624.aClass150_1.anInt3793 <= local546.method3950() - (local644 - local266 >> 9) && local655 >= local275 && local624.aClass150_1.anInt3793 <= local546.method3950() - (local655 - local275 >> 9)) {
											Static626.method8391(local485.aClass13_Sub1_2.aByte127 != Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127, local624);
											local624.anInt4615 = Static262.anInt5597;
										}
									}
								}
							}
							local297 = Static580.anInt9430;
							@Pc(725) int[] local725 = Static6.anIntArray9;
							for (local644 = 0; local644 < local297; local644++) {
								@Pc(735) Class13_Sub1_Sub1_Sub1_Sub2 local735 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local725[local644]];
								if (local735 != null && local735.anInt4615 != Static262.anInt5597 && local546 != local735 && local735.aBoolean317) {
									local764 = local735.anInt10090 - (local735.method3950() - 1 << 8);
									@Pc(776) int local776 = local735.anInt10089 - (local735.method3950() - 1 << 8);
									if (local266 <= local764 && local735.method3950() <= local546.method3950() - (local764 - local266 >> 9) && local776 >= local275 && local735.method3950() <= local546.method3950() - (local776 - local275 >> 9)) {
										Static643.method8607(local485.aClass13_Sub1_2.aByte127 != Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127, local735);
										local735.anInt4615 = Static262.anInt5597;
									}
								}
							}
						}
						if (local546.anInt4615 == Static262.anInt5597) {
							continue;
						}
						Static643.method8607(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127 != local485.aClass13_Sub1_2.aByte127, local546);
						local546.anInt4615 = Static262.anInt5597;
					}
					if (local485.aClass13_Sub1_2 instanceof Class13_Sub1_Sub1_Sub1_Sub1) {
						@Pc(877) Class13_Sub1_Sub1_Sub1_Sub1 local877 = (Class13_Sub1_Sub1_Sub1_Sub1) local485.aClass13_Sub1_2;
						if (local877.aClass150_1 != null) {
							if ((local877.aClass150_1.anInt3793 & 0x1) == 0 && (local877.anInt10090 & 0x1FF) == 0 && (local877.anInt10089 & 0x1FF) == 0 || (local877.aClass150_1.anInt3793 & 0x1) == 1 && (local877.anInt10090 & 0x1FF) == 256 && (local877.anInt10089 & 0x1FF) == 256) {
								local550 = local877.anInt10090 - (local877.aClass150_1.anInt3793 - 1 << 8);
								local266 = local877.anInt10089 - (local877.aClass150_1.anInt3793 - 1 << 8);
								for (local275 = 0; local275 < Static639.anInt10306; local275++) {
									@Pc(962) Class2_Sub43 local962 = (Class2_Sub43) Static440.aClass118_41.method2595((long) Static147.anIntArray182[local275]);
									if (local962 != null) {
										@Pc(967) Class13_Sub1_Sub1_Sub1_Sub1 local967 = local962.aClass13_Sub1_Sub1_Sub1_Sub1_2;
										if (Static262.anInt5597 != local967.anInt4615 && local967 != local877 && local967.aBoolean317) {
											local343 = local967.anInt10090 - (local967.aClass150_1.anInt3793 - 1 << 8);
											local644 = local967.anInt10089 - (local967.aClass150_1.anInt3793 - 1 << 8);
											if (local550 <= local343 && local877.aClass150_1.anInt3793 - (local343 - local550 >> 9) >= local967.aClass150_1.anInt3793 && local644 >= local266 && local967.aClass150_1.anInt3793 <= local877.aClass150_1.anInt3793 - (local644 - local266 >> 9)) {
												Static626.method8391(local485.aClass13_Sub1_2.aByte127 != Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127, local967);
												local967.anInt4615 = Static262.anInt5597;
											}
										}
									}
								}
								local286 = Static580.anInt9430;
								@Pc(1077) int[] local1077 = Static6.anIntArray9;
								for (local343 = 0; local343 < local286; local343++) {
									@Pc(1087) Class13_Sub1_Sub1_Sub1_Sub2 local1087 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local1077[local343]];
									if (local1087 != null && Static262.anInt5597 != local1087.anInt4615 && local1087.aBoolean317) {
										local655 = local1087.anInt10090 - (local1087.method3950() - 1 << 8);
										local764 = local1087.anInt10089 - (local1087.method3950() - 1 << 8);
										if (local550 <= local655 && local1087.method3950() <= local877.aClass150_1.anInt3793 - (local655 - local550 >> 9) && local764 >= local266 && local1087.method3950() <= local877.aClass150_1.anInt3793 - (local764 - local266 >> 9)) {
											Static643.method8607(local485.aClass13_Sub1_2.aByte127 != Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127, local1087);
											local1087.anInt4615 = Static262.anInt5597;
										}
									}
								}
							}
							if (Static262.anInt5597 == local877.anInt4615) {
								continue;
							}
							Static626.method8391(local485.aClass13_Sub1_2.aByte127 != Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127, local877);
							local877.anInt4615 = Static262.anInt5597;
						}
					}
					if (local485.aClass13_Sub1_2 instanceof Class13_Sub1_Sub5_Sub1) {
						@Pc(1213) int local1213 = Static132.anInt2246 + local158;
						local550 = Static123.anInt2176 + local526;
						@Pc(1234) Class2_Sub11 local1234 = (Class2_Sub11) Static41.aClass118_6.method2595((long) (local485.aClass13_Sub1_2.aByte127 << 28 | local550 << 14 | local1213));
						if (local1234 != null) {
							local275 = 0;
							for (@Pc(1244) Class2_Sub4 local1244 = (Class2_Sub4) local1234.aClass109_23.method2321(); local1244 != null; local1244 = (Class2_Sub4) local1234.aClass109_23.method2324()) {
								@Pc(1252) Class34 local1252 = Static72.aClass225_2.method4789(local1244.anInt69);
								if (Static8.aBoolean11 && Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127 == local485.aClass13_Sub1_2.aByte127) {
									@Pc(1271) Class238 local1271 = Static198.anInt8166 == -1 ? null : Static339.aClass66_1.method1439(Static198.anInt8166);
									if ((Static241.anInt3917 & 0x1) != 0 && (local1271 == null || local1252.method688(local1271.anInt6043, Static198.anInt8166) != local1271.anInt6043)) {
										Static564.method7726(false, local158, -1, Static83.anInt1494, false, local526, (long) local275, Static577.aString105, (long) local1244.anInt69, 47, true, Static90.aString16 + " -> <col=ff9040>" + local1252.aString11);
									}
								}
								if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127 == local485.aClass13_Sub1_2.aByte127) {
									@Pc(1326) String[] local1326 = local1252.aStringArray3;
									for (local644 = 4; local644 >= 0; local644--) {
										if (local1326 != null && local1326[local644] != null) {
											@Pc(1338) byte local1338 = 0;
											local764 = Static141.anInt2605;
											if (local644 == 0) {
												local1338 = 25;
											}
											if (local644 == 1) {
												local1338 = 30;
											}
											if (local644 == 2) {
												local1338 = 3;
											}
											if (local644 == 3) {
												local1338 = 13;
											}
											if (local644 == 4) {
												local1338 = 2;
											}
											if (local644 == local1252.anInt886) {
												local764 = local1252.anInt871;
											}
											if (local1252.anInt861 == local644) {
												local764 = local1252.anInt868;
											}
											Static564.method7726(false, local158, -1, local764, false, local526, (long) local275, local1326[local644], (long) local1244.anInt69, local1338, true, "<col=ff9040>" + local1252.aString11);
										}
									}
								}
								Static564.method7726(false, local158, -1, Static377.anInt5908, Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127 != local485.aClass13_Sub1_2.aByte127, local526, (long) local275, Static434.aClass271_22.method5972(Static483.anInt7694), (long) local1244.anInt69, 1004, true, "<col=ff9040>" + local1252.aString11);
								local275++;
							}
						}
					}
					if (local485.aClass13_Sub1_2 instanceof Interface25) {
						@Pc(1482) Interface25 local1482 = (Interface25) local485.aClass13_Sub1_2;
						@Pc(1489) Class191 local1489 = Static319.aClass141_4.method2971(local1482.method8425());
						if (local1489.anIntArray323 != null) {
							local1489 = local1489.method4057(Static431.aClass205_1);
						}
						if (local1489 != null) {
							if (Static8.aBoolean11 && local485.aClass13_Sub1_2.aByte127 == Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127) {
								@Pc(1521) Class238 local1521 = Static198.anInt8166 == -1 ? null : Static339.aClass66_1.method1439(Static198.anInt8166);
								if ((Static241.anInt3917 & 0x4) != 0 && (local1521 == null || local1489.method4056(Static198.anInt8166, local1521.anInt6043) != local1521.anInt6043)) {
									Static564.method7726(false, local158, -1, Static83.anInt1494, false, local526, (long) local1482.hashCode(), Static577.aString105, Static616.method8282(local158, local1482, local526), 6, true, Static90.aString16 + " -> <col=00ffff>" + local1489.aString51);
								}
							}
							if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127 == local485.aClass13_Sub1_2.aByte127) {
								@Pc(1579) String[] local1579 = local1489.aStringArray24;
								if (local1579 != null) {
									for (local275 = 4; local275 >= 0; local275--) {
										if (local1579[local275] != null) {
											@Pc(1591) short local1591 = 0;
											if (local275 == 0) {
												local1591 = 45;
											}
											local297 = Static141.anInt2605;
											if (local275 == 1) {
												local1591 = 46;
											}
											if (local275 == 2) {
												local1591 = 44;
											}
											if (local275 == 3) {
												local1591 = 57;
											}
											if (local1489.anInt4788 == local275) {
												local297 = local1489.anInt4820;
											}
											if (local275 == 4) {
												local1591 = 1008;
											}
											if (local275 == local1489.anInt4821) {
												local297 = local1489.anInt4808;
											}
											Static564.method7726(false, local158, -1, local297, false, local526, (long) local1482.hashCode(), local1579[local275], Static616.method8282(local158, local1482, local526), local1591, true, "<col=00ffff>" + local1489.aString51);
										}
									}
								}
								Static564.method7726(false, local158, -1, Static377.anInt5908, local485.aClass13_Sub1_2.aByte127 != Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127, local526, (long) local1482.hashCode(), Static434.aClass271_22.method5972(Static483.anInt7694), (long) local1489.anInt4815, 1001, true, "<col=00ffff>" + local1489.aString51);
							}
						}
					}
				}
			}
			if (Static319.aBoolean356) {
				Static547.method7554();
			}
		}
		Static296.method4089(false);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLclient!ha;IZ)Lclient!da;")
	public static Class62 method7495(@OriginalArg(1) Class95 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class91 local18 = Static84.method1201(arg2, arg0, arg1);
		return local18 == null ? null : local18.aClass62_6;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIZI)V")
	public static void method7499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class350 local14 = Static113.aClass350ArrayArray1[arg0][arg2];
		Static440.method6028(local14 == null ? Static642.aClass350_2 : local14, arg1);
	}
}
