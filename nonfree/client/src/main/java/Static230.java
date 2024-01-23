import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!qm", name = "ub", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!qm", name = "wb", descriptor = "I")
	public static int anInt3026;

	@OriginalMember(owner = "client!qm", name = "Db", descriptor = "I")
	public static int anInt3031;

	@OriginalMember(owner = "client!qm", name = "pb", descriptor = "Lclient!jl;")
	public static Class89 aClass89_16 = new Class89(64);

	@OriginalMember(owner = "client!qm", name = "xb", descriptor = "Z")
	public static boolean aBoolean185 = false;

	@OriginalMember(owner = "client!qm", name = "Hb", descriptor = "Z")
	public static boolean aBoolean186 = false;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(B)V")
	public static void method2189() {
		if (Static95.anInt2198 > 0) {
			Static95.anInt2198--;
		}
		if (Static264.anInt5302 > 1) {
			Static190.anInt4200 = Static12.anInt4023;
			Static264.anInt5302--;
		}
		if (Static139.aBoolean195) {
			Static139.aBoolean195 = false;
			Static9.method298();
			return;
		}
		@Pc(37) int local37;
		for (local37 = 0; local37 < 100 && Static238.method3762(); local37++) {
		}
		if (Static96.anInt2212 != 30) {
			return;
		}
		Static111.method1806(Static2.aClass1_Sub14_Sub1_1);
		@Pc(68) Object local68 = Static17.aClass88_1.anObject6;
		@Pc(105) int local105;
		@Pc(98) int local98;
		@Pc(107) int local107;
		@Pc(145) int local145;
		@Pc(125) int local125;
		@Pc(206) int local206;
		synchronized (Static17.aClass88_1.anObject6) {
			if (!Static143.aBoolean212) {
				Static17.aClass88_1.anInt3055 = 0;
			} else if (Static17.anInt472 != 0 || Static17.aClass88_1.anInt3055 >= 40) {
				Static2.aClass1_Sub14_Sub1_1.method2252(228);
				local98 = 0;
				Static2.aClass1_Sub14_Sub1_1.method2191(0);
				local105 = Static2.aClass1_Sub14_Sub1_1.anInt3000;
				for (local107 = 0; Static17.aClass88_1.anInt3055 > local107 && Static2.aClass1_Sub14_Sub1_1.anInt3000 - local105 < 240; local107++) {
					local98++;
					local125 = Static17.aClass88_1.anIntArray288[local107];
					@Pc(127) boolean local127 = false;
					if (local125 < 0) {
						local125 = 0;
					} else if (local125 > 65534) {
						local125 = 65534;
					}
					local145 = Static17.aClass88_1.anIntArray287[local107];
					if (local145 < 0) {
						local145 = 0;
					} else if (local145 > 65534) {
						local145 = 65534;
					}
					if (Static17.aClass88_1.anIntArray287[local107] == -1 && Static17.aClass88_1.anIntArray288[local107] == -1) {
						local125 = -1;
						local145 = -1;
						local127 = true;
					}
					if (Static196.anInt4277 != local125 || Static217.anInt4675 != local145) {
						local206 = local125 - Static196.anInt4277;
						Static196.anInt4277 = local125;
						@Pc(213) int local213 = local145 - Static217.anInt4675;
						Static217.anInt4675 = local145;
						if (Static283.anInt5684 < 8 && local206 >= -32 && local206 <= 31 && local213 >= -32 && local213 <= 31) {
							local213 += 32;
							local206 += 32;
							Static2.aClass1_Sub14_Sub1_1.method2208(local213 + (Static283.anInt5684 << 12) + (local206 << 6));
							Static283.anInt5684 = 0;
						} else if (Static283.anInt5684 < 32 && local206 >= -128 && local206 <= 127 && local213 >= -128 && local213 <= 127) {
							Static2.aClass1_Sub14_Sub1_1.method2191(Static283.anInt5684 + 128);
							local206 += 128;
							local213 += 128;
							Static2.aClass1_Sub14_Sub1_1.method2208(local213 + (local206 << 8));
							Static283.anInt5684 = 0;
						} else if (Static283.anInt5684 < 32) {
							Static2.aClass1_Sub14_Sub1_1.method2191(Static283.anInt5684 + 192);
							if (local127) {
								Static2.aClass1_Sub14_Sub1_1.method2236(Integer.MIN_VALUE);
							} else {
								Static2.aClass1_Sub14_Sub1_1.method2236(local125 | local145 << 16);
							}
							Static283.anInt5684 = 0;
						} else {
							Static2.aClass1_Sub14_Sub1_1.method2208(Static283.anInt5684 + 57344);
							if (local127) {
								Static2.aClass1_Sub14_Sub1_1.method2236(Integer.MIN_VALUE);
							} else {
								Static2.aClass1_Sub14_Sub1_1.method2236(local145 << 16 | local125);
							}
							Static283.anInt5684 = 0;
						}
					} else if (Static283.anInt5684 < 2047) {
						Static283.anInt5684++;
					}
				}
				Static2.aClass1_Sub14_Sub1_1.method2218(Static2.aClass1_Sub14_Sub1_1.anInt3000 - local105);
				if (local98 < Static17.aClass88_1.anInt3055) {
					Static17.aClass88_1.anInt3055 -= local98;
					for (local107 = 0; local107 < Static17.aClass88_1.anInt3055; local107++) {
						Static17.aClass88_1.anIntArray288[local107] = Static17.aClass88_1.anIntArray288[local98 + local107];
						Static17.aClass88_1.anIntArray287[local107] = Static17.aClass88_1.anIntArray287[local98 + local107];
					}
				} else {
					Static17.aClass88_1.anInt3055 = 0;
				}
			}
		}
		if (Static17.anInt472 != 0) {
			local98 = Static94.anInt2165;
			@Pc(438) long local438 = (Static160.aLong112 - Static12.aLong144) / 50L;
			@Pc(440) byte local440 = 0;
			if (local438 > 32767L) {
				local438 = 32767L;
			}
			if (local98 < 0) {
				local98 = 0;
			} else if (local98 > 65535) {
				local98 = 65535;
			}
			if (Static17.anInt472 == 2) {
				local440 = 1;
			}
			local107 = Static89.anInt5976;
			if (local107 < 0) {
				local107 = 0;
			} else if (local107 > 65535) {
				local107 = 65535;
			}
			Static12.aLong144 = Static160.aLong112;
			local125 = (int) local438;
			Static2.aClass1_Sub14_Sub1_1.method2252(248);
			Static2.aClass1_Sub14_Sub1_1.method2208(local125 | local440 << 15);
			Static2.aClass1_Sub14_Sub1_1.method2236(local98 << 16 | local107);
		}
		if (Static82.anInt1933 > 0) {
			Static82.anInt1933--;
		}
		if (Static136.aBoolean193 && Static82.anInt1933 <= 0) {
			Static136.aBoolean193 = false;
			Static82.anInt1933 = 20;
			Static2.aClass1_Sub14_Sub1_1.method2252(61);
			Static2.aClass1_Sub14_Sub1_1.method2210((int) Static27.aFloat44);
			Static2.aClass1_Sub14_Sub1_1.method2208((int) Static62.aFloat16);
		}
		if (Static135.aBoolean191 && !Static27.aBoolean273) {
			Static27.aBoolean273 = true;
			Static2.aClass1_Sub14_Sub1_1.method2252(150);
			Static2.aClass1_Sub14_Sub1_1.method2191(1);
		}
		if (!Static135.aBoolean191 && Static27.aBoolean273) {
			Static27.aBoolean273 = false;
			Static2.aClass1_Sub14_Sub1_1.method2252(150);
			Static2.aClass1_Sub14_Sub1_1.method2191(0);
		}
		if (!Static123.aBoolean162) {
			Static2.aClass1_Sub14_Sub1_1.method2252(109);
			Static2.aClass1_Sub14_Sub1_1.method2228(Static70.method1177());
			Static123.aBoolean162 = true;
		}
		if (Static148.aBoolean217) {
			Static148.aBoolean217 = false;
		} else {
			Static96.aFloat30 /= 2.0F;
		}
		if (Static196.aBoolean264) {
			Static196.aBoolean264 = false;
		} else {
			Static249.aFloat50 /= 2.0F;
		}
		Static301.method3611();
		if (Static96.anInt2212 != 30) {
			return;
		}
		Static280.method4269();
		Static125.method2047();
		Static145.method4651();
		Static169.anInt3805++;
		if (Static169.anInt3805 > 750) {
			Static9.method298();
			return;
		}
		Static76.method1319();
		Static3.method36();
		Static78.method1326();
		for (local37 = Static106.method1766(true); local37 != -1; local37 = Static106.method1766(false)) {
			Static146.method3260(local37);
			Static137.anIntArray228[Static259.anInt5238++ & 0x1F] = local37;
		}
		for (@Pc(693) Class1_Sub3_Sub22 local693 = Static178.method2873(); local693 != null; local693 = Static178.method2873()) {
			local105 = local693.method4472();
			local98 = local693.method4466();
			if (local105 == 1) {
				Static279.anIntArray507[local98] = local693.anInt5852;
				Static206.anIntArray397[Static148.anInt3328++ & 0x1F] = local98;
			} else if (local105 == 2) {
				Static31.aStringArray4[local98] = local693.aString417;
				Static36.anIntArray118[Static140.anInt3192++ & 0x1F] = local98;
			} else {
				@Pc(739) Class191 local739;
				if (local105 == 3) {
					local739 = Static171.method2789(local98);
					if (!local693.aString417.equals(local739.aString436)) {
						local739.aString436 = local693.aString417;
						Static40.method817(local739);
					}
				} else {
					@Pc(770) int local770;
					if (local105 == 4) {
						local739 = Static171.method2789(local98);
						local145 = local693.anInt5852;
						local125 = local693.anInt5849;
						local770 = local693.anInt5843;
						if (local145 != local739.anInt6149 || local739.anInt6171 != local125 || local770 != local739.anInt6160) {
							local739.anInt6149 = local145;
							local739.anInt6171 = local125;
							local739.anInt6160 = local770;
							Static40.method817(local739);
						}
					} else if (local105 == 5) {
						local739 = Static171.method2789(local98);
						if (local739.anInt6080 != local693.anInt5852 || local693.anInt5852 == -1) {
							local739.anInt6104 = 0;
							local739.anInt6080 = local693.anInt5852;
							local739.anInt6116 = 1;
							local739.anInt6103 = 0;
							Static40.method817(local739);
						}
					} else if (local105 == 6) {
						local107 = local693.anInt5852;
						local145 = local107 >> 10 & 0x1F;
						local125 = local107 >> 5 & 0x1F;
						local770 = local107 & 0x1F;
						local206 = (local145 << 19) - (-(local125 << 11) - (local770 << 3));
						@Pc(883) Class191 local883 = Static171.method2789(local98);
						if (local206 != local883.anInt6083) {
							local883.anInt6083 = local206;
							Static40.method817(local883);
						}
					} else if (local105 == 7) {
						local739 = Static171.method2789(local98);
						@Pc(1191) boolean local1191 = local693.anInt5852 == 1;
						if (local1191 != local739.aBoolean399) {
							local739.aBoolean399 = local1191;
							Static40.method817(local739);
						}
					} else if (local105 == 8) {
						local739 = Static171.method2789(local98);
						if (local739.anInt6091 != local693.anInt5852 || local693.anInt5849 != local739.anInt6118 || local693.anInt5843 != local739.anInt6173) {
							local739.anInt6173 = local693.anInt5843;
							local739.anInt6118 = local693.anInt5849;
							if (local739.anInt6167 != -1) {
								if (local739.anInt6084 > 0) {
									local739.anInt6173 = local739.anInt6173 * 32 / local739.anInt6084;
								} else if (local739.anInt6150 > 0) {
									local739.anInt6173 = local739.anInt6173 * 32 / local739.anInt6150;
								}
							}
							local739.anInt6091 = local693.anInt5852;
							Static40.method817(local739);
						}
					} else if (local105 == 9) {
						local739 = Static171.method2789(local98);
						if (local693.anInt5852 != local739.anInt6167 || local693.anInt5849 != local739.anInt6139) {
							local739.anInt6139 = local693.anInt5849;
							local739.anInt6167 = local693.anInt5852;
							Static40.method817(local739);
						}
					} else if (local105 == 10) {
						local739 = Static171.method2789(local98);
						if (local693.anInt5852 != local739.anInt6137 || local739.anInt6138 != local693.anInt5849 || local693.anInt5843 != local739.anInt6092) {
							local739.anInt6138 = local693.anInt5849;
							local739.anInt6137 = local693.anInt5852;
							local739.anInt6092 = local693.anInt5843;
							Static40.method817(local739);
						}
					} else if (local105 == 11) {
						local739 = Static171.method2789(local98);
						local739.aByte25 = 0;
						local739.anInt6123 = local739.anInt6145 = local693.anInt5852;
						local739.anInt6157 = local739.anInt6114 = local693.anInt5849;
						local739.aByte28 = 0;
						Static40.method817(local739);
					} else if (local105 == 12) {
						local739 = Static171.method2789(local98);
						local145 = local693.anInt5852;
						if (local739 != null && local739.anInt6086 == 0) {
							if (local145 > local739.anInt6151 - local739.anInt6128) {
								local145 = local739.anInt6151 - local739.anInt6128;
							}
							if (local145 < 0) {
								local145 = 0;
							}
							if (local739.anInt6106 != local145) {
								local739.anInt6106 = local145;
								Static40.method817(local739);
							}
						}
					} else if (local105 == 13) {
						local739 = Static171.method2789(local98);
						local739.anInt6144 = local693.anInt5852;
					} else if (local105 == 14) {
						local739 = Static171.method2789(local98);
						local739.anInt6140 = local693.anInt5852;
					}
				}
			}
		}
		if (Static188.anInt4166 != 0) {
			Static173.anInt3891 += 20;
			if (Static173.anInt3891 >= 400) {
				Static188.anInt4166 = 0;
			}
		}
		Static286.anInt5740++;
		if (Static270.aClass191_15 != null) {
			Static34.anInt790++;
			if (Static34.anInt790 >= 15) {
				Static40.method817(Static270.aClass191_15);
				Static270.aClass191_15 = null;
			}
		}
		@Pc(1348) Class191 local1348;
		if (Static75.aClass191_4 != null) {
			Static40.method817(Static75.aClass191_4);
			if (Static149.anInt3345 + 5 < Static89.anInt5974 || Static149.anInt3345 - 5 > Static89.anInt5974 || Static289.anInt5816 > Static234.anInt4914 + 5 || Static289.anInt5816 < Static234.anInt4914 - 5) {
				Static39.aBoolean71 = true;
			}
			Static183.anInt4047++;
			if (Static202.anInt4403 == 0) {
				if (Static39.aBoolean71 && Static183.anInt4047 >= 5) {
					if (Static75.aClass191_4 == Static210.aClass191_9 && Static200.anInt4363 != Static143.anInt3267) {
						local1348 = Static75.aClass191_4;
						@Pc(1354) byte local1354 = 0;
						if (Static134.anInt3080 == 1 && local1348.anInt6115 == 206) {
							local1354 = 1;
						}
						if (local1348.anIntArray561[Static143.anInt3267] <= 0) {
							local1354 = 0;
						}
						if (Static35.method737(local1348).method4551()) {
							local107 = Static200.anInt4363;
							local145 = Static143.anInt3267;
							local1348.anIntArray561[local145] = local1348.anIntArray561[local107];
							local1348.anIntArray553[local145] = local1348.anIntArray553[local107];
							local1348.anIntArray561[local107] = -1;
							local1348.anIntArray553[local107] = 0;
						} else if (local1354 == 1) {
							local107 = Static200.anInt4363;
							local145 = Static143.anInt3267;
							while (local107 != local145) {
								if (local107 > local145) {
									local1348.method4665(local107 - 1, local107);
									local107--;
								} else if (local107 < local145) {
									local1348.method4665(local107 + 1, local107);
									local107++;
								}
							}
						} else {
							local1348.method4665(Static143.anInt3267, Static200.anInt4363);
						}
						Static2.aClass1_Sub14_Sub1_1.method2252(146);
						Static2.aClass1_Sub14_Sub1_1.method2250(Static75.aClass191_4.anInt6134);
						Static2.aClass1_Sub14_Sub1_1.method2208(Static200.anInt4363);
						Static2.aClass1_Sub14_Sub1_1.method2240(Static143.anInt3267);
						Static2.aClass1_Sub14_Sub1_1.method2207(local1354);
					}
				} else if ((Static102.anInt849 == 1 || Static300.method4578(Static181.anInt3973 - 1)) && Static181.anInt3973 > 2) {
					Static301.method3612();
				} else if (Static181.anInt3973 > 0) {
					Static103.method1723();
				}
				Static17.anInt472 = 0;
				Static75.aClass191_4 = null;
				Static34.anInt790 = 10;
			}
		}
		Static266.anInt5321 = 0;
		Static81.aBoolean130 = false;
		Static77.aClass191_5 = null;
		Static129.aBoolean173 = false;
		@Pc(1503) Class191 local1503 = Static129.aClass191_8;
		Static129.aClass191_8 = null;
		local1348 = Static2.aClass191_2;
		Static2.aClass191_2 = null;
		while (Static312.method4735() && Static266.anInt5321 < 128) {
			Static301.anIntArray445[Static266.anInt5321] = Static35.anInt873;
			Static242.anIntArray465[Static266.anInt5321] = Static89.aChar5;
			Static266.anInt5321++;
		}
		Static246.aClass191_12 = null;
		if (Static36.anInt902 != -1) {
			Static138.method2309(0, Static36.anInt902, 0, 0, 0, Static38.anInt950, Static270.anInt5412);
		}
		Static12.anInt4023++;
		if (Static246.aClass191_12 != null) {
			Static184.method2982();
		}
		while (true) {
			@Pc(1575) Class191 local1575;
			@Pc(1563) Class191 local1563;
			@Pc(1558) Class1_Sub27 local1558;
			do {
				local1558 = (Class1_Sub27) Static145.aClass26_58.method673();
				if (local1558 == null) {
					while (true) {
						do {
							local1558 = (Class1_Sub27) Static266.aClass26_51.method673();
							if (local1558 == null) {
								while (true) {
									do {
										local1558 = (Class1_Sub27) Static262.aClass26_50.method673();
										if (local1558 == null) {
											if (Static246.aClass191_12 == null) {
												Static47.anInt1141 = 0;
											}
											if (Static238.aClass191_11 != null) {
												Static208.method3295();
											}
											if (Static77.anInt1764 > 0 && Static23.aBooleanArray3[82] && Static23.aBooleanArray3[81] && Static134.anInt3083 != 0) {
												local107 = Static185.anInt4085 - Static134.anInt3083;
												if (local107 < 0) {
													local107 = 0;
												} else if (local107 > 3) {
													local107 = 3;
												}
												Static50.method278(local107, Static56.aClass2_Sub4_Sub2_1.anIntArray286[0] + Static217.anInt4673, Static159.anInt3527 - -Static56.aClass2_Sub4_Sub2_1.anIntArray283[0]);
											}
											if (Static77.anInt1764 > 0 && Static23.aBooleanArray3[82] && Static23.aBooleanArray3[81]) {
												if (Static118.anInt2549 != -1) {
													Static50.method278(Static185.anInt4085, Static217.anInt4673 + Static170.anInt3813, Static118.anInt2549 + Static159.anInt3527);
												}
												Static38.anInt957 = 0;
												Static65.anInt1391 = 0;
											} else if (Static65.anInt1391 == 2) {
												if (Static118.anInt2549 != -1) {
													Static2.aClass1_Sub14_Sub1_1.method2252(216);
													Static2.aClass1_Sub14_Sub1_1.method2240(Static8.anInt225);
													Static2.aClass1_Sub14_Sub1_1.method2198(Static118.anInt2549 + Static159.anInt3527);
													Static2.aClass1_Sub14_Sub1_1.method2236(Static217.anInt4676);
													Static2.aClass1_Sub14_Sub1_1.method2210(Static217.anInt4673 + Static170.anInt3813);
													Static77.anInt1763 = Static94.anInt2165;
													Static188.anInt4166 = 1;
													Static95.anInt2197 = Static89.anInt5976;
													Static173.anInt3891 = 0;
												}
												Static65.anInt1391 = 0;
											} else if (Static38.anInt957 == 2) {
												if (Static118.anInt2549 != -1) {
													Static2.aClass1_Sub14_Sub1_1.method2252(125);
													Static2.aClass1_Sub14_Sub1_1.method2210(Static118.anInt2549 + Static159.anInt3527);
													Static2.aClass1_Sub14_Sub1_1.method2208(Static217.anInt4673 + Static170.anInt3813);
													Static173.anInt3891 = 0;
													Static95.anInt2197 = Static89.anInt5976;
													Static188.anInt4166 = 1;
													Static77.anInt1763 = Static94.anInt2165;
												}
												Static38.anInt957 = 0;
											} else if (Static118.anInt2549 != -1 && Static65.anInt1391 == 0 && Static38.anInt957 == 0) {
												local107 = (Static118.anInt2549 << 1) - (Static56.aClass2_Sub4_Sub2_1.method2088() - 1) >> 1;
												local145 = (Static170.anInt3813 << 1) + 1 - Static56.aClass2_Sub4_Sub2_1.method2088() >> 1;
												Static58.method1055(local107, local145, 0);
												Static95.anInt2197 = Static89.anInt5976;
												Static173.anInt3891 = 0;
												Static188.anInt4166 = 1;
												Static77.anInt1763 = Static94.anInt2165;
												Static72.method1264(local145, local107, 0, 0, 0, Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
											}
											Static118.anInt2549 = -1;
											Static193.method3115();
											if (Static2.aClass191_2 != local1348) {
												if (local1348 != null) {
													Static40.method817(local1348);
												}
												if (Static2.aClass191_2 != null) {
													Static40.method817(Static2.aClass191_2);
												}
											}
											if (local1503 != Static129.aClass191_8 && Static129.anInt2751 == Static193.anInt4248) {
												if (local1503 != null) {
													Static40.method817(local1503);
												}
												if (Static129.aClass191_8 != null) {
													Static40.method817(Static129.aClass191_8);
												}
											}
											if (Static129.aClass191_8 == null) {
												if (Static129.anInt2751 > 0) {
													Static129.anInt2751--;
												}
											} else if (Static129.anInt2751 < Static193.anInt4248) {
												Static129.anInt2751++;
												if (Static193.anInt4248 == Static129.anInt2751) {
													Static40.method817(Static129.aClass191_8);
												}
											}
											for (local107 = 0; local107 < 5; local107++) {
												@Pc(2040) int local2040 = Static44.anIntArray132[local107]++;
											}
											local107 = Static114.method1841();
											local145 = Static296.method4536();
											if (local107 > 15000 && local145 > 15000) {
												Static95.anInt2198 = 250;
												Static183.method2973(14500);
												Static2.aClass1_Sub14_Sub1_1.method2252(209);
											}
											if (Static296.aClass47_7 != null && Static296.aClass47_7.anInt1417 == 1) {
												if (Static296.aClass47_7.anObject2 != null) {
													Static5.method2409(Static209.aString309, Static205.aBoolean278);
												}
												Static296.aClass47_7 = null;
												Static205.aBoolean278 = false;
												Static209.aString309 = null;
											}
											Static193.anInt4254++;
											Static7.anInt206++;
											Static196.anInt4273++;
											if (Static7.anInt206 > 500) {
												local125 = (int) (Math.random() * 8.0D);
												if ((local125 & 0x2) == 2) {
													Static101.anInt163 += Static176.anInt3900;
												}
												if ((local125 & 0x1) == 1) {
													Static69.anInt1442 += Static309.anInt6194;
												}
												if ((local125 & 0x4) == 4) {
													Static206.anInt4452 += Static266.anInt5324;
												}
												Static7.anInt206 = 0;
											}
											if (Static101.anInt163 < -55) {
												Static176.anInt3900 = 2;
											}
											if (Static206.anInt4452 < -40) {
												Static266.anInt5324 = 1;
											}
											if (Static101.anInt163 > 55) {
												Static176.anInt3900 = -2;
											}
											if (Static69.anInt1442 < -50) {
												Static309.anInt6194 = 2;
											}
											if (Static206.anInt4452 > 40) {
												Static266.anInt5324 = -1;
											}
											if (Static193.anInt4254 > 500) {
												local125 = (int) (Math.random() * 8.0D);
												if ((local125 & 0x2) == 2) {
													Static253.anInt5117 += Static219.anInt4682;
												}
												Static193.anInt4254 = 0;
												if ((local125 & 0x1) == 1) {
													Static220.anInt4691 += Static163.anInt3553;
												}
											}
											if (Static220.anInt4691 < -60) {
												Static163.anInt3553 = 2;
											}
											if (Static69.anInt1442 > 50) {
												Static309.anInt6194 = -2;
											}
											if (Static253.anInt5117 < -20) {
												Static219.anInt4682 = 1;
											}
											if (Static253.anInt5117 > 10) {
												Static219.anInt4682 = -1;
											}
											if (Static220.anInt4691 > 60) {
												Static163.anInt3553 = -2;
											}
											if (Static196.anInt4273 > 50) {
												Static2.aClass1_Sub14_Sub1_1.method2252(218);
											}
											if (Static178.aBoolean247) {
												Static109.method1795();
												Static178.aBoolean247 = false;
											}
											try {
												if (Static5.aClass104_5 != null && Static2.aClass1_Sub14_Sub1_1.anInt3000 > 0) {
													Static5.aClass104_5.method2579(Static2.aClass1_Sub14_Sub1_1.aByteArray55, Static2.aClass1_Sub14_Sub1_1.anInt3000);
													Static2.aClass1_Sub14_Sub1_1.anInt3000 = 0;
													Static196.anInt4273 = 0;
												}
											} catch (@Pc(2295) IOException local2295) {
												Static9.method298();
											}
											return;
										}
										local1563 = local1558.aClass191_14;
										if (local1563.anInt6165 < 0) {
											break;
										}
										local1575 = Static171.method2789(local1563.anInt6093);
									} while (local1575 == null || local1575.aClass191Array2 == null || local1575.aClass191Array2.length <= local1563.anInt6165 || local1563 != local1575.aClass191Array2[local1563.anInt6165]);
									Static140.method2329(local1558);
								}
							}
							local1563 = local1558.aClass191_14;
							if (local1563.anInt6165 < 0) {
								break;
							}
							local1575 = Static171.method2789(local1563.anInt6093);
						} while (local1575 == null || local1575.aClass191Array2 == null || local1575.aClass191Array2.length <= local1563.anInt6165 || local1575.aClass191Array2[local1563.anInt6165] != local1563);
						Static140.method2329(local1558);
					}
				}
				local1563 = local1558.aClass191_14;
				if (local1563.anInt6165 < 0) {
					break;
				}
				local1575 = Static171.method2789(local1563.anInt6093);
			} while (local1575 == null || local1575.aClass191Array2 == null || local1563.anInt6165 >= local1575.aClass191Array2.length || local1575.aClass191Array2[local1563.anInt6165] != local1563);
			Static140.method2329(local1558);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method2214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static170.anInt3814 <= arg5 - arg0 && arg0 + arg5 <= Static310.anInt6206 && arg1 - arg0 >= Static206.anInt4449 && Static90.anInt2088 >= arg1 + arg0) {
			Static229.method3619(arg1, arg5, arg3, arg2, arg4, arg0);
		} else {
			Static18.method421(arg2, arg0, arg1, arg3, arg4, arg5);
		}
	}
}
