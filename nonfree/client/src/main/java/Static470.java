import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "J")
	public static long aLong231;

	@OriginalMember(owner = "client!qm", name = "o", descriptor = "Lclient!o;")
	public static Class234 aClass234_11;

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_95 = new Class185(83, 12);

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIBIIIIIII)Z")
	public static boolean method7000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 > 2000 || arg6 > 2000 || arg3 > 2000 || arg1 > 2000 || arg0 > 2000 || arg5 > 2000) {
			return false;
		} else if (arg4 >= -2000 && arg6 >= -2000 && arg3 >= -2000 && arg1 >= -2000 && arg0 >= -2000 && arg5 >= -2000) {
			@Pc(68) int local68;
			if (Static502.anInt7204 == 2) {
				local68 = arg4 * Static35.anInt884 + arg1;
				if (local68 >= 0 && Static401.anIntArray371.length > local68 && (arg7 << 8) - 38400 < Static401.anIntArray371[local68]) {
					return false;
				}
				local68 = arg0 + arg6 * Static35.anInt884;
				if (local68 >= 0 && Static401.anIntArray371.length > local68 && Static401.anIntArray371[local68] > (arg2 << 8) - 38400) {
					return false;
				}
				local68 = arg5 + arg3 * Static35.anInt884;
				if (local68 >= 0 && local68 < Static401.anIntArray371.length && (arg8 << 8) - 38400 < Static401.anIntArray371[local68]) {
					return false;
				}
			}
			local68 = arg0 - arg1;
			@Pc(156) int local156 = arg6 - arg4;
			@Pc(166) int local166 = arg5 - arg1;
			@Pc(171) int local171 = arg3 - arg4;
			@Pc(176) int local176 = arg2 - arg7;
			@Pc(181) int local181 = arg8 - arg7;
			if (arg6 > arg4 && arg3 > arg3) {
				arg4--;
				if (arg3 >= arg6) {
					arg3++;
				} else {
					arg6++;
				}
			} else if (arg3 > arg6) {
				if (arg3 >= arg4) {
					arg3++;
				} else {
					arg4++;
				}
				arg6--;
			} else {
				if (arg6 >= arg4) {
					arg6++;
				} else {
					arg4++;
				}
				arg3--;
			}
			@Pc(232) int local232 = 0;
			if (arg6 != arg4) {
				local232 = (arg0 - arg1 << 12) / (arg6 - arg4);
			}
			@Pc(252) int local252 = 0;
			if (arg3 != arg6) {
				local252 = (arg5 - arg0 << 12) / (arg3 - arg6);
			}
			@Pc(268) int local268 = 0;
			if (arg4 != arg3) {
				local268 = (arg1 - arg5 << 12) / (arg4 - arg3);
			}
			@Pc(292) int local292 = local171 * local68 - local166 * local156;
			if (local292 == 0) {
				return false;
			}
			@Pc(312) int local312 = (local176 * local171 - local156 * local181 << 8) / local292;
			@Pc(325) int local325 = (local68 * local181 - local166 * local176 << 8) / local292;
			if (arg6 >= arg4 && arg3 >= arg4) {
				if (arg4 >= Static115.anInt2983) {
					return true;
				}
				if (Static115.anInt2983 < arg3) {
					arg3 = Static115.anInt2983;
				}
				arg7 = local312 + (arg7 << 8) - arg1 * local312;
				if (arg6 > Static115.anInt2983) {
					arg6 = Static115.anInt2983;
				}
				if (arg3 <= arg6) {
					arg0 = arg1 <<= 0xC;
					if (arg4 < 0) {
						arg1 -= arg4 * local232;
						arg7 -= local325 * arg4;
						arg0 -= arg4 * local268;
						arg4 = 0;
					}
					arg5 <<= 0xC;
					if (arg3 < 0) {
						arg5 -= local252 * arg3;
						arg3 = 0;
					}
					if ((arg4 == arg3 || local232 <= local268) && (arg3 != arg4 || local252 <= local232)) {
						arg6 -= arg3;
						arg3 -= arg4;
						arg4 = Static35.anInt884 * arg4;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static503.method7262((arg1 >> 12) - 1, local312, arg4, arg7, (arg5 >> 12) + 1, Static401.anIntArray371)) {
										return false;
									}
									arg1 += local232;
									arg7 += local325;
									arg5 += local252;
									arg4 += Static35.anInt884;
								}
							}
							if (!Static503.method7262((arg1 >> 12) - 1, local312, arg4, arg7, (arg0 >> 12) + 1, Static401.anIntArray371)) {
								return false;
							}
							arg1 += local232;
							arg0 += local268;
							arg7 += local325;
							arg4 += Static35.anInt884;
						}
					} else {
						arg6 -= arg3;
						arg3 -= arg4;
						arg4 = Static35.anInt884 * arg4;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static503.method7262((arg5 >> 12) - 1, local312, arg4, arg7, (arg1 >> 12) + 1, Static401.anIntArray371)) {
										return false;
									}
									arg5 += local252;
									arg7 += local325;
									arg1 += local232;
									arg4 += Static35.anInt884;
								}
							}
							if (!Static503.method7262((arg0 >> 12) - 1, local312, arg4, arg7, (arg1 >> 12) + 1, Static401.anIntArray371)) {
								return false;
							}
							arg7 += local325;
							arg1 += local232;
							arg0 += local268;
							arg4 += Static35.anInt884;
						}
					}
				} else {
					arg5 = arg1 <<= 0xC;
					arg0 <<= 0xC;
					if (arg4 < 0) {
						arg1 -= local232 * arg4;
						arg5 -= local268 * arg4;
						arg7 -= local325 * arg4;
						arg4 = 0;
					}
					if (arg6 < 0) {
						arg0 -= local252 * arg6;
						arg6 = 0;
					}
					if (arg4 != arg6 && local232 > local268 || arg4 == arg6 && local268 > local252) {
						arg3 -= arg6;
						arg6 -= arg4;
						arg4 = Static35.anInt884 * arg4;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static503.method7262((arg5 >> 12) - 1, local312, arg4, arg7, (arg0 >> 12) + 1, Static401.anIntArray371)) {
										return false;
									}
									arg0 += local252;
									arg4 += Static35.anInt884;
									arg7 += local325;
									arg5 += local268;
								}
							}
							if (!Static503.method7262((arg5 >> 12) - 1, local312, arg4, arg7, (arg1 >> 12) + 1, Static401.anIntArray371)) {
								return false;
							}
							arg1 += local232;
							arg5 += local268;
							arg4 += Static35.anInt884;
							arg7 += local325;
						}
					} else {
						arg3 -= arg6;
						arg6 -= arg4;
						arg4 = Static35.anInt884 * arg4;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static503.method7262((arg0 >> 12) - 1, local312, arg4, arg7, (arg5 >> 12) + 1, Static401.anIntArray371)) {
										return false;
									}
									arg5 += local268;
									arg7 += local325;
									arg0 += local252;
									arg4 += Static35.anInt884;
								}
							}
							if (!Static503.method7262((arg1 >> 12) - 1, local312, arg4, arg7, (arg5 >> 12) + 1, Static401.anIntArray371)) {
								return false;
							}
							arg7 += local325;
							arg4 += Static35.anInt884;
							arg1 += local232;
							arg5 += local268;
						}
					}
				}
			} else if (arg6 > arg3) {
				if (Static115.anInt2983 <= arg3) {
					return true;
				}
				if (arg6 > Static115.anInt2983) {
					arg6 = Static115.anInt2983;
				}
				arg8 = (arg8 << 8) + local312 - arg5 * local312;
				if (arg4 > Static115.anInt2983) {
					arg4 = Static115.anInt2983;
				}
				if (arg4 >= arg6) {
					arg1 = arg5 <<= 0xC;
					if (arg3 < 0) {
						arg1 -= arg3 * local252;
						arg5 -= arg3 * local268;
						arg8 -= local325 * arg3;
						arg3 = 0;
					}
					arg0 <<= 0xC;
					if (arg6 < 0) {
						arg0 -= arg6 * local232;
						arg6 = 0;
					}
					if (local268 <= local252) {
						arg4 -= arg6;
						arg6 -= arg3;
						arg3 = Static35.anInt884 * arg3;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static503.method7262((arg5 >> 12) - 1, local312, arg3, arg8, (arg0 >> 12) + 1, Static401.anIntArray371)) {
										return false;
									}
									arg0 += local232;
									arg5 += local268;
									arg8 += local325;
									arg3 += Static35.anInt884;
								}
							}
							if (!Static503.method7262((arg5 >> 12) - 1, local312, arg3, arg8, (arg1 >> 12) + 1, Static401.anIntArray371)) {
								return false;
							}
							arg3 += Static35.anInt884;
							arg8 += local325;
							arg1 += local252;
							arg5 += local268;
						}
					} else {
						arg4 -= arg6;
						arg6 -= arg3;
						arg3 = Static35.anInt884 * arg3;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static503.method7262((arg0 >> 12) - 1, local312, arg3, arg8, (arg5 >> 12) + 1, Static401.anIntArray371)) {
										return false;
									}
									arg8 += local325;
									arg3 += Static35.anInt884;
									arg5 += local268;
									arg0 += local232;
								}
							}
							if (!Static503.method7262((arg1 >> 12) - 1, local312, arg3, arg8, (arg5 >> 12) + 1, Static401.anIntArray371)) {
								return false;
							}
							arg8 += local325;
							arg5 += local268;
							arg1 += local252;
							arg3 += Static35.anInt884;
						}
					}
				} else {
					arg0 = arg5 <<= 0xC;
					if (arg3 < 0) {
						arg0 -= local252 * arg3;
						arg8 -= local325 * arg3;
						arg5 -= arg3 * local268;
						arg3 = 0;
					}
					arg1 <<= 0xC;
					if (arg4 < 0) {
						arg1 -= arg4 * local232;
						arg4 = 0;
					}
					if (local268 <= local252) {
						arg6 -= arg4;
						arg4 -= arg3;
						arg3 = Static35.anInt884 * arg3;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static503.method7262((arg1 >> 12) - 1, local312, arg3, arg8, (arg0 >> 12) + 1, Static401.anIntArray371)) {
										return false;
									}
									arg1 += local232;
									arg3 += Static35.anInt884;
									arg8 += local325;
									arg0 += local252;
								}
							}
							if (!Static503.method7262((arg5 >> 12) - 1, local312, arg3, arg8, (arg0 >> 12) + 1, Static401.anIntArray371)) {
								return false;
							}
							arg5 += local268;
							arg8 += local325;
							arg3 += Static35.anInt884;
							arg0 += local252;
						}
					} else {
						arg6 -= arg4;
						arg4 -= arg3;
						arg3 *= Static35.anInt884;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static503.method7262((arg0 >> 12) - 1, local312, arg3, arg8, (arg1 >> 12) + 1, Static401.anIntArray371)) {
										return false;
									}
									arg0 += local252;
									arg8 += local325;
									arg3 += Static35.anInt884;
									arg1 += local232;
								}
							}
							if (!Static503.method7262((arg0 >> 12) - 1, local312, arg3, arg8, (arg5 >> 12) + 1, Static401.anIntArray371)) {
								return false;
							}
							arg8 += local325;
							arg0 += local252;
							arg5 += local268;
							arg3 += Static35.anInt884;
						}
					}
				}
			} else if (arg6 >= Static115.anInt2983) {
				return true;
			} else {
				if (arg4 > Static115.anInt2983) {
					arg4 = Static115.anInt2983;
				}
				arg2 = (arg2 << 8) + local312 - arg0 * local312;
				if (Static115.anInt2983 < arg3) {
					arg3 = Static115.anInt2983;
				}
				if (arg3 < arg4) {
					arg1 = arg0 <<= 0xC;
					if (arg6 < 0) {
						arg1 -= local232 * arg6;
						arg2 -= arg6 * local325;
						arg0 -= local252 * arg6;
						arg6 = 0;
					}
					arg5 <<= 0xC;
					if (arg3 < 0) {
						arg5 -= local268 * arg3;
						arg3 = 0;
					}
					if (arg3 != arg6 && local232 < local252 || arg3 == arg6 && local232 > local268) {
						arg4 -= arg3;
						arg3 -= arg6;
						arg6 *= Static35.anInt884;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static503.method7262((arg1 >> 12) - 1, local312, arg6, arg2, (arg5 >> 12) + 1, Static401.anIntArray371)) {
										return false;
									}
									arg6 += Static35.anInt884;
									arg2 += local325;
									arg5 += local268;
									arg1 += local232;
								}
							}
							if (!Static503.method7262((arg1 >> 12) - 1, local312, arg6, arg2, (arg0 >> 12) + 1, Static401.anIntArray371)) {
								return false;
							}
							arg6 += Static35.anInt884;
							arg0 += local252;
							arg2 += local325;
							arg1 += local232;
						}
					} else {
						arg4 -= arg3;
						arg3 -= arg6;
						arg6 *= Static35.anInt884;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static503.method7262((arg5 >> 12) - 1, local312, arg6, arg2, (arg1 >> 12) + 1, Static401.anIntArray371)) {
										return false;
									}
									arg2 += local325;
									arg5 += local268;
									arg1 += local232;
									arg6 += Static35.anInt884;
								}
							}
							if (!Static503.method7262((arg0 >> 12) - 1, local312, arg6, arg2, (arg1 >> 12) + 1, Static401.anIntArray371)) {
								return false;
							}
							arg6 += Static35.anInt884;
							arg2 += local325;
							arg1 += local232;
							arg0 += local252;
						}
					}
				} else {
					arg5 = arg0 <<= 0xC;
					if (arg6 < 0) {
						arg0 -= local252 * arg6;
						arg5 -= local232 * arg6;
						arg2 -= local325 * arg6;
						arg6 = 0;
					}
					arg1 <<= 0xC;
					if (arg4 < 0) {
						arg1 -= local268 * arg4;
						arg4 = 0;
					}
					if (local252 <= local232) {
						arg3 -= arg4;
						arg4 -= arg6;
						arg6 *= Static35.anInt884;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static503.method7262((arg0 >> 12) - 1, local312, arg6, arg2, (arg1 >> 12) + 1, Static401.anIntArray371)) {
										return false;
									}
									arg0 += local252;
									arg6 += Static35.anInt884;
									arg2 += local325;
									arg1 += local268;
								}
							}
							if (!Static503.method7262((arg0 >> 12) - 1, local312, arg6, arg2, (arg5 >> 12) + 1, Static401.anIntArray371)) {
								return false;
							}
							arg0 += local252;
							arg5 += local232;
							arg6 += Static35.anInt884;
							arg2 += local325;
						}
					} else {
						arg3 -= arg4;
						arg4 -= arg6;
						arg6 = Static35.anInt884 * arg6;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static503.method7262((arg1 >> 12) - 1, local312, arg6, arg2, (arg0 >> 12) + 1, Static401.anIntArray371)) {
										return false;
									}
									arg1 += local268;
									arg2 += local325;
									arg0 += local252;
									arg6 += Static35.anInt884;
								}
							}
							if (!Static503.method7262((arg5 >> 12) - 1, local312, arg6, arg2, (arg0 >> 12) + 1, Static401.anIntArray371)) {
								return false;
							}
							arg5 += local232;
							arg2 += local325;
							arg6 += Static35.anInt884;
							arg0 += local252;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIII)V")
	public static void method7004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static309.anInt6227 <= arg2 - arg4 && Static7.anInt464 >= arg2 + arg4 && arg0 - arg4 >= Static633.anInt10644 && Static389.anInt7300 >= arg0 + arg4) {
			Static21.method611(arg1, arg4, arg2, arg3, arg5, arg0);
		} else {
			Static61.method1766(arg4, arg3, arg1, arg0, arg2, arg5);
		}
	}
}
