import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!rl", name = "z", descriptor = "[Lclient!fd;")
	public static Class103[] aClass103Array9;

	@OriginalMember(owner = "client!rl", name = "Tc", descriptor = "I")
	public static int anInt5760;

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "(II)V")
	public static void method5001(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static479.anInt7495 = arg0;
		Static438.aClass9_Sub8Array1 = new Class9_Sub8[Static435.anIntArray452[Static479.anInt7495] + 1];
		Static417.anInt7331 = 0;
		Static348.anInt6501 = 0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIBIIIII)Z")
	public static boolean method5024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 > 2000 || arg8 > 2000 || arg6 > 2000 || arg1 > 2000 || arg4 > 2000 || arg2 > 2000) {
			return false;
		} else if (arg0 >= -2000 && arg8 >= -2000 && arg6 >= -2000 && arg1 >= -2000 && arg4 >= -2000 && arg2 >= -2000) {
			@Pc(66) int local66;
			if (Static438.anInt7599 == 2) {
				local66 = Static196.anInt3665 * arg0 + arg1;
				if (local66 >= 0 && Static443.anIntArray463.length > local66 && (arg5 << 8) - 38400 < Static443.anIntArray463[local66]) {
					return false;
				}
				local66 = Static196.anInt3665 * arg8 + arg4;
				if (local66 >= 0 && local66 < Static443.anIntArray463.length && (arg3 << 8) - 38400 < Static443.anIntArray463[local66]) {
					return false;
				}
				local66 = Static196.anInt3665 * arg6 + arg2;
				if (local66 >= 0 && Static443.anIntArray463.length > local66 && (arg7 << 8) - 38400 < Static443.anIntArray463[local66]) {
					return false;
				}
			}
			local66 = arg4 - arg1;
			@Pc(146) int local146 = arg8 - arg0;
			@Pc(151) int local151 = arg2 - arg1;
			@Pc(155) int local155 = arg6 - arg0;
			@Pc(160) int local160 = arg3 - arg5;
			if (arg8 > arg0 && arg6 < arg6) {
				if (arg8 > arg6) {
					arg8++;
				} else {
					arg6++;
				}
				arg0--;
			} else if (arg6 <= arg8) {
				if (arg8 < arg0) {
					arg0++;
				} else {
					arg8++;
				}
				arg6--;
			} else {
				arg8--;
				if (arg0 <= arg6) {
					arg6++;
				} else {
					arg0++;
				}
			}
			@Pc(213) int local213 = arg7 - arg5;
			@Pc(215) int local215 = 0;
			if (arg0 != arg8) {
				local215 = (arg4 - arg1 << 12) / (arg8 - arg0);
			}
			@Pc(232) int local232 = 0;
			if (arg8 != arg6) {
				local232 = (arg2 - arg4 << 12) / (arg6 - arg8);
			}
			@Pc(249) int local249 = 0;
			if (arg6 != arg0) {
				local249 = (arg1 - arg2 << 12) / (arg0 - arg6);
			}
			@Pc(275) int local275 = local155 * local66 - local146 * local151;
			if (local275 == 0) {
				return false;
			}
			@Pc(294) int local294 = (local160 * local155 - local146 * local213 << 8) / local275;
			@Pc(312) int local312 = (local213 * local66 - local151 * local160 << 8) / local275;
			if (arg0 <= arg8 && arg6 >= arg0) {
				if (arg0 >= Static157.anInt3195) {
					return true;
				}
				if (Static157.anInt3195 < arg6) {
					arg6 = Static157.anInt3195;
				}
				arg5 = local294 + (arg5 << 8) - local294 * arg1;
				if (arg8 > Static157.anInt3195) {
					arg8 = Static157.anInt3195;
				}
				if (arg6 <= arg8) {
					arg4 = arg1 <<= 0xC;
					arg2 <<= 0xC;
					if (arg0 < 0) {
						arg5 -= arg0 * local312;
						arg4 -= local249 * arg0;
						arg1 -= arg0 * local215;
						arg0 = 0;
					}
					if (arg6 < 0) {
						arg2 -= local232 * arg6;
						arg6 = 0;
					}
					if ((arg0 == arg6 || local249 >= local215) && (arg0 != arg6 || local215 >= local232)) {
						arg8 -= arg6;
						arg6 -= arg0;
						arg0 *= Static196.anInt3665;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static86.method7762((arg2 >> 12) + 1, (arg1 >> 12) - 1, Static443.anIntArray463, arg0, local294, arg5)) {
										return false;
									}
									arg2 += local232;
									arg5 += local312;
									arg0 += Static196.anInt3665;
									arg1 += local215;
								}
							}
							if (!Static86.method7762((arg4 >> 12) + 1, (arg1 >> 12) + -1, Static443.anIntArray463, arg0, local294, arg5)) {
								return false;
							}
							arg5 += local312;
							arg4 += local249;
							arg0 += Static196.anInt3665;
							arg1 += local215;
						}
					} else {
						arg8 -= arg6;
						arg6 -= arg0;
						arg0 *= Static196.anInt3665;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static86.method7762((arg1 >> 12) + 1, (arg2 >> 12) + -1, Static443.anIntArray463, arg0, local294, arg5)) {
										return false;
									}
									arg0 += Static196.anInt3665;
									arg5 += local312;
									arg1 += local215;
									arg2 += local232;
								}
							}
							if (!Static86.method7762((arg1 >> 12) + 1, (arg4 >> 12) + -1, Static443.anIntArray463, arg0, local294, arg5)) {
								return false;
							}
							arg5 += local312;
							arg1 += local215;
							arg4 += local249;
							arg0 += Static196.anInt3665;
						}
					}
				} else {
					arg2 = arg1 <<= 0xC;
					arg4 <<= 0xC;
					if (arg0 < 0) {
						arg5 -= arg0 * local312;
						arg2 -= arg0 * local249;
						arg1 -= arg0 * local215;
						arg0 = 0;
					}
					if (arg8 < 0) {
						arg4 -= arg8 * local232;
						arg8 = 0;
					}
					if (arg8 != arg0 && local215 > local249 || arg0 == arg8 && local232 < local249) {
						arg6 -= arg8;
						arg8 -= arg0;
						arg0 = Static196.anInt3665 * arg0;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static86.method7762((arg4 >> 12) + 1, (arg2 >> 12) - 1, Static443.anIntArray463, arg0, local294, arg5)) {
										return false;
									}
									arg2 += local249;
									arg0 += Static196.anInt3665;
									arg5 += local312;
									arg4 += local232;
								}
							}
							if (!Static86.method7762((arg1 >> 12) + 1, (arg2 >> 12) + -1, Static443.anIntArray463, arg0, local294, arg5)) {
								return false;
							}
							arg2 += local249;
							arg0 += Static196.anInt3665;
							arg1 += local215;
							arg5 += local312;
						}
					} else {
						arg6 -= arg8;
						arg8 -= arg0;
						arg0 *= Static196.anInt3665;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static86.method7762((arg2 >> 12) + 1, (arg4 >> 12) + -1, Static443.anIntArray463, arg0, local294, arg5)) {
										return false;
									}
									arg4 += local232;
									arg0 += Static196.anInt3665;
									arg2 += local249;
									arg5 += local312;
								}
							}
							if (!Static86.method7762((arg2 >> 12) + 1, (arg1 >> 12) + -1, Static443.anIntArray463, arg0, local294, arg5)) {
								return false;
							}
							arg1 += local215;
							arg0 += Static196.anInt3665;
							arg2 += local249;
							arg5 += local312;
						}
					}
				}
			} else if (arg8 > arg6) {
				if (Static157.anInt3195 <= arg6) {
					return true;
				}
				if (arg8 > Static157.anInt3195) {
					arg8 = Static157.anInt3195;
				}
				if (Static157.anInt3195 < arg0) {
					arg0 = Static157.anInt3195;
				}
				arg7 = local294 + (arg7 << 8) - local294 * arg2;
				if (arg0 < arg8) {
					arg4 = arg2 <<= 0xC;
					if (arg6 < 0) {
						arg2 -= arg6 * local249;
						arg4 -= local232 * arg6;
						arg7 -= local312 * arg6;
						arg6 = 0;
					}
					arg1 <<= 0xC;
					if (arg0 < 0) {
						arg1 -= arg0 * local215;
						arg0 = 0;
					}
					if (local232 >= local249) {
						arg8 -= arg0;
						arg0 -= arg6;
						arg6 = Static196.anInt3665 * arg6;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static86.method7762((arg4 >> 12) + 1, (arg1 >> 12) + -1, Static443.anIntArray463, arg6, local294, arg7)) {
										return false;
									}
									arg4 += local232;
									arg6 += Static196.anInt3665;
									arg1 += local215;
									arg7 += local312;
								}
							}
							if (!Static86.method7762((arg4 >> 12) + 1, (arg2 >> 12) - 1, Static443.anIntArray463, arg6, local294, arg7)) {
								return false;
							}
							arg4 += local232;
							arg7 += local312;
							arg6 += Static196.anInt3665;
							arg2 += local249;
						}
					} else {
						arg8 -= arg0;
						arg0 -= arg6;
						arg6 *= Static196.anInt3665;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static86.method7762((arg1 >> 12) + 1, (arg4 >> 12) + -1, Static443.anIntArray463, arg6, local294, arg7)) {
										return false;
									}
									arg6 += Static196.anInt3665;
									arg4 += local232;
									arg1 += local215;
									arg7 += local312;
								}
							}
							if (!Static86.method7762((arg2 >> 12) + 1, (arg4 >> 12) - 1, Static443.anIntArray463, arg6, local294, arg7)) {
								return false;
							}
							arg2 += local249;
							arg4 += local232;
							arg7 += local312;
							arg6 += Static196.anInt3665;
						}
					}
				} else {
					arg1 = arg2 <<= 0xC;
					if (arg6 < 0) {
						arg7 -= arg6 * local312;
						arg2 -= local249 * arg6;
						arg1 -= local232 * arg6;
						arg6 = 0;
					}
					arg4 <<= 0xC;
					if (arg8 < 0) {
						arg4 -= local215 * arg8;
						arg8 = 0;
					}
					if (local232 >= local249) {
						arg0 -= arg8;
						arg8 -= arg6;
						arg6 = Static196.anInt3665 * arg6;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static86.method7762((arg4 >> 12) + 1, (arg2 >> 12) - 1, Static443.anIntArray463, arg6, local294, arg7)) {
										return false;
									}
									arg7 += local312;
									arg2 += local249;
									arg6 += Static196.anInt3665;
									arg4 += local215;
								}
							}
							if (!Static86.method7762((arg1 >> 12) + 1, (arg2 >> 12) + -1, Static443.anIntArray463, arg6, local294, arg7)) {
								return false;
							}
							arg2 += local249;
							arg1 += local232;
							arg6 += Static196.anInt3665;
							arg7 += local312;
						}
					} else {
						arg0 -= arg8;
						arg8 -= arg6;
						arg6 *= Static196.anInt3665;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static86.method7762((arg2 >> 12) + 1, (arg4 >> 12) + -1, Static443.anIntArray463, arg6, local294, arg7)) {
										return false;
									}
									arg2 += local249;
									arg6 += Static196.anInt3665;
									arg4 += local215;
									arg7 += local312;
								}
							}
							if (!Static86.method7762((arg2 >> 12) + 1, (arg1 >> 12) + -1, Static443.anIntArray463, arg6, local294, arg7)) {
								return false;
							}
							arg7 += local312;
							arg6 += Static196.anInt3665;
							arg2 += local249;
							arg1 += local232;
						}
					}
				}
			} else if (arg8 >= Static157.anInt3195) {
				return true;
			} else {
				if (Static157.anInt3195 < arg6) {
					arg6 = Static157.anInt3195;
				}
				arg3 = (arg3 << 8) + local294 - (local294 * arg4);
				if (arg0 > Static157.anInt3195) {
					arg0 = Static157.anInt3195;
				}
				if (arg0 <= arg6) {
					arg2 = arg4 <<= 0xC;
					if (arg8 < 0) {
						arg3 -= local312 * arg8;
						arg2 -= local215 * arg8;
						arg4 -= local232 * arg8;
						arg8 = 0;
					}
					arg1 <<= 0xC;
					if (arg0 < 0) {
						arg1 -= local249 * arg0;
						arg0 = 0;
					}
					if (local215 >= local232) {
						arg6 -= arg0;
						arg0 -= arg8;
						arg8 = Static196.anInt3665 * arg8;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static86.method7762((arg1 >> 12) + 1, (arg4 >> 12) + -1, Static443.anIntArray463, arg8, local294, arg3)) {
										return false;
									}
									arg8 += Static196.anInt3665;
									arg4 += local232;
									arg3 += local312;
									arg1 += local249;
								}
							}
							if (!Static86.method7762((arg2 >> 12) + 1, (arg4 >> 12) - 1, Static443.anIntArray463, arg8, local294, arg3)) {
								return false;
							}
							arg8 += Static196.anInt3665;
							arg4 += local232;
							arg2 += local215;
							arg3 += local312;
						}
					} else {
						arg6 -= arg0;
						arg0 -= arg8;
						arg8 = Static196.anInt3665 * arg8;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static86.method7762((arg4 >> 12) + 1, (arg1 >> 12) - 1, Static443.anIntArray463, arg8, local294, arg3)) {
										return false;
									}
									arg3 += local312;
									arg4 += local232;
									arg8 += Static196.anInt3665;
									arg1 += local249;
								}
							}
							if (!Static86.method7762((arg4 >> 12) + 1, (arg2 >> 12) + -1, Static443.anIntArray463, arg8, local294, arg3)) {
								return false;
							}
							arg3 += local312;
							arg8 += Static196.anInt3665;
							arg4 += local232;
							arg2 += local215;
						}
					}
				} else {
					arg1 = arg4 <<= 0xC;
					arg2 <<= 0xC;
					if (arg8 < 0) {
						arg1 -= arg8 * local215;
						arg4 -= arg8 * local232;
						arg3 -= arg8 * local312;
						arg8 = 0;
					}
					if (arg6 < 0) {
						arg2 -= arg6 * local249;
						arg6 = 0;
					}
					if (arg6 != arg8 && local215 < local232 || arg8 == arg6 && local249 < local215) {
						arg0 -= arg6;
						arg6 -= arg8;
						arg8 *= Static196.anInt3665;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static86.method7762((arg2 >> 12) + 1, (arg1 >> 12) + -1, Static443.anIntArray463, arg8, local294, arg3)) {
										return false;
									}
									arg2 += local249;
									arg3 += local312;
									arg1 += local215;
									arg8 += Static196.anInt3665;
								}
							}
							if (!Static86.method7762((arg4 >> 12) + 1, (arg1 >> 12) + -1, Static443.anIntArray463, arg8, local294, arg3)) {
								return false;
							}
							arg3 += local312;
							arg1 += local215;
							arg4 += local232;
							arg8 += Static196.anInt3665;
						}
					} else {
						arg0 -= arg6;
						arg6 -= arg8;
						arg8 *= Static196.anInt3665;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static86.method7762((arg1 >> 12) + 1, (arg2 >> 12) - 1, Static443.anIntArray463, arg8, local294, arg3)) {
										return false;
									}
									arg8 += Static196.anInt3665;
									arg3 += local312;
									arg1 += local215;
									arg2 += local249;
								}
							}
							if (!Static86.method7762((arg1 >> 12) + 1, (arg4 >> 12) + -1, Static443.anIntArray463, arg8, local294, arg3)) {
								return false;
							}
							arg4 += local232;
							arg8 += Static196.anInt3665;
							arg3 += local312;
							arg1 += local215;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "(II)Z")
	public static boolean method5031(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
