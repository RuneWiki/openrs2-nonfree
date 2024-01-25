import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!gka", name = "b", descriptor = "(IIIIIIIIII)Z")
	public static boolean method3468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 > 2000 || arg3 > 2000 || arg6 > 2000 || arg8 > 2000 || arg7 > 2000 || arg0 > 2000) {
			return false;
		} else if (arg5 >= -2000 && arg3 >= -2000 && arg6 >= -2000 && arg8 >= -2000 && arg7 >= -2000 && arg0 >= -2000) {
			@Pc(84) int local84;
			if (Static577.anInt9465 == 2) {
				local84 = Static95.anInt1572 * arg5 + arg8;
				if (local84 >= 0 && Static261.anIntArray274.length > local84 && (arg2 << 8) - 38400 < Static261.anIntArray274[local84]) {
					return false;
				}
				local84 = arg7 + Static95.anInt1572 * arg3;
				if (local84 >= 0 && Static261.anIntArray274.length > local84 && (arg1 << 8) - 38400 < Static261.anIntArray274[local84]) {
					return false;
				}
				local84 = arg0 + Static95.anInt1572 * arg6;
				if (local84 >= 0 && local84 < Static261.anIntArray274.length && Static261.anIntArray274[local84] > (arg4 << 8) - 38400) {
					return false;
				}
			}
			local84 = arg7 - arg8;
			@Pc(183) int local183 = arg3 - arg5;
			@Pc(188) int local188 = arg0 - arg8;
			@Pc(192) int local192 = arg6 - arg5;
			@Pc(197) int local197 = arg1 - arg2;
			@Pc(207) int local207 = arg4 - arg2;
			if (arg3 > arg5 && arg6 < arg6) {
				arg5--;
				if (arg6 >= arg3) {
					arg6++;
				} else {
					arg3++;
				}
			} else if (arg3 < arg6) {
				if (arg5 <= arg6) {
					arg6++;
				} else {
					arg5++;
				}
				arg3--;
			} else {
				arg6--;
				if (arg5 > arg3) {
					arg5++;
				} else {
					arg3++;
				}
			}
			@Pc(288) int local288 = 0;
			if (arg3 != arg5) {
				local288 = (arg7 - arg8 << 12) / (arg3 - arg5);
			}
			@Pc(305) int local305 = 0;
			if (arg6 != arg3) {
				local305 = (arg0 - arg7 << 12) / (arg6 - arg3);
			}
			@Pc(321) int local321 = 0;
			if (arg6 != arg5) {
				local321 = (arg8 - arg0 << 12) / (arg5 - arg6);
			}
			@Pc(348) int local348 = local192 * local84 - local188 * local183;
			if (local348 == 0) {
				return false;
			}
			@Pc(366) int local366 = (local197 * local192 - local183 * local207 << 8) / local348;
			@Pc(379) int local379 = (local84 * local207 - local197 * local188 << 8) / local348;
			if (arg3 >= arg5 && arg6 >= arg5) {
				if (Static581.anInt9510 <= arg5) {
					return true;
				}
				arg2 = (arg2 << 8) + local366 - arg8 * local366;
				if (Static581.anInt9510 < arg3) {
					arg3 = Static581.anInt9510;
				}
				if (Static581.anInt9510 < arg6) {
					arg6 = Static581.anInt9510;
				}
				if (arg6 > arg3) {
					arg0 = arg8 <<= 0xC;
					arg7 <<= 0xC;
					if (arg5 < 0) {
						arg2 -= local379 * arg5;
						arg8 -= local288 * arg5;
						arg0 -= local321 * arg5;
						arg5 = 0;
					}
					if (arg3 < 0) {
						arg7 -= arg3 * local305;
						arg3 = 0;
					}
					if ((arg5 == arg3 || local288 <= local321) && (arg3 != arg5 || local321 <= local305)) {
						arg6 -= arg3;
						arg3 -= arg5;
						arg5 = Static95.anInt1572 * arg5;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static523.method7447(Static261.anIntArray274, arg2, (arg0 >> 12) + 1, local366, arg5, (arg7 >> 12) - 1)) {
										return false;
									}
									arg0 += local321;
									arg7 += local305;
									arg2 += local379;
									arg5 += Static95.anInt1572;
								}
							}
							if (!Static523.method7447(Static261.anIntArray274, arg2, (arg0 >> 12) + 1, local366, arg5, (arg8 >> 12) - 1)) {
								return false;
							}
							arg5 += Static95.anInt1572;
							arg0 += local321;
							arg8 += local288;
							arg2 += local379;
						}
					} else {
						arg6 -= arg3;
						arg3 -= arg5;
						arg5 *= Static95.anInt1572;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static523.method7447(Static261.anIntArray274, arg2, (arg7 >> 12) + 1, local366, arg5, (arg0 >> 12) - 1)) {
										return false;
									}
									arg0 += local321;
									arg2 += local379;
									arg7 += local305;
									arg5 += Static95.anInt1572;
								}
							}
							if (!Static523.method7447(Static261.anIntArray274, arg2, (arg8 >> 12) + 1, local366, arg5, (arg0 >> 12) - 1)) {
								return false;
							}
							arg0 += local321;
							arg8 += local288;
							arg2 += local379;
							arg5 += Static95.anInt1572;
						}
					}
				} else {
					arg7 = arg8 <<= 0xC;
					arg0 <<= 0xC;
					if (arg5 < 0) {
						arg8 -= arg5 * local288;
						arg2 -= arg5 * local379;
						arg7 -= arg5 * local321;
						arg5 = 0;
					}
					if (arg6 < 0) {
						arg0 -= arg6 * local305;
						arg6 = 0;
					}
					if ((arg5 == arg6 || local321 >= local288) && (arg5 != arg6 || local305 <= local288)) {
						arg3 -= arg6;
						arg6 -= arg5;
						arg5 = Static95.anInt1572 * arg5;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static523.method7447(Static261.anIntArray274, arg2, (arg0 >> 12) + 1, local366, arg5, (arg8 >> 12) - 1)) {
										return false;
									}
									arg0 += local305;
									arg2 += local379;
									arg5 += Static95.anInt1572;
									arg8 += local288;
								}
							}
							if (!Static523.method7447(Static261.anIntArray274, arg2, (arg7 >> 12) + 1, local366, arg5, (arg8 >> 12) - 1)) {
								return false;
							}
							arg7 += local321;
							arg8 += local288;
							arg2 += local379;
							arg5 += Static95.anInt1572;
						}
					} else {
						arg3 -= arg6;
						arg6 -= arg5;
						arg5 *= Static95.anInt1572;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static523.method7447(Static261.anIntArray274, arg2, (arg8 >> 12) + 1, local366, arg5, (arg0 >> 12) - 1)) {
										return false;
									}
									arg2 += local379;
									arg0 += local305;
									arg8 += local288;
									arg5 += Static95.anInt1572;
								}
							}
							if (!Static523.method7447(Static261.anIntArray274, arg2, (arg8 >> 12) + 1, local366, arg5, (arg7 >> 12) - 1)) {
								return false;
							}
							arg7 += local321;
							arg2 += local379;
							arg8 += local288;
							arg5 += Static95.anInt1572;
						}
					}
				}
			} else if (arg3 <= arg6) {
				if (Static581.anInt9510 <= arg3) {
					return true;
				}
				arg1 = (arg1 << 8) + local366 - local366 * arg7;
				if (Static581.anInt9510 < arg5) {
					arg5 = Static581.anInt9510;
				}
				if (arg6 > Static581.anInt9510) {
					arg6 = Static581.anInt9510;
				}
				if (arg6 >= arg5) {
					arg0 = arg7 <<= 0xC;
					if (arg3 < 0) {
						arg7 -= arg3 * local305;
						arg1 -= local379 * arg3;
						arg0 -= arg3 * local288;
						arg3 = 0;
					}
					arg8 <<= 0xC;
					if (arg5 < 0) {
						arg8 -= arg5 * local321;
						arg5 = 0;
					}
					if (local305 > local288) {
						arg6 -= arg5;
						arg5 -= arg3;
						arg3 = Static95.anInt1572 * arg3;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static523.method7447(Static261.anIntArray274, arg1, (arg7 >> 12) + 1, local366, arg3, (arg8 >> 12) - 1)) {
										return false;
									}
									arg1 += local379;
									arg7 += local305;
									arg8 += local321;
									arg3 += Static95.anInt1572;
								}
							}
							if (!Static523.method7447(Static261.anIntArray274, arg1, (arg7 >> 12) + 1, local366, arg3, (arg0 >> 12) - 1)) {
								return false;
							}
							arg3 += Static95.anInt1572;
							arg1 += local379;
							arg7 += local305;
							arg0 += local288;
						}
					} else {
						arg6 -= arg5;
						arg5 -= arg3;
						arg3 *= Static95.anInt1572;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static523.method7447(Static261.anIntArray274, arg1, (arg8 >> 12) + 1, local366, arg3, (arg7 >> 12) - 1)) {
										return false;
									}
									arg8 += local321;
									arg7 += local305;
									arg1 += local379;
									arg3 += Static95.anInt1572;
								}
							}
							if (!Static523.method7447(Static261.anIntArray274, arg1, (arg0 >> 12) + 1, local366, arg3, (arg7 >> 12) - 1)) {
								return false;
							}
							arg1 += local379;
							arg0 += local288;
							arg7 += local305;
							arg3 += Static95.anInt1572;
						}
					}
				} else {
					arg8 = arg7 <<= 0xC;
					arg0 <<= 0xC;
					if (arg3 < 0) {
						arg1 -= arg3 * local379;
						arg8 -= arg3 * local288;
						arg7 -= arg3 * local305;
						arg3 = 0;
					}
					if (arg6 < 0) {
						arg0 -= local321 * arg6;
						arg6 = 0;
					}
					if (arg3 != arg6 && local288 < local305 || arg3 == arg6 && local288 > local321) {
						arg5 -= arg6;
						arg6 -= arg3;
						arg3 = Static95.anInt1572 * arg3;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static523.method7447(Static261.anIntArray274, arg1, (arg0 >> 12) + 1, local366, arg3, (arg8 >> 12) - 1)) {
										return false;
									}
									arg0 += local321;
									arg8 += local288;
									arg3 += Static95.anInt1572;
									arg1 += local379;
								}
							}
							if (!Static523.method7447(Static261.anIntArray274, arg1, (arg7 >> 12) + 1, local366, arg3, (arg8 >> 12) - 1)) {
								return false;
							}
							arg8 += local288;
							arg7 += local305;
							arg1 += local379;
							arg3 += Static95.anInt1572;
						}
					} else {
						arg5 -= arg6;
						arg6 -= arg3;
						arg3 *= Static95.anInt1572;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static523.method7447(Static261.anIntArray274, arg1, (arg8 >> 12) + 1, local366, arg3, (arg0 >> 12) - 1)) {
										return false;
									}
									arg0 += local321;
									arg8 += local288;
									arg1 += local379;
									arg3 += Static95.anInt1572;
								}
							}
							if (!Static523.method7447(Static261.anIntArray274, arg1, (arg8 >> 12) + 1, local366, arg3, (arg7 >> 12) - 1)) {
								return false;
							}
							arg1 += local379;
							arg7 += local305;
							arg3 += Static95.anInt1572;
							arg8 += local288;
						}
					}
				}
			} else if (Static581.anInt9510 <= arg6) {
				return true;
			} else {
				if (Static581.anInt9510 < arg5) {
					arg5 = Static581.anInt9510;
				}
				if (arg3 > Static581.anInt9510) {
					arg3 = Static581.anInt9510;
				}
				arg4 = (arg4 << 8) + local366 - local366 * arg0;
				if (arg3 > arg5) {
					arg7 = arg0 <<= 0xC;
					if (arg6 < 0) {
						arg7 -= local305 * arg6;
						arg4 -= arg6 * local379;
						arg0 -= local321 * arg6;
						arg6 = 0;
					}
					arg8 <<= 0xC;
					if (arg5 < 0) {
						arg8 -= arg5 * local288;
						arg5 = 0;
					}
					if (local321 <= local305) {
						arg3 -= arg5;
						arg5 -= arg6;
						arg6 = Static95.anInt1572 * arg6;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static523.method7447(Static261.anIntArray274, arg4, (arg7 >> 12) + 1, local366, arg6, (arg8 >> 12) - 1)) {
										return false;
									}
									arg7 += local305;
									arg6 += Static95.anInt1572;
									arg4 += local379;
									arg8 += local288;
								}
							}
							if (!Static523.method7447(Static261.anIntArray274, arg4, (arg7 >> 12) + 1, local366, arg6, (arg0 >> 12) - 1)) {
								return false;
							}
							arg6 += Static95.anInt1572;
							arg7 += local305;
							arg0 += local321;
							arg4 += local379;
						}
					} else {
						arg3 -= arg5;
						arg5 -= arg6;
						arg6 *= Static95.anInt1572;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static523.method7447(Static261.anIntArray274, arg4, (arg8 >> 12) + 1, local366, arg6, (arg7 >> 12) - 1)) {
										return false;
									}
									arg8 += local288;
									arg4 += local379;
									arg6 += Static95.anInt1572;
									arg7 += local305;
								}
							}
							if (!Static523.method7447(Static261.anIntArray274, arg4, (arg0 >> 12) + 1, local366, arg6, (arg7 >> 12) - 1)) {
								return false;
							}
							arg7 += local305;
							arg4 += local379;
							arg6 += Static95.anInt1572;
							arg0 += local321;
						}
					}
				} else {
					arg8 = arg0 <<= 0xC;
					arg7 <<= 0xC;
					if (arg6 < 0) {
						arg0 -= arg6 * local321;
						arg8 -= local305 * arg6;
						arg4 -= arg6 * local379;
						arg6 = 0;
					}
					if (arg3 < 0) {
						arg7 -= local288 * arg3;
						arg3 = 0;
					}
					if (local305 < local321) {
						arg5 -= arg3;
						arg3 -= arg6;
						arg6 *= Static95.anInt1572;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static523.method7447(Static261.anIntArray274, arg4, (arg0 >> 12) + 1, local366, arg6, (arg7 >> 12) - 1)) {
										return false;
									}
									arg0 += local321;
									arg7 += local288;
									arg6 += Static95.anInt1572;
									arg4 += local379;
								}
							}
							if (!Static523.method7447(Static261.anIntArray274, arg4, (arg0 >> 12) + 1, local366, arg6, (arg8 >> 12) - 1)) {
								return false;
							}
							arg0 += local321;
							arg8 += local305;
							arg6 += Static95.anInt1572;
							arg4 += local379;
						}
					} else {
						arg5 -= arg3;
						arg3 -= arg6;
						arg6 *= Static95.anInt1572;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static523.method7447(Static261.anIntArray274, arg4, (arg7 >> 12) + 1, local366, arg6, (arg0 >> 12) - 1)) {
										return false;
									}
									arg7 += local288;
									arg6 += Static95.anInt1572;
									arg4 += local379;
									arg0 += local321;
								}
							}
							if (!Static523.method7447(Static261.anIntArray274, arg4, (arg8 >> 12) + 1, local366, arg6, (arg0 >> 12) - 1)) {
								return false;
							}
							arg6 += Static95.anInt1572;
							arg0 += local321;
							arg4 += local379;
							arg8 += local305;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(ILclient!rba;)Lclient!aka;")
	public static Class14_Sub1 method3469(@OriginalArg(1) Class3_Sub28 arg0) {
		@Pc(7) Class14 local7 = Static449.method6665(arg0);
		@Pc(11) int local11 = arg0.method5294();
		return new Class14_Sub1(local7.anInt354, local7.aClass304_2, local7.aClass216_2, local7.anInt357, local7.anInt359, local11);
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(IIII)I")
	public static int method3470(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg0;
		@Pc(13) int local13 = arg0 - 1 & arg2;
		@Pc(17) int local17 = arg1 / arg0;
		@Pc(23) int local23 = arg1 & arg0 - 1;
		@Pc(28) int local28 = Static173.method2693(local7, local17);
		@Pc(35) int local35 = Static173.method2693(local7 + 1, local17);
		@Pc(42) int local42 = Static173.method2693(local7, local17 + 1);
		@Pc(68) int local68 = Static173.method2693(local7 + 1, local17 - -1);
		@Pc(75) int local75 = Static181.method2787(local35, local28, arg0, local13);
		@Pc(82) int local82 = Static181.method2787(local68, local42, arg0, local13);
		return Static181.method2787(local82, local75, arg0, local23);
	}
}
