import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bn", name = "k", descriptor = "Lclient!ht;")
	public static final Class137 aClass137_2 = new Class137("", 11);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 > 2000 || arg5 > 2000 || arg6 > 2000 || arg8 > 2000 || arg3 > 2000 || arg1 > 2000) {
			return false;
		} else if (arg4 >= -2000 && arg5 >= -2000 && arg6 >= -2000 && arg8 >= -2000 && arg3 >= -2000 && arg1 >= -2000) {
			@Pc(65) int local65;
			if (Static468.anInt7786 == 2) {
				local65 = arg8 + Static365.anInt6275 * arg4;
				if (local65 >= 0 && local65 < Static128.anIntArray130.length && (arg0 << 8) - 15360 < Static128.anIntArray130[local65]) {
					return false;
				}
				local65 = arg3 + arg5 * Static365.anInt6275;
				if (local65 >= 0 && local65 < Static128.anIntArray130.length && Static128.anIntArray130[local65] > (arg2 << 8) - 15360) {
					return false;
				}
				local65 = Static365.anInt6275 * arg6 + arg1;
				if (local65 >= 0 && Static128.anIntArray130.length > local65 && (arg7 << 8) - 15360 < Static128.anIntArray130[local65]) {
					return false;
				}
			}
			local65 = arg3 - arg8;
			@Pc(151) int local151 = arg5 - arg4;
			@Pc(156) int local156 = arg1 - arg8;
			@Pc(161) int local161 = arg6 - arg4;
			@Pc(166) int local166 = arg2 - arg0;
			@Pc(171) int local171 = arg7 - arg0;
			if (arg4 < arg5 && arg6 > arg6) {
				arg4--;
				if (arg6 < arg5) {
					arg5++;
				} else {
					arg6++;
				}
			} else if (arg6 <= arg5) {
				arg6--;
				if (arg5 >= arg4) {
					arg5++;
				} else {
					arg4++;
				}
			} else {
				if (arg4 > arg6) {
					arg4++;
				} else {
					arg6++;
				}
				arg5--;
			}
			@Pc(226) int local226 = 0;
			if (arg4 != arg5) {
				local226 = (arg3 - arg8 << 12) / (arg5 - arg4);
			}
			@Pc(242) int local242 = 0;
			if (arg5 != arg6) {
				local242 = (arg1 - arg3 << 12) / (arg6 - arg5);
			}
			@Pc(258) int local258 = 0;
			if (arg6 != arg4) {
				local258 = (arg8 - arg1 << 12) / (arg4 - arg6);
			}
			@Pc(289) int local289 = local161 * local65 - local151 * local156;
			if (local289 == 0) {
				return false;
			}
			@Pc(309) int local309 = (local166 * local161 - local171 * local151 << 8) / local289;
			@Pc(322) int local322 = (local65 * local171 - local166 * local156 << 8) / local289;
			if (arg4 <= arg5 && arg6 >= arg4) {
				if (Static76.anInt1726 <= arg4) {
					return true;
				}
				arg0 = local309 + (arg0 << 8) - local309 * arg8;
				if (arg5 > Static76.anInt1726) {
					arg5 = Static76.anInt1726;
				}
				if (Static76.anInt1726 < arg6) {
					arg6 = Static76.anInt1726;
				}
				if (arg6 <= arg5) {
					arg3 = arg8 <<= 0xC;
					arg1 <<= 0xC;
					if (arg4 < 0) {
						arg8 -= local226 * arg4;
						arg0 -= arg4 * local322;
						arg3 -= local258 * arg4;
						arg4 = 0;
					}
					if (arg6 < 0) {
						arg1 -= local242 * arg6;
						arg6 = 0;
					}
					if ((arg6 == arg4 || local258 >= local226) && (arg6 != arg4 || local226 >= local242)) {
						arg5 -= arg6;
						arg6 -= arg4;
						arg4 = Static365.anInt6275 * arg4;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static509.method6875(Static128.anIntArray130, (arg1 >> 12) + 1, arg0, arg4, local309, (arg8 >> 12) - 1)) {
										return false;
									}
									arg4 += Static365.anInt6275;
									arg8 += local226;
									arg1 += local242;
									arg0 += local322;
								}
							}
							if (!Static509.method6875(Static128.anIntArray130, (arg3 >> 12) + 1, arg0, arg4, local309, (arg8 >> 12) - 1)) {
								return false;
							}
							arg4 += Static365.anInt6275;
							arg3 += local258;
							arg8 += local226;
							arg0 += local322;
						}
					} else {
						arg5 -= arg6;
						arg6 -= arg4;
						arg4 *= Static365.anInt6275;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static509.method6875(Static128.anIntArray130, (arg8 >> 12) + 1, arg0, arg4, local309, (arg1 >> 12) - 1)) {
										return false;
									}
									arg1 += local242;
									arg0 += local322;
									arg8 += local226;
									arg4 += Static365.anInt6275;
								}
							}
							if (!Static509.method6875(Static128.anIntArray130, (arg8 >> 12) + 1, arg0, arg4, local309, (arg3 >> 12) - 1)) {
								return false;
							}
							arg0 += local322;
							arg8 += local226;
							arg4 += Static365.anInt6275;
							arg3 += local258;
						}
					}
				} else {
					arg1 = arg8 <<= 0xC;
					if (arg4 < 0) {
						arg1 -= local258 * arg4;
						arg8 -= local226 * arg4;
						arg0 -= local322 * arg4;
						arg4 = 0;
					}
					arg3 <<= 0xC;
					if (arg5 < 0) {
						arg3 -= local242 * arg5;
						arg5 = 0;
					}
					if ((arg4 == arg5 || local258 >= local226) && (arg4 != arg5 || local258 <= local242)) {
						arg6 -= arg5;
						arg5 -= arg4;
						arg4 *= Static365.anInt6275;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static509.method6875(Static128.anIntArray130, (arg1 >> 12) + 1, arg0, arg4, local309, (arg3 >> 12) - 1)) {
										return false;
									}
									arg0 += local322;
									arg1 += local258;
									arg3 += local242;
									arg4 += Static365.anInt6275;
								}
							}
							if (!Static509.method6875(Static128.anIntArray130, (arg1 >> 12) + 1, arg0, arg4, local309, (arg8 >> 12) - 1)) {
								return false;
							}
							arg0 += local322;
							arg1 += local258;
							arg8 += local226;
							arg4 += Static365.anInt6275;
						}
					} else {
						arg6 -= arg5;
						arg5 -= arg4;
						arg4 *= Static365.anInt6275;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static509.method6875(Static128.anIntArray130, (arg3 >> 12) + 1, arg0, arg4, local309, (arg1 >> 12) - 1)) {
										return false;
									}
									arg1 += local258;
									arg4 += Static365.anInt6275;
									arg3 += local242;
									arg0 += local322;
								}
							}
							if (!Static509.method6875(Static128.anIntArray130, (arg8 >> 12) + 1, arg0, arg4, local309, (arg1 >> 12) - 1)) {
								return false;
							}
							arg4 += Static365.anInt6275;
							arg0 += local322;
							arg8 += local226;
							arg1 += local258;
						}
					}
				}
			} else if (arg6 >= arg5) {
				if (Static76.anInt1726 <= arg5) {
					return true;
				}
				arg2 = local309 + (arg2 << 8) - local309 * arg3;
				if (arg6 > Static76.anInt1726) {
					arg6 = Static76.anInt1726;
				}
				if (Static76.anInt1726 < arg4) {
					arg4 = Static76.anInt1726;
				}
				if (arg4 <= arg6) {
					arg1 = arg3 <<= 0xC;
					if (arg5 < 0) {
						arg3 -= arg5 * local242;
						arg2 -= arg5 * local322;
						arg1 -= local226 * arg5;
						arg5 = 0;
					}
					arg8 <<= 0xC;
					if (arg4 < 0) {
						arg8 -= arg4 * local258;
						arg4 = 0;
					}
					if (local226 < local242) {
						arg6 -= arg4;
						arg4 -= arg5;
						arg5 *= Static365.anInt6275;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static509.method6875(Static128.anIntArray130, (arg3 >> 12) + 1, arg2, arg5, local309, (arg8 >> 12) - 1)) {
										return false;
									}
									arg2 += local322;
									arg8 += local258;
									arg3 += local242;
									arg5 += Static365.anInt6275;
								}
							}
							if (!Static509.method6875(Static128.anIntArray130, (arg3 >> 12) + 1, arg2, arg5, local309, (arg1 >> 12) - 1)) {
								return false;
							}
							arg2 += local322;
							arg1 += local226;
							arg3 += local242;
							arg5 += Static365.anInt6275;
						}
					} else {
						arg6 -= arg4;
						arg4 -= arg5;
						arg5 = Static365.anInt6275 * arg5;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static509.method6875(Static128.anIntArray130, (arg8 >> 12) + 1, arg2, arg5, local309, (arg3 >> 12) - 1)) {
										return false;
									}
									arg2 += local322;
									arg8 += local258;
									arg5 += Static365.anInt6275;
									arg3 += local242;
								}
							}
							if (!Static509.method6875(Static128.anIntArray130, (arg1 >> 12) + 1, arg2, arg5, local309, (arg3 >> 12) - 1)) {
								return false;
							}
							arg2 += local322;
							arg5 += Static365.anInt6275;
							arg3 += local242;
							arg1 += local226;
						}
					}
				} else {
					arg8 = arg3 <<= 0xC;
					arg1 <<= 0xC;
					if (arg5 < 0) {
						arg8 -= local226 * arg5;
						arg2 -= local322 * arg5;
						arg3 -= local242 * arg5;
						arg5 = 0;
					}
					if (arg6 < 0) {
						arg1 -= local258 * arg6;
						arg6 = 0;
					}
					if (arg6 != arg5 && local242 > local226 || arg5 == arg6 && local226 > local258) {
						arg4 -= arg6;
						arg6 -= arg5;
						arg5 = Static365.anInt6275 * arg5;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static509.method6875(Static128.anIntArray130, (arg1 >> 12) + 1, arg2, arg5, local309, (arg8 >> 12) - 1)) {
										return false;
									}
									arg2 += local322;
									arg1 += local258;
									arg5 += Static365.anInt6275;
									arg8 += local226;
								}
							}
							if (!Static509.method6875(Static128.anIntArray130, (arg3 >> 12) + 1, arg2, arg5, local309, (arg8 >> 12) - 1)) {
								return false;
							}
							arg2 += local322;
							arg3 += local242;
							arg8 += local226;
							arg5 += Static365.anInt6275;
						}
					} else {
						arg4 -= arg6;
						arg6 -= arg5;
						arg5 *= Static365.anInt6275;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static509.method6875(Static128.anIntArray130, (arg8 >> 12) + 1, arg2, arg5, local309, (arg1 >> 12) - 1)) {
										return false;
									}
									arg8 += local226;
									arg1 += local258;
									arg5 += Static365.anInt6275;
									arg2 += local322;
								}
							}
							if (!Static509.method6875(Static128.anIntArray130, (arg8 >> 12) + 1, arg2, arg5, local309, (arg3 >> 12) - 1)) {
								return false;
							}
							arg3 += local242;
							arg8 += local226;
							arg2 += local322;
							arg5 += Static365.anInt6275;
						}
					}
				}
			} else if (arg6 >= Static76.anInt1726) {
				return true;
			} else {
				arg7 = (arg7 << 8) + local309 - (arg1 * local309);
				if (arg4 > Static76.anInt1726) {
					arg4 = Static76.anInt1726;
				}
				if (Static76.anInt1726 < arg5) {
					arg5 = Static76.anInt1726;
				}
				if (arg4 >= arg5) {
					arg8 = arg1 <<= 0xC;
					arg3 <<= 0xC;
					if (arg6 < 0) {
						arg7 -= local322 * arg6;
						arg8 -= arg6 * local242;
						arg1 -= local258 * arg6;
						arg6 = 0;
					}
					if (arg5 < 0) {
						arg3 -= local226 * arg5;
						arg5 = 0;
					}
					if (local242 >= local258) {
						arg4 -= arg5;
						arg5 -= arg6;
						arg6 = Static365.anInt6275 * arg6;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static509.method6875(Static128.anIntArray130, (arg3 >> 12) + 1, arg7, arg6, local309, (arg1 >> 12) - 1)) {
										return false;
									}
									arg3 += local226;
									arg1 += local258;
									arg7 += local322;
									arg6 += Static365.anInt6275;
								}
							}
							if (!Static509.method6875(Static128.anIntArray130, (arg8 >> 12) + 1, arg7, arg6, local309, (arg1 >> 12) - 1)) {
								return false;
							}
							arg6 += Static365.anInt6275;
							arg8 += local242;
							arg1 += local258;
							arg7 += local322;
						}
					} else {
						arg4 -= arg5;
						arg5 -= arg6;
						arg6 = Static365.anInt6275 * arg6;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static509.method6875(Static128.anIntArray130, (arg1 >> 12) + 1, arg7, arg6, local309, (arg3 >> 12) - 1)) {
										return false;
									}
									arg1 += local258;
									arg7 += local322;
									arg6 += Static365.anInt6275;
									arg3 += local226;
								}
							}
							if (!Static509.method6875(Static128.anIntArray130, (arg1 >> 12) + 1, arg7, arg6, local309, (arg8 >> 12) - 1)) {
								return false;
							}
							arg6 += Static365.anInt6275;
							arg1 += local258;
							arg8 += local242;
							arg7 += local322;
						}
					}
				} else {
					arg3 = arg1 <<= 0xC;
					arg8 <<= 0xC;
					if (arg6 < 0) {
						arg3 -= arg6 * local242;
						arg1 -= arg6 * local258;
						arg7 -= local322 * arg6;
						arg6 = 0;
					}
					if (arg4 < 0) {
						arg8 -= arg4 * local226;
						arg4 = 0;
					}
					if (local242 >= local258) {
						arg5 -= arg4;
						arg4 -= arg6;
						arg6 *= Static365.anInt6275;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static509.method6875(Static128.anIntArray130, (arg3 >> 12) + 1, arg7, arg6, local309, (arg8 >> 12) - 1)) {
										return false;
									}
									arg8 += local226;
									arg6 += Static365.anInt6275;
									arg3 += local242;
									arg7 += local322;
								}
							}
							if (!Static509.method6875(Static128.anIntArray130, (arg3 >> 12) + 1, arg7, arg6, local309, (arg1 >> 12) - 1)) {
								return false;
							}
							arg6 += Static365.anInt6275;
							arg3 += local242;
							arg7 += local322;
							arg1 += local258;
						}
					} else {
						arg5 -= arg4;
						arg4 -= arg6;
						arg6 = Static365.anInt6275 * arg6;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static509.method6875(Static128.anIntArray130, (arg8 >> 12) + 1, arg7, arg6, local309, (arg3 >> 12) - 1)) {
										return false;
									}
									arg8 += local226;
									arg3 += local242;
									arg7 += local322;
									arg6 += Static365.anInt6275;
								}
							}
							if (!Static509.method6875(Static128.anIntArray130, (arg1 >> 12) + 1, arg7, arg6, local309, (arg3 >> 12) - 1)) {
								return false;
							}
							arg3 += local242;
							arg6 += Static365.anInt6275;
							arg7 += local322;
							arg1 += local258;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)I")
	public static int method756(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(33) int local33 = ((arg0 & 0xFF00) * local7 & 0xFF0000 | local7 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(38) int local38 = 255 - local7;
		return local33 + (((arg1 & 0xFF00FF) * local38 & 0xFF00FF00 | local38 * (arg1 & 0xFF00) & 0xFF0000) >>> 8);
	}
}
