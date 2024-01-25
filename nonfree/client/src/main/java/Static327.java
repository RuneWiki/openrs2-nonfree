import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "Lclient!kb;")
	public static Class133 aClass133_3;

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
	public static int anInt5553 = 0;

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "Lclient!ka;")
	public static final Class132 aClass132_52 = new Class132(20);

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
	public static int anInt5554 = 0;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method4405(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) char[] local13 = new char[arg2];
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg2 + arg1;
		for (@Pc(21) int local21 = arg1; local21 < local19; local21++) {
			@Pc(29) int local29 = arg0[local21] & 0xFF;
			if (local29 < 128) {
				local13[local15++] = (char) local29;
			} else if (local29 >= 194) {
				@Pc(67) int local67;
				if (local29 < 224) {
					if (local21 + 1 >= local19) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local67 = arg0[local21] & 0xFF;
					if (local67 < 128 || local67 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local13[local15++] = (char) (local67 & 0xFFFFFF7F | (local29 & 0xFFFFFF3F) << 6);
				} else if (local29 < 240) {
					if (local21 + 2 >= local19) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local67 = arg0[local21] & 0xFF;
					if (local67 < 128 || local67 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local21++;
					@Pc(153) int local153 = arg0[local21] & 0xFF;
					if (local153 < 128 || local153 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local13[local15++] = (char) ((local67 & 0x3FFFF7F) << 6 | local29 << 12 & 0xFFF1F000 | local153 & 0xFFFFFF7F);
				} else if (local29 < 244) {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				} else {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local29);
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local29);
			}
		}
		return new String(local13, 0, local15);
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V")
	public static void method4407() {
		if (Static345.anInt5892 > 0) {
			Static345.anInt5892--;
		}
		if (Static375.anInt6248 > 1) {
			Static345.anInt5891 = Static234.anInt3754;
			Static375.anInt6248--;
		}
		if (Static141.aBoolean165) {
			Static141.aBoolean165 = false;
			Static297.method3933();
			return;
		}
		if (!Static126.aBoolean52) {
			Static337.method4522();
		}
		for (@Pc(35) int local35 = 0; local35 < 100 && Static229.method3013(); local35++) {
		}
		if (Static290.anInt4777 != 9) {
			return;
		}
		Static415.method5242(Static445.aClass102_218.method2188(), Static456.aClass2_Sub13_Sub2_2);
		if (Static131.aClass2_Sub11_1 == null) {
			if (Static110.method1702() >= Static81.aLong51) {
				Static131.aClass2_Sub11_1 = Static229.aClass202_1.method4387(Static14.aClass265_1.aString199);
			}
		} else if (Static131.aClass2_Sub11_1.anInt1499 != -1) {
			Static29.method451(Static181.aClass102_107);
			Static456.aClass2_Sub13_Sub2_2.method3568(Static131.aClass2_Sub11_1.anInt1499);
			Static131.aClass2_Sub11_1 = null;
			Static81.aLong51 = Static110.method1702() + 30000L;
		}
		@Pc(106) Class2_Sub14 local106 = (Class2_Sub14) Static57.aClass156_8.method3155();
		@Pc(124) int local124;
		@Pc(148) int local148;
		@Pc(163) int local163;
		@Pc(178) boolean local178;
		@Pc(230) int local230;
		@Pc(237) int local237;
		@Pc(249) int local249;
		if (local106 != null || Static110.method1702() - 2000L > Static331.aLong175) {
			@Pc(121) boolean local121 = false;
			local124 = Static456.aClass2_Sub13_Sub2_2.anInt4347;
			for (@Pc(131) Class2_Sub14 local131 = (Class2_Sub14) Static281.aClass156_35.method3155(); local131 != null && Static456.aClass2_Sub13_Sub2_2.anInt4347 - local124 < 240; local131 = (Class2_Sub14) Static281.aClass156_35.method3150()) {
				local131.method5703();
				local148 = local131.method5383();
				if (local148 < 0) {
					local148 = 0;
				} else if (local148 > 65534) {
					local148 = 65534;
				}
				local163 = local131.method5382();
				if (local163 < 0) {
					local163 = 0;
				} else if (local163 > 65534) {
					local163 = 65534;
				}
				local178 = false;
				if (local131.method5383() == -1 && local131.method5382() == -1) {
					local148 = -1;
					local163 = -1;
					local178 = true;
				}
				if (Static88.anInt1720 != local163 || local148 != Static238.anInt3829) {
					if (!local121) {
						Static29.method451(Static167.aClass102_96);
						Static456.aClass2_Sub13_Sub2_2.method3602(0);
						local121 = true;
						local124 = Static456.aClass2_Sub13_Sub2_2.anInt4347;
					}
					local230 = local163 - Static88.anInt1720;
					Static88.anInt1720 = local163;
					local237 = local148 - Static238.anInt3829;
					Static238.anInt3829 = local148;
					local249 = (int) ((local131.method5384() - Static331.aLong175) / 20L);
					if (local249 < 8 && local230 >= -32 && local230 <= 31 && local237 >= -32 && local237 <= 31) {
						local230 += 32;
						local237 += 32;
						Static456.aClass2_Sub13_Sub2_2.method3568((local249 << 12) - (-(local230 << 6) - local237));
					} else if (local249 < 32 && local230 >= -128 && local230 <= 127 && local237 >= -128 && local237 <= 127) {
						local230 += 128;
						local237 += 128;
						Static456.aClass2_Sub13_Sub2_2.method3602(local249 + 128);
						Static456.aClass2_Sub13_Sub2_2.method3568(local237 + (local230 << 8));
					} else if (local249 < 32) {
						Static456.aClass2_Sub13_Sub2_2.method3602(local249 + 192);
						if (local178) {
							Static456.aClass2_Sub13_Sub2_2.method3569(Integer.MIN_VALUE);
						} else {
							Static456.aClass2_Sub13_Sub2_2.method3569(local148 << 16 | local163);
						}
					} else {
						Static456.aClass2_Sub13_Sub2_2.method3568(local249 + 57344);
						if (local178) {
							Static456.aClass2_Sub13_Sub2_2.method3569(Integer.MIN_VALUE);
						} else {
							Static456.aClass2_Sub13_Sub2_2.method3569(local163 | local148 << 16);
						}
					}
					Static331.aLong175 = local131.method5384();
				}
			}
			if (local121) {
				Static456.aClass2_Sub13_Sub2_2.method3562(Static456.aClass2_Sub13_Sub2_2.anInt4347 - local124);
			}
		}
		@Pc(430) int local430;
		@Pc(475) int local475;
		if (local106 != null) {
			@Pc(416) long local416 = (local106.method5384() - Static308.aLong171) / 50L;
			Static308.aLong171 = local106.method5384();
			if (local416 > 32767L) {
				local416 = 32767L;
			}
			local430 = local106.method5383();
			if (local430 < 0) {
				local430 = 0;
			} else if (local430 > 65535) {
				local430 = 65535;
			}
			local148 = local106.method5382();
			if (local148 < 0) {
				local148 = 0;
			} else if (local148 > 65535) {
				local148 = 65535;
			}
			@Pc(462) byte local462 = 0;
			if (local106.method5381() == 2) {
				local462 = 1;
			}
			Static29.method451(Static222.aClass102_164);
			local475 = (int) local416;
			Static456.aClass2_Sub13_Sub2_2.method3561(local430 << 16 | local148);
			Static456.aClass2_Sub13_Sub2_2.method3577(local462 << 15 | local475);
		}
		@Pc(499) int local499;
		if (Static380.anInt440 > 0) {
			local499 = 0;
			for (local124 = 0; local124 < Static380.anInt440; local124++) {
				if (Static55.aClass7Array1[local124].method142()) {
					local499++;
				}
			}
			if (local499 > 0) {
				Static29.method451(Static56.aClass102_36);
				if (local499 > 75) {
					local499 = 75;
				}
				Static456.aClass2_Sub13_Sub2_2.method3602(local499 * 3);
				for (local430 = 0; local430 < Static380.anInt440; local430++) {
					@Pc(549) Class7 local549 = Static55.aClass7Array1[local430];
					if (local549.method142()) {
						@Pc(563) long local563 = (local549.method134() - Static109.aLong66) / 50L;
						if (local563 > 65535L) {
							local563 = 65535L;
						}
						Static109.aLong66 = local549.method134();
						Static456.aClass2_Sub13_Sub2_2.method3602(local549.method138());
						Static456.aClass2_Sub13_Sub2_2.method3568((int) local563);
					}
				}
			}
		}
		if (Static342.anInt5820 > 0) {
			Static342.anInt5820--;
		}
		if (Static257.aBoolean292 && Static342.anInt5820 <= 0) {
			Static342.anInt5820 = 20;
			Static257.aBoolean292 = false;
			Static29.method451(Static74.aClass102_52);
			Static456.aClass2_Sub13_Sub2_2.method3568((int) Static113.aFloat19 >> 3);
			Static456.aClass2_Sub13_Sub2_2.method3595((int) Static332.aFloat80 >> 3);
		}
		if (Static26.aBoolean45 && !Static92.aBoolean126) {
			Static92.aBoolean126 = true;
			Static29.method451(Static13.aClass102_12);
			Static456.aClass2_Sub13_Sub2_2.method3602(1);
		}
		if (!Static26.aBoolean45 && Static92.aBoolean126) {
			Static92.aBoolean126 = false;
			Static29.method451(Static13.aClass102_12);
			Static456.aClass2_Sub13_Sub2_2.method3602(0);
		}
		if (!Static418.aBoolean496) {
			Static29.method451(Static151.aClass102_88);
			Static456.aClass2_Sub13_Sub2_2.method3602(0);
			local499 = Static456.aClass2_Sub13_Sub2_2.anInt4347;
			@Pc(693) Class2_Sub13 local693 = Static2.aClass148_Sub1_1.method3044();
			Static456.aClass2_Sub13_Sub2_2.method3596(local693.anInt4347, local693.aByteArray52);
			Static456.aClass2_Sub13_Sub2_2.method3562(Static456.aClass2_Sub13_Sub2_2.anInt4347 - local499);
			Static418.aBoolean496 = true;
		}
		if (Static309.aClass270ArrayArrayArray3 != null) {
			if (Static414.anInt6776 == 2) {
				Static214.method2832();
			} else if (Static414.anInt6776 == 3) {
				Static223.method5278();
			}
		}
		if (Static444.aBoolean517) {
			Static444.aBoolean517 = false;
		} else {
			Static371.aFloat96 /= 2.0F;
		}
		if (Static28.aBoolean54) {
			Static28.aBoolean54 = false;
		} else {
			Static126.aFloat5 /= 2.0F;
		}
		Static216.method2859();
		if (Static290.anInt4777 != 9) {
			return;
		}
		Static63.method955();
		Static400.method5074();
		Static436.method5476();
		Static227.method2971();
		Static375.anInt6250++;
		if (Static375.anInt6250 > 750) {
			Static297.method3933();
			return;
		}
		Static382.method4913();
		Static425.method5363();
		Static257.method3284();
		for (local499 = Static138.aClass268_1.method5653(true); local499 != -1; local499 = Static138.aClass268_1.method5653(false)) {
			Static366.method4812(local499);
			Static319.anIntArray477[Static259.anInt4264++ & 0x1F] = local499;
		}
		@Pc(893) Class16 local893;
		for (@Pc(824) Class2_Sub5_Sub11 local824 = Static195.method2637(); local824 != null; local824 = Static195.method2637()) {
			local430 = local824.method3099();
			local148 = local824.method3096();
			if (local430 == 1) {
				Static400.anIntArray551[local148] = local824.anInt3911;
				Static255.aBoolean290 |= Static270.aBooleanArray18[local148];
				Static390.anIntArray571[anInt5554++ & 0x1F] = local148;
			} else if (local430 == 2) {
				Static178.aStringArray32[local148] = local824.aString113;
				Static307.anIntArray433[Static411.anInt6738++ & 0x1F] = local148;
			} else if (local430 == 3) {
				local893 = Static338.method4534(local148);
				if (!local824.aString113.equals(local893.aString16)) {
					local893.aString16 = local824.aString113;
					Static176.method70(local893);
				}
			} else if (local430 == 4) {
				local893 = Static338.method4534(local148);
				local475 = local824.anInt3911;
				local230 = local824.anInt3916;
				local237 = local824.anInt3906;
				if (local893.anInt310 != local475 || local230 != local893.anInt305 || local893.anInt267 != local237) {
					local893.anInt267 = local237;
					local893.anInt310 = local475;
					local893.anInt305 = local230;
					Static176.method70(local893);
				}
			} else if (local430 == 5) {
				local893 = Static338.method4534(local148);
				if (local893.anInt278 != local824.anInt3911 || local824.anInt3911 == -1) {
					local893.anInt299 = 1;
					local893.anInt304 = 0;
					local893.anInt278 = local824.anInt3911;
					local893.anInt309 = 0;
					Static176.method70(local893);
				}
			} else if (local430 == 6) {
				local163 = local824.anInt3911;
				local475 = local163 >> 10 & 0x1F;
				local230 = local163 >> 5 & 0x1F;
				local237 = local163 & 0x1F;
				local249 = (local230 << 11) + ((local475 << 19) + (local237 << 3));
				@Pc(1353) Class16 local1353 = Static338.method4534(local148);
				if (local249 != local1353.anInt300) {
					local1353.anInt300 = local249;
					Static176.method70(local1353);
				}
			} else if (local430 == 7) {
				local893 = Static338.method4534(local148);
				local178 = local824.anInt3911 == 1;
				if (local178 != local893.aBoolean27) {
					local893.aBoolean27 = local178;
					Static176.method70(local893);
				}
			} else if (local430 == 8) {
				local893 = Static338.method4534(local148);
				if (local824.anInt3911 != local893.anInt335 || local824.anInt3916 != local893.anInt308 || local824.anInt3906 != local893.anInt330) {
					local893.anInt330 = local824.anInt3906;
					local893.anInt335 = local824.anInt3911;
					local893.anInt308 = local824.anInt3916;
					if (local893.anInt301 != -1) {
						if (local893.anInt264 > 0) {
							local893.anInt330 = local893.anInt330 * 32 / local893.anInt264;
						} else if (local893.anInt274 > 0) {
							local893.anInt330 = local893.anInt330 * 32 / local893.anInt274;
						}
					}
					Static176.method70(local893);
				}
			} else if (local430 == 9) {
				local893 = Static338.method4534(local148);
				if (local824.anInt3911 != local893.anInt301 || local893.anInt297 != local824.anInt3916) {
					local893.anInt301 = local824.anInt3911;
					local893.anInt297 = local824.anInt3916;
					Static176.method70(local893);
				}
			} else if (local430 == 10) {
				local893 = Static338.method4534(local148);
				if (local893.lb != local824.anInt3911 || local824.anInt3916 != local893.anInt271 || local824.anInt3906 != local893.anInt295) {
					local893.anInt271 = local824.anInt3916;
					local893.anInt295 = local824.anInt3906;
					local893.lb = local824.anInt3911;
					Static176.method70(local893);
				}
			} else if (local430 == 11) {
				local893 = Static338.method4534(local148);
				local893.anInt269 = local893.anInt255 = local824.anInt3916;
				local893.anInt316 = local893.anInt340 = local824.anInt3911;
				local893.aByte4 = 0;
				local893.aByte3 = 0;
				Static176.method70(local893);
			} else if (local430 == 12) {
				local893 = Static338.method4534(local148);
				local475 = local824.anInt3911;
				if (local893 != null && local893.anInt298 == 0) {
					if (local475 > local893.anInt319 - local893.anInt285) {
						local475 = local893.anInt319 - local893.anInt285;
					}
					if (local475 < 0) {
						local475 = 0;
					}
					if (local475 != local893.anInt284) {
						local893.anInt284 = local475;
						Static176.method70(local893);
					}
				}
			} else if (local430 == 14) {
				local893 = Static338.method4534(local148);
				local893.anInt290 = local824.anInt3911;
			} else if (local430 == 15) {
				Static233.anInt6980 = local824.anInt3911;
				Static426.aBoolean501 = true;
				Static333.anInt5631 = local824.anInt3916;
			} else if (local430 == 16) {
				local893 = Static338.method4534(local148);
				local893.anInt266 = local824.anInt3911;
			}
		}
		Static233.anInt6983++;
		if (Static445.anInt7141 != 0) {
			Static351.anInt5976 += 20;
			if (Static351.anInt5976 >= 400) {
				Static445.anInt7141 = 0;
			}
		}
		if (Static219.aClass16_19 != null) {
			Static38.anInt701++;
			if (Static38.anInt701 >= 15) {
				Static176.method70(Static219.aClass16_19);
				Static219.aClass16_19 = null;
			}
		}
		Static32.aBoolean60 = false;
		Static294.aClass16_5 = null;
		Static392.aBoolean460 = false;
		Static176.aClass16_2 = null;
		Static423.method5346(-1, null, -1);
		Static339.method4552(-1, -1, null);
		if (!Static215.aBoolean217) {
			Static96.anInt1855 = -1;
		}
		Static11.method150();
		Static234.anInt3754++;
		if (Static415.aBoolean485) {
			Static29.method451(Static277.aClass102_134);
			Static456.aClass2_Sub13_Sub2_2.method3569(Static72.anInt1388 << 28 | Static77.anInt1468 << 14 | Static185.anInt3131);
			Static415.aBoolean485 = false;
		}
		while (true) {
			@Pc(1491) Class2_Sub44 local1491;
			@Pc(1496) Class16 local1496;
			do {
				local1491 = (Class2_Sub44) Static334.aClass156_49.method3152();
				if (local1491 == null) {
					while (true) {
						do {
							local1491 = (Class2_Sub44) Static154.aClass156_16.method3152();
							if (local1491 == null) {
								while (true) {
									do {
										local1491 = (Class2_Sub44) Static37.aClass156_54.method3152();
										if (local1491 == null) {
											if (Static294.aClass16_5 == null) {
												Static302.anInt4877 = 0;
											}
											if (Static336.aClass16_18 != null) {
												Static283.method3765();
											}
											if (Static440.anInt7085 > 0 && Static218.aClass181_1.method3865(82) && Static218.aClass181_1.method3865(81) && Static95.anInt2403 != 0) {
												local430 = Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91 - Static95.anInt2403;
												if (local430 < 0) {
													local430 = 0;
												} else if (local430 > 3) {
													local430 = 3;
												}
												Static184.method2530(Static60.aClass3_Sub4_Sub1_Sub2_1.anIntArray425[0] + Static275.anInt4506, local430, Static60.aClass3_Sub4_Sub1_Sub2_1.anIntArray424[0] + Static209.anInt3497);
											}
											Static404.method5121();
											for (local430 = 0; local430 < 5; local430++) {
												@Pc(1696) int local1696 = Static244.anIntArray338[local430]++;
											}
											if (Static255.aBoolean290 && Static446.aLong221 < Static110.method1702() - 60000L) {
												Static336.method4489();
											}
											for (@Pc(1719) Class21_Sub1_Sub2 local1719 = (Class21_Sub1_Sub2) Static457.aClass93_8.method2080(); local1719 != null; local1719 = (Class21_Sub1_Sub2) Static457.aClass93_8.method2081()) {
												if (Static110.method1702() / 1000L - 5L > (long) local1719.anInt2423) {
													if (local1719.aShort23 > 0) {
														Static166.method2340("", 0, 5, local1719.aString76 + Static359.aClass134_85.method2720(Static331.anInt5597), "");
													}
													if (local1719.aShort23 == 0) {
														Static166.method2340("", 0, 5, local1719.aString76 + Static393.aClass134_89.method2720(Static331.anInt5597), "");
													}
													local1719.method5593();
												}
											}
											Static348.anInt5917++;
											if (Static348.anInt5917 > 500) {
												Static348.anInt5917 = 0;
												local163 = (int) (Math.random() * 8.0D);
												if ((local163 & 0x4) == 4) {
													Static121.anInt2227 += Static255.anInt4105;
												}
												if ((local163 & 0x1) == 1) {
													Static208.anInt3482 += Static449.anInt7180;
												}
												if ((local163 & 0x2) == 2) {
													Static404.anInt6612 += Static409.anInt6684;
												}
											}
											if (Static208.anInt3482 < -50) {
												Static449.anInt7180 = 2;
											}
											if (Static208.anInt3482 > 50) {
												Static449.anInt7180 = -2;
											}
											if (Static404.anInt6612 < -55) {
												Static409.anInt6684 = 2;
											}
											if (Static404.anInt6612 > 55) {
												Static409.anInt6684 = -2;
											}
											if (Static121.anInt2227 < -40) {
												Static255.anInt4105 = 1;
											}
											if (Static121.anInt2227 > 40) {
												Static255.anInt4105 = -1;
											}
											Static139.anInt2479++;
											if (Static139.anInt2479 > 500) {
												Static139.anInt2479 = 0;
												local163 = (int) (Math.random() * 8.0D);
												if ((local163 & 0x1) == 1) {
													Static363.anInt6120 += Static144.anInt2557;
												}
												if ((local163 & 0x2) == 2) {
													Static454.anInt7274 += Static319.anInt5490;
												}
											}
											if (Static363.anInt6120 < -60) {
												Static144.anInt2557 = 2;
											}
											if (Static363.anInt6120 > 60) {
												Static144.anInt2557 = -2;
											}
											if (Static454.anInt7274 < -20) {
												Static319.anInt5490 = 1;
											}
											if (Static454.anInt7274 > 10) {
												Static319.anInt5490 = -1;
											}
											Static415.anInt6793++;
											if (Static415.anInt6793 > 50) {
												Static29.method451(Static452.aClass102_219);
											}
											if (Static17.aBoolean20) {
												Static414.method5237();
												Static17.aBoolean20 = false;
											}
											try {
												if (Static375.aClass160_3 != null && Static456.aClass2_Sub13_Sub2_2.anInt4347 > 0) {
													Static221.anInt3653 += Static456.aClass2_Sub13_Sub2_2.anInt4347;
													Static375.aClass160_3.method3210(Static456.aClass2_Sub13_Sub2_2.anInt4347, Static456.aClass2_Sub13_Sub2_2.aByteArray52);
													Static456.aClass2_Sub13_Sub2_2.anInt4347 = 0;
													Static415.anInt6793 = 0;
													return;
												}
												return;
											} catch (@Pc(1976) IOException local1976) {
												Static297.method3933();
												return;
											}
										}
										local1496 = local1491.aClass16_20;
										if (local1496.anInt320 < 0) {
											break;
										}
										local893 = Static338.method4534(local1496.anInt324);
									} while (local893 == null || local893.aClass16Array1 == null || local893.aClass16Array1.length <= local1496.anInt320 || local893.aClass16Array1[local1496.anInt320] != local1496);
									Static191.method2562(local1491);
								}
							}
							local1496 = local1491.aClass16_20;
							if (local1496.anInt320 < 0) {
								break;
							}
							local893 = Static338.method4534(local1496.anInt324);
						} while (local893 == null || local893.aClass16Array1 == null || local1496.anInt320 >= local893.aClass16Array1.length || local1496 != local893.aClass16Array1[local1496.anInt320]);
						Static191.method2562(local1491);
					}
				}
				local1496 = local1491.aClass16_20;
				if (local1496.anInt320 < 0) {
					break;
				}
				local893 = Static338.method4534(local1496.anInt324);
			} while (local893 == null || local893.aClass16Array1 == null || local893.aClass16Array1.length <= local1496.anInt320 || local893.aClass16Array1[local1496.anInt320] != local1496);
			Static191.method2562(local1491);
		}
	}
}
