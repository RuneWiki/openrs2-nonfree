import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
	public static int anInt7085;

	@OriginalMember(owner = "client!pu", name = "i", descriptor = "Lclient!rb;")
	public static Class276 aClass276_2;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIIIZIIII)Z")
	public static boolean method5835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 > 2000 || arg1 > 2000 || arg4 > 2000 || arg6 > 2000 || arg0 > 2000 || arg7 > 2000) {
			return false;
		} else if (arg5 >= -2000 && arg1 >= -2000 && arg4 >= -2000 && arg6 >= -2000 && arg0 >= -2000 && arg7 >= -2000) {
			@Pc(72) int local72;
			if (Static343.anInt6063 == 2) {
				local72 = arg6 + arg5 * Static126.anInt6657;
				if (local72 >= 0 && Static227.anIntArray262.length > local72 && Static227.anIntArray262[local72] > (arg8 << 8) - 15360) {
					return false;
				}
				local72 = Static126.anInt6657 * arg1 + arg0;
				if (local72 >= 0 && local72 < Static227.anIntArray262.length && (arg2 << 8) - 15360 < Static227.anIntArray262[local72]) {
					return false;
				}
				local72 = arg7 + arg4 * Static126.anInt6657;
				if (local72 >= 0 && local72 < Static227.anIntArray262.length && Static227.anIntArray262[local72] > (arg3 << 8) - 15360) {
					return false;
				}
			}
			local72 = arg0 - arg6;
			@Pc(149) int local149 = arg1 - arg5;
			@Pc(154) int local154 = arg7 - arg6;
			@Pc(159) int local159 = arg4 - arg5;
			@Pc(164) int local164 = arg2 - arg8;
			@Pc(169) int local169 = arg3 - arg8;
			if (arg1 > arg5 && arg4 < arg4) {
				arg5--;
				if (arg1 > arg4) {
					arg1++;
				} else {
					arg4++;
				}
			} else if (arg1 >= arg4) {
				arg4--;
				if (arg5 > arg1) {
					arg5++;
				} else {
					arg1++;
				}
			} else {
				if (arg5 <= arg4) {
					arg4++;
				} else {
					arg5++;
				}
				arg1--;
			}
			@Pc(224) int local224 = 0;
			if (arg1 != arg5) {
				local224 = (arg0 - arg6 << 12) / (arg1 - arg5);
			}
			@Pc(255) int local255 = 0;
			if (arg4 != arg1) {
				local255 = (arg7 - arg0 << 12) / (arg4 - arg1);
			}
			@Pc(275) int local275 = 0;
			if (arg5 != arg4) {
				local275 = (arg6 - arg7 << 12) / (arg5 - arg4);
			}
			@Pc(303) int local303 = local159 * local72 - local149 * local154;
			if (local303 == 0) {
				return false;
			}
			@Pc(323) int local323 = (local164 * local159 - local169 * local149 << 8) / local303;
			@Pc(336) int local336 = (local72 * local169 - local154 * local164 << 8) / local303;
			if (arg1 >= arg5 && arg4 >= arg5) {
				if (arg5 >= Static61.anInt1533) {
					return true;
				}
				if (arg4 > Static61.anInt1533) {
					arg4 = Static61.anInt1533;
				}
				if (arg1 > Static61.anInt1533) {
					arg1 = Static61.anInt1533;
				}
				arg8 = local323 + (arg8 << 8) - local323 * arg6;
				if (arg4 > arg1) {
					arg7 = arg6 <<= 0xC;
					arg0 <<= 0xC;
					if (arg5 < 0) {
						arg6 -= local224 * arg5;
						arg7 -= local275 * arg5;
						arg8 -= local336 * arg5;
						arg5 = 0;
					}
					if (arg1 < 0) {
						arg0 -= arg1 * local255;
						arg1 = 0;
					}
					if ((arg1 == arg5 || local224 <= local275) && (arg1 != arg5 || local275 <= local255)) {
						arg4 -= arg1;
						arg1 -= arg5;
						arg5 = Static126.anInt6657 * arg5;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static353.method5182((arg7 >> 12) + 1, arg8, Static227.anIntArray262, arg5, (arg0 >> 12) - 1, local323)) {
										return false;
									}
									arg8 += local336;
									arg7 += local275;
									arg0 += local255;
									arg5 += Static126.anInt6657;
								}
							}
							if (!Static353.method5182((arg7 >> 12) + 1, arg8, Static227.anIntArray262, arg5, (arg6 >> 12) - 1, local323)) {
								return false;
							}
							arg8 += local336;
							arg7 += local275;
							arg5 += Static126.anInt6657;
							arg6 += local224;
						}
					} else {
						arg4 -= arg1;
						arg1 -= arg5;
						arg5 *= Static126.anInt6657;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static353.method5182((arg0 >> 12) + 1, arg8, Static227.anIntArray262, arg5, (arg7 >> 12) - 1, local323)) {
										return false;
									}
									arg0 += local255;
									arg8 += local336;
									arg7 += local275;
									arg5 += Static126.anInt6657;
								}
							}
							if (!Static353.method5182((arg6 >> 12) + 1, arg8, Static227.anIntArray262, arg5, (arg7 >> 12) - 1, local323)) {
								return false;
							}
							arg8 += local336;
							arg7 += local275;
							arg6 += local224;
							arg5 += Static126.anInt6657;
						}
					}
				} else {
					arg0 = arg6 <<= 0xC;
					if (arg5 < 0) {
						arg0 -= local275 * arg5;
						arg8 -= local336 * arg5;
						arg6 -= arg5 * local224;
						arg5 = 0;
					}
					arg7 <<= 0xC;
					if (arg4 < 0) {
						arg7 -= arg4 * local255;
						arg4 = 0;
					}
					if ((arg4 == arg5 || local224 <= local275) && (arg5 != arg4 || local255 <= local224)) {
						arg1 -= arg4;
						arg4 -= arg5;
						arg5 *= Static126.anInt6657;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static353.method5182((arg7 >> 12) + 1, arg8, Static227.anIntArray262, arg5, (arg6 >> 12) - 1, local323)) {
										return false;
									}
									arg8 += local336;
									arg7 += local255;
									arg6 += local224;
									arg5 += Static126.anInt6657;
								}
							}
							if (!Static353.method5182((arg0 >> 12) + 1, arg8, Static227.anIntArray262, arg5, (arg6 >> 12) - 1, local323)) {
								return false;
							}
							arg5 += Static126.anInt6657;
							arg0 += local275;
							arg8 += local336;
							arg6 += local224;
						}
					} else {
						arg1 -= arg4;
						arg4 -= arg5;
						arg5 = Static126.anInt6657 * arg5;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static353.method5182((arg6 >> 12) + 1, arg8, Static227.anIntArray262, arg5, (arg7 >> 12) - 1, local323)) {
										return false;
									}
									arg5 += Static126.anInt6657;
									arg7 += local255;
									arg6 += local224;
									arg8 += local336;
								}
							}
							if (!Static353.method5182((arg6 >> 12) + 1, arg8, Static227.anIntArray262, arg5, (arg0 >> 12) - 1, local323)) {
								return false;
							}
							arg8 += local336;
							arg6 += local224;
							arg0 += local275;
							arg5 += Static126.anInt6657;
						}
					}
				}
			} else if (arg4 < arg1) {
				if (arg4 >= Static61.anInt1533) {
					return true;
				}
				arg3 = local323 + (arg3 << 8) - arg7 * local323;
				if (Static61.anInt1533 < arg1) {
					arg1 = Static61.anInt1533;
				}
				if (arg5 > Static61.anInt1533) {
					arg5 = Static61.anInt1533;
				}
				if (arg5 >= arg1) {
					arg6 = arg7 <<= 0xC;
					if (arg4 < 0) {
						arg3 -= arg4 * local336;
						arg7 -= local275 * arg4;
						arg6 -= arg4 * local255;
						arg4 = 0;
					}
					arg0 <<= 0xC;
					if (arg1 < 0) {
						arg0 -= local224 * arg1;
						arg1 = 0;
					}
					if (local255 >= local275) {
						arg5 -= arg1;
						arg1 -= arg4;
						arg4 *= Static126.anInt6657;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static353.method5182((arg0 >> 12) + 1, arg3, Static227.anIntArray262, arg4, (arg7 >> 12) - 1, local323)) {
										return false;
									}
									arg7 += local275;
									arg3 += local336;
									arg0 += local224;
									arg4 += Static126.anInt6657;
								}
							}
							if (!Static353.method5182((arg6 >> 12) + 1, arg3, Static227.anIntArray262, arg4, (arg7 >> 12) - 1, local323)) {
								return false;
							}
							arg7 += local275;
							arg3 += local336;
							arg6 += local255;
							arg4 += Static126.anInt6657;
						}
					} else {
						arg5 -= arg1;
						arg1 -= arg4;
						arg4 = Static126.anInt6657 * arg4;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static353.method5182((arg7 >> 12) + 1, arg3, Static227.anIntArray262, arg4, (arg0 >> 12) - 1, local323)) {
										return false;
									}
									arg7 += local275;
									arg3 += local336;
									arg0 += local224;
									arg4 += Static126.anInt6657;
								}
							}
							if (!Static353.method5182((arg7 >> 12) + 1, arg3, Static227.anIntArray262, arg4, (arg6 >> 12) - 1, local323)) {
								return false;
							}
							arg6 += local255;
							arg3 += local336;
							arg4 += Static126.anInt6657;
							arg7 += local275;
						}
					}
				} else {
					arg0 = arg7 <<= 0xC;
					arg6 <<= 0xC;
					if (arg4 < 0) {
						arg7 -= arg4 * local275;
						arg3 -= local336 * arg4;
						arg0 -= local255 * arg4;
						arg4 = 0;
					}
					if (arg5 < 0) {
						arg6 -= local224 * arg5;
						arg5 = 0;
					}
					if (local255 >= local275) {
						arg1 -= arg5;
						arg5 -= arg4;
						arg4 *= Static126.anInt6657;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static353.method5182((arg0 >> 12) + 1, arg3, Static227.anIntArray262, arg4, (arg6 >> 12) - 1, local323)) {
										return false;
									}
									arg0 += local255;
									arg6 += local224;
									arg3 += local336;
									arg4 += Static126.anInt6657;
								}
							}
							if (!Static353.method5182((arg0 >> 12) + 1, arg3, Static227.anIntArray262, arg4, (arg7 >> 12) - 1, local323)) {
								return false;
							}
							arg3 += local336;
							arg0 += local255;
							arg4 += Static126.anInt6657;
							arg7 += local275;
						}
					} else {
						arg1 -= arg5;
						arg5 -= arg4;
						arg4 = Static126.anInt6657 * arg4;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static353.method5182((arg6 >> 12) + 1, arg3, Static227.anIntArray262, arg4, (arg0 >> 12) - 1, local323)) {
										return false;
									}
									arg3 += local336;
									arg6 += local224;
									arg4 += Static126.anInt6657;
									arg0 += local255;
								}
							}
							if (!Static353.method5182((arg7 >> 12) + 1, arg3, Static227.anIntArray262, arg4, (arg0 >> 12) - 1, local323)) {
								return false;
							}
							arg3 += local336;
							arg4 += Static126.anInt6657;
							arg0 += local255;
							arg7 += local275;
						}
					}
				}
			} else if (arg1 >= Static61.anInt1533) {
				return true;
			} else {
				if (arg4 > Static61.anInt1533) {
					arg4 = Static61.anInt1533;
				}
				if (arg5 > Static61.anInt1533) {
					arg5 = Static61.anInt1533;
				}
				arg2 = local323 + (arg2 << 8) - arg0 * local323;
				if (arg4 >= arg5) {
					arg7 = arg0 <<= 0xC;
					arg6 <<= 0xC;
					if (arg1 < 0) {
						arg0 -= local255 * arg1;
						arg2 -= arg1 * local336;
						arg7 -= arg1 * local224;
						arg1 = 0;
					}
					if (arg5 < 0) {
						arg6 -= arg5 * local275;
						arg5 = 0;
					}
					if (local224 < local255) {
						arg4 -= arg5;
						arg5 -= arg1;
						arg1 *= Static126.anInt6657;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static353.method5182((arg0 >> 12) + 1, arg2, Static227.anIntArray262, arg1, (arg6 >> 12) - 1, local323)) {
										return false;
									}
									arg0 += local255;
									arg1 += Static126.anInt6657;
									arg2 += local336;
									arg6 += local275;
								}
							}
							if (!Static353.method5182((arg0 >> 12) + 1, arg2, Static227.anIntArray262, arg1, (arg7 >> 12) - 1, local323)) {
								return false;
							}
							arg2 += local336;
							arg0 += local255;
							arg1 += Static126.anInt6657;
							arg7 += local224;
						}
					} else {
						arg4 -= arg5;
						arg5 -= arg1;
						arg1 *= Static126.anInt6657;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static353.method5182((arg6 >> 12) + 1, arg2, Static227.anIntArray262, arg1, (arg0 >> 12) - 1, local323)) {
										return false;
									}
									arg1 += Static126.anInt6657;
									arg6 += local275;
									arg2 += local336;
									arg0 += local255;
								}
							}
							if (!Static353.method5182((arg7 >> 12) + 1, arg2, Static227.anIntArray262, arg1, (arg0 >> 12) - 1, local323)) {
								return false;
							}
							arg1 += Static126.anInt6657;
							arg0 += local255;
							arg7 += local224;
							arg2 += local336;
						}
					}
				} else {
					arg6 = arg0 <<= 0xC;
					if (arg1 < 0) {
						arg0 -= arg1 * local255;
						arg6 -= local224 * arg1;
						arg2 -= local336 * arg1;
						arg1 = 0;
					}
					arg7 <<= 0xC;
					if (arg4 < 0) {
						arg7 -= arg4 * local275;
						arg4 = 0;
					}
					if (arg1 != arg4 && local224 < local255 || arg1 == arg4 && local224 > local275) {
						arg5 -= arg4;
						arg4 -= arg1;
						arg1 *= Static126.anInt6657;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static353.method5182((arg7 >> 12) + 1, arg2, Static227.anIntArray262, arg1, (arg6 >> 12) - 1, local323)) {
										return false;
									}
									arg6 += local224;
									arg1 += Static126.anInt6657;
									arg7 += local275;
									arg2 += local336;
								}
							}
							if (!Static353.method5182((arg0 >> 12) + 1, arg2, Static227.anIntArray262, arg1, (arg6 >> 12) - 1, local323)) {
								return false;
							}
							arg1 += Static126.anInt6657;
							arg2 += local336;
							arg6 += local224;
							arg0 += local255;
						}
					} else {
						arg5 -= arg4;
						arg4 -= arg1;
						arg1 *= Static126.anInt6657;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static353.method5182((arg6 >> 12) + 1, arg2, Static227.anIntArray262, arg1, (arg7 >> 12) - 1, local323)) {
										return false;
									}
									arg7 += local275;
									arg1 += Static126.anInt6657;
									arg2 += local336;
									arg6 += local224;
								}
							}
							if (!Static353.method5182((arg6 >> 12) + 1, arg2, Static227.anIntArray262, arg1, (arg0 >> 12) - 1, local323)) {
								return false;
							}
							arg2 += local336;
							arg1 += Static126.anInt6657;
							arg0 += local255;
							arg6 += local224;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "([[BILclient!sca;)V")
	public static void method5836(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class231_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt8038; local14++) {
			Static99.method1834();
			for (@Pc(20) int local20 = 0; local20 < Static500.anInt6888 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static573.anInt9325 >> 3; local24++) {
					@Pc(34) int local34 = Static414.anIntArrayArrayArray16[local14][local20][local24];
					if (local34 != -1) {
						@Pc(44) int local44 = local34 >> 24 & 0x3;
						if (!arg1.aBoolean576 || local44 == 0) {
							@Pc(55) int local55 = local34 >> 1 & 0x3;
							@Pc(61) int local61 = local34 >> 14 & 0x3FF;
							@Pc(67) int local67 = local34 >> 3 & 0x7FF;
							@Pc(78) int local78 = (local61 / 8 << 8) + (local67 / 8);
							for (@Pc(80) int local80 = 0; local80 < Static298.anIntArray348.length; local80++) {
								if (local78 == Static298.anIntArray348[local80] && arg0[local80] != null) {
									@Pc(102) Class1_Sub20 local102 = new Class1_Sub20(arg0[local80]);
									arg1.method6686(local102, local20 * 8, Static28.aClass94Array2, local44, local61, local24 * 8, local67, local14, local55);
									arg1.method6694(local14, local12[0] == -1 ? local12 : null, local20 * 8, local44, local102, Static136.aClass12_8, local55, local61, local24 * 8, local67);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static498.aClass224_1 = Static117.aClass345_1.method7550(local12[1], Static395.aClass263_1, local12[2], local12[0], local12[3]);
			Static23.anInt6320 = local12[4];
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZILclient!rca;)V")
	public static void method5837(@OriginalArg(1) int arg0, @OriginalArg(2) Class278 arg1) {
		if (Static157.aBoolean207) {
			arg0 = 0;
			Static157.aBoolean207 = false;
		}
		if (Static438.aClass278_2 != null && Static438.aClass278_2.method6375(arg1)) {
			return;
		}
		Static438.aClass278_2 = arg1;
		Static399.aLong297 = Static255.method4035();
		Static407.anInt7000 = arg0;
		Static485.anInt8186 = arg0;
		if (Static485.anInt8186 == 0) {
			Static99.method1835();
			return;
		}
		Static102.anInt2113 = Static50.anInt1272;
		Static517.aClass36_3 = Static277.aClass36_1;
		Static336.aFloat153 = Static67.aFloat32;
		Static372.anInt6589 = Static50.anInt1278;
		Static283.aFloat118 = Static125.aFloat60;
		Static196.aFloat179 = Static169.aFloat68;
		Static555.aFloat212 = Static398.aFloat176;
		Static441.anInt7698 = Static403.anInt6917;
		Static355.aFloat157 = Static47.aFloat30;
		Static130.aFloat206 = Static318.aFloat137;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
	public static void method5838() {
		Static316.method4805();
		Static320.aClass81_135 = null;
		Static480.aClass1_Sub20_Sub1_1.anInt5238 = 0;
		Static478.aClass81_193 = null;
		Static587.aClass81_229 = null;
		Static315.aClass81_130 = null;
		Static494.anInt8294 = 0;
		Static401.anInt6897 = 0;
		Static562.anInt9131 = 0;
		Static183.method3224();
		Static147.method2385();
		for (@Pc(30) int local30 = 0; local30 < 2048; local30++) {
			Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local30] = null;
		}
		Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 = null;
		for (@Pc(51) int local51 = 0; local51 < Static491.anInt1754; local51++) {
			@Pc(58) Class20_Sub2_Sub4_Sub1_Sub2 local58 = Static471.aClass1_Sub39Array1[local51].aClass20_Sub2_Sub4_Sub1_Sub2_2;
			if (local58 != null) {
				local58.anInt6436 = -1;
			}
		}
		Static489.method6874();
		Static585.anInt9461 = 1;
		Static282.anInt5182 = -1;
		Static394.anInt6810 = -1;
		Static243.method3970(10);
		for (@Pc(80) int local80 = 0; local80 < 100; local80++) {
			Static510.aBooleanArray29[local80] = true;
		}
		Static567.method7642();
		Static299.aClass1_Sub45_2 = null;
		Static473.aLong357 = 0L;
	}
}
