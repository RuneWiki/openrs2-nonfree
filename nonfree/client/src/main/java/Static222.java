import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Lclient!uo;")
	public static Class176 aClass176_3;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread1;

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "J")
	public static long aLong160;

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
	public static int anInt4184;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "Z")
	public static boolean aBoolean378 = false;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "[S")
	public static short[] aShortArray75 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "Z")
	public static boolean aBoolean379 = true;

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
	public static int anInt4183 = 0;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method3590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class1_Sub4 local8 = (Class1_Sub4) Static273.aClass96_27.method2340();
		@Pc(10) Class1_Sub4 local10 = null;
		while (local8 != null) {
			if (local8.anInt323 == arg8 && local8.anInt325 == arg7 && arg0 == local8.anInt333 && local8.anInt319 == arg5) {
				local10 = local8;
				break;
			}
			local8 = (Class1_Sub4) Static273.aClass96_27.method2342();
		}
		if (local10 == null) {
			local10 = new Class1_Sub4();
			local10.anInt333 = arg0;
			local10.anInt325 = arg7;
			local10.anInt319 = arg5;
			local10.anInt323 = arg8;
			Static186.method3148(local10);
			Static273.aClass96_27.method2336(local10);
		}
		local10.anInt329 = arg4;
		local10.anInt331 = arg2;
		local10.anInt326 = arg1;
		local10.anInt324 = arg3;
		local10.anInt318 = arg6;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZIZ)V")
	public static void method3591(@OriginalArg(3) boolean arg0) {
		Static102.anInt2195 = 2;
		Static69.anInt1498 = 22050;
		Static292.aBoolean497 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)Z")
	public static boolean method3593() throws IOException {
		if (Static97.aClass49_2 == null) {
			return false;
		}
		@Pc(14) int local14 = Static97.aClass49_2.method1300();
		if (local14 == 0) {
			return false;
		}
		if (Static126.anInt1523 == -1) {
			local14--;
			Static97.aClass49_2.method1303(0, Static10.aClass1_Sub13_Sub1_117.aByteArray63, 1);
			Static10.aClass1_Sub13_Sub1_117.anInt2018 = 0;
			Static126.anInt1523 = Static10.aClass1_Sub13_Sub1_117.method1888();
			Static5.anInt204 = Static312.anIntArray611[Static126.anInt1523];
		}
		if (Static5.anInt204 == -1) {
			if (local14 <= 0) {
				return false;
			}
			Static97.aClass49_2.method1303(0, Static10.aClass1_Sub13_Sub1_117.aByteArray63, 1);
			local14--;
			Static5.anInt204 = Static10.aClass1_Sub13_Sub1_117.aByteArray63[0] & 0xFF;
		}
		if (Static5.anInt204 == -2) {
			if (local14 <= 1) {
				return false;
			}
			local14 -= 2;
			Static97.aClass49_2.method1303(0, Static10.aClass1_Sub13_Sub1_117.aByteArray63, 2);
			Static10.aClass1_Sub13_Sub1_117.anInt2018 = 0;
			Static5.anInt204 = Static10.aClass1_Sub13_Sub1_117.method1879();
		}
		if (Static5.anInt204 > local14) {
			return false;
		}
		Static10.aClass1_Sub13_Sub1_117.anInt2018 = 0;
		Static97.aClass49_2.method1303(0, Static10.aClass1_Sub13_Sub1_117.aByteArray63, Static5.anInt204);
		Static130.anInt2575 = Static129.anInt2551;
		Static87.anInt1876 = 0;
		Static129.anInt2551 = Static164.anInt3278;
		Static164.anInt3278 = Static126.anInt1523;
		@Pc(123) int local123;
		if (Static126.anInt1523 == 230) {
			local123 = Static10.aClass1_Sub13_Sub1_117.method1870();
			@Pc(129) byte local129 = Static10.aClass1_Sub13_Sub1_117.method1837();
			Static131.method2286(local129, local123);
			Static126.anInt1523 = -1;
			return true;
		}
		@Pc(155) int local155;
		@Pc(159) int local159;
		if (Static126.anInt1523 == 252) {
			local123 = Static10.aClass1_Sub13_Sub1_117.method1879();
			if (local123 == 65535) {
				local123 = -1;
			}
			local155 = Static10.aClass1_Sub13_Sub1_117.method1834();
			local159 = Static10.aClass1_Sub13_Sub1_117.method1879();
			if (Static101.method1950(local159)) {
				Static218.method3534(2, local123, -1, local155);
			}
			Static126.anInt1523 = -1;
			return true;
		} else if (Static126.anInt1523 == 44) {
			local123 = Static10.aClass1_Sub13_Sub1_117.method1853();
			local155 = Static10.aClass1_Sub13_Sub1_117.method1849();
			local159 = Static10.aClass1_Sub13_Sub1_117.method1853();
			Static132.anInt2608 = local155 >> 1;
			Static138.aClass11_Sub4_Sub1_3.method2584((local155 & 0x1) == 1, local123, local159);
			Static126.anInt1523 = -1;
			return true;
		} else {
			@Pc(250) Class1_Sub20 local250;
			if (Static126.anInt1523 == 74) {
				local123 = Static10.aClass1_Sub13_Sub1_117.method1856();
				local155 = Static10.aClass1_Sub13_Sub1_117.method1834();
				local159 = Static10.aClass1_Sub13_Sub1_117.method1861();
				if (Static101.method1950(local123)) {
					@Pc(243) Class1_Sub20 local243 = (Class1_Sub20) Static224.aClass86_27.method2136((long) local155);
					local250 = (Class1_Sub20) Static224.aClass86_27.method2136((long) local159);
					if (local250 != null) {
						Static296.method720(local243 == null || local250.anInt3422 != local243.anInt3422, local250);
					}
					if (local243 != null) {
						local243.method4573();
						Static224.aClass86_27.method2144(local243, (long) local159);
					}
					@Pc(286) Class157 local286 = Static206.method3444(local155);
					if (local286 != null) {
						Static224.method3621(local286);
					}
					local286 = Static206.method3444(local159);
					if (local286 != null) {
						Static224.method3621(local286);
						Static39.method676(local286, true);
					}
					if (Static315.anInt5636 != -1) {
						Static262.method4043(1, Static315.anInt5636);
					}
				}
				Static126.anInt1523 = -1;
				return true;
			} else if (Static126.anInt1523 == 27) {
				local123 = Static10.aClass1_Sub13_Sub1_117.method1870();
				local155 = Static10.aClass1_Sub13_Sub1_117.method1856();
				local159 = Static10.aClass1_Sub13_Sub1_117.method1834();
				if (Static101.method1950(local123)) {
					Static120.method2194(local159, local155);
				}
				Static126.anInt1523 = -1;
				return true;
			} else if (Static126.anInt1523 == 236) {
				local123 = Static10.aClass1_Sub13_Sub1_117.method1879();
				local155 = Static10.aClass1_Sub13_Sub1_117.method1860();
				if (Static101.method1950(local123)) {
					@Pc(374) Class1_Sub20 local374 = (Class1_Sub20) Static224.aClass86_27.method2136((long) local155);
					if (local374 != null) {
						Static296.method720(true, local374);
					}
					if (Static26.aClass157_2 != null) {
						Static224.method3621(Static26.aClass157_2);
						Static26.aClass157_2 = null;
					}
				}
				Static126.anInt1523 = -1;
				return true;
			} else {
				@Pc(443) int local443;
				@Pc(423) Class157 local423;
				@Pc(449) int local449;
				@Pc(451) int local451;
				if (Static126.anInt1523 == 215) {
					local123 = Static10.aClass1_Sub13_Sub1_117.method1860();
					local155 = Static10.aClass1_Sub13_Sub1_117.method1879();
					if (local123 < -70000) {
						local155 += 32768;
					}
					if (local123 < 0) {
						local423 = null;
					} else {
						local423 = Static206.method3444(local123);
					}
					while (Static5.anInt204 > Static10.aClass1_Sub13_Sub1_117.anInt2018) {
						local443 = Static10.aClass1_Sub13_Sub1_117.method1830();
						local449 = Static10.aClass1_Sub13_Sub1_117.method1879();
						local451 = 0;
						if (local449 != 0) {
							local451 = Static10.aClass1_Sub13_Sub1_117.method1853();
							if (local451 == 255) {
								local451 = Static10.aClass1_Sub13_Sub1_117.method1860();
							}
						}
						if (local423 != null && local443 >= 0 && local423.anIntArray538.length > local443) {
							local423.anIntArray538[local443] = local449;
							local423.anIntArray537[local443] = local451;
						}
						Static265.method4109(local155, local449 - 1, local443, local451);
					}
					if (local423 != null) {
						Static224.method3621(local423);
					}
					Static97.method1896();
					Static186.anIntArray387[Static272.anInt5002++ & 0x1F] = local155 & 0x7FFF;
					Static126.anInt1523 = -1;
					return true;
				} else if (Static126.anInt1523 == 60) {
					Static124.anInt597 = Static10.aClass1_Sub13_Sub1_117.method1853();
					Static126.anInt1523 = -1;
					return true;
				} else if (Static126.anInt1523 == 227) {
					Static100.method4618(true);
					Static126.anInt1523 = -1;
					return true;
				} else if (Static126.anInt1523 == 42) {
					local123 = Static10.aClass1_Sub13_Sub1_117.method1879();
					local155 = Static10.aClass1_Sub13_Sub1_117.method1844();
					local159 = Static10.aClass1_Sub13_Sub1_117.method1870();
					local443 = Static10.aClass1_Sub13_Sub1_117.method1814();
					local449 = Static10.aClass1_Sub13_Sub1_117.method1879();
					if (Static101.method1950(local449)) {
						Static218.method3534(7, local123 << 16 | local155, local159, local443);
					}
					Static126.anInt1523 = -1;
					return true;
				} else {
					@Pc(625) String local625;
					if (Static126.anInt1523 == 248) {
						local123 = Static10.aClass1_Sub13_Sub1_117.method1870();
						if (local123 == 65535) {
							local123 = -1;
						}
						local155 = Static10.aClass1_Sub13_Sub1_117.method1845();
						local159 = Static10.aClass1_Sub13_Sub1_117.method1867();
						local625 = Static10.aClass1_Sub13_Sub1_117.method1827();
						if (local159 >= 1 && local159 <= 8) {
							if (local625.equalsIgnoreCase("null")) {
								local625 = null;
							}
							Static218.aStringArray25[local159 - 1] = local625;
							Static9.anIntArray22[local159 - 1] = local123;
							Static253.aBooleanArray21[local159 - 1] = local155 == 0;
						}
						Static126.anInt1523 = -1;
						return true;
					}
					@Pc(679) String local679;
					if (Static126.anInt1523 == 165) {
						local123 = Static10.aClass1_Sub13_Sub1_117.method1879();
						local679 = Static10.aClass1_Sub13_Sub1_117.method1827();
						@Pc(685) Object[] local685 = new Object[local679.length() + 1];
						for (local443 = local679.length() - 1; local443 >= 0; local443--) {
							if (local679.charAt(local443) == 's') {
								local685[local443 + 1] = Static10.aClass1_Sub13_Sub1_117.method1827();
							} else {
								local685[local443 + 1] = Integer.valueOf(Static10.aClass1_Sub13_Sub1_117.method1860());
							}
						}
						local685[0] = Integer.valueOf(Static10.aClass1_Sub13_Sub1_117.method1860());
						if (Static101.method1950(local123)) {
							@Pc(741) Class1_Sub29 local741 = new Class1_Sub29();
							local741.anObjectArray2 = local685;
							Static5.method104(local741);
						}
						Static126.anInt1523 = -1;
						return true;
					} else if (Static126.anInt1523 == 161) {
						local123 = Static10.aClass1_Sub13_Sub1_117.method1879();
						local155 = Static10.aClass1_Sub13_Sub1_117.method1844();
						local159 = Static10.aClass1_Sub13_Sub1_117.method1844();
						if (Static101.method1950(local123)) {
							Static138.method3840(local155, local159);
						}
						Static126.anInt1523 = -1;
						return true;
					} else if (Static126.anInt1523 == 85) {
						local123 = Static10.aClass1_Sub13_Sub1_117.method1834();
						local155 = Static10.aClass1_Sub13_Sub1_117.method1856();
						local159 = Static10.aClass1_Sub13_Sub1_117.method1844();
						if (Static101.method1950(local155)) {
							Static257.method4023(local159, local123);
						}
						Static126.anInt1523 = -1;
						return true;
					} else if (Static126.anInt1523 == 63) {
						local123 = Static10.aClass1_Sub13_Sub1_117.method1870();
						local155 = Static10.aClass1_Sub13_Sub1_117.method1870();
						local159 = Static10.aClass1_Sub13_Sub1_117.method1814();
						local443 = Static10.aClass1_Sub13_Sub1_117.method1844();
						if (Static101.method1950(local123)) {
							Static305.method4557(local443 + (local155 << 16), local159);
						}
						Static126.anInt1523 = -1;
						return true;
					} else if (Static126.anInt1523 == 179) {
						local123 = Static10.aClass1_Sub13_Sub1_117.method1879();
						local155 = Static10.aClass1_Sub13_Sub1_117.method1870();
						local159 = Static10.aClass1_Sub13_Sub1_117.method1860();
						local443 = Static10.aClass1_Sub13_Sub1_117.method1834();
						if (local123 == 65535) {
							local123 = -1;
						}
						if (Static101.method1950(local155)) {
							@Pc(886) Class157 local886 = Static206.method3444(local443);
							@Pc(903) Class3 local903;
							if (local886.aBoolean445) {
								Static82.method1687(local159, local443, local123);
								local903 = Static69.method1330(local123);
								Static298.method4467(local903.anInt169, local903.anInt147, local903.anInt132, local443);
								Static264.method4083(local903.anInt129, local903.anInt120, local443, local903.anInt146);
							} else if (local123 == -1) {
								Static126.anInt1523 = -1;
								local886.anInt4669 = 0;
								return true;
							} else {
								local903 = Static69.method1330(local123);
								local886.anInt4668 = local123;
								local886.anInt4666 = local903.anInt132;
								local886.anInt4706 = local903.anInt169 * 100 / local159;
								local886.anInt4669 = 4;
								local886.anInt4745 = local903.anInt147;
								Static224.method3621(local886);
							}
						}
						Static126.anInt1523 = -1;
						return true;
					} else if (Static126.anInt1523 == 83) {
						Static100.method4618(false);
						Static126.anInt1523 = -1;
						return true;
					} else if (Static126.anInt1523 == 226) {
						local123 = Static10.aClass1_Sub13_Sub1_117.method1879();
						local155 = Static10.aClass1_Sub13_Sub1_117.method1853();
						local159 = Static10.aClass1_Sub13_Sub1_117.method1853();
						local443 = Static10.aClass1_Sub13_Sub1_117.method1853();
						local449 = Static10.aClass1_Sub13_Sub1_117.method1853();
						local451 = Static10.aClass1_Sub13_Sub1_117.method1879();
						if (Static101.method1950(local123)) {
							Static311.aBooleanArray24[local155] = true;
							Static66.anIntArray108[local155] = local159;
							Static225.anIntArray470[local155] = local443;
							Static221.anIntArray461[local155] = local449;
							Static217.anIntArray457[local155] = local451;
						}
						Static126.anInt1523 = -1;
						return true;
					} else if (Static126.anInt1523 == 214) {
						local123 = Static10.aClass1_Sub13_Sub1_117.method1856();
						local155 = Static10.aClass1_Sub13_Sub1_117.method1849();
						local159 = Static10.aClass1_Sub13_Sub1_117.method1814();
						if (Static101.method1950(local123)) {
							Static89.method1735(local155, local159);
						}
						Static126.anInt1523 = -1;
						return true;
					} else if (Static126.anInt1523 == 209) {
						local123 = Static10.aClass1_Sub13_Sub1_117.method1856();
						local155 = Static10.aClass1_Sub13_Sub1_117.method1871();
						local159 = Static10.aClass1_Sub13_Sub1_117.method1814();
						local443 = Static10.aClass1_Sub13_Sub1_117.method1874();
						if (Static101.method1950(local123)) {
							Static243.method3856(local155, local159, local443);
						}
						Static126.anInt1523 = -1;
						return true;
					} else {
						@Pc(1142) int local1142;
						@Pc(1146) int local1146;
						@Pc(1150) int local1150;
						if (Static126.anInt1523 == 20) {
							local123 = Static10.aClass1_Sub13_Sub1_117.method1814();
							local155 = local123 >> 28 & 0x3;
							local443 = local123 & 0x3FFF;
							local159 = local123 >> 14 & 0x3FFF;
							local449 = Static10.aClass1_Sub13_Sub1_117.method1853();
							local451 = local449 >> 2;
							local1142 = local449 & 0x3;
							local1146 = Static81.anIntArray138[local451];
							local1150 = Static10.aClass1_Sub13_Sub1_117.method1879();
							local159 -= Static38.anInt714;
							if (local1150 == 65535) {
								local1150 = -1;
							}
							local443 -= Static135.anInt2659;
							Static173.method2977(local1142, local159, local155, local451, local443, local1146, local1150);
							Static126.anInt1523 = -1;
							return true;
						} else if (Static126.anInt1523 == 66) {
							Static259.anInt4811 = Static10.aClass1_Sub13_Sub1_117.method1853();
							Static256.anInt4783 = Static10.aClass1_Sub13_Sub1_117.method1853();
							Static59.anInt1257 = Static10.aClass1_Sub13_Sub1_117.method1853();
							Static126.anInt1523 = -1;
							return true;
						} else if (Static126.anInt1523 == 43) {
							Static14.method213(Static10.aClass1_Sub13_Sub1_117.method1827());
							Static126.anInt1523 = -1;
							return true;
						} else if (Static126.anInt1523 == 150) {
							local123 = Static10.aClass1_Sub13_Sub1_117.method1879();
							if (local123 == 65535) {
								local123 = -1;
							}
							local155 = Static10.aClass1_Sub13_Sub1_117.method1853();
							local159 = Static10.aClass1_Sub13_Sub1_117.method1879();
							local443 = Static10.aClass1_Sub13_Sub1_117.method1853();
							Static39.method680(local123, local155, local443, local159);
							Static126.anInt1523 = -1;
							return true;
						} else if (Static126.anInt1523 == 116) {
							local123 = Static10.aClass1_Sub13_Sub1_117.method1844();
							local155 = Static10.aClass1_Sub13_Sub1_117.method1861();
							local159 = Static10.aClass1_Sub13_Sub1_117.method1879();
							if (Static101.method1950(local123)) {
								Static38.method660(local159, local155);
							}
							Static126.anInt1523 = -1;
							return true;
						} else if (Static126.anInt1523 == 147 || Static126.anInt1523 == 185 || Static126.anInt1523 == 246 || Static126.anInt1523 == 183 || Static126.anInt1523 == 225 || Static126.anInt1523 == 203 || Static126.anInt1523 == 9 || Static126.anInt1523 == 130 || Static126.anInt1523 == 13 || Static126.anInt1523 == 45 || Static126.anInt1523 == 175 || Static126.anInt1523 == 208 || Static126.anInt1523 == 155 || Static126.anInt1523 == 163) {
							Static130.method2284();
							Static126.anInt1523 = -1;
							return true;
						} else if (Static126.anInt1523 == 216) {
							Static166.anInt3282 = Static10.aClass1_Sub13_Sub1_117.method1849();
							Static262.anInt4841 = Static10.aClass1_Sub13_Sub1_117.method1853();
							Static126.anInt1523 = -1;
							return true;
						} else {
							@Pc(1370) long local1370;
							@Pc(1375) long local1375;
							@Pc(1380) long local1380;
							@Pc(1476) String local1476;
							if (Static126.anInt1523 == 120) {
								local1370 = Static10.aClass1_Sub13_Sub1_117.method1833();
								local1375 = Static10.aClass1_Sub13_Sub1_117.method1879();
								local1380 = Static10.aClass1_Sub13_Sub1_117.method1878();
								local1142 = Static10.aClass1_Sub13_Sub1_117.method1853();
								local1146 = Static10.aClass1_Sub13_Sub1_117.method1879();
								@Pc(1394) boolean local1394 = false;
								@Pc(1400) long local1400 = local1380 + (local1375 << 32);
								@Pc(1402) int local1402 = 0;
								label1733: while (true) {
									if (local1402 >= 100) {
										if (local1142 <= 1) {
											for (local1402 = 0; local1402 < Static282.anInt5138; local1402++) {
												if (Static86.aLongArray6[local1402] == local1370) {
													local1394 = true;
													break label1733;
												}
											}
										}
										break;
									}
									if (Static217.aLongArray9[local1402] == local1400) {
										local1394 = true;
										break;
									}
									local1402++;
								}
								if (!local1394 && Static155.anInt3106 == 0) {
									Static217.aLongArray9[Static280.anInt5136] = local1400;
									Static280.anInt5136 = (Static280.anInt5136 + 1) % 100;
									local1476 = Static271.method4175(local1146).method3710(Static10.aClass1_Sub13_Sub1_117);
									if (local1142 == 2) {
										Static219.method3546(null, local1146, "<img=1>" + Static69.method1333(local1370), local1476, 18);
									} else if (local1142 == 1) {
										Static219.method3546(null, local1146, "<img=0>" + Static69.method1333(local1370), local1476, 18);
									} else {
										Static219.method3546(null, local1146, Static69.method1333(local1370), local1476, 18);
									}
								}
								Static126.anInt1523 = -1;
								return true;
							} else if (Static126.anInt1523 == 207) {
								if (Static196.aFrame1 != null) {
									Static122.method2210(-1, false, -1, Static271.anInt4996);
								}
								@Pc(1557) byte[] local1557 = new byte[Static5.anInt204];
								Static10.aClass1_Sub13_Sub1_117.method1893(local1557, Static5.anInt204);
								local679 = Static172.method2963(local1557, Static5.anInt204, 0);
								if (Static311.aFrame2 == null && (Static290.anInt5261 == 3 || !Static290.aString209.startsWith("win") || Static66.aBoolean134)) {
									Static245.method3860(true, local679);
								} else {
									Static284.aBoolean487 = true;
									Static37.aString31 = local679;
									Static44.aClass153_3 = aClass176_3.method4363(local679);
								}
								Static126.anInt1523 = -1;
								return true;
							} else if (Static126.anInt1523 == 211) {
								local123 = Static10.aClass1_Sub13_Sub1_117.method1844();
								local155 = Static10.aClass1_Sub13_Sub1_117.method1872();
								local159 = Static10.aClass1_Sub13_Sub1_117.method1834();
								if (Static101.method1950(local123)) {
									Static287.method4319(local159, local155);
								}
								Static126.anInt1523 = -1;
								return true;
							} else if (Static126.anInt1523 == 125) {
								if (Static5.anInt204 == 0) {
									Static84.aString65 = Static246.aString160;
								} else {
									Static84.aString65 = Static10.aClass1_Sub13_Sub1_117.method1827();
								}
								Static126.anInt1523 = -1;
								return true;
							} else if (Static126.anInt1523 == 237) {
								local123 = Static10.aClass1_Sub13_Sub1_117.method1879();
								local155 = Static10.aClass1_Sub13_Sub1_117.method1853();
								local159 = Static10.aClass1_Sub13_Sub1_117.method1853();
								local443 = Static10.aClass1_Sub13_Sub1_117.method1879();
								local449 = Static10.aClass1_Sub13_Sub1_117.method1853();
								local451 = Static10.aClass1_Sub13_Sub1_117.method1853();
								if (Static101.method1950(local123)) {
									Static215.method3495(true, local451, local155, local449, local159, local443);
								}
								Static126.anInt1523 = -1;
								return true;
							} else if (Static126.anInt1523 == 220) {
								local123 = Static10.aClass1_Sub13_Sub1_117.method1879();
								local679 = Static10.aClass1_Sub13_Sub1_117.method1827();
								local159 = Static10.aClass1_Sub13_Sub1_117.method1861();
								if (Static101.method1950(local123)) {
									Static23.method469(local159, local679);
								}
								Static126.anInt1523 = -1;
								return true;
							} else if (Static126.anInt1523 == 140) {
								local123 = Static10.aClass1_Sub13_Sub1_117.method1861();
								@Pc(1743) Class157 local1743 = Static206.method3444(local123);
								for (local159 = 0; local159 < local1743.anIntArray538.length; local159++) {
									local1743.anIntArray538[local159] = -1;
									local1743.anIntArray538[local159] = 0;
								}
								Static224.method3621(local1743);
								Static126.anInt1523 = -1;
								return true;
							} else if (Static126.anInt1523 == 113) {
								Static118.anInt2406 = Static10.aClass1_Sub13_Sub1_117.method1853();
								Static105.anInt2227 = Static149.anInt950;
								Static126.anInt1523 = -1;
								return true;
							} else {
								@Pc(1820) int local1820;
								if (Static126.anInt1523 == 174) {
									local1370 = Static10.aClass1_Sub13_Sub1_117.method1833();
									local1375 = Static10.aClass1_Sub13_Sub1_117.method1879();
									local1380 = Static10.aClass1_Sub13_Sub1_117.method1878();
									local1142 = Static10.aClass1_Sub13_Sub1_117.method1853();
									@Pc(1816) long local1816 = (local1375 << 32) + local1380;
									@Pc(1818) boolean local1818 = false;
									local1820 = 0;
									label1340: while (true) {
										if (local1820 < 100) {
											if (Static217.aLongArray9[local1820] != local1816) {
												local1820++;
												continue;
											}
											local1818 = true;
											break;
										}
										if (local1142 <= 1) {
											if (Static287.aBoolean492 && !Static294.aBoolean110 || Static220.aBoolean372) {
												local1818 = true;
											} else {
												for (local1820 = 0; local1820 < Static282.anInt5138; local1820++) {
													if (local1370 == Static86.aLongArray6[local1820]) {
														local1818 = true;
														break label1340;
													}
												}
											}
										}
										break;
									}
									if (!local1818 && Static155.anInt3106 == 0) {
										Static217.aLongArray9[Static280.anInt5136] = local1816;
										Static280.anInt5136 = (Static280.anInt5136 + 1) % 100;
										@Pc(1898) String local1898 = Static285.method2872(Static314.method4670(Static263.method4065(Static10.aClass1_Sub13_Sub1_117)));
										if (local1142 == 2 || local1142 == 3) {
											Static305.method4555(local1898, "<img=1>" + Static69.method1333(local1370), 7);
										} else if (local1142 == 1) {
											Static305.method4555(local1898, "<img=0>" + Static69.method1333(local1370), 7);
										} else {
											Static305.method4555(local1898, Static69.method1333(local1370), 3);
										}
									}
									Static126.anInt1523 = -1;
									return true;
								} else if (Static126.anInt1523 == 100) {
									local123 = Static10.aClass1_Sub13_Sub1_117.method1879();
									local155 = Static10.aClass1_Sub13_Sub1_117.method1834();
									Static131.method2286(local155, local123);
									Static126.anInt1523 = -1;
									return true;
								} else {
									@Pc(2001) boolean local2001;
									@Pc(2295) String local2295;
									@Pc(1980) String local1980;
									if (Static126.anInt1523 == 138) {
										local1980 = Static10.aClass1_Sub13_Sub1_117.method1827();
										if (local1980.endsWith(":tradereq:")) {
											local679 = local1980.substring(0, local1980.indexOf(":"));
											local2001 = false;
											local1375 = Static282.method4276(local679);
											for (local451 = 0; local451 < Static282.anInt5138; local451++) {
												if (Static86.aLongArray6[local451] == local1375) {
													local2001 = true;
													break;
												}
											}
											if (!local2001 && Static155.anInt3106 == 0) {
												Static305.method4555(Static142.aString95, local679, 4);
											}
										} else if (local1980.endsWith(":chalreq:")) {
											local679 = local1980.substring(0, local1980.indexOf(":"));
											local1375 = Static282.method4276(local679);
											local2001 = false;
											for (local451 = 0; local451 < Static282.anInt5138; local451++) {
												if (local1375 == Static86.aLongArray6[local451]) {
													local2001 = true;
													break;
												}
											}
											if (!local2001 && Static155.anInt3106 == 0) {
												local2295 = local1980.substring(local1980.indexOf(":") + 1, local1980.length() - 9);
												Static305.method4555(local2295, local679, 8);
											}
										} else if (local1980.endsWith(":assistreq:")) {
											local679 = local1980.substring(0, local1980.indexOf(":"));
											local2001 = false;
											local1375 = Static282.method4276(local679);
											for (local451 = 0; local451 < Static282.anInt5138; local451++) {
												if (local1375 == Static86.aLongArray6[local451]) {
													local2001 = true;
													break;
												}
											}
											if (!local2001 && Static155.anInt3106 == 0) {
												Static305.method4555("", local679, 10);
											}
										} else if (local1980.endsWith(":clan:")) {
											local679 = local1980.substring(0, local1980.indexOf(":clan:"));
											Static305.method4555(local679, "", 11);
										} else if (local1980.endsWith(":trade:")) {
											local679 = local1980.substring(0, local1980.indexOf(":trade:"));
											if (Static155.anInt3106 == 0) {
												Static305.method4555(local679, "", 12);
											}
										} else if (local1980.endsWith(":assist:")) {
											local679 = local1980.substring(0, local1980.indexOf(":assist:"));
											if (Static155.anInt3106 == 0) {
												Static305.method4555(local679, "", 13);
											}
										} else if (local1980.endsWith(":duelstake:")) {
											local679 = local1980.substring(0, local1980.indexOf(":"));
											local1375 = Static282.method4276(local679);
											local2001 = false;
											for (local451 = 0; local451 < Static282.anInt5138; local451++) {
												if (local1375 == Static86.aLongArray6[local451]) {
													local2001 = true;
													break;
												}
											}
											if (!local2001 && Static155.anInt3106 == 0) {
												Static305.method4555("", local679, 14);
											}
										} else if (local1980.endsWith(":duelfriend:")) {
											local679 = local1980.substring(0, local1980.indexOf(":"));
											local2001 = false;
											local1375 = Static282.method4276(local679);
											for (local451 = 0; local451 < Static282.anInt5138; local451++) {
												if (local1375 == Static86.aLongArray6[local451]) {
													local2001 = true;
													break;
												}
											}
											if (!local2001 && Static155.anInt3106 == 0) {
												Static305.method4555("", local679, 15);
											}
										} else if (local1980.endsWith(":clanreq:")) {
											local679 = local1980.substring(0, local1980.indexOf(":"));
											local1375 = Static282.method4276(local679);
											local2001 = false;
											for (local451 = 0; local451 < Static282.anInt5138; local451++) {
												if (Static86.aLongArray6[local451] == local1375) {
													local2001 = true;
													break;
												}
											}
											if (!local2001 && Static155.anInt3106 == 0) {
												Static305.method4555("", local679, 16);
											}
										} else if (local1980.endsWith(":allyreq:")) {
											local679 = local1980.substring(0, local1980.indexOf(":"));
											local1375 = Static282.method4276(local679);
											local2001 = false;
											for (local451 = 0; local451 < Static282.anInt5138; local451++) {
												if (local1375 == Static86.aLongArray6[local451]) {
													local2001 = true;
													break;
												}
											}
											if (!local2001 && Static155.anInt3106 == 0) {
												local2295 = local1980.substring(local1980.indexOf(":") + 1, local1980.length() - 9);
												Static305.method4555(local2295, local679, 21);
											}
										} else if (local1980.endsWith(":spam:")) {
											local679 = local1980.substring(0, local1980.length() - 6);
											if (Static155.anInt3106 == 0) {
												Static305.method4555(local679, "", 22);
											}
										} else {
											Static305.method4555(local1980, "", 0);
										}
										Static126.anInt1523 = -1;
										return true;
									} else if (Static126.anInt1523 == 158) {
										local123 = Static10.aClass1_Sub13_Sub1_117.method1870();
										local155 = Static10.aClass1_Sub13_Sub1_117.method1856();
										local159 = Static10.aClass1_Sub13_Sub1_117.method1844();
										local443 = Static10.aClass1_Sub13_Sub1_117.method1856();
										local449 = Static10.aClass1_Sub13_Sub1_117.method1860();
										if (Static101.method1950(local443)) {
											Static298.method4467(local159, local123, local155, local449);
										}
										Static126.anInt1523 = -1;
										return true;
									} else {
										@Pc(2704) int local2704;
										@Pc(2665) boolean local2665;
										if (Static126.anInt1523 == 17) {
											local123 = Static10.aClass1_Sub13_Sub1_117.method1860();
											local155 = Static10.aClass1_Sub13_Sub1_117.method1870();
											local159 = Static10.aClass1_Sub13_Sub1_117.method1870();
											local443 = Static10.aClass1_Sub13_Sub1_117.method1870();
											if (local123 >> 30 == 0) {
												@Pc(2688) Class15 local2688;
												@Pc(2773) Class152 local2773;
												@Pc(2778) Class152 local2778;
												@Pc(2701) Class152 local2701;
												@Pc(2759) Class15 local2759;
												if (local123 >> 29 != 0) {
													local449 = local123 & 0xFFFF;
													@Pc(2894) Class11_Sub4_Sub2 local2894 = Static138.aClass11_Sub4_Sub2Array2[local449];
													if (local2894 != null) {
														local2665 = true;
														if (local443 == 65535) {
															local443 = -1;
														}
														if (local443 != -1 && local2894.anInt3857 != -1) {
															if (local443 == local2894.anInt3857) {
																local2688 = Static226.method3632(local443);
																if (local2688.aBoolean53 && local2688.anInt518 != -1) {
																	local2701 = Static107.method2016(local2688.anInt518);
																	local2704 = local2701.anInt4603;
																	if (local2704 == 1) {
																		local2894.anInt3801 = 1;
																		local2665 = false;
																		local2894.anInt3851 = Static167.anInt637 + local159;
																		local2894.anInt3802 = 0;
																		local2894.anInt3788 = 0;
																		local2894.anInt3795 = 0;
																		Static291.method4385(local2701, false, local2894.anInt3856, local2894.anInt3865, local2894.anInt3788);
																	} else if (local2704 == 2) {
																		local2894.anInt3789 = 0;
																		local2665 = false;
																	}
																}
															} else {
																local2688 = Static226.method3632(local443);
																local2759 = Static226.method3632(local2894.anInt3857);
																if (local2688.anInt518 != -1 && local2759.anInt518 != -1) {
																	local2773 = Static107.method2016(local2688.anInt518);
																	local2778 = Static107.method2016(local2759.anInt518);
																	if (local2773.anInt4608 < local2778.anInt4608) {
																		local2665 = false;
																	}
																}
															}
														}
														if (local2665) {
															local2894.anInt3788 = 0;
															local2894.anInt3795 = 0;
															local2894.anInt3801 = 1;
															local2894.anInt3851 = Static167.anInt637 + local159;
															if (local2894.anInt3851 > Static167.anInt637) {
																local2894.anInt3788 = -1;
															}
															local2894.anInt3805 = local155;
															local2894.anInt3857 = local443;
															if (local2894.anInt3857 != -1 && Static167.anInt637 == local2894.anInt3851) {
																local1146 = Static226.method3632(local2894.anInt3857).anInt518;
																if (local1146 != -1) {
																	local2701 = Static107.method2016(local1146);
																	if (local2701 != null && local2701.anIntArray509 != null) {
																		Static291.method4385(local2701, false, local2894.anInt3856, local2894.anInt3865, 0);
																	}
																}
															}
														}
													}
												} else if (local123 >> 28 != 0) {
													local449 = local123 & 0xFFFF;
													@Pc(2647) Class11_Sub4_Sub1 local2647;
													if (Static68.anInt1471 == local449) {
														local2647 = Static138.aClass11_Sub4_Sub1_3;
													} else {
														local2647 = Static14.aClass11_Sub4_Sub1Array1[local449];
													}
													if (local2647 != null) {
														if (local443 == 65535) {
															local443 = -1;
														}
														local2665 = true;
														if (local443 != -1 && local2647.anInt3857 != -1) {
															if (local443 == local2647.anInt3857) {
																local2688 = Static226.method3632(local443);
																if (local2688.aBoolean53 && local2688.anInt518 != -1) {
																	local2701 = Static107.method2016(local2688.anInt518);
																	local2704 = local2701.anInt4603;
																	if (local2704 == 1) {
																		local2647.anInt3788 = 0;
																		local2647.anInt3802 = 0;
																		local2647.anInt3795 = 0;
																		local2647.anInt3851 = Static167.anInt637 + local159;
																		local2647.anInt3801 = 1;
																		Static291.method4385(local2701, false, local2647.anInt3856, local2647.anInt3865, local2647.anInt3788);
																		local2665 = false;
																	} else if (local2704 == 2) {
																		local2647.anInt3789 = 0;
																		local2665 = false;
																	}
																}
															} else {
																local2688 = Static226.method3632(local443);
																local2759 = Static226.method3632(local2647.anInt3857);
																if (local2688.anInt518 != -1 && local2759.anInt518 != -1) {
																	local2773 = Static107.method2016(local2688.anInt518);
																	local2778 = Static107.method2016(local2759.anInt518);
																	if (local2778.anInt4608 > local2773.anInt4608) {
																		local2665 = false;
																	}
																}
															}
														}
														if (local2665) {
															local2647.anInt3788 = 0;
															local2647.anInt3805 = local155;
															local2647.anInt3857 = local443;
															local2647.anInt3801 = 1;
															local2647.anInt3851 = Static167.anInt637 + local159;
															if (Static167.anInt637 < local2647.anInt3851) {
																local2647.anInt3788 = -1;
															}
															if (local2647.anInt3857 == 65535) {
																local2647.anInt3857 = -1;
															}
															local2647.anInt3795 = 0;
															if (local2647.anInt3857 != -1 && local2647.anInt3851 == Static167.anInt637) {
																local1146 = Static226.method3632(local2647.anInt3857).anInt518;
																if (local1146 != -1) {
																	local2701 = Static107.method2016(local1146);
																	if (local2701 != null && local2701.anIntArray509 != null) {
																		Static291.method4385(local2701, local2647 == Static138.aClass11_Sub4_Sub1_3, local2647.anInt3856, local2647.anInt3865, 0);
																	}
																}
															}
														}
													}
												}
											} else {
												local451 = (local123 >> 14 & 0x3FFF) - Static38.anInt714;
												local449 = local123 >> 28 & 0x3;
												local1142 = (local123 & 0x3FFF) - Static135.anInt2659;
												if (local451 >= 0 && local1142 >= 0 && local451 < 104 && local1142 < 104) {
													local451 = local451 * 128 + 64;
													local1142 = local1142 * 128 + 64;
													@Pc(2614) Class11_Sub2 local2614 = new Class11_Sub2(local443, local449, local451, local1142, Static42.method768(local451, local449, local1142) - local155, local159, Static167.anInt637);
													Static311.aClass96_28.method2336(new Class1_Sub5_Sub12(local2614));
												}
											}
											Static126.anInt1523 = -1;
											return true;
										} else if (Static126.anInt1523 == 241) {
											local123 = Static10.aClass1_Sub13_Sub1_117.method1860();
											Static21.aClass153_2 = aClass176_3.method4377(local123);
											Static126.anInt1523 = -1;
											return true;
										} else if (Static126.anInt1523 == 53) {
											for (local123 = 0; local123 < Static99.anIntArray148.length; local123++) {
												if (Static193.anIntArray402[local123] != Static99.anIntArray148[local123]) {
													Static99.anIntArray148[local123] = Static193.anIntArray402[local123];
													Static167.method597(local123);
													Static179.anIntArray358[Static263.anInt4858++ & 0x1F] = local123;
												}
											}
											Static126.anInt1523 = -1;
											return true;
										} else if (Static126.anInt1523 == 65) {
											local123 = Static10.aClass1_Sub13_Sub1_117.method1849();
											local155 = Static10.aClass1_Sub13_Sub1_117.method1844();
											local159 = Static10.aClass1_Sub13_Sub1_117.method1870();
											@Pc(3198) Class11_Sub4_Sub2 local3198 = Static138.aClass11_Sub4_Sub2Array2[local155];
											if (local3198 != null) {
												Static246.method3874(local123, local3198, local159);
											}
											Static126.anInt1523 = -1;
											return true;
										} else if (Static126.anInt1523 == 156) {
											Static282.anInt5138 = Static5.anInt204 / 8;
											for (local123 = 0; local123 < Static282.anInt5138; local123++) {
												Static86.aLongArray6[local123] = Static10.aClass1_Sub13_Sub1_117.method1833();
												Static18.aStringArray3[local123] = Static138.method3839(Static86.aLongArray6[local123]);
												Static114.aBooleanArray6[local123] = false;
											}
											Static105.anInt2227 = Static149.anInt950;
											Static126.anInt1523 = -1;
											return true;
										} else {
											@Pc(3279) long local3279;
											@Pc(3371) String local3371;
											if (Static126.anInt1523 == 80) {
												local1370 = Static10.aClass1_Sub13_Sub1_117.method1833();
												Static10.aClass1_Sub13_Sub1_117.method1829();
												@Pc(3263) boolean local3263 = false;
												local1375 = Static10.aClass1_Sub13_Sub1_117.method1833();
												local1380 = Static10.aClass1_Sub13_Sub1_117.method1879();
												local3279 = Static10.aClass1_Sub13_Sub1_117.method1878();
												@Pc(3285) long local3285 = local3279 + (local1380 << 32);
												local1150 = Static10.aClass1_Sub13_Sub1_117.method1853();
												@Pc(3291) int local3291 = 0;
												label1686: while (true) {
													if (local3291 >= 100) {
														if (local1150 <= 1) {
															if (Static287.aBoolean492 && !Static294.aBoolean110 || Static220.aBoolean372) {
																local3263 = true;
															} else {
																for (local3291 = 0; local3291 < Static282.anInt5138; local3291++) {
																	if (local1370 == Static86.aLongArray6[local3291]) {
																		local3263 = true;
																		break label1686;
																	}
																}
															}
														}
														break;
													}
													if (Static217.aLongArray9[local3291] == local3285) {
														local3263 = true;
														break;
													}
													local3291++;
												}
												if (!local3263 && Static155.anInt3106 == 0) {
													Static217.aLongArray9[Static280.anInt5136] = local3285;
													Static280.anInt5136 = (Static280.anInt5136 + 1) % 100;
													local3371 = Static285.method2872(Static314.method4670(Static263.method4065(Static10.aClass1_Sub13_Sub1_117)));
													if (local1150 == 2 || local1150 == 3) {
														Static5.method109("<img=1>" + Static69.method1333(local1370), Static69.method1333(local1375), local3371);
													} else if (local1150 == 1) {
														Static5.method109("<img=0>" + Static69.method1333(local1370), Static69.method1333(local1375), local3371);
													} else {
														Static5.method109(Static69.method1333(local1370), Static69.method1333(local1375), local3371);
													}
												}
												Static126.anInt1523 = -1;
												return true;
											} else if (Static126.anInt1523 == 173) {
												local123 = Static10.aClass1_Sub13_Sub1_117.method1879();
												if (Static101.method1950(local123)) {
													Static296.method716();
												}
												Static126.anInt1523 = -1;
												return true;
											} else if (Static126.anInt1523 == 29) {
												Static305.method4554(Static10.aClass1_Sub13_Sub1_117, aClass176_3, Static5.anInt204);
												Static126.anInt1523 = -1;
												return true;
											} else if (Static126.anInt1523 == 212) {
												local123 = Static10.aClass1_Sub13_Sub1_117.method1861();
												local155 = Static10.aClass1_Sub13_Sub1_117.method1844();
												local159 = Static10.aClass1_Sub13_Sub1_117.method1870();
												if (local159 == 65535) {
													local159 = -1;
												}
												if (Static101.method1950(local155)) {
													Static218.method3534(1, local159, -1, local123);
												}
												Static126.anInt1523 = -1;
												return true;
											} else if (Static126.anInt1523 == 10) {
												local123 = Static10.aClass1_Sub13_Sub1_117.method1870();
												Static137.method2365(local123);
												Static186.anIntArray387[Static272.anInt5002++ & 0x1F] = local123 & 0x7FFF;
												Static126.anInt1523 = -1;
												return true;
											} else if (Static126.anInt1523 == 221) {
												Static218.method3536();
												Static126.anInt1523 = -1;
												return false;
											} else if (Static126.anInt1523 == 162) {
												Static10.aClass1_Sub13_Sub1_117.anInt2018 += 28;
												if (Static10.aClass1_Sub13_Sub1_117.method1842()) {
													Static125.method2229(Static10.aClass1_Sub13_Sub1_117, Static10.aClass1_Sub13_Sub1_117.anInt2018 - 28);
												}
												Static126.anInt1523 = -1;
												return true;
											} else if (Static126.anInt1523 == 16) {
												local123 = Static10.aClass1_Sub13_Sub1_117.method1860();
												local155 = Static10.aClass1_Sub13_Sub1_117.method1879();
												if (local123 < -70000) {
													local155 += 32768;
												}
												if (local123 < 0) {
													local423 = null;
												} else {
													local423 = Static206.method3444(local123);
												}
												if (local423 != null) {
													for (local443 = 0; local443 < local423.anIntArray538.length; local443++) {
														local423.anIntArray538[local443] = 0;
														local423.anIntArray537[local443] = 0;
													}
												}
												Static206.method3439(local155);
												local443 = Static10.aClass1_Sub13_Sub1_117.method1879();
												for (local449 = 0; local449 < local443; local449++) {
													local451 = Static10.aClass1_Sub13_Sub1_117.method1879();
													local1142 = Static10.aClass1_Sub13_Sub1_117.method1853();
													if (local1142 == 255) {
														local1142 = Static10.aClass1_Sub13_Sub1_117.method1861();
													}
													if (local423 != null && local449 < local423.anIntArray538.length) {
														local423.anIntArray538[local449] = local451;
														local423.anIntArray537[local449] = local1142;
													}
													Static265.method4109(local155, local451 - 1, local449, local1142);
												}
												if (local423 != null) {
													Static224.method3621(local423);
												}
												Static97.method1896();
												Static186.anIntArray387[Static272.anInt5002++ & 0x1F] = local155 & 0x7FFF;
												Static126.anInt1523 = -1;
												return true;
											} else if (Static126.anInt1523 == 243) {
												Static14.method210();
												Static126.anInt1523 = -1;
												return true;
											} else if (Static126.anInt1523 == 131) {
												local1980 = Static10.aClass1_Sub13_Sub1_117.method1827();
												local155 = Static10.aClass1_Sub13_Sub1_117.method1844();
												local159 = Static10.aClass1_Sub13_Sub1_117.method1856();
												if (Static101.method1950(local159)) {
													Static81.method1670(local155, local1980);
												}
												Static126.anInt1523 = -1;
												return true;
											} else if (Static126.anInt1523 == 121) {
												for (local123 = 0; local123 < Static14.aClass11_Sub4_Sub1Array1.length; local123++) {
													if (Static14.aClass11_Sub4_Sub1Array1[local123] != null) {
														Static14.aClass11_Sub4_Sub1Array1[local123].anInt3864 = -1;
													}
												}
												for (local123 = 0; local123 < Static138.aClass11_Sub4_Sub2Array2.length; local123++) {
													if (Static138.aClass11_Sub4_Sub2Array2[local123] != null) {
														Static138.aClass11_Sub4_Sub2Array2[local123].anInt3864 = -1;
													}
												}
												Static126.anInt1523 = -1;
												return true;
											} else if (Static126.anInt1523 == 69) {
												local123 = Static10.aClass1_Sub13_Sub1_117.method1879();
												if (Static101.method1950(local123)) {
													Static236.method3799();
												}
												Static126.anInt1523 = -1;
												return true;
											} else if (Static126.anInt1523 == 247) {
												local123 = Static10.aClass1_Sub13_Sub1_117.method1845();
												local155 = Static10.aClass1_Sub13_Sub1_117.method1844();
												if (local155 == 65535) {
													local155 = -1;
												}
												Static27.method505(local155, local123);
												Static126.anInt1523 = -1;
												return true;
											} else if (Static126.anInt1523 == 176) {
												local123 = Static10.aClass1_Sub13_Sub1_117.method1867();
												local155 = Static10.aClass1_Sub13_Sub1_117.method1816();
												local159 = Static10.aClass1_Sub13_Sub1_117.method1856();
												if (local159 == 65535) {
													local159 = -1;
												}
												Static247.method1453(local159, local155, local123);
												Static126.anInt1523 = -1;
												return true;
											} else if (Static126.anInt1523 == 232) {
												Static106.anInt3752 = Static149.anInt950;
												local1370 = Static10.aClass1_Sub13_Sub1_117.method1833();
												if (local1370 == 0L) {
													Static205.aString136 = null;
													Static5.anInt201 = 0;
													Static276.aString195 = null;
													Static126.anInt1523 = -1;
													Static18.aClass1_Sub8Array1 = null;
													return true;
												}
												local1375 = Static10.aClass1_Sub13_Sub1_117.method1833();
												Static205.aString136 = Static136.method2356(local1375);
												Static276.aString195 = Static136.method2356(local1370);
												Static3.aByte1 = Static10.aClass1_Sub13_Sub1_117.method1829();
												local449 = Static10.aClass1_Sub13_Sub1_117.method1853();
												if (local449 == 255) {
													Static126.anInt1523 = -1;
													return true;
												}
												Static5.anInt201 = local449;
												@Pc(3979) Class1_Sub8[] local3979 = new Class1_Sub8[100];
												for (local1142 = 0; local1142 < Static5.anInt201; local1142++) {
													local3979[local1142] = new Class1_Sub8();
													local3979[local1142].aLong210 = Static10.aClass1_Sub13_Sub1_117.method1833();
													local3979[local1142].aString43 = Static136.method2356(local3979[local1142].aLong210);
													local3979[local1142].anInt1163 = Static10.aClass1_Sub13_Sub1_117.method1879();
													local3979[local1142].aByte5 = Static10.aClass1_Sub13_Sub1_117.method1829();
													local3979[local1142].aString42 = Static10.aClass1_Sub13_Sub1_117.method1827();
													if (local3979[local1142].aLong210 == Static215.aLong152) {
														Static41.aByte4 = local3979[local1142].aByte5;
													}
												}
												local1150 = Static5.anInt201;
												while (local1150 > 0) {
													local1150--;
													local2665 = true;
													for (local2704 = 0; local2704 < local1150; local2704++) {
														if (local3979[local2704].aString43.compareTo(local3979[local2704 + 1].aString43) > 0) {
															@Pc(4087) Class1_Sub8 local4087 = local3979[local2704];
															local2665 = false;
															local3979[local2704] = local3979[local2704 + 1];
															local3979[local2704 + 1] = local4087;
														}
													}
													if (local2665) {
														break;
													}
												}
												Static18.aClass1_Sub8Array1 = local3979;
												Static126.anInt1523 = -1;
												return true;
											} else if (Static126.anInt1523 == 201) {
												Static97.method1896();
												local123 = Static10.aClass1_Sub13_Sub1_117.method1867();
												local155 = Static10.aClass1_Sub13_Sub1_117.method1861();
												local159 = Static10.aClass1_Sub13_Sub1_117.method1845();
												Static301.anIntArray594[local159] = local155;
												Static117.anIntArray170[local159] = local123;
												Static141.anIntArray242[local159] = 1;
												for (local443 = 0; local443 < 98; local443++) {
													if (Class1_Sub1_Sub27.anIntArray489[local443] <= local155) {
														Static141.anIntArray242[local159] = local443 + 2;
													}
												}
												Static213.anIntArray605[Static96.anInt2062++ & 0x1F] = local159;
												Static126.anInt1523 = -1;
												return true;
											} else if (Static126.anInt1523 == 37) {
												local123 = Static10.aClass1_Sub13_Sub1_117.method1856();
												local679 = Static10.aClass1_Sub13_Sub1_117.method1827();
												local159 = Static10.aClass1_Sub13_Sub1_117.method1870();
												if (Static101.method1950(local159)) {
													Static81.method1670(local123, local679);
												}
												Static126.anInt1523 = -1;
												return true;
											} else if (Static126.anInt1523 == 128) {
												local1370 = Static10.aClass1_Sub13_Sub1_117.method1833();
												local159 = Static10.aClass1_Sub13_Sub1_117.method1879();
												local625 = Static271.method4175(local159).method3710(Static10.aClass1_Sub13_Sub1_117);
												Static219.method3546(null, local159, Static69.method1333(local1370), local625, 19);
												Static126.anInt1523 = -1;
												return true;
											} else if (Static126.anInt1523 == 210) {
												Static24.anInt490 = 0;
												Static126.anInt1523 = -1;
												return true;
											} else if (Static126.anInt1523 == 73) {
												local1370 = Static10.aClass1_Sub13_Sub1_117.method1833();
												local159 = Static10.aClass1_Sub13_Sub1_117.method1879();
												@Pc(4272) byte local4272 = Static10.aClass1_Sub13_Sub1_117.method1829();
												local2001 = false;
												if ((local1370 & Long.MIN_VALUE) != 0L) {
													local2001 = true;
												}
												if (local2001) {
													if (Static5.anInt201 == 0) {
														Static126.anInt1523 = -1;
														return true;
													}
													local1370 &= Long.MAX_VALUE;
													for (local451 = 0; Static5.anInt201 > local451 && (local1370 != Static18.aClass1_Sub8Array1[local451].aLong210 || local159 != Static18.aClass1_Sub8Array1[local451].anInt1163); local451++) {
													}
													if (local451 < Static5.anInt201) {
														while (local451 < Static5.anInt201 - 1) {
															Static18.aClass1_Sub8Array1[local451] = Static18.aClass1_Sub8Array1[local451 + 1];
															local451++;
														}
														Static5.anInt201--;
														Static18.aClass1_Sub8Array1[Static5.anInt201] = null;
													}
												} else {
													local2295 = Static10.aClass1_Sub13_Sub1_117.method1827();
													@Pc(4294) Class1_Sub8 local4294 = new Class1_Sub8();
													local4294.aLong210 = local1370;
													local4294.aString43 = Static136.method2356(local4294.aLong210);
													local4294.aString42 = local2295;
													local4294.aByte5 = local4272;
													local4294.anInt1163 = local159;
													for (local1146 = Static5.anInt201 - 1; local1146 >= 0; local1146--) {
														local1150 = Static18.aClass1_Sub8Array1[local1146].aString43.compareTo(local4294.aString43);
														if (local1150 == 0) {
															Static18.aClass1_Sub8Array1[local1146].anInt1163 = local159;
															Static18.aClass1_Sub8Array1[local1146].aByte5 = local4272;
															Static18.aClass1_Sub8Array1[local1146].aString42 = local2295;
															Static106.anInt3752 = Static149.anInt950;
															Static126.anInt1523 = -1;
															if (Static215.aLong152 == local1370) {
																Static41.aByte4 = local4272;
															}
															return true;
														}
														if (local1150 < 0) {
															break;
														}
													}
													if (Static18.aClass1_Sub8Array1.length <= Static5.anInt201) {
														Static126.anInt1523 = -1;
														return true;
													}
													for (local1150 = Static5.anInt201 - 1; local1150 > local1146; local1150--) {
														Static18.aClass1_Sub8Array1[local1150 + 1] = Static18.aClass1_Sub8Array1[local1150];
													}
													if (Static5.anInt201 == 0) {
														Static18.aClass1_Sub8Array1 = new Class1_Sub8[100];
													}
													Static18.aClass1_Sub8Array1[local1146 + 1] = local4294;
													Static5.anInt201++;
													if (Static215.aLong152 == local1370) {
														Static41.aByte4 = local4272;
													}
												}
												Static106.anInt3752 = Static149.anInt950;
												Static126.anInt1523 = -1;
												return true;
											} else if (Static126.anInt1523 == 186) {
												Static97.method1896();
												Static39.anInt742 = Static10.aClass1_Sub13_Sub1_117.method1853();
												Static126.anInt1523 = -1;
												Static243.anInt4497 = Static149.anInt950;
												return true;
											} else if (Static126.anInt1523 == 55) {
												local123 = Static10.aClass1_Sub13_Sub1_117.method1879();
												local155 = Static10.aClass1_Sub13_Sub1_117.method1867();
												if (Static101.method1950(local123)) {
													Static83.anInt1853 = local155;
												}
												Static126.anInt1523 = -1;
												return true;
											} else {
												@Pc(4614) Class1_Sub11 local4614;
												@Pc(4624) Class1_Sub11 local4624;
												if (Static126.anInt1523 == 7) {
													local123 = Static10.aClass1_Sub13_Sub1_117.method1856();
													local155 = Static10.aClass1_Sub13_Sub1_117.method1834();
													if (local123 == 65535) {
														local123 = -1;
													}
													local159 = Static10.aClass1_Sub13_Sub1_117.method1860();
													local443 = Static10.aClass1_Sub13_Sub1_117.method1856();
													if (local443 == 65535) {
														local443 = -1;
													}
													local449 = Static10.aClass1_Sub13_Sub1_117.method1879();
													if (Static101.method1950(local449)) {
														for (local451 = local123; local451 <= local443; local451++) {
															local3279 = (long) local451 + ((long) local159 << 32);
															local4614 = (Class1_Sub11) Static94.aClass86_12.method2136(local3279);
															if (local4614 != null) {
																local4624 = new Class1_Sub11(local155, local4614.anInt1324);
																local4614.method4573();
															} else if (local451 == -1) {
																local4624 = new Class1_Sub11(local155, Static206.method3444(local159).aClass1_Sub11_2.anInt1324);
															} else {
																local4624 = new Class1_Sub11(local155, -1);
															}
															Static94.aClass86_12.method2144(local4624, local3279);
														}
													}
													Static126.anInt1523 = -1;
													return true;
												} else if (Static126.anInt1523 == 205) {
													local1370 = Static10.aClass1_Sub13_Sub1_117.method1833();
													Static10.aClass1_Sub13_Sub1_117.method1829();
													local1375 = Static10.aClass1_Sub13_Sub1_117.method1833();
													local1380 = Static10.aClass1_Sub13_Sub1_117.method1879();
													@Pc(4689) boolean local4689 = false;
													local3279 = Static10.aClass1_Sub13_Sub1_117.method1878();
													@Pc(4703) long local4703 = (local1380 << 32) + local3279;
													local1150 = Static10.aClass1_Sub13_Sub1_117.method1853();
													local2704 = Static10.aClass1_Sub13_Sub1_117.method1879();
													@Pc(4713) int local4713 = 0;
													label1568: while (true) {
														if (local4713 >= 100) {
															if (local1150 <= 1) {
																for (local4713 = 0; local4713 < Static282.anInt5138; local4713++) {
																	if (Static86.aLongArray6[local4713] == local1370) {
																		local4689 = true;
																		break label1568;
																	}
																}
															}
															break;
														}
														if (Static217.aLongArray9[local4713] == local4703) {
															local4689 = true;
															break;
														}
														local4713++;
													}
													if (!local4689 && Static155.anInt3106 == 0) {
														Static217.aLongArray9[Static280.anInt5136] = local4703;
														Static280.anInt5136 = (Static280.anInt5136 + 1) % 100;
														@Pc(4788) String local4788 = Static271.method4175(local2704).method3710(Static10.aClass1_Sub13_Sub1_117);
														if (local1150 == 2 || local1150 == 3) {
															Static219.method3546(Static69.method1333(local1375), local2704, "<img=1>" + Static69.method1333(local1370), local4788, 20);
														} else if (local1150 == 1) {
															Static219.method3546(Static69.method1333(local1375), local2704, "<img=0>" + Static69.method1333(local1370), local4788, 20);
														} else {
															Static219.method3546(Static69.method1333(local1375), local2704, Static69.method1333(local1370), local4788, 20);
														}
													}
													Static126.anInt1523 = -1;
													return true;
												} else if (Static126.anInt1523 == 233) {
													Static263.anInt4869 = Static10.aClass1_Sub13_Sub1_117.method1844() * 30;
													Static243.anInt4497 = Static149.anInt950;
													Static126.anInt1523 = -1;
													return true;
												} else if (Static126.anInt1523 == 0) {
													local123 = Static10.aClass1_Sub13_Sub1_117.method1860();
													local155 = Static10.aClass1_Sub13_Sub1_117.method1879();
													Static45.method873(local155, local123);
													Static126.anInt1523 = -1;
													return true;
												} else if (Static126.anInt1523 == 168) {
													local123 = Static10.aClass1_Sub13_Sub1_117.method1853();
													local155 = local123 >> 5;
													local159 = local123 & 0x1F;
													if (local159 == 0) {
														Static160.aClass80Array1[local155] = null;
														Static126.anInt1523 = -1;
														return true;
													}
													@Pc(4923) Class80 local4923 = new Class80();
													local4923.anInt2271 = local159;
													local4923.anInt2268 = Static10.aClass1_Sub13_Sub1_117.method1853();
													if (local4923.anInt2268 >= 0 && Static288.aClass1_Sub5_Sub6Array14.length > local4923.anInt2268) {
														if (local4923.anInt2271 == 1 || local4923.anInt2271 == 10) {
															local4923.anInt2276 = Static10.aClass1_Sub13_Sub1_117.method1879();
															Static10.aClass1_Sub13_Sub1_117.anInt2018 += 5;
														} else if (local4923.anInt2271 >= 2 && local4923.anInt2271 <= 6) {
															if (local4923.anInt2271 == 2) {
																local4923.anInt2274 = 64;
																local4923.anInt2270 = 64;
															}
															if (local4923.anInt2271 == 3) {
																local4923.anInt2270 = 0;
																local4923.anInt2274 = 64;
															}
															if (local4923.anInt2271 == 4) {
																local4923.anInt2270 = 128;
																local4923.anInt2274 = 64;
															}
															if (local4923.anInt2271 == 5) {
																local4923.anInt2274 = 0;
																local4923.anInt2270 = 64;
															}
															if (local4923.anInt2271 == 6) {
																local4923.anInt2274 = 128;
																local4923.anInt2270 = 64;
															}
															local4923.anInt2271 = 2;
															local4923.anInt2267 = Static10.aClass1_Sub13_Sub1_117.method1879();
															local4923.anInt2266 = Static10.aClass1_Sub13_Sub1_117.method1879();
															local4923.anInt2269 = Static10.aClass1_Sub13_Sub1_117.method1853();
															local4923.anInt2272 = Static10.aClass1_Sub13_Sub1_117.method1879();
														}
														local4923.anInt2275 = Static10.aClass1_Sub13_Sub1_117.method1879();
														if (local4923.anInt2275 == 65535) {
															local4923.anInt2275 = -1;
														}
														Static160.aClass80Array1[local155] = local4923;
													}
													Static126.anInt1523 = -1;
													return true;
												} else if (Static126.anInt1523 == 97) {
													local1370 = Static10.aClass1_Sub13_Sub1_117.method1833();
													local159 = Static10.aClass1_Sub13_Sub1_117.method1879();
													local443 = Static10.aClass1_Sub13_Sub1_117.method1853();
													local2001 = true;
													local2295 = "";
													if (local159 > 0) {
														local2295 = Static10.aClass1_Sub13_Sub1_117.method1827();
													}
													if (local1370 < 0L) {
														local2001 = false;
														local1370 &= Long.MAX_VALUE;
													}
													@Pc(5128) String local5128 = Static69.method1333(local1370);
													for (local1146 = 0; local1146 < Static144.anInt2798; local1146++) {
														if (local1370 == Static133.aLongArray7[local1146]) {
															if (Static58.anIntArray96[local1146] != local159) {
																Static58.anIntArray96[local1146] = local159;
																if (local159 > 0) {
																	Static305.method4555(local5128 + Static189.aString126, "", 5);
																}
																if (local159 == 0) {
																	Static305.method4555(local5128 + Static54.aString44, "", 5);
																}
															}
															local5128 = null;
															Static54.aStringArray5[local1146] = local2295;
															Static23.anIntArray53[local1146] = local443;
															Static196.aBooleanArray15[local1146] = local2001;
															break;
														}
													}
													if (local5128 != null && Static144.anInt2798 < 200) {
														Static133.aLongArray7[Static144.anInt2798] = local1370;
														Static19.aStringArray4[Static144.anInt2798] = local5128;
														Static58.anIntArray96[Static144.anInt2798] = local159;
														Static54.aStringArray5[Static144.anInt2798] = local2295;
														Static23.anIntArray53[Static144.anInt2798] = local443;
														Static196.aBooleanArray15[Static144.anInt2798] = local2001;
														Static144.anInt2798++;
													}
													local1150 = Static144.anInt2798;
													Static105.anInt2227 = Static149.anInt950;
													while (local1150 > 0) {
														@Pc(5251) boolean local5251 = true;
														local1150--;
														for (local2704 = 0; local2704 < local1150; local2704++) {
															if (Static124.anInt596 != Static58.anIntArray96[local2704] && Static124.anInt596 == Static58.anIntArray96[local2704 + 1] || Static58.anIntArray96[local2704] == 0 && Static58.anIntArray96[local2704 + 1] != 0) {
																local5251 = false;
																local1820 = Static58.anIntArray96[local2704];
																Static58.anIntArray96[local2704] = Static58.anIntArray96[local2704 + 1];
																Static58.anIntArray96[local2704 + 1] = local1820;
																local1476 = Static54.aStringArray5[local2704];
																Static54.aStringArray5[local2704] = Static54.aStringArray5[local2704 + 1];
																Static54.aStringArray5[local2704 + 1] = local1476;
																local3371 = Static19.aStringArray4[local2704];
																Static19.aStringArray4[local2704] = Static19.aStringArray4[local2704 + 1];
																Static19.aStringArray4[local2704 + 1] = local3371;
																@Pc(5347) long local5347 = Static133.aLongArray7[local2704];
																Static133.aLongArray7[local2704] = Static133.aLongArray7[local2704 + 1];
																Static133.aLongArray7[local2704 + 1] = local5347;
																@Pc(5365) int local5365 = Static23.anIntArray53[local2704];
																Static23.anIntArray53[local2704] = Static23.anIntArray53[local2704 + 1];
																Static23.anIntArray53[local2704 + 1] = local5365;
																@Pc(5383) boolean local5383 = Static196.aBooleanArray15[local2704];
																Static196.aBooleanArray15[local2704] = Static196.aBooleanArray15[local2704 + 1];
																Static196.aBooleanArray15[local2704 + 1] = local5383;
															}
														}
														if (local5251) {
															break;
														}
													}
													Static126.anInt1523 = -1;
													return true;
												} else if (Static126.anInt1523 == 94) {
													local123 = Static10.aClass1_Sub13_Sub1_117.method1870();
													local155 = Static10.aClass1_Sub13_Sub1_117.method1867();
													Static45.method873(local123, local155);
													Static126.anInt1523 = -1;
													return true;
												} else if (Static126.anInt1523 == 106) {
													local123 = Static10.aClass1_Sub13_Sub1_117.method1870();
													local155 = Static10.aClass1_Sub13_Sub1_117.method1861();
													if (Static101.method1950(local123)) {
														local159 = 0;
														if (Static138.aClass11_Sub4_Sub1_3.aClass61_2 != null) {
															local159 = Static138.aClass11_Sub4_Sub1_3.aClass61_2.method1710();
														}
														Static218.method3534(3, local159, -1, local155);
													}
													Static126.anInt1523 = -1;
													return true;
												} else if (Static126.anInt1523 == 240) {
													local123 = Static10.aClass1_Sub13_Sub1_117.method1879();
													local155 = Static10.aClass1_Sub13_Sub1_117.method1853();
													local159 = Static10.aClass1_Sub13_Sub1_117.method1853();
													local443 = Static10.aClass1_Sub13_Sub1_117.method1879();
													local449 = Static10.aClass1_Sub13_Sub1_117.method1853();
													local451 = Static10.aClass1_Sub13_Sub1_117.method1853();
													if (Static101.method1950(local123)) {
														Static294.method944(local451, local443, local159, local449, local155);
													}
													Static126.anInt1523 = -1;
													return true;
												} else if (Static126.anInt1523 == 40) {
													local123 = Static10.aClass1_Sub13_Sub1_117.method1860();
													local155 = Static10.aClass1_Sub13_Sub1_117.method1856();
													local159 = Static10.aClass1_Sub13_Sub1_117.method1853();
													local443 = Static10.aClass1_Sub13_Sub1_117.method1844();
													if (Static101.method1950(local443)) {
														local250 = (Class1_Sub20) Static224.aClass86_27.method2136((long) local123);
														if (local250 != null) {
															Static296.method720(local155 != local250.anInt3422, local250);
														}
														Static94.method1799(local123, local159, local155);
													}
													Static126.anInt1523 = -1;
													return true;
												} else if (Static126.anInt1523 == 21) {
													local123 = Static10.aClass1_Sub13_Sub1_117.method1853();
													if (Static10.aClass1_Sub13_Sub1_117.method1853() == 0) {
														Static105.aClass77Array1[local123] = new Class77();
													} else {
														Static10.aClass1_Sub13_Sub1_117.anInt2018--;
														Static105.aClass77Array1[local123] = new Class77(Static10.aClass1_Sub13_Sub1_117);
													}
													Static172.anInt3362 = Static149.anInt950;
													Static126.anInt1523 = -1;
													return true;
												} else if (Static126.anInt1523 == 189) {
													local123 = Static10.aClass1_Sub13_Sub1_117.method1856();
													local155 = Static10.aClass1_Sub13_Sub1_117.method1879();
													local159 = Static10.aClass1_Sub13_Sub1_117.method1867();
													if (Static101.method1950(local123)) {
														if (local159 == 2) {
															Static271.method4174();
														}
														Static315.anInt5636 = local155;
														Static277.method4245(local155);
														Static270.method4170(false);
														Static215.method3496(Static315.anInt5636);
														for (local443 = 0; local443 < 100; local443++) {
															Static166.aBooleanArray11[local443] = true;
														}
													}
													Static126.anInt1523 = -1;
													return true;
												} else if (Static126.anInt1523 == 110) {
													Static265.method4105();
													Static97.method1896();
													Static126.anInt1523 = -1;
													Static263.anInt4858 += 32;
													return true;
												} else if (Static126.anInt1523 == 71) {
													Static97.method1896();
													Static189.anInt3635 = Static10.aClass1_Sub13_Sub1_117.method1843();
													Static243.anInt4497 = Static149.anInt950;
													Static126.anInt1523 = -1;
													return true;
												} else if (Static126.anInt1523 == 81) {
													local123 = Static10.aClass1_Sub13_Sub1_117.method1870();
													if (local123 == 65535) {
														local123 = -1;
													}
													local155 = Static10.aClass1_Sub13_Sub1_117.method1870();
													if (local155 == 65535) {
														local155 = -1;
													}
													local159 = Static10.aClass1_Sub13_Sub1_117.method1870();
													local443 = Static10.aClass1_Sub13_Sub1_117.method1834();
													local449 = Static10.aClass1_Sub13_Sub1_117.method1879();
													if (Static101.method1950(local159)) {
														for (local451 = local123; local451 <= local155; local451++) {
															local3279 = ((long) local443 << 32) + ((long) local451);
															local4614 = (Class1_Sub11) Static94.aClass86_12.method2136(local3279);
															if (local4614 != null) {
																local4624 = new Class1_Sub11(local4614.anInt1322, local449);
																local4614.method4573();
															} else if (local451 == -1) {
																local4624 = new Class1_Sub11(Static206.method3444(local443).aClass1_Sub11_2.anInt1322, local449);
															} else {
																local4624 = new Class1_Sub11(0, local449);
															}
															Static94.aClass86_12.method2144(local4624, local3279);
														}
													}
													Static126.anInt1523 = -1;
													return true;
												} else if (Static126.anInt1523 == 109) {
													Static262.anInt4841 = Static10.aClass1_Sub13_Sub1_117.method1849();
													Static166.anInt3282 = Static10.aClass1_Sub13_Sub1_117.method1853();
													for (local123 = Static262.anInt4841; local123 < Static262.anInt4841 + 8; local123++) {
														for (local155 = Static166.anInt3282; local155 < Static166.anInt3282 + 8; local155++) {
															if (Static203.aClass96ArrayArrayArray5[Static132.anInt2608][local123][local155] != null) {
																Static203.aClass96ArrayArrayArray5[Static132.anInt2608][local123][local155] = null;
																Static17.method274(local123, local155);
															}
														}
													}
													for (@Pc(5896) Class1_Sub4 local5896 = (Class1_Sub4) Static273.aClass96_27.method2340(); local5896 != null; local5896 = (Class1_Sub4) Static273.aClass96_27.method2342()) {
														if (local5896.anInt325 >= Static262.anInt4841 && local5896.anInt325 < Static262.anInt4841 + 8 && local5896.anInt333 >= Static166.anInt3282 && local5896.anInt333 < Static166.anInt3282 + 8 && local5896.anInt323 == Static132.anInt2608) {
															local5896.anInt329 = 0;
														}
													}
													Static126.anInt1523 = -1;
													return true;
												} else if (Static126.anInt1523 == 171) {
													Static96.method1882();
													Static126.anInt1523 = -1;
													return true;
												} else if (Static126.anInt1523 == 197) {
													local1370 = Static10.aClass1_Sub13_Sub1_117.method1833();
													@Pc(5968) String local5968 = Static285.method2872(Static314.method4670(Static263.method4065(Static10.aClass1_Sub13_Sub1_117)));
													Static305.method4555(local5968, Static69.method1333(local1370), 6);
													Static126.anInt1523 = -1;
													return true;
												} else if (Static126.anInt1523 == 34) {
													if (Static315.anInt5636 != -1) {
														Static262.method4043(0, Static315.anInt5636);
													}
													Static126.anInt1523 = -1;
													return true;
												} else if (Static126.anInt1523 == 41) {
													Static262.anInt4841 = Static10.aClass1_Sub13_Sub1_117.method1845();
													Static166.anInt3282 = Static10.aClass1_Sub13_Sub1_117.method1853();
													while (Static5.anInt204 > Static10.aClass1_Sub13_Sub1_117.anInt2018) {
														Static126.anInt1523 = Static10.aClass1_Sub13_Sub1_117.method1853();
														Static130.method2284();
													}
													Static126.anInt1523 = -1;
													return true;
												} else if (Static126.anInt1523 == 159) {
													local123 = Static10.aClass1_Sub13_Sub1_117.method1856();
													local155 = Static10.aClass1_Sub13_Sub1_117.method1870();
													@Pc(6048) byte local6048 = Static10.aClass1_Sub13_Sub1_117.method1815();
													if (Static101.method1950(local123)) {
														Static257.method4023(local155, local6048);
													}
													Static126.anInt1523 = -1;
													return true;
												} else {
													Static6.method4140(null, "T1 - " + Static126.anInt1523 + "," + Static129.anInt2551 + "," + Static130.anInt2575 + " - " + Static5.anInt204);
													Static218.method3536();
													return true;
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
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)V")
	public static void method3594(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(12) int local12 = Static266.anIntArray551[arg0];
		@Pc(16) int local16 = Static195.anIntArray409[arg0];
		@Pc(20) int local20 = Static94.aShortArray46[arg0];
		@Pc(25) int local25 = (int) Static66.aLongArray5[arg0];
		if (local20 >= 2000) {
			local20 -= 2000;
		}
		@Pc(33) long local33 = Static66.aLongArray5[arg0];
		if (local20 == 8) {
			Static224.anInt4209 = 2;
			Static25.anInt4802 = Static186.anInt3549;
			Static228.anInt4273 = Static45.anInt1043;
			Static194.anInt3870 = 0;
			Static116.aClass1_Sub13_Sub1_48.method1887(120);
			Static116.aClass1_Sub13_Sub1_48.method1865((int) (local33 >>> 32) & Integer.MAX_VALUE);
			Static116.aClass1_Sub13_Sub1_48.method1865(Static38.anInt714 + local12);
			Static116.aClass1_Sub13_Sub1_48.method1818(Static135.anInt2659 + local16);
			Static116.aClass1_Sub13_Sub1_48.method1820(Static1.aBooleanArray1[82] ? 1 : 0);
		}
		if (local20 == 26) {
			Static116.aClass1_Sub13_Sub1_48.method1887(128);
			Static116.aClass1_Sub13_Sub1_48.method1862(local12);
			Static116.aClass1_Sub13_Sub1_48.method1836(local16);
			Static116.aClass1_Sub13_Sub1_48.method1818(local25);
			Static226.anInt4228 = 0;
			Static160.aClass157_12 = Static206.method3444(local16);
			Static148.anInt3028 = local12;
		}
		if (local20 == 1009 || local20 == 1012 || local20 == 1005 || local20 == 1008 || local20 == 1001) {
			Static256.method4005(local25, local20, local12);
		}
		if (local20 == 45) {
			Static25.anInt4802 = Static186.anInt3549;
			Static228.anInt4273 = Static45.anInt1043;
			Static194.anInt3870 = 0;
			Static224.anInt4209 = 2;
			Static116.aClass1_Sub13_Sub1_48.method1887(19);
			Static116.aClass1_Sub13_Sub1_48.method1862(Static135.anInt2659 + local16);
			Static116.aClass1_Sub13_Sub1_48.method1838(Static1.aBooleanArray1[82] ? 1 : 0);
			Static116.aClass1_Sub13_Sub1_48.method1835(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static116.aClass1_Sub13_Sub1_48.method1862(Static75.anInt1991);
			Static116.aClass1_Sub13_Sub1_48.method1851(Static315.anInt5631);
			Static116.aClass1_Sub13_Sub1_48.method1818(Static38.anInt714 + local12);
		}
		if (local20 == 17) {
			Static116.aClass1_Sub13_Sub1_48.method1887(248);
			Static116.aClass1_Sub13_Sub1_48.method1835(local25);
			Static116.aClass1_Sub13_Sub1_48.method1858(local16);
			Static116.aClass1_Sub13_Sub1_48.method1862(local12);
			Static226.anInt4228 = 0;
			Static160.aClass157_12 = Static206.method3444(local16);
			Static148.anInt3028 = local12;
		}
		if (local20 == 1006) {
			Static25.anInt4802 = Static186.anInt3549;
			Static194.anInt3870 = 0;
			Static224.anInt4209 = 2;
			Static228.anInt4273 = Static45.anInt1043;
			Static116.aClass1_Sub13_Sub1_48.method1887(74);
			Static116.aClass1_Sub13_Sub1_48.method1835(local16 + Static135.anInt2659);
			Static116.aClass1_Sub13_Sub1_48.method1818(Static38.anInt714 + local12);
			Static116.aClass1_Sub13_Sub1_48.method1820(Static1.aBooleanArray1[82] ? 1 : 0);
			Static116.aClass1_Sub13_Sub1_48.method1818(Integer.MAX_VALUE & (int) (local33 >>> 32));
		}
		@Pc(316) Class11_Sub4_Sub1 local316;
		if (local20 == 31) {
			local316 = Static14.aClass11_Sub4_Sub1Array1[local25];
			if (local316 != null) {
				Static224.anInt4209 = 2;
				Static228.anInt4273 = Static45.anInt1043;
				Static194.anInt3870 = 0;
				Static25.anInt4802 = Static186.anInt3549;
				Static116.aClass1_Sub13_Sub1_48.method1887(101);
				Static116.aClass1_Sub13_Sub1_48.method1818(local25);
				Static116.aClass1_Sub13_Sub1_48.method1822(Static1.aBooleanArray1[82] ? 1 : 0);
			}
		}
		if (local20 == 43) {
			Static194.anInt3870 = 0;
			Static224.anInt4209 = 2;
			Static228.anInt4273 = Static45.anInt1043;
			Static25.anInt4802 = Static186.anInt3549;
			Static116.aClass1_Sub13_Sub1_48.method1887(30);
			Static116.aClass1_Sub13_Sub1_48.method1835(Static38.anInt714 + local12);
			Static116.aClass1_Sub13_Sub1_48.method1818(Static135.anInt2659 + local16);
			Static116.aClass1_Sub13_Sub1_48.method1822(Static1.aBooleanArray1[82] ? 1 : 0);
			Static116.aClass1_Sub13_Sub1_48.method1835(local25);
		}
		if (local20 == 10) {
			Static228.anInt4273 = Static45.anInt1043;
			Static224.anInt4209 = 2;
			Static25.anInt4802 = Static186.anInt3549;
			Static194.anInt3870 = 0;
			Static116.aClass1_Sub13_Sub1_48.method1887(8);
			Static116.aClass1_Sub13_Sub1_48.method1865(local12 + Static38.anInt714);
			Static116.aClass1_Sub13_Sub1_48.method1865(local25);
			Static116.aClass1_Sub13_Sub1_48.method1820(Static1.aBooleanArray1[82] ? 1 : 0);
			Static116.aClass1_Sub13_Sub1_48.method1865(Static135.anInt2659 + local16);
		}
		if (local20 == 20) {
			local316 = Static14.aClass11_Sub4_Sub1Array1[local25];
			if (local316 != null) {
				Static228.anInt4273 = Static45.anInt1043;
				Static25.anInt4802 = Static186.anInt3549;
				Static194.anInt3870 = 0;
				Static224.anInt4209 = 2;
				Static116.aClass1_Sub13_Sub1_48.method1887(7);
				Static116.aClass1_Sub13_Sub1_48.method1865(Static75.anInt1991);
				Static116.aClass1_Sub13_Sub1_48.method1858(Static315.anInt5631);
				Static116.aClass1_Sub13_Sub1_48.method1835(local25);
				Static116.aClass1_Sub13_Sub1_48.method1820(Static1.aBooleanArray1[82] ? 1 : 0);
			}
		}
		if (local20 == 58) {
			Static224.anInt4209 = 2;
			Static25.anInt4802 = Static186.anInt3549;
			Static228.anInt4273 = Static45.anInt1043;
			Static194.anInt3870 = 0;
			Static116.aClass1_Sub13_Sub1_48.method1887(87);
			Static116.aClass1_Sub13_Sub1_48.method1865(Static254.anInt4750);
			Static116.aClass1_Sub13_Sub1_48.method1851(Static154.anInt3091);
			Static116.aClass1_Sub13_Sub1_48.method1862(local12 + Static38.anInt714);
			Static116.aClass1_Sub13_Sub1_48.method1835(Static135.anInt2659 + local16);
			Static116.aClass1_Sub13_Sub1_48.method1825(Static1.aBooleanArray1[82] ? 1 : 0);
			Static116.aClass1_Sub13_Sub1_48.method1835(Static69.anInt1503);
			Static116.aClass1_Sub13_Sub1_48.method1865(local25);
		}
		@Pc(608) int local608;
		@Pc(588) Class157 local588;
		if (local20 == 11) {
			Static116.aClass1_Sub13_Sub1_48.method1887(109);
			Static116.aClass1_Sub13_Sub1_48.method1851(local16);
			local588 = Static206.method3444(local16);
			if (local588.anIntArrayArray37 != null && local588.anIntArrayArray37[0][0] == 5) {
				local608 = local588.anIntArrayArray37[0][1];
				if (local588.anIntArray532[0] != Static99.anIntArray148[local608]) {
					Static99.anIntArray148[local608] = local588.anIntArray532[0];
					Static167.method597(local608);
				}
			}
		}
		if (local20 == 59) {
			Static228.anInt4273 = Static45.anInt1043;
			Static194.anInt3870 = 0;
			Static224.anInt4209 = 2;
			Static25.anInt4802 = Static186.anInt3549;
			Static116.aClass1_Sub13_Sub1_48.method1887(49);
			Static116.aClass1_Sub13_Sub1_48.method1851(Static315.anInt5631);
			Static116.aClass1_Sub13_Sub1_48.method1865(Static38.anInt714 + local12);
			Static116.aClass1_Sub13_Sub1_48.method1818(local25);
			Static116.aClass1_Sub13_Sub1_48.method1838(Static1.aBooleanArray1[82] ? 1 : 0);
			Static116.aClass1_Sub13_Sub1_48.method1862(Static75.anInt1991);
			Static116.aClass1_Sub13_Sub1_48.method1818(Static135.anInt2659 + local16);
		}
		if (local20 == 42) {
			local316 = Static14.aClass11_Sub4_Sub1Array1[local25];
			if (local316 != null) {
				Static224.anInt4209 = 2;
				Static25.anInt4802 = Static186.anInt3549;
				Static228.anInt4273 = Static45.anInt1043;
				Static194.anInt3870 = 0;
				Static116.aClass1_Sub13_Sub1_48.method1887(115);
				Static116.aClass1_Sub13_Sub1_48.method1862(local25);
				Static116.aClass1_Sub13_Sub1_48.method1825(Static1.aBooleanArray1[82] ? 1 : 0);
			}
		}
		if (local20 == 13) {
			Static116.aClass1_Sub13_Sub1_48.method1887(133);
			Static116.aClass1_Sub13_Sub1_48.method1865(local25);
			Static116.aClass1_Sub13_Sub1_48.method1851(local16);
			Static116.aClass1_Sub13_Sub1_48.method1862(local12);
			Static226.anInt4228 = 0;
			Static160.aClass157_12 = Static206.method3444(local16);
			Static148.anInt3028 = local12;
		}
		@Pc(775) Class11_Sub4_Sub2 local775;
		if (local20 == 9) {
			local775 = Static138.aClass11_Sub4_Sub2Array2[local25];
			if (local775 != null) {
				Static224.anInt4209 = 2;
				Static228.anInt4273 = Static45.anInt1043;
				Static194.anInt3870 = 0;
				Static25.anInt4802 = Static186.anInt3549;
				Static116.aClass1_Sub13_Sub1_48.method1887(185);
				Static116.aClass1_Sub13_Sub1_48.method1820(Static1.aBooleanArray1[82] ? 1 : 0);
				Static116.aClass1_Sub13_Sub1_48.method1865(local25);
			}
		}
		if (local20 == 57) {
			Static256.method4004();
		}
		if (local20 == 36) {
			local316 = Static14.aClass11_Sub4_Sub1Array1[local25];
			if (local316 != null) {
				Static228.anInt4273 = Static45.anInt1043;
				Static224.anInt4209 = 2;
				Static25.anInt4802 = Static186.anInt3549;
				Static194.anInt3870 = 0;
				Static116.aClass1_Sub13_Sub1_48.method1887(5);
				Static116.aClass1_Sub13_Sub1_48.method1862(local25);
				Static116.aClass1_Sub13_Sub1_48.method1825(Static1.aBooleanArray1[82] ? 1 : 0);
			}
		}
		if (local20 == 18) {
			Static116.aClass1_Sub13_Sub1_48.method1887(92);
			Static116.aClass1_Sub13_Sub1_48.method1862(local25);
			Static116.aClass1_Sub13_Sub1_48.method1877(local16);
			Static116.aClass1_Sub13_Sub1_48.method1865(local12);
			Static226.anInt4228 = 0;
			Static160.aClass157_12 = Static206.method3444(local16);
			Static148.anInt3028 = local12;
		}
		if (local20 == 1007) {
			Static228.anInt4273 = Static45.anInt1043;
			Static25.anInt4802 = Static186.anInt3549;
			Static194.anInt3870 = 0;
			Static224.anInt4209 = 2;
			Static116.aClass1_Sub13_Sub1_48.method1887(114);
			Static116.aClass1_Sub13_Sub1_48.method1862(local25);
		}
		if (local20 == 37) {
			Static25.anInt4802 = Static186.anInt3549;
			Static194.anInt3870 = 0;
			Static224.anInt4209 = 2;
			Static228.anInt4273 = Static45.anInt1043;
			Static116.aClass1_Sub13_Sub1_48.method1887(44);
			Static116.aClass1_Sub13_Sub1_48.method1865(Static135.anInt2659 + local16);
			Static116.aClass1_Sub13_Sub1_48.method1862(local25);
			Static116.aClass1_Sub13_Sub1_48.method1865(Static38.anInt714 + local12);
			Static116.aClass1_Sub13_Sub1_48.method1820(Static1.aBooleanArray1[82] ? 1 : 0);
		}
		if (local20 == 15) {
			local316 = Static14.aClass11_Sub4_Sub1Array1[local25];
			if (local316 != null) {
				Static228.anInt4273 = Static45.anInt1043;
				Static25.anInt4802 = Static186.anInt3549;
				Static194.anInt3870 = 0;
				Static224.anInt4209 = 2;
				Static116.aClass1_Sub13_Sub1_48.method1887(198);
				Static116.aClass1_Sub13_Sub1_48.method1820(Static1.aBooleanArray1[82] ? 1 : 0);
				Static116.aClass1_Sub13_Sub1_48.method1818(local25);
			}
		}
		if (local20 == 48) {
			Static194.anInt3870 = 0;
			Static25.anInt4802 = Static186.anInt3549;
			Static224.anInt4209 = 2;
			Static228.anInt4273 = Static45.anInt1043;
			Static116.aClass1_Sub13_Sub1_48.method1887(77);
			Static116.aClass1_Sub13_Sub1_48.method1862(Static38.anInt714 + local12);
			Static116.aClass1_Sub13_Sub1_48.method1838(Static1.aBooleanArray1[82] ? 1 : 0);
			Static116.aClass1_Sub13_Sub1_48.method1865(local25);
			Static116.aClass1_Sub13_Sub1_48.method1835(local16 + Static135.anInt2659);
		}
		if (local20 == 14) {
			if (local25 == 0) {
				Static239.anInt4464 = 1;
				Static210.method3477(Static132.anInt2608, local12, local16);
			} else if (Static142.anInt2785 > 0 && Static1.aBooleanArray1[82] && Static1.aBooleanArray1[81]) {
				Static44.method871(Static135.anInt2659 + local16, Static132.anInt2608, local12 + Static38.anInt714);
			} else {
				Static116.aClass1_Sub13_Sub1_48.method1887(81);
				Static116.aClass1_Sub13_Sub1_48.method1865(Static38.anInt714 + local12);
				Static116.aClass1_Sub13_Sub1_48.method1835(Static135.anInt2659 + local16);
			}
		}
		if (local20 == 1010) {
			Static194.anInt3870 = 0;
			Static224.anInt4209 = 2;
			Static228.anInt4273 = Static45.anInt1043;
			Static25.anInt4802 = Static186.anInt3549;
			Static116.aClass1_Sub13_Sub1_48.method1887(122);
			Static116.aClass1_Sub13_Sub1_48.method1818(local25);
		}
		if (local20 == 12) {
			local775 = Static138.aClass11_Sub4_Sub2Array2[local25];
			if (local775 != null) {
				Static224.anInt4209 = 2;
				Static194.anInt3870 = 0;
				Static25.anInt4802 = Static186.anInt3549;
				Static228.anInt4273 = Static45.anInt1043;
				Static116.aClass1_Sub13_Sub1_48.method1887(68);
				Static116.aClass1_Sub13_Sub1_48.method1862(local25);
				Static116.aClass1_Sub13_Sub1_48.method1862(Static69.anInt1503);
				Static116.aClass1_Sub13_Sub1_48.method1865(Static254.anInt4750);
				Static116.aClass1_Sub13_Sub1_48.method1822(Static1.aBooleanArray1[82] ? 1 : 0);
				Static116.aClass1_Sub13_Sub1_48.method1836(Static154.anInt3091);
			}
		}
		if (local20 == 40) {
			if (local25 == 0) {
				Static173.anInt3381 = 1;
				Static210.method3477(Static132.anInt2608, local12, local16);
			} else if (local25 == 1) {
				Static116.aClass1_Sub13_Sub1_48.method1887(173);
				Static116.aClass1_Sub13_Sub1_48.method1835(local12 + Static38.anInt714);
				Static116.aClass1_Sub13_Sub1_48.method1835(Static75.anInt1991);
				Static116.aClass1_Sub13_Sub1_48.method1865(Static135.anInt2659 + local16);
				Static116.aClass1_Sub13_Sub1_48.method1836(Static315.anInt5631);
			}
		}
		if (local20 == 6) {
			Static224.anInt4209 = 2;
			Static25.anInt4802 = Static186.anInt3549;
			Static228.anInt4273 = Static45.anInt1043;
			Static194.anInt3870 = 0;
			Static116.aClass1_Sub13_Sub1_48.method1887(135);
			Static116.aClass1_Sub13_Sub1_48.method1865(local25);
			Static116.aClass1_Sub13_Sub1_48.method1825(Static1.aBooleanArray1[82] ? 1 : 0);
			Static116.aClass1_Sub13_Sub1_48.method1865(local12 + Static38.anInt714);
			Static116.aClass1_Sub13_Sub1_48.method1862(local16 + Static135.anInt2659);
		}
		if (local20 == 19) {
			local316 = Static14.aClass11_Sub4_Sub1Array1[local25];
			if (local316 != null) {
				Static224.anInt4209 = 2;
				Static194.anInt3870 = 0;
				Static228.anInt4273 = Static45.anInt1043;
				Static25.anInt4802 = Static186.anInt3549;
				Static116.aClass1_Sub13_Sub1_48.method1887(249);
				Static116.aClass1_Sub13_Sub1_48.method1825(Static1.aBooleanArray1[82] ? 1 : 0);
				Static116.aClass1_Sub13_Sub1_48.method1818(local25);
			}
		}
		if (local20 == 29) {
			Static228.anInt4273 = Static45.anInt1043;
			Static194.anInt3870 = 0;
			Static224.anInt4209 = 2;
			Static25.anInt4802 = Static186.anInt3549;
			Static116.aClass1_Sub13_Sub1_48.method1887(107);
			Static116.aClass1_Sub13_Sub1_48.method1825(Static1.aBooleanArray1[82] ? 1 : 0);
			Static116.aClass1_Sub13_Sub1_48.method1818(local12 + Static38.anInt714);
			Static116.aClass1_Sub13_Sub1_48.method1818(local16 + Static135.anInt2659);
			Static116.aClass1_Sub13_Sub1_48.method1835((int) (local33 >>> 32) & Integer.MAX_VALUE);
		}
		if (local20 == 16 || local20 == 1004) {
			Static68.method1295(local25, Static246.aStringArray28[arg0], local16, local12);
		}
		if (local20 == 35) {
			local316 = Static14.aClass11_Sub4_Sub1Array1[local25];
			if (local316 != null) {
				Static228.anInt4273 = Static45.anInt1043;
				Static25.anInt4802 = Static186.anInt3549;
				Static194.anInt3870 = 0;
				Static224.anInt4209 = 2;
				Static116.aClass1_Sub13_Sub1_48.method1887(129);
				Static116.aClass1_Sub13_Sub1_48.method1838(Static1.aBooleanArray1[82] ? 1 : 0);
				Static116.aClass1_Sub13_Sub1_48.method1862(local25);
			}
		}
		if (local20 == 33 && Static26.aClass157_2 == null) {
			Static207.method4488(local12, local16);
			Static26.aClass157_2 = Static209.method3469(local16, local12);
			Static224.method3621(Static26.aClass157_2);
		}
		if (local20 == 51) {
			Static228.anInt4273 = Static45.anInt1043;
			Static224.anInt4209 = 2;
			Static194.anInt3870 = 0;
			Static25.anInt4802 = Static186.anInt3549;
			Static116.aClass1_Sub13_Sub1_48.method1887(220);
			Static116.aClass1_Sub13_Sub1_48.method1818(Static135.anInt2659 + local16);
			Static116.aClass1_Sub13_Sub1_48.method1865(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static116.aClass1_Sub13_Sub1_48.method1865(Static38.anInt714 + local12);
			Static116.aClass1_Sub13_Sub1_48.method1822(Static1.aBooleanArray1[82] ? 1 : 0);
		}
		if (local20 == 22) {
			Static116.aClass1_Sub13_Sub1_48.method1887(2);
			Static116.aClass1_Sub13_Sub1_48.method1835(local12);
			Static116.aClass1_Sub13_Sub1_48.method1835(local25);
			Static116.aClass1_Sub13_Sub1_48.method1858(local16);
			Static226.anInt4228 = 0;
			Static160.aClass157_12 = Static206.method3444(local16);
			Static148.anInt3028 = local12;
		}
		if (local20 == 21) {
			local775 = Static138.aClass11_Sub4_Sub2Array2[local25];
			if (local775 != null) {
				Static228.anInt4273 = Static45.anInt1043;
				Static194.anInt3870 = 0;
				Static224.anInt4209 = 2;
				Static25.anInt4802 = Static186.anInt3549;
				Static116.aClass1_Sub13_Sub1_48.method1887(56);
				Static116.aClass1_Sub13_Sub1_48.method1862(local25);
				Static116.aClass1_Sub13_Sub1_48.method1838(Static1.aBooleanArray1[82] ? 1 : 0);
			}
		}
		if (local20 == 1002) {
			local588 = Static206.method3444(local16);
			if (local588 == null || local588.anIntArray537[local12] < 100000) {
				Static116.aClass1_Sub13_Sub1_48.method1887(114);
				Static116.aClass1_Sub13_Sub1_48.method1862(local25);
			} else {
				Static305.method4555(local588.anIntArray537[local12] + " x " + Static69.method1330(local25).aString3, "", 0);
			}
			Static226.anInt4228 = 0;
			Static160.aClass157_12 = Static206.method3444(local16);
			Static148.anInt3028 = local12;
		}
		if (local20 == 46) {
			Static230.method3684();
			local588 = Static206.method3444(local16);
			Static154.anInt3091 = local16;
			Static254.anInt4750 = local12;
			Static69.anInt1503 = local25;
			Static101.anInt2152 = 1;
			Static224.method3621(local588);
			Static199.aString133 = "<col=ff9040>" + Static69.method1330(local25).aString3 + "<col=ffffff>";
			if (Static199.aString133 == null) {
				Static199.aString133 = "null";
			}
			return;
		}
		if (local20 == 2) {
			local316 = Static14.aClass11_Sub4_Sub1Array1[local25];
			if (local316 != null) {
				Static228.anInt4273 = Static45.anInt1043;
				Static194.anInt3870 = 0;
				Static25.anInt4802 = Static186.anInt3549;
				Static224.anInt4209 = 2;
				Static116.aClass1_Sub13_Sub1_48.method1887(180);
				Static116.aClass1_Sub13_Sub1_48.method1820(Static1.aBooleanArray1[82] ? 1 : 0);
				Static116.aClass1_Sub13_Sub1_48.method1818(local25);
			}
		}
		if (local20 == 23) {
			Static228.anInt4273 = Static45.anInt1043;
			Static194.anInt3870 = 0;
			Static25.anInt4802 = Static186.anInt3549;
			Static224.anInt4209 = 2;
			Static116.aClass1_Sub13_Sub1_48.method1887(234);
			Static116.aClass1_Sub13_Sub1_48.method1820(Static1.aBooleanArray1[82] ? 1 : 0);
			Static116.aClass1_Sub13_Sub1_48.method1835(Static135.anInt2659 + local16);
			Static116.aClass1_Sub13_Sub1_48.method1851(Static154.anInt3091);
			Static116.aClass1_Sub13_Sub1_48.method1818(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static116.aClass1_Sub13_Sub1_48.method1818(Static254.anInt4750);
			Static116.aClass1_Sub13_Sub1_48.method1865(Static38.anInt714 + local12);
			Static116.aClass1_Sub13_Sub1_48.method1835(Static69.anInt1503);
		}
		if (local20 == 34) {
			Static116.aClass1_Sub13_Sub1_48.method1887(213);
			Static116.aClass1_Sub13_Sub1_48.method1835(local12);
			Static116.aClass1_Sub13_Sub1_48.method1836(local16);
			Static116.aClass1_Sub13_Sub1_48.method1818(local25);
			Static226.anInt4228 = 0;
			Static160.aClass157_12 = Static206.method3444(local16);
			Static148.anInt3028 = local12;
		}
		if (local20 == 44) {
			local316 = Static14.aClass11_Sub4_Sub1Array1[local25];
			if (local316 != null) {
				Static25.anInt4802 = Static186.anInt3549;
				Static228.anInt4273 = Static45.anInt1043;
				Static224.anInt4209 = 2;
				Static194.anInt3870 = 0;
				Static116.aClass1_Sub13_Sub1_48.method1887(97);
				Static116.aClass1_Sub13_Sub1_48.method1865(local25);
				Static116.aClass1_Sub13_Sub1_48.method1838(Static1.aBooleanArray1[82] ? 1 : 0);
			}
		}
		if (local20 == 1) {
			local316 = Static14.aClass11_Sub4_Sub1Array1[local25];
			if (local316 != null) {
				Static25.anInt4802 = Static186.anInt3549;
				Static224.anInt4209 = 2;
				Static194.anInt3870 = 0;
				Static228.anInt4273 = Static45.anInt1043;
				Static116.aClass1_Sub13_Sub1_48.method1887(167);
				Static116.aClass1_Sub13_Sub1_48.method1877(Static154.anInt3091);
				Static116.aClass1_Sub13_Sub1_48.method1862(local25);
				Static116.aClass1_Sub13_Sub1_48.method1862(Static254.anInt4750);
				Static116.aClass1_Sub13_Sub1_48.method1825(Static1.aBooleanArray1[82] ? 1 : 0);
				Static116.aClass1_Sub13_Sub1_48.method1818(Static69.anInt1503);
			}
		}
		if (local20 == 39) {
			Static116.aClass1_Sub13_Sub1_48.method1887(177);
			Static116.aClass1_Sub13_Sub1_48.method1865(local25);
			Static116.aClass1_Sub13_Sub1_48.method1836(local16);
			Static116.aClass1_Sub13_Sub1_48.method1865(local12);
			Static226.anInt4228 = 0;
			Static160.aClass157_12 = Static206.method3444(local16);
			Static148.anInt3028 = local12;
		}
		if (local20 == 28) {
			local588 = Static209.method3469(local16, local12);
			if (local588 != null) {
				Static230.method3684();
				@Pc(2009) Class1_Sub11 local2009 = Static42.method777(local588);
				Static178.method3133(local2009.method1126(), local588.anInt4742, local2009.anInt1324, local12, local588.anInt4661, local16);
				Static101.anInt2152 = 0;
				Static132.aString88 = Static315.method4680(local588);
				if (Static132.aString88 == null) {
					Static132.aString88 = "Null";
				}
				if (local588.aBoolean445) {
					Static176.aString113 = local588.aString170 + "<col=ffffff>";
				} else {
					Static176.aString113 = "<col=00ff00>" + local588.aString171 + "<col=ffffff>";
				}
			}
			return;
		}
		if (local20 == 50) {
			Static116.aClass1_Sub13_Sub1_48.method1887(51);
			Static116.aClass1_Sub13_Sub1_48.method1877(Static154.anInt3091);
			Static116.aClass1_Sub13_Sub1_48.method1818(Static254.anInt4750);
			Static116.aClass1_Sub13_Sub1_48.method1835(local25);
			Static116.aClass1_Sub13_Sub1_48.method1862(local12);
			Static116.aClass1_Sub13_Sub1_48.method1858(local16);
			Static116.aClass1_Sub13_Sub1_48.method1865(Static69.anInt1503);
			Static226.anInt4228 = 0;
			Static160.aClass157_12 = Static206.method3444(local16);
			Static148.anInt3028 = local12;
		}
		if (local20 == 30) {
			local775 = Static138.aClass11_Sub4_Sub2Array2[local25];
			if (local775 != null) {
				Static25.anInt4802 = Static186.anInt3549;
				Static224.anInt4209 = 2;
				Static194.anInt3870 = 0;
				Static228.anInt4273 = Static45.anInt1043;
				Static116.aClass1_Sub13_Sub1_48.method1887(78);
				Static116.aClass1_Sub13_Sub1_48.method1865(Static75.anInt1991);
				Static116.aClass1_Sub13_Sub1_48.method1877(Static315.anInt5631);
				Static116.aClass1_Sub13_Sub1_48.method1822(Static1.aBooleanArray1[82] ? 1 : 0);
				Static116.aClass1_Sub13_Sub1_48.method1862(local25);
			}
		}
		if (local20 == 5) {
			Static116.aClass1_Sub13_Sub1_48.method1887(187);
			Static116.aClass1_Sub13_Sub1_48.method1835(local12);
			Static116.aClass1_Sub13_Sub1_48.method1877(local16);
			Static116.aClass1_Sub13_Sub1_48.method1818(local25);
			Static116.aClass1_Sub13_Sub1_48.method1836(Static315.anInt5631);
			Static116.aClass1_Sub13_Sub1_48.method1818(Static75.anInt1991);
			Static226.anInt4228 = 0;
			Static160.aClass157_12 = Static206.method3444(local16);
			Static148.anInt3028 = local12;
		}
		if (local20 == 32) {
			Static228.anInt4273 = Static45.anInt1043;
			Static194.anInt3870 = 0;
			Static25.anInt4802 = Static186.anInt3549;
			Static224.anInt4209 = 2;
			Static116.aClass1_Sub13_Sub1_48.method1887(66);
			Static116.aClass1_Sub13_Sub1_48.method1835(local16 + Static135.anInt2659);
			Static116.aClass1_Sub13_Sub1_48.method1820(Static1.aBooleanArray1[82] ? 1 : 0);
			Static116.aClass1_Sub13_Sub1_48.method1835(local12 + Static38.anInt714);
			Static116.aClass1_Sub13_Sub1_48.method1865((int) (local33 >>> 32) & Integer.MAX_VALUE);
		}
		if (local20 == 4) {
			local775 = Static138.aClass11_Sub4_Sub2Array2[local25];
			if (local775 != null) {
				Static228.anInt4273 = Static45.anInt1043;
				Static224.anInt4209 = 2;
				Static25.anInt4802 = Static186.anInt3549;
				Static194.anInt3870 = 0;
				Static116.aClass1_Sub13_Sub1_48.method1887(9);
				Static116.aClass1_Sub13_Sub1_48.method1818(local25);
				Static116.aClass1_Sub13_Sub1_48.method1838(Static1.aBooleanArray1[82] ? 1 : 0);
			}
		}
		if (local20 == 60) {
			local775 = Static138.aClass11_Sub4_Sub2Array2[local25];
			if (local775 != null) {
				Static224.anInt4209 = 2;
				Static194.anInt3870 = 0;
				Static228.anInt4273 = Static45.anInt1043;
				Static25.anInt4802 = Static186.anInt3549;
				Static116.aClass1_Sub13_Sub1_48.method1887(32);
				Static116.aClass1_Sub13_Sub1_48.method1818(local25);
				Static116.aClass1_Sub13_Sub1_48.method1825(Static1.aBooleanArray1[82] ? 1 : 0);
			}
		}
		if (local20 == 24) {
			Static116.aClass1_Sub13_Sub1_48.method1887(10);
			Static116.aClass1_Sub13_Sub1_48.method1877(local16);
			Static116.aClass1_Sub13_Sub1_48.method1818(local25);
			Static116.aClass1_Sub13_Sub1_48.method1835(local12);
			Static226.anInt4228 = 0;
			Static160.aClass157_12 = Static206.method3444(local16);
			Static148.anInt3028 = local12;
		}
		if (local20 == 25) {
			local775 = Static138.aClass11_Sub4_Sub2Array2[local25];
			if (local775 != null) {
				Static228.anInt4273 = Static45.anInt1043;
				Static194.anInt3870 = 0;
				Static25.anInt4802 = Static186.anInt3549;
				Static224.anInt4209 = 2;
				Static116.aClass1_Sub13_Sub1_48.method1887(192);
				Static116.aClass1_Sub13_Sub1_48.method1822(Static1.aBooleanArray1[82] ? 1 : 0);
				Static116.aClass1_Sub13_Sub1_48.method1862(local25);
			}
		}
		if (local20 == 41) {
			Static116.aClass1_Sub13_Sub1_48.method1887(143);
			Static116.aClass1_Sub13_Sub1_48.method1858(local16);
			Static116.aClass1_Sub13_Sub1_48.method1862(local25);
			Static116.aClass1_Sub13_Sub1_48.method1865(local12);
			Static226.anInt4228 = 0;
			Static160.aClass157_12 = Static206.method3444(local16);
			Static148.anInt3028 = local12;
		}
		if (local20 == 1003) {
			Static224.anInt4209 = 2;
			Static194.anInt3870 = 0;
			Static25.anInt4802 = Static186.anInt3549;
			Static228.anInt4273 = Static45.anInt1043;
			local775 = Static138.aClass11_Sub4_Sub2Array2[local25];
			if (local775 != null) {
				@Pc(2487) Class183 local2487 = local775.aClass183_1;
				if (local2487.anIntArray596 != null) {
					local2487 = local2487.method4526();
				}
				if (local2487 != null) {
					Static116.aClass1_Sub13_Sub1_48.method1887(186);
					Static116.aClass1_Sub13_Sub1_48.method1818(local2487.anInt5451);
				}
			}
		}
		if (local20 == 7) {
			Static116.aClass1_Sub13_Sub1_48.method1887(41);
			Static116.aClass1_Sub13_Sub1_48.method1836(local16);
			Static116.aClass1_Sub13_Sub1_48.method1862(local12);
			Static116.aClass1_Sub13_Sub1_48.method1865(local25);
			Static226.anInt4228 = 0;
			Static160.aClass157_12 = Static206.method3444(local16);
			Static148.anInt3028 = local12;
		}
		if (local20 == 3) {
			local588 = Static206.method3444(local16);
			@Pc(2553) boolean local2553 = true;
			if (local588.anInt4686 > 0) {
				local2553 = Static99.method1927(local588);
			}
			if (local2553) {
				Static116.aClass1_Sub13_Sub1_48.method1887(109);
				Static116.aClass1_Sub13_Sub1_48.method1851(local16);
			}
		}
		if (local20 == 49) {
			Static116.aClass1_Sub13_Sub1_48.method1887(241);
			Static116.aClass1_Sub13_Sub1_48.method1836(Static315.anInt5631);
			Static116.aClass1_Sub13_Sub1_48.method1818(local12);
			Static116.aClass1_Sub13_Sub1_48.method1835(Static75.anInt1991);
			Static116.aClass1_Sub13_Sub1_48.method1851(local16);
		}
		if (local20 == 47) {
			Static116.aClass1_Sub13_Sub1_48.method1887(109);
			Static116.aClass1_Sub13_Sub1_48.method1851(local16);
			local588 = Static206.method3444(local16);
			if (local588.anIntArrayArray37 != null && local588.anIntArrayArray37[0][0] == 5) {
				local608 = local588.anIntArrayArray37[0][1];
				Static99.anIntArray148[local608] = 1 - Static99.anIntArray148[local608];
				Static167.method597(local608);
			}
		}
		if (local20 == 38) {
			if (local25 == 0) {
				Static210.method3477(Static132.anInt2608, local12, local16);
			} else if (local25 == 1) {
				if (Static142.anInt2785 > 0 && Static1.aBooleanArray1[82] && Static1.aBooleanArray1[81]) {
					Static44.method871(Static135.anInt2659 + local16, Static132.anInt2608, local12 + Static38.anInt714);
				} else {
					Static146.method2585(local12, local16, 1);
					Static116.aClass1_Sub13_Sub1_48.method1822(Static122.anInt2492);
					Static116.aClass1_Sub13_Sub1_48.method1822(Static206.anInt3971);
					Static116.aClass1_Sub13_Sub1_48.method1835((int) Static148.aFloat64);
					Static116.aClass1_Sub13_Sub1_48.method1822(57);
					Static116.aClass1_Sub13_Sub1_48.method1822(Static69.anInt1492);
					Static116.aClass1_Sub13_Sub1_48.method1822(Static289.anInt5250);
					Static116.aClass1_Sub13_Sub1_48.method1822(89);
					Static116.aClass1_Sub13_Sub1_48.method1835(Static138.aClass11_Sub4_Sub1_3.anInt3865);
					Static116.aClass1_Sub13_Sub1_48.method1835(Static138.aClass11_Sub4_Sub1_3.anInt3856);
					Static116.aClass1_Sub13_Sub1_48.method1822(Static34.anInt655);
					Static116.aClass1_Sub13_Sub1_48.method1822(63);
				}
			}
		}
		if (Static101.anInt2152 != 0) {
			Static101.anInt2152 = 0;
			Static224.method3621(Static206.method3444(Static154.anInt3091));
		}
		if (Static187.aBoolean318) {
			Static230.method3684();
		}
		if (Static160.aClass157_12 != null && Static226.anInt4228 == 0) {
			Static224.method3621(Static160.aClass157_12);
		}
	}
}
