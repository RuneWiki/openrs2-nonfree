import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "[Lclient!h;")
	public static Class97[] aClass97Array1;

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
	public static int anInt6271;

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "I")
	public static int anInt6272;

	@OriginalMember(owner = "client!rq", name = "l", descriptor = "[I")
	public static int[] anIntArray403;

	@OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
	public static int anInt6273;

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_323 = new Class123(80, -1);

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I[ILclient!rl;IB[I)Lclient!bf;")
	public static Class22_Sub1 method5209(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class66_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4) {
		@Pc(10) byte[] local10 = new byte[arg3 * arg0];
		for (@Pc(17) int local17 = 0; local17 < arg3; local17++) {
			@Pc(28) int local28 = arg0 * local17 + arg1[local17];
			for (@Pc(30) int local30 = 0; local30 < arg4[local17]; local30++) {
				local10[local28++] = -1;
			}
		}
		return new Class22_Sub1(arg2, arg0, arg3, local10);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(CB)Z")
	public static boolean method5210(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIII)V")
	public static void method5212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static95.anInt2186;
		Static24.anInt778 = 0;
		@Pc(11) int[] local11 = Static178.anIntArray542;
		@Pc(174) int local174;
		@Pc(191) int local191;
		@Pc(245) int local245;
		@Pc(325) int local325;
		@Pc(413) int local413;
		@Pc(861) int local861;
		@Pc(550) int local550;
		for (@Pc(13) int local13 = 0; local13 < Static136.anInt2887 + local7; local13++) {
			@Pc(17) Class48 local17 = null;
			@Pc(30) Class3_Sub2_Sub1 local30;
			if (local13 < local7) {
				local30 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local11[local13]];
			} else {
				local30 = Static308.aClass3_Sub2_Sub1_Sub1Array1[Static66.anIntArray102[local13 - local7]];
				local17 = ((Class3_Sub2_Sub1_Sub1) local30).aClass48_1;
				if (local17.anIntArray103 != null) {
					local17 = local17.method1378(Static393.aClass207_1);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local30.anInt6604 >= 0 && (Static347.anInt6264 == local30.anInt6549 || local30.aByte103 == Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103)) {
				Static57.method1269(arg2 >> 1, arg3 >> 1, local30, local30.method5528());
				if (Static247.anIntArray317[0] >= 0) {
					if (local30.aString52 != null && (local13 >= local7 || Static427.anInt7603 == 0 || Static427.anInt7603 == 3 || Static427.anInt7603 == 1 && Static135.method2405(((Class3_Sub2_Sub1_Sub2) local30).aString54)) && Static24.anInt778 < Static379.anInt6784) {
						Static379.anIntArray464[Static24.anInt778] = Static237.aClass166_8.method3892(local30.aString52) / 2;
						Static379.anIntArray466[Static24.anInt778] = Static247.anIntArray317[0];
						Static379.anIntArray463[Static24.anInt778] = Static247.anIntArray317[1];
						Static379.anIntArray465[Static24.anInt778] = local30.anInt6591;
						Static379.anIntArray468[Static24.anInt778] = local30.anInt6540;
						Static379.anIntArray467[Static24.anInt778] = local30.anInt6539;
						Static379.aStringArray42[Static24.anInt778] = local30.aString52;
						Static24.anInt778++;
					}
					local174 = arg0 + Static247.anIntArray317[1];
					@Pc(230) Class87[] local230;
					@Pc(237) Class194[] local237;
					@Pc(297) Class87 local297;
					if (local30.aBoolean417 || Static66.anInt1741 >= local30.anInt6593) {
						local174 -= Math.max(Static237.aClass166_8.anInt4596, Static151.aClass87Array7[0].method6554());
					} else {
						@Pc(185) byte local185 = 1;
						if (local13 >= local7) {
							local191 = local17.anInt1773;
							if (local191 == -1) {
								local191 = local30.method5513().anInt7331;
							}
						} else {
							@Pc(207) Class3_Sub2_Sub1_Sub2 local207 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local11[local13]];
							local191 = local30.method5513().anInt7331;
							if (local207.aBoolean422) {
								local185 = 2;
							}
						}
						@Pc(219) Class87[] local219 = Static151.aClass87Array7;
						if (local191 != -1) {
							local230 = (Class87[]) Static295.aClass44_42.method1353((long) local191);
							if (local230 == null) {
								local237 = Static458.method4492(Static350.aClass100_69, local191);
								if (local237 != null) {
									local230 = new Class87[local237.length];
									for (local245 = 0; local245 < local237.length; local245++) {
										local230[local245] = Static126.aClass66_5.method5038(local237[local245]);
									}
									Static295.aClass44_42.method1349(local230, (long) local191);
								}
							}
							if (local230 != null && local230.length >= 2) {
								local219 = local230;
							}
						}
						if (local219.length <= local185) {
							local185 = 1;
						}
						@Pc(293) Class87 local293 = local219[0];
						local297 = local219[local185];
						local174 -= Math.max(Static237.aClass166_8.anInt4596, local293.method6554());
						local245 = arg1 + Static247.anIntArray317[0] - (local293.method6555() >> 1);
						local325 = local293.method6555() * local30.anInt6589 / 255;
						if (local30.anInt6589 > 0 && local325 < 2) {
							local325 = 2;
						}
						local293.method6567(local245, local174);
						Static126.aClass66_5.method5023(local245, local174, local325 + local245, local174 - -local293.method6554());
						local297.method6567(local245, local174);
						Static126.aClass66_5.method5044(arg1, arg0, arg1 + arg3, arg0 + arg2);
					}
					local174 -= 2;
					if (!local30.aBoolean417) {
						@Pc(396) Class87 local396;
						if (local30.anInt6556 > Static66.anInt1741) {
							local396 = Static38.aClass87Array2[local30.aBoolean419 ? 2 : 0];
							@Pc(405) Class87 local405 = Static38.aClass87Array2[local30.aBoolean419 ? 3 : 1];
							if (local30 instanceof Class3_Sub2_Sub1_Sub1) {
								local413 = local17.anInt1780;
								if (local413 == -1) {
									local413 = local30.method5513().anInt7303;
								}
							} else {
								local413 = local30.method5513().anInt7303;
							}
							if (local413 != -1) {
								local230 = (Class87[]) Static149.aClass44_15.method1353((long) local413);
								if (local230 == null) {
									local237 = Static458.method4492(Static350.aClass100_69, local413);
									if (local237 != null) {
										local230 = new Class87[local237.length];
										for (local245 = 0; local245 < local237.length; local245++) {
											local230[local245] = Static126.aClass66_5.method5038(local237[local245]);
										}
										Static149.aClass44_15.method1349(local230, (long) local413);
									}
								}
								if (local230 != null && local230.length == 4) {
									local396 = local230[local30.aBoolean419 ? 2 : 0];
									local405 = local230[local30.aBoolean419 ? 3 : 1];
								}
							}
							@Pc(509) int local509 = local30.anInt6556 - Static66.anInt1741;
							if (local509 > local30.anInt6537) {
								local509 -= local30.anInt6537;
								local245 = local30.anInt6577 == 0 ? 0 : (local30.anInt6542 - local509) / local30.anInt6577 * local30.anInt6577;
								local550 = local245 * local396.method6555() / local30.anInt6542;
							} else {
								local550 = local396.method6555();
							}
							local245 = local396.method6554();
							local174 -= local245;
							local325 = Static247.anIntArray317[0] + arg1 - (local396.method6555() >> 1);
							local396.method6567(local325, local174);
							Static126.aClass66_5.method5023(local325, local174, local325 + local550, local174 - -local245);
							local405.method6567(local325, local174);
							local174 -= 2;
							Static126.aClass66_5.method5044(arg1, arg0, arg3 + arg1, arg0 + arg2);
						}
						if (local13 < local7) {
							@Pc(648) Class3_Sub2_Sub1_Sub2 local648 = (Class3_Sub2_Sub1_Sub2) local30;
							if (local648.anInt6617 != -1) {
								local174 -= 25;
								Static77.aClass87Array4[local648.anInt6617].method6567(Static247.anIntArray317[0] + arg1 - 12, local174);
								local174 -= 2;
							}
							if (local648.anInt6623 != -1) {
								local174 -= 25;
								Static311.aClass87Array15[local648.anInt6623].method6567(Static247.anIntArray317[0] + arg1 - 12, local174);
								local174 -= 2;
							}
						} else if (local17.anInt1746 >= 0 && local17.anInt1746 < Static311.aClass87Array15.length) {
							local396 = Static311.aClass87Array15[local17.anInt1746];
							local174 -= 25;
							local396.method6567(Static247.anIntArray317[0] + arg1 - (local396.method6555() >> 1), local174);
							local174 -= 2;
						}
					}
					@Pc(696) Class17[] local696;
					@Pc(704) Class17 local704;
					if (!(local30 instanceof Class3_Sub2_Sub1_Sub2)) {
						local191 = 0;
						local696 = Static122.aClass17Array1;
						for (local413 = 0; local413 < local696.length; local413++) {
							local704 = local696[local413];
							if (local704 != null && local704.anInt532 == 1 && Static66.anIntArray102[local13 - local7] == local704.anInt531) {
								local297 = Static227.aClass87Array13[local704.anInt537];
								if (local191 < local297.method6554()) {
									local191 = local297.method6554();
								}
								if (Static66.anInt1741 % 20 < 10) {
									local297.method6567(Static247.anIntArray317[0] + arg1 - 12, local174 + -local297.method6554());
								}
							}
						}
						if (local191 > 0) {
						}
					} else if (local13 >= 0) {
						local191 = 0;
						local696 = Static122.aClass17Array1;
						for (local413 = 0; local413 < local696.length; local413++) {
							local704 = local696[local413];
							if (local704 != null && local704.anInt532 == 10 && local704.anInt531 == local11[local13]) {
								local297 = Static227.aClass87Array13[local704.anInt537];
								if (local297.method6554() > local191) {
									local191 = local297.method6554();
								}
								local297.method6567(arg1 + Static247.anIntArray317[0] - 12, local174 + -local297.method6554());
							}
						}
						if (local191 > 0) {
						}
					}
					for (local191 = 0; local191 < 4; local191++) {
						if (Static66.anInt1741 < local30.anIntArray457[local191]) {
							local861 = local30.method5528() / 2;
							Static57.method1269(arg2 >> 1, arg3 >> 1, local30, local861);
							if (Static247.anIntArray317[0] > -1) {
								if (local191 == 1) {
									Static247.anIntArray317[1] -= 20;
								}
								if (local191 == 2) {
									Static247.anIntArray317[0] -= 15;
									Static247.anIntArray317[1] -= 10;
								}
								if (local191 == 3) {
									Static247.anIntArray317[1] -= 10;
									Static247.anIntArray317[0] += 15;
								}
								Static85.aClass87Array5[local30.anIntArray455[local191]].method6567(Static247.anIntArray317[0] + arg1 - 12, arg0 + -12 + Static247.anIntArray317[1]);
								Static440.aClass29_3.method4795(arg1 + Static247.anIntArray317[0] - 1, Integer.toString(local30.anIntArray456[local191]), arg0 + Static247.anIntArray317[1] + 3, -1, 0);
							}
						}
					}
				}
			}
		}
		@Pc(993) int local993;
		for (@Pc(987) int local987 = 0; local987 < Static31.anInt886; local987++) {
			local993 = Static202.anIntArray271[local987];
			@Pc(1000) Class3_Sub2_Sub1 local1000;
			if (local993 < 2048) {
				local1000 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local993];
			} else {
				local1000 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local993 - 2048];
			}
			local191 = Static126.anIntArray160[local987];
			@Pc(1023) Class3_Sub2_Sub1 local1023;
			if (local191 >= 2048) {
				local1023 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local191 - 2048];
			} else {
				local1023 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local191];
			}
			Static125.method2162(arg3, --local1000.anInt6587, local1023, local1000, arg1, arg2, arg0);
		}
		local993 = Static237.aClass166_8.anInt4596 + Static237.aClass166_8.anInt4593 + 2;
		for (local174 = 0; local174 < Static24.anInt778; local174++) {
			local191 = Static379.anIntArray466[local174];
			local861 = Static379.anIntArray463[local174];
			local413 = Static379.anIntArray464[local174];
			@Pc(1087) boolean local1087 = true;
			while (local1087) {
				local1087 = false;
				for (local550 = 0; local550 < local174; local550++) {
					if (Static379.anIntArray463[local550] - local993 < local861 + 2 && local861 - local993 < Static379.anIntArray463[local550] + 2 && Static379.anIntArray464[local550] + Static379.anIntArray466[local550] > -local413 + local191 && Static379.anIntArray466[local550] - Static379.anIntArray464[local550] < local191 + local413 && Static379.anIntArray463[local550] - local993 < local861) {
						local1087 = true;
						local861 = Static379.anIntArray463[local550] - local993;
					}
				}
			}
			Static379.anIntArray463[local174] = local861;
			@Pc(1177) String local1177 = Static379.aStringArray42[local174];
			if (Static370.anInt6672 == 0) {
				local245 = 16776960;
				if (Static379.anIntArray465[local174] < 6) {
					local245 = Static352.anIntArray404[Static379.anIntArray465[local174]];
				}
				if (Static379.anIntArray465[local174] == 6) {
					local245 = Static347.anInt6264 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static379.anIntArray465[local174] == 7) {
					local245 = Static347.anInt6264 % 20 >= 10 ? 65535 : 255;
				}
				if (Static379.anIntArray465[local174] == 8) {
					local245 = Static347.anInt6264 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static379.anIntArray465[local174] == 9) {
					local325 = 150 - Static379.anIntArray467[local174];
					if (local325 < 50) {
						local245 = local325 * 1280 + 16711680;
					} else if (local325 < 100) {
						local245 = 16776960 + 16384000 - local325 * 327680;
					} else if (local325 < 150) {
						local245 = (local325 - 100) * 5 + 65280;
					}
				}
				if (Static379.anIntArray465[local174] == 10) {
					local325 = 150 - Static379.anIntArray467[local174];
					if (local325 < 50) {
						local245 = local325 * 5 + 16711680;
					} else if (local325 < 100) {
						local245 = 16711935 - (local325 - 50) * 327680;
					} else if (local325 < 150) {
						local245 = local325 * 327680 + 500 - local325 * 5 - 32767745;
					}
				}
				if (Static379.anIntArray465[local174] == 11) {
					local325 = 150 - Static379.anIntArray467[local174];
					if (local325 < 50) {
						local245 = 16777215 - local325 * 327685;
					} else if (local325 < 100) {
						local245 = local325 * 327685 + 65280 - 16384250;
					} else if (local325 < 150) {
						local245 = 16777215 - (local325 - 100) * 327680;
					}
				}
				local325 = local245 | 0xFF000000;
				if (Static379.anIntArray468[local174] == 0) {
					Static236.aClass29_2.method4795(local191 + arg1, local1177, arg0 + local861, local325, -16777216);
				}
				if (Static379.anIntArray468[local174] == 1) {
					Static236.aClass29_2.method4797(local325, local1177, Static347.anInt6264, arg0 + local861, local191 + arg1);
				}
				if (Static379.anIntArray468[local174] == 2) {
					Static236.aClass29_2.method4792(Static347.anInt6264, arg0 + local861, local1177, arg1 + local191, local325);
				}
				if (Static379.anIntArray468[local174] == 3) {
					Static236.aClass29_2.method4791(local325, local1177, 150 - Static379.anIntArray467[local174], local191 + arg1, Static347.anInt6264, arg0 + local861);
				}
				@Pc(1519) int local1519;
				if (Static379.anIntArray468[local174] == 4) {
					local1519 = (150 - Static379.anIntArray467[local174]) * (Static237.aClass166_8.method3892(local1177) + 100) / 150;
					Static126.aClass66_5.method5023(local191 + arg1 - 50, arg0, local191 + arg1 + 50, arg2 + arg0);
					Static236.aClass29_2.method4804(local325, -16777216, arg1 + local191 + 50 - local1519, local861 + arg0, local1177);
					Static126.aClass66_5.method5044(arg1, arg0, arg3 + arg1, arg2 + arg0);
				}
				if (Static379.anIntArray468[local174] == 5) {
					local1519 = 150 - Static379.anIntArray467[local174];
					@Pc(1579) int local1579 = 0;
					if (local1519 < 25) {
						local1579 = local1519 - 25;
					} else if (local1519 > 125) {
						local1579 = local1519 - 125;
					}
					@Pc(1604) int local1604 = Static237.aClass166_8.anInt4596 + Static237.aClass166_8.anInt4593;
					Static126.aClass66_5.method5023(arg1, arg0 + local861 - local1604 - 1, arg1 - -arg3, local861 + arg0 + 5);
					Static236.aClass29_2.method4795(local191 + arg1, local1177, local861 + arg0 + local1579, local325, -16777216);
					Static126.aClass66_5.method5044(arg1, arg0, arg3 + arg1, arg0 - -arg2);
				}
			} else {
				Static236.aClass29_2.method4795(local191 + arg1, local1177, arg0 + local861, -256, -16777216);
			}
		}
	}
}
