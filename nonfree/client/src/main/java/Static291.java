import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "Lclient!ni;")
	public static final Class3_Sub4_Sub2 aClass3_Sub4_Sub2_3 = new Class3_Sub4_Sub2(5000);

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(II)V")
	public static void method4967(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub7_Sub11 local8 = Static116.method2029(arg0, 1);
		local8.method2502();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!ps;)V")
	public static void method4968(@OriginalArg(1) Class5_Sub4_Sub4 arg0) {
		arg0.aBoolean284 = false;
		@Pc(17) Class131 local17;
		if (arg0.anInt4911 != -1) {
			local17 = Static343.method5604(arg0.anInt4911);
			if (local17 == null || local17.anIntArray335 == null) {
				arg0.aBoolean285 = false;
				arg0.anInt4911 = -1;
			} else {
				label297: {
					arg0.anInt4929++;
					if (arg0.anInt4932 < local17.anIntArray335.length && arg0.anInt4929 > local17.anIntArray337[arg0.anInt4932]) {
						arg0.anInt4928++;
						arg0.anInt4929 = 1;
						arg0.anInt4932++;
						Static161.method2570(arg0.anInt4932, arg0 == Static349.aClass5_Sub4_Sub4_Sub1_2, arg0.anInt5905, local17, arg0.anInt5901);
					}
					if (local17.anIntArray335.length <= arg0.anInt4932) {
						arg0.anInt4929 = 0;
						arg0.anInt4932 = 0;
						if (arg0.aBoolean285) {
							arg0.anInt4911 = arg0.method4201().method1157();
							if (arg0.anInt4911 == -1) {
								arg0.aBoolean285 = false;
								break label297;
							}
							local17 = Static343.method5604(arg0.anInt4911);
						}
						Static161.method2570(arg0.anInt4932, arg0 == Static349.aClass5_Sub4_Sub4_Sub1_2, arg0.anInt5905, local17, arg0.anInt5901);
					}
					arg0.anInt4928 = arg0.anInt4932 + 1;
					if (local17.anIntArray335.length <= arg0.anInt4928) {
						arg0.anInt4928 = 0;
					}
				}
			}
		}
		@Pc(188) Class131 local188;
		if (arg0.anInt4910 != -1 && arg0.anInt4926 <= Static51.anInt1101) {
			@Pc(173) Class2 local173 = Static155.method1566(arg0.anInt4910);
			@Pc(176) int local176 = local173.anInt22;
			if (local176 == -1) {
				arg0.anInt4910 = -1;
			} else {
				label299: {
					local188 = Static343.method5604(local176);
					if (local173.aBoolean5) {
						if (local188.anInt3992 == 3) {
							if (arg0.anInt4954 > 0 && arg0.anInt4936 <= Static51.anInt1101 && Static51.anInt1101 > arg0.anInt4889) {
								arg0.anInt4910 = -1;
								break label299;
							}
						} else if (local188.anInt3992 == 1 && arg0.anInt4954 > 0 && arg0.anInt4936 <= Static51.anInt1101 && arg0.anInt4889 < Static51.anInt1101) {
							arg0.anInt4926 = Static51.anInt1101 + 1;
							break label299;
						}
					}
					if (local188 == null || local188.anIntArray335 == null) {
						arg0.anInt4910 = -1;
					} else {
						if (arg0.anInt4887 < 0) {
							arg0.anInt4887 = 0;
							Static161.method2570(0, arg0 == Static349.aClass5_Sub4_Sub4_Sub1_2, arg0.anInt5905, local188, arg0.anInt5901);
						}
						arg0.anInt4891++;
						if (local188.anIntArray335.length > arg0.anInt4887 && arg0.anInt4891 > local188.anIntArray337[arg0.anInt4887]) {
							arg0.anInt4887++;
							arg0.anInt4891 = 1;
							Static161.method2570(arg0.anInt4887, Static349.aClass5_Sub4_Sub4_Sub1_2 == arg0, arg0.anInt5905, local188, arg0.anInt5901);
						}
						if (local188.anIntArray335.length <= arg0.anInt4887) {
							if (local173.aBoolean5) {
								arg0.anInt4887 -= local188.anInt3989;
								arg0.anInt4897++;
								if (local188.anInt3994 <= arg0.anInt4897) {
									arg0.anInt4910 = -1;
								} else if (arg0.anInt4887 >= 0 && arg0.anInt4887 < local188.anIntArray335.length) {
									Static161.method2570(arg0.anInt4887, arg0 == Static349.aClass5_Sub4_Sub4_Sub1_2, arg0.anInt5905, local188, arg0.anInt5901);
								} else {
									arg0.anInt4910 = -1;
								}
							} else {
								arg0.anInt4910 = -1;
							}
						}
						arg0.anInt4930 = arg0.anInt4887 + 1;
						if (local188.anIntArray335.length <= arg0.anInt4930) {
							if (local173.aBoolean5) {
								arg0.anInt4930 -= local188.anInt3989;
								if (local188.anInt3994 <= arg0.anInt4897 + 1) {
									arg0.anInt4930 = -1;
								} else if (arg0.anInt4930 < 0 || arg0.anInt4930 >= local188.anIntArray335.length) {
									arg0.anInt4930 = -1;
								}
							} else {
								arg0.anInt4930 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4915 != -1 && arg0.anInt4918 <= 1) {
			local17 = Static343.method5604(arg0.anInt4915);
			if (local17.anInt3992 == 3) {
				if (arg0.anInt4954 > 0 && Static51.anInt1101 >= arg0.anInt4936 && arg0.anInt4889 < Static51.anInt1101) {
					arg0.anInt4915 = -1;
				}
			} else if (local17.anInt3992 == 1 && arg0.anInt4954 > 0 && Static51.anInt1101 >= arg0.anInt4936 && Static51.anInt1101 > arg0.anInt4889) {
				arg0.anInt4918 = 2;
			}
		}
		if (arg0.anInt4915 != -1 && arg0.anInt4918 == 0) {
			local17 = Static343.method5604(arg0.anInt4915);
			if (local17 == null || local17.anIntArray335 == null) {
				arg0.anInt4915 = -1;
			} else {
				arg0.anInt4903++;
				if (local17.anIntArray335.length > arg0.anInt4912 && local17.anIntArray337[arg0.anInt4912] < arg0.anInt4903) {
					arg0.anInt4912++;
					arg0.anInt4903 = 1;
					Static161.method2570(arg0.anInt4912, Static349.aClass5_Sub4_Sub4_Sub1_2 == arg0, arg0.anInt5905, local17, arg0.anInt5901);
				}
				if (local17.anIntArray335.length <= arg0.anInt4912) {
					arg0.anInt4912 -= local17.anInt3989;
					arg0.anInt4937++;
					if (arg0.anInt4937 >= local17.anInt3994) {
						arg0.anInt4915 = -1;
					} else if (arg0.anInt4912 >= 0 && arg0.anInt4912 < local17.anIntArray335.length) {
						Static161.method2570(arg0.anInt4912, Static349.aClass5_Sub4_Sub4_Sub1_2 == arg0, arg0.anInt5905, local17, arg0.anInt5901);
					} else {
						arg0.anInt4915 = -1;
					}
				}
				arg0.anInt4927 = arg0.anInt4912 + 1;
				if (arg0.anInt4927 >= local17.anIntArray335.length) {
					arg0.anInt4927 -= local17.anInt3989;
					if (arg0.anInt4937 + 1 >= local17.anInt3994) {
						arg0.anInt4927 = -1;
					} else if (arg0.anInt4927 < 0 || arg0.anInt4927 >= local17.anIntArray335.length) {
						arg0.anInt4927 = -1;
					}
				}
				arg0.aBoolean284 = local17.aBoolean229;
			}
		}
		if (arg0.anInt4918 > 0) {
			arg0.anInt4918--;
		}
		for (@Pc(735) int local735 = 0; local735 < arg0.aClass46Array3.length; local735++) {
			@Pc(742) Class46 local742 = arg0.aClass46Array3[local735];
			if (local742 != null) {
				if (local742.anInt1291 > 0) {
					local742.anInt1291--;
				} else {
					local188 = Static343.method5604(local742.anInt1286);
					if (local188 == null || local188.anIntArray335 == null) {
						arg0.aClass46Array3[local735] = null;
					} else {
						local742.anInt1285++;
						if (local188.anIntArray335.length > local742.anInt1290 && local188.anIntArray337[local742.anInt1290] < local742.anInt1285) {
							local742.anInt1290++;
							local742.anInt1285 = 1;
							Static161.method2570(local742.anInt1290, arg0 == Static349.aClass5_Sub4_Sub4_Sub1_2, arg0.anInt5905, local188, arg0.anInt5901);
						}
						if (local742.anInt1290 >= local188.anIntArray335.length) {
							local742.anInt1289++;
							local742.anInt1290 -= local188.anInt3989;
							if (local188.anInt3994 <= local742.anInt1289) {
								arg0.aClass46Array3[local735] = null;
							} else if (local742.anInt1290 >= 0 && local188.anIntArray335.length > local742.anInt1290) {
								Static161.method2570(local742.anInt1290, arg0 == Static349.aClass5_Sub4_Sub4_Sub1_2, arg0.anInt5905, local188, arg0.anInt5901);
							} else {
								arg0.aClass46Array3[local735] = null;
							}
						}
						local742.anInt1287 = local742.anInt1290 + 1;
						if (local188.anIntArray335.length <= local742.anInt1287) {
							local742.anInt1287 -= local188.anInt3989;
							if (local188.anInt3994 <= local742.anInt1289 + 1) {
								local742.anInt1287 = -1;
							} else if (local742.anInt1287 < 0 || local188.anIntArray335.length <= local742.anInt1287) {
								local742.anInt1287 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!lk;II)J")
	public static long method4969(@OriginalArg(0) int arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(15) Class170 local15 = Static268.method4553(arg1.method5344());
		@Pc(41) long local41 = (long) ((arg1.method5342() | 0x10000) << 14 | arg0 | arg2 << 7 | arg1.method5337() << 20);
		if (local15.anInt5227 == 0) {
			local41 |= local9;
		}
		if (local15.anInt5208 == 1) {
			local41 |= local5;
		}
		if (local15.aBoolean310) {
			local41 |= local7;
		}
		return local41 | (long) arg1.method5344() << 32;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(II)V")
	public static void method4970(@OriginalArg(1) int arg0) {
		@Pc(14) Class15 local14 = Static11.aClass15_1;
		synchronized (Static11.aClass15_1) {
			Static303.anInt5602 = arg0;
		}
	}
}
