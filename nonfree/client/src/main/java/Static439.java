import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
	public static int anInt7993;

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "Lclient!us;")
	public static final Class344 aClass344_92 = new Class344(82, -1);

	@OriginalMember(owner = "client!pn", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[200];

	@OriginalMember(owner = "client!pn", name = "u", descriptor = "Z")
	public static boolean aBoolean678 = false;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)I")
	public static int method6673() {
		if (Static233.aClass108_7 == null) {
			if (!Static433.aBoolean672 && Static300.aClass3_Sub1_Sub4_3 != null) {
				return Static300.aClass3_Sub1_Sub4_3.anInt3478;
			}
			@Pc(23) int local23 = Static501.aClass59_5.method4107();
			@Pc(27) int local27 = Static501.aClass59_5.method4106();
			@Pc(44) int local44;
			@Pc(46) int local46;
			@Pc(63) int local63;
			@Pc(133) Class3_Sub1_Sub4 local133;
			if (Static506.aBoolean755) {
				@Pc(255) Class211 local255;
				if (Static326.anInt6543 < local23 && local23 < Static582.anInt9731 + Static326.anInt6543) {
					local44 = -1;
					for (local46 = 0; local46 < Static462.anInt8390; local46++) {
						if (Static599.aBoolean832) {
							local63 = Static434.anInt7939 + local46 * 16 + 33;
							if (local27 > local63 - 13 && local27 <= local63 + 3) {
								local44 = local46;
							}
						} else {
							local63 = Static434.anInt7939 + local46 * 16 + 31;
							if (local63 - 13 < local27 && local27 <= local63 + 3) {
								local44 = local46;
							}
						}
					}
					if (local44 != -1) {
						local63 = 0;
						local255 = new Class211(Static379.aClass30_9);
						for (@Pc(362) Class3_Sub1_Sub10 local362 = (Class3_Sub1_Sub10) local255.method5583(); local362 != null; local362 = (Class3_Sub1_Sub10) local255.method5584()) {
							if (local63++ == local44) {
								return ((Class3_Sub1_Sub4) local362.aClass30_7.aClass3_Sub1_7.aClass3_Sub1_66).anInt3478;
							}
						}
					}
				} else if (Static198.aClass3_Sub1_Sub10_1 != null && Static285.anInt5876 < local23 && local23 < Static285.anInt5876 + Static468.anInt8459) {
					local44 = -1;
					for (local46 = 0; local46 < Static198.aClass3_Sub1_Sub10_1.anInt5812; local46++) {
						if (Static599.aBoolean832) {
							local63 = Static280.anInt5854 + local46 * 16 + 33;
							if (local63 - 13 < local27 && local27 <= local63 + 3) {
								local44 = local46;
							}
						} else {
							local63 = local46 * 16 + Static280.anInt5854 + 31;
							if (local63 - 13 < local27 && local63 + 3 >= local27) {
								local44 = local46;
							}
						}
					}
					if (local44 != -1) {
						local63 = 0;
						local255 = new Class211(Static198.aClass3_Sub1_Sub10_1.aClass30_7);
						for (local133 = (Class3_Sub1_Sub4) local255.method5583(); local133 != null; local133 = (Class3_Sub1_Sub4) local255.method5584()) {
							if (local63++ == local44) {
								return local133.anInt3478;
							}
						}
					}
				}
			} else if (Static326.anInt6543 < local23 && Static326.anInt6543 + Static582.anInt9731 > local23) {
				local44 = -1;
				for (local46 = 0; local46 < Static443.anInt8026; local46++) {
					if (Static599.aBoolean832) {
						local63 = (Static443.anInt8026 - local46 - 1) * 16 + Static434.anInt7939 + 33;
						if (local27 > local63 - 13 && local27 <= local63 + 3) {
							local44 = local46;
						}
					} else {
						local63 = Static434.anInt7939 + (-local46 + -1 + Static443.anInt8026) * 16 + 31;
						if (local63 - 13 < local27 && local63 + 3 >= local27) {
							local44 = local46;
						}
					}
				}
				if (local44 != -1) {
					local63 = 0;
					@Pc(128) Class271 local128 = new Class271(Static187.aClass276_28);
					for (local133 = (Class3_Sub1_Sub4) local128.method6848(); local133 != null; local133 = (Class3_Sub1_Sub4) local128.method6849()) {
						if (local44 == local63++) {
							return local133.anInt3478;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIBIIIIIII)Z")
	public static boolean method6675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 > 2000 || arg0 > 2000 || arg4 > 2000 || arg7 > 2000 || arg1 > 2000 || arg3 > 2000) {
			return false;
		} else if (arg8 >= -2000 && arg0 >= -2000 && arg4 >= -2000 && arg7 >= -2000 && arg1 >= -2000 && arg3 >= -2000) {
			@Pc(83) int local83;
			if (Static249.anInt5548 == 2) {
				local83 = arg7 + arg8 * Static582.anInt9741;
				if (local83 >= 0 && local83 < Static475.anIntArray532.length && Static475.anIntArray532[local83] > (arg2 << 8) - 38400) {
					return false;
				}
				local83 = arg1 + Static582.anInt9741 * arg0;
				if (local83 >= 0 && local83 < Static475.anIntArray532.length && Static475.anIntArray532[local83] > (arg6 << 8) - 38400) {
					return false;
				}
				local83 = arg4 * Static582.anInt9741 + arg3;
				if (local83 >= 0 && local83 < Static475.anIntArray532.length && Static475.anIntArray532[local83] > (arg5 << 8) - 38400) {
					return false;
				}
			}
			local83 = arg1 - arg7;
			@Pc(178) int local178 = arg0 - arg8;
			@Pc(182) int local182 = arg3 - arg7;
			@Pc(187) int local187 = arg4 - arg8;
			@Pc(192) int local192 = arg6 - arg2;
			if (arg8 < arg0 && arg4 < arg4) {
				arg8--;
				if (arg0 <= arg4) {
					arg4++;
				} else {
					arg0++;
				}
			} else if (arg0 >= arg4) {
				arg4--;
				if (arg0 >= arg8) {
					arg0++;
				} else {
					arg8++;
				}
			} else {
				arg0--;
				if (arg4 >= arg8) {
					arg4++;
				} else {
					arg8++;
				}
			}
			@Pc(246) int local246 = arg5 - arg2;
			@Pc(248) int local248 = 0;
			if (arg8 != arg0) {
				local248 = (arg1 - arg7 << 12) / (arg0 - arg8);
			}
			@Pc(268) int local268 = 0;
			if (arg0 != arg4) {
				local268 = (arg3 - arg1 << 12) / (arg4 - arg0);
			}
			@Pc(285) int local285 = 0;
			if (arg8 != arg4) {
				local285 = (arg7 - arg3 << 12) / (arg8 - arg4);
			}
			@Pc(308) int local308 = local83 * local187 - local182 * local178;
			if (local308 == 0) {
				return false;
			}
			@Pc(325) int local325 = (local187 * local192 - local246 * local178 << 8) / local308;
			@Pc(338) int local338 = (local246 * local83 - local192 * local182 << 8) / local308;
			if (arg8 <= arg0 && arg4 >= arg8) {
				if (arg8 >= Static255.anInt5651) {
					return true;
				}
				arg2 = (arg2 << 8) - (local325 * arg7 - local325);
				if (arg0 > Static255.anInt5651) {
					arg0 = Static255.anInt5651;
				}
				if (arg4 > Static255.anInt5651) {
					arg4 = Static255.anInt5651;
				}
				if (arg4 <= arg0) {
					arg1 = arg7 <<= 0xC;
					if (arg8 < 0) {
						arg1 -= arg8 * local285;
						arg7 -= local248 * arg8;
						arg2 -= local338 * arg8;
						arg8 = 0;
					}
					arg3 <<= 0xC;
					if (arg4 < 0) {
						arg3 -= local268 * arg4;
						arg4 = 0;
					}
					if (arg4 != arg8 && local248 > local285 || arg4 == arg8 && local268 > local248) {
						arg0 -= arg4;
						arg4 -= arg8;
						arg8 = Static582.anInt9741 * arg8;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static395.method6320(arg2, Static475.anIntArray532, (arg7 >> 12) + 1, (arg3 >> 12) - 1, local325, arg8)) {
										return false;
									}
									arg8 += Static582.anInt9741;
									arg3 += local268;
									arg2 += local338;
									arg7 += local248;
								}
							}
							if (!Static395.method6320(arg2, Static475.anIntArray532, (arg7 >> 12) + 1, (arg1 >> 12) + -1, local325, arg8)) {
								return false;
							}
							arg8 += Static582.anInt9741;
							arg7 += local248;
							arg2 += local338;
							arg1 += local285;
						}
					} else {
						arg0 -= arg4;
						arg4 -= arg8;
						arg8 = Static582.anInt9741 * arg8;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static395.method6320(arg2, Static475.anIntArray532, (arg3 >> 12) + 1, (arg7 >> 12) + -1, local325, arg8)) {
										return false;
									}
									arg8 += Static582.anInt9741;
									arg3 += local268;
									arg2 += local338;
									arg7 += local248;
								}
							}
							if (!Static395.method6320(arg2, Static475.anIntArray532, (arg1 >> 12) + 1, (arg7 >> 12) + -1, local325, arg8)) {
								return false;
							}
							arg1 += local285;
							arg2 += local338;
							arg8 += Static582.anInt9741;
							arg7 += local248;
						}
					}
				} else {
					arg3 = arg7 <<= 0xC;
					arg1 <<= 0xC;
					if (arg8 < 0) {
						arg3 -= local285 * arg8;
						arg7 -= local248 * arg8;
						arg2 -= local338 * arg8;
						arg8 = 0;
					}
					if (arg0 < 0) {
						arg1 -= arg0 * local268;
						arg0 = 0;
					}
					if ((arg8 == arg0 || local285 >= local248) && (arg0 != arg8 || local285 <= local268)) {
						arg4 -= arg0;
						arg0 -= arg8;
						arg8 = Static582.anInt9741 * arg8;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static395.method6320(arg2, Static475.anIntArray532, (arg3 >> 12) + 1, (arg1 >> 12) - 1, local325, arg8)) {
										return false;
									}
									arg1 += local268;
									arg3 += local285;
									arg2 += local338;
									arg8 += Static582.anInt9741;
								}
							}
							if (!Static395.method6320(arg2, Static475.anIntArray532, (arg3 >> 12) + 1, (arg7 >> 12) + -1, local325, arg8)) {
								return false;
							}
							arg3 += local285;
							arg8 += Static582.anInt9741;
							arg7 += local248;
							arg2 += local338;
						}
					} else {
						arg4 -= arg0;
						arg0 -= arg8;
						arg8 = Static582.anInt9741 * arg8;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static395.method6320(arg2, Static475.anIntArray532, (arg1 >> 12) + 1, (arg3 >> 12) + -1, local325, arg8)) {
										return false;
									}
									arg2 += local338;
									arg3 += local285;
									arg1 += local268;
									arg8 += Static582.anInt9741;
								}
							}
							if (!Static395.method6320(arg2, Static475.anIntArray532, (arg7 >> 12) + 1, (arg3 >> 12) + -1, local325, arg8)) {
								return false;
							}
							arg8 += Static582.anInt9741;
							arg3 += local285;
							arg2 += local338;
							arg7 += local248;
						}
					}
				}
			} else if (arg0 > arg4) {
				if (arg4 >= Static255.anInt5651) {
					return true;
				}
				if (Static255.anInt5651 < arg8) {
					arg8 = Static255.anInt5651;
				}
				if (arg0 > Static255.anInt5651) {
					arg0 = Static255.anInt5651;
				}
				arg5 = local325 + (arg5 << 8) - local325 * arg3;
				if (arg0 <= arg8) {
					arg7 = arg3 <<= 0xC;
					arg1 <<= 0xC;
					if (arg4 < 0) {
						arg7 -= arg4 * local268;
						arg3 -= local285 * arg4;
						arg5 -= local338 * arg4;
						arg4 = 0;
					}
					if (arg0 < 0) {
						arg1 -= local248 * arg0;
						arg0 = 0;
					}
					if (local285 <= local268) {
						arg8 -= arg0;
						arg0 -= arg4;
						arg4 *= Static582.anInt9741;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static395.method6320(arg5, Static475.anIntArray532, (arg1 >> 12) + 1, (arg3 >> 12) + -1, local325, arg4)) {
										return false;
									}
									arg3 += local285;
									arg1 += local248;
									arg4 += Static582.anInt9741;
									arg5 += local338;
								}
							}
							if (!Static395.method6320(arg5, Static475.anIntArray532, (arg7 >> 12) + 1, (arg3 >> 12) + -1, local325, arg4)) {
								return false;
							}
							arg3 += local285;
							arg5 += local338;
							arg7 += local268;
							arg4 += Static582.anInt9741;
						}
					} else {
						arg8 -= arg0;
						arg0 -= arg4;
						arg4 *= Static582.anInt9741;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static395.method6320(arg5, Static475.anIntArray532, (arg3 >> 12) + 1, (arg1 >> 12) + -1, local325, arg4)) {
										return false;
									}
									arg1 += local248;
									arg4 += Static582.anInt9741;
									arg5 += local338;
									arg3 += local285;
								}
							}
							if (!Static395.method6320(arg5, Static475.anIntArray532, (arg3 >> 12) + 1, (arg7 >> 12) + -1, local325, arg4)) {
								return false;
							}
							arg3 += local285;
							arg4 += Static582.anInt9741;
							arg7 += local268;
							arg5 += local338;
						}
					}
				} else {
					arg1 = arg3 <<= 0xC;
					arg7 <<= 0xC;
					if (arg4 < 0) {
						arg3 -= arg4 * local285;
						arg5 -= arg4 * local338;
						arg1 -= arg4 * local268;
						arg4 = 0;
					}
					if (arg8 < 0) {
						arg7 -= local248 * arg8;
						arg8 = 0;
					}
					if (local268 >= local285) {
						arg0 -= arg8;
						arg8 -= arg4;
						arg4 *= Static582.anInt9741;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static395.method6320(arg5, Static475.anIntArray532, (arg1 >> 12) + 1, (arg7 >> 12) + -1, local325, arg4)) {
										return false;
									}
									arg4 += Static582.anInt9741;
									arg5 += local338;
									arg7 += local248;
									arg1 += local268;
								}
							}
							if (!Static395.method6320(arg5, Static475.anIntArray532, (arg1 >> 12) + 1, (arg3 >> 12) + -1, local325, arg4)) {
								return false;
							}
							arg4 += Static582.anInt9741;
							arg5 += local338;
							arg1 += local268;
							arg3 += local285;
						}
					} else {
						arg0 -= arg8;
						arg8 -= arg4;
						arg4 *= Static582.anInt9741;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static395.method6320(arg5, Static475.anIntArray532, (arg7 >> 12) + 1, (arg1 >> 12) + -1, local325, arg4)) {
										return false;
									}
									arg4 += Static582.anInt9741;
									arg1 += local268;
									arg7 += local248;
									arg5 += local338;
								}
							}
							if (!Static395.method6320(arg5, Static475.anIntArray532, (arg3 >> 12) + 1, (arg1 >> 12) + -1, local325, arg4)) {
								return false;
							}
							arg5 += local338;
							arg1 += local268;
							arg3 += local285;
							arg4 += Static582.anInt9741;
						}
					}
				}
			} else if (arg0 >= Static255.anInt5651) {
				return true;
			} else {
				if (arg8 > Static255.anInt5651) {
					arg8 = Static255.anInt5651;
				}
				arg6 = local325 + (arg6 << 8) - arg1 * local325;
				if (arg4 > Static255.anInt5651) {
					arg4 = Static255.anInt5651;
				}
				if (arg4 < arg8) {
					arg7 = arg1 <<= 0xC;
					arg3 <<= 0xC;
					if (arg0 < 0) {
						arg6 -= local338 * arg0;
						arg7 -= arg0 * local248;
						arg1 -= arg0 * local268;
						arg0 = 0;
					}
					if (arg4 < 0) {
						arg3 -= local285 * arg4;
						arg4 = 0;
					}
					if (arg4 != arg0 && local248 < local268 || arg0 == arg4 && local248 > local285) {
						arg8 -= arg4;
						arg4 -= arg0;
						arg0 = Static582.anInt9741 * arg0;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static395.method6320(arg6, Static475.anIntArray532, (arg3 >> 12) + 1, (arg7 >> 12) + -1, local325, arg0)) {
										return false;
									}
									arg0 += Static582.anInt9741;
									arg7 += local248;
									arg6 += local338;
									arg3 += local285;
								}
							}
							if (!Static395.method6320(arg6, Static475.anIntArray532, (arg1 >> 12) + 1, (arg7 >> 12) - 1, local325, arg0)) {
								return false;
							}
							arg6 += local338;
							arg7 += local248;
							arg1 += local268;
							arg0 += Static582.anInt9741;
						}
					} else {
						arg8 -= arg4;
						arg4 -= arg0;
						arg0 *= Static582.anInt9741;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static395.method6320(arg6, Static475.anIntArray532, (arg7 >> 12) + 1, (arg3 >> 12) - 1, local325, arg0)) {
										return false;
									}
									arg0 += Static582.anInt9741;
									arg7 += local248;
									arg3 += local285;
									arg6 += local338;
								}
							}
							if (!Static395.method6320(arg6, Static475.anIntArray532, (arg7 >> 12) + 1, (arg1 >> 12) + -1, local325, arg0)) {
								return false;
							}
							arg0 += Static582.anInt9741;
							arg6 += local338;
							arg7 += local248;
							arg1 += local268;
						}
					}
				} else {
					arg3 = arg1 <<= 0xC;
					if (arg0 < 0) {
						arg6 -= arg0 * local338;
						arg3 -= arg0 * local248;
						arg1 -= local268 * arg0;
						arg0 = 0;
					}
					arg7 <<= 0xC;
					if (arg8 < 0) {
						arg7 -= local285 * arg8;
						arg8 = 0;
					}
					if (local248 >= local268) {
						arg4 -= arg8;
						arg8 -= arg0;
						arg0 *= Static582.anInt9741;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static395.method6320(arg6, Static475.anIntArray532, (arg7 >> 12) + 1, (arg1 >> 12) + -1, local325, arg0)) {
										return false;
									}
									arg0 += Static582.anInt9741;
									arg6 += local338;
									arg1 += local268;
									arg7 += local285;
								}
							}
							if (!Static395.method6320(arg6, Static475.anIntArray532, (arg3 >> 12) + 1, (arg1 >> 12) - 1, local325, arg0)) {
								return false;
							}
							arg0 += Static582.anInt9741;
							arg1 += local268;
							arg3 += local248;
							arg6 += local338;
						}
					} else {
						arg4 -= arg8;
						arg8 -= arg0;
						arg0 = Static582.anInt9741 * arg0;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static395.method6320(arg6, Static475.anIntArray532, (arg1 >> 12) + 1, (arg7 >> 12) + -1, local325, arg0)) {
										return false;
									}
									arg6 += local338;
									arg7 += local285;
									arg1 += local268;
									arg0 += Static582.anInt9741;
								}
							}
							if (!Static395.method6320(arg6, Static475.anIntArray532, (arg1 >> 12) + 1, (arg3 >> 12) - 1, local325, arg0)) {
								return false;
							}
							arg6 += local338;
							arg3 += local248;
							arg0 += Static582.anInt9741;
							arg1 += local268;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)Lclient!vl;")
	public static Class2_Sub3_Sub5 method6676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static170.aClass106ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass2_Sub3_Sub5_1 == null ? null : local7.aClass2_Sub3_Sub5_1;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZLclient!ha;IIII)V")
	public static void method6677(@OriginalArg(1) Class33 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg0.KA(arg4, arg3, arg4 + arg1, arg3 + arg2);
		arg0.method6209(arg3, arg1, arg2, arg4, -16777216);
		if (Static102.anInt9953 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static361.anInt2226 / (float) Static361.anInt2228;
		@Pc(37) int local37 = arg1;
		@Pc(39) int local39 = arg2;
		if (local35 < 1.0F) {
			local39 = (int) (local35 * (float) arg1);
		} else {
			local37 = (int) ((float) arg2 / local35);
		}
		@Pc(66) int local66 = arg4 + (arg1 - local37) / 2;
		@Pc(75) int local75 = arg3 + (arg2 - local39) / 2;
		if (Static196.aClass5_25 == null || arg1 != Static196.aClass5_25.method7588() || Static196.aClass5_25.method7580() != arg2) {
			Static361.method2159(Static361.anInt2229, Static361.anInt2230 + Static361.anInt2226, Static361.anInt2229 + Static361.anInt2228, Static361.anInt2230, local66, local75, local37 + local66, local39 + local75);
			Static361.method2172(arg0);
			Static196.aClass5_25 = arg0.method6153(local66, local75, local37, local39, false);
		}
		Static196.aClass5_25.method7577(local66, local75);
		@Pc(131) int local131 = local37 * Static41.anInt760 / Static361.anInt2228;
		@Pc(137) int local137 = local39 * Static46.anInt1027 / Static361.anInt2226;
		@Pc(145) int local145 = Static365.anInt7017 * local37 / Static361.anInt2228 + local66;
		@Pc(159) int local159 = local75 + local39 - local137 - local39 * Static193.anInt4494 / Static361.anInt2226;
		@Pc(161) int local161 = -1996554240;
		if (Static518.aClass62_15 == Static648.aClass62_16) {
			local161 = -1996488705;
		}
		arg0.aa(local145, local159, local131, local137, local161, 1);
		arg0.method6174(local145, local159, local131, local137, local161, 0);
		if (Static473.anInt8493 <= 0) {
			return;
		}
		@Pc(195) int local195;
		if (Static479.anInt8544 > 50) {
			local195 = 500 - Static479.anInt8544 * 5;
		} else {
			local195 = Static479.anInt8544 * 5;
		}
		for (@Pc(206) Class3_Sub22 local206 = (Class3_Sub22) Static361.aClass276_14.method6907(); local206 != null; local206 = (Class3_Sub22) Static361.aClass276_14.method6912()) {
			@Pc(214) Class269 local214 = Static361.aClass115_3.method3752(local206.anInt4123);
			if (Static83.method5847(local214)) {
				@Pc(247) int local247;
				@Pc(259) int local259;
				if (local206.anInt4123 == Static128.anInt3197) {
					local247 = local206.anInt4124 * local37 / Static361.anInt2228 + local66;
					local259 = local75 + (Static361.anInt2226 - local206.anInt4117) * local39 / Static361.anInt2226;
					arg0.method6209(local259 - 2, 4, 4, local247 - 2, local195 << 24 | 0xFFFF00);
				} else if (Static134.anInt3480 != -1 && local214.anInt8161 == Static134.anInt3480) {
					local247 = local66 + local206.anInt4124 * local37 / Static361.anInt2228;
					local259 = local39 * (Static361.anInt2226 - local206.anInt4117) / Static361.anInt2226 + local75;
					arg0.method6209(local259 - 2, 4, 4, local247 - 2, local195 << 24 | 0xFFFF00);
				}
			}
		}
	}
}
