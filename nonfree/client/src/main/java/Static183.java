import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!gt", name = "H", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!gt", name = "K", descriptor = "[[Lclient!ps;")
	public static Class273[][] aClass273ArrayArray1;

	@OriginalMember(owner = "client!gt", name = "k", descriptor = "Z")
	public static boolean aBoolean193 = false;

	@OriginalMember(owner = "client!gt", name = "w", descriptor = "I")
	public static int anInt2722 = -1;

	@OriginalMember(owner = "client!gt", name = "y", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_47 = new Class349(72, -1);

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(IIIII)V")
	public static void method2345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static581.anInt9423 == 1) {
			Static285.aClass38Array9[Static206.anInt3015 / 100].method7463(Static435.anInt6992 - 8, Static323.anInt5430 + -8);
		}
		if (Static581.anInt9423 == 2) {
			Static285.aClass38Array9[Static206.anInt3015 / 100 + 4].method7463(Static435.anInt6992 - 8, Static323.anInt5430 + -8);
		}
		Static385.method5331();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(FFFB)F")
	public static float method2349(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return (arg1 - arg2) * arg0 + arg2;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZI)Z")
	public static boolean method2351(@OriginalArg(0) boolean arg0) {
		@Pc(11) boolean local11 = Static417.aClass162_17.method6880();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static417.aClass162_17.method6840();
		} else if (!Static417.aClass162_17.method6838()) {
			arg0 = false;
		}
		if (arg0 == local11) {
			return false;
		} else {
			Static257.aClass2_Sub35_Sub1_1.aBoolean628 = arg0;
			Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
			return true;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method2352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 > 2000 || arg0 > 2000 || arg2 > 2000 || arg5 > 2000 || arg8 > 2000 || arg7 > 2000) {
			return false;
		} else if (arg4 >= -2000 && arg0 >= -2000 && arg2 >= -2000 && arg5 >= -2000 && arg8 >= -2000 && arg7 >= -2000) {
			@Pc(76) int local76;
			if (Static487.anInt7739 == 2) {
				local76 = arg5 + Static457.anInt7352 * arg4;
				if (local76 >= 0 && local76 < Static390.anIntArray412.length && Static390.anIntArray412[local76] > (arg6 << 8) - 38400) {
					return false;
				}
				local76 = arg0 * Static457.anInt7352 + arg8;
				if (local76 >= 0 && local76 < Static390.anIntArray412.length && Static390.anIntArray412[local76] > (arg1 << 8) - 38400) {
					return false;
				}
				local76 = arg2 * Static457.anInt7352 + arg7;
				if (local76 >= 0 && local76 < Static390.anIntArray412.length && (arg3 << 8) - 38400 < Static390.anIntArray412[local76]) {
					return false;
				}
			}
			local76 = arg8 - arg5;
			@Pc(164) int local164 = arg0 - arg4;
			@Pc(169) int local169 = arg7 - arg5;
			@Pc(174) int local174 = arg2 - arg4;
			@Pc(179) int local179 = arg1 - arg6;
			if (arg4 < arg0 && arg2 < arg2) {
				if (arg2 < arg0) {
					arg0++;
				} else {
					arg2++;
				}
				arg4--;
			} else if (arg2 <= arg0) {
				if (arg0 < arg4) {
					arg4++;
				} else {
					arg0++;
				}
				arg2--;
			} else {
				if (arg2 >= arg4) {
					arg2++;
				} else {
					arg4++;
				}
				arg0--;
			}
			@Pc(229) int local229 = arg3 - arg6;
			@Pc(231) int local231 = 0;
			if (arg4 != arg0) {
				local231 = (arg8 - arg5 << 12) / (arg0 - arg4);
			}
			@Pc(251) int local251 = 0;
			if (arg0 != arg2) {
				local251 = (arg7 - arg8 << 12) / (arg2 - arg0);
			}
			@Pc(272) int local272 = 0;
			if (arg4 != arg2) {
				local272 = (arg5 - arg7 << 12) / (arg4 - arg2);
			}
			@Pc(294) int local294 = local76 * local174 - local164 * local169;
			if (local294 == 0) {
				return false;
			}
			@Pc(314) int local314 = (local174 * local179 - local164 * local229 << 8) / local294;
			@Pc(327) int local327 = (local229 * local76 - local169 * local179 << 8) / local294;
			if (arg0 >= arg4 && arg2 >= arg4) {
				if (arg4 >= Static197.anInt2876) {
					return true;
				}
				if (arg0 > Static197.anInt2876) {
					arg0 = Static197.anInt2876;
				}
				if (Static197.anInt2876 < arg2) {
					arg2 = Static197.anInt2876;
				}
				arg6 = local314 + (arg6 << 8) - arg5 * local314;
				if (arg0 >= arg2) {
					arg8 = arg5 <<= 0xC;
					if (arg4 < 0) {
						arg6 -= arg4 * local327;
						arg5 -= arg4 * local231;
						arg8 -= arg4 * local272;
						arg4 = 0;
					}
					arg7 <<= 0xC;
					if (arg2 < 0) {
						arg7 -= arg2 * local251;
						arg2 = 0;
					}
					if ((arg2 == arg4 || local272 >= local231) && (arg2 != arg4 || local251 <= local231)) {
						arg0 -= arg2;
						arg2 -= arg4;
						arg4 *= Static457.anInt7352;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static570.method7434((arg7 >> 12) + 1, (arg5 >> 12) - 1, Static390.anIntArray412, arg4, local314, arg6)) {
										return false;
									}
									arg5 += local231;
									arg4 += Static457.anInt7352;
									arg7 += local251;
									arg6 += local327;
								}
							}
							if (!Static570.method7434((arg8 >> 12) + 1, (arg5 >> 12) + -1, Static390.anIntArray412, arg4, local314, arg6)) {
								return false;
							}
							arg4 += Static457.anInt7352;
							arg6 += local327;
							arg8 += local272;
							arg5 += local231;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg4;
						arg4 *= Static457.anInt7352;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static570.method7434((arg5 >> 12) + 1, (arg7 >> 12) - 1, Static390.anIntArray412, arg4, local314, arg6)) {
										return false;
									}
									arg7 += local251;
									arg4 += Static457.anInt7352;
									arg5 += local231;
									arg6 += local327;
								}
							}
							if (!Static570.method7434((arg5 >> 12) + 1, (arg8 >> 12) + -1, Static390.anIntArray412, arg4, local314, arg6)) {
								return false;
							}
							arg4 += Static457.anInt7352;
							arg8 += local272;
							arg6 += local327;
							arg5 += local231;
						}
					}
				} else {
					arg7 = arg5 <<= 0xC;
					if (arg4 < 0) {
						arg6 -= arg4 * local327;
						arg7 -= local272 * arg4;
						arg5 -= local231 * arg4;
						arg4 = 0;
					}
					arg8 <<= 0xC;
					if (arg0 < 0) {
						arg8 -= local251 * arg0;
						arg0 = 0;
					}
					if (arg4 != arg0 && local272 < local231 || arg0 == arg4 && local251 < local272) {
						arg2 -= arg0;
						arg0 -= arg4;
						arg4 *= Static457.anInt7352;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static570.method7434((arg8 >> 12) + 1, (arg7 >> 12) - 1, Static390.anIntArray412, arg4, local314, arg6)) {
										return false;
									}
									arg8 += local251;
									arg4 += Static457.anInt7352;
									arg6 += local327;
									arg7 += local272;
								}
							}
							if (!Static570.method7434((arg5 >> 12) + 1, (arg7 >> 12) + -1, Static390.anIntArray412, arg4, local314, arg6)) {
								return false;
							}
							arg7 += local272;
							arg4 += Static457.anInt7352;
							arg6 += local327;
							arg5 += local231;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg4;
						arg4 *= Static457.anInt7352;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static570.method7434((arg7 >> 12) + 1, (arg8 >> 12) - 1, Static390.anIntArray412, arg4, local314, arg6)) {
										return false;
									}
									arg8 += local251;
									arg7 += local272;
									arg4 += Static457.anInt7352;
									arg6 += local327;
								}
							}
							if (!Static570.method7434((arg7 >> 12) + 1, (arg5 >> 12) - 1, Static390.anIntArray412, arg4, local314, arg6)) {
								return false;
							}
							arg6 += local327;
							arg5 += local231;
							arg7 += local272;
							arg4 += Static457.anInt7352;
						}
					}
				}
			} else if (arg0 <= arg2) {
				if (Static197.anInt2876 <= arg0) {
					return true;
				}
				if (arg4 > Static197.anInt2876) {
					arg4 = Static197.anInt2876;
				}
				if (Static197.anInt2876 < arg2) {
					arg2 = Static197.anInt2876;
				}
				arg1 = local314 + (arg1 << 8) - arg8 * local314;
				if (arg4 > arg2) {
					arg5 = arg8 <<= 0xC;
					arg7 <<= 0xC;
					if (arg0 < 0) {
						arg5 -= local231 * arg0;
						arg1 -= arg0 * local327;
						arg8 -= local251 * arg0;
						arg0 = 0;
					}
					if (arg2 < 0) {
						arg7 -= local272 * arg2;
						arg2 = 0;
					}
					if ((arg0 == arg2 || local231 >= local251) && (arg2 != arg0 || local272 >= local231)) {
						arg4 -= arg2;
						arg2 -= arg0;
						arg0 = Static457.anInt7352 * arg0;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static570.method7434((arg5 >> 12) + 1, (arg7 >> 12) + -1, Static390.anIntArray412, arg0, local314, arg1)) {
										return false;
									}
									arg0 += Static457.anInt7352;
									arg1 += local327;
									arg5 += local231;
									arg7 += local272;
								}
							}
							if (!Static570.method7434((arg5 >> 12) + 1, (arg8 >> 12) + -1, Static390.anIntArray412, arg0, local314, arg1)) {
								return false;
							}
							arg1 += local327;
							arg8 += local251;
							arg5 += local231;
							arg0 += Static457.anInt7352;
						}
					} else {
						arg4 -= arg2;
						arg2 -= arg0;
						arg0 = Static457.anInt7352 * arg0;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static570.method7434((arg7 >> 12) + 1, (arg5 >> 12) + -1, Static390.anIntArray412, arg0, local314, arg1)) {
										return false;
									}
									arg0 += Static457.anInt7352;
									arg7 += local272;
									arg5 += local231;
									arg1 += local327;
								}
							}
							if (!Static570.method7434((arg8 >> 12) + 1, (arg5 >> 12) + -1, Static390.anIntArray412, arg0, local314, arg1)) {
								return false;
							}
							arg1 += local327;
							arg8 += local251;
							arg5 += local231;
							arg0 += Static457.anInt7352;
						}
					}
				} else {
					arg7 = arg8 <<= 0xC;
					if (arg0 < 0) {
						arg7 -= arg0 * local231;
						arg1 -= arg0 * local327;
						arg8 -= arg0 * local251;
						arg0 = 0;
					}
					arg5 <<= 0xC;
					if (arg4 < 0) {
						arg5 -= arg4 * local272;
						arg4 = 0;
					}
					if (local231 < local251) {
						arg2 -= arg4;
						arg4 -= arg0;
						arg0 = Static457.anInt7352 * arg0;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static570.method7434((arg8 >> 12) + 1, (arg5 >> 12) + -1, Static390.anIntArray412, arg0, local314, arg1)) {
										return false;
									}
									arg1 += local327;
									arg8 += local251;
									arg0 += Static457.anInt7352;
									arg5 += local272;
								}
							}
							if (!Static570.method7434((arg8 >> 12) + 1, (arg7 >> 12) + -1, Static390.anIntArray412, arg0, local314, arg1)) {
								return false;
							}
							arg0 += Static457.anInt7352;
							arg8 += local251;
							arg7 += local231;
							arg1 += local327;
						}
					} else {
						arg2 -= arg4;
						arg4 -= arg0;
						arg0 = Static457.anInt7352 * arg0;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static570.method7434((arg5 >> 12) + 1, (arg8 >> 12) + -1, Static390.anIntArray412, arg0, local314, arg1)) {
										return false;
									}
									arg5 += local272;
									arg0 += Static457.anInt7352;
									arg1 += local327;
									arg8 += local251;
								}
							}
							if (!Static570.method7434((arg7 >> 12) + 1, (arg8 >> 12) - 1, Static390.anIntArray412, arg0, local314, arg1)) {
								return false;
							}
							arg0 += Static457.anInt7352;
							arg7 += local231;
							arg8 += local251;
							arg1 += local327;
						}
					}
				}
			} else if (arg2 >= Static197.anInt2876) {
				return true;
			} else {
				if (Static197.anInt2876 < arg0) {
					arg0 = Static197.anInt2876;
				}
				arg3 = local314 + (arg3 << 8) - local314 * arg7;
				if (arg4 > Static197.anInt2876) {
					arg4 = Static197.anInt2876;
				}
				if (arg0 <= arg4) {
					arg5 = arg7 <<= 0xC;
					arg8 <<= 0xC;
					if (arg2 < 0) {
						arg5 -= local251 * arg2;
						arg3 -= local327 * arg2;
						arg7 -= arg2 * local272;
						arg2 = 0;
					}
					if (arg0 < 0) {
						arg8 -= arg0 * local231;
						arg0 = 0;
					}
					if (local272 <= local251) {
						arg4 -= arg0;
						arg0 -= arg2;
						arg2 *= Static457.anInt7352;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static570.method7434((arg8 >> 12) + 1, (arg7 >> 12) + -1, Static390.anIntArray412, arg2, local314, arg3)) {
										return false;
									}
									arg7 += local272;
									arg3 += local327;
									arg2 += Static457.anInt7352;
									arg8 += local231;
								}
							}
							if (!Static570.method7434((arg5 >> 12) + 1, (arg7 >> 12) - 1, Static390.anIntArray412, arg2, local314, arg3)) {
								return false;
							}
							arg2 += Static457.anInt7352;
							arg5 += local251;
							arg7 += local272;
							arg3 += local327;
						}
					} else {
						arg4 -= arg0;
						arg0 -= arg2;
						arg2 = Static457.anInt7352 * arg2;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static570.method7434((arg7 >> 12) + 1, (arg8 >> 12) + -1, Static390.anIntArray412, arg2, local314, arg3)) {
										return false;
									}
									arg3 += local327;
									arg7 += local272;
									arg8 += local231;
									arg2 += Static457.anInt7352;
								}
							}
							if (!Static570.method7434((arg7 >> 12) + 1, (arg5 >> 12) + -1, Static390.anIntArray412, arg2, local314, arg3)) {
								return false;
							}
							arg7 += local272;
							arg3 += local327;
							arg5 += local251;
							arg2 += Static457.anInt7352;
						}
					}
				} else {
					arg8 = arg7 <<= 0xC;
					if (arg2 < 0) {
						arg7 -= arg2 * local272;
						arg3 -= local327 * arg2;
						arg8 -= arg2 * local251;
						arg2 = 0;
					}
					arg5 <<= 0xC;
					if (arg4 < 0) {
						arg5 -= arg4 * local231;
						arg4 = 0;
					}
					if (local272 > local251) {
						arg0 -= arg4;
						arg4 -= arg2;
						arg2 *= Static457.anInt7352;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static570.method7434((arg5 >> 12) + 1, (arg8 >> 12) + -1, Static390.anIntArray412, arg2, local314, arg3)) {
										return false;
									}
									arg8 += local251;
									arg2 += Static457.anInt7352;
									arg3 += local327;
									arg5 += local231;
								}
							}
							if (!Static570.method7434((arg7 >> 12) + 1, (arg8 >> 12) - 1, Static390.anIntArray412, arg2, local314, arg3)) {
								return false;
							}
							arg3 += local327;
							arg2 += Static457.anInt7352;
							arg7 += local272;
							arg8 += local251;
						}
					} else {
						arg0 -= arg4;
						arg4 -= arg2;
						arg2 = Static457.anInt7352 * arg2;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static570.method7434((arg8 >> 12) + 1, (arg5 >> 12) + -1, Static390.anIntArray412, arg2, local314, arg3)) {
										return false;
									}
									arg8 += local251;
									arg5 += local231;
									arg3 += local327;
									arg2 += Static457.anInt7352;
								}
							}
							if (!Static570.method7434((arg8 >> 12) + 1, (arg7 >> 12) + -1, Static390.anIntArray412, arg2, local314, arg3)) {
								return false;
							}
							arg2 += Static457.anInt7352;
							arg7 += local272;
							arg8 += local251;
							arg3 += local327;
						}
					}
				}
			}
		} else {
			return false;
		}
	}
}
