import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!vg", name = "Ob", descriptor = "J")
	public static long aLong196;

	@OriginalMember(owner = "client!vg", name = "Mb", descriptor = "I")
	public static int anInt6046 = 0;

	@OriginalMember(owner = "client!vg", name = "Nb", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_154 = new Class211(5, -2);

	@OriginalMember(owner = "client!vg", name = "Qb", descriptor = "I")
	public static int anInt6048 = 1;

	@OriginalMember(owner = "client!vg", name = "Sb", descriptor = "[I")
	public static final int[] anIntArray716 = new int[4096];

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!sk;)V")
	public static void method5192(@OriginalArg(1) Class25_Sub1_Sub1 arg0) {
		arg0.aBoolean189 = false;
		@Pc(18) Class185 local18;
		if (arg0.anInt2340 != -1) {
			local18 = Static25.aClass67_1.method1227(arg0.anInt2340);
			if (local18 == null || local18.anIntArray579 == null) {
				arg0.anInt2340 = -1;
				arg0.aBoolean191 = false;
			} else {
				label297: {
					arg0.anInt2326++;
					if (local18.anIntArray579.length > arg0.anInt2332 && local18.anIntArray582[arg0.anInt2332] < arg0.anInt2326) {
						arg0.anInt2326 = 1;
						arg0.anInt2332++;
						arg0.anInt2375++;
						Static4.method52(arg0.anInt2332, arg0.anInt6080, Static321.aClass25_Sub1_Sub1_Sub1_2 == arg0, arg0.aByte70, local18, arg0.anInt6077);
					}
					if (local18.anIntArray579.length <= arg0.anInt2332) {
						arg0.anInt2326 = 0;
						arg0.anInt2332 = 0;
						if (arg0.aBoolean191) {
							arg0.anInt2340 = arg0.method1880().method96();
							if (arg0.anInt2340 == -1) {
								arg0.aBoolean191 = false;
								break label297;
							}
							local18 = Static25.aClass67_1.method1227(arg0.anInt2340);
						}
						Static4.method52(arg0.anInt2332, arg0.anInt6080, Static321.aClass25_Sub1_Sub1_Sub1_2 == arg0, arg0.aByte70, local18, arg0.anInt6077);
					}
					arg0.anInt2375 = arg0.anInt2332 + 1;
					if (arg0.anInt2375 >= local18.anIntArray579.length) {
						arg0.anInt2375 = 0;
					}
				}
			}
		}
		@Pc(174) int local174;
		if (arg0.anInt2338 != -1 && arg0.anInt2355 <= Static366.anInt5883) {
			@Pc(171) Class134 local171 = Static10.aClass246_1.method5429(arg0.anInt2338);
			local174 = local171.anInt3346;
			if (local174 == -1) {
				arg0.anInt2338 = -1;
			} else {
				label299: {
					@Pc(188) Class185 local188 = Static25.aClass67_1.method1227(local174);
					if (local171.aBoolean297) {
						if (local188.anInt4797 == 3) {
							if (arg0.anInt2379 > 0 && Static366.anInt5883 >= arg0.anInt2336 && arg0.anInt2347 < Static366.anInt5883) {
								arg0.anInt2338 = -1;
								break label299;
							}
						} else if (local188.anInt4797 == 1 && arg0.anInt2379 > 0 && arg0.anInt2336 <= Static366.anInt5883 && Static366.anInt5883 > arg0.anInt2347) {
							arg0.anInt2355 = Static366.anInt5883 + 1;
							break label299;
						}
					}
					if (local188 == null || local188.anIntArray579 == null) {
						arg0.anInt2338 = -1;
					} else {
						if (arg0.anInt2373 < 0) {
							arg0.anInt2373 = 0;
							Static4.method52(0, arg0.anInt6080, Static321.aClass25_Sub1_Sub1_Sub1_2 == arg0, arg0.aByte70, local188, arg0.anInt6077);
						}
						arg0.anInt2372++;
						if (arg0.anInt2373 < local188.anIntArray579.length && local188.anIntArray582[arg0.anInt2373] < arg0.anInt2372) {
							arg0.anInt2373++;
							arg0.anInt2372 = 1;
							Static4.method52(arg0.anInt2373, arg0.anInt6080, arg0 == Static321.aClass25_Sub1_Sub1_Sub1_2, arg0.aByte70, local188, arg0.anInt6077);
						}
						if (local188.anIntArray579.length <= arg0.anInt2373) {
							if (local171.aBoolean297) {
								arg0.anInt2373 -= local188.anInt4801;
								arg0.anInt2362++;
								if (local188.anInt4791 <= arg0.anInt2362) {
									arg0.anInt2338 = -1;
								} else if (arg0.anInt2373 >= 0 && local188.anIntArray579.length > arg0.anInt2373) {
									Static4.method52(arg0.anInt2373, arg0.anInt6080, arg0 == Static321.aClass25_Sub1_Sub1_Sub1_2, arg0.aByte70, local188, arg0.anInt6077);
								} else {
									arg0.anInt2338 = -1;
								}
							} else {
								arg0.anInt2338 = -1;
							}
						}
						arg0.anInt2330 = arg0.anInt2373 + 1;
						if (local188.anIntArray579.length <= arg0.anInt2330) {
							if (local171.aBoolean297) {
								arg0.anInt2330 -= local188.anInt4801;
								if (local188.anInt4791 <= arg0.anInt2362 + 1) {
									arg0.anInt2330 = -1;
								} else if (arg0.anInt2330 < 0 || local188.anIntArray579.length <= arg0.anInt2330) {
									arg0.anInt2330 = -1;
								}
							} else {
								arg0.anInt2330 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt2333 != -1 && arg0.anInt2323 <= 1) {
			local18 = Static25.aClass67_1.method1227(arg0.anInt2333);
			if (local18.anInt4797 == 3) {
				if (arg0.anInt2379 > 0 && arg0.anInt2336 <= Static366.anInt5883 && arg0.anInt2347 < Static366.anInt5883) {
					arg0.anInt2333 = -1;
				}
			} else if (local18.anInt4797 == 1 && arg0.anInt2379 > 0 && Static366.anInt5883 >= arg0.anInt2336 && Static366.anInt5883 > arg0.anInt2347) {
				arg0.anInt2323 = 2;
			}
		}
		if (arg0.anInt2333 != -1 && arg0.anInt2323 == 0) {
			local18 = Static25.aClass67_1.method1227(arg0.anInt2333);
			if (local18 == null || local18.anIntArray579 == null) {
				arg0.anInt2333 = -1;
			} else {
				arg0.anInt2354++;
				if (arg0.anInt2322 < local18.anIntArray579.length && arg0.anInt2354 > local18.anIntArray582[arg0.anInt2322]) {
					arg0.anInt2354 = 1;
					arg0.anInt2322++;
					Static4.method52(arg0.anInt2322, arg0.anInt6080, Static321.aClass25_Sub1_Sub1_Sub1_2 == arg0, arg0.aByte70, local18, arg0.anInt6077);
				}
				if (arg0.anInt2322 >= local18.anIntArray579.length) {
					arg0.anInt2359++;
					arg0.anInt2322 -= local18.anInt4801;
					if (local18.anInt4791 <= arg0.anInt2359) {
						arg0.anInt2333 = -1;
					} else if (arg0.anInt2322 >= 0 && arg0.anInt2322 < local18.anIntArray579.length) {
						Static4.method52(arg0.anInt2322, arg0.anInt6080, Static321.aClass25_Sub1_Sub1_Sub1_2 == arg0, arg0.aByte70, local18, arg0.anInt6077);
					} else {
						arg0.anInt2333 = -1;
					}
				}
				arg0.anInt2325 = arg0.anInt2322 + 1;
				if (local18.anIntArray579.length <= arg0.anInt2325) {
					arg0.anInt2325 -= local18.anInt4801;
					if (local18.anInt4791 <= arg0.anInt2359 + 1) {
						arg0.anInt2325 = -1;
					} else if (arg0.anInt2325 < 0 || arg0.anInt2325 >= local18.anIntArray579.length) {
						arg0.anInt2325 = -1;
					}
				}
				arg0.aBoolean189 = local18.aBoolean464;
			}
		}
		if (arg0.anInt2323 > 0) {
			arg0.anInt2323--;
		}
		for (local174 = 0; local174 < arg0.aClass103Array3.length; local174++) {
			@Pc(761) Class103 local761 = arg0.aClass103Array3[local174];
			if (local761 != null) {
				if (local761.anInt2710 > 0) {
					local761.anInt2710--;
				} else {
					@Pc(780) Class185 local780 = Static25.aClass67_1.method1227(local761.anInt2713);
					if (local780 == null || local780.anIntArray579 == null) {
						arg0.aClass103Array3[local174] = null;
					} else {
						local761.anInt2709++;
						if (local780.anIntArray579.length > local761.anInt2712 && local761.anInt2709 > local780.anIntArray582[local761.anInt2712]) {
							local761.anInt2709 = 1;
							local761.anInt2712++;
							Static4.method52(local761.anInt2712, arg0.anInt6080, Static321.aClass25_Sub1_Sub1_Sub1_2 == arg0, arg0.aByte70, local780, arg0.anInt6077);
						}
						if (local780.anIntArray579.length <= local761.anInt2712) {
							local761.anInt2712 -= local780.anInt4801;
							local761.anInt2714++;
							if (local780.anInt4791 <= local761.anInt2714) {
								arg0.aClass103Array3[local174] = null;
							} else if (local761.anInt2712 >= 0 && local780.anIntArray579.length > local761.anInt2712) {
								Static4.method52(local761.anInt2712, arg0.anInt6080, arg0 == Static321.aClass25_Sub1_Sub1_Sub1_2, arg0.aByte70, local780, arg0.anInt6077);
							} else {
								arg0.aClass103Array3[local174] = null;
							}
						}
						local761.anInt2706 = local761.anInt2712 + 1;
						if (local761.anInt2706 >= local780.anIntArray579.length) {
							local761.anInt2706 -= local780.anInt4801;
							if (local761.anInt2714 + 1 >= local780.anInt4791) {
								local761.anInt2706 = -1;
							} else if (local761.anInt2706 < 0 || local780.anIntArray579.length <= local761.anInt2706) {
								local761.anInt2706 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;)V")
	public static void method5199(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static8.aString1 = arg2;
		Static203.aString38 = arg1;
		Static275.anInt4798 = arg0;
		if (Static8.aString1.equals("") || Static203.aString38.equals("")) {
			Static288.anInt4959 = 3;
		} else if (Static233.anInt3887 == -1) {
			Static277.anInt4833 = 0;
			Static288.anInt4959 = -3;
			Static67.anInt1357 = 1;
			Static307.anInt5744 = 0;
			@Pc(40) Class1_Sub33 local40 = new Class1_Sub33(128);
			local40.method5165(10);
			local40.method5142((int) (Math.random() * 9.9999999E7D));
			local40.method5127(Static229.method3191(Static8.aString1));
			local40.method5142((int) (Math.random() * 9.9999999E7D));
			local40.method5143(Static203.aString38);
			local40.method5142((int) (Math.random() * 9.9999999E7D));
			local40.method5130(Static356.aBigInteger3, Static122.aBigInteger1);
			Static209.aClass1_Sub33_Sub2_2.lb = 0;
			Static209.aClass1_Sub33_Sub2_2.method5165(Static159.aClass66_10.anInt1518);
			Static209.aClass1_Sub33_Sub2_2.method5165(local40.lb + 2);
			Static209.aClass1_Sub33_Sub2_2.method5138(575);
			Static209.aClass1_Sub33_Sub2_2.method5152(local40.lb, local40.aByteArray86);
		} else {
			Static240.method3327();
		}
	}
}
