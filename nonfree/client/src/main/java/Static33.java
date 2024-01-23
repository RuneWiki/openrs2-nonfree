import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
	public static int anInt657;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
	public static int anInt660;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
	public static int anInt662 = 2;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZILclient!ne;)V")
	public static void method644(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub23 arg1) {
		@Pc(8) Object[] local8 = arg1.anObjectArray32;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class4_Sub2_Sub16 local18 = Static151.method2388(local14);
		if (local18 == null) {
			return;
		}
		Static67.anInt1404 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = 0;
		@Pc(33) int[] local33 = local18.anIntArray335;
		@Pc(36) int[] local36 = local18.anIntArray337;
		@Pc(38) byte local38 = -1;
		@Pc(56) int local56;
		try {
			Static141.aStringArray16 = new String[local18.anInt4046];
			Static19.anIntArray57 = new int[local18.anInt4042];
			@Pc(48) int local48 = 0;
			@Pc(54) int local54 = 0;
			@Pc(75) int local75;
			@Pc(183) String local183;
			for (local56 = 1; local56 < local8.length; local56++) {
				if (local8[local56] instanceof Integer) {
					local75 = (Integer) local8[local56];
					if (local75 == -2147483647) {
						local75 = arg1.anInt3602;
					}
					if (local75 == -2147483646) {
						local75 = arg1.anInt3596;
					}
					if (local75 == -2147483645) {
						local75 = arg1.aClass97_15 == null ? -1 : arg1.aClass97_15.anInt3162;
					}
					if (local75 == -2147483644) {
						local75 = arg1.anInt3599;
					}
					if (local75 == -2147483643) {
						local75 = arg1.aClass97_15 == null ? -1 : arg1.aClass97_15.anInt3146;
					}
					if (local75 == -2147483642) {
						local75 = arg1.aClass97_16 == null ? -1 : arg1.aClass97_16.anInt3162;
					}
					if (local75 == -2147483641) {
						local75 = arg1.aClass97_16 == null ? -1 : arg1.aClass97_16.anInt3146;
					}
					if (local75 == -2147483640) {
						local75 = arg1.anInt3605;
					}
					if (local75 == -2147483639) {
						local75 = arg1.anInt3601;
					}
					Static19.anIntArray57[local48++] = local75;
				} else if (local8[local56] instanceof String) {
					local183 = (String) local8[local56];
					if (local183.equals("event_opbase")) {
						local183 = arg1.aString125;
					}
					Static141.aStringArray16[local54++] = local183;
				}
			}
			local56 = 0;
			label4462: while (true) {
				local56++;
				if (arg0 < local56) {
					throw new RuntimeException("slow");
				}
				local28++;
				@Pc(218) int local218 = local33[local28];
				@Pc(823) int local823;
				@Pc(659) int local659;
				@Pc(653) int[] local653;
				@Pc(829) int local829;
				@Pc(610) String local610;
				if (local218 < 100) {
					if (local218 == 0) {
						Static47.anIntArray115[local26++] = local36[local28];
						continue;
					}
					if (local218 == 1) {
						local75 = local36[local28];
						Static47.anIntArray115[local26++] = Static298.anIntArray414[local75];
						continue;
					}
					if (local218 == 2) {
						local75 = local36[local28];
						local26--;
						Static298.method4227(local75, Static47.anIntArray115[local26]);
						continue;
					}
					if (local218 == 3) {
						Static230.aStringArray30[local30++] = local18.aStringArray27[local28];
						continue;
					}
					if (local218 == 6) {
						local28 += local36[local28];
						continue;
					}
					if (local218 == 7) {
						local26 -= 2;
						if (Static47.anIntArray115[local26] != Static47.anIntArray115[local26 + 1]) {
							local28 += local36[local28];
						}
						continue;
					}
					if (local218 == 8) {
						local26 -= 2;
						if (Static47.anIntArray115[local26 + 1] == Static47.anIntArray115[local26]) {
							local28 += local36[local28];
						}
						continue;
					}
					if (local218 == 9) {
						local26 -= 2;
						if (Static47.anIntArray115[local26 + 1] > Static47.anIntArray115[local26]) {
							local28 += local36[local28];
						}
						continue;
					}
					if (local218 == 10) {
						local26 -= 2;
						if (Static47.anIntArray115[local26] > Static47.anIntArray115[local26 + 1]) {
							local28 += local36[local28];
						}
						continue;
					}
					if (local218 == 21) {
						if (Static67.anInt1404 == 0) {
							return;
						}
						@Pc(424) Class115 local424 = Static235.aClass115Array1[--Static67.anInt1404];
						local18 = local424.aClass4_Sub2_Sub16_1;
						Static141.aStringArray16 = local424.aStringArray24;
						local28 = local424.anInt3622;
						local36 = local18.anIntArray337;
						Static19.anIntArray57 = local424.anIntArray303;
						local33 = local18.anIntArray335;
						continue;
					}
					if (local218 == 25) {
						local75 = local36[local28];
						Static47.anIntArray115[local26++] = Static274.method4329(local75);
						continue;
					}
					if (local218 == 27) {
						local75 = local36[local28];
						local26--;
						Static218.method3398(local75, Static47.anIntArray115[local26]);
						continue;
					}
					if (local218 == 31) {
						local26 -= 2;
						if (Static47.anIntArray115[local26] <= Static47.anIntArray115[local26 + 1]) {
							local28 += local36[local28];
						}
						continue;
					}
					if (local218 == 32) {
						local26 -= 2;
						if (Static47.anIntArray115[local26 + 1] <= Static47.anIntArray115[local26]) {
							local28 += local36[local28];
						}
						continue;
					}
					if (local218 == 33) {
						Static47.anIntArray115[local26++] = Static19.anIntArray57[local36[local28]];
						continue;
					}
					@Pc(549) int local549;
					if (local218 == 34) {
						local549 = local36[local28];
						local26--;
						Static19.anIntArray57[local549] = Static47.anIntArray115[local26];
						continue;
					}
					if (local218 == 35) {
						Static230.aStringArray30[local30++] = Static141.aStringArray16[local36[local28]];
						continue;
					}
					if (local218 == 36) {
						local549 = local36[local28];
						local30--;
						Static141.aStringArray16[local549] = Static230.aStringArray30[local30];
						continue;
					}
					if (local218 == 37) {
						local75 = local36[local28];
						local30 -= local75;
						local610 = Static304.method4669(Static230.aStringArray30, local75, local30);
						Static230.aStringArray30[local30++] = local610;
						continue;
					}
					if (local218 == 38) {
						local26--;
						continue;
					}
					if (local218 == 39) {
						local30--;
						continue;
					}
					if (local218 == 40) {
						local75 = local36[local28];
						@Pc(649) Class4_Sub2_Sub16 local649 = Static151.method2388(local75);
						local653 = new int[local649.anInt4042];
						@Pc(657) String[] local657 = new String[local649.anInt4046];
						for (local659 = 0; local659 < local649.anInt4044; local659++) {
							local653[local659] = Static47.anIntArray115[local26 + local659 - local649.anInt4044];
						}
						for (local659 = 0; local659 < local649.anInt4043; local659++) {
							local657[local659] = Static230.aStringArray30[local659 + local30 - local649.anInt4043];
						}
						local26 -= local649.anInt4044;
						local30 -= local649.anInt4043;
						@Pc(720) Class115 local720 = new Class115();
						local720.aStringArray24 = Static141.aStringArray16;
						local720.anIntArray303 = Static19.anIntArray57;
						local720.anInt3622 = local28;
						local720.aClass4_Sub2_Sub16_1 = local18;
						if (Static235.aClass115Array1.length <= Static67.anInt1404) {
							throw new RuntimeException();
						}
						Static235.aClass115Array1[Static67.anInt1404++] = local720;
						local18 = local649;
						local36 = local649.anIntArray337;
						Static19.anIntArray57 = local653;
						local33 = local649.anIntArray335;
						Static141.aStringArray16 = local657;
						local28 = -1;
						continue;
					}
					if (local218 == 42) {
						Static47.anIntArray115[local26++] = Static93.anIntArray268[local36[local28]];
						continue;
					}
					if (local218 == 43) {
						local75 = local36[local28];
						local26--;
						Static93.anIntArray268[local75] = Static47.anIntArray115[local26];
						Static40.method749(local75);
						continue;
					}
					if (local218 == 44) {
						local75 = local36[local28] >> 16;
						local26--;
						local823 = Static47.anIntArray115[local26];
						local829 = local36[local28] & 0xFFFF;
						if (local823 >= 0 && local823 <= 5000) {
							@Pc(842) byte local842 = -1;
							Static44.anIntArray108[local75] = local823;
							if (local829 == 105) {
								local842 = 0;
							}
							local659 = 0;
							while (true) {
								if (local823 <= local659) {
									continue label4462;
								}
								Static169.anIntArrayArray20[local75][local659] = local842;
								local659++;
							}
						}
						throw new RuntimeException();
					}
					if (local218 == 45) {
						local75 = local36[local28];
						local26--;
						local829 = Static47.anIntArray115[local26];
						if (local829 >= 0 && Static44.anIntArray108[local75] > local829) {
							Static47.anIntArray115[local26++] = Static169.anIntArrayArray20[local75][local829];
							continue;
						}
						throw new RuntimeException();
					}
					if (local218 == 46) {
						local75 = local36[local28];
						local26 -= 2;
						local829 = Static47.anIntArray115[local26];
						if (local829 >= 0 && Static44.anIntArray108[local75] > local829) {
							Static169.anIntArrayArray20[local75][local829] = Static47.anIntArray115[local26 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local218 == 47) {
						local183 = Static89.aStringArray9[local36[local28]];
						if (local183 == null) {
							local183 = "null";
						}
						Static230.aStringArray30[local30++] = local183;
						continue;
					}
					if (local218 == 48) {
						local75 = local36[local28];
						local30--;
						Static89.aStringArray9[local75] = Static230.aStringArray30[local30];
						Static138.method2220(local75);
						continue;
					}
					if (local218 == 51) {
						@Pc(1005) Class163 local1005 = local18.aClass163Array1[local36[local28]];
						local26--;
						@Pc(1015) Class4_Sub25 local1015 = (Class4_Sub25) local1005.method4188((long) Static47.anIntArray115[local26]);
						if (local1015 != null) {
							local28 += local1015.anInt3892;
						}
						continue;
					}
				}
				@Pc(1031) boolean local1031;
				if (local36[local28] == 1) {
					local1031 = true;
				} else {
					local1031 = false;
				}
				@Pc(1196) Class97 local1196;
				@Pc(1099) int local1099;
				@Pc(1056) int local1056;
				@Pc(1072) Class97 local1072;
				@Pc(1267) Class97 local1267;
				if (local218 < 300) {
					if (local218 == 100) {
						local26 -= 3;
						local829 = Static47.anIntArray115[local26];
						local1056 = Static47.anIntArray115[local26 + 2];
						local823 = Static47.anIntArray115[local26 + 1];
						if (local823 == 0) {
							throw new RuntimeException();
						}
						local1072 = Static148.method2340(local829);
						if (local1072.aClass97Array1 == null) {
							local1072.aClass97Array1 = new Class97[local1056 + 1];
						}
						if (local1072.aClass97Array1.length <= local1056) {
							@Pc(1097) Class97[] local1097 = new Class97[local1056 + 1];
							for (local1099 = 0; local1099 < local1072.aClass97Array1.length; local1099++) {
								local1097[local1099] = local1072.aClass97Array1[local1099];
							}
							local1072.aClass97Array1 = local1097;
						}
						if (local1056 > 0 && local1072.aClass97Array1[local1056 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1056 - 1));
						}
						@Pc(1153) Class97 local1153 = new Class97();
						local1153.anInt3177 = local823;
						local1153.anInt3165 = local1153.anInt3162 = local1072.anInt3162;
						local1153.aBoolean192 = true;
						local1153.anInt3146 = local1056;
						local1072.aClass97Array1[local1056] = local1153;
						if (local1031) {
							Static238.aClass97_18 = local1153;
						} else {
							Static147.aClass97_13 = local1153;
						}
						Static178.method2927(local1072);
						continue;
					}
					@Pc(1217) Class97 local1217;
					if (local218 == 101) {
						local1196 = local1031 ? Static238.aClass97_18 : Static147.aClass97_13;
						if (local1196.anInt3146 == -1) {
							if (!local1031) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local1217 = Static148.method2340(local1196.anInt3162);
						local1217.aClass97Array1[local1196.anInt3146] = null;
						Static178.method2927(local1217);
						continue;
					}
					if (local218 == 102) {
						local26--;
						local1196 = Static148.method2340(Static47.anIntArray115[local26]);
						local1196.aClass97Array1 = null;
						Static178.method2927(local1196);
						continue;
					}
					if (local218 == 200) {
						local26 -= 2;
						local829 = Static47.anIntArray115[local26];
						local823 = Static47.anIntArray115[local26 + 1];
						local1267 = Static77.method1320(local829, local823);
						if (local1267 != null && local823 != -1) {
							Static47.anIntArray115[local26++] = 1;
							if (local1031) {
								Static238.aClass97_18 = local1267;
							} else {
								Static147.aClass97_13 = local1267;
							}
							continue;
						}
						Static47.anIntArray115[local26++] = 0;
						continue;
					}
					if (local218 == 201) {
						local26--;
						local829 = Static47.anIntArray115[local26];
						local1217 = Static148.method2340(local829);
						if (local1217 == null) {
							Static47.anIntArray115[local26++] = 0;
						} else {
							Static47.anIntArray115[local26++] = 1;
							if (local1031) {
								Static238.aClass97_18 = local1217;
							} else {
								Static147.aClass97_13 = local1217;
							}
						}
						continue;
					}
				} else {
					@Pc(10191) boolean local10191;
					if (local218 < 500) {
						if (local218 == 403) {
							local26 -= 2;
							local829 = Static47.anIntArray115[local26];
							local823 = Static47.anIntArray115[local26 + 1];
							for (local1056 = 0; local1056 < Static116.anIntArray438.length; local1056++) {
								if (local829 == Static116.anIntArray438[local1056]) {
									Static72.aClass13_Sub5_Sub1_1.aClass175_2.method4473(local1056, local823);
									continue label4462;
								}
							}
							local1056 = 0;
							while (true) {
								if (Static16.anIntArray10.length <= local1056) {
									continue label4462;
								}
								if (local829 == Static16.anIntArray10[local1056]) {
									Static72.aClass13_Sub5_Sub1_1.aClass175_2.method4473(local1056, local823);
									continue label4462;
								}
								local1056++;
							}
						}
						if (local218 == 404) {
							local26 -= 2;
							local829 = Static47.anIntArray115[local26];
							local823 = Static47.anIntArray115[local26 + 1];
							Static72.aClass13_Sub5_Sub1_1.aClass175_2.method4478(local823, local829);
							continue;
						}
						if (local218 == 410) {
							local26--;
							local10191 = Static47.anIntArray115[local26] != 0;
							Static72.aClass13_Sub5_Sub1_1.aClass175_2.method4466(local10191);
							continue;
						}
					} else {
						@Pc(1558) boolean local1558;
						if (local218 >= 1000 && local218 < 1100 || local218 >= 2000 && local218 < 2100) {
							if (local218 < 2000) {
								local1196 = local1031 ? Static238.aClass97_18 : Static147.aClass97_13;
							} else {
								local218 -= 1000;
								local26--;
								local1196 = Static148.method2340(Static47.anIntArray115[local26]);
							}
							if (local218 == 1000) {
								local26 -= 4;
								local1196.anInt3117 = Static47.anIntArray115[local26];
								local1196.anInt3116 = Static47.anIntArray115[local26 + 1];
								local823 = Static47.anIntArray115[local26 + 2];
								if (local823 < 0) {
									local823 = 0;
								} else if (local823 > 5) {
									local823 = 5;
								}
								local1056 = Static47.anIntArray115[local26 + 3];
								local1196.aByte9 = (byte) local823;
								if (local1056 < 0) {
									local1056 = 0;
								} else if (local1056 > 5) {
									local1056 = 5;
								}
								local1196.aByte10 = (byte) local1056;
								Static178.method2927(local1196);
								Static20.method2329(local1196);
								if (local1196.anInt3146 == -1) {
									Static224.method3523(local1196.anInt3162);
								}
								continue;
							}
							if (local218 == 1001) {
								local26 -= 4;
								local1196.anInt3147 = Static47.anIntArray115[local26];
								local1196.anInt3151 = Static47.anIntArray115[local26 + 1];
								local1196.anInt3135 = 0;
								local1196.anInt3148 = 0;
								local823 = Static47.anIntArray115[local26 + 2];
								if (local823 < 0) {
									local823 = 0;
								} else if (local823 > 4) {
									local823 = 4;
								}
								local1056 = Static47.anIntArray115[local26 + 3];
								local1196.aByte7 = (byte) local823;
								if (local1056 < 0) {
									local1056 = 0;
								} else if (local1056 > 4) {
									local1056 = 4;
								}
								local1196.aByte8 = (byte) local1056;
								Static178.method2927(local1196);
								Static20.method2329(local1196);
								if (local1196.anInt3177 == 0) {
									Static64.method1168(local1196, false);
								}
								continue;
							}
							if (local218 == 1003) {
								local26--;
								local1558 = Static47.anIntArray115[local26] == 1;
								if (local1196.aBoolean196 != local1558) {
									local1196.aBoolean196 = local1558;
									Static178.method2927(local1196);
								}
								if (local1196.anInt3146 == -1) {
									Static4.method64(local1196.anInt3162);
								}
								continue;
							}
							if (local218 == 1004) {
								local26 -= 2;
								local1196.anInt3203 = Static47.anIntArray115[local26];
								local1196.anInt3115 = Static47.anIntArray115[local26 + 1];
								Static178.method2927(local1196);
								Static20.method2329(local1196);
								if (local1196.anInt3177 == 0) {
									Static64.method1168(local1196, false);
								}
								continue;
							}
							if (local218 == 1005) {
								local26--;
								local1196.aBoolean199 = Static47.anIntArray115[local26] == 1;
								continue;
							}
						} else {
							@Pc(3171) String local3171;
							if (local218 >= 1100 && local218 < 1200 || !(local218 < 2100 || local218 >= 2200)) {
								if (local218 < 2000) {
									local1196 = local1031 ? Static238.aClass97_18 : Static147.aClass97_13;
								} else {
									local218 -= 1000;
									local26--;
									local1196 = Static148.method2340(Static47.anIntArray115[local26]);
								}
								if (local218 == 1100) {
									local26 -= 2;
									local1196.anInt3169 = Static47.anIntArray115[local26];
									if (local1196.anInt3169 > local1196.anInt3141 - local1196.anInt3201) {
										local1196.anInt3169 = local1196.anInt3141 - local1196.anInt3201;
									}
									if (local1196.anInt3169 < 0) {
										local1196.anInt3169 = 0;
									}
									local1196.anInt3199 = Static47.anIntArray115[local26 + 1];
									if (local1196.anInt3180 - local1196.anInt3190 < local1196.anInt3199) {
										local1196.anInt3199 = local1196.anInt3180 - local1196.anInt3190;
									}
									if (local1196.anInt3199 < 0) {
										local1196.anInt3199 = 0;
									}
									Static178.method2927(local1196);
									if (local1196.anInt3146 == -1) {
										Static178.method2928(local1196.anInt3162);
									}
									continue;
								}
								if (local218 == 1101) {
									local26--;
									local1196.anInt3187 = Static47.anIntArray115[local26];
									Static178.method2927(local1196);
									if (local1196.anInt3146 == -1) {
										Static8.method122(local1196.anInt3162);
									}
									continue;
								}
								if (local218 == 1102) {
									local26--;
									local1196.aBoolean197 = Static47.anIntArray115[local26] == 1;
									Static178.method2927(local1196);
									continue;
								}
								if (local218 == 1103) {
									local26--;
									local1196.anInt3170 = Static47.anIntArray115[local26];
									Static178.method2927(local1196);
									continue;
								}
								if (local218 == 1104) {
									local26--;
									local1196.anInt3150 = Static47.anIntArray115[local26];
									Static178.method2927(local1196);
									continue;
								}
								if (local218 == 1105) {
									local26--;
									local1196.anInt3131 = Static47.anIntArray115[local26];
									Static178.method2927(local1196);
									continue;
								}
								if (local218 == 1106) {
									local26--;
									local1196.anInt3192 = Static47.anIntArray115[local26];
									Static178.method2927(local1196);
									continue;
								}
								if (local218 == 1107) {
									local26--;
									local1196.aBoolean205 = Static47.anIntArray115[local26] == 1;
									Static178.method2927(local1196);
									continue;
								}
								if (local218 == 1108) {
									local1196.anInt3125 = 1;
									local26--;
									local1196.anInt3121 = Static47.anIntArray115[local26];
									Static178.method2927(local1196);
									if (local1196.anInt3146 == -1) {
										Static228.method3584(local1196.anInt3162);
									}
									continue;
								}
								if (local218 == 1109) {
									local26 -= 6;
									local1196.anInt3158 = Static47.anIntArray115[local26];
									local1196.anInt3183 = Static47.anIntArray115[local26 + 1];
									local1196.anInt3114 = Static47.anIntArray115[local26 + 2];
									local1196.anInt3143 = Static47.anIntArray115[local26 + 3];
									local1196.anInt3138 = Static47.anIntArray115[local26 + 4];
									local1196.anInt3184 = Static47.anIntArray115[local26 + 5];
									Static178.method2927(local1196);
									if (local1196.anInt3146 == -1) {
										Static264.method4176(local1196.anInt3162);
										Static131.method1206(local1196.anInt3162);
									}
									continue;
								}
								if (local218 == 1110) {
									local26--;
									local823 = Static47.anIntArray115[local26];
									if (local1196.anInt3122 != local823) {
										local1196.anInt3188 = 0;
										local1196.anInt3194 = 0;
										local1196.anInt3122 = local823;
										local1196.anInt3120 = 1;
										Static178.method2927(local1196);
									}
									if (local1196.anInt3146 == -1) {
										Static138.method2221(local1196.anInt3162);
									}
									continue;
								}
								if (local218 == 1111) {
									local26--;
									local1196.aBoolean190 = Static47.anIntArray115[local26] == 1;
									Static178.method2927(local1196);
									continue;
								}
								if (local218 == 1112) {
									local30--;
									local3171 = Static230.aStringArray30[local30];
									if (!local3171.equals(local1196.aString110)) {
										local1196.aString110 = local3171;
										Static178.method2927(local1196);
									}
									if (local1196.anInt3146 == -1) {
										Static245.method3783(local1196.anInt3162);
									}
									continue;
								}
								if (local218 == 1113) {
									local26--;
									local1196.anInt3142 = Static47.anIntArray115[local26];
									Static178.method2927(local1196);
									continue;
								}
								if (local218 == 1114) {
									local26 -= 3;
									local1196.anInt3156 = Static47.anIntArray115[local26];
									local1196.anInt3144 = Static47.anIntArray115[local26 + 1];
									local1196.anInt3176 = Static47.anIntArray115[local26 + 2];
									Static178.method2927(local1196);
									continue;
								}
								if (local218 == 1115) {
									local26--;
									local1196.aBoolean193 = Static47.anIntArray115[local26] == 1;
									Static178.method2927(local1196);
									continue;
								}
								if (local218 == 1116) {
									local26--;
									local1196.anInt3155 = Static47.anIntArray115[local26];
									Static178.method2927(local1196);
									continue;
								}
								if (local218 == 1117) {
									local26--;
									local1196.anInt3185 = Static47.anIntArray115[local26];
									Static178.method2927(local1196);
									continue;
								}
								if (local218 == 1118) {
									local26--;
									local1196.aBoolean202 = Static47.anIntArray115[local26] == 1;
									Static178.method2927(local1196);
									continue;
								}
								if (local218 == 1119) {
									local26--;
									local1196.aBoolean198 = Static47.anIntArray115[local26] == 1;
									Static178.method2927(local1196);
									continue;
								}
								if (local218 == 1120) {
									local26 -= 2;
									local1196.anInt3141 = Static47.anIntArray115[local26];
									local1196.anInt3180 = Static47.anIntArray115[local26 + 1];
									Static178.method2927(local1196);
									if (local1196.anInt3177 == 0) {
										Static64.method1168(local1196, false);
									}
									continue;
								}
								if (local218 == 1121) {
									local26 -= 2;
									local1196.aShort25 = (short) Static47.anIntArray115[local26];
									local1196.aShort24 = (short) Static47.anIntArray115[local26 + 1];
									Static178.method2927(local1196);
									continue;
								}
								if (local218 == 1122) {
									local26--;
									local1196.aBoolean191 = Static47.anIntArray115[local26] == 1;
									Static178.method2927(local1196);
									continue;
								}
								if (local218 == 1123) {
									local26--;
									local1196.anInt3184 = Static47.anIntArray115[local26];
									Static178.method2927(local1196);
									if (local1196.anInt3146 == -1) {
										Static264.method4176(local1196.anInt3162);
									}
									continue;
								}
								if (local218 == 1124) {
									local26--;
									local823 = Static47.anIntArray115[local26];
									local1196.aBoolean200 = local823 == 1;
									Static178.method2927(local1196);
									continue;
								}
							} else if (local218 >= 1200 && local218 < 1300 || local218 >= 2200 && local218 < 2300) {
								if (local218 >= 2000) {
									local218 -= 1000;
									local26--;
									local1196 = Static148.method2340(Static47.anIntArray115[local26]);
								} else {
									local1196 = local1031 ? Static238.aClass97_18 : Static147.aClass97_13;
								}
								Static178.method2927(local1196);
								if (local218 == 1200 || local218 == 1205 || local218 == 1208 || local218 == 1209) {
									local26 -= 2;
									local823 = Static47.anIntArray115[local26];
									local1056 = Static47.anIntArray115[local26 + 1];
									if (local1196.anInt3146 == -1) {
										Static269.method4237(local1196.anInt3162);
										Static264.method4176(local1196.anInt3162);
										Static131.method1206(local1196.anInt3162);
									}
									if (local823 == -1) {
										local1196.anInt3121 = -1;
										local1196.anInt3125 = 1;
										local1196.anInt3163 = -1;
										continue;
									}
									local1196.anInt3202 = local1056;
									local1196.anInt3163 = local823;
									if (local218 == 1208 || local218 == 1209) {
										local1196.aBoolean206 = true;
									} else {
										local1196.aBoolean206 = false;
									}
									@Pc(13810) Class29 local13810 = Static187.method3128(local823);
									local1196.anInt3138 = local13810.anInt1002;
									local1196.anInt3158 = local13810.anInt1020;
									local1196.anInt3143 = local13810.anInt1024;
									local1196.anInt3183 = local13810.anInt1008;
									local1196.anInt3114 = local13810.anInt991;
									if (local218 == 1205) {
										local1196.aBoolean203 = false;
									} else {
										local1196.aBoolean203 = true;
									}
									local1196.anInt3184 = local13810.anInt997;
									if (local1196.anInt3148 > 0) {
										local1196.anInt3184 = local1196.anInt3184 * 32 / local1196.anInt3148;
									} else if (local1196.anInt3147 > 0) {
										local1196.anInt3184 = local1196.anInt3184 * 32 / local1196.anInt3147;
									}
									continue;
								}
								if (local218 == 1201) {
									local1196.anInt3125 = 2;
									local26--;
									local1196.anInt3121 = Static47.anIntArray115[local26];
									if (local1196.anInt3146 == -1) {
										Static228.method3584(local1196.anInt3162);
									}
									continue;
								}
								if (local218 == 1202) {
									local1196.anInt3125 = 3;
									local1196.anInt3121 = Static72.aClass13_Sub5_Sub1_1.aClass175_2.method4475();
									if (local1196.anInt3146 == -1) {
										Static228.method3584(local1196.anInt3162);
									}
									continue;
								}
								if (local218 == 1203) {
									local1196.anInt3125 = 6;
									local26--;
									local1196.anInt3121 = Static47.anIntArray115[local26];
									if (local1196.anInt3146 == -1) {
										Static228.method3584(local1196.anInt3162);
									}
									continue;
								}
								if (local218 == 1204) {
									local1196.anInt3125 = 5;
									local26--;
									local1196.anInt3121 = Static47.anIntArray115[local26];
									if (local1196.anInt3146 == -1) {
										Static228.method3584(local1196.anInt3162);
									}
									continue;
								}
								if (local218 == 1206) {
									local26 -= 4;
									local1196.anInt3137 = Static47.anIntArray115[local26];
									local1196.anInt3167 = Static47.anIntArray115[local26 + 1];
									local1196.anInt3196 = Static47.anIntArray115[local26 + 2];
									local1196.anInt3195 = Static47.anIntArray115[local26 + 3];
									Static178.method2927(local1196);
									continue;
								}
								if (local218 == 1207) {
									local26 -= 2;
									local1196.anInt3204 = Static47.anIntArray115[local26];
									local1196.anInt3178 = Static47.anIntArray115[local26 + 1];
									Static178.method2927(local1196);
									continue;
								}
							} else if (local218 >= 1300 && local218 < 1400 || local218 >= 2300 && local218 < 2400) {
								if (local218 < 2000) {
									local1196 = local1031 ? Static238.aClass97_18 : Static147.aClass97_13;
								} else {
									local218 -= 1000;
									local26--;
									local1196 = Static148.method2340(Static47.anIntArray115[local26]);
								}
								if (local218 == 1300) {
									local26--;
									local823 = Static47.anIntArray115[local26] - 1;
									if (local823 >= 0 && local823 <= 9) {
										local30--;
										local1196.method2521(Static230.aStringArray30[local30], local823);
										continue;
									}
									local30--;
									continue;
								}
								if (local218 == 1301) {
									local26 -= 2;
									local823 = Static47.anIntArray115[local26];
									local1056 = Static47.anIntArray115[local26 + 1];
									local1196.aClass97_14 = Static77.method1320(local823, local1056);
									continue;
								}
								if (local218 == 1302) {
									local26--;
									local1196.aBoolean195 = Static47.anIntArray115[local26] == 1;
									continue;
								}
								if (local218 == 1303) {
									local26--;
									local1196.anInt3118 = Static47.anIntArray115[local26];
									continue;
								}
								if (local218 == 1304) {
									local26--;
									local1196.anInt3186 = Static47.anIntArray115[local26];
									continue;
								}
								if (local218 == 1305) {
									local30--;
									local1196.aString109 = Static230.aStringArray30[local30];
									continue;
								}
								if (local218 == 1306) {
									local30--;
									local1196.aString107 = Static230.aStringArray30[local30];
									continue;
								}
								if (local218 == 1307) {
									local1196.aStringArray19 = null;
									continue;
								}
								if (local218 == 1308) {
									local26--;
									local1196.anInt3129 = Static47.anIntArray115[local26];
									local26--;
									local1196.anInt3164 = Static47.anIntArray115[local26];
									continue;
								}
								if (local218 == 1309) {
									local26--;
									local823 = Static47.anIntArray115[local26];
									local26--;
									local1056 = Static47.anIntArray115[local26];
									if (local1056 >= 1 && local1056 <= 10) {
										local1196.method2525(local823, local1056 - 1);
									}
									continue;
								}
								if (local218 == 1310) {
									local30--;
									local1196.aString106 = Static230.aStringArray30[local30];
									continue;
								}
							} else {
								@Pc(3279) int[] local3279;
								@Pc(3884) int local3884;
								if (local218 >= 1400 && local218 < 1500 || local218 >= 2400 && local218 < 2500) {
									if (local218 >= 2000) {
										local26--;
										local1196 = Static148.method2340(Static47.anIntArray115[local26]);
										local218 -= 1000;
									} else {
										local1196 = local1031 ? Static238.aClass97_18 : Static147.aClass97_13;
									}
									local30--;
									local3171 = Static230.aStringArray30[local30];
									local3279 = null;
									if (local3171.length() > 0 && local3171.charAt(local3171.length() - 1) == 'Y') {
										local26--;
										local659 = Static47.anIntArray115[local26];
										if (local659 > 0) {
											local3279 = new int[local659];
											while (local659-- > 0) {
												local26--;
												local3279[local659] = Static47.anIntArray115[local26];
											}
										}
										local3171 = local3171.substring(0, local3171.length() - 1);
									}
									@Pc(13142) Object[] local13142 = new Object[local3171.length() + 1];
									for (local3884 = local13142.length - 1; local3884 >= 1; local3884--) {
										if (local3171.charAt(local3884 - 1) == 's') {
											local30--;
											local13142[local3884] = Static230.aStringArray30[local30];
										} else {
											local26--;
											local13142[local3884] = Integer.valueOf(Static47.anIntArray115[local26]);
										}
									}
									local26--;
									local3884 = Static47.anIntArray115[local26];
									if (local3884 == -1) {
										local13142 = null;
									} else {
										local13142[0] = Integer.valueOf(local3884);
									}
									if (local218 == 1400) {
										local1196.anObjectArray30 = local13142;
									} else if (local218 == 1401) {
										local1196.anObjectArray12 = local13142;
									} else if (local218 == 1402) {
										local1196.anObjectArray7 = local13142;
									} else if (local218 == 1403) {
										local1196.anObjectArray17 = local13142;
									} else if (local218 == 1404) {
										local1196.anObjectArray8 = local13142;
									} else if (local218 == 1405) {
										local1196.anObjectArray26 = local13142;
									} else if (local218 == 1406) {
										local1196.anObjectArray10 = local13142;
									} else if (local218 == 1407) {
										local1196.anIntArray251 = local3279;
										local1196.anObjectArray22 = local13142;
									} else if (local218 == 1408) {
										local1196.anObjectArray21 = local13142;
									} else if (local218 == 1409) {
										local1196.anObjectArray6 = local13142;
									} else if (local218 == 1410) {
										local1196.anObjectArray29 = local13142;
									} else if (local218 == 1411) {
										local1196.anObjectArray25 = local13142;
									} else if (local218 == 1412) {
										local1196.anObjectArray2 = local13142;
									} else if (local218 == 1414) {
										local1196.anIntArray261 = local3279;
										local1196.anObjectArray23 = local13142;
									} else if (local218 == 1415) {
										local1196.anObjectArray24 = local13142;
										local1196.anIntArray248 = local3279;
									} else if (local218 == 1416) {
										local1196.anObjectArray16 = local13142;
									} else if (local218 == 1417) {
										local1196.anObjectArray3 = local13142;
									} else if (local218 == 1418) {
										local1196.anObjectArray19 = local13142;
									} else if (local218 == 1419) {
										local1196.anObjectArray13 = local13142;
									} else if (local218 == 1420) {
										local1196.anObjectArray9 = local13142;
									} else if (local218 == 1421) {
										local1196.anObjectArray18 = local13142;
									} else if (local218 == 1422) {
										local1196.anObjectArray31 = local13142;
									} else if (local218 == 1423) {
										local1196.anObjectArray4 = local13142;
									} else if (local218 == 1424) {
										local1196.anObjectArray28 = local13142;
									} else if (local218 == 1425) {
										local1196.anObjectArray14 = local13142;
									} else if (local218 == 1426) {
										local1196.anObjectArray20 = local13142;
									} else if (local218 == 1427) {
										local1196.anObjectArray11 = local13142;
									} else if (local218 == 1428) {
										local1196.anObjectArray27 = local13142;
										local1196.anIntArray252 = local3279;
									} else if (local218 == 1429) {
										local1196.anIntArray255 = local3279;
										local1196.anObjectArray15 = local13142;
									}
									local1196.aBoolean194 = true;
									continue;
								}
								if (local218 < 1600) {
									local1196 = local1031 ? Static238.aClass97_18 : Static147.aClass97_13;
									if (local218 == 1500) {
										Static47.anIntArray115[local26++] = local1196.anInt3160;
										continue;
									}
									if (local218 == 1501) {
										Static47.anIntArray115[local26++] = local1196.anInt3152;
										continue;
									}
									if (local218 == 1502) {
										Static47.anIntArray115[local26++] = local1196.anInt3201;
										continue;
									}
									if (local218 == 1503) {
										Static47.anIntArray115[local26++] = local1196.anInt3190;
										continue;
									}
									if (local218 == 1504) {
										Static47.anIntArray115[local26++] = local1196.aBoolean196 ? 1 : 0;
										continue;
									}
									if (local218 == 1505) {
										Static47.anIntArray115[local26++] = local1196.anInt3165;
										continue;
									}
								} else if (local218 < 1700) {
									local1196 = local1031 ? Static238.aClass97_18 : Static147.aClass97_13;
									if (local218 == 1600) {
										Static47.anIntArray115[local26++] = local1196.anInt3169;
										continue;
									}
									if (local218 == 1601) {
										Static47.anIntArray115[local26++] = local1196.anInt3199;
										continue;
									}
									if (local218 == 1602) {
										Static230.aStringArray30[local30++] = local1196.aString110;
										continue;
									}
									if (local218 == 1603) {
										Static47.anIntArray115[local26++] = local1196.anInt3141;
										continue;
									}
									if (local218 == 1604) {
										Static47.anIntArray115[local26++] = local1196.anInt3180;
										continue;
									}
									if (local218 == 1605) {
										Static47.anIntArray115[local26++] = local1196.anInt3184;
										continue;
									}
									if (local218 == 1606) {
										Static47.anIntArray115[local26++] = local1196.anInt3114;
										continue;
									}
									if (local218 == 1607) {
										Static47.anIntArray115[local26++] = local1196.anInt3138;
										continue;
									}
									if (local218 == 1608) {
										Static47.anIntArray115[local26++] = local1196.anInt3143;
										continue;
									}
									if (local218 == 1609) {
										Static47.anIntArray115[local26++] = local1196.anInt3170;
										continue;
									}
									if (local218 == 1610) {
										Static47.anIntArray115[local26++] = local1196.anInt3158;
										continue;
									}
									if (local218 == 1611) {
										Static47.anIntArray115[local26++] = local1196.anInt3183;
										continue;
									}
									if (local218 == 1612) {
										Static47.anIntArray115[local26++] = local1196.anInt3131;
										continue;
									}
								} else if (local218 < 1800) {
									local1196 = local1031 ? Static238.aClass97_18 : Static147.aClass97_13;
									if (local218 == 1700) {
										Static47.anIntArray115[local26++] = local1196.anInt3163;
										continue;
									}
									if (local218 == 1701) {
										if (local1196.anInt3163 == -1) {
											Static47.anIntArray115[local26++] = 0;
										} else {
											Static47.anIntArray115[local26++] = local1196.anInt3202;
										}
										continue;
									}
									if (local218 == 1702) {
										Static47.anIntArray115[local26++] = local1196.anInt3146;
										continue;
									}
								} else if (local218 < 1900) {
									local1196 = local1031 ? Static238.aClass97_18 : Static147.aClass97_13;
									if (local218 == 1800) {
										Static47.anIntArray115[local26++] = Static41.method791(local1196).method2577();
										continue;
									}
									if (local218 == 1801) {
										local26--;
										local823 = Static47.anIntArray115[local26];
										local823--;
										if (local1196.aStringArray19 != null && local823 < local1196.aStringArray19.length && local1196.aStringArray19[local823] != null) {
											Static230.aStringArray30[local30++] = local1196.aStringArray19[local823];
											continue;
										}
										Static230.aStringArray30[local30++] = "";
										continue;
									}
									if (local218 == 1802) {
										if (local1196.aString109 == null) {
											Static230.aStringArray30[local30++] = "";
										} else {
											Static230.aStringArray30[local30++] = local1196.aString109;
										}
										continue;
									}
								} else if (local218 < 2600) {
									local26--;
									local1196 = Static148.method2340(Static47.anIntArray115[local26]);
									if (local218 == 2500) {
										Static47.anIntArray115[local26++] = local1196.anInt3160;
										continue;
									}
									if (local218 == 2501) {
										Static47.anIntArray115[local26++] = local1196.anInt3152;
										continue;
									}
									if (local218 == 2502) {
										Static47.anIntArray115[local26++] = local1196.anInt3201;
										continue;
									}
									if (local218 == 2503) {
										Static47.anIntArray115[local26++] = local1196.anInt3190;
										continue;
									}
									if (local218 == 2504) {
										Static47.anIntArray115[local26++] = local1196.aBoolean196 ? 1 : 0;
										continue;
									}
									if (local218 == 2505) {
										Static47.anIntArray115[local26++] = local1196.anInt3165;
										continue;
									}
								} else if (local218 < 2700) {
									local26--;
									local1196 = Static148.method2340(Static47.anIntArray115[local26]);
									if (local218 == 2600) {
										Static47.anIntArray115[local26++] = local1196.anInt3169;
										continue;
									}
									if (local218 == 2601) {
										Static47.anIntArray115[local26++] = local1196.anInt3199;
										continue;
									}
									if (local218 == 2602) {
										Static230.aStringArray30[local30++] = local1196.aString110;
										continue;
									}
									if (local218 == 2603) {
										Static47.anIntArray115[local26++] = local1196.anInt3141;
										continue;
									}
									if (local218 == 2604) {
										Static47.anIntArray115[local26++] = local1196.anInt3180;
										continue;
									}
									if (local218 == 2605) {
										Static47.anIntArray115[local26++] = local1196.anInt3184;
										continue;
									}
									if (local218 == 2606) {
										Static47.anIntArray115[local26++] = local1196.anInt3114;
										continue;
									}
									if (local218 == 2607) {
										Static47.anIntArray115[local26++] = local1196.anInt3138;
										continue;
									}
									if (local218 == 2608) {
										Static47.anIntArray115[local26++] = local1196.anInt3143;
										continue;
									}
									if (local218 == 2609) {
										Static47.anIntArray115[local26++] = local1196.anInt3170;
										continue;
									}
									if (local218 == 2610) {
										Static47.anIntArray115[local26++] = local1196.anInt3158;
										continue;
									}
									if (local218 == 2611) {
										Static47.anIntArray115[local26++] = local1196.anInt3183;
										continue;
									}
									if (local218 == 2612) {
										Static47.anIntArray115[local26++] = local1196.anInt3131;
										continue;
									}
								} else if (local218 < 2800) {
									if (local218 == 2700) {
										local26--;
										local1196 = Static148.method2340(Static47.anIntArray115[local26]);
										Static47.anIntArray115[local26++] = local1196.anInt3163;
										continue;
									}
									if (local218 == 2701) {
										local26--;
										local1196 = Static148.method2340(Static47.anIntArray115[local26]);
										if (local1196.anInt3163 == -1) {
											Static47.anIntArray115[local26++] = 0;
										} else {
											Static47.anIntArray115[local26++] = local1196.anInt3202;
										}
										continue;
									}
									if (local218 == 2702) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										@Pc(12857) Class4_Sub30 local12857 = (Class4_Sub30) Static167.aClass163_25.method4188((long) local829);
										if (local12857 == null) {
											Static47.anIntArray115[local26++] = 0;
										} else {
											Static47.anIntArray115[local26++] = 1;
										}
										continue;
									}
									if (local218 == 2703) {
										local26--;
										local1196 = Static148.method2340(Static47.anIntArray115[local26]);
										if (local1196.aClass97Array1 == null) {
											Static47.anIntArray115[local26++] = 0;
											continue;
										}
										local823 = local1196.aClass97Array1.length;
										for (local1056 = 0; local1056 < local1196.aClass97Array1.length; local1056++) {
											if (local1196.aClass97Array1[local1056] == null) {
												local823 = local1056;
												break;
											}
										}
										Static47.anIntArray115[local26++] = local823;
										continue;
									}
									if (local218 == 2704 || local218 == 2705) {
										local26 -= 2;
										local829 = Static47.anIntArray115[local26];
										local823 = Static47.anIntArray115[local26 + 1];
										@Pc(12951) Class4_Sub30 local12951 = (Class4_Sub30) Static167.aClass163_25.method4188((long) local829);
										if (local12951 != null && local12951.anInt5208 == local823) {
											Static47.anIntArray115[local26++] = 1;
											continue;
										}
										Static47.anIntArray115[local26++] = 0;
										continue;
									}
								} else if (local218 < 2900) {
									local26--;
									local1196 = Static148.method2340(Static47.anIntArray115[local26]);
									if (local218 == 2800) {
										Static47.anIntArray115[local26++] = Static41.method791(local1196).method2577();
										continue;
									}
									if (local218 == 2801) {
										local26--;
										local823 = Static47.anIntArray115[local26];
										local823--;
										if (local1196.aStringArray19 != null && local1196.aStringArray19.length > local823 && local1196.aStringArray19[local823] != null) {
											Static230.aStringArray30[local30++] = local1196.aStringArray19[local823];
											continue;
										}
										Static230.aStringArray30[local30++] = "";
										continue;
									}
									if (local218 == 2802) {
										if (local1196.aString109 == null) {
											Static230.aStringArray30[local30++] = "";
										} else {
											Static230.aStringArray30[local30++] = local1196.aString109;
										}
										continue;
									}
								} else if (local218 < 3200) {
									if (local218 == 3100) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										Static173.method2811(0, local610, "");
										continue;
									}
									if (local218 == 3101) {
										local26 -= 2;
										Static13.method240(Static72.aClass13_Sub5_Sub1_1, Static47.anIntArray115[local26 + 1], Static47.anIntArray115[local26]);
										continue;
									}
									if (local218 == 3103) {
										Static32.method641();
										continue;
									}
									if (local218 == 3104) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										local823 = 0;
										if (Static177.method2914(local610)) {
											local823 = Static113.method1907(local610);
										}
										Static175.aClass4_Sub24_Sub1_1.method3123(34);
										Static175.aClass4_Sub24_Sub1_1.method3066(local823);
										continue;
									}
									if (local218 == 3105) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										Static175.aClass4_Sub24_Sub1_1.method3123(27);
										Static175.aClass4_Sub24_Sub1_1.method3079(Static193.method3171(local610));
										continue;
									}
									if (local218 == 3106) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										Static175.aClass4_Sub24_Sub1_1.method3123(136);
										Static175.aClass4_Sub24_Sub1_1.method3116(local610.length() + 1);
										Static175.aClass4_Sub24_Sub1_1.method3095(local610);
										continue;
									}
									if (local218 == 3107) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										local30--;
										local3171 = Static230.aStringArray30[local30];
										Static152.method2442(local3171, local829);
										continue;
									}
									if (local218 == 3108) {
										local26 -= 3;
										local829 = Static47.anIntArray115[local26];
										local823 = Static47.anIntArray115[local26 + 1];
										local1056 = Static47.anIntArray115[local26 + 2];
										local1072 = Static148.method2340(local1056);
										Static152.method2448(local823, local829, local1072);
										continue;
									}
									if (local218 == 3109) {
										local26 -= 2;
										local829 = Static47.anIntArray115[local26];
										local1267 = local1031 ? Static238.aClass97_18 : Static147.aClass97_13;
										local823 = Static47.anIntArray115[local26 + 1];
										Static152.method2448(local823, local829, local1267);
										continue;
									}
									if (local218 == 3110) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static175.aClass4_Sub24_Sub1_1.method3123(51);
										Static175.aClass4_Sub24_Sub1_1.method3105(local829);
										continue;
									}
								} else if (local218 < 3300) {
									if (local218 == 3200) {
										local26 -= 3;
										Static288.method4505(255, Static47.anIntArray115[local26], Static47.anIntArray115[local26 + 2], Static47.anIntArray115[local26 + 1]);
										continue;
									}
									if (local218 == 3201) {
										local26--;
										Static161.method2603(255, Static47.anIntArray115[local26]);
										continue;
									}
									if (local218 == 3202) {
										local26 -= 2;
										Static44.method830(Static47.anIntArray115[local26], 255, Static47.anIntArray115[local26 + 1]);
										continue;
									}
								} else if (local218 < 3400) {
									if (local218 == 3300) {
										Static47.anIntArray115[local26++] = Static50.anInt1118;
										continue;
									}
									if (local218 == 3301) {
										local26 -= 2;
										local823 = Static47.anIntArray115[local26 + 1];
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Static292.method4554(local829, local823);
										continue;
									}
									if (local218 == 3302) {
										local26 -= 2;
										local829 = Static47.anIntArray115[local26];
										local823 = Static47.anIntArray115[local26 + 1];
										Static47.anIntArray115[local26++] = Static79.method1362(local829, local823);
										continue;
									}
									if (local218 == 3303) {
										local26 -= 2;
										local829 = Static47.anIntArray115[local26];
										local823 = Static47.anIntArray115[local26 + 1];
										Static47.anIntArray115[local26++] = Static178.method2922(local829, local823);
										continue;
									}
									if (local218 == 3304) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Static199.method2421(local829).anInt2969;
										continue;
									}
									if (local218 == 3305) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Static214.anIntArray446[local829];
										continue;
									}
									if (local218 == 3306) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Static80.anIntArray145[local829];
										continue;
									}
									if (local218 == 3307) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Static179.anIntArray302[local829];
										continue;
									}
									if (local218 == 3308) {
										local829 = Static222.anInt4467;
										local1056 = Static105.anInt2105 + (Static72.aClass13_Sub5_Sub1_1.anInt5294 >> 7);
										local823 = Static269.anInt5357 + (Static72.aClass13_Sub5_Sub1_1.anInt5334 >> 7);
										Static47.anIntArray115[local26++] = local1056 + (local823 << 14) + (local829 << 28);
										continue;
									}
									if (local218 == 3309) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = local829 >> 14 & 0x3FFF;
										continue;
									}
									if (local218 == 3310) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = local829 >> 28;
										continue;
									}
									if (local218 == 3311) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = local829 & 0x3FFF;
										continue;
									}
									if (local218 == 3312) {
										Static47.anIntArray115[local26++] = Static84.aBoolean101 ? 1 : 0;
										continue;
									}
									if (local218 == 3313) {
										local26 -= 2;
										local829 = Static47.anIntArray115[local26] + 32768;
										local823 = Static47.anIntArray115[local26 + 1];
										Static47.anIntArray115[local26++] = Static292.method4554(local829, local823);
										continue;
									}
									if (local218 == 3314) {
										local26 -= 2;
										local829 = Static47.anIntArray115[local26] + 32768;
										local823 = Static47.anIntArray115[local26 + 1];
										Static47.anIntArray115[local26++] = Static79.method1362(local829, local823);
										continue;
									}
									if (local218 == 3315) {
										local26 -= 2;
										local829 = Static47.anIntArray115[local26] + 32768;
										local823 = Static47.anIntArray115[local26 + 1];
										Static47.anIntArray115[local26++] = Static178.method2922(local829, local823);
										continue;
									}
									if (local218 == 3316) {
										if (Static191.anInt3873 < 2) {
											Static47.anIntArray115[local26++] = 0;
										} else {
											Static47.anIntArray115[local26++] = Static191.anInt3873;
										}
										continue;
									}
									if (local218 == 3317) {
										Static47.anIntArray115[local26++] = Static218.anInt4197;
										continue;
									}
									if (local218 == 3318) {
										Static47.anIntArray115[local26++] = Static250.anInt4906;
										continue;
									}
									if (local218 == 3321) {
										Static47.anIntArray115[local26++] = Static199.anInt2994;
										continue;
									}
									if (local218 == 3322) {
										Static47.anIntArray115[local26++] = Static57.anInt1270;
										continue;
									}
									if (local218 == 3323) {
										if (Static187.anInt3850 >= 5 && Static187.anInt3850 <= 9) {
											Static47.anIntArray115[local26++] = 1;
											continue;
										}
										Static47.anIntArray115[local26++] = 0;
										continue;
									}
									if (local218 == 3324) {
										if (Static187.anInt3850 >= 5 && Static187.anInt3850 <= 9) {
											Static47.anIntArray115[local26++] = Static187.anInt3850;
											continue;
										}
										Static47.anIntArray115[local26++] = 0;
										continue;
									}
									if (local218 == 3325) {
										Static47.anIntArray115[local26++] = Static194.aBoolean243 ? 1 : 0;
										continue;
									}
									if (local218 == 3326) {
										Static47.anIntArray115[local26++] = Static72.aClass13_Sub5_Sub1_1.anInt4452;
										continue;
									}
									if (local218 == 3327) {
										Static47.anIntArray115[local26++] = Static72.aClass13_Sub5_Sub1_1.aClass175_2.aBoolean383 ? 1 : 0;
										continue;
									}
									if (local218 == 3328) {
										Static47.anIntArray115[local26++] = Static243.aBoolean299 && !Static29.aBoolean47 ? 1 : 0;
										continue;
									}
									if (local218 == 3329) {
										Static47.anIntArray115[local26++] = Static106.aBoolean122 ? 1 : 0;
										continue;
									}
									if (local218 == 3330) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Static243.method3739(local829);
										continue;
									}
									if (local218 == 3331) {
										local26 -= 2;
										local829 = Static47.anIntArray115[local26];
										local823 = Static47.anIntArray115[local26 + 1];
										Static47.anIntArray115[local26++] = Static94.method1561(local829, local823, false);
										continue;
									}
									if (local218 == 3332) {
										local26 -= 2;
										local823 = Static47.anIntArray115[local26 + 1];
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Static94.method1561(local829, local823, true);
										continue;
									}
									if (local218 == 3333) {
										Static47.anIntArray115[local26++] = Static221.anInt4249;
										continue;
									}
									if (local218 == 3335) {
										Static47.anIntArray115[local26++] = Static187.anInt3840;
										continue;
									}
									if (local218 == 3336) {
										local26 -= 4;
										local823 = Static47.anIntArray115[local26 + 1];
										local829 = Static47.anIntArray115[local26];
										local659 = Static47.anIntArray115[local26 + 3];
										local829 += local823 << 14;
										local1056 = Static47.anIntArray115[local26 + 2];
										local829 += local1056 << 28;
										local829 += local659;
										Static47.anIntArray115[local26++] = local829;
										continue;
									}
									if (local218 == 3337) {
										Static47.anIntArray115[local26++] = Static212.anInt4120;
										continue;
									}
								} else if (local218 < 3500) {
									@Pc(11613) Class4_Sub2_Sub2 local11613;
									if (local218 == 3400) {
										local26 -= 2;
										local829 = Static47.anIntArray115[local26];
										local823 = Static47.anIntArray115[local26 + 1];
										local11613 = Static160.method2583(local829);
										if (local11613.aChar1 != 's') {
										}
										Static230.aStringArray30[local30++] = local11613.method307(local823);
										continue;
									}
									if (local218 == 3408) {
										local26 -= 4;
										local1056 = Static47.anIntArray115[local26 + 2];
										local829 = Static47.anIntArray115[local26];
										local823 = Static47.anIntArray115[local26 + 1];
										local659 = Static47.anIntArray115[local26 + 3];
										@Pc(11660) Class4_Sub2_Sub2 local11660 = Static160.method2583(local1056);
										if (local11660.aChar2 == local829 && local823 == local11660.aChar1) {
											if (local823 == 115) {
												Static230.aStringArray30[local30++] = local11660.method307(local659);
											} else {
												Static47.anIntArray115[local26++] = local11660.method303(local659);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local218 == 3409) {
										local26 -= 3;
										local1056 = Static47.anIntArray115[local26 + 2];
										local823 = Static47.anIntArray115[local26 + 1];
										local829 = Static47.anIntArray115[local26];
										if (local823 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(11741) Class4_Sub2_Sub2 local11741 = Static160.method2583(local823);
										if (local11741.aChar1 != local829) {
											throw new RuntimeException("C3409-1");
										}
										Static47.anIntArray115[local26++] = local11741.method309(local1056) ? 1 : 0;
										continue;
									}
									if (local218 == 3410) {
										local30--;
										local3171 = Static230.aStringArray30[local30];
										local26--;
										local829 = Static47.anIntArray115[local26];
										if (local829 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local11613 = Static160.method2583(local829);
										if (local11613.aChar1 != 's') {
											throw new RuntimeException("C3410-1");
										}
										Static47.anIntArray115[local26++] = local11613.method310(local3171) ? 1 : 0;
										continue;
									}
									if (local218 == 3411) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										@Pc(11834) Class4_Sub2_Sub2 local11834 = Static160.method2583(local829);
										Static47.anIntArray115[local26++] = local11834.aClass163_3.method4179();
										continue;
									}
								} else if (local218 < 3700) {
									if (local218 == 3600) {
										if (Static175.anInt3548 == 0) {
											Static47.anIntArray115[local26++] = -2;
										} else if (Static175.anInt3548 == 1) {
											Static47.anIntArray115[local26++] = -1;
										} else {
											Static47.anIntArray115[local26++] = Static149.anInt2911;
										}
										continue;
									}
									if (local218 == 3601) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										if (Static175.anInt3548 == 2 && local829 < Static149.anInt2911) {
											Static230.aStringArray30[local30++] = Static135.aStringArray15[local829];
											continue;
										}
										Static230.aStringArray30[local30++] = "";
										continue;
									}
									if (local218 == 3602) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										if (Static175.anInt3548 == 2 && Static149.anInt2911 > local829) {
											Static47.anIntArray115[local26++] = Static73.anIntArray139[local829];
											continue;
										}
										Static47.anIntArray115[local26++] = 0;
										continue;
									}
									if (local218 == 3603) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										if (Static175.anInt3548 == 2 && Static149.anInt2911 > local829) {
											Static47.anIntArray115[local26++] = Static133.anIntArray225[local829];
											continue;
										}
										Static47.anIntArray115[local26++] = 0;
										continue;
									}
									if (local218 == 3604) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										local26--;
										local823 = Static47.anIntArray115[local26];
										Static216.method3385(local610, local823);
										continue;
									}
									if (local218 == 3605) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										Static136.method2193(Static193.method3171(local610));
										continue;
									}
									if (local218 == 3606) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										Static155.method2533(Static193.method3171(local610));
										continue;
									}
									if (local218 == 3607) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										Static224.method3525(Static193.method3171(local610), false);
										continue;
									}
									if (local218 == 3608) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										Static134.method2177(Static193.method3171(local610));
										continue;
									}
									if (local218 == 3609) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										if (local610.startsWith("<img=0>") || local610.startsWith("<img=1>")) {
											local610 = local610.substring(7);
										}
										Static47.anIntArray115[local26++] = Static293.method4562(local610) ? 1 : 0;
										continue;
									}
									if (local218 == 3610) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										if (Static175.anInt3548 == 2 && local829 < Static149.anInt2911) {
											Static230.aStringArray30[local30++] = Static71.aStringArray8[local829];
											continue;
										}
										Static230.aStringArray30[local30++] = "";
										continue;
									}
									if (local218 == 3611) {
										if (Static123.aString87 == null) {
											Static230.aStringArray30[local30++] = "";
										} else {
											Static230.aStringArray30[local30++] = Static198.method3235(Static123.aString87);
										}
										continue;
									}
									if (local218 == 3612) {
										if (Static123.aString87 == null) {
											Static47.anIntArray115[local26++] = 0;
										} else {
											Static47.anIntArray115[local26++] = Static244.anInt4812;
										}
										continue;
									}
									if (local218 == 3613) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										if (Static123.aString87 != null && local829 < Static244.anInt4812) {
											Static230.aStringArray30[local30++] = Static198.method3235(Static168.aClass4_Sub12Array1[local829].aString56);
											continue;
										}
										Static230.aStringArray30[local30++] = "";
										continue;
									}
									if (local218 == 3614) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										if (Static123.aString87 != null && local829 < Static244.anInt4812) {
											Static47.anIntArray115[local26++] = Static168.aClass4_Sub12Array1[local829].anInt1455;
											continue;
										}
										Static47.anIntArray115[local26++] = 0;
										continue;
									}
									if (local218 == 3615) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										if (Static123.aString87 != null && Static244.anInt4812 > local829) {
											Static47.anIntArray115[local26++] = Static168.aClass4_Sub12Array1[local829].aByte2;
											continue;
										}
										Static47.anIntArray115[local26++] = 0;
										continue;
									}
									if (local218 == 3616) {
										Static47.anIntArray115[local26++] = Static224.aByte16;
										continue;
									}
									if (local218 == 3617) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										Static250.method3848(local610);
										continue;
									}
									if (local218 == 3618) {
										Static47.anIntArray115[local26++] = Static212.aByte14;
										continue;
									}
									if (local218 == 3619) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										Static209.method3296(Static193.method3171(local610));
										continue;
									}
									if (local218 == 3620) {
										Static109.method1851();
										continue;
									}
									if (local218 == 3621) {
										if (Static175.anInt3548 == 0) {
											Static47.anIntArray115[local26++] = -1;
										} else {
											Static47.anIntArray115[local26++] = Static15.anInt334;
										}
										continue;
									}
									if (local218 == 3622) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										if (Static175.anInt3548 != 0 && Static15.anInt334 > local829) {
											Static230.aStringArray30[local30++] = Static94.method1558(Static229.aLongArray8[local829]);
											continue;
										}
										Static230.aStringArray30[local30++] = "";
										continue;
									}
									if (local218 == 3623) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										if (local610.startsWith("<img=0>") || local610.startsWith("<img=1>")) {
											local610 = local610.substring(7);
										}
										Static47.anIntArray115[local26++] = Static286.method4477(local610) ? 1 : 0;
										continue;
									}
									if (local218 == 3624) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										if (Static168.aClass4_Sub12Array1 != null && local829 < Static244.anInt4812 && Static168.aClass4_Sub12Array1[local829].aString56.equalsIgnoreCase(Static72.aClass13_Sub5_Sub1_1.aString148)) {
											Static47.anIntArray115[local26++] = 1;
											continue;
										}
										Static47.anIntArray115[local26++] = 0;
										continue;
									}
									if (local218 == 3625) {
										if (Static92.aString70 == null) {
											Static230.aStringArray30[local30++] = "";
										} else {
											Static230.aStringArray30[local30++] = Static198.method3235(Static92.aString70);
										}
										continue;
									}
									if (local218 == 3626) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										if (Static123.aString87 != null && local829 < Static244.anInt4812) {
											Static230.aStringArray30[local30++] = Static168.aClass4_Sub12Array1[local829].aString54;
											continue;
										}
										Static230.aStringArray30[local30++] = "";
										continue;
									}
									if (local218 == 3627) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										if (Static175.anInt3548 == 2 && local829 >= 0 && local829 < Static149.anInt2911) {
											Static47.anIntArray115[local26++] = Static39.aBooleanArray13[local829] ? 1 : 0;
											continue;
										}
										Static47.anIntArray115[local26++] = 0;
										continue;
									}
									if (local218 == 3628) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										if (local610.startsWith("<img=0>") || local610.startsWith("<img=1>")) {
											local610 = local610.substring(7);
										}
										Static47.anIntArray115[local26++] = Static308.method4717(local610);
										continue;
									}
									if (local218 == 3629) {
										Static47.anIntArray115[local26++] = Static10.anInt248;
										continue;
									}
									if (local218 == 3630) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										Static224.method3525(Static193.method3171(local610), true);
										continue;
									}
									if (local218 == 3631) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Static151.aBooleanArray23[local829] ? 1 : 0;
										continue;
									}
								} else if (local218 < 4000) {
									if (local218 == 3903) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Static179.aClass80Array1[local829].method2011();
										continue;
									}
									if (local218 == 3904) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Static179.aClass80Array1[local829].anInt2466;
										continue;
									}
									if (local218 == 3905) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Static179.aClass80Array1[local829].anInt2468;
										continue;
									}
									if (local218 == 3906) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Static179.aClass80Array1[local829].anInt2469;
										continue;
									}
									if (local218 == 3907) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Static179.aClass80Array1[local829].anInt2463;
										continue;
									}
									if (local218 == 3908) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Static179.aClass80Array1[local829].anInt2472;
										continue;
									}
									if (local218 == 3910) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										local823 = Static179.aClass80Array1[local829].method2010();
										Static47.anIntArray115[local26++] = local823 == 0 ? 1 : 0;
										continue;
									}
									if (local218 == 3911) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										local823 = Static179.aClass80Array1[local829].method2010();
										Static47.anIntArray115[local26++] = local823 == 2 ? 1 : 0;
										continue;
									}
									if (local218 == 3912) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										local823 = Static179.aClass80Array1[local829].method2010();
										Static47.anIntArray115[local26++] = local823 == 5 ? 1 : 0;
										continue;
									}
									if (local218 == 3913) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										local823 = Static179.aClass80Array1[local829].method2010();
										Static47.anIntArray115[local26++] = local823 == 1 ? 1 : 0;
										continue;
									}
								} else if (local218 < 4100) {
									if (local218 == 4000) {
										local26 -= 2;
										local829 = Static47.anIntArray115[local26];
										local823 = Static47.anIntArray115[local26 + 1];
										Static47.anIntArray115[local26++] = local823 + local829;
										continue;
									}
									if (local218 == 4001) {
										local26 -= 2;
										local823 = Static47.anIntArray115[local26 + 1];
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = local829 - local823;
										continue;
									}
									if (local218 == 4002) {
										local26 -= 2;
										local829 = Static47.anIntArray115[local26];
										local823 = Static47.anIntArray115[local26 + 1];
										Static47.anIntArray115[local26++] = local823 * local829;
										continue;
									}
									if (local218 == 4003) {
										local26 -= 2;
										local823 = Static47.anIntArray115[local26 + 1];
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = local829 / local823;
										continue;
									}
									if (local218 == 4004) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = (int) (Math.random() * (double) local829);
										continue;
									}
									if (local218 == 4005) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = (int) (Math.random() * (double) (local829 + 1));
										continue;
									}
									if (local218 == 4006) {
										local26 -= 5;
										local829 = Static47.anIntArray115[local26];
										local823 = Static47.anIntArray115[local26 + 1];
										local1056 = Static47.anIntArray115[local26 + 2];
										local659 = Static47.anIntArray115[local26 + 3];
										local3884 = Static47.anIntArray115[local26 + 4];
										Static47.anIntArray115[local26++] = local829 + (local3884 - local1056) * (-local829 + local823) / (local659 - local1056);
										continue;
									}
									@Pc(10425) long local10425;
									@Pc(10430) long local10430;
									if (local218 == 4007) {
										local26 -= 2;
										local10425 = Static47.anIntArray115[local26 + 1];
										local10430 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = (int) (local10430 * local10425 / 100L + local10430);
										continue;
									}
									if (local218 == 4008) {
										local26 -= 2;
										local823 = Static47.anIntArray115[local26 + 1];
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = 0x1 << local823 | local829;
										continue;
									}
									if (local218 == 4009) {
										local26 -= 2;
										local823 = Static47.anIntArray115[local26 + 1];
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = local829 & -(0x1 << local823) - 1;
										continue;
									}
									if (local218 == 4010) {
										local26 -= 2;
										local829 = Static47.anIntArray115[local26];
										local823 = Static47.anIntArray115[local26 + 1];
										Static47.anIntArray115[local26++] = (local829 & 0x1 << local823) == 0 ? 0 : 1;
										continue;
									}
									if (local218 == 4011) {
										local26 -= 2;
										local829 = Static47.anIntArray115[local26];
										local823 = Static47.anIntArray115[local26 + 1];
										Static47.anIntArray115[local26++] = local829 % local823;
										continue;
									}
									if (local218 == 4012) {
										local26 -= 2;
										local829 = Static47.anIntArray115[local26];
										local823 = Static47.anIntArray115[local26 + 1];
										if (local829 == 0) {
											Static47.anIntArray115[local26++] = 0;
										} else {
											Static47.anIntArray115[local26++] = (int) Math.pow((double) local829, (double) local823);
										}
										continue;
									}
									if (local218 == 4013) {
										local26 -= 2;
										local829 = Static47.anIntArray115[local26];
										local823 = Static47.anIntArray115[local26 + 1];
										if (local829 == 0) {
											Static47.anIntArray115[local26++] = 0;
										} else if (local823 == 0) {
											Static47.anIntArray115[local26++] = Integer.MAX_VALUE;
										} else {
											Static47.anIntArray115[local26++] = (int) Math.pow((double) local829, 1.0D / (double) local823);
										}
										continue;
									}
									if (local218 == 4014) {
										local26 -= 2;
										local823 = Static47.anIntArray115[local26 + 1];
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = local829 & local823;
										continue;
									}
									if (local218 == 4015) {
										local26 -= 2;
										local829 = Static47.anIntArray115[local26];
										local823 = Static47.anIntArray115[local26 + 1];
										Static47.anIntArray115[local26++] = local829 | local823;
										continue;
									}
									if (local218 == 4016) {
										local26 -= 2;
										local823 = Static47.anIntArray115[local26 + 1];
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = local829 < local823 ? local829 : local823;
										continue;
									}
									if (local218 == 4017) {
										local26 -= 2;
										local829 = Static47.anIntArray115[local26];
										local823 = Static47.anIntArray115[local26 + 1];
										Static47.anIntArray115[local26++] = local823 < local829 ? local829 : local823;
										continue;
									}
									if (local218 == 4018) {
										local26 -= 3;
										local10425 = Static47.anIntArray115[local26 + 1];
										local10430 = Static47.anIntArray115[local26];
										@Pc(10770) long local10770 = (long) Static47.anIntArray115[local26 + 2];
										Static47.anIntArray115[local26++] = (int) (local10430 * local10770 / local10425);
										continue;
									}
								} else if (local218 >= 4200) {
									@Pc(2757) Class4_Sub2_Sub7 local2757;
									if (local218 < 4300) {
										if (local218 == 4200) {
											local26--;
											local829 = Static47.anIntArray115[local26];
											Static230.aStringArray30[local30++] = Static187.method3128(local829).aString35;
											continue;
										}
										@Pc(9111) Class29 local9111;
										if (local218 == 4201) {
											local26 -= 2;
											local823 = Static47.anIntArray115[local26 + 1];
											local829 = Static47.anIntArray115[local26];
											local9111 = Static187.method3128(local829);
											if (local823 >= 1 && local823 <= 5 && local9111.aStringArray4[local823 - 1] != null) {
												Static230.aStringArray30[local30++] = local9111.aStringArray4[local823 - 1];
												continue;
											}
											Static230.aStringArray30[local30++] = "";
											continue;
										}
										if (local218 == 4202) {
											local26 -= 2;
											local829 = Static47.anIntArray115[local26];
											local823 = Static47.anIntArray115[local26 + 1];
											local9111 = Static187.method3128(local829);
											if (local823 >= 1 && local823 <= 5 && local9111.aStringArray3[local823 - 1] != null) {
												Static230.aStringArray30[local30++] = local9111.aStringArray3[local823 - 1];
												continue;
											}
											Static230.aStringArray30[local30++] = "";
											continue;
										}
										if (local218 == 4203) {
											local26--;
											local829 = Static47.anIntArray115[local26];
											Static47.anIntArray115[local26++] = Static187.method3128(local829).anInt1023;
											continue;
										}
										if (local218 == 4204) {
											local26--;
											local829 = Static47.anIntArray115[local26];
											Static47.anIntArray115[local26++] = Static187.method3128(local829).anInt1033 == 1 ? 1 : 0;
											continue;
										}
										@Pc(9255) Class29 local9255;
										if (local218 == 4205) {
											local26--;
											local829 = Static47.anIntArray115[local26];
											local9255 = Static187.method3128(local829);
											if (local9255.anInt994 == -1 && local9255.anInt1030 >= 0) {
												Static47.anIntArray115[local26++] = local9255.anInt1030;
												continue;
											}
											Static47.anIntArray115[local26++] = local829;
											continue;
										}
										if (local218 == 4206) {
											local26--;
											local829 = Static47.anIntArray115[local26];
											local9255 = Static187.method3128(local829);
											if (local9255.anInt994 >= 0 && local9255.anInt1030 >= 0) {
												Static47.anIntArray115[local26++] = local9255.anInt1030;
												continue;
											}
											Static47.anIntArray115[local26++] = local829;
											continue;
										}
										if (local218 == 4207) {
											local26--;
											local829 = Static47.anIntArray115[local26];
											Static47.anIntArray115[local26++] = Static187.method3128(local829).aBoolean62 ? 1 : 0;
											continue;
										}
										if (local218 == 4208) {
											local26 -= 2;
											local829 = Static47.anIntArray115[local26];
											local823 = Static47.anIntArray115[local26 + 1];
											local2757 = Static58.method2508(local823);
											if (local2757.method1391()) {
												Static230.aStringArray30[local30++] = Static187.method3128(local829).method915(local2757.aString65, local823);
											} else {
												Static47.anIntArray115[local26++] = Static187.method3128(local829).method925(local823, local2757.anInt1697);
											}
											continue;
										}
										if (local218 == 4210) {
											local30--;
											local610 = Static230.aStringArray30[local30];
											local26--;
											local823 = Static47.anIntArray115[local26];
											Static147.method2338(local823 == 1, local610);
											Static47.anIntArray115[local26++] = Static262.anInt5103;
											continue;
										}
										if (local218 == 4211) {
											if (Static174.aShortArray68 != null && Static247.anInt4859 < Static262.anInt5103) {
												Static47.anIntArray115[local26++] = Static174.aShortArray68[Static247.anInt4859++] & 0xFFFF;
												continue;
											}
											Static47.anIntArray115[local26++] = -1;
											continue;
										}
										if (local218 == 4212) {
											Static247.anInt4859 = 0;
											continue;
										}
									} else if (local218 < 4400) {
										if (local218 == 4300) {
											local26 -= 2;
											local829 = Static47.anIntArray115[local26];
											local823 = Static47.anIntArray115[local26 + 1];
											local2757 = Static58.method2508(local823);
											if (local2757.method1391()) {
												Static230.aStringArray30[local30++] = Static22.method458(local829).method4655(local2757.aString65, local823);
											} else {
												Static47.anIntArray115[local26++] = Static22.method458(local829).method4661(local823, local2757.anInt1697);
											}
											continue;
										}
									} else if (local218 >= 4500) {
										if (local218 < 4600) {
											if (local218 == 4500) {
												local26 -= 2;
												local829 = Static47.anIntArray115[local26];
												local823 = Static47.anIntArray115[local26 + 1];
												local2757 = Static58.method2508(local823);
												if (local2757.method1391()) {
													Static230.aStringArray30[local30++] = Static143.method2293(local829).method1019(local2757.aString65, local823);
												} else {
													Static47.anIntArray115[local26++] = Static143.method2293(local829).method1021(local823, local2757.anInt1697);
												}
												continue;
											}
										} else if (local218 < 5100) {
											if (local218 == 5000) {
												Static47.anIntArray115[local26++] = Static96.anInt1875;
												continue;
											}
											if (local218 == 5001) {
												local26 -= 3;
												Static96.anInt1875 = Static47.anIntArray115[local26];
												Static8.anInt160 = Static47.anIntArray115[local26 + 1];
												Static106.anInt2119 = Static47.anIntArray115[local26 + 2];
												Static175.aClass4_Sub24_Sub1_1.method3123(181);
												Static175.aClass4_Sub24_Sub1_1.method3116(Static96.anInt1875);
												Static175.aClass4_Sub24_Sub1_1.method3116(Static8.anInt160);
												Static175.aClass4_Sub24_Sub1_1.method3116(Static106.anInt2119);
												continue;
											}
											if (local218 == 5002) {
												local26 -= 2;
												local30--;
												local610 = Static230.aStringArray30[local30];
												local823 = Static47.anIntArray115[local26];
												local1056 = Static47.anIntArray115[local26 + 1];
												Static175.aClass4_Sub24_Sub1_1.method3123(200);
												Static175.aClass4_Sub24_Sub1_1.method3079(Static193.method3171(local610));
												Static175.aClass4_Sub24_Sub1_1.method3116(local823 - 1);
												Static175.aClass4_Sub24_Sub1_1.method3116(local1056);
												continue;
											}
											if (local218 == 5003) {
												local26--;
												local829 = Static47.anIntArray115[local26];
												local3171 = null;
												if (local829 < 100) {
													local3171 = Static7.aStringArray1[local829];
												}
												if (local3171 == null) {
													local3171 = "";
												}
												Static230.aStringArray30[local30++] = local3171;
												continue;
											}
											if (local218 == 5004) {
												local26--;
												local829 = Static47.anIntArray115[local26];
												local823 = -1;
												if (local829 < 100 && Static7.aStringArray1[local829] != null) {
													local823 = Static31.anIntArray83[local829];
												}
												Static47.anIntArray115[local26++] = local823;
												continue;
											}
											if (local218 == 5005) {
												Static47.anIntArray115[local26++] = Static8.anInt160;
												continue;
											}
											if (local218 == 5008) {
												local30--;
												local610 = Static230.aStringArray30[local30];
												if (local610.startsWith("::")) {
													Static12.method232(local610);
													continue;
												}
												if (Static191.anInt3873 == 0 && (Static243.aBoolean299 && !Static29.aBoolean47 || Static106.aBoolean122)) {
													continue;
												}
												local3171 = local610.toLowerCase();
												@Pc(7581) byte local7581 = 0;
												if (local3171.startsWith(Static188.aString199)) {
													local7581 = 0;
													local610 = local610.substring(Static188.aString199.length());
												} else if (local3171.startsWith(Static292.aString189)) {
													local610 = local610.substring(Static292.aString189.length());
													local7581 = 1;
												} else if (local3171.startsWith(Static247.aString163)) {
													local610 = local610.substring(Static247.aString163.length());
													local7581 = 2;
												} else if (local3171.startsWith(Static14.aString17)) {
													local610 = local610.substring(Static14.aString17.length());
													local7581 = 3;
												} else if (local3171.startsWith(Static108.aString80)) {
													local610 = local610.substring(Static108.aString80.length());
													local7581 = 4;
												} else if (local3171.startsWith(Static261.aString172)) {
													local610 = local610.substring(Static261.aString172.length());
													local7581 = 5;
												} else if (local3171.startsWith(Static93.aString114)) {
													local7581 = 6;
													local610 = local610.substring(Static93.aString114.length());
												} else if (local3171.startsWith(Static291.aString188)) {
													local610 = local610.substring(Static291.aString188.length());
													local7581 = 7;
												} else if (local3171.startsWith(Static199.aString102)) {
													local610 = local610.substring(Static199.aString102.length());
													local7581 = 8;
												} else if (local3171.startsWith(Static47.aString38)) {
													local7581 = 9;
													local610 = local610.substring(Static47.aString38.length());
												} else if (local3171.startsWith(Static254.aString169)) {
													local7581 = 10;
													local610 = local610.substring(Static254.aString169.length());
												} else if (local3171.startsWith(Static75.aString61)) {
													local7581 = 11;
													local610 = local610.substring(Static75.aString61.length());
												} else if (Static187.anInt3840 != 0) {
													if (local3171.startsWith(Static304.aString201)) {
														local610 = local610.substring(Static304.aString201.length());
														local7581 = 0;
													} else if (local3171.startsWith(Static44.aString33)) {
														local610 = local610.substring(Static44.aString33.length());
														local7581 = 1;
													} else if (local3171.startsWith(Static46.aString36)) {
														local610 = local610.substring(Static46.aString36.length());
														local7581 = 2;
													} else if (local3171.startsWith(Static56.aString44)) {
														local7581 = 3;
														local610 = local610.substring(Static56.aString44.length());
													} else if (local3171.startsWith(Static238.aString133)) {
														local610 = local610.substring(Static238.aString133.length());
														local7581 = 4;
													} else if (local3171.startsWith(Static79.aString63)) {
														local610 = local610.substring(Static79.aString63.length());
														local7581 = 5;
													} else if (local3171.startsWith(Static296.aString191)) {
														local610 = local610.substring(Static296.aString191.length());
														local7581 = 6;
													} else if (local3171.startsWith(Static72.aString58)) {
														local610 = local610.substring(Static72.aString58.length());
														local7581 = 7;
													} else if (local3171.startsWith(Static182.aString126)) {
														local7581 = 8;
														local610 = local610.substring(Static182.aString126.length());
													} else if (local3171.startsWith(Static158.aString113)) {
														local610 = local610.substring(Static158.aString113.length());
														local7581 = 9;
													} else if (local3171.startsWith(Static211.aString130)) {
														local610 = local610.substring(Static211.aString130.length());
														local7581 = 10;
													} else if (local3171.startsWith(Static288.aString187)) {
														local610 = local610.substring(Static288.aString187.length());
														local7581 = 11;
													}
												}
												local3171 = local610.toLowerCase();
												@Pc(7899) byte local7899 = 0;
												if (local3171.startsWith(Static80.aString64)) {
													local7899 = 1;
													local610 = local610.substring(Static80.aString64.length());
												} else if (local3171.startsWith(Static71.aString55)) {
													local7899 = 2;
													local610 = local610.substring(Static71.aString55.length());
												} else if (local3171.startsWith(Static64.aString49)) {
													local610 = local610.substring(Static64.aString49.length());
													local7899 = 3;
												} else if (local3171.startsWith(Static276.aString183)) {
													local7899 = 4;
													local610 = local610.substring(Static276.aString183.length());
												} else if (local3171.startsWith(Static222.aString149)) {
													local610 = local610.substring(Static222.aString149.length());
													local7899 = 5;
												} else if (Static187.anInt3840 != 0) {
													if (local3171.startsWith(Static240.aString89)) {
														local7899 = 1;
														local610 = local610.substring(Static240.aString89.length());
													} else if (local3171.startsWith(Static242.aString158)) {
														local7899 = 2;
														local610 = local610.substring(Static242.aString158.length());
													} else if (local3171.startsWith(Static133.aString90)) {
														local7899 = 3;
														local610 = local610.substring(Static133.aString90.length());
													} else if (local3171.startsWith(Static282.aString186)) {
														local610 = local610.substring(Static282.aString186.length());
														local7899 = 4;
													} else if (local3171.startsWith(Static32.aString27)) {
														local610 = local610.substring(Static32.aString27.length());
														local7899 = 5;
													}
												}
												Static175.aClass4_Sub24_Sub1_1.method3123(129);
												Static175.aClass4_Sub24_Sub1_1.method3116(0);
												local3884 = Static175.aClass4_Sub24_Sub1_1.anInt3822;
												Static175.aClass4_Sub24_Sub1_1.method3116(local7581);
												Static175.aClass4_Sub24_Sub1_1.method3116(local7899);
												Static55.method1061(Static175.aClass4_Sub24_Sub1_1, local610);
												Static175.aClass4_Sub24_Sub1_1.method3090(Static175.aClass4_Sub24_Sub1_1.anInt3822 - local3884);
												continue;
											}
											if (local218 == 5009) {
												local30 -= 2;
												local610 = Static230.aStringArray30[local30];
												local3171 = Static230.aStringArray30[local30 + 1];
												if (Static191.anInt3873 != 0 || (!Static243.aBoolean299 || Static29.aBoolean47) && !Static106.aBoolean122) {
													Static175.aClass4_Sub24_Sub1_1.method3123(114);
													Static175.aClass4_Sub24_Sub1_1.method3116(0);
													local1056 = Static175.aClass4_Sub24_Sub1_1.anInt3822;
													Static175.aClass4_Sub24_Sub1_1.method3079(Static193.method3171(local610));
													Static55.method1061(Static175.aClass4_Sub24_Sub1_1, local3171);
													Static175.aClass4_Sub24_Sub1_1.method3090(Static175.aClass4_Sub24_Sub1_1.anInt3822 - local1056);
												}
												continue;
											}
											if (local218 == 5010) {
												local26--;
												local829 = Static47.anIntArray115[local26];
												local3171 = null;
												if (local829 < 100) {
													local3171 = Static305.aStringArray37[local829];
												}
												if (local3171 == null) {
													local3171 = "";
												}
												Static230.aStringArray30[local30++] = local3171;
												continue;
											}
											if (local218 == 5011) {
												local26--;
												local829 = Static47.anIntArray115[local26];
												local3171 = null;
												if (local829 < 100) {
													local3171 = Static146.aStringArray17[local829];
												}
												if (local3171 == null) {
													local3171 = "";
												}
												Static230.aStringArray30[local30++] = local3171;
												continue;
											}
											if (local218 == 5012) {
												local26--;
												local829 = Static47.anIntArray115[local26];
												local823 = -1;
												if (local829 < 100) {
													local823 = Static210.anIntArray344[local829];
												}
												Static47.anIntArray115[local26++] = local823;
												continue;
											}
											if (local218 == 5015) {
												if (Static72.aClass13_Sub5_Sub1_1 == null || Static72.aClass13_Sub5_Sub1_1.aString148 == null) {
													local610 = Static157.aString16;
												} else {
													local610 = Static72.aClass13_Sub5_Sub1_1.method3494();
												}
												Static230.aStringArray30[local30++] = local610;
												continue;
											}
											if (local218 == 5016) {
												Static47.anIntArray115[local26++] = Static106.anInt2119;
												continue;
											}
											if (local218 == 5017) {
												Static47.anIntArray115[local26++] = Static174.anInt3535;
												continue;
											}
											if (local218 == 5050) {
												local26--;
												local829 = Static47.anIntArray115[local26];
												Static230.aStringArray30[local30++] = Static116.method4401(local829).aString142;
												continue;
											}
											@Pc(8292) Class4_Sub2_Sub17 local8292;
											if (local218 == 5051) {
												local26--;
												local829 = Static47.anIntArray115[local26];
												local8292 = Static116.method4401(local829);
												if (local8292.anIntArray343 == null) {
													Static47.anIntArray115[local26++] = 0;
												} else {
													Static47.anIntArray115[local26++] = local8292.anIntArray343.length;
												}
												continue;
											}
											if (local218 == 5052) {
												local26 -= 2;
												local829 = Static47.anIntArray115[local26];
												local823 = Static47.anIntArray115[local26 + 1];
												@Pc(8333) Class4_Sub2_Sub17 local8333 = Static116.method4401(local829);
												local659 = local8333.anIntArray343[local823];
												Static47.anIntArray115[local26++] = local659;
												continue;
											}
											if (local218 == 5053) {
												local26--;
												local829 = Static47.anIntArray115[local26];
												local8292 = Static116.method4401(local829);
												if (local8292.anIntArray345 == null) {
													Static47.anIntArray115[local26++] = 0;
												} else {
													Static47.anIntArray115[local26++] = local8292.anIntArray345.length;
												}
												continue;
											}
											if (local218 == 5054) {
												local26 -= 2;
												local829 = Static47.anIntArray115[local26];
												local823 = Static47.anIntArray115[local26 + 1];
												Static47.anIntArray115[local26++] = Static116.method4401(local829).anIntArray345[local823];
												continue;
											}
											if (local218 == 5055) {
												local26--;
												local829 = Static47.anIntArray115[local26];
												Static230.aStringArray30[local30++] = Static67.method1178(local829).method983();
												continue;
											}
											if (local218 == 5056) {
												local26--;
												local829 = Static47.anIntArray115[local26];
												@Pc(8436) Class4_Sub2_Sub5 local8436 = Static67.method1178(local829);
												if (local8436.anIntArray118 == null) {
													Static47.anIntArray115[local26++] = 0;
												} else {
													Static47.anIntArray115[local26++] = local8436.anIntArray118.length;
												}
												continue;
											}
											if (local218 == 5057) {
												local26 -= 2;
												local829 = Static47.anIntArray115[local26];
												local823 = Static47.anIntArray115[local26 + 1];
												Static47.anIntArray115[local26++] = Static67.method1178(local829).anIntArray118[local823];
												continue;
											}
											if (local218 == 5058) {
												Static20.aClass14_5 = new Class14();
												local26--;
												Static20.aClass14_5.anInt519 = Static47.anIntArray115[local26];
												Static20.aClass14_5.aClass4_Sub2_Sub5_1 = Static67.method1178(Static20.aClass14_5.anInt519);
												Static20.aClass14_5.anIntArray66 = new int[Static20.aClass14_5.aClass4_Sub2_Sub5_1.method976()];
												continue;
											}
											if (local218 == 5059) {
												Static175.aClass4_Sub24_Sub1_1.method3123(77);
												Static175.aClass4_Sub24_Sub1_1.method3116(0);
												local829 = Static175.aClass4_Sub24_Sub1_1.anInt3822;
												Static175.aClass4_Sub24_Sub1_1.method3116(0);
												Static175.aClass4_Sub24_Sub1_1.method3105(Static20.aClass14_5.anInt519);
												Static20.aClass14_5.aClass4_Sub2_Sub5_1.method980(Static20.aClass14_5.anIntArray66, Static175.aClass4_Sub24_Sub1_1);
												Static175.aClass4_Sub24_Sub1_1.method3090(Static175.aClass4_Sub24_Sub1_1.anInt3822 - local829);
												continue;
											}
											if (local218 == 5060) {
												local30--;
												local610 = Static230.aStringArray30[local30];
												Static175.aClass4_Sub24_Sub1_1.method3123(44);
												Static175.aClass4_Sub24_Sub1_1.method3116(0);
												local823 = Static175.aClass4_Sub24_Sub1_1.anInt3822;
												Static175.aClass4_Sub24_Sub1_1.method3079(Static193.method3171(local610));
												Static175.aClass4_Sub24_Sub1_1.method3105(Static20.aClass14_5.anInt519);
												Static20.aClass14_5.aClass4_Sub2_Sub5_1.method980(Static20.aClass14_5.anIntArray66, Static175.aClass4_Sub24_Sub1_1);
												Static175.aClass4_Sub24_Sub1_1.method3090(Static175.aClass4_Sub24_Sub1_1.anInt3822 - local823);
												continue;
											}
											if (local218 == 5061) {
												Static175.aClass4_Sub24_Sub1_1.method3123(77);
												Static175.aClass4_Sub24_Sub1_1.method3116(0);
												local829 = Static175.aClass4_Sub24_Sub1_1.anInt3822;
												Static175.aClass4_Sub24_Sub1_1.method3116(1);
												Static175.aClass4_Sub24_Sub1_1.method3105(Static20.aClass14_5.anInt519);
												Static20.aClass14_5.aClass4_Sub2_Sub5_1.method980(Static20.aClass14_5.anIntArray66, Static175.aClass4_Sub24_Sub1_1);
												Static175.aClass4_Sub24_Sub1_1.method3090(Static175.aClass4_Sub24_Sub1_1.anInt3822 - local829);
												continue;
											}
											if (local218 == 5062) {
												local26 -= 2;
												local829 = Static47.anIntArray115[local26];
												local823 = Static47.anIntArray115[local26 + 1];
												Static47.anIntArray115[local26++] = Static116.method4401(local829).aCharArray4[local823];
												continue;
											}
											if (local218 == 5063) {
												local26 -= 2;
												local823 = Static47.anIntArray115[local26 + 1];
												local829 = Static47.anIntArray115[local26];
												Static47.anIntArray115[local26++] = Static116.method4401(local829).aCharArray5[local823];
												continue;
											}
											if (local218 == 5064) {
												local26 -= 2;
												local823 = Static47.anIntArray115[local26 + 1];
												local829 = Static47.anIntArray115[local26];
												if (local823 == -1) {
													Static47.anIntArray115[local26++] = -1;
												} else {
													Static47.anIntArray115[local26++] = Static116.method4401(local829).method3320((char) local823);
												}
												continue;
											}
											if (local218 == 5065) {
												local26 -= 2;
												local823 = Static47.anIntArray115[local26 + 1];
												local829 = Static47.anIntArray115[local26];
												if (local823 == -1) {
													Static47.anIntArray115[local26++] = -1;
												} else {
													Static47.anIntArray115[local26++] = Static116.method4401(local829).method3318((char) local823);
												}
												continue;
											}
											if (local218 == 5066) {
												local26--;
												local829 = Static47.anIntArray115[local26];
												Static47.anIntArray115[local26++] = Static67.method1178(local829).method976();
												continue;
											}
											if (local218 == 5067) {
												local26 -= 2;
												local823 = Static47.anIntArray115[local26 + 1];
												local829 = Static47.anIntArray115[local26];
												local1056 = Static67.method1178(local829).method972(local823);
												Static47.anIntArray115[local26++] = local1056;
												continue;
											}
											if (local218 == 5068) {
												local26 -= 2;
												local829 = Static47.anIntArray115[local26];
												local823 = Static47.anIntArray115[local26 + 1];
												Static20.aClass14_5.anIntArray66[local829] = local823;
												continue;
											}
											if (local218 == 5069) {
												local26 -= 2;
												local829 = Static47.anIntArray115[local26];
												local823 = Static47.anIntArray115[local26 + 1];
												Static20.aClass14_5.anIntArray66[local829] = local823;
												continue;
											}
											if (local218 == 5070) {
												local26 -= 3;
												local829 = Static47.anIntArray115[local26];
												local823 = Static47.anIntArray115[local26 + 1];
												local1056 = Static47.anIntArray115[local26 + 2];
												@Pc(8915) Class4_Sub2_Sub5 local8915 = Static67.method1178(local829);
												if (local8915.method972(local823) != 0) {
													throw new RuntimeException("bad command");
												}
												Static47.anIntArray115[local26++] = local8915.method981(local823, local1056);
												continue;
											}
											if (local218 == 5071) {
												local30--;
												local610 = Static230.aStringArray30[local30];
												local26--;
												local1558 = Static47.anIntArray115[local26] == 1;
												Static173.method2817(local1558, local610);
												Static47.anIntArray115[local26++] = Static262.anInt5103;
												continue;
											}
											if (local218 == 5072) {
												if (Static174.aShortArray68 != null && Static262.anInt5103 > Static247.anInt4859) {
													Static47.anIntArray115[local26++] = Static174.aShortArray68[Static247.anInt4859++] & 0xFFFF;
													continue;
												}
												Static47.anIntArray115[local26++] = -1;
												continue;
											}
											if (local218 == 5073) {
												Static247.anInt4859 = 0;
												continue;
											}
										} else if (local218 >= 5200) {
											@Pc(3305) boolean local3305;
											if (local218 < 5300) {
												if (local218 == 5200) {
													local26--;
													Static199.method2417(Static47.anIntArray115[local26]);
													continue;
												}
												if (local218 == 5201) {
													Static47.anIntArray115[local26++] = Static261.method4050();
													continue;
												}
												if (local218 == 5202) {
													local26--;
													Static157.method259(Static47.anIntArray115[local26]);
													continue;
												}
												if (local218 == 5203) {
													local30--;
													Static65.method4573(Static230.aStringArray30[local30]);
													continue;
												}
												if (local218 == 5204) {
													Static230.aStringArray30[local30 - 1] = Static151.method2395(Static230.aStringArray30[local30 - 1]);
													continue;
												}
												if (local218 == 5205) {
													local26--;
													Static199.method2419(Static47.anIntArray115[local26], -1, -1);
													continue;
												}
												@Pc(2964) Class4_Sub2_Sub18 local2964;
												if (local218 == 5206) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													local2964 = Static146.method2321(local829 & 0x3FFF, local829 >> 14 & 0x3FFF);
													if (local2964 == null) {
														Static47.anIntArray115[local26++] = -1;
													} else {
														Static47.anIntArray115[local26++] = local2964.anInt4543;
													}
													continue;
												}
												@Pc(2993) Class4_Sub2_Sub18 local2993;
												if (local218 == 5207) {
													local26--;
													local2993 = Static104.method1789(Static47.anIntArray115[local26]);
													if (local2993 != null && local2993.aString151 != null) {
														Static230.aStringArray30[local30++] = local2993.aString151;
														continue;
													}
													Static230.aStringArray30[local30++] = "";
													continue;
												}
												if (local218 == 5208) {
													Static47.anIntArray115[local26++] = Static298.anInt5312;
													Static47.anIntArray115[local26++] = Static217.anInt4191;
													continue;
												}
												if (local218 == 5209) {
													Static47.anIntArray115[local26++] = Static175.anInt3552 + Static208.anInt4072;
													Static47.anIntArray115[local26++] = Static133.anInt2663 + Static158.anInt3242 - Static104.anInt2092 - 1;
													continue;
												}
												if (local218 == 5210) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													local2964 = Static104.method1789(local829);
													if (local2964 == null) {
														Static47.anIntArray115[local26++] = 0;
														Static47.anIntArray115[local26++] = 0;
													} else {
														Static47.anIntArray115[local26++] = local2964.anInt4530 >> 14 & 0x3FFF;
														Static47.anIntArray115[local26++] = local2964.anInt4530 & 0x3FFF;
													}
													continue;
												}
												if (local218 == 5211) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													local2964 = Static104.method1789(local829);
													if (local2964 == null) {
														Static47.anIntArray115[local26++] = 0;
														Static47.anIntArray115[local26++] = 0;
													} else {
														Static47.anIntArray115[local26++] = local2964.anInt4525 - local2964.anInt4528;
														Static47.anIntArray115[local26++] = local2964.anInt4536 - local2964.anInt4535;
													}
													continue;
												}
												if (local218 == 5212) {
													local829 = Static35.method224();
													local1056 = 0;
													if (local829 == -1) {
														local3171 = "";
													} else {
														local3171 = Static209.aClass100_3.aStringArray22[local829];
														local1056 = Static209.aClass100_3.method2542(local829);
													}
													local3171 = Static64.method1170(" ", local3171, "<br>");
													Static230.aStringArray30[local30++] = local3171;
													Static47.anIntArray115[local26++] = local1056;
													continue;
												}
												if (local218 == 5213) {
													local829 = Static151.method2391();
													local1056 = 0;
													if (local829 == -1) {
														local3171 = "";
													} else {
														local3171 = Static209.aClass100_3.aStringArray22[local829];
														local1056 = Static209.aClass100_3.method2542(local829);
													}
													local3171 = Static64.method1170(" ", local3171, "<br>");
													Static230.aStringArray30[local30++] = local3171;
													Static47.anIntArray115[local26++] = local1056;
													continue;
												}
												if (local218 == 5214) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													local2964 = Static27.method578();
													if (local2964 != null) {
														local3279 = local2964.method3540(local829 & 0x3FFF, local829 >> 14 & 0x3FFF, local829 >> 28 & 0x3);
														if (local3279 != null) {
															Static187.method3124(local3279[2], local3279[1]);
														}
													}
													continue;
												}
												if (local218 == 5215) {
													local26 -= 2;
													local823 = Static47.anIntArray115[local26 + 1];
													local3305 = false;
													local829 = Static47.anIntArray115[local26];
													@Pc(3320) Class86 local3320 = Static13.method239(local829 >> 14 & 0x3FFF, local829 & 0x3FFF);
													for (@Pc(3325) Class4_Sub2_Sub18 local3325 = (Class4_Sub2_Sub18) local3320.method2183(); local3325 != null; local3325 = (Class4_Sub2_Sub18) local3320.method2184()) {
														if (local823 == local3325.anInt4543) {
															local3305 = true;
															break;
														}
													}
													if (local3305) {
														Static47.anIntArray115[local26++] = 1;
													} else {
														Static47.anIntArray115[local26++] = 0;
													}
													continue;
												}
												if (local218 == 5216) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													Static94.method1563(local829);
													continue;
												}
												if (local218 == 5217) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													if (Static53.method1030(local829)) {
														Static47.anIntArray115[local26++] = 1;
													} else {
														Static47.anIntArray115[local26++] = 0;
													}
													continue;
												}
												if (local218 == 5218) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													local2964 = Static104.method1789(local829);
													if (local2964 == null) {
														Static47.anIntArray115[local26++] = -1;
													} else {
														Static47.anIntArray115[local26++] = local2964.anInt4541;
													}
													continue;
												}
												if (local218 == 5219) {
													local30--;
													Static54.method1054(Static230.aStringArray30[local30]);
													continue;
												}
												if (local218 == 5220) {
													Static47.anIntArray115[local26++] = Static219.anInt4212 == 100 ? 1 : 0;
													continue;
												}
												if (local218 == 5221) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													Static187.method3124(local829 & 0x3FFF, local829 >> 14 & 0x3FFF);
													continue;
												}
												if (local218 == 5222) {
													local2993 = Static27.method578();
													if (local2993 == null) {
														Static47.anIntArray115[local26++] = -1;
														Static47.anIntArray115[local26++] = -1;
													} else {
														local653 = local2993.method3541(Static175.anInt3552 + Static208.anInt4072, Static133.anInt2663 + -Static104.anInt2092 + Static158.anInt3242 + -1);
														if (local653 == null) {
															Static47.anIntArray115[local26++] = -1;
															Static47.anIntArray115[local26++] = -1;
														} else {
															Static47.anIntArray115[local26++] = local653[1];
															Static47.anIntArray115[local26++] = local653[2];
														}
													}
													continue;
												}
												if (local218 == 5223) {
													local26 -= 2;
													local829 = Static47.anIntArray115[local26];
													local823 = Static47.anIntArray115[local26 + 1];
													Static199.method2419(local829, local823 >> 14 & 0x3FFF, local823 & 0x3FFF);
													continue;
												}
												if (local218 == 5224) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													local2964 = Static27.method578();
													if (local2964 == null) {
														Static47.anIntArray115[local26++] = -1;
														Static47.anIntArray115[local26++] = -1;
													} else {
														local3279 = local2964.method3540(local829 & 0x3FFF, local829 >> 14 & 0x3FFF, (local829 & 0x3DC18DB2) >> 28);
														if (local3279 == null) {
															Static47.anIntArray115[local26++] = -1;
															Static47.anIntArray115[local26++] = -1;
														} else {
															Static47.anIntArray115[local26++] = local3279[1];
															Static47.anIntArray115[local26++] = local3279[2];
														}
													}
													continue;
												}
												if (local218 == 5225) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													local2964 = Static27.method578();
													if (local2964 == null) {
														Static47.anIntArray115[local26++] = -1;
														Static47.anIntArray115[local26++] = -1;
													} else {
														local3279 = local2964.method3541(local829 >> 14 & 0x3FFF, local829 & 0x3FFF);
														if (local3279 == null) {
															Static47.anIntArray115[local26++] = -1;
															Static47.anIntArray115[local26++] = -1;
														} else {
															Static47.anIntArray115[local26++] = local3279[1];
															Static47.anIntArray115[local26++] = local3279[2];
														}
													}
													continue;
												}
											} else if (local218 < 5400) {
												if (local218 == 5300) {
													local26 -= 2;
													local829 = Static47.anIntArray115[local26];
													local823 = Static47.anIntArray115[local26 + 1];
													Static112.method1885(false, 3, local829, local823);
													Static47.anIntArray115[local26++] = Static250.aFrame2 == null ? 0 : 1;
													continue;
												}
												if (local218 == 5301) {
													if (Static250.aFrame2 != null) {
														Static112.method1885(false, Static228.anInt4580, -1, -1);
													}
													continue;
												}
												if (local218 == 5302) {
													@Pc(7126) Class188[] local7126 = Static245.method3787();
													Static47.anIntArray115[local26++] = local7126.length;
													continue;
												}
												if (local218 == 5303) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													@Pc(7147) Class188[] local7147 = Static245.method3787();
													Static47.anIntArray115[local26++] = local7147[local829].anInt5872;
													Static47.anIntArray115[local26++] = local7147[local829].anInt5873;
													continue;
												}
												if (local218 == 5305) {
													local829 = Static121.anInt2458;
													local823 = Static104.anInt2103;
													local1056 = -1;
													@Pc(7177) Class188[] local7177 = Static245.method3787();
													for (local3884 = 0; local3884 < local7177.length; local3884++) {
														@Pc(7191) Class188 local7191 = local7177[local3884];
														if (local7191.anInt5872 == local829 && local7191.anInt5873 == local823) {
															local1056 = local3884;
															break;
														}
													}
													Static47.anIntArray115[local26++] = local1056;
													continue;
												}
												if (local218 == 5306) {
													Static47.anIntArray115[local26++] = Static284.method4440();
													continue;
												}
												if (local218 == 5307) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													if (local829 < 0 || local829 > 2) {
														local829 = 0;
													}
													Static112.method1885(false, local829, -1, -1);
													continue;
												}
												if (local218 == 5308) {
													Static47.anIntArray115[local26++] = Static228.anInt4580;
													continue;
												}
												if (local218 == 5309) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													if (local829 < 0 || local829 > 2) {
														local829 = 0;
													}
													Static228.anInt4580 = local829;
													Static204.method3268(Static95.aClass184_3);
													continue;
												}
											} else if (local218 < 5500) {
												if (local218 == 5400) {
													local30 -= 2;
													local26--;
													local1056 = Static47.anIntArray115[local26];
													local3171 = Static230.aStringArray30[local30 + 1];
													local610 = Static230.aStringArray30[local30];
													Static175.aClass4_Sub24_Sub1_1.method3123(12);
													Static175.aClass4_Sub24_Sub1_1.method3116(Static247.method3791(local610) + Static247.method3791(local3171) + 1);
													Static175.aClass4_Sub24_Sub1_1.method3095(local610);
													Static175.aClass4_Sub24_Sub1_1.method3095(local3171);
													Static175.aClass4_Sub24_Sub1_1.method3116(local1056);
													continue;
												}
												if (local218 == 5401) {
													local26 -= 2;
													Static226.aShortArray75[Static47.anIntArray115[local26]] = (short) Static301.method4630(Static47.anIntArray115[local26 + 1]);
													Static156.method2539();
													Static180.method2936();
													Static2.method11();
													Static141.method2271();
													Static38.method716();
													continue;
												}
												if (local218 == 5405) {
													local26 -= 2;
													local829 = Static47.anIntArray115[local26];
													local823 = Static47.anIntArray115[local26 + 1];
													if (local829 >= 0 && local829 < 2) {
														Static170.anIntArrayArrayArray9[local829] = new int[local823 << 1][4];
													}
													continue;
												}
												if (local218 == 5406) {
													local26 -= 7;
													local829 = Static47.anIntArray115[local26];
													local823 = Static47.anIntArray115[local26 + 1] << 1;
													local1056 = Static47.anIntArray115[local26 + 2];
													local3884 = Static47.anIntArray115[local26 + 4];
													@Pc(3890) int local3890 = Static47.anIntArray115[local26 + 6];
													local1099 = Static47.anIntArray115[local26 + 5];
													local659 = Static47.anIntArray115[local26 + 3];
													if (local829 >= 0 && local829 < 2 && Static170.anIntArrayArrayArray9[local829] != null && local823 >= 0 && Static170.anIntArrayArrayArray9[local829].length > local823) {
														Static170.anIntArrayArrayArray9[local829][local823] = new int[] { (local1056 >> 14 & 0x3FFF) * 128, local659, (local1056 & 0x3FFF) * 128, local3890 };
														Static170.anIntArrayArrayArray9[local829][local823 + 1] = new int[] { (local3884 >> 14 & 0x3FFF) * 128, local1099, (local3884 & 0x3FFF) * 128 };
													}
													continue;
												}
												if (local218 == 5407) {
													local26--;
													local829 = Static170.anIntArrayArrayArray9[Static47.anIntArray115[local26]].length >> 1;
													Static47.anIntArray115[local26++] = local829;
													continue;
												}
												if (local218 == 5411) {
													if (Static250.aFrame2 != null) {
														Static112.method1885(false, Static228.anInt4580, -1, -1);
													}
													if (Static32.aFrame1 == null) {
														Static181.method4698(false, Static38.method717());
													} else {
														System.exit(0);
													}
													continue;
												}
												if (local218 == 5419) {
													local610 = "";
													if (Static207.aClass119_4 != null) {
														if (Static207.aClass119_4.anObject4 == null) {
															local610 = Static173.method2818(Static207.aClass119_4.anInt3696);
														} else {
															local610 = (String) Static207.aClass119_4.anObject4;
														}
													}
													Static230.aStringArray30[local30++] = local610;
													continue;
												}
												if (local218 == 5420) {
													Static47.anIntArray115[local26++] = Static300.anInt5735 == 3 ? 1 : 0;
													continue;
												}
												if (local218 == 5421) {
													if (Static250.aFrame2 != null) {
														Static112.method1885(false, Static228.anInt4580, -1, -1);
													}
													local30--;
													local610 = Static230.aStringArray30[local30];
													local26--;
													local1558 = Static47.anIntArray115[local26] == 1;
													@Pc(4128) String local4128 = Static38.method717() + local610;
													if (Static32.aFrame1 == null && (!local1558 || Static300.anInt5735 == 3 || !Static300.aString195.startsWith("win") || Static13.aBoolean23)) {
														Static181.method4698(local1558, local4128);
														continue;
													}
													Static243.aString160 = local4128;
													Static81.aBoolean99 = local1558;
													Static226.aClass119_7 = Static95.aClass184_3.method4613(local4128);
													continue;
												}
												if (local218 == 5422) {
													local30 -= 2;
													local610 = Static230.aStringArray30[local30];
													local3171 = Static230.aStringArray30[local30 + 1];
													local26--;
													local1056 = Static47.anIntArray115[local26];
													if (local610.length() > 0) {
														if (Static234.aStringArray31 == null) {
															Static234.aStringArray31 = new String[Static269.anIntArray419[Static122.anInt2465]];
														}
														Static234.aStringArray31[local1056] = local610;
													}
													if (local3171.length() > 0) {
														if (Static152.aStringArray18 == null) {
															Static152.aStringArray18 = new String[Static269.anIntArray419[Static122.anInt2465]];
														}
														Static152.aStringArray18[local1056] = local3171;
													}
													continue;
												}
												if (local218 == 5423) {
													local30--;
													System.out.println(Static230.aStringArray30[local30]);
													continue;
												}
												if (local218 == 5424) {
													local26 -= 11;
													Static265.anInt5217 = Static47.anIntArray115[local26];
													anInt657 = Static47.anIntArray115[local26 + 1];
													Static159.anInt3257 = Static47.anIntArray115[local26 + 2];
													Static148.anInt2905 = Static47.anIntArray115[local26 + 3];
													Static118.anInt2448 = Static47.anIntArray115[local26 + 4];
													Static254.anInt4973 = Static47.anIntArray115[local26 + 5];
													Static48.anInt1073 = Static47.anIntArray115[local26 + 6];
													Static216.anInt4186 = Static47.anIntArray115[local26 + 7];
													Static245.anInt4850 = Static47.anIntArray115[local26 + 8];
													Static303.anInt5783 = Static47.anIntArray115[local26 + 9];
													Static158.anInt3243 = Static47.anIntArray115[local26 + 10];
													Static60.aClass22_26.method656(Static118.anInt2448);
													Static60.aClass22_26.method656(Static254.anInt4973);
													Static60.aClass22_26.method656(Static48.anInt1073);
													Static60.aClass22_26.method656(Static216.anInt4186);
													Static60.aClass22_26.method656(Static245.anInt4850);
													Static86.aBoolean103 = true;
													continue;
												}
												if (local218 == 5425) {
													Static201.method3247();
													Static86.aBoolean103 = false;
													continue;
												}
												if (local218 == 5426) {
													local26--;
													Static198.anInt4005 = Static47.anIntArray115[local26];
													continue;
												}
												if (local218 == 5427) {
													local26 -= 2;
													Static303.anInt5779 = Static47.anIntArray115[local26];
													Static55.anInt1250 = Static47.anIntArray115[local26 + 1];
													continue;
												}
												if (local218 == 5428) {
													local26 -= 2;
													local829 = Static47.anIntArray115[local26];
													local823 = Static47.anIntArray115[local26 + 1];
													Static47.anIntArray115[local26++] = Static56.method1062(local829, local823) ? 1 : 0;
													continue;
												}
											} else if (local218 < 5600) {
												if (local218 == 5500) {
													local26 -= 4;
													local823 = Static47.anIntArray115[local26 + 1];
													local829 = Static47.anIntArray115[local26];
													local1056 = Static47.anIntArray115[local26 + 2];
													local659 = Static47.anIntArray115[local26 + 3];
													Static247.method3794(local1056, (local829 >> 14 & 0x3FFF) - Static269.anInt5357, -Static105.anInt2105 + (local829 & 0x3FFF), false, local659, local823);
													continue;
												}
												if (local218 == 5501) {
													local26 -= 4;
													local829 = Static47.anIntArray115[local26];
													local1056 = Static47.anIntArray115[local26 + 2];
													local823 = Static47.anIntArray115[local26 + 1];
													local659 = Static47.anIntArray115[local26 + 3];
													Static80.method1368((local829 >> 14 & 0x3FFF) - Static269.anInt5357, local823, local1056, local659, (local829 & 0x3FFF) - Static105.anInt2105);
													continue;
												}
												if (local218 == 5502) {
													local26 -= 6;
													local829 = Static47.anIntArray115[local26];
													if (local829 >= 2) {
														throw new RuntimeException();
													}
													Static13.anInt287 = local829;
													local823 = Static47.anIntArray115[local26 + 1];
													if (Static170.anIntArrayArrayArray9[Static13.anInt287].length >> 1 <= local823 + 1) {
														throw new RuntimeException();
													}
													Static123.anInt2499 = 0;
													Static178.anInt3609 = local823;
													Static171.anInt3438 = Static47.anIntArray115[local26 + 2];
													Static179.anInt3616 = Static47.anIntArray115[local26 + 3];
													local1056 = Static47.anIntArray115[local26 + 4];
													if (local1056 >= 2) {
														throw new RuntimeException();
													}
													Static242.anInt4773 = local1056;
													local659 = Static47.anIntArray115[local26 + 5];
													if (local659 + 1 >= Static170.anIntArrayArrayArray9[Static242.anInt4773].length >> 1) {
														throw new RuntimeException();
													}
													Static122.anInt2464 = local659;
													Static99.anInt1946 = 3;
													continue;
												}
												if (local218 == 5503) {
													Static183.method2968();
													continue;
												}
												if (local218 == 5504) {
													local26 -= 2;
													Static45.method926(Static47.anIntArray115[local26 + 1], Static47.anIntArray115[local26]);
													continue;
												}
												if (local218 == 5505) {
													Static47.anIntArray115[local26++] = (int) Static276.aFloat156;
													continue;
												}
												if (local218 == 5506) {
													Static47.anIntArray115[local26++] = (int) Static126.aFloat73;
													continue;
												}
												if (local218 == 5507) {
													Static39.method725();
													continue;
												}
												if (local218 == 5508) {
													Static148.method2343();
													continue;
												}
												if (local218 == 5509) {
													Static30.method622();
													continue;
												}
												if (local218 == 5510) {
													Static65.method4581();
													continue;
												}
												if (local218 == 5512) {
													Static120.method2498();
													continue;
												}
											} else if (local218 < 5700) {
												if (local218 == 5600) {
													local30 -= 2;
													local3171 = Static230.aStringArray30[local30 + 1];
													local610 = Static230.aStringArray30[local30];
													local26--;
													local1056 = Static47.anIntArray115[local26];
													if (Static204.anInt4047 == 10 && Static174.anInt3541 == 0 && Static141.anInt2799 == 0 && Static228.anInt4576 == 0 && Static176.anInt5566 == 0) {
														Static269.method4238(local1056, local610, local3171);
													}
													continue;
												}
												if (local218 == 5601) {
													Static23.method524();
													continue;
												}
												if (local218 == 5602) {
													if (Static141.anInt2799 == 0) {
														Static140.anInt2773 = -2;
													}
													continue;
												}
												if (local218 == 5603) {
													local26 -= 4;
													if (Static204.anInt4047 == 10 && Static174.anInt3541 == 0 && Static141.anInt2799 == 0 && Static228.anInt4576 == 0 && Static176.anInt5566 == 0) {
														Static261.method4053(Static47.anIntArray115[local26 + 2], Static47.anIntArray115[local26 + 1], Static47.anIntArray115[local26 + 3], Static47.anIntArray115[local26]);
													}
													continue;
												}
												if (local218 == 5604) {
													local30--;
													if (Static204.anInt4047 == 10 && Static174.anInt3541 == 0 && Static141.anInt2799 == 0 && Static228.anInt4576 == 0 && Static176.anInt5566 == 0) {
														Static86.method1425(Static193.method3171(Static230.aStringArray30[local30]));
													}
													continue;
												}
												if (local218 == 5605) {
													local26 -= 7;
													local30 -= 3;
													if (Static204.anInt4047 == 10 && Static174.anInt3541 == 0 && Static141.anInt2799 == 0 && Static228.anInt4576 == 0 && Static176.anInt5566 == 0) {
														Static49.method982(Static230.aStringArray30[local30 + 2], Static47.anIntArray115[local26 + 5] == 1, Static47.anIntArray115[local26 + 2], Static47.anIntArray115[local26 + 4] == 1, Static230.aStringArray30[local30 + 1], Static47.anIntArray115[local26 + 6] == 1, Static193.method3171(Static230.aStringArray30[local30]), Static47.anIntArray115[local26 + 1], Static47.anIntArray115[local26], Static47.anIntArray115[local26 + 3]);
													}
													continue;
												}
												if (local218 == 5606) {
													if (Static228.anInt4576 == 0) {
														Static170.anInt3406 = -2;
													}
													continue;
												}
												if (local218 == 5607) {
													Static47.anIntArray115[local26++] = Static140.anInt2773;
													continue;
												}
												if (local218 == 5608) {
													Static47.anIntArray115[local26++] = Static36.anInt687;
													continue;
												}
												if (local218 == 5609) {
													Static47.anIntArray115[local26++] = Static170.anInt3406;
													continue;
												}
												if (local218 == 5610) {
													for (local829 = 0; local829 < 5; local829++) {
														Static230.aStringArray30[local30++] = Static59.aStringArray7.length > local829 ? Static198.method3235(Static59.aStringArray7[local829]) : "";
													}
													Static59.aStringArray7 = null;
													continue;
												}
												if (local218 == 5611) {
													Static47.anIntArray115[local26++] = Static121.anInt2457;
													continue;
												}
											} else if (local218 < 6100) {
												if (local218 == 6001) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													if (local829 < 1) {
														local829 = 1;
													}
													if (local829 > 4) {
														local829 = 4;
													}
													Static248.anInt4872 = local829;
													if (!Static251.aBoolean330 || !Static253.aBoolean335) {
														if (Static248.anInt4872 == 1) {
															Static283.method4413(0.9F);
														}
														if (Static248.anInt4872 == 2) {
															Static283.method4413(0.8F);
														}
														if (Static248.anInt4872 == 3) {
															Static283.method4413(0.7F);
														}
														if (Static248.anInt4872 == 4) {
															Static283.method4413(0.6F);
														}
													}
													if (Static251.aBoolean330) {
														Static197.method3207();
														if (!Static253.aBoolean335) {
															Static212.method3323();
														}
													}
													Static180.method2936();
													Static204.method3268(Static95.aClass184_3);
													Static136.aBoolean173 = false;
													continue;
												}
												if (local218 == 6002) {
													local26--;
													Static70.method1195(Static47.anIntArray115[local26] == 1);
													Static20.method2335();
													Static212.method3323();
													Static141.method2264();
													Static204.method3268(Static95.aClass184_3);
													Static136.aBoolean173 = false;
													continue;
												}
												if (local218 == 6003) {
													local26--;
													Static59.aBoolean75 = Static47.anIntArray115[local26] == 1;
													Static141.method2264();
													Static204.method3268(Static95.aClass184_3);
													Static136.aBoolean173 = false;
													continue;
												}
												if (local218 == 6005) {
													local26--;
													Static70.aBoolean83 = Static47.anIntArray115[local26] == 1;
													Static212.method3323();
													Static204.method3268(Static95.aClass184_3);
													Static136.aBoolean173 = false;
													continue;
												}
												if (local218 == 6006) {
													local26--;
													Static226.aBoolean286 = Static47.anIntArray115[local26] == 1;
													((Class95_Sub1) Static283.anInterface1_1).method2447(!Static226.aBoolean286);
													Static204.method3268(Static95.aClass184_3);
													Static136.aBoolean173 = false;
													continue;
												}
												if (local218 == 6007) {
													local26--;
													Static85.aBoolean102 = Static47.anIntArray115[local26] == 1;
													Static204.method3268(Static95.aClass184_3);
													Static136.aBoolean173 = false;
													continue;
												}
												if (local218 == 6008) {
													local26--;
													Static127.aBoolean163 = Static47.anIntArray115[local26] == 1;
													Static204.method3268(Static95.aClass184_3);
													Static136.aBoolean173 = false;
													continue;
												}
												if (local218 == 6009) {
													local26--;
													Static208.aBoolean248 = Static47.anIntArray115[local26] == 1;
													Static204.method3268(Static95.aClass184_3);
													Static136.aBoolean173 = false;
													continue;
												}
												if (local218 == 6010) {
													local26--;
													Static114.aBoolean143 = Static47.anIntArray115[local26] == 1;
													Static204.method3268(Static95.aClass184_3);
													Static136.aBoolean173 = false;
													continue;
												}
												if (local218 == 6011) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													if (local829 < 0 || local829 > 2) {
														local829 = 0;
													}
													Static154.anInt3207 = local829;
													Static204.method3268(Static95.aClass184_3);
													Static136.aBoolean173 = false;
													continue;
												}
												if (local218 == 6012) {
													if (Static251.aBoolean330) {
														Static126.method2046(0, 0);
													}
													local26--;
													Static253.aBoolean335 = Static47.anIntArray115[local26] == 1;
													if (Static251.aBoolean330 && Static253.aBoolean335) {
														Static283.method4413(0.7F);
													} else {
														if (Static248.anInt4872 == 1) {
															Static283.method4413(0.9F);
														}
														if (Static248.anInt4872 == 2) {
															Static283.method4413(0.8F);
														}
														if (Static248.anInt4872 == 3) {
															Static283.method4413(0.7F);
														}
														if (Static248.anInt4872 == 4) {
															Static283.method4413(0.6F);
														}
													}
													Static212.method3323();
													Static204.method3268(Static95.aClass184_3);
													Static136.aBoolean173 = false;
													continue;
												}
												if (local218 == 6014) {
													local26--;
													Static304.aBoolean404 = Static47.anIntArray115[local26] == 1;
													if (Static251.aBoolean330) {
														Static212.method3323();
													}
													Static204.method3268(Static95.aClass184_3);
													Static136.aBoolean173 = false;
													continue;
												}
												if (local218 == 6015) {
													local26--;
													Static50.aBoolean66 = Static47.anIntArray115[local26] == 1;
													if (Static251.aBoolean330) {
														Static197.method3207();
													}
													Static204.method3268(Static95.aClass184_3);
													Static136.aBoolean173 = false;
													continue;
												}
												if (local218 == 6016) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													if (Static251.aBoolean330) {
														Static66.aBoolean338 = true;
													}
													if (local829 < 0 || local829 > 2) {
														local829 = 0;
													}
													Static174.anInt3538 = local829;
													continue;
												}
												if (local218 == 6017) {
													local26--;
													Static159.aBoolean209 = Static47.anIntArray115[local26] == 1;
													Static35.method225();
													Static204.method3268(Static95.aClass184_3);
													Static136.aBoolean173 = false;
													continue;
												}
												if (local218 == 6018) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													if (local829 < 0) {
														local829 = 0;
													}
													if (local829 > 127) {
														local829 = 127;
													}
													Static265.anInt5214 = local829;
													Static204.method3268(Static95.aClass184_3);
													Static136.aBoolean173 = false;
													continue;
												}
												if (local218 == 6019) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													if (local829 < 0) {
														local829 = 0;
													}
													if (local829 > 255) {
														local829 = 255;
													}
													if (local829 != Static279.anInt5471) {
														if (Static279.anInt5471 == 0 && Static111.anInt2209 != -1) {
															Static94.method1557(Static111.anInt2209, local829, Static145.aClass22_101);
															Static64.aBoolean80 = false;
														} else if (local829 == 0) {
															Static268.method4234();
															Static64.aBoolean80 = false;
														} else {
															Static73.method1226(local829);
														}
														Static279.anInt5471 = local829;
													}
													Static204.method3268(Static95.aClass184_3);
													Static136.aBoolean173 = false;
													continue;
												}
												if (local218 == 6020) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													if (local829 < 0) {
														local829 = 0;
													}
													if (local829 > 127) {
														local829 = 127;
													}
													Static192.anInt815 = local829;
													Static204.method3268(Static95.aClass184_3);
													Static136.aBoolean173 = false;
													continue;
												}
												if (local218 == 6021) {
													local26--;
													Static5.aBoolean9 = Static47.anIntArray115[local26] == 1;
													Static141.method2264();
													continue;
												}
												if (local218 == 6023) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													if (local829 < 0) {
														local829 = 0;
													}
													local1558 = false;
													if (local829 > 2) {
														local829 = 2;
													}
													if (Static160.anInt3283 < 96) {
														local829 = 0;
														local1558 = true;
													}
													Static117.method1978(local829);
													Static204.method3268(Static95.aClass184_3);
													Static136.aBoolean173 = false;
													Static47.anIntArray115[local26++] = local1558 ? 0 : 1;
													continue;
												}
												if (local218 == 6024) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													if (local829 < 0 || local829 > 2) {
														local829 = 0;
													}
													Static188.anInt5754 = local829;
													Static204.method3268(Static95.aClass184_3);
													continue;
												}
												if (local218 == 6027) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													if (!Static251.aBoolean330) {
														continue;
													}
													if (local829 < 0 || local829 > 1) {
														local829 = 0;
													}
													Static214.method4431(local829 == 1);
													continue;
												}
												if (local218 == 6028) {
													local26--;
													Static106.aBoolean121 = Static47.anIntArray115[local26] != 0;
													Static204.method3268(Static95.aClass184_3);
													continue;
												}
											} else if (local218 < 6200) {
												if (local218 == 6101) {
													Static47.anIntArray115[local26++] = Static248.anInt4872;
													continue;
												}
												if (local218 == 6102) {
													Static47.anIntArray115[local26++] = Static162.method2605() ? 1 : 0;
													continue;
												}
												if (local218 == 6103) {
													Static47.anIntArray115[local26++] = Static59.aBoolean75 ? 1 : 0;
													continue;
												}
												if (local218 == 6105) {
													Static47.anIntArray115[local26++] = Static70.aBoolean83 ? 1 : 0;
													continue;
												}
												if (local218 == 6106) {
													Static47.anIntArray115[local26++] = Static226.aBoolean286 ? 1 : 0;
													continue;
												}
												if (local218 == 6107) {
													Static47.anIntArray115[local26++] = Static85.aBoolean102 ? 1 : 0;
													continue;
												}
												if (local218 == 6108) {
													Static47.anIntArray115[local26++] = Static127.aBoolean163 ? 1 : 0;
													continue;
												}
												if (local218 == 6109) {
													Static47.anIntArray115[local26++] = Static208.aBoolean248 ? 1 : 0;
													continue;
												}
												if (local218 == 6110) {
													Static47.anIntArray115[local26++] = Static114.aBoolean143 ? 1 : 0;
													continue;
												}
												if (local218 == 6111) {
													Static47.anIntArray115[local26++] = Static154.anInt3207;
													continue;
												}
												if (local218 == 6112) {
													Static47.anIntArray115[local26++] = Static253.aBoolean335 ? 1 : 0;
													continue;
												}
												if (local218 == 6114) {
													Static47.anIntArray115[local26++] = Static304.aBoolean404 ? 1 : 0;
													continue;
												}
												if (local218 == 6115) {
													Static47.anIntArray115[local26++] = Static50.aBoolean66 ? 1 : 0;
													continue;
												}
												if (local218 == 6116) {
													Static47.anIntArray115[local26++] = Static174.anInt3538;
													continue;
												}
												if (local218 == 6117) {
													Static47.anIntArray115[local26++] = Static159.aBoolean209 ? 1 : 0;
													continue;
												}
												if (local218 == 6118) {
													Static47.anIntArray115[local26++] = Static265.anInt5214;
													continue;
												}
												if (local218 == 6119) {
													Static47.anIntArray115[local26++] = Static279.anInt5471;
													continue;
												}
												if (local218 == 6120) {
													Static47.anIntArray115[local26++] = Static192.anInt815;
													continue;
												}
												if (local218 == 6121) {
													if (Static251.aBoolean330) {
														Static47.anIntArray115[local26++] = Static251.aBoolean328 ? 1 : 0;
													} else {
														Static47.anIntArray115[local26++] = 0;
													}
													continue;
												}
												if (local218 == 6123) {
													Static47.anIntArray115[local26++] = Static117.method1983();
													continue;
												}
												if (local218 == 6124) {
													Static47.anIntArray115[local26++] = Static188.anInt5754;
													continue;
												}
												if (local218 == 6126) {
													if (Static251.aBoolean330) {
														Static47.anIntArray115[local26++] = Static281.method4367() ? 1 : 0;
													} else {
														Static47.anIntArray115[local26++] = 0;
													}
													continue;
												}
												if (local218 == 6127) {
													Static47.anIntArray115[local26++] = Static74.aBoolean87 ? 1 : 0;
													continue;
												}
												if (local218 == 6128) {
													Static47.anIntArray115[local26++] = Static106.aBoolean121 ? 1 : 0;
													continue;
												}
											} else if (local218 < 6300) {
												if (local218 == 6200) {
													local26 -= 2;
													Static114.aShort17 = (short) Static47.anIntArray115[local26];
													if (Static114.aShort17 <= 0) {
														Static114.aShort17 = 256;
													}
													Static240.aShort23 = (short) Static47.anIntArray115[local26 + 1];
													if (Static240.aShort23 <= 0) {
														Static240.aShort23 = 205;
													}
													continue;
												}
												if (local218 == 6201) {
													local26 -= 2;
													Static168.aShort26 = (short) Static47.anIntArray115[local26];
													if (Static168.aShort26 <= 0) {
														Static168.aShort26 = 256;
													}
													Static207.aShort15 = (short) Static47.anIntArray115[local26 + 1];
													if (Static207.aShort15 <= 0) {
														Static207.aShort15 = 320;
													}
													continue;
												}
												if (local218 == 6202) {
													local26 -= 4;
													Static276.aShort45 = (short) Static47.anIntArray115[local26];
													if (Static276.aShort45 <= 0) {
														Static276.aShort45 = 1;
													}
													Static60.aShort11 = (short) Static47.anIntArray115[local26 + 1];
													if (Static60.aShort11 <= 0) {
														Static60.aShort11 = 32767;
													} else if (Static60.aShort11 < Static276.aShort45) {
														Static60.aShort11 = Static276.aShort45;
													}
													Static101.aShort14 = (short) Static47.anIntArray115[local26 + 2];
													if (Static101.aShort14 <= 0) {
														Static101.aShort14 = 1;
													}
													Static145.aShort46 = (short) Static47.anIntArray115[local26 + 3];
													if (Static145.aShort46 <= 0) {
														Static145.aShort46 = 32767;
													} else if (Static145.aShort46 < Static101.aShort14) {
														Static145.aShort46 = Static101.aShort14;
													}
													continue;
												}
												if (local218 == 6203) {
													Static127.method2070(false, Static304.aClass97_23.anInt3201, 0, Static304.aClass97_23.anInt3190, 0);
													Static47.anIntArray115[local26++] = Static114.anInt2289;
													Static47.anIntArray115[local26++] = Static266.anInt5232;
													continue;
												}
												if (local218 == 6204) {
													Static47.anIntArray115[local26++] = Static168.aShort26;
													Static47.anIntArray115[local26++] = Static207.aShort15;
													continue;
												}
												if (local218 == 6205) {
													Static47.anIntArray115[local26++] = Static114.aShort17;
													Static47.anIntArray115[local26++] = Static240.aShort23;
													continue;
												}
											} else if (local218 < 6400) {
												if (local218 == 6300) {
													Static47.anIntArray115[local26++] = (int) (Static61.method1150() / 60000L);
													continue;
												}
												if (local218 == 6301) {
													Static47.anIntArray115[local26++] = (int) (Static61.method1150() / 86400000L) - 11745;
													continue;
												}
												if (local218 == 6302) {
													local26 -= 3;
													local1056 = Static47.anIntArray115[local26 + 2];
													local823 = Static47.anIntArray115[local26 + 1];
													local829 = Static47.anIntArray115[local26];
													Static241.aCalendar2.clear();
													Static241.aCalendar2.set(11, 12);
													Static241.aCalendar2.set(local1056, local823, local829);
													Static47.anIntArray115[local26++] = (int) (Static241.aCalendar2.getTime().getTime() / 86400000L) - 11745;
													continue;
												}
												if (local218 == 6303) {
													Static241.aCalendar2.clear();
													Static241.aCalendar2.setTime(new Date(Static61.method1150()));
													Static47.anIntArray115[local26++] = Static241.aCalendar2.get(1);
													continue;
												}
												if (local218 == 6304) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													local1558 = true;
													if (local829 < 0) {
														local1558 = (local829 + 1) % 4 == 0;
													} else if (local829 < 1582) {
														local1558 = local829 % 4 == 0;
													} else if (local829 % 4 != 0) {
														local1558 = false;
													} else if (local829 % 100 != 0) {
														local1558 = true;
													} else if (local829 % 400 != 0) {
														local1558 = false;
													}
													Static47.anIntArray115[local26++] = local1558 ? 1 : 0;
													continue;
												}
											} else if (local218 < 6500) {
												if (local218 == 6405) {
													Static47.anIntArray115[local26++] = Static171.method2717() ? 1 : 0;
													continue;
												}
												if (local218 == 6406) {
													Static47.anIntArray115[local26++] = Static237.method3669() ? 1 : 0;
													continue;
												}
											} else if (local218 < 6600) {
												if (local218 == 6500) {
													if (Static204.anInt4047 == 10 && Static174.anInt3541 == 0 && Static141.anInt2799 == 0 && Static228.anInt4576 == 0) {
														Static47.anIntArray115[local26++] = Static113.method1903() == -1 ? 0 : 1;
														continue;
													}
													Static47.anIntArray115[local26++] = 1;
													continue;
												}
												@Pc(5083) Class150 local5083;
												@Pc(5059) Class64_Sub1 local5059;
												if (local218 == 6501) {
													local5059 = Static287.method4481();
													if (local5059 == null) {
														Static47.anIntArray115[local26++] = -1;
														Static47.anIntArray115[local26++] = 0;
														Static230.aStringArray30[local30++] = "";
														Static47.anIntArray115[local26++] = 0;
														Static230.aStringArray30[local30++] = "";
														Static47.anIntArray115[local26++] = 0;
													} else {
														Static47.anIntArray115[local26++] = local5059.anInt4596;
														Static47.anIntArray115[local26++] = local5059.anInt4583;
														Static230.aStringArray30[local30++] = local5059.aString153;
														local5083 = local5059.method3597();
														Static47.anIntArray115[local26++] = local5083.anInt4785;
														Static230.aStringArray30[local30++] = local5083.aString159;
														Static47.anIntArray115[local26++] = local5059.anInt4587;
													}
													continue;
												}
												if (local218 == 6502) {
													local5059 = Static99.method1632();
													if (local5059 == null) {
														Static47.anIntArray115[local26++] = -1;
														Static47.anIntArray115[local26++] = 0;
														Static230.aStringArray30[local30++] = "";
														Static47.anIntArray115[local26++] = 0;
														Static230.aStringArray30[local30++] = "";
														Static47.anIntArray115[local26++] = 0;
													} else {
														Static47.anIntArray115[local26++] = local5059.anInt4596;
														Static47.anIntArray115[local26++] = local5059.anInt4583;
														Static230.aStringArray30[local30++] = local5059.aString153;
														local5083 = local5059.method3597();
														Static47.anIntArray115[local26++] = local5083.anInt4785;
														Static230.aStringArray30[local30++] = local5083.aString159;
														Static47.anIntArray115[local26++] = local5059.anInt4587;
													}
													continue;
												}
												if (local218 == 6503) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													if (Static204.anInt4047 == 10 && Static174.anInt3541 == 0 && Static141.anInt2799 == 0 && Static228.anInt4576 == 0) {
														Static47.anIntArray115[local26++] = Static181.method4700(local829) ? 1 : 0;
														continue;
													}
													Static47.anIntArray115[local26++] = 0;
													continue;
												}
												if (local218 == 6504) {
													local26--;
													Static102.anInt2018 = Static47.anIntArray115[local26];
													Static204.method3268(Static95.aClass184_3);
													continue;
												}
												if (local218 == 6505) {
													Static47.anIntArray115[local26++] = Static102.anInt2018;
													continue;
												}
												if (local218 == 6506) {
													local26--;
													local829 = Static47.anIntArray115[local26];
													@Pc(5305) Class64_Sub1 local5305 = Static272.method4322(local829);
													if (local5305 == null) {
														Static47.anIntArray115[local26++] = -1;
														Static230.aStringArray30[local30++] = "";
														Static47.anIntArray115[local26++] = 0;
														Static230.aStringArray30[local30++] = "";
														Static47.anIntArray115[local26++] = 0;
													} else {
														Static47.anIntArray115[local26++] = local5305.anInt4583;
														Static230.aStringArray30[local30++] = local5305.aString153;
														@Pc(5324) Class150 local5324 = local5305.method3597();
														Static47.anIntArray115[local26++] = local5324.anInt4785;
														Static230.aStringArray30[local30++] = local5324.aString159;
														Static47.anIntArray115[local26++] = local5305.anInt4587;
													}
													continue;
												}
												if (local218 == 6507) {
													local26 -= 4;
													local1056 = Static47.anIntArray115[local26 + 2];
													local1558 = Static47.anIntArray115[local26 + 1] == 1;
													local829 = Static47.anIntArray115[local26];
													local3305 = Static47.anIntArray115[local26 + 3] == 1;
													Static181.method4696(local829, local1056, local1558, local3305);
													continue;
												}
											} else if (local218 < 6700) {
												if (local218 == 6600) {
													local26--;
													Static115.aBoolean148 = Static47.anIntArray115[local26] == 1;
													Static204.method3268(Static95.aClass184_3);
													continue;
												}
												if (local218 == 6601) {
													Static47.anIntArray115[local26++] = Static115.aBoolean148 ? 1 : 0;
													continue;
												}
											}
										} else {
											if (local218 == 5100) {
												if (Static113.aBooleanArray18[86]) {
													Static47.anIntArray115[local26++] = 1;
												} else {
													Static47.anIntArray115[local26++] = 0;
												}
												continue;
											}
											if (local218 == 5101) {
												if (Static113.aBooleanArray18[82]) {
													Static47.anIntArray115[local26++] = 1;
												} else {
													Static47.anIntArray115[local26++] = 0;
												}
												continue;
											}
											if (local218 == 5102) {
												if (Static113.aBooleanArray18[81]) {
													Static47.anIntArray115[local26++] = 1;
												} else {
													Static47.anIntArray115[local26++] = 0;
												}
												continue;
											}
										}
									} else if (local218 == 4400) {
										local26 -= 2;
										local823 = Static47.anIntArray115[local26 + 1];
										local829 = Static47.anIntArray115[local26];
										local2757 = Static58.method2508(local823);
										if (local2757.method1391()) {
											Static230.aStringArray30[local30++] = Static296.method4591(local829).method1901(local2757.aString65, local823);
										} else {
											Static47.anIntArray115[local26++] = Static296.method4591(local829).method1897(local2757.anInt1697, local823);
										}
										continue;
									}
								} else {
									if (local218 == 4100) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										local26--;
										local823 = Static47.anIntArray115[local26];
										Static230.aStringArray30[local30++] = local610 + local823;
										continue;
									}
									if (local218 == 4101) {
										local30 -= 2;
										local610 = Static230.aStringArray30[local30];
										local3171 = Static230.aStringArray30[local30 + 1];
										Static230.aStringArray30[local30++] = local610 + local3171;
										continue;
									}
									if (local218 == 4102) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										local26--;
										local823 = Static47.anIntArray115[local26];
										Static230.aStringArray30[local30++] = local610 + Static37.method1934(local823);
										continue;
									}
									if (local218 == 4103) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										Static230.aStringArray30[local30++] = local610.toLowerCase();
										continue;
									}
									if (local218 == 4104) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										@Pc(9591) long local9591 = ((long) local829 + 11745L) * 86400000L;
										Static241.aCalendar2.setTime(new Date(local9591));
										local659 = Static241.aCalendar2.get(5);
										local3884 = Static241.aCalendar2.get(2);
										local1099 = Static241.aCalendar2.get(1);
										Static230.aStringArray30[local30++] = local659 + "-" + Static255.aStringArray32[local3884] + "-" + local1099;
										continue;
									}
									if (local218 == 4105) {
										local30 -= 2;
										local610 = Static230.aStringArray30[local30];
										local3171 = Static230.aStringArray30[local30 + 1];
										if (Static72.aClass13_Sub5_Sub1_1.aClass175_2 != null && Static72.aClass13_Sub5_Sub1_1.aClass175_2.aBoolean383) {
											Static230.aStringArray30[local30++] = local3171;
											continue;
										}
										Static230.aStringArray30[local30++] = local610;
										continue;
									}
									if (local218 == 4106) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static230.aStringArray30[local30++] = Integer.toString(local829);
										continue;
									}
									if (local218 == 4107) {
										local30 -= 2;
										Static47.anIntArray115[local26++] = Static229.method3601(Static153.method2511(Static187.anInt3840, Static230.aStringArray30[local30], Static230.aStringArray30[local30 + 1]));
										continue;
									}
									if (local218 == 4108) {
										local26 -= 2;
										local30--;
										local610 = Static230.aStringArray30[local30];
										local823 = Static47.anIntArray115[local26];
										local1056 = Static47.anIntArray115[local26 + 1];
										Static47.anIntArray115[local26++] = Static12.method233(local1056).method4096(local610, local823);
										continue;
									}
									if (local218 == 4109) {
										local26 -= 2;
										local30--;
										local610 = Static230.aStringArray30[local30];
										local823 = Static47.anIntArray115[local26];
										local1056 = Static47.anIntArray115[local26 + 1];
										Static47.anIntArray115[local26++] = Static12.method233(local1056).method4100(local610, local823);
										continue;
									}
									if (local218 == 4110) {
										local30 -= 2;
										local610 = Static230.aStringArray30[local30];
										local3171 = Static230.aStringArray30[local30 + 1];
										local26--;
										if (Static47.anIntArray115[local26] == 1) {
											Static230.aStringArray30[local30++] = local610;
										} else {
											Static230.aStringArray30[local30++] = local3171;
										}
										continue;
									}
									if (local218 == 4111) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										Static230.aStringArray30[local30++] = Static124.method4092(local610);
										continue;
									}
									if (local218 == 4112) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										local26--;
										local823 = Static47.anIntArray115[local26];
										if (local823 == -1) {
											throw new RuntimeException("null char");
										}
										Static230.aStringArray30[local30++] = local610 + (char) local823;
										continue;
									}
									if (local218 == 4113) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Static253.method3905((char) local829) ? 1 : 0;
										continue;
									}
									if (local218 == 4114) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Static74.method1257((char) local829) ? 1 : 0;
										continue;
									}
									if (local218 == 4115) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Static126.method2048((char) local829) ? 1 : 0;
										continue;
									}
									if (local218 == 4116) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Static54.method1057((char) local829) ? 1 : 0;
										continue;
									}
									if (local218 == 4117) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										if (local610 == null) {
											Static47.anIntArray115[local26++] = 0;
										} else {
											Static47.anIntArray115[local26++] = local610.length();
										}
										continue;
									}
									if (local218 == 4118) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										local26 -= 2;
										local823 = Static47.anIntArray115[local26];
										local1056 = Static47.anIntArray115[local26 + 1];
										Static230.aStringArray30[local30++] = local610.substring(local823, local1056);
										continue;
									}
									if (local218 == 4119) {
										local30--;
										local610 = Static230.aStringArray30[local30];
										@Pc(10033) StringBuffer local10033 = new StringBuffer(local610.length());
										@Pc(10035) boolean local10035 = false;
										for (local659 = 0; local610.length() > local659; local659++) {
											@Pc(10045) char local10045 = local610.charAt(local659);
											if (local10045 == '<') {
												local10035 = true;
											} else if (local10045 == '>') {
												local10035 = false;
											} else if (!local10035) {
												local10033.append(local10045);
											}
										}
										Static230.aStringArray30[local30++] = local10033.toString();
										continue;
									}
									if (local218 == 4120) {
										local26 -= 2;
										local823 = Static47.anIntArray115[local26];
										local30--;
										local610 = Static230.aStringArray30[local30];
										local1056 = Static47.anIntArray115[local26 + 1];
										Static47.anIntArray115[local26++] = local610.indexOf(local823, local1056);
										continue;
									}
									if (local218 == 4121) {
										local30 -= 2;
										local3171 = Static230.aStringArray30[local30 + 1];
										local610 = Static230.aStringArray30[local30];
										local26--;
										local1056 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = local610.indexOf(local3171, local1056);
										continue;
									}
									if (local218 == 4122) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Character.toLowerCase((char) local829);
										continue;
									}
									if (local218 == 4123) {
										local26--;
										local829 = Static47.anIntArray115[local26];
										Static47.anIntArray115[local26++] = Character.toUpperCase((char) local829);
										continue;
									}
									if (local218 == 4124) {
										local26--;
										local10191 = Static47.anIntArray115[local26] != 0;
										local26--;
										local823 = Static47.anIntArray115[local26];
										Static230.aStringArray30[local30++] = Static224.method3524(0, Static187.anInt3840, (long) local823, local10191);
										continue;
									}
								}
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14847) Exception local14847) {
			if (local18.aString140 == null) {
				if (Static74.anInt1511 != 0) {
					Static173.method2811(0, "Clientscript error - check log for details", "");
				}
				Static204.method3269(local14847, "CS2 - scr:" + local18.aLong211 + " op:" + local38);
			} else {
				@Pc(14884) StringBuffer local14884 = new StringBuffer(30);
				local14884.append("%0a - in: ").append(local18.aString140);
				for (local56 = Static67.anInt1404 - 1; local56 >= 0; local56--) {
					local14884.append("%0a - via: ").append(Static235.aClass115Array1[local56].aClass4_Sub2_Sub16_1.aString140);
				}
				if (local38 == 40) {
					local56 = local36[local28];
					local14884.append("%0a - non-existant gosub script-num: ").append(Integer.toString(local56));
				}
				if (Static74.anInt1511 != 0) {
					Static173.method2811(0, "Clientscript error in: " + local18.aString140, "");
				}
				Static204.method3269(local14847, "CS2 - scr:" + local18.aLong211 + " op:" + local38 + local14884.toString());
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[B)Z")
	public static boolean method646(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class4_Sub24 local8 = new Class4_Sub24(arg0);
		@Pc(25) int local25 = local8.method3110();
		if (local25 != 1) {
			return false;
		}
		@Pc(41) boolean local41 = local8.method3110() == 1;
		if (local41) {
			Static108.method1841(local8);
		}
		Static174.method2883(local8);
		return true;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	public static void method647() {
		Static158.aClass172_27.method4350();
	}
}
