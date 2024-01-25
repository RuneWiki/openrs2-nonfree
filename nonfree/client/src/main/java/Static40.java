import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "Lclient!kr;")
	public static Class46 aClass46_5;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!fh;")
	public static Class68 aClass68_3;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_27 = new Class157(19, 8);

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "Lclient!wl;")
	public static Class221 aClass221_34 = null;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
	public static void method501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static197.anInt4298 && Static38.anInt553 >= arg3) {
			@Pc(19) int local19 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg0);
			@Pc(25) int local25 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg2);
			Static212.method3987(local25, arg1, local19, arg3);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!dr;II)V")
	public static void method503(@OriginalArg(0) int arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 0 || arg2 < 0 || Static290.anInt5812 == 0 || Static176.anInt3972 == 0) {
			return;
		}
		arg1.method3716(Static28.anInt435, Static115.anInt2454, Static290.anInt5812, Static176.anInt3972);
		arg1.method3677(Static291.anInt5262, Static251.anInt5259, Static290.anInt5812, Static176.anInt3972);
		@Pc(29) Class38 local29 = arg1.method3736();
		local29.method4471(Static11.anInt194, Static229.anInt4966, Static215.anInt4731, Static148.anInt3214, Static316.anInt6233, Static275.anInt5635);
		arg1.method3682(local29);
		@Pc(58) int local58;
		@Pc(67) int local67;
		@Pc(70) int local70;
		@Pc(79) int local79;
		@Pc(88) int local88;
		@Pc(103) int[] local103;
		@Pc(135) int local135;
		@Pc(144) int local144;
		if (Static101.aClass105Array2 != null) {
			@Pc(44) int local44 = -1;
			@Pc(46) int local46 = -1;
			@Pc(49) int local49 = arg1.method3706();
			local58 = (arg0 - Static28.anInt435) * local49 / Static290.anInt5812;
			local67 = (arg2 - Static115.anInt2454) * local49 / Static176.anInt3972;
			local70 = arg1.method3674();
			local79 = local70 * (arg0 - Static28.anInt435) / Static290.anInt5812;
			local88 = (arg2 - Static115.anInt2454) * local70 / Static176.anInt3972;
			local103 = new int[] { local58, local67, local49 };
			local29.method4472(local103);
			@Pc(121) int[] local121 = new int[] { local79, local88, local70 };
			local29.method4472(local121);
			@Pc(126) float local126 = 0.0F;
			local135 = local121[0] - local103[0];
			local144 = local121[1] - local103[1];
			@Pc(153) int local153 = local121[2] - local103[2];
			while (local126 < 1.0F) {
				@Pc(166) int local166 = (int) ((float) local103[0] + local126 * (float) local135);
				@Pc(170) int local170 = local166 >> 7;
				@Pc(181) int local181 = (int) ((float) local153 * local126 + (float) local103[2]);
				@Pc(185) int local185 = local181 >> 7;
				if (local170 > 0 && local185 > 0 && local170 < Static66.anInt1177 && Static12.anInt213 > local185) {
					@Pc(205) int local205 = Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77;
					if (local205 < 3 && (Static243.aByteArrayArrayArray10[1][local170][local185] & 0x2) != 0) {
						local205++;
					}
					if ((float) Static101.aClass105Array2[local205].method4452(local166, local181) < local126 * (float) local144 + (float) local103[1]) {
						local44 = Static177.aClass1_Sub2_Sub3_Sub1_1.method5787() * 64 + local166 - 64 >> 7;
						local46 = (Static177.aClass1_Sub2_Sub3_Sub1_1.method5787() - 1) * 64 + local181 >> 7;
						break;
					}
				}
				local126 = (float) ((double) local126 + 0.01D);
			}
			if (local44 != -1 && local46 != -1) {
				if (Static60.aBoolean109 && (Static7.anInt142 & 0x40) != 0) {
					@Pc(301) Class68 local301 = Static50.method942(Static71.anInt1272, Static310.anInt6128);
					if (local301 == null) {
						Static295.method4928();
					} else {
						Static104.method2071(local46, 17, local44, false, Static295.aString63, " ->", Static333.anInt6459, 0L, true);
					}
				} else {
					if (Static150.aClass172_3 == Static13.aClass172_1) {
						Static104.method2071(local46, 59, local44, false, Static361.aClass140_162.method4155(Static239.anInt2803), "", -1, 0L, true);
					}
					Static104.method2071(local46, 20, local44, false, Static79.aString14, "", -1, 0L, true);
				}
			}
		}
		@Pc(354) Class193 local354 = Static45.aClass193_4;
		for (@Pc(359) Class57_Sub5 local359 = (Class57_Sub5) local354.method5224(); local359 != null; local359 = (Class57_Sub5) local354.method5223()) {
			if (local359.anInt3961 == Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77 && local359.method3419(arg0, arg1, arg2)) {
				@Pc(480) int local480;
				if (local359.aClass1_1 instanceof Class1_Sub2_Sub3_Sub1) {
					@Pc(381) Class1_Sub2_Sub3_Sub1 local381 = (Class1_Sub2_Sub3_Sub1) local359.aClass1_1;
					local58 = local381.method5787();
					if ((local58 & 0x1) == 0 && (local381.anInt6893 & 0x7F) == 0 && (local381.anInt6888 & 0x7F) == 0 || (local58 & 0x1) == 1 && (local381.anInt6893 & 0x7F) == 64 && (local381.anInt6888 & 0x7F) == 64) {
						local67 = local381.anInt6893 + 64 - local381.method5787() * 64;
						local70 = local381.anInt6888 - (local381.method5787() - 1) * 64;
						@Pc(491) int local491;
						for (local79 = 0; local79 < Static186.anInt4092; local79++) {
							@Pc(453) Class1_Sub2_Sub3_Sub2 local453 = Static95.aClass1_Sub2_Sub3_Sub2Array1[Static171.anIntArray292[local79]];
							if (local453 != null && Static6.anInt91 != local453.anInt6930 && local453.aBoolean615) {
								local480 = local453.anInt6893 + 64 - local453.aClass139_1.anInt4778 * 64;
								local491 = local453.anInt6888 + 64 - local453.aClass139_1.anInt4778 * 64;
								if (local67 <= local480 && local453.aClass139_1.anInt4778 <= local381.method5787() - (local480 - local67 >> 7) && local491 >= local70 && local453.aClass139_1.anInt4778 <= local381.method5787() - (local491 - local70 >> 7)) {
									Static226.method4194(Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77 != local359.anInt3961, local453);
									local453.anInt6930 = Static6.anInt91;
								}
							}
						}
						local88 = Static9.anInt173;
						local103 = Static195.anIntArray322;
						for (local491 = 0; local491 < local88; local491++) {
							@Pc(571) Class1_Sub2_Sub3_Sub1 local571 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local103[local491]];
							if (local571 != null && local571.anInt6930 != Static6.anInt91 && local381 != local571 && local571.aBoolean615) {
								local135 = local571.anInt6893 + 64 - local571.method5787() * 64;
								local144 = local571.anInt6888 + 64 - local571.method5787() * 64;
								if (local67 <= local135 && local571.method5787() <= local381.method5787() - (local135 - local67 >> 7) && local70 <= local144 && local571.method5787() <= local381.method5787() - (local144 - local70 >> 7)) {
									Static80.method1629(Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77 != local359.anInt3961, local571);
									local571.anInt6930 = Static6.anInt91;
								}
							}
						}
					}
					if (Static6.anInt91 == local381.anInt6930) {
						continue;
					}
					Static80.method1629(local359.anInt3961 != Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77, local381);
					local381.anInt6930 = Static6.anInt91;
				}
				if (local359.aClass1_1 instanceof Class1_Sub2_Sub3_Sub2) {
					@Pc(706) Class1_Sub2_Sub3_Sub2 local706 = (Class1_Sub2_Sub3_Sub2) local359.aClass1_1;
					if (local706.aClass139_1 != null) {
						if ((local706.aClass139_1.anInt4778 & 0x1) == 0 && (local706.anInt6893 & 0x7F) == 0 && (local706.anInt6888 & 0x7F) == 0 || (local706.aClass139_1.anInt4778 & 0x1) == 1 && (local706.anInt6893 & 0x7F) == 64 && (local706.anInt6888 & 0x7F) == 64) {
							local58 = local706.anInt6893 + 64 - local706.aClass139_1.anInt4778 * 64;
							local67 = local706.anInt6888 + 64 - local706.aClass139_1.anInt4778 * 64;
							for (local70 = 0; local70 < Static186.anInt4092; local70++) {
								@Pc(788) Class1_Sub2_Sub3_Sub2 local788 = Static95.aClass1_Sub2_Sub3_Sub2Array1[Static171.anIntArray292[local70]];
								if (local788 != null && local788.anInt6930 != Static6.anInt91 && local788 != local706 && local788.aBoolean615) {
									local88 = local788.anInt6893 - (local788.aClass139_1.anInt4778 - 1) * 64;
									local480 = local788.anInt6888 + 64 - local788.aClass139_1.anInt4778 * 64;
									if (local88 >= local58 && local706.aClass139_1.anInt4778 - (local88 - local58 >> 7) >= local788.aClass139_1.anInt4778 && local67 <= local480 && local788.aClass139_1.anInt4778 <= local706.aClass139_1.anInt4778 - (local480 - local67 >> 7)) {
										Static226.method4194(local359.anInt3961 != Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77, local788);
										local788.anInt6930 = Static6.anInt91;
									}
								}
							}
							local79 = Static9.anInt173;
							@Pc(896) int[] local896 = Static195.anIntArray322;
							for (local480 = 0; local480 < local79; local480++) {
								@Pc(906) Class1_Sub2_Sub3_Sub1 local906 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local896[local480]];
								if (local906 != null && Static6.anInt91 != local906.anInt6930 && local906.aBoolean615) {
									@Pc(933) int local933 = local906.anInt6893 - (local906.method5787() - 1) * 64;
									local135 = local906.anInt6888 + 64 - local906.method5787() * 64;
									if (local58 <= local933 && local906.method5787() <= local706.aClass139_1.anInt4778 - (local933 - local58 >> 7) && local67 <= local135 && local906.method5787() <= local706.aClass139_1.anInt4778 - (local135 - local67 >> 7)) {
										Static80.method1629(Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77 != local359.anInt3961, local906);
										local906.anInt6930 = Static6.anInt91;
									}
								}
							}
						}
						if (Static6.anInt91 == local706.anInt6930) {
							continue;
						}
						Static226.method4194(local359.anInt3961 != Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77, local706);
						local706.anInt6930 = Static6.anInt91;
					}
				}
				if (local359.aClass1_1 instanceof Class1_Sub5_Sub1) {
					@Pc(1054) Class2_Sub20 local1054 = (Class2_Sub20) Static198.aClass41_24.method902((long) (local359.anInt3962 | local359.anInt3963 << 14 | local359.anInt3961 << 28));
					if (local1054 != null) {
						for (@Pc(1062) Class2_Sub27 local1062 = (Class2_Sub27) local1054.aClass180_16.method4920(); local1062 != null; local1062 = (Class2_Sub27) local1054.aClass180_16.method4921()) {
							@Pc(1070) Class122 local1070 = Static310.aClass184_2.method5040(local1062.anInt4717);
							if (!Static60.aBoolean109) {
								if (Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77 == local359.anInt3961) {
									@Pc(1084) String[] local1084 = local1070.aStringArray26;
									for (local79 = 4; local79 >= 0; local79--) {
										if (local1084 != null && local1084[local79] != null) {
											@Pc(1096) byte local1096 = 0;
											local480 = Static189.anInt4126;
											if (local79 == 0) {
												local1096 = 23;
											}
											if (local79 == 1) {
												local1096 = 44;
											}
											if (local79 == 2) {
												local1096 = 12;
											}
											if (local79 == 3) {
												local1096 = 46;
											}
											if (local79 == 4) {
												local1096 = 22;
											}
											if (local79 == local1070.anInt3950) {
												local480 = local1070.anInt3917;
											}
											if (local1070.anInt3907 == local79) {
												local480 = local1070.anInt3893;
											}
											Static104.method2071(local359.anInt3963, local1096, local359.anInt3962, false, local1084[local79], "<col=ff9040>" + local1070.aString37, local480, (long) local1062.anInt4717, true);
										}
									}
								}
								Static104.method2071(local359.anInt3963, 1009, local359.anInt3962, Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77 != local359.anInt3961, Static341.aClass140_11.method4155(Static239.anInt2803), "<col=ff9040>" + local1070.aString37, Static176.anInt3967, (long) local1062.anInt4717, true);
							} else if (Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77 == local359.anInt3961) {
								@Pc(1232) Class2_Sub9_Sub15 local1232 = Static134.anInt2876 == -1 ? null : Static176.method3422(Static134.anInt2876);
								if ((Static7.anInt142 & 0x1) != 0 && (local1232 == null || local1070.method3398(Static134.anInt2876, local1232.anInt4464) != local1232.anInt4464)) {
									Static104.method2071(local359.anInt3963, 51, local359.anInt3962, false, Static295.aString63, Static228.aString46 + " -> <col=ff9040>" + local1070.aString37, Static333.anInt6459, (long) local1062.anInt4717, true);
								}
							}
						}
					}
				}
				if (local359.aClass1_1 instanceof Interface8) {
					@Pc(1298) Interface8 local1298 = (Interface8) local359.aClass1_1;
					@Pc(1306) Class74 local1306 = Static228.method4210(local1298.method5502());
					if (local1306.anIntArray161 != null) {
						local1306 = local1306.method1997();
					}
					if (local1306 != null) {
						if (!Static60.aBoolean109) {
							if (local359.anInt3961 == Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77) {
								@Pc(1393) String[] local1393 = local1306.aStringArray13;
								if (local1393 != null) {
									for (local70 = 4; local70 >= 0; local70--) {
										if (local1393[local70] != null) {
											@Pc(1405) short local1405 = 0;
											local88 = Static189.anInt4126;
											if (local70 == 0) {
												local1405 = 45;
											}
											if (local70 == 1) {
												local1405 = 48;
											}
											if (local70 == 2) {
												local1405 = 4;
											}
											if (local70 == 3) {
												local1405 = 3;
											}
											if (local1306.anInt2099 == local70) {
												local88 = local1306.anInt2068;
											}
											if (local70 == 4) {
												local1405 = 1010;
											}
											if (local1306.anInt2080 == local70) {
												local88 = local1306.anInt2052;
											}
											Static104.method2071(local359.anInt3963, local1405, local359.anInt3962, false, local1393[local70], "<col=00ffff>" + local1306.aString26, local88, Static142.method2731(local359.anInt3963, local359.anInt3962, local1298), true);
										}
									}
								}
							}
							Static104.method2071(local359.anInt3963, 1002, local359.anInt3962, local359.anInt3961 != Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77, Static341.aClass140_11.method4155(Static239.anInt2803), "<col=00ffff>" + local1306.aString26, Static176.anInt3967, (long) local1306.anInt2071, true);
						} else if (local359.anInt3961 == Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77) {
							@Pc(1332) Class2_Sub9_Sub15 local1332 = Static134.anInt2876 == -1 ? null : Static176.method3422(Static134.anInt2876);
							if ((Static7.anInt142 & 0x4) != 0 && (local1332 == null || local1306.method2011(Static134.anInt2876, local1332.anInt4464) != local1332.anInt4464)) {
								Static104.method2071(local359.anInt3963, 2, local359.anInt3962, false, Static295.aString63, Static228.aString46 + " -> <col=00ffff>" + local1306.aString26, Static333.anInt6459, Static142.method2731(local359.anInt3963, local359.anInt3962, local1298), true);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!je;)V")
	public static void method504(@OriginalArg(1) Class1_Sub2_Sub3_Sub1 arg0) {
		@Pc(18) Class2_Sub37 local18 = (Class2_Sub37) Static13.aClass41_1.method902((long) arg0.anInt6896);
		if (local18 == null) {
			return;
		}
		if (local18.aClass2_Sub11_Sub4_3 != null) {
			Static31.aClass2_Sub11_Sub3_1.method4110(local18.aClass2_Sub11_Sub4_3);
			local18.aClass2_Sub11_Sub4_3 = null;
		}
		local18.method5723();
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIZILclient!dr;[B[Lclient!ek;)V")
	public static void method505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class37 arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) Class61[] arg5) {
		@Pc(10) Class2_Sub12 local10 = new Class2_Sub12(arg4);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method3120();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			while (true) {
				@Pc(28) int local28 = local10.method3153();
				if (local28 == 0) {
					break;
				}
				local24 += local28 - 1;
				@Pc(40) int local40 = local24 & 0x3F;
				@Pc(46) int local46 = local24 >> 6 & 0x3F;
				@Pc(50) int local50 = local24 >> 12;
				@Pc(56) int local56 = local10.method3124();
				@Pc(60) int local60 = local56 >> 2;
				@Pc(64) int local64 = local56 & 0x3;
				@Pc(69) int local69 = local46 + arg1;
				@Pc(73) int local73 = local40 + arg0;
				if (local69 > 0 && local73 > 0 && Static66.anInt1177 - 1 > local69 && Static12.anInt213 - 1 > local73) {
					@Pc(99) Class61 local99 = null;
					if (!arg2) {
						@Pc(103) int local103 = local50;
						if ((Static243.aByteArrayArrayArray10[1][local69][local73] & 0x2) == 2) {
							local103 = local50 - 1;
						}
						if (local103 >= 0) {
							local99 = arg5[local103];
						}
					}
					Static118.method2301(true, local64, arg3, local99, local73, local12, arg2, local50, -1, local69, local50, local60);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method506(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(15) String local15 = "";
			if (arg1 != null) {
				local15 = Static239.method2540(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local15 = local15 + " | ";
				}
				local15 = local15 + arg0;
			}
			Static284.method4825(local15);
			local15 = Static94.method1860(":", "%3a", local15);
			local15 = Static94.method1860("@", "%40", local15);
			local15 = Static94.method1860("&", "%26", local15);
			local15 = Static94.method1860("#", "%23", local15);
			if (Static227.aClass179_5.anApplet1 != null) {
				@Pc(107) Class26 local107 = Static227.aClass179_5.method4876(new URL(Static227.aClass179_5.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static209.anInt6934 + "&u=" + Static126.aLong91 + "&v1=" + Static293.aString58 + "&v2=" + Static293.aString56 + "&e=" + local15));
				while (local107.anInt484 == 0) {
					Static248.method4401(1L);
				}
				if (local107.anInt484 == 1) {
					@Pc(128) DataInputStream local128 = (DataInputStream) local107.anObject1;
					local128.read();
					local128.close();
				}
			}
		} catch (@Pc(135) Exception local135) {
		}
	}
}
