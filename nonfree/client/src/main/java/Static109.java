import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!vd", name = "yd", descriptor = "Z")
	public static boolean aBoolean159;

	@OriginalMember(owner = "client!vd", name = "Bd", descriptor = "Lclient!ab;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!vd", name = "Md", descriptor = "[I")
	public static int[] anIntArray347;

	@OriginalMember(owner = "client!vd", name = "ud", descriptor = "I")
	public static int anInt2768 = 0;

	@OriginalMember(owner = "client!vd", name = "vd", descriptor = "Lclient!a;")
	public static Class1 aClass1_2872 = null;

	@OriginalMember(owner = "client!vd", name = "xd", descriptor = "Lclient!a;")
	private static Class1 aClass1_2873 = Static94.method1596("On");

	@OriginalMember(owner = "client!vd", name = "Cd", descriptor = "Lclient!a;")
	public static Class1 aClass1_2874 = Static94.method1596("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!vd", name = "Ed", descriptor = "[I")
	public static int[] anIntArray346 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!vd", name = "Od", descriptor = "Lclient!a;")
	private static Class1 aClass1_2880 = Static94.method1596("Connection lost");

	@OriginalMember(owner = "client!vd", name = "Fd", descriptor = "Lclient!a;")
	public static Class1 aClass1_2875 = aClass1_2880;

	@OriginalMember(owner = "client!vd", name = "Hd", descriptor = "Lclient!a;")
	public static Class1 aClass1_2876 = Static94.method1596("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!vd", name = "Id", descriptor = "Lclient!a;")
	public static Class1 aClass1_2877 = Static94.method1596("gr-Un:");

	@OriginalMember(owner = "client!vd", name = "Jd", descriptor = "Lclient!a;")
	public static Class1 aClass1_2878 = Static94.method1596("Hierhin gehen");

	@OriginalMember(owner = "client!vd", name = "Ld", descriptor = "Lclient!a;")
	public static Class1 aClass1_2879 = aClass1_2873;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)Lclient!qa;")
	public static Class2_Sub1_Sub13 method1790(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub13 local10 = (Class2_Sub1_Sub13) Static22.aClass11_7.method431((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static108.aClass8_27.method1684(arg0, 16);
		local10 = new Class2_Sub1_Sub13();
		if (local25 != null) {
			local10.method1486(new Class2_Sub3(local25));
		}
		Static22.aClass11_7.method430((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)V")
	public static void method1791() {
		if (Static95.anInt2397 > 1) {
			Static95.anInt2397--;
		}
		if (Static59.anInt1826 > 0) {
			Static59.anInt1826--;
		}
		if (Static65.aBoolean104) {
			Static65.aBoolean104 = false;
			Static98.method1659();
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < 100 && Static5.method199(); local32++) {
		}
		if (Static85.anInt2262 != 30 && Static85.anInt2262 != 35) {
			return;
		}
		@Pc(73) int local73;
		if (Static34.aBoolean62 && Static85.anInt2262 == 30) {
			Static25.anInt1019 = 0;
			Static103.anInt2617 = 0;
			while (Static62.method1297()) {
			}
			for (local73 = 0; local73 < Static51.aBooleanArray12.length; local73++) {
				Static51.aBooleanArray12[local73] = false;
			}
		}
		Static41.method961(Static59.aClass2_Sub3_Sub1_2);
		@Pc(91) Object local91 = Static21.aClass41_1.anObject4;
		@Pc(126) int local126;
		@Pc(115) int local115;
		@Pc(128) int local128;
		@Pc(161) int local161;
		synchronized (Static21.aClass41_1.anObject4) {
			if (!Static40.aBoolean88) {
				Static21.aClass41_1.anInt1948 = 0;
			} else if (Static103.anInt2617 != 0 || Static21.aClass41_1.anInt1948 >= 40) {
				local115 = 0;
				Static59.aClass2_Sub3_Sub1_2.method841(210);
				Static59.aClass2_Sub3_Sub1_2.method788(0);
				local126 = Static59.aClass2_Sub3_Sub1_2.anInt1168;
				@Pc(143) int local143;
				for (local128 = 0; local128 < Static21.aClass41_1.anInt1948 && Static59.aClass2_Sub3_Sub1_2.anInt1168 - local126 < 240; local128++) {
					local115++;
					local143 = Static21.aClass41_1.anIntArray205[local128];
					if (local143 < 0) {
						local143 = 0;
					} else if (local143 > 502) {
						local143 = 502;
					}
					local161 = Static21.aClass41_1.anIntArray206[local128];
					if (local161 < 0) {
						local161 = 0;
					} else if (local161 > 764) {
						local161 = 764;
					}
					@Pc(180) int local180 = local143 * 765 + local161;
					if (Static21.aClass41_1.anIntArray205[local128] == -1 && Static21.aClass41_1.anIntArray206[local128] == -1) {
						local161 = -1;
						local180 = 524287;
						local143 = -1;
					}
					if (local161 != Static31.anInt1221 || local143 != Static44.anInt1517) {
						@Pc(223) int local223 = local161 - Static31.anInt1221;
						Static31.anInt1221 = local161;
						@Pc(229) int local229 = local143 - Static44.anInt1517;
						Static44.anInt1517 = local143;
						if (Static104.anInt1620 < 8 && local223 >= -32 && local223 <= 31 && local229 >= -32 && local229 <= 31) {
							local223 += 32;
							local229 += 32;
							Static59.aClass2_Sub3_Sub1_2.method797(local229 + (local223 << 6) + (Static104.anInt1620 << 12));
							Static104.anInt1620 = 0;
						} else if (Static104.anInt1620 < 8) {
							Static59.aClass2_Sub3_Sub1_2.method800(local180 + (Static104.anInt1620 << 19) + 8388608);
							Static104.anInt1620 = 0;
						} else {
							Static59.aClass2_Sub3_Sub1_2.method829((Static104.anInt1620 << 19) + local180 - 1073741824);
							Static104.anInt1620 = 0;
						}
					} else if (Static104.anInt1620 < 2047) {
						Static104.anInt1620++;
					}
				}
				Static59.aClass2_Sub3_Sub1_2.method802(Static59.aClass2_Sub3_Sub1_2.anInt1168 - local126);
				if (local115 < Static21.aClass41_1.anInt1948) {
					Static21.aClass41_1.anInt1948 -= local115;
					for (local143 = 0; local143 < Static21.aClass41_1.anInt1948; local143++) {
						Static21.aClass41_1.anIntArray206[local143] = Static21.aClass41_1.anIntArray206[local115 + local143];
						Static21.aClass41_1.anIntArray205[local143] = Static21.aClass41_1.anIntArray205[local143 + local115];
					}
				} else {
					Static21.aClass41_1.anInt1948 = 0;
				}
			}
		}
		if (Static103.anInt2617 != 0) {
			@Pc(377) long local377 = (Static44.aLong46 - Static85.aLong74) / 50L;
			local115 = Static93.anInt2360;
			local126 = Static1.anInt13;
			Static85.aLong74 = Static44.aLong46;
			if (local115 < 0) {
				local115 = 0;
			} else if (local115 > 764) {
				local115 = 764;
			}
			if (local126 < 0) {
				local126 = 0;
			} else if (local126 > 502) {
				local126 = 502;
			}
			@Pc(412) byte local412 = 0;
			if (Static103.anInt2617 == 2) {
				local412 = 1;
			}
			if (local377 > 4095L) {
				local377 = 4095L;
			}
			local161 = (int) local377;
			Static59.aClass2_Sub3_Sub1_2.method841(234);
			local128 = local126 * 765 + local115;
			Static59.aClass2_Sub3_Sub1_2.method817((local412 << 19) + ((local161 << 20) + local128));
		}
		if (Static32.anInt1238 > 0) {
			Static32.anInt1238--;
		}
		if (Static51.aBooleanArray12[96] || Static51.aBooleanArray12[97] || Static51.aBooleanArray12[98] || Static51.aBooleanArray12[99]) {
			Static43.aBoolean72 = true;
		}
		if (Static43.aBoolean72 && Static32.anInt1238 <= 0) {
			Static32.anInt1238 = 20;
			Static43.aBoolean72 = false;
			Static59.aClass2_Sub3_Sub1_2.method841(58);
			Static59.aClass2_Sub3_Sub1_2.method797(Static94.anInt2376);
			Static59.aClass2_Sub3_Sub1_2.method797(Static110.anInt2777);
		}
		if (Static43.aBoolean73 && !Static63.aBoolean102) {
			Static63.aBoolean102 = true;
			Static59.aClass2_Sub3_Sub1_2.method841(160);
			Static59.aClass2_Sub3_Sub1_2.method788(1);
		}
		if (!Static43.aBoolean73 && Static63.aBoolean102) {
			Static63.aBoolean102 = false;
			Static59.aClass2_Sub3_Sub1_2.method841(160);
			Static59.aClass2_Sub3_Sub1_2.method788(0);
		}
		Static76.method1443();
		if (Static85.anInt2262 != 30 && Static85.anInt2262 != 35) {
			return;
		}
		Static86.method1553();
		Static6.method213();
		Static63.anInt1885++;
		if (Static63.anInt1885 > 750) {
			Static98.method1659();
			return;
		}
		Static27.method728();
		Static12.method1736();
		Static33.method862();
		if (Static76.anInt2064 != 0) {
			Static29.anInt1086 += 20;
			if (Static29.anInt1086 >= 400) {
				Static76.anInt2064 = 0;
			}
		}
		if (Static18.anInt841 != 0) {
			Static38.anInt1376++;
			if (Static38.anInt1376 >= 15) {
				if (Static18.anInt841 == 2) {
					Static34.aBoolean60 = true;
				}
				if (Static18.anInt841 == 3) {
					Static87.aBoolean137 = true;
				}
				Static18.anInt841 = 0;
			}
		}
		Static8.anInt509++;
		if (Static28.anInt1052 != 0) {
			Static7.anInt1196++;
			if (Static22.anInt930 > Static107.anInt2703 + 5 || Static107.anInt2703 - 5 > Static22.anInt930 || Static96.anInt2421 + 5 < Static84.anInt2248 || Static96.anInt2421 - 5 > Static84.anInt2248) {
				Static95.aBoolean142 = true;
			}
			if (Static25.anInt1019 == 0) {
				if (Static28.anInt1052 == 3) {
					Static87.aBoolean137 = true;
				}
				if (Static28.anInt1052 == 2) {
					Static34.aBoolean60 = true;
				}
				Static28.anInt1052 = 0;
				if (Static95.aBoolean142 && Static7.anInt1196 >= 5) {
					Static38.anInt1371 = -1;
					Static72.method1371();
					if (Static81.anInt2133 == Static38.anInt1371 && Static90.anInt2328 != Static94.anInt2364) {
						@Pc(745) Class2_Sub1_Sub14 local745 = Static113.method1526(Static81.anInt2133);
						@Pc(747) byte local747 = 0;
						if (Static72.anInt1977 == 1 && local745.anInt2169 == 206) {
							local747 = 1;
						}
						if (local745.anIntArray276[Static90.anInt2328] <= 0) {
							local747 = 0;
						}
						if (local745.aBoolean131) {
							local115 = Static90.anInt2328;
							local126 = Static94.anInt2364;
							local745.anIntArray276[local115] = local745.anIntArray276[local126];
							local745.anIntArray281[local115] = local745.anIntArray281[local126];
							local745.anIntArray276[local126] = -1;
							local745.anIntArray281[local126] = 0;
						} else if (local747 == 1) {
							local126 = Static94.anInt2364;
							local115 = Static90.anInt2328;
							while (local115 != local126) {
								if (local126 > local115) {
									local745.method1508(local126 - 1, local126);
									local126--;
								} else if (local126 < local115) {
									local745.method1508(local126 + 1, local126);
									local126++;
								}
							}
						} else {
							local745.method1508(Static90.anInt2328, Static94.anInt2364);
						}
						Static59.aClass2_Sub3_Sub1_2.method841(83);
						Static59.aClass2_Sub3_Sub1_2.method812(local747);
						Static59.aClass2_Sub3_Sub1_2.method816(Static94.anInt2364);
						Static59.aClass2_Sub3_Sub1_2.method801(Static90.anInt2328);
						Static59.aClass2_Sub3_Sub1_2.method826(Static81.anInt2133);
					}
				} else if ((Static113.anInt2241 == 1 || Static60.method1282(Static37.anInt1346 - 1)) && Static37.anInt1346 > 2) {
					Static99.method1667();
				} else if (Static37.anInt1346 > 0) {
					Static54.method1224(Static37.anInt1346 - 1);
				}
				Static38.anInt1376 = 10;
				Static103.anInt2617 = 0;
			}
		}
		@Pc(884) int local884;
		if (Static3.anInt305 != -1) {
			local73 = Static3.anInt305;
			local884 = Static3.anInt307;
			@Pc(904) boolean local904 = Static52.method1188(0, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local73, 0, true, 0, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local884, 0);
			if (local904) {
				Static14.anInt680 = Static1.anInt13;
				Static29.anInt1086 = 0;
				Static100.anInt2546 = Static93.anInt2360;
				Static76.anInt2064 = 1;
			}
			Static3.anInt305 = -1;
		}
		if (Static103.anInt2617 == 1 && Static55.aClass1_665 != null) {
			Static103.anInt2617 = 0;
			Static87.aBoolean137 = true;
			Static55.aClass1_665 = null;
		}
		Static103.method1724();
		if (Static37.anInt1369 == -1) {
			Static51.method1168();
			Static52.method1187();
			Static14.method449();
		}
		if (Static25.anInt1019 == 1 || Static103.anInt2617 == 1) {
			anInt2768++;
		}
		if (Static111.anInt2784 != -1) {
			Static54.method1226(516, 34, 338, Static111.anInt2784, 4, 4);
		}
		if (Static56.anInt1778 != -1) {
			Static54.method1226(743, 34, 466, Static56.anInt1778, 205, 553);
		} else if (Static80.anIntArray274[Static8.anInt514] != -1) {
			Static54.method1226(743, 34, 466, Static80.anIntArray274[Static8.anInt514], 205, 553);
		}
		if (Static72.anInt1978 != -1) {
			Static54.method1226(496, 34, 453, Static72.anInt1978, 357, 17);
		} else if (Static81.anInt2140 != -1) {
			Static54.method1226(496, 34, 453, Static81.anInt2140, 357, 17);
		}
		if (Static111.anInt2784 != -1) {
			Static54.method1226(516, -35, 338, Static111.anInt2784, 4, 4);
		}
		if (Static56.anInt1778 != -1) {
			Static54.method1226(743, -35, 466, Static56.anInt1778, 205, 553);
		} else if (Static80.anIntArray274[Static8.anInt514] != -1) {
			Static54.method1226(743, -35, 466, Static80.anIntArray274[Static8.anInt514], 205, 553);
		}
		if (Static72.anInt1978 != -1) {
			Static54.method1226(496, -35, 453, Static72.anInt1978, 357, 17);
		} else if (Static81.anInt2140 != -1) {
			Static54.method1226(496, -35, 453, Static81.anInt2140, 357, 17);
		}
		if (Static112.anInt2796 == -1 && Static46.anInt1555 == -1 && Static43.anInt1459 == -1) {
			if (Static88.anInt2314 > 0) {
				Static88.anInt2314--;
			}
		} else if (Static1.anInt46 > Static88.anInt2314) {
			Static88.anInt2314++;
			if (Static88.anInt2314 == Static1.anInt46) {
				if (Static112.anInt2796 != -1) {
					Static87.aBoolean137 = true;
				}
				if (Static46.anInt1555 != -1) {
					Static34.aBoolean60 = true;
				}
			}
		}
		Static51.method1167();
		if (Static68.aBoolean105) {
			Static8.method299();
		}
		for (local884 = 0; local884 < 5; local884++) {
			@Pc(1157) int local1157 = Static33.anIntArray124[local884]++;
		}
		Static41.method964();
		local126 = Static59.method1268();
		local115 = Static27.method726();
		if (local126 > 4500 && local115 > 4500) {
			Static59.anInt1826 = 250;
			Static86.method1551(4000);
			Static59.aClass2_Sub3_Sub1_2.method841(216);
		}
		Static2.anInt285++;
		Static52.anInt1728++;
		if (Static52.anInt1728 > 500) {
			local128 = (int) (Math.random() * 8.0D);
			if ((local128 & 0x2) == 2) {
				Static81.anInt2132 += Static4.anInt377;
			}
			if ((local128 & 0x1) == 1) {
				Static7.anInt1194 += Static71.anInt1970;
			}
			Static52.anInt1728 = 0;
			if ((local128 & 0x4) == 4) {
				Static93.anInt2361 += Static8.anInt507;
			}
		}
		if (Static81.anInt2132 < -55) {
			Static4.anInt377 = 2;
		}
		if (Static2.anInt285 > 500) {
			local128 = (int) (Math.random() * 8.0D);
			if ((local128 & 0x1) == 1) {
				Static72.anInt1975 += Static22.anInt929;
			}
			if ((local128 & 0x2) == 2) {
				Static85.anInt2254 += Static17.anInt777;
			}
			Static2.anInt285 = 0;
		}
		if (Static81.anInt2132 > 55) {
			Static4.anInt377 = -2;
		}
		if (Static7.anInt1194 < -50) {
			Static71.anInt1970 = 2;
		}
		if (Static72.anInt1975 < -60) {
			Static22.anInt929 = 2;
		}
		Static40.anInt1611++;
		if (Static7.anInt1194 > 50) {
			Static71.anInt1970 = -2;
		}
		if (Static72.anInt1975 > 60) {
			Static22.anInt929 = -2;
		}
		if (Static93.anInt2361 < -40) {
			Static8.anInt507 = 1;
		}
		if (Static93.anInt2361 > 40) {
			Static8.anInt507 = -1;
		}
		if (Static85.anInt2254 < -20) {
			Static17.anInt777 = 1;
		}
		if (Static85.anInt2254 > 10) {
			Static17.anInt777 = -1;
		}
		if (Static40.anInt1611 > 50) {
			Static59.aClass2_Sub3_Sub1_2.method841(13);
		}
		try {
			if (Static50.aClass65_1 != null && Static59.aClass2_Sub3_Sub1_2.anInt1168 > 0) {
				Static50.aClass65_1.method1759(Static59.aClass2_Sub3_Sub1_2.anInt1168, Static59.aClass2_Sub3_Sub1_2.aByteArray7);
				Static40.anInt1611 = 0;
				Static59.aClass2_Sub3_Sub1_2.anInt1168 = 0;
			}
		} catch (@Pc(1380) IOException local1380) {
			Static98.method1659();
		}
	}

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "(I)V")
	public static void method1792() {
		aClass1_2876 = null;
		anIntArray346 = null;
		aClass1_2880 = null;
		aClass1_2875 = null;
		aClass1_2873 = null;
		aClass1_2872 = null;
		aClass1_2879 = null;
		aClass1_2877 = null;
		anIntArray347 = null;
		aClass1_2874 = null;
		aClass3_1 = null;
		aClass1_2878 = null;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)Lclient!fc;")
	public static Class2_Sub1_Sub5 method1793(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub5 local10 = (Class2_Sub1_Sub5) Static60.aClass11_14.method431((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static67.aClass8_28.method1684(arg0, 4);
		local10 = new Class2_Sub1_Sub5();
		if (local20 != null) {
			local10.method753(arg0, new Class2_Sub3(local20));
		}
		local10.method755();
		Static60.aClass11_14.method430((long) arg0, local10);
		return local10;
	}
}
