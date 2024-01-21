import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!sd", name = "R", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_23;

	@OriginalMember(owner = "client!sd", name = "J", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!sd", name = "M", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1291 = Static161.method2452("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!sd", name = "Q", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1292 = Static161.method2452("Einloggen");

	@OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
	public static int anInt3513 = 0;

	@OriginalMember(owner = "client!sd", name = "gb", descriptor = "Lclient!mf;")
	public static Class69 aClass69_13 = null;

	@OriginalMember(owner = "client!sd", name = "jb", descriptor = "[Lclient!si;")
	public static final Class92[] aClass92Array1 = new Class92[6];

	@OriginalMember(owner = "client!sd", name = "kb", descriptor = "I")
	public static int anInt3521 = 0;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)V")
	public static void method2661() {
		@Pc(6) int local6 = Static10.aClass5_Sub6_Sub1_1.method3090(8);
		@Pc(15) int local15;
		if (Static66.anInt1444 > local6) {
			for (local15 = local6; local15 < Static66.anInt1444; local15++) {
				Static105.anIntArray234[Static65.anInt1422++] = Static7.anIntArray13[local15];
			}
		}
		if (local6 > Static66.anInt1444) {
			throw new RuntimeException("gppov1");
		}
		Static66.anInt1444 = 0;
		for (local15 = 0; local15 < local6; local15++) {
			@Pc(57) int local57 = Static7.anIntArray13[local15];
			@Pc(61) Class1_Sub2_Sub2 local61 = Static6.aClass1_Sub2_Sub2Array1[local57];
			@Pc(66) int local66 = Static10.aClass5_Sub6_Sub1_1.method3090(1);
			if (local66 == 0) {
				Static7.anIntArray13[Static66.anInt1444++] = local57;
				local61.anInt2258 = Static177.anInt3533;
			} else {
				@Pc(89) int local89 = Static10.aClass5_Sub6_Sub1_1.method3090(2);
				if (local89 == 0) {
					Static7.anIntArray13[Static66.anInt1444++] = local57;
					local61.anInt2258 = Static177.anInt3533;
					Static188.anIntArray395[Static17.anInt347++] = local57;
				} else {
					@Pc(133) int local133;
					@Pc(143) int local143;
					if (local89 == 1) {
						Static7.anIntArray13[Static66.anInt1444++] = local57;
						local61.anInt2258 = Static177.anInt3533;
						local133 = Static10.aClass5_Sub6_Sub1_1.method3090(3);
						local61.method1743(local133, false);
						local143 = Static10.aClass5_Sub6_Sub1_1.method3090(1);
						if (local143 == 1) {
							Static188.anIntArray395[Static17.anInt347++] = local57;
						}
					} else if (local89 == 2) {
						Static7.anIntArray13[Static66.anInt1444++] = local57;
						local61.anInt2258 = Static177.anInt3533;
						local133 = Static10.aClass5_Sub6_Sub1_1.method3090(3);
						local61.method1743(local133, true);
						local143 = Static10.aClass5_Sub6_Sub1_1.method3090(3);
						local61.method1743(local143, true);
						@Pc(201) int local201 = Static10.aClass5_Sub6_Sub1_1.method3090(1);
						if (local201 == 1) {
							Static188.anIntArray395[Static17.anInt347++] = local57;
						}
					} else if (local89 == 3) {
						Static105.anIntArray234[Static65.anInt1422++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIII[IIIZ)V")
	public static void method2662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		if (Static42.anInt973 > arg2) {
			arg8 -= Static42.anInt973 - arg2;
			arg2 = Static42.anInt973;
		}
		if (arg1 < Static42.anInt972) {
			arg4 -= Static42.anInt972 - arg1;
			arg1 = Static42.anInt972;
		}
		if (arg7 == 9) {
			arg7 = 1;
			arg0 = arg0 + 1 & 0x3;
		}
		if (arg7 == 10) {
			arg7 = 1;
			arg0 = arg0 + 3 & 0x3;
		}
		if (arg7 == 11) {
			arg0 = arg0 + 3 & 0x3;
			arg7 = 8;
		}
		if (Static42.anInt974 < arg4 + arg1) {
			arg4 = Static42.anInt974 - arg1;
		}
		if (arg8 + arg2 > Static42.anInt970) {
			arg8 = Static42.anInt970 - arg2;
		}
		@Pc(108) int local108 = arg2 + arg1 * Static42.anInt969;
		@Pc(113) int local113 = Static42.anInt969 - arg8;
		@Pc(122) int local122;
		@Pc(126) int local126;
		if (arg7 == 1) {
			if (arg0 == 0) {
				for (local122 = 0; local122 < arg4; local122++) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local126 <= local122) {
							arg6[local108] = arg3;
						} else if (arg9) {
							arg6[local108] = arg5;
						}
						local108++;
					}
					local108 += local113;
				}
			} else if (arg0 == 1) {
				for (local122 = arg4 - 1; local122 >= 0; local122--) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local122 >= local126) {
							arg6[local108] = arg3;
						} else if (arg9) {
							arg6[local108] = arg5;
						}
						local108++;
					}
					local108 += local113;
				}
			} else if (arg0 == 2) {
				for (local122 = 0; local122 < arg4; local122++) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local126 >= local122) {
							arg6[local108] = arg3;
						} else if (arg9) {
							arg6[local108] = arg5;
						}
						local108++;
					}
					local108 += local113;
				}
			} else if (arg0 == 3) {
				for (local122 = arg4 - 1; local122 >= 0; local122--) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local126 >= local122) {
							arg6[local108] = arg3;
						} else if (arg9) {
							arg6[local108] = arg5;
						}
						local108++;
					}
					local108 += local113;
				}
			}
		} else if (arg7 == 2) {
			if (arg0 == 0) {
				for (local122 = arg4 - 1; local122 >= 0; local122--) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local122 >> 1 >= local126) {
							arg6[local108] = arg3;
						} else if (arg9) {
							arg6[local108] = arg5;
						}
						local108++;
					}
					local108 += local113;
				}
			} else if (arg0 == 1) {
				for (local122 = 0; local122 < arg4; local122++) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local126 >= local122 << 1) {
							arg6[local108] = arg3;
						} else if (arg9) {
							arg6[local108] = arg5;
						}
						local108++;
					}
					local108 += local113;
				}
			} else if (arg0 == 2) {
				for (local122 = 0; local122 < arg4; local122++) {
					for (local126 = arg8 - 1; local126 >= 0; local126--) {
						if (local122 >> 1 >= local126) {
							arg6[local108] = arg3;
						} else if (arg9) {
							arg6[local108] = arg5;
						}
						local108++;
					}
					local108 += local113;
				}
			} else if (arg0 == 3) {
				for (local122 = arg4 - 1; local122 >= 0; local122--) {
					for (local126 = arg8 - 1; local126 >= 0; local126--) {
						if (local122 << 1 <= local126) {
							arg6[local108] = arg3;
						} else if (arg9) {
							arg6[local108] = arg5;
						}
						local108++;
					}
					local108 += local113;
				}
			}
		} else if (arg7 == 3) {
			if (arg0 == 0) {
				for (local122 = arg4 - 1; local122 >= 0; local122--) {
					for (local126 = arg8 - 1; local126 >= 0; local126--) {
						if (local122 >> 1 >= local126) {
							arg6[local108] = arg3;
						} else if (arg9) {
							arg6[local108] = arg5;
						}
						local108++;
					}
					local108 += local113;
				}
			} else if (arg0 == 1) {
				for (local122 = arg4 - 1; local122 >= 0; local122--) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local122 << 1 <= local126) {
							arg6[local108] = arg3;
						} else if (arg9) {
							arg6[local108] = arg5;
						}
						local108++;
					}
					local108 += local113;
				}
			} else if (arg0 == 2) {
				for (local122 = 0; local122 < arg4; local122++) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local122 >> 1 >= local126) {
							arg6[local108] = arg3;
						} else if (arg9) {
							arg6[local108] = arg5;
						}
						local108++;
					}
					local108 += local113;
				}
			} else if (arg0 == 3) {
				for (local122 = 0; local122 < arg4; local122++) {
					for (local126 = arg8 - 1; local126 >= 0; local126--) {
						if (local126 >= local122 << 1) {
							arg6[local108] = arg3;
						} else if (arg9) {
							arg6[local108] = arg5;
						}
						local108++;
					}
					local108 += local113;
				}
			}
		} else if (arg7 == 4) {
			if (arg0 == 0) {
				for (local122 = arg4 - 1; local122 >= 0; local122--) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local122 >> 1 <= local126) {
							arg6[local108] = arg3;
						} else if (arg9) {
							arg6[local108] = arg5;
						}
						local108++;
					}
					local108 += local113;
				}
			} else if (arg0 == 1) {
				for (local122 = 0; local122 < arg4; local122++) {
					for (local126 = 0; local126 < arg8; local126++) {
						if (local126 <= local122 << 1) {
							arg6[local108] = arg3;
						} else if (arg9) {
							arg6[local108] = arg5;
						}
						local108++;
					}
					local108 += local113;
				}
			} else if (arg0 == 2) {
				for (local122 = 0; local122 < arg4; local122++) {
					for (local126 = arg8 - 1; local126 >= 0; local126--) {
						if (local126 >= local122 >> 1) {
							arg6[local108] = arg3;
						} else if (arg9) {
							arg6[local108] = arg5;
						}
						local108++;
					}
					local108 += local113;
				}
			} else if (arg0 == 3) {
				for (local122 = arg4 - 1; local122 >= 0; local122--) {
					for (local126 = arg8 - 1; local126 >= 0; local126--) {
						if (local122 << 1 >= local126) {
							arg6[local108] = arg3;
						} else if (arg9) {
							arg6[local108] = arg5;
						}
						local108++;
					}
					local108 += local113;
				}
			}
		} else if (arg7 != 5) {
			if (arg7 == 6) {
				if (arg0 == 0) {
					for (local122 = 0; local122 < arg4; local122++) {
						for (local126 = 0; local126 < arg8; local126++) {
							if (local126 <= arg8 / 2) {
								arg6[local108] = arg3;
							} else if (arg9) {
								arg6[local108] = arg5;
							}
							local108++;
						}
						local108 += local113;
					}
					return;
				}
				if (arg0 == 1) {
					for (local122 = 0; local122 < arg4; local122++) {
						for (local126 = 0; local126 < arg8; local126++) {
							if (arg4 / 2 >= local122) {
								arg6[local108] = arg3;
							} else if (arg9) {
								arg6[local108] = arg5;
							}
							local108++;
						}
						local108 += local113;
					}
					return;
				}
				if (arg0 == 2) {
					for (local122 = 0; local122 < arg4; local122++) {
						for (local126 = 0; local126 < arg8; local126++) {
							if (arg8 / 2 <= local126) {
								arg6[local108] = arg3;
							} else if (arg9) {
								arg6[local108] = arg5;
							}
							local108++;
						}
						local108 += local113;
					}
					return;
				}
				if (arg0 == 3) {
					for (local122 = 0; local122 < arg4; local122++) {
						for (local126 = 0; local126 < arg8; local126++) {
							if (local122 >= arg4 / 2) {
								arg6[local108] = arg3;
							} else if (arg9) {
								arg6[local108] = arg5;
							}
							local108++;
						}
						local108 += local113;
					}
					return;
				}
			}
			if (arg7 == 7) {
				if (arg0 == 0) {
					for (local122 = 0; local122 < arg4; local122++) {
						for (local126 = 0; local126 < arg8; local126++) {
							if (local126 <= local122 - arg4 / 2) {
								arg6[local108] = arg3;
							} else if (arg9) {
								arg6[local108] = arg5;
							}
							local108++;
						}
						local108 += local113;
					}
					return;
				}
				if (arg0 == 1) {
					for (local122 = arg4 - 1; local122 >= 0; local122--) {
						for (local126 = 0; local126 < arg8; local126++) {
							if (local126 <= local122 - arg4 / 2) {
								arg6[local108] = arg3;
							} else if (arg9) {
								arg6[local108] = arg5;
							}
							local108++;
						}
						local108 += local113;
					}
					return;
				}
				if (arg0 == 2) {
					for (local122 = arg4 - 1; local122 >= 0; local122--) {
						for (local126 = arg8 - 1; local126 >= 0; local126--) {
							if (local122 - arg4 / 2 >= local126) {
								arg6[local108] = arg3;
							} else if (arg9) {
								arg6[local108] = arg5;
							}
							local108++;
						}
						local108 += local113;
					}
					return;
				}
				if (arg0 == 3) {
					for (local122 = 0; local122 < arg4; local122++) {
						for (local126 = arg8 - 1; local126 >= 0; local126--) {
							if (local122 - arg4 / 2 >= local126) {
								arg6[local108] = arg3;
							} else if (arg9) {
								arg6[local108] = arg5;
							}
							local108++;
						}
						local108 += local113;
					}
					return;
				}
			}
			if (arg7 == 8) {
				if (arg0 == 0) {
					for (local122 = 0; local122 < arg4; local122++) {
						for (local126 = 0; local126 < arg8; local126++) {
							if (local126 >= local122 - arg4 / 2) {
								arg6[local108] = arg3;
							} else if (arg9) {
								arg6[local108] = arg5;
							}
							local108++;
						}
						local108 += local113;
					}
					return;
				}
				if (arg0 == 1) {
					for (local122 = arg4 - 1; local122 >= 0; local122--) {
						for (local126 = 0; local126 < arg8; local126++) {
							if (local126 >= local122 - arg4 / 2) {
								arg6[local108] = arg3;
							} else if (arg9) {
								arg6[local108] = arg5;
							}
							local108++;
						}
						local108 += local113;
					}
					return;
				}
				if (arg0 == 2) {
					for (local122 = arg4 - 1; local122 >= 0; local122--) {
						for (local126 = arg8 - 1; local126 >= 0; local126--) {
							if (local122 - arg4 / 2 <= local126) {
								arg6[local108] = arg3;
							} else if (arg9) {
								arg6[local108] = arg5;
							}
							local108++;
						}
						local108 += local113;
					}
					return;
				}
				if (arg0 == 3) {
					for (local122 = 0; local122 < arg4; local122++) {
						for (local126 = arg8 - 1; local126 >= 0; local126--) {
							if (local122 - arg4 / 2 <= local126) {
								arg6[local108] = arg3;
							} else if (arg9) {
								arg6[local108] = arg5;
							}
							local108++;
						}
						local108 += local113;
					}
					return;
				}
			}
		} else if (arg0 == 0) {
			for (local122 = arg4 - 1; local122 >= 0; local122--) {
				for (local126 = arg8 - 1; local126 >= 0; local126--) {
					if (local122 >> 1 <= local126) {
						arg6[local108] = arg3;
					} else if (arg9) {
						arg6[local108] = arg5;
					}
					local108++;
				}
				local108 += local113;
			}
		} else if (arg0 == 1) {
			for (local122 = arg4 - 1; local122 >= 0; local122--) {
				for (local126 = 0; local126 < arg8; local126++) {
					if (local122 << 1 >= local126) {
						arg6[local108] = arg3;
					} else if (arg9) {
						arg6[local108] = arg5;
					}
					local108++;
				}
				local108 += local113;
			}
		} else if (arg0 == 2) {
			for (local122 = 0; local122 < arg4; local122++) {
				for (local126 = 0; local126 < arg8; local126++) {
					if (local122 >> 1 <= local126) {
						arg6[local108] = arg3;
					} else if (arg9) {
						arg6[local108] = arg5;
					}
					local108++;
				}
				local108 += local113;
			}
		} else if (arg0 == 3) {
			for (local122 = 0; local122 < arg4; local122++) {
				for (local126 = arg8 - 1; local126 >= 0; local126--) {
					if (local122 << 1 >= local126) {
						arg6[local108] = arg3;
					} else if (arg9) {
						arg6[local108] = arg5;
					}
					local108++;
				}
				local108 += local113;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IB)I")
	public static int method2665(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)V")
	public static void method2667() {
		while (true) {
			if (Static10.aClass5_Sub6_Sub1_1.method3089(Static6.anInt155) >= 27) {
				@Pc(21) int local21 = Static10.aClass5_Sub6_Sub1_1.method3090(15);
				if (local21 != 32767) {
					@Pc(28) boolean local28 = false;
					if (Static61.aClass1_Sub2_Sub1Array1[local21] == null) {
						local28 = true;
						Static61.aClass1_Sub2_Sub1Array1[local21] = new Class1_Sub2_Sub1();
					}
					@Pc(44) Class1_Sub2_Sub1 local44 = Static61.aClass1_Sub2_Sub1Array1[local21];
					Static80.anIntArray175[Static83.anInt1850++] = local21;
					local44.anInt2258 = Static177.anInt3533;
					@Pc(62) int local62 = Static69.anIntArray138[Static10.aClass5_Sub6_Sub1_1.method3090(3)];
					if (local28) {
						local44.anInt2246 = local44.anInt2244 = local62;
					}
					@Pc(75) int local75 = Static10.aClass5_Sub6_Sub1_1.method3090(1);
					@Pc(80) int local80 = Static10.aClass5_Sub6_Sub1_1.method3090(1);
					if (local80 == 1) {
						Static188.anIntArray395[Static17.anInt347++] = local21;
					}
					local44.aClass5_Sub2_Sub20_1 = Static50.method887(Static10.aClass5_Sub6_Sub1_1.method3090(14));
					@Pc(104) int local104 = Static10.aClass5_Sub6_Sub1_1.method3090(5);
					@Pc(109) int local109 = Static10.aClass5_Sub6_Sub1_1.method3090(5);
					local44.anInt2238 = local44.aClass5_Sub2_Sub20_1.anInt3610;
					local44.anInt2259 = local44.aClass5_Sub2_Sub20_1.anInt3607;
					if (local104 > 15) {
						local104 -= 32;
					}
					local44.anInt2243 = local44.aClass5_Sub2_Sub20_1.anInt3591;
					local44.anInt2211 = local44.aClass5_Sub2_Sub20_1.anInt3597;
					local44.anInt2229 = local44.aClass5_Sub2_Sub20_1.anInt3603;
					if (local44.anInt2211 == 0) {
						local44.anInt2244 = 0;
					}
					local44.anInt2221 = local44.aClass5_Sub2_Sub20_1.anInt3590;
					local44.anInt2252 = local44.aClass5_Sub2_Sub20_1.anInt3616;
					local44.anInt2216 = local44.aClass5_Sub2_Sub20_1.anInt3592;
					if (local109 > 15) {
						local109 -= 32;
					}
					local44.anInt2230 = local44.aClass5_Sub2_Sub20_1.anInt3594;
					local44.method1744(Static210.aClass1_Sub2_Sub2_2.anIntArray250[0] + local104, local75 == 1, local109 + Static210.aClass1_Sub2_Sub2_2.anIntArray253[0]);
					continue;
				}
			}
			Static10.aClass5_Sub6_Sub1_1.method3086();
			return;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)Z")
	public static boolean method2669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static40.method691(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static191.method2853(local10 + 1, Static37.anIntArrayArrayArray5[arg0][arg1][arg2] + arg3, local14 + 1) && Static191.method2853(local10 + 128 - 1, Static37.anIntArrayArrayArray5[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static191.method2853(local10 + 128 - 1, Static37.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static191.method2853(local10 + 1, Static37.anIntArrayArrayArray5[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(JSILclient!dc;ILclient!dc;I)V")
	public static void method2670(@OriginalArg(0) long arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(5) Class20 arg4, @OriginalArg(6) int arg5) {
		if (Static104.aBoolean95 || Static85.anInt1879 >= 500) {
			return;
		}
		Static203.aClass20Array32[Static85.anInt1879] = arg4;
		Static193.aClass20Array31[Static85.anInt1879] = arg3;
		Static151.aShortArray40[Static85.anInt1879] = arg1;
		Static159.aLongArray36[Static85.anInt1879] = arg0;
		Static63.anIntArray131[Static85.anInt1879] = arg2;
		Static170.anIntArray362[Static85.anInt1879] = arg5;
		Static85.anInt1879++;
	}
}
