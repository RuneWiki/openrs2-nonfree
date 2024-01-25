import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "Lclient!kw;")
	public static Class178 aClass178_3;

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
	public static int anInt2948;

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[100];

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "Z")
	public static boolean aBoolean191 = false;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ICLjava/lang/String;)I")
	public static int method2693(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg1.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			if (arg0 == arg1.charAt(local20)) {
				local15++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIBIIIIII)Z")
	public static boolean method2695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 > 2000 || arg8 > 2000 || arg7 > 2000 || arg1 > 2000 || arg0 > 2000 || arg3 > 2000) {
			return false;
		} else if (arg4 >= -2000 && arg8 >= -2000 && arg7 >= -2000 && arg1 >= -2000 && arg0 >= -2000 && arg3 >= -2000) {
			@Pc(90) int local90;
			if (Static245.anInt3870 == 2) {
				local90 = arg1 + arg4 * Static587.anInt8944;
				if (local90 >= 0 && Static628.anIntArray700.length > local90 && Static628.anIntArray700[local90] > (arg5 << 8) - 38400) {
					return false;
				}
				local90 = arg8 * Static587.anInt8944 + arg0;
				if (local90 >= 0 && local90 < Static628.anIntArray700.length && Static628.anIntArray700[local90] > (arg6 << 8) - 38400) {
					return false;
				}
				local90 = arg7 * Static587.anInt8944 + arg3;
				if (local90 >= 0 && Static628.anIntArray700.length > local90 && Static628.anIntArray700[local90] > (arg2 << 8) - 38400) {
					return false;
				}
			}
			local90 = arg0 - arg1;
			@Pc(184) int local184 = arg8 - arg4;
			@Pc(189) int local189 = arg3 - arg1;
			@Pc(194) int local194 = arg7 - arg4;
			@Pc(198) int local198 = arg6 - arg5;
			@Pc(203) int local203 = arg2 - arg5;
			if (arg8 > arg4 && arg7 < arg7) {
				arg4--;
				if (arg7 < arg8) {
					arg8++;
				} else {
					arg7++;
				}
			} else if (arg8 < arg7) {
				arg8--;
				if (arg7 < arg4) {
					arg4++;
				} else {
					arg7++;
				}
			} else {
				if (arg4 <= arg8) {
					arg8++;
				} else {
					arg4++;
				}
				arg7--;
			}
			@Pc(271) int local271 = 0;
			if (arg4 != arg8) {
				local271 = (arg0 - arg1 << 12) / (arg8 - arg4);
			}
			@Pc(287) int local287 = 0;
			if (arg7 != arg8) {
				local287 = (arg3 - arg0 << 12) / (arg7 - arg8);
			}
			@Pc(307) int local307 = 0;
			if (arg7 != arg4) {
				local307 = (arg1 - arg3 << 12) / (arg4 - arg7);
			}
			@Pc(334) int local334 = local90 * local194 - local189 * local184;
			if (local334 == 0) {
				return false;
			}
			@Pc(355) int local355 = (local194 * local198 - local184 * local203 << 8) / local334;
			@Pc(368) int local368 = (local203 * local90 - local189 * local198 << 8) / local334;
			if (arg8 >= arg4 && arg7 >= arg4) {
				if (Static391.anInt6094 <= arg4) {
					return true;
				}
				arg5 = local355 + (arg5 << 8) - local355 * arg1;
				if (Static391.anInt6094 < arg7) {
					arg7 = Static391.anInt6094;
				}
				if (Static391.anInt6094 < arg8) {
					arg8 = Static391.anInt6094;
				}
				if (arg8 < arg7) {
					arg3 = arg1 <<= 0xC;
					if (arg4 < 0) {
						arg1 -= local271 * arg4;
						arg3 -= local307 * arg4;
						arg5 -= arg4 * local368;
						arg4 = 0;
					}
					arg0 <<= 0xC;
					if (arg8 < 0) {
						arg0 -= arg8 * local287;
						arg8 = 0;
					}
					if ((arg4 == arg8 || local307 >= local271) && (arg4 != arg8 || local287 >= local307)) {
						arg7 -= arg8;
						arg8 -= arg4;
						arg4 *= Static587.anInt8944;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static16.method556(arg4, Static628.anIntArray700, local355, (arg0 >> 12) - 1, arg5, (arg3 >> 12) + 1)) {
										return false;
									}
									arg0 += local287;
									arg3 += local307;
									arg4 += Static587.anInt8944;
									arg5 += local368;
								}
							}
							if (!Static16.method556(arg4, Static628.anIntArray700, local355, (arg1 >> 12) - 1, arg5, (arg3 >> 12) + 1)) {
								return false;
							}
							arg5 += local368;
							arg3 += local307;
							arg4 += Static587.anInt8944;
							arg1 += local271;
						}
					} else {
						arg7 -= arg8;
						arg8 -= arg4;
						arg4 *= Static587.anInt8944;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static16.method556(arg4, Static628.anIntArray700, local355, (arg3 >> 12) - 1, arg5, (arg0 >> 12) + 1)) {
										return false;
									}
									arg5 += local368;
									arg3 += local307;
									arg4 += Static587.anInt8944;
									arg0 += local287;
								}
							}
							if (!Static16.method556(arg4, Static628.anIntArray700, local355, (arg3 >> 12) - 1, arg5, (arg1 >> 12) + 1)) {
								return false;
							}
							arg3 += local307;
							arg1 += local271;
							arg5 += local368;
							arg4 += Static587.anInt8944;
						}
					}
				} else {
					arg0 = arg1 <<= 0xC;
					arg3 <<= 0xC;
					if (arg4 < 0) {
						arg5 -= local368 * arg4;
						arg0 -= arg4 * local307;
						arg1 -= local271 * arg4;
						arg4 = 0;
					}
					if (arg7 < 0) {
						arg3 -= arg7 * local287;
						arg7 = 0;
					}
					if ((arg7 == arg4 || local271 <= local307) && (arg4 != arg7 || local287 <= local271)) {
						arg8 -= arg7;
						arg7 -= arg4;
						arg4 *= Static587.anInt8944;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static16.method556(arg4, Static628.anIntArray700, local355, (arg1 >> 12) - 1, arg5, (arg3 >> 12) + 1)) {
										return false;
									}
									arg3 += local287;
									arg5 += local368;
									arg1 += local271;
									arg4 += Static587.anInt8944;
								}
							}
							if (!Static16.method556(arg4, Static628.anIntArray700, local355, (arg1 >> 12) - 1, arg5, (arg0 >> 12) + 1)) {
								return false;
							}
							arg1 += local271;
							arg5 += local368;
							arg0 += local307;
							arg4 += Static587.anInt8944;
						}
					} else {
						arg8 -= arg7;
						arg7 -= arg4;
						arg4 *= Static587.anInt8944;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static16.method556(arg4, Static628.anIntArray700, local355, (arg3 >> 12) - 1, arg5, (arg1 >> 12) + 1)) {
										return false;
									}
									arg3 += local287;
									arg5 += local368;
									arg4 += Static587.anInt8944;
									arg1 += local271;
								}
							}
							if (!Static16.method556(arg4, Static628.anIntArray700, local355, (arg0 >> 12) - 1, arg5, (arg1 >> 12) + 1)) {
								return false;
							}
							arg5 += local368;
							arg0 += local307;
							arg4 += Static587.anInt8944;
							arg1 += local271;
						}
					}
				}
			} else if (arg7 < arg8) {
				if (Static391.anInt6094 <= arg7) {
					return true;
				}
				if (Static391.anInt6094 < arg4) {
					arg4 = Static391.anInt6094;
				}
				arg2 = local355 + (arg2 << 8) - arg3 * local355;
				if (arg8 > Static391.anInt6094) {
					arg8 = Static391.anInt6094;
				}
				if (arg4 >= arg8) {
					arg1 = arg3 <<= 0xC;
					arg0 <<= 0xC;
					if (arg7 < 0) {
						arg1 -= local287 * arg7;
						arg2 -= arg7 * local368;
						arg3 -= local307 * arg7;
						arg7 = 0;
					}
					if (arg8 < 0) {
						arg0 -= local271 * arg8;
						arg8 = 0;
					}
					if (local287 >= local307) {
						arg4 -= arg8;
						arg8 -= arg7;
						arg7 *= Static587.anInt8944;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static16.method556(arg7, Static628.anIntArray700, local355, (arg3 >> 12) - 1, arg2, (arg0 >> 12) + 1)) {
										return false;
									}
									arg0 += local271;
									arg7 += Static587.anInt8944;
									arg3 += local307;
									arg2 += local368;
								}
							}
							if (!Static16.method556(arg7, Static628.anIntArray700, local355, (arg3 >> 12) - 1, arg2, (arg1 >> 12) + 1)) {
								return false;
							}
							arg3 += local307;
							arg2 += local368;
							arg1 += local287;
							arg7 += Static587.anInt8944;
						}
					} else {
						arg4 -= arg8;
						arg8 -= arg7;
						arg7 *= Static587.anInt8944;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static16.method556(arg7, Static628.anIntArray700, local355, (arg0 >> 12) - 1, arg2, (arg3 >> 12) + 1)) {
										return false;
									}
									arg2 += local368;
									arg7 += Static587.anInt8944;
									arg3 += local307;
									arg0 += local271;
								}
							}
							if (!Static16.method556(arg7, Static628.anIntArray700, local355, (arg1 >> 12) - 1, arg2, (arg3 >> 12) + 1)) {
								return false;
							}
							arg3 += local307;
							arg2 += local368;
							arg1 += local287;
							arg7 += Static587.anInt8944;
						}
					}
				} else {
					arg0 = arg3 <<= 0xC;
					if (arg7 < 0) {
						arg0 -= arg7 * local287;
						arg2 -= arg7 * local368;
						arg3 -= local307 * arg7;
						arg7 = 0;
					}
					arg1 <<= 0xC;
					if (arg4 < 0) {
						arg1 -= local271 * arg4;
						arg4 = 0;
					}
					if (local287 < local307) {
						arg8 -= arg4;
						arg4 -= arg7;
						arg7 *= Static587.anInt8944;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static16.method556(arg7, Static628.anIntArray700, local355, (arg0 >> 12) - 1, arg2, (arg1 >> 12) + 1)) {
										return false;
									}
									arg1 += local271;
									arg0 += local287;
									arg7 += Static587.anInt8944;
									arg2 += local368;
								}
							}
							if (!Static16.method556(arg7, Static628.anIntArray700, local355, (arg0 >> 12) - 1, arg2, (arg3 >> 12) + 1)) {
								return false;
							}
							arg2 += local368;
							arg0 += local287;
							arg7 += Static587.anInt8944;
							arg3 += local307;
						}
					} else {
						arg8 -= arg4;
						arg4 -= arg7;
						arg7 = Static587.anInt8944 * arg7;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static16.method556(arg7, Static628.anIntArray700, local355, (arg1 >> 12) - 1, arg2, (arg0 >> 12) + 1)) {
										return false;
									}
									arg1 += local271;
									arg0 += local287;
									arg2 += local368;
									arg7 += Static587.anInt8944;
								}
							}
							if (!Static16.method556(arg7, Static628.anIntArray700, local355, (arg3 >> 12) - 1, arg2, (arg0 >> 12) + 1)) {
								return false;
							}
							arg2 += local368;
							arg0 += local287;
							arg7 += Static587.anInt8944;
							arg3 += local307;
						}
					}
				}
			} else if (Static391.anInt6094 <= arg8) {
				return true;
			} else {
				if (arg7 > Static391.anInt6094) {
					arg7 = Static391.anInt6094;
				}
				arg6 = (arg6 << 8) + local355 - local355 * arg0;
				if (arg4 > Static391.anInt6094) {
					arg4 = Static391.anInt6094;
				}
				if (arg7 < arg4) {
					arg1 = arg0 <<= 0xC;
					arg3 <<= 0xC;
					if (arg8 < 0) {
						arg6 -= arg8 * local368;
						arg1 -= local271 * arg8;
						arg0 -= arg8 * local287;
						arg8 = 0;
					}
					if (arg7 < 0) {
						arg3 -= arg7 * local307;
						arg7 = 0;
					}
					if (arg8 != arg7 && local287 > local271 || arg7 == arg8 && local307 < local271) {
						arg4 -= arg7;
						arg7 -= arg8;
						arg8 = Static587.anInt8944 * arg8;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static16.method556(arg8, Static628.anIntArray700, local355, (arg1 >> 12) - 1, arg6, (arg3 >> 12) + 1)) {
										return false;
									}
									arg3 += local307;
									arg6 += local368;
									arg1 += local271;
									arg8 += Static587.anInt8944;
								}
							}
							if (!Static16.method556(arg8, Static628.anIntArray700, local355, (arg1 >> 12) - 1, arg6, (arg0 >> 12) + 1)) {
								return false;
							}
							arg6 += local368;
							arg8 += Static587.anInt8944;
							arg1 += local271;
							arg0 += local287;
						}
					} else {
						arg4 -= arg7;
						arg7 -= arg8;
						arg8 *= Static587.anInt8944;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static16.method556(arg8, Static628.anIntArray700, local355, (arg3 >> 12) - 1, arg6, (arg1 >> 12) + 1)) {
										return false;
									}
									arg3 += local307;
									arg6 += local368;
									arg8 += Static587.anInt8944;
									arg1 += local271;
								}
							}
							if (!Static16.method556(arg8, Static628.anIntArray700, local355, (arg0 >> 12) - 1, arg6, (arg1 >> 12) + 1)) {
								return false;
							}
							arg8 += Static587.anInt8944;
							arg0 += local287;
							arg6 += local368;
							arg1 += local271;
						}
					}
				} else {
					arg3 = arg0 <<= 0xC;
					arg1 <<= 0xC;
					if (arg8 < 0) {
						arg6 -= local368 * arg8;
						arg3 -= local271 * arg8;
						arg0 -= arg8 * local287;
						arg8 = 0;
					}
					if (arg4 < 0) {
						arg1 -= arg4 * local307;
						arg4 = 0;
					}
					if (local271 >= local287) {
						arg7 -= arg4;
						arg4 -= arg8;
						arg8 *= Static587.anInt8944;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static16.method556(arg8, Static628.anIntArray700, local355, (arg0 >> 12) - 1, arg6, (arg1 >> 12) + 1)) {
										return false;
									}
									arg0 += local287;
									arg1 += local307;
									arg8 += Static587.anInt8944;
									arg6 += local368;
								}
							}
							if (!Static16.method556(arg8, Static628.anIntArray700, local355, (arg0 >> 12) - 1, arg6, (arg3 >> 12) + 1)) {
								return false;
							}
							arg8 += Static587.anInt8944;
							arg3 += local271;
							arg6 += local368;
							arg0 += local287;
						}
					} else {
						arg7 -= arg4;
						arg4 -= arg8;
						arg8 = Static587.anInt8944 * arg8;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static16.method556(arg8, Static628.anIntArray700, local355, (arg1 >> 12) - 1, arg6, (arg0 >> 12) + 1)) {
										return false;
									}
									arg8 += Static587.anInt8944;
									arg1 += local307;
									arg6 += local368;
									arg0 += local287;
								}
							}
							if (!Static16.method556(arg8, Static628.anIntArray700, local355, (arg3 >> 12) - 1, arg6, (arg0 >> 12) + 1)) {
								return false;
							}
							arg8 += Static587.anInt8944;
							arg3 += local271;
							arg0 += local287;
							arg6 += local368;
						}
					}
				}
			}
		} else {
			return false;
		}
	}
}
