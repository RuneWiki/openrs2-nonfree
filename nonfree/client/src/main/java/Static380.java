import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!np", name = "c", descriptor = "I")
	public static int anInt6270 = 0;

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(Z)V")
	public static void method5560() {
		if (Static548.anInt9248 == 0 || Static548.anInt9248 == 5) {
			return;
		}
		try {
			@Pc(21) short local21;
			if (Static450.anInt7672 == 0) {
				local21 = 250;
			} else {
				local21 = 2000;
			}
			if (++Static583.anInt9799 > local21) {
				if (Static495.aClass170_2 != null) {
					Static495.aClass170_2.method8119();
					Static495.aClass170_2 = null;
				}
				if (Static450.anInt7672 >= 3) {
					Static548.anInt9248 = 0;
					Static606.method8671(-5);
					return;
				}
				if (Static10.anInt220 == 2) {
					Static490.aClass306_5.method7223();
				} else {
					Static104.aClass306_2.method7223();
				}
				Static450.anInt7672++;
				Static583.anInt9799 = 0;
				Static548.anInt9248 = 1;
			}
			if (Static548.anInt9248 == 1) {
				if (Static10.anInt220 == 2) {
					Static302.aClass91_6 = Static490.aClass306_5.method7224(Static470.aClass100_14);
				} else {
					Static302.aClass91_6 = Static104.aClass306_2.method7224(Static470.aClass100_14);
				}
				Static548.anInt9248 = 2;
			}
			@Pc(130) Class5_Sub48 local130;
			if (Static548.anInt9248 == 2) {
				if (Static302.aClass91_6.anInt2271 == 2) {
					throw new IOException();
				}
				if (Static302.aClass91_6.anInt2271 != 1) {
					return;
				}
				Static495.aClass170_2 = Static295.method4602((Socket) Static302.aClass91_6.anObject2);
				Static302.aClass91_6 = null;
				Static6.method117();
				local130 = Static65.method1093();
				local130.aClass5_Sub22_Sub1_2.method5905(Static374.aClass293_1.anInt7773);
				Static277.method4436(local130);
				Static386.method5642();
				Static548.anInt9248 = 3;
			}
			@Pc(169) int local169;
			if (Static548.anInt9248 == 3) {
				if (!Static495.aClass170_2.method8122(1)) {
					return;
				}
				Static495.aClass170_2.method8123(0, 1, Static257.aClass5_Sub22_Sub1_1.aByteArray71);
				local169 = Static257.aClass5_Sub22_Sub1_1.aByteArray71[0] & 0xFF;
				if (local169 != 0) {
					Static548.anInt9248 = 0;
					Static606.method8671(local169);
					Static495.aClass170_2.method8119();
					Static495.aClass170_2 = null;
					Static584.method8438();
					return;
				}
				Static257.aClass5_Sub22_Sub1_1.anInt6629 = 0;
				@Pc(195) Class5_Sub22 local195 = new Class5_Sub22(518);
				@Pc(198) int[] local198 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				local195.method5905(10);
				local195.method5949(local198[0]);
				local195.method5949(local198[1]);
				local195.method5949(local198[2]);
				local195.method5949(local198[3]);
				local195.method5943(0L);
				local195.method5910(Static95.aString23);
				local195.method5943(Static66.aLong35);
				local195.method5943(Static358.aLong147);
				local195.method5955(Static227.aBigInteger4, Static170.aBigInteger2);
				Static6.method117();
				@Pc(280) Class5_Sub48 local280 = Static65.method1093();
				@Pc(283) Class5_Sub22_Sub1 local283 = local280.aClass5_Sub22_Sub1_2;
				@Pc(298) int local298;
				@Pc(313) int local313;
				if (Static10.anInt220 == 2) {
					if (Static151.anInt2620 == 13) {
						local283.method5905(Static374.aClass293_5.anInt7773);
					} else {
						local283.method5905(Static374.aClass293_3.anInt7773);
					}
					local283.method5918(0);
					local298 = local283.anInt6629;
					local283.method5949(635);
					local283.method5925(local195.aByteArray71, 0, local195.anInt6629);
					local313 = local283.anInt6629;
					local283.method5910(Static221.aString43);
					local283.method5905(Static92.anInt1879);
					local283.method5905(Static138.method2022());
					local283.method5918(Static345.anInt5827);
					local283.method5918(Static408.anInt7118);
					local283.method5905(Static97.aClass5_Sub25_8.aClass6_Sub23_2.method7627());
					Static322.method4879(local283);
					local283.method5910(Static463.aString84);
					local283.method5949(Static451.anInt7697);
					@Pc(437) Class5_Sub22 local437 = Static97.aClass5_Sub25_8.method3678();
					local283.method5905(local437.anInt6629);
					local283.method5925(local437.aByteArray71, 0, local437.anInt6629);
					Static339.aBoolean417 = true;
					@Pc(459) Class5_Sub22 local459 = new Class5_Sub22(Static399.aClass5_Sub28_1.method4321());
					Static399.aClass5_Sub28_1.method4320(local459);
					local283.method5925(local459.aByteArray71, 0, local459.aByteArray71.length);
					local283.method5918(Static621.anInt10361);
					local283.method5943(Static635.aLong275);
					local283.method5905(Static224.aString44 == null ? 0 : 1);
					if (Static224.aString44 != null) {
						local283.method5910(Static224.aString44);
					}
					local283.method5905(Static472.method7002("jagtheora") ? 1 : 0);
					Static639.method9008(local283);
					local283.method5919(local283.anInt6629, local313, local198);
					local283.method5952(local283.anInt6629 - local298);
				} else {
					local283.method5905(Static374.aClass293_6.anInt7773);
					local283.method5918(0);
					local298 = local283.anInt6629;
					local283.method5949(635);
					local283.method5925(local195.aByteArray71, 0, local195.anInt6629);
					local313 = local283.anInt6629;
					local283.method5910(Static221.aString43);
					local283.method5905(Static156.aClass63_2.anInt1655);
					local283.method5905(Static266.anInt4796);
					Static322.method4879(local283);
					local283.method5910(Static463.aString84);
					local283.method5949(Static451.anInt7697);
					Static639.method9008(local283);
					local283.method5919(local283.anInt6629, local313, local198);
					local283.method5952(local283.anInt6629 - local298);
				}
				Static277.method4436(local280);
				Static386.method5642();
				Static276.aClass251_2 = new Class251(local198);
				for (local298 = 0; local298 < 4; local298++) {
					local198[local298] += 50;
				}
				Static257.aClass5_Sub22_Sub1_1.method2652(local198);
				Static548.anInt9248 = 4;
			}
			if (Static548.anInt9248 == 4) {
				if (!Static495.aClass170_2.method8122(1)) {
					return;
				}
				Static495.aClass170_2.method8123(0, 1, Static257.aClass5_Sub22_Sub1_1.aByteArray71);
				local169 = Static257.aClass5_Sub22_Sub1_1.aByteArray71[0] & 0xFF;
				if (local169 == 21) {
					Static548.anInt9248 = 7;
				} else if (local169 == 29) {
					Static548.anInt9248 = 13;
				} else if (local169 == 1) {
					Static548.anInt9248 = 5;
					Static606.method8671(local169);
					return;
				} else if (local169 == 2) {
					Static548.anInt9248 = 8;
				} else if (local169 == 15) {
					Static548.anInt9248 = 14;
					Static50.anInt1005 = -2;
				} else if (local169 == 23 && Static450.anInt7672 < 3) {
					Static450.anInt7672++;
					Static583.anInt9799 = 0;
					Static548.anInt9248 = 1;
					Static495.aClass170_2.method8119();
					Static495.aClass170_2 = null;
					return;
				} else {
					Static548.anInt9248 = 0;
					Static606.method8671(local169);
					Static495.aClass170_2.method8119();
					Static495.aClass170_2 = null;
					Static584.method8438();
					return;
				}
			}
			if (Static548.anInt9248 == 6) {
				Static6.method117();
				local130 = Static65.method1093();
				@Pc(672) Class5_Sub22_Sub1 local672 = local130.aClass5_Sub22_Sub1_2;
				local672.method2653(Static276.aClass251_2);
				local672.method2656(Static374.aClass293_12.anInt7773);
				Static277.method4436(local130);
				Static386.method5642();
				Static548.anInt9248 = 4;
			} else if (Static548.anInt9248 == 7) {
				if (Static495.aClass170_2.method8122(1)) {
					Static495.aClass170_2.method8123(0, 1, Static257.aClass5_Sub22_Sub1_1.aByteArray71);
					local169 = Static257.aClass5_Sub22_Sub1_1.aByteArray71[0] & 0xFF;
					Static548.anInt9248 = 0;
					Static556.anInt9403 = local169 * 60 + 180;
					Static606.method8671(21);
					Static495.aClass170_2.method8119();
					Static495.aClass170_2 = null;
					Static584.method8438();
				}
			} else if (Static548.anInt9248 == 13) {
				if (Static495.aClass170_2.method8122(1)) {
					Static495.aClass170_2.method8123(0, 1, Static257.aClass5_Sub22_Sub1_1.aByteArray71);
					Static548.anInt9248 = 0;
					Static141.anInt2455 = Static257.aClass5_Sub22_Sub1_1.aByteArray71[0] & 0xFF;
					Static606.method8671(29);
					Static495.aClass170_2.method8119();
					Static495.aClass170_2 = null;
					Static584.method8438();
				}
			} else if (Static548.anInt9248 != 8) {
				@Pc(803) Class5_Sub22_Sub1 local803;
				if (Static548.anInt9248 == 9) {
					local803 = Static257.aClass5_Sub22_Sub1_1;
					if (Static10.anInt220 == 2) {
						if (!Static495.aClass170_2.method8122(Static274.anInt4913)) {
							return;
						}
						Static495.aClass170_2.method8123(0, Static274.anInt4913, local803.aByteArray71);
						local803.anInt6629 = 0;
						Static210.anInt4035 = local803.method5966();
						Static148.anInt2587 = local803.method5966();
						Static194.aBoolean235 = local803.method5966() == 1;
						Static92.aBoolean141 = local803.method5966() == 1;
						Static476.aBoolean586 = local803.method5966() == 1;
						Static34.aBoolean23 = local803.method5966() == 1;
						Static337.anInt5722 = local803.method5968();
						Static409.aBoolean218 = local803.method5966() == 1;
						Static451.anInt7695 = local803.method5926();
						Static283.aBoolean377 = local803.method5966() == 1;
						Static61.aClass246_7.method5493(Static283.aBoolean377);
						Static643.aClass275_2.method6646(Static283.aBoolean377);
						Static439.aClass92_2.method1913(Static283.aBoolean377);
					} else if (Static495.aClass170_2.method8122(Static274.anInt4913)) {
						Static495.aClass170_2.method8123(0, Static274.anInt4913, local803.aByteArray71);
						local803.anInt6629 = 0;
						Static210.anInt4035 = local803.method5966();
						Static148.anInt2587 = local803.method5966();
						Static194.aBoolean235 = local803.method5966() == 1;
						Static92.aBoolean141 = local803.method5966() == 1;
						Static476.aBoolean586 = local803.method5966() == 1;
						Static307.anInt2870 = local803.method5956();
						Static409.aBoolean218 = Static307.anInt2870 > 0;
						Static613.anInt10269 = local803.method5968();
						Static473.anInt8049 = local803.method5968();
						Static530.anInt9820 = local803.method5968();
						Static379.anInt6266 = local803.method5913();
						Static426.aClass91_8 = Static470.aClass100_14.method2086(Static379.anInt6266);
						Static468.anInt7881 = local803.method5966();
						Static338.anInt5740 = local803.method5968();
						Static130.anInt2327 = local803.method5968();
						Static12.aBoolean8 = local803.method5966() == 1;
						Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aString17 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aString16 = Static170.aString37 = local803.method5923();
						Static202.anInt3951 = local803.method5966();
						Static135.anInt2394 = local803.method5913();
						Static304.aClass306_3 = new Class306();
						Static304.aClass306_3.anInt8300 = local803.method5968();
						if (Static304.aClass306_3.anInt8300 == 65535) {
							Static304.aClass306_3.anInt8300 = -1;
						}
						Static304.aClass306_3.aString95 = local803.method5923();
						if (Static211.aClass15_2 != Static517.aClass15_8) {
							Static304.aClass306_3.anInt8296 = Static304.aClass306_3.anInt8300 + 40000;
							Static304.aClass306_3.anInt8294 = Static304.aClass306_3.anInt8300 + 50000;
						}
						if (Static389.aClass15_7 != Static211.aClass15_2 && (Static490.aClass306_5.method7226(Static481.aClass306_4) || Static490.aClass306_5.method7226(Static70.aClass306_1))) {
							Static12.method220();
						}
					} else {
						return;
					}
					if (Static194.aBoolean235 && !Static476.aBoolean586 || Static409.aBoolean218) {
						try {
							Static653.method5177(Static7.anApplet1, "zap");
						} catch (@Pc(1112) Throwable local1112) {
							if (Static11.aBoolean7) {
								try {
									Static7.anApplet1.getAppletContext().showDocument(new URL(Static7.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1126) Exception local1126) {
								}
							}
						}
					} else {
						try {
							Static653.method5177(Static7.anApplet1, "unzap");
						} catch (@Pc(1135) Throwable local1135) {
						}
					}
					if (Static211.aClass15_2 == Static517.aClass15_8) {
						try {
							Static653.method5177(Static7.anApplet1, "loggedin");
						} catch (@Pc(1146) Throwable local1146) {
						}
					}
					if (Static10.anInt220 != 2) {
						Static548.anInt9248 = 0;
						Static606.method8671(2);
						Static259.method4252();
						Static358.method5312(7);
						Static219.aClass337_68 = null;
						return;
					}
					Static548.anInt9248 = 11;
				}
				if (Static548.anInt9248 == 11) {
					if (!Static495.aClass170_2.method8122(3)) {
						return;
					}
					Static495.aClass170_2.method8123(0, 3, Static257.aClass5_Sub22_Sub1_1.aByteArray71);
					Static548.anInt9248 = 12;
				}
				if (Static548.anInt9248 == 12) {
					local803 = Static257.aClass5_Sub22_Sub1_1;
					local803.anInt6629 = 0;
					if (local803.method2647()) {
						if (!Static495.aClass170_2.method8122(1)) {
							return;
						}
						Static495.aClass170_2.method8123(3, 1, local803.aByteArray71);
					}
					Static219.aClass337_68 = Static100.method1626()[local803.method2657()];
					Static50.anInt1005 = local803.method5968();
					Static548.anInt9248 = 10;
				}
				if (Static548.anInt9248 == 10) {
					if (Static495.aClass170_2.method8122(Static50.anInt1005)) {
						Static495.aClass170_2.method8123(0, Static50.anInt1005, Static257.aClass5_Sub22_Sub1_1.aByteArray71);
						Static257.aClass5_Sub22_Sub1_1.anInt6629 = 0;
						Static548.anInt9248 = 0;
						local169 = Static50.anInt1005;
						Static606.method8671(2);
						Static256.method4229();
						Static96.method1590(Static257.aClass5_Sub22_Sub1_1);
						Static613.anInt10268 = -1;
						if (Static98.aClass337_114 == Static219.aClass337_68) {
							Static15.method228();
						} else {
							Static12.method223();
						}
						if (local169 != Static257.aClass5_Sub22_Sub1_1.anInt6629) {
							throw new RuntimeException("lswp pos:" + Static257.aClass5_Sub22_Sub1_1.anInt6629 + " psize:" + local169);
						}
						Static219.aClass337_68 = null;
					}
				} else if (Static548.anInt9248 == 14) {
					if (Static50.anInt1005 == -2) {
						if (!Static495.aClass170_2.method8122(2)) {
							return;
						}
						Static495.aClass170_2.method8123(0, 2, Static257.aClass5_Sub22_Sub1_1.aByteArray71);
						Static257.aClass5_Sub22_Sub1_1.anInt6629 = 0;
						Static50.anInt1005 = Static257.aClass5_Sub22_Sub1_1.method5968();
					}
					if (Static495.aClass170_2.method8122(Static50.anInt1005)) {
						Static495.aClass170_2.method8123(0, Static50.anInt1005, Static257.aClass5_Sub22_Sub1_1.aByteArray71);
						Static257.aClass5_Sub22_Sub1_1.anInt6629 = 0;
						Static548.anInt9248 = 0;
						local169 = Static50.anInt1005;
						Static606.method8671(15);
						Static603.method7574();
						Static96.method1590(Static257.aClass5_Sub22_Sub1_1);
						if (Static257.aClass5_Sub22_Sub1_1.anInt6629 != local169) {
							throw new RuntimeException("lswpr pos:" + Static257.aClass5_Sub22_Sub1_1.anInt6629 + " psize:" + local169);
						}
						Static219.aClass337_68 = null;
					}
				}
			} else if (Static495.aClass170_2.method8122(1)) {
				Static495.aClass170_2.method8123(0, 1, Static257.aClass5_Sub22_Sub1_1.aByteArray71);
				Static548.anInt9248 = 9;
				Static274.anInt4913 = Static257.aClass5_Sub22_Sub1_1.aByteArray71[0] & 0xFF;
			}
		} catch (@Pc(1379) IOException local1379) {
			if (Static495.aClass170_2 != null) {
				Static495.aClass170_2.method8119();
				Static495.aClass170_2 = null;
			}
			if (Static450.anInt7672 < 3) {
				if (Static10.anInt220 == 2) {
					Static490.aClass306_5.method7223();
				} else {
					Static104.aClass306_2.method7223();
				}
				Static548.anInt9248 = 1;
				Static450.anInt7672++;
				Static583.anInt9799 = 0;
			} else {
				Static548.anInt9248 = 0;
				Static606.method8671(-4);
				Static584.method8438();
			}
		}
	}
}
