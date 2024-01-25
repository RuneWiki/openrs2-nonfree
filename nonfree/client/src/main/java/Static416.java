import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
	public static int anInt7542 = -1;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILclient!vn;)V")
	public static void method6205(@OriginalArg(1) Class12_Sub2_Sub2_Sub1 arg0) {
		if (arg0.anInt2960 != -1) {
			@Pc(15) Class275 local15 = Static501.aClass191_2.method4322(arg0.anInt2960);
			if (local15 == null || local15.anIntArray598 == null) {
				arg0.aBoolean222 = false;
				arg0.anInt2960 = -1;
			} else {
				label277: {
					arg0.anInt2950++;
					if (local15.anIntArray598.length > arg0.anInt2942 && arg0.anInt2950 > local15.anIntArray599[arg0.anInt2942]) {
						arg0.lb++;
						arg0.anInt2942++;
						arg0.anInt2950 = 1;
						if (!arg0.aBoolean221) {
							Static51.method1064(arg0, local15, arg0.anInt2942);
						}
					}
					if (arg0.anInt2942 >= local15.anIntArray598.length) {
						arg0.anInt2942 = 0;
						arg0.anInt2950 = 0;
						if (arg0.aBoolean222) {
							arg0.anInt2960 = arg0.method2416().method3027();
							if (arg0.anInt2960 == -1) {
								arg0.aBoolean222 = false;
								break label277;
							}
							local15 = Static501.aClass191_2.method4322(arg0.anInt2960);
						}
						if (!arg0.aBoolean221) {
							Static51.method1064(arg0, local15, arg0.anInt2942);
						}
					}
					arg0.lb = arg0.anInt2942 + 1;
					if (local15.anIntArray598 == null) {
						arg0.anInt2960 = -1;
						arg0.aBoolean222 = false;
					} else if (arg0.lb >= local15.anIntArray598.length) {
						arg0.lb = 0;
					}
				}
			}
		}
		@Pc(188) Class275 local188;
		for (@Pc(148) int local148 = 0; local148 < arg0.aClass84Array3.length; local148++) {
			if (arg0.aClass84Array3[local148].anInt2468 != -1 && arg0.aClass84Array3[local148].anInt2475 <= Static87.anInt1951) {
				@Pc(177) Class60 local177 = Static556.aClass216_2.method5268(arg0.aClass84Array3[local148].anInt2468);
				@Pc(180) int local180 = local177.anInt1664;
				if (local180 == -1) {
					arg0.aClass84Array3[local148].anInt2468 = -1;
				} else {
					local188 = Static501.aClass191_2.method4322(local180);
					if (local177.aBoolean127) {
						if (local188.anInt7913 == 3) {
							if (arg0.anInt2966 > 0 && Static87.anInt1951 >= arg0.anInt2938 && arg0.anInt2959 < Static87.anInt1951) {
								arg0.aClass84Array3[local148].anInt2468 = -1;
								continue;
							}
						} else if (local188.anInt7913 == 1 && arg0.anInt2966 > 0 && Static87.anInt1951 >= arg0.anInt2938 && Static87.anInt1951 > arg0.anInt2959) {
							arg0.aClass84Array3[local148].anInt2475 = Static87.anInt1951 + 1;
							continue;
						}
					}
					if (local188 == null || local188.anIntArray598 == null) {
						arg0.aClass84Array3[local148].anInt2468 = -1;
					} else {
						if (arg0.aClass84Array3[local148].anInt2466 < 0) {
							arg0.aClass84Array3[local148].anInt2466 = 0;
							if (!arg0.aBoolean221) {
								Static51.method1064(arg0, local188, 0);
							}
						}
						arg0.aClass84Array3[local148].anInt2465++;
						if (arg0.aClass84Array3[local148].anInt2466 < local188.anIntArray598.length && local188.anIntArray599[arg0.aClass84Array3[local148].anInt2466] < arg0.aClass84Array3[local148].anInt2465) {
							arg0.aClass84Array3[local148].anInt2465 = 1;
							arg0.aClass84Array3[local148].anInt2466++;
							if (!arg0.aBoolean221) {
								Static51.method1064(arg0, local188, arg0.aClass84Array3[local148].anInt2466);
							}
						}
						if (arg0.aClass84Array3[local148].anInt2466 >= local188.anIntArray598.length) {
							if (local177.aBoolean127) {
								arg0.aClass84Array3[local148].anInt2466 -= local188.anInt7916;
								arg0.aClass84Array3[local148].anInt2467++;
								if (arg0.aClass84Array3[local148].anInt2467 >= local188.anInt7914) {
									arg0.aClass84Array3[local148].anInt2468 = -1;
								} else if (arg0.aClass84Array3[local148].anInt2466 < 0 || local188.anIntArray598.length <= arg0.aClass84Array3[local148].anInt2466) {
									arg0.aClass84Array3[local148].anInt2468 = -1;
								} else if (!arg0.aBoolean221) {
									Static51.method1064(arg0, local188, arg0.aClass84Array3[local148].anInt2466);
								}
							} else {
								arg0.aClass84Array3[local148].anInt2468 = -1;
							}
						}
						arg0.aClass84Array3[local148].anInt2473 = arg0.aClass84Array3[local148].anInt2466 + 1;
						if (arg0.aClass84Array3[local148].anInt2473 >= local188.anIntArray598.length) {
							if (local177.aBoolean127) {
								arg0.aClass84Array3[local148].anInt2473 -= local188.anInt7916;
								if (local188.anInt7914 <= arg0.aClass84Array3[local148].anInt2467 + 1) {
									arg0.aClass84Array3[local148].anInt2473 = -1;
								} else if (arg0.aClass84Array3[local148].anInt2473 < 0 || arg0.aClass84Array3[local148].anInt2473 >= local188.anIntArray598.length) {
									arg0.aClass84Array3[local148].anInt2473 = -1;
								}
							} else {
								arg0.aClass84Array3[local148].anInt2473 = -1;
							}
						}
					}
				}
			}
		}
		@Pc(562) Class275 local562;
		if (arg0.anInt2921 != -1 && arg0.anInt2900 <= 1) {
			local562 = Static501.aClass191_2.method4322(arg0.anInt2921);
			if (local562.anInt7913 == 3) {
				if (arg0.anInt2966 > 0 && Static87.anInt1951 >= arg0.anInt2938 && arg0.anInt2959 < Static87.anInt1951) {
					arg0.anIntArray234 = null;
					arg0.anInt2921 = -1;
				}
			} else if (local562.anInt7913 == 1 && arg0.anInt2966 > 0 && Static87.anInt1951 >= arg0.anInt2938 && arg0.anInt2959 < Static87.anInt1951) {
				arg0.anInt2900 = 2;
			}
		}
		if (arg0.anInt2921 != -1 && arg0.anInt2900 == 0) {
			local562 = Static501.aClass191_2.method4322(arg0.anInt2921);
			if (local562 == null || local562.anIntArray598 == null) {
				arg0.anIntArray234 = null;
				arg0.anInt2921 = -1;
			} else {
				arg0.anInt2898++;
				if (arg0.anInt2902 < local562.anIntArray598.length && arg0.anInt2898 > local562.anIntArray599[arg0.anInt2902]) {
					arg0.anInt2902++;
					arg0.anInt2898 = 1;
					if (!arg0.aBoolean221) {
						Static51.method1064(arg0, local562, arg0.anInt2902);
					}
				}
				if (local562.anIntArray598.length <= arg0.anInt2902) {
					arg0.anInt2902 -= local562.anInt7916;
					arg0.anInt2920++;
					if (local562.anInt7914 <= arg0.anInt2920) {
						arg0.anInt2921 = -1;
						arg0.anIntArray234 = null;
					} else if (arg0.anInt2902 < 0 || arg0.anInt2902 >= local562.anIntArray598.length) {
						arg0.anIntArray234 = null;
						arg0.anInt2921 = -1;
					} else if (!arg0.aBoolean221) {
						Static51.method1064(arg0, local562, arg0.anInt2902);
					}
				}
				arg0.anInt2958 = arg0.anInt2902 + 1;
				if (arg0.anInt2958 >= local562.anIntArray598.length) {
					arg0.anInt2958 -= local562.anInt7916;
					if (arg0.anInt2920 + 1 >= local562.anInt7914) {
						arg0.anInt2958 = -1;
					} else if (arg0.anInt2958 < 0 || arg0.anInt2958 >= local562.anIntArray598.length) {
						arg0.anInt2958 = -1;
					}
				}
			}
		}
		if (arg0.anInt2900 > 0) {
			arg0.anInt2900--;
		}
		for (@Pc(827) int local827 = 0; local827 < arg0.aClass351Array3.length; local827++) {
			@Pc(834) Class351 local834 = arg0.aClass351Array3[local827];
			if (local834 != null) {
				if (local834.anInt10179 > 0) {
					local834.anInt10179--;
				} else {
					local188 = Static501.aClass191_2.method4322(local834.anInt10181);
					if (local188 == null || local188.anIntArray598 == null) {
						arg0.aClass351Array3[local827] = null;
					} else {
						local834.anInt10178++;
						if (local834.anInt10180 < local188.anIntArray598.length && local834.anInt10178 > local188.anIntArray599[local834.anInt10180]) {
							local834.anInt10180++;
							local834.anInt10178 = 1;
							if (!arg0.aBoolean221) {
								Static51.method1064(arg0, local188, local834.anInt10180);
							}
						}
						if (local188.anIntArray598.length <= local834.anInt10180) {
							local834.anInt10177++;
							local834.anInt10180 -= local188.anInt7916;
							if (local834.anInt10177 >= local188.anInt7914) {
								arg0.aClass351Array3[local827] = null;
							} else if (local834.anInt10180 < 0 || local834.anInt10180 >= local188.anIntArray598.length) {
								arg0.aClass351Array3[local827] = null;
							} else if (!arg0.aBoolean221) {
								Static51.method1064(arg0, local188, local834.anInt10180);
							}
						}
						local834.anInt10182 = local834.anInt10180 + 1;
						if (local188.anIntArray598.length <= local834.anInt10182) {
							local834.anInt10182 -= local188.anInt7916;
							if (local834.anInt10177 + 1 >= local188.anInt7914) {
								local834.anInt10182 = -1;
							} else if (local834.anInt10182 < 0 || local834.anInt10182 >= local188.anIntArray598.length) {
								local834.anInt10182 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method6206(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		if (local13 == 0) {
			return new byte[0];
		}
		@Pc(27) int local27 = local13 + 3 & 0xFFFFFFFC;
		@Pc(33) int local33 = local27 / 4 * 3;
		if (local13 <= local27 - 2 || Static611.method8582(arg0.charAt(local27 - 2)) == -1) {
			local33 -= 2;
		} else if (local13 <= local27 - 1 || Static611.method8582(arg0.charAt(local27 - 1)) == -1) {
			local33--;
		}
		@Pc(69) byte[] local69 = new byte[local33];
		Static84.method1571(arg0, 0, local69);
		return local69;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIILclient!eo;I)V")
	public static void method6207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class14_Sub19 arg2, @OriginalArg(4) int arg3) {
		arg2.aClass14_Sub29_Sub1_1.method5861(arg0);
		arg2.aClass14_Sub29_Sub1_1.method5871(arg1);
		arg2.aClass14_Sub29_Sub1_1.method5892(arg3);
	}
}
