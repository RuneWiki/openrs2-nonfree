import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "Lclient!pf;")
	public static final Class279 aClass279_6 = new Class279();

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(FIFIF)F")
	public static float method1972(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(17) float[] local17 = Static242.aFloatArrayArray12[arg2];
		return arg3 * local17[2] + local17[1] * arg0 + local17[0] * arg1;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
	public static void method1975(@OriginalArg(1) int arg0) {
		if (Static311.anInt5615 == 0) {
			Static300.aClass2_Sub26_Sub3_8.method6979(arg0);
		} else {
			Static131.anInt2515 = arg0;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!fm;)V")
	public static void method1976(@OriginalArg(1) Class15_Sub3_Sub3_Sub1 arg0) {
		if (arg0.anInt3968 != -1) {
			@Pc(12) Class178 local12 = Static354.aClass40_2.method1123(arg0.anInt3968);
			if (local12 == null || local12.anIntArray259 == null) {
				arg0.anInt3968 = -1;
				arg0.aBoolean314 = false;
			} else {
				label277: {
					arg0.anInt3974++;
					if (local12.anIntArray259.length > arg0.anInt4028 && local12.anIntArray257[arg0.anInt4028] < arg0.anInt3974) {
						arg0.anInt3974 = 1;
						arg0.anInt4018++;
						arg0.anInt4028++;
						if (!arg0.aBoolean315) {
							Static509.method7938(local12, arg0, arg0.anInt4028);
						}
					}
					if (local12.anIntArray259.length <= arg0.anInt4028) {
						arg0.anInt4028 = 0;
						arg0.anInt3974 = 0;
						if (arg0.aBoolean314) {
							arg0.anInt3968 = arg0.method3673().method6615();
							if (arg0.anInt3968 == -1) {
								arg0.aBoolean314 = false;
								break label277;
							}
							local12 = Static354.aClass40_2.method1123(arg0.anInt3968);
						}
						if (!arg0.aBoolean315) {
							Static509.method7938(local12, arg0, arg0.anInt4028);
						}
					}
					arg0.anInt4018 = arg0.anInt4028 + 1;
					if (local12.anIntArray259 == null) {
						arg0.anInt3968 = -1;
						arg0.aBoolean314 = false;
					} else if (local12.anIntArray259.length <= arg0.anInt4018) {
						arg0.anInt4018 = 0;
					}
				}
			}
		}
		for (@Pc(148) int local148 = 0; local148 < arg0.aClass358Array3.length; local148++) {
			if (arg0.aClass358Array3[local148].anInt10525 != -1 && Static62.anInt1184 >= arg0.aClass358Array3[local148].anInt10521) {
				@Pc(178) Class336 local178 = Static391.aClass319_1.method8041(arg0.aClass358Array3[local148].anInt10525);
				@Pc(181) int local181 = local178.anInt9651;
				if (local181 == -1) {
					arg0.aClass358Array3[local148].anInt10525 = -1;
				} else {
					@Pc(190) Class178 local190 = Static354.aClass40_2.method1123(local181);
					if (local178.aBoolean711) {
						if (local190.anInt5143 == 3) {
							if (arg0.anInt4038 > 0 && Static62.anInt1184 >= arg0.anInt4008 && arg0.anInt3982 < Static62.anInt1184) {
								arg0.aClass358Array3[local148].anInt10525 = -1;
								continue;
							}
						} else if (local190.anInt5143 == 1 && arg0.anInt4038 > 0 && Static62.anInt1184 >= arg0.anInt4008 && arg0.anInt3982 < Static62.anInt1184) {
							arg0.aClass358Array3[local148].anInt10521 = Static62.anInt1184 + 1;
							continue;
						}
					}
					if (local190 == null || local190.anIntArray259 == null) {
						arg0.aClass358Array3[local148].anInt10525 = -1;
					} else {
						if (arg0.aClass358Array3[local148].anInt10522 < 0) {
							arg0.aClass358Array3[local148].anInt10522 = 0;
							if (!arg0.aBoolean315) {
								Static509.method7938(local190, arg0, 0);
							}
						}
						arg0.aClass358Array3[local148].anInt10524++;
						if (arg0.aClass358Array3[local148].anInt10522 < local190.anIntArray259.length && arg0.aClass358Array3[local148].anInt10524 > local190.anIntArray257[arg0.aClass358Array3[local148].anInt10522]) {
							arg0.aClass358Array3[local148].anInt10524 = 1;
							arg0.aClass358Array3[local148].anInt10522++;
							if (!arg0.aBoolean315) {
								Static509.method7938(local190, arg0, arg0.aClass358Array3[local148].anInt10522);
							}
						}
						if (local190.anIntArray259.length <= arg0.aClass358Array3[local148].anInt10522) {
							if (local178.aBoolean711) {
								arg0.aClass358Array3[local148].anInt10522 -= local190.anInt5142;
								arg0.aClass358Array3[local148].anInt10527++;
								if (local190.anInt5130 <= arg0.aClass358Array3[local148].anInt10527) {
									arg0.aClass358Array3[local148].anInt10525 = -1;
								} else if (arg0.aClass358Array3[local148].anInt10522 < 0 || arg0.aClass358Array3[local148].anInt10522 >= local190.anIntArray259.length) {
									arg0.aClass358Array3[local148].anInt10525 = -1;
								} else if (!arg0.aBoolean315) {
									Static509.method7938(local190, arg0, arg0.aClass358Array3[local148].anInt10522);
								}
							} else {
								arg0.aClass358Array3[local148].anInt10525 = -1;
							}
						}
						arg0.aClass358Array3[local148].anInt10528 = arg0.aClass358Array3[local148].anInt10522 + 1;
						if (arg0.aClass358Array3[local148].anInt10528 >= local190.anIntArray259.length) {
							if (local178.aBoolean711) {
								arg0.aClass358Array3[local148].anInt10528 -= local190.anInt5142;
								if (arg0.aClass358Array3[local148].anInt10527 + 1 >= local190.anInt5130) {
									arg0.aClass358Array3[local148].anInt10528 = -1;
								} else if (arg0.aClass358Array3[local148].anInt10528 < 0 || local190.anIntArray259.length <= arg0.aClass358Array3[local148].anInt10528) {
									arg0.aClass358Array3[local148].anInt10528 = -1;
								}
							} else {
								arg0.aClass358Array3[local148].anInt10528 = -1;
							}
						}
					}
				}
			}
		}
		@Pc(563) Class178 local563;
		if (arg0.anInt3985 != -1 && arg0.anInt4030 <= 1) {
			local563 = Static354.aClass40_2.method1123(arg0.anInt3985);
			if (local563.anInt5143 == 3) {
				if (arg0.anInt4038 > 0 && Static62.anInt1184 >= arg0.anInt4008 && Static62.anInt1184 > arg0.anInt3982) {
					arg0.anIntArray184 = null;
					arg0.anInt3985 = -1;
				}
			} else if (local563.anInt5143 == 1 && arg0.anInt4038 > 0 && Static62.anInt1184 >= arg0.anInt4008 && arg0.anInt3982 < Static62.anInt1184) {
				arg0.anInt4030 = 2;
			}
		}
		if (arg0.anInt3985 != -1 && arg0.anInt4030 == 0) {
			local563 = Static354.aClass40_2.method1123(arg0.anInt3985);
			if (local563 == null || local563.anIntArray259 == null) {
				arg0.anIntArray184 = null;
				arg0.anInt3985 = -1;
			} else {
				arg0.anInt4036++;
				if (local563.anIntArray259.length > arg0.anInt4021 && local563.anIntArray257[arg0.anInt4021] < arg0.anInt4036) {
					arg0.anInt4036 = 1;
					arg0.anInt4021++;
					if (!arg0.aBoolean315) {
						Static509.method7938(local563, arg0, arg0.anInt4021);
					}
				}
				if (local563.anIntArray259.length <= arg0.anInt4021) {
					arg0.anInt4021 -= local563.anInt5142;
					arg0.anInt3998++;
					if (local563.anInt5130 <= arg0.anInt3998) {
						arg0.anIntArray184 = null;
						arg0.anInt3985 = -1;
					} else if (arg0.anInt4021 < 0 || local563.anIntArray259.length <= arg0.anInt4021) {
						arg0.anInt3985 = -1;
						arg0.anIntArray184 = null;
					} else if (!arg0.aBoolean315) {
						Static509.method7938(local563, arg0, arg0.anInt4021);
					}
				}
				arg0.anInt3995 = arg0.anInt4021 + 1;
				if (local563.anIntArray259.length <= arg0.anInt3995) {
					arg0.anInt3995 -= local563.anInt5142;
					if (local563.anInt5130 <= arg0.anInt3998 + 1) {
						arg0.anInt3995 = -1;
					} else if (arg0.anInt3995 < 0 || local563.anIntArray259.length <= arg0.anInt3995) {
						arg0.anInt3995 = -1;
					}
				}
			}
		}
		if (arg0.anInt4030 > 0) {
			arg0.anInt4030--;
		}
		for (@Pc(818) int local818 = 0; local818 < arg0.aClass171Array3.length; local818++) {
			@Pc(825) Class171 local825 = arg0.aClass171Array3[local818];
			if (local825 != null) {
				if (local825.anInt5009 > 0) {
					local825.anInt5009--;
				} else {
					@Pc(844) Class178 local844 = Static354.aClass40_2.method1123(local825.anInt5007);
					if (local844 == null || local844.anIntArray259 == null) {
						arg0.aClass171Array3[local818] = null;
					} else {
						local825.anInt5005++;
						if (local825.anInt5003 < local844.anIntArray259.length && local825.anInt5005 > local844.anIntArray257[local825.anInt5003]) {
							local825.anInt5003++;
							local825.anInt5005 = 1;
							if (!arg0.aBoolean315) {
								Static509.method7938(local844, arg0, local825.anInt5003);
							}
						}
						if (local825.anInt5003 >= local844.anIntArray259.length) {
							local825.anInt5006++;
							local825.anInt5003 -= local844.anInt5142;
							if (local844.anInt5130 <= local825.anInt5006) {
								arg0.aClass171Array3[local818] = null;
							} else if (local825.anInt5003 < 0 || local844.anIntArray259.length <= local825.anInt5003) {
								arg0.aClass171Array3[local818] = null;
							} else if (!arg0.aBoolean315) {
								Static509.method7938(local844, arg0, local825.anInt5003);
							}
						}
						local825.anInt5010 = local825.anInt5003 + 1;
						if (local825.anInt5010 >= local844.anIntArray259.length) {
							local825.anInt5010 -= local844.anInt5142;
							if (local825.anInt5006 + 1 >= local844.anInt5130) {
								local825.anInt5010 = -1;
							} else if (local825.anInt5010 < 0 || local844.anIntArray259.length <= local825.anInt5010) {
								local825.anInt5010 = -1;
							}
						}
					}
				}
			}
		}
	}
}
