import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!oga", name = "C", descriptor = "F")
	public static float aFloat141;

	@OriginalMember(owner = "client!oga", name = "L", descriptor = "[I")
	public static int[] anIntArray469;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(ZIIIIIIIII)Z")
	public static boolean method6506(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 > 2000 || arg5 > 2000 || arg3 > 2000 || arg8 > 2000 || arg7 > 2000 || arg4 > 2000) {
			return false;
		} else if (arg2 >= -2000 && arg5 >= -2000 && arg3 >= -2000 && arg8 >= -2000 && arg7 >= -2000 && arg4 >= -2000) {
			@Pc(94) int local94;
			if (Static559.anInt9035 == 2) {
				local94 = Static3.anInt17 * arg2 + arg8;
				if (local94 >= 0 && Static251.anIntArray252.length > local94 && (arg1 << 8) - 38400 < Static251.anIntArray252[local94]) {
					return false;
				}
				local94 = arg5 * Static3.anInt17 + arg7;
				if (local94 >= 0 && Static251.anIntArray252.length > local94 && (arg6 << 8) - 38400 < Static251.anIntArray252[local94]) {
					return false;
				}
				local94 = arg4 + Static3.anInt17 * arg3;
				if (local94 >= 0 && local94 < Static251.anIntArray252.length && (arg0 << 8) - 38400 < Static251.anIntArray252[local94]) {
					return false;
				}
			}
			local94 = arg7 - arg8;
			@Pc(200) int local200 = arg5 - arg2;
			@Pc(205) int local205 = arg4 - arg8;
			@Pc(209) int local209 = arg3 - arg2;
			@Pc(214) int local214 = arg6 - arg1;
			if (arg2 < arg5 && arg3 < arg3) {
				arg2--;
				if (arg5 <= arg3) {
					arg3++;
				} else {
					arg5++;
				}
			} else if (arg5 >= arg3) {
				arg3--;
				if (arg5 >= arg2) {
					arg5++;
				} else {
					arg2++;
				}
			} else {
				if (arg2 > arg3) {
					arg2++;
				} else {
					arg3++;
				}
				arg5--;
			}
			@Pc(289) int local289 = arg0 - arg1;
			@Pc(291) int local291 = 0;
			if (arg5 != arg2) {
				local291 = (arg7 - arg8 << 12) / (arg5 - arg2);
			}
			@Pc(311) int local311 = 0;
			if (arg5 != arg3) {
				local311 = (arg4 - arg7 << 12) / (arg3 - arg5);
			}
			@Pc(328) int local328 = 0;
			if (arg3 != arg2) {
				local328 = (arg8 - arg4 << 12) / (arg2 - arg3);
			}
			@Pc(359) int local359 = local94 * local209 - local205 * local200;
			if (local359 == 0) {
				return false;
			}
			@Pc(379) int local379 = (local214 * local209 - local200 * local289 << 8) / local359;
			@Pc(392) int local392 = (local289 * local94 - local205 * local214 << 8) / local359;
			if (arg5 >= arg2 && arg2 <= arg3) {
				if (Static487.anInt10362 <= arg2) {
					return true;
				}
				arg1 = (arg1 << 8) + local379 - (arg8 * local379);
				if (arg3 > Static487.anInt10362) {
					arg3 = Static487.anInt10362;
				}
				if (Static487.anInt10362 < arg5) {
					arg5 = Static487.anInt10362;
				}
				if (arg3 <= arg5) {
					arg7 = arg8 <<= 0xC;
					arg4 <<= 0xC;
					if (arg2 < 0) {
						arg8 -= local291 * arg2;
						arg7 -= local328 * arg2;
						arg1 -= arg2 * local392;
						arg2 = 0;
					}
					if (arg3 < 0) {
						arg4 -= local311 * arg3;
						arg3 = 0;
					}
					if ((arg3 == arg2 || local291 <= local328) && (arg2 != arg3 || local311 <= local291)) {
						arg5 -= arg3;
						arg3 -= arg2;
						arg2 *= Static3.anInt17;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static483.method7194((arg8 >> 12) - 1, (arg4 >> 12) + 1, Static251.anIntArray252, arg2, local379, arg1)) {
										return false;
									}
									arg4 += local311;
									arg8 += local291;
									arg1 += local392;
									arg2 += Static3.anInt17;
								}
							}
							if (!Static483.method7194((arg8 >> 12) - 1, (arg7 >> 12) + 1, Static251.anIntArray252, arg2, local379, arg1)) {
								return false;
							}
							arg1 += local392;
							arg8 += local291;
							arg7 += local328;
							arg2 += Static3.anInt17;
						}
					} else {
						arg5 -= arg3;
						arg3 -= arg2;
						arg2 = Static3.anInt17 * arg2;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static483.method7194((arg4 >> 12) - 1, (arg8 >> 12) + 1, Static251.anIntArray252, arg2, local379, arg1)) {
										return false;
									}
									arg8 += local291;
									arg1 += local392;
									arg4 += local311;
									arg2 += Static3.anInt17;
								}
							}
							if (!Static483.method7194((arg7 >> 12) - 1, (arg8 >> 12) + 1, Static251.anIntArray252, arg2, local379, arg1)) {
								return false;
							}
							arg7 += local328;
							arg2 += Static3.anInt17;
							arg8 += local291;
							arg1 += local392;
						}
					}
				} else {
					arg4 = arg8 <<= 0xC;
					arg7 <<= 0xC;
					if (arg2 < 0) {
						arg4 -= arg2 * local328;
						arg8 -= local291 * arg2;
						arg1 -= arg2 * local392;
						arg2 = 0;
					}
					if (arg5 < 0) {
						arg7 -= local311 * arg5;
						arg5 = 0;
					}
					if ((arg2 == arg5 || local328 >= local291) && (arg2 != arg5 || local311 >= local328)) {
						arg3 -= arg5;
						arg5 -= arg2;
						arg2 = Static3.anInt17 * arg2;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static483.method7194((arg7 >> 12) - 1, (arg4 >> 12) + 1, Static251.anIntArray252, arg2, local379, arg1)) {
										return false;
									}
									arg7 += local311;
									arg2 += Static3.anInt17;
									arg1 += local392;
									arg4 += local328;
								}
							}
							if (!Static483.method7194((arg8 >> 12) - 1, (arg4 >> 12) - -1, Static251.anIntArray252, arg2, local379, arg1)) {
								return false;
							}
							arg2 += Static3.anInt17;
							arg8 += local291;
							arg1 += local392;
							arg4 += local328;
						}
					} else {
						arg3 -= arg5;
						arg5 -= arg2;
						arg2 *= Static3.anInt17;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static483.method7194((arg4 >> 12) - 1, (arg7 >> 12) + 1, Static251.anIntArray252, arg2, local379, arg1)) {
										return false;
									}
									arg2 += Static3.anInt17;
									arg1 += local392;
									arg4 += local328;
									arg7 += local311;
								}
							}
							if (!Static483.method7194((arg4 >> 12) - 1, (arg8 >> 12) + 1, Static251.anIntArray252, arg2, local379, arg1)) {
								return false;
							}
							arg1 += local392;
							arg4 += local328;
							arg2 += Static3.anInt17;
							arg8 += local291;
						}
					}
				}
			} else if (arg5 <= arg3) {
				if (Static487.anInt10362 <= arg5) {
					return true;
				}
				if (Static487.anInt10362 < arg2) {
					arg2 = Static487.anInt10362;
				}
				arg6 = local379 + (arg6 << 8) - arg7 * local379;
				if (arg3 > Static487.anInt10362) {
					arg3 = Static487.anInt10362;
				}
				if (arg3 < arg2) {
					arg8 = arg7 <<= 0xC;
					arg4 <<= 0xC;
					if (arg5 < 0) {
						arg7 -= local311 * arg5;
						arg8 -= arg5 * local291;
						arg6 -= local392 * arg5;
						arg5 = 0;
					}
					if (arg3 < 0) {
						arg4 -= local328 * arg3;
						arg3 = 0;
					}
					if (arg5 != arg3 && local291 < local311 || arg5 == arg3 && local328 < local291) {
						arg2 -= arg3;
						arg3 -= arg5;
						arg5 = Static3.anInt17 * arg5;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static483.method7194((arg8 >> 12) - 1, (arg4 >> 12) - -1, Static251.anIntArray252, arg5, local379, arg6)) {
										return false;
									}
									arg6 += local392;
									arg5 += Static3.anInt17;
									arg4 += local328;
									arg8 += local291;
								}
							}
							if (!Static483.method7194((arg8 >> 12) - 1, (arg7 >> 12) + 1, Static251.anIntArray252, arg5, local379, arg6)) {
								return false;
							}
							arg8 += local291;
							arg6 += local392;
							arg5 += Static3.anInt17;
							arg7 += local311;
						}
					} else {
						arg2 -= arg3;
						arg3 -= arg5;
						arg5 = Static3.anInt17 * arg5;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static483.method7194((arg4 >> 12) - 1, (arg8 >> 12) + 1, Static251.anIntArray252, arg5, local379, arg6)) {
										return false;
									}
									arg5 += Static3.anInt17;
									arg8 += local291;
									arg4 += local328;
									arg6 += local392;
								}
							}
							if (!Static483.method7194((arg7 >> 12) - 1, (arg8 >> 12) - -1, Static251.anIntArray252, arg5, local379, arg6)) {
								return false;
							}
							arg7 += local311;
							arg8 += local291;
							arg6 += local392;
							arg5 += Static3.anInt17;
						}
					}
				} else {
					arg4 = arg7 <<= 0xC;
					arg8 <<= 0xC;
					if (arg5 < 0) {
						arg4 -= local291 * arg5;
						arg6 -= local392 * arg5;
						arg7 -= local311 * arg5;
						arg5 = 0;
					}
					if (arg2 < 0) {
						arg8 -= local328 * arg2;
						arg2 = 0;
					}
					if (local311 <= local291) {
						arg3 -= arg2;
						arg2 -= arg5;
						arg5 = Static3.anInt17 * arg5;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static483.method7194((arg7 >> 12) - 1, (arg8 >> 12) - -1, Static251.anIntArray252, arg5, local379, arg6)) {
										return false;
									}
									arg8 += local328;
									arg6 += local392;
									arg7 += local311;
									arg5 += Static3.anInt17;
								}
							}
							if (!Static483.method7194((arg7 >> 12) - 1, (arg4 >> 12) - -1, Static251.anIntArray252, arg5, local379, arg6)) {
								return false;
							}
							arg7 += local311;
							arg4 += local291;
							arg6 += local392;
							arg5 += Static3.anInt17;
						}
					} else {
						arg3 -= arg2;
						arg2 -= arg5;
						arg5 = Static3.anInt17 * arg5;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static483.method7194((arg8 >> 12) - 1, (arg7 >> 12) - -1, Static251.anIntArray252, arg5, local379, arg6)) {
										return false;
									}
									arg8 += local328;
									arg5 += Static3.anInt17;
									arg6 += local392;
									arg7 += local311;
								}
							}
							if (!Static483.method7194((arg4 >> 12) - 1, (arg7 >> 12) - -1, Static251.anIntArray252, arg5, local379, arg6)) {
								return false;
							}
							arg7 += local311;
							arg4 += local291;
							arg5 += Static3.anInt17;
							arg6 += local392;
						}
					}
				}
			} else if (arg3 >= Static487.anInt10362) {
				return true;
			} else {
				arg0 = local379 + (arg0 << 8) - local379 * arg4;
				if (arg2 > Static487.anInt10362) {
					arg2 = Static487.anInt10362;
				}
				if (Static487.anInt10362 < arg5) {
					arg5 = Static487.anInt10362;
				}
				if (arg2 < arg5) {
					arg7 = arg4 <<= 0xC;
					arg8 <<= 0xC;
					if (arg3 < 0) {
						arg0 -= arg3 * local392;
						arg4 -= local328 * arg3;
						arg7 -= local311 * arg3;
						arg3 = 0;
					}
					if (arg2 < 0) {
						arg8 -= local291 * arg2;
						arg2 = 0;
					}
					if (local311 < local328) {
						arg5 -= arg2;
						arg2 -= arg3;
						arg3 *= Static3.anInt17;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static483.method7194((arg7 >> 12) - 1, (arg8 >> 12) + 1, Static251.anIntArray252, arg3, local379, arg0)) {
										return false;
									}
									arg7 += local311;
									arg8 += local291;
									arg3 += Static3.anInt17;
									arg0 += local392;
								}
							}
							if (!Static483.method7194((arg7 >> 12) - 1, (arg4 >> 12) + 1, Static251.anIntArray252, arg3, local379, arg0)) {
								return false;
							}
							arg3 += Static3.anInt17;
							arg0 += local392;
							arg4 += local328;
							arg7 += local311;
						}
					} else {
						arg5 -= arg2;
						arg2 -= arg3;
						arg3 = Static3.anInt17 * arg3;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static483.method7194((arg8 >> 12) - 1, (arg7 >> 12) - -1, Static251.anIntArray252, arg3, local379, arg0)) {
										return false;
									}
									arg8 += local291;
									arg3 += Static3.anInt17;
									arg0 += local392;
									arg7 += local311;
								}
							}
							if (!Static483.method7194((arg4 >> 12) - 1, (arg7 >> 12) - -1, Static251.anIntArray252, arg3, local379, arg0)) {
								return false;
							}
							arg7 += local311;
							arg0 += local392;
							arg4 += local328;
							arg3 += Static3.anInt17;
						}
					}
				} else {
					arg8 = arg4 <<= 0xC;
					arg7 <<= 0xC;
					if (arg3 < 0) {
						arg0 -= local392 * arg3;
						arg8 -= arg3 * local311;
						arg4 -= arg3 * local328;
						arg3 = 0;
					}
					if (arg5 < 0) {
						arg7 -= local291 * arg5;
						arg5 = 0;
					}
					if (local311 >= local328) {
						arg2 -= arg5;
						arg5 -= arg3;
						arg3 *= Static3.anInt17;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static483.method7194((arg4 >> 12) - 1, (arg7 >> 12) + 1, Static251.anIntArray252, arg3, local379, arg0)) {
										return false;
									}
									arg0 += local392;
									arg3 += Static3.anInt17;
									arg7 += local291;
									arg4 += local328;
								}
							}
							if (!Static483.method7194((arg4 >> 12) - 1, (arg8 >> 12) + 1, Static251.anIntArray252, arg3, local379, arg0)) {
								return false;
							}
							arg8 += local311;
							arg3 += Static3.anInt17;
							arg4 += local328;
							arg0 += local392;
						}
					} else {
						arg2 -= arg5;
						arg5 -= arg3;
						arg3 = Static3.anInt17 * arg3;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static483.method7194((arg7 >> 12) - 1, (arg4 >> 12) - -1, Static251.anIntArray252, arg3, local379, arg0)) {
										return false;
									}
									arg4 += local328;
									arg0 += local392;
									arg7 += local291;
									arg3 += Static3.anInt17;
								}
							}
							if (!Static483.method7194((arg8 >> 12) - 1, (arg4 >> 12) + 1, Static251.anIntArray252, arg3, local379, arg0)) {
								return false;
							}
							arg0 += local392;
							arg8 += local311;
							arg3 += Static3.anInt17;
							arg4 += local328;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oga", name = "f", descriptor = "(I)V")
	public static void method6508() {
		if (Static597.anInt9453 != 0) {
			Static305.aClass260_2.method6400();
			Static78.method1078();
			Static343.method5289();
		}
	}
}
