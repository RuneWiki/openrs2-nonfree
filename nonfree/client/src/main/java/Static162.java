import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!k", name = "G", descriptor = "Lclient!r;")
	public static Class197 aClass197_45;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BLclient!mr;)V", line = 38)
	public static void method3316(@OriginalArg(1) Class11_Sub5_Sub2 arg0) {
		arg0.aBoolean318 = false;
		@Pc(20) Class157 local20;
		if (arg0.anInt4577 != -1) {
			local20 = Static37.aClass85_1.method2373(arg0.anInt4577);
			if (local20 == null || local20.anIntArray262 == null) {
				arg0.aBoolean317 = false;
				arg0.anInt4577 = -1;
			} else {
				label297: {
					arg0.anInt4620++;
					if (local20.anIntArray262.length > arg0.anInt4617 && arg0.anInt4620 > local20.anIntArray261[arg0.anInt4617]) {
						arg0.anInt4617++;
						arg0.anInt4585++;
						arg0.anInt4620 = 1;
						Static1.method4(local20, Static17.aClass11_Sub5_Sub2_Sub1_3 == arg0, arg0.aByte78, arg0.anInt6768, arg0.anInt6770, arg0.anInt4617);
					}
					if (local20.anIntArray262.length <= arg0.anInt4617) {
						arg0.anInt4617 = 0;
						arg0.anInt4620 = 0;
						if (arg0.aBoolean317) {
							arg0.anInt4577 = arg0.method4333().method5697();
							if (arg0.anInt4577 == -1) {
								arg0.aBoolean317 = false;
								break label297;
							}
							local20 = Static37.aClass85_1.method2373(arg0.anInt4577);
						}
						Static1.method4(local20, arg0 == Static17.aClass11_Sub5_Sub2_Sub1_3, arg0.aByte78, arg0.anInt6768, arg0.anInt6770, arg0.anInt4617);
					}
					arg0.anInt4585 = arg0.anInt4617 + 1;
					if (local20.anIntArray262.length <= arg0.anInt4585) {
						arg0.anInt4585 = 0;
					}
				}
			}
		}
		@Pc(196) Class157 local196;
		if (arg0.anInt4586 != -1 && arg0.anInt4587 <= Class83.anInt2345) {
			@Pc(184) Class91 local184 = Static299.aClass211_2.method5408(arg0.anInt4586);
			@Pc(187) int local187 = local184.anInt2445;
			if (local187 == -1) {
				arg0.anInt4586 = -1;
			} else {
				label299: {
					local196 = Static37.aClass85_1.method2373(local187);
					if (local184.aBoolean177) {
						if (local196.anInt4022 == 3) {
							if (arg0.anInt4633 > 0 && arg0.anInt4613 <= Class83.anInt2345 && arg0.anInt4576 < Class83.anInt2345) {
								arg0.anInt4586 = -1;
								break label299;
							}
						} else if (local196.anInt4022 == 1 && arg0.anInt4633 > 0 && Class83.anInt2345 >= arg0.anInt4613 && Class83.anInt2345 > arg0.anInt4576) {
							arg0.anInt4587 = Class83.anInt2345 + 1;
							break label299;
						}
					}
					if (local196 == null || local196.anIntArray262 == null) {
						arg0.anInt4586 = -1;
					} else {
						if (arg0.anInt4574 < 0) {
							arg0.anInt4574 = 0;
							Static1.method4(local196, arg0 == Static17.aClass11_Sub5_Sub2_Sub1_3, arg0.aByte78, arg0.anInt6768, arg0.anInt6770, 0);
						}
						arg0.anInt4611++;
						if (arg0.anInt4574 < local196.anIntArray262.length && local196.anIntArray261[arg0.anInt4574] < arg0.anInt4611) {
							arg0.anInt4611 = 1;
							arg0.anInt4574++;
							Static1.method4(local196, arg0 == Static17.aClass11_Sub5_Sub2_Sub1_3, arg0.aByte78, arg0.anInt6768, arg0.anInt6770, arg0.anInt4574);
						}
						if (local196.anIntArray262.length <= arg0.anInt4574) {
							if (local184.aBoolean177) {
								arg0.anInt4574 -= local196.anInt4027;
								arg0.anInt4594++;
								if (arg0.anInt4594 >= local196.anInt4019) {
									arg0.anInt4586 = -1;
								} else if (arg0.anInt4574 >= 0 && local196.anIntArray262.length > arg0.anInt4574) {
									Static1.method4(local196, Static17.aClass11_Sub5_Sub2_Sub1_3 == arg0, arg0.aByte78, arg0.anInt6768, arg0.anInt6770, arg0.anInt4574);
								} else {
									arg0.anInt4586 = -1;
								}
							} else {
								arg0.anInt4586 = -1;
							}
						}
						arg0.anInt4603 = arg0.anInt4574 + 1;
						if (arg0.anInt4603 >= local196.anIntArray262.length) {
							if (local184.aBoolean177) {
								arg0.anInt4603 -= local196.anInt4027;
								if (arg0.anInt4594 + 1 >= local196.anInt4019) {
									arg0.anInt4603 = -1;
								} else if (arg0.anInt4603 < 0 || local196.anIntArray262.length <= arg0.anInt4603) {
									arg0.anInt4603 = -1;
								}
							} else {
								arg0.anInt4603 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4589 != -1 && arg0.anInt4582 <= 1) {
			local20 = Static37.aClass85_1.method2373(arg0.anInt4589);
			if (local20.anInt4022 == 3) {
				if (arg0.anInt4633 > 0 && arg0.anInt4613 <= Class83.anInt2345 && Class83.anInt2345 > arg0.anInt4576) {
					arg0.anInt4589 = -1;
				}
			} else if (local20.anInt4022 == 1 && arg0.anInt4633 > 0 && arg0.anInt4613 <= Class83.anInt2345 && Class83.anInt2345 > arg0.anInt4576) {
				arg0.anInt4582 = 2;
			}
		}
		if (arg0.anInt4589 != -1 && arg0.anInt4582 == 0) {
			local20 = Static37.aClass85_1.method2373(arg0.anInt4589);
			if (local20 == null || local20.anIntArray262 == null) {
				arg0.anInt4589 = -1;
			} else {
				arg0.anInt4615++;
				if (local20.anIntArray262.length > arg0.anInt4599 && local20.anIntArray261[arg0.anInt4599] < arg0.anInt4615) {
					arg0.anInt4615 = 1;
					arg0.anInt4599++;
					Static1.method4(local20, arg0 == Static17.aClass11_Sub5_Sub2_Sub1_3, arg0.aByte78, arg0.anInt6768, arg0.anInt6770, arg0.anInt4599);
				}
				if (arg0.anInt4599 >= local20.anIntArray262.length) {
					arg0.anInt4590++;
					arg0.anInt4599 -= local20.anInt4027;
					if (arg0.anInt4590 >= local20.anInt4019) {
						arg0.anInt4589 = -1;
					} else if (arg0.anInt4599 >= 0 && local20.anIntArray262.length > arg0.anInt4599) {
						Static1.method4(local20, arg0 == Static17.aClass11_Sub5_Sub2_Sub1_3, arg0.aByte78, arg0.anInt6768, arg0.anInt6770, arg0.anInt4599);
					} else {
						arg0.anInt4589 = -1;
					}
				}
				arg0.anInt4584 = arg0.anInt4599 + 1;
				if (local20.anIntArray262.length <= arg0.anInt4584) {
					arg0.anInt4584 -= local20.anInt4027;
					if (arg0.anInt4590 + 1 >= local20.anInt4019) {
						arg0.anInt4584 = -1;
					} else if (arg0.anInt4584 < 0 || local20.anIntArray262.length <= arg0.anInt4584) {
						arg0.anInt4584 = -1;
					}
				}
				arg0.aBoolean318 = local20.aBoolean261;
			}
		}
		if (arg0.anInt4582 > 0) {
			arg0.anInt4582--;
		}
		for (@Pc(765) int local765 = 0; local765 < arg0.aClass20Array3.length; local765++) {
			@Pc(777) Class20 local777 = arg0.aClass20Array3[local765];
			if (local777 != null) {
				if (local777.anInt629 > 0) {
					local777.anInt629--;
				} else {
					local196 = Static37.aClass85_1.method2373(local777.anInt624);
					if (local196 == null || local196.anIntArray262 == null) {
						arg0.aClass20Array3[local765] = null;
					} else {
						local777.anInt625++;
						if (local777.anInt628 < local196.anIntArray262.length && local196.anIntArray261[local777.anInt628] < local777.anInt625) {
							local777.anInt625 = 1;
							local777.anInt628++;
							Static1.method4(local196, Static17.aClass11_Sub5_Sub2_Sub1_3 == arg0, arg0.aByte78, arg0.anInt6768, arg0.anInt6770, local777.anInt628);
						}
						if (local777.anInt628 >= local196.anIntArray262.length) {
							local777.anInt626++;
							local777.anInt628 -= local196.anInt4027;
							if (local777.anInt626 >= local196.anInt4019) {
								arg0.aClass20Array3[local765] = null;
							} else if (local777.anInt628 >= 0 && local777.anInt628 < local196.anIntArray262.length) {
								Static1.method4(local196, arg0 == Static17.aClass11_Sub5_Sub2_Sub1_3, arg0.aByte78, arg0.anInt6768, arg0.anInt6770, local777.anInt628);
							} else {
								arg0.aClass20Array3[local765] = null;
							}
						}
						local777.anInt627 = local777.anInt628 + 1;
						if (local777.anInt627 >= local196.anIntArray262.length) {
							local777.anInt627 -= local196.anInt4027;
							if (local196.anInt4019 <= local777.anInt626 + 1) {
								local777.anInt627 = -1;
							} else if (local777.anInt627 < 0 || local777.anInt627 >= local196.anIntArray262.length) {
								local777.anInt627 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!hc;IIII)V", line = 355)
	public static void method3317(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static147.method2798(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static68.anInt1682) {
			Static147.method2798(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static147.method2798(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static196.anInt3769) {
			Static147.method2798(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static196.anInt3769) {
			Static147.method2798(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static68.anInt1682 && arg4 <= Static196.anInt3769) {
			Static147.method2798(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static147.method2798(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static68.anInt1682 && arg4 > 0) {
			Static147.method2798(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V", line = 692)
	public static void method3323(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub2_Sub7 local13 = Static293.method5414(8, arg0);
		local13.method2314();
	}
}
