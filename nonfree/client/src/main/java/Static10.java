import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_2;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
	public static int anInt282;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "Lclient!gj;")
	public static Class40 aClass40_1;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "[I")
	public static final int[] anIntArray23 = new int[1000];

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_127 = Static193.method3027("Members object");

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Lclient!oc;")
	public static Class70 aClass70_126 = aClass70_127;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_128 = Static193.method3027(" )2> ");

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_129 = Static193.method3027("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!ke;B)V")
	public static void method245(@OriginalArg(0) Class52 arg0) {
		Static107.aClass52_35 = arg0;
		Static144.anInt2951 = Static107.aClass52_35.method1575(4);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIBIII)V")
	public static void method246(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		Static74.anInt1450 = 0;
		@Pc(147) int local147;
		@Pc(68) int local68;
		@Pc(276) int local276;
		for (@Pc(5) int local5 = -1; local5 < Static80.anInt1607 + Static201.anInt4110; local5++) {
			@Pc(12) Class26_Sub2 local12;
			if (local5 == -1) {
				local12 = Static144.aClass26_Sub2_Sub1_1;
			} else if (Static80.anInt1607 > local5) {
				local12 = Static146.aClass26_Sub2_Sub1Array1[Static76.anIntArray81[local5]];
			} else {
				local12 = Static8.aClass26_Sub2_Sub2Array1[Static80.anIntArray85[local5 - Static80.anInt1607]];
			}
			if (local12 != null && local12.method1861()) {
				@Pc(49) Class3_Sub3_Sub24 local49;
				if (local12 instanceof Class26_Sub2_Sub2) {
					local49 = ((Class26_Sub2_Sub2) local12).aClass3_Sub3_Sub24_1;
					if (local49.anIntArray344 != null) {
						local49 = local49.method3065();
					}
					if (local49 == null) {
						continue;
					}
				}
				if (local5 >= Static80.anInt1607) {
					local49 = ((Class26_Sub2_Sub2) local12).aClass3_Sub3_Sub24_1;
					if (local49.anIntArray344 != null) {
						local49 = local49.method3065();
					}
					if (local49.anInt3957 >= 0 && local49.anInt3957 < Static29.aClass3_Sub3_Sub2_Sub1Array2.length) {
						Static9.method238(local12, local12.method1863() + 15, arg0 >> 1, arg1 >> 1);
						if (Static8.anInt191 > -1) {
							Static29.aClass3_Sub3_Sub2_Sub1Array2[local49.anInt3957].method185(Static8.anInt191 + arg2 - 12, arg3 - (-Static17.anInt363 - -30));
						}
					}
					local276 = 0;
					@Pc(278) Class42[] local278 = Static192.aClass42Array1;
					while (local276 < local278.length) {
						@Pc(284) Class42 local284 = local278[local276];
						if (local284 != null && local284.anInt1605 == 1 && Static80.anIntArray85[local5 - Static80.anInt1607] == local284.anInt1602 && Static184.anInt3760 % 20 < 10) {
							Static9.method238(local12, local12.method1863() + 15, arg0 >> 1, arg1 >> 1);
							if (Static8.anInt191 > -1) {
								Static208.aClass3_Sub3_Sub2_Sub1Array10[local284.anInt1600].method185(arg2 + Static8.anInt191 - 12, Static17.anInt363 + -28 + arg3);
							}
						}
						local276++;
					}
				} else {
					@Pc(66) Class26_Sub2_Sub1 local66 = (Class26_Sub2_Sub1) local12;
					local68 = 30;
					if (local66.anInt1944 != -1 || local66.anInt1959 != -1) {
						Static9.method238(local12, local12.method1863() + 15, arg0 >> 1, arg1 >> 1);
						if (Static8.anInt191 > -1) {
							if (local66.anInt1944 != -1) {
								Static193.aClass3_Sub3_Sub2_Sub1Array11[local66.anInt1944].method185(arg2 + Static8.anInt191 - 12, Static17.anInt363 + -30 + arg3);
								local68 += 25;
							}
							if (local66.anInt1959 != -1) {
								Static29.aClass3_Sub3_Sub2_Sub1Array2[local66.anInt1959].method185(arg2 + Static8.anInt191 - 12, -local68 + Static17.anInt363 + arg3);
								local68 += 25;
							}
						}
					}
					if (local5 >= 0) {
						@Pc(145) Class42[] local145 = Static192.aClass42Array1;
						for (local147 = 0; local147 < local145.length; local147++) {
							@Pc(153) Class42 local153 = local145[local147];
							if (local153 != null && local153.anInt1605 == 10 && Static76.anIntArray81[local5] == local153.anInt1602) {
								Static9.method238(local12, local12.method1863() + 15, arg0 >> 1, arg1 >> 1);
								if (Static8.anInt191 > -1) {
									Static208.aClass3_Sub3_Sub2_Sub1Array10[local153.anInt1600].method185(arg2 + Static8.anInt191 - 12, -local68 + Static17.anInt363 + arg3);
								}
							}
						}
					}
				}
				if (local12.aClass70_1235 != null && (Static80.anInt1607 <= local5 || Static84.anInt1663 == 0 || Static84.anInt1663 == 3 || Static84.anInt1663 == 1 && Static146.method2128(((Class26_Sub2_Sub1) local12).aClass70_952))) {
					Static9.method238(local12, local12.method1863(), arg0 >> 1, arg1 >> 1);
					if (Static8.anInt191 > -1 && Static74.anInt1450 < Static148.anInt3035) {
						Static148.anIntArray213[Static74.anInt1450] = Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6.method3115(local12.aClass70_1235) / 2;
						Static148.anIntArray218[Static74.anInt1450] = Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6.anInt4004;
						Static148.anIntArray216[Static74.anInt1450] = Static8.anInt191;
						Static148.anIntArray219[Static74.anInt1450] = Static17.anInt363;
						Static148.anIntArray217[Static74.anInt1450] = local12.anInt2630;
						Static148.anIntArray214[Static74.anInt1450] = local12.anInt2637;
						Static148.anIntArray215[Static74.anInt1450] = local12.anInt2632;
						Static148.aClass70Array53[Static74.anInt1450] = local12.aClass70_1235;
						Static74.anInt1450++;
					}
				}
				if (Static184.anInt3760 < local12.anInt2626) {
					Static9.method238(local12, local12.method1863() + 15, arg0 >> 1, arg1 >> 1);
					if (Static8.anInt191 > -1) {
						Static104.method3079(arg2 + Static8.anInt191 - 15, Static17.anInt363 + -3 + arg3, local12.anInt2627, 5, 65280);
						Static104.method3079(local12.anInt2627 + Static8.anInt191 + arg2 - 15, arg3 - (-Static17.anInt363 - -3), 30 - local12.anInt2627, 5, 16711680);
					}
				}
				for (local68 = 0; local68 < 4; local68++) {
					if (local12.anIntArray184[local68] > Static184.anInt3760) {
						Static9.method238(local12, local12.method1863() / 2, arg0 >> 1, arg1 >> 1);
						if (Static8.anInt191 > -1) {
							if (local68 == 1) {
								Static17.anInt363 -= 20;
							}
							if (local68 == 2) {
								Static8.anInt191 -= 15;
								Static17.anInt363 -= 10;
							}
							if (local68 == 3) {
								Static8.anInt191 += 15;
								Static17.anInt363 -= 10;
							}
							Static199.aClass3_Sub3_Sub2_Sub1Array12[local12.anIntArray186[local68]].method185(arg2 + Static8.anInt191 - 12, arg3 + -12 - -Static17.anInt363);
							Static1.aClass3_Sub3_Sub2_Sub4_Sub1_5.method3121(Static107.method2404(local12.anIntArray183[local68]), Static8.anInt191 + arg2 - 1, arg3 + Static17.anInt363 - -3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(656) int local656 = 0; local656 < Static74.anInt1450; local656++) {
			@Pc(662) int local662 = Static148.anIntArray219[local656];
			local68 = Static148.anIntArray216[local656];
			local147 = Static148.anIntArray218[local656];
			local276 = Static148.anIntArray213[local656];
			@Pc(676) boolean local676 = true;
			while (local676) {
				local676 = false;
				for (@Pc(682) int local682 = 0; local682 < local656; local682++) {
					if (Static148.anIntArray219[local682] - Static148.anIntArray218[local682] < local662 + 2 && Static148.anIntArray219[local682] + 2 > -local147 + local662 && local68 - local276 < Static148.anIntArray213[local682] + Static148.anIntArray216[local682] && Static148.anIntArray216[local682] - Static148.anIntArray213[local682] < local276 + local68 && local662 > Static148.anIntArray219[local682] - Static148.anIntArray218[local682]) {
						local662 = Static148.anIntArray219[local682] - Static148.anIntArray218[local682];
						local676 = true;
					}
				}
			}
			Static8.anInt191 = Static148.anIntArray216[local656];
			Static17.anInt363 = Static148.anIntArray219[local656] = local662;
			@Pc(778) Class70 local778 = Static148.aClass70Array53[local656];
			if (Static37.anInt3225 == 0) {
				@Pc(800) int local800 = 16776960;
				if (Static148.anIntArray217[local656] < 6) {
					local800 = Static149.anIntArray221[Static148.anIntArray217[local656]];
				}
				if (Static148.anIntArray217[local656] == 6) {
					local800 = Static139.anInt4130 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static148.anIntArray217[local656] == 7) {
					local800 = Static139.anInt4130 % 20 < 10 ? 255 : 65535;
				}
				if (Static148.anIntArray217[local656] == 8) {
					local800 = Static139.anInt4130 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(871) int local871;
				if (Static148.anIntArray217[local656] == 9) {
					local871 = 150 - Static148.anIntArray215[local656];
					if (local871 < 50) {
						local800 = local871 * 1280 + 16711680;
					} else if (local871 < 100) {
						local800 = 16776960 + 16384000 - local871 * 327680;
					} else if (local871 < 150) {
						local800 = local871 * 5 + 65280 - 500;
					}
				}
				if (Static148.anIntArray217[local656] == 10) {
					local871 = 150 - Static148.anIntArray215[local656];
					if (local871 < 50) {
						local800 = local871 * 5 + 16711680;
					} else if (local871 < 100) {
						local800 = 16711935 - (local871 - 50) * 327680;
					} else if (local871 < 150) {
						local800 = local871 * 327680 - (local871 - 100) * 5 - 32767745;
					}
				}
				if (Static148.anIntArray217[local656] == 11) {
					local871 = 150 - Static148.anIntArray215[local656];
					if (local871 < 50) {
						local800 = 16777215 - local871 * 327685;
					} else if (local871 < 100) {
						local800 = local871 * 327685 + 65280 - 16384250;
					} else if (local871 < 150) {
						local800 = 16777215 + 32768000 - local871 * 327680;
					}
				}
				if (Static148.anIntArray214[local656] == 0) {
					Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6.method3121(local778, Static8.anInt191 + arg2, Static17.anInt363 + arg3, local800, 0);
				}
				if (Static148.anIntArray214[local656] == 1) {
					Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6.method3108(local778, arg2 + Static8.anInt191, Static17.anInt363 + arg3, local800, Static139.anInt4130);
				}
				if (Static148.anIntArray214[local656] == 2) {
					Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6.method3119(local778, arg2 + Static8.anInt191, arg3 - -Static17.anInt363, local800, Static139.anInt4130);
				}
				if (Static148.anIntArray214[local656] == 3) {
					Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6.method3104(local778, arg2 + Static8.anInt191, Static17.anInt363 + arg3, local800, Static139.anInt4130, 150 - Static148.anIntArray215[local656]);
				}
				if (Static148.anIntArray214[local656] == 4) {
					local871 = (150 - Static148.anIntArray215[local656]) * (Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6.method3115(local778) + 100) / 150;
					Static104.method3096(arg2 + Static8.anInt191 - 50, arg3, Static8.anInt191 + arg2 + 50, arg0 + arg3);
					Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6.method3126(local778, arg2 + Static8.anInt191 + 50 - local871, arg3 - -Static17.anInt363, local800, 0);
					Static104.method3092(arg2, arg3, arg1 + arg2, arg0 + arg3);
				}
				if (Static148.anIntArray214[local656] == 5) {
					local871 = 150 - Static148.anIntArray215[local656];
					@Pc(1175) int local1175 = 0;
					if (local871 < 25) {
						local1175 = local871 - 25;
					} else if (local871 > 125) {
						local1175 = local871 - 125;
					}
					Static104.method3096(arg2, Static17.anInt363 + arg3 - Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6.anInt4004 - 1, arg1 + arg2, arg3 + Static17.anInt363 + 5);
					Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6.method3121(local778, arg2 + Static8.anInt191, Static17.anInt363 + arg3 - -local1175, local800, 0);
					Static104.method3092(arg2, arg3, arg2 + arg1, arg3 - -arg0);
				}
			} else {
				Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6.method3121(local778, arg2 + Static8.anInt191, arg3 - -Static17.anInt363, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIIZI[II)V")
	public static void method248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9) {
		if (arg2 < Static104.anInt3999) {
			arg3 -= Static104.anInt3999 - arg2;
			arg2 = Static104.anInt3999;
		}
		if (arg2 + arg3 > Static104.anInt3995) {
			arg3 = Static104.anInt3995 - arg2;
		}
		if (Static104.anInt3994 > arg5) {
			arg1 -= Static104.anInt3994 - arg5;
			arg5 = Static104.anInt3994;
		}
		if (arg8 == 9) {
			arg8 = 1;
			arg6 = arg6 + 1 & 0x3;
		}
		@Pc(50) int local50 = Static104.anInt3996 - arg3;
		@Pc(61) int local61 = arg5 * Static104.anInt3996 + arg2;
		if (Static104.anInt3998 < arg1 + arg5) {
			arg1 = Static104.anInt3998 - arg5;
		}
		if (arg8 == 10) {
			arg8 = 1;
			arg6 = arg6 + 3 & 0x3;
		}
		if (arg8 == 11) {
			arg6 = arg6 + 3 & 0x3;
			arg8 = 8;
		}
		@Pc(102) int local102;
		@Pc(106) int local106;
		if (arg8 == 1) {
			if (arg6 == 0) {
				for (local102 = 0; local102 < arg1; local102++) {
					for (local106 = 0; local106 < arg3; local106++) {
						if (local102 >= local106) {
							arg9[local61] = arg0;
						} else if (arg7) {
							arg9[local61] = arg4;
						}
						local61++;
					}
					local61 += local50;
				}
			} else if (arg6 == 1) {
				for (local102 = arg1 - 1; local102 >= 0; local102--) {
					for (local106 = 0; local106 < arg3; local106++) {
						if (local106 <= local102) {
							arg9[local61] = arg0;
						} else if (arg7) {
							arg9[local61] = arg4;
						}
						local61++;
					}
					local61 += local50;
				}
			} else if (arg6 == 2) {
				for (local102 = 0; local102 < arg1; local102++) {
					for (local106 = 0; local106 < arg3; local106++) {
						if (local106 >= local102) {
							arg9[local61] = arg0;
						} else if (arg7) {
							arg9[local61] = arg4;
						}
						local61++;
					}
					local61 += local50;
				}
			} else if (arg6 == 3) {
				for (local102 = arg1 - 1; local102 >= 0; local102--) {
					for (local106 = 0; local106 < arg3; local106++) {
						if (local102 <= local106) {
							arg9[local61] = arg0;
						} else if (arg7) {
							arg9[local61] = arg4;
						}
						local61++;
					}
					local61 += local50;
				}
			}
		} else if (arg8 == 2) {
			if (arg6 == 0) {
				for (local102 = arg1 - 1; local102 >= 0; local102--) {
					for (local106 = 0; local106 < arg3; local106++) {
						if (local102 >> 1 >= local106) {
							arg9[local61] = arg0;
						} else if (arg7) {
							arg9[local61] = arg4;
						}
						local61++;
					}
					local61 += local50;
				}
			} else if (arg6 == 1) {
				for (local102 = 0; local102 < arg1; local102++) {
					for (local106 = 0; local106 < arg3; local106++) {
						if (local106 >= local102 << 1) {
							arg9[local61] = arg0;
						} else if (arg7) {
							arg9[local61] = arg4;
						}
						local61++;
					}
					local61 += local50;
				}
			} else if (arg6 == 2) {
				for (local102 = 0; local102 < arg1; local102++) {
					for (local106 = arg3 - 1; local106 >= 0; local106--) {
						if (local106 <= local102 >> 1) {
							arg9[local61] = arg0;
						} else if (arg7) {
							arg9[local61] = arg4;
						}
						local61++;
					}
					local61 += local50;
				}
			} else if (arg6 == 3) {
				for (local102 = arg1 - 1; local102 >= 0; local102--) {
					for (local106 = arg3 - 1; local106 >= 0; local106--) {
						if (local106 >= local102 << 1) {
							arg9[local61] = arg0;
						} else if (arg7) {
							arg9[local61] = arg4;
						}
						local61++;
					}
					local61 += local50;
				}
			}
		} else if (arg8 == 3) {
			if (arg6 == 0) {
				for (local102 = arg1 - 1; local102 >= 0; local102--) {
					for (local106 = arg3 - 1; local106 >= 0; local106--) {
						if (local102 >> 1 >= local106) {
							arg9[local61] = arg0;
						} else if (arg7) {
							arg9[local61] = arg4;
						}
						local61++;
					}
					local61 += local50;
				}
			} else if (arg6 == 1) {
				for (local102 = arg1 - 1; local102 >= 0; local102--) {
					for (local106 = 0; local106 < arg3; local106++) {
						if (local106 >= local102 << 1) {
							arg9[local61] = arg0;
						} else if (arg7) {
							arg9[local61] = arg4;
						}
						local61++;
					}
					local61 += local50;
				}
			} else if (arg6 == 2) {
				for (local102 = 0; local102 < arg1; local102++) {
					for (local106 = 0; local106 < arg3; local106++) {
						if (local102 >> 1 >= local106) {
							arg9[local61] = arg0;
						} else if (arg7) {
							arg9[local61] = arg4;
						}
						local61++;
					}
					local61 += local50;
				}
			} else if (arg6 == 3) {
				for (local102 = 0; local102 < arg1; local102++) {
					for (local106 = arg3 - 1; local106 >= 0; local106--) {
						if (local106 >= local102 << 1) {
							arg9[local61] = arg0;
						} else if (arg7) {
							arg9[local61] = arg4;
						}
						local61++;
					}
					local61 += local50;
				}
			}
		} else if (arg8 == 4) {
			if (arg6 == 0) {
				for (local102 = arg1 - 1; local102 >= 0; local102--) {
					for (local106 = 0; local106 < arg3; local106++) {
						if (local106 >= local102 >> 1) {
							arg9[local61] = arg0;
						} else if (arg7) {
							arg9[local61] = arg4;
						}
						local61++;
					}
					local61 += local50;
				}
			} else if (arg6 == 1) {
				for (local102 = 0; local102 < arg1; local102++) {
					for (local106 = 0; local106 < arg3; local106++) {
						if (local102 << 1 >= local106) {
							arg9[local61] = arg0;
						} else if (arg7) {
							arg9[local61] = arg4;
						}
						local61++;
					}
					local61 += local50;
				}
			} else if (arg6 == 2) {
				for (local102 = 0; local102 < arg1; local102++) {
					for (local106 = arg3 - 1; local106 >= 0; local106--) {
						if (local106 >= local102 >> 1) {
							arg9[local61] = arg0;
						} else if (arg7) {
							arg9[local61] = arg4;
						}
						local61++;
					}
					local61 += local50;
				}
			} else if (arg6 == 3) {
				for (local102 = arg1 - 1; local102 >= 0; local102--) {
					for (local106 = arg3 - 1; local106 >= 0; local106--) {
						if (local106 <= local102 << 1) {
							arg9[local61] = arg0;
						} else if (arg7) {
							arg9[local61] = arg4;
						}
						local61++;
					}
					local61 += local50;
				}
			}
		} else if (arg8 != 5) {
			if (arg8 == 6) {
				if (arg6 == 0) {
					for (local102 = 0; local102 < arg1; local102++) {
						for (local106 = 0; local106 < arg3; local106++) {
							if (arg3 / 2 >= local106) {
								arg9[local61] = arg0;
							} else if (arg7) {
								arg9[local61] = arg4;
							}
							local61++;
						}
						local61 += local50;
					}
					return;
				}
				if (arg6 == 1) {
					for (local102 = 0; local102 < arg1; local102++) {
						for (local106 = 0; local106 < arg3; local106++) {
							if (local102 <= arg1 / 2) {
								arg9[local61] = arg0;
							} else if (arg7) {
								arg9[local61] = arg4;
							}
							local61++;
						}
						local61 += local50;
					}
					return;
				}
				if (arg6 == 2) {
					for (local102 = 0; local102 < arg1; local102++) {
						for (local106 = 0; local106 < arg3; local106++) {
							if (local106 >= arg3 / 2) {
								arg9[local61] = arg0;
							} else if (arg7) {
								arg9[local61] = arg4;
							}
							local61++;
						}
						local61 += local50;
					}
					return;
				}
				if (arg6 == 3) {
					for (local102 = 0; local102 < arg1; local102++) {
						for (local106 = 0; local106 < arg3; local106++) {
							if (arg1 / 2 <= local102) {
								arg9[local61] = arg0;
							} else if (arg7) {
								arg9[local61] = arg4;
							}
							local61++;
						}
						local61 += local50;
					}
					return;
				}
			}
			if (arg8 == 7) {
				if (arg6 == 0) {
					for (local102 = 0; local102 < arg1; local102++) {
						for (local106 = 0; local106 < arg3; local106++) {
							if (local102 - arg1 / 2 >= local106) {
								arg9[local61] = arg0;
							} else if (arg7) {
								arg9[local61] = arg4;
							}
							local61++;
						}
						local61 += local50;
					}
					return;
				}
				if (arg6 == 1) {
					for (local102 = arg1 - 1; local102 >= 0; local102--) {
						for (local106 = 0; local106 < arg3; local106++) {
							if (local106 <= local102 - arg1 / 2) {
								arg9[local61] = arg0;
							} else if (arg7) {
								arg9[local61] = arg4;
							}
							local61++;
						}
						local61 += local50;
					}
					return;
				}
				if (arg6 == 2) {
					for (local102 = arg1 - 1; local102 >= 0; local102--) {
						for (local106 = arg3 - 1; local106 >= 0; local106--) {
							if (local102 - arg1 / 2 >= local106) {
								arg9[local61] = arg0;
							} else if (arg7) {
								arg9[local61] = arg4;
							}
							local61++;
						}
						local61 += local50;
					}
					return;
				}
				if (arg6 == 3) {
					for (local102 = 0; local102 < arg1; local102++) {
						for (local106 = arg3 - 1; local106 >= 0; local106--) {
							if (local106 <= local102 - arg1 / 2) {
								arg9[local61] = arg0;
							} else if (arg7) {
								arg9[local61] = arg4;
							}
							local61++;
						}
						local61 += local50;
					}
					return;
				}
			}
			if (arg8 == 8) {
				if (arg6 == 0) {
					for (local102 = 0; local102 < arg1; local102++) {
						for (local106 = 0; local106 < arg3; local106++) {
							if (local106 >= local102 - arg1 / 2) {
								arg9[local61] = arg0;
							} else if (arg7) {
								arg9[local61] = arg4;
							}
							local61++;
						}
						local61 += local50;
					}
					return;
				}
				if (arg6 == 1) {
					for (local102 = arg1 - 1; local102 >= 0; local102--) {
						for (local106 = 0; local106 < arg3; local106++) {
							if (local102 - arg1 / 2 <= local106) {
								arg9[local61] = arg0;
							} else if (arg7) {
								arg9[local61] = arg4;
							}
							local61++;
						}
						local61 += local50;
					}
					return;
				}
				if (arg6 == 2) {
					for (local102 = arg1 - 1; local102 >= 0; local102--) {
						for (local106 = arg3 - 1; local106 >= 0; local106--) {
							if (local106 >= local102 - arg1 / 2) {
								arg9[local61] = arg0;
							} else if (arg7) {
								arg9[local61] = arg4;
							}
							local61++;
						}
						local61 += local50;
					}
					return;
				}
				if (arg6 == 3) {
					for (local102 = 0; local102 < arg1; local102++) {
						for (local106 = arg3 - 1; local106 >= 0; local106--) {
							if (local102 - arg1 / 2 <= local106) {
								arg9[local61] = arg0;
							} else if (arg7) {
								arg9[local61] = arg4;
							}
							local61++;
						}
						local61 += local50;
					}
					return;
				}
			}
		} else if (arg6 == 0) {
			for (local102 = arg1 - 1; local102 >= 0; local102--) {
				for (local106 = arg3 - 1; local106 >= 0; local106--) {
					if (local102 >> 1 <= local106) {
						arg9[local61] = arg0;
					} else if (arg7) {
						arg9[local61] = arg4;
					}
					local61++;
				}
				local61 += local50;
			}
		} else if (arg6 == 1) {
			for (local102 = arg1 - 1; local102 >= 0; local102--) {
				for (local106 = 0; local106 < arg3; local106++) {
					if (local106 <= local102 << 1) {
						arg9[local61] = arg0;
					} else if (arg7) {
						arg9[local61] = arg4;
					}
					local61++;
				}
				local61 += local50;
			}
		} else if (arg6 == 2) {
			for (local102 = 0; local102 < arg1; local102++) {
				for (local106 = 0; local106 < arg3; local106++) {
					if (local102 >> 1 <= local106) {
						arg9[local61] = arg0;
					} else if (arg7) {
						arg9[local61] = arg4;
					}
					local61++;
				}
				local61 += local50;
			}
		} else if (arg6 == 3) {
			for (local102 = 0; local102 < arg1; local102++) {
				for (local106 = arg3 - 1; local106 >= 0; local106--) {
					if (local106 <= local102 << 1) {
						arg9[local61] = arg0;
					} else if (arg7) {
						arg9[local61] = arg4;
					}
					local61++;
				}
				local61 += local50;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	public static void method249(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static19.aClass3_Sub3_Sub2_Sub1_1.anIntArray6;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 1;
		}
		@Pc(40) int local40;
		@Pc(42) int local42;
		for (@Pc(30) int local30 = 1; local30 < 103; local30++) {
			local40 = (103 - local30) * 2048 + 24628;
			for (local42 = 1; local42 < 103; local42++) {
				if ((Static17.aByteArrayArrayArray2[arg0][local42][local30] & 0x18) == 0) {
					Static85.method1230(local8, local40, arg0, local42, local30);
				}
				if (arg0 < 3 && (Static17.aByteArrayArrayArray2[arg0 + 1][local42][local30] & 0x8) != 0) {
					Static85.method1230(local8, local40, arg0 + 1, local42, local30);
				}
				local40 += 4;
			}
		}
		Static19.aClass3_Sub3_Sub2_Sub1_1.method200();
		local42 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 228;
		@Pc(147) int local147;
		for (@Pc(143) int local143 = 1; local143 < 103; local143++) {
			for (local147 = 1; local147 < 103; local147++) {
				if ((Static17.aByteArrayArrayArray2[arg0][local147][local143] & 0x18) == 0) {
					Static33.method576(local40, local42, arg0, local143, local147);
				}
				if (arg0 < 3 && (Static17.aByteArrayArrayArray2[arg0 + 1][local147][local143] & 0x8) != 0) {
					Static33.method576(local40, local42, arg0 + 1, local143, local147);
				}
			}
		}
		Static96.anInt2000 = 0;
		for (local147 = 0; local147 < 104; local147++) {
			for (@Pc(214) int local214 = 0; local214 < 104; local214++) {
				@Pc(221) long local221 = Static157.method2364(Static137.anInt2795, local147, local214);
				if (local221 != 0L) {
					@Pc(236) Class3_Sub3_Sub9 local236 = Static161.method2421(Integer.MAX_VALUE & (int) (local221 >>> 32));
					@Pc(239) int local239 = local236.anInt999;
					if (local239 >= 0) {
						@Pc(243) int local243 = local147;
						@Pc(245) int local245 = local214;
						if (local239 != 22 && local239 != 29 && local239 != 34 && local239 != 36 && local239 != 46 && local239 != 47 && local239 != 48) {
							@Pc(281) int[][] local281 = Static28.aClass77Array1[Static137.anInt2795].anIntArrayArray23;
							for (@Pc(283) int local283 = 0; local283 < 10; local283++) {
								@Pc(290) int local290 = (int) (Math.random() * 4.0D);
								if (local290 == 0 && local243 > 0 && local243 > local147 - 3 && (local281[local243 - 1][local245] & 0x12C0108) == 0) {
									local243--;
								}
								if (local290 == 1 && local243 < 103 && local243 < local147 + 3 && (local281[local243 + 1][local245] & 0x12C0180) == 0) {
									local243++;
								}
								if (local290 == 2 && local245 > 0 && local214 - 3 < local245 && (local281[local243][local245 - 1] & 0x12C0102) == 0) {
									local245--;
								}
								if (local290 == 3 && local245 < 103 && local214 + 3 > local245 && (local281[local243][local245 + 1] & 0x12C0120) == 0) {
									local245++;
								}
							}
						}
						Static73.anIntArray78[Static96.anInt2000] = local236.anInt992;
						Static85.anIntArray90[Static96.anInt2000] = local243;
						Static201.anIntArray357[Static96.anInt2000] = local245;
						Static96.anInt2000++;
					}
				}
			}
		}
		Static190.aClass22_1.method2341();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)I")
	public static int method250() {
		@Pc(14) int local14 = Static107.method2399(Static54.anInt1158, Static130.anInt2546, Static137.anInt2795);
		return local14 - Static118.anInt2400 >= 800 || (Static17.aByteArrayArrayArray2[Static137.anInt2795][Static130.anInt2546 >> 7][Static54.anInt1158 >> 7] & 0x4) == 0 ? 3 : Static137.anInt2795;
	}
}
