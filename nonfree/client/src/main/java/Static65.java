import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray30;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "Lclient!so;")
	public static final Class314 aClass314_2 = new Class314(4, 3);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method1727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 > 2000 || arg6 > 2000 || arg4 > 2000 || arg0 > 2000 || arg1 > 2000 || arg8 > 2000) {
			return false;
		} else if (arg5 >= -2000 && arg6 >= -2000 && arg4 >= -2000 && arg0 >= -2000 && arg1 >= -2000 && arg8 >= -2000) {
			@Pc(64) int local64;
			if (Static146.anInt3696 == 2) {
				local64 = arg5 * Static225.anInt10572 + arg0;
				if (local64 >= 0 && local64 < Static169.anIntArray223.length && (arg2 << 8) - 38400 < Static169.anIntArray223[local64]) {
					return false;
				}
				local64 = Static225.anInt10572 * arg6 + arg1;
				if (local64 >= 0 && local64 < Static169.anIntArray223.length && Static169.anIntArray223[local64] > (arg7 << 8) - 38400) {
					return false;
				}
				local64 = arg4 * Static225.anInt10572 + arg8;
				if (local64 >= 0 && local64 < Static169.anIntArray223.length && (arg3 << 8) - 38400 < Static169.anIntArray223[local64]) {
					return false;
				}
			}
			local64 = arg1 - arg0;
			@Pc(155) int local155 = arg6 - arg5;
			@Pc(160) int local160 = arg8 - arg0;
			@Pc(165) int local165 = arg4 - arg5;
			@Pc(170) int local170 = arg7 - arg2;
			if (arg5 < arg6 && arg4 > arg4) {
				arg5--;
				if (arg6 <= arg4) {
					arg4++;
				} else {
					arg6++;
				}
			} else if (arg4 <= arg6) {
				if (arg5 <= arg6) {
					arg6++;
				} else {
					arg5++;
				}
				arg4--;
			} else {
				arg6--;
				if (arg4 >= arg5) {
					arg4++;
				} else {
					arg5++;
				}
			}
			@Pc(220) int local220 = arg3 - arg2;
			@Pc(222) int local222 = 0;
			if (arg6 != arg5) {
				local222 = (arg1 - arg0 << 12) / (arg6 - arg5);
			}
			@Pc(238) int local238 = 0;
			if (arg4 != arg6) {
				local238 = (arg8 - arg1 << 12) / (arg4 - arg6);
			}
			@Pc(254) int local254 = 0;
			if (arg4 != arg5) {
				local254 = (arg0 - arg8 << 12) / (arg5 - arg4);
			}
			@Pc(280) int local280 = local64 * local165 - local155 * local160;
			if (local280 == 0) {
				return false;
			}
			@Pc(297) int local297 = (local170 * local165 - local155 * local220 << 8) / local280;
			@Pc(309) int local309 = (local220 * local64 - local170 * local160 << 8) / local280;
			if (arg5 <= arg6 && arg5 <= arg4) {
				if (Static46.anInt1571 <= arg5) {
					return true;
				}
				if (arg6 > Static46.anInt1571) {
					arg6 = Static46.anInt1571;
				}
				if (arg4 > Static46.anInt1571) {
					arg4 = Static46.anInt1571;
				}
				arg2 = (arg2 << 8) + (local297 - (arg0 * local297));
				if (arg6 >= arg4) {
					arg1 = arg0 <<= 0xC;
					if (arg5 < 0) {
						arg1 -= local254 * arg5;
						arg0 -= local222 * arg5;
						arg2 -= arg5 * local309;
						arg5 = 0;
					}
					arg8 <<= 0xC;
					if (arg4 < 0) {
						arg8 -= arg4 * local238;
						arg4 = 0;
					}
					if ((arg5 == arg4 || local222 <= local254) && (arg4 != arg5 || local238 <= local222)) {
						arg6 -= arg4;
						arg4 -= arg5;
						arg5 = Static225.anInt10572 * arg5;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static289.method4828(arg5, local297, (arg0 >> 12) - 1, arg2, (arg8 >> 12) + 1, Static169.anIntArray223)) {
										return false;
									}
									arg0 += local222;
									arg5 += Static225.anInt10572;
									arg8 += local238;
									arg2 += local309;
								}
							}
							if (!Static289.method4828(arg5, local297, (arg0 >> 12) - 1, arg2, (arg1 >> 12) + 1, Static169.anIntArray223)) {
								return false;
							}
							arg0 += local222;
							arg5 += Static225.anInt10572;
							arg1 += local254;
							arg2 += local309;
						}
					} else {
						arg6 -= arg4;
						arg4 -= arg5;
						arg5 *= Static225.anInt10572;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static289.method4828(arg5, local297, (arg8 >> 12) - 1, arg2, (arg0 >> 12) + 1, Static169.anIntArray223)) {
										return false;
									}
									arg8 += local238;
									arg0 += local222;
									arg2 += local309;
									arg5 += Static225.anInt10572;
								}
							}
							if (!Static289.method4828(arg5, local297, (arg1 >> 12) - 1, arg2, (arg0 >> 12) + 1, Static169.anIntArray223)) {
								return false;
							}
							arg5 += Static225.anInt10572;
							arg0 += local222;
							arg1 += local254;
							arg2 += local309;
						}
					}
				} else {
					arg8 = arg0 <<= 0xC;
					arg1 <<= 0xC;
					if (arg5 < 0) {
						arg2 -= local309 * arg5;
						arg0 -= arg5 * local222;
						arg8 -= arg5 * local254;
						arg5 = 0;
					}
					if (arg6 < 0) {
						arg1 -= arg6 * local238;
						arg6 = 0;
					}
					if ((arg5 == arg6 || local254 >= local222) && (arg6 != arg5 || local254 <= local238)) {
						arg4 -= arg6;
						arg6 -= arg5;
						arg5 = Static225.anInt10572 * arg5;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static289.method4828(arg5, local297, (arg1 >> 12) - 1, arg2, (arg8 >> 12) + 1, Static169.anIntArray223)) {
										return false;
									}
									arg8 += local254;
									arg1 += local238;
									arg5 += Static225.anInt10572;
									arg2 += local309;
								}
							}
							if (!Static289.method4828(arg5, local297, (arg0 >> 12) - 1, arg2, (arg8 >> 12) + 1, Static169.anIntArray223)) {
								return false;
							}
							arg2 += local309;
							arg8 += local254;
							arg0 += local222;
							arg5 += Static225.anInt10572;
						}
					} else {
						arg4 -= arg6;
						arg6 -= arg5;
						arg5 = Static225.anInt10572 * arg5;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static289.method4828(arg5, local297, (arg8 >> 12) - 1, arg2, (arg1 >> 12) + 1, Static169.anIntArray223)) {
										return false;
									}
									arg2 += local309;
									arg1 += local238;
									arg5 += Static225.anInt10572;
									arg8 += local254;
								}
							}
							if (!Static289.method4828(arg5, local297, (arg8 >> 12) - 1, arg2, (arg0 >> 12) + 1, Static169.anIntArray223)) {
								return false;
							}
							arg2 += local309;
							arg8 += local254;
							arg0 += local222;
							arg5 += Static225.anInt10572;
						}
					}
				}
			} else if (arg6 <= arg4) {
				if (arg6 >= Static46.anInt1571) {
					return true;
				}
				if (Static46.anInt1571 < arg4) {
					arg4 = Static46.anInt1571;
				}
				if (arg5 > Static46.anInt1571) {
					arg5 = Static46.anInt1571;
				}
				arg7 = local297 + (arg7 << 8) - local297 * arg1;
				if (arg5 <= arg4) {
					arg8 = arg1 <<= 0xC;
					if (arg6 < 0) {
						arg7 -= arg6 * local309;
						arg1 -= arg6 * local238;
						arg8 -= local222 * arg6;
						arg6 = 0;
					}
					arg0 <<= 0xC;
					if (arg5 < 0) {
						arg0 -= arg5 * local254;
						arg5 = 0;
					}
					if (local238 <= local222) {
						arg4 -= arg5;
						arg5 -= arg6;
						arg6 = Static225.anInt10572 * arg6;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static289.method4828(arg6, local297, (arg1 >> 12) - 1, arg7, (arg0 >> 12) + 1, Static169.anIntArray223)) {
										return false;
									}
									arg6 += Static225.anInt10572;
									arg1 += local238;
									arg7 += local309;
									arg0 += local254;
								}
							}
							if (!Static289.method4828(arg6, local297, (arg1 >> 12) - 1, arg7, (arg8 >> 12) + 1, Static169.anIntArray223)) {
								return false;
							}
							arg6 += Static225.anInt10572;
							arg1 += local238;
							arg8 += local222;
							arg7 += local309;
						}
					} else {
						arg4 -= arg5;
						arg5 -= arg6;
						arg6 *= Static225.anInt10572;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static289.method4828(arg6, local297, (arg0 >> 12) - 1, arg7, (arg1 >> 12) + 1, Static169.anIntArray223)) {
										return false;
									}
									arg0 += local254;
									arg1 += local238;
									arg7 += local309;
									arg6 += Static225.anInt10572;
								}
							}
							if (!Static289.method4828(arg6, local297, (arg8 >> 12) - 1, arg7, (arg1 >> 12) + 1, Static169.anIntArray223)) {
								return false;
							}
							arg1 += local238;
							arg6 += Static225.anInt10572;
							arg8 += local222;
							arg7 += local309;
						}
					}
				} else {
					arg0 = arg1 <<= 0xC;
					if (arg6 < 0) {
						arg0 -= arg6 * local222;
						arg1 -= arg6 * local238;
						arg7 -= arg6 * local309;
						arg6 = 0;
					}
					arg8 <<= 0xC;
					if (arg4 < 0) {
						arg8 -= arg4 * local254;
						arg4 = 0;
					}
					if (arg6 != arg4 && local222 < local238 || arg6 == arg4 && local222 > local254) {
						arg5 -= arg4;
						arg4 -= arg6;
						arg6 = Static225.anInt10572 * arg6;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static289.method4828(arg6, local297, (arg0 >> 12) - 1, arg7, (arg8 >> 12) + 1, Static169.anIntArray223)) {
										return false;
									}
									arg7 += local309;
									arg6 += Static225.anInt10572;
									arg8 += local254;
									arg0 += local222;
								}
							}
							if (!Static289.method4828(arg6, local297, (arg0 >> 12) - 1, arg7, (arg1 >> 12) + 1, Static169.anIntArray223)) {
								return false;
							}
							arg0 += local222;
							arg7 += local309;
							arg6 += Static225.anInt10572;
							arg1 += local238;
						}
					} else {
						arg5 -= arg4;
						arg4 -= arg6;
						arg6 *= Static225.anInt10572;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static289.method4828(arg6, local297, (arg8 >> 12) - 1, arg7, (arg0 >> 12) + 1, Static169.anIntArray223)) {
										return false;
									}
									arg7 += local309;
									arg8 += local254;
									arg6 += Static225.anInt10572;
									arg0 += local222;
								}
							}
							if (!Static289.method4828(arg6, local297, (arg1 >> 12) - 1, arg7, (arg0 >> 12) + 1, Static169.anIntArray223)) {
								return false;
							}
							arg0 += local222;
							arg6 += Static225.anInt10572;
							arg1 += local238;
							arg7 += local309;
						}
					}
				}
			} else if (arg4 >= Static46.anInt1571) {
				return true;
			} else {
				arg3 = local297 + (arg3 << 8) - local297 * arg8;
				if (arg5 > Static46.anInt1571) {
					arg5 = Static46.anInt1571;
				}
				if (arg6 > Static46.anInt1571) {
					arg6 = Static46.anInt1571;
				}
				if (arg5 >= arg6) {
					arg0 = arg8 <<= 0xC;
					if (arg4 < 0) {
						arg0 -= arg4 * local238;
						arg8 -= arg4 * local254;
						arg3 -= arg4 * local309;
						arg4 = 0;
					}
					arg1 <<= 0xC;
					if (arg6 < 0) {
						arg1 -= local222 * arg6;
						arg6 = 0;
					}
					if (local254 <= local238) {
						arg5 -= arg6;
						arg6 -= arg4;
						arg4 *= Static225.anInt10572;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static289.method4828(arg4, local297, (arg8 >> 12) - 1, arg3, (arg1 >> 12) + 1, Static169.anIntArray223)) {
										return false;
									}
									arg4 += Static225.anInt10572;
									arg1 += local222;
									arg8 += local254;
									arg3 += local309;
								}
							}
							if (!Static289.method4828(arg4, local297, (arg8 >> 12) - 1, arg3, (arg0 >> 12) + 1, Static169.anIntArray223)) {
								return false;
							}
							arg8 += local254;
							arg4 += Static225.anInt10572;
							arg3 += local309;
							arg0 += local238;
						}
					} else {
						arg5 -= arg6;
						arg6 -= arg4;
						arg4 = Static225.anInt10572 * arg4;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static289.method4828(arg4, local297, (arg1 >> 12) - 1, arg3, (arg8 >> 12) + 1, Static169.anIntArray223)) {
										return false;
									}
									arg1 += local222;
									arg3 += local309;
									arg4 += Static225.anInt10572;
									arg8 += local254;
								}
							}
							if (!Static289.method4828(arg4, local297, (arg0 >> 12) - 1, arg3, (arg8 >> 12) + 1, Static169.anIntArray223)) {
								return false;
							}
							arg8 += local254;
							arg4 += Static225.anInt10572;
							arg3 += local309;
							arg0 += local238;
						}
					}
				} else {
					arg1 = arg8 <<= 0xC;
					if (arg4 < 0) {
						arg8 -= local254 * arg4;
						arg3 -= arg4 * local309;
						arg1 -= local238 * arg4;
						arg4 = 0;
					}
					arg0 <<= 0xC;
					if (arg5 < 0) {
						arg0 -= arg5 * local222;
						arg5 = 0;
					}
					if (local254 > local238) {
						arg6 -= arg5;
						arg5 -= arg4;
						arg4 = Static225.anInt10572 * arg4;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static289.method4828(arg4, local297, (arg1 >> 12) - 1, arg3, (arg0 >> 12) + 1, Static169.anIntArray223)) {
										return false;
									}
									arg4 += Static225.anInt10572;
									arg1 += local238;
									arg3 += local309;
									arg0 += local222;
								}
							}
							if (!Static289.method4828(arg4, local297, (arg1 >> 12) - 1, arg3, (arg8 >> 12) + 1, Static169.anIntArray223)) {
								return false;
							}
							arg4 += Static225.anInt10572;
							arg3 += local309;
							arg8 += local254;
							arg1 += local238;
						}
					} else {
						arg6 -= arg5;
						arg5 -= arg4;
						arg4 = Static225.anInt10572 * arg4;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static289.method4828(arg4, local297, (arg0 >> 12) - 1, arg3, (arg1 >> 12) + 1, Static169.anIntArray223)) {
										return false;
									}
									arg0 += local222;
									arg4 += Static225.anInt10572;
									arg3 += local309;
									arg1 += local238;
								}
							}
							if (!Static289.method4828(arg4, local297, (arg8 >> 12) - 1, arg3, (arg1 >> 12) + 1, Static169.anIntArray223)) {
								return false;
							}
							arg4 += Static225.anInt10572;
							arg8 += local254;
							arg3 += local309;
							arg1 += local238;
						}
					}
				}
			}
		} else {
			return false;
		}
	}
}
