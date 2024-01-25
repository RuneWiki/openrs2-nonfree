import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
	public static int anInt9204;

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "Lclient!kd;")
	public static final Class176 aClass176_4 = new Class176(1);

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
	public static int anInt9202 = -1;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7069(@OriginalArg(1) String arg0) {
		Static146.aString56 = arg0;
		if (Static589.anApplet2 == null) {
			return;
		}
		try {
			@Pc(27) String local27 = Static589.anApplet2.getParameter("cookieprefix");
			@Pc(31) String local31 = Static589.anApplet2.getParameter("cookiehost");
			@Pc(46) String local46 = local27 + "settings=" + arg0 + "; version=1; path=/; domain=" + local31;
			if (arg0.length() == 0) {
				local46 = local46 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local46 = local46 + "; Expires=" + Static18.method812(Static112.method2047() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static597.method1278("document.cookie=\"" + local46 + "\"", Static589.anApplet2);
		} catch (@Pc(94) Throwable local94) {
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method7070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 > 2000 || arg1 > 2000 || arg2 > 2000 || arg6 > 2000 || arg5 > 2000 || arg0 > 2000) {
			return false;
		} else if (arg4 >= -2000 && arg1 >= -2000 && arg2 >= -2000 && arg6 >= -2000 && arg5 >= -2000 && arg0 >= -2000) {
			@Pc(74) int local74;
			if (Static54.anInt1441 == 2) {
				local74 = Static161.anInt3354 * arg4 + arg6;
				if (local74 >= 0 && local74 < Static333.anIntArray353.length && (arg3 << 8) - 38400 < Static333.anIntArray353[local74]) {
					return false;
				}
				local74 = arg1 * Static161.anInt3354 + arg5;
				if (local74 >= 0 && local74 < Static333.anIntArray353.length && Static333.anIntArray353[local74] > (arg7 << 8) - 38400) {
					return false;
				}
				local74 = arg0 + Static161.anInt3354 * arg2;
				if (local74 >= 0 && Static333.anIntArray353.length > local74 && (arg8 << 8) - 38400 < Static333.anIntArray353[local74]) {
					return false;
				}
			}
			local74 = arg5 - arg6;
			@Pc(154) int local154 = arg1 - arg4;
			@Pc(158) int local158 = arg0 - arg6;
			@Pc(163) int local163 = arg2 - arg4;
			@Pc(168) int local168 = arg7 - arg3;
			@Pc(173) int local173 = arg8 - arg3;
			if (arg1 > arg4 && arg2 > arg2) {
				if (arg1 <= arg2) {
					arg2++;
				} else {
					arg1++;
				}
				arg4--;
			} else if (arg2 > arg1) {
				arg1--;
				if (arg4 > arg2) {
					arg4++;
				} else {
					arg2++;
				}
			} else {
				arg2--;
				if (arg4 <= arg1) {
					arg1++;
				} else {
					arg4++;
				}
			}
			@Pc(220) int local220 = 0;
			if (arg1 != arg4) {
				local220 = (arg5 - arg6 << 12) / (arg1 - arg4);
			}
			@Pc(241) int local241 = 0;
			if (arg2 != arg1) {
				local241 = (arg0 - arg5 << 12) / (arg2 - arg1);
			}
			@Pc(257) int local257 = 0;
			if (arg2 != arg4) {
				local257 = (arg6 - arg0 << 12) / (arg4 - arg2);
			}
			@Pc(280) int local280 = local74 * local163 - local154 * local158;
			if (local280 == 0) {
				return false;
			}
			@Pc(299) int local299 = (local168 * local163 - local173 * local154 << 8) / local280;
			@Pc(312) int local312 = (local173 * local74 - local158 * local168 << 8) / local280;
			if (arg4 <= arg1 && arg4 <= arg2) {
				if (arg4 >= Static251.anInt5137) {
					return true;
				}
				if (arg2 > Static251.anInt5137) {
					arg2 = Static251.anInt5137;
				}
				if (Static251.anInt5137 < arg1) {
					arg1 = Static251.anInt5137;
				}
				arg3 = (arg3 << 8) + (local299 - (local299 * arg6));
				if (arg2 > arg1) {
					arg0 = arg6 <<= 0xC;
					arg5 <<= 0xC;
					if (arg4 < 0) {
						arg6 -= arg4 * local220;
						arg3 -= arg4 * local312;
						arg0 -= arg4 * local257;
						arg4 = 0;
					}
					if (arg1 < 0) {
						arg5 -= local241 * arg1;
						arg1 = 0;
					}
					if ((arg1 == arg4 || local257 >= local220) && (arg4 != arg1 || local257 <= local241)) {
						arg2 -= arg1;
						arg1 -= arg4;
						arg4 *= Static161.anInt3354;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static434.method6469((arg5 >> 12) - 1, arg3, Static333.anIntArray353, local299, arg4, (arg0 >> 12) + 1)) {
										return false;
									}
									arg0 += local257;
									arg3 += local312;
									arg5 += local241;
									arg4 += Static161.anInt3354;
								}
							}
							if (!Static434.method6469((arg6 >> 12) - 1, arg3, Static333.anIntArray353, local299, arg4, (arg0 >> 12) + 1)) {
								return false;
							}
							arg3 += local312;
							arg4 += Static161.anInt3354;
							arg6 += local220;
							arg0 += local257;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg4;
						arg4 = Static161.anInt3354 * arg4;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static434.method6469((arg0 >> 12) - 1, arg3, Static333.anIntArray353, local299, arg4, (arg5 >> 12) + 1)) {
										return false;
									}
									arg5 += local241;
									arg3 += local312;
									arg0 += local257;
									arg4 += Static161.anInt3354;
								}
							}
							if (!Static434.method6469((arg0 >> 12) - 1, arg3, Static333.anIntArray353, local299, arg4, (arg6 >> 12) + 1)) {
								return false;
							}
							arg6 += local220;
							arg0 += local257;
							arg3 += local312;
							arg4 += Static161.anInt3354;
						}
					}
				} else {
					arg5 = arg6 <<= 0xC;
					arg0 <<= 0xC;
					if (arg4 < 0) {
						arg6 -= local220 * arg4;
						arg5 -= arg4 * local257;
						arg3 -= arg4 * local312;
						arg4 = 0;
					}
					if (arg2 < 0) {
						arg0 -= arg2 * local241;
						arg2 = 0;
					}
					if ((arg4 == arg2 || local220 <= local257) && (arg2 != arg4 || local220 >= local241)) {
						arg1 -= arg2;
						arg2 -= arg4;
						arg4 = Static161.anInt3354 * arg4;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static434.method6469((arg6 >> 12) - 1, arg3, Static333.anIntArray353, local299, arg4, (arg0 >> 12) + 1)) {
										return false;
									}
									arg4 += Static161.anInt3354;
									arg3 += local312;
									arg6 += local220;
									arg0 += local241;
								}
							}
							if (!Static434.method6469((arg6 >> 12) - 1, arg3, Static333.anIntArray353, local299, arg4, (arg5 >> 12) + 1)) {
								return false;
							}
							arg3 += local312;
							arg4 += Static161.anInt3354;
							arg5 += local257;
							arg6 += local220;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg4;
						arg4 = Static161.anInt3354 * arg4;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static434.method6469((arg0 >> 12) - 1, arg3, Static333.anIntArray353, local299, arg4, (arg6 >> 12) + 1)) {
										return false;
									}
									arg3 += local312;
									arg0 += local241;
									arg6 += local220;
									arg4 += Static161.anInt3354;
								}
							}
							if (!Static434.method6469((arg5 >> 12) - 1, arg3, Static333.anIntArray353, local299, arg4, (arg6 >> 12) + 1)) {
								return false;
							}
							arg4 += Static161.anInt3354;
							arg3 += local312;
							arg6 += local220;
							arg5 += local257;
						}
					}
				}
			} else if (arg1 > arg2) {
				if (arg2 >= Static251.anInt5137) {
					return true;
				}
				if (Static251.anInt5137 < arg1) {
					arg1 = Static251.anInt5137;
				}
				if (Static251.anInt5137 < arg4) {
					arg4 = Static251.anInt5137;
				}
				arg8 = local299 + (arg8 << 8) - local299 * arg0;
				if (arg1 > arg4) {
					arg5 = arg0 <<= 0xC;
					if (arg2 < 0) {
						arg8 -= local312 * arg2;
						arg0 -= arg2 * local257;
						arg5 -= arg2 * local241;
						arg2 = 0;
					}
					arg6 <<= 0xC;
					if (arg4 < 0) {
						arg6 -= local220 * arg4;
						arg4 = 0;
					}
					if (local257 <= local241) {
						arg1 -= arg4;
						arg4 -= arg2;
						arg2 *= Static161.anInt3354;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static434.method6469((arg6 >> 12) - 1, arg8, Static333.anIntArray353, local299, arg2, (arg5 >> 12) + 1)) {
										return false;
									}
									arg6 += local220;
									arg8 += local312;
									arg2 += Static161.anInt3354;
									arg5 += local241;
								}
							}
							if (!Static434.method6469((arg0 >> 12) - 1, arg8, Static333.anIntArray353, local299, arg2, (arg5 >> 12) + 1)) {
								return false;
							}
							arg5 += local241;
							arg2 += Static161.anInt3354;
							arg0 += local257;
							arg8 += local312;
						}
					} else {
						arg1 -= arg4;
						arg4 -= arg2;
						arg2 *= Static161.anInt3354;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static434.method6469((arg5 >> 12) - 1, arg8, Static333.anIntArray353, local299, arg2, (arg6 >> 12) + 1)) {
										return false;
									}
									arg6 += local220;
									arg2 += Static161.anInt3354;
									arg5 += local241;
									arg8 += local312;
								}
							}
							if (!Static434.method6469((arg5 >> 12) - 1, arg8, Static333.anIntArray353, local299, arg2, (arg0 >> 12) + 1)) {
								return false;
							}
							arg2 += Static161.anInt3354;
							arg0 += local257;
							arg5 += local241;
							arg8 += local312;
						}
					}
				} else {
					arg6 = arg0 <<= 0xC;
					if (arg2 < 0) {
						arg8 -= arg2 * local312;
						arg0 -= arg2 * local257;
						arg6 -= arg2 * local241;
						arg2 = 0;
					}
					arg5 <<= 0xC;
					if (arg1 < 0) {
						arg5 -= arg1 * local220;
						arg1 = 0;
					}
					if (local257 <= local241) {
						arg4 -= arg1;
						arg1 -= arg2;
						arg2 = Static161.anInt3354 * arg2;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static434.method6469((arg0 >> 12) - 1, arg8, Static333.anIntArray353, local299, arg2, (arg5 >> 12) + 1)) {
										return false;
									}
									arg5 += local220;
									arg0 += local257;
									arg2 += Static161.anInt3354;
									arg8 += local312;
								}
							}
							if (!Static434.method6469((arg0 >> 12) - 1, arg8, Static333.anIntArray353, local299, arg2, (arg6 >> 12) + 1)) {
								return false;
							}
							arg2 += Static161.anInt3354;
							arg0 += local257;
							arg6 += local241;
							arg8 += local312;
						}
					} else {
						arg4 -= arg1;
						arg1 -= arg2;
						arg2 = Static161.anInt3354 * arg2;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static434.method6469((arg5 >> 12) - 1, arg8, Static333.anIntArray353, local299, arg2, (arg0 >> 12) + 1)) {
										return false;
									}
									arg2 += Static161.anInt3354;
									arg8 += local312;
									arg5 += local220;
									arg0 += local257;
								}
							}
							if (!Static434.method6469((arg6 >> 12) - 1, arg8, Static333.anIntArray353, local299, arg2, (arg0 >> 12) + 1)) {
								return false;
							}
							arg0 += local257;
							arg8 += local312;
							arg6 += local241;
							arg2 += Static161.anInt3354;
						}
					}
				}
			} else if (arg1 >= Static251.anInt5137) {
				return true;
			} else {
				if (Static251.anInt5137 < arg2) {
					arg2 = Static251.anInt5137;
				}
				if (arg4 > Static251.anInt5137) {
					arg4 = Static251.anInt5137;
				}
				arg7 = (arg7 << 8) + local299 - (local299 * arg5);
				if (arg2 >= arg4) {
					arg0 = arg5 <<= 0xC;
					arg6 <<= 0xC;
					if (arg1 < 0) {
						arg5 -= local241 * arg1;
						arg7 -= local312 * arg1;
						arg0 -= local220 * arg1;
						arg1 = 0;
					}
					if (arg4 < 0) {
						arg6 -= arg4 * local257;
						arg4 = 0;
					}
					if (local220 >= local241) {
						arg2 -= arg4;
						arg4 -= arg1;
						arg1 *= Static161.anInt3354;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static434.method6469((arg5 >> 12) - 1, arg7, Static333.anIntArray353, local299, arg1, (arg6 >> 12) + 1)) {
										return false;
									}
									arg1 += Static161.anInt3354;
									arg5 += local241;
									arg7 += local312;
									arg6 += local257;
								}
							}
							if (!Static434.method6469((arg5 >> 12) - 1, arg7, Static333.anIntArray353, local299, arg1, (arg0 >> 12) + 1)) {
								return false;
							}
							arg1 += Static161.anInt3354;
							arg0 += local220;
							arg5 += local241;
							arg7 += local312;
						}
					} else {
						arg2 -= arg4;
						arg4 -= arg1;
						arg1 *= Static161.anInt3354;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static434.method6469((arg6 >> 12) - 1, arg7, Static333.anIntArray353, local299, arg1, (arg5 >> 12) + 1)) {
										return false;
									}
									arg7 += local312;
									arg1 += Static161.anInt3354;
									arg5 += local241;
									arg6 += local257;
								}
							}
							if (!Static434.method6469((arg0 >> 12) - 1, arg7, Static333.anIntArray353, local299, arg1, (arg5 >> 12) + 1)) {
								return false;
							}
							arg5 += local241;
							arg1 += Static161.anInt3354;
							arg7 += local312;
							arg0 += local220;
						}
					}
				} else {
					arg6 = arg5 <<= 0xC;
					if (arg1 < 0) {
						arg5 -= arg1 * local241;
						arg7 -= arg1 * local312;
						arg6 -= arg1 * local220;
						arg1 = 0;
					}
					arg0 <<= 0xC;
					if (arg2 < 0) {
						arg0 -= local257 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && local220 < local241 || arg2 == arg1 && local257 < local220) {
						arg4 -= arg2;
						arg2 -= arg1;
						arg1 = Static161.anInt3354 * arg1;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static434.method6469((arg6 >> 12) - 1, arg7, Static333.anIntArray353, local299, arg1, (arg0 >> 12) + 1)) {
										return false;
									}
									arg0 += local257;
									arg1 += Static161.anInt3354;
									arg7 += local312;
									arg6 += local220;
								}
							}
							if (!Static434.method6469((arg6 >> 12) - 1, arg7, Static333.anIntArray353, local299, arg1, (arg5 >> 12) + 1)) {
								return false;
							}
							arg1 += Static161.anInt3354;
							arg6 += local220;
							arg5 += local241;
							arg7 += local312;
						}
					} else {
						arg4 -= arg2;
						arg2 -= arg1;
						arg1 *= Static161.anInt3354;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static434.method6469((arg0 >> 12) - 1, arg7, Static333.anIntArray353, local299, arg1, (arg6 >> 12) + 1)) {
										return false;
									}
									arg7 += local312;
									arg1 += Static161.anInt3354;
									arg6 += local220;
									arg0 += local257;
								}
							}
							if (!Static434.method6469((arg5 >> 12) - 1, arg7, Static333.anIntArray353, local299, arg1, (arg6 >> 12) + 1)) {
								return false;
							}
							arg5 += local241;
							arg1 += Static161.anInt3354;
							arg7 += local312;
							arg6 += local220;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!vo;III)Lclient!cr;")
	public static Class59 method7071(@OriginalArg(0) Class348 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) byte[] local11 = arg0.method7964(0, arg1);
		return local11 == null ? null : new Class59(local11);
	}
}
