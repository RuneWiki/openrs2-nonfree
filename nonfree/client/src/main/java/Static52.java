import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bu", name = "j", descriptor = "I")
	public static int anInt768;

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray7 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
	public static int anInt767 = -50;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IZIIIIIIII)Z")
	public static boolean method680(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 > 2000 || arg0 > 2000 || arg8 > 2000 || arg3 > 2000 || arg4 > 2000 || arg1 > 2000) {
			return false;
		} else if (arg5 >= -2000 && arg0 >= -2000 && arg8 >= -2000 && arg3 >= -2000 && arg4 >= -2000 && arg1 >= -2000) {
			@Pc(64) int local64;
			if (Static84.anInt1542 == 2) {
				local64 = arg3 + arg5 * Static47.anInt645;
				if (local64 >= 0 && Static5.anIntArray5.length > local64 && (arg7 << 8) - 15360 < Static5.anIntArray5[local64]) {
					return false;
				}
				local64 = Static47.anInt645 * arg0 + arg4;
				if (local64 >= 0 && Static5.anIntArray5.length > local64 && (arg2 << 8) - 15360 < Static5.anIntArray5[local64]) {
					return false;
				}
				local64 = arg1 + arg8 * Static47.anInt645;
				if (local64 >= 0 && Static5.anIntArray5.length > local64 && (arg6 << 8) - 15360 < Static5.anIntArray5[local64]) {
					return false;
				}
			}
			local64 = arg4 - arg3;
			@Pc(166) int local166 = arg0 - arg5;
			@Pc(170) int local170 = arg1 - arg3;
			@Pc(175) int local175 = arg8 - arg5;
			@Pc(180) int local180 = arg2 - arg7;
			@Pc(185) int local185 = arg6 - arg7;
			if (arg0 > arg5 && arg8 < arg8) {
				arg5--;
				if (arg0 <= arg8) {
					arg8++;
				} else {
					arg0++;
				}
			} else if (arg8 > arg0) {
				if (arg8 < arg5) {
					arg5++;
				} else {
					arg8++;
				}
				arg0--;
			} else {
				arg8--;
				if (arg5 > arg0) {
					arg5++;
				} else {
					arg0++;
				}
			}
			@Pc(236) int local236 = 0;
			if (arg5 != arg0) {
				local236 = (arg4 - arg3 << 12) / (arg0 - arg5);
			}
			@Pc(256) int local256 = 0;
			if (arg8 != arg0) {
				local256 = (arg1 - arg4 << 12) / (arg8 - arg0);
			}
			@Pc(272) int local272 = 0;
			if (arg5 != arg8) {
				local272 = (arg3 - arg1 << 12) / (arg5 - arg8);
			}
			@Pc(294) int local294 = local64 * local175 - local170 * local166;
			if (local294 == 0) {
				return false;
			}
			@Pc(310) int local310 = (local175 * local180 - local166 * local185 << 8) / local294;
			@Pc(322) int local322 = (local64 * local185 - local170 * local180 << 8) / local294;
			if (arg0 >= arg5 && arg5 <= arg8) {
				if (arg5 >= Static582.anInt10109) {
					return true;
				}
				if (arg0 > Static582.anInt10109) {
					arg0 = Static582.anInt10109;
				}
				if (arg8 > Static582.anInt10109) {
					arg8 = Static582.anInt10109;
				}
				arg7 = local310 + (arg7 << 8) - local310 * arg3;
				if (arg0 < arg8) {
					arg1 = arg3 <<= 0xC;
					if (arg5 < 0) {
						arg7 -= local322 * arg5;
						arg3 -= local236 * arg5;
						arg1 -= arg5 * local272;
						arg5 = 0;
					}
					arg4 <<= 0xC;
					if (arg0 < 0) {
						arg4 -= arg0 * local256;
						arg0 = 0;
					}
					if ((arg5 == arg0 || local236 <= local272) && (arg5 != arg0 || local272 <= local256)) {
						arg8 -= arg0;
						arg0 -= arg5;
						arg5 = Static47.anInt645 * arg5;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static445.method6847((arg1 >> 12) + 1, arg7, (arg4 >> 12) - 1, local310, Static5.anIntArray5, arg5)) {
										return false;
									}
									arg5 += Static47.anInt645;
									arg1 += local272;
									arg4 += local256;
									arg7 += local322;
								}
							}
							if (!Static445.method6847((arg1 >> 12) + 1, arg7, (arg3 >> 12) - 1, local310, Static5.anIntArray5, arg5)) {
								return false;
							}
							arg7 += local322;
							arg3 += local236;
							arg5 += Static47.anInt645;
							arg1 += local272;
						}
					} else {
						arg8 -= arg0;
						arg0 -= arg5;
						arg5 *= Static47.anInt645;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static445.method6847((arg4 >> 12) + 1, arg7, (arg1 >> 12) - 1, local310, Static5.anIntArray5, arg5)) {
										return false;
									}
									arg5 += Static47.anInt645;
									arg1 += local272;
									arg4 += local256;
									arg7 += local322;
								}
							}
							if (!Static445.method6847((arg3 >> 12) + 1, arg7, (arg1 >> 12) - 1, local310, Static5.anIntArray5, arg5)) {
								return false;
							}
							arg7 += local322;
							arg3 += local236;
							arg5 += Static47.anInt645;
							arg1 += local272;
						}
					}
				} else {
					arg4 = arg3 <<= 0xC;
					arg1 <<= 0xC;
					if (arg5 < 0) {
						arg4 -= arg5 * local272;
						arg7 -= local322 * arg5;
						arg3 -= local236 * arg5;
						arg5 = 0;
					}
					if (arg8 < 0) {
						arg1 -= arg8 * local256;
						arg8 = 0;
					}
					if ((arg5 == arg8 || local272 >= local236) && (arg8 != arg5 || local236 >= local256)) {
						arg0 -= arg8;
						arg8 -= arg5;
						arg5 *= Static47.anInt645;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static445.method6847((arg1 >> 12) + 1, arg7, (arg3 >> 12) - 1, local310, Static5.anIntArray5, arg5)) {
										return false;
									}
									arg7 += local322;
									arg5 += Static47.anInt645;
									arg3 += local236;
									arg1 += local256;
								}
							}
							if (!Static445.method6847((arg4 >> 12) + 1, arg7, (arg3 >> 12) - 1, local310, Static5.anIntArray5, arg5)) {
								return false;
							}
							arg4 += local272;
							arg5 += Static47.anInt645;
							arg3 += local236;
							arg7 += local322;
						}
					} else {
						arg0 -= arg8;
						arg8 -= arg5;
						arg5 = Static47.anInt645 * arg5;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static445.method6847((arg3 >> 12) + 1, arg7, (arg1 >> 12) - 1, local310, Static5.anIntArray5, arg5)) {
										return false;
									}
									arg5 += Static47.anInt645;
									arg3 += local236;
									arg7 += local322;
									arg1 += local256;
								}
							}
							if (!Static445.method6847((arg3 >> 12) + 1, arg7, (arg4 >> 12) - 1, local310, Static5.anIntArray5, arg5)) {
								return false;
							}
							arg7 += local322;
							arg4 += local272;
							arg3 += local236;
							arg5 += Static47.anInt645;
						}
					}
				}
			} else if (arg0 > arg8) {
				if (Static582.anInt10109 <= arg8) {
					return true;
				}
				arg6 = local310 + (arg6 << 8) - local310 * arg1;
				if (Static582.anInt10109 < arg0) {
					arg0 = Static582.anInt10109;
				}
				if (Static582.anInt10109 < arg5) {
					arg5 = Static582.anInt10109;
				}
				if (arg0 <= arg5) {
					arg3 = arg1 <<= 0xC;
					arg4 <<= 0xC;
					if (arg8 < 0) {
						arg6 -= arg8 * local322;
						arg1 -= local272 * arg8;
						arg3 -= local256 * arg8;
						arg8 = 0;
					}
					if (arg0 < 0) {
						arg4 -= local236 * arg0;
						arg0 = 0;
					}
					if (local272 <= local256) {
						arg5 -= arg0;
						arg0 -= arg8;
						arg8 = Static47.anInt645 * arg8;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static445.method6847((arg4 >> 12) + 1, arg6, (arg1 >> 12) - 1, local310, Static5.anIntArray5, arg8)) {
										return false;
									}
									arg8 += Static47.anInt645;
									arg4 += local236;
									arg1 += local272;
									arg6 += local322;
								}
							}
							if (!Static445.method6847((arg3 >> 12) + 1, arg6, (arg1 >> 12) - 1, local310, Static5.anIntArray5, arg8)) {
								return false;
							}
							arg1 += local272;
							arg8 += Static47.anInt645;
							arg6 += local322;
							arg3 += local256;
						}
					} else {
						arg5 -= arg0;
						arg0 -= arg8;
						arg8 = Static47.anInt645 * arg8;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static445.method6847((arg1 >> 12) + 1, arg6, (arg4 >> 12) - 1, local310, Static5.anIntArray5, arg8)) {
										return false;
									}
									arg1 += local272;
									arg8 += Static47.anInt645;
									arg4 += local236;
									arg6 += local322;
								}
							}
							if (!Static445.method6847((arg1 >> 12) + 1, arg6, (arg3 >> 12) - 1, local310, Static5.anIntArray5, arg8)) {
								return false;
							}
							arg3 += local256;
							arg6 += local322;
							arg1 += local272;
							arg8 += Static47.anInt645;
						}
					}
				} else {
					arg4 = arg1 <<= 0xC;
					arg3 <<= 0xC;
					if (arg8 < 0) {
						arg4 -= local256 * arg8;
						arg1 -= arg8 * local272;
						arg6 -= local322 * arg8;
						arg8 = 0;
					}
					if (arg5 < 0) {
						arg3 -= local236 * arg5;
						arg5 = 0;
					}
					if (local272 <= local256) {
						arg0 -= arg5;
						arg5 -= arg8;
						arg8 = Static47.anInt645 * arg8;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static445.method6847((arg4 >> 12) + 1, arg6, (arg3 >> 12) - 1, local310, Static5.anIntArray5, arg8)) {
										return false;
									}
									arg6 += local322;
									arg3 += local236;
									arg8 += Static47.anInt645;
									arg4 += local256;
								}
							}
							if (!Static445.method6847((arg4 >> 12) + 1, arg6, (arg1 >> 12) - 1, local310, Static5.anIntArray5, arg8)) {
								return false;
							}
							arg8 += Static47.anInt645;
							arg4 += local256;
							arg1 += local272;
							arg6 += local322;
						}
					} else {
						arg0 -= arg5;
						arg5 -= arg8;
						arg8 *= Static47.anInt645;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static445.method6847((arg3 >> 12) + 1, arg6, (arg4 >> 12) - 1, local310, Static5.anIntArray5, arg8)) {
										return false;
									}
									arg3 += local236;
									arg4 += local256;
									arg8 += Static47.anInt645;
									arg6 += local322;
								}
							}
							if (!Static445.method6847((arg1 >> 12) + 1, arg6, (arg4 >> 12) - 1, local310, Static5.anIntArray5, arg8)) {
								return false;
							}
							arg6 += local322;
							arg4 += local256;
							arg1 += local272;
							arg8 += Static47.anInt645;
						}
					}
				}
			} else if (Static582.anInt10109 <= arg0) {
				return true;
			} else {
				arg2 = local310 + (arg2 << 8) - arg4 * local310;
				if (Static582.anInt10109 < arg5) {
					arg5 = Static582.anInt10109;
				}
				if (arg8 > Static582.anInt10109) {
					arg8 = Static582.anInt10109;
				}
				if (arg5 <= arg8) {
					arg1 = arg4 <<= 0xC;
					if (arg0 < 0) {
						arg4 -= arg0 * local256;
						arg1 -= arg0 * local236;
						arg2 -= local322 * arg0;
						arg0 = 0;
					}
					arg3 <<= 0xC;
					if (arg5 < 0) {
						arg3 -= local272 * arg5;
						arg5 = 0;
					}
					if (local236 >= local256) {
						arg8 -= arg5;
						arg5 -= arg0;
						arg0 = Static47.anInt645 * arg0;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static445.method6847((arg3 >> 12) + 1, arg2, (arg4 >> 12) - 1, local310, Static5.anIntArray5, arg0)) {
										return false;
									}
									arg2 += local322;
									arg0 += Static47.anInt645;
									arg4 += local256;
									arg3 += local272;
								}
							}
							if (!Static445.method6847((arg1 >> 12) + 1, arg2, (arg4 >> 12) - 1, local310, Static5.anIntArray5, arg0)) {
								return false;
							}
							arg4 += local256;
							arg0 += Static47.anInt645;
							arg1 += local236;
							arg2 += local322;
						}
					} else {
						arg8 -= arg5;
						arg5 -= arg0;
						arg0 = Static47.anInt645 * arg0;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static445.method6847((arg4 >> 12) + 1, arg2, (arg3 >> 12) - 1, local310, Static5.anIntArray5, arg0)) {
										return false;
									}
									arg3 += local272;
									arg4 += local256;
									arg2 += local322;
									arg0 += Static47.anInt645;
								}
							}
							if (!Static445.method6847((arg4 >> 12) + 1, arg2, (arg1 >> 12) - 1, local310, Static5.anIntArray5, arg0)) {
								return false;
							}
							arg1 += local236;
							arg4 += local256;
							arg0 += Static47.anInt645;
							arg2 += local322;
						}
					}
				} else {
					arg3 = arg4 <<= 0xC;
					arg1 <<= 0xC;
					if (arg0 < 0) {
						arg2 -= local322 * arg0;
						arg3 -= local236 * arg0;
						arg4 -= local256 * arg0;
						arg0 = 0;
					}
					if (arg8 < 0) {
						arg1 -= arg8 * local272;
						arg8 = 0;
					}
					if (arg0 != arg8 && local236 < local256 || arg8 == arg0 && local272 < local236) {
						arg5 -= arg8;
						arg8 -= arg0;
						arg0 *= Static47.anInt645;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static445.method6847((arg1 >> 12) + 1, arg2, (arg3 >> 12) - 1, local310, Static5.anIntArray5, arg0)) {
										return false;
									}
									arg3 += local236;
									arg0 += Static47.anInt645;
									arg1 += local272;
									arg2 += local322;
								}
							}
							if (!Static445.method6847((arg4 >> 12) + 1, arg2, (arg3 >> 12) - 1, local310, Static5.anIntArray5, arg0)) {
								return false;
							}
							arg3 += local236;
							arg0 += Static47.anInt645;
							arg2 += local322;
							arg4 += local256;
						}
					} else {
						arg5 -= arg8;
						arg8 -= arg0;
						arg0 = Static47.anInt645 * arg0;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static445.method6847((arg3 >> 12) + 1, arg2, (arg1 >> 12) - 1, local310, Static5.anIntArray5, arg0)) {
										return false;
									}
									arg2 += local322;
									arg1 += local272;
									arg3 += local236;
									arg0 += Static47.anInt645;
								}
							}
							if (!Static445.method6847((arg3 >> 12) + 1, arg2, (arg4 >> 12) - 1, local310, Static5.anIntArray5, arg0)) {
								return false;
							}
							arg4 += local256;
							arg3 += local236;
							arg0 += Static47.anInt645;
							arg2 += local322;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILclient!dc;B)Z")
	public static boolean method682(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11_Sub1 arg1) {
		@Pc(8) int local8 = arg1.method1530(2);
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(99) int local99;
		@Pc(103) int local103;
		@Pc(109) int local109;
		if (local8 == 0) {
			if (arg1.method1530(1) != 0) {
				method682(arg0, arg1);
			}
			local25 = arg1.method1530(6);
			local30 = arg1.method1530(6);
			@Pc(42) boolean local42 = arg1.method1530(1) == 1;
			if (local42) {
				Static493.anIntArray483[Static70.anInt1211++] = arg0;
			}
			if (Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(65) Class41 local65 = Static61.aClass41Array1[arg0];
			@Pc(73) Class1_Sub4_Sub2_Sub1_Sub2 local73 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[arg0] = new Class1_Sub4_Sub2_Sub1_Sub2();
			local73.anInt8435 = arg0;
			if (Static275.aClass4_Sub11Array1[arg0] != null) {
				local73.method6945(Static275.aClass4_Sub11Array1[arg0]);
			}
			local73.method6934(true, local65.anInt764);
			local73.anInt8405 = local65.anInt762;
			local99 = local65.anInt765;
			local103 = local99 >> 28;
			local109 = local99 >> 14 & 0xFF;
			@Pc(113) int local113 = local99 & 0xFF;
			@Pc(122) int local122 = local25 + (local109 << 6) - Static552.anInt9805;
			local73.aBoolean594 = local65.aBoolean37;
			@Pc(135) int local135 = local30 + (local113 << 6) - Static254.anInt4667;
			local73.aByteArray94[0] = Static278.aByteArray67[arg0];
			local73.aByte126 = local73.aByte127 = (byte) local103;
			if (Static310.method5267(local122, local135)) {
				local73.aByte127++;
			}
			local73.method6943(local135, local122);
			local73.aBoolean595 = false;
			Static61.aClass41Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local25 = arg1.method1530(2);
			local30 = Static61.aClass41Array1[arg0].anInt765;
			Static61.aClass41Array1[arg0].anInt765 = (((local30 >> 28) + local25 & 0x3) << 28) + (local30 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(228) int local228;
			@Pc(233) int local233;
			@Pc(241) int local241;
			if (local8 != 2) {
				local25 = arg1.method1530(18);
				local30 = local25 >> 16;
				local228 = local25 >> 8 & 0xFF;
				local233 = local25 & 0xFF;
				local241 = Static61.aClass41Array1[arg0].anInt765;
				local99 = local30 + (local241 >> 28) & 0x3;
				local103 = local228 + (local241 >> 14) & 0xFF;
				local109 = local241 + local233 & 0xFF;
				Static61.aClass41Array1[arg0].anInt765 = local109 + (local99 << 28) + (local103 << 14);
				return false;
			}
			local25 = arg1.method1530(5);
			local30 = local25 >> 3;
			local228 = local25 & 0x7;
			local233 = Static61.aClass41Array1[arg0].anInt765;
			local241 = local30 + (local233 >> 28) & 0x3;
			local99 = local233 >> 14 & 0xFF;
			local103 = local233 & 0xFF;
			if (local228 == 0) {
				local103--;
				local99--;
			}
			if (local228 == 1) {
				local103--;
			}
			if (local228 == 2) {
				local99++;
				local103--;
			}
			if (local228 == 3) {
				local99--;
			}
			if (local228 == 4) {
				local99++;
			}
			if (local228 == 5) {
				local103++;
				local99--;
			}
			if (local228 == 6) {
				local103++;
			}
			if (local228 == 7) {
				local103++;
				local99++;
			}
			Static61.aClass41Array1[arg0].anInt765 = (local99 << 14) + (local241 << 28) + local103;
			return false;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)Z")
	public static boolean method683(@OriginalArg(1) int arg0) {
		if (arg0 == 2 || arg0 == 5 || arg0 == 10 || arg0 == 13 || arg0 == 1001) {
			return true;
		} else {
			return arg0 == 44 || arg0 == 1011;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)Z")
	public static boolean method684() {
		return Static138.method2728("jaclib") ? Static138.method2728("hw3d") : false;
	}
}
