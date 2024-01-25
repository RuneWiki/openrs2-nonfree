import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "Lclient!rp;")
	public static Class293 aClass293_1 = new Class293(8);

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "[I")
	public static final int[] anIntArray63 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "[Lclient!bt;")
	public static final Class37[] aClass37Array1 = new Class37[16];

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)Z")
	public static boolean method1264() throws IOException {
		if (Static412.aClass51_25 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static17.aClass218_2 == null) {
			if (Static631.aBoolean871) {
				if (!Static412.aClass51_25.method3507(1)) {
					return false;
				}
				Static412.aClass51_25.method3509(0, 1, Static281.aClass3_Sub15_Sub1_4.aByteArray106);
				Static631.aBoolean871 = false;
				Static448.anInt8138 = 0;
				Static197.anInt4621++;
			}
			Static281.aClass3_Sub15_Sub1_4.anInt10282 = 0;
			if (Static281.aClass3_Sub15_Sub1_4.method2433()) {
				if (!Static412.aClass51_25.method3507(1)) {
					return false;
				}
				Static412.aClass51_25.method3509(1, 1, Static281.aClass3_Sub15_Sub1_4.aByteArray106);
				Static448.anInt8138 = 0;
				Static197.anInt4621++;
			}
			Static631.aBoolean871 = true;
			@Pc(69) Class218[] local69 = Static437.method6647();
			local73 = Static281.aClass3_Sub15_Sub1_4.method2437();
			if (local73 < 0 || local73 >= local69.length) {
				throw new IOException("invo:" + local73 + " ip:" + Static281.aClass3_Sub15_Sub1_4.anInt10282);
			}
			Static17.aClass218_2 = local69[local73];
			Static172.anInt4126 = Static17.aClass218_2.anInt6933;
		}
		if (Static172.anInt4126 == -1) {
			if (!Static412.aClass51_25.method3507(1)) {
				return false;
			}
			Static412.aClass51_25.method3509(0, 1, Static281.aClass3_Sub15_Sub1_4.aByteArray106);
			Static448.anInt8138 = 0;
			Static197.anInt4621++;
			Static172.anInt4126 = Static281.aClass3_Sub15_Sub1_4.aByteArray106[0] & 0xFF;
		}
		if (Static172.anInt4126 == -2) {
			if (!Static412.aClass51_25.method3507(2)) {
				return false;
			}
			Static412.aClass51_25.method3509(0, 2, Static281.aClass3_Sub15_Sub1_4.aByteArray106);
			Static281.aClass3_Sub15_Sub1_4.anInt10282 = 0;
			Static172.anInt4126 = Static281.aClass3_Sub15_Sub1_4.method8414();
			Static197.anInt4621 += 2;
			Static448.anInt8138 = 0;
		}
		if (Static172.anInt4126 > 0) {
			if (!Static412.aClass51_25.method3507(Static172.anInt4126)) {
				return false;
			}
			Static281.aClass3_Sub15_Sub1_4.anInt10282 = 0;
			Static412.aClass51_25.method3509(0, Static172.anInt4126, Static281.aClass3_Sub15_Sub1_4.aByteArray106);
			Static448.anInt8138 = 0;
			Static197.anInt4621 += Static172.anInt4126;
		}
		Static614.aClass218_148 = Static276.aClass218_71;
		Static276.aClass218_71 = Static177.aClass218_47;
		Static177.aClass218_47 = Static17.aClass218_2;
		@Pc(215) int local215;
		if (Static613.aClass218_146 == Static17.aClass218_2) {
			local215 = Static281.aClass3_Sub15_Sub1_4.method8402();
			Static203.aClass376_15 = Static379.aClass228_6.method5943(local215);
			Static17.aClass218_2 = null;
			return true;
		} else if (Static17.aClass218_2 == Static532.aClass218_125) {
			local215 = Static281.aClass3_Sub15_Sub1_4.method8414();
			local73 = Static281.aClass3_Sub15_Sub1_4.method8463();
			Static514.aClass166_1.method4935(local73, local215);
			Static17.aClass218_2 = null;
			return true;
		} else {
			@Pc(275) int local275;
			if (Static387.aClass218_89 == Static17.aClass218_2) {
				local215 = Static281.aClass3_Sub15_Sub1_4.method8460();
				local73 = Static281.aClass3_Sub15_Sub1_4.method8424();
				Static44.method2076();
				if (local73 == 2) {
					Static444.method6716();
				}
				Static530.anInt9144 = local215;
				Static415.method6509(local215);
				Static557.method7852(false);
				Static84.method2225(Static530.anInt9144);
				for (local275 = 0; local275 < 100; local275++) {
					Static178.aBooleanArray12[local275] = true;
				}
				Static17.aClass218_2 = null;
				return true;
			} else if (Static17.aClass218_2 == Static369.aClass218_86) {
				Static281.aClass3_Sub15_Sub1_4.anInt10282 += 28;
				if (Static281.aClass3_Sub15_Sub1_4.method8412()) {
					Static313.method5326(Static281.aClass3_Sub15_Sub1_4, Static281.aClass3_Sub15_Sub1_4.anInt10282 - 28);
				}
				Static17.aClass218_2 = null;
				return true;
			} else if (Static17.aClass218_2 == Static48.aClass218_13) {
				Static116.method2773(Static373.aClass20_14);
				Static17.aClass218_2 = null;
				return true;
			} else if (Static17.aClass218_2 == Static77.aClass218_43) {
				Static116.method2773(Static160.aClass20_7);
				Static17.aClass218_2 = null;
				return true;
			} else if (Static539.aClass218_128 == Static17.aClass218_2) {
				local215 = Static281.aClass3_Sub15_Sub1_4.method8418();
				Static44.method2076();
				Static362.method5870(-1, local215, -1, 3);
				Static17.aClass218_2 = null;
				return true;
			} else if (Static17.aClass218_2 == Static153.aClass218_41) {
				local215 = Static281.aClass3_Sub15_Sub1_4.method8463();
				local73 = Static281.aClass3_Sub15_Sub1_4.method8460();
				Static44.method2076();
				Static610.method8294(local215, local73);
				Static17.aClass218_2 = null;
				return true;
			} else if (Static17.aClass218_2 == Static629.aClass218_152) {
				Static116.method2773(Static14.aClass20_25);
				Static17.aClass218_2 = null;
				return true;
			} else {
				@Pc(415) Class3_Sub50 local415;
				if (Static451.aClass218_103 == Static17.aClass218_2) {
					local215 = Static281.aClass3_Sub15_Sub1_4.method8463();
					local73 = Static281.aClass3_Sub15_Sub1_4.method8418();
					Static44.method2076();
					@Pc(408) Class3_Sub50 local408 = (Class3_Sub50) Static40.aClass307_5.method7424((long) local73);
					local415 = (Class3_Sub50) Static40.aClass307_5.method7424((long) local215);
					if (local415 != null) {
						Static488.method7168(local408 == null || local415.anInt9575 != local408.anInt9575, false, local415);
					}
					if (local408 != null) {
						local408.method8671();
						Static40.aClass307_5.method7425((long) local215, local408);
					}
					@Pc(446) Class108 local446 = Static113.method8285(local73);
					if (local446 != null) {
						Static139.method3135(local446);
					}
					local446 = Static113.method8285(local215);
					if (local446 != null) {
						Static139.method3135(local446);
						Static62.method1330(true, local446);
					}
					if (Static530.anInt9144 != -1) {
						Static172.method3556(1, Static530.anInt9144);
					}
					Static17.aClass218_2 = null;
					return true;
				} else if (Static460.aClass218_108 == Static17.aClass218_2) {
					Static116.method2773(Static290.aClass20_9);
					Static17.aClass218_2 = null;
					return true;
				} else if (Static17.aClass218_2 == Static525.aClass218_122) {
					Static381.method6052();
					Static17.aClass218_2 = null;
					return true;
				} else if (Static24.aClass218_4 == Static17.aClass218_2) {
					Static116.method2773(Static533.aClass20_22);
					Static17.aClass218_2 = null;
					return true;
				} else {
					@Pc(564) int local564;
					@Pc(580) int local580;
					@Pc(542) boolean local542;
					@Pc(682) boolean local682;
					@Pc(677) int local677;
					@Pc(684) int local684;
					@Pc(702) Class323 local702;
					if (Static275.aClass218_70 == Static17.aClass218_2) {
						Static344.anInt6772 = Static244.anInt5487;
						if (Static172.anInt4126 == 0) {
							Static517.aString100 = null;
							Static17.aClass218_2 = null;
							Static191.aString44 = null;
							Static126.anInt3181 = 0;
							Static646.aClass323Array1 = null;
							return true;
						}
						Static191.aString44 = Static281.aClass3_Sub15_Sub1_4.method8413();
						local542 = Static281.aClass3_Sub15_Sub1_4.method8401() == 1;
						if (local542) {
							Static281.aClass3_Sub15_Sub1_4.method8413();
						}
						@Pc(552) long local552 = Static281.aClass3_Sub15_Sub1_4.method8400();
						Static517.aString100 = Static123.method2859(local552);
						Static350.aByte93 = Static281.aClass3_Sub15_Sub1_4.method8440();
						local564 = Static281.aClass3_Sub15_Sub1_4.method8401();
						if (local564 == 255) {
							Static17.aClass218_2 = null;
							return true;
						}
						Static126.anInt3181 = local564;
						@Pc(578) Class323[] local578 = new Class323[100];
						for (local580 = 0; local580 < Static126.anInt3181; local580++) {
							local578[local580] = new Class323();
							local578[local580].aString105 = Static281.aClass3_Sub15_Sub1_4.method8413();
							local542 = Static281.aClass3_Sub15_Sub1_4.method8401() == 1;
							if (local542) {
								local578[local580].aString107 = Static281.aClass3_Sub15_Sub1_4.method8413();
							} else {
								local578[local580].aString107 = local578[local580].aString105;
							}
							local578[local580].aString106 = Static629.method8529(local578[local580].aString107);
							local578[local580].anInt9459 = Static281.aClass3_Sub15_Sub1_4.method8414();
							local578[local580].aByte116 = Static281.aClass3_Sub15_Sub1_4.method8440();
							local578[local580].aString108 = Static281.aClass3_Sub15_Sub1_4.method8413();
							if (local578[local580].aString107.equals(Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aString68)) {
								Static493.aByte105 = local578[local580].aByte116;
							}
						}
						local677 = Static126.anInt3181;
						while (local677 > 0) {
							local677--;
							local682 = true;
							for (local684 = 0; local684 < local677; local684++) {
								if (local578[local684].aString106.compareTo(local578[local684 + 1].aString106) > 0) {
									local702 = local578[local684];
									local578[local684] = local578[local684 + 1];
									local682 = false;
									local578[local684 + 1] = local702;
								}
							}
							if (local682) {
								break;
							}
						}
						Static17.aClass218_2 = null;
						Static646.aClass323Array1 = local578;
						return true;
					}
					@Pc(756) String local756;
					@Pc(744) String local744;
					if (Static410.aClass218_92 == Static17.aClass218_2) {
						local744 = Static281.aClass3_Sub15_Sub1_4.method8413();
						local73 = Static281.aClass3_Sub15_Sub1_4.method8414();
						local756 = Static221.aClass136_1.method4290(local73).method7183(Static281.aClass3_Sub15_Sub1_4);
						Static194.method3870(19, local744, local756, null, local744, local73, 0, local744);
						Static17.aClass218_2 = null;
						return true;
					} else if (Static17.aClass218_2 == Static301.aClass218_75) {
						Static116.method2773(Static467.aClass20_19);
						Static17.aClass218_2 = null;
						return true;
					} else if (Static17.aClass218_2 == Static95.aClass218_25) {
						local215 = Static281.aClass3_Sub15_Sub1_4.method8463();
						local73 = Static281.aClass3_Sub15_Sub1_4.method8426();
						local275 = Static281.aClass3_Sub15_Sub1_4.method8424();
						Static44.method2076();
						local415 = (Class3_Sub50) Static40.aClass307_5.method7424((long) local215);
						if (local415 != null) {
							Static488.method7168(local415.anInt9575 != local73, false, local415);
						}
						Static648.method8675(local275, false, local215, local73);
						Static17.aClass218_2 = null;
						return true;
					} else if (Static17.aClass218_2 == Static539.aClass218_127) {
						Static116.method2773(Static21.aClass20_3);
						Static17.aClass218_2 = null;
						return true;
					} else if (Static17.aClass218_2 == Static102.aClass218_139) {
						local215 = Static281.aClass3_Sub15_Sub1_4.method8451();
						local73 = Static281.aClass3_Sub15_Sub1_4.method8414();
						if (local73 == 65535) {
							local73 = -1;
						}
						local275 = Static281.aClass3_Sub15_Sub1_4.method8451();
						Static44.method2076();
						Static350.method5747(local215, local73, local275);
						@Pc(872) Class237 local872 = Static367.aClass281_1.method6975(local73);
						Static180.method3686(local872.anInt7283, local872.anInt7265, local275, local872.anInt7303);
						Static466.method6967(local872.anInt7305, local275, local872.anInt7306, local872.anInt7313);
						Static17.aClass218_2 = null;
						return true;
					} else if (Static324.aClass218_78 == Static17.aClass218_2) {
						local215 = Static281.aClass3_Sub15_Sub1_4.method8447();
						Static44.method2076();
						Static17.aClass218_2 = null;
						Static169.anInt4081 = local215;
						return true;
					} else if (Static138.aClass218_38 == Static17.aClass218_2) {
						if (Static530.anInt9144 != -1) {
							Static172.method3556(0, Static530.anInt9144);
						}
						Static17.aClass218_2 = null;
						return true;
					} else {
						@Pc(955) boolean local955;
						@Pc(987) String local987;
						@Pc(941) String local941;
						if (Static128.aClass218_35 == Static17.aClass218_2) {
							local542 = Static281.aClass3_Sub15_Sub1_4.method8401() == 1;
							local941 = Static281.aClass3_Sub15_Sub1_4.method8413();
							local756 = local941;
							if (local542) {
								local756 = Static281.aClass3_Sub15_Sub1_4.method8413();
							}
							local564 = Static281.aClass3_Sub15_Sub1_4.method8401();
							local955 = false;
							if (local564 <= 1) {
								if (Static351.aBoolean592 && !Static201.aBoolean410 || Static535.aBoolean550) {
									local955 = true;
								} else if (local564 <= 1 && Static57.method8559(local756)) {
									local955 = true;
								}
							}
							if (!local955 && Static560.anInt9560 == 0) {
								local987 = Static320.method5429(Static388.method6124(Static281.aClass3_Sub15_Sub1_4));
								if (local564 == 2) {
									Static194.method3870(24, "<img=1>" + local941, local987, null, "<img=1>" + local756, -1, 0, local941);
								} else if (local564 == 1) {
									Static194.method3870(24, "<img=0>" + local941, local987, null, "<img=0>" + local756, -1, 0, local941);
								} else {
									Static194.method3870(24, local941, local987, null, local756, -1, 0, local941);
								}
							}
							Static17.aClass218_2 = null;
							return true;
						}
						@Pc(1083) String local1083;
						if (Static498.aClass218_116 == Static17.aClass218_2) {
							local215 = Static281.aClass3_Sub15_Sub1_4.method8424();
							local73 = Static281.aClass3_Sub15_Sub1_4.method8461();
							local275 = Static281.aClass3_Sub15_Sub1_4.method8460();
							if (local275 == 65535) {
								local275 = -1;
							}
							local1083 = Static281.aClass3_Sub15_Sub1_4.method8413();
							if (local215 >= 1 && local215 <= 8) {
								if (local1083.equalsIgnoreCase("null")) {
									local1083 = null;
								}
								Static186.aStringArray17[local215 - 1] = local1083;
								Static382.anIntArray440[local215 - 1] = local275;
								Static185.aBooleanArray13[local215 - 1] = local73 == 0;
							}
							Static17.aClass218_2 = null;
							return true;
						} else if (Static251.aClass218_66 == Static17.aClass218_2) {
							Static116.method2773(Static491.aClass20_21);
							Static17.aClass218_2 = null;
							return true;
						} else if (Static112.aClass218_29 == Static17.aClass218_2) {
							Static536.aString103 = Static172.anInt4126 <= 2 ? Static287.aClass176_26.method4986(Static380.anInt7247) : Static281.aClass3_Sub15_Sub1_4.method8413();
							Static639.anInt10498 = Static172.anInt4126 > 0 ? Static281.aClass3_Sub15_Sub1_4.method8414() : -1;
							if (Static639.anInt10498 == 65535) {
								Static639.anInt10498 = -1;
							}
							Static17.aClass218_2 = null;
							return true;
						} else {
							@Pc(1178) byte local1178;
							if (Static17.aClass218_2 == Static644.aClass218_154) {
								local1178 = Static281.aClass3_Sub15_Sub1_4.method8440();
								local73 = Static281.aClass3_Sub15_Sub1_4.method8414();
								Static44.method2076();
								Static292.method5022(local73, local1178);
								Static17.aClass218_2 = null;
								return true;
							} else if (Static610.aClass218_145 == Static17.aClass218_2) {
								Static32.anInt606 = Static281.aClass3_Sub15_Sub1_4.method8424();
								Static154.anInt3787 = Static281.aClass3_Sub15_Sub1_4.method8447();
								Static17.aClass218_2 = null;
								return true;
							} else if (Static17.aClass218_2 == Static56.aClass218_147) {
								local215 = Static281.aClass3_Sub15_Sub1_4.method8429();
								local73 = Static281.aClass3_Sub15_Sub1_4.method8460();
								local275 = Static281.aClass3_Sub15_Sub1_4.method8463();
								local564 = Static281.aClass3_Sub15_Sub1_4.method8460();
								Static44.method2076();
								Static180.method3686(local73, local564, local275, local215);
								Static17.aClass218_2 = null;
								return true;
							} else {
								@Pc(1286) int local1286;
								@Pc(1273) long local1273;
								@Pc(1268) long local1268;
								@Pc(1278) long local1278;
								@Pc(1296) int local1296;
								if (Static21.aClass218_3 == Static17.aClass218_2) {
									local542 = Static281.aClass3_Sub15_Sub1_4.method8401() == 1;
									local941 = Static281.aClass3_Sub15_Sub1_4.method8413();
									local756 = local941;
									if (local542) {
										local756 = Static281.aClass3_Sub15_Sub1_4.method8413();
									}
									local1268 = Static281.aClass3_Sub15_Sub1_4.method8400();
									local1273 = Static281.aClass3_Sub15_Sub1_4.method8414();
									local1278 = Static281.aClass3_Sub15_Sub1_4.method8421();
									local684 = Static281.aClass3_Sub15_Sub1_4.method8401();
									local1286 = Static281.aClass3_Sub15_Sub1_4.method8414();
									@Pc(1292) long local1292 = local1278 + (local1273 << 32);
									@Pc(1294) boolean local1294 = false;
									local1296 = 0;
									while (true) {
										if (local1296 >= 100) {
											if (local684 <= 1 && Static57.method8559(local756)) {
												local1294 = true;
											}
											break;
										}
										if (Static45.aLongArray2[local1296] == local1292) {
											local1294 = true;
											break;
										}
										local1296++;
									}
									if (!local1294 && Static560.anInt9560 == 0) {
										Static45.aLongArray2[Static440.anInt8001] = local1292;
										Static440.anInt8001 = (Static440.anInt8001 + 1) % 100;
										@Pc(1348) String local1348 = Static221.aClass136_1.method4290(local1286).method7183(Static281.aClass3_Sub15_Sub1_4);
										if (local684 == 2) {
											Static194.method3870(20, "<img=1>" + local941, local1348, Static1.method8534(local1268), "<img=1>" + local756, local1286, 0, local941);
										} else if (local684 == 1) {
											Static194.method3870(20, "<img=0>" + local941, local1348, Static1.method8534(local1268), "<img=0>" + local756, local1286, 0, local941);
										} else {
											Static194.method3870(20, local941, local1348, Static1.method8534(local1268), local756, local1286, 0, local941);
										}
									}
									Static17.aClass218_2 = null;
									return true;
								} else if (Static17.aClass218_2 == Static601.aClass218_142) {
									if (Static385.aFrame149 != null) {
										Static494.method7243(-1, Static552.aClass3_Sub48_30.aClass23_Sub9_2.method3448(), -1, false);
									}
									@Pc(1439) byte[] local1439 = new byte[Static172.anInt4126];
									Static281.aClass3_Sub15_Sub1_4.method2439(local1439, Static172.anInt4126);
									local941 = Static89.method2282(local1439, 0, Static172.anInt4126);
									Static105.method2573(Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() == 1, local941, true, Static379.aClass228_6);
									Static17.aClass218_2 = null;
									return true;
								} else if (Static17.aClass218_2 == Static332.aClass218_79) {
									Static212.anInt9333 = Static281.aClass3_Sub15_Sub1_4.method8444();
									Static488.anInt8666 = Static244.anInt5487;
									Static17.aClass218_2 = null;
									return true;
								} else if (Static17.aClass218_2 == Static440.aClass218_100) {
									local215 = Static281.aClass3_Sub15_Sub1_4.method8461();
									local73 = Static281.aClass3_Sub15_Sub1_4.method8461();
									local275 = Static281.aClass3_Sub15_Sub1_4.method8429();
									if (local275 == 65535) {
										local275 = -1;
									}
									Static85.method2237(local73, local215, local275);
									Static17.aClass218_2 = null;
									return true;
								} else if (Static17.aClass218_2 == Static59.aClass218_136) {
									local215 = Static281.aClass3_Sub15_Sub1_4.method8461();
									local73 = Static281.aClass3_Sub15_Sub1_4.method8426();
									if (local73 == 65535) {
										local73 = -1;
									}
									local275 = Static281.aClass3_Sub15_Sub1_4.method8406();
									Static496.method7253(local73, local215, local275);
									Static17.aClass218_2 = null;
									return true;
								} else {
									@Pc(1594) int local1594;
									@Pc(1580) int local1580;
									@Pc(1592) boolean local1592;
									if (Static17.aClass218_2 == Static46.aClass218_12) {
										local542 = Static281.aClass3_Sub15_Sub1_4.method8401() == 1;
										local941 = Static281.aClass3_Sub15_Sub1_4.method8413();
										local756 = local941;
										if (local542) {
											local756 = Static281.aClass3_Sub15_Sub1_4.method8413();
										}
										local1268 = Static281.aClass3_Sub15_Sub1_4.method8414();
										local1273 = Static281.aClass3_Sub15_Sub1_4.method8421();
										local1580 = Static281.aClass3_Sub15_Sub1_4.method8401();
										local677 = Static281.aClass3_Sub15_Sub1_4.method8414();
										@Pc(1590) long local1590 = (local1268 << 32) + local1273;
										local1592 = false;
										local1594 = 0;
										while (true) {
											if (local1594 >= 100) {
												if (local1580 <= 1 && Static57.method8559(local756)) {
													local1592 = true;
												}
												break;
											}
											if (local1590 == Static45.aLongArray2[local1594]) {
												local1592 = true;
												break;
											}
											local1594++;
										}
										if (!local1592 && Static560.anInt9560 == 0) {
											Static45.aLongArray2[Static440.anInt8001] = local1590;
											Static440.anInt8001 = (Static440.anInt8001 + 1) % 100;
											@Pc(1645) String local1645 = Static221.aClass136_1.method4290(local677).method7183(Static281.aClass3_Sub15_Sub1_4);
											if (local1580 == 2) {
												Static194.method3870(18, "<img=1>" + local941, local1645, null, "<img=1>" + local756, local677, 0, local941);
											} else if (local1580 == 1) {
												Static194.method3870(18, "<img=0>" + local941, local1645, null, "<img=0>" + local756, local677, 0, local941);
											} else {
												Static194.method3870(18, local941, local1645, null, local756, local677, 0, local941);
											}
										}
										Static17.aClass218_2 = null;
										return true;
									} else if (Static17.aClass218_2 == Static181.aClass218_48) {
										local215 = Static281.aClass3_Sub15_Sub1_4.method8460();
										local73 = Static281.aClass3_Sub15_Sub1_4.method8414();
										local275 = Static281.aClass3_Sub15_Sub1_4.method8463();
										Static44.method2076();
										Static292.method5020(local275, (local215 << 16) + local73);
										Static17.aClass218_2 = null;
										return true;
									} else if (Static298.aClass218_83 == Static17.aClass218_2) {
										local215 = Static281.aClass3_Sub15_Sub1_4.method8414();
										local73 = Static281.aClass3_Sub15_Sub1_4.method8426();
										Static44.method2076();
										Static380.method6046(local215, local73);
										Static17.aClass218_2 = null;
										return true;
									} else if (Static360.aClass218_85 == Static17.aClass218_2) {
										local215 = Static281.aClass3_Sub15_Sub1_4.method8451();
										local73 = Static281.aClass3_Sub15_Sub1_4.method8444();
										Static44.method2076();
										Static567.method7976(local215, local73);
										Static17.aClass218_2 = null;
										return true;
									} else {
										@Pc(1832) int local1832;
										@Pc(1815) int local1815;
										if (Static171.aClass218_45 == Static17.aClass218_2) {
											local215 = Static281.aClass3_Sub15_Sub1_4.method8461();
											local73 = local215 >> 2;
											local275 = local215 & 0x3;
											local564 = Static606.anIntArray609[local73];
											local1815 = Static281.aClass3_Sub15_Sub1_4.method8429();
											if (local1815 == 65535) {
												local1815 = -1;
											}
											local580 = Static281.aClass3_Sub15_Sub1_4.method8418();
											local1832 = local580 >> 28 & 0x3;
											local1580 = local580 >> 14 & 0x3FFF;
											local1580 -= Static446.anInt8090;
											local677 = local580 & 0x3FFF;
											local677 -= Static124.anInt3150;
											Static442.method6697(local275, local677, local564, local1580, local1815, local1832, local73);
											Static17.aClass218_2 = null;
											return true;
										} else if (Static175.aClass218_46 == Static17.aClass218_2) {
											local215 = Static281.aClass3_Sub15_Sub1_4.method8447();
											local73 = Static281.aClass3_Sub15_Sub1_4.method8461();
											local275 = Static281.aClass3_Sub15_Sub1_4.method8402();
											Static311.anIntArray367[local215] = local275;
											Static143.anIntArray191[local215] = local73;
											Static641.anIntArray626[local215] = 1;
											local564 = Static63.anIntArray67[local215] - 1;
											for (local1815 = 0; local1815 < local564; local1815++) {
												if (local275 >= Class3_Sub27.anIntArray395[local1815]) {
													Static641.anIntArray626[local215] = local1815 + 2;
												}
											}
											Static525.anIntArray568[Static211.anInt4899++ & 0x1F] = local215;
											Static17.aClass218_2 = null;
											return true;
										} else if (Class2_Sub3_Sub2_Sub2.lb == Static17.aClass218_2) {
											local215 = Static281.aClass3_Sub15_Sub1_4.method8414();
											local73 = Static281.aClass3_Sub15_Sub1_4.method8414();
											local275 = Static281.aClass3_Sub15_Sub1_4.method8414();
											Static44.method2076();
											if (Static85.aClass108ArrayArray2[local215] != null) {
												for (local564 = local73; local564 < local275; local564++) {
													local1815 = Static281.aClass3_Sub15_Sub1_4.method8421();
													if (Static85.aClass108ArrayArray2[local215].length > local564 && Static85.aClass108ArrayArray2[local215][local564] != null) {
														Static85.aClass108ArrayArray2[local215][local564].anInt4024 = local1815;
													}
												}
											}
											Static17.aClass218_2 = null;
											return true;
										} else if (Static17.aClass218_2 == Static40.aClass218_11) {
											local215 = Static281.aClass3_Sub15_Sub1_4.method8461();
											local73 = Static281.aClass3_Sub15_Sub1_4.method8401();
											local275 = Static281.aClass3_Sub15_Sub1_4.method8461();
											local564 = Static281.aClass3_Sub15_Sub1_4.method8429();
											local1815 = Static281.aClass3_Sub15_Sub1_4.method8424();
											Static44.method2076();
											Static479.aBooleanArray20[local275] = true;
											Static260.anIntArray330[local275] = local1815;
											Static248.anIntArray316[local275] = local73;
											Static563.anIntArray583[local275] = local215;
											Static201.anIntArray245[local275] = local564;
											Static17.aClass218_2 = null;
											return true;
										} else if (Static17.aClass218_2 == Static32.aClass218_8) {
											Static411.method6443();
											Static17.aClass218_2 = null;
											return false;
										} else if (Static83.aClass218_84 == Static17.aClass218_2) {
											local744 = Static281.aClass3_Sub15_Sub1_4.method8413();
											@Pc(2079) Object[] local2079 = new Object[local744.length() + 1];
											for (local275 = local744.length() - 1; local275 >= 0; local275--) {
												if (local744.charAt(local275) == 's') {
													local2079[local275 + 1] = Static281.aClass3_Sub15_Sub1_4.method8413();
												} else {
													local2079[local275 + 1] = Integer.valueOf(Static281.aClass3_Sub15_Sub1_4.method8402());
												}
											}
											local2079[0] = Integer.valueOf(Static281.aClass3_Sub15_Sub1_4.method8402());
											Static44.method2076();
											@Pc(2133) Class3_Sub51 local2133 = new Class3_Sub51();
											local2133.anObjectArray33 = local2079;
											Static84.method2222(local2133);
											Static17.aClass218_2 = null;
											return true;
										} else if (Static17.aClass218_2 == Static569.aClass218_133) {
											local215 = Static281.aClass3_Sub15_Sub1_4.method8451();
											local73 = Static281.aClass3_Sub15_Sub1_4.method8429();
											Static44.method2076();
											if (local73 == 65535) {
												local73 = -1;
											}
											Static362.method5870(-1, local215, local73, 2);
											Static17.aClass218_2 = null;
											return true;
										} else {
											@Pc(2192) String local2192;
											if (Static17.aClass218_2 == Static498.aClass218_117) {
												local215 = Static281.aClass3_Sub15_Sub1_4.method8465();
												local73 = Static281.aClass3_Sub15_Sub1_4.method8402();
												local275 = Static281.aClass3_Sub15_Sub1_4.method8401();
												local1083 = "";
												local2192 = local1083;
												if ((local275 & 0x1) != 0) {
													local1083 = Static281.aClass3_Sub15_Sub1_4.method8413();
													if ((local275 & 0x2) == 0) {
														local2192 = local1083;
													} else {
														local2192 = Static281.aClass3_Sub15_Sub1_4.method8413();
													}
												}
												local987 = Static281.aClass3_Sub15_Sub1_4.method8413();
												if (local215 == 99) {
													Static117.method2792(local987);
												} else if (local2192.equals("") || !Static57.method8559(local2192)) {
													Static97.method2492(local1083, local2192, local215, local1083, local73, local987);
												} else {
													Static17.aClass218_2 = null;
													return true;
												}
												Static17.aClass218_2 = null;
												return true;
											} else if (Static96.aClass218_26 == Static17.aClass218_2) {
												local215 = Static281.aClass3_Sub15_Sub1_4.method8418();
												Static44.method2076();
												@Pc(2265) Class3_Sub50 local2265 = (Class3_Sub50) Static40.aClass307_5.method7424((long) local215);
												if (local2265 != null) {
													Static488.method7168(true, false, local2265);
												}
												if (Static529.aClass108_11 != null) {
													Static139.method3135(Static529.aClass108_11);
													Static529.aClass108_11 = null;
												}
												Static17.aClass218_2 = null;
												return true;
											} else if (Static17.aClass218_2 == Static223.aClass218_62) {
												local215 = Static281.aClass3_Sub15_Sub1_4.method8414();
												@Pc(2294) byte local2294 = Static281.aClass3_Sub15_Sub1_4.method8438();
												Static514.aClass166_1.method4935(local2294, local215);
												Static17.aClass218_2 = null;
												return true;
											} else if (Static17.aClass218_2 == Static6.aClass218_1) {
												Static229.method4376(false);
												Static17.aClass218_2 = null;
												return false;
											} else {
												@Pc(2335) boolean local2335;
												if (Static17.aClass218_2 == Static414.aClass218_96) {
													local215 = Static281.aClass3_Sub15_Sub1_4.method8429();
													local73 = Static281.aClass3_Sub15_Sub1_4.method8401();
													local2335 = (local73 & 0x1) == 1;
													Static323.method5442(local2335, local215);
													Static205.anIntArray274[Static380.anInt7242++ & 0x1F] = local215;
													Static17.aClass218_2 = null;
													return true;
												} else if (Static17.aClass218_2 == Static551.aClass218_149) {
													local215 = Static281.aClass3_Sub15_Sub1_4.method8401();
													local73 = Static281.aClass3_Sub15_Sub1_4.method8402();
													Static44.method2076();
													Static218.method4250(local73, local215);
													Static17.aClass218_2 = null;
													return true;
												} else if (Static227.aClass218_63 == Static17.aClass218_2) {
													Static579.method8022(Static172.anInt4126, Static281.aClass3_Sub15_Sub1_4);
													Static17.aClass218_2 = null;
													return true;
												} else {
													@Pc(2434) int local2434;
													@Pc(2432) boolean local2432;
													if (Static17.aClass218_2 == Static442.aClass218_101) {
														local542 = Static281.aClass3_Sub15_Sub1_4.method8401() == 1;
														local941 = Static281.aClass3_Sub15_Sub1_4.method8413();
														local756 = local941;
														if (local542) {
															local756 = Static281.aClass3_Sub15_Sub1_4.method8413();
														}
														local1268 = Static281.aClass3_Sub15_Sub1_4.method8414();
														local1273 = Static281.aClass3_Sub15_Sub1_4.method8421();
														local1580 = Static281.aClass3_Sub15_Sub1_4.method8401();
														@Pc(2430) long local2430 = (local1268 << 32) + local1273;
														local2432 = false;
														local2434 = 0;
														while (true) {
															if (local2434 >= 100) {
																if (local1580 <= 1) {
																	if (Static351.aBoolean592 && !Static201.aBoolean410 || Static535.aBoolean550) {
																		local2432 = true;
																	} else if (Static57.method8559(local756)) {
																		local2432 = true;
																	}
																}
																break;
															}
															if (Static45.aLongArray2[local2434] == local2430) {
																local2432 = true;
																break;
															}
															local2434++;
														}
														if (!local2432 && Static560.anInt9560 == 0) {
															Static45.aLongArray2[Static440.anInt8001] = local2430;
															Static440.anInt8001 = (Static440.anInt8001 + 1) % 100;
															@Pc(2496) String local2496 = Static320.method5429(Static388.method6124(Static281.aClass3_Sub15_Sub1_4));
															if (local1580 == 2) {
																Static194.method3870(7, "<img=1>" + local941, local2496, null, "<img=1>" + local756, -1, 0, local941);
															} else if (local1580 == 1) {
																Static194.method3870(7, "<img=0>" + local941, local2496, null, "<img=0>" + local756, -1, 0, local941);
															} else {
																Static194.method3870(3, local941, local2496, null, local756, -1, 0, local941);
															}
														}
														Static17.aClass218_2 = null;
														return true;
													} else if (Static31.aClass218_7 == Static17.aClass218_2) {
														local215 = Static281.aClass3_Sub15_Sub1_4.method8424();
														local73 = Static281.aClass3_Sub15_Sub1_4.method8447();
														local275 = Static281.aClass3_Sub15_Sub1_4.method8401();
														local564 = Static281.aClass3_Sub15_Sub1_4.method8401();
														local1815 = Static281.aClass3_Sub15_Sub1_4.method8426() << 2;
														Static44.method2076();
														Static320.method5428(true, local73, local1815, local275, local215, local564);
														Static17.aClass218_2 = null;
														return true;
													} else if (Static17.aClass218_2 == Static414.aClass218_95) {
														Static17.aClass218_2 = null;
														return false;
													} else if (Static53.aClass218_14 == Static17.aClass218_2) {
														Static246.anInt5500 = Static244.anInt5487;
														Static17.aClass218_2 = null;
														Static175.anInt4151 = 1;
														return true;
													} else if (Static471.aClass218_110 == Static17.aClass218_2) {
														local215 = Static281.aClass3_Sub15_Sub1_4.method8401();
														@Pc(2638) boolean local2638 = (local215 & 0x1) == 1;
														local756 = Static281.aClass3_Sub15_Sub1_4.method8413();
														local1083 = Static281.aClass3_Sub15_Sub1_4.method8413();
														if (local1083.equals("")) {
															local1083 = local756;
														}
														local2192 = Static281.aClass3_Sub15_Sub1_4.method8413();
														local987 = Static281.aClass3_Sub15_Sub1_4.method8413();
														if (local987.equals("")) {
															local987 = local2192;
														}
														if (local2638) {
															for (local1832 = 0; local1832 < Static644.anInt10532; local1832++) {
																if (Static552.aStringArray39[local1832].equals(local987)) {
																	Static615.aStringArray41[local1832] = local756;
																	Static552.aStringArray39[local1832] = local1083;
																	Static228.aStringArray20[local1832] = local2192;
																	Static330.aStringArray27[local1832] = local987;
																	break;
																}
															}
														} else {
															Static615.aStringArray41[Static644.anInt10532] = local756;
															Static552.aStringArray39[Static644.anInt10532] = local1083;
															Static228.aStringArray20[Static644.anInt10532] = local2192;
															Static330.aStringArray27[Static644.anInt10532] = local987;
															Static512.aBooleanArray24[Static644.anInt10532] = (local215 & 0x2) == 2;
															Static644.anInt10532++;
														}
														Static17.aClass218_2 = null;
														Static246.anInt5500 = Static244.anInt5487;
														return true;
													} else if (Static452.aClass218_104 == Static17.aClass218_2) {
														Static54.aClass167_2 = Static300.method5150(Static281.aClass3_Sub15_Sub1_4.method8401());
														Static17.aClass218_2 = null;
														return true;
													} else if (Static479.aClass218_113 == Static17.aClass218_2) {
														local215 = Static281.aClass3_Sub15_Sub1_4.method8426();
														if (local215 == 65535) {
															local215 = -1;
														}
														local73 = Static281.aClass3_Sub15_Sub1_4.method8463();
														Static44.method2076();
														Static362.method5870(-1, local73, local215, 1);
														Static17.aClass218_2 = null;
														return true;
													} else if (Static286.aClass218_72 == Static17.aClass218_2) {
														Static633.anInt10415 = Static281.aClass3_Sub15_Sub1_4.method8438() << 3;
														Static591.anInt9848 = Static281.aClass3_Sub15_Sub1_4.method8447();
														Static120.anInt3090 = Static281.aClass3_Sub15_Sub1_4.method8443() << 3;
														for (@Pc(2809) Class3_Sub46 local2809 = (Class3_Sub46) Static644.aClass307_55.method7421(); local2809 != null; local2809 = (Class3_Sub46) Static644.aClass307_55.method7428()) {
															local73 = (int) (local2809.aLong277 >> 28 & 0x3L);
															local275 = (int) (local2809.aLong277 & 0x3FFFL);
															local564 = local275 - Static446.anInt8090;
															local1815 = (int) (local2809.aLong277 >> 14 & 0x3FFFL);
															local580 = local1815 - Static124.anInt3150;
															if (Static591.anInt9848 == local73 && Static633.anInt10415 <= local564 && local564 < Static633.anInt10415 + 8 && local580 >= Static120.anInt3090 && local580 < Static120.anInt3090 + 8) {
																local2809.method8671();
																if (local564 >= 0 && local580 >= 0 && local564 < Static394.anInt7540 && local580 < Static462.anInt8391) {
																	Static10.method116(Static591.anInt9848, local580, local564);
																}
															}
														}
														for (@Pc(2919) Class3_Sub38 local2919 = (Class3_Sub38) Static165.aClass276_29.method6907(); local2919 != null; local2919 = (Class3_Sub38) Static165.aClass276_29.method6912()) {
															if (Static633.anInt10415 <= local2919.anInt8095 && local2919.anInt8095 < Static633.anInt10415 + 8 && local2919.anInt8088 >= Static120.anInt3090 && Static120.anInt3090 + 8 > local2919.anInt8088 && local2919.anInt8096 == Static591.anInt9848) {
																local2919.anInt8087 = 0;
															}
														}
														Static17.aClass218_2 = null;
														return true;
													} else if (Static548.aClass218_130 == Static17.aClass218_2) {
														Static116.method2773(Static443.aClass20_18);
														Static17.aClass218_2 = null;
														return true;
													} else if (Static473.aClass218_111 == Static17.aClass218_2) {
														if (Static135.method3115(Static581.anInt9720)) {
															Static285.anInt5873 = (int) ((float) Static281.aClass3_Sub15_Sub1_4.method8414() * 2.5F);
														} else {
															Static285.anInt5873 = Static281.aClass3_Sub15_Sub1_4.method8414() * 30;
														}
														Static17.aClass218_2 = null;
														Static488.anInt8666 = Static244.anInt5487;
														return true;
													} else if (Static17.aClass218_2 == Static516.aClass218_120) {
														Static44.method2076();
														Static595.method8145();
														Static17.aClass218_2 = null;
														return true;
													} else if (Static17.aClass218_2 == Static402.aClass218_105) {
														Static116.method2773(Static431.aClass20_17);
														Static17.aClass218_2 = null;
														return true;
													} else if (Static571.aClass218_134 == Static17.aClass218_2) {
														Static381.anInt7250 = Static281.aClass3_Sub15_Sub1_4.method8401();
														Static17.aClass218_2 = null;
														return true;
													} else if (Static17.aClass218_2 == Static229.aClass218_65) {
														local215 = Static281.aClass3_Sub15_Sub1_4.method8426();
														local73 = Static281.aClass3_Sub15_Sub1_4.method8451();
														Static44.method2076();
														Static605.method8259(local73, local215);
														Static17.aClass218_2 = null;
														return true;
													} else if (Static17.aClass218_2 == Static215.aClass218_60) {
														local744 = Static281.aClass3_Sub15_Sub1_4.method8413();
														local941 = Static320.method5429(Static388.method6124(Static281.aClass3_Sub15_Sub1_4));
														Static97.method2492(local744, local744, 6, local744, 0, local941);
														Static17.aClass218_2 = null;
														return true;
													} else if (Static609.aClass218_143 == Static17.aClass218_2) {
														local215 = Static281.aClass3_Sub15_Sub1_4.method8424();
														local73 = Static281.aClass3_Sub15_Sub1_4.method8426();
														Static514.aClass166_1.method4930(local73, local215);
														Static17.aClass218_2 = null;
														return true;
													} else if (Static17.aClass218_2 == Static124.aClass218_34) {
														Static591.anInt9848 = Static281.aClass3_Sub15_Sub1_4.method8401();
														Static120.anInt3090 = Static281.aClass3_Sub15_Sub1_4.method8438() << 3;
														Static633.anInt10415 = Static281.aClass3_Sub15_Sub1_4.method8438() << 3;
														while (Static281.aClass3_Sub15_Sub1_4.anInt10282 < Static172.anInt4126) {
															@Pc(3138) Class20 local3138 = Static49.method1149()[Static281.aClass3_Sub15_Sub1_4.method8401()];
															Static116.method2773(local3138);
														}
														Static17.aClass218_2 = null;
														return true;
													} else if (Static486.aClass218_115 == Static17.aClass218_2) {
														local542 = Static281.aClass3_Sub15_Sub1_4.method8401() == 1;
														Static44.method2076();
														Static93.aBoolean203 = local542;
														Static17.aClass218_2 = null;
														return true;
													} else if (Static17.aClass218_2 == Static267.aClass218_67) {
														local215 = Static281.aClass3_Sub15_Sub1_4.method8463();
														local941 = Static281.aClass3_Sub15_Sub1_4.method8413();
														Static44.method2076();
														Static132.method3077(local941, local215);
														Static17.aClass218_2 = null;
														return true;
													} else if (Static17.aClass218_2 == Static525.aClass218_123) {
														local215 = Static281.aClass3_Sub15_Sub1_4.method8463();
														Static44.method2076();
														Static362.method5870(0, local215, Static399.anInt7626, 5);
														Static17.aClass218_2 = null;
														return true;
													} else if (Static110.aClass218_28 == Static17.aClass218_2) {
														local215 = Static281.aClass3_Sub15_Sub1_4.method8429();
														local941 = Static281.aClass3_Sub15_Sub1_4.method8413();
														Static44.method2076();
														Static289.method5002(local941, local215);
														Static17.aClass218_2 = null;
														return true;
													} else if (Static17.aClass218_2 == Static171.aClass218_44) {
														Static514.aClass166_1.method4931();
														Static17.aClass218_2 = null;
														Static224.anInt5124 += 32;
														return true;
													} else if (Static17.aClass218_2 == Static299.aClass218_119) {
														local215 = Static281.aClass3_Sub15_Sub1_4.method8426();
														local73 = Static281.aClass3_Sub15_Sub1_4.method8451();
														Static44.method2076();
														Static37.method727(local215, local73);
														Static17.aClass218_2 = null;
														return true;
													} else if (Static190.aClass218_49 == Static17.aClass218_2) {
														local215 = Static281.aClass3_Sub15_Sub1_4.method8414();
														if (local215 == 65535) {
															local215 = -1;
														}
														local73 = Static281.aClass3_Sub15_Sub1_4.method8401();
														local275 = Static281.aClass3_Sub15_Sub1_4.method8414();
														local564 = Static281.aClass3_Sub15_Sub1_4.method8401();
														Static474.method7012(local275, local564, local215, 256, true, local73);
														Static17.aClass218_2 = null;
														return true;
													} else {
														@Pc(3366) int local3366;
														if (Static271.aClass218_69 == Static17.aClass218_2) {
															local542 = Static281.aClass3_Sub15_Sub1_4.method8401() == 1;
															local941 = Static281.aClass3_Sub15_Sub1_4.method8413();
															local756 = local941;
															if (local542) {
																local756 = Static281.aClass3_Sub15_Sub1_4.method8413();
															}
															local1268 = Static281.aClass3_Sub15_Sub1_4.method8400();
															local1273 = Static281.aClass3_Sub15_Sub1_4.method8414();
															local1278 = Static281.aClass3_Sub15_Sub1_4.method8421();
															local684 = Static281.aClass3_Sub15_Sub1_4.method8401();
															@Pc(3362) long local3362 = local1278 + (local1273 << 32);
															@Pc(3364) boolean local3364 = false;
															local3366 = 0;
															while (true) {
																if (local3366 >= 100) {
																	if (local684 <= 1) {
																		if (Static351.aBoolean592 && !Static201.aBoolean410 || Static535.aBoolean550) {
																			local3364 = true;
																		} else if (Static57.method8559(local756)) {
																			local3364 = true;
																		}
																	}
																	break;
																}
																if (Static45.aLongArray2[local3366] == local3362) {
																	local3364 = true;
																	break;
																}
																local3366++;
															}
															if (!local3364 && Static560.anInt9560 == 0) {
																Static45.aLongArray2[Static440.anInt8001] = local3362;
																Static440.anInt8001 = (Static440.anInt8001 + 1) % 100;
																@Pc(3423) String local3423 = Static320.method5429(Static388.method6124(Static281.aClass3_Sub15_Sub1_4));
																if (local684 == 2 || local684 == 3) {
																	Static194.method3870(9, "<img=1>" + local941, local3423, Static1.method8534(local1268), "<img=1>" + local756, -1, 0, local941);
																} else if (local684 == 1) {
																	Static194.method3870(9, "<img=0>" + local941, local3423, Static1.method8534(local1268), "<img=0>" + local756, -1, 0, local941);
																} else {
																	Static194.method3870(9, local941, local3423, Static1.method8534(local1268), local756, -1, 0, local941);
																}
															}
															Static17.aClass218_2 = null;
															return true;
														}
														@Pc(3538) boolean local3538;
														@Pc(3609) String local3609;
														if (Static17.aClass218_2 == Static59.aClass218_137) {
															local744 = Static281.aClass3_Sub15_Sub1_4.method8413();
															local2335 = Static281.aClass3_Sub15_Sub1_4.method8401() == 1;
															if (local2335) {
																local941 = Static281.aClass3_Sub15_Sub1_4.method8413();
															} else {
																local941 = local744;
															}
															local564 = Static281.aClass3_Sub15_Sub1_4.method8414();
															@Pc(3536) byte local3536 = Static281.aClass3_Sub15_Sub1_4.method8440();
															local3538 = false;
															if (local3536 == -128) {
																local3538 = true;
															}
															if (local3538) {
																if (Static126.anInt3181 == 0) {
																	Static17.aClass218_2 = null;
																	return true;
																}
																for (local1832 = 0; local1832 < Static126.anInt3181 && (!Static646.aClass323Array1[local1832].aString107.equals(local941) || local564 != Static646.aClass323Array1[local1832].anInt9459); local1832++) {
																}
																if (Static126.anInt3181 > local1832) {
																	while (local1832 < Static126.anInt3181 - 1) {
																		Static646.aClass323Array1[local1832] = Static646.aClass323Array1[local1832 + 1];
																		local1832++;
																	}
																	Static126.anInt3181--;
																	Static646.aClass323Array1[Static126.anInt3181] = null;
																}
															} else {
																local3609 = Static281.aClass3_Sub15_Sub1_4.method8413();
																local702 = new Class323();
																local702.aString105 = local744;
																local702.aString107 = local941;
																local702.aString106 = Static629.method8529(local702.aString107);
																local702.aString108 = local3609;
																local702.aByte116 = local3536;
																local702.anInt9459 = local564;
																for (local677 = Static126.anInt3181 - 1; local677 >= 0; local677--) {
																	local684 = Static646.aClass323Array1[local677].aString106.compareTo(local702.aString106);
																	if (local684 == 0) {
																		Static646.aClass323Array1[local677].anInt9459 = local564;
																		Static646.aClass323Array1[local677].aByte116 = local3536;
																		Static646.aClass323Array1[local677].aString108 = local3609;
																		if (local941.equals(Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aString68)) {
																			Static493.aByte105 = local3536;
																		}
																		Static17.aClass218_2 = null;
																		Static344.anInt6772 = Static244.anInt5487;
																		return true;
																	}
																	if (local684 < 0) {
																		break;
																	}
																}
																if (Static126.anInt3181 >= Static646.aClass323Array1.length) {
																	Static17.aClass218_2 = null;
																	return true;
																}
																for (local684 = Static126.anInt3181 - 1; local684 > local677; local684--) {
																	Static646.aClass323Array1[local684 + 1] = Static646.aClass323Array1[local684];
																}
																if (Static126.anInt3181 == 0) {
																	Static646.aClass323Array1 = new Class323[100];
																}
																Static646.aClass323Array1[local677 + 1] = local702;
																Static126.anInt3181++;
																if (local941.equals(Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aString68)) {
																	Static493.aByte105 = local3536;
																}
															}
															Static17.aClass218_2 = null;
															Static344.anInt6772 = Static244.anInt5487;
															return true;
														}
														@Pc(3819) Class3_Sub11 local3819;
														@Pc(3807) Class3_Sub11 local3807;
														if (Static627.aClass218_151 == Static17.aClass218_2) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8451();
															local73 = Static281.aClass3_Sub15_Sub1_4.method8414();
															if (local73 == 65535) {
																local73 = -1;
															}
															local275 = Static281.aClass3_Sub15_Sub1_4.method8426();
															if (local275 == 65535) {
																local275 = -1;
															}
															local564 = Static281.aClass3_Sub15_Sub1_4.method8414();
															Static44.method2076();
															for (local1815 = local73; local1815 <= local275; local1815++) {
																local1273 = (long) local1815 + ((long) local215 << 32);
																local3807 = (Class3_Sub11) Static149.aClass307_22.method7424(local1273);
																if (local3807 != null) {
																	local3819 = new Class3_Sub11(local3807.anInt1134, local564);
																	local3807.method8671();
																} else if (local1815 == -1) {
																	local3819 = new Class3_Sub11(Static113.method8285(local215).aClass3_Sub11_2.anInt1134, local564);
																} else {
																	local3819 = new Class3_Sub11(0, local564);
																}
																Static149.aClass307_22.method7425(local1273, local3819);
															}
															Static17.aClass218_2 = null;
															return true;
														} else if (Static474.aClass218_112 == Static17.aClass218_2) {
															local744 = Static281.aClass3_Sub15_Sub1_4.method8413();
															local73 = Static281.aClass3_Sub15_Sub1_4.method8460();
															Static44.method2076();
															Static289.method5002(local744, local73);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static459.aClass218_107 == Static17.aClass218_2) {
															local542 = Static281.aClass3_Sub15_Sub1_4.method8401() == 1;
															@Pc(3899) byte[] local3899 = new byte[Static172.anInt4126 - 1];
															Static281.aClass3_Sub15_Sub1_4.method8403(Static172.anInt4126 - 1, 0, local3899);
															Static614.method8353(local3899, local542);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static271.aClass218_68) {
															Static116.method2773(Static35.aClass20_4);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static499.aClass218_118 == Static17.aClass218_2) {
															Static116.method2773(Static273.aClass20_8);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static58.aClass218_17 == Static17.aClass218_2) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8426();
															local73 = Static281.aClass3_Sub15_Sub1_4.method8460();
															local275 = Static281.aClass3_Sub15_Sub1_4.method8460();
															local564 = Static281.aClass3_Sub15_Sub1_4.method8402();
															Static44.method2076();
															Static362.method5870(local275, local564, local215 << 16 | local73, 7);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static545.aClass218_129) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8447();
															local73 = Static281.aClass3_Sub15_Sub1_4.method8460();
															Static44.method2076();
															Static567.method7978(local73, local215, true);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static131.aClass218_36) {
															Static644.anInt10532 = Static281.aClass3_Sub15_Sub1_4.method8401();
															for (local215 = 0; local215 < Static644.anInt10532; local215++) {
																Static615.aStringArray41[local215] = Static281.aClass3_Sub15_Sub1_4.method8413();
																Static552.aStringArray39[local215] = Static281.aClass3_Sub15_Sub1_4.method8413();
																if (Static552.aStringArray39[local215].equals("")) {
																	Static552.aStringArray39[local215] = Static615.aStringArray41[local215];
																}
																Static228.aStringArray20[local215] = Static281.aClass3_Sub15_Sub1_4.method8413();
																Static330.aStringArray27[local215] = Static281.aClass3_Sub15_Sub1_4.method8413();
																if (Static330.aStringArray27[local215].equals("")) {
																	Static330.aStringArray27[local215] = Static228.aStringArray20[local215];
																}
																Static512.aBooleanArray24[local215] = false;
															}
															Static246.anInt5500 = Static244.anInt5487;
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static529.aClass218_124) {
															Static380.method6049(Static281.aClass3_Sub15_Sub1_4.method8413());
															Static17.aClass218_2 = null;
															return true;
														} else if (Static223.aClass218_61 == Static17.aClass218_2) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8420();
															local73 = Static281.aClass3_Sub15_Sub1_4.method8452();
															local275 = Static281.aClass3_Sub15_Sub1_4.method8451();
															Static44.method2076();
															Static558.method7856(local275, local73, local215);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static581.aClass218_135) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8414();
															local73 = Static281.aClass3_Sub15_Sub1_4.method8401();
															local2335 = (local73 & 0x1) == 1;
															while (Static281.aClass3_Sub15_Sub1_4.anInt10282 < Static172.anInt4126) {
																local564 = Static281.aClass3_Sub15_Sub1_4.method8465();
																local1815 = Static281.aClass3_Sub15_Sub1_4.method8414();
																local580 = 0;
																if (local1815 != 0) {
																	local580 = Static281.aClass3_Sub15_Sub1_4.method8401();
																	if (local580 == 255) {
																		local580 = Static281.aClass3_Sub15_Sub1_4.method8402();
																	}
																}
																Static178.method3627(local1815 - 1, local580, local215, local564, local2335);
															}
															Static205.anIntArray274[Static380.anInt7242++ & 0x1F] = local215;
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static427.aClass218_98) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8461();
															local73 = Static281.aClass3_Sub15_Sub1_4.method8463();
															local275 = Static281.aClass3_Sub15_Sub1_4.method8460();
															local564 = Static281.aClass3_Sub15_Sub1_4.method8429();
															local1815 = Static281.aClass3_Sub15_Sub1_4.method8429();
															local3538 = (local215 & 0x80) != 0;
															local1832 = local215 & 0x7;
															local1580 = local215 >> 3 & 0xF;
															if (local1580 == 15) {
																local1580 = -1;
															}
															if (local73 >> 30 == 0) {
																@Pc(4456) Class290 local4456;
																@Pc(4394) Class268 local4394;
																@Pc(4408) Class290 local4408;
																if (local73 >> 29 != 0) {
																	local677 = local73 & 0xFFFF;
																	@Pc(4353) Class3_Sub49 local4353 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local677);
																	if (local4353 != null) {
																		if (local564 == 65535) {
																			local564 = -1;
																		}
																		@Pc(4365) Class2_Sub3_Sub1_Sub2_Sub1 local4365 = local4353.aClass2_Sub3_Sub1_Sub2_Sub1_2;
																		local1592 = true;
																		local1594 = local3538 ? local4365.anInt6299 : local4365.anInt6321;
																		if (local564 != -1 && local1594 != -1) {
																			if (local1594 == local564) {
																				local4394 = Static35.aClass343_1.method8033(local564);
																				if (local4394.aBoolean688 && local4394.anInt8068 != -1) {
																					local4408 = Static618.aClass222_2.method5867(local4394.anInt8068);
																					@Pc(4411) int local4411 = local4408.anInt8682;
																					if (local4411 == 0 || local4411 == 2) {
																						local1592 = false;
																					} else if (local4411 == 1) {
																						local1592 = true;
																					}
																				}
																			} else {
																				local4394 = Static35.aClass343_1.method8033(local564);
																				@Pc(4442) Class268 local4442 = Static35.aClass343_1.method8033(local1594);
																				if (local4394.anInt8068 != -1 && local4442.anInt8068 != -1) {
																					local4456 = Static618.aClass222_2.method5867(local4394.anInt8068);
																					@Pc(4462) Class290 local4462 = Static618.aClass222_2.method5867(local4442.anInt8068);
																					if (local4462.anInt8688 > local4456.anInt8688) {
																						local1592 = false;
																					}
																				}
																			}
																		}
																		if (local1592) {
																			if (local3538) {
																				local4365.anInt6318 = 0;
																				local4365.anInt6323 = local275;
																				local4365.anInt6270 = 0;
																				local4365.anInt6299 = local564;
																				local4365.anInt6300 = local1580;
																				local4365.anInt6304 = local1832;
																				local4365.anInt6260 = Static251.anInt5580 + local1815;
																				local4365.anInt6277 = 1;
																				if (local4365.anInt6260 > Static251.anInt5580) {
																					local4365.anInt6270 = -1;
																				}
																				if (local4365.anInt6299 != -1 && Static251.anInt5580 == local4365.anInt6260) {
																					local3366 = Static35.aClass343_1.method8033(local4365.anInt6299).anInt8068;
																					if (local3366 != -1) {
																						local4408 = Static618.aClass222_2.method5867(local3366);
																						if (local4408 != null && local4408.anIntArray550 != null && !local4365.aBoolean533) {
																							Static349.method5726(0, local4408, local4365);
																						}
																					}
																				}
																			} else {
																				local4365.anInt6321 = local564;
																				local4365.anInt6308 = local275;
																				local4365.anInt6325 = 0;
																				local4365.anInt6340 = 0;
																				local4365.anInt6295 = 1;
																				local4365.anInt6257 = local1832;
																				local4365.anInt6327 = local1580;
																				local4365.anInt6311 = local1815 + Static251.anInt5580;
																				if (Static251.anInt5580 < local4365.anInt6311) {
																					local4365.anInt6325 = -1;
																				}
																				if (local4365.anInt6321 != -1 && Static251.anInt5580 == local4365.anInt6311) {
																					local3366 = Static35.aClass343_1.method8033(local4365.anInt6321).anInt8068;
																					if (local3366 != -1) {
																						local4408 = Static618.aClass222_2.method5867(local3366);
																						if (local4408 != null && local4408.anIntArray550 != null && !local4365.aBoolean533) {
																							Static349.method5726(0, local4408, local4365);
																						}
																					}
																				}
																			}
																		}
																	}
																} else if (local73 >> 28 != 0) {
																	local677 = local73 & 0xFFFF;
																	@Pc(4649) Class2_Sub3_Sub1_Sub2_Sub2 local4649;
																	if (Static399.anInt7626 == local677) {
																		local4649 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2;
																	} else {
																		local4649 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local677];
																	}
																	if (local4649 != null) {
																		if (local564 == 65535) {
																			local564 = -1;
																		}
																		local2432 = true;
																		local2434 = local3538 ? local4649.anInt6299 : local4649.anInt6321;
																		@Pc(4746) Class290 local4746;
																		if (local564 != -1 && local2434 != -1) {
																			@Pc(4690) Class268 local4690;
																			if (local2434 == local564) {
																				local4690 = Static35.aClass343_1.method8033(local564);
																				if (local4690.aBoolean688 && local4690.anInt8068 != -1) {
																					local4746 = Static618.aClass222_2.method5867(local4690.anInt8068);
																					local1296 = local4746.anInt8682;
																					if (local1296 == 0 || local1296 == 2) {
																						local2432 = false;
																					} else if (local1296 == 1) {
																						local2432 = true;
																					}
																				}
																			} else {
																				local4690 = Static35.aClass343_1.method8033(local564);
																				local4394 = Static35.aClass343_1.method8033(local2434);
																				if (local4690.anInt8068 != -1 && local4394.anInt8068 != -1) {
																					local4408 = Static618.aClass222_2.method5867(local4690.anInt8068);
																					local4456 = Static618.aClass222_2.method5867(local4394.anInt8068);
																					if (local4456.anInt8688 > local4408.anInt8688) {
																						local2432 = false;
																					}
																				}
																			}
																		}
																		if (local2432) {
																			if (local3538) {
																				local4649.anInt6300 = local1580;
																				local4649.anInt6323 = local275;
																				local4649.anInt6299 = local564;
																				local4649.anInt6270 = 0;
																				local4649.anInt6304 = local1832;
																				local4649.anInt6277 = 1;
																				local4649.anInt6260 = Static251.anInt5580 + local1815;
																				local4649.anInt6318 = 0;
																				if (local4649.anInt6299 == 65535) {
																					local4649.anInt6299 = -1;
																				}
																				if (local4649.anInt6260 > Static251.anInt5580) {
																					local4649.anInt6270 = -1;
																				}
																				if (local4649.anInt6299 != -1 && local4649.anInt6260 == Static251.anInt5580) {
																					local1594 = Static35.aClass343_1.method8033(local4649.anInt6299).anInt8068;
																					if (local1594 != -1) {
																						local4746 = Static618.aClass222_2.method5867(local1594);
																						if (local4746 != null && local4746.anIntArray550 != null && !local4649.aBoolean533) {
																							Static349.method5726(0, local4746, local4649);
																						}
																					}
																				}
																			} else {
																				local4649.anInt6340 = 0;
																				local4649.anInt6295 = 1;
																				local4649.anInt6321 = local564;
																				local4649.anInt6327 = local1580;
																				local4649.anInt6311 = local1815 + Static251.anInt5580;
																				local4649.anInt6257 = local1832;
																				local4649.anInt6325 = 0;
																				local4649.anInt6308 = local275;
																				if (Static251.anInt5580 < local4649.anInt6311) {
																					local4649.anInt6325 = -1;
																				}
																				if (local4649.anInt6321 == 65535) {
																					local4649.anInt6321 = -1;
																				}
																				if (local4649.anInt6321 != -1 && Static251.anInt5580 == local4649.anInt6311) {
																					local1594 = Static35.aClass343_1.method8033(local4649.anInt6321).anInt8068;
																					if (local1594 != -1) {
																						local4746 = Static618.aClass222_2.method5867(local1594);
																						if (local4746 != null && local4746.anIntArray550 != null && !local4649.aBoolean533) {
																							Static349.method5726(0, local4746, local4649);
																						}
																					}
																				}
																			}
																		}
																	}
																}
															} else {
																local677 = local73 >> 28 & 0x3;
																local684 = (local73 >> 14 & 0x3FFF) - Static446.anInt8090;
																local1286 = (local73 & 0x3FFF) - Static124.anInt3150;
																if (local684 >= 0 && local1286 >= 0 && local684 < Static394.anInt7540 && Static462.anInt8391 > local1286) {
																	local2434 = local684 * 512 + 256;
																	local1594 = local1286 * 512 + 256;
																	local3366 = local677;
																	if (local677 < 3 && Static525.method7485(local1286, local684)) {
																		local3366 = local677 + 1;
																	}
																	@Pc(4326) Class2_Sub3_Sub1_Sub1 local4326 = new Class2_Sub3_Sub1_Sub1(local564, local1815, Static251.anInt5580, local677, local3366, local2434, Static202.method3958(local1594, local677, local2434) - local275, local1594, local684, local684, local1286, local1286, local1832);
																	Static239.aClass276_36.method6906(new Class3_Sub1_Sub17(local4326));
																}
															}
															Static17.aClass218_2 = null;
															return true;
														} else if (Static92.aClass218_24 == Static17.aClass218_2) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8401();
															local73 = local215 >> 5;
															local275 = local215 & 0x1F;
															if (local275 == 0) {
																Static253.aClass369Array1[local73] = null;
																Static17.aClass218_2 = null;
																return true;
															}
															@Pc(4981) Class369 local4981 = new Class369();
															local4981.anInt10333 = local275;
															local4981.anInt10337 = Static281.aClass3_Sub15_Sub1_4.method8401();
															if (local4981.anInt10337 >= 0 && local4981.anInt10337 < Static474.aClass5Array14.length) {
																if (local4981.anInt10333 == 1 || local4981.anInt10333 == 10) {
																	local4981.anInt10340 = Static281.aClass3_Sub15_Sub1_4.method8414();
																	Static281.aClass3_Sub15_Sub1_4.anInt10282 += 6;
																} else if (local4981.anInt10333 >= 2 && local4981.anInt10333 <= 6) {
																	if (local4981.anInt10333 == 2) {
																		local4981.anInt10341 = 256;
																		local4981.anInt10342 = 256;
																	}
																	if (local4981.anInt10333 == 3) {
																		local4981.anInt10341 = 0;
																		local4981.anInt10342 = 256;
																	}
																	if (local4981.anInt10333 == 4) {
																		local4981.anInt10341 = 512;
																		local4981.anInt10342 = 256;
																	}
																	if (local4981.anInt10333 == 5) {
																		local4981.anInt10342 = 0;
																		local4981.anInt10341 = 256;
																	}
																	if (local4981.anInt10333 == 6) {
																		local4981.anInt10342 = 512;
																		local4981.anInt10341 = 256;
																	}
																	local4981.anInt10333 = 2;
																	local4981.anInt10344 = Static281.aClass3_Sub15_Sub1_4.method8401();
																	local4981.anInt10341 += Static281.aClass3_Sub15_Sub1_4.method8414() - Static446.anInt8090 << 9;
																	local4981.anInt10342 += Static281.aClass3_Sub15_Sub1_4.method8414() - Static124.anInt3150 << 9;
																	local4981.anInt10334 = Static281.aClass3_Sub15_Sub1_4.method8401() << 2;
																	local4981.anInt10339 = Static281.aClass3_Sub15_Sub1_4.method8414();
																}
																local4981.anInt10343 = Static281.aClass3_Sub15_Sub1_4.method8414();
																if (local4981.anInt10343 == 65535) {
																	local4981.anInt10343 = -1;
																}
																Static253.aClass369Array1[local73] = local4981;
															}
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static228.aClass218_64) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8461();
															local73 = Static281.aClass3_Sub15_Sub1_4.method8424();
															local275 = Static281.aClass3_Sub15_Sub1_4.method8424();
															local564 = Static281.aClass3_Sub15_Sub1_4.method8429() << 2;
															local1815 = Static281.aClass3_Sub15_Sub1_4.method8401();
															Static44.method2076();
															Static373.method5966(local215, local275, local1815, local564, local73);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static634.aClass218_153 == Static17.aClass218_2) {
															Static611.anInt10103 = Static281.aClass3_Sub15_Sub1_4.method8450();
															Static351.aBoolean592 = Static281.aClass3_Sub15_Sub1_4.method8401() == 1;
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static118.aClass218_30) {
															Static116.method2773(Static353.aClass20_13);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static568.aClass218_132) {
															@Pc(5289) boolean local5289;
															while (Static281.aClass3_Sub15_Sub1_4.anInt10282 < Static172.anInt4126) {
																local542 = Static281.aClass3_Sub15_Sub1_4.method8401() == 1;
																local941 = Static281.aClass3_Sub15_Sub1_4.method8413();
																local756 = Static281.aClass3_Sub15_Sub1_4.method8413();
																local564 = Static281.aClass3_Sub15_Sub1_4.method8414();
																local1815 = Static281.aClass3_Sub15_Sub1_4.method8401();
																local987 = "";
																local682 = false;
																if (local564 > 0) {
																	local987 = Static281.aClass3_Sub15_Sub1_4.method8413();
																	local682 = Static281.aClass3_Sub15_Sub1_4.method8401() == 1;
																}
																for (local1580 = 0; local1580 < Static409.anInt6024; local1580++) {
																	if (local542) {
																		if (local756.equals(Static573.aStringArray40[local1580])) {
																			Static573.aStringArray40[local1580] = local941;
																			local941 = null;
																			Static175.aStringArray16[local1580] = local756;
																			break;
																		}
																	} else if (local941.equals(Static573.aStringArray40[local1580])) {
																		if (Static85.anIntArray91[local1580] != local564) {
																			local5289 = true;
																			for (@Pc(5294) Class2_Sub4_Sub2 local5294 = (Class2_Sub4_Sub2) Static327.aClass375_5.method8638(); local5294 != null; local5294 = (Class2_Sub4_Sub2) Static327.aClass375_5.method8635()) {
																				if (local5294.aString95.equals(local941)) {
																					if (local564 != 0 && local5294.aShort106 == 0) {
																						local5294.method8558();
																						local5289 = false;
																					} else if (local564 == 0 && local5294.aShort106 != 0) {
																						local5294.method8558();
																						local5289 = false;
																					}
																				}
																			}
																			if (local5289) {
																				Static327.aClass375_5.method8639(new Class2_Sub4_Sub2(local941, local564));
																			}
																			Static85.anIntArray91[local1580] = local564;
																		}
																		Static175.aStringArray16[local1580] = local756;
																		Static193.aStringArray18[local1580] = local987;
																		Static76.anIntArray74[local1580] = local1815;
																		Static439.aBooleanArray16[local1580] = local682;
																		local941 = null;
																		break;
																	}
																}
																if (local941 != null && Static409.anInt6024 < 200) {
																	Static573.aStringArray40[Static409.anInt6024] = local941;
																	Static175.aStringArray16[Static409.anInt6024] = local756;
																	Static85.anIntArray91[Static409.anInt6024] = local564;
																	Static193.aStringArray18[Static409.anInt6024] = local987;
																	Static76.anIntArray74[Static409.anInt6024] = local1815;
																	Static439.aBooleanArray16[Static409.anInt6024] = local682;
																	Static409.anInt6024++;
																}
															}
															Static246.anInt5500 = Static244.anInt5487;
															Static175.anInt4151 = 2;
															local73 = Static409.anInt6024;
															while (local73 > 0) {
																local542 = true;
																local73--;
																for (local275 = 0; local275 < local73; local275++) {
																	if (Static85.anIntArray91[local275] != Static621.aClass278_5.anInt8394 && Static621.aClass278_5.anInt8394 == Static85.anIntArray91[local275 + 1] || Static85.anIntArray91[local275] == 0 && Static85.anIntArray91[local275 + 1] != 0) {
																		local564 = Static85.anIntArray91[local275];
																		Static85.anIntArray91[local275] = Static85.anIntArray91[local275 + 1];
																		Static85.anIntArray91[local275 + 1] = local564;
																		local2192 = Static193.aStringArray18[local275];
																		Static193.aStringArray18[local275] = Static193.aStringArray18[local275 + 1];
																		Static193.aStringArray18[local275 + 1] = local2192;
																		local987 = Static573.aStringArray40[local275];
																		Static573.aStringArray40[local275] = Static573.aStringArray40[local275 + 1];
																		Static573.aStringArray40[local275 + 1] = local987;
																		local3609 = Static175.aStringArray16[local275];
																		Static175.aStringArray16[local275] = Static175.aStringArray16[local275 + 1];
																		Static175.aStringArray16[local275 + 1] = local3609;
																		local1580 = Static76.anIntArray74[local275];
																		Static76.anIntArray74[local275] = Static76.anIntArray74[local275 + 1];
																		Static76.anIntArray74[local275 + 1] = local1580;
																		local5289 = Static439.aBooleanArray16[local275];
																		Static439.aBooleanArray16[local275] = Static439.aBooleanArray16[local275 + 1];
																		local542 = false;
																		Static439.aBooleanArray16[local275 + 1] = local5289;
																	}
																}
																if (local542) {
																	break;
																}
															}
															Static17.aClass218_2 = null;
															return true;
														} else if (Static314.aClass218_77 == Static17.aClass218_2) {
															for (local215 = 0; local215 < Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2.length; local215++) {
																if (Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local215] != null) {
																	Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local215].anIntArray376 = null;
																	Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local215].anInt6306 = -1;
																}
															}
															for (local73 = 0; local73 < Static234.anInt5314; local73++) {
																Static482.aClass3_Sub49Array1[local73].aClass2_Sub3_Sub1_Sub2_Sub1_2.anIntArray376 = null;
																Static482.aClass3_Sub49Array1[local73].aClass2_Sub3_Sub1_Sub2_Sub1_2.anInt6306 = -1;
															}
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static620.aClass218_150) {
															local542 = Static281.aClass3_Sub15_Sub1_4.method8401() == 1;
															local941 = Static281.aClass3_Sub15_Sub1_4.method8413();
															local756 = local941;
															if (local542) {
																local756 = Static281.aClass3_Sub15_Sub1_4.method8413();
															}
															local564 = Static281.aClass3_Sub15_Sub1_4.method8401();
															local1815 = Static281.aClass3_Sub15_Sub1_4.method8414();
															local3538 = false;
															if (local564 <= 1 && Static57.method8559(local756)) {
																local3538 = true;
															}
															if (!local3538 && Static560.anInt9560 == 0) {
																local3609 = Static221.aClass136_1.method4290(local1815).method7183(Static281.aClass3_Sub15_Sub1_4);
																if (local564 == 2) {
																	Static194.method3870(25, "<img=1>" + local941, local3609, null, "<img=1>" + local756, local1815, 0, local941);
																} else if (local564 == 1) {
																	Static194.method3870(25, "<img=0>" + local941, local3609, null, "<img=0>" + local756, local1815, 0, local941);
																} else {
																	Static194.method3870(25, local941, local3609, null, local756, local1815, 0, local941);
																}
															}
															Static17.aClass218_2 = null;
															return true;
														} else if (Static453.aClass218_106 == Static17.aClass218_2) {
															Static229.method4376(Static389.aBoolean634);
															Static17.aClass218_2 = null;
															return false;
														} else if (Static17.aClass218_2 == Static539.aClass218_126) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8460();
															Static44.method2076();
															Static32.method597(local215);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static419.aClass218_97 == Static17.aClass218_2) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8414();
															if (local215 == 65535) {
																local215 = -1;
															}
															local73 = Static281.aClass3_Sub15_Sub1_4.method8401();
															local275 = Static281.aClass3_Sub15_Sub1_4.method8414();
															local564 = Static281.aClass3_Sub15_Sub1_4.method8401();
															local1815 = Static281.aClass3_Sub15_Sub1_4.method8414();
															Static474.method7012(local275, local564, local215, local1815, false, local73);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static422.aClass218_138 == Static17.aClass218_2) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8414();
															@Pc(5863) Class2_Sub3_Sub1_Sub2_Sub2 local5863;
															if (local215 == Static399.anInt7626) {
																local5863 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2;
															} else {
																local5863 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local215];
															}
															if (local5863 == null) {
																Static17.aClass218_2 = null;
																return true;
															}
															local275 = Static281.aClass3_Sub15_Sub1_4.method8414();
															local564 = Static281.aClass3_Sub15_Sub1_4.method8401();
															local955 = (local275 & 0x8000) != 0;
															if (local5863.aString68 != null && local5863.aClass352_1 != null) {
																local3538 = false;
																if (local564 <= 1) {
																	if (!local955 && (Static351.aBoolean592 && !Static201.aBoolean410 || Static535.aBoolean550)) {
																		local3538 = true;
																	} else if (Static57.method8559(local5863.aString68)) {
																		local3538 = true;
																	}
																}
																if (!local3538 && Static560.anInt9560 == 0) {
																	local1580 = -1;
																	if (local955) {
																		local275 &= 0x7FFF;
																		@Pc(5940) Class159 local5940 = Static642.method8647(Static281.aClass3_Sub15_Sub1_4);
																		local1580 = local5940.anInt5734;
																		local3609 = local5940.aClass3_Sub1_Sub19_1.method7183(Static281.aClass3_Sub15_Sub1_4);
																	} else {
																		local3609 = Static320.method5429(Static388.method6124(Static281.aClass3_Sub15_Sub1_4));
																	}
																	local5863.aString66 = local3609.trim();
																	local5863.anInt6291 = local275 & 0xFF;
																	local5863.anInt6282 = 150;
																	local5863.anInt6332 = local275 >> 8;
																	if (local564 == 1 || local564 == 2) {
																		local677 = local955 ? 17 : 1;
																	} else {
																		local677 = local955 ? 17 : 2;
																	}
																	if (local564 == 2) {
																		Static194.method3870(local677, "<img=1>" + local5863.method5327(), local3609, null, "<img=1>" + local5863.method5331(), local1580, 0, local5863.aString67);
																	} else if (local564 == 1) {
																		Static194.method3870(local677, "<img=0>" + local5863.method5327(), local3609, null, "<img=0>" + local5863.method5331(), local1580, 0, local5863.aString67);
																	} else {
																		Static194.method3870(local677, local5863.method5327(), local3609, null, local5863.method5331(), local1580, 0, local5863.aString67);
																	}
																}
															}
															Static17.aClass218_2 = null;
															return true;
														} else if (Static119.aClass218_31 == Static17.aClass218_2) {
															Static581.method8030(Static281.aClass3_Sub15_Sub1_4, Static172.anInt4126, Static379.aClass228_6);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static380.aClass218_87) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8451();
															local73 = Static281.aClass3_Sub15_Sub1_4.method8429();
															if (local73 == 65535) {
																local73 = -1;
															}
															local275 = Static281.aClass3_Sub15_Sub1_4.method8418();
															local564 = Static281.aClass3_Sub15_Sub1_4.method8460();
															if (local564 == 65535) {
																local564 = -1;
															}
															Static44.method2076();
															for (local1815 = local73; local1815 <= local564; local1815++) {
																local1273 = ((long) local215 << 32) + ((long) local1815);
																local3807 = (Class3_Sub11) Static149.aClass307_22.method7424(local1273);
																if (local3807 != null) {
																	local3819 = new Class3_Sub11(local275, local3807.anInt1135);
																	local3807.method8671();
																} else if (local1815 == -1) {
																	local3819 = new Class3_Sub11(local275, Static113.method8285(local215).aClass3_Sub11_2.anInt1135);
																} else {
																	local3819 = new Class3_Sub11(local275, -1);
																}
																Static149.aClass307_22.method7425(local1273, local3819);
															}
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static597.aClass218_140) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8401();
															if (Static281.aClass3_Sub15_Sub1_4.method8401() == 0) {
																Static100.aClass298Array1[local215] = new Class298();
															} else {
																Static281.aClass3_Sub15_Sub1_4.anInt10282--;
																Static100.aClass298Array1[local215] = new Class298(Static281.aClass3_Sub15_Sub1_4);
															}
															Static17.aClass218_2 = null;
															Static591.anInt9853 = Static244.anInt5487;
															return true;
														} else if (Static207.aClass218_58 == Static17.aClass218_2) {
															Static648.method8673();
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static480.aClass218_114) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8429();
															local73 = Static281.aClass3_Sub15_Sub1_4.method8418();
															Static514.aClass166_1.method4930(local215, local73);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static412.aClass218_93) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8463();
															local73 = Static281.aClass3_Sub15_Sub1_4.method8414();
															Static44.method2076();
															if (local73 == 65535) {
																local73 = -1;
															}
															Static648.method8674(local73, local215);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static307.aClass218_76) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8463();
															local73 = Static281.aClass3_Sub15_Sub1_4.method8460();
															Static44.method2076();
															Static292.method5022(local73, local215);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static192.aClass218_52 == Static17.aClass218_2) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8414();
															local73 = Static281.aClass3_Sub15_Sub1_4.method8401();
															local2335 = (local73 & 0x1) == 1;
															Static590.method8096(local215, local2335);
															local564 = Static281.aClass3_Sub15_Sub1_4.method8414();
															for (local1815 = 0; local1815 < local564; local1815++) {
																local580 = Static281.aClass3_Sub15_Sub1_4.method8414();
																local1832 = Static281.aClass3_Sub15_Sub1_4.method8461();
																if (local1832 == 255) {
																	local1832 = Static281.aClass3_Sub15_Sub1_4.method8418();
																}
																Static178.method3627(local580 - 1, local1832, local215, local1815, local2335);
															}
															Static205.anIntArray274[Static380.anInt7242++ & 0x1F] = local215;
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static394.aClass218_90) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8414();
															Static44.method2076();
															Static3.method8622(local215);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static609.aClass218_144 == Static17.aClass218_2) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8447();
															local73 = Static281.aClass3_Sub15_Sub1_4.method8401();
															if (local215 == 255) {
																local73 = -1;
																local215 = -1;
															}
															Static505.method7372(local73, local215);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static524.aClass218_121 == Static17.aClass218_2) {
															Static348.method2698();
															Static17.aClass218_2 = null;
															return false;
														} else if (Static17.aClass218_2 == Static201.aClass218_56) {
															Static500.anInt8858 = Static281.aClass3_Sub15_Sub1_4.method8401();
															Static17.aClass218_2 = null;
															Static488.anInt8666 = Static244.anInt5487;
															return true;
														} else if (Static17.aClass218_2 == Static154.aClass218_42) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8414();
															if (local215 == 65535) {
																local215 = -1;
															}
															local73 = Static281.aClass3_Sub15_Sub1_4.method8401();
															local275 = Static281.aClass3_Sub15_Sub1_4.method8414();
															local564 = Static281.aClass3_Sub15_Sub1_4.method8401();
															local1815 = Static281.aClass3_Sub15_Sub1_4.method8414();
															Static167.method3515(local564, local215, local1815, local73, local275);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static599.aClass218_141 == Static17.aClass218_2) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8426();
															local73 = Static281.aClass3_Sub15_Sub1_4.method8451();
															Static44.method2076();
															Static239.method4611(local215, local73);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static150.aClass218_40) {
															Static120.anInt3090 = Static281.aClass3_Sub15_Sub1_4.method8440() << 3;
															Static591.anInt9848 = Static281.aClass3_Sub15_Sub1_4.method8461();
															Static633.anInt10415 = Static281.aClass3_Sub15_Sub1_4.method8438() << 3;
															Static17.aClass218_2 = null;
															return true;
														} else if (Static399.aClass218_91 == Static17.aClass218_2) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8418();
															local73 = Static281.aClass3_Sub15_Sub1_4.method8451();
															local275 = Static281.aClass3_Sub15_Sub1_4.method8460();
															Static44.method2076();
															Static362.method5870(local215, local73, local275, 5);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static384.aClass218_88) {
															Static44.method2076();
															Static2.method33();
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static135.aClass218_37) {
															local215 = Static281.aClass3_Sub15_Sub1_4.method8451();
															Static44.method2076();
															if (local215 == -1) {
																Static531.anInt9157 = -1;
																Static155.anInt3810 = -1;
															} else {
																local73 = local215 >> 14 & 0x3FFF;
																local275 = local215 & 0x3FFF;
																local73 -= Static446.anInt8090;
																if (local73 < 0) {
																	local73 = 0;
																} else if (local73 >= Static394.anInt7540) {
																	local73 = Static394.anInt7540;
																}
																local275 -= Static124.anInt3150;
																if (local275 < 0) {
																	local275 = 0;
																} else if (Static462.anInt8391 <= local275) {
																	local275 = Static462.anInt8391;
																}
																Static531.anInt9157 = (local73 << 9) + 256;
																Static155.anInt3810 = (local275 << 9) + 256;
															}
															Static17.aClass218_2 = null;
															return true;
														} else if (Static17.aClass218_2 == Static554.aClass218_131) {
															@Pc(6676) int[] local6676 = new int[4];
															for (local73 = 0; local73 < 4; local73++) {
																local6676[local73] = Static281.aClass3_Sub15_Sub1_4.method8426();
															}
															local275 = Static281.aClass3_Sub15_Sub1_4.method8414();
															local564 = Static281.aClass3_Sub15_Sub1_4.method8424();
															@Pc(6705) Class3_Sub49 local6705 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local275);
															if (local6705 != null) {
																Static121.method5577(local6705.aClass2_Sub3_Sub1_Sub2_Sub1_2, local6676, local564);
															}
															Static17.aClass218_2 = null;
															return true;
														} else if (Static211.aClass218_59 == Static17.aClass218_2) {
															local1178 = Static281.aClass3_Sub15_Sub1_4.method8440();
															local73 = Static281.aClass3_Sub15_Sub1_4.method8424();
															Static44.method2076();
															Static245.method4649(local1178, local73);
															Static17.aClass218_2 = null;
															return true;
														} else if (Static440.aClass218_99 == Static17.aClass218_2) {
															Static116.method2773(Static7.aClass20_1);
															Static17.aClass218_2 = null;
															return true;
														} else {
															Static544.method7724("T1 - " + (Static17.aClass218_2 == null ? -1 : Static17.aClass218_2.method5800()) + "," + (Static276.aClass218_71 == null ? -1 : Static276.aClass218_71.method5800()) + "," + (Static614.aClass218_148 == null ? -1 : Static614.aClass218_148.method5800()) + " - " + Static172.anInt4126, null);
															Static229.method4376(false);
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
