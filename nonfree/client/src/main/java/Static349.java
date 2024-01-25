import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "Lclient!e;")
	public static Class2_Sub11_Sub1 aClass2_Sub11_Sub1_5;

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_159 = new Class140("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method5647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = Static9.anInt173;
		@Pc(9) int[] local9 = Static195.anIntArray322;
		Static57.anInt1008 = 0;
		@Pc(22) byte local22 = Static177.method3423() == 2 ? (byte) Static31.anInt512 : 1;
		@Pc(84) int local84;
		@Pc(89) int local89;
		@Pc(280) int local280;
		@Pc(461) int local461;
		@Pc(575) int local575;
		@Pc(335) int local335;
		@Pc(689) int local689;
		@Pc(517) int local517;
		label434: for (@Pc(24) int local24 = 0; local24 < local7 + Static186.anInt4092; local24++) {
			@Pc(28) Class139 local28 = null;
			@Pc(44) Class1_Sub2_Sub3 local44;
			if (local7 <= local24) {
				local44 = Static95.aClass1_Sub2_Sub3_Sub2Array1[Static171.anIntArray292[local24 - local7]];
				local28 = ((Class1_Sub2_Sub3_Sub2) local44).aClass139_1;
				if (local28.anIntArray350 != null) {
					local28 = local28.method4120();
					if (local28 == null) {
						continue;
					}
				}
			} else {
				local44 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local9[local24]];
			}
			if (local44.anInt6947 >= 0) {
				if (Static332.aByteArrayArrayArray12 != null && local44.aByte77 > Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77) {
					for (local84 = local44.aShort89; local84 <= local44.aShort88; local84++) {
						for (local89 = local44.aShort90; local89 <= local44.aShort87; local89++) {
							if (local22 == Static332.aByteArrayArrayArray12[local44.aByte77][local84][local89]) {
								continue label434;
							}
						}
					}
				}
				Static101.method2008(arg2 >> 1, arg1 >> 1, local44, local44.method5784());
				if (Static311.anIntArray474[0] >= 0) {
					if (local44.aString73 != null && (local7 <= local24 || Static54.anInt971 == 0 || Static54.anInt971 == 3 || Static54.anInt971 == 1 && Static236.method1163(((Class1_Sub2_Sub3_Sub1) local44).aString34)) && Static177.anInt3980 > Static57.anInt1008) {
						Static177.anIntArray298[Static57.anInt1008] = Static99.aClass82_3.method2230(local44.aString73) / 2;
						Static177.anIntArray303[Static57.anInt1008] = Static311.anIntArray474[0];
						Static177.anIntArray302[Static57.anInt1008] = Static311.anIntArray474[1];
						Static177.anIntArray301[Static57.anInt1008] = local44.anInt6958;
						Static177.anIntArray300[Static57.anInt1008] = local44.anInt6905;
						Static177.anIntArray299[Static57.anInt1008] = local44.anInt6936;
						Static177.aStringArray28[Static57.anInt1008] = local44.aString73;
						Static57.anInt1008++;
					}
					@Pc(221) Class46 local221 = Static51.aClass46Array5[0];
					local89 = arg3 + Static311.anIntArray474[1] - Math.max(Static99.aClass82_3.anInt2404, local221.method5023());
					@Pc(248) Class46 local248;
					@Pc(347) int local347;
					if (!local44.aBoolean615 && local44.anInt6935 > Static6.anInt91) {
						local248 = Static51.aClass46Array5[1];
						if (local44 instanceof Class1_Sub2_Sub3_Sub2) {
							@Pc(254) Class1_Sub2_Sub3_Sub2 local254 = (Class1_Sub2_Sub3_Sub2) local44;
							@Pc(263) Class46[] local263 = (Class46[]) Static288.aClass107_44.method3021((long) local254.aClass139_1.anInt4771);
							if (local263 == null) {
								@Pc(272) Class40[] local272 = Static368.method833(Static338.aClass104_184, local254.aClass139_1.anInt4771);
								if (local272 != null) {
									local263 = new Class46[local272.length];
									for (local280 = 0; local280 < local272.length; local280++) {
										local263[local280] = Static51.aClass37_1.method3708(local272[local280]);
									}
									Static288.aClass107_44.method3018((long) local254.aClass139_1.anInt4771, local263);
								}
							}
							if (local263 != null && local263.length == 2) {
								local248 = local263[1];
								local221 = local263[0];
							}
						}
						local335 = arg0 + Static311.anIntArray474[0] - (local221.method5019() >> 1);
						local221.method5016(local335, local89);
						local347 = local221.method5019() * local44.anInt6923 / 255;
						if (local44.anInt6923 > 0 && local347 < 2) {
							local347 = 2;
						}
						Static51.aClass37_1.method3696(local335, local89, local335 + local347, local221.method5023() + local89);
						local248.method5016(local335, local89);
						Static51.aClass37_1.method3677(arg0, arg3, arg0 + arg2, arg1 + arg3);
					}
					local89 -= 2;
					if (!local44.aBoolean615) {
						if (Static6.anInt91 < local44.anInt6924) {
							local248 = Static78.aClass46Array11[local44.aBoolean616 ? 2 : 0];
							@Pc(412) Class46 local412 = Static78.aClass46Array11[local44.aBoolean616 ? 3 : 1];
							if (local44 instanceof Class1_Sub2_Sub3_Sub2) {
								local347 = local28.anInt4794;
								if (local347 == -1) {
									local347 = local44.method5778().anInt4890;
								}
							} else {
								local347 = local44.method5778().anInt4890;
							}
							if (local347 != -1) {
								@Pc(446) Class46[] local446 = (Class46[]) Static213.aClass107_28.method3021((long) local347);
								if (local446 == null) {
									@Pc(453) Class40[] local453 = Static368.method833(Static338.aClass104_184, local347);
									if (local453 != null) {
										local446 = new Class46[local453.length];
										for (local461 = 0; local461 < local453.length; local461++) {
											local446[local461] = Static51.aClass37_1.method3708(local453[local461]);
										}
										Static213.aClass107_28.method3018((long) local347, local446);
									}
								}
								if (local446 != null && local446.length == 4) {
									local412 = local446[local44.aBoolean616 ? 3 : 1];
									local248 = local446[local44.aBoolean616 ? 2 : 0];
								}
							}
							local517 = local44.anInt6924 - Static6.anInt91;
							if (local44.anInt6938 < local517) {
								local517 -= local44.anInt6938;
								local461 = local44.anInt6913 == 0 ? 0 : local44.anInt6913 * ((local44.anInt6920 - local517) / local44.anInt6913);
								local280 = local461 * local248.method5019() / local44.anInt6920;
							} else {
								local280 = local248.method5019();
							}
							local461 = local248.method5023();
							local89 -= local461;
							local575 = Static311.anIntArray474[0] + arg0 - (local248.method5019() >> 1);
							local248.method5016(local575, local89);
							Static51.aClass37_1.method3696(local575, local89, local575 + local280, local461 + local89);
							local412.method5016(local575, local89);
							Static51.aClass37_1.method3677(arg0, arg3, arg0 + arg2, arg1 + arg3);
							local89 -= 2;
						}
						if (local24 < local7) {
							@Pc(610) Class1_Sub2_Sub3_Sub1 local610 = (Class1_Sub2_Sub3_Sub1) local44;
							if (local610.anInt3385 != -1) {
								local89 -= 25;
								Static80.aClass46Array12[local610.anInt3385].method5016(arg0 + Static311.anIntArray474[0] - 12, local89);
								local89 -= 2;
							}
							if (local610.anInt3419 != -1) {
								local89 -= 25;
								Static81.aClass46Array13[local610.anInt3419].method5016(Static311.anIntArray474[0] + arg0 - 12, local89);
								local89 -= 2;
							}
						} else if (local28.anInt4806 >= 0 && local28.anInt4806 < Static81.aClass46Array13.length) {
							local248 = Static81.aClass46Array13[local28.anInt4806];
							local89 -= 25;
							local248.method5016(Static311.anIntArray474[0] + arg0 - (local248.method5019() >> 1), local89);
							local89 -= 2;
						}
					}
					@Pc(691) Class52[] local691;
					@Pc(699) Class52 local699;
					@Pc(720) Class46 local720;
					if (!(local44 instanceof Class1_Sub2_Sub3_Sub1)) {
						local689 = 0;
						local691 = Static223.aClass52Array1;
						for (local347 = 0; local347 < local691.length; local347++) {
							local699 = local691[local347];
							if (local699 != null && local699.anInt1018 == 1 && local699.anInt1012 == Static171.anIntArray292[local24 - local7]) {
								local720 = Static240.aClass46Array38[local699.anInt1017];
								if (local720.method5023() > local689) {
									local689 = local720.method5023();
								}
								if (Static6.anInt91 % 20 < 10) {
									local720.method5016(arg0 + Static311.anIntArray474[0] - 12, -local720.method5023() + local89);
								}
							}
						}
						if (local689 > 0) {
						}
					} else if (local24 >= 0) {
						local689 = 0;
						local691 = Static223.aClass52Array1;
						for (local347 = 0; local347 < local691.length; local347++) {
							local699 = local691[local347];
							if (local699 != null && local699.anInt1018 == 10 && local9[local24] == local699.anInt1012) {
								local720 = Static240.aClass46Array38[local699.anInt1017];
								if (local720.method5023() > local689) {
									local689 = local720.method5023();
								}
								local720.method5016(Static311.anIntArray474[0] + arg0 - 12, -local720.method5023() + local89);
							}
						}
						if (local689 > 0) {
						}
					}
					for (local689 = 0; local689 < 4; local689++) {
						if (Static6.anInt91 < local44.anIntArray533[local689]) {
							local335 = local44.method5784() / 2;
							Static101.method2008(arg2 >> 1, arg1 >> 1, local44, local335);
							if (Static311.anIntArray474[0] > -1) {
								if (local689 == 1) {
									Static311.anIntArray474[1] -= 20;
								}
								if (local689 == 2) {
									Static311.anIntArray474[1] -= 10;
									Static311.anIntArray474[0] -= 15;
								}
								if (local689 == 3) {
									Static311.anIntArray474[0] += 15;
									Static311.anIntArray474[1] -= 10;
								}
								Static279.aClass46Array31[local44.anIntArray532[local689]].method5016(arg0 + Static311.anIntArray474[0] - 12, arg3 - (-Static311.anIntArray474[1] + 12));
								Static295.aClass71_5.method5233(-1, 0, Static311.anIntArray474[1] + arg3 + 3, arg0 - (-Static311.anIntArray474[0] + 1), Integer.toString(local44.anIntArray530[local689]));
							}
						}
					}
				}
			}
		}
		@Pc(1002) int local1002;
		for (@Pc(996) int local996 = 0; local996 < Static135.anInt2909; local996++) {
			local1002 = Static79.anIntArray124[local996];
			@Pc(1011) Class1_Sub2_Sub3 local1011;
			if (local1002 < 2048) {
				local1011 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local1002];
			} else {
				local1011 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local1002 - 2048];
			}
			local89 = Static345.anIntArray512[local996];
			@Pc(1032) Class1_Sub2_Sub3 local1032;
			if (local89 >= 2048) {
				local1032 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local89 - 2048];
			} else {
				local1032 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local89];
			}
			Static323.method5331(arg2, --local1011.anInt6960, arg0, arg1, local1032, local1011, arg3);
		}
		local1002 = Static99.aClass82_3.anInt2404 + Static99.aClass82_3.anInt2400 + 2;
		for (local84 = 0; local84 < Static57.anInt1008; local84++) {
			local89 = Static177.anIntArray303[local84];
			local689 = Static177.anIntArray302[local84];
			local335 = Static177.anIntArray298[local84];
			@Pc(1094) boolean local1094 = true;
			while (local1094) {
				local1094 = false;
				for (local517 = 0; local517 < local84; local517++) {
					if (local689 + 2 > -local1002 + Static177.anIntArray302[local517] && Static177.anIntArray302[local517] + 2 > local689 + -local1002 && local89 - local335 < Static177.anIntArray303[local517] - -Static177.anIntArray298[local517] && Static177.anIntArray303[local517] - Static177.anIntArray298[local517] < local335 + local89 && Static177.anIntArray302[local517] - local1002 < local689) {
						local689 = Static177.anIntArray302[local517] - local1002;
						local1094 = true;
					}
				}
			}
			Static177.anIntArray302[local84] = local689;
			@Pc(1190) String local1190 = Static177.aStringArray28[local84];
			if (Static357.anInt6815 == 0) {
				local280 = 16776960;
				if (Static177.anIntArray301[local84] < 6) {
					local280 = Static123.anIntArray213[Static177.anIntArray301[local84]];
				}
				if (Static177.anIntArray301[local84] == 6) {
					local280 = Static31.anInt512 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static177.anIntArray301[local84] == 7) {
					local280 = Static31.anInt512 % 20 < 10 ? 255 : 65535;
				}
				if (Static177.anIntArray301[local84] == 8) {
					local280 = Static31.anInt512 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static177.anIntArray301[local84] == 9) {
					local461 = 150 - Static177.anIntArray299[local84];
					if (local461 < 50) {
						local280 = local461 * 1280 + 16711680;
					} else if (local461 < 100) {
						local280 = 16776960 - (local461 - 50) * 327680;
					} else if (local461 < 150) {
						local280 = (local461 - 100) * 5 + 65280;
					}
				}
				if (Static177.anIntArray301[local84] == 10) {
					local461 = 150 - Static177.anIntArray299[local84];
					if (local461 < 50) {
						local280 = local461 * 5 + 16711680;
					} else if (local461 < 100) {
						local280 = 16711935 - (local461 - 50) * 327680;
					} else if (local461 < 150) {
						local280 = local461 * 327680 - (local461 + -100) * 5 - 32767745;
					}
				}
				if (Static177.anIntArray301[local84] == 11) {
					local461 = 150 - Static177.anIntArray299[local84];
					if (local461 < 50) {
						local280 = 16777215 - local461 * 327685;
					} else if (local461 < 100) {
						local280 = (local461 - 50) * 327685 + 65280;
					} else if (local461 < 150) {
						local280 = 16777215 - (local461 - 100) * 327680;
					}
				}
				local461 = local280 | 0xFF000000;
				if (Static177.anIntArray300[local84] == 0) {
					Static25.aClass71_1.method5233(local461, -16777216, local689 + arg3, arg0 - -local89, local1190);
				}
				if (Static177.anIntArray300[local84] == 1) {
					Static25.aClass71_1.method5242(Static31.anInt512, arg3 + local689, local461, local89 + arg0, local1190);
				}
				if (Static177.anIntArray300[local84] == 2) {
					Static25.aClass71_1.method5244(local89 + arg0, local461, local689 + arg3, Static31.anInt512, local1190);
				}
				if (Static177.anIntArray300[local84] == 3) {
					Static25.aClass71_1.method5234(local461, local689 + arg3, local1190, arg0 + local89, -Static177.anIntArray299[local84] + 150, Static31.anInt512);
				}
				if (Static177.anIntArray300[local84] == 4) {
					local575 = (150 - Static177.anIntArray299[local84]) * (Static99.aClass82_3.method2230(local1190) + 100) / 150;
					Static51.aClass37_1.method3696(local89 + arg0 - 50, arg3, arg0 + local89 + 50, arg1 + arg3);
					Static25.aClass71_1.method5250(local1190, arg3 + local689, local461, -16777216, local89 + arg0 + 50 - local575);
					Static51.aClass37_1.method3677(arg0, arg3, arg0 + arg2, arg3 + arg1);
				}
				if (Static177.anIntArray300[local84] == 5) {
					local575 = 150 - Static177.anIntArray299[local84];
					@Pc(1589) int local1589 = 0;
					if (local575 < 25) {
						local1589 = local575 - 25;
					} else if (local575 > 125) {
						local1589 = local575 - 125;
					}
					@Pc(1615) int local1615 = Static99.aClass82_3.anInt2400 + Static99.aClass82_3.anInt2404;
					Static51.aClass37_1.method3696(arg0, local689 + arg3 - local1615 - 1, arg0 - -arg2, arg3 + local689 + 5);
					Static25.aClass71_1.method5233(local461, -16777216, local689 + arg3 + local1589, local89 + arg0, local1190);
					Static51.aClass37_1.method3677(arg0, arg3, arg2 + arg0, arg1 + arg3);
				}
			} else {
				Static25.aClass71_1.method5233(-256, -16777216, arg3 + local689, local89 + arg0, local1190);
			}
		}
	}
}
