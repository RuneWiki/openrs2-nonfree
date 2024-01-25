import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "Ljava/lang/Object;")
	public static Object anObject45;

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "Lclient!f;")
	public static Class39 aClass39_36;

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
	public static int anInt8582 = 0;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
	public static void method7143() {
		Static156.aClass259_158.anInt7135 = 1;
		Static526.method7223();
		Static523.aBoolean664 = true;
		Static487.aBoolean646 = true;
		Static385.method5670();
		for (@Pc(7438) int local7438 = 0; local7438 < Static134.aClass246Array1.length; local7438++) {
			Static134.aClass246Array1[local7438] = null;
		}
		Static25.aBoolean32 = false;
		Static394.method4078();
		Static557.anInt9152 = (int) (Math.random() * 30.0D) - 20;
		Static295.anInt8557 = (int) (Math.random() * 110.0D) - 55;
		Static417.anInt7188 = (int) (Math.random() * 120.0D) - 60;
		Static447.aFloat233 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static124.anInt2402 = (int) (Math.random() * 100.0D) - 50;
		Static478.anInt8186 = (int) (Math.random() * 80.0D) - 40;
		Static529.method7837();
		for (@Pc(7512) int local7512 = 0; local7512 < 2048; local7512++) {
			Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local7512] = null;
		}
		Static31.anInt820 = 0;
		Static416.anInt7186 = 0;
		Static544.aClass162_40.method3518();
		Static230.aClass8_24.method220();
		Static472.aClass8_55.method220();
		Static181.aClass109_5.method2311();
		Static261.aClass162_35.method3518();
		Static524.aClass8_62 = new Class8();
		Static70.aClass78_1.method1465();
		Static577.method7796();
		Static471.anInt8055 = 0;
		Static570.anInt6328 = 0;
		Static400.anInt6972 = 0;
		Static330.anInt6084 = 0;
		Static309.anInt5528 = 0;
		Static326.anInt6029 = 0;
		Static204.anInt3987 = 0;
		Static412.anInt568 = 0;
		Static529.anInt9415 = 0;
		Static285.anInt6373 = 0;
		for (@Pc(7580) int local7580 = 0; local7580 < Static470.anIntArray532.length; local7580++) {
			if (!Static254.aBooleanArray23[local7580]) {
				Static470.anIntArray532[local7580] = -1;
			}
		}
		if (Static554.anInt9121 != -1) {
			Static309.method4628(Static554.anInt9121);
		}
		for (@Pc(7606) Class2_Sub44 local7606 = (Class2_Sub44) Static217.aClass162_20.method3527(); local7606 != null; local7606 = (Class2_Sub44) Static217.aClass162_20.method3523()) {
			if (!local7606.method7968()) {
				local7606 = (Class2_Sub44) Static217.aClass162_20.method3527();
				if (local7606 == null) {
					break;
				}
			}
			Static564.method7655(false, true, local7606);
		}
		Static554.anInt9121 = -1;
		Static217.aClass162_20 = new Class162(8);
		Static308.method4597();
		Static454.aClass196_9 = null;
		for (@Pc(7648) int local7648 = 0; local7648 < 8; local7648++) {
			Static461.aStringArray145[local7648] = null;
			Static421.aBooleanArray30[local7648] = false;
			Static282.anIntArray344[local7648] = -1;
		}
		Static135.method2304();
		Static210.aBoolean327 = true;
		for (@Pc(7672) int local7672 = 0; local7672 < 100; local7672++) {
			Static295.aBooleanArray36[local7672] = true;
		}
		for (@Pc(7686) int local7686 = 0; local7686 < 6; local7686++) {
			Static286.aClass239Array1[local7686] = new Class239();
		}
		for (@Pc(7700) int local7700 = 0; local7700 < 25; local7700++) {
			Static234.anIntArray279[local7700] = 0;
			Static86.anIntArray96[local7700] = 0;
			Static331.anIntArray426[local7700] = 0;
		}
		Static6.method168();
		Static341.aBoolean494 = true;
		Static305.aShortArray96 = Static401.aShortArray101 = Static441.aShortArray103 = Static525.aShortArray142 = new short[256];
		Static320.aString49 = Static290.aClass198_28.method4365(Static52.anInt1264);
		Static444.anInt7770 = 0;
		Static72.aClass2_Sub12_Sub1_1.aBoolean173 = false;
		Static72.aClass2_Sub12_Sub1_1.aBoolean170 = false;
		Static479.method6780();
		Static257.method4012();
		Static36.aClass2_Sub47_1 = null;
		Static156.aClass259_158.anInt7135 = 2;
		Static407.aLong197 = 0L;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method7145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 > 2000 || arg4 > 2000 || arg3 > 2000 || arg0 > 2000 || arg2 > 2000 || arg5 > 2000) {
			return false;
		} else if (arg8 >= -2000 && arg4 >= -2000 && arg3 >= -2000 && arg0 >= -2000 && arg2 >= -2000 && arg5 >= -2000) {
			@Pc(64) int local64;
			if (Static367.anInt6528 == 2) {
				local64 = arg0 + Static98.anInt2032 * arg8;
				if (local64 >= 0 && local64 < Static266.anIntArray333.length && Static266.anIntArray333[local64] > (arg6 << 8) - 15360) {
					return false;
				}
				local64 = arg2 + Static98.anInt2032 * arg4;
				if (local64 >= 0 && Static266.anIntArray333.length > local64 && Static266.anIntArray333[local64] > (arg7 << 8) - 15360) {
					return false;
				}
				local64 = arg3 * Static98.anInt2032 + arg5;
				if (local64 >= 0 && local64 < Static266.anIntArray333.length && Static266.anIntArray333[local64] > (arg1 << 8) - 15360) {
					return false;
				}
			}
			local64 = arg2 - arg0;
			@Pc(151) int local151 = arg4 - arg8;
			@Pc(156) int local156 = arg5 - arg0;
			@Pc(161) int local161 = arg3 - arg8;
			@Pc(165) int local165 = arg7 - arg6;
			@Pc(170) int local170 = arg1 - arg6;
			if (arg8 < arg4 && arg3 < arg3) {
				arg8--;
				if (arg3 < arg4) {
					arg4++;
				} else {
					arg3++;
				}
			} else if (arg3 <= arg4) {
				arg3--;
				if (arg8 <= arg4) {
					arg4++;
				} else {
					arg8++;
				}
			} else {
				if (arg3 < arg8) {
					arg8++;
				} else {
					arg3++;
				}
				arg4--;
			}
			@Pc(217) int local217 = 0;
			if (arg4 != arg8) {
				local217 = (arg2 - arg0 << 12) / (arg4 - arg8);
			}
			@Pc(234) int local234 = 0;
			if (arg4 != arg3) {
				local234 = (arg5 - arg2 << 12) / (arg3 - arg4);
			}
			@Pc(254) int local254 = 0;
			if (arg8 != arg3) {
				local254 = (arg0 - arg5 << 12) / (arg8 - arg3);
			}
			@Pc(277) int local277 = local64 * local161 - local151 * local156;
			if (local277 == 0) {
				return false;
			}
			@Pc(294) int local294 = (local161 * local165 - local170 * local151 << 8) / local277;
			@Pc(307) int local307 = (local170 * local64 - local156 * local165 << 8) / local277;
			if (arg4 >= arg8 && arg8 <= arg3) {
				if (Static499.anInt8381 <= arg8) {
					return true;
				}
				arg6 = local294 + (arg6 << 8) - arg0 * local294;
				if (Static499.anInt8381 < arg3) {
					arg3 = Static499.anInt8381;
				}
				if (arg4 > Static499.anInt8381) {
					arg4 = Static499.anInt8381;
				}
				if (arg3 <= arg4) {
					arg2 = arg0 <<= 0xC;
					arg5 <<= 0xC;
					if (arg8 < 0) {
						arg0 -= local217 * arg8;
						arg6 -= arg8 * local307;
						arg2 -= arg8 * local254;
						arg8 = 0;
					}
					if (arg3 < 0) {
						arg5 -= arg3 * local234;
						arg3 = 0;
					}
					if ((arg3 == arg8 || local217 <= local254) && (arg8 != arg3 || local217 >= local234)) {
						arg4 -= arg3;
						arg3 -= arg8;
						arg8 = Static98.anInt2032 * arg8;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static110.method1657(Static266.anIntArray333, local294, arg8, (arg5 >> 12) + 1, arg6, (arg0 >> 12) - 1)) {
										return false;
									}
									arg6 += local307;
									arg5 += local234;
									arg0 += local217;
									arg8 += Static98.anInt2032;
								}
							}
							if (!Static110.method1657(Static266.anIntArray333, local294, arg8, (arg2 >> 12) + 1, arg6, (arg0 >> 12) - 1)) {
								return false;
							}
							arg2 += local254;
							arg0 += local217;
							arg8 += Static98.anInt2032;
							arg6 += local307;
						}
					} else {
						arg4 -= arg3;
						arg3 -= arg8;
						arg8 *= Static98.anInt2032;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static110.method1657(Static266.anIntArray333, local294, arg8, (arg0 >> 12) + 1, arg6, (arg5 >> 12) - 1)) {
										return false;
									}
									arg6 += local307;
									arg8 += Static98.anInt2032;
									arg0 += local217;
									arg5 += local234;
								}
							}
							if (!Static110.method1657(Static266.anIntArray333, local294, arg8, (arg0 >> 12) + 1, arg6, (arg2 >> 12) - 1)) {
								return false;
							}
							arg0 += local217;
							arg2 += local254;
							arg6 += local307;
							arg8 += Static98.anInt2032;
						}
					}
				} else {
					arg5 = arg0 <<= 0xC;
					arg2 <<= 0xC;
					if (arg8 < 0) {
						arg5 -= arg8 * local254;
						arg6 -= arg8 * local307;
						arg0 -= local217 * arg8;
						arg8 = 0;
					}
					if (arg4 < 0) {
						arg2 -= arg4 * local234;
						arg4 = 0;
					}
					if ((arg8 == arg4 || local254 >= local217) && (arg4 != arg8 || local234 >= local254)) {
						arg3 -= arg4;
						arg4 -= arg8;
						arg8 *= Static98.anInt2032;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static110.method1657(Static266.anIntArray333, local294, arg8, (arg5 >> 12) + 1, arg6, (arg2 >> 12) - 1)) {
										return false;
									}
									arg5 += local254;
									arg8 += Static98.anInt2032;
									arg2 += local234;
									arg6 += local307;
								}
							}
							if (!Static110.method1657(Static266.anIntArray333, local294, arg8, (arg5 >> 12) + 1, arg6, (arg0 >> 12) - 1)) {
								return false;
							}
							arg0 += local217;
							arg5 += local254;
							arg6 += local307;
							arg8 += Static98.anInt2032;
						}
					} else {
						arg3 -= arg4;
						arg4 -= arg8;
						arg8 = Static98.anInt2032 * arg8;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static110.method1657(Static266.anIntArray333, local294, arg8, (arg2 >> 12) + 1, arg6, (arg5 >> 12) - 1)) {
										return false;
									}
									arg8 += Static98.anInt2032;
									arg6 += local307;
									arg2 += local234;
									arg5 += local254;
								}
							}
							if (!Static110.method1657(Static266.anIntArray333, local294, arg8, (arg0 >> 12) + 1, arg6, (arg5 >> 12) - 1)) {
								return false;
							}
							arg5 += local254;
							arg6 += local307;
							arg8 += Static98.anInt2032;
							arg0 += local217;
						}
					}
				}
			} else if (arg4 <= arg3) {
				if (arg4 >= Static499.anInt8381) {
					return true;
				}
				if (Static499.anInt8381 < arg8) {
					arg8 = Static499.anInt8381;
				}
				if (arg3 > Static499.anInt8381) {
					arg3 = Static499.anInt8381;
				}
				arg7 = (arg7 << 8) + local294 - local294 * arg2;
				if (arg8 > arg3) {
					arg0 = arg2 <<= 0xC;
					arg5 <<= 0xC;
					if (arg4 < 0) {
						arg0 -= local217 * arg4;
						arg7 -= arg4 * local307;
						arg2 -= local234 * arg4;
						arg4 = 0;
					}
					if (arg3 < 0) {
						arg5 -= local254 * arg3;
						arg3 = 0;
					}
					if (arg3 != arg4 && local217 < local234 || arg4 == arg3 && local254 < local217) {
						arg8 -= arg3;
						arg3 -= arg4;
						arg4 = Static98.anInt2032 * arg4;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static110.method1657(Static266.anIntArray333, local294, arg4, (arg5 >> 12) + 1, arg7, (arg0 >> 12) - 1)) {
										return false;
									}
									arg0 += local217;
									arg5 += local254;
									arg4 += Static98.anInt2032;
									arg7 += local307;
								}
							}
							if (!Static110.method1657(Static266.anIntArray333, local294, arg4, (arg2 >> 12) + 1, arg7, (arg0 >> 12) - 1)) {
								return false;
							}
							arg4 += Static98.anInt2032;
							arg7 += local307;
							arg0 += local217;
							arg2 += local234;
						}
					} else {
						arg8 -= arg3;
						arg3 -= arg4;
						arg4 = Static98.anInt2032 * arg4;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static110.method1657(Static266.anIntArray333, local294, arg4, (arg0 >> 12) + 1, arg7, (arg5 >> 12) - 1)) {
										return false;
									}
									arg4 += Static98.anInt2032;
									arg5 += local254;
									arg7 += local307;
									arg0 += local217;
								}
							}
							if (!Static110.method1657(Static266.anIntArray333, local294, arg4, (arg0 >> 12) + 1, arg7, (arg2 >> 12) - 1)) {
								return false;
							}
							arg7 += local307;
							arg2 += local234;
							arg4 += Static98.anInt2032;
							arg0 += local217;
						}
					}
				} else {
					arg5 = arg2 <<= 0xC;
					arg0 <<= 0xC;
					if (arg4 < 0) {
						arg7 -= local307 * arg4;
						arg5 -= arg4 * local217;
						arg2 -= local234 * arg4;
						arg4 = 0;
					}
					if (arg8 < 0) {
						arg0 -= arg8 * local254;
						arg8 = 0;
					}
					if (local217 >= local234) {
						arg3 -= arg8;
						arg8 -= arg4;
						arg4 *= Static98.anInt2032;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static110.method1657(Static266.anIntArray333, local294, arg4, (arg0 >> 12) + 1, arg7, (arg2 >> 12) - 1)) {
										return false;
									}
									arg0 += local254;
									arg4 += Static98.anInt2032;
									arg7 += local307;
									arg2 += local234;
								}
							}
							if (!Static110.method1657(Static266.anIntArray333, local294, arg4, (arg5 >> 12) + 1, arg7, (arg2 >> 12) - 1)) {
								return false;
							}
							arg7 += local307;
							arg5 += local217;
							arg4 += Static98.anInt2032;
							arg2 += local234;
						}
					} else {
						arg3 -= arg8;
						arg8 -= arg4;
						arg4 *= Static98.anInt2032;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static110.method1657(Static266.anIntArray333, local294, arg4, (arg2 >> 12) + 1, arg7, (arg0 >> 12) - 1)) {
										return false;
									}
									arg4 += Static98.anInt2032;
									arg0 += local254;
									arg2 += local234;
									arg7 += local307;
								}
							}
							if (!Static110.method1657(Static266.anIntArray333, local294, arg4, (arg2 >> 12) + 1, arg7, (arg5 >> 12) - 1)) {
								return false;
							}
							arg5 += local217;
							arg2 += local234;
							arg4 += Static98.anInt2032;
							arg7 += local307;
						}
					}
				}
			} else if (arg3 >= Static499.anInt8381) {
				return true;
			} else {
				if (Static499.anInt8381 < arg4) {
					arg4 = Static499.anInt8381;
				}
				if (arg8 > Static499.anInt8381) {
					arg8 = Static499.anInt8381;
				}
				arg1 = local294 + (arg1 << 8) - local294 * arg5;
				if (arg4 > arg8) {
					arg2 = arg5 <<= 0xC;
					arg0 <<= 0xC;
					if (arg3 < 0) {
						arg1 -= local307 * arg3;
						arg2 -= arg3 * local234;
						arg5 -= arg3 * local254;
						arg3 = 0;
					}
					if (arg8 < 0) {
						arg0 -= local217 * arg8;
						arg8 = 0;
					}
					if (local234 < local254) {
						arg4 -= arg8;
						arg8 -= arg3;
						arg3 = Static98.anInt2032 * arg3;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static110.method1657(Static266.anIntArray333, local294, arg3, (arg0 >> 12) + 1, arg1, (arg2 >> 12) - 1)) {
										return false;
									}
									arg1 += local307;
									arg3 += Static98.anInt2032;
									arg0 += local217;
									arg2 += local234;
								}
							}
							if (!Static110.method1657(Static266.anIntArray333, local294, arg3, (arg5 >> 12) + 1, arg1, (arg2 >> 12) - 1)) {
								return false;
							}
							arg2 += local234;
							arg1 += local307;
							arg5 += local254;
							arg3 += Static98.anInt2032;
						}
					} else {
						arg4 -= arg8;
						arg8 -= arg3;
						arg3 *= Static98.anInt2032;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static110.method1657(Static266.anIntArray333, local294, arg3, (arg2 >> 12) + 1, arg1, (arg0 >> 12) - 1)) {
										return false;
									}
									arg2 += local234;
									arg0 += local217;
									arg1 += local307;
									arg3 += Static98.anInt2032;
								}
							}
							if (!Static110.method1657(Static266.anIntArray333, local294, arg3, (arg2 >> 12) + 1, arg1, (arg5 >> 12) - 1)) {
								return false;
							}
							arg2 += local234;
							arg3 += Static98.anInt2032;
							arg5 += local254;
							arg1 += local307;
						}
					}
				} else {
					arg0 = arg5 <<= 0xC;
					if (arg3 < 0) {
						arg0 -= local234 * arg3;
						arg5 -= local254 * arg3;
						arg1 -= arg3 * local307;
						arg3 = 0;
					}
					arg2 <<= 0xC;
					if (arg4 < 0) {
						arg2 -= local217 * arg4;
						arg4 = 0;
					}
					if (local234 >= local254) {
						arg8 -= arg4;
						arg4 -= arg3;
						arg3 *= Static98.anInt2032;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static110.method1657(Static266.anIntArray333, local294, arg3, (arg2 >> 12) + 1, arg1, (arg5 >> 12) - 1)) {
										return false;
									}
									arg1 += local307;
									arg2 += local217;
									arg3 += Static98.anInt2032;
									arg5 += local254;
								}
							}
							if (!Static110.method1657(Static266.anIntArray333, local294, arg3, (arg0 >> 12) + 1, arg1, (arg5 >> 12) - 1)) {
								return false;
							}
							arg5 += local254;
							arg3 += Static98.anInt2032;
							arg1 += local307;
							arg0 += local234;
						}
					} else {
						arg8 -= arg4;
						arg4 -= arg3;
						arg3 *= Static98.anInt2032;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static110.method1657(Static266.anIntArray333, local294, arg3, (arg5 >> 12) + 1, arg1, (arg2 >> 12) - 1)) {
										return false;
									}
									arg5 += local254;
									arg1 += local307;
									arg2 += local217;
									arg3 += Static98.anInt2032;
								}
							}
							if (!Static110.method1657(Static266.anIntArray333, local294, arg3, (arg5 >> 12) + 1, arg1, (arg0 >> 12) - 1)) {
								return false;
							}
							arg5 += local254;
							arg3 += Static98.anInt2032;
							arg1 += local307;
							arg0 += local234;
						}
					}
				}
			}
		} else {
			return false;
		}
	}
}
