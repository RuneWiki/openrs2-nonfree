import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!vp", name = "r", descriptor = "Lclient!ra;")
	public static Class170 aClass170_94;

	@OriginalMember(owner = "client!vp", name = "y", descriptor = "I")
	public static int anInt5414;

	@OriginalMember(owner = "client!vp", name = "B", descriptor = "I")
	public static int anInt5416;

	@OriginalMember(owner = "client!vp", name = "F", descriptor = "[[S")
	public static short[][] aShortArrayArray13;

	@OriginalMember(owner = "client!vp", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString312 = "Checking for updates - ";

	@OriginalMember(owner = "client!vp", name = "u", descriptor = "[Lclient!oq;")
	public static final Class150[] aClass150Array3 = new Class150[4];

	@OriginalMember(owner = "client!vp", name = "x", descriptor = "Z")
	public static boolean aBoolean407 = false;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLclient!jf;)V")
	public static void method4719(@OriginalArg(1) Class96 arg0) {
		if (arg0.anInt2880 == Static8.anInt251) {
			Static293.aBooleanArray25[arg0.anInt2964] = true;
		}
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(B)V")
	public static void method4720() {
		@Pc(1) Class66 local1 = Static342.aClass66_108;
		synchronized (Static342.aClass66_108) {
			Static342.aClass66_108.method1942();
		}
		local1 = Static237.aClass66_81;
		synchronized (Static237.aClass66_81) {
			Static237.aClass66_81.method1942();
		}
		@Pc(33) Class109 local33 = Static250.aClass109_1;
		synchronized (Static250.aClass109_1) {
			Static250.aClass109_1.method2987();
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!bo;I)V")
	public static void method4721(@OriginalArg(0) Class25_Sub1_Sub1 arg0) {
		arg0.aBoolean404 = false;
		@Pc(18) Class17 local18;
		if (arg0.anInt5276 != -1) {
			local18 = Static261.method4492(arg0.anInt5276);
			if (local18 == null || local18.anIntArray24 == null) {
				arg0.aBoolean405 = false;
				arg0.anInt5276 = -1;
			} else {
				label297: {
					arg0.anInt5298++;
					if (local18.anIntArray24.length > arg0.anInt5268 && local18.anIntArray26[arg0.anInt5268] < arg0.anInt5298) {
						arg0.anInt5268++;
						arg0.anInt5299++;
						arg0.anInt5298 = 1;
						Static207.method3696(arg0.anInt5268, arg0.anInt5769, local18, arg0.anInt5773, Static85.aClass25_Sub1_Sub1_Sub1_1 == arg0);
					}
					if (arg0.anInt5268 >= local18.anIntArray24.length) {
						arg0.anInt5268 = 0;
						arg0.anInt5298 = 0;
						if (arg0.aBoolean405) {
							arg0.anInt5276 = arg0.method4659().method880();
							if (arg0.anInt5276 == -1) {
								arg0.aBoolean405 = false;
								break label297;
							}
							local18 = Static261.method4492(arg0.anInt5276);
						}
						Static207.method3696(arg0.anInt5268, arg0.anInt5769, local18, arg0.anInt5773, arg0 == Static85.aClass25_Sub1_Sub1_Sub1_1);
					}
					arg0.anInt5299 = arg0.anInt5268 + 1;
					if (arg0.anInt5299 >= local18.anIntArray24.length) {
						arg0.anInt5299 = 0;
					}
				}
			}
		}
		@Pc(186) Class17 local186;
		if (arg0.anInt5269 != -1 && arg0.anInt5306 <= Static180.anInt3606) {
			@Pc(175) Class128 local175 = Static136.method2578(arg0.anInt5269);
			@Pc(178) int local178 = local175.anInt3759;
			if (local178 == -1) {
				arg0.anInt5269 = -1;
			} else {
				label299: {
					local186 = Static261.method4492(local178);
					if (local175.aBoolean266) {
						if (local186.anInt516 == 3) {
							if (arg0.anInt5341 > 0 && arg0.anInt5329 <= Static180.anInt3606 && Static180.anInt3606 > arg0.anInt5291) {
								arg0.anInt5269 = -1;
								break label299;
							}
						} else if (local186.anInt516 == 1 && arg0.anInt5341 > 0 && arg0.anInt5329 <= Static180.anInt3606 && arg0.anInt5291 < Static180.anInt3606) {
							arg0.anInt5306 = Static180.anInt3606 + 1;
							break label299;
						}
					}
					if (local186 == null || local186.anIntArray24 == null) {
						arg0.anInt5269 = -1;
					} else {
						if (arg0.anInt5315 < 0) {
							arg0.anInt5315 = 0;
							Static207.method3696(0, arg0.anInt5769, local186, arg0.anInt5773, Static85.aClass25_Sub1_Sub1_Sub1_1 == arg0);
						}
						arg0.anInt5330++;
						if (local186.anIntArray24.length > arg0.anInt5315 && local186.anIntArray26[arg0.anInt5315] < arg0.anInt5330) {
							arg0.anInt5330 = 1;
							arg0.anInt5315++;
							Static207.method3696(arg0.anInt5315, arg0.anInt5769, local186, arg0.anInt5773, arg0 == Static85.aClass25_Sub1_Sub1_Sub1_1);
						}
						if (local186.anIntArray24.length <= arg0.anInt5315) {
							if (local175.aBoolean266) {
								arg0.anInt5315 -= local186.anInt520;
								arg0.anInt5296++;
								if (arg0.anInt5296 >= local186.anInt522) {
									arg0.anInt5269 = -1;
								} else if (arg0.anInt5315 >= 0 && arg0.anInt5315 < local186.anIntArray24.length) {
									Static207.method3696(arg0.anInt5315, arg0.anInt5769, local186, arg0.anInt5773, arg0 == Static85.aClass25_Sub1_Sub1_Sub1_1);
								} else {
									arg0.anInt5269 = -1;
								}
							} else {
								arg0.anInt5269 = -1;
							}
						}
						arg0.anInt5279 = arg0.anInt5315 + 1;
						if (local186.anIntArray24.length <= arg0.anInt5279) {
							if (local175.aBoolean266) {
								arg0.anInt5279 -= local186.anInt520;
								if (arg0.anInt5296 + 1 >= local186.anInt522) {
									arg0.anInt5279 = -1;
								} else if (arg0.anInt5279 < 0 || arg0.anInt5279 >= local186.anIntArray24.length) {
									arg0.anInt5279 = -1;
								}
							} else {
								arg0.anInt5279 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5312 != -1 && arg0.anInt5263 <= 1) {
			local18 = Static261.method4492(arg0.anInt5312);
			if (local18.anInt516 == 3) {
				if (arg0.anInt5341 > 0 && arg0.anInt5329 <= Static180.anInt3606 && arg0.anInt5291 < Static180.anInt3606) {
					arg0.anInt5312 = -1;
				}
			} else if (local18.anInt516 == 1 && arg0.anInt5341 > 0 && Static180.anInt3606 >= arg0.anInt5329 && arg0.anInt5291 < Static180.anInt3606) {
				arg0.anInt5263 = 2;
			}
		}
		if (arg0.anInt5312 != -1 && arg0.anInt5263 == 0) {
			local18 = Static261.method4492(arg0.anInt5312);
			if (local18 == null || local18.anIntArray24 == null) {
				arg0.anInt5312 = -1;
			} else {
				arg0.anInt5322++;
				if (local18.anIntArray24.length > arg0.anInt5285 && arg0.anInt5322 > local18.anIntArray26[arg0.anInt5285]) {
					arg0.anInt5285++;
					arg0.anInt5322 = 1;
					Static207.method3696(arg0.anInt5285, arg0.anInt5769, local18, arg0.anInt5773, Static85.aClass25_Sub1_Sub1_Sub1_1 == arg0);
				}
				if (arg0.anInt5285 >= local18.anIntArray24.length) {
					arg0.anInt5314++;
					arg0.anInt5285 -= local18.anInt520;
					if (local18.anInt522 <= arg0.anInt5314) {
						arg0.anInt5312 = -1;
					} else if (arg0.anInt5285 >= 0 && local18.anIntArray24.length > arg0.anInt5285) {
						Static207.method3696(arg0.anInt5285, arg0.anInt5769, local18, arg0.anInt5773, Static85.aClass25_Sub1_Sub1_Sub1_1 == arg0);
					} else {
						arg0.anInt5312 = -1;
					}
				}
				arg0.anInt5281 = arg0.anInt5285 + 1;
				if (local18.anIntArray24.length <= arg0.anInt5281) {
					arg0.anInt5281 -= local18.anInt520;
					if (local18.anInt522 <= arg0.anInt5314 + 1) {
						arg0.anInt5281 = -1;
					} else if (arg0.anInt5281 < 0 || local18.anIntArray24.length <= arg0.anInt5281) {
						arg0.anInt5281 = -1;
					}
				}
				arg0.aBoolean404 = local18.aBoolean33;
			}
		}
		if (arg0.anInt5263 > 0) {
			arg0.anInt5263--;
		}
		for (@Pc(725) int local725 = 0; local725 < arg0.aClass146Array3.length; local725++) {
			@Pc(732) Class146 local732 = arg0.aClass146Array3[local725];
			if (local732 != null) {
				if (local732.anInt4451 > 0) {
					local732.anInt4451--;
				} else {
					local186 = Static261.method4492(local732.anInt4452);
					if (local186 == null || local186.anIntArray24 == null) {
						arg0.aClass146Array3[local725] = null;
					} else {
						local732.anInt4456++;
						if (local732.anInt4448 < local186.anIntArray24.length && local186.anIntArray26[local732.anInt4448] < local732.anInt4456) {
							local732.anInt4456 = 1;
							local732.anInt4448++;
							Static207.method3696(local732.anInt4448, arg0.anInt5769, local186, arg0.anInt5773, arg0 == Static85.aClass25_Sub1_Sub1_Sub1_1);
						}
						if (local732.anInt4448 >= local186.anIntArray24.length) {
							local732.anInt4448 -= local186.anInt520;
							local732.anInt4449++;
							if (local186.anInt522 <= local732.anInt4449) {
								arg0.aClass146Array3[local725] = null;
							} else if (local732.anInt4448 >= 0 && local732.anInt4448 < local186.anIntArray24.length) {
								Static207.method3696(local732.anInt4448, arg0.anInt5769, local186, arg0.anInt5773, arg0 == Static85.aClass25_Sub1_Sub1_Sub1_1);
							} else {
								arg0.aClass146Array3[local725] = null;
							}
						}
						local732.anInt4454 = local732.anInt4448 + 1;
						if (local186.anIntArray24.length <= local732.anInt4454) {
							local732.anInt4454 -= local186.anInt520;
							if (local732.anInt4449 + 1 >= local186.anInt522) {
								local732.anInt4454 = -1;
							} else if (local732.anInt4454 < 0 || local186.anIntArray24.length <= local732.anInt4454) {
								local732.anInt4454 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZLclient!ra;Lclient!ra;I)V")
	public static void method4724(@OriginalArg(1) Class170 arg0, @OriginalArg(2) Class170 arg1) {
		Static219.aBoolean319 = true;
		Static237.aClass170_82 = arg0;
		Static317.aClass170_115 = arg1;
		@Pc(20) int local20 = Static317.aClass170_115.method4581() - 1;
		Static177.anInt2358 = Static317.aClass170_115.method4575(local20) + local20 * 256;
		Static100.aStringArray12 = new String[] { null, null, Static177.aString150, null, null };
		Static57.aStringArray6 = new String[] { null, null, null, null, Static106.aString146 };
	}
}
