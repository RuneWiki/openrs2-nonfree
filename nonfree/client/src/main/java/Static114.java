import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!hh", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString85;

	@OriginalMember(owner = "client!hh", name = "yb", descriptor = "Lclient!p;")
	public static Class154 aClass154_1;

	@OriginalMember(owner = "client!hh", name = "ab", descriptor = "Ljava/lang/String;")
	public static String aString86 = "white:";

	@OriginalMember(owner = "client!hh", name = "ub", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_39 = new Class37(64);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1823(@OriginalArg(1) String arg0) {
		Static59.aString51 = arg0;
		if (Static197.aClass215_5.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static197.aClass215_5.anApplet1.getParameter("cookieprefix");
			@Pc(23) String local23 = Static197.aClass215_5.anApplet1.getParameter("cookiehost");
			@Pc(38) String local38 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local23;
			if (arg0.length() == 0) {
				local38 = local38 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local38 = local38 + "; Expires=" + Static290.method5077(Static292.method5114() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static367.method3949("document.cookie=\"" + local38 + "\"", Static197.aClass215_5.anApplet1);
		} catch (@Pc(90) Throwable local90) {
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public static void method1824() {
		@Pc(15) int local15 = Static142.aClass1_Sub21_Sub2_1.method5756(8);
		@Pc(24) int local24;
		if (Static167.anInt3454 > local15) {
			for (local24 = local15; local24 < Static167.anInt3454; local24++) {
				Static127.anIntArray259[Static32.anInt565++] = Static212.anIntArray415[local24];
			}
		}
		if (local15 > Static167.anInt3454) {
			throw new RuntimeException("gppov1");
		}
		Static167.anInt3454 = 0;
		for (local24 = 0; local24 < local15; local24++) {
			@Pc(62) int local62 = Static212.anIntArray415[local24];
			@Pc(66) Class10_Sub1_Sub2_Sub2 local66 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local62];
			@Pc(71) int local71 = Static142.aClass1_Sub21_Sub2_1.method5756(1);
			if (local71 == 0) {
				Static212.anIntArray415[Static167.anInt3454++] = local62;
				local66.anInt4071 = Static282.anInt3516;
			} else {
				@Pc(94) int local94 = Static142.aClass1_Sub21_Sub2_1.method5756(2);
				if (local94 == 0) {
					Static212.anIntArray415[Static167.anInt3454++] = local62;
					local66.anInt4071 = Static282.anInt3516;
					Static312.anIntArray623[Static62.anInt6674++] = local62;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local94 == 1) {
						Static212.anIntArray415[Static167.anInt3454++] = local62;
						local66.anInt4071 = Static282.anInt3516;
						local139 = Static142.aClass1_Sub21_Sub2_1.method5756(3);
						local66.method3399(local139, 1);
						local149 = Static142.aClass1_Sub21_Sub2_1.method5756(1);
						if (local149 == 1) {
							Static312.anIntArray623[Static62.anInt6674++] = local62;
						}
					} else if (local94 == 2) {
						Static212.anIntArray415[Static167.anInt3454++] = local62;
						local66.anInt4071 = Static282.anInt3516;
						if (Static142.aClass1_Sub21_Sub2_1.method5756(1) == 1) {
							local139 = Static142.aClass1_Sub21_Sub2_1.method5756(3);
							local66.method3399(local139, 2);
							local149 = Static142.aClass1_Sub21_Sub2_1.method5756(3);
							local66.method3399(local149, 2);
						} else {
							local139 = Static142.aClass1_Sub21_Sub2_1.method5756(3);
							local66.method3399(local139, 0);
						}
						local139 = Static142.aClass1_Sub21_Sub2_1.method5756(1);
						if (local139 == 1) {
							Static312.anIntArray623[Static62.anInt6674++] = local62;
						}
					} else if (local94 == 3) {
						Static127.anIntArray259[Static32.anInt565++] = local62;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BZIII[Lclient!ba;I[BIIILclient!ii;)[I")
	public static int[] method1829(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class17[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class105 arg10) {
		@Pc(11) int local11 = (arg1 & 0x7) * 8;
		@Pc(17) int local17 = (arg3 & 0x7) * 8;
		@Pc(21) byte local21;
		if (arg0) {
			local21 = 1;
		} else {
			local21 = 4;
		}
		@Pc(33) int local33;
		@Pc(37) int local37;
		if (!arg0) {
			@Pc(31) Class17 local31 = arg4[arg8];
			for (local33 = 0; local33 < 8; local33++) {
				for (local37 = 0; local37 < 8; local37++) {
					@Pc(51) int local51 = Static171.method3052(local37 & 0x7, arg5, local33 & 0x7) + arg9;
					@Pc(63) int local63 = Static152.method2659(local33 & 0x7, arg5, local37 & 0x7) + arg2;
					if (local51 > 0 && local51 < Static43.anInt1151 - 1 && local63 > 0 && Static260.anInt5348 - 1 > local63) {
						local31.method324(local63, local51);
					}
				}
			}
		}
		@Pc(102) Class1_Sub21 local102 = new Class1_Sub21(arg6);
		local33 = (arg1 & 0xFFFFFFF8) << 3;
		local37 = (arg3 & 0xFFFFFFF8) << 3;
		@Pc(121) byte local121 = 0;
		@Pc(123) byte local123 = 0;
		if (arg5 == 1) {
			local123 = 1;
		} else if (arg5 == 2) {
			local123 = 1;
			local121 = 1;
		} else if (arg5 == 3) {
			local121 = 1;
		}
		@Pc(219) int local219;
		@Pc(232) int local232;
		@Pc(264) int local264;
		@Pc(273) int local273;
		@Pc(291) int local291;
		@Pc(298) int local298;
		for (@Pc(152) int local152 = 0; local152 < local21; local152++) {
			for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
				for (@Pc(160) int local160 = 0; local160 < 64; local160++) {
					if (arg7 != local152 || local156 < local11 || local11 + 8 < local156 || local160 < local17 || local160 > local17 + 8) {
						Static41.method881(0, false, -1, -1, 0, 0, 0, 0, 0, arg0, local102);
					} else if (local11 + 8 == local156 || local160 == local17 + 8) {
						if (arg5 == 0) {
							local232 = local160 + arg2 - local17;
							local219 = local156 + arg9 - local11;
						} else if (arg5 == 1) {
							local232 = local11 + arg2 + 8 - local156;
							local219 = local160 + arg9 - local17;
						} else if (arg5 == 2) {
							local219 = local11 + arg9 + 8 - local156;
							local232 = local17 + arg2 + 8 - local160;
						} else {
							local219 = arg9 + local17 + 8 - local160;
							local232 = arg2 + local156 - local11;
						}
						Static41.method881(0, true, local219, local232, 0, local156 + local33, 0, local160 + local37, arg8, arg0, local102);
					} else {
						local219 = Static171.method3052(local160 & 0x7, arg5, local156 & 0x7) + arg9;
						local232 = arg2 + Static152.method2659(local156 & 0x7, arg5, local160 & 0x7);
						Static41.method881(arg5, false, local219, local232, local123, local156 + local33, local121, local160 + local37, arg8, arg0, local102);
						if (local156 == 63 || local160 == 63) {
							local264 = local156 == 63 ? 64 : local156;
							local273 = local160 == 63 ? 64 : local160;
							if (arg5 == 0) {
								local291 = arg9 + local264 - local11;
								local298 = arg2 + local273 - local17;
							} else if (arg5 == 1) {
								local291 = local273 + arg9 - local17;
								local298 = arg2 + local11 + 8 - local264;
							} else if (arg5 == 2) {
								local298 = local17 + arg2 + 8 - local273;
								local291 = local11 + arg9 + 8 - local264;
							} else {
								local291 = local17 + arg9 + 8 - local273;
								local298 = local264 + arg2 - local11;
							}
							if (local291 >= 0 && Static43.anInt1151 > local291 && local298 >= 0 && Static260.anInt5348 > local298) {
								Static276.anIntArrayArrayArray12[arg8][local291][local298] = Static276.anIntArrayArrayArray12[arg8][local219 + local121][local232 + local123];
							}
						}
					}
				}
			}
		}
		@Pc(521) boolean local521 = false;
		@Pc(630) int local630;
		@Pc(634) int local634;
		@Pc(679) int local679;
		while (local102.anInt6611 < local102.aByteArray82.length) {
			local219 = local102.method5720();
			if (local219 == 128) {
				Static338.anIntArray660[0] = local102.method5715();
				Static338.anIntArray660[1] = local102.method5691();
				Static338.anIntArray660[2] = local102.method5691();
				Static338.anIntArray660[3] = local102.method5691();
				local521 = true;
				Static338.anIntArray660[4] = local102.method5715();
			} else {
				if (local219 != 129) {
					local102.anInt6611--;
					break;
				}
				if (Static223.aByteArrayArrayArray3 == null) {
					Static223.aByteArrayArrayArray3 = new byte[4][][];
				}
				for (local232 = 0; local232 < 4; local232++) {
					@Pc(588) byte local588 = local102.method5721();
					if (local588 == 0 && Static223.aByteArrayArrayArray3[arg8] != null) {
						if (local232 <= arg7) {
							local273 = arg9;
							local291 = arg9 + 7;
							local298 = arg2;
							if (local291 < 0) {
								local291 = 0;
							} else if (Static43.anInt1151 <= local291) {
								local291 = Static43.anInt1151;
							}
							if (arg2 < 0) {
								local298 = 0;
							} else if (arg2 >= Static260.anInt5348) {
								local298 = Static260.anInt5348;
							}
							local630 = arg2 + 7;
							if (arg9 < 0) {
								local273 = 0;
							} else if (arg9 >= Static43.anInt1151) {
								local273 = Static43.anInt1151;
							}
							if (local630 < 0) {
								local630 = 0;
							} else if (Static260.anInt5348 <= local630) {
								local630 = Static260.anInt5348;
							}
							while (local291 > local273) {
								while (local298 < local630) {
									Static223.aByteArrayArrayArray3[arg8][local273][local298] = 0;
									local298++;
								}
								local273++;
							}
						}
					} else if (local588 == 1) {
						if (Static223.aByteArrayArrayArray3[arg8] == null) {
							Static223.aByteArrayArrayArray3[arg8] = new byte[Static43.anInt1151 + 1][Static260.anInt5348 + 1];
						}
						for (local273 = 0; local273 < 64; local273 += 4) {
							for (local291 = 0; local291 < 64; local291 += 4) {
								@Pc(625) byte local625 = local102.method5721();
								if (local232 <= arg7) {
									for (local630 = local273; local630 < local273 + 4; local630++) {
										for (local634 = local291; local634 < local291 + 4; local634++) {
											if (local630 >= local11 && local630 < local11 + 8 && local17 <= local634 && local17 + 8 > local17) {
												local679 = arg9 + Static171.method3052(local634 & 0x7, arg5, local630 & 0x7);
												@Pc(691) int local691 = Static152.method2659(local630 & 0x7, arg5, local634 & 0x7) + arg2;
												if (local679 >= 0 && Static43.anInt1151 > local679 && local691 >= 0 && local691 < Static260.anInt5348) {
													Static223.aByteArrayArrayArray3[arg8][local679][local691] = local625;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (!arg0) {
			@Pc(879) Class172 local879 = null;
			label279: while (true) {
				label272: do {
					while (true) {
						while (local102.anInt6611 < local102.aByteArray82.length) {
							local232 = local102.method5720();
							if (local232 == 0) {
								local879 = new Class172(local102);
							} else {
								if (local232 == 1) {
									local264 = local102.method5720();
									continue label272;
								}
								if (local232 != 2) {
									throw new IllegalStateException();
								}
								if (local879 == null) {
									local879 = new Class172();
								}
								local879.method4542(local102);
							}
						}
						if (local879 != null) {
							Static186.method3283(arg2 >> 3, local879, arg9 >> 3);
						}
						break label279;
					}
				} while (local264 <= 0);
				for (local273 = 0; local273 < local264; local273++) {
					@Pc(909) Class1_Sub19_Sub1 local909 = new Class1_Sub19_Sub1(local102);
					if (local909.anInt2491 == 31) {
						@Pc(921) Class181 local921 = Static40.method846(local102.method5715());
						local909.method2021(local921.anInt5620, local921.anInt5614, local921.anInt5612, local921.anInt5615);
					}
					local298 = local909.anInt2482 >> 7;
					local630 = local909.anInt2484 >> 7;
					if (local909.anInt2490 == arg7 && local11 <= local298 && local298 < local11 + 8 && local17 <= local630 && local17 + 8 > local630) {
						local634 = Static269.method4850(local909.anInt2484 & 0x3FF, local909.anInt2482 & 0x3FF, arg5) + (arg9 << 7);
						local679 = Static91.method1440(arg5, local909.anInt2484 & 0x3FF, local909.anInt2482 & 0x3FF) + (arg2 << 7);
						local909.anInt2482 = local634;
						local909.anInt2484 = local679;
						local298 = local909.anInt2482 >> 7;
						local630 = local909.anInt2484 >> 7;
						if (local298 >= 0 && local630 >= 0 && Static43.anInt1151 > local298 && Static260.anInt5348 > local630) {
							local909.anInt2481 = Static276.anIntArrayArrayArray12[arg7][local298][local630] - local909.anInt2481;
							if (arg10.method4279() > 0) {
								Static208.method3738(local909);
							}
						}
					}
				}
			}
		}
		if (Static223.aByteArrayArrayArray3 != null && Static223.aByteArrayArrayArray3[arg8] != null) {
			local219 = arg9 + 7;
			local232 = arg2 + 7;
			for (local264 = arg9; local264 < local219; local264++) {
				for (local273 = arg2; local273 < local232; local273++) {
					Static223.aByteArrayArrayArray3[arg8][local264][local273] = 0;
				}
			}
		}
		if (local521) {
			return Static338.anIntArray660;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)I")
	public static int method1830(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 / arg0;
		@Pc(21) int local21 = arg2 & arg0 - 1;
		@Pc(25) int local25 = arg1 / arg0;
		@Pc(31) int local31 = arg1 & arg0 - 1;
		@Pc(36) int local36 = Static89.method1431(local15, local25);
		@Pc(43) int local43 = Static89.method1431(local15 + 1, local25);
		@Pc(50) int local50 = Static89.method1431(local15, local25 + 1);
		@Pc(59) int local59 = Static89.method1431(local15 + 1, local25 + 1);
		@Pc(66) int local66 = Static144.method2582(local36, local43, arg0, local21);
		@Pc(73) int local73 = Static144.method2582(local50, local59, arg0, local21);
		return Static144.method2582(local66, local73, arg0, local31);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
	public static void method1831() {
		if (Static343.anInt6573 != 3) {
			Static35.anInt877 = -1;
		}
	}
}
