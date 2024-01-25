import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!lc", name = "I", descriptor = "Lclient!wu;")
	public static Class380 aClass380_75;

	@OriginalMember(owner = "client!lc", name = "M", descriptor = "Lclient!hh;")
	public static Class35 aClass35_3;

	@OriginalMember(owner = "client!lc", name = "P", descriptor = "[Lclient!s;")
	public static Class76[] aClass76Array1;

	@OriginalMember(owner = "client!lc", name = "L", descriptor = "Lclient!ow;")
	public static final Class260 aClass260_5 = new Class260("", 12);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)Lclient!nfa;")
	public static Class2_Sub2_Sub16 method4242(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub16 local10 = (Class2_Sub2_Sub16) Static596.aClass47_4.method912((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static210.aClass380_53.method8620(arg0, 0);
		if (local27 == null || local27.length <= 1) {
			return null;
		}
		try {
			local10 = Static94.method1465(local27);
		} catch (@Pc(41) Exception local41) {
			throw new RuntimeException(local41.getMessage() + " S: " + arg0);
		}
		Static596.aClass47_4.method915((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/Object;III)[B")
	public static byte[] method4243(@OriginalArg(0) Object arg0, @OriginalArg(3) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return Static284.method3924(arg1, local18);
		} else if (arg0 instanceof Class119) {
			@Pc(30) Class119 local30 = (Class119) arg0;
			return local30.method7518(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method4244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 > 2000 || arg1 > 2000 || arg3 > 2000 || arg8 > 2000 || arg5 > 2000 || arg7 > 2000) {
			return false;
		} else if (arg4 >= -2000 && arg1 >= -2000 && arg3 >= -2000 && arg8 >= -2000 && arg5 >= -2000 && arg7 >= -2000) {
			@Pc(69) int local69;
			if (Static176.anInt3095 == 2) {
				local69 = arg8 + arg4 * Static278.anInt4447;
				if (local69 >= 0 && Static269.anIntArray287.length > local69 && (arg2 << 8) - 38400 < Static269.anIntArray287[local69]) {
					return false;
				}
				local69 = arg5 + Static278.anInt4447 * arg1;
				if (local69 >= 0 && local69 < Static269.anIntArray287.length && Static269.anIntArray287[local69] > (arg6 << 8) - 38400) {
					return false;
				}
				local69 = arg7 + Static278.anInt4447 * arg3;
				if (local69 >= 0 && Static269.anIntArray287.length > local69 && (arg0 << 8) - 38400 < Static269.anIntArray287[local69]) {
					return false;
				}
			}
			local69 = arg5 - arg8;
			@Pc(157) int local157 = arg1 - arg4;
			@Pc(162) int local162 = arg7 - arg8;
			@Pc(166) int local166 = arg3 - arg4;
			@Pc(171) int local171 = arg6 - arg2;
			@Pc(176) int local176 = arg0 - arg2;
			if (arg4 < arg1 && arg3 > arg3) {
				arg4--;
				if (arg1 <= arg3) {
					arg3++;
				} else {
					arg1++;
				}
			} else if (arg3 > arg1) {
				if (arg4 > arg3) {
					arg4++;
				} else {
					arg3++;
				}
				arg1--;
			} else {
				if (arg1 >= arg4) {
					arg1++;
				} else {
					arg4++;
				}
				arg3--;
			}
			@Pc(231) int local231 = 0;
			if (arg4 != arg1) {
				local231 = (arg5 - arg8 << 12) / (arg1 - arg4);
			}
			@Pc(248) int local248 = 0;
			if (arg1 != arg3) {
				local248 = (arg7 - arg5 << 12) / (arg3 - arg1);
			}
			@Pc(274) int local274 = 0;
			if (arg3 != arg4) {
				local274 = (arg8 - arg7 << 12) / (arg4 - arg3);
			}
			@Pc(301) int local301 = local166 * local69 - local162 * local157;
			if (local301 == 0) {
				return false;
			}
			@Pc(321) int local321 = (local166 * local171 - local157 * local176 << 8) / local301;
			@Pc(334) int local334 = (local69 * local176 - local171 * local162 << 8) / local301;
			if (arg1 >= arg4 && arg3 >= arg4) {
				if (Static585.anInt9543 <= arg4) {
					return true;
				}
				arg2 = local321 + (arg2 << 8) - local321 * arg8;
				if (arg1 > Static585.anInt9543) {
					arg1 = Static585.anInt9543;
				}
				if (arg3 > Static585.anInt9543) {
					arg3 = Static585.anInt9543;
				}
				if (arg1 >= arg3) {
					arg5 = arg8 <<= 0xC;
					arg7 <<= 0xC;
					if (arg4 < 0) {
						arg5 -= arg4 * local274;
						arg8 -= arg4 * local231;
						arg2 -= arg4 * local334;
						arg4 = 0;
					}
					if (arg3 < 0) {
						arg7 -= arg3 * local248;
						arg3 = 0;
					}
					if ((arg4 == arg3 || local274 >= local231) && (arg3 != arg4 || local231 >= local248)) {
						arg1 -= arg3;
						arg3 -= arg4;
						arg4 = Static278.anInt4447 * arg4;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static201.method2852(local321, (arg7 >> 12) + 1, arg4, arg2, Static269.anIntArray287, (arg8 >> 12) - 1)) {
										return false;
									}
									arg2 += local334;
									arg4 += Static278.anInt4447;
									arg7 += local248;
									arg8 += local231;
								}
							}
							if (!Static201.method2852(local321, (arg5 >> 12) + 1, arg4, arg2, Static269.anIntArray287, (arg8 >> 12) - 1)) {
								return false;
							}
							arg2 += local334;
							arg8 += local231;
							arg5 += local274;
							arg4 += Static278.anInt4447;
						}
					} else {
						arg1 -= arg3;
						arg3 -= arg4;
						arg4 = Static278.anInt4447 * arg4;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static201.method2852(local321, (arg8 >> 12) + 1, arg4, arg2, Static269.anIntArray287, (arg7 >> 12) - 1)) {
										return false;
									}
									arg7 += local248;
									arg8 += local231;
									arg4 += Static278.anInt4447;
									arg2 += local334;
								}
							}
							if (!Static201.method2852(local321, (arg8 >> 12) + 1, arg4, arg2, Static269.anIntArray287, (arg5 >> 12) - 1)) {
								return false;
							}
							arg8 += local231;
							arg4 += Static278.anInt4447;
							arg5 += local274;
							arg2 += local334;
						}
					}
				} else {
					arg7 = arg8 <<= 0xC;
					arg5 <<= 0xC;
					if (arg4 < 0) {
						arg8 -= arg4 * local231;
						arg2 -= local334 * arg4;
						arg7 -= local274 * arg4;
						arg4 = 0;
					}
					if (arg1 < 0) {
						arg5 -= local248 * arg1;
						arg1 = 0;
					}
					if (arg1 != arg4 && local231 > local274 || arg4 == arg1 && local274 > local248) {
						arg3 -= arg1;
						arg1 -= arg4;
						arg4 *= Static278.anInt4447;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static201.method2852(local321, (arg5 >> 12) + 1, arg4, arg2, Static269.anIntArray287, (arg7 >> 12) - 1)) {
										return false;
									}
									arg2 += local334;
									arg4 += Static278.anInt4447;
									arg5 += local248;
									arg7 += local274;
								}
							}
							if (!Static201.method2852(local321, (arg8 >> 12) + 1, arg4, arg2, Static269.anIntArray287, (arg7 >> 12) - 1)) {
								return false;
							}
							arg8 += local231;
							arg7 += local274;
							arg4 += Static278.anInt4447;
							arg2 += local334;
						}
					} else {
						arg3 -= arg1;
						arg1 -= arg4;
						arg4 = Static278.anInt4447 * arg4;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static201.method2852(local321, (arg7 >> 12) + 1, arg4, arg2, Static269.anIntArray287, (arg5 >> 12) - 1)) {
										return false;
									}
									arg4 += Static278.anInt4447;
									arg5 += local248;
									arg7 += local274;
									arg2 += local334;
								}
							}
							if (!Static201.method2852(local321, (arg7 >> 12) + 1, arg4, arg2, Static269.anIntArray287, (arg8 >> 12) - 1)) {
								return false;
							}
							arg4 += Static278.anInt4447;
							arg7 += local274;
							arg2 += local334;
							arg8 += local231;
						}
					}
				}
			} else if (arg3 >= arg1) {
				if (arg1 >= Static585.anInt9543) {
					return true;
				}
				if (Static585.anInt9543 < arg3) {
					arg3 = Static585.anInt9543;
				}
				if (Static585.anInt9543 < arg4) {
					arg4 = Static585.anInt9543;
				}
				arg6 = local321 + (arg6 << 8) - local321 * arg5;
				if (arg4 <= arg3) {
					arg7 = arg5 <<= 0xC;
					if (arg1 < 0) {
						arg5 -= arg1 * local248;
						arg7 -= arg1 * local231;
						arg6 -= local334 * arg1;
						arg1 = 0;
					}
					arg8 <<= 0xC;
					if (arg4 < 0) {
						arg8 -= local274 * arg4;
						arg4 = 0;
					}
					if (local231 < local248) {
						arg3 -= arg4;
						arg4 -= arg1;
						arg1 *= Static278.anInt4447;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static201.method2852(local321, (arg5 >> 12) + 1, arg1, arg6, Static269.anIntArray287, (arg8 >> 12) - 1)) {
										return false;
									}
									arg1 += Static278.anInt4447;
									arg5 += local248;
									arg6 += local334;
									arg8 += local274;
								}
							}
							if (!Static201.method2852(local321, (arg5 >> 12) + 1, arg1, arg6, Static269.anIntArray287, (arg7 >> 12) - 1)) {
								return false;
							}
							arg7 += local231;
							arg6 += local334;
							arg5 += local248;
							arg1 += Static278.anInt4447;
						}
					} else {
						arg3 -= arg4;
						arg4 -= arg1;
						arg1 *= Static278.anInt4447;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static201.method2852(local321, (arg8 >> 12) + 1, arg1, arg6, Static269.anIntArray287, (arg5 >> 12) - 1)) {
										return false;
									}
									arg5 += local248;
									arg8 += local274;
									arg1 += Static278.anInt4447;
									arg6 += local334;
								}
							}
							if (!Static201.method2852(local321, (arg7 >> 12) + 1, arg1, arg6, Static269.anIntArray287, (arg5 >> 12) - 1)) {
								return false;
							}
							arg1 += Static278.anInt4447;
							arg6 += local334;
							arg5 += local248;
							arg7 += local231;
						}
					}
				} else {
					arg8 = arg5 <<= 0xC;
					arg7 <<= 0xC;
					if (arg1 < 0) {
						arg6 -= arg1 * local334;
						arg5 -= arg1 * local248;
						arg8 -= arg1 * local231;
						arg1 = 0;
					}
					if (arg3 < 0) {
						arg7 -= arg3 * local274;
						arg3 = 0;
					}
					if (arg1 != arg3 && local248 > local231 || arg1 == arg3 && local274 < local231) {
						arg4 -= arg3;
						arg3 -= arg1;
						arg1 *= Static278.anInt4447;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static201.method2852(local321, (arg7 >> 12) + 1, arg1, arg6, Static269.anIntArray287, (arg8 >> 12) - 1)) {
										return false;
									}
									arg8 += local231;
									arg6 += local334;
									arg7 += local274;
									arg1 += Static278.anInt4447;
								}
							}
							if (!Static201.method2852(local321, (arg5 >> 12) + 1, arg1, arg6, Static269.anIntArray287, (arg8 >> 12) - 1)) {
								return false;
							}
							arg1 += Static278.anInt4447;
							arg5 += local248;
							arg6 += local334;
							arg8 += local231;
						}
					} else {
						arg4 -= arg3;
						arg3 -= arg1;
						arg1 = Static278.anInt4447 * arg1;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static201.method2852(local321, (arg8 >> 12) + 1, arg1, arg6, Static269.anIntArray287, (arg7 >> 12) - 1)) {
										return false;
									}
									arg8 += local231;
									arg7 += local274;
									arg1 += Static278.anInt4447;
									arg6 += local334;
								}
							}
							if (!Static201.method2852(local321, (arg8 >> 12) + 1, arg1, arg6, Static269.anIntArray287, (arg5 >> 12) - 1)) {
								return false;
							}
							arg8 += local231;
							arg5 += local248;
							arg6 += local334;
							arg1 += Static278.anInt4447;
						}
					}
				}
			} else if (Static585.anInt9543 <= arg3) {
				return true;
			} else {
				if (arg1 > Static585.anInt9543) {
					arg1 = Static585.anInt9543;
				}
				if (arg4 > Static585.anInt9543) {
					arg4 = Static585.anInt9543;
				}
				arg0 = local321 + (arg0 << 8) - local321 * arg7;
				if (arg4 >= arg1) {
					arg8 = arg7 <<= 0xC;
					if (arg3 < 0) {
						arg7 -= local274 * arg3;
						arg0 -= arg3 * local334;
						arg8 -= local248 * arg3;
						arg3 = 0;
					}
					arg5 <<= 0xC;
					if (arg1 < 0) {
						arg5 -= local231 * arg1;
						arg1 = 0;
					}
					if (local248 < local274) {
						arg4 -= arg1;
						arg1 -= arg3;
						arg3 = Static278.anInt4447 * arg3;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static201.method2852(local321, (arg7 >> 12) + 1, arg3, arg0, Static269.anIntArray287, (arg5 >> 12) - 1)) {
										return false;
									}
									arg3 += Static278.anInt4447;
									arg7 += local274;
									arg5 += local231;
									arg0 += local334;
								}
							}
							if (!Static201.method2852(local321, (arg7 >> 12) + 1, arg3, arg0, Static269.anIntArray287, (arg8 >> 12) - 1)) {
								return false;
							}
							arg7 += local274;
							arg8 += local248;
							arg0 += local334;
							arg3 += Static278.anInt4447;
						}
					} else {
						arg4 -= arg1;
						arg1 -= arg3;
						arg3 = Static278.anInt4447 * arg3;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static201.method2852(local321, (arg5 >> 12) + 1, arg3, arg0, Static269.anIntArray287, (arg7 >> 12) - 1)) {
										return false;
									}
									arg7 += local274;
									arg0 += local334;
									arg3 += Static278.anInt4447;
									arg5 += local231;
								}
							}
							if (!Static201.method2852(local321, (arg8 >> 12) + 1, arg3, arg0, Static269.anIntArray287, (arg7 >> 12) - 1)) {
								return false;
							}
							arg8 += local248;
							arg3 += Static278.anInt4447;
							arg7 += local274;
							arg0 += local334;
						}
					}
				} else {
					arg5 = arg7 <<= 0xC;
					if (arg3 < 0) {
						arg7 -= local274 * arg3;
						arg0 -= local334 * arg3;
						arg5 -= local248 * arg3;
						arg3 = 0;
					}
					arg8 <<= 0xC;
					if (arg4 < 0) {
						arg8 -= arg4 * local231;
						arg4 = 0;
					}
					if (local248 < local274) {
						arg1 -= arg4;
						arg4 -= arg3;
						arg3 *= Static278.anInt4447;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static201.method2852(local321, (arg8 >> 12) + 1, arg3, arg0, Static269.anIntArray287, (arg5 >> 12) - 1)) {
										return false;
									}
									arg3 += Static278.anInt4447;
									arg0 += local334;
									arg8 += local231;
									arg5 += local248;
								}
							}
							if (!Static201.method2852(local321, (arg7 >> 12) + 1, arg3, arg0, Static269.anIntArray287, (arg5 >> 12) - 1)) {
								return false;
							}
							arg7 += local274;
							arg0 += local334;
							arg5 += local248;
							arg3 += Static278.anInt4447;
						}
					} else {
						arg1 -= arg4;
						arg4 -= arg3;
						arg3 *= Static278.anInt4447;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static201.method2852(local321, (arg5 >> 12) + 1, arg3, arg0, Static269.anIntArray287, (arg8 >> 12) - 1)) {
										return false;
									}
									arg5 += local248;
									arg3 += Static278.anInt4447;
									arg8 += local231;
									arg0 += local334;
								}
							}
							if (!Static201.method2852(local321, (arg5 >> 12) + 1, arg3, arg0, Static269.anIntArray287, (arg7 >> 12) - 1)) {
								return false;
							}
							arg3 += Static278.anInt4447;
							arg7 += local274;
							arg0 += local334;
							arg5 += local248;
						}
					}
				}
			}
		} else {
			return false;
		}
	}
}
