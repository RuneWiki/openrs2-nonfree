import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
	public static int anInt8329;

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "Ljava/lang/Object;")
	public static Object anObject17;

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "[Lclient!cn;")
	public static Class23_Sub2[] aClass23_Sub2Array3;

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[100];

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIIIZIII)Z")
	public static boolean method7043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 > 2000 || arg0 > 2000 || arg8 > 2000 || arg3 > 2000 || arg4 > 2000 || arg1 > 2000) {
			return false;
		} else if (arg5 >= -2000 && arg0 >= -2000 && arg8 >= -2000 && arg3 >= -2000 && arg4 >= -2000 && arg1 >= -2000) {
			@Pc(70) int local70;
			if (Static96.anInt2066 == 2) {
				local70 = Static526.anInt8708 * arg5 + arg3;
				if (local70 >= 0 && Static600.anIntArray615.length > local70 && (arg7 << 8) - 38400 < Static600.anIntArray615[local70]) {
					return false;
				}
				local70 = arg4 + arg0 * Static526.anInt8708;
				if (local70 >= 0 && local70 < Static600.anIntArray615.length && (arg2 << 8) - 38400 < Static600.anIntArray615[local70]) {
					return false;
				}
				local70 = arg8 * Static526.anInt8708 + arg1;
				if (local70 >= 0 && Static600.anIntArray615.length > local70 && (arg6 << 8) - 38400 < Static600.anIntArray615[local70]) {
					return false;
				}
			}
			local70 = arg4 - arg3;
			@Pc(153) int local153 = arg0 - arg5;
			@Pc(158) int local158 = arg1 - arg3;
			@Pc(167) int local167 = arg8 - arg5;
			@Pc(172) int local172 = arg2 - arg7;
			if (arg5 < arg0 && arg8 > arg8) {
				arg5--;
				if (arg0 > arg8) {
					arg0++;
				} else {
					arg8++;
				}
			} else if (arg8 > arg0) {
				arg0--;
				if (arg8 >= arg5) {
					arg8++;
				} else {
					arg5++;
				}
			} else {
				arg8--;
				if (arg0 >= arg5) {
					arg0++;
				} else {
					arg5++;
				}
			}
			@Pc(222) int local222 = arg6 - arg7;
			@Pc(224) int local224 = 0;
			if (arg5 != arg0) {
				local224 = (arg4 - arg3 << 12) / (arg0 - arg5);
			}
			@Pc(244) int local244 = 0;
			if (arg8 != arg0) {
				local244 = (arg1 - arg4 << 12) / (arg8 - arg0);
			}
			@Pc(259) int local259 = 0;
			if (arg5 != arg8) {
				local259 = (arg3 - arg1 << 12) / (arg5 - arg8);
			}
			@Pc(286) int local286 = local167 * local70 - local153 * local158;
			if (local286 == 0) {
				return false;
			}
			@Pc(303) int local303 = (local172 * local167 - local153 * local222 << 8) / local286;
			@Pc(316) int local316 = (local222 * local70 - local158 * local172 << 8) / local286;
			if (arg0 >= arg5 && arg5 <= arg8) {
				if (arg5 >= Static652.anInt10051) {
					return true;
				}
				if (arg0 > Static652.anInt10051) {
					arg0 = Static652.anInt10051;
				}
				if (arg8 > Static652.anInt10051) {
					arg8 = Static652.anInt10051;
				}
				arg7 = local303 + (arg7 << 8) - arg3 * local303;
				if (arg0 >= arg8) {
					arg4 = arg3 <<= 0xC;
					arg1 <<= 0xC;
					if (arg5 < 0) {
						arg4 -= arg5 * local259;
						arg3 -= local224 * arg5;
						arg7 -= local316 * arg5;
						arg5 = 0;
					}
					if (arg8 < 0) {
						arg1 -= arg8 * local244;
						arg8 = 0;
					}
					if (arg5 != arg8 && local224 > local259 || arg8 == arg5 && local224 < local244) {
						arg0 -= arg8;
						arg8 -= arg5;
						arg5 = Static526.anInt8708 * arg5;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static507.method7177(arg7, Static600.anIntArray615, arg5, (arg1 >> 12) - 1, local303, (arg3 >> 12) + 1)) {
										return false;
									}
									arg1 += local244;
									arg7 += local316;
									arg5 += Static526.anInt8708;
									arg3 += local224;
								}
							}
							if (!Static507.method7177(arg7, Static600.anIntArray615, arg5, (arg4 >> 12) - 1, local303, (arg3 >> 12) + 1)) {
								return false;
							}
							arg3 += local224;
							arg7 += local316;
							arg4 += local259;
							arg5 += Static526.anInt8708;
						}
					} else {
						arg0 -= arg8;
						arg8 -= arg5;
						arg5 = Static526.anInt8708 * arg5;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static507.method7177(arg7, Static600.anIntArray615, arg5, (arg3 >> 12) - 1, local303, (arg1 >> 12) + 1)) {
										return false;
									}
									arg1 += local244;
									arg5 += Static526.anInt8708;
									arg3 += local224;
									arg7 += local316;
								}
							}
							if (!Static507.method7177(arg7, Static600.anIntArray615, arg5, (arg3 >> 12) - 1, local303, (arg4 >> 12) + 1)) {
								return false;
							}
							arg7 += local316;
							arg4 += local259;
							arg5 += Static526.anInt8708;
							arg3 += local224;
						}
					}
				} else {
					arg1 = arg3 <<= 0xC;
					arg4 <<= 0xC;
					if (arg5 < 0) {
						arg7 -= local316 * arg5;
						arg3 -= local224 * arg5;
						arg1 -= local259 * arg5;
						arg5 = 0;
					}
					if (arg0 < 0) {
						arg4 -= local244 * arg0;
						arg0 = 0;
					}
					if ((arg0 == arg5 || local224 <= local259) && (arg0 != arg5 || local244 >= local259)) {
						arg8 -= arg0;
						arg0 -= arg5;
						arg5 *= Static526.anInt8708;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static507.method7177(arg7, Static600.anIntArray615, arg5, (arg4 >> 12) - 1, local303, (arg1 >> 12) + 1)) {
										return false;
									}
									arg7 += local316;
									arg1 += local259;
									arg4 += local244;
									arg5 += Static526.anInt8708;
								}
							}
							if (!Static507.method7177(arg7, Static600.anIntArray615, arg5, (arg3 >> 12) - 1, local303, (arg1 >> 12) + 1)) {
								return false;
							}
							arg1 += local259;
							arg5 += Static526.anInt8708;
							arg3 += local224;
							arg7 += local316;
						}
					} else {
						arg8 -= arg0;
						arg0 -= arg5;
						arg5 *= Static526.anInt8708;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static507.method7177(arg7, Static600.anIntArray615, arg5, (arg1 >> 12) - 1, local303, (arg4 >> 12) + 1)) {
										return false;
									}
									arg7 += local316;
									arg1 += local259;
									arg4 += local244;
									arg5 += Static526.anInt8708;
								}
							}
							if (!Static507.method7177(arg7, Static600.anIntArray615, arg5, (arg1 >> 12) - 1, local303, (arg3 >> 12) + 1)) {
								return false;
							}
							arg5 += Static526.anInt8708;
							arg7 += local316;
							arg3 += local224;
							arg1 += local259;
						}
					}
				}
			} else if (arg8 >= arg0) {
				if (arg0 >= Static652.anInt10051) {
					return true;
				}
				if (arg5 > Static652.anInt10051) {
					arg5 = Static652.anInt10051;
				}
				arg2 = local303 + (arg2 << 8) - local303 * arg4;
				if (Static652.anInt10051 < arg8) {
					arg8 = Static652.anInt10051;
				}
				if (arg8 < arg5) {
					arg3 = arg4 <<= 0xC;
					if (arg0 < 0) {
						arg3 -= arg0 * local224;
						arg2 -= local316 * arg0;
						arg4 -= arg0 * local244;
						arg0 = 0;
					}
					arg1 <<= 0xC;
					if (arg8 < 0) {
						arg1 -= local259 * arg8;
						arg8 = 0;
					}
					if (arg8 != arg0 && local244 > local224 || arg8 == arg0 && local259 < local224) {
						arg5 -= arg8;
						arg8 -= arg0;
						arg0 *= Static526.anInt8708;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static507.method7177(arg2, Static600.anIntArray615, arg0, (arg3 >> 12) - 1, local303, (arg1 >> 12) + 1)) {
										return false;
									}
									arg0 += Static526.anInt8708;
									arg1 += local259;
									arg3 += local224;
									arg2 += local316;
								}
							}
							if (!Static507.method7177(arg2, Static600.anIntArray615, arg0, (arg3 >> 12) - 1, local303, (arg4 >> 12) + 1)) {
								return false;
							}
							arg2 += local316;
							arg4 += local244;
							arg0 += Static526.anInt8708;
							arg3 += local224;
						}
					} else {
						arg5 -= arg8;
						arg8 -= arg0;
						arg0 = Static526.anInt8708 * arg0;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static507.method7177(arg2, Static600.anIntArray615, arg0, (arg1 >> 12) - 1, local303, (arg3 >> 12) + 1)) {
										return false;
									}
									arg2 += local316;
									arg3 += local224;
									arg0 += Static526.anInt8708;
									arg1 += local259;
								}
							}
							if (!Static507.method7177(arg2, Static600.anIntArray615, arg0, (arg4 >> 12) - 1, local303, (arg3 >> 12) + 1)) {
								return false;
							}
							arg3 += local224;
							arg0 += Static526.anInt8708;
							arg4 += local244;
							arg2 += local316;
						}
					}
				} else {
					arg1 = arg4 <<= 0xC;
					if (arg0 < 0) {
						arg2 -= local316 * arg0;
						arg1 -= arg0 * local224;
						arg4 -= local244 * arg0;
						arg0 = 0;
					}
					arg3 <<= 0xC;
					if (arg5 < 0) {
						arg3 -= arg5 * local259;
						arg5 = 0;
					}
					if (local224 >= local244) {
						arg8 -= arg5;
						arg5 -= arg0;
						arg0 = Static526.anInt8708 * arg0;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static507.method7177(arg2, Static600.anIntArray615, arg0, (arg4 >> 12) - 1, local303, (arg3 >> 12) + 1)) {
										return false;
									}
									arg4 += local244;
									arg2 += local316;
									arg3 += local259;
									arg0 += Static526.anInt8708;
								}
							}
							if (!Static507.method7177(arg2, Static600.anIntArray615, arg0, (arg4 >> 12) - 1, local303, (arg1 >> 12) + 1)) {
								return false;
							}
							arg1 += local224;
							arg4 += local244;
							arg2 += local316;
							arg0 += Static526.anInt8708;
						}
					} else {
						arg8 -= arg5;
						arg5 -= arg0;
						arg0 *= Static526.anInt8708;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static507.method7177(arg2, Static600.anIntArray615, arg0, (arg3 >> 12) - 1, local303, (arg4 >> 12) + 1)) {
										return false;
									}
									arg2 += local316;
									arg3 += local259;
									arg4 += local244;
									arg0 += Static526.anInt8708;
								}
							}
							if (!Static507.method7177(arg2, Static600.anIntArray615, arg0, (arg1 >> 12) - 1, local303, (arg4 >> 12) + 1)) {
								return false;
							}
							arg0 += Static526.anInt8708;
							arg2 += local316;
							arg4 += local244;
							arg1 += local224;
						}
					}
				}
			} else if (Static652.anInt10051 <= arg8) {
				return true;
			} else {
				if (arg0 > Static652.anInt10051) {
					arg0 = Static652.anInt10051;
				}
				if (arg5 > Static652.anInt10051) {
					arg5 = Static652.anInt10051;
				}
				arg6 = local303 + (arg6 << 8) - arg1 * local303;
				if (arg0 <= arg5) {
					arg3 = arg1 <<= 0xC;
					arg4 <<= 0xC;
					if (arg8 < 0) {
						arg1 -= local259 * arg8;
						arg3 -= local244 * arg8;
						arg6 -= arg8 * local316;
						arg8 = 0;
					}
					if (arg0 < 0) {
						arg4 -= local224 * arg0;
						arg0 = 0;
					}
					if (local259 <= local244) {
						arg5 -= arg0;
						arg0 -= arg8;
						arg8 *= Static526.anInt8708;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static507.method7177(arg6, Static600.anIntArray615, arg8, (arg1 >> 12) - 1, local303, (arg4 >> 12) + 1)) {
										return false;
									}
									arg8 += Static526.anInt8708;
									arg6 += local316;
									arg4 += local224;
									arg1 += local259;
								}
							}
							if (!Static507.method7177(arg6, Static600.anIntArray615, arg8, (arg1 >> 12) - 1, local303, (arg3 >> 12) + 1)) {
								return false;
							}
							arg6 += local316;
							arg3 += local244;
							arg8 += Static526.anInt8708;
							arg1 += local259;
						}
					} else {
						arg5 -= arg0;
						arg0 -= arg8;
						arg8 *= Static526.anInt8708;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static507.method7177(arg6, Static600.anIntArray615, arg8, (arg4 >> 12) - 1, local303, (arg1 >> 12) + 1)) {
										return false;
									}
									arg1 += local259;
									arg8 += Static526.anInt8708;
									arg4 += local224;
									arg6 += local316;
								}
							}
							if (!Static507.method7177(arg6, Static600.anIntArray615, arg8, (arg3 >> 12) - 1, local303, (arg1 >> 12) + 1)) {
								return false;
							}
							arg1 += local259;
							arg6 += local316;
							arg3 += local244;
							arg8 += Static526.anInt8708;
						}
					}
				} else {
					arg4 = arg1 <<= 0xC;
					arg3 <<= 0xC;
					if (arg8 < 0) {
						arg6 -= local316 * arg8;
						arg4 -= local244 * arg8;
						arg1 -= arg8 * local259;
						arg8 = 0;
					}
					if (arg5 < 0) {
						arg3 -= local224 * arg5;
						arg5 = 0;
					}
					if (local244 >= local259) {
						arg0 -= arg5;
						arg5 -= arg8;
						arg8 = Static526.anInt8708 * arg8;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static507.method7177(arg6, Static600.anIntArray615, arg8, (arg3 >> 12) - 1, local303, (arg4 >> 12) + 1)) {
										return false;
									}
									arg4 += local244;
									arg8 += Static526.anInt8708;
									arg3 += local224;
									arg6 += local316;
								}
							}
							if (!Static507.method7177(arg6, Static600.anIntArray615, arg8, (arg1 >> 12) - 1, local303, (arg4 >> 12) + 1)) {
								return false;
							}
							arg1 += local259;
							arg4 += local244;
							arg6 += local316;
							arg8 += Static526.anInt8708;
						}
					} else {
						arg0 -= arg5;
						arg5 -= arg8;
						arg8 *= Static526.anInt8708;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static507.method7177(arg6, Static600.anIntArray615, arg8, (arg4 >> 12) - 1, local303, (arg3 >> 12) + 1)) {
										return false;
									}
									arg6 += local316;
									arg4 += local244;
									arg8 += Static526.anInt8708;
									arg3 += local224;
								}
							}
							if (!Static507.method7177(arg6, Static600.anIntArray615, arg8, (arg4 >> 12) - 1, local303, (arg1 >> 12) + 1)) {
								return false;
							}
							arg8 += Static526.anInt8708;
							arg4 += local244;
							arg6 += local316;
							arg1 += local259;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IC)Z")
	public static boolean method7044(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
