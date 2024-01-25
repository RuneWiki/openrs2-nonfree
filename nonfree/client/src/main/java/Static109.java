import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_47 = new Class119(84, -2);

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
	public static int anInt2416 = 0;

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "Z")
	public static boolean aBoolean215 = false;

	@OriginalMember(owner = "client!fg", name = "x", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_79 = new Class189("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
	public static void method1851() {
		Static167.aClass126_20.method3135();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!ob;I)V")
	public static void method1852(@OriginalArg(0) Class7_Sub2_Sub3 arg0) {
		arg0.aBoolean376 = false;
		@Pc(24) Class128 local24;
		if (arg0.anInt4389 != -1) {
			local24 = Static301.aClass170_3.method3936(arg0.anInt4389);
			if (local24 == null || local24.anIntArray252 == null) {
				arg0.aBoolean378 = false;
				arg0.anInt4389 = -1;
			} else {
				label394: {
					arg0.anInt4328++;
					if (local24.anIntArray252.length > arg0.anInt4350 && arg0.anInt4328 > local24.anIntArray254[arg0.anInt4350]) {
						arg0.anInt4355++;
						arg0.anInt4350++;
						arg0.anInt4328 = 1;
						Static135.method2140(arg0.anInt4350, local24, arg0.anInt4321, Static379.aClass7_Sub2_Sub3_Sub2_2 == arg0, arg0.anInt4318, arg0.aByte77);
					}
					if (local24.anIntArray252.length <= arg0.anInt4350) {
						arg0.anInt4350 = 0;
						arg0.anInt4328 = 0;
						if (arg0.aBoolean378) {
							arg0.anInt4389 = arg0.method3514().method2();
							if (arg0.anInt4389 == -1) {
								arg0.aBoolean378 = false;
								break label394;
							}
							local24 = Static301.aClass170_3.method3936(arg0.anInt4389);
						}
						Static135.method2140(arg0.anInt4350, local24, arg0.anInt4321, arg0 == Static379.aClass7_Sub2_Sub3_Sub2_2, arg0.anInt4318, arg0.aByte77);
					}
					arg0.anInt4355 = arg0.anInt4350 + 1;
					if (local24.anIntArray252.length <= arg0.anInt4355) {
						arg0.anInt4355 = 0;
					}
				}
			}
		}
		@Pc(183) int local183;
		@Pc(192) Class128 local192;
		@Pc(180) Class13 local180;
		if (arg0.anInt4345 != -1 && Static253.anInt4787 >= arg0.anInt4400) {
			local180 = Static96.aClass41_2.method1134(arg0.anInt4345);
			local183 = local180.anInt466;
			if (local183 == -1) {
				arg0.anInt4345 = -1;
			} else {
				label396: {
					local192 = Static301.aClass170_3.method3936(local183);
					if (local180.aBoolean32) {
						if (local192.anInt3980 == 3) {
							if (arg0.anInt4403 > 0 && Static253.anInt4787 >= arg0.anInt4339 && Static253.anInt4787 > arg0.anInt4398) {
								arg0.anInt4345 = -1;
								break label396;
							}
						} else if (local192.anInt3980 == 1 && arg0.anInt4403 > 0 && Static253.anInt4787 >= arg0.anInt4339 && Static253.anInt4787 > arg0.anInt4398) {
							arg0.anInt4400 = Static253.anInt4787 + 1;
							break label396;
						}
					}
					if (local192 == null || local192.anIntArray252 == null) {
						arg0.anInt4345 = -1;
					} else {
						if (arg0.anInt4380 < 0) {
							arg0.anInt4380 = 0;
							Static135.method2140(0, local192, arg0.anInt4321, arg0 == Static379.aClass7_Sub2_Sub3_Sub2_2, arg0.anInt4318, arg0.aByte77);
						}
						arg0.anInt4342++;
						if (local192.anIntArray252.length > arg0.anInt4380 && local192.anIntArray254[arg0.anInt4380] < arg0.anInt4342) {
							arg0.anInt4380++;
							arg0.anInt4342 = 1;
							Static135.method2140(arg0.anInt4380, local192, arg0.anInt4321, arg0 == Static379.aClass7_Sub2_Sub3_Sub2_2, arg0.anInt4318, arg0.aByte77);
						}
						if (local192.anIntArray252.length <= arg0.anInt4380) {
							if (local180.aBoolean32) {
								arg0.anInt4359++;
								arg0.anInt4380 -= local192.anInt3970;
								if (local192.anInt3968 <= arg0.anInt4359) {
									arg0.anInt4345 = -1;
								} else if (arg0.anInt4380 >= 0 && local192.anIntArray252.length > arg0.anInt4380) {
									Static135.method2140(arg0.anInt4380, local192, arg0.anInt4321, arg0 == Static379.aClass7_Sub2_Sub3_Sub2_2, arg0.anInt4318, arg0.aByte77);
								} else {
									arg0.anInt4345 = -1;
								}
							} else {
								arg0.anInt4345 = -1;
							}
						}
						arg0.anInt4390 = arg0.anInt4380 + 1;
						if (arg0.anInt4390 >= local192.anIntArray252.length) {
							if (local180.aBoolean32) {
								arg0.anInt4390 -= local192.anInt3970;
								if (arg0.anInt4359 + 1 >= local192.anInt3968) {
									arg0.anInt4390 = -1;
								} else if (arg0.anInt4390 < 0 || local192.anIntArray252.length <= arg0.anInt4390) {
									arg0.anInt4390 = -1;
								}
							} else {
								arg0.anInt4390 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4349 != -1 && arg0.anInt4399 <= Static253.anInt4787) {
			local180 = Static96.aClass41_2.method1134(arg0.anInt4349);
			local183 = local180.anInt466;
			if (local183 == -1) {
				arg0.anInt4349 = -1;
			} else {
				label400: {
					local192 = Static301.aClass170_3.method3936(local183);
					if (local180.aBoolean32) {
						if (local192.anInt3980 == 3) {
							if (arg0.anInt4403 > 0 && arg0.anInt4339 <= Static253.anInt4787 && arg0.anInt4398 < Static253.anInt4787) {
								arg0.anInt4349 = -1;
								break label400;
							}
						} else if (local192.anInt3980 == 1 && arg0.anInt4403 > 0 && Static253.anInt4787 >= arg0.anInt4339 && arg0.anInt4398 < Static253.anInt4787) {
							arg0.anInt4399 = Static253.anInt4787 + 1;
							break label400;
						}
					}
					if (local192 == null || local192.anIntArray252 == null) {
						arg0.anInt4349 = -1;
					} else {
						if (arg0.anInt4346 < 0) {
							arg0.anInt4346 = 0;
							Static135.method2140(0, local192, arg0.anInt4321, arg0 == Static379.aClass7_Sub2_Sub3_Sub2_2, arg0.anInt4318, arg0.aByte77);
						}
						arg0.anInt4368++;
						if (local192.anIntArray252.length > arg0.anInt4346 && local192.anIntArray254[arg0.anInt4346] < arg0.anInt4368) {
							arg0.anInt4346++;
							arg0.anInt4368 = 1;
							Static135.method2140(arg0.anInt4346, local192, arg0.anInt4321, arg0 == Static379.aClass7_Sub2_Sub3_Sub2_2, arg0.anInt4318, arg0.aByte77);
						}
						if (local192.anIntArray252.length <= arg0.anInt4346) {
							if (local180.aBoolean32) {
								arg0.anInt4346 -= local192.anInt3970;
								arg0.anInt4356++;
								if (local192.anInt3968 <= arg0.anInt4356) {
									arg0.anInt4349 = -1;
								} else if (arg0.anInt4346 >= 0 && local192.anIntArray252.length > arg0.anInt4346) {
									Static135.method2140(arg0.anInt4346, local192, arg0.anInt4321, Static379.aClass7_Sub2_Sub3_Sub2_2 == arg0, arg0.anInt4318, arg0.aByte77);
								} else {
									arg0.anInt4349 = -1;
								}
							} else {
								arg0.anInt4349 = -1;
							}
						}
						arg0.anInt4329 = arg0.anInt4346 + 1;
						if (local192.anIntArray252.length <= arg0.anInt4329) {
							if (local180.aBoolean32) {
								arg0.anInt4329 -= local192.anInt3970;
								if (arg0.anInt4356 + 1 >= local192.anInt3968) {
									arg0.anInt4329 = -1;
								} else if (arg0.anInt4329 < 0 || local192.anIntArray252.length <= arg0.anInt4329) {
									arg0.anInt4329 = -1;
								}
							} else {
								arg0.anInt4329 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4366 != -1 && arg0.anInt4387 <= 1) {
			local24 = Static301.aClass170_3.method3936(arg0.anInt4366);
			if (local24.anInt3980 == 3) {
				if (arg0.anInt4403 > 0 && arg0.anInt4339 <= Static253.anInt4787 && arg0.anInt4398 < Static253.anInt4787) {
					arg0.anInt4366 = -1;
				}
			} else if (local24.anInt3980 == 1 && arg0.anInt4403 > 0 && arg0.anInt4339 <= Static253.anInt4787 && Static253.anInt4787 > arg0.anInt4398) {
				arg0.anInt4387 = 2;
			}
		}
		if (arg0.anInt4366 != -1 && arg0.anInt4387 == 0) {
			local24 = Static301.aClass170_3.method3936(arg0.anInt4366);
			if (local24 == null || local24.anIntArray252 == null) {
				arg0.anInt4366 = -1;
			} else {
				arg0.anInt4397++;
				if (local24.anIntArray252.length > arg0.anInt4327 && local24.anIntArray254[arg0.anInt4327] < arg0.anInt4397) {
					arg0.anInt4327++;
					arg0.anInt4397 = 1;
					Static135.method2140(arg0.anInt4327, local24, arg0.anInt4321, arg0 == Static379.aClass7_Sub2_Sub3_Sub2_2, arg0.anInt4318, arg0.aByte77);
				}
				if (arg0.anInt4327 >= local24.anIntArray252.length) {
					arg0.anInt4333++;
					arg0.anInt4327 -= local24.anInt3970;
					if (local24.anInt3968 <= arg0.anInt4333) {
						arg0.anInt4366 = -1;
					} else if (arg0.anInt4327 >= 0 && arg0.anInt4327 < local24.anIntArray252.length) {
						Static135.method2140(arg0.anInt4327, local24, arg0.anInt4321, Static379.aClass7_Sub2_Sub3_Sub2_2 == arg0, arg0.anInt4318, arg0.aByte77);
					} else {
						arg0.anInt4366 = -1;
					}
				}
				arg0.anInt4336 = arg0.anInt4327 + 1;
				if (local24.anIntArray252.length <= arg0.anInt4336) {
					arg0.anInt4336 -= local24.anInt3970;
					if (local24.anInt3968 <= arg0.anInt4333 + 1) {
						arg0.anInt4336 = -1;
					} else if (arg0.anInt4336 < 0 || local24.anIntArray252.length <= arg0.anInt4336) {
						arg0.anInt4336 = -1;
					}
				}
				arg0.aBoolean376 = local24.aBoolean344;
			}
		}
		if (arg0.anInt4387 > 0) {
			arg0.anInt4387--;
		}
		for (@Pc(1038) int local1038 = 0; local1038 < arg0.aClass17Array3.length; local1038++) {
			@Pc(1044) Class17 local1044 = arg0.aClass17Array3[local1038];
			if (local1044 != null) {
				if (local1044.anInt767 > 0) {
					local1044.anInt767--;
				} else {
					local192 = Static301.aClass170_3.method3936(local1044.anInt770);
					if (local192 == null || local192.anIntArray252 == null) {
						arg0.aClass17Array3[local1038] = null;
					} else {
						local1044.anInt771++;
						if (local1044.anInt768 < local192.anIntArray252.length && local1044.anInt771 > local192.anIntArray254[local1044.anInt768]) {
							local1044.anInt768++;
							local1044.anInt771 = 1;
							Static135.method2140(local1044.anInt768, local192, arg0.anInt4321, arg0 == Static379.aClass7_Sub2_Sub3_Sub2_2, arg0.anInt4318, arg0.aByte77);
						}
						if (local192.anIntArray252.length <= local1044.anInt768) {
							local1044.anInt766++;
							local1044.anInt768 -= local192.anInt3970;
							if (local1044.anInt766 >= local192.anInt3968) {
								arg0.aClass17Array3[local1038] = null;
							} else if (local1044.anInt768 >= 0 && local192.anIntArray252.length > local1044.anInt768) {
								Static135.method2140(local1044.anInt768, local192, arg0.anInt4321, Static379.aClass7_Sub2_Sub3_Sub2_2 == arg0, arg0.anInt4318, arg0.aByte77);
							} else {
								arg0.aClass17Array3[local1038] = null;
							}
						}
						local1044.anInt769 = local1044.anInt768 + 1;
						if (local192.anIntArray252.length <= local1044.anInt769) {
							local1044.anInt769 -= local192.anInt3970;
							if (local192.anInt3968 <= local1044.anInt766 + 1) {
								local1044.anInt769 = -1;
							} else if (local1044.anInt769 < 0 || local1044.anInt769 >= local192.anIntArray252.length) {
								local1044.anInt769 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BII)Lclient!mq;")
	public static Class156 method1853(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class156 local7 = Static435.method5705(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass156Array2 == null || local7.aClass156Array2.length <= arg1) {
			return null;
		} else {
			return local7.aClass156Array2[arg1];
		}
	}
}
