import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!ln", name = "v", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_85 = new Class67("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[100];

	@OriginalMember(owner = "client!ln", name = "y", descriptor = "Lclient!qm;")
	public static Class3_Sub40 aClass3_Sub40_1 = null;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)Z")
	public static boolean method4812() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(16) Enumeration local16 = Static514.aHashtable7.keys();
		while (local16.hasMoreElements()) {
			@Pc(21) Object local21 = local16.nextElement();
			local9.put(local21, Static514.aHashtable7.get(local21));
		}
		try {
			@Pc(34) Class local34 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(37) Class local37 = Class.forName("java.lang.ClassLoader");
			@Pc(41) Field local41 = local37.getDeclaredField("nativeLibraries");
			@Pc(51) Method local51 = local34.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local51.invoke(local41, Boolean.TRUE);
			try {
				local16 = Static514.aHashtable7.keys();
				while (local16.hasMoreElements()) {
					@Pc(70) String local70 = (String) local16.nextElement();
					try {
						@Pc(75) File local75 = (File) Static471.aHashtable6.get(local70);
						@Pc(80) Class local80 = (Class) Static514.aHashtable7.get(local70);
						@Pc(86) Vector local86 = (Vector) local41.get(local80.getClassLoader());
						for (@Pc(88) int local88 = 0; local86.size() > local88; local88++) {
							try {
								@Pc(94) Object local94 = local86.elementAt(local88);
								@Pc(99) Field local99 = local94.getClass().getDeclaredField("name");
								local51.invoke(local99, Boolean.TRUE);
								try {
									@Pc(114) String local114 = (String) local99.get(local94);
									if (local114 != null && local114.equalsIgnoreCase(local75.getCanonicalPath())) {
										@Pc(126) Field local126 = local94.getClass().getDeclaredField("handle");
										@Pc(133) Method local133 = local94.getClass().getDeclaredMethod("finalize");
										local51.invoke(local126, Boolean.TRUE);
										local51.invoke(local133, Boolean.TRUE);
										try {
											local133.invoke(local94);
											local126.set(local94, Integer.valueOf(0));
											local9.remove(local70);
										} catch (@Pc(172) Throwable local172) {
										}
										local51.invoke(local133, Boolean.FALSE);
										local51.invoke(local126, Boolean.FALSE);
									}
								} catch (@Pc(194) Throwable local194) {
								}
								local51.invoke(local99, Boolean.FALSE);
							} catch (@Pc(206) Throwable local206) {
							}
						}
					} catch (@Pc(214) Throwable local214) {
					}
				}
			} catch (@Pc(220) Throwable local220) {
			}
			local51.invoke(local41, Boolean.FALSE);
		} catch (@Pc(232) Throwable local232) {
		}
		Static514.aHashtable7 = local9;
		return Static514.aHashtable7.isEmpty();
	}

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(I)V")
	public static void method4814() {
		if (Static270.anInt5584 > 1) {
			Static483.anInt8679 = Static446.anInt8177;
			Static270.anInt5584--;
		}
		if (Static463.aBoolean590) {
			Static463.aBoolean590 = false;
			Static492.method7175();
			return;
		}
		if (!Static228.aBoolean342) {
			Static238.method4168();
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static404.method6139(); local29++) {
		}
		if (Static512.anInt8932 != 9) {
			return;
		}
		Static192.method3686(Static515.aClass3_Sub27_Sub1_2, Static386.aClass158_94.method4210());
		if (Static361.aClass3_Sub40_2 == null) {
			if (Static79.aLong58 <= Static12.method647()) {
				Static361.aClass3_Sub40_2 = Static370.aClass251_1.method6163(Static81.aClass319_5.aString85);
			}
		} else if (Static361.aClass3_Sub40_2.anInt7397 != -1) {
			Static278.method4791(Static360.aClass158_87);
			Static515.aClass3_Sub27_Sub1_2.method7600(Static361.aClass3_Sub40_2.anInt7397, 30364);
			Static361.aClass3_Sub40_2 = null;
			Static79.aLong58 = Static12.method647() + 30000L;
		}
		@Pc(95) Class3_Sub19 local95 = (Class3_Sub19) Static71.aClass71_16.method2089();
		@Pc(129) int local129;
		@Pc(146) int local146;
		@Pc(188) int local188;
		@Pc(195) int local195;
		@Pc(206) int local206;
		if (local95 != null || Static12.method647() - 2000L > Static330.aLong187) {
			@Pc(106) boolean local106 = false;
			@Pc(109) int local109 = Static515.aClass3_Sub27_Sub1_2.anInt9191;
			for (@Pc(114) Class3_Sub19 local114 = (Class3_Sub19) Static188.aClass71_36.method2089(); local114 != null && Static515.aClass3_Sub27_Sub1_2.anInt9191 - local109 < 240; local114 = (Class3_Sub19) Static188.aClass71_36.method2086()) {
				local114.method7820();
				local129 = local114.method4957();
				if (local129 < -1) {
					local129 = -1;
				} else if (local129 > 65534) {
					local129 = 65534;
				}
				local146 = local114.method4956();
				if (local146 < -1) {
					local146 = -1;
				} else if (local146 > 65534) {
					local146 = 65534;
				}
				if (Static241.anInt9034 != local146 || Static360.anInt6740 != local129) {
					if (!local106) {
						Static278.method4791(Static326.aClass158_81);
						Static515.aClass3_Sub27_Sub1_2.method7576(0);
						local106 = true;
						local109 = Static515.aClass3_Sub27_Sub1_2.anInt9191;
					}
					local188 = local146 - Static241.anInt9034;
					Static241.anInt9034 = local146;
					local195 = local129 - Static360.anInt6740;
					Static360.anInt6740 = local129;
					local206 = (int) ((local114.method4958() - Static330.aLong187) / 20L);
					if (local206 < 8 && local188 >= -32 && local188 <= 31 && local195 >= -32 && local195 <= 31) {
						local188 += 32;
						local195 += 32;
						Static515.aClass3_Sub27_Sub1_2.method7600((local206 << 12) + ((local188 << 6) + local195), 30364);
					} else if (local206 < 32 && local188 >= -128 && local188 <= 127 && local195 >= -128 && local195 <= 127) {
						local188 += 128;
						Static515.aClass3_Sub27_Sub1_2.method7576(local206 + 128);
						local195 += 128;
						Static515.aClass3_Sub27_Sub1_2.method7600((local188 << 8) + local195, 30364);
					} else if (local206 < 32) {
						Static515.aClass3_Sub27_Sub1_2.method7576(local206 + 192);
						if (local146 == 1 || local129 == -1) {
							Static515.aClass3_Sub27_Sub1_2.method7594(Integer.MIN_VALUE);
						} else {
							Static515.aClass3_Sub27_Sub1_2.method7594(local146 | local129 << 16);
						}
					} else {
						Static515.aClass3_Sub27_Sub1_2.method7600(local206 + 57344, 30364);
						if (local146 == 1 || local129 == -1) {
							Static515.aClass3_Sub27_Sub1_2.method7594(Integer.MIN_VALUE);
						} else {
							Static515.aClass3_Sub27_Sub1_2.method7594(local129 << 16 | local146);
						}
					}
					Static330.aLong187 = local114.method4958();
				}
			}
			if (local106) {
				Static515.aClass3_Sub27_Sub1_2.method7559(Static515.aClass3_Sub27_Sub1_2.anInt9191 - local109);
			}
		}
		@Pc(389) int local389;
		if (local95 != null) {
			@Pc(373) long local373 = (local95.method4958() - Static62.aLong265) / 50L;
			Static62.aLong265 = local95.method4958();
			if (local373 > 32767L) {
				local373 = 32767L;
			}
			local389 = local95.method4957();
			if (local389 < 0) {
				local389 = 0;
			} else if (local389 > 65535) {
				local389 = 65535;
			}
			local129 = local95.method4956();
			if (local129 < 0) {
				local129 = 0;
			} else if (local129 > 65535) {
				local129 = 65535;
			}
			@Pc(417) byte local417 = 0;
			if (local95.method4962() == 2) {
				local417 = 1;
			}
			Static278.method4791(Static157.aClass158_42);
			local188 = (int) local373;
			Static515.aClass3_Sub27_Sub1_2.method7594(local129 | local389 << 16);
			Static515.aClass3_Sub27_Sub1_2.method7600(local417 << 15 | local188, 30364);
		}
		@Pc(467) int local467;
		if (Static499.anInt3719 > 0) {
			Static278.method4791(Static115.aClass158_29);
			Static515.aClass3_Sub27_Sub1_2.method7576(Static499.anInt3719 * 3);
			for (local467 = 0; local467 < Static499.anInt3719; local467++) {
				@Pc(473) Interface2 local473 = Static532.anInterface2Array2[local467];
				@Pc(481) long local481 = (local473.method4016() - Static436.aLong243) / 50L;
				if (local481 > 65535L) {
					local481 = 65535L;
				}
				Static436.aLong243 = local473.method4016();
				Static515.aClass3_Sub27_Sub1_2.method7576(local473.method4017());
				Static515.aClass3_Sub27_Sub1_2.method7600((int) local481, 30364);
			}
		}
		if (Static377.anInt7067 > 0) {
			Static377.anInt7067--;
		}
		if (Static256.aBoolean354 && Static377.anInt7067 <= 0) {
			Static377.anInt7067 = 20;
			Static256.aBoolean354 = false;
			Static278.method4791(Static442.aClass158_102);
			Static515.aClass3_Sub27_Sub1_2.method7606((int) Static487.aFloat258 >> 3);
			Static515.aClass3_Sub27_Sub1_2.method7600((int) Static343.aFloat198 >> 3, 30364);
		}
		if (Static530.aBoolean675 && !Static323.aBoolean394) {
			Static323.aBoolean394 = true;
			Static278.method4791(Static251.aClass158_65);
			Static515.aClass3_Sub27_Sub1_2.method7576(1);
		}
		if (!Static530.aBoolean675 && Static323.aBoolean394) {
			Static323.aBoolean394 = false;
			Static278.method4791(Static251.aClass158_65);
			Static515.aClass3_Sub27_Sub1_2.method7576(0);
		}
		if (!Static118.aBoolean189) {
			Static278.method4791(Static187.aClass158_51);
			Static515.aClass3_Sub27_Sub1_2.method7576(0);
			local467 = Static515.aClass3_Sub27_Sub1_2.anInt9191;
			@Pc(612) Class3_Sub27 local612 = new Class3_Sub27(Static97.method1905());
			Static7.aClass3_Sub15_Sub1_1.method6947(local612);
			Static515.aClass3_Sub27_Sub1_2.method7569(local612.anInt9191, local612.aByteArray114);
			Static515.aClass3_Sub27_Sub1_2.method7559(Static515.aClass3_Sub27_Sub1_2.anInt9191 - local467);
			Static118.aBoolean189 = true;
		}
		if (Static279.aClass290ArrayArrayArray7 != null) {
			if (Static305.anInt5998 == 2) {
				Static437.method6620();
			} else if (Static305.anInt5998 == 3) {
				Static531.method7629();
			}
		}
		if (Static405.aBoolean520) {
			Static405.aBoolean520 = false;
		} else {
			Static479.aFloat252 /= 2.0F;
		}
		if (Static30.aBoolean194) {
			Static30.aBoolean194 = false;
		} else {
			Static481.aFloat254 /= 2.0F;
		}
		Static400.method6097();
		if (Static512.anInt8932 != 9) {
			return;
		}
		Static135.method2316();
		Static69.method1405();
		Static192.method3684();
		Static522.method7501();
		Static335.anInt3040++;
		if (Static335.anInt3040 > 750) {
			Static492.method7175();
			return;
		}
		Static310.method5036();
		Static238.method4167();
		Static43.method957();
		for (local467 = Static127.aClass215_1.method5537(true); local467 != -1; local467 = Static127.aClass215_1.method5537(false)) {
			Static514.method7352(local467);
			Static216.anIntArray224[Static345.anInt6584++ & 0x1F] = local467;
		}
		@Pc(778) Class245 local778;
		for (@Pc(734) Class3_Sub10_Sub16 local734 = Static120.method2198(); local734 != null; local734 = Static120.method2198()) {
			local389 = local734.method6217();
			local129 = local734.method6215();
			if (local389 == 1) {
				Static416.anIntArray153[local129] = local734.anInt7557;
				Static421.aBoolean556 |= Static4.aBooleanArray44[local129];
				Static137.anIntArray274[Static326.anInt6220++ & 0x1F] = local129;
			} else if (local389 == 2) {
				Static122.aStringArray17[local129] = local734.aString61;
				Static178.anIntArray393[Static90.anInt1953++ & 0x1F] = local129;
			} else if (local389 == 3) {
				local778 = Static46.method1005(local129);
				if (!local734.aString61.equals(local778.aString54)) {
					local778.aString54 = local734.aString61;
					Static31.method809(local778);
				}
			} else if (local389 == 4) {
				local778 = Static46.method1005(local129);
				local188 = local734.anInt7557;
				local195 = local734.anInt7561;
				local206 = local734.anInt7556;
				if (local778.anInt7254 != local188 || local195 != local778.anInt7244 || local778.anInt7299 != local206) {
					local778.anInt7244 = local195;
					local778.anInt7299 = local206;
					local778.anInt7254 = local188;
					Static31.method809(local778);
				}
			} else if (local389 == 5) {
				local778 = Static46.method1005(local129);
				if (local778.anInt7245 != local734.anInt7557 || local734.anInt7557 == -1) {
					local778.anInt7245 = local734.anInt7557;
					local778.anInt7233 = 0;
					local778.anInt7250 = 1;
					local778.anInt7291 = 0;
					Static31.method809(local778);
				}
			} else if (local389 == 6) {
				local146 = local734.anInt7557;
				local188 = local146 >> 10 & 0x1F;
				local195 = local146 >> 5 & 0x1F;
				local206 = local146 & 0x1F;
				@Pc(1148) int local1148 = (local195 << 11) + (local188 << 19) + (local206 << 3);
				@Pc(1152) Class245 local1152 = Static46.method1005(local129);
				if (local1148 != local1152.anInt7281) {
					local1152.anInt7281 = local1148;
					Static31.method809(local1152);
				}
			} else if (local389 == 7) {
				local778 = Static46.method1005(local129);
				@Pc(1101) boolean local1101 = local734.anInt7557 == 1;
				if (local1101 != local778.aBoolean502) {
					local778.aBoolean502 = local1101;
					Static31.method809(local778);
				}
			} else if (local389 == 8) {
				local778 = Static46.method1005(local129);
				if (local734.anInt7557 != local778.anInt7282 || local778.anInt7258 != local734.anInt7561 || local734.anInt7556 != local778.anInt7247) {
					local778.anInt7258 = local734.anInt7561;
					local778.anInt7247 = local734.anInt7556;
					local778.anInt7282 = local734.anInt7557;
					if (local778.anInt7271 != -1) {
						if (local778.anInt7307 > 0) {
							local778.anInt7247 = local778.anInt7247 * 32 / local778.anInt7307;
						} else if (local778.anInt7262 > 0) {
							local778.anInt7247 = local778.anInt7247 * 32 / local778.anInt7262;
						}
					}
					Static31.method809(local778);
				}
			} else if (local389 == 9) {
				local778 = Static46.method1005(local129);
				if (local734.anInt7557 != local778.anInt7271 || local778.anInt7285 != local734.anInt7561) {
					local778.anInt7285 = local734.anInt7561;
					local778.anInt7271 = local734.anInt7557;
					Static31.method809(local778);
				}
			} else if (local389 == 10) {
				local778 = Static46.method1005(local129);
				if (local734.anInt7557 != local778.anInt7270 || local778.anInt7308 != local734.anInt7561 || local734.anInt7556 != local778.anInt7290) {
					local778.anInt7308 = local734.anInt7561;
					local778.anInt7270 = local734.anInt7557;
					local778.anInt7290 = local734.anInt7556;
					Static31.method809(local778);
				}
			} else if (local389 == 11) {
				local778 = Static46.method1005(local129);
				local778.aByte80 = 0;
				local778.aByte79 = 0;
				local778.anInt7260 = local778.anInt7257 = local734.anInt7557;
				local778.anInt7295 = local778.anInt7283 = local734.anInt7561;
				Static31.method809(local778);
			} else if (local389 == 12) {
				local778 = Static46.method1005(local129);
				local188 = local734.anInt7557;
				if (local778 != null && local778.anInt7223 == 0) {
					if (local188 > local778.anInt7243 - local778.anInt7229) {
						local188 = local778.anInt7243 - local778.anInt7229;
					}
					if (local188 < 0) {
						local188 = 0;
					}
					if (local778.anInt7309 != local188) {
						local778.anInt7309 = local188;
						Static31.method809(local778);
					}
				}
			} else if (local389 == 14) {
				local778 = Static46.method1005(local129);
				local778.anInt7311 = local734.anInt7557;
			} else if (local389 == 15) {
				Static407.anInt7473 = local734.anInt7557;
				Static303.anInt5982 = local734.anInt7561;
				Static392.aBoolean493 = true;
			} else if (local389 == 16) {
				local778 = Static46.method1005(local129);
				local778.anInt7265 = local734.anInt7557;
			}
		}
		Static276.anInt5695++;
		if (Static549.anInt9481 != 0) {
			Static104.anInt2329 += 20;
			if (Static104.anInt2329 >= 400) {
				Static549.anInt9481 = 0;
			}
		}
		if (Static267.aClass245_10 != null) {
			Static307.anInt4847++;
			if (Static307.anInt4847 >= 15) {
				Static31.method809(Static267.aClass245_10);
				Static267.aClass245_10 = null;
			}
		}
		Static143.aClass245_5 = null;
		Static489.aBoolean645 = false;
		Static303.aClass245_11 = null;
		Static509.aBoolean661 = false;
		Static402.method7156(-1, null, -1);
		Static324.method5200(null, -1, -1);
		if (!Static506.aBoolean659) {
			Static7.anInt488 = -1;
		}
		Static320.method5154();
		Static446.anInt8177++;
		if (Static526.aBoolean674) {
			Static278.method4791(Static504.aClass158_127);
			Static515.aClass3_Sub27_Sub1_2.method7594(Static97.anInt2020 << 14 | Static400.anInt7396 << 28 | Static22.anInt8149);
			Static526.aBoolean674 = false;
		}
		while (true) {
			@Pc(1359) Class3_Sub21 local1359;
			@Pc(1372) Class245 local1372;
			do {
				local1359 = (Class3_Sub21) Static233.aClass71_40.method2084();
				if (local1359 == null) {
					while (true) {
						do {
							local1359 = (Class3_Sub21) Static375.aClass71_56.method2084();
							if (local1359 == null) {
								while (true) {
									do {
										local1359 = (Class3_Sub21) Static471.aClass71_64.method2084();
										if (local1359 == null) {
											if (Static303.aClass245_11 == null) {
												Static523.anInt9115 = 0;
											}
											if (Static166.aClass245_12 != null) {
												Static296.method4948();
											}
											if (Static353.anInt6659 > 0 && Static364.aClass101_1.method2589(82) && Static364.aClass101_1.method2589(81) && Static118.anInt2530 != 0) {
												local129 = Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100 - Static118.anInt2530;
												if (local129 < 0) {
													local129 = 0;
												} else if (local129 > 3) {
													local129 = 3;
												}
												Static152.method2631(local129, Static223.anInt4827 + Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray733[0], Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray734[0] + Static150.anInt3027);
											}
											Static138.method2346();
											for (local129 = 0; local129 < 5; local129++) {
												@Pc(1556) int local1556 = Static267.anIntArray473[local129]++;
											}
											if (Static421.aBoolean556 && Static491.aLong282 < Static12.method647() - 60000L) {
												Static135.method2314();
											}
											for (@Pc(1585) Class4_Sub3_Sub2 local1585 = (Class4_Sub3_Sub2) Static200.aClass90_19.method2326(); local1585 != null; local1585 = (Class4_Sub3_Sub2) Static200.aClass90_19.method2325()) {
												if ((long) local1585.anInt6794 < Static12.method647() / 1000L - 5L) {
													if (local1585.aShort100 > 0) {
														Static536.method7668("", 0, local1585.aString48 + Static281.aClass67_86.method1934(Static193.anInt7803), "", 5, "");
													}
													if (local1585.aShort100 == 0) {
														Static536.method7668("", 0, local1585.aString48 + Static136.aClass67_39.method1934(Static193.anInt7803), "", 5, "");
													}
													local1585.method7407();
												}
											}
											Static220.anInt4790++;
											if (Static220.anInt4790 > 500) {
												Static220.anInt4790 = 0;
												local188 = (int) (Math.random() * 8.0D);
												if ((local188 & 0x1) == 1) {
													Static410.anInt7538 += Static57.anInt1219;
												}
												if ((local188 & 0x4) == 4) {
													Static148.anInt2973 += Static343.anInt6462;
												}
												if ((local188 & 0x2) == 2) {
													Static308.anInt6011 += Static343.anInt6460;
												}
											}
											if (Static410.anInt7538 < -50) {
												Static57.anInt1219 = 2;
											}
											if (Static410.anInt7538 > 50) {
												Static57.anInt1219 = -2;
											}
											if (Static308.anInt6011 < -55) {
												Static343.anInt6460 = 2;
											}
											if (Static308.anInt6011 > 55) {
												Static343.anInt6460 = -2;
											}
											if (Static148.anInt2973 < -40) {
												Static343.anInt6462 = 1;
											}
											Static363.anInt6805++;
											if (Static148.anInt2973 > 40) {
												Static343.anInt6462 = -1;
											}
											if (Static363.anInt6805 > 500) {
												Static363.anInt6805 = 0;
												local188 = (int) (Math.random() * 8.0D);
												if ((local188 & 0x1) == 1) {
													Static262.anInt5488 += Static181.anInt4186;
												}
												if ((local188 & 0x2) == 2) {
													Static509.anInt8869 += Static251.anInt5150;
												}
											}
											if (Static262.anInt5488 < -60) {
												Static181.anInt4186 = 2;
											}
											if (Static262.anInt5488 > 60) {
												Static181.anInt4186 = -2;
											}
											if (Static509.anInt8869 < -20) {
												Static251.anInt5150 = 1;
											}
											if (Static509.anInt8869 > 10) {
												Static251.anInt5150 = -1;
											}
											Static326.anInt6217++;
											if (Static326.anInt6217 > 50) {
												Static278.method4791(Static219.aClass158_60);
											}
											if (Static425.aBoolean558) {
												Static67.method1370();
												Static425.aBoolean558 = false;
											}
											try {
												if (Static467.aClass41_1 != null && Static515.aClass3_Sub27_Sub1_2.anInt9191 > 0) {
													Static287.anInt5847 += Static515.aClass3_Sub27_Sub1_2.anInt9191;
													Static467.aClass41_1.method1065(Static515.aClass3_Sub27_Sub1_2.anInt9191, Static515.aClass3_Sub27_Sub1_2.aByteArray114);
													Static326.anInt6217 = 0;
													Static515.aClass3_Sub27_Sub1_2.anInt9191 = 0;
													return;
												}
												return;
											} catch (@Pc(1846) IOException local1846) {
												Static492.method7175();
												return;
											}
										}
										local778 = local1359.aClass245_8;
										if (local778.anInt7264 < 0) {
											break;
										}
										local1372 = Static46.method1005(local778.anInt7238);
									} while (local1372 == null || local1372.aClass245Array2 == null || local1372.aClass245Array2.length <= local778.anInt7264 || local778 != local1372.aClass245Array2[local778.anInt7264]);
									Static60.method1227(local1359);
								}
							}
							local778 = local1359.aClass245_8;
							if (local778.anInt7264 < 0) {
								break;
							}
							local1372 = Static46.method1005(local778.anInt7238);
						} while (local1372 == null || local1372.aClass245Array2 == null || local1372.aClass245Array2.length <= local778.anInt7264 || local1372.aClass245Array2[local778.anInt7264] != local778);
						Static60.method1227(local1359);
					}
				}
				local778 = local1359.aClass245_8;
				if (local778.anInt7264 < 0) {
					break;
				}
				local1372 = Static46.method1005(local778.anInt7238);
			} while (local1372 == null || local1372.aClass245Array2 == null || local1372.aClass245Array2.length <= local778.anInt7264 || local778 != local1372.aClass245Array2[local778.anInt7264]);
			Static60.method1227(local1359);
		}
	}

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "(I)V")
	public static void method4815() {
		if (Static62.aClass43_7 != null) {
			Static62.aClass43_7.method7022();
		}
		if (Static351.aClass43_5 != null) {
			Static351.aClass43_5.method7022();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)I")
	public static int method4816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (arg1 + local12) / arg0 - local12;
	}
}
