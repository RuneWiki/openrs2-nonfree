import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Z")
	public static boolean aBoolean95 = false;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)[Lclient!rj;")
	public static Class2_Sub3_Sub1[] method1069() {
		@Pc(8) Class2_Sub3_Sub1[] local8 = new Class2_Sub3_Sub1[Static27.anInt576];
		for (@Pc(10) int local10 = 0; local10 < Static27.anInt576; local10++) {
			@Pc(21) int local21 = Static19.anIntArray30[local10] * Static30.anIntArray46[local10];
			@Pc(25) byte[] local25 = Static273.aByteArrayArray115[local10];
			@Pc(28) int[] local28 = new int[local21];
			for (@Pc(30) int local30 = 0; local30 < local21; local30++) {
				local28[local30] = Static187.anIntArray314[local25[local30] & 0xFF];
			}
			if (Static60.aBoolean106) {
				local8[local10] = new Class2_Sub3_Sub1_Sub2(Static148.anInt3175, Static260.anInt5414, Static262.anIntArray528[local10], Static40.anIntArray59[local10], Static30.anIntArray46[local10], Static19.anIntArray30[local10], local28);
			} else {
				local8[local10] = new Class2_Sub3_Sub1_Sub1(Static148.anInt3175, Static260.anInt5414, Static262.anIntArray528[local10], Static40.anIntArray59[local10], Static30.anIntArray46[local10], Static19.anIntArray30[local10], local28);
			}
		}
		Static171.method2953();
		return local8;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)I")
	public static int method1070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static134.aByteArrayArrayArray9[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static134.aByteArrayArrayArray9[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)J")
	public static long method1072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub31 local7 = Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt5708; local13++) {
			@Pc(22) Class34 local22 = local7.aClass34Array2[local13];
			if ((local22.aLong49 >> 29 & 0x3L) == 2L && local22.anInt894 == arg1 && local22.anInt897 == arg2) {
				return local22.aLong49;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!t;)V")
	public static void method1075(@OriginalArg(1) Class36_Sub3 arg0) {
		arg0.aBoolean421 = false;
		@Pc(20) Class15 local20;
		if (arg0.anInt5138 != -1) {
			local20 = Static35.method706(arg0.anInt5138);
			if (local20 == null || local20.anIntArray26 == null) {
				arg0.anInt5138 = -1;
			} else {
				arg0.anInt5082++;
				if (local20.anIntArray26.length > arg0.anInt5119 && local20.anIntArray28[arg0.anInt5119] < arg0.anInt5082) {
					arg0.anInt5082 = 1;
					arg0.anInt5119++;
					arg0.anInt5078++;
					Static225.method3777(arg0.anInt5119, arg0 == Static111.aClass36_Sub3_Sub2_1, arg0.anInt5109, local20, arg0.anInt5093);
				}
				if (arg0.anInt5119 >= local20.anIntArray26.length) {
					arg0.anInt5119 = 0;
					arg0.anInt5082 = 0;
					Static225.method3777(arg0.anInt5119, Static111.aClass36_Sub3_Sub2_1 == arg0, arg0.anInt5109, local20, arg0.anInt5093);
				}
				arg0.anInt5078 = arg0.anInt5119 + 1;
				if (arg0.anInt5078 >= local20.anIntArray26.length) {
					arg0.anInt5078 = 0;
				}
			}
		}
		@Pc(149) Class15 local149;
		if (arg0.anInt5125 != -1 && arg0.anInt5112 <= Static148.anInt3168) {
			@Pc(139) Class167 local139 = Static208.method3532(arg0.anInt5125);
			@Pc(142) int local142 = local139.anInt5405;
			if (local142 == -1) {
				arg0.anInt5125 = -1;
			} else {
				label308: {
					local149 = Static35.method706(local142);
					if (local139.aBoolean436) {
						if (local149.anInt432 == 3) {
							if (arg0.anInt5077 > 0 && Static148.anInt3168 >= arg0.anInt5121 && arg0.anInt5123 < Static148.anInt3168) {
								arg0.anInt5125 = -1;
								break label308;
							}
						} else if (local149.anInt432 == 1 && arg0.anInt5077 > 0 && Static148.anInt3168 >= arg0.anInt5121 && Static148.anInt3168 > arg0.anInt5123) {
							arg0.anInt5112 = Static148.anInt3168 + 1;
							break label308;
						}
					}
					if (local149 == null || local149.anIntArray26 == null) {
						arg0.anInt5125 = -1;
					} else {
						if (arg0.anInt5129 < 0) {
							arg0.anInt5129 = 0;
							Static225.method3777(0, arg0 == Static111.aClass36_Sub3_Sub2_1, arg0.anInt5109, local149, arg0.anInt5093);
						}
						arg0.anInt5076++;
						if (local149.anIntArray26.length > arg0.anInt5129 && local149.anIntArray28[arg0.anInt5129] < arg0.anInt5076) {
							arg0.anInt5129++;
							arg0.anInt5076 = 1;
							Static225.method3777(arg0.anInt5129, Static111.aClass36_Sub3_Sub2_1 == arg0, arg0.anInt5109, local149, arg0.anInt5093);
						}
						if (local149.anIntArray26.length <= arg0.anInt5129) {
							if (local139.aBoolean436) {
								arg0.anInt5118++;
								arg0.anInt5129 -= local149.anInt430;
								if (arg0.anInt5118 >= local149.anInt422) {
									arg0.anInt5125 = -1;
								} else if (arg0.anInt5129 >= 0 && arg0.anInt5129 < local149.anIntArray26.length) {
									Static225.method3777(arg0.anInt5129, arg0 == Static111.aClass36_Sub3_Sub2_1, arg0.anInt5109, local149, arg0.anInt5093);
								} else {
									arg0.anInt5125 = -1;
								}
							} else {
								arg0.anInt5125 = -1;
							}
						}
						arg0.anInt5142 = arg0.anInt5129 + 1;
						if (local149.anIntArray26.length <= arg0.anInt5142) {
							if (local139.aBoolean436) {
								arg0.anInt5142 -= local149.anInt430;
								if (local149.anInt422 <= arg0.anInt5118 + 1) {
									arg0.anInt5142 = -1;
								} else if (arg0.anInt5142 < 0 || arg0.anInt5142 >= local149.anIntArray26.length) {
									arg0.anInt5142 = -1;
								}
							} else {
								arg0.anInt5142 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5087 != -1 && arg0.anInt5070 <= 1) {
			local20 = Static35.method706(arg0.anInt5087);
			if (local20.anInt432 == 3) {
				if (arg0.anInt5077 > 0 && Static148.anInt3168 >= arg0.anInt5121 && Static148.anInt3168 > arg0.anInt5123) {
					arg0.anInt5087 = -1;
				}
			} else if (local20.anInt432 == 1 && arg0.anInt5077 > 0 && Static148.anInt3168 >= arg0.anInt5121 && arg0.anInt5123 < Static148.anInt3168) {
				arg0.anInt5070 = 1;
			}
		}
		if (arg0.anInt5087 != -1 && arg0.anInt5070 == 0) {
			local20 = Static35.method706(arg0.anInt5087);
			if (local20 == null || local20.anIntArray26 == null) {
				arg0.anInt5087 = -1;
			} else {
				arg0.anInt5081++;
				if (local20.anIntArray26.length > arg0.anInt5106 && local20.anIntArray28[arg0.anInt5106] < arg0.anInt5081) {
					arg0.anInt5081 = 1;
					arg0.anInt5106++;
					Static225.method3777(arg0.anInt5106, Static111.aClass36_Sub3_Sub2_1 == arg0, arg0.anInt5109, local20, arg0.anInt5093);
				}
				if (local20.anIntArray26.length <= arg0.anInt5106) {
					arg0.anInt5103++;
					arg0.anInt5106 -= local20.anInt430;
					if (local20.anInt422 <= arg0.anInt5103) {
						arg0.anInt5087 = -1;
					} else if (arg0.anInt5106 >= 0 && arg0.anInt5106 < local20.anIntArray26.length) {
						Static225.method3777(arg0.anInt5106, arg0 == Static111.aClass36_Sub3_Sub2_1, arg0.anInt5109, local20, arg0.anInt5093);
					} else {
						arg0.anInt5087 = -1;
					}
				}
				arg0.anInt5071 = arg0.anInt5106 + 1;
				if (local20.anIntArray26.length <= arg0.anInt5071) {
					arg0.anInt5071 -= local20.anInt430;
					if (arg0.anInt5103 + 1 >= local20.anInt422) {
						arg0.anInt5071 = -1;
					} else if (arg0.anInt5071 < 0 || local20.anIntArray26.length <= arg0.anInt5071) {
						arg0.anInt5071 = -1;
					}
				}
				arg0.aBoolean421 = local20.aBoolean30;
			}
		}
		if (arg0.anInt5070 > 0) {
			arg0.anInt5070--;
		}
		for (@Pc(735) int local735 = 0; local735 < arg0.aClass86Array3.length; local735++) {
			@Pc(745) Class86 local745 = arg0.aClass86Array3[local735];
			if (local745 != null) {
				if (local745.anInt2576 > 0) {
					local745.anInt2576--;
				} else {
					local149 = Static35.method706(local745.anInt2565);
					if (local149 == null || local149.anIntArray26 == null) {
						arg0.aClass86Array3[local735] = null;
					} else {
						local745.anInt2568++;
						if (local745.anInt2579 < local149.anIntArray26.length && local745.anInt2568 > local149.anIntArray28[local745.anInt2579]) {
							local745.anInt2568 = 1;
							local745.anInt2579++;
							Static225.method3777(local745.anInt2579, Static111.aClass36_Sub3_Sub2_1 == arg0, arg0.anInt5109, local149, arg0.anInt5093);
						}
						if (local149.anIntArray26.length <= local745.anInt2579) {
							local745.anInt2579 -= local149.anInt430;
							local745.anInt2566++;
							if (local745.anInt2566 >= local149.anInt422) {
								arg0.aClass86Array3[local735] = null;
							} else if (local745.anInt2579 >= 0 && local149.anIntArray26.length > local745.anInt2579) {
								Static225.method3777(local745.anInt2579, Static111.aClass36_Sub3_Sub2_1 == arg0, arg0.anInt5109, local149, arg0.anInt5093);
							} else {
								arg0.aClass86Array3[local735] = null;
							}
						}
						local745.anInt2575 = local745.anInt2579 + 1;
						if (local149.anIntArray26.length <= local745.anInt2575) {
							local745.anInt2575 -= local149.anInt430;
							if (local149.anInt422 <= local745.anInt2566 + 1) {
								local745.anInt2575 = -1;
							} else if (local745.anInt2575 < 0 || local745.anInt2575 >= local149.anIntArray26.length) {
								local745.anInt2575 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIILclient!jd;)[Lclient!af;")
	public static Class2_Sub3_Sub1_Sub1[] method1078(@OriginalArg(2) int arg0, @OriginalArg(3) Class84 arg1) {
		return Static288.method4789(0, arg0, arg1) ? Static186.method3171() : null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([IIIIII)V")
	public static void method1081(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class2_Sub31 local7 = Static180.aClass2_Sub31ArrayArrayArray2[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class8 local13 = local7.aClass8_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt282;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class95 local58 = local7.aClass95_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt2687;
		@Pc(67) int local67 = local58.anInt2688;
		@Pc(70) int local70 = local58.anInt2689;
		@Pc(73) int local73 = local58.anInt2686;
		@Pc(77) int[] local77 = Static57.anIntArrayArray19[local23];
		@Pc(81) int[] local81 = Static162.anIntArrayArray28[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}
}
