import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
	public static int anInt2773;

	@OriginalMember(owner = "client!ig", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray30 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
	public static final int anInt2769 = 1401;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIZIZ)V")
	public static void method2392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static432.aLong224 = 0L;
		@Pc(8) int local8 = Static101.method1560();
		if (arg1 == 3 || local8 == 3) {
			arg3 = true;
		}
		if (!Static185.aClass34_7.method5760()) {
			arg3 = true;
		}
		Static270.method3795(arg3, local8, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!wk;I)V")
	public static void method2395(@OriginalArg(0) Class25_Sub5_Sub1 arg0) {
		arg0.anInt4297 = 0;
		@Pc(22) Class177 local22;
		if (arg0.anInt4287 != -1) {
			local22 = Static174.aClass254_1.method5670(arg0.anInt4287);
			if (local22 == null || local22.anIntArray326 == null) {
				arg0.aBoolean483 = false;
				arg0.anInt4287 = -1;
			} else {
				label394: {
					arg0.anInt4260++;
					if (local22.anIntArray326.length > arg0.anInt4240 && local22.anIntArray327[arg0.anInt4240] < arg0.anInt4260) {
						arg0.anInt4240++;
						arg0.anInt4311++;
						arg0.anInt4260 = 1;
						Static70.method1141(local22, arg0.aByte94, arg0.anInt5518, arg0.anInt5514, Static447.aClass25_Sub5_Sub1_Sub2_4 == arg0, arg0.anInt4240);
					}
					if (local22.anIntArray326.length <= arg0.anInt4240) {
						arg0.anInt4240 = 0;
						arg0.anInt4260 = 0;
						if (arg0.aBoolean483) {
							arg0.anInt4287 = arg0.method3428().method5075();
							if (arg0.anInt4287 == -1) {
								arg0.aBoolean483 = false;
								break label394;
							}
							local22 = Static174.aClass254_1.method5670(arg0.anInt4287);
						}
						Static70.method1141(local22, arg0.aByte94, arg0.anInt5518, arg0.anInt5514, arg0 == Static447.aClass25_Sub5_Sub1_Sub2_4, arg0.anInt4240);
					}
					arg0.anInt4311 = arg0.anInt4240 + 1;
					if (arg0.anInt4311 >= local22.anIntArray326.length) {
						arg0.anInt4311 = 0;
					}
				}
			}
		}
		@Pc(183) int local183;
		@Pc(191) Class177 local191;
		@Pc(180) Class130 local180;
		if (arg0.anInt4283 != -1 && arg0.anInt4261 <= Static236.anInt4213) {
			local180 = Static88.aClass69_1.method1553(arg0.anInt4283);
			local183 = local180.anInt3576;
			if (local183 == -1) {
				arg0.anInt4283 = -1;
			} else {
				label396: {
					local191 = Static174.aClass254_1.method5670(local183);
					if (local180.aBoolean410) {
						if (local191.anInt5042 == 3) {
							if (arg0.anInt4316 > 0 && Static236.anInt4213 >= arg0.anInt4285 && Static236.anInt4213 > arg0.anInt4244) {
								arg0.anInt4283 = -1;
								break label396;
							}
						} else if (local191.anInt5042 == 1 && arg0.anInt4316 > 0 && arg0.anInt4285 <= Static236.anInt4213 && arg0.anInt4244 < Static236.anInt4213) {
							arg0.anInt4261 = Static236.anInt4213 + 1;
							break label396;
						}
					}
					if (local191 == null || local191.anIntArray326 == null) {
						arg0.anInt4283 = -1;
					} else {
						if (arg0.anInt4252 < 0) {
							arg0.anInt4252 = 0;
							Static70.method1141(local191, arg0.aByte94, arg0.anInt5518, arg0.anInt5514, arg0 == Static447.aClass25_Sub5_Sub1_Sub2_4, 0);
						}
						arg0.anInt4257++;
						if (arg0.anInt4252 < local191.anIntArray326.length && local191.anIntArray327[arg0.anInt4252] < arg0.anInt4257) {
							arg0.anInt4252++;
							arg0.anInt4257 = 1;
							Static70.method1141(local191, arg0.aByte94, arg0.anInt5518, arg0.anInt5514, arg0 == Static447.aClass25_Sub5_Sub1_Sub2_4, arg0.anInt4252);
						}
						if (local191.anIntArray326.length <= arg0.anInt4252) {
							if (local180.aBoolean410) {
								arg0.anInt4252 -= local191.anInt5041;
								arg0.anInt4279++;
								if (local191.anInt5043 <= arg0.anInt4279) {
									arg0.anInt4283 = -1;
								} else if (arg0.anInt4252 >= 0 && local191.anIntArray326.length > arg0.anInt4252) {
									Static70.method1141(local191, arg0.aByte94, arg0.anInt5518, arg0.anInt5514, arg0 == Static447.aClass25_Sub5_Sub1_Sub2_4, arg0.anInt4252);
								} else {
									arg0.anInt4283 = -1;
								}
							} else {
								arg0.anInt4283 = -1;
							}
						}
						arg0.anInt4300 = arg0.anInt4252 + 1;
						if (local191.anIntArray326.length <= arg0.anInt4300) {
							if (local180.aBoolean410) {
								arg0.anInt4300 -= local191.anInt5041;
								if (local191.anInt5043 <= arg0.anInt4279 + 1) {
									arg0.anInt4300 = -1;
								} else if (arg0.anInt4300 < 0 || arg0.anInt4300 >= local191.anIntArray326.length) {
									arg0.anInt4300 = -1;
								}
							} else {
								arg0.anInt4300 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4267 != -1 && arg0.anInt4281 <= Static236.anInt4213) {
			local180 = Static88.aClass69_1.method1553(arg0.anInt4267);
			local183 = local180.anInt3576;
			if (local183 == -1) {
				arg0.anInt4267 = -1;
			} else {
				label399: {
					local191 = Static174.aClass254_1.method5670(local183);
					if (local180.aBoolean410) {
						if (local191.anInt5042 == 3) {
							if (arg0.anInt4316 > 0 && arg0.anInt4285 <= Static236.anInt4213 && Static236.anInt4213 > arg0.anInt4244) {
								arg0.anInt4267 = -1;
								break label399;
							}
						} else if (local191.anInt5042 == 1 && arg0.anInt4316 > 0 && arg0.anInt4285 <= Static236.anInt4213 && Static236.anInt4213 > arg0.anInt4244) {
							arg0.anInt4281 = Static236.anInt4213 + 1;
							break label399;
						}
					}
					if (local191 == null || local191.anIntArray326 == null) {
						arg0.anInt4267 = -1;
					} else {
						if (arg0.anInt4258 < 0) {
							arg0.anInt4258 = 0;
							Static70.method1141(local191, arg0.aByte94, arg0.anInt5518, arg0.anInt5514, Static447.aClass25_Sub5_Sub1_Sub2_4 == arg0, 0);
						}
						arg0.anInt4306++;
						if (local191.anIntArray326.length > arg0.anInt4258 && arg0.anInt4306 > local191.anIntArray327[arg0.anInt4258]) {
							arg0.anInt4306 = 1;
							arg0.anInt4258++;
							Static70.method1141(local191, arg0.aByte94, arg0.anInt5518, arg0.anInt5514, arg0 == Static447.aClass25_Sub5_Sub1_Sub2_4, arg0.anInt4258);
						}
						if (arg0.anInt4258 >= local191.anIntArray326.length) {
							if (local180.aBoolean410) {
								arg0.anInt4258 -= local191.anInt5041;
								arg0.anInt4309++;
								if (local191.anInt5043 <= arg0.anInt4309) {
									arg0.anInt4267 = -1;
								} else if (arg0.anInt4258 >= 0 && arg0.anInt4258 < local191.anIntArray326.length) {
									Static70.method1141(local191, arg0.aByte94, arg0.anInt5518, arg0.anInt5514, Static447.aClass25_Sub5_Sub1_Sub2_4 == arg0, arg0.anInt4258);
								} else {
									arg0.anInt4267 = -1;
								}
							} else {
								arg0.anInt4267 = -1;
							}
						}
						arg0.anInt4290 = arg0.anInt4258 + 1;
						if (local191.anIntArray326.length <= arg0.anInt4290) {
							if (local180.aBoolean410) {
								arg0.anInt4290 -= local191.anInt5041;
								if (local191.anInt5043 <= arg0.anInt4309 + 1) {
									arg0.anInt4290 = -1;
								} else if (arg0.anInt4290 < 0 || arg0.anInt4290 >= local191.anIntArray326.length) {
									arg0.anInt4290 = -1;
								}
							} else {
								arg0.anInt4290 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4270 != -1 && arg0.anInt4235 <= 1) {
			local22 = Static174.aClass254_1.method5670(arg0.anInt4270);
			if (local22.anInt5042 == 3) {
				if (arg0.anInt4316 > 0 && arg0.anInt4285 <= Static236.anInt4213 && Static236.anInt4213 > arg0.anInt4244) {
					arg0.anInt4270 = -1;
				}
			} else if (local22.anInt5042 == 1 && arg0.anInt4316 > 0 && arg0.anInt4285 <= Static236.anInt4213 && arg0.anInt4244 < Static236.anInt4213) {
				arg0.anInt4235 = 2;
			}
		}
		if (arg0.anInt4270 != -1 && arg0.anInt4235 == 0) {
			local22 = Static174.aClass254_1.method5670(arg0.anInt4270);
			if (local22 == null || local22.anIntArray326 == null) {
				arg0.anInt4270 = -1;
			} else {
				arg0.anInt4271++;
				if (local22.anIntArray326.length > arg0.anInt4301 && local22.anIntArray327[arg0.anInt4301] < arg0.anInt4271) {
					arg0.anInt4271 = 1;
					arg0.anInt4301++;
					Static70.method1141(local22, arg0.aByte94, arg0.anInt5518, arg0.anInt5514, arg0 == Static447.aClass25_Sub5_Sub1_Sub2_4, arg0.anInt4301);
				}
				if (local22.anIntArray326.length <= arg0.anInt4301) {
					arg0.anInt4277++;
					arg0.anInt4301 -= local22.anInt5041;
					if (arg0.anInt4277 >= local22.anInt5043) {
						arg0.anInt4270 = -1;
					} else if (arg0.anInt4301 >= 0 && arg0.anInt4301 < local22.anIntArray326.length) {
						Static70.method1141(local22, arg0.aByte94, arg0.anInt5518, arg0.anInt5514, arg0 == Static447.aClass25_Sub5_Sub1_Sub2_4, arg0.anInt4301);
					} else {
						arg0.anInt4270 = -1;
					}
				}
				arg0.lb = arg0.anInt4301 + 1;
				if (local22.anIntArray326.length <= arg0.lb) {
					arg0.lb -= local22.anInt5041;
					if (local22.anInt5043 <= arg0.anInt4277 + 1) {
						arg0.lb = -1;
					} else if (arg0.lb < 0 || local22.anIntArray326.length <= arg0.lb) {
						arg0.lb = -1;
					}
				}
				arg0.anInt4297 = local22.anInt5044;
			}
		}
		if (arg0.anInt4235 > 0) {
			arg0.anInt4235--;
		}
		for (@Pc(1072) int local1072 = 0; local1072 < arg0.aClass74Array3.length; local1072++) {
			@Pc(1079) Class74 local1079 = arg0.aClass74Array3[local1072];
			if (local1079 != null) {
				if (local1079.anInt1915 > 0) {
					local1079.anInt1915--;
				} else {
					local191 = Static174.aClass254_1.method5670(local1079.anInt1918);
					if (local191 == null || local191.anIntArray326 == null) {
						arg0.aClass74Array3[local1072] = null;
					} else {
						local1079.anInt1914++;
						if (local191.anIntArray326.length > local1079.anInt1913 && local191.anIntArray327[local1079.anInt1913] < local1079.anInt1914) {
							local1079.anInt1913++;
							local1079.anInt1914 = 1;
							Static70.method1141(local191, arg0.aByte94, arg0.anInt5518, arg0.anInt5514, arg0 == Static447.aClass25_Sub5_Sub1_Sub2_4, local1079.anInt1913);
						}
						if (local1079.anInt1913 >= local191.anIntArray326.length) {
							local1079.anInt1916++;
							local1079.anInt1913 -= local191.anInt5041;
							if (local191.anInt5043 <= local1079.anInt1916) {
								arg0.aClass74Array3[local1072] = null;
							} else if (local1079.anInt1913 >= 0 && local191.anIntArray326.length > local1079.anInt1913) {
								Static70.method1141(local191, arg0.aByte94, arg0.anInt5518, arg0.anInt5514, Static447.aClass25_Sub5_Sub1_Sub2_4 == arg0, local1079.anInt1913);
							} else {
								arg0.aClass74Array3[local1072] = null;
							}
						}
						local1079.anInt1917 = local1079.anInt1913 + 1;
						if (local191.anIntArray326.length <= local1079.anInt1917) {
							local1079.anInt1917 -= local191.anInt5041;
							if (local191.anInt5043 <= local1079.anInt1916 + 1) {
								local1079.anInt1917 = -1;
							} else if (local1079.anInt1917 < 0 || local191.anIntArray326.length <= local1079.anInt1917) {
								local1079.anInt1917 = -1;
							}
						}
					}
				}
			}
		}
	}
}
