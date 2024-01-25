import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "Z")
	public static boolean aBoolean713;

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray182 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BLclient!qda;)Lclient!ida;")
	public static Class153 method7716(@OriginalArg(1) Class6_Sub1_Sub1 arg0) {
		@Pc(7) Class153 local7;
		if (Static405.aClass153_2 == null) {
			local7 = new Class153();
		} else {
			local7 = Static405.aClass153_2;
			Static405.aClass153_2 = Static405.aClass153_2.aClass153_1;
			Static264.anInt4872--;
			local7.aClass153_1 = null;
		}
		local7.aClass6_Sub1_Sub1_1 = arg0;
		return local7;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZLclient!ni;B)V")
	public static void method7718(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class6_Sub1_Sub1_Sub1 arg1) {
		@Pc(9) Class54 local9 = arg1.method6168();
		if (arg1.anInt7424 == 0) {
			Static122.anInt2385 = 0;
			Static406.anInt7066 = -1;
			arg1.anInt7421 = 0;
			return;
		}
		if (arg1.anInt7370 != -1 && arg1.anInt7406 == 0) {
			@Pc(39) Class84 local39 = Static116.aClass140_2.method3287(arg1.anInt7370);
			if (arg1.anInt7423 > 0 && local39.anInt2058 == 0) {
				Static122.anInt2385 = 0;
				arg1.anInt7421++;
				Static406.anInt7066 = -1;
				return;
			}
			if (arg1.anInt7423 <= 0 && local39.anInt2059 == 0) {
				Static406.anInt7066 = -1;
				arg1.anInt7421++;
				Static122.anInt2385 = 0;
				return;
			}
		}
		@Pc(107) Class84 local107;
		@Pc(94) Class167 local94;
		if (arg1.anInt7368 != -1 && arg1.anInt7376 <= Static412.anInt575) {
			local94 = Static215.aClass33_1.method587(arg1.anInt7368);
			if (local94.aBoolean352 && local94.anInt4374 != -1) {
				local107 = Static116.aClass140_2.method3287(local94.anInt4374);
				if (arg1.anInt7423 > 0 && local107.anInt2058 == 0) {
					Static122.anInt2385 = 0;
					Static406.anInt7066 = -1;
					arg1.anInt7421++;
					return;
				}
				if (arg1.anInt7423 <= 0 && local107.anInt2059 == 0) {
					arg1.anInt7421++;
					Static406.anInt7066 = -1;
					Static122.anInt2385 = 0;
					return;
				}
			}
		}
		if (arg1.anInt7368 != -1 && Static412.anInt575 >= arg1.anInt7376) {
			local94 = Static215.aClass33_1.method587(arg1.anInt7368);
			if (local94.aBoolean352 && local94.anInt4374 != -1) {
				local107 = Static116.aClass140_2.method3287(local94.anInt4374);
				if (arg1.anInt7423 > 0 && local107.anInt2058 == 0) {
					Static122.anInt2385 = 0;
					arg1.anInt7421++;
					Static406.anInt7066 = -1;
					return;
				}
				if (arg1.anInt7423 <= 0 && local107.anInt2059 == 0) {
					Static406.anInt7066 = -1;
					Static122.anInt2385 = 0;
					arg1.anInt7421++;
					return;
				}
			}
		}
		@Pc(218) int local218 = arg1.anInt8761;
		@Pc(221) int local221 = arg1.anInt8764;
		@Pc(240) int local240 = arg1.anIntArray510[arg1.anInt7424 - 1] * 512 + arg1.method6165() * 256;
		@Pc(259) int local259 = arg1.anIntArray509[arg1.anInt7424 - 1] * 512 + arg1.method6165() * 256;
		if (local218 >= local240) {
			if (local240 < local218) {
				if (local259 > local221) {
					arg1.method6163(6144);
				} else if (local221 > local259) {
					arg1.method6163(2048);
				} else {
					arg1.method6163(4096);
				}
			} else if (local221 < local259) {
				arg1.method6163(8192);
			} else if (local259 < local221) {
				arg1.method6163(0);
			}
		} else if (local221 < local259) {
			arg1.method6163(10240);
		} else if (local221 > local259) {
			arg1.method6163(14336);
		} else {
			arg1.method6163(12288);
		}
		@Pc(349) byte local349 = arg1.aByteArray73[arg1.anInt7424 - 1];
		if (!arg0 && (local240 - local218 > 1024 || local240 - local218 < -1024 || local259 - local221 > 1024 || local259 - local221 < -1024)) {
			arg1.anInt8764 = local259;
			arg1.anInt8761 = local240;
			arg1.method6169(arg1.anInt7377, false);
			if (arg1.anInt7423 > 0) {
				arg1.anInt7423--;
			}
			Static122.anInt2385 = 0;
			Static406.anInt7066 = -1;
			arg1.anInt7424--;
			return;
		}
		@Pc(412) int local412 = 16;
		@Pc(418) boolean local418 = true;
		if (arg1 instanceof Class6_Sub1_Sub1_Sub1_Sub1) {
			local418 = ((Class6_Sub1_Sub1_Sub1_Sub1) arg1).aClass86_1.aBoolean196;
		}
		@Pc(436) int local436;
		if (local418) {
			local436 = arg1.anInt7377 - arg1.aClass186_7.anInt4914;
			if (local436 != 0 && arg1.anInt7339 == -1 && arg1.anInt7391 != 0) {
				local412 = 8;
			}
			if (!arg0 && arg1.anInt7424 > 2) {
				local412 = 24;
			}
			if (!arg0 && arg1.anInt7424 > 3) {
				local412 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt7424 > 1) {
				local412 = 24;
			}
			if (!arg0 && arg1.anInt7424 > 2) {
				local412 = 32;
			}
		}
		if (arg1.anInt7421 > 0 && arg1.anInt7424 > 1) {
			arg1.anInt7421--;
			local412 = 32;
		}
		if (local349 == 2) {
			local412 <<= 0x1;
		} else if (local349 == 0) {
			local412 >>= 0x1;
		}
		Static122.anInt2385 = 0;
		if (local9.anInt1381 != -1) {
			local412 <<= 0x9;
			if (arg1.anInt7424 == 1) {
				local436 = arg1.anInt7422 * arg1.anInt7422;
				@Pc(608) int local608 = (arg1.anInt8761 <= local240 ? local240 - arg1.anInt8761 : -local240 + arg1.anInt8761) << 9;
				@Pc(630) int local630 = (arg1.anInt8764 <= local259 ? local259 - arg1.anInt8764 : arg1.anInt8764 + -local259) << 9;
				@Pc(641) int local641 = local608 > local630 ? local608 : local630;
				@Pc(648) int local648 = local9.anInt1381 * 2 * local641;
				if (local436 > local648) {
					arg1.anInt7422 /= 2;
				} else if (local641 < local436 / 2) {
					arg1.anInt7422 -= local9.anInt1381;
					if (arg1.anInt7422 < 0) {
						arg1.anInt7422 = 0;
					}
				} else if (arg1.anInt7422 < local412) {
					arg1.anInt7422 += local9.anInt1381;
					if (arg1.anInt7422 > local412) {
						arg1.anInt7422 = local412;
					}
				}
			} else if (local412 > arg1.anInt7422) {
				arg1.anInt7422 += local9.anInt1381;
				if (local412 < arg1.anInt7422) {
					arg1.anInt7422 = local412;
				}
			} else if (arg1.anInt7422 > 0) {
				arg1.anInt7422 -= local9.anInt1381;
				if (arg1.anInt7422 < 0) {
					arg1.anInt7422 = 0;
				}
			}
			local412 = arg1.anInt7422 >> 9;
			if (local412 < 1) {
				local412 = 1;
			}
		}
		if (local240 == local218 && local259 == local221) {
			Static406.anInt7066 = -1;
		} else {
			if (local218 < local240) {
				arg1.anInt8761 += local412;
				Static122.anInt2385 |= 0x4;
				if (arg1.anInt8761 > local240) {
					arg1.anInt8761 = local240;
				}
			} else if (local218 > local240) {
				Static122.anInt2385 |= 0x8;
				arg1.anInt8761 -= local412;
				if (arg1.anInt8761 < local240) {
					arg1.anInt8761 = local240;
				}
			}
			if (local259 > local221) {
				arg1.anInt8764 += local412;
				Static122.anInt2385 |= 0x1;
				if (arg1.anInt8764 > local259) {
					arg1.anInt8764 = local259;
				}
			} else if (local221 > local259) {
				Static122.anInt2385 |= 0x2;
				arg1.anInt8764 -= local412;
				if (local259 > arg1.anInt8764) {
					arg1.anInt8764 = local259;
				}
			}
			if (local412 < 32) {
				Static406.anInt7066 = local349;
			} else {
				Static406.anInt7066 = 2;
			}
		}
		if (arg1.anInt8761 == local240 && arg1.anInt8764 == local259) {
			if (arg1.anInt7423 > 0) {
				arg1.anInt7423--;
			}
			arg1.anInt7424--;
		}
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
	public static void method7720() {
		Static388.aBoolean530 = true;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!ni;B)V")
	public static void method7721(@OriginalArg(0) Class6_Sub1_Sub1_Sub1 arg0) {
		@Pc(11) Class84 local11;
		if (arg0.anInt7419 != -1) {
			local11 = Static116.aClass140_2.method3287(arg0.anInt7419);
			if (local11 == null || local11.anIntArray108 == null) {
				arg0.anInt7419 = -1;
				arg0.aBoolean569 = false;
			} else {
				label390: {
					arg0.anInt7409++;
					if (arg0.anInt7379 < local11.anIntArray108.length && arg0.anInt7409 > local11.anIntArray110[arg0.anInt7379]) {
						arg0.anInt7379++;
						arg0.anInt7399++;
						arg0.anInt7409 = 1;
						Static434.method4018(arg0.aByte112, local11, arg0.anInt8761, arg0.anInt8764, arg0.anInt7379, arg0 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2);
					}
					if (arg0.anInt7379 >= local11.anIntArray108.length) {
						arg0.anInt7379 = 0;
						arg0.anInt7409 = 0;
						if (arg0.aBoolean569) {
							arg0.anInt7419 = arg0.method6168().method966();
							if (arg0.anInt7419 == -1) {
								arg0.aBoolean569 = false;
								break label390;
							}
							local11 = Static116.aClass140_2.method3287(arg0.anInt7419);
						}
						Static434.method4018(arg0.aByte112, local11, arg0.anInt8761, arg0.anInt8764, arg0.anInt7379, arg0 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2);
					}
					arg0.anInt7399 = arg0.anInt7379 + 1;
					if (local11.anIntArray108.length <= arg0.anInt7399) {
						arg0.anInt7399 = 0;
					}
				}
			}
		}
		@Pc(171) int local171;
		@Pc(184) Class84 local184;
		@Pc(168) Class167 local168;
		if (arg0.anInt7368 != -1 && Static412.anInt575 >= arg0.anInt7376) {
			local168 = Static215.aClass33_1.method587(arg0.anInt7368);
			local171 = local168.anInt4374;
			if (local171 == -1) {
				arg0.anInt7368 = -1;
			} else {
				label392: {
					local184 = Static116.aClass140_2.method3287(local171);
					if (local168.aBoolean352) {
						if (local184.anInt2058 == 3) {
							if (arg0.anInt7423 > 0 && Static412.anInt575 >= arg0.anInt7415 && Static412.anInt575 > arg0.anInt7353) {
								arg0.anInt7368 = -1;
								break label392;
							}
						} else if (local184.anInt2058 == 1 && arg0.anInt7423 > 0 && arg0.anInt7415 <= Static412.anInt575 && arg0.anInt7353 < Static412.anInt575) {
							arg0.anInt7376 = Static412.anInt575 + 1;
							break label392;
						}
					}
					if (local184 == null || local184.anIntArray108 == null) {
						arg0.anInt7368 = -1;
					} else {
						if (arg0.anInt7402 < 0) {
							arg0.anInt7402 = 0;
							Static434.method4018(arg0.aByte112, local184, arg0.anInt8761, arg0.anInt8764, 0, arg0 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2);
						}
						arg0.anInt7364++;
						if (arg0.anInt7402 < local184.anIntArray108.length && arg0.anInt7364 > local184.anIntArray110[arg0.anInt7402]) {
							arg0.anInt7402++;
							arg0.anInt7364 = 1;
							Static434.method4018(arg0.aByte112, local184, arg0.anInt8761, arg0.anInt8764, arg0.anInt7402, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 == arg0);
						}
						if (local184.anIntArray108.length <= arg0.anInt7402) {
							if (local168.aBoolean352) {
								arg0.anInt7402 -= local184.anInt2068;
								arg0.anInt7386++;
								if (local184.anInt2052 <= arg0.anInt7386) {
									arg0.anInt7368 = -1;
								} else if (arg0.anInt7402 >= 0 && local184.anIntArray108.length > arg0.anInt7402) {
									Static434.method4018(arg0.aByte112, local184, arg0.anInt8761, arg0.anInt8764, arg0.anInt7402, arg0 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2);
								} else {
									arg0.anInt7368 = -1;
								}
							} else {
								arg0.anInt7368 = -1;
							}
						}
						arg0.anInt7383 = arg0.anInt7402 + 1;
						if (local184.anIntArray108.length <= arg0.anInt7383) {
							if (local168.aBoolean352) {
								arg0.anInt7383 -= local184.anInt2068;
								if (arg0.anInt7386 + 1 >= local184.anInt2052) {
									arg0.anInt7383 = -1;
								} else if (arg0.anInt7383 < 0 || arg0.anInt7383 >= local184.anIntArray108.length) {
									arg0.anInt7383 = -1;
								}
							} else {
								arg0.anInt7383 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7356 != -1 && arg0.anInt7346 <= Static412.anInt575) {
			local168 = Static215.aClass33_1.method587(arg0.anInt7356);
			local171 = local168.anInt4374;
			if (local171 == -1) {
				arg0.anInt7356 = -1;
			} else {
				label395: {
					local184 = Static116.aClass140_2.method3287(local171);
					if (local168.aBoolean352) {
						if (local184.anInt2058 == 3) {
							if (arg0.anInt7423 > 0 && arg0.anInt7415 <= Static412.anInt575 && Static412.anInt575 > arg0.anInt7353) {
								arg0.anInt7356 = -1;
								break label395;
							}
						} else if (local184.anInt2058 == 1 && arg0.anInt7423 > 0 && Static412.anInt575 >= arg0.anInt7415 && arg0.anInt7353 < Static412.anInt575) {
							arg0.anInt7346 = Static412.anInt575 + 1;
							break label395;
						}
					}
					if (local184 == null || local184.anIntArray108 == null) {
						arg0.anInt7356 = -1;
					} else {
						if (arg0.anInt7360 < 0) {
							arg0.anInt7360 = 0;
							Static434.method4018(arg0.aByte112, local184, arg0.anInt8761, arg0.anInt8764, 0, arg0 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2);
						}
						arg0.anInt7407++;
						if (arg0.anInt7360 < local184.anIntArray108.length && arg0.anInt7407 > local184.anIntArray110[arg0.anInt7360]) {
							arg0.anInt7407 = 1;
							arg0.anInt7360++;
							Static434.method4018(arg0.aByte112, local184, arg0.anInt8761, arg0.anInt8764, arg0.anInt7360, arg0 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2);
						}
						if (arg0.anInt7360 >= local184.anIntArray108.length) {
							if (local168.aBoolean352) {
								arg0.anInt7360 -= local184.anInt2068;
								arg0.anInt7380++;
								if (local184.anInt2052 <= arg0.anInt7380) {
									arg0.anInt7356 = -1;
								} else if (arg0.anInt7360 >= 0 && local184.anIntArray108.length > arg0.anInt7360) {
									Static434.method4018(arg0.aByte112, local184, arg0.anInt8761, arg0.anInt8764, arg0.anInt7360, arg0 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2);
								} else {
									arg0.anInt7356 = -1;
								}
							} else {
								arg0.anInt7356 = -1;
							}
						}
						arg0.anInt7343 = arg0.anInt7360 + 1;
						if (arg0.anInt7343 >= local184.anIntArray108.length) {
							if (local168.aBoolean352) {
								arg0.anInt7343 -= local184.anInt2068;
								if (local184.anInt2052 <= arg0.anInt7380 + 1) {
									arg0.anInt7343 = -1;
								} else if (arg0.anInt7343 < 0 || local184.anIntArray108.length <= arg0.anInt7343) {
									arg0.anInt7343 = -1;
								}
							} else {
								arg0.anInt7343 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7370 != -1 && arg0.anInt7406 <= 1) {
			local11 = Static116.aClass140_2.method3287(arg0.anInt7370);
			if (local11.anInt2058 == 3) {
				if (arg0.anInt7423 > 0 && arg0.anInt7415 <= Static412.anInt575 && Static412.anInt575 > arg0.anInt7353) {
					arg0.anInt7370 = -1;
					arg0.anIntArray507 = null;
				}
			} else if (local11.anInt2058 == 1 && arg0.anInt7423 > 0 && Static412.anInt575 >= arg0.anInt7415 && Static412.anInt575 > arg0.anInt7353) {
				arg0.anInt7406 = 2;
			}
		}
		if (arg0.anInt7370 != -1 && arg0.anInt7406 == 0) {
			local11 = Static116.aClass140_2.method3287(arg0.anInt7370);
			if (local11 == null || local11.anIntArray108 == null) {
				arg0.anIntArray507 = null;
				arg0.anInt7370 = -1;
			} else {
				arg0.anInt7400++;
				if (local11.anIntArray108.length > arg0.anInt7416 && local11.anIntArray110[arg0.anInt7416] < arg0.anInt7400) {
					arg0.anInt7400 = 1;
					arg0.anInt7416++;
					Static434.method4018(arg0.aByte112, local11, arg0.anInt8761, arg0.anInt8764, arg0.anInt7416, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 == arg0);
				}
				if (local11.anIntArray108.length <= arg0.anInt7416) {
					arg0.anInt7378++;
					arg0.anInt7416 -= local11.anInt2068;
					if (local11.anInt2052 <= arg0.anInt7378) {
						arg0.anInt7370 = -1;
						arg0.anIntArray507 = null;
					} else if (arg0.anInt7416 >= 0 && arg0.anInt7416 < local11.anIntArray108.length) {
						Static434.method4018(arg0.aByte112, local11, arg0.anInt8761, arg0.anInt8764, arg0.anInt7416, arg0 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2);
					} else {
						arg0.anInt7370 = -1;
						arg0.anIntArray507 = null;
					}
				}
				arg0.anInt7349 = arg0.anInt7416 + 1;
				if (local11.anIntArray108.length <= arg0.anInt7349) {
					arg0.anInt7349 -= local11.anInt2068;
					if (local11.anInt2052 <= arg0.anInt7378 + 1) {
						arg0.anInt7349 = -1;
					} else if (arg0.anInt7349 < 0 || local11.anIntArray108.length <= arg0.anInt7349) {
						arg0.anInt7349 = -1;
					}
				}
			}
		}
		if (arg0.anInt7406 > 0) {
			arg0.anInt7406--;
		}
		for (@Pc(1056) int local1056 = 0; local1056 < arg0.aClass19Array3.length; local1056++) {
			@Pc(1063) Class19 local1063 = arg0.aClass19Array3[local1056];
			if (local1063 != null) {
				if (local1063.anInt493 > 0) {
					local1063.anInt493--;
				} else {
					local184 = Static116.aClass140_2.method3287(local1063.anInt495);
					if (local184 == null || local184.anIntArray108 == null) {
						arg0.aClass19Array3[local1056] = null;
					} else {
						local1063.anInt494++;
						if (local1063.anInt496 < local184.anIntArray108.length && local184.anIntArray110[local1063.anInt496] < local1063.anInt494) {
							local1063.anInt496++;
							local1063.anInt494 = 1;
							Static434.method4018(arg0.aByte112, local184, arg0.anInt8761, arg0.anInt8764, local1063.anInt496, arg0 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2);
						}
						if (local184.anIntArray108.length <= local1063.anInt496) {
							local1063.anInt496 -= local184.anInt2068;
							local1063.anInt497++;
							if (local184.anInt2052 <= local1063.anInt497) {
								arg0.aClass19Array3[local1056] = null;
							} else if (local1063.anInt496 >= 0 && local1063.anInt496 < local184.anIntArray108.length) {
								Static434.method4018(arg0.aByte112, local184, arg0.anInt8761, arg0.anInt8764, local1063.anInt496, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 == arg0);
							} else {
								arg0.aClass19Array3[local1056] = null;
							}
						}
						local1063.anInt498 = local1063.anInt496 + 1;
						if (local184.anIntArray108.length <= local1063.anInt498) {
							local1063.anInt498 -= local184.anInt2068;
							if (local184.anInt2052 <= local1063.anInt497 + 1) {
								local1063.anInt498 = -1;
							} else if (local1063.anInt498 < 0 || local184.anIntArray108.length <= local1063.anInt498) {
								local1063.anInt498 = -1;
							}
						}
					}
				}
			}
		}
	}
}
