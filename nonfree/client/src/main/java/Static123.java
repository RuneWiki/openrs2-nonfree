import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!va", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "Lclient!af;")
	public static Class5 aClass5_1388 = Static45.method1937("Passwort: ");

	@OriginalMember(owner = "client!va", name = "c", descriptor = "Ljava/lang/Object;")
	public static Object anObject3 = new Object();

	@OriginalMember(owner = "client!va", name = "i", descriptor = "I")
	public static int anInt3131 = 0;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "I")
	public static int anInt3132 = 0;

	@OriginalMember(owner = "client!va", name = "u", descriptor = "I")
	public static int anInt3139 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)V")
	public static void method2177(@OriginalArg(0) int arg0) {
		if (Static8.method244(arg0)) {
			Static37.method685(Static49.aClass1_Sub17ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!kb;Lclient!kb;ZILclient!ad;)V")
	public static void method2178(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class1_Sub3_Sub1_Sub1 arg3) {
		Static113.aClass41_29 = arg1;
		Static108.aClass41_25 = arg0;
		Static28.aBoolean25 = arg2;
		Static113.aClass41_29.method1700(10);
		Static96.aClass1_Sub3_Sub1_Sub1_3 = arg3;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	public static void method2181() {
		aByteArrayArrayArray7 = null;
		anObject3 = null;
		aClass5_1388 = null;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(B)V")
	public static void method2183() {
		if (Static13.anInt348 > 0) {
			Static13.anInt348--;
		}
		if (Static116.anInt2902 > 1) {
			Static116.anInt2902--;
		}
		if (Static43.aBoolean34) {
			Static43.aBoolean34 = false;
			Static3.method64();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static104.method1755(); local27++) {
		}
		if (Static95.anInt2352 != 30) {
			return;
		}
		Static59.method1059(Static44.aClass1_Sub20_Sub1_1);
		@Pc(51) Object local51 = Static40.aClass79_1.anObject4;
		@Pc(79) int local79;
		@Pc(76) int local76;
		@Pc(85) int local85;
		@Pc(102) int local102;
		synchronized (Static40.aClass79_1.anObject4) {
			if (!Static128.aBoolean124) {
				Static40.aClass79_1.anInt3253 = 0;
			} else if (Static12.anInt3243 != 0 || Static40.aClass79_1.anInt3253 >= 40) {
				Static44.aClass1_Sub20_Sub1_1.method2108(159);
				Static44.aClass1_Sub20_Sub1_1.method2081(0);
				local76 = 0;
				local79 = Static44.aClass1_Sub20_Sub1_1.anInt2951;
				@Pc(107) int local107;
				for (local85 = 0; Static40.aClass79_1.anInt3253 > local85 && Static44.aClass1_Sub20_Sub1_1.anInt2951 - local79 < 240; local85++) {
					local76++;
					local102 = Static40.aClass79_1.anIntArray464[local85];
					local107 = Static40.aClass79_1.anIntArray463[local85];
					if (local107 < 0) {
						local107 = 0;
					} else if (local107 > 502) {
						local107 = 502;
					}
					if (local102 < 0) {
						local102 = 0;
					} else if (local102 > 764) {
						local102 = 764;
					}
					@Pc(143) int local143 = local107 * 765 + local102;
					if (Static40.aClass79_1.anIntArray463[local85] == -1 && Static40.aClass79_1.anIntArray464[local85] == -1) {
						local107 = -1;
						local143 = 524287;
						local102 = -1;
					}
					if (Static111.anInt2729 != local102 || Static45.anInt2756 != local107) {
						@Pc(188) int local188 = local102 - Static111.anInt2729;
						@Pc(192) int local192 = local107 - Static45.anInt2756;
						Static111.anInt2729 = local102;
						Static45.anInt2756 = local107;
						if (Static17.anInt505 < 8 && local188 >= -32 && local188 <= 31 && local192 >= -32 && local192 <= 31) {
							local188 += 32;
							local192 += 32;
							Static44.aClass1_Sub20_Sub1_1.method2055((local188 << 6) + ((Static17.anInt505 << 12) + local192));
							Static17.anInt505 = 0;
						} else if (Static17.anInt505 < 8) {
							Static44.aClass1_Sub20_Sub1_1.method2104(local143 + (Static17.anInt505 << 19) + 8388608);
							Static17.anInt505 = 0;
						} else {
							Static44.aClass1_Sub20_Sub1_1.method2092((Static17.anInt505 << 19) + (local143 - 1073741824));
							Static17.anInt505 = 0;
						}
					} else if (Static17.anInt505 < 2047) {
						Static17.anInt505++;
					}
				}
				Static44.aClass1_Sub20_Sub1_1.method2098(Static44.aClass1_Sub20_Sub1_1.anInt2951 - local79);
				if (Static40.aClass79_1.anInt3253 <= local76) {
					Static40.aClass79_1.anInt3253 = 0;
				} else {
					Static40.aClass79_1.anInt3253 -= local76;
					for (local107 = 0; local107 < Static40.aClass79_1.anInt3253; local107++) {
						Static40.aClass79_1.anIntArray464[local107] = Static40.aClass79_1.anIntArray464[local107 + local76];
						Static40.aClass79_1.anIntArray463[local107] = Static40.aClass79_1.anIntArray463[local107 + local76];
					}
				}
			}
		}
		if (Static12.anInt3243 != 0) {
			local79 = Static97.anInt2390;
			if (local79 < 0) {
				local79 = 0;
			} else if (local79 > 502) {
				local79 = 502;
			}
			@Pc(366) long local366 = (Static1.aLong5 - Static86.aLong74) / 50L;
			if (local366 > 4095L) {
				local366 = 4095L;
			}
			Static86.aLong74 = Static1.aLong5;
			local76 = Static9.anInt280;
			@Pc(380) byte local380 = 0;
			if (local76 < 0) {
				local76 = 0;
			} else if (local76 > 764) {
				local76 = 764;
			}
			local85 = local79 * 765 + local76;
			if (Static12.anInt3243 == 2) {
				local380 = 1;
			}
			local102 = (int) local366;
			Static44.aClass1_Sub20_Sub1_1.method2108(38);
			Static44.aClass1_Sub20_Sub1_1.method2059((local102 << 20) + (local380 << 19) + local85);
		}
		if (Static102.aBooleanArray24[96] || Static102.aBooleanArray24[97] || Static102.aBooleanArray24[98] || Static102.aBooleanArray24[99]) {
			Static32.aBoolean30 = true;
		}
		if (Static122.anInt3121 > 0) {
			Static122.anInt3121--;
		}
		if (Static32.aBoolean30 && Static122.anInt3121 <= 0) {
			Static32.aBoolean30 = false;
			Static122.anInt3121 = 20;
			Static44.aClass1_Sub20_Sub1_1.method2108(70);
			Static44.aClass1_Sub20_Sub1_1.method2055(Static3.anInt58);
			Static44.aClass1_Sub20_Sub1_1.method2061(Static8.anInt263);
		}
		if (Static104.aBoolean101 && !Static97.aBoolean95) {
			Static97.aBoolean95 = true;
			Static44.aClass1_Sub20_Sub1_1.method2108(79);
			Static44.aClass1_Sub20_Sub1_1.method2081(1);
		}
		if (!Static104.aBoolean101 && Static97.aBoolean95) {
			Static97.aBoolean95 = false;
			Static44.aClass1_Sub20_Sub1_1.method2108(79);
			Static44.aClass1_Sub20_Sub1_1.method2081(0);
		}
		Static70.method1222();
		if (Static95.anInt2352 != 30) {
			return;
		}
		Static113.method1948();
		Static125.method2217();
		Static3.anInt64++;
		if (Static3.anInt64 > 750) {
			Static3.method64();
			return;
		}
		Static68.method1206();
		Static50.method892();
		Static43.method791();
		if (Static28.anInt860 != 0) {
			Static36.anInt950 += 20;
			if (Static36.anInt950 >= 400) {
				Static28.anInt860 = 0;
			}
		}
		Static95.anInt2359++;
		if (Static5.aClass1_Sub17_9 != null) {
			Static103.anInt2536++;
			if (Static103.anInt2536 >= 15) {
				Static119.method2161(Static5.aClass1_Sub17_9);
				Static5.aClass1_Sub17_9 = null;
			}
		}
		@Pc(650) Class1_Sub17 local650;
		if (Static45.aClass1_Sub17_66 != null) {
			Static119.method2161(Static45.aClass1_Sub17_66);
			if (Static62.anInt2471 + 5 < Static98.anInt2407 || Static62.anInt2471 - 5 > Static98.anInt2407 || Static119.anInt3097 + 5 < Static97.anInt2395 || Static119.anInt3097 - 5 > Static97.anInt2395) {
				Static21.aBoolean21 = true;
			}
			Static25.anInt775++;
			if (Static85.anInt2157 == 0) {
				if (Static21.aBoolean21 && Static25.anInt775 >= 5) {
					if (Static45.aClass1_Sub17_66 == Static8.aClass1_Sub17_11 && Static41.anInt1057 != Static102.anInt2526) {
						@Pc(648) byte local648 = 0;
						local650 = Static45.aClass1_Sub17_66;
						if (anInt3132 == 1 && local650.anInt2291 == 206) {
							local648 = 1;
						}
						if (local650.anIntArray341[Static102.anInt2526] <= 0) {
							local648 = 0;
						}
						if (Static74.method1275(Static6.method221(local650))) {
							local79 = Static41.anInt1057;
							local76 = Static102.anInt2526;
							local650.anIntArray341[local76] = local650.anIntArray341[local79];
							local650.anIntArray340[local76] = local650.anIntArray340[local79];
							local650.anIntArray341[local79] = -1;
							local650.anIntArray340[local79] = 0;
						} else if (local648 == 1) {
							local79 = Static41.anInt1057;
							local76 = Static102.anInt2526;
							while (local76 != local79) {
								if (local76 < local79) {
									local650.method1579(local79, local79 - 1);
									local79--;
								} else if (local76 > local79) {
									local650.method1579(local79, local79 + 1);
									local79++;
								}
							}
						} else {
							local650.method1579(Static41.anInt1057, Static102.anInt2526);
						}
						Static44.aClass1_Sub20_Sub1_1.method2108(20);
						Static44.aClass1_Sub20_Sub1_1.method2092(Static45.aClass1_Sub17_66.anInt2248);
						Static44.aClass1_Sub20_Sub1_1.method2061(Static102.anInt2526);
						Static44.aClass1_Sub20_Sub1_1.method2095(Static41.anInt1057);
						Static44.aClass1_Sub20_Sub1_1.method2058(local648);
					}
				} else if ((Static76.anInt1795 == 1 || Static81.method1433(Static18.anInt3043 - 1)) && Static18.anInt3043 > 2) {
					Static81.method1432();
				} else if (Static18.anInt3043 > 0) {
					Static86.method1528(Static18.anInt3043 - 1);
				}
				Static45.aClass1_Sub17_66 = null;
				Static12.anInt3243 = 0;
				Static103.anInt2536 = 10;
			}
		}
		Static40.anInt1050 = 0;
		Static76.aBoolean62 = false;
		Static93.aBoolean90 = false;
		local650 = Static68.aClass1_Sub17_43;
		Static3.aClass1_Sub17_5 = null;
		Static68.aClass1_Sub17_43 = null;
		@Pc(833) Class1_Sub17 local833 = Static117.aClass1_Sub17_74;
		Static117.aClass1_Sub17_74 = null;
		while (Static101.method1734() && Static40.anInt1050 < 128) {
			Static2.anIntArray13[Static40.anInt1050] = Static25.anInt776;
			Static47.anIntArray194[Static40.anInt1050] = Static1.anInt46;
			Static40.anInt1050++;
		}
		Static117.method2221(0, 503, 765, Static8.anInt266, 0, 0, 0);
		Static23.aBoolean23 = false;
		Static60.anInt1441++;
		while (true) {
			@Pc(877) Class1_Sub6 local877 = (Class1_Sub6) Static122.aClass53_16.method1452();
			if (local877 == null) {
				while (true) {
					local877 = (Class1_Sub6) Static11.aClass53_5.method1452();
					if (local877 == null) {
						while (true) {
							local877 = (Class1_Sub6) Static8.aClass53_3.method1452();
							if (local877 == null) {
								if (Static72.aClass1_Sub17_45 != null) {
									Static116.method2043();
								}
								if (Static107.anInt2641 != -1) {
									local79 = Static107.anInt2641;
									local76 = Static107.anInt2649;
									@Pc(940) boolean local940 = Static54.method946(local79, local76, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 0, 0, true, 0, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
									if (local940) {
										Static28.anInt860 = 1;
										Static120.anInt1841 = Static97.anInt2390;
										Static45.anInt2753 = Static9.anInt280;
										Static36.anInt950 = 0;
									}
									Static107.anInt2641 = -1;
								}
								Static101.method1725();
								if (local650 != Static68.aClass1_Sub17_43) {
									if (local650 != null) {
										Static119.method2161(local650);
									}
									if (Static68.aClass1_Sub17_43 != null) {
										Static119.method2161(Static68.aClass1_Sub17_43);
									}
								}
								if (local833 != Static117.aClass1_Sub17_74 && Static8.anInt264 == Static129.anInt3260) {
									if (local833 != null) {
										Static119.method2161(local833);
									}
									if (Static117.aClass1_Sub17_74 != null) {
										Static119.method2161(Static117.aClass1_Sub17_74);
									}
								}
								if (Static117.aClass1_Sub17_74 == null) {
									if (Static8.anInt264 > 0) {
										Static8.anInt264--;
									}
								} else if (Static129.anInt3260 > Static8.anInt264) {
									Static8.anInt264++;
									if (Static129.anInt3260 == Static8.anInt264) {
										Static119.method2161(Static117.aClass1_Sub17_74);
									}
								}
								Static70.method1224();
								if (Static104.aBoolean102) {
									Static74.method1277();
								}
								for (local79 = 0; local79 < 5; local79++) {
									@Pc(1020) int local1020 = Static48.anIntArray195[local79]++;
								}
								local76 = Static127.method2247();
								local85 = Static118.method2117();
								if (local76 > 4500 && local85 > 4500) {
									Static13.anInt348 = 250;
									Static69.method1210(4000);
									Static44.aClass1_Sub20_Sub1_1.method2108(218);
								}
								Static95.anInt2351++;
								Static7.anInt210++;
								Static126.anInt3237++;
								if (Static126.anInt3237 > 500) {
									Static126.anInt3237 = 0;
									local102 = (int) (Math.random() * 8.0D);
									if ((local102 & 0x4) == 4) {
										Static22.anInt716 += Static48.anInt1137;
									}
									if ((local102 & 0x2) == 2) {
										Static69.anInt1603 += Static105.anInt2953;
									}
									if ((local102 & 0x1) == 1) {
										Static78.anInt1878 += Static42.anInt1062;
									}
								}
								if (Static78.anInt1878 < -50) {
									Static42.anInt1062 = 2;
								}
								if (Static69.anInt1603 < -55) {
									Static105.anInt2953 = 2;
								}
								if (Static22.anInt716 < -40) {
									Static48.anInt1137 = 1;
								}
								if (Static95.anInt2351 > 500) {
									local102 = (int) (Math.random() * 8.0D);
									if ((local102 & 0x2) == 2) {
										Static98.anInt2404 += Static47.anInt1128;
									}
									Static95.anInt2351 = 0;
									if ((local102 & 0x1) == 1) {
										Static21.anInt748 += Static44.anInt1080;
									}
								}
								if (Static69.anInt1603 > 55) {
									Static105.anInt2953 = -2;
								}
								if (Static22.anInt716 > 40) {
									Static48.anInt1137 = -1;
								}
								if (Static98.anInt2404 < -20) {
									Static47.anInt1128 = 1;
								}
								if (Static21.anInt748 < -60) {
									Static44.anInt1080 = 2;
								}
								if (Static21.anInt748 > 60) {
									Static44.anInt1080 = -2;
								}
								if (Static78.anInt1878 > 50) {
									Static42.anInt1062 = -2;
								}
								if (Static98.anInt2404 > 10) {
									Static47.anInt1128 = -1;
								}
								if (Static7.anInt210 > 50) {
									Static44.aClass1_Sub20_Sub1_1.method2108(118);
								}
								try {
									if (Static11.aClass78_2 == null || Static44.aClass1_Sub20_Sub1_1.anInt2951 <= 0) {
										return;
									} else {
										Static11.aClass78_2.method2182(Static44.aClass1_Sub20_Sub1_1.anInt2951, Static44.aClass1_Sub20_Sub1_1.aByteArray36);
										Static7.anInt210 = 0;
										Static44.aClass1_Sub20_Sub1_1.anInt2951 = 0;
										return;
									}
								} catch (@Pc(1240) IOException local1240) {
									Static3.method64();
									return;
								}
							}
							Static71.method1228(local877);
						}
					}
					Static71.method1228(local877);
				}
			}
			Static71.method1228(local877);
		}
	}
}
