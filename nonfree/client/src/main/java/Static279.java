import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
	public static int anInt4804;

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_69 = new Class289(5, 2);

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "Z")
	public static boolean aBoolean304 = false;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIBIIIIII)Z")
	public static boolean method4089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 > 2000 || arg6 > 2000 || arg8 > 2000 || arg1 > 2000 || arg3 > 2000 || arg7 > 2000) {
			return false;
		} else if (arg4 >= -2000 && arg6 >= -2000 && arg8 >= -2000 && arg1 >= -2000 && arg3 >= -2000 && arg7 >= -2000) {
			@Pc(68) int local68;
			if (Static383.anInt6430 == 2) {
				local68 = arg1 + Static312.anInt8379 * arg4;
				if (local68 >= 0 && local68 < Static115.anIntArray125.length && (arg5 << 8) - 38400 < Static115.anIntArray125[local68]) {
					return false;
				}
				local68 = arg6 * Static312.anInt8379 + arg3;
				if (local68 >= 0 && Static115.anIntArray125.length > local68 && Static115.anIntArray125[local68] > (arg0 << 8) - 38400) {
					return false;
				}
				local68 = arg7 + arg8 * Static312.anInt8379;
				if (local68 >= 0 && Static115.anIntArray125.length > local68 && (arg2 << 8) - 38400 < Static115.anIntArray125[local68]) {
					return false;
				}
			}
			local68 = arg3 - arg1;
			@Pc(155) int local155 = arg6 - arg4;
			@Pc(160) int local160 = arg7 - arg1;
			@Pc(169) int local169 = arg8 - arg4;
			@Pc(174) int local174 = arg0 - arg5;
			if (arg4 < arg6 && arg8 > arg8) {
				arg4--;
				if (arg8 >= arg6) {
					arg8++;
				} else {
					arg6++;
				}
			} else if (arg8 > arg6) {
				arg6--;
				if (arg8 < arg4) {
					arg4++;
				} else {
					arg8++;
				}
			} else {
				arg8--;
				if (arg6 < arg4) {
					arg4++;
				} else {
					arg6++;
				}
			}
			@Pc(224) int local224 = arg2 - arg5;
			@Pc(226) int local226 = 0;
			if (arg6 != arg4) {
				local226 = (arg3 - arg1 << 12) / (arg6 - arg4);
			}
			@Pc(246) int local246 = 0;
			if (arg8 != arg6) {
				local246 = (arg7 - arg3 << 12) / (arg8 - arg6);
			}
			@Pc(267) int local267 = 0;
			if (arg8 != arg4) {
				local267 = (arg1 - arg7 << 12) / (arg4 - arg8);
			}
			@Pc(294) int local294 = local169 * local68 - local160 * local155;
			if (local294 == 0) {
				return false;
			}
			@Pc(314) int local314 = (local169 * local174 - local224 * local155 << 8) / local294;
			@Pc(327) int local327 = (local224 * local68 - local174 * local160 << 8) / local294;
			if (arg4 <= arg6 && arg4 <= arg8) {
				if (arg4 >= Static522.anInt8677) {
					return true;
				}
				arg5 = local314 + (arg5 << 8) - local314 * arg1;
				if (Static522.anInt8677 < arg6) {
					arg6 = Static522.anInt8677;
				}
				if (Static522.anInt8677 < arg8) {
					arg8 = Static522.anInt8677;
				}
				if (arg8 > arg6) {
					arg7 = arg1 <<= 0xC;
					if (arg4 < 0) {
						arg1 -= arg4 * local226;
						arg5 -= local327 * arg4;
						arg7 -= local267 * arg4;
						arg4 = 0;
					}
					arg3 <<= 0xC;
					if (arg6 < 0) {
						arg3 -= arg6 * local246;
						arg6 = 0;
					}
					if (arg6 != arg4 && local226 > local267 || arg4 == arg6 && local246 < local267) {
						arg8 -= arg6;
						arg6 -= arg4;
						arg4 = Static312.anInt8379 * arg4;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static266.method3973(local314, Static115.anIntArray125, (arg3 >> 12) + 1, arg4, (arg7 >> 12) - 1, arg5)) {
										return false;
									}
									arg4 += Static312.anInt8379;
									arg3 += local246;
									arg7 += local267;
									arg5 += local327;
								}
							}
							if (!Static266.method3973(local314, Static115.anIntArray125, (arg1 >> 12) + 1, arg4, (arg7 >> 12) - 1, arg5)) {
								return false;
							}
							arg7 += local267;
							arg5 += local327;
							arg1 += local226;
							arg4 += Static312.anInt8379;
						}
					} else {
						arg8 -= arg6;
						arg6 -= arg4;
						arg4 *= Static312.anInt8379;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static266.method3973(local314, Static115.anIntArray125, (arg7 >> 12) + 1, arg4, (arg3 >> 12) - 1, arg5)) {
										return false;
									}
									arg5 += local327;
									arg3 += local246;
									arg7 += local267;
									arg4 += Static312.anInt8379;
								}
							}
							if (!Static266.method3973(local314, Static115.anIntArray125, (arg7 >> 12) + 1, arg4, (arg1 >> 12) - 1, arg5)) {
								return false;
							}
							arg4 += Static312.anInt8379;
							arg5 += local327;
							arg7 += local267;
							arg1 += local226;
						}
					}
				} else {
					arg3 = arg1 <<= 0xC;
					arg7 <<= 0xC;
					if (arg4 < 0) {
						arg5 -= local327 * arg4;
						arg1 -= arg4 * local226;
						arg3 -= local267 * arg4;
						arg4 = 0;
					}
					if (arg8 < 0) {
						arg7 -= arg8 * local246;
						arg8 = 0;
					}
					if ((arg4 == arg8 || local267 >= local226) && (arg4 != arg8 || local246 <= local226)) {
						arg6 -= arg8;
						arg8 -= arg4;
						arg4 *= Static312.anInt8379;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static266.method3973(local314, Static115.anIntArray125, (arg7 >> 12) + 1, arg4, (arg1 >> 12) - 1, arg5)) {
										return false;
									}
									arg4 += Static312.anInt8379;
									arg1 += local226;
									arg5 += local327;
									arg7 += local246;
								}
							}
							if (!Static266.method3973(local314, Static115.anIntArray125, (arg3 >> 12) + 1, arg4, (arg1 >> 12) - 1, arg5)) {
								return false;
							}
							arg4 += Static312.anInt8379;
							arg3 += local267;
							arg1 += local226;
							arg5 += local327;
						}
					} else {
						arg6 -= arg8;
						arg8 -= arg4;
						arg4 = Static312.anInt8379 * arg4;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static266.method3973(local314, Static115.anIntArray125, (arg1 >> 12) + 1, arg4, (arg7 >> 12) - 1, arg5)) {
										return false;
									}
									arg1 += local226;
									arg7 += local246;
									arg5 += local327;
									arg4 += Static312.anInt8379;
								}
							}
							if (!Static266.method3973(local314, Static115.anIntArray125, (arg1 >> 12) + 1, arg4, (arg3 >> 12) - 1, arg5)) {
								return false;
							}
							arg5 += local327;
							arg1 += local226;
							arg3 += local267;
							arg4 += Static312.anInt8379;
						}
					}
				}
			} else if (arg8 < arg6) {
				if (arg8 >= Static522.anInt8677) {
					return true;
				}
				if (arg4 > Static522.anInt8677) {
					arg4 = Static522.anInt8677;
				}
				if (Static522.anInt8677 < arg6) {
					arg6 = Static522.anInt8677;
				}
				arg2 = local314 + (arg2 << 8) - arg7 * local314;
				if (arg4 < arg6) {
					arg3 = arg7 <<= 0xC;
					arg1 <<= 0xC;
					if (arg8 < 0) {
						arg7 -= local267 * arg8;
						arg2 -= arg8 * local327;
						arg3 -= local246 * arg8;
						arg8 = 0;
					}
					if (arg4 < 0) {
						arg1 -= local226 * arg4;
						arg4 = 0;
					}
					if (local246 >= local267) {
						arg6 -= arg4;
						arg4 -= arg8;
						arg8 = Static312.anInt8379 * arg8;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static266.method3973(local314, Static115.anIntArray125, (arg3 >> 12) + 1, arg8, (arg1 >> 12) - 1, arg2)) {
										return false;
									}
									arg2 += local327;
									arg8 += Static312.anInt8379;
									arg1 += local226;
									arg3 += local246;
								}
							}
							if (!Static266.method3973(local314, Static115.anIntArray125, (arg3 >> 12) + 1, arg8, (arg7 >> 12) - 1, arg2)) {
								return false;
							}
							arg7 += local267;
							arg3 += local246;
							arg8 += Static312.anInt8379;
							arg2 += local327;
						}
					} else {
						arg6 -= arg4;
						arg4 -= arg8;
						arg8 *= Static312.anInt8379;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static266.method3973(local314, Static115.anIntArray125, (arg1 >> 12) + 1, arg8, (arg3 >> 12) - 1, arg2)) {
										return false;
									}
									arg3 += local246;
									arg8 += Static312.anInt8379;
									arg1 += local226;
									arg2 += local327;
								}
							}
							if (!Static266.method3973(local314, Static115.anIntArray125, (arg7 >> 12) + 1, arg8, (arg3 >> 12) - 1, arg2)) {
								return false;
							}
							arg7 += local267;
							arg2 += local327;
							arg8 += Static312.anInt8379;
							arg3 += local246;
						}
					}
				} else {
					arg1 = arg7 <<= 0xC;
					if (arg8 < 0) {
						arg1 -= local246 * arg8;
						arg2 -= arg8 * local327;
						arg7 -= local267 * arg8;
						arg8 = 0;
					}
					arg3 <<= 0xC;
					if (arg6 < 0) {
						arg3 -= local226 * arg6;
						arg6 = 0;
					}
					if (local246 < local267) {
						arg4 -= arg6;
						arg6 -= arg8;
						arg8 *= Static312.anInt8379;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static266.method3973(local314, Static115.anIntArray125, (arg7 >> 12) + 1, arg8, (arg3 >> 12) - 1, arg2)) {
										return false;
									}
									arg3 += local226;
									arg8 += Static312.anInt8379;
									arg2 += local327;
									arg7 += local267;
								}
							}
							if (!Static266.method3973(local314, Static115.anIntArray125, (arg7 >> 12) + 1, arg8, (arg1 >> 12) - 1, arg2)) {
								return false;
							}
							arg1 += local246;
							arg8 += Static312.anInt8379;
							arg7 += local267;
							arg2 += local327;
						}
					} else {
						arg4 -= arg6;
						arg6 -= arg8;
						arg8 = Static312.anInt8379 * arg8;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static266.method3973(local314, Static115.anIntArray125, (arg3 >> 12) + 1, arg8, (arg7 >> 12) - 1, arg2)) {
										return false;
									}
									arg7 += local267;
									arg2 += local327;
									arg3 += local226;
									arg8 += Static312.anInt8379;
								}
							}
							if (!Static266.method3973(local314, Static115.anIntArray125, (arg1 >> 12) + 1, arg8, (arg7 >> 12) - 1, arg2)) {
								return false;
							}
							arg1 += local246;
							arg7 += local267;
							arg2 += local327;
							arg8 += Static312.anInt8379;
						}
					}
				}
			} else if (arg6 >= Static522.anInt8677) {
				return true;
			} else {
				if (Static522.anInt8677 < arg8) {
					arg8 = Static522.anInt8677;
				}
				arg0 = (arg0 << 8) + local314 - arg3 * local314;
				if (Static522.anInt8677 < arg4) {
					arg4 = Static522.anInt8677;
				}
				if (arg8 < arg4) {
					arg1 = arg3 <<= 0xC;
					arg7 <<= 0xC;
					if (arg6 < 0) {
						arg3 -= arg6 * local246;
						arg0 -= local327 * arg6;
						arg1 -= local226 * arg6;
						arg6 = 0;
					}
					if (arg8 < 0) {
						arg7 -= arg8 * local267;
						arg8 = 0;
					}
					if (arg8 != arg6 && local226 < local246 || arg6 == arg8 && local226 > local267) {
						arg4 -= arg8;
						arg8 -= arg6;
						arg6 = Static312.anInt8379 * arg6;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static266.method3973(local314, Static115.anIntArray125, (arg7 >> 12) + 1, arg6, (arg1 >> 12) - 1, arg0)) {
										return false;
									}
									arg1 += local226;
									arg6 += Static312.anInt8379;
									arg7 += local267;
									arg0 += local327;
								}
							}
							if (!Static266.method3973(local314, Static115.anIntArray125, (arg3 >> 12) + 1, arg6, (arg1 >> 12) - 1, arg0)) {
								return false;
							}
							arg1 += local226;
							arg6 += Static312.anInt8379;
							arg0 += local327;
							arg3 += local246;
						}
					} else {
						arg4 -= arg8;
						arg8 -= arg6;
						arg6 *= Static312.anInt8379;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static266.method3973(local314, Static115.anIntArray125, (arg1 >> 12) + 1, arg6, (arg7 >> 12) - 1, arg0)) {
										return false;
									}
									arg6 += Static312.anInt8379;
									arg1 += local226;
									arg7 += local267;
									arg0 += local327;
								}
							}
							if (!Static266.method3973(local314, Static115.anIntArray125, (arg1 >> 12) + 1, arg6, (arg3 >> 12) - 1, arg0)) {
								return false;
							}
							arg6 += Static312.anInt8379;
							arg3 += local246;
							arg1 += local226;
							arg0 += local327;
						}
					}
				} else {
					arg7 = arg3 <<= 0xC;
					arg1 <<= 0xC;
					if (arg6 < 0) {
						arg7 -= arg6 * local226;
						arg3 -= local246 * arg6;
						arg0 -= arg6 * local327;
						arg6 = 0;
					}
					if (arg4 < 0) {
						arg1 -= local267 * arg4;
						arg4 = 0;
					}
					if (local246 <= local226) {
						arg8 -= arg4;
						arg4 -= arg6;
						arg6 *= Static312.anInt8379;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static266.method3973(local314, Static115.anIntArray125, (arg1 >> 12) + 1, arg6, (arg3 >> 12) - 1, arg0)) {
										return false;
									}
									arg1 += local267;
									arg3 += local246;
									arg6 += Static312.anInt8379;
									arg0 += local327;
								}
							}
							if (!Static266.method3973(local314, Static115.anIntArray125, (arg7 >> 12) + 1, arg6, (arg3 >> 12) - 1, arg0)) {
								return false;
							}
							arg7 += local226;
							arg3 += local246;
							arg0 += local327;
							arg6 += Static312.anInt8379;
						}
					} else {
						arg8 -= arg4;
						arg4 -= arg6;
						arg6 = Static312.anInt8379 * arg6;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static266.method3973(local314, Static115.anIntArray125, (arg3 >> 12) + 1, arg6, (arg1 >> 12) - 1, arg0)) {
										return false;
									}
									arg6 += Static312.anInt8379;
									arg1 += local267;
									arg3 += local246;
									arg0 += local327;
								}
							}
							if (!Static266.method3973(local314, Static115.anIntArray125, (arg3 >> 12) + 1, arg6, (arg7 >> 12) - 1, arg0)) {
								return false;
							}
							arg0 += local327;
							arg3 += local246;
							arg6 += Static312.anInt8379;
							arg7 += local226;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4091(@OriginalArg(1) int arg0) {
		@Pc(17) Class6_Sub34 local17 = (Class6_Sub34) Static60.aClass209_5.method5038((long) arg0);
		if (local17 != null) {
			@Pc(24) Class6_Sub14_Sub4 local24 = local17.aClass204_Sub1_1.method6609();
			if (local24 != null) {
				@Pc(31) double local31 = local17.aClass204_Sub1_1.method6594();
				if (local31 >= (double) local24.method9067() && local31 <= (double) local24.method9063()) {
					return local24.method9064();
				}
			}
		}
		return null;
	}
}
