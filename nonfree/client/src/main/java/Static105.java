import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!et", name = "h", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_65 = new Class102(38, -1);

	@OriginalMember(owner = "client!et", name = "t", descriptor = "I")
	public static int anInt1975 = -1;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!dc;I)V")
	public static void method1608(@OriginalArg(0) Class3_Sub4_Sub1 arg0) {
		arg0.anInt4909 = 0;
		@Pc(19) Class128 local19;
		if (arg0.anInt4922 != -1) {
			local19 = Static334.aClass62_2.method1418(arg0.anInt4922);
			if (local19 == null || local19.anIntArray278 == null) {
				arg0.aBoolean353 = false;
				arg0.anInt4922 = -1;
			} else {
				label394: {
					arg0.anInt4963++;
					if (arg0.anInt4967 < local19.anIntArray278.length && local19.anIntArray276[arg0.anInt4967] < arg0.anInt4963) {
						arg0.anInt4967++;
						arg0.anInt4943++;
						arg0.anInt4963 = 1;
						Static128.method1905(local19, arg0.anInt6835, arg0 == Static60.aClass3_Sub4_Sub1_Sub2_1, arg0.aByte91, arg0.anInt6833, arg0.anInt4967);
					}
					if (local19.anIntArray278.length <= arg0.anInt4967) {
						arg0.anInt4963 = 0;
						arg0.anInt4967 = 0;
						if (arg0.aBoolean353) {
							arg0.anInt4922 = arg0.method4001().method3669();
							if (arg0.anInt4922 == -1) {
								arg0.aBoolean353 = false;
								break label394;
							}
							local19 = Static334.aClass62_2.method1418(arg0.anInt4922);
						}
						Static128.method1905(local19, arg0.anInt6835, Static60.aClass3_Sub4_Sub1_Sub2_1 == arg0, arg0.aByte91, arg0.anInt6833, arg0.anInt4967);
					}
					arg0.anInt4943 = arg0.anInt4967 + 1;
					if (local19.anIntArray278.length <= arg0.anInt4943) {
						arg0.anInt4943 = 0;
					}
				}
			}
		}
		@Pc(179) int local179;
		@Pc(193) Class128 local193;
		@Pc(176) Class229 local176;
		if (arg0.anInt4964 != -1 && Static266.anInt4392 >= arg0.anInt4944) {
			local176 = Static431.aClass36_2.method696(arg0.anInt4964);
			local179 = local176.anInt6240;
			if (local179 == -1) {
				arg0.anInt4964 = -1;
			} else {
				label396: {
					local193 = Static334.aClass62_2.method1418(local179);
					if (local176.aBoolean449) {
						if (local193.anInt3328 == 3) {
							if (arg0.anInt4976 > 0 && Static266.anInt4392 >= arg0.anInt4898 && arg0.anInt4917 < Static266.anInt4392) {
								arg0.anInt4964 = -1;
								break label396;
							}
						} else if (local193.anInt3328 == 1 && arg0.anInt4976 > 0 && arg0.anInt4898 <= Static266.anInt4392 && arg0.anInt4917 < Static266.anInt4392) {
							arg0.anInt4944 = Static266.anInt4392 + 1;
							break label396;
						}
					}
					if (local193 == null || local193.anIntArray278 == null) {
						arg0.anInt4964 = -1;
					} else {
						if (arg0.anInt4950 < 0) {
							arg0.anInt4950 = 0;
							Static128.method1905(local193, arg0.anInt6835, Static60.aClass3_Sub4_Sub1_Sub2_1 == arg0, arg0.aByte91, arg0.anInt6833, 0);
						}
						arg0.anInt4938++;
						if (local193.anIntArray278.length > arg0.anInt4950 && arg0.anInt4938 > local193.anIntArray276[arg0.anInt4950]) {
							arg0.anInt4950++;
							arg0.anInt4938 = 1;
							Static128.method1905(local193, arg0.anInt6835, arg0 == Static60.aClass3_Sub4_Sub1_Sub2_1, arg0.aByte91, arg0.anInt6833, arg0.anInt4950);
						}
						if (local193.anIntArray278.length <= arg0.anInt4950) {
							if (local176.aBoolean449) {
								arg0.anInt4910++;
								arg0.anInt4950 -= local193.anInt3335;
								if (arg0.anInt4910 >= local193.anInt3339) {
									arg0.anInt4964 = -1;
								} else if (arg0.anInt4950 >= 0 && local193.anIntArray278.length > arg0.anInt4950) {
									Static128.method1905(local193, arg0.anInt6835, arg0 == Static60.aClass3_Sub4_Sub1_Sub2_1, arg0.aByte91, arg0.anInt6833, arg0.anInt4950);
								} else {
									arg0.anInt4964 = -1;
								}
							} else {
								arg0.anInt4964 = -1;
							}
						}
						arg0.anInt4955 = arg0.anInt4950 + 1;
						if (arg0.anInt4955 >= local193.anIntArray278.length) {
							if (local176.aBoolean449) {
								arg0.anInt4955 -= local193.anInt3335;
								if (arg0.anInt4910 + 1 >= local193.anInt3339) {
									arg0.anInt4955 = -1;
								} else if (arg0.anInt4955 < 0 || local193.anIntArray278.length <= arg0.anInt4955) {
									arg0.anInt4955 = -1;
								}
							} else {
								arg0.anInt4955 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4912 != -1 && arg0.anInt4908 <= Static266.anInt4392) {
			local176 = Static431.aClass36_2.method696(arg0.anInt4912);
			local179 = local176.anInt6240;
			if (local179 == -1) {
				arg0.anInt4912 = -1;
			} else {
				label399: {
					local193 = Static334.aClass62_2.method1418(local179);
					if (local176.aBoolean449) {
						if (local193.anInt3328 == 3) {
							if (arg0.anInt4976 > 0 && Static266.anInt4392 >= arg0.anInt4898 && arg0.anInt4917 < Static266.anInt4392) {
								arg0.anInt4912 = -1;
								break label399;
							}
						} else if (local193.anInt3328 == 1 && arg0.anInt4976 > 0 && arg0.anInt4898 <= Static266.anInt4392 && arg0.anInt4917 < Static266.anInt4392) {
							arg0.anInt4908 = Static266.anInt4392 + 1;
							break label399;
						}
					}
					if (local193 == null || local193.anIntArray278 == null) {
						arg0.anInt4912 = -1;
					} else {
						if (arg0.anInt4969 < 0) {
							arg0.anInt4969 = 0;
							Static128.method1905(local193, arg0.anInt6835, Static60.aClass3_Sub4_Sub1_Sub2_1 == arg0, arg0.aByte91, arg0.anInt6833, 0);
						}
						arg0.anInt4923++;
						if (local193.anIntArray278.length > arg0.anInt4969 && local193.anIntArray276[arg0.anInt4969] < arg0.anInt4923) {
							arg0.anInt4969++;
							arg0.anInt4923 = 1;
							Static128.method1905(local193, arg0.anInt6835, Static60.aClass3_Sub4_Sub1_Sub2_1 == arg0, arg0.aByte91, arg0.anInt6833, arg0.anInt4969);
						}
						if (local193.anIntArray278.length <= arg0.anInt4969) {
							if (local176.aBoolean449) {
								arg0.anInt4969 -= local193.anInt3335;
								arg0.anInt4899++;
								if (local193.anInt3339 <= arg0.anInt4899) {
									arg0.anInt4912 = -1;
								} else if (arg0.anInt4969 >= 0 && arg0.anInt4969 < local193.anIntArray278.length) {
									Static128.method1905(local193, arg0.anInt6835, arg0 == Static60.aClass3_Sub4_Sub1_Sub2_1, arg0.aByte91, arg0.anInt6833, arg0.anInt4969);
								} else {
									arg0.anInt4912 = -1;
								}
							} else {
								arg0.anInt4912 = -1;
							}
						}
						arg0.anInt4937 = arg0.anInt4969 + 1;
						if (arg0.anInt4937 >= local193.anIntArray278.length) {
							if (local176.aBoolean449) {
								arg0.anInt4937 -= local193.anInt3335;
								if (arg0.anInt4899 + 1 >= local193.anInt3339) {
									arg0.anInt4937 = -1;
								} else if (arg0.anInt4937 < 0 || local193.anIntArray278.length <= arg0.anInt4937) {
									arg0.anInt4937 = -1;
								}
							} else {
								arg0.anInt4937 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4903 != -1 && arg0.anInt4954 <= 1) {
			local19 = Static334.aClass62_2.method1418(arg0.anInt4903);
			if (local19.anInt3328 == 3) {
				if (arg0.anInt4976 > 0 && Static266.anInt4392 >= arg0.anInt4898 && arg0.anInt4917 < Static266.anInt4392) {
					arg0.anInt4903 = -1;
				}
			} else if (local19.anInt3328 == 1 && arg0.anInt4976 > 0 && Static266.anInt4392 >= arg0.anInt4898 && Static266.anInt4392 > arg0.anInt4917) {
				arg0.anInt4954 = 2;
			}
		}
		if (arg0.anInt4903 != -1 && arg0.anInt4954 == 0) {
			local19 = Static334.aClass62_2.method1418(arg0.anInt4903);
			if (local19 == null || local19.anIntArray278 == null) {
				arg0.anInt4903 = -1;
			} else {
				arg0.lb++;
				if (local19.anIntArray278.length > arg0.anInt4929 && local19.anIntArray276[arg0.anInt4929] < arg0.lb) {
					arg0.anInt4929++;
					arg0.lb = 1;
					Static128.method1905(local19, arg0.anInt6835, arg0 == Static60.aClass3_Sub4_Sub1_Sub2_1, arg0.aByte91, arg0.anInt6833, arg0.anInt4929);
				}
				if (arg0.anInt4929 >= local19.anIntArray278.length) {
					arg0.anInt4940++;
					arg0.anInt4929 -= local19.anInt3335;
					if (local19.anInt3339 <= arg0.anInt4940) {
						arg0.anInt4903 = -1;
					} else if (arg0.anInt4929 >= 0 && arg0.anInt4929 < local19.anIntArray278.length) {
						Static128.method1905(local19, arg0.anInt6835, arg0 == Static60.aClass3_Sub4_Sub1_Sub2_1, arg0.aByte91, arg0.anInt6833, arg0.anInt4929);
					} else {
						arg0.anInt4903 = -1;
					}
				}
				arg0.anInt4945 = arg0.anInt4929 + 1;
				if (local19.anIntArray278.length <= arg0.anInt4945) {
					arg0.anInt4945 -= local19.anInt3335;
					if (local19.anInt3339 <= arg0.anInt4940 + 1) {
						arg0.anInt4945 = -1;
					} else if (arg0.anInt4945 < 0 || local19.anIntArray278.length <= arg0.anInt4945) {
						arg0.anInt4945 = -1;
					}
				}
				arg0.anInt4909 = local19.anInt3340;
			}
		}
		if (arg0.anInt4954 > 0) {
			arg0.anInt4954--;
		}
		for (@Pc(1070) int local1070 = 0; local1070 < arg0.aClass194Array3.length; local1070++) {
			@Pc(1077) Class194 local1077 = arg0.aClass194Array3[local1070];
			if (local1077 != null) {
				if (local1077.anInt5379 > 0) {
					local1077.anInt5379--;
				} else {
					local193 = Static334.aClass62_2.method1418(local1077.anInt5380);
					if (local193 == null || local193.anIntArray278 == null) {
						arg0.aClass194Array3[local1070] = null;
					} else {
						local1077.anInt5382++;
						if (local193.anIntArray278.length > local1077.anInt5384 && local1077.anInt5382 > local193.anIntArray276[local1077.anInt5384]) {
							local1077.anInt5382 = 1;
							local1077.anInt5384++;
							Static128.method1905(local193, arg0.anInt6835, arg0 == Static60.aClass3_Sub4_Sub1_Sub2_1, arg0.aByte91, arg0.anInt6833, local1077.anInt5384);
						}
						if (local193.anIntArray278.length <= local1077.anInt5384) {
							local1077.anInt5384 -= local193.anInt3335;
							local1077.anInt5385++;
							if (local193.anInt3339 <= local1077.anInt5385) {
								arg0.aClass194Array3[local1070] = null;
							} else if (local1077.anInt5384 >= 0 && local193.anIntArray278.length > local1077.anInt5384) {
								Static128.method1905(local193, arg0.anInt6835, Static60.aClass3_Sub4_Sub1_Sub2_1 == arg0, arg0.aByte91, arg0.anInt6833, local1077.anInt5384);
							} else {
								arg0.aClass194Array3[local1070] = null;
							}
						}
						local1077.anInt5376 = local1077.anInt5384 + 1;
						if (local193.anIntArray278.length <= local1077.anInt5376) {
							local1077.anInt5376 -= local193.anInt3335;
							if (local1077.anInt5385 + 1 >= local193.anInt3339) {
								local1077.anInt5376 = -1;
							} else if (local1077.anInt5376 < 0 || local193.anIntArray278.length <= local1077.anInt5376) {
								local1077.anInt5376 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
	public static void method1619() {
		if (Static82.aClass163_1.method5563()) {
			Static82.aClass163_1.method5515(Static286.aCanvas4);
			Static116.method1757();
			Static82.aClass163_1.method5518(Static286.aCanvas4);
			Static82.aClass163_1.method5560(Static286.aCanvas4);
		} else {
			Static424.method5112(Static288.anInt4743);
		}
		Static204.method2721();
	}
}
