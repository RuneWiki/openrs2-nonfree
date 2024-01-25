import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "[I")
	public static final int[] anIntArray504 = new int[4096];

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "Lclient!el;")
	public static final Class109 aClass109_183 = new Class109(16, -2);

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_93 = new Class387(77, 0);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "J")
	public static long aLong260 = 0L;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method7501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 > 2000 || arg7 > 2000 || arg1 > 2000 || arg0 > 2000 || arg4 > 2000 || arg8 > 2000) {
			return false;
		} else if (arg3 >= -2000 && arg7 >= -2000 && arg1 >= -2000 && arg0 >= -2000 && arg4 >= -2000 && arg8 >= -2000) {
			@Pc(90) int local90;
			if (Static49.anInt6793 == 2) {
				local90 = Static5.anInt9541 * arg3 + arg0;
				if (local90 >= 0 && Static58.anIntArray45.length > local90 && Static58.anIntArray45[local90] > (arg2 << 8) - 38400) {
					return false;
				}
				local90 = arg4 + arg7 * Static5.anInt9541;
				if (local90 >= 0 && Static58.anIntArray45.length > local90 && (arg5 << 8) - 38400 < Static58.anIntArray45[local90]) {
					return false;
				}
				local90 = Static5.anInt9541 * arg1 + arg8;
				if (local90 >= 0 && local90 < Static58.anIntArray45.length && Static58.anIntArray45[local90] > (arg6 << 8) - 38400) {
					return false;
				}
			}
			local90 = arg4 - arg0;
			@Pc(203) int local203 = arg7 - arg3;
			@Pc(208) int local208 = arg8 - arg0;
			@Pc(213) int local213 = arg1 - arg3;
			@Pc(218) int local218 = arg5 - arg2;
			@Pc(223) int local223 = arg6 - arg2;
			if (arg7 > arg3 && arg1 < arg1) {
				arg3--;
				if (arg1 >= arg7) {
					arg1++;
				} else {
					arg7++;
				}
			} else if (arg7 < arg1) {
				if (arg3 > arg1) {
					arg3++;
				} else {
					arg1++;
				}
				arg7--;
			} else {
				if (arg3 > arg7) {
					arg3++;
				} else {
					arg7++;
				}
				arg1--;
			}
			@Pc(296) int local296 = 0;
			if (arg7 != arg3) {
				local296 = (arg4 - arg0 << 12) / (arg7 - arg3);
			}
			@Pc(317) int local317 = 0;
			if (arg1 != arg7) {
				local317 = (arg8 - arg4 << 12) / (arg1 - arg7);
			}
			@Pc(334) int local334 = 0;
			if (arg1 != arg3) {
				local334 = (arg0 - arg8 << 12) / (arg3 - arg1);
			}
			@Pc(359) int local359 = local213 * local90 - local203 * local208;
			if (local359 == 0) {
				return false;
			}
			@Pc(385) int local385 = (local213 * local218 - local223 * local203 << 8) / local359;
			@Pc(398) int local398 = (local223 * local90 - local208 * local218 << 8) / local359;
			if (arg3 <= arg7 && arg1 >= arg3) {
				if (arg3 >= Static114.anInt1831) {
					return true;
				}
				if (arg1 > Static114.anInt1831) {
					arg1 = Static114.anInt1831;
				}
				arg2 = local385 + (arg2 << 8) - arg0 * local385;
				if (Static114.anInt1831 < arg7) {
					arg7 = Static114.anInt1831;
				}
				if (arg1 <= arg7) {
					arg4 = arg0 <<= 0xC;
					if (arg3 < 0) {
						arg0 -= local296 * arg3;
						arg4 -= local334 * arg3;
						arg2 -= local398 * arg3;
						arg3 = 0;
					}
					arg8 <<= 0xC;
					if (arg1 < 0) {
						arg8 -= arg1 * local317;
						arg1 = 0;
					}
					if ((arg1 == arg3 || local296 <= local334) && (arg3 != arg1 || local296 >= local317)) {
						arg7 -= arg1;
						arg1 -= arg3;
						arg3 *= Static5.anInt9541;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static509.method7452(arg2, arg3, (arg8 >> 12) + 1, (arg0 >> 12) + -1, local385, Static58.anIntArray45)) {
										return false;
									}
									arg8 += local317;
									arg2 += local398;
									arg3 += Static5.anInt9541;
									arg0 += local296;
								}
							}
							if (!Static509.method7452(arg2, arg3, (arg4 >> 12) + 1, (arg0 >> 12) + -1, local385, Static58.anIntArray45)) {
								return false;
							}
							arg0 += local296;
							arg2 += local398;
							arg4 += local334;
							arg3 += Static5.anInt9541;
						}
					} else {
						arg7 -= arg1;
						arg1 -= arg3;
						arg3 *= Static5.anInt9541;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static509.method7452(arg2, arg3, (arg0 >> 12) + 1, (arg8 >> 12) + -1, local385, Static58.anIntArray45)) {
										return false;
									}
									arg2 += local398;
									arg3 += Static5.anInt9541;
									arg0 += local296;
									arg8 += local317;
								}
							}
							if (!Static509.method7452(arg2, arg3, (arg0 >> 12) + 1, (arg4 >> 12) + -1, local385, Static58.anIntArray45)) {
								return false;
							}
							arg2 += local398;
							arg3 += Static5.anInt9541;
							arg0 += local296;
							arg4 += local334;
						}
					}
				} else {
					arg8 = arg0 <<= 0xC;
					if (arg3 < 0) {
						arg2 -= local398 * arg3;
						arg0 -= arg3 * local296;
						arg8 -= arg3 * local334;
						arg3 = 0;
					}
					arg4 <<= 0xC;
					if (arg7 < 0) {
						arg4 -= arg7 * local317;
						arg7 = 0;
					}
					if (arg7 != arg3 && local296 > local334 || arg7 == arg3 && local317 < local334) {
						arg1 -= arg7;
						arg7 -= arg3;
						arg3 = Static5.anInt9541 * arg3;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static509.method7452(arg2, arg3, (arg4 >> 12) + 1, (arg8 >> 12) + -1, local385, Static58.anIntArray45)) {
										return false;
									}
									arg3 += Static5.anInt9541;
									arg4 += local317;
									arg8 += local334;
									arg2 += local398;
								}
							}
							if (!Static509.method7452(arg2, arg3, (arg0 >> 12) + 1, (arg8 >> 12) + -1, local385, Static58.anIntArray45)) {
								return false;
							}
							arg0 += local296;
							arg2 += local398;
							arg8 += local334;
							arg3 += Static5.anInt9541;
						}
					} else {
						arg1 -= arg7;
						arg7 -= arg3;
						arg3 *= Static5.anInt9541;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static509.method7452(arg2, arg3, (arg8 >> 12) + 1, (arg4 >> 12) + -1, local385, Static58.anIntArray45)) {
										return false;
									}
									arg3 += Static5.anInt9541;
									arg2 += local398;
									arg4 += local317;
									arg8 += local334;
								}
							}
							if (!Static509.method7452(arg2, arg3, (arg8 >> 12) + 1, (arg0 >> 12) + -1, local385, Static58.anIntArray45)) {
								return false;
							}
							arg2 += local398;
							arg8 += local334;
							arg0 += local296;
							arg3 += Static5.anInt9541;
						}
					}
				}
			} else if (arg7 > arg1) {
				if (Static114.anInt1831 <= arg1) {
					return true;
				}
				arg6 = (arg6 << 8) + local385 - (arg8 * local385);
				if (arg3 > Static114.anInt1831) {
					arg3 = Static114.anInt1831;
				}
				if (Static114.anInt1831 < arg7) {
					arg7 = Static114.anInt1831;
				}
				if (arg3 < arg7) {
					arg4 = arg8 <<= 0xC;
					arg0 <<= 0xC;
					if (arg1 < 0) {
						arg4 -= arg1 * local317;
						arg8 -= local334 * arg1;
						arg6 -= arg1 * local398;
						arg1 = 0;
					}
					if (arg3 < 0) {
						arg0 -= local296 * arg3;
						arg3 = 0;
					}
					if (local334 > local317) {
						arg7 -= arg3;
						arg3 -= arg1;
						arg1 = Static5.anInt9541 * arg1;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static509.method7452(arg6, arg1, (arg0 >> 12) + 1, (arg4 >> 12) - 1, local385, Static58.anIntArray45)) {
										return false;
									}
									arg0 += local296;
									arg6 += local398;
									arg4 += local317;
									arg1 += Static5.anInt9541;
								}
							}
							if (!Static509.method7452(arg6, arg1, (arg8 >> 12) + 1, (arg4 >> 12) + -1, local385, Static58.anIntArray45)) {
								return false;
							}
							arg4 += local317;
							arg6 += local398;
							arg1 += Static5.anInt9541;
							arg8 += local334;
						}
					} else {
						arg7 -= arg3;
						arg3 -= arg1;
						arg1 *= Static5.anInt9541;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static509.method7452(arg6, arg1, (arg4 >> 12) + 1, (arg0 >> 12) + -1, local385, Static58.anIntArray45)) {
										return false;
									}
									arg6 += local398;
									arg0 += local296;
									arg1 += Static5.anInt9541;
									arg4 += local317;
								}
							}
							if (!Static509.method7452(arg6, arg1, (arg4 >> 12) + 1, (arg8 >> 12) - 1, local385, Static58.anIntArray45)) {
								return false;
							}
							arg8 += local334;
							arg6 += local398;
							arg1 += Static5.anInt9541;
							arg4 += local317;
						}
					}
				} else {
					arg0 = arg8 <<= 0xC;
					arg4 <<= 0xC;
					if (arg1 < 0) {
						arg0 -= local317 * arg1;
						arg8 -= local334 * arg1;
						arg6 -= local398 * arg1;
						arg1 = 0;
					}
					if (arg7 < 0) {
						arg4 -= local296 * arg7;
						arg7 = 0;
					}
					if (local334 <= local317) {
						arg3 -= arg7;
						arg7 -= arg1;
						arg1 *= Static5.anInt9541;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static509.method7452(arg6, arg1, (arg4 >> 12) + 1, (arg8 >> 12) + -1, local385, Static58.anIntArray45)) {
										return false;
									}
									arg4 += local296;
									arg6 += local398;
									arg1 += Static5.anInt9541;
									arg8 += local334;
								}
							}
							if (!Static509.method7452(arg6, arg1, (arg0 >> 12) + 1, (arg8 >> 12) + -1, local385, Static58.anIntArray45)) {
								return false;
							}
							arg0 += local317;
							arg1 += Static5.anInt9541;
							arg8 += local334;
							arg6 += local398;
						}
					} else {
						arg3 -= arg7;
						arg7 -= arg1;
						arg1 = Static5.anInt9541 * arg1;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static509.method7452(arg6, arg1, (arg8 >> 12) + 1, (arg4 >> 12) - 1, local385, Static58.anIntArray45)) {
										return false;
									}
									arg4 += local296;
									arg6 += local398;
									arg8 += local334;
									arg1 += Static5.anInt9541;
								}
							}
							if (!Static509.method7452(arg6, arg1, (arg8 >> 12) + 1, (arg0 >> 12) - 1, local385, Static58.anIntArray45)) {
								return false;
							}
							arg0 += local317;
							arg6 += local398;
							arg1 += Static5.anInt9541;
							arg8 += local334;
						}
					}
				}
			} else if (Static114.anInt1831 <= arg7) {
				return true;
			} else {
				arg5 = (arg5 << 8) + local385 - local385 * arg4;
				if (arg1 > Static114.anInt1831) {
					arg1 = Static114.anInt1831;
				}
				if (Static114.anInt1831 < arg3) {
					arg3 = Static114.anInt1831;
				}
				if (arg3 <= arg1) {
					arg8 = arg4 <<= 0xC;
					arg0 <<= 0xC;
					if (arg7 < 0) {
						arg4 -= local317 * arg7;
						arg5 -= arg7 * local398;
						arg8 -= local296 * arg7;
						arg7 = 0;
					}
					if (arg3 < 0) {
						arg0 -= arg3 * local334;
						arg3 = 0;
					}
					if (local317 > local296) {
						arg1 -= arg3;
						arg3 -= arg7;
						arg7 *= Static5.anInt9541;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static509.method7452(arg5, arg7, (arg4 >> 12) + 1, (arg0 >> 12) - 1, local385, Static58.anIntArray45)) {
										return false;
									}
									arg5 += local398;
									arg4 += local317;
									arg7 += Static5.anInt9541;
									arg0 += local334;
								}
							}
							if (!Static509.method7452(arg5, arg7, (arg4 >> 12) + 1, (arg8 >> 12) + -1, local385, Static58.anIntArray45)) {
								return false;
							}
							arg5 += local398;
							arg8 += local296;
							arg4 += local317;
							arg7 += Static5.anInt9541;
						}
					} else {
						arg1 -= arg3;
						arg3 -= arg7;
						arg7 = Static5.anInt9541 * arg7;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static509.method7452(arg5, arg7, (arg0 >> 12) + 1, (arg4 >> 12) + -1, local385, Static58.anIntArray45)) {
										return false;
									}
									arg7 += Static5.anInt9541;
									arg4 += local317;
									arg0 += local334;
									arg5 += local398;
								}
							}
							if (!Static509.method7452(arg5, arg7, (arg8 >> 12) + 1, (arg4 >> 12) + -1, local385, Static58.anIntArray45)) {
								return false;
							}
							arg8 += local296;
							arg4 += local317;
							arg7 += Static5.anInt9541;
							arg5 += local398;
						}
					}
				} else {
					arg0 = arg4 <<= 0xC;
					arg8 <<= 0xC;
					if (arg7 < 0) {
						arg5 -= local398 * arg7;
						arg0 -= local296 * arg7;
						arg4 -= local317 * arg7;
						arg7 = 0;
					}
					if (arg1 < 0) {
						arg8 -= local334 * arg1;
						arg1 = 0;
					}
					if (arg1 != arg7 && local296 < local317 || arg7 == arg1 && local334 < local296) {
						arg3 -= arg1;
						arg1 -= arg7;
						arg7 *= Static5.anInt9541;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static509.method7452(arg5, arg7, (arg8 >> 12) + 1, (arg0 >> 12) + -1, local385, Static58.anIntArray45)) {
										return false;
									}
									arg0 += local296;
									arg7 += Static5.anInt9541;
									arg8 += local334;
									arg5 += local398;
								}
							}
							if (!Static509.method7452(arg5, arg7, (arg4 >> 12) + 1, (arg0 >> 12) + -1, local385, Static58.anIntArray45)) {
								return false;
							}
							arg0 += local296;
							arg4 += local317;
							arg5 += local398;
							arg7 += Static5.anInt9541;
						}
					} else {
						arg3 -= arg1;
						arg1 -= arg7;
						arg7 = Static5.anInt9541 * arg7;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static509.method7452(arg5, arg7, (arg0 >> 12) + 1, (arg8 >> 12) + -1, local385, Static58.anIntArray45)) {
										return false;
									}
									arg0 += local296;
									arg8 += local334;
									arg5 += local398;
									arg7 += Static5.anInt9541;
								}
							}
							if (!Static509.method7452(arg5, arg7, (arg0 >> 12) + 1, (arg4 >> 12) + -1, local385, Static58.anIntArray45)) {
								return false;
							}
							arg5 += local398;
							arg7 += Static5.anInt9541;
							arg4 += local317;
							arg0 += local296;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)I")
	public static int method7503() {
		return 16;
	}
}
