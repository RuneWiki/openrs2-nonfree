import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static619 {

	@OriginalMember(owner = "client!vaa", name = "f", descriptor = "Lclient!eba;")
	public static Class94 aClass94_2;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "Z")
	public static boolean aBoolean858 = false;

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_98 = new Class305(89, 2);

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method8410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 > 2000 || arg0 > 2000 || arg7 > 2000 || arg6 > 2000 || arg2 > 2000 || arg4 > 2000) {
			return false;
		} else if (arg3 >= -2000 && arg0 >= -2000 && arg7 >= -2000 && arg6 >= -2000 && arg2 >= -2000 && arg4 >= -2000) {
			@Pc(60) int local60;
			if (Static203.anInt3866 == 2) {
				local60 = arg3 * Static552.anInt9017 + arg6;
				if (local60 >= 0 && local60 < Static595.anIntArray540.length && Static595.anIntArray540[local60] > (arg8 << 8) - 38400) {
					return false;
				}
				local60 = Static552.anInt9017 * arg0 + arg2;
				if (local60 >= 0 && local60 < Static595.anIntArray540.length && Static595.anIntArray540[local60] > (arg1 << 8) - 38400) {
					return false;
				}
				local60 = Static552.anInt9017 * arg7 + arg4;
				if (local60 >= 0 && Static595.anIntArray540.length > local60 && (arg5 << 8) - 38400 < Static595.anIntArray540[local60]) {
					return false;
				}
			}
			local60 = arg2 - arg6;
			@Pc(152) int local152 = arg0 - arg3;
			@Pc(156) int local156 = arg4 - arg6;
			@Pc(161) int local161 = arg7 - arg3;
			@Pc(166) int local166 = arg1 - arg8;
			@Pc(170) int local170 = arg5 - arg8;
			if (arg3 < arg0 && arg7 > arg7) {
				arg3--;
				if (arg7 < arg0) {
					arg0++;
				} else {
					arg7++;
				}
			} else if (arg0 >= arg7) {
				if (arg0 < arg3) {
					arg3++;
				} else {
					arg0++;
				}
				arg7--;
			} else {
				if (arg7 >= arg3) {
					arg7++;
				} else {
					arg3++;
				}
				arg0--;
			}
			@Pc(216) int local216 = 0;
			if (arg0 != arg3) {
				local216 = (arg2 - arg6 << 12) / (arg0 - arg3);
			}
			@Pc(240) int local240 = 0;
			if (arg7 != arg0) {
				local240 = (arg4 - arg2 << 12) / (arg7 - arg0);
			}
			@Pc(257) int local257 = 0;
			if (arg7 != arg3) {
				local257 = (arg6 - arg4 << 12) / (arg3 - arg7);
			}
			@Pc(281) int local281 = local161 * local60 - local156 * local152;
			if (local281 == 0) {
				return false;
			}
			@Pc(301) int local301 = (local166 * local161 - local170 * local152 << 8) / local281;
			@Pc(314) int local314 = (local60 * local170 - local156 * local166 << 8) / local281;
			if (arg3 <= arg0 && arg7 >= arg3) {
				if (arg3 >= Static150.anInt3079) {
					return true;
				}
				if (arg7 > Static150.anInt3079) {
					arg7 = Static150.anInt3079;
				}
				arg8 = local301 + (arg8 << 8) - arg6 * local301;
				if (Static150.anInt3079 < arg0) {
					arg0 = Static150.anInt3079;
				}
				if (arg7 <= arg0) {
					arg2 = arg6 <<= 0xC;
					arg4 <<= 0xC;
					if (arg3 < 0) {
						arg6 -= local216 * arg3;
						arg2 -= local257 * arg3;
						arg8 -= local314 * arg3;
						arg3 = 0;
					}
					if (arg7 < 0) {
						arg4 -= local240 * arg7;
						arg7 = 0;
					}
					if ((arg7 == arg3 || local257 >= local216) && (arg3 != arg7 || local216 >= local240)) {
						arg0 -= arg7;
						arg7 -= arg3;
						arg3 = Static552.anInt9017 * arg3;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static97.method1948(arg3, (arg6 >> 12) - 1, (arg4 >> 12) + 1, local301, arg8, Static595.anIntArray540)) {
										return false;
									}
									arg6 += local216;
									arg4 += local240;
									arg3 += Static552.anInt9017;
									arg8 += local314;
								}
							}
							if (!Static97.method1948(arg3, (arg6 >> 12) - 1, (arg2 >> 12) + 1, local301, arg8, Static595.anIntArray540)) {
								return false;
							}
							arg8 += local314;
							arg2 += local257;
							arg6 += local216;
							arg3 += Static552.anInt9017;
						}
					} else {
						arg0 -= arg7;
						arg7 -= arg3;
						arg3 = Static552.anInt9017 * arg3;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static97.method1948(arg3, (arg4 >> 12) - 1, (arg6 >> 12) + 1, local301, arg8, Static595.anIntArray540)) {
										return false;
									}
									arg3 += Static552.anInt9017;
									arg4 += local240;
									arg8 += local314;
									arg6 += local216;
								}
							}
							if (!Static97.method1948(arg3, (arg2 >> 12) - 1, (arg6 >> 12) + 1, local301, arg8, Static595.anIntArray540)) {
								return false;
							}
							arg3 += Static552.anInt9017;
							arg6 += local216;
							arg2 += local257;
							arg8 += local314;
						}
					}
				} else {
					arg4 = arg6 <<= 0xC;
					if (arg3 < 0) {
						arg8 -= arg3 * local314;
						arg4 -= local257 * arg3;
						arg6 -= arg3 * local216;
						arg3 = 0;
					}
					arg2 <<= 0xC;
					if (arg0 < 0) {
						arg2 -= local240 * arg0;
						arg0 = 0;
					}
					if (arg0 != arg3 && local216 > local257 || arg0 == arg3 && local257 > local240) {
						arg7 -= arg0;
						arg0 -= arg3;
						arg3 *= Static552.anInt9017;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static97.method1948(arg3, (arg4 >> 12) - 1, (arg2 >> 12) + 1, local301, arg8, Static595.anIntArray540)) {
										return false;
									}
									arg3 += Static552.anInt9017;
									arg2 += local240;
									arg4 += local257;
									arg8 += local314;
								}
							}
							if (!Static97.method1948(arg3, (arg4 >> 12) - 1, (arg6 >> 12) + 1, local301, arg8, Static595.anIntArray540)) {
								return false;
							}
							arg4 += local257;
							arg8 += local314;
							arg6 += local216;
							arg3 += Static552.anInt9017;
						}
					} else {
						arg7 -= arg0;
						arg0 -= arg3;
						arg3 *= Static552.anInt9017;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static97.method1948(arg3, (arg2 >> 12) - 1, (arg4 >> 12) - -1, local301, arg8, Static595.anIntArray540)) {
										return false;
									}
									arg3 += Static552.anInt9017;
									arg8 += local314;
									arg2 += local240;
									arg4 += local257;
								}
							}
							if (!Static97.method1948(arg3, (arg6 >> 12) - 1, (arg4 >> 12) + 1, local301, arg8, Static595.anIntArray540)) {
								return false;
							}
							arg6 += local216;
							arg8 += local314;
							arg4 += local257;
							arg3 += Static552.anInt9017;
						}
					}
				}
			} else if (arg0 > arg7) {
				if (arg7 >= Static150.anInt3079) {
					return true;
				}
				if (Static150.anInt3079 < arg3) {
					arg3 = Static150.anInt3079;
				}
				arg5 = local301 + (arg5 << 8) - local301 * arg4;
				if (arg0 > Static150.anInt3079) {
					arg0 = Static150.anInt3079;
				}
				if (arg3 >= arg0) {
					arg6 = arg4 <<= 0xC;
					if (arg7 < 0) {
						arg5 -= arg7 * local314;
						arg6 -= arg7 * local240;
						arg4 -= local257 * arg7;
						arg7 = 0;
					}
					arg2 <<= 0xC;
					if (arg0 < 0) {
						arg2 -= local216 * arg0;
						arg0 = 0;
					}
					if (local257 > local240) {
						arg3 -= arg0;
						arg0 -= arg7;
						arg7 = Static552.anInt9017 * arg7;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static97.method1948(arg7, (arg2 >> 12) - 1, (arg4 >> 12) + 1, local301, arg5, Static595.anIntArray540)) {
										return false;
									}
									arg7 += Static552.anInt9017;
									arg5 += local314;
									arg4 += local257;
									arg2 += local216;
								}
							}
							if (!Static97.method1948(arg7, (arg6 >> 12) - 1, (arg4 >> 12) - -1, local301, arg5, Static595.anIntArray540)) {
								return false;
							}
							arg7 += Static552.anInt9017;
							arg6 += local240;
							arg5 += local314;
							arg4 += local257;
						}
					} else {
						arg3 -= arg0;
						arg0 -= arg7;
						arg7 *= Static552.anInt9017;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static97.method1948(arg7, (arg4 >> 12) - 1, (arg2 >> 12) + 1, local301, arg5, Static595.anIntArray540)) {
										return false;
									}
									arg7 += Static552.anInt9017;
									arg5 += local314;
									arg4 += local257;
									arg2 += local216;
								}
							}
							if (!Static97.method1948(arg7, (arg4 >> 12) - 1, (arg6 >> 12) + 1, local301, arg5, Static595.anIntArray540)) {
								return false;
							}
							arg4 += local257;
							arg7 += Static552.anInt9017;
							arg6 += local240;
							arg5 += local314;
						}
					}
				} else {
					arg2 = arg4 <<= 0xC;
					arg6 <<= 0xC;
					if (arg7 < 0) {
						arg4 -= local257 * arg7;
						arg2 -= arg7 * local240;
						arg5 -= arg7 * local314;
						arg7 = 0;
					}
					if (arg3 < 0) {
						arg6 -= arg3 * local216;
						arg3 = 0;
					}
					if (local257 > local240) {
						arg0 -= arg3;
						arg3 -= arg7;
						arg7 = Static552.anInt9017 * arg7;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static97.method1948(arg7, (arg2 >> 12) - 1, (arg6 >> 12) + 1, local301, arg5, Static595.anIntArray540)) {
										return false;
									}
									arg7 += Static552.anInt9017;
									arg5 += local314;
									arg6 += local216;
									arg2 += local240;
								}
							}
							if (!Static97.method1948(arg7, (arg2 >> 12) - 1, (arg4 >> 12) - -1, local301, arg5, Static595.anIntArray540)) {
								return false;
							}
							arg2 += local240;
							arg4 += local257;
							arg5 += local314;
							arg7 += Static552.anInt9017;
						}
					} else {
						arg0 -= arg3;
						arg3 -= arg7;
						arg7 *= Static552.anInt9017;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static97.method1948(arg7, (arg6 >> 12) - 1, (arg2 >> 12) + 1, local301, arg5, Static595.anIntArray540)) {
										return false;
									}
									arg7 += Static552.anInt9017;
									arg5 += local314;
									arg2 += local240;
									arg6 += local216;
								}
							}
							if (!Static97.method1948(arg7, (arg4 >> 12) - 1, (arg2 >> 12) - -1, local301, arg5, Static595.anIntArray540)) {
								return false;
							}
							arg4 += local257;
							arg5 += local314;
							arg7 += Static552.anInt9017;
							arg2 += local240;
						}
					}
				}
			} else if (Static150.anInt3079 <= arg0) {
				return true;
			} else {
				if (arg3 > Static150.anInt3079) {
					arg3 = Static150.anInt3079;
				}
				arg1 = (arg1 << 8) + local301 - arg2 * local301;
				if (arg7 > Static150.anInt3079) {
					arg7 = Static150.anInt3079;
				}
				if (arg7 >= arg3) {
					arg4 = arg2 <<= 0xC;
					arg6 <<= 0xC;
					if (arg0 < 0) {
						arg2 -= arg0 * local240;
						arg4 -= local216 * arg0;
						arg1 -= local314 * arg0;
						arg0 = 0;
					}
					if (arg3 < 0) {
						arg6 -= arg3 * local257;
						arg3 = 0;
					}
					if (local216 >= local240) {
						arg7 -= arg3;
						arg3 -= arg0;
						arg0 = Static552.anInt9017 * arg0;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static97.method1948(arg0, (arg2 >> 12) - 1, (arg6 >> 12) - -1, local301, arg1, Static595.anIntArray540)) {
										return false;
									}
									arg1 += local314;
									arg0 += Static552.anInt9017;
									arg2 += local240;
									arg6 += local257;
								}
							}
							if (!Static97.method1948(arg0, (arg2 >> 12) - 1, (arg4 >> 12) + 1, local301, arg1, Static595.anIntArray540)) {
								return false;
							}
							arg2 += local240;
							arg0 += Static552.anInt9017;
							arg1 += local314;
							arg4 += local216;
						}
					} else {
						arg7 -= arg3;
						arg3 -= arg0;
						arg0 = Static552.anInt9017 * arg0;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static97.method1948(arg0, (arg6 >> 12) - 1, (arg2 >> 12) - -1, local301, arg1, Static595.anIntArray540)) {
										return false;
									}
									arg0 += Static552.anInt9017;
									arg1 += local314;
									arg6 += local257;
									arg2 += local240;
								}
							}
							if (!Static97.method1948(arg0, (arg4 >> 12) - 1, (arg2 >> 12) + 1, local301, arg1, Static595.anIntArray540)) {
								return false;
							}
							arg0 += Static552.anInt9017;
							arg2 += local240;
							arg1 += local314;
							arg4 += local216;
						}
					}
				} else {
					arg6 = arg2 <<= 0xC;
					if (arg0 < 0) {
						arg1 -= local314 * arg0;
						arg6 -= local216 * arg0;
						arg2 -= arg0 * local240;
						arg0 = 0;
					}
					arg4 <<= 0xC;
					if (arg7 < 0) {
						arg4 -= local257 * arg7;
						arg7 = 0;
					}
					if (arg0 != arg7 && local216 < local240 || arg7 == arg0 && local257 < local216) {
						arg3 -= arg7;
						arg7 -= arg0;
						arg0 = Static552.anInt9017 * arg0;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static97.method1948(arg0, (arg6 >> 12) - 1, (arg4 >> 12) + 1, local301, arg1, Static595.anIntArray540)) {
										return false;
									}
									arg1 += local314;
									arg0 += Static552.anInt9017;
									arg4 += local257;
									arg6 += local216;
								}
							}
							if (!Static97.method1948(arg0, (arg6 >> 12) - 1, (arg2 >> 12) + 1, local301, arg1, Static595.anIntArray540)) {
								return false;
							}
							arg6 += local216;
							arg1 += local314;
							arg2 += local240;
							arg0 += Static552.anInt9017;
						}
					} else {
						arg3 -= arg7;
						arg7 -= arg0;
						arg0 *= Static552.anInt9017;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static97.method1948(arg0, (arg4 >> 12) - 1, (arg6 >> 12) - -1, local301, arg1, Static595.anIntArray540)) {
										return false;
									}
									arg0 += Static552.anInt9017;
									arg1 += local314;
									arg6 += local216;
									arg4 += local257;
								}
							}
							if (!Static97.method1948(arg0, (arg2 >> 12) - 1, (arg6 >> 12) + 1, local301, arg1, Static595.anIntArray540)) {
								return false;
							}
							arg0 += Static552.anInt9017;
							arg6 += local216;
							arg1 += local314;
							arg2 += local240;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method8411(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!ko;Lclient!ko;)V")
	public static void method8412(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class5 arg1) {
		if (arg1.aClass5_337 != null) {
			arg1.method9052();
		}
		arg1.aClass5_338 = arg0;
		arg1.aClass5_337 = arg0.aClass5_337;
		arg1.aClass5_337.aClass5_338 = arg1;
		arg1.aClass5_338.aClass5_337 = arg1;
	}
}
