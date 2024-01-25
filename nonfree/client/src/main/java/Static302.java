import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
	public static int anInt5510;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "Lclient!qa;")
	public static Class75 aClass75_8;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_181 = new Class92(64, 3);

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_196 = new Class184(47, -1);

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "Lclient!wt;")
	public static final Class3_Sub2_Sub2 aClass3_Sub2_Sub2_2 = new Class3_Sub2_Sub2(5000);

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_182 = new Class92(50, 3);

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!gf;)V")
	public static void method4452(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		arg0.aBoolean426 = false;
		@Pc(17) Class96 local17;
		if (arg0.anInt6080 != -1) {
			local17 = Static196.aClass30_2.method942(arg0.anInt6080);
			if (local17 == null || local17.anIntArray253 == null) {
				arg0.anInt6080 = -1;
				arg0.aBoolean429 = false;
			} else {
				label394: {
					arg0.anInt6117++;
					if (arg0.anInt6056 < local17.anIntArray253.length && local17.anIntArray254[arg0.anInt6056] < arg0.anInt6117) {
						arg0.anInt6117 = 1;
						arg0.anInt6086++;
						arg0.anInt6056++;
						Static86.method1483(arg0.anInt6053, arg0.anInt6056, arg0.aByte77, arg0.anInt6055, local17, arg0 == Static113.aClass1_Sub3_Sub3_Sub1_4);
					}
					if (local17.anIntArray253.length <= arg0.anInt6056) {
						arg0.anInt6056 = 0;
						arg0.anInt6117 = 0;
						if (arg0.aBoolean429) {
							arg0.anInt6080 = arg0.method4837().method3446();
							if (arg0.anInt6080 == -1) {
								arg0.aBoolean429 = false;
								break label394;
							}
							local17 = Static196.aClass30_2.method942(arg0.anInt6080);
						}
						Static86.method1483(arg0.anInt6053, arg0.anInt6056, arg0.aByte77, arg0.anInt6055, local17, Static113.aClass1_Sub3_Sub3_Sub1_4 == arg0);
					}
					arg0.anInt6086 = arg0.anInt6056 + 1;
					if (local17.anIntArray253.length <= arg0.anInt6086) {
						arg0.anInt6086 = 0;
					}
				}
			}
		}
		@Pc(186) int local186;
		@Pc(195) Class96 local195;
		@Pc(183) Class186 local183;
		if (arg0.anInt6104 != -1 && Static290.anInt5325 >= arg0.anInt6062) {
			local183 = Static102.aClass91_2.method2560(arg0.anInt6104);
			local186 = local183.anInt5611;
			if (local186 == -1) {
				arg0.anInt6104 = -1;
			} else {
				label396: {
					local195 = Static196.aClass30_2.method942(local186);
					if (local183.aBoolean406) {
						if (local195.anInt3328 == 3) {
							if (arg0.anInt6136 > 0 && Static290.anInt5325 >= arg0.anInt6123 && Static290.anInt5325 > arg0.anInt6108) {
								arg0.anInt6104 = -1;
								break label396;
							}
						} else if (local195.anInt3328 == 1 && arg0.anInt6136 > 0 && Static290.anInt5325 >= arg0.anInt6123 && arg0.anInt6108 < Static290.anInt5325) {
							arg0.anInt6062 = Static290.anInt5325 + 1;
							break label396;
						}
					}
					if (local195 == null || local195.anIntArray253 == null) {
						arg0.anInt6104 = -1;
					} else {
						if (arg0.anInt6074 < 0) {
							arg0.anInt6074 = 0;
							Static86.method1483(arg0.anInt6053, 0, arg0.aByte77, arg0.anInt6055, local195, Static113.aClass1_Sub3_Sub3_Sub1_4 == arg0);
						}
						arg0.anInt6070++;
						if (arg0.anInt6074 < local195.anIntArray253.length && arg0.anInt6070 > local195.anIntArray254[arg0.anInt6074]) {
							arg0.anInt6070 = 1;
							arg0.anInt6074++;
							Static86.method1483(arg0.anInt6053, arg0.anInt6074, arg0.aByte77, arg0.anInt6055, local195, arg0 == Static113.aClass1_Sub3_Sub3_Sub1_4);
						}
						if (arg0.anInt6074 >= local195.anIntArray253.length) {
							if (local183.aBoolean406) {
								arg0.anInt6084++;
								arg0.anInt6074 -= local195.anInt3329;
								if (local195.anInt3322 <= arg0.anInt6084) {
									arg0.anInt6104 = -1;
								} else if (arg0.anInt6074 >= 0 && arg0.anInt6074 < local195.anIntArray253.length) {
									Static86.method1483(arg0.anInt6053, arg0.anInt6074, arg0.aByte77, arg0.anInt6055, local195, arg0 == Static113.aClass1_Sub3_Sub3_Sub1_4);
								} else {
									arg0.anInt6104 = -1;
								}
							} else {
								arg0.anInt6104 = -1;
							}
						}
						arg0.anInt6095 = arg0.anInt6074 + 1;
						if (arg0.anInt6095 >= local195.anIntArray253.length) {
							if (local183.aBoolean406) {
								arg0.anInt6095 -= local195.anInt3329;
								if (arg0.anInt6084 + 1 >= local195.anInt3322) {
									arg0.anInt6095 = -1;
								} else if (arg0.anInt6095 < 0 || arg0.anInt6095 >= local195.anIntArray253.length) {
									arg0.anInt6095 = -1;
								}
							} else {
								arg0.anInt6095 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6079 != -1 && Static290.anInt5325 >= arg0.anInt6098) {
			local183 = Static102.aClass91_2.method2560(arg0.anInt6079);
			local186 = local183.anInt5611;
			if (local186 == -1) {
				arg0.anInt6079 = -1;
			} else {
				label399: {
					local195 = Static196.aClass30_2.method942(local186);
					if (local183.aBoolean406) {
						if (local195.anInt3328 == 3) {
							if (arg0.anInt6136 > 0 && Static290.anInt5325 >= arg0.anInt6123 && arg0.anInt6108 < Static290.anInt5325) {
								arg0.anInt6079 = -1;
								break label399;
							}
						} else if (local195.anInt3328 == 1 && arg0.anInt6136 > 0 && Static290.anInt5325 >= arg0.anInt6123 && arg0.anInt6108 < Static290.anInt5325) {
							arg0.anInt6098 = Static290.anInt5325 + 1;
							break label399;
						}
					}
					if (local195 == null || local195.anIntArray253 == null) {
						arg0.anInt6079 = -1;
					} else {
						if (arg0.anInt6106 < 0) {
							arg0.anInt6106 = 0;
							Static86.method1483(arg0.anInt6053, 0, arg0.aByte77, arg0.anInt6055, local195, Static113.aClass1_Sub3_Sub3_Sub1_4 == arg0);
						}
						arg0.anInt6131++;
						if (arg0.anInt6106 < local195.anIntArray253.length && local195.anIntArray254[arg0.anInt6106] < arg0.anInt6131) {
							arg0.anInt6131 = 1;
							arg0.anInt6106++;
							Static86.method1483(arg0.anInt6053, arg0.anInt6106, arg0.aByte77, arg0.anInt6055, local195, Static113.aClass1_Sub3_Sub3_Sub1_4 == arg0);
						}
						if (local195.anIntArray253.length <= arg0.anInt6106) {
							if (local183.aBoolean406) {
								arg0.anInt6077++;
								arg0.anInt6106 -= local195.anInt3329;
								if (local195.anInt3322 <= arg0.anInt6077) {
									arg0.anInt6079 = -1;
								} else if (arg0.anInt6106 >= 0 && arg0.anInt6106 < local195.anIntArray253.length) {
									Static86.method1483(arg0.anInt6053, arg0.anInt6106, arg0.aByte77, arg0.anInt6055, local195, arg0 == Static113.aClass1_Sub3_Sub3_Sub1_4);
								} else {
									arg0.anInt6079 = -1;
								}
							} else {
								arg0.anInt6079 = -1;
							}
						}
						arg0.anInt6088 = arg0.anInt6106 + 1;
						if (arg0.anInt6088 >= local195.anIntArray253.length) {
							if (local183.aBoolean406) {
								arg0.anInt6088 -= local195.anInt3329;
								if (arg0.anInt6077 + 1 >= local195.anInt3322) {
									arg0.anInt6088 = -1;
								} else if (arg0.anInt6088 < 0 || arg0.anInt6088 >= local195.anIntArray253.length) {
									arg0.anInt6088 = -1;
								}
							} else {
								arg0.anInt6088 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6092 != -1 && arg0.anInt6083 <= 1) {
			local17 = Static196.aClass30_2.method942(arg0.anInt6092);
			if (local17.anInt3328 == 3) {
				if (arg0.anInt6136 > 0 && Static290.anInt5325 >= arg0.anInt6123 && Static290.anInt5325 > arg0.anInt6108) {
					arg0.anInt6092 = -1;
				}
			} else if (local17.anInt3328 == 1 && arg0.anInt6136 > 0 && Static290.anInt5325 >= arg0.anInt6123 && Static290.anInt5325 > arg0.anInt6108) {
				arg0.anInt6083 = 2;
			}
		}
		if (arg0.anInt6092 != -1 && arg0.anInt6083 == 0) {
			local17 = Static196.aClass30_2.method942(arg0.anInt6092);
			if (local17 == null || local17.anIntArray253 == null) {
				arg0.anInt6092 = -1;
			} else {
				arg0.lb++;
				if (arg0.anInt6082 < local17.anIntArray253.length && arg0.lb > local17.anIntArray254[arg0.anInt6082]) {
					arg0.anInt6082++;
					arg0.lb = 1;
					Static86.method1483(arg0.anInt6053, arg0.anInt6082, arg0.aByte77, arg0.anInt6055, local17, arg0 == Static113.aClass1_Sub3_Sub3_Sub1_4);
				}
				if (arg0.anInt6082 >= local17.anIntArray253.length) {
					arg0.anInt6121++;
					arg0.anInt6082 -= local17.anInt3329;
					if (arg0.anInt6121 >= local17.anInt3322) {
						arg0.anInt6092 = -1;
					} else if (arg0.anInt6082 >= 0 && arg0.anInt6082 < local17.anIntArray253.length) {
						Static86.method1483(arg0.anInt6053, arg0.anInt6082, arg0.aByte77, arg0.anInt6055, local17, Static113.aClass1_Sub3_Sub3_Sub1_4 == arg0);
					} else {
						arg0.anInt6092 = -1;
					}
				}
				arg0.anInt6127 = arg0.anInt6082 + 1;
				if (local17.anIntArray253.length <= arg0.anInt6127) {
					arg0.anInt6127 -= local17.anInt3329;
					if (arg0.anInt6121 + 1 >= local17.anInt3322) {
						arg0.anInt6127 = -1;
					} else if (arg0.anInt6127 < 0 || local17.anIntArray253.length <= arg0.anInt6127) {
						arg0.anInt6127 = -1;
					}
				}
				arg0.aBoolean426 = local17.aBoolean256;
			}
		}
		if (arg0.anInt6083 > 0) {
			arg0.anInt6083--;
		}
		for (@Pc(1048) int local1048 = 0; local1048 < arg0.aClass34Array3.length; local1048++) {
			@Pc(1054) Class34 local1054 = arg0.aClass34Array3[local1048];
			if (local1054 != null) {
				if (local1054.anInt1232 > 0) {
					local1054.anInt1232--;
				} else {
					local195 = Static196.aClass30_2.method942(local1054.anInt1238);
					if (local195 == null || local195.anIntArray253 == null) {
						arg0.aClass34Array3[local1048] = null;
					} else {
						local1054.anInt1234++;
						if (local1054.anInt1230 < local195.anIntArray253.length && local195.anIntArray254[local1054.anInt1230] < local1054.anInt1234) {
							local1054.anInt1230++;
							local1054.anInt1234 = 1;
							Static86.method1483(arg0.anInt6053, local1054.anInt1230, arg0.aByte77, arg0.anInt6055, local195, Static113.aClass1_Sub3_Sub3_Sub1_4 == arg0);
						}
						if (local195.anIntArray253.length <= local1054.anInt1230) {
							local1054.anInt1235++;
							local1054.anInt1230 -= local195.anInt3329;
							if (local1054.anInt1235 >= local195.anInt3322) {
								arg0.aClass34Array3[local1048] = null;
							} else if (local1054.anInt1230 >= 0 && local1054.anInt1230 < local195.anIntArray253.length) {
								Static86.method1483(arg0.anInt6053, local1054.anInt1230, arg0.aByte77, arg0.anInt6055, local195, arg0 == Static113.aClass1_Sub3_Sub3_Sub1_4);
							} else {
								arg0.aClass34Array3[local1048] = null;
							}
						}
						local1054.anInt1239 = local1054.anInt1230 + 1;
						if (local1054.anInt1239 >= local195.anIntArray253.length) {
							local1054.anInt1239 -= local195.anInt3329;
							if (local195.anInt3322 <= local1054.anInt1235 + 1) {
								local1054.anInt1239 = -1;
							} else if (local1054.anInt1239 < 0 || local1054.anInt1239 >= local195.anIntArray253.length) {
								local1054.anInt1239 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!dn;Lclient!dn;ILclient!dn;Lclient!dn;)V")
	public static void method4453(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(3) Class56 arg2, @OriginalArg(4) Class56 arg3) {
		Static239.aClass56_61 = arg3;
		Static175.aClass56_59 = arg1;
		Static31.aClass56_13 = arg2;
		Static258.aClass56_93 = arg0;
		Static300.aClass68ArrayArray3 = new Class68[Static175.aClass56_59.method1380()][];
		Static198.aBooleanArray13 = new boolean[Static175.aClass56_59.method1380()];
	}
}
