import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!il", name = "l", descriptor = "I")
	public static int anInt4026;

	@OriginalMember(owner = "client!il", name = "i", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_89 = new Class362(116, -1);

	@OriginalMember(owner = "client!il", name = "j", descriptor = "[I")
	public static final int[] anIntArray194 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!il", name = "m", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_69 = new Class173(71, -1);

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III)Z")
	public static boolean method3585(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!dc;)V")
	public static void method3586(@OriginalArg(1) Class4_Sub11_Sub1 arg0) {
		arg0.method1531();
		@Pc(14) int local14 = Static411.anInt7797;
		@Pc(24) Class1_Sub4_Sub2_Sub1_Sub2 local24 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local14] = new Class1_Sub4_Sub2_Sub1_Sub2();
		local24.anInt8435 = local14;
		@Pc(32) int local32 = arg0.method1530(30);
		@Pc(37) byte local37 = (byte) (local32 >> 28);
		@Pc(43) int local43 = local32 >> 14 & 0x3FFF;
		local24.anIntArray463[0] = local43 - Static552.anInt9805;
		@Pc(55) int local55 = local32 & 0x3FFF;
		local24.anInt9934 = (local24.anIntArray463[0] << 9) + (local24.method6925() << 8);
		local24.anIntArray462[0] = local55 - Static254.anInt4667;
		local24.anInt9935 = (local24.anIntArray462[0] << 9) + (local24.method6925() << 8);
		Static13.anInt231 = local24.aByte126 = local24.aByte127 = local37;
		if (Static310.method5267(local24.anIntArray463[0], local24.anIntArray462[0])) {
			local24.aByte127++;
		}
		if (Static275.aClass4_Sub11Array1[local14] != null) {
			local24.method6945(Static275.aClass4_Sub11Array1[local14]);
		}
		Static413.anInt8212 = 0;
		Static229.anIntArray201[Static413.anInt8212++] = local14;
		Static270.aByteArray58[local14] = 0;
		Static244.anInt4461 = 0;
		for (@Pc(145) int local145 = 1; local145 < 2048; local145++) {
			if (local145 != local14) {
				@Pc(159) int local159 = arg0.method1530(18);
				@Pc(163) int local163 = local159 >> 16;
				@Pc(169) int local169 = local159 >> 8 & 0xFF;
				@Pc(173) int local173 = local159 & 0xFF;
				@Pc(181) Class41 local181 = Static61.aClass41Array1[local145] = new Class41();
				local181.anInt762 = -1;
				local181.anInt765 = (local163 << 28) + ((local169 << 14) + local173);
				local181.anInt764 = 0;
				local181.aBoolean37 = false;
				Static288.anIntArray538[Static244.anInt4461++] = local145;
				Static270.aByteArray58[local145] = 0;
			}
		}
		arg0.method1537();
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(III)Lclient!se;")
	public static Class4_Sub5_Sub16 method3587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(25) Class4_Sub5_Sub16 local25 = (Class4_Sub5_Sub16) Static32.aClass350_2.method8207((long) arg0 | (long) arg1 << 32);
		if (local25 == null) {
			local25 = new Class4_Sub5_Sub16(arg1, arg0);
			Static32.aClass350_2.method8199(local25.aLong268, local25);
		}
		return local25;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!ec;)V")
	public static void method3588(@OriginalArg(1) Class1_Sub4_Sub2_Sub1 arg0) {
		@Pc(11) Class365 local11;
		if (arg0.anInt8409 != -1) {
			local11 = Static61.aClass48_1.method1016(arg0.anInt8409);
			if (local11 == null || local11.anIntArray551 == null) {
				arg0.aBoolean589 = false;
				arg0.anInt8409 = -1;
			} else {
				label357: {
					arg0.anInt8392++;
					if (local11.anIntArray551.length > arg0.anInt8398 && local11.anIntArray552[arg0.anInt8398] < arg0.anInt8392) {
						arg0.anInt8398++;
						arg0.anInt8386++;
						arg0.anInt8392 = 1;
						if (!arg0.aBoolean590) {
							Static301.method5179(local11, arg0, arg0.anInt8398);
						}
					}
					if (local11.anIntArray551.length <= arg0.anInt8398) {
						arg0.anInt8398 = 0;
						arg0.anInt8392 = 0;
						if (arg0.aBoolean589) {
							arg0.anInt8409 = arg0.method6921().method7462();
							if (arg0.anInt8409 == -1) {
								arg0.aBoolean589 = false;
								break label357;
							}
							local11 = Static61.aClass48_1.method1016(arg0.anInt8409);
						}
						if (!arg0.aBoolean590) {
							Static301.method5179(local11, arg0, arg0.anInt8398);
						}
					}
					arg0.anInt8386 = arg0.anInt8398 + 1;
					if (local11.anIntArray551 == null) {
						arg0.aBoolean589 = false;
						arg0.anInt8409 = -1;
					} else if (local11.anIntArray551.length <= arg0.anInt8386) {
						arg0.anInt8386 = 0;
					}
				}
			}
		}
		@Pc(177) int local177;
		@Pc(191) Class365 local191;
		@Pc(174) Class200 local174;
		if (arg0.anInt8403 != -1 && Static106.anInt2418 >= arg0.anInt8429) {
			local174 = Static569.aClass213_2.method5291(arg0.anInt8403);
			local177 = local174.anInt5925;
			if (local177 == -1) {
				arg0.anInt8403 = -1;
			} else {
				label358: {
					local191 = Static61.aClass48_1.method1016(local177);
					if (local174.aBoolean441) {
						if (local191.anInt10219 == 3) {
							if (arg0.anInt8445 > 0 && Static106.anInt2418 >= arg0.anInt8426 && Static106.anInt2418 > arg0.anInt8413) {
								arg0.anInt8403 = -1;
								break label358;
							}
						} else if (local191.anInt10219 == 1 && arg0.anInt8445 > 0 && Static106.anInt2418 >= arg0.anInt8426 && Static106.anInt2418 > arg0.anInt8413) {
							arg0.anInt8429 = Static106.anInt2418 + 1;
							break label358;
						}
					}
					if (local191 == null || local191.anIntArray551 == null) {
						arg0.anInt8403 = -1;
					} else {
						if (arg0.anInt8417 < 0) {
							arg0.anInt8417 = 0;
							if (!arg0.aBoolean590) {
								Static301.method5179(local191, arg0, 0);
							}
						}
						arg0.anInt8397++;
						if (arg0.anInt8417 < local191.anIntArray551.length && arg0.anInt8397 > local191.anIntArray552[arg0.anInt8417]) {
							arg0.anInt8397 = 1;
							arg0.anInt8417++;
							if (!arg0.aBoolean590) {
								Static301.method5179(local191, arg0, arg0.anInt8417);
							}
						}
						if (local191.anIntArray551.length <= arg0.anInt8417) {
							if (local174.aBoolean441) {
								arg0.anInt8417 -= local191.anInt10217;
								arg0.anInt8404++;
								if (local191.anInt10222 <= arg0.anInt8404) {
									arg0.anInt8403 = -1;
								} else if (arg0.anInt8417 < 0 || local191.anIntArray551.length <= arg0.anInt8417) {
									arg0.anInt8403 = -1;
								} else if (!arg0.aBoolean590) {
									Static301.method5179(local191, arg0, arg0.anInt8417);
								}
							} else {
								arg0.anInt8403 = -1;
							}
						}
						arg0.anInt8396 = arg0.anInt8417 + 1;
						if (local191.anIntArray551.length <= arg0.anInt8396) {
							if (local174.aBoolean441) {
								arg0.anInt8396 -= local191.anInt10217;
								if (arg0.anInt8404 + 1 >= local191.anInt10222) {
									arg0.anInt8396 = -1;
								} else if (arg0.anInt8396 < 0 || local191.anIntArray551.length <= arg0.anInt8396) {
									arg0.anInt8396 = -1;
								}
							} else {
								arg0.anInt8396 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt8406 != -1 && arg0.anInt8376 <= Static106.anInt2418) {
			local174 = Static569.aClass213_2.method5291(arg0.anInt8406);
			local177 = local174.anInt5925;
			if (local177 == -1) {
				arg0.anInt8406 = -1;
			} else {
				label361: {
					local191 = Static61.aClass48_1.method1016(local177);
					if (local174.aBoolean441) {
						if (local191.anInt10219 == 3) {
							if (arg0.anInt8445 > 0 && arg0.anInt8426 <= Static106.anInt2418 && Static106.anInt2418 > arg0.anInt8413) {
								arg0.anInt8406 = -1;
								break label361;
							}
						} else if (local191.anInt10219 == 1 && arg0.anInt8445 > 0 && Static106.anInt2418 >= arg0.anInt8426 && arg0.anInt8413 < Static106.anInt2418) {
							arg0.anInt8376 = Static106.anInt2418 + 1;
							break label361;
						}
					}
					if (local191 == null || local191.anIntArray551 == null) {
						arg0.anInt8406 = -1;
					} else {
						if (arg0.anInt8383 < 0) {
							arg0.anInt8383 = 0;
							if (!arg0.aBoolean590) {
								Static301.method5179(local191, arg0, 0);
							}
						}
						arg0.anInt8432++;
						if (local191.anIntArray551.length > arg0.anInt8383 && arg0.anInt8432 > local191.anIntArray552[arg0.anInt8383]) {
							arg0.anInt8383++;
							arg0.anInt8432 = 1;
							if (!arg0.aBoolean590) {
								Static301.method5179(local191, arg0, arg0.anInt8383);
							}
						}
						if (arg0.anInt8383 >= local191.anIntArray551.length) {
							if (local174.aBoolean441) {
								arg0.anInt8416++;
								arg0.anInt8383 -= local191.anInt10217;
								if (local191.anInt10222 <= arg0.anInt8416) {
									arg0.anInt8406 = -1;
								} else if (arg0.anInt8383 < 0 || local191.anIntArray551.length <= arg0.anInt8383) {
									arg0.anInt8406 = -1;
								} else if (!arg0.aBoolean590) {
									Static301.method5179(local191, arg0, arg0.anInt8383);
								}
							} else {
								arg0.anInt8406 = -1;
							}
						}
						arg0.anInt8421 = arg0.anInt8383 + 1;
						if (arg0.anInt8421 >= local191.anIntArray551.length) {
							if (local174.aBoolean441) {
								arg0.anInt8421 -= local191.anInt10217;
								if (local191.anInt10222 <= arg0.anInt8416 + 1) {
									arg0.anInt8421 = -1;
								} else if (arg0.anInt8421 < 0 || local191.anIntArray551.length <= arg0.anInt8421) {
									arg0.anInt8421 = -1;
								}
							} else {
								arg0.anInt8421 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt8412 != -1 && arg0.anInt8378 <= 1) {
			local11 = Static61.aClass48_1.method1016(arg0.anInt8412);
			if (local11.anInt10219 == 3) {
				if (arg0.anInt8445 > 0 && Static106.anInt2418 >= arg0.anInt8426 && arg0.anInt8413 < Static106.anInt2418) {
					arg0.anInt8412 = -1;
					arg0.anIntArray459 = null;
				}
			} else if (local11.anInt10219 == 1 && arg0.anInt8445 > 0 && Static106.anInt2418 >= arg0.anInt8426 && Static106.anInt2418 > arg0.anInt8413) {
				arg0.anInt8378 = 2;
			}
		}
		if (arg0.anInt8412 != -1 && arg0.anInt8378 == 0) {
			local11 = Static61.aClass48_1.method1016(arg0.anInt8412);
			if (local11 == null || local11.anIntArray551 == null) {
				arg0.anInt8412 = -1;
				arg0.anIntArray459 = null;
			} else {
				arg0.anInt8433++;
				if (arg0.anInt8391 < local11.anIntArray551.length && local11.anIntArray552[arg0.anInt8391] < arg0.anInt8433) {
					arg0.anInt8391++;
					arg0.anInt8433 = 1;
					if (!arg0.aBoolean590) {
						Static301.method5179(local11, arg0, arg0.anInt8391);
					}
				}
				if (arg0.anInt8391 >= local11.anIntArray551.length) {
					arg0.anInt8391 -= local11.anInt10217;
					arg0.anInt8436++;
					if (local11.anInt10222 <= arg0.anInt8436) {
						arg0.anIntArray459 = null;
						arg0.anInt8412 = -1;
					} else if (arg0.anInt8391 < 0 || arg0.anInt8391 >= local11.anIntArray551.length) {
						arg0.anIntArray459 = null;
						arg0.anInt8412 = -1;
					} else if (!arg0.aBoolean590) {
						Static301.method5179(local11, arg0, arg0.anInt8391);
					}
				}
				arg0.anInt8369 = arg0.anInt8391 + 1;
				if (arg0.anInt8369 >= local11.anIntArray551.length) {
					arg0.anInt8369 -= local11.anInt10217;
					if (arg0.anInt8436 + 1 >= local11.anInt10222) {
						arg0.anInt8369 = -1;
					} else if (arg0.anInt8369 < 0 || local11.anIntArray551.length <= arg0.anInt8369) {
						arg0.anInt8369 = -1;
					}
				}
			}
		}
		if (arg0.anInt8378 > 0) {
			arg0.anInt8378--;
		}
		for (@Pc(1010) int local1010 = 0; local1010 < arg0.aClass129Array3.length; local1010++) {
			@Pc(1017) Class129 local1017 = arg0.aClass129Array3[local1010];
			if (local1017 != null) {
				if (local1017.anInt3569 > 0) {
					local1017.anInt3569--;
				} else {
					local191 = Static61.aClass48_1.method1016(local1017.anInt3570);
					if (local191 == null || local191.anIntArray551 == null) {
						arg0.aClass129Array3[local1010] = null;
					} else {
						local1017.anInt3572++;
						if (local1017.anInt3566 < local191.anIntArray551.length && local1017.anInt3572 > local191.anIntArray552[local1017.anInt3566]) {
							local1017.anInt3566++;
							local1017.anInt3572 = 1;
							if (!arg0.aBoolean590) {
								Static301.method5179(local191, arg0, local1017.anInt3566);
							}
						}
						if (local1017.anInt3566 >= local191.anIntArray551.length) {
							local1017.anInt3565++;
							local1017.anInt3566 -= local191.anInt10217;
							if (local1017.anInt3565 >= local191.anInt10222) {
								arg0.aClass129Array3[local1010] = null;
							} else if (local1017.anInt3566 < 0 || local191.anIntArray551.length <= local1017.anInt3566) {
								arg0.aClass129Array3[local1010] = null;
							} else if (!arg0.aBoolean590) {
								Static301.method5179(local191, arg0, local1017.anInt3566);
							}
						}
						local1017.anInt3571 = local1017.anInt3566 + 1;
						if (local191.anIntArray551.length <= local1017.anInt3571) {
							local1017.anInt3571 -= local191.anInt10217;
							if (local1017.anInt3565 + 1 >= local191.anInt10222) {
								local1017.anInt3571 = -1;
							} else if (local1017.anInt3571 < 0 || local1017.anInt3571 >= local191.anIntArray551.length) {
								local1017.anInt3571 = -1;
							}
						}
					}
				}
			}
		}
	}
}
