import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
	public static int anInt6551;

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
	public static int anInt6555;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_57 = new Class208(68, 3);

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "[I")
	public static final int[] anIntArray409 = new int[4096];

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBIIIIIIII)Z")
	public static boolean method5625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 > 2000 || arg1 > 2000 || arg6 > 2000 || arg2 > 2000 || arg0 > 2000 || arg5 > 2000) {
			return false;
		} else if (arg4 >= -2000 && arg1 >= -2000 && arg6 >= -2000 && arg2 >= -2000 && arg0 >= -2000 && arg5 >= -2000) {
			if (Static600.anInt10018 == 2) {
				@Pc(70) int local70 = Static497.anInt8615 * arg4 + arg2;
				if (local70 >= 0 && Static284.anIntArray483.length > local70 && Static284.anIntArray483[local70] > (arg3 << 8) - 38400) {
					return false;
				}
				local70 = Static497.anInt8615 * arg1 + arg0;
				if (local70 >= 0 && local70 < Static284.anIntArray483.length && (arg7 << 8) - 38400 < Static284.anIntArray483[local70]) {
					return false;
				}
				local70 = arg6 * Static497.anInt8615 + arg5;
				if (local70 >= 0 && local70 < Static284.anIntArray483.length && (arg8 << 8) - 38400 < Static284.anIntArray483[local70]) {
					return false;
				}
			}
			@Pc(162) int local162 = arg0 - arg2;
			@Pc(167) int local167 = arg1 - arg4;
			@Pc(171) int local171 = arg5 - arg2;
			@Pc(176) int local176 = arg6 - arg4;
			@Pc(181) int local181 = arg7 - arg3;
			@Pc(186) int local186 = arg8 - arg3;
			if (arg4 < arg1 && arg6 < arg6) {
				arg4--;
				if (arg6 >= arg1) {
					arg6++;
				} else {
					arg1++;
				}
			} else if (arg6 > arg1) {
				arg1--;
				if (arg6 >= arg4) {
					arg6++;
				} else {
					arg4++;
				}
			} else {
				if (arg4 <= arg1) {
					arg1++;
				} else {
					arg4++;
				}
				arg6--;
			}
			@Pc(229) int local229 = 0;
			if (arg1 != arg4) {
				local229 = (arg0 - arg2 << 12) / (arg1 - arg4);
			}
			@Pc(246) int local246 = 0;
			if (arg1 != arg6) {
				local246 = (arg5 - arg0 << 12) / (arg6 - arg1);
			}
			@Pc(265) int local265 = 0;
			if (arg4 != arg6) {
				local265 = (arg2 - arg5 << 12) / (arg4 - arg6);
			}
			@Pc(293) int local293 = local162 * local176 - local167 * local171;
			if (local293 == 0) {
				return false;
			}
			@Pc(313) int local313 = (local181 * local176 - local167 * local186 << 8) / local293;
			@Pc(326) int local326 = (local162 * local186 - local181 * local171 << 8) / local293;
			if (arg1 >= arg4 && arg6 >= arg4) {
				if (Static441.anInt7959 <= arg4) {
					return true;
				}
				if (Static441.anInt7959 < arg6) {
					arg6 = Static441.anInt7959;
				}
				arg3 = (arg3 << 8) - (arg2 * local313 - local313);
				if (Static441.anInt7959 < arg1) {
					arg1 = Static441.anInt7959;
				}
				if (arg6 <= arg1) {
					arg0 = arg2 <<= 0xC;
					arg5 <<= 0xC;
					if (arg4 < 0) {
						arg2 -= arg4 * local229;
						arg3 -= arg4 * local326;
						arg0 -= arg4 * local265;
						arg4 = 0;
					}
					if (arg6 < 0) {
						arg5 -= local246 * arg6;
						arg6 = 0;
					}
					if ((arg4 == arg6 || local229 <= local265) && (arg4 != arg6 || local246 <= local229)) {
						arg1 -= arg6;
						arg6 -= arg4;
						arg4 *= Static497.anInt8615;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static373.method5886((arg2 >> 12) - 1, arg4, Static284.anIntArray483, arg3, local313, (arg5 >> 12) + 1)) {
										return false;
									}
									arg5 += local246;
									arg3 += local326;
									arg2 += local229;
									arg4 += Static497.anInt8615;
								}
							}
							if (!Static373.method5886((arg2 >> 12) - 1, arg4, Static284.anIntArray483, arg3, local313, (arg0 >> 12) + 1)) {
								return false;
							}
							arg4 += Static497.anInt8615;
							arg2 += local229;
							arg3 += local326;
							arg0 += local265;
						}
					} else {
						arg1 -= arg6;
						arg6 -= arg4;
						arg4 = Static497.anInt8615 * arg4;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static373.method5886((arg5 >> 12) - 1, arg4, Static284.anIntArray483, arg3, local313, (arg2 >> 12) + 1)) {
										return false;
									}
									arg5 += local246;
									arg2 += local229;
									arg3 += local326;
									arg4 += Static497.anInt8615;
								}
							}
							if (!Static373.method5886((arg0 >> 12) - 1, arg4, Static284.anIntArray483, arg3, local313, (arg2 >> 12) + 1)) {
								return false;
							}
							arg3 += local326;
							arg0 += local265;
							arg4 += Static497.anInt8615;
							arg2 += local229;
						}
					}
				} else {
					arg5 = arg2 <<= 0xC;
					if (arg4 < 0) {
						arg2 -= local229 * arg4;
						arg3 -= local326 * arg4;
						arg5 -= local265 * arg4;
						arg4 = 0;
					}
					arg0 <<= 0xC;
					if (arg1 < 0) {
						arg0 -= local246 * arg1;
						arg1 = 0;
					}
					if ((arg1 == arg4 || local229 <= local265) && (arg4 != arg1 || local246 >= local265)) {
						arg6 -= arg1;
						arg1 -= arg4;
						arg4 = Static497.anInt8615 * arg4;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static373.method5886((arg0 >> 12) - 1, arg4, Static284.anIntArray483, arg3, local313, (arg5 >> 12) + 1)) {
										return false;
									}
									arg0 += local246;
									arg3 += local326;
									arg5 += local265;
									arg4 += Static497.anInt8615;
								}
							}
							if (!Static373.method5886((arg2 >> 12) - 1, arg4, Static284.anIntArray483, arg3, local313, (arg5 >> 12) + 1)) {
								return false;
							}
							arg4 += Static497.anInt8615;
							arg2 += local229;
							arg5 += local265;
							arg3 += local326;
						}
					} else {
						arg6 -= arg1;
						arg1 -= arg4;
						arg4 *= Static497.anInt8615;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static373.method5886((arg5 >> 12) - 1, arg4, Static284.anIntArray483, arg3, local313, (arg0 >> 12) + 1)) {
										return false;
									}
									arg3 += local326;
									arg4 += Static497.anInt8615;
									arg0 += local246;
									arg5 += local265;
								}
							}
							if (!Static373.method5886((arg5 >> 12) - 1, arg4, Static284.anIntArray483, arg3, local313, (arg2 >> 12) + 1)) {
								return false;
							}
							arg2 += local229;
							arg3 += local326;
							arg4 += Static497.anInt8615;
							arg5 += local265;
						}
					}
				}
			} else if (arg6 < arg1) {
				if (Static441.anInt7959 <= arg6) {
					return true;
				}
				if (arg4 > Static441.anInt7959) {
					arg4 = Static441.anInt7959;
				}
				arg8 = (arg8 << 8) - (local313 * arg5 - local313);
				if (Static441.anInt7959 < arg1) {
					arg1 = Static441.anInt7959;
				}
				if (arg1 <= arg4) {
					arg2 = arg5 <<= 0xC;
					if (arg6 < 0) {
						arg2 -= arg6 * local246;
						arg5 -= local265 * arg6;
						arg8 -= local326 * arg6;
						arg6 = 0;
					}
					arg0 <<= 0xC;
					if (arg1 < 0) {
						arg0 -= arg1 * local229;
						arg1 = 0;
					}
					if (local265 <= local246) {
						arg4 -= arg1;
						arg1 -= arg6;
						arg6 = Static497.anInt8615 * arg6;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static373.method5886((arg5 >> 12) - 1, arg6, Static284.anIntArray483, arg8, local313, (arg0 >> 12) + 1)) {
										return false;
									}
									arg8 += local326;
									arg5 += local265;
									arg0 += local229;
									arg6 += Static497.anInt8615;
								}
							}
							if (!Static373.method5886((arg5 >> 12) - 1, arg6, Static284.anIntArray483, arg8, local313, (arg2 >> 12) + 1)) {
								return false;
							}
							arg8 += local326;
							arg6 += Static497.anInt8615;
							arg5 += local265;
							arg2 += local246;
						}
					} else {
						arg4 -= arg1;
						arg1 -= arg6;
						arg6 = Static497.anInt8615 * arg6;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static373.method5886((arg0 >> 12) - 1, arg6, Static284.anIntArray483, arg8, local313, (arg5 >> 12) + 1)) {
										return false;
									}
									arg8 += local326;
									arg6 += Static497.anInt8615;
									arg5 += local265;
									arg0 += local229;
								}
							}
							if (!Static373.method5886((arg2 >> 12) - 1, arg6, Static284.anIntArray483, arg8, local313, (arg5 >> 12) + 1)) {
								return false;
							}
							arg8 += local326;
							arg5 += local265;
							arg2 += local246;
							arg6 += Static497.anInt8615;
						}
					}
				} else {
					arg0 = arg5 <<= 0xC;
					if (arg6 < 0) {
						arg8 -= arg6 * local326;
						arg5 -= local265 * arg6;
						arg0 -= local246 * arg6;
						arg6 = 0;
					}
					arg2 <<= 0xC;
					if (arg4 < 0) {
						arg2 -= arg4 * local229;
						arg4 = 0;
					}
					if (local265 <= local246) {
						arg1 -= arg4;
						arg4 -= arg6;
						arg6 = Static497.anInt8615 * arg6;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static373.method5886((arg2 >> 12) - 1, arg6, Static284.anIntArray483, arg8, local313, (arg0 >> 12) + 1)) {
										return false;
									}
									arg6 += Static497.anInt8615;
									arg0 += local246;
									arg8 += local326;
									arg2 += local229;
								}
							}
							if (!Static373.method5886((arg5 >> 12) - 1, arg6, Static284.anIntArray483, arg8, local313, (arg0 >> 12) + 1)) {
								return false;
							}
							arg5 += local265;
							arg6 += Static497.anInt8615;
							arg8 += local326;
							arg0 += local246;
						}
					} else {
						arg1 -= arg4;
						arg4 -= arg6;
						arg6 = Static497.anInt8615 * arg6;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static373.method5886((arg0 >> 12) - 1, arg6, Static284.anIntArray483, arg8, local313, (arg2 >> 12) + 1)) {
										return false;
									}
									arg8 += local326;
									arg2 += local229;
									arg6 += Static497.anInt8615;
									arg0 += local246;
								}
							}
							if (!Static373.method5886((arg0 >> 12) - 1, arg6, Static284.anIntArray483, arg8, local313, (arg5 >> 12) + 1)) {
								return false;
							}
							arg0 += local246;
							arg8 += local326;
							arg6 += Static497.anInt8615;
							arg5 += local265;
						}
					}
				}
			} else if (Static441.anInt7959 <= arg1) {
				return true;
			} else {
				if (arg4 > Static441.anInt7959) {
					arg4 = Static441.anInt7959;
				}
				arg7 = (arg7 << 8) + local313 - arg0 * local313;
				if (Static441.anInt7959 < arg6) {
					arg6 = Static441.anInt7959;
				}
				if (arg6 >= arg4) {
					arg5 = arg0 <<= 0xC;
					arg2 <<= 0xC;
					if (arg1 < 0) {
						arg0 -= arg1 * local246;
						arg5 -= local229 * arg1;
						arg7 -= local326 * arg1;
						arg1 = 0;
					}
					if (arg4 < 0) {
						arg2 -= arg4 * local265;
						arg4 = 0;
					}
					if (local229 < local246) {
						arg6 -= arg4;
						arg4 -= arg1;
						arg1 *= Static497.anInt8615;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static373.method5886((arg2 >> 12) - 1, arg1, Static284.anIntArray483, arg7, local313, (arg0 >> 12) + 1)) {
										return false;
									}
									arg2 += local265;
									arg7 += local326;
									arg0 += local246;
									arg1 += Static497.anInt8615;
								}
							}
							if (!Static373.method5886((arg5 >> 12) - 1, arg1, Static284.anIntArray483, arg7, local313, (arg0 >> 12) + 1)) {
								return false;
							}
							arg5 += local229;
							arg0 += local246;
							arg1 += Static497.anInt8615;
							arg7 += local326;
						}
					} else {
						arg6 -= arg4;
						arg4 -= arg1;
						arg1 = Static497.anInt8615 * arg1;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static373.method5886((arg0 >> 12) - 1, arg1, Static284.anIntArray483, arg7, local313, (arg2 >> 12) + 1)) {
										return false;
									}
									arg2 += local265;
									arg1 += Static497.anInt8615;
									arg7 += local326;
									arg0 += local246;
								}
							}
							if (!Static373.method5886((arg0 >> 12) - 1, arg1, Static284.anIntArray483, arg7, local313, (arg5 >> 12) + 1)) {
								return false;
							}
							arg0 += local246;
							arg7 += local326;
							arg5 += local229;
							arg1 += Static497.anInt8615;
						}
					}
				} else {
					arg2 = arg0 <<= 0xC;
					if (arg1 < 0) {
						arg2 -= local229 * arg1;
						arg0 -= local246 * arg1;
						arg7 -= arg1 * local326;
						arg1 = 0;
					}
					arg5 <<= 0xC;
					if (arg6 < 0) {
						arg5 -= local265 * arg6;
						arg6 = 0;
					}
					if (arg1 != arg6 && local229 < local246 || arg6 == arg1 && local265 < local229) {
						arg4 -= arg6;
						arg6 -= arg1;
						arg1 = Static497.anInt8615 * arg1;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static373.method5886((arg2 >> 12) - 1, arg1, Static284.anIntArray483, arg7, local313, (arg5 >> 12) + 1)) {
										return false;
									}
									arg2 += local229;
									arg7 += local326;
									arg5 += local265;
									arg1 += Static497.anInt8615;
								}
							}
							if (!Static373.method5886((arg2 >> 12) - 1, arg1, Static284.anIntArray483, arg7, local313, (arg0 >> 12) + 1)) {
								return false;
							}
							arg0 += local246;
							arg1 += Static497.anInt8615;
							arg7 += local326;
							arg2 += local229;
						}
					} else {
						arg4 -= arg6;
						arg6 -= arg1;
						arg1 = Static497.anInt8615 * arg1;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static373.method5886((arg5 >> 12) - 1, arg1, Static284.anIntArray483, arg7, local313, (arg2 >> 12) + 1)) {
										return false;
									}
									arg5 += local265;
									arg7 += local326;
									arg2 += local229;
									arg1 += Static497.anInt8615;
								}
							}
							if (!Static373.method5886((arg0 >> 12) - 1, arg1, Static284.anIntArray483, arg7, local313, (arg2 >> 12) + 1)) {
								return false;
							}
							arg1 += Static497.anInt8615;
							arg0 += local246;
							arg2 += local229;
							arg7 += local326;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIF[F[FIIIIF)V")
	public static void method5627(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) float[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10) {
		@Pc(20) int local20 = arg0 - arg1;
		@Pc(24) int local24 = arg7 - arg6;
		@Pc(28) int local28 = arg8 - arg9;
		@Pc(53) float local53 = arg4[1] * (float) local20 + arg4[0] * (float) local28 + (float) local24 * arg4[2];
		@Pc(74) float local74 = arg4[3] * (float) local28 + (float) local20 * arg4[4] + (float) local24 * arg4[5];
		@Pc(95) float local95 = (float) local20 * arg4[7] + (float) local28 * arg4[6] + arg4[8] * (float) local24;
		@Pc(106) float local106 = (float) Math.atan2((double) local53, (double) local95) / 6.2831855F + 0.5F;
		if (arg3 != 1.0F) {
			local106 *= arg3;
		}
		@Pc(120) float local120 = arg10 + local74 + 0.5F;
		@Pc(137) float local137;
		if (arg2 == 1) {
			local137 = local106;
			local106 = -local120;
			local120 = local137;
		} else if (arg2 == 2) {
			local120 = -local120;
			local106 = -local106;
		} else if (arg2 == 3) {
			local137 = local106;
			local106 = local120;
			local120 = -local137;
		}
		arg5[1] = local120;
		arg5[0] = local106;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)Z")
	public static boolean method5628(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
