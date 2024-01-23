import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "Lclient!ti;")
	public static Class1_Sub2_Sub20 aClass1_Sub2_Sub20_1;

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "Lclient!ji;")
	public static Interface3 anInterface3_1 = null;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!gi;)V")
	public static void method367(@OriginalArg(1) Class15_Sub5 arg0) {
		arg0.aBoolean372 = false;
		@Pc(18) Class157 local18;
		if (arg0.anInt5569 != -1) {
			local18 = Static80.method1561(arg0.anInt5569);
			if (local18 == null || local18.anIntArray396 == null) {
				arg0.anInt5569 = -1;
			} else {
				arg0.anInt5544++;
				if (local18.anIntArray396.length > arg0.anInt5521 && arg0.anInt5544 > local18.anIntArray395[arg0.anInt5521]) {
					arg0.anInt5516++;
					arg0.anInt5521++;
					arg0.anInt5544 = 1;
					Static31.method503(local18, arg0.anInt5521, arg0.anInt5557, Static90.aClass15_Sub5_Sub2_2 == arg0, arg0.anInt5559);
				}
				if (arg0.anInt5521 >= local18.anIntArray396.length) {
					arg0.anInt5521 = 0;
					arg0.anInt5544 = 0;
					Static31.method503(local18, arg0.anInt5521, arg0.anInt5557, arg0 == Static90.aClass15_Sub5_Sub2_2, arg0.anInt5559);
				}
				arg0.anInt5516 = arg0.anInt5521 + 1;
				if (local18.anIntArray396.length <= arg0.anInt5516) {
					arg0.anInt5516 = 0;
				}
			}
		}
		@Pc(159) Class157 local159;
		if (arg0.anInt5510 != -1 && Static313.anInt2966 >= arg0.anInt5535) {
			@Pc(143) Class114 local143 = Static55.method978(arg0.anInt5510);
			@Pc(146) int local146 = local143.anInt3473;
			if (local146 == -1) {
				arg0.anInt5510 = -1;
			} else {
				label305: {
					local159 = Static80.method1561(local146);
					if (local143.aBoolean235) {
						if (local159.anInt4528 == 3) {
							if (arg0.anInt5589 > 0 && arg0.anInt5564 <= Static313.anInt2966 && Static313.anInt2966 > arg0.anInt5571) {
								arg0.anInt5510 = -1;
								break label305;
							}
						} else if (local159.anInt4528 == 1 && arg0.anInt5589 > 0 && arg0.anInt5564 <= Static313.anInt2966 && arg0.anInt5571 < Static313.anInt2966) {
							arg0.anInt5535 = Static313.anInt2966 + 1;
							break label305;
						}
					}
					if (local159 == null || local159.anIntArray396 == null) {
						arg0.anInt5510 = -1;
					} else {
						if (arg0.anInt5590 < 0) {
							arg0.anInt5590 = 0;
							Static31.method503(local159, 0, arg0.anInt5557, arg0 == Static90.aClass15_Sub5_Sub2_2, arg0.anInt5559);
						}
						arg0.anInt5547++;
						if (arg0.anInt5590 < local159.anIntArray396.length && local159.anIntArray395[arg0.anInt5590] < arg0.anInt5547) {
							arg0.anInt5590++;
							arg0.anInt5547 = 1;
							Static31.method503(local159, arg0.anInt5590, arg0.anInt5557, arg0 == Static90.aClass15_Sub5_Sub2_2, arg0.anInt5559);
						}
						if (local159.anIntArray396.length <= arg0.anInt5590) {
							if (local143.aBoolean235) {
								arg0.anInt5590 -= local159.anInt4530;
								arg0.anInt5567++;
								if (local159.anInt4519 <= arg0.anInt5567) {
									arg0.anInt5510 = -1;
								} else if (arg0.anInt5590 >= 0 && local159.anIntArray396.length > arg0.anInt5590) {
									Static31.method503(local159, arg0.anInt5590, arg0.anInt5557, arg0 == Static90.aClass15_Sub5_Sub2_2, arg0.anInt5559);
								} else {
									arg0.anInt5510 = -1;
								}
							} else {
								arg0.anInt5510 = -1;
							}
						}
						arg0.anInt5580 = arg0.anInt5590 + 1;
						if (arg0.anInt5580 >= local159.anIntArray396.length) {
							if (local143.aBoolean235) {
								arg0.anInt5580 -= local159.anInt4530;
								if (local159.anInt4519 <= arg0.anInt5567 + 1) {
									arg0.anInt5580 = -1;
								} else if (arg0.anInt5580 < 0 || arg0.anInt5580 >= local159.anIntArray396.length) {
									arg0.anInt5580 = -1;
								}
							} else {
								arg0.anInt5580 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5594 != -1 && arg0.anInt5585 <= 1) {
			local18 = Static80.method1561(arg0.anInt5594);
			if (local18.anInt4528 == 3) {
				if (arg0.anInt5589 > 0 && arg0.anInt5564 <= Static313.anInt2966 && arg0.anInt5571 < Static313.anInt2966) {
					arg0.anInt5594 = -1;
				}
			} else if (local18.anInt4528 == 1 && arg0.anInt5589 > 0 && arg0.anInt5564 <= Static313.anInt2966 && Static313.anInt2966 > arg0.anInt5571) {
				arg0.anInt5585 = 2;
			}
		}
		if (arg0.anInt5594 != -1 && arg0.anInt5585 == 0) {
			local18 = Static80.method1561(arg0.anInt5594);
			if (local18 == null || local18.anIntArray396 == null) {
				arg0.anInt5594 = -1;
			} else {
				arg0.anInt5539++;
				if (local18.anIntArray396.length > arg0.anInt5537 && arg0.anInt5539 > local18.anIntArray395[arg0.anInt5537]) {
					arg0.anInt5539 = 1;
					arg0.anInt5537++;
					Static31.method503(local18, arg0.anInt5537, arg0.anInt5557, arg0 == Static90.aClass15_Sub5_Sub2_2, arg0.anInt5559);
				}
				if (local18.anIntArray396.length <= arg0.anInt5537) {
					arg0.anInt5537 -= local18.anInt4530;
					arg0.anInt5538++;
					if (arg0.anInt5538 >= local18.anInt4519) {
						arg0.anInt5594 = -1;
					} else if (arg0.anInt5537 >= 0 && arg0.anInt5537 < local18.anIntArray396.length) {
						Static31.method503(local18, arg0.anInt5537, arg0.anInt5557, Static90.aClass15_Sub5_Sub2_2 == arg0, arg0.anInt5559);
					} else {
						arg0.anInt5594 = -1;
					}
				}
				arg0.anInt5522 = arg0.anInt5537 + 1;
				if (arg0.anInt5522 >= local18.anIntArray396.length) {
					arg0.anInt5522 -= local18.anInt4530;
					if (arg0.anInt5538 + 1 >= local18.anInt4519) {
						arg0.anInt5522 = -1;
					} else if (arg0.anInt5522 < 0 || local18.anIntArray396.length <= arg0.anInt5522) {
						arg0.anInt5522 = -1;
					}
				}
				arg0.aBoolean372 = local18.aBoolean311;
			}
		}
		if (arg0.anInt5585 > 0) {
			arg0.anInt5585--;
		}
		for (@Pc(738) int local738 = 0; local738 < arg0.aClass14Array3.length; local738++) {
			@Pc(752) Class14 local752 = arg0.aClass14Array3[local738];
			if (local752 != null) {
				if (local752.anInt226 > 0) {
					local752.anInt226--;
				} else {
					local159 = Static80.method1561(local752.anInt236);
					if (local159 == null || local159.anIntArray396 == null) {
						arg0.aClass14Array3[local738] = null;
					} else {
						local752.anInt229++;
						if (local752.anInt232 < local159.anIntArray396.length && local752.anInt229 > local159.anIntArray395[local752.anInt232]) {
							local752.anInt229 = 1;
							local752.anInt232++;
							Static31.method503(local159, local752.anInt232, arg0.anInt5557, arg0 == Static90.aClass15_Sub5_Sub2_2, arg0.anInt5559);
						}
						if (local752.anInt232 >= local159.anIntArray396.length) {
							local752.anInt232 -= local159.anInt4530;
							local752.anInt227++;
							if (local752.anInt227 >= local159.anInt4519) {
								arg0.aClass14Array3[local738] = null;
							} else if (local752.anInt232 >= 0 && local159.anIntArray396.length > local752.anInt232) {
								Static31.method503(local159, local752.anInt232, arg0.anInt5557, Static90.aClass15_Sub5_Sub2_2 == arg0, arg0.anInt5559);
							} else {
								arg0.aClass14Array3[local738] = null;
							}
						}
						local752.anInt234 = local752.anInt232 + 1;
						if (local159.anIntArray396.length <= local752.anInt234) {
							local752.anInt234 -= local159.anInt4530;
							if (local752.anInt227 + 1 >= local159.anInt4519) {
								local752.anInt234 = -1;
							} else if (local752.anInt234 < 0 || local159.anIntArray396.length <= local752.anInt234) {
								local752.anInt234 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "()V")
	public static void method369() {
		Static60.anInt1160 = 0;
		label194: for (@Pc(3) int local3 = 0; local3 < Static116.anInt2465; local3++) {
			@Pc(10) Class91 local10 = Static255.aClass91Array2[local3];
			@Pc(14) int local14;
			if (Static70.anIntArray119 != null) {
				for (local14 = 0; local14 < Static70.anIntArray119.length; local14++) {
					if (Static70.anIntArray119[local14] != -1000000 && (local10.anInt2887 <= Static70.anIntArray119[local14] || local10.anInt2884 <= Static70.anIntArray119[local14]) && (local10.anInt2878 <= Static137.anIntArray233[local14] || local10.anInt2873 <= Static137.anIntArray233[local14]) && (local10.anInt2878 >= Static126.anIntArray159[local14] || local10.anInt2873 >= Static126.anIntArray159[local14]) && (local10.anInt2877 <= Static80.anIntArray140[local14] || local10.anInt2888 <= Static80.anIntArray140[local14]) && (local10.anInt2877 >= Static55.anIntArray63[local14] || local10.anInt2888 >= Static55.anIntArray63[local14])) {
						continue label194;
					}
				}
			}
			@Pc(115) int local115;
			@Pc(126) int local126;
			@Pc(158) int local158;
			@Pc(137) boolean local137;
			if (local10.anInt2891 == 1) {
				local14 = local10.anInt2874 + Static213.anInt4456 - Static13.anInt184;
				if (local14 >= 0 && local14 <= Static213.anInt4456 + Static213.anInt4456) {
					local115 = local10.anInt2875 + Static213.anInt4456 - Static84.anInt1660;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt2886 + Static213.anInt4456 - Static84.anInt1660;
					if (local126 > Static213.anInt4456 + Static213.anInt4456) {
						local126 = Static213.anInt4456 + Static213.anInt4456;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static186.aBooleanArrayArray4[local14][local115++]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static160.anInt3163 - local10.anInt2878;
						if (local158 > 32) {
							local10.anInt2879 = 1;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt2879 = 2;
							local158 = -local158;
						}
						local10.anInt2890 = (local10.anInt2877 - Static100.anInt2013 << 8) / local158;
						local10.anInt2881 = (local10.anInt2888 - Static100.anInt2013 << 8) / local158;
						local10.anInt2871 = (local10.anInt2887 - Static193.anInt3671 << 8) / local158;
						local10.anInt2889 = (local10.anInt2884 - Static193.anInt3671 << 8) / local158;
						Static145.aClass91Array1[Static60.anInt1160++] = local10;
					}
				}
			} else if (local10.anInt2891 == 2) {
				local14 = local10.anInt2875 + Static213.anInt4456 - Static84.anInt1660;
				if (local14 >= 0 && local14 <= Static213.anInt4456 + Static213.anInt4456) {
					local115 = local10.anInt2874 + Static213.anInt4456 - Static13.anInt184;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt2883 + Static213.anInt4456 - Static13.anInt184;
					if (local126 > Static213.anInt4456 + Static213.anInt4456) {
						local126 = Static213.anInt4456 + Static213.anInt4456;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static186.aBooleanArrayArray4[local115++][local14]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static100.anInt2013 - local10.anInt2877;
						if (local158 > 32) {
							local10.anInt2879 = 3;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt2879 = 4;
							local158 = -local158;
						}
						local10.anInt2880 = (local10.anInt2878 - Static160.anInt3163 << 8) / local158;
						local10.anInt2870 = (local10.anInt2873 - Static160.anInt3163 << 8) / local158;
						local10.anInt2871 = (local10.anInt2887 - Static193.anInt3671 << 8) / local158;
						local10.anInt2889 = (local10.anInt2884 - Static193.anInt3671 << 8) / local158;
						Static145.aClass91Array1[Static60.anInt1160++] = local10;
					}
				}
			} else if (local10.anInt2891 == 4) {
				local14 = local10.anInt2887 - Static193.anInt3671;
				if (local14 > 128) {
					local115 = local10.anInt2875 + Static213.anInt4456 - Static84.anInt1660;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt2886 + Static213.anInt4456 - Static84.anInt1660;
					if (local126 > Static213.anInt4456 + Static213.anInt4456) {
						local126 = Static213.anInt4456 + Static213.anInt4456;
					}
					if (local115 <= local126) {
						@Pc(408) int local408 = local10.anInt2874 + Static213.anInt4456 - Static13.anInt184;
						if (local408 < 0) {
							local408 = 0;
						}
						local158 = local10.anInt2883 + Static213.anInt4456 - Static13.anInt184;
						if (local158 > Static213.anInt4456 + Static213.anInt4456) {
							local158 = Static213.anInt4456 + Static213.anInt4456;
						}
						@Pc(430) boolean local430 = false;
						label166: for (@Pc(432) int local432 = local408; local432 <= local158; local432++) {
							for (@Pc(437) int local437 = local115; local437 <= local126; local437++) {
								if (Static186.aBooleanArrayArray4[local432][local437]) {
									local430 = true;
									break label166;
								}
							}
						}
						if (local430) {
							local10.anInt2879 = 5;
							local10.anInt2880 = (local10.anInt2878 - Static160.anInt3163 << 8) / local14;
							local10.anInt2870 = (local10.anInt2873 - Static160.anInt3163 << 8) / local14;
							local10.anInt2890 = (local10.anInt2877 - Static100.anInt2013 << 8) / local14;
							local10.anInt2881 = (local10.anInt2888 - Static100.anInt2013 << 8) / local14;
							Static145.aClass91Array1[Static60.anInt1160++] = local10;
						}
					}
				}
			}
		}
	}
}
