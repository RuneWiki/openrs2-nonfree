import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "Lclient!ie;")
	public static Class132 aClass132_1;

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "[I")
	public static int[] anIntArray781;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method7793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = Static235.anInt2721;
		@Pc(9) int[] local9 = Static130.anIntArray267;
		Static345.anInt6588 = 0;
		@Pc(180) int local180;
		@Pc(209) int local209;
		@Pc(256) int local256;
		@Pc(331) int local331;
		@Pc(420) int local420;
		@Pc(859) int local859;
		@Pc(550) int local550;
		for (@Pc(13) int local13 = 0; local13 < Static221.anInt4798 + local7; local13++) {
			@Pc(22) Class230 local22 = null;
			@Pc(38) Class6_Sub1_Sub2 local38;
			if (local7 <= local13) {
				local38 = ((Class3_Sub3) Static240.aClass267_20.method6644((long) Static3.anIntArray80[local13 - local7])).aClass6_Sub1_Sub2_Sub2_1;
				local22 = ((Class6_Sub1_Sub2_Sub2) local38).aClass230_1;
				if (local22.anIntArray627 != null) {
					local22 = local22.method5898(Static127.aClass215_1);
					if (local22 == null) {
						continue;
					}
				}
			} else {
				local38 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local9[local13]];
			}
			if (local38.anInt8597 >= 0 && (Static127.anInt2665 == local38.anInt8595 || local38.aByte100 == Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100)) {
				Static101.method1974(arg1 >> 1, local38.method7072(), local38, arg2 >> 1);
				if (Static447.anIntArray695[0] >= 0) {
					if (local38.aString80 != null && (local13 >= local7 || Static435.anInt7969 == 0 || Static435.anInt7969 == 3 || Static435.anInt7969 == 1 && Static524.method7521(((Class6_Sub1_Sub2_Sub1) local38).aString27)) && Static18.anInt676 > Static345.anInt6588) {
						Static18.anIntArray116[Static345.anInt6588] = Static25.aClass53_6.method1378(local38.aString80) / 2;
						Static18.anIntArray115[Static345.anInt6588] = Static447.anIntArray695[0];
						Static18.anIntArray122[Static345.anInt6588] = Static447.anIntArray695[1];
						Static18.anIntArray118[Static345.anInt6588] = local38.anInt8528;
						Static18.anIntArray119[Static345.anInt6588] = local38.anInt8546;
						Static18.anIntArray121[Static345.anInt6588] = local38.anInt8567;
						Static18.aStringArray4[Static345.anInt6588] = local38.aString80;
						Static345.anInt6588++;
					}
					local180 = Static447.anIntArray695[1] + arg3;
					@Pc(241) Class119[] local241;
					@Pc(248) Class9[] local248;
					@Pc(302) Class119 local302;
					if (local38.aBoolean631 || Static223.anInt4829 >= local38.anInt8553) {
						local180 -= Math.max(Static25.aClass53_6.anInt1511, Static390.aClass119Array13[0].b());
					} else {
						@Pc(191) byte local191 = 1;
						if (local13 < local7) {
							@Pc(204) Class6_Sub1_Sub2_Sub1 local204 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local9[local13]];
							local209 = local38.method7088().anInt2413;
							if (local204.aBoolean165) {
								local191 = 2;
							}
						} else {
							local209 = local22.anInt7039;
							if (local209 == -1) {
								local209 = local38.method7088().anInt2413;
							}
						}
						@Pc(230) Class119[] local230 = Static390.aClass119Array13;
						if (local209 != -1) {
							local241 = (Class119[]) Static70.aClass125_5.method3512((long) local209);
							if (local241 == null) {
								local248 = Static551.method526(Static19.aClass161_7, local209);
								if (local248 != null) {
									local241 = new Class119[local248.length];
									for (local256 = 0; local256 < local248.length; local256++) {
										local241[local256] = Static121.aClass5_7.method7425(local248[local256]);
									}
									Static70.aClass125_5.method3519((long) local209, local241);
								}
							}
							if (local241 != null && local241.length >= 2) {
								local230 = local241;
							}
						}
						if (local230.length <= local191) {
							local191 = 1;
						}
						@Pc(298) Class119 local298 = local230[0];
						local302 = local230[local191];
						local180 -= Math.max(Static25.aClass53_6.anInt1511, local298.b());
						local256 = arg0 + Static447.anIntArray695[0] - (local298.QA() >> 1);
						local331 = local298.QA() * local38.anInt8585 / 255;
						if (local38.anInt8585 > 0 && local331 < 2) {
							local331 = 2;
						}
						local298.method6678(local256, local180);
						Static121.aClass5_7.Q(local256, local180, local256 + local331, local180 - -local298.b());
						local302.method6678(local256, local180);
						Static121.aClass5_7.ca(arg0, arg3, arg1 + arg0, arg3 + arg2);
					}
					local180 -= 2;
					if (!local38.aBoolean631) {
						@Pc(403) Class119 local403;
						if (Static223.anInt4829 < local38.anInt8538) {
							local403 = Static202.aClass119Array10[local38.aBoolean629 ? 2 : 0];
							@Pc(412) Class119 local412 = Static202.aClass119Array10[local38.aBoolean629 ? 3 : 1];
							if (local38 instanceof Class6_Sub1_Sub2_Sub2) {
								local420 = local22.anInt7047;
								if (local420 == -1) {
									local420 = local38.method7088().anInt2440;
								}
							} else {
								local420 = local38.method7088().anInt2440;
							}
							if (local420 != -1) {
								local241 = (Class119[]) Static104.aClass125_15.method3512((long) local420);
								if (local241 == null) {
									local248 = Static551.method526(Static19.aClass161_7, local420);
									if (local248 != null) {
										local241 = new Class119[local248.length];
										for (local256 = 0; local256 < local248.length; local256++) {
											local241[local256] = Static121.aClass5_7.method7425(local248[local256]);
										}
										Static104.aClass125_15.method3519((long) local420, local241);
									}
								}
								if (local241 != null && local241.length == 4) {
									local403 = local241[local38.aBoolean629 ? 2 : 0];
									local412 = local241[local38.aBoolean629 ? 3 : 1];
								}
							}
							@Pc(512) int local512 = local38.anInt8538 - Static223.anInt4829;
							if (local512 > local38.anInt8577) {
								local512 -= local38.anInt8577;
								local256 = local38.anInt8573 == 0 ? 0 : (local38.anInt8591 - local512) / local38.anInt8573 * local38.anInt8573;
								local550 = local256 * local403.QA() / local38.anInt8591;
							} else {
								local550 = local403.QA();
							}
							local256 = local403.b();
							local180 -= local256;
							local331 = Static447.anIntArray695[0] + arg0 - (local403.QA() >> 1);
							local403.method6678(local331, local180);
							Static121.aClass5_7.Q(local331, local180, local550 + local331, local256 + local180);
							local412.method6678(local331, local180);
							local180 -= 2;
							Static121.aClass5_7.ca(arg0, arg3, arg1 + arg0, arg2 + arg3);
						}
						if (local13 < local7) {
							@Pc(646) Class6_Sub1_Sub2_Sub1 local646 = (Class6_Sub1_Sub2_Sub1) local38;
							if (local646.anInt2280 != -1) {
								local180 -= 25;
								Static7.aClass119Array1[local646.anInt2280].method6678(arg0 + Static447.anIntArray695[0] - 12, local180);
								local180 -= 2;
							}
							if (local646.anInt2305 != -1) {
								local180 -= 25;
								Static541.aClass119Array17[local646.anInt2305].method6678(arg0 + Static447.anIntArray695[0] - 12, local180);
								local180 -= 2;
							}
						} else if (local22.anInt7029 >= 0 && local22.anInt7029 < Static541.aClass119Array17.length) {
							local403 = Static541.aClass119Array17[local22.anInt7029];
							local180 -= 25;
							local403.method6678(Static447.anIntArray695[0] + arg0 - (local403.QA() >> 1), local180);
							local180 -= 2;
						}
					}
					@Pc(694) Class296[] local694;
					@Pc(702) Class296 local702;
					if (!(local38 instanceof Class6_Sub1_Sub2_Sub1)) {
						local209 = 0;
						local694 = Static518.aClass296Array2;
						for (local420 = 0; local420 < local694.length; local420++) {
							local702 = local694[local420];
							if (local702 != null && local702.anInt8744 == 1 && local702.anInt8745 == Static3.anIntArray80[local13 - local7]) {
								local302 = Static51.aClass119Array4[local702.anInt8747];
								if (local209 < local302.b()) {
									local209 = local302.b();
								}
								if (Static223.anInt4829 % 20 < 10) {
									local302.method6678(Static447.anIntArray695[0] + arg0 - 12, local180 + -local302.b());
								}
							}
						}
						if (local209 > 0) {
						}
					} else if (local13 >= 0) {
						local209 = 0;
						local694 = Static518.aClass296Array2;
						for (local420 = 0; local420 < local694.length; local420++) {
							local702 = local694[local420];
							if (local702 != null && local702.anInt8744 == 10 && local702.anInt8745 == local9[local13]) {
								local302 = Static51.aClass119Array4[local702.anInt8747];
								if (local209 < local302.b()) {
									local209 = local302.b();
								}
								local302.method6678(Static447.anIntArray695[0] + arg0 - 12, local180 - local302.b());
							}
						}
						if (local209 > 0) {
						}
					}
					for (local209 = 0; local209 < 4; local209++) {
						if (Static223.anInt4829 < local38.anIntArray731[local209]) {
							local859 = local38.method7072() / 2;
							Static101.method1974(arg1 >> 1, local859, local38, arg2 >> 1);
							if (Static447.anIntArray695[0] > -1) {
								local420 = Static322.aClass119Array12[local38.anIntArray732[local209]].QA();
								if (local209 == 1) {
									Static447.anIntArray695[1] -= 20;
								}
								if (local209 == 2) {
									Static447.anIntArray695[0] -= local420 - 9;
									Static447.anIntArray695[1] -= 10;
								}
								if (local209 == 3) {
									Static447.anIntArray695[0] += local420 - 9;
									Static447.anIntArray695[1] -= 10;
								}
								Static322.aClass119Array12[local38.anIntArray732[local209]].method6678(arg0 + Static447.anIntArray695[0] - (local420 >> 1), arg3 + -12 - -Static447.anIntArray695[1]);
								Static364.aClass59_3.method7265(-1, Static447.anIntArray695[1] + arg3 + 3, Integer.toString(local38.anIntArray730[local209]), 0, arg0 + Static447.anIntArray695[0] - 1);
							}
						}
					}
				}
			}
		}
		@Pc(1008) int local1008;
		for (@Pc(1002) int local1002 = 0; local1002 < Static327.anInt6263; local1002++) {
			local1008 = Static98.anIntArray217[local1002];
			@Pc(1017) Class6_Sub1_Sub2 local1017;
			if (local1008 < 2048) {
				local1017 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local1008];
			} else {
				local1017 = ((Class3_Sub3) Static240.aClass267_20.method6644((long) (local1008 - 2048))).aClass6_Sub1_Sub2_Sub2_1;
			}
			local209 = Static135.anIntArray272[local1002];
			@Pc(1040) Class6_Sub1_Sub2 local1040;
			if (local209 < 2048) {
				local1040 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local209];
			} else {
				local1040 = ((Class3_Sub3) Static240.aClass267_20.method6644((long) (local209 - 2048))).aClass6_Sub1_Sub2_Sub2_1;
			}
			Static355.method5575(local1040, arg3, arg2, arg0, local1017, --local1017.anInt8536, arg1);
		}
		local1008 = Static25.aClass53_6.anInt1511 + Static25.aClass53_6.anInt1514 + 2;
		for (local180 = 0; local180 < Static345.anInt6588; local180++) {
			local209 = Static18.anIntArray115[local180];
			local859 = Static18.anIntArray122[local180];
			local420 = Static18.anIntArray116[local180];
			@Pc(1103) boolean local1103 = true;
			while (local1103) {
				local1103 = false;
				for (local550 = 0; local550 < local180; local550++) {
					if (Static18.anIntArray122[local550] - local1008 < local859 + 2 && Static18.anIntArray122[local550] + 2 > -local1008 + local859 && Static18.anIntArray115[local550] + Static18.anIntArray116[local550] > -local420 + local209 && Static18.anIntArray115[local550] - Static18.anIntArray116[local550] < local209 + local420 && Static18.anIntArray122[local550] - local1008 < local859) {
						local1103 = true;
						local859 = Static18.anIntArray122[local550] - local1008;
					}
				}
			}
			Static18.anIntArray122[local180] = local859;
			@Pc(1191) String local1191 = Static18.aStringArray4[local180];
			if (Static131.anInt2736 == 0) {
				local256 = 16776960;
				if (Static18.anIntArray118[local180] < 6) {
					local256 = Static504.anIntArray777[Static18.anIntArray118[local180]];
				}
				if (Static18.anIntArray118[local180] == 6) {
					local256 = Static127.anInt2665 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static18.anIntArray118[local180] == 7) {
					local256 = Static127.anInt2665 % 20 >= 10 ? 65535 : 255;
				}
				if (Static18.anIntArray118[local180] == 8) {
					local256 = Static127.anInt2665 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static18.anIntArray118[local180] == 9) {
					local331 = 150 - Static18.anIntArray121[local180];
					if (local331 < 50) {
						local256 = local331 * 1280 + 16711680;
					} else if (local331 < 100) {
						local256 = 16776960 - (local331 - 50) * 327680;
					} else if (local331 < 150) {
						local256 = (local331 - 100) * 5 + 65280;
					}
				}
				if (Static18.anIntArray118[local180] == 10) {
					local331 = 150 - Static18.anIntArray121[local180];
					if (local331 < 50) {
						local256 = local331 * 5 + 16711680;
					} else if (local331 < 100) {
						local256 = 16711935 - (local331 - 50) * 327680;
					} else if (local331 < 150) {
						local256 = local331 * 327680 + 255 - (local331 - 100) * 5 - 32768000;
					}
				}
				if (Static18.anIntArray118[local180] == 11) {
					local331 = 150 - Static18.anIntArray121[local180];
					if (local331 < 50) {
						local256 = 16777215 - local331 * 327685;
					} else if (local331 < 100) {
						local256 = (local331 - 50) * 327685 + 65280;
					} else if (local331 < 150) {
						local256 = 16777215 - (local331 - 100) * 327680;
					}
				}
				local331 = local256 | 0xFF000000;
				if (Static18.anIntArray119[local180] == 0) {
					Static294.aClass59_2.method7265(local331, arg3 + local859, local1191, -16777216, local209 + arg0);
				}
				if (Static18.anIntArray119[local180] == 1) {
					Static294.aClass59_2.method7268(Static127.anInt2665, local1191, local331, arg0 + local209, local859 + arg3);
				}
				if (Static18.anIntArray119[local180] == 2) {
					Static294.aClass59_2.method7264(Static127.anInt2665, local1191, arg0 + local209, arg3 - -local859, local331);
				}
				if (Static18.anIntArray119[local180] == 3) {
					Static294.aClass59_2.method7270(Static127.anInt2665, arg0 + local209, -Static18.anIntArray121[local180] + 150, arg3 + local859, local1191, local331);
				}
				@Pc(1531) int local1531;
				if (Static18.anIntArray119[local180] == 4) {
					local1531 = (150 - Static18.anIntArray121[local180]) * (Static25.aClass53_6.method1378(local1191) + 100) / 150;
					Static121.aClass5_7.Q(arg0 + local209 - 50, arg3, local209 + arg0 + 50, arg3 - -arg2);
					Static294.aClass59_2.method7281(local859 + arg3, local1191, local331, -16777216, arg0 + local209 + 50 - local1531);
					Static121.aClass5_7.ca(arg0, arg3, arg1 + arg0, arg3 - -arg2);
				}
				if (Static18.anIntArray119[local180] == 5) {
					local1531 = 150 - Static18.anIntArray121[local180];
					@Pc(1593) int local1593 = 0;
					if (local1531 < 25) {
						local1593 = local1531 - 25;
					} else if (local1531 > 125) {
						local1593 = local1531 - 125;
					}
					@Pc(1615) int local1615 = Static25.aClass53_6.anInt1514 + Static25.aClass53_6.anInt1511;
					Static121.aClass5_7.Q(arg0, arg3 + local859 - local1615 - 1, arg1 + arg0, local859 + arg3 + 5);
					Static294.aClass59_2.method7265(local331, local1593 + local859 + arg3, local1191, -16777216, local209 + arg0);
					Static121.aClass5_7.ca(arg0, arg3, arg1 + arg0, arg2 + arg3);
				}
			} else {
				Static294.aClass59_2.method7265(-256, local859 + arg3, local1191, -16777216, arg0 + local209);
			}
		}
	}
}
