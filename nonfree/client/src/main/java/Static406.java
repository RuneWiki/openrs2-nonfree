import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
	public static int anInt7454;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
	public static int anInt7450 = 0;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "Z")
	public static volatile boolean aBoolean531 = false;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Lclient!qk;")
	public static Class279 method6473(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class279 local7 = Static433.method6771(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass279Array2 == null || arg1 >= local7.aClass279Array2.length) {
			return null;
		} else {
			return local7.aClass279Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIIIIZ)Z")
	public static boolean method6474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg3 > 2000 || arg4 > 2000 || arg0 > 2000 || arg8 > 2000 || arg2 > 2000 || arg1 > 2000) {
			return false;
		} else if (arg3 >= -2000 && arg4 >= -2000 && arg0 >= -2000 && arg8 >= -2000 && arg2 >= -2000 && arg1 >= -2000) {
			@Pc(69) int local69;
			if (Static231.anInt4359 == 2) {
				local69 = arg8 + arg3 * Static305.anInt5423;
				if (local69 >= 0 && local69 < Static101.anIntArray89.length && Static101.anIntArray89[local69] > (arg5 << 8) - 38400) {
					return false;
				}
				local69 = arg4 * Static305.anInt5423 + arg2;
				if (local69 >= 0 && local69 < Static101.anIntArray89.length && Static101.anIntArray89[local69] > (arg6 << 8) - 38400) {
					return false;
				}
				local69 = arg1 + arg0 * Static305.anInt5423;
				if (local69 >= 0 && Static101.anIntArray89.length > local69 && Static101.anIntArray89[local69] > (arg7 << 8) - 38400) {
					return false;
				}
			}
			local69 = arg2 - arg8;
			@Pc(156) int local156 = arg4 - arg3;
			@Pc(161) int local161 = arg1 - arg8;
			@Pc(166) int local166 = arg0 - arg3;
			@Pc(171) int local171 = arg6 - arg5;
			@Pc(176) int local176 = arg7 - arg5;
			if (arg4 > arg3 && arg0 > arg0) {
				arg3--;
				if (arg0 < arg4) {
					arg4++;
				} else {
					arg0++;
				}
			} else if (arg0 > arg4) {
				if (arg0 < arg3) {
					arg3++;
				} else {
					arg0++;
				}
				arg4--;
			} else {
				if (arg4 < arg3) {
					arg3++;
				} else {
					arg4++;
				}
				arg0--;
			}
			@Pc(227) int local227 = 0;
			if (arg4 != arg3) {
				local227 = (arg2 - arg8 << 12) / (arg4 - arg3);
			}
			@Pc(248) int local248 = 0;
			if (arg0 != arg4) {
				local248 = (arg1 - arg2 << 12) / (arg0 - arg4);
			}
			@Pc(268) int local268 = 0;
			if (arg0 != arg3) {
				local268 = (arg8 - arg1 << 12) / (arg3 - arg0);
			}
			@Pc(292) int local292 = local69 * local166 - local161 * local156;
			if (local292 == 0) {
				return false;
			}
			@Pc(309) int local309 = (local171 * local166 - local176 * local156 << 8) / local292;
			@Pc(336) int local336 = (local176 * local69 - local161 * local171 << 8) / local292;
			if (arg3 <= arg4 && arg3 <= arg0) {
				if (Static93.anInt2201 <= arg3) {
					return true;
				}
				if (Static93.anInt2201 < arg4) {
					arg4 = Static93.anInt2201;
				}
				arg5 = local309 + (arg5 << 8) - arg8 * local309;
				if (Static93.anInt2201 < arg0) {
					arg0 = Static93.anInt2201;
				}
				if (arg0 <= arg4) {
					arg2 = arg8 <<= 0xC;
					arg1 <<= 0xC;
					if (arg3 < 0) {
						arg5 -= local336 * arg3;
						arg2 -= local268 * arg3;
						arg8 -= local227 * arg3;
						arg3 = 0;
					}
					if (arg0 < 0) {
						arg1 -= local248 * arg0;
						arg0 = 0;
					}
					if ((arg3 == arg0 || local227 <= local268) && (arg0 != arg3 || local227 >= local248)) {
						arg4 -= arg0;
						arg0 -= arg3;
						arg3 = Static305.anInt5423 * arg3;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static92.method2078(arg5, local309, Static101.anIntArray89, (arg8 >> 12) - 1, (arg1 >> 12) + 1, arg3)) {
										return false;
									}
									arg5 += local336;
									arg1 += local248;
									arg8 += local227;
									arg3 += Static305.anInt5423;
								}
							}
							if (!Static92.method2078(arg5, local309, Static101.anIntArray89, (arg8 >> 12) - 1, (arg2 >> 12) + 1, arg3)) {
								return false;
							}
							arg5 += local336;
							arg8 += local227;
							arg2 += local268;
							arg3 += Static305.anInt5423;
						}
					} else {
						arg4 -= arg0;
						arg0 -= arg3;
						arg3 *= Static305.anInt5423;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static92.method2078(arg5, local309, Static101.anIntArray89, (arg1 >> 12) - 1, (arg8 >> 12) + 1, arg3)) {
										return false;
									}
									arg1 += local248;
									arg8 += local227;
									arg3 += Static305.anInt5423;
									arg5 += local336;
								}
							}
							if (!Static92.method2078(arg5, local309, Static101.anIntArray89, (arg2 >> 12) - 1, (arg8 >> 12) - -1, arg3)) {
								return false;
							}
							arg5 += local336;
							arg3 += Static305.anInt5423;
							arg8 += local227;
							arg2 += local268;
						}
					}
				} else {
					arg1 = arg8 <<= 0xC;
					arg2 <<= 0xC;
					if (arg3 < 0) {
						arg8 -= arg3 * local227;
						arg1 -= local268 * arg3;
						arg5 -= local336 * arg3;
						arg3 = 0;
					}
					if (arg4 < 0) {
						arg2 -= local248 * arg4;
						arg4 = 0;
					}
					if (arg3 != arg4 && local268 < local227 || arg4 == arg3 && local268 > local248) {
						arg0 -= arg4;
						arg4 -= arg3;
						arg3 *= Static305.anInt5423;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static92.method2078(arg5, local309, Static101.anIntArray89, (arg1 >> 12) - 1, (arg2 >> 12) + 1, arg3)) {
										return false;
									}
									arg2 += local248;
									arg5 += local336;
									arg3 += Static305.anInt5423;
									arg1 += local268;
								}
							}
							if (!Static92.method2078(arg5, local309, Static101.anIntArray89, (arg1 >> 12) - 1, (arg8 >> 12) - -1, arg3)) {
								return false;
							}
							arg1 += local268;
							arg3 += Static305.anInt5423;
							arg8 += local227;
							arg5 += local336;
						}
					} else {
						arg0 -= arg4;
						arg4 -= arg3;
						arg3 *= Static305.anInt5423;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static92.method2078(arg5, local309, Static101.anIntArray89, (arg2 >> 12) - 1, (arg1 >> 12) - -1, arg3)) {
										return false;
									}
									arg3 += Static305.anInt5423;
									arg1 += local268;
									arg2 += local248;
									arg5 += local336;
								}
							}
							if (!Static92.method2078(arg5, local309, Static101.anIntArray89, (arg8 >> 12) - 1, (arg1 >> 12) + 1, arg3)) {
								return false;
							}
							arg3 += Static305.anInt5423;
							arg1 += local268;
							arg8 += local227;
							arg5 += local336;
						}
					}
				}
			} else if (arg4 <= arg0) {
				if (Static93.anInt2201 <= arg4) {
					return true;
				}
				if (Static93.anInt2201 < arg0) {
					arg0 = Static93.anInt2201;
				}
				if (Static93.anInt2201 < arg3) {
					arg3 = Static93.anInt2201;
				}
				arg6 = (arg6 << 8) + local309 - local309 * arg2;
				if (arg0 >= arg3) {
					arg1 = arg2 <<= 0xC;
					arg8 <<= 0xC;
					if (arg4 < 0) {
						arg6 -= arg4 * local336;
						arg2 -= local248 * arg4;
						arg1 -= local227 * arg4;
						arg4 = 0;
					}
					if (arg3 < 0) {
						arg8 -= arg3 * local268;
						arg3 = 0;
					}
					if (local227 < local248) {
						arg0 -= arg3;
						arg3 -= arg4;
						arg4 *= Static305.anInt5423;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static92.method2078(arg6, local309, Static101.anIntArray89, (arg8 >> 12) - 1, (arg2 >> 12) - -1, arg4)) {
										return false;
									}
									arg8 += local268;
									arg4 += Static305.anInt5423;
									arg2 += local248;
									arg6 += local336;
								}
							}
							if (!Static92.method2078(arg6, local309, Static101.anIntArray89, (arg1 >> 12) - 1, (arg2 >> 12) - -1, arg4)) {
								return false;
							}
							arg2 += local248;
							arg1 += local227;
							arg4 += Static305.anInt5423;
							arg6 += local336;
						}
					} else {
						arg0 -= arg3;
						arg3 -= arg4;
						arg4 = Static305.anInt5423 * arg4;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static92.method2078(arg6, local309, Static101.anIntArray89, (arg2 >> 12) - 1, (arg8 >> 12) + 1, arg4)) {
										return false;
									}
									arg6 += local336;
									arg2 += local248;
									arg4 += Static305.anInt5423;
									arg8 += local268;
								}
							}
							if (!Static92.method2078(arg6, local309, Static101.anIntArray89, (arg2 >> 12) - 1, (arg1 >> 12) - -1, arg4)) {
								return false;
							}
							arg1 += local227;
							arg2 += local248;
							arg6 += local336;
							arg4 += Static305.anInt5423;
						}
					}
				} else {
					arg8 = arg2 <<= 0xC;
					if (arg4 < 0) {
						arg2 -= local248 * arg4;
						arg8 -= local227 * arg4;
						arg6 -= arg4 * local336;
						arg4 = 0;
					}
					arg1 <<= 0xC;
					if (arg0 < 0) {
						arg1 -= local268 * arg0;
						arg0 = 0;
					}
					if (arg0 != arg4 && local248 > local227 || arg4 == arg0 && local268 < local227) {
						arg3 -= arg0;
						arg0 -= arg4;
						arg4 *= Static305.anInt5423;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static92.method2078(arg6, local309, Static101.anIntArray89, (arg8 >> 12) - 1, (arg1 >> 12) + 1, arg4)) {
										return false;
									}
									arg8 += local227;
									arg4 += Static305.anInt5423;
									arg1 += local268;
									arg6 += local336;
								}
							}
							if (!Static92.method2078(arg6, local309, Static101.anIntArray89, (arg8 >> 12) - 1, (arg2 >> 12) + 1, arg4)) {
								return false;
							}
							arg8 += local227;
							arg2 += local248;
							arg6 += local336;
							arg4 += Static305.anInt5423;
						}
					} else {
						arg3 -= arg0;
						arg0 -= arg4;
						arg4 = Static305.anInt5423 * arg4;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static92.method2078(arg6, local309, Static101.anIntArray89, (arg1 >> 12) - 1, (arg8 >> 12) - -1, arg4)) {
										return false;
									}
									arg6 += local336;
									arg4 += Static305.anInt5423;
									arg1 += local268;
									arg8 += local227;
								}
							}
							if (!Static92.method2078(arg6, local309, Static101.anIntArray89, (arg2 >> 12) - 1, (arg8 >> 12) + 1, arg4)) {
								return false;
							}
							arg8 += local227;
							arg4 += Static305.anInt5423;
							arg2 += local248;
							arg6 += local336;
						}
					}
				}
			} else if (arg0 >= Static93.anInt2201) {
				return true;
			} else {
				if (Static93.anInt2201 < arg3) {
					arg3 = Static93.anInt2201;
				}
				arg7 = (arg7 << 8) + local309 - arg1 * local309;
				if (arg4 > Static93.anInt2201) {
					arg4 = Static93.anInt2201;
				}
				if (arg3 < arg4) {
					arg2 = arg1 <<= 0xC;
					if (arg0 < 0) {
						arg2 -= local248 * arg0;
						arg1 -= arg0 * local268;
						arg7 -= arg0 * local336;
						arg0 = 0;
					}
					arg8 <<= 0xC;
					if (arg3 < 0) {
						arg8 -= arg3 * local227;
						arg3 = 0;
					}
					if (local248 < local268) {
						arg4 -= arg3;
						arg3 -= arg0;
						arg0 = Static305.anInt5423 * arg0;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static92.method2078(arg7, local309, Static101.anIntArray89, (arg2 >> 12) - 1, (arg8 >> 12) - -1, arg0)) {
										return false;
									}
									arg7 += local336;
									arg2 += local248;
									arg0 += Static305.anInt5423;
									arg8 += local227;
								}
							}
							if (!Static92.method2078(arg7, local309, Static101.anIntArray89, (arg2 >> 12) - 1, (arg1 >> 12) + 1, arg0)) {
								return false;
							}
							arg7 += local336;
							arg1 += local268;
							arg0 += Static305.anInt5423;
							arg2 += local248;
						}
					} else {
						arg4 -= arg3;
						arg3 -= arg0;
						arg0 = Static305.anInt5423 * arg0;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static92.method2078(arg7, local309, Static101.anIntArray89, (arg8 >> 12) - 1, (arg2 >> 12) + 1, arg0)) {
										return false;
									}
									arg0 += Static305.anInt5423;
									arg2 += local248;
									arg8 += local227;
									arg7 += local336;
								}
							}
							if (!Static92.method2078(arg7, local309, Static101.anIntArray89, (arg1 >> 12) - 1, (arg2 >> 12) - -1, arg0)) {
								return false;
							}
							arg1 += local268;
							arg0 += Static305.anInt5423;
							arg7 += local336;
							arg2 += local248;
						}
					}
				} else {
					arg8 = arg1 <<= 0xC;
					if (arg0 < 0) {
						arg1 -= local268 * arg0;
						arg8 -= local248 * arg0;
						arg7 -= local336 * arg0;
						arg0 = 0;
					}
					arg2 <<= 0xC;
					if (arg4 < 0) {
						arg2 -= arg4 * local227;
						arg4 = 0;
					}
					if (local248 < local268) {
						arg3 -= arg4;
						arg4 -= arg0;
						arg0 = Static305.anInt5423 * arg0;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static92.method2078(arg7, local309, Static101.anIntArray89, (arg2 >> 12) - 1, (arg1 >> 12) + 1, arg0)) {
										return false;
									}
									arg2 += local227;
									arg7 += local336;
									arg1 += local268;
									arg0 += Static305.anInt5423;
								}
							}
							if (!Static92.method2078(arg7, local309, Static101.anIntArray89, (arg8 >> 12) - 1, (arg1 >> 12) + 1, arg0)) {
								return false;
							}
							arg0 += Static305.anInt5423;
							arg7 += local336;
							arg8 += local248;
							arg1 += local268;
						}
					} else {
						arg3 -= arg4;
						arg4 -= arg0;
						arg0 = Static305.anInt5423 * arg0;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static92.method2078(arg7, local309, Static101.anIntArray89, (arg1 >> 12) - 1, (arg2 >> 12) + 1, arg0)) {
										return false;
									}
									arg0 += Static305.anInt5423;
									arg2 += local227;
									arg7 += local336;
									arg1 += local268;
								}
							}
							if (!Static92.method2078(arg7, local309, Static101.anIntArray89, (arg1 >> 12) - 1, (arg8 >> 12) + 1, arg0)) {
								return false;
							}
							arg7 += local336;
							arg8 += local248;
							arg1 += local268;
							arg0 += Static305.anInt5423;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)I")
	public static int method6475() {
		return Static547.anInt1290++;
	}
}
