import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!il", name = "f", descriptor = "Lclient!f;")
	public static Class22 aClass22_21;

	@OriginalMember(owner = "client!il", name = "g", descriptor = "[Lclient!vh;")
	public static Class342[] aClass342Array1;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_41 = new Class70(28, -1);

	@OriginalMember(owner = "client!il", name = "e", descriptor = "I")
	public static int anInt4237 = 0;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIZIIIII)Z")
	public static boolean method3411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 > 2000 || arg0 > 2000 || arg6 > 2000 || arg7 > 2000 || arg2 > 2000 || arg8 > 2000) {
			return false;
		} else if (arg1 >= -2000 && arg0 >= -2000 && arg6 >= -2000 && arg7 >= -2000 && arg2 >= -2000 && arg8 >= -2000) {
			@Pc(69) int local69;
			if (Static444.anInt5044 == 2) {
				local69 = arg7 + arg1 * Static371.anInt6168;
				if (local69 >= 0 && local69 < Static105.anIntArray185.length && (arg4 << 8) - 15360 < Static105.anIntArray185[local69]) {
					return false;
				}
				local69 = arg2 + arg0 * Static371.anInt6168;
				if (local69 >= 0 && local69 < Static105.anIntArray185.length && (arg3 << 8) - 15360 < Static105.anIntArray185[local69]) {
					return false;
				}
				local69 = Static371.anInt6168 * arg6 + arg8;
				if (local69 >= 0 && local69 < Static105.anIntArray185.length && Static105.anIntArray185[local69] > (arg5 << 8) - 15360) {
					return false;
				}
			}
			local69 = arg2 - arg7;
			@Pc(160) int local160 = arg0 - arg1;
			@Pc(165) int local165 = arg8 - arg7;
			@Pc(170) int local170 = arg6 - arg1;
			@Pc(175) int local175 = arg3 - arg4;
			@Pc(180) int local180 = arg5 - arg4;
			if (arg0 > arg1 && arg6 > arg6) {
				if (arg6 >= arg0) {
					arg6++;
				} else {
					arg0++;
				}
				arg1--;
			} else if (arg6 <= arg0) {
				if (arg1 <= arg0) {
					arg0++;
				} else {
					arg1++;
				}
				arg6--;
			} else {
				if (arg6 < arg1) {
					arg1++;
				} else {
					arg6++;
				}
				arg0--;
			}
			@Pc(231) int local231 = 0;
			if (arg0 != arg1) {
				local231 = (arg2 - arg7 << 12) / (arg0 - arg1);
			}
			@Pc(248) int local248 = 0;
			if (arg6 != arg0) {
				local248 = (arg8 - arg2 << 12) / (arg6 - arg0);
			}
			@Pc(263) int local263 = 0;
			if (arg6 != arg1) {
				local263 = (arg7 - arg8 << 12) / (arg1 - arg6);
			}
			@Pc(291) int local291 = local170 * local69 - local160 * local165;
			if (local291 == 0) {
				return false;
			}
			@Pc(308) int local308 = (local175 * local170 - local180 * local160 << 8) / local291;
			@Pc(320) int local320 = (local180 * local69 - local165 * local175 << 8) / local291;
			if (arg1 <= arg0 && arg6 >= arg1) {
				if (Static558.anInt9341 <= arg1) {
					return true;
				}
				if (arg0 > Static558.anInt9341) {
					arg0 = Static558.anInt9341;
				}
				arg4 = local308 + (arg4 << 8) - local308 * arg7;
				if (Static558.anInt9341 < arg6) {
					arg6 = Static558.anInt9341;
				}
				if (arg0 < arg6) {
					arg8 = arg7 <<= 0xC;
					arg2 <<= 0xC;
					if (arg1 < 0) {
						arg4 -= local320 * arg1;
						arg7 -= arg1 * local231;
						arg8 -= arg1 * local263;
						arg1 = 0;
					}
					if (arg0 < 0) {
						arg2 -= local248 * arg0;
						arg0 = 0;
					}
					if ((arg1 == arg0 || local263 >= local231) && (arg1 != arg0 || local263 <= local248)) {
						arg6 -= arg0;
						arg0 -= arg1;
						arg1 *= Static371.anInt6168;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static288.method4082(Static105.anIntArray185, arg1, arg4, (arg8 >> 12) + 1, (arg2 >> 12) + -1, local308)) {
										return false;
									}
									arg1 += Static371.anInt6168;
									arg2 += local248;
									arg4 += local320;
									arg8 += local263;
								}
							}
							if (!Static288.method4082(Static105.anIntArray185, arg1, arg4, (arg8 >> 12) + 1, (arg7 >> 12) + -1, local308)) {
								return false;
							}
							arg1 += Static371.anInt6168;
							arg8 += local263;
							arg7 += local231;
							arg4 += local320;
						}
					} else {
						arg6 -= arg0;
						arg0 -= arg1;
						arg1 = Static371.anInt6168 * arg1;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static288.method4082(Static105.anIntArray185, arg1, arg4, (arg2 >> 12) + 1, (arg8 >> 12) + -1, local308)) {
										return false;
									}
									arg4 += local320;
									arg1 += Static371.anInt6168;
									arg2 += local248;
									arg8 += local263;
								}
							}
							if (!Static288.method4082(Static105.anIntArray185, arg1, arg4, (arg7 >> 12) + 1, (arg8 >> 12) - 1, local308)) {
								return false;
							}
							arg4 += local320;
							arg8 += local263;
							arg1 += Static371.anInt6168;
							arg7 += local231;
						}
					}
				} else {
					arg2 = arg7 <<= 0xC;
					if (arg1 < 0) {
						arg7 -= arg1 * local231;
						arg4 -= local320 * arg1;
						arg2 -= arg1 * local263;
						arg1 = 0;
					}
					arg8 <<= 0xC;
					if (arg6 < 0) {
						arg8 -= arg6 * local248;
						arg6 = 0;
					}
					if (arg1 != arg6 && local231 > local263 || arg1 == arg6 && local231 < local248) {
						arg0 -= arg6;
						arg6 -= arg1;
						arg1 *= Static371.anInt6168;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static288.method4082(Static105.anIntArray185, arg1, arg4, (arg7 >> 12) + 1, (arg8 >> 12) - 1, local308)) {
										return false;
									}
									arg8 += local248;
									arg4 += local320;
									arg7 += local231;
									arg1 += Static371.anInt6168;
								}
							}
							if (!Static288.method4082(Static105.anIntArray185, arg1, arg4, (arg7 >> 12) + 1, (arg2 >> 12) - 1, local308)) {
								return false;
							}
							arg2 += local263;
							arg1 += Static371.anInt6168;
							arg7 += local231;
							arg4 += local320;
						}
					} else {
						arg0 -= arg6;
						arg6 -= arg1;
						arg1 = Static371.anInt6168 * arg1;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static288.method4082(Static105.anIntArray185, arg1, arg4, (arg8 >> 12) + 1, (arg7 >> 12) + -1, local308)) {
										return false;
									}
									arg4 += local320;
									arg1 += Static371.anInt6168;
									arg7 += local231;
									arg8 += local248;
								}
							}
							if (!Static288.method4082(Static105.anIntArray185, arg1, arg4, (arg2 >> 12) + 1, (arg7 >> 12) - 1, local308)) {
								return false;
							}
							arg4 += local320;
							arg2 += local263;
							arg7 += local231;
							arg1 += Static371.anInt6168;
						}
					}
				}
			} else if (arg0 <= arg6) {
				if (Static558.anInt9341 <= arg0) {
					return true;
				}
				if (Static558.anInt9341 < arg1) {
					arg1 = Static558.anInt9341;
				}
				if (Static558.anInt9341 < arg6) {
					arg6 = Static558.anInt9341;
				}
				arg3 = local308 + (arg3 << 8) - arg2 * local308;
				if (arg1 <= arg6) {
					arg8 = arg2 <<= 0xC;
					arg7 <<= 0xC;
					if (arg0 < 0) {
						arg8 -= arg0 * local231;
						arg2 -= local248 * arg0;
						arg3 -= arg0 * local320;
						arg0 = 0;
					}
					if (arg1 < 0) {
						arg7 -= local263 * arg1;
						arg1 = 0;
					}
					if (local248 <= local231) {
						arg6 -= arg1;
						arg1 -= arg0;
						arg0 *= Static371.anInt6168;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static288.method4082(Static105.anIntArray185, arg0, arg3, (arg7 >> 12) + 1, (arg2 >> 12) + -1, local308)) {
										return false;
									}
									arg0 += Static371.anInt6168;
									arg3 += local320;
									arg7 += local263;
									arg2 += local248;
								}
							}
							if (!Static288.method4082(Static105.anIntArray185, arg0, arg3, (arg8 >> 12) + 1, (arg2 >> 12) + -1, local308)) {
								return false;
							}
							arg0 += Static371.anInt6168;
							arg3 += local320;
							arg8 += local231;
							arg2 += local248;
						}
					} else {
						arg6 -= arg1;
						arg1 -= arg0;
						arg0 = Static371.anInt6168 * arg0;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static288.method4082(Static105.anIntArray185, arg0, arg3, (arg2 >> 12) + 1, (arg7 >> 12) - 1, local308)) {
										return false;
									}
									arg3 += local320;
									arg7 += local263;
									arg2 += local248;
									arg0 += Static371.anInt6168;
								}
							}
							if (!Static288.method4082(Static105.anIntArray185, arg0, arg3, (arg2 >> 12) + 1, (arg8 >> 12) - 1, local308)) {
								return false;
							}
							arg3 += local320;
							arg2 += local248;
							arg0 += Static371.anInt6168;
							arg8 += local231;
						}
					}
				} else {
					arg7 = arg2 <<= 0xC;
					arg8 <<= 0xC;
					if (arg0 < 0) {
						arg7 -= local231 * arg0;
						arg2 -= local248 * arg0;
						arg3 -= local320 * arg0;
						arg0 = 0;
					}
					if (arg6 < 0) {
						arg8 -= local263 * arg6;
						arg6 = 0;
					}
					if ((arg6 == arg0 || local248 <= local231) && (arg6 != arg0 || local231 <= local263)) {
						arg1 -= arg6;
						arg6 -= arg0;
						arg0 = Static371.anInt6168 * arg0;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static288.method4082(Static105.anIntArray185, arg0, arg3, (arg7 >> 12) + 1, (arg8 >> 12) + -1, local308)) {
										return false;
									}
									arg0 += Static371.anInt6168;
									arg3 += local320;
									arg8 += local263;
									arg7 += local231;
								}
							}
							if (!Static288.method4082(Static105.anIntArray185, arg0, arg3, (arg7 >> 12) + 1, (arg2 >> 12) + -1, local308)) {
								return false;
							}
							arg2 += local248;
							arg0 += Static371.anInt6168;
							arg3 += local320;
							arg7 += local231;
						}
					} else {
						arg1 -= arg6;
						arg6 -= arg0;
						arg0 = Static371.anInt6168 * arg0;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static288.method4082(Static105.anIntArray185, arg0, arg3, (arg8 >> 12) + 1, (arg7 >> 12) - 1, local308)) {
										return false;
									}
									arg0 += Static371.anInt6168;
									arg7 += local231;
									arg3 += local320;
									arg8 += local263;
								}
							}
							if (!Static288.method4082(Static105.anIntArray185, arg0, arg3, (arg2 >> 12) + 1, (arg7 >> 12) + -1, local308)) {
								return false;
							}
							arg2 += local248;
							arg3 += local320;
							arg0 += Static371.anInt6168;
							arg7 += local231;
						}
					}
				}
			} else if (arg6 >= Static558.anInt9341) {
				return true;
			} else {
				if (arg0 > Static558.anInt9341) {
					arg0 = Static558.anInt9341;
				}
				arg5 = local308 + (arg5 << 8) - arg8 * local308;
				if (arg1 > Static558.anInt9341) {
					arg1 = Static558.anInt9341;
				}
				if (arg0 <= arg1) {
					arg7 = arg8 <<= 0xC;
					if (arg6 < 0) {
						arg7 -= arg6 * local248;
						arg5 -= arg6 * local320;
						arg8 -= arg6 * local263;
						arg6 = 0;
					}
					arg2 <<= 0xC;
					if (arg0 < 0) {
						arg2 -= arg0 * local231;
						arg0 = 0;
					}
					if (local263 > local248) {
						arg1 -= arg0;
						arg0 -= arg6;
						arg6 = Static371.anInt6168 * arg6;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static288.method4082(Static105.anIntArray185, arg6, arg5, (arg8 >> 12) + 1, (arg2 >> 12) - 1, local308)) {
										return false;
									}
									arg8 += local263;
									arg6 += Static371.anInt6168;
									arg2 += local231;
									arg5 += local320;
								}
							}
							if (!Static288.method4082(Static105.anIntArray185, arg6, arg5, (arg8 >> 12) + 1, (arg7 >> 12) - 1, local308)) {
								return false;
							}
							arg5 += local320;
							arg8 += local263;
							arg6 += Static371.anInt6168;
							arg7 += local248;
						}
					} else {
						arg1 -= arg0;
						arg0 -= arg6;
						arg6 = Static371.anInt6168 * arg6;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static288.method4082(Static105.anIntArray185, arg6, arg5, (arg2 >> 12) + 1, (arg8 >> 12) + -1, local308)) {
										return false;
									}
									arg8 += local263;
									arg2 += local231;
									arg6 += Static371.anInt6168;
									arg5 += local320;
								}
							}
							if (!Static288.method4082(Static105.anIntArray185, arg6, arg5, (arg7 >> 12) + 1, (arg8 >> 12) + -1, local308)) {
								return false;
							}
							arg6 += Static371.anInt6168;
							arg5 += local320;
							arg7 += local248;
							arg8 += local263;
						}
					}
				} else {
					arg2 = arg8 <<= 0xC;
					if (arg6 < 0) {
						arg8 -= local263 * arg6;
						arg5 -= local320 * arg6;
						arg2 -= arg6 * local248;
						arg6 = 0;
					}
					arg7 <<= 0xC;
					if (arg1 < 0) {
						arg7 -= local231 * arg1;
						arg1 = 0;
					}
					if (local263 <= local248) {
						arg0 -= arg1;
						arg1 -= arg6;
						arg6 = Static371.anInt6168 * arg6;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static288.method4082(Static105.anIntArray185, arg6, arg5, (arg2 >> 12) + 1, (arg7 >> 12) - 1, local308)) {
										return false;
									}
									arg5 += local320;
									arg6 += Static371.anInt6168;
									arg7 += local231;
									arg2 += local248;
								}
							}
							if (!Static288.method4082(Static105.anIntArray185, arg6, arg5, (arg2 >> 12) + 1, (arg8 >> 12) + -1, local308)) {
								return false;
							}
							arg8 += local263;
							arg6 += Static371.anInt6168;
							arg2 += local248;
							arg5 += local320;
						}
					} else {
						arg0 -= arg1;
						arg1 -= arg6;
						arg6 = Static371.anInt6168 * arg6;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static288.method4082(Static105.anIntArray185, arg6, arg5, (arg7 >> 12) + 1, (arg2 >> 12) + -1, local308)) {
										return false;
									}
									arg7 += local231;
									arg6 += Static371.anInt6168;
									arg2 += local248;
									arg5 += local320;
								}
							}
							if (!Static288.method4082(Static105.anIntArray185, arg6, arg5, (arg8 >> 12) + 1, (arg2 >> 12) + -1, local308)) {
								return false;
							}
							arg5 += local320;
							arg2 += local248;
							arg6 += Static371.anInt6168;
							arg8 += local263;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
	public static void method3412() {
		@Pc(7) Class91 local7 = null;
		try {
			@Pc(15) Class260 local15 = Static362.aClass109_5.method2169(false, "3");
			while (local15.anInt7041 == 0) {
				Static391.method5400(1L);
			}
			if (local15.anInt7041 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class91) local15.anObject16;
			@Pc(47) byte[] local47 = new byte[(int) local7.method1840()];
			if (local47.length == 0) {
				Static245.aString41 = "";
				Static368.aString61 = "";
			} else {
				@Pc(65) int local65;
				for (@Pc(52) int local52 = 0; local52 < local47.length; local52 += local65) {
					local65 = local7.method1839(local47.length - local52, local52, local47);
					if (local65 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(87) Class1_Sub35 local87 = new Class1_Sub35(local47);
				@Pc(91) int local91 = local87.method5750();
				if (local91 > 120) {
					throw new RuntimeException("Bad length");
				}
				local87.anInt7214 = local91 + 1;
				if (!local87.method5749()) {
					throw new RuntimeException("Invalid CRC");
				}
				local87.anInt7214 = 1;
				@Pc(122) int local122 = local87.method5750();
				if (local122 > 3) {
					throw new RuntimeException("Invalid version " + local122);
				}
				Static245.aString41 = local87.method5757();
				Static368.aString61 = local87.method5757();
				if (local122 >= 1) {
					Static163.anInt2948 = local87.method5771();
				} else {
					Static163.anInt2948 = Static47.anInt802;
				}
				if (local122 < 2) {
					Static113.aLong72 = Static480.aLong248;
				} else {
					Static113.aLong72 = local87.method5778();
				}
				if (local122 < 3) {
					Static464.aString77 = Static508.aString87;
				} else if (local87.method5750() == 1) {
					Static464.aString77 = local87.method5757();
				} else {
					Static464.aString77 = null;
				}
			}
		} catch (@Pc(205) Exception local205) {
			Static368.aString61 = "";
			Static245.aString41 = "";
		}
		try {
			if (local7 != null) {
				local7.method1833();
			}
		} catch (@Pc(216) Exception local216) {
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!r;II)V")
	public static void method3414(@OriginalArg(0) Class134 arg0, @OriginalArg(2) int arg1) {
		if (!Static419.aBoolean572) {
			Static117.anInt2295 = 0;
			return;
		}
		if (Static118.aBoolean169) {
			Static154.aLong90 = Static295.aClass286_1.method6485();
		}
		Static541.anInt9055 = 0;
		Static83.anInt1792 = 0;
		Static31.anInt507 = 0;
		@Pc(25) int[] local25 = arg0.v();
		Static187.anInt8345 = (int) ((float) local25[3] / 3.0F);
		Static526.anInt8861 = (int) ((float) local25[2] / 3.0F);
		arg0.method6922(Static593.anIntArray738);
		if ((int) ((float) Static593.anIntArray738[0] / 3.0F) != Static371.anInt6168 || Static558.anInt9341 != (int) ((float) Static593.anIntArray738[1] / 3.0F)) {
			Static558.anInt9341 = (int) ((float) Static593.anIntArray738[1] / 3.0F);
			Static371.anInt6168 = (int) ((float) Static593.anIntArray738[0] / 3.0F);
			Static18.anInt222 = Static371.anInt6168 >> 1;
			Static299.anInt5149 = Static558.anInt9341 >> 1;
			Static105.anIntArray185 = new int[Static558.anInt9341 * Static371.anInt6168];
		}
		Static301.aClass113_5 = arg0.method6920();
		Static117.anInt2295 = 0;
		for (@Pc(103) int local103 = 0; local103 < Static372.anInt6224; local103++) {
			Static577.method7747(Static240.aClass342Array2[local103], arg0, arg1);
		}
		for (@Pc(118) int local118 = 0; local118 < Static134.anInt2588; local118++) {
			Static577.method7747(Static546.aClass342Array4[local118], arg0, arg1);
		}
		for (@Pc(137) int local137 = 0; local137 < Static246.anInt4517; local137++) {
			Static577.method7747(aClass342Array1[local137], arg0, arg1);
		}
		Static286.anInt8220 = 0;
		if (Static117.anInt2295 > 0) {
			@Pc(157) int local157 = Static105.anIntArray185.length;
			@Pc(164) int local164 = local157 - local157 & 0x7;
			@Pc(166) int local166 = 0;
			while (local164 > local166) {
				Static105.anIntArray185[local166++] = Integer.MAX_VALUE;
				Static105.anIntArray185[local166++] = Integer.MAX_VALUE;
				Static105.anIntArray185[local166++] = Integer.MAX_VALUE;
				Static105.anIntArray185[local166++] = Integer.MAX_VALUE;
				Static105.anIntArray185[local166++] = Integer.MAX_VALUE;
				Static105.anIntArray185[local166++] = Integer.MAX_VALUE;
				Static105.anIntArray185[local166++] = Integer.MAX_VALUE;
				Static105.anIntArray185[local166++] = Integer.MAX_VALUE;
			}
			while (local157 > local166) {
				Static105.anIntArray185[local166++] = Integer.MAX_VALUE;
			}
			Static444.anInt5044 = 1;
			for (@Pc(229) int local229 = 0; local229 < Static117.anInt2295; local229++) {
				@Pc(235) Class342 local235 = Static312.aClass342Array3[local229];
				method3411(local235.aShortArray143[1], local235.aShortArray143[0], local235.aShortArray144[1], local235.aShortArray145[1], local235.aShortArray145[0], local235.aShortArray145[3], local235.aShortArray143[3], local235.aShortArray144[0], local235.aShortArray144[3]);
				method3411(local235.aShortArray143[2], local235.aShortArray143[1], local235.aShortArray144[2], local235.aShortArray145[2], local235.aShortArray145[1], local235.aShortArray145[3], local235.aShortArray143[3], local235.aShortArray144[1], local235.aShortArray144[3]);
			}
			Static444.anInt5044 = 2;
		}
		if (Static118.aBoolean169) {
			Static227.aLong121 = Static295.aClass286_1.method6485() - Static154.aLong90;
		}
	}
}
