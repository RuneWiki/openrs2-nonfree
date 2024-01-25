import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "[I")
	public static int[] anIntArray312;

	@OriginalMember(owner = "client!kq", name = "m", descriptor = "[I")
	public static int[] anIntArray313;

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "F")
	public static float aFloat116;

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "Lclient!tca;")
	public static final Class307 aClass307_10 = new Class307(6, 1);

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_120 = new Class81(27, 6);

	@OriginalMember(owner = "client!kq", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[100];

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
	public static int anInt5136 = 0;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!he;I)V")
	public static void method4313(@OriginalArg(0) Class20_Sub2_Sub4_Sub1 arg0) {
		@Pc(11) Class131 local11;
		if (arg0.anInt6454 != -1) {
			local11 = Static594.aClass311_2.method7009(arg0.anInt6454);
			if (local11 == null || local11.anIntArray202 == null) {
				arg0.anInt6454 = -1;
				arg0.aBoolean457 = false;
			} else {
				label390: {
					arg0.anInt6423++;
					if (arg0.anInt6405 < local11.anIntArray202.length && arg0.anInt6423 > local11.anIntArray204[arg0.anInt6405]) {
						arg0.anInt6423 = 1;
						arg0.anInt6459++;
						arg0.anInt6405++;
						Static171.method2603(arg0.anInt6405, arg0.anInt8796, local11, arg0.anInt8795, arg0.aByte116, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 == arg0);
					}
					if (arg0.anInt6405 >= local11.anIntArray202.length) {
						arg0.anInt6405 = 0;
						arg0.anInt6423 = 0;
						if (arg0.aBoolean457) {
							arg0.anInt6454 = arg0.method5346().method3398();
							if (arg0.anInt6454 == -1) {
								arg0.aBoolean457 = false;
								break label390;
							}
							local11 = Static594.aClass311_2.method7009(arg0.anInt6454);
						}
						Static171.method2603(arg0.anInt6405, arg0.anInt8796, local11, arg0.anInt8795, arg0.aByte116, arg0 == Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2);
					}
					arg0.anInt6459 = arg0.anInt6405 + 1;
					if (local11.anIntArray202.length <= arg0.anInt6459) {
						arg0.anInt6459 = 0;
					}
				}
			}
		}
		@Pc(180) int local180;
		@Pc(189) Class131 local189;
		@Pc(177) Class116 local177;
		if (arg0.anInt6416 != -1 && Static81.anInt1910 >= arg0.anInt6439) {
			local177 = Static592.aClass98_2.method2295(arg0.anInt6416);
			local180 = local177.anInt3012;
			if (local180 == -1) {
				arg0.anInt6416 = -1;
			} else {
				label392: {
					local189 = Static594.aClass311_2.method7009(local180);
					if (local177.aBoolean216) {
						if (local189.anInt3732 == 3) {
							if (arg0.anInt6466 > 0 && Static81.anInt1910 >= arg0.anInt6429 && Static81.anInt1910 > arg0.anInt6387) {
								arg0.anInt6416 = -1;
								break label392;
							}
						} else if (local189.anInt3732 == 1 && arg0.anInt6466 > 0 && Static81.anInt1910 >= arg0.anInt6429 && arg0.anInt6387 < Static81.anInt1910) {
							arg0.anInt6439 = Static81.anInt1910 + 1;
							break label392;
						}
					}
					if (local189 == null || local189.anIntArray202 == null) {
						arg0.anInt6416 = -1;
					} else {
						if (arg0.anInt6401 < 0) {
							arg0.anInt6401 = 0;
							Static171.method2603(0, arg0.anInt8796, local189, arg0.anInt8795, arg0.aByte116, arg0 == Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2);
						}
						arg0.anInt6432++;
						if (arg0.anInt6401 < local189.anIntArray202.length && local189.anIntArray204[arg0.anInt6401] < arg0.anInt6432) {
							arg0.anInt6401++;
							arg0.anInt6432 = 1;
							Static171.method2603(arg0.anInt6401, arg0.anInt8796, local189, arg0.anInt8795, arg0.aByte116, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 == arg0);
						}
						if (arg0.anInt6401 >= local189.anIntArray202.length) {
							if (local177.aBoolean216) {
								arg0.anInt6453++;
								arg0.anInt6401 -= local189.anInt3744;
								if (local189.anInt3743 <= arg0.anInt6453) {
									arg0.anInt6416 = -1;
								} else if (arg0.anInt6401 >= 0 && local189.anIntArray202.length > arg0.anInt6401) {
									Static171.method2603(arg0.anInt6401, arg0.anInt8796, local189, arg0.anInt8795, arg0.aByte116, arg0 == Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2);
								} else {
									arg0.anInt6416 = -1;
								}
							} else {
								arg0.anInt6416 = -1;
							}
						}
						arg0.anInt6402 = arg0.anInt6401 + 1;
						if (local189.anIntArray202.length <= arg0.anInt6402) {
							if (local177.aBoolean216) {
								arg0.anInt6402 -= local189.anInt3744;
								if (arg0.anInt6453 + 1 >= local189.anInt3743) {
									arg0.anInt6402 = -1;
								} else if (arg0.anInt6402 < 0 || arg0.anInt6402 >= local189.anIntArray202.length) {
									arg0.anInt6402 = -1;
								}
							} else {
								arg0.anInt6402 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6452 != -1 && Static81.anInt1910 >= arg0.lb) {
			local177 = Static592.aClass98_2.method2295(arg0.anInt6452);
			local180 = local177.anInt3012;
			if (local180 == -1) {
				arg0.anInt6452 = -1;
			} else {
				label396: {
					local189 = Static594.aClass311_2.method7009(local180);
					if (local177.aBoolean216) {
						if (local189.anInt3732 == 3) {
							if (arg0.anInt6466 > 0 && arg0.anInt6429 <= Static81.anInt1910 && arg0.anInt6387 < Static81.anInt1910) {
								arg0.anInt6452 = -1;
								break label396;
							}
						} else if (local189.anInt3732 == 1 && arg0.anInt6466 > 0 && arg0.anInt6429 <= Static81.anInt1910 && arg0.anInt6387 < Static81.anInt1910) {
							arg0.lb = Static81.anInt1910 + 1;
							break label396;
						}
					}
					if (local189 == null || local189.anIntArray202 == null) {
						arg0.anInt6452 = -1;
					} else {
						if (arg0.anInt6451 < 0) {
							arg0.anInt6451 = 0;
							Static171.method2603(0, arg0.anInt8796, local189, arg0.anInt8795, arg0.aByte116, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 == arg0);
						}
						arg0.anInt6448++;
						if (local189.anIntArray202.length > arg0.anInt6451 && local189.anIntArray204[arg0.anInt6451] < arg0.anInt6448) {
							arg0.anInt6451++;
							arg0.anInt6448 = 1;
							Static171.method2603(arg0.anInt6451, arg0.anInt8796, local189, arg0.anInt8795, arg0.aByte116, arg0 == Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2);
						}
						if (local189.anIntArray202.length <= arg0.anInt6451) {
							if (local177.aBoolean216) {
								arg0.anInt6394++;
								arg0.anInt6451 -= local189.anInt3744;
								if (arg0.anInt6394 >= local189.anInt3743) {
									arg0.anInt6452 = -1;
								} else if (arg0.anInt6451 >= 0 && local189.anIntArray202.length > arg0.anInt6451) {
									Static171.method2603(arg0.anInt6451, arg0.anInt8796, local189, arg0.anInt8795, arg0.aByte116, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 == arg0);
								} else {
									arg0.anInt6452 = -1;
								}
							} else {
								arg0.anInt6452 = -1;
							}
						}
						arg0.anInt6397 = arg0.anInt6451 + 1;
						if (arg0.anInt6397 >= local189.anIntArray202.length) {
							if (local177.aBoolean216) {
								arg0.anInt6397 -= local189.anInt3744;
								if (arg0.anInt6394 + 1 >= local189.anInt3743) {
									arg0.anInt6397 = -1;
								} else if (arg0.anInt6397 < 0 || local189.anIntArray202.length <= arg0.anInt6397) {
									arg0.anInt6397 = -1;
								}
							} else {
								arg0.anInt6397 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6438 != -1 && arg0.anInt6455 <= 1) {
			local11 = Static594.aClass311_2.method7009(arg0.anInt6438);
			if (local11.anInt3732 == 3) {
				if (arg0.anInt6466 > 0 && Static81.anInt1910 >= arg0.anInt6429 && Static81.anInt1910 > arg0.anInt6387) {
					arg0.anIntArray429 = null;
					arg0.anInt6438 = -1;
				}
			} else if (local11.anInt3732 == 1 && arg0.anInt6466 > 0 && Static81.anInt1910 >= arg0.anInt6429 && Static81.anInt1910 > arg0.anInt6387) {
				arg0.anInt6455 = 2;
			}
		}
		if (arg0.anInt6438 != -1 && arg0.anInt6455 == 0) {
			local11 = Static594.aClass311_2.method7009(arg0.anInt6438);
			if (local11 == null || local11.anIntArray202 == null) {
				arg0.anInt6438 = -1;
				arg0.anIntArray429 = null;
			} else {
				arg0.anInt6447++;
				if (arg0.anInt6392 < local11.anIntArray202.length && local11.anIntArray204[arg0.anInt6392] < arg0.anInt6447) {
					arg0.anInt6447 = 1;
					arg0.anInt6392++;
					Static171.method2603(arg0.anInt6392, arg0.anInt8796, local11, arg0.anInt8795, arg0.aByte116, arg0 == Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2);
				}
				if (local11.anIntArray202.length <= arg0.anInt6392) {
					arg0.anInt6392 -= local11.anInt3744;
					arg0.anInt6441++;
					if (arg0.anInt6441 >= local11.anInt3743) {
						arg0.anIntArray429 = null;
						arg0.anInt6438 = -1;
					} else if (arg0.anInt6392 >= 0 && arg0.anInt6392 < local11.anIntArray202.length) {
						Static171.method2603(arg0.anInt6392, arg0.anInt8796, local11, arg0.anInt8795, arg0.aByte116, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 == arg0);
					} else {
						arg0.anIntArray429 = null;
						arg0.anInt6438 = -1;
					}
				}
				arg0.anInt6420 = arg0.anInt6392 + 1;
				if (arg0.anInt6420 >= local11.anIntArray202.length) {
					arg0.anInt6420 -= local11.anInt3744;
					if (arg0.anInt6441 + 1 >= local11.anInt3743) {
						arg0.anInt6420 = -1;
					} else if (arg0.anInt6420 < 0 || local11.anIntArray202.length <= arg0.anInt6420) {
						arg0.anInt6420 = -1;
					}
				}
			}
		}
		if (arg0.anInt6455 > 0) {
			arg0.anInt6455--;
		}
		for (@Pc(1075) int local1075 = 0; local1075 < arg0.aClass313Array3.length; local1075++) {
			@Pc(1082) Class313 local1082 = arg0.aClass313Array3[local1075];
			if (local1082 != null) {
				if (local1082.anInt8488 > 0) {
					local1082.anInt8488--;
				} else {
					local189 = Static594.aClass311_2.method7009(local1082.anInt8491);
					if (local189 == null || local189.anIntArray202 == null) {
						arg0.aClass313Array3[local1075] = null;
					} else {
						local1082.anInt8489++;
						if (local189.anIntArray202.length > local1082.anInt8493 && local1082.anInt8489 > local189.anIntArray204[local1082.anInt8493]) {
							local1082.anInt8489 = 1;
							local1082.anInt8493++;
							Static171.method2603(local1082.anInt8493, arg0.anInt8796, local189, arg0.anInt8795, arg0.aByte116, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 == arg0);
						}
						if (local189.anIntArray202.length <= local1082.anInt8493) {
							local1082.anInt8490++;
							local1082.anInt8493 -= local189.anInt3744;
							if (local1082.anInt8490 >= local189.anInt3743) {
								arg0.aClass313Array3[local1075] = null;
							} else if (local1082.anInt8493 >= 0 && local1082.anInt8493 < local189.anIntArray202.length) {
								Static171.method2603(local1082.anInt8493, arg0.anInt8796, local189, arg0.anInt8795, arg0.aByte116, arg0 == Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2);
							} else {
								arg0.aClass313Array3[local1075] = null;
							}
						}
						local1082.anInt8492 = local1082.anInt8493 + 1;
						if (local1082.anInt8492 >= local189.anIntArray202.length) {
							local1082.anInt8492 -= local189.anInt3744;
							if (local1082.anInt8490 + 1 >= local189.anInt3743) {
								local1082.anInt8492 = -1;
							} else if (local1082.anInt8492 < 0 || local1082.anInt8492 >= local189.anIntArray202.length) {
								local1082.anInt8492 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4316(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)V")
	public static void method4317() {
		Static174.aClass12_9.method6446(Static47.aFloat30, Static67.aFloat32, Static398.aFloat176);
	}
}
