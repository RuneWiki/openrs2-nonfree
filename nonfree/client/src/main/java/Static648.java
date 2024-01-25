import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static648 {

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "[Z")
	public static boolean[] aBooleanArray55;

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
	public static int anInt10269;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray9 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)Z")
	public static boolean method8988() throws IOException {
		if (Static559.aClass269_1 == null) {
			return false;
		}
		@Pc(75) int local75;
		if (Static175.aClass180_68 == null) {
			if (Static599.aBoolean739) {
				if (!Static559.aClass269_1.method6699(1)) {
					return false;
				}
				Static559.aClass269_1.method6702(1, Static210.aClass3_Sub25_Sub1_3.aByteArray106, 0);
				Static394.anInt6210 = 0;
				Static328.anInt5448++;
				Static599.aBoolean739 = false;
			}
			Static210.aClass3_Sub25_Sub1_3.anInt9765 = 0;
			if (Static210.aClass3_Sub25_Sub1_3.method3394()) {
				if (!Static559.aClass269_1.method6699(1)) {
					return false;
				}
				Static559.aClass269_1.method6702(1, Static210.aClass3_Sub25_Sub1_3.aByteArray106, 1);
				Static328.anInt5448++;
				Static394.anInt6210 = 0;
			}
			Static599.aBoolean739 = true;
			@Pc(69) Class180[] local69 = Static482.method7011();
			local75 = Static210.aClass3_Sub25_Sub1_3.method3396();
			if (local75 < 0 || local75 >= local69.length) {
				throw new IOException("invo:" + local75 + " ip:" + Static210.aClass3_Sub25_Sub1_3.anInt9765);
			}
			Static175.aClass180_68 = local69[local75];
			Static467.anInt7682 = Static175.aClass180_68.anInt4953;
		}
		if (Static467.anInt7682 == -1) {
			if (!Static559.aClass269_1.method6699(1)) {
				return false;
			}
			Static559.aClass269_1.method6702(1, Static210.aClass3_Sub25_Sub1_3.aByteArray106, 0);
			Static394.anInt6210 = 0;
			Static328.anInt5448++;
			Static467.anInt7682 = Static210.aClass3_Sub25_Sub1_3.aByteArray106[0] & 0xFF;
		}
		if (Static467.anInt7682 == -2) {
			if (!Static559.aClass269_1.method6699(2)) {
				return false;
			}
			Static559.aClass269_1.method6702(2, Static210.aClass3_Sub25_Sub1_3.aByteArray106, 0);
			Static210.aClass3_Sub25_Sub1_3.anInt9765 = 0;
			Static467.anInt7682 = Static210.aClass3_Sub25_Sub1_3.method8593();
			Static328.anInt5448 += 2;
			Static394.anInt6210 = 0;
		}
		if (Static467.anInt7682 > 0) {
			if (!Static559.aClass269_1.method6699(Static467.anInt7682)) {
				return false;
			}
			Static210.aClass3_Sub25_Sub1_3.anInt9765 = 0;
			Static559.aClass269_1.method6702(Static467.anInt7682, Static210.aClass3_Sub25_Sub1_3.aByteArray106, 0);
			Static328.anInt5448 += Static467.anInt7682;
			Static394.anInt6210 = 0;
		}
		Static254.aClass180_101 = Static345.aClass180_125;
		Static345.aClass180_125 = Static641.aClass180_205;
		Static641.aClass180_205 = Static175.aClass180_68;
		if (Static175.aClass180_68 == Static552.aClass180_180) {
			Static109.anInt2262 = Static210.aClass3_Sub25_Sub1_3.method8599() << 3;
			Static373.anInt5978 = Static210.aClass3_Sub25_Sub1_3.method8643() << 3;
			Static659.anInt10542 = Static210.aClass3_Sub25_Sub1_3.method8615();
			Static175.aClass180_68 = null;
			return true;
		}
		@Pc(236) int local236;
		if (Static553.aClass180_181 == Static175.aClass180_68) {
			local236 = Static210.aClass3_Sub25_Sub1_3.method8644();
			local75 = Static210.aClass3_Sub25_Sub1_3.method8610();
			Static502.method3752();
			Static311.method4739(local75, local236);
			Static175.aClass180_68 = null;
			return true;
		}
		@Pc(265) boolean local265;
		if (Static175.aClass180_68 == Static111.aClass180_39) {
			Static621.anInt9951 = Static629.anInt10041;
			local265 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
			@Pc(270) Class175 local270 = new Class175(Static210.aClass3_Sub25_Sub1_3);
			@Pc(274) Class3_Sub30 local274;
			if (local265) {
				local274 = Static90.aClass3_Sub30_10;
			} else {
				local274 = Static195.aClass3_Sub30_4;
			}
			local270.method4537(local274);
			Static175.aClass180_68 = null;
			return true;
		} else if (Static217.aClass180_83 == Static175.aClass180_68) {
			Static413.method5904(Static507.aClass336_17);
			Static175.aClass180_68 = null;
			return true;
		} else {
			@Pc(318) String local318;
			@Pc(381) int local381;
			@Pc(332) String local332;
			@Pc(336) String local336;
			@Pc(322) String local322;
			if (Static175.aClass180_68 == Static142.aClass180_56) {
				local236 = Static210.aClass3_Sub25_Sub1_3.method8632();
				@Pc(314) boolean local314 = (local236 & 0x1) == 1;
				local318 = Static210.aClass3_Sub25_Sub1_3.method8613();
				local322 = Static210.aClass3_Sub25_Sub1_3.method8613();
				if (local322.equals("")) {
					local322 = local318;
				}
				local332 = Static210.aClass3_Sub25_Sub1_3.method8613();
				local336 = Static210.aClass3_Sub25_Sub1_3.method8613();
				if (local336.equals("")) {
					local336 = local332;
				}
				if (local314) {
					for (local381 = 0; local381 < Static94.anInt1782; local381++) {
						if (Static166.aStringArray8[local381].equals(local336)) {
							Static134.aStringArray7[local381] = local318;
							Static166.aStringArray8[local381] = local322;
							Static271.aStringArray31[local381] = local332;
							Static27.aStringArray1[local381] = local336;
							break;
						}
					}
				} else {
					Static134.aStringArray7[Static94.anInt1782] = local318;
					Static166.aStringArray8[Static94.anInt1782] = local322;
					Static271.aStringArray31[Static94.anInt1782] = local332;
					Static27.aStringArray1[Static94.anInt1782] = local336;
					Static119.aBooleanArray10[Static94.anInt1782] = (local236 & 0x2) == 2;
					Static94.anInt1782++;
				}
				Static175.aClass180_68 = null;
				Static68.anInt1315 = Static629.anInt10041;
				return true;
			} else if (Static175.aClass180_68 == Static132.aClass180_48) {
				Static216.anInt4122 = Static629.anInt10041;
				local265 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
				@Pc(442) Class230 local442 = new Class230(Static210.aClass3_Sub25_Sub1_3);
				@Pc(446) Class185 local446;
				if (local265) {
					local446 = Static333.aClass185_7;
				} else {
					local446 = Static84.aClass185_1;
				}
				local442.method5516(local446);
				Static175.aClass180_68 = null;
				return true;
			} else if (Static175.aClass180_68 == Static513.aClass180_173) {
				local236 = Static210.aClass3_Sub25_Sub1_3.method8636();
				local75 = Static210.aClass3_Sub25_Sub1_3.method8631();
				Static502.method3752();
				Static135.method5712(local236, local75);
				Static175.aClass180_68 = null;
				return true;
			} else {
				@Pc(505) int local505;
				@Pc(501) int local501;
				@Pc(497) int local497;
				if (Static56.aClass180_18 == Static175.aClass180_68) {
					local236 = Static210.aClass3_Sub25_Sub1_3.method8639();
					local75 = Static210.aClass3_Sub25_Sub1_3.method8632();
					local497 = Static210.aClass3_Sub25_Sub1_3.method8615();
					local501 = Static210.aClass3_Sub25_Sub1_3.method8609();
					local505 = Static210.aClass3_Sub25_Sub1_3.method8615();
					Static502.method3752();
					Class300.lb[local505] = true;
					Static564.anIntArray783[local505] = local75;
					Static460.anIntArray646[local505] = local501;
					Static567.anIntArray520[local505] = local497;
					Static142.anIntArray232[local505] = local236;
					Static175.aClass180_68 = null;
					return true;
				} else if (Static546.aClass180_179 == Static175.aClass180_68) {
					Static175.aClass180_68 = null;
					return false;
				} else if (Static175.aClass180_68 == Static148.aClass180_66) {
					local236 = Static210.aClass3_Sub25_Sub1_3.method8592();
					Static502.method3752();
					Static54.method1198(local236);
					Static175.aClass180_68 = null;
					return true;
				} else if (Static179.aClass180_72 == Static175.aClass180_68) {
					Static459.aClass314_3 = Static576.method8134(Static210.aClass3_Sub25_Sub1_3.method8632());
					Static175.aClass180_68 = null;
					return true;
				} else if (Static175.aClass180_68 == Static575.aClass180_186) {
					local236 = Static210.aClass3_Sub25_Sub1_3.method8639();
					local75 = Static210.aClass3_Sub25_Sub1_3.method8610();
					Static502.method3752();
					Static640.method8895(local75, local236);
					Static175.aClass180_68 = null;
					return true;
				} else {
					@Pc(611) String local611;
					@Pc(627) boolean local627;
					if (Static175.aClass180_68 == Static372.aClass180_140) {
						local265 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
						local611 = Static210.aClass3_Sub25_Sub1_3.method8613();
						local318 = local611;
						if (local265) {
							local318 = Static210.aClass3_Sub25_Sub1_3.method8613();
						}
						local501 = Static210.aClass3_Sub25_Sub1_3.method8632();
						local627 = false;
						if (local501 <= 1) {
							if (Static371.aBoolean430 && !Static345.aBoolean411 || Static236.aBoolean326) {
								local627 = true;
							} else if (local501 <= 1 && Static627.method8777(local318)) {
								local627 = true;
							}
						}
						if (!local627 && Static355.anInt5755 == 0) {
							local336 = Static342.method5133(Static537.method1797(Static210.aClass3_Sub25_Sub1_3));
							if (local501 == 2) {
								Static470.method6813(24, "<img=1>" + local611, local611, -1, "<img=1>" + local318, 0, local336, (String) null);
							} else if (local501 == 1) {
								Static470.method6813(24, "<img=0>" + local611, local611, -1, "<img=0>" + local318, 0, local336, (String) null);
							} else {
								Static470.method6813(24, local611, local611, -1, local318, 0, local336, (String) null);
							}
						}
						Static175.aClass180_68 = null;
						return true;
					} else if (Static631.aClass180_203 == Static175.aClass180_68) {
						local236 = Static210.aClass3_Sub25_Sub1_3.method8636();
						local75 = Static210.aClass3_Sub25_Sub1_3.method8593();
						Static502.method3752();
						Static461.method6711(local236, local75);
						Static175.aClass180_68 = null;
						return true;
					} else if (Static175.aClass180_68 == Static665.aClass180_215) {
						local236 = Static210.aClass3_Sub25_Sub1_3.method8644();
						local75 = Static210.aClass3_Sub25_Sub1_3.method8592();
						local497 = Static210.aClass3_Sub25_Sub1_3.method8609();
						local501 = Static210.aClass3_Sub25_Sub1_3.method8618();
						Static502.method3752();
						Static235.method3933(local497, local75, local501, local236);
						Static175.aClass180_68 = null;
						return true;
					} else if (Static374.aClass180_141 == Static175.aClass180_68) {
						Static127.anInt2596 = Static210.aClass3_Sub25_Sub1_3.method8646();
						Static101.anInt1853 = Static210.aClass3_Sub25_Sub1_3.method8609();
						Static175.aClass180_68 = null;
						return true;
					} else if (Static663.aClass180_214 == Static175.aClass180_68) {
						Static502.method3752();
						Static139.method2541();
						Static175.aClass180_68 = null;
						return true;
					} else if (Static175.aClass180_68 == Static115.aClass180_41) {
						local236 = Static210.aClass3_Sub25_Sub1_3.method8592() << 2;
						local75 = Static210.aClass3_Sub25_Sub1_3.method8609();
						local497 = Static210.aClass3_Sub25_Sub1_3.method8615();
						local501 = Static210.aClass3_Sub25_Sub1_3.method8646();
						local505 = Static210.aClass3_Sub25_Sub1_3.method8646();
						Static502.method3752();
						Static385.method5502(local497, local75, local505, local501, local236);
						Static175.aClass180_68 = null;
						return true;
					} else if (Static600.aClass180_189 == Static175.aClass180_68) {
						Static413.method5904(Static110.aClass336_6);
						Static175.aClass180_68 = null;
						return true;
					} else if (Static175.aClass180_68 == Static531.aClass180_176) {
						local236 = Static210.aClass3_Sub25_Sub1_3.method8636();
						local75 = Static210.aClass3_Sub25_Sub1_3.method8644();
						local497 = Static210.aClass3_Sub25_Sub1_3.method8618();
						Static502.method3752();
						Static132.method2498(local75, local497, local236, 5);
						Static175.aClass180_68 = null;
						return true;
					} else if (Static209.aClass180_81 == Static175.aClass180_68) {
						local265 = Static210.aClass3_Sub25_Sub1_3.method8646() == 1;
						Static502.method3752();
						Static320.aBoolean733 = local265;
						Static175.aClass180_68 = null;
						return true;
					} else if (Static189.aClass180_123 == Static175.aClass180_68) {
						Static413.method5904(Static427.aClass336_13);
						Static175.aClass180_68 = null;
						return true;
					} else if (Static175.aClass180_68 == Static39.aClass180_13) {
						local236 = Static210.aClass3_Sub25_Sub1_3.method8646();
						@Pc(946) int[] local946 = new int[4];
						for (local497 = 0; local497 < 4; local497++) {
							local946[local497] = Static210.aClass3_Sub25_Sub1_3.method8592();
						}
						local501 = Static210.aClass3_Sub25_Sub1_3.method8639();
						@Pc(973) Class3_Sub3 local973 = (Class3_Sub3) Static522.aClass83_34.method2368((long) local501);
						if (local973 != null) {
							Static232.method3918(local973.aClass28_Sub1_Sub1_Sub1_Sub2_1, local946, local236);
						}
						Static175.aClass180_68 = null;
						return true;
					} else if (Static175.aClass180_68 == Static619.aClass180_218) {
						local236 = Static210.aClass3_Sub25_Sub1_3.method8632();
						local75 = Static210.aClass3_Sub25_Sub1_3.method8615();
						local497 = Static210.aClass3_Sub25_Sub1_3.method8605();
						Static109.anIntArray169[local75] = local497;
						Static306.anIntArray457[local75] = local236;
						Static281.anIntArray440[local75] = 1;
						local501 = Static31.anIntArray45[local75] - 1;
						for (local505 = 0; local505 < local501; local505++) {
							if (local497 >= Class226.anIntArray529[local505]) {
								Static281.anIntArray440[local75] = local505 + 2;
							}
						}
						Static77.anIntArray126[Static276.anInt4813++ & 0x1F] = local75;
						Static175.aClass180_68 = null;
						return true;
					} else if (Static175.aClass180_68 == Static221.aClass180_88) {
						local236 = Static210.aClass3_Sub25_Sub1_3.method8593();
						Static502.method3752();
						Static674.method9364(local236);
						Static175.aClass180_68 = null;
						return true;
					} else if (Static175.aClass180_68 == Static79.aClass180_32) {
						local236 = Static210.aClass3_Sub25_Sub1_3.method8593();
						if (local236 == 65535) {
							local236 = -1;
						}
						local75 = Static210.aClass3_Sub25_Sub1_3.method8632();
						local497 = Static210.aClass3_Sub25_Sub1_3.method8593();
						local501 = Static210.aClass3_Sub25_Sub1_3.method8632();
						local505 = Static210.aClass3_Sub25_Sub1_3.method8593();
						Static291.method4560(local501, local236, local497, local75, local505);
						Static175.aClass180_68 = null;
						return true;
					} else if (Static238.aClass180_95 == Static175.aClass180_68) {
						Static413.method5904(Static176.aClass336_7);
						Static175.aClass180_68 = null;
						return true;
					} else if (Static175.aClass180_68 == Static382.aClass180_143) {
						Static413.method5904(Static85.aClass336_4);
						Static175.aClass180_68 = null;
						return true;
					} else if (Static175.aClass180_68 == Static390.aClass180_219) {
						local236 = Static210.aClass3_Sub25_Sub1_3.method8618();
						Static502.method3752();
						Static132.method2498(Static106.anInt2205, local236, 0, 5);
						Static175.aClass180_68 = null;
						return true;
					} else {
						@Pc(1284) int local1284;
						@Pc(1185) long local1185;
						@Pc(1195) long local1195;
						@Pc(1213) int local1213;
						@Pc(1180) long local1180;
						@Pc(1278) String local1278;
						if (Static175.aClass180_68 == Static379.aClass180_142) {
							local265 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
							local611 = Static210.aClass3_Sub25_Sub1_3.method8613();
							local1180 = (long) Static210.aClass3_Sub25_Sub1_3.method8593();
							local1185 = (long) Static210.aClass3_Sub25_Sub1_3.method8607();
							local381 = Static210.aClass3_Sub25_Sub1_3.method8632();
							local1195 = local1185 + (local1180 << 32);
							@Pc(1197) boolean local1197 = false;
							@Pc(1205) Class3_Sub30 local1205 = local265 ? Static90.aClass3_Sub30_10 : Static195.aClass3_Sub30_4;
							if (local1205 == null) {
								local1197 = true;
							} else {
								label2121: {
									for (local1213 = 0; local1213 < 100; local1213++) {
										if (Static367.aLongArray12[local1213] == local1195) {
											local1197 = true;
											break label2121;
										}
									}
									if (local381 <= 1) {
										if (Static371.aBoolean430 && !Static345.aBoolean411 || Static236.aBoolean326) {
											local1197 = true;
										} else if (Static627.method8777(local611)) {
											local1197 = true;
										}
									}
								}
							}
							if (!local1197 && Static355.anInt5755 == 0) {
								Static367.aLongArray12[Static505.anInt8188] = local1195;
								Static505.anInt8188 = (Static505.anInt8188 + 1) % 100;
								local1278 = Static342.method5133(Static537.method1797(Static210.aClass3_Sub25_Sub1_3));
								local1284 = local265 ? 41 : 44;
								if (local381 == 2 || local381 == 3) {
									Static470.method6813(local1284, "<img=1>" + local611, local611, -1, "<img=1>" + local611, 0, local1278, local1205.aString39);
								} else if (local381 == 1) {
									Static470.method6813(local1284, "<img=0>" + local611, local611, -1, "<img=0>" + local611, 0, local1278, local1205.aString39);
								} else {
									Static470.method6813(local1284, local611, local611, -1, local611, 0, local1278, local1205.aString39);
								}
							}
							Static175.aClass180_68 = null;
							return true;
						} else if (Static651.aClass180_210 == Static175.aClass180_68) {
							local236 = Static210.aClass3_Sub25_Sub1_3.method8646();
							local75 = Static210.aClass3_Sub25_Sub1_3.method8636();
							Static502.method3752();
							Static631.method8810(local75, local236);
							Static175.aClass180_68 = null;
							return true;
						} else if (Static175.aClass180_68 == Static369.aClass180_136) {
							Static413.method5904(Static179.aClass336_8);
							Static175.aClass180_68 = null;
							return true;
						} else if (Static91.aClass180_34 == Static175.aClass180_68) {
							local236 = Static210.aClass3_Sub25_Sub1_3.method8639();
							local75 = Static210.aClass3_Sub25_Sub1_3.method8615();
							Static502.method3752();
							Static476.method6890(true, local236, local75);
							Static175.aClass180_68 = null;
							return true;
						} else if (Static175.aClass180_68 == Static187.aClass180_77) {
							local236 = Static210.aClass3_Sub25_Sub1_3.method8593();
							local75 = Static210.aClass3_Sub25_Sub1_3.method8639();
							local497 = Static210.aClass3_Sub25_Sub1_3.method8636();
							Static502.method3752();
							Static131.method2491(local497, local236 + (local75 << 16));
							Static175.aClass180_68 = null;
							return true;
						} else if (Static175.aClass180_68 == Static147.aClass180_61) {
							local236 = Static210.aClass3_Sub25_Sub1_3.method8644();
							if (local236 == 65535) {
								local236 = -1;
							}
							local75 = Static210.aClass3_Sub25_Sub1_3.method8618();
							Static502.method3752();
							Static132.method2498(local236, local75, -1, 2);
							Static175.aClass180_68 = null;
							return true;
						} else if (Static246.aClass180_96 == Static175.aClass180_68) {
							for (local236 = 0; local236 < Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1.length; local236++) {
								if (Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local236] != null) {
									Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local236].lb = null;
									Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local236].anInt10773 = -1;
								}
							}
							for (local75 = 0; local75 < Static567.anInt5909; local75++) {
								Static84.aClass3_Sub3Array1[local75].aClass28_Sub1_Sub1_Sub1_Sub2_1.lb = null;
								Static84.aClass3_Sub3Array1[local75].aClass28_Sub1_Sub1_Sub1_Sub2_1.anInt10773 = -1;
							}
							Static175.aClass180_68 = null;
							return true;
						} else {
							@Pc(1598) int local1598;
							if (Static49.aClass180_15 == Static175.aClass180_68) {
								Static373.anInt5978 = Static210.aClass3_Sub25_Sub1_3.method8621() << 3;
								Static659.anInt10542 = Static210.aClass3_Sub25_Sub1_3.method8632();
								Static109.anInt2262 = Static210.aClass3_Sub25_Sub1_3.method8590() << 3;
								for (@Pc(1564) Class3_Sub16 local1564 = (Class3_Sub16) Static98.aClass83_6.method2375(); local1564 != null; local1564 = (Class3_Sub16) Static98.aClass83_6.method2370()) {
									local75 = (int) (local1564.aLong311 >> 28 & 0x3L);
									local497 = (int) (local1564.aLong311 & 0x3FFFL);
									local501 = local497 - Static287.anInt4910;
									local505 = (int) (local1564.aLong311 >> 14 & 0x3FFFL);
									local1598 = local505 - Static72.anInt1361;
									if (local75 == Static659.anInt10542 && local501 >= Static373.anInt5978 && Static373.anInt5978 + 8 > local501 && Static109.anInt2262 <= local1598 && local1598 < Static109.anInt2262 + 8) {
										local1564.method9380();
										if (local501 >= 0 && local1598 >= 0 && local501 < Static158.anInt927 && local1598 < Static515.anInt8292) {
											Static154.method2813(local1598, Static659.anInt10542, local501);
										}
									}
								}
								@Pc(1666) Class3_Sub23 local1666;
								for (local1666 = (Class3_Sub23) Static482.aClass338_192.method8177(); local1666 != null; local1666 = (Class3_Sub23) Static482.aClass338_192.method8168()) {
									if (local1666.anInt3189 >= Static373.anInt5978 && local1666.anInt3189 < Static373.anInt5978 + 8 && Static109.anInt2262 <= local1666.anInt3188 && local1666.anInt3188 < Static109.anInt2262 + 8 && Static659.anInt10542 == local1666.anInt3177) {
										local1666.aBoolean246 = true;
									}
								}
								for (local1666 = (Class3_Sub23) Static165.aClass338_227.method8177(); local1666 != null; local1666 = (Class3_Sub23) Static165.aClass338_227.method8168()) {
									if (Static373.anInt5978 <= local1666.anInt3189 && local1666.anInt3189 < Static373.anInt5978 + 8 && Static109.anInt2262 <= local1666.anInt3188 && Static109.anInt2262 + 8 > local1666.anInt3188 && local1666.anInt3177 == Static659.anInt10542) {
										local1666.aBoolean246 = true;
									}
								}
								Static175.aClass180_68 = null;
								return true;
							} else if (Static647.aClass180_209 == Static175.aClass180_68) {
								local236 = Static210.aClass3_Sub25_Sub1_3.method8592();
								local75 = Static210.aClass3_Sub25_Sub1_3.method8646();
								Static502.method3752();
								if (local75 == 2) {
									Static355.method5242();
								}
								Static110.anInt2265 = local236;
								Static411.method5865(local236);
								Static198.method9275(false);
								Static565.method8006(Static110.anInt2265);
								for (local497 = 0; local497 < 100; local497++) {
									Static200.aBooleanArray21[local497] = true;
								}
								Static175.aClass180_68 = null;
								return true;
							} else if (Static175.aClass180_68 == Static78.aClass180_75) {
								Static67.method1352(Static44.aBoolean75);
								Static175.aClass180_68 = null;
								return false;
							} else if (Static175.aClass180_68 == Static94.aClass180_35) {
								Static68.anInt1315 = Static629.anInt10041;
								Static11.anInt128 = 1;
								Static175.aClass180_68 = null;
								return true;
							} else if (Static431.aClass180_153 == Static175.aClass180_68) {
								Static184.anInt3729 = Static210.aClass3_Sub25_Sub1_3.method8632();
								Static175.aClass180_68 = null;
								return true;
							} else if (Static369.aClass180_137 == Static175.aClass180_68) {
								Static413.method5904(Static633.aClass336_19);
								Static175.aClass180_68 = null;
								return true;
							} else if (Static175.aClass180_68 == Static1.aClass180_146) {
								local236 = Static210.aClass3_Sub25_Sub1_3.method8604();
								local75 = Static210.aClass3_Sub25_Sub1_3.method8618();
								local497 = Static210.aClass3_Sub25_Sub1_3.method8632();
								local322 = "";
								local332 = local322;
								if ((local497 & 0x1) != 0) {
									local322 = Static210.aClass3_Sub25_Sub1_3.method8613();
									if ((local497 & 0x2) == 0) {
										local332 = local322;
									} else {
										local332 = Static210.aClass3_Sub25_Sub1_3.method8613();
									}
								}
								local336 = Static210.aClass3_Sub25_Sub1_3.method8613();
								if (local236 == 99) {
									Static238.method4024(local336);
								} else if (local332.equals("") || !Static627.method8777(local332)) {
									Static450.method6577(local236, local322, local332, local336, local75, local322);
								} else {
									Static175.aClass180_68 = null;
									return true;
								}
								Static175.aClass180_68 = null;
								return true;
							} else if (Static175.aClass180_68 == Static554.aClass180_182) {
								Static94.anInt1782 = Static210.aClass3_Sub25_Sub1_3.method8632();
								for (local236 = 0; local236 < Static94.anInt1782; local236++) {
									Static134.aStringArray7[local236] = Static210.aClass3_Sub25_Sub1_3.method8613();
									Static166.aStringArray8[local236] = Static210.aClass3_Sub25_Sub1_3.method8613();
									if (Static166.aStringArray8[local236].equals("")) {
										Static166.aStringArray8[local236] = Static134.aStringArray7[local236];
									}
									Static271.aStringArray31[local236] = Static210.aClass3_Sub25_Sub1_3.method8613();
									Static27.aStringArray1[local236] = Static210.aClass3_Sub25_Sub1_3.method8613();
									if (Static27.aStringArray1[local236].equals("")) {
										Static27.aStringArray1[local236] = Static271.aStringArray31[local236];
									}
									Static119.aBooleanArray10[local236] = false;
								}
								Static68.anInt1315 = Static629.anInt10041;
								Static175.aClass180_68 = null;
								return true;
							} else if (Static433.aClass180_174 == Static175.aClass180_68) {
								local265 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
								@Pc(2046) byte[] local2046 = new byte[Static467.anInt7682 - 1];
								Static210.aClass3_Sub25_Sub1_3.method8623(0, Static467.anInt7682 - 1, local2046);
								Static320.method8335(local265, local2046);
								Static175.aClass180_68 = null;
								return true;
							} else if (Static175.aClass180_68 == Static271.aClass180_193) {
								@Pc(2073) byte local2073 = Static210.aClass3_Sub25_Sub1_3.method8643();
								local75 = Static210.aClass3_Sub25_Sub1_3.method8639();
								Static131.aClass66_1.method1636(local75, local2073);
								Static175.aClass180_68 = null;
								return true;
							} else {
								@Pc(2093) String local2093;
								if (Static175.aClass180_68 == Static237.aClass180_94) {
									local2093 = Static210.aClass3_Sub25_Sub1_3.method8613();
									local611 = Static342.method5133(Static537.method1797(Static210.aClass3_Sub25_Sub1_3));
									Static450.method6577(6, local2093, local2093, local611, 0, local2093);
									Static175.aClass180_68 = null;
									return true;
								} else if (Static68.aClass180_21 == Static175.aClass180_68) {
									local236 = Static210.aClass3_Sub25_Sub1_3.method8618();
									local75 = Static210.aClass3_Sub25_Sub1_3.method8593();
									Static502.method3752();
									Static542.method7785(local75, local236);
									Static175.aClass180_68 = null;
									return true;
								} else if (Static78.aClass180_76 == Static175.aClass180_68) {
									local236 = Static210.aClass3_Sub25_Sub1_3.method8639();
									if (local236 == 65535) {
										local236 = -1;
									}
									local75 = Static210.aClass3_Sub25_Sub1_3.method8636();
									local497 = Static210.aClass3_Sub25_Sub1_3.method8610();
									Static502.method3752();
									Static649.method8993(local75, local497, local236);
									@Pc(2168) Class374 local2168 = Static170.aClass370_1.method8900(local236);
									Static54.method1199(local2168.anInt10302, local75, local2168.anInt10314, local2168.anInt10272);
									Static29.method689(local75, local2168.anInt10294, local2168.anInt10280, local2168.anInt10321);
									Static175.aClass180_68 = null;
									return true;
								} else {
									@Pc(2272) int local2272;
									@Pc(2332) int local2332;
									@Pc(2282) String local2282;
									@Pc(2242) boolean local2242;
									if (Static625.aClass180_200 == Static175.aClass180_68) {
										local236 = Static210.aClass3_Sub25_Sub1_3.method8593();
										@Pc(2208) Class28_Sub1_Sub1_Sub1_Sub1 local2208;
										if (local236 == Static106.anInt2205) {
											local2208 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2;
										} else {
											local2208 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local236];
										}
										if (local2208 == null) {
											Static175.aClass180_68 = null;
											return true;
										}
										local497 = Static210.aClass3_Sub25_Sub1_3.method8593();
										local501 = Static210.aClass3_Sub25_Sub1_3.method8632();
										local627 = (local497 & 0x8000) != 0;
										if (local2208.aString123 != null && local2208.aClass30_1 != null) {
											local2242 = false;
											if (local501 <= 1) {
												if (!local627 && (Static371.aBoolean430 && !Static345.aBoolean411 || Static236.aBoolean326)) {
													local2242 = true;
												} else if (Static627.method8777(local2208.aString123)) {
													local2242 = true;
												}
											}
											if (!local2242 && Static355.anInt5755 == 0) {
												local2272 = -1;
												if (local627) {
													local497 &= 0x7FFF;
													@Pc(2292) Class382 local2292 = Static34.method903(Static210.aClass3_Sub25_Sub1_3);
													local2272 = local2292.anInt10544;
													local2282 = local2292.aClass3_Sub11_Sub18_1.method8274(Static210.aClass3_Sub25_Sub1_3);
												} else {
													local2282 = Static342.method5133(Static537.method1797(Static210.aClass3_Sub25_Sub1_3));
												}
												local2208.aString125 = local2282.trim();
												local2208.anInt10794 = local497 & 0xFF;
												local2208.anInt10754 = local497 >> 8;
												local2208.anInt10809 = 150;
												if (local501 == 1 || local501 == 2) {
													local2332 = local627 ? 17 : 1;
												} else {
													local2332 = local627 ? 17 : 2;
												}
												if (local501 == 2) {
													Static470.method6813(local2332, "<img=1>" + local2208.method9103(), local2208.aString124, local2272, "<img=1>" + local2208.method9110(), 0, local2282, (String) null);
												} else if (local501 == 1) {
													Static470.method6813(local2332, "<img=0>" + local2208.method9103(), local2208.aString124, local2272, "<img=0>" + local2208.method9110(), 0, local2282, (String) null);
												} else {
													Static470.method6813(local2332, local2208.method9103(), local2208.aString124, local2272, local2208.method9110(), 0, local2282, (String) null);
												}
											}
										}
										Static175.aClass180_68 = null;
										return true;
									} else if (Static175.aClass180_68 == Static347.aClass180_129) {
										local236 = Static210.aClass3_Sub25_Sub1_3.method8618();
										local75 = Static210.aClass3_Sub25_Sub1_3.method8592();
										Static502.method3752();
										if (local75 == 65535) {
											local75 = -1;
										}
										Static582.method8170(local75, local236);
										Static175.aClass180_68 = null;
										return true;
									} else {
										@Pc(2471) byte local2471;
										if (Static175.aClass180_68 == Static256.aClass180_85) {
											local236 = Static210.aClass3_Sub25_Sub1_3.method8646();
											local2471 = Static210.aClass3_Sub25_Sub1_3.method8621();
											Static502.method3752();
											Static527.method7604(local2471, local236);
											Static175.aClass180_68 = null;
											return true;
										} else if (Static175.aClass180_68 == Static477.aClass180_163) {
											Static413.method5904(Static506.aClass336_16);
											Static175.aClass180_68 = null;
											return true;
										} else if (Static175.aClass180_68 == Static183.aClass180_74) {
											Static413.method5904(Static238.aClass336_10);
											Static175.aClass180_68 = null;
											return true;
										} else if (Static175.aClass180_68 == Static139.aClass180_51) {
											local236 = Static210.aClass3_Sub25_Sub1_3.method8644();
											local611 = Static210.aClass3_Sub25_Sub1_3.method8613();
											Static502.method3752();
											Static197.method3579(local236, local611);
											Static175.aClass180_68 = null;
											return true;
										} else if (Static52.aClass180_17 == Static175.aClass180_68) {
											local236 = Static210.aClass3_Sub25_Sub1_3.method8610();
											Static502.method3752();
											@Pc(2545) Class3_Sub46 local2545 = (Class3_Sub46) Static455.aClass83_31.method2368((long) local236);
											if (local2545 != null) {
												Static647.method8986(false, true, local2545);
											}
											if (Static95.aClass260_7 != null) {
												Static456.method8151(Static95.aClass260_7);
												Static95.aClass260_7 = null;
											}
											Static175.aClass180_68 = null;
											return true;
										} else if (Static630.aClass180_202 == Static175.aClass180_68) {
											local236 = Static210.aClass3_Sub25_Sub1_3.method8609();
											local75 = Static210.aClass3_Sub25_Sub1_3.method8632();
											local497 = Static210.aClass3_Sub25_Sub1_3.method8593() << 2;
											local501 = Static210.aClass3_Sub25_Sub1_3.method8615();
											local505 = Static210.aClass3_Sub25_Sub1_3.method8615();
											Static502.method3752();
											Static431.method6194(local236, true, local505, local75, local497, local501);
											Static175.aClass180_68 = null;
											return true;
										} else if (Static41.aClass180_14 == Static175.aClass180_68) {
											local236 = Static210.aClass3_Sub25_Sub1_3.method8615();
											local75 = Static210.aClass3_Sub25_Sub1_3.method8592();
											Static131.aClass66_1.method1632(local75, local236);
											Static175.aClass180_68 = null;
											return true;
										} else if (Static175.aClass180_68 == Static192.aClass180_79) {
											Static513.anInt8245 = Static210.aClass3_Sub25_Sub1_3.method8611();
											Static371.aBoolean430 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
											Static175.aClass180_68 = null;
											return true;
										} else if (Static175.aClass180_68 == Static150.aClass180_122) {
											Static413.method5904(Static640.aClass336_20);
											Static175.aClass180_68 = null;
											return true;
										} else if (Static65.aClass180_20 == Static175.aClass180_68) {
											local236 = Static210.aClass3_Sub25_Sub1_3.method8618();
											Static502.method3752();
											Static175.aClass180_68 = null;
											if (local236 == -1) {
												Static410.anInt6542 = -1;
												Static153.anInt3036 = -1;
											} else {
												local75 = local236 >> 14 & 0x3FFF;
												local497 = local236 & 0x3FFF;
												local75 -= Static287.anInt4910;
												if (local75 < 0) {
													local75 = 0;
												} else if (local75 >= Static158.anInt927) {
													local75 = Static158.anInt927;
												}
												local497 -= Static72.anInt1361;
												if (local497 < 0) {
													local497 = 0;
												} else if (Static515.anInt8292 <= local497) {
													local497 = Static515.anInt8292;
												}
												Static410.anInt6542 = (local75 << 9) + 256;
												Static153.anInt3036 = (local497 << 9) + 256;
											}
											return true;
										} else {
											@Pc(2769) Class3_Sub46 local2769;
											if (Static360.aClass180_135 == Static175.aClass180_68) {
												local236 = Static210.aClass3_Sub25_Sub1_3.method8609();
												local75 = Static210.aClass3_Sub25_Sub1_3.method8593();
												local497 = Static210.aClass3_Sub25_Sub1_3.method8605();
												Static502.method3752();
												local2769 = (Class3_Sub46) Static455.aClass83_31.method2368((long) local497);
												if (local2769 != null) {
													Static647.method8986(false, local75 != local2769.anInt7855, local2769);
												}
												Static18.method568(local75, local497, false, local236);
												Static175.aClass180_68 = null;
												return true;
											} else if (Static654.aClass180_212 == Static175.aClass180_68) {
												local236 = Static210.aClass3_Sub25_Sub1_3.method8618();
												Static179.aClass81_3 = Static247.aClass291_1.method7128(local236);
												Static175.aClass180_68 = null;
												return true;
											} else if (Static219.aClass180_87 == Static175.aClass180_68) {
												Static529.method7641();
												Static175.aClass180_68 = null;
												return true;
											} else if (Static175.aClass180_68 == Static322.aClass180_121) {
												Static385.method5501();
												Static175.aClass180_68 = null;
												return true;
											} else if (Static175.aClass180_68 == Static607.aClass180_196) {
												Static654.aBoolean796 = Static210.aClass3_Sub25_Sub1_3.method8609() == 1;
												Static175.aClass180_68 = null;
												return true;
											} else {
												@Pc(2877) long local2877;
												@Pc(2882) long local2882;
												@Pc(2903) int local2903;
												@Pc(2893) int local2893;
												@Pc(2901) boolean local2901;
												if (Static175.aClass180_68 == Static579.aClass180_188) {
													local265 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
													local611 = Static210.aClass3_Sub25_Sub1_3.method8613();
													local318 = local611;
													if (local265) {
														local318 = Static210.aClass3_Sub25_Sub1_3.method8613();
													}
													local2877 = Static210.aClass3_Sub25_Sub1_3.method8600();
													local2882 = (long) Static210.aClass3_Sub25_Sub1_3.method8593();
													local1195 = (long) Static210.aClass3_Sub25_Sub1_3.method8607();
													local2893 = Static210.aClass3_Sub25_Sub1_3.method8632();
													@Pc(2899) long local2899 = local1195 + (local2882 << 32);
													local2901 = false;
													local2903 = 0;
													while (true) {
														if (local2903 >= 100) {
															if (local2893 <= 1) {
																if (Static371.aBoolean430 && !Static345.aBoolean411 || Static236.aBoolean326) {
																	local2901 = true;
																} else if (Static627.method8777(local318)) {
																	local2901 = true;
																}
															}
															break;
														}
														if (Static367.aLongArray12[local2903] == local2899) {
															local2901 = true;
															break;
														}
														local2903++;
													}
													if (!local2901 && Static355.anInt5755 == 0) {
														Static367.aLongArray12[Static505.anInt8188] = local2899;
														Static505.anInt8188 = (Static505.anInt8188 + 1) % 100;
														@Pc(2965) String local2965 = Static342.method5133(Static537.method1797(Static210.aClass3_Sub25_Sub1_3));
														if (local2893 == 2 || local2893 == 3) {
															Static470.method6813(9, "<img=1>" + local611, local611, -1, "<img=1>" + local318, 0, local2965, Static491.method7085(local2877));
														} else if (local2893 == 1) {
															Static470.method6813(9, "<img=0>" + local611, local611, -1, "<img=0>" + local318, 0, local2965, Static491.method7085(local2877));
														} else {
															Static470.method6813(9, local611, local611, -1, local318, 0, local2965, Static491.method7085(local2877));
														}
													}
													Static175.aClass180_68 = null;
													return true;
												}
												@Pc(3066) boolean local3066;
												@Pc(3169) Class189 local3169;
												if (Static419.aClass180_31 == Static175.aClass180_68) {
													local2093 = Static210.aClass3_Sub25_Sub1_3.method8613();
													local3066 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
													if (local3066) {
														local611 = Static210.aClass3_Sub25_Sub1_3.method8613();
													} else {
														local611 = local2093;
													}
													local501 = Static210.aClass3_Sub25_Sub1_3.method8593();
													@Pc(3084) byte local3084 = Static210.aClass3_Sub25_Sub1_3.method8621();
													local2242 = false;
													if (local3084 == -128) {
														local2242 = true;
													}
													if (local2242) {
														if (Static590.anInt9480 == 0) {
															Static175.aClass180_68 = null;
															return true;
														}
														for (local381 = 0; Static590.anInt9480 > local381 && (!Static41.aClass189Array1[local381].aString50.equals(local611) || local501 != Static41.aClass189Array1[local381].anInt5136); local381++) {
														}
														if (Static590.anInt9480 > local381) {
															while (Static590.anInt9480 - 1 > local381) {
																Static41.aClass189Array1[local381] = Static41.aClass189Array1[local381 + 1];
																local381++;
															}
															Static590.anInt9480--;
															Static41.aClass189Array1[Static590.anInt9480] = null;
														}
													} else {
														local2282 = Static210.aClass3_Sub25_Sub1_3.method8613();
														local3169 = new Class189();
														local3169.aString51 = local2093;
														local3169.aString50 = local611;
														local3169.aString52 = Static629.method8792(local3169.aString50);
														local3169.aByte76 = local3084;
														local3169.aString53 = local2282;
														local3169.anInt5136 = local501;
														for (local2332 = Static590.anInt9480 - 1; local2332 >= 0; local2332--) {
															local2893 = Static41.aClass189Array1[local2332].aString52.compareTo(local3169.aString52);
															if (local2893 == 0) {
																Static41.aClass189Array1[local2332].anInt5136 = local501;
																Static41.aClass189Array1[local2332].aByte76 = local3084;
																Static41.aClass189Array1[local2332].aString53 = local2282;
																if (local611.equals(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aString123)) {
																	Static127.aByte33 = local3084;
																}
																Static413.anInt6608 = Static629.anInt10041;
																Static175.aClass180_68 = null;
																return true;
															}
															if (local2893 < 0) {
																break;
															}
														}
														if (Static590.anInt9480 >= Static41.aClass189Array1.length) {
															Static175.aClass180_68 = null;
															return true;
														}
														for (local2893 = Static590.anInt9480 - 1; local2893 > local2332; local2893--) {
															Static41.aClass189Array1[local2893 + 1] = Static41.aClass189Array1[local2893];
														}
														if (Static590.anInt9480 == 0) {
															Static41.aClass189Array1 = new Class189[100];
														}
														Static41.aClass189Array1[local2332 + 1] = local3169;
														Static590.anInt9480++;
														if (local611.equals(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aString123)) {
															Static127.aByte33 = local3084;
														}
													}
													Static413.anInt6608 = Static629.anInt10041;
													Static175.aClass180_68 = null;
													return true;
												} else if (Static175.aClass180_68 == Static488.aClass180_166) {
													local236 = Static210.aClass3_Sub25_Sub1_3.method8593();
													local75 = Static210.aClass3_Sub25_Sub1_3.method8632();
													local3066 = (local75 & 0x1) == 1;
													Static186.method3455(local236, local3066);
													local501 = Static210.aClass3_Sub25_Sub1_3.method8593();
													for (local505 = 0; local505 < local501; local505++) {
														local1598 = Static210.aClass3_Sub25_Sub1_3.method8609();
														if (local1598 == 255) {
															local1598 = Static210.aClass3_Sub25_Sub1_3.method8605();
														}
														local381 = Static210.aClass3_Sub25_Sub1_3.method8592();
														Static380.method5474(local505, local3066, local236, local381 - 1, local1598);
													}
													Static37.anIntArray72[Static63.anInt1267++ & 0x1F] = local236;
													Static175.aClass180_68 = null;
													return true;
												} else if (Static656.aClass180_213 == Static175.aClass180_68) {
													local265 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
													local611 = Static210.aClass3_Sub25_Sub1_3.method8613();
													local318 = local611;
													if (local265) {
														local318 = Static210.aClass3_Sub25_Sub1_3.method8613();
													}
													local501 = Static210.aClass3_Sub25_Sub1_3.method8632();
													local505 = Static210.aClass3_Sub25_Sub1_3.method8593();
													local2242 = false;
													if (local501 <= 1 && Static627.method8777(local318)) {
														local2242 = true;
													}
													if (!local2242 && Static355.anInt5755 == 0) {
														local2282 = Static143.aClass77_1.method2082(local505).method8274(Static210.aClass3_Sub25_Sub1_3);
														if (local501 == 2) {
															Static470.method6813(25, "<img=1>" + local611, local611, local505, "<img=1>" + local318, 0, local2282, (String) null);
														} else if (local501 == 1) {
															Static470.method6813(25, "<img=0>" + local611, local611, local505, "<img=0>" + local318, 0, local2282, (String) null);
														} else {
															Static470.method6813(25, local611, local611, local505, local318, 0, local2282, (String) null);
														}
													}
													Static175.aClass180_68 = null;
													return true;
												} else if (Static175.aClass180_68 == Static508.aClass180_169) {
													local236 = Static210.aClass3_Sub25_Sub1_3.method8618();
													local75 = Static210.aClass3_Sub25_Sub1_3.method8605();
													Static502.method3752();
													@Pc(3539) Class3_Sub46 local3539 = (Class3_Sub46) Static455.aClass83_31.method2368((long) local75);
													local2769 = (Class3_Sub46) Static455.aClass83_31.method2368((long) local236);
													if (local2769 != null) {
														Static647.method8986(false, local3539 == null || local2769.anInt7855 != local3539.anInt7855, local2769);
													}
													if (local3539 != null) {
														local3539.method9380();
														Static455.aClass83_31.method2377((long) local236, local3539);
													}
													@Pc(3579) Class260 local3579 = Static383.method5492(local75);
													if (local3579 != null) {
														Static456.method8151(local3579);
													}
													local3579 = Static383.method5492(local236);
													if (local3579 != null) {
														Static456.method8151(local3579);
														Static249.method4132(true, local3579);
													}
													if (Static110.anInt2265 != -1) {
														Static610.method8667(1, Static110.anInt2265);
													}
													Static175.aClass180_68 = null;
													return true;
												} else if (Static175.aClass180_68 == Static137.aClass180_50) {
													Static413.method5904(Static222.aClass336_9);
													Static175.aClass180_68 = null;
													return true;
												} else if (Static37.aClass180_12 == Static175.aClass180_68) {
													local2093 = Static210.aClass3_Sub25_Sub1_3.method8613();
													@Pc(3634) Object[] local3634 = new Object[local2093.length() + 1];
													for (local497 = local2093.length() - 1; local497 >= 0; local497--) {
														if (local2093.charAt(local497) == 's') {
															local3634[local497 + 1] = Static210.aClass3_Sub25_Sub1_3.method8613();
														} else {
															local3634[local497 + 1] = Integer.valueOf(Static210.aClass3_Sub25_Sub1_3.method8618());
														}
													}
													local3634[0] = Integer.valueOf(Static210.aClass3_Sub25_Sub1_3.method8618());
													Static502.method3752();
													@Pc(3690) Class3_Sub17 local3690 = new Class3_Sub17();
													local3690.anObjectArray2 = local3634;
													Static565.method8015(local3690);
													Static175.aClass180_68 = null;
													return true;
												} else if (Static175.aClass180_68 == Static532.aClass180_177) {
													Static674.method9363();
													Static175.aClass180_68 = null;
													return false;
												} else if (Static175.aClass180_68 == Static451.aClass180_155) {
													Static210.aClass3_Sub25_Sub1_3.anInt9765 += 28;
													if (Static210.aClass3_Sub25_Sub1_3.method8641()) {
														Static536.method7982(Static210.aClass3_Sub25_Sub1_3.anInt9765 - 28, Static210.aClass3_Sub25_Sub1_3);
													}
													Static175.aClass180_68 = null;
													return true;
												} else if (Static175.aClass180_68 == Static77.aClass180_27) {
													Static131.aClass66_1.method1635();
													Static228.anInt4271 += 32;
													Static175.aClass180_68 = null;
													return true;
												} else {
													@Pc(3763) byte[] local3763;
													if (Static141.aClass180_55 == Static175.aClass180_68) {
														if (Static442.aFrame3 != null) {
															Static235.method3936(-1, Static24.aClass3_Sub22_4.aClass6_Sub7_1.method3506(), -1, false);
														}
														local3763 = new byte[Static467.anInt7682];
														Static210.aClass3_Sub25_Sub1_3.method3400(Static467.anInt7682, local3763);
														local611 = Static426.method6150(local3763, 0, Static467.anInt7682);
														Static235.method3934(Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() == 1, true, local611, Static247.aClass291_1);
														Static175.aClass180_68 = null;
														return true;
													} else if (Static175.aClass180_68 == Static164.aClass180_67) {
														Static67.method1352(false);
														Static175.aClass180_68 = null;
														return false;
													} else if (Static287.aClass180_112 == Static175.aClass180_68) {
														local236 = Static210.aClass3_Sub25_Sub1_3.method8592();
														local75 = Static210.aClass3_Sub25_Sub1_3.method8605();
														Static502.method3752();
														Static17.method513(local236, local75);
														Static175.aClass180_68 = null;
														return true;
													} else if (Static175.aClass180_68 == Static99.aClass180_207) {
														local236 = Static210.aClass3_Sub25_Sub1_3.method8615();
														Static502.method3752();
														Static403.anInt6412 = local236;
														Static175.aClass180_68 = null;
														return true;
													} else if (Static175.aClass180_68 == Static88.aClass180_33) {
														local236 = Static210.aClass3_Sub25_Sub1_3.method8639();
														local75 = Static210.aClass3_Sub25_Sub1_3.method8605();
														Static131.aClass66_1.method1636(local236, local75);
														Static175.aClass180_68 = null;
														return true;
													} else {
														@Pc(3911) boolean local3911;
														@Pc(3909) long local3909;
														if (Static175.aClass180_68 == Static230.aClass180_91) {
															local265 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
															local611 = Static210.aClass3_Sub25_Sub1_3.method8613();
															local318 = local611;
															if (local265) {
																local318 = Static210.aClass3_Sub25_Sub1_3.method8613();
															}
															local2877 = (long) Static210.aClass3_Sub25_Sub1_3.method8593();
															local2882 = (long) Static210.aClass3_Sub25_Sub1_3.method8607();
															local2272 = Static210.aClass3_Sub25_Sub1_3.method8632();
															local3909 = (local2877 << 32) + local2882;
															local3911 = false;
															local1213 = 0;
															while (true) {
																if (local1213 >= 100) {
																	if (local2272 <= 1) {
																		if (Static371.aBoolean430 && !Static345.aBoolean411 || Static236.aBoolean326) {
																			local3911 = true;
																		} else if (Static627.method8777(local318)) {
																			local3911 = true;
																		}
																	}
																	break;
																}
																if (Static367.aLongArray12[local1213] == local3909) {
																	local3911 = true;
																	break;
																}
																local1213++;
															}
															if (!local3911 && Static355.anInt5755 == 0) {
																Static367.aLongArray12[Static505.anInt8188] = local3909;
																Static505.anInt8188 = (Static505.anInt8188 + 1) % 100;
																local1278 = Static342.method5133(Static537.method1797(Static210.aClass3_Sub25_Sub1_3));
																if (local2272 == 2) {
																	Static470.method6813(7, "<img=1>" + local611, local611, -1, "<img=1>" + local318, 0, local1278, (String) null);
																} else if (local2272 == 1) {
																	Static470.method6813(7, "<img=0>" + local611, local611, -1, "<img=0>" + local318, 0, local1278, (String) null);
																} else {
																	Static470.method6813(3, local611, local611, -1, local318, 0, local1278, (String) null);
																}
															}
															Static175.aClass180_68 = null;
															return true;
														} else if (Static175.aClass180_68 == Static151.aClass180_63) {
															local236 = Static210.aClass3_Sub25_Sub1_3.method8610();
															if (local236 != Static369.anInt5957) {
																Static369.anInt5957 = local236;
																Static565.method8018(Static476.aClass223_13, -1, -1);
															}
															Static175.aClass180_68 = null;
															return true;
														} else if (Static225.aClass180_89 == Static175.aClass180_68) {
															if (Static442.aFrame3 != null) {
																Static235.method3936(-1, Static24.aClass3_Sub22_4.aClass6_Sub7_1.method3506(), -1, false);
															}
															local3763 = new byte[Static467.anInt7682];
															Static210.aClass3_Sub25_Sub1_3.method3400(Static467.anInt7682, local3763);
															local611 = Static426.method6150(local3763, 0, Static467.anInt7682);
															local318 = "opensn";
															if (!Static663.aBoolean803 || Static496.method7117(local611, Static247.aClass291_1, local318, 1).anInt2532 == 2) {
																Static449.method6563(true, Static247.aClass291_1, local318, local611, Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() == 1);
															}
															Static175.aClass180_68 = null;
															return true;
														} else if (Static175.aClass180_68 == Static231.aClass180_92) {
															local236 = Static210.aClass3_Sub25_Sub1_3.method8618();
															Static502.method3752();
															Static132.method2498(-1, local236, -1, 3);
															Static175.aClass180_68 = null;
															return true;
														} else if (Static175.aClass180_68 == Static555.aClass180_183) {
															Static501.aByte115 = Static210.aClass3_Sub25_Sub1_3.method8643();
															Static175.aClass180_68 = null;
															if (Static501.aByte115 == 0 || Static501.aByte115 == 1) {
																Static474.aBoolean594 = true;
															}
															return true;
														} else if (Static175.aClass180_68 == Static29.aClass180_7) {
															Static498.method8889(Static247.aClass291_1, Static210.aClass3_Sub25_Sub1_3, Static467.anInt7682);
															Static175.aClass180_68 = null;
															return true;
														} else if (Static175.aClass180_68 == Static321.aClass180_120) {
															local236 = Static210.aClass3_Sub25_Sub1_3.method8632();
															local611 = Static210.aClass3_Sub25_Sub1_3.method8613();
															local497 = Static210.aClass3_Sub25_Sub1_3.method8609();
															local501 = Static210.aClass3_Sub25_Sub1_3.method8592();
															if (local501 == 65535) {
																local501 = -1;
															}
															if (local236 >= 1 && local236 <= 8) {
																if (local611.equalsIgnoreCase("null")) {
																	local611 = null;
																}
																Static183.aStringArray9[local236 - 1] = local611;
																Static19.anIntArray25[local236 - 1] = local501;
																Static163.aBooleanArray17[local236 - 1] = local497 == 0;
															}
															Static175.aClass180_68 = null;
															return true;
														} else if (Static634.aClass180_204 == Static175.aClass180_68) {
															local236 = Static210.aClass3_Sub25_Sub1_3.method8644();
															local75 = Static210.aClass3_Sub25_Sub1_3.method8639();
															local497 = Static210.aClass3_Sub25_Sub1_3.method8593();
															local501 = Static210.aClass3_Sub25_Sub1_3.method8636();
															Static502.method3752();
															Static54.method1199(local497, local501, local75, local236);
															Static175.aClass180_68 = null;
															return true;
														} else if (Static391.aClass180_208 == Static175.aClass180_68) {
															local236 = Static210.aClass3_Sub25_Sub1_3.method8631();
															local75 = Static210.aClass3_Sub25_Sub1_3.method8589();
															local497 = Static210.aClass3_Sub25_Sub1_3.method8610();
															Static502.method3752();
															Static325.method4966(local236, local497, local75);
															Static175.aClass180_68 = null;
															return true;
														} else if (Static311.aClass180_117 == Static175.aClass180_68) {
															Static544.method7821(Static210.aClass3_Sub25_Sub1_3.method8613());
															Static175.aClass180_68 = null;
															return true;
														} else {
															@Pc(4438) String local4438;
															if (Static175.aClass180_68 == Static630.aClass180_201) {
																local265 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
																local611 = Static210.aClass3_Sub25_Sub1_3.method8613();
																local1180 = (long) Static210.aClass3_Sub25_Sub1_3.method8593();
																local1185 = (long) Static210.aClass3_Sub25_Sub1_3.method8607();
																local381 = Static210.aClass3_Sub25_Sub1_3.method8632();
																local2272 = Static210.aClass3_Sub25_Sub1_3.method8593();
																local3909 = local1185 + (local1180 << 32);
																local3911 = false;
																@Pc(4378) Class3_Sub30 local4378 = local265 ? Static90.aClass3_Sub30_10 : Static195.aClass3_Sub30_4;
																if (local4378 == null) {
																	local3911 = true;
																} else {
																	label2158: {
																		for (local1284 = 0; local1284 < 100; local1284++) {
																			if (local3909 == Static367.aLongArray12[local1284]) {
																				local3911 = true;
																				break label2158;
																			}
																		}
																		if (local381 <= 1 && Static627.method8777(local611)) {
																			local3911 = true;
																		}
																	}
																}
																if (!local3911 && Static355.anInt5755 == 0) {
																	Static367.aLongArray12[Static505.anInt8188] = local3909;
																	Static505.anInt8188 = (Static505.anInt8188 + 1) % 100;
																	local4438 = Static143.aClass77_1.method2082(local2272).method8274(Static210.aClass3_Sub25_Sub1_3);
																	local2903 = local265 ? 42 : 45;
																	if (local381 == 2 || local381 == 3) {
																		Static470.method6813(local2903, "<img=1>" + local611, local611, local2272, "<img=1>" + local611, 0, local4438, local4378.aString39);
																	} else if (local381 == 1) {
																		Static470.method6813(local2903, "<img=0>" + local611, local611, local2272, "<img=0>" + local611, 0, local4438, local4378.aString39);
																	} else {
																		Static470.method6813(local2903, local611, local611, local2272, local611, 0, local4438, local4378.aString39);
																	}
																}
																Static175.aClass180_68 = null;
																return true;
															} else if (Static175.aClass180_68 == Static294.aClass180_149) {
																if (Static661.method9136(Static406.anInt6454)) {
																	Static620.anInt9925 = (int) ((float) Static210.aClass3_Sub25_Sub1_3.method8593() * 2.5F);
																} else {
																	Static620.anInt9925 = Static210.aClass3_Sub25_Sub1_3.method8593() * 30;
																}
																Static126.anInt2583 = Static629.anInt10041;
																Static175.aClass180_68 = null;
																return true;
															} else if (Static152.aClass180_65 == Static175.aClass180_68) {
																local236 = Static210.aClass3_Sub25_Sub1_3.method8646();
																local75 = Static210.aClass3_Sub25_Sub1_3.method8593();
																local497 = Static210.aClass3_Sub25_Sub1_3.method8636();
																local501 = Static210.aClass3_Sub25_Sub1_3.method8644();
																Static502.method3752();
																Static488.method7054(local497, local236, local501, local75);
																Static175.aClass180_68 = null;
																return true;
															} else {
																@Pc(4619) boolean local4619;
																if (Static608.aClass180_197 == Static175.aClass180_68) {
																	@Pc(4676) boolean local4676;
																	while (Static467.anInt7682 > Static210.aClass3_Sub25_Sub1_3.anInt9765) {
																		local265 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
																		local611 = Static210.aClass3_Sub25_Sub1_3.method8613();
																		local318 = Static210.aClass3_Sub25_Sub1_3.method8613();
																		local501 = Static210.aClass3_Sub25_Sub1_3.method8593();
																		local505 = Static210.aClass3_Sub25_Sub1_3.method8632();
																		local336 = "";
																		local4619 = false;
																		if (local501 > 0) {
																			local336 = Static210.aClass3_Sub25_Sub1_3.method8613();
																			local4619 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
																		}
																		for (local2272 = 0; local2272 < Static458.anInt7581; local2272++) {
																			if (local265) {
																				if (local318.equals(Static461.aStringArray20[local2272])) {
																					Static461.aStringArray20[local2272] = local611;
																					Static105.aStringArray5[local2272] = local318;
																					local611 = null;
																					break;
																				}
																			} else if (local611.equals(Static461.aStringArray20[local2272])) {
																				if (Static212.anIntArray839[local2272] != local501) {
																					local4676 = true;
																					for (@Pc(4681) Class28_Sub4_Sub1 local4681 = (Class28_Sub4_Sub1) Static225.aClass371_2.method8911(); local4681 != null; local4681 = (Class28_Sub4_Sub1) Static225.aClass371_2.method8917()) {
																						if (local4681.aString99.equals(local611)) {
																							if (local501 != 0 && local4681.aShort87 == 0) {
																								local4681.method9276();
																								local4676 = false;
																							} else if (local501 == 0 && local4681.aShort87 != 0) {
																								local4681.method9276();
																								local4676 = false;
																							}
																						}
																					}
																					if (local4676) {
																						Static225.aClass371_2.method8908(new Class28_Sub4_Sub1(local611, local501));
																					}
																					Static212.anIntArray839[local2272] = local501;
																				}
																				Static105.aStringArray5[local2272] = local318;
																				Static101.aStringArray4[local2272] = local336;
																				Static561.anIntArray780[local2272] = local505;
																				local611 = null;
																				Static577.aBooleanArray57[local2272] = local4619;
																				break;
																			}
																		}
																		if (local611 != null && Static458.anInt7581 < 200) {
																			Static461.aStringArray20[Static458.anInt7581] = local611;
																			Static105.aStringArray5[Static458.anInt7581] = local318;
																			Static212.anIntArray839[Static458.anInt7581] = local501;
																			Static101.aStringArray4[Static458.anInt7581] = local336;
																			Static561.anIntArray780[Static458.anInt7581] = local505;
																			Static577.aBooleanArray57[Static458.anInt7581] = local4619;
																			Static458.anInt7581++;
																		}
																	}
																	Static11.anInt128 = 2;
																	Static68.anInt1315 = Static629.anInt10041;
																	local75 = Static458.anInt7581;
																	while (local75 > 0) {
																		local75--;
																		local265 = true;
																		for (local497 = 0; local497 < local75; local497++) {
																			if (Static541.aClass342_3.anInt9498 != Static212.anIntArray839[local497] && Static212.anIntArray839[local497 + 1] == Static541.aClass342_3.anInt9498 || Static212.anIntArray839[local497] == 0 && Static212.anIntArray839[local497 + 1] != 0) {
																				local501 = Static212.anIntArray839[local497];
																				Static212.anIntArray839[local497] = Static212.anIntArray839[local497 + 1];
																				Static212.anIntArray839[local497 + 1] = local501;
																				local332 = Static101.aStringArray4[local497];
																				Static101.aStringArray4[local497] = Static101.aStringArray4[local497 + 1];
																				Static101.aStringArray4[local497 + 1] = local332;
																				local336 = Static461.aStringArray20[local497];
																				Static461.aStringArray20[local497] = Static461.aStringArray20[local497 + 1];
																				Static461.aStringArray20[local497 + 1] = local336;
																				local2282 = Static105.aStringArray5[local497];
																				Static105.aStringArray5[local497] = Static105.aStringArray5[local497 + 1];
																				Static105.aStringArray5[local497 + 1] = local2282;
																				local2272 = Static561.anIntArray780[local497];
																				Static561.anIntArray780[local497] = Static561.anIntArray780[local497 + 1];
																				Static561.anIntArray780[local497 + 1] = local2272;
																				local4676 = Static577.aBooleanArray57[local497];
																				Static577.aBooleanArray57[local497] = Static577.aBooleanArray57[local497 + 1];
																				local265 = false;
																				Static577.aBooleanArray57[local497 + 1] = local4676;
																			}
																		}
																		if (local265) {
																			break;
																		}
																	}
																	Static175.aClass180_68 = null;
																	return true;
																} else if (Static175.aClass180_68 == Static132.aClass180_47) {
																	local236 = Static210.aClass3_Sub25_Sub1_3.method8646();
																	local75 = local236 >> 2;
																	local497 = local236 & 0x3;
																	local501 = Static643.anIntArray893[local75];
																	local505 = Static210.aClass3_Sub25_Sub1_3.method8618();
																	local1598 = local505 >> 28 & 0x3;
																	local381 = local505 >> 14 & 0x3FFF;
																	local2272 = local505 & 0x3FFF;
																	local2332 = Static210.aClass3_Sub25_Sub1_3.method8592();
																	local381 -= Static287.anInt4910;
																	local2272 -= Static72.anInt1361;
																	if (local2332 == 65535) {
																		local2332 = -1;
																	}
																	Static629.method8787(local2272, local75, local501, local497, local1598, local381, local2332);
																	Static175.aClass180_68 = null;
																	return true;
																} else if (Static175.aClass180_68 == Static358.aClass180_132) {
																	local2093 = Static210.aClass3_Sub25_Sub1_3.method8613();
																	local75 = Static210.aClass3_Sub25_Sub1_3.method8610();
																	Static502.method3752();
																	Static423.method6088(local75, local2093);
																	Static175.aClass180_68 = null;
																	return true;
																} else if (Static140.aClass180_52 == Static175.aClass180_68) {
																	Static413.method5904(Static385.aClass336_12);
																	Static175.aClass180_68 = null;
																	return true;
																} else if (Static136.aClass180_49 == Static175.aClass180_68) {
																	local236 = Static210.aClass3_Sub25_Sub1_3.method8593();
																	local75 = Static210.aClass3_Sub25_Sub1_3.method8632();
																	local3066 = (local75 & 0x1) == 1;
																	while (Static210.aClass3_Sub25_Sub1_3.anInt9765 < Static467.anInt7682) {
																		local501 = Static210.aClass3_Sub25_Sub1_3.method8604();
																		local505 = Static210.aClass3_Sub25_Sub1_3.method8593();
																		local1598 = 0;
																		if (local505 != 0) {
																			local1598 = Static210.aClass3_Sub25_Sub1_3.method8632();
																			if (local1598 == 255) {
																				local1598 = Static210.aClass3_Sub25_Sub1_3.method8618();
																			}
																		}
																		Static380.method5474(local501, local3066, local236, local505 - 1, local1598);
																	}
																	Static37.anIntArray72[Static63.anInt1267++ & 0x1F] = local236;
																	Static175.aClass180_68 = null;
																	return true;
																} else if (Static175.aClass180_68 == Static144.aClass180_58) {
																	Static413.method5904(Static561.aClass336_18);
																	Static175.aClass180_68 = null;
																	return true;
																} else if (Static175.aClass180_68 == Static180.aClass180_73) {
																	local236 = Static210.aClass3_Sub25_Sub1_3.method8593();
																	if (local236 == 65535) {
																		local236 = -1;
																	}
																	local75 = Static210.aClass3_Sub25_Sub1_3.method8632();
																	local497 = Static210.aClass3_Sub25_Sub1_3.method8593();
																	local501 = Static210.aClass3_Sub25_Sub1_3.method8632();
																	Static264.method4359(true, local497, local75, local236, local501, 256);
																	Static175.aClass180_68 = null;
																	return true;
																} else {
																	@Pc(5263) int local5263;
																	@Pc(5274) int local5274;
																	if (Static175.aClass180_68 == Static600.aClass180_190) {
																		local265 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
																		local611 = Static210.aClass3_Sub25_Sub1_3.method8613();
																		local318 = local611;
																		if (local265) {
																			local318 = Static210.aClass3_Sub25_Sub1_3.method8613();
																		}
																		local2877 = Static210.aClass3_Sub25_Sub1_3.method8600();
																		local2882 = (long) Static210.aClass3_Sub25_Sub1_3.method8593();
																		local1195 = (long) Static210.aClass3_Sub25_Sub1_3.method8607();
																		local2893 = Static210.aClass3_Sub25_Sub1_3.method8632();
																		local5263 = Static210.aClass3_Sub25_Sub1_3.method8593();
																		@Pc(5270) long local5270 = (local2882 << 32) + local1195;
																		@Pc(5272) boolean local5272 = false;
																		local5274 = 0;
																		while (true) {
																			if (local5274 >= 100) {
																				if (local2893 <= 1 && Static627.method8777(local318)) {
																					local5272 = true;
																				}
																				break;
																			}
																			if (local5270 == Static367.aLongArray12[local5274]) {
																				local5272 = true;
																				break;
																			}
																			local5274++;
																		}
																		if (!local5272 && Static355.anInt5755 == 0) {
																			Static367.aLongArray12[Static505.anInt8188] = local5270;
																			Static505.anInt8188 = (Static505.anInt8188 + 1) % 100;
																			@Pc(5327) String local5327 = Static143.aClass77_1.method2082(local5263).method8274(Static210.aClass3_Sub25_Sub1_3);
																			if (local2893 == 2) {
																				Static470.method6813(20, "<img=1>" + local611, local611, local5263, "<img=1>" + local318, 0, local5327, Static491.method7085(local2877));
																			} else if (local2893 == 1) {
																				Static470.method6813(20, "<img=0>" + local611, local611, local5263, "<img=0>" + local318, 0, local5327, Static491.method7085(local2877));
																			} else {
																				Static470.method6813(20, local611, local611, local5263, local318, 0, local5327, Static491.method7085(local2877));
																			}
																		}
																		Static175.aClass180_68 = null;
																		return true;
																	} else if (Static350.aClass180_130 == Static175.aClass180_68) {
																		Static376.method5447(Static210.aClass3_Sub25_Sub1_3, Static467.anInt7682);
																		Static175.aClass180_68 = null;
																		return true;
																	} else if (Static175.aClass180_68 == Static461.aClass180_157) {
																		local236 = Static210.aClass3_Sub25_Sub1_3.method8610();
																		local75 = Static210.aClass3_Sub25_Sub1_3.method8644();
																		if (local75 == 65535) {
																			local75 = -1;
																		}
																		Static502.method3752();
																		Static132.method2498(local75, local236, -1, 1);
																		Static175.aClass180_68 = null;
																		return true;
																	} else if (Static464.aClass180_158 == Static175.aClass180_68) {
																		local236 = Static210.aClass3_Sub25_Sub1_3.method8615();
																		local75 = Static210.aClass3_Sub25_Sub1_3.method8609();
																		if (local236 == 255) {
																			local236 = -1;
																			local75 = -1;
																		}
																		Static73.method1415(local75, local236);
																		Static175.aClass180_68 = null;
																		return true;
																	} else if (Static175.aClass180_68 == Static292.aClass180_113) {
																		Static92.anInt1774 = Static210.aClass3_Sub25_Sub1_3.method8632();
																		Static126.anInt2583 = Static629.anInt10041;
																		Static175.aClass180_68 = null;
																		return true;
																	} else {
																		@Pc(5557) Class3_Sub48 local5557;
																		@Pc(5548) Class3_Sub48 local5548;
																		if (Static175.aClass180_68 == Static511.aClass180_172) {
																			local236 = Static210.aClass3_Sub25_Sub1_3.method8636();
																			local75 = Static210.aClass3_Sub25_Sub1_3.method8639();
																			if (local75 == 65535) {
																				local75 = -1;
																			}
																			local497 = Static210.aClass3_Sub25_Sub1_3.method8605();
																			local501 = Static210.aClass3_Sub25_Sub1_3.method8644();
																			if (local501 == 65535) {
																				local501 = -1;
																			}
																			Static502.method3752();
																			for (local505 = local75; local505 <= local501; local505++) {
																				local2882 = ((long) local236 << 32) + (long) local505;
																				local5548 = (Class3_Sub48) Static300.aClass83_15.method2368(local2882);
																				if (local5548 != null) {
																					local5557 = new Class3_Sub48(local497, local5548.anInt8085);
																					local5548.method9380();
																				} else if (local505 == -1) {
																					local5557 = new Class3_Sub48(local497, Static383.method5492(local236).aClass3_Sub48_1.anInt8085);
																				} else {
																					local5557 = new Class3_Sub48(local497, -1);
																				}
																				Static300.aClass83_15.method2377(local2882, local5557);
																			}
																			Static175.aClass180_68 = null;
																			return true;
																		} else if (Static175.aClass180_68 == Static370.aClass180_138) {
																			Static373.anInt5978 = Static210.aClass3_Sub25_Sub1_3.method8599() << 3;
																			Static109.anInt2262 = Static210.aClass3_Sub25_Sub1_3.method8599() << 3;
																			Static659.anInt10542 = Static210.aClass3_Sub25_Sub1_3.method8646();
																			while (Static210.aClass3_Sub25_Sub1_3.anInt9765 < Static467.anInt7682) {
																				@Pc(5634) Class336 local5634 = Static269.method4387()[Static210.aClass3_Sub25_Sub1_3.method8632()];
																				Static413.method5904(local5634);
																			}
																			Static175.aClass180_68 = null;
																			return true;
																		} else if (Static63.aClass180_19 == Static175.aClass180_68) {
																			local236 = Static210.aClass3_Sub25_Sub1_3.method8639();
																			local611 = Static210.aClass3_Sub25_Sub1_3.method8613();
																			Static502.method3752();
																			Static197.method3579(local236, local611);
																			Static175.aClass180_68 = null;
																			return true;
																		} else if (Static672.aClass180_220 == Static175.aClass180_68) {
																			Static413.anInt6608 = Static629.anInt10041;
																			if (Static467.anInt7682 == 0) {
																				Static41.aClass189Array1 = null;
																				Static506.aString85 = null;
																				Static459.aString83 = null;
																				Static175.aClass180_68 = null;
																				Static590.anInt9480 = 0;
																				return true;
																			}
																			Static459.aString83 = Static210.aClass3_Sub25_Sub1_3.method8613();
																			local265 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
																			if (local265) {
																				Static210.aClass3_Sub25_Sub1_3.method8613();
																			}
																			@Pc(5715) long local5715 = Static210.aClass3_Sub25_Sub1_3.method8600();
																			Static506.aString85 = Static28.method669(local5715);
																			Static198.aByte172 = Static210.aClass3_Sub25_Sub1_3.method8621();
																			local501 = Static210.aClass3_Sub25_Sub1_3.method8632();
																			if (local501 == 255) {
																				Static175.aClass180_68 = null;
																				return true;
																			}
																			Static590.anInt9480 = local501;
																			@Pc(5741) Class189[] local5741 = new Class189[100];
																			for (local1598 = 0; local1598 < Static590.anInt9480; local1598++) {
																				local5741[local1598] = new Class189();
																				local5741[local1598].aString51 = Static210.aClass3_Sub25_Sub1_3.method8613();
																				local265 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
																				if (local265) {
																					local5741[local1598].aString50 = Static210.aClass3_Sub25_Sub1_3.method8613();
																				} else {
																					local5741[local1598].aString50 = local5741[local1598].aString51;
																				}
																				local5741[local1598].aString52 = Static629.method8792(local5741[local1598].aString50);
																				local5741[local1598].anInt5136 = Static210.aClass3_Sub25_Sub1_3.method8593();
																				local5741[local1598].aByte76 = Static210.aClass3_Sub25_Sub1_3.method8621();
																				local5741[local1598].aString53 = Static210.aClass3_Sub25_Sub1_3.method8613();
																				if (local5741[local1598].aString50.equals(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aString123)) {
																					Static127.aByte33 = local5741[local1598].aByte76;
																				}
																			}
																			local2332 = Static590.anInt9480;
																			while (local2332 > 0) {
																				local4619 = true;
																				local2332--;
																				for (local2893 = 0; local2893 < local2332; local2893++) {
																					if (local5741[local2893].aString52.compareTo(local5741[local2893 + 1].aString52) > 0) {
																						local3169 = local5741[local2893];
																						local5741[local2893] = local5741[local2893 + 1];
																						local5741[local2893 + 1] = local3169;
																						local4619 = false;
																					}
																				}
																				if (local4619) {
																					break;
																				}
																			}
																			Static41.aClass189Array1 = local5741;
																			Static175.aClass180_68 = null;
																			return true;
																		} else if (Static175.aClass180_68 == Static544.aClass180_178) {
																			Static300.method4619();
																			Static175.aClass180_68 = null;
																			return false;
																		} else if (Static274.aClass180_110 == Static175.aClass180_68) {
																			Static502.method3752();
																			Static98.method1750();
																			Static175.aClass180_68 = null;
																			return true;
																		} else if (Static133.aClass180_217 == Static175.aClass180_68) {
																			local236 = Static210.aClass3_Sub25_Sub1_3.method8605();
																			local75 = Static210.aClass3_Sub25_Sub1_3.method8639();
																			local497 = Static210.aClass3_Sub25_Sub1_3.method8639();
																			local501 = Static210.aClass3_Sub25_Sub1_3.method8593();
																			Static502.method3752();
																			Static132.method2498(local75 | local497 << 16, local236, local501, 7);
																			Static175.aClass180_68 = null;
																			return true;
																		} else if (Static175.aClass180_68 == Static226.aClass180_90) {
																			local236 = Static210.aClass3_Sub25_Sub1_3.method8632();
																			local75 = local236 >> 5;
																			local497 = local236 & 0x1F;
																			if (local497 == 0) {
																				Static292.aClass142Array1[local75] = null;
																				Static175.aClass180_68 = null;
																				return true;
																			}
																			@Pc(5995) Class142 local5995 = new Class142();
																			local5995.anInt4300 = local497;
																			local5995.anInt4303 = Static210.aClass3_Sub25_Sub1_3.method8632();
																			if (local5995.anInt4303 >= 0 && Static26.aClass33Array2.length > local5995.anInt4303) {
																				if (local5995.anInt4300 == 1 || local5995.anInt4300 == 10) {
																					local5995.anInt4302 = Static210.aClass3_Sub25_Sub1_3.method8593();
																					Static210.aClass3_Sub25_Sub1_3.anInt9765 += 6;
																				} else if (local5995.anInt4300 >= 2 && local5995.anInt4300 <= 6) {
																					if (local5995.anInt4300 == 2) {
																						local5995.anInt4304 = 256;
																						local5995.anInt4299 = 256;
																					}
																					if (local5995.anInt4300 == 3) {
																						local5995.anInt4299 = 256;
																						local5995.anInt4304 = 0;
																					}
																					if (local5995.anInt4300 == 4) {
																						local5995.anInt4299 = 256;
																						local5995.anInt4304 = 512;
																					}
																					if (local5995.anInt4300 == 5) {
																						local5995.anInt4299 = 0;
																						local5995.anInt4304 = 256;
																					}
																					if (local5995.anInt4300 == 6) {
																						local5995.anInt4299 = 512;
																						local5995.anInt4304 = 256;
																					}
																					local5995.anInt4300 = 2;
																					local5995.anInt4305 = Static210.aClass3_Sub25_Sub1_3.method8632();
																					local5995.anInt4304 += Static210.aClass3_Sub25_Sub1_3.method8593() - Static287.anInt4910 << 9;
																					local5995.anInt4299 += Static210.aClass3_Sub25_Sub1_3.method8593() - Static72.anInt1361 << 9;
																					local5995.anInt4295 = Static210.aClass3_Sub25_Sub1_3.method8632() << 2;
																					local5995.anInt4296 = Static210.aClass3_Sub25_Sub1_3.method8593();
																				}
																				local5995.anInt4298 = Static210.aClass3_Sub25_Sub1_3.method8593();
																				if (local5995.anInt4298 == 65535) {
																					local5995.anInt4298 = -1;
																				}
																				Static292.aClass142Array1[local75] = local5995;
																			}
																			Static175.aClass180_68 = null;
																			return true;
																		} else if (Static292.aClass180_114 == Static175.aClass180_68) {
																			if (Static110.anInt2265 != -1) {
																				Static610.method8667(0, Static110.anInt2265);
																			}
																			Static175.aClass180_68 = null;
																			return true;
																		} else if (Static175.aClass180_68 == Static454.aClass180_128) {
																			Static413.method5904(Static313.aClass336_11);
																			Static175.aClass180_68 = null;
																			return true;
																		} else if (Static175.aClass180_68 == Static642.aClass180_206) {
																			local236 = Static210.aClass3_Sub25_Sub1_3.method8609();
																			local75 = Static210.aClass3_Sub25_Sub1_3.method8644();
																			if (local75 == 65535) {
																				local75 = -1;
																			}
																			local497 = Static210.aClass3_Sub25_Sub1_3.method8609();
																			Static120.method2297(local497, local236, local75);
																			Static175.aClass180_68 = null;
																			return true;
																		} else if (Static175.aClass180_68 == Static507.aClass180_162) {
																			local236 = Static210.aClass3_Sub25_Sub1_3.method8647();
																			local75 = Static210.aClass3_Sub25_Sub1_3.method8593();
																			if (local75 == 65535) {
																				local75 = -1;
																			}
																			local497 = Static210.aClass3_Sub25_Sub1_3.method8646();
																			Static101.method1777(local75, local497, local236);
																			Static175.aClass180_68 = null;
																			return true;
																		} else if (Static271.aClass180_194 == Static175.aClass180_68) {
																			Static216.anInt4122 = Static629.anInt10041;
																			local265 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
																			if (Static467.anInt7682 != 1) {
																				if (local265) {
																					Static333.aClass185_7 = new Class185(Static210.aClass3_Sub25_Sub1_3);
																				} else {
																					Static84.aClass185_1 = new Class185(Static210.aClass3_Sub25_Sub1_3);
																				}
																				Static175.aClass180_68 = null;
																				return true;
																			}
																			Static175.aClass180_68 = null;
																			if (local265) {
																				Static333.aClass185_7 = null;
																			} else {
																				Static84.aClass185_1 = null;
																			}
																			return true;
																		} else if (Static486.aClass180_165 == Static175.aClass180_68) {
																			Static621.anInt9951 = Static629.anInt10041;
																			local265 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
																			if (Static467.anInt7682 != 1) {
																				if (local265) {
																					Static90.aClass3_Sub30_10 = new Class3_Sub30(Static210.aClass3_Sub25_Sub1_3);
																				} else {
																					Static195.aClass3_Sub30_4 = new Class3_Sub30(Static210.aClass3_Sub25_Sub1_3);
																				}
																				Static175.aClass180_68 = null;
																				return true;
																			}
																			Static175.aClass180_68 = null;
																			if (local265) {
																				Static90.aClass3_Sub30_10 = null;
																			} else {
																				Static195.aClass3_Sub30_4 = null;
																			}
																			return true;
																		} else if (Static175.aClass180_68 == Static350.aClass180_131) {
																			Static132.anInt2721 = Static210.aClass3_Sub25_Sub1_3.method8589();
																			Static126.anInt2583 = Static629.anInt10041;
																			Static175.aClass180_68 = null;
																			return true;
																		} else if (Static175.aClass180_68 == Static72.aClass180_24) {
																			local236 = Static210.aClass3_Sub25_Sub1_3.method8593();
																			local2471 = Static210.aClass3_Sub25_Sub1_3.method8643();
																			Static502.method3752();
																			Static640.method8895(local2471, local236);
																			Static175.aClass180_68 = null;
																			return true;
																		} else if (Static50.aClass180_16 == Static175.aClass180_68) {
																			local2093 = Static210.aClass3_Sub25_Sub1_3.method8613();
																			local75 = Static210.aClass3_Sub25_Sub1_3.method8593();
																			local318 = Static143.aClass77_1.method2082(local75).method8274(Static210.aClass3_Sub25_Sub1_3);
																			Static470.method6813(19, local2093, local2093, local75, local2093, 0, local318, (String) null);
																			Static175.aClass180_68 = null;
																			return true;
																		} else if (Static175.aClass180_68 == Static456.aClass180_187) {
																			Static413.method5904(Static41.aClass336_3);
																			Static175.aClass180_68 = null;
																			return true;
																		} else if (Static175.aClass180_68 == Static248.aClass180_97) {
																			local236 = Static210.aClass3_Sub25_Sub1_3.method8593();
																			if (local236 == 65535) {
																				local236 = -1;
																			}
																			local75 = Static210.aClass3_Sub25_Sub1_3.method8632();
																			local497 = Static210.aClass3_Sub25_Sub1_3.method8593();
																			local501 = Static210.aClass3_Sub25_Sub1_3.method8632();
																			local505 = Static210.aClass3_Sub25_Sub1_3.method8593();
																			Static264.method4359(false, local497, local75, local236, local501, local505);
																			Static175.aClass180_68 = null;
																			return true;
																		} else if (Static175.aClass180_68 == Static315.aClass180_119) {
																			local236 = Static210.aClass3_Sub25_Sub1_3.method8639();
																			local75 = Static210.aClass3_Sub25_Sub1_3.method8592();
																			Static502.method3752();
																			Static119.method2268(local75, local236);
																			Static175.aClass180_68 = null;
																			return true;
																		} else if (Static384.aClass180_144 == Static175.aClass180_68) {
																			local236 = Static210.aClass3_Sub25_Sub1_3.method8592();
																			local75 = Static210.aClass3_Sub25_Sub1_3.method8636();
																			Static131.aClass66_1.method1632(local236, local75);
																			Static175.aClass180_68 = null;
																			return true;
																		} else if (Static343.aClass180_124 == Static175.aClass180_68) {
																			local236 = Static210.aClass3_Sub25_Sub1_3.method8639();
																			local75 = Static210.aClass3_Sub25_Sub1_3.method8615();
																			local3066 = (local75 & 0x1) == 1;
																			Static60.method1287(local236, local3066);
																			Static37.anIntArray72[Static63.anInt1267++ & 0x1F] = local236;
																			Static175.aClass180_68 = null;
																			return true;
																		} else {
																			@Pc(6765) boolean local6765;
																			if (Static175.aClass180_68 == Static676.aClass180_221) {
																				local236 = Static210.aClass3_Sub25_Sub1_3.method8609();
																				local75 = Static210.aClass3_Sub25_Sub1_3.method8639();
																				local497 = Static210.aClass3_Sub25_Sub1_3.method8592();
																				local501 = Static210.aClass3_Sub25_Sub1_3.method8644();
																				local505 = Static210.aClass3_Sub25_Sub1_3.method8646();
																				local1598 = Static210.aClass3_Sub25_Sub1_3.method8610();
																				local381 = local505 & 0x7;
																				local2272 = local505 >> 3 & 0xF;
																				if (local2272 == 15) {
																					local2272 = -1;
																				}
																				if (local1598 >> 30 == 0) {
																					@Pc(6815) Class372 local6815;
																					@Pc(6792) Class144 local6792;
																					@Pc(6809) Class372 local6809;
																					if (local1598 >> 29 != 0) {
																						local2332 = local1598 & 0xFFFF;
																						@Pc(6961) Class3_Sub3 local6961 = (Class3_Sub3) Static522.aClass83_34.method2368((long) local2332);
																						if (local6961 != null) {
																							@Pc(6966) Class28_Sub1_Sub1_Sub1_Sub2 local6966 = local6961.aClass28_Sub1_Sub1_Sub1_Sub2_1;
																							@Pc(6971) Class280 local6971 = local6966.aClass280Array3[local236];
																							if (local497 == 65535) {
																								local497 = -1;
																							}
																							local2901 = true;
																							local2903 = local6971.anInt7952;
																							if (local497 != -1 && local2903 != -1) {
																								if (local497 == local2903) {
																									local6792 = Static354.aClass236_2.method5615(local497);
																									if (local6792.aBoolean324 && local6792.anInt4332 != -1) {
																										local6809 = Static243.aClass343_3.method8356(local6792.anInt4332);
																										@Pc(7060) int local7060 = local6809.anInt10254;
																										if (local7060 == 0 || local7060 == 2) {
																											local2901 = false;
																										} else if (local7060 == 1) {
																											local2901 = true;
																										}
																									}
																								} else {
																									local6792 = Static354.aClass236_2.method5615(local497);
																									@Pc(7007) Class144 local7007 = Static354.aClass236_2.method5615(local2903);
																									if (local6792.anInt4332 != -1 && local7007.anInt4332 != -1) {
																										local6815 = Static243.aClass343_3.method8356(local6792.anInt4332);
																										@Pc(7029) Class372 local7029 = Static243.aClass343_3.method8356(local7007.anInt4332);
																										if (local7029.anInt10249 > local6815.anInt10249) {
																											local2901 = false;
																										}
																									}
																								}
																							}
																							if (local2901) {
																								local6971.anInt7951 = 1;
																								local6971.anInt7953 = local381;
																								local6971.anInt7948 = local75;
																								local6971.anInt7959 = 0;
																								local6971.anInt7952 = local497;
																								local6971.anInt7956 = 0;
																								local6971.anInt7958 = local2272;
																								local6971.anInt7957 = local501 + Static588.anInt9467;
																								if (local6971.anInt7957 > Static588.anInt9467) {
																									local6971.anInt7959 = -1;
																								}
																								if (local6971.anInt7952 == 65535) {
																									local6971.anInt7952 = -1;
																								}
																								if (local6971.anInt7952 != -1 && local6971.anInt7957 == Static588.anInt9467) {
																									local5274 = Static354.aClass236_2.method5615(local6971.anInt7952).anInt4332;
																									if (local5274 != -1) {
																										local6809 = Static243.aClass343_3.method8356(local5274);
																										if (local6809 != null && local6809.anIntArray901 != null && !local6966.aBoolean819) {
																											Static548.method7844(local6966, local6809, 0);
																										}
																									}
																								}
																							}
																						}
																					} else if (local1598 >> 28 != 0) {
																						local2332 = local1598 & 0xFFFF;
																						@Pc(6743) Class28_Sub1_Sub1_Sub1_Sub1 local6743;
																						if (local2332 == Static106.anInt2205) {
																							local6743 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2;
																						} else {
																							local6743 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local2332];
																						}
																						if (local6743 != null) {
																							if (local497 == 65535) {
																								local497 = -1;
																							}
																							@Pc(6763) Class280 local6763 = local6743.aClass280Array3[local236];
																							local6765 = true;
																							local1284 = local6763.anInt7952;
																							@Pc(6847) Class372 local6847;
																							if (local497 != -1 && local1284 != -1) {
																								@Pc(6787) Class144 local6787;
																								if (local497 == local1284) {
																									local6787 = Static354.aClass236_2.method5615(local497);
																									if (local6787.aBoolean324 && local6787.anInt4332 != -1) {
																										local6847 = Static243.aClass343_3.method8356(local6787.anInt4332);
																										@Pc(6850) int local6850 = local6847.anInt10254;
																										if (local6850 == 0 || local6850 == 2) {
																											local6765 = false;
																										} else if (local6850 == 1) {
																											local6765 = true;
																										}
																									}
																								} else {
																									local6787 = Static354.aClass236_2.method5615(local497);
																									local6792 = Static354.aClass236_2.method5615(local1284);
																									if (local6787.anInt4332 != -1 && local6792.anInt4332 != -1) {
																										local6809 = Static243.aClass343_3.method8356(local6787.anInt4332);
																										local6815 = Static243.aClass343_3.method8356(local6792.anInt4332);
																										if (local6809.anInt10249 < local6815.anInt10249) {
																											local6765 = false;
																										}
																									}
																								}
																							}
																							if (local6765) {
																								local6763.anInt7951 = 1;
																								local6763.anInt7952 = local497;
																								local6763.anInt7957 = Static588.anInt9467 + local501;
																								local6763.anInt7948 = local75;
																								local6763.anInt7953 = local381;
																								local6763.anInt7958 = local2272;
																								local6763.anInt7959 = 0;
																								local6763.anInt7956 = 0;
																								if (local6763.anInt7952 == 65535) {
																									local6763.anInt7952 = -1;
																								}
																								if (Static588.anInt9467 < local6763.anInt7957) {
																									local6763.anInt7959 = -1;
																								}
																								if (local6763.anInt7952 != -1 && local6763.anInt7957 == Static588.anInt9467) {
																									local2903 = Static354.aClass236_2.method5615(local6763.anInt7952).anInt4332;
																									if (local2903 != -1) {
																										local6847 = Static243.aClass343_3.method8356(local2903);
																										if (local6847 != null && local6847.anIntArray901 != null && !local6743.aBoolean819) {
																											Static548.method7844(local6743, local6847, 0);
																										}
																									}
																								}
																							}
																						}
																					}
																				} else {
																					local2332 = local1598 >> 28 & 0x3;
																					local2893 = (local1598 >> 14 & 0x3FFF) - Static287.anInt4910;
																					local5263 = (local1598 & 0x3FFF) - Static72.anInt1361;
																					if (local2893 >= 0 && local5263 >= 0 && local2893 < Static158.anInt927 && local5263 < Static515.anInt8292) {
																						local1213 = local2893 * 512 + 256;
																						local1284 = local5263 * 512 + 256;
																						local2903 = local2332;
																						if (local2332 < 3 && Static488.method7052(local2893, local5263)) {
																							local2903 = local2332 + 1;
																						}
																						@Pc(6714) Class28_Sub1_Sub1_Sub4 local6714 = new Class28_Sub1_Sub1_Sub4(local497, local501, Static588.anInt9467, local2332, local2903, local1213, Static168.method3058(local2332, local1213, local1284) - local75, local1284, local2893, local2893, local5263, local5263, local381);
																						Static540.aClass338_202.method8171(new Class3_Sub11_Sub13(local6714));
																					}
																				}
																				Static175.aClass180_68 = null;
																				return true;
																			} else if (Static346.aClass180_126 == Static175.aClass180_68) {
																				local236 = Static210.aClass3_Sub25_Sub1_3.method8593();
																				local75 = Static210.aClass3_Sub25_Sub1_3.method8593();
																				local497 = Static210.aClass3_Sub25_Sub1_3.method8593();
																				Static502.method3752();
																				if (Static489.aClass260ArrayArray3[local236] != null) {
																					for (local501 = local75; local501 < local497; local501++) {
																						local505 = Static210.aClass3_Sub25_Sub1_3.method8607();
																						if (local501 < Static489.aClass260ArrayArray3[local236].length && Static489.aClass260ArrayArray3[local236][local501] != null) {
																							Static489.aClass260ArrayArray3[local236][local501].anInt6992 = local505;
																						}
																					}
																				}
																				Static175.aClass180_68 = null;
																				return true;
																			} else if (Static360.aClass180_134 == Static175.aClass180_68) {
																				local236 = Static210.aClass3_Sub25_Sub1_3.method8632();
																				if (Static210.aClass3_Sub25_Sub1_3.method8632() == 0) {
																					Static236.aClass283Array1[local236] = new Class283();
																				} else {
																					Static210.aClass3_Sub25_Sub1_3.anInt9765--;
																					Static236.aClass283Array1[local236] = new Class283(Static210.aClass3_Sub25_Sub1_3);
																				}
																				Static164.anInt3235 = Static629.anInt10041;
																				Static175.aClass180_68 = null;
																				return true;
																			} else if (Static175.aClass180_68 == Static115.aClass180_40) {
																				local265 = Static210.aClass3_Sub25_Sub1_3.method8632() == 1;
																				local611 = Static210.aClass3_Sub25_Sub1_3.method8613();
																				local318 = local611;
																				if (local265) {
																					local318 = Static210.aClass3_Sub25_Sub1_3.method8613();
																				}
																				local2877 = (long) Static210.aClass3_Sub25_Sub1_3.method8593();
																				local2882 = (long) Static210.aClass3_Sub25_Sub1_3.method8607();
																				local2272 = Static210.aClass3_Sub25_Sub1_3.method8632();
																				local2332 = Static210.aClass3_Sub25_Sub1_3.method8593();
																				@Pc(7324) long local7324 = (local2877 << 32) + local2882;
																				local6765 = false;
																				local1284 = 0;
																				while (true) {
																					if (local1284 >= 100) {
																						if (local2272 <= 1 && Static627.method8777(local318)) {
																							local6765 = true;
																						}
																						break;
																					}
																					if (local7324 == Static367.aLongArray12[local1284]) {
																						local6765 = true;
																						break;
																					}
																					local1284++;
																				}
																				if (!local6765 && Static355.anInt5755 == 0) {
																					Static367.aLongArray12[Static505.anInt8188] = local7324;
																					Static505.anInt8188 = (Static505.anInt8188 + 1) % 100;
																					local4438 = Static143.aClass77_1.method2082(local2332).method8274(Static210.aClass3_Sub25_Sub1_3);
																					if (local2272 == 2) {
																						Static470.method6813(18, "<img=1>" + local611, local611, local2332, "<img=1>" + local318, 0, local4438, (String) null);
																					} else if (local2272 == 1) {
																						Static470.method6813(18, "<img=0>" + local611, local611, local2332, "<img=0>" + local318, 0, local4438, (String) null);
																					} else {
																						Static470.method6813(18, local611, local611, local2332, local318, 0, local4438, (String) null);
																					}
																				}
																				Static175.aClass180_68 = null;
																				return true;
																			} else if (Static384.aClass180_145 == Static175.aClass180_68) {
																				Static553.aString107 = Static467.anInt7682 <= 2 ? Static601.aClass346_28.method8440(Static609.anInt9834) : Static210.aClass3_Sub25_Sub1_3.method8613();
																				Static13.anInt138 = Static467.anInt7682 > 0 ? Static210.aClass3_Sub25_Sub1_3.method8593() : -1;
																				if (Static13.anInt138 == 65535) {
																					Static13.anInt138 = -1;
																				}
																				Static175.aClass180_68 = null;
																				return true;
																			} else if (Static421.aClass180_152 == Static175.aClass180_68) {
																				local236 = Static210.aClass3_Sub25_Sub1_3.method8636();
																				local75 = Static210.aClass3_Sub25_Sub1_3.method8592();
																				if (local75 == 65535) {
																					local75 = -1;
																				}
																				local497 = Static210.aClass3_Sub25_Sub1_3.method8639();
																				local501 = Static210.aClass3_Sub25_Sub1_3.method8592();
																				if (local501 == 65535) {
																					local501 = -1;
																				}
																				Static502.method3752();
																				for (local505 = local75; local505 <= local501; local505++) {
																					local2882 = (long) local505 + ((long) local236 << 32);
																					local5548 = (Class3_Sub48) Static300.aClass83_15.method2368(local2882);
																					if (local5548 != null) {
																						local5557 = new Class3_Sub48(local5548.anInt8078, local497);
																						local5548.method9380();
																					} else if (local505 == -1) {
																						local5557 = new Class3_Sub48(Static383.method5492(local236).aClass3_Sub48_1.anInt8078, local497);
																					} else {
																						local5557 = new Class3_Sub48(0, local497);
																					}
																					Static300.aClass83_15.method2377(local2882, local5557);
																				}
																				Static175.aClass180_68 = null;
																				return true;
																			} else {
																				Static503.method7153("T1 - " + (Static175.aClass180_68 == null ? -1 : Static175.aClass180_68.method4564()) + "," + (Static345.aClass180_125 == null ? -1 : Static345.aClass180_125.method4564()) + "," + (Static254.aClass180_101 == null ? -1 : Static254.aClass180_101.method4564()) + " - " + Static467.anInt7682, (Throwable) null);
																				Static67.method1352(false);
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
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILclient!ka;III)Lclient!el;")
	public static Class92 method8990(@OriginalArg(1) Class95 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return arg0 == null ? null : new Class92(arg2, arg3, arg1, arg0.na(), arg0.V(), arg0.RA(), arg0.fa(), arg0.EA(), arg0.HA(), arg0.G());
	}
}
