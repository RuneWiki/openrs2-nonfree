import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!pu", name = "i", descriptor = "[Lclient!ol;")
	public static Class249[] aClass249Array1;

	@OriginalMember(owner = "client!pu", name = "q", descriptor = "Lclient!an;")
	public static final Class20 aClass20_18 = new Class20(13, 7);

	@OriginalMember(owner = "client!pu", name = "t", descriptor = "Lclient!gg;")
	public static final Class112 aClass112_50 = new Class112(3000000, 200);

	@OriginalMember(owner = "client!pu", name = "v", descriptor = "Lclient!k;")
	public static final Class171 aClass171_8 = new Class171();

	@OriginalMember(owner = "client!pu", name = "w", descriptor = "I")
	public static int anInt8026 = 0;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V")
	public static void method6711() {
		if (Static621.anInt10311 == 0 || Static621.anInt10311 == 5) {
			return;
		}
		try {
			@Pc(20) short local20;
			if (Static186.anInt4404 == 0) {
				local20 = 250;
			} else {
				local20 = 2000;
			}
			if (local20 < ++Static144.anInt3605) {
				if (Static412.aClass51_25 != null) {
					Static412.aClass51_25.method3508();
					Static412.aClass51_25 = null;
				}
				if (Static186.anInt4404 >= 3) {
					Static621.anInt10311 = 0;
					Static142.method3164(-5);
					return;
				}
				if (Static331.anInt6610 == 2) {
					Static621.aClass278_5.method6940();
				} else {
					Static303.aClass278_3.method6940();
				}
				Static621.anInt10311 = 1;
				Static144.anInt3605 = 0;
				Static186.anInt4404++;
			}
			if (Static621.anInt10311 == 1) {
				if (Static331.anInt6610 == 2) {
					Static235.aClass376_17 = Static621.aClass278_5.method6939(Static379.aClass228_6);
				} else {
					Static235.aClass376_17 = Static303.aClass278_3.method6939(Static379.aClass228_6);
				}
				Static621.anInt10311 = 2;
			}
			@Pc(126) Class3_Sub26 local126;
			if (Static621.anInt10311 == 2) {
				if (Static235.aClass376_17.anInt10510 == 2) {
					throw new IOException();
				}
				if (Static235.aClass376_17.anInt10510 != 1) {
					return;
				}
				Static412.aClass51_25 = Static510.method7403((Socket) Static235.aClass376_17.anObject19);
				Static235.aClass376_17 = null;
				Static415.method6511();
				local126 = Static588.method8070();
				local126.aClass3_Sub15_Sub1_3.method8448(Static577.aClass240_29.anInt7401);
				Static472.method5189(local126);
				Static388.method6125();
				Static621.anInt10311 = 3;
			}
			@Pc(165) int local165;
			if (Static621.anInt10311 == 3) {
				if (!Static412.aClass51_25.method3507(1)) {
					return;
				}
				Static412.aClass51_25.method3509(0, 1, Static281.aClass3_Sub15_Sub1_4.aByteArray106);
				local165 = Static281.aClass3_Sub15_Sub1_4.aByteArray106[0] & 0xFF;
				if (local165 != 0) {
					Static621.anInt10311 = 0;
					Static142.method3164(local165);
					Static412.aClass51_25.method3508();
					Static412.aClass51_25 = null;
					Static563.method7918();
					return;
				}
				Static281.aClass3_Sub15_Sub1_4.anInt10282 = 0;
				@Pc(188) Class3_Sub15 local188 = new Class3_Sub15(518);
				@Pc(191) int[] local191 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				local188.method8448(10);
				local188.method8419(local191[0]);
				local188.method8419(local191[1]);
				local188.method8419(local191[2]);
				local188.method8419(local191[3]);
				local188.method8411(0L);
				local188.method8417(Static562.aString109);
				local188.method8411(Static510.aLong222);
				local188.method8411(Static260.aLong134);
				local188.method8453(Static530.aBigInteger7, Static501.aBigInteger10);
				Static415.method6511();
				@Pc(273) Class3_Sub26 local273 = Static588.method8070();
				@Pc(276) Class3_Sub15_Sub1 local276 = local273.aClass3_Sub15_Sub1_3;
				@Pc(301) int local301;
				@Pc(316) int local316;
				if (Static331.anInt6610 == 2) {
					if (Static581.anInt9720 == 13) {
						local276.method8448(Static577.aClass240_33.anInt7401);
					} else {
						local276.method8448(Static577.aClass240_31.anInt7401);
					}
					local276.method8464(0);
					local301 = local276.anInt10282;
					local276.method8419(636);
					local276.method8430(local188.anInt10282, 0, local188.aByteArray106);
					local316 = local276.anInt10282;
					local276.method8417(Static141.aString29);
					local276.method8448(Static231.anInt5230);
					local276.method8448(Static626.method8490());
					local276.method8464(Static114.anInt2970);
					local276.method8464(Static256.anInt5669);
					local276.method8448(Static552.aClass3_Sub48_30.aClass23_Sub24_2.method6648());
					Static60.method1306(local276);
					local276.method8417(Static455.aString92);
					local276.method8419(Static134.anInt3486);
					@Pc(359) Class3_Sub15 local359 = Static552.aClass3_Sub48_30.method7825();
					local276.method8448(local359.anInt10282);
					local276.method8430(local359.anInt10282, 0, local359.aByteArray106);
					Static355.aBoolean601 = true;
					@Pc(381) Class3_Sub15 local381 = new Class3_Sub15(Static2.aClass3_Sub23_1.method3732());
					Static2.aClass3_Sub23_1.method3734(local381);
					local276.method8430(local381.aByteArray106.length, 0, local381.aByteArray106);
					local276.method8464(Static222.anInt5083);
					local276.method8411(Static100.aLong55);
					local276.method8448(Static331.aString72 == null ? 0 : 1);
					if (Static331.aString72 != null) {
						local276.method8417(Static331.aString72);
					}
					local276.method8448(Static493.method7236("jagtheora") ? 1 : 0);
					Static605.method8258(local276);
					local276.method8456(local316, local191, local276.anInt10282);
					local276.method8397(local276.anInt10282 - local301);
				} else {
					local276.method8448(Static577.aClass240_34.anInt7401);
					local276.method8464(0);
					local301 = local276.anInt10282;
					local276.method8419(636);
					local276.method8430(local188.anInt10282, 0, local188.aByteArray106);
					local316 = local276.anInt10282;
					local276.method8417(Static141.aString29);
					local276.method8448(Static648.aClass62_16.anInt2526);
					local276.method8448(Static380.anInt7247);
					Static60.method1306(local276);
					local276.method8417(Static455.aString92);
					local276.method8419(Static134.anInt3486);
					Static605.method8258(local276);
					local276.method8456(local316, local191, local276.anInt10282);
					local276.method8397(local276.anInt10282 - local301);
				}
				Static472.method5189(local273);
				Static388.method6125();
				Static403.aClass294_3 = new Class294(local191);
				for (local301 = 0; local301 < 4; local301++) {
					local191[local301] += 50;
				}
				Static281.aClass3_Sub15_Sub1_4.method2435(local191);
				Static621.anInt10311 = 4;
			}
			if (Static621.anInt10311 == 4) {
				if (!Static412.aClass51_25.method3507(1)) {
					return;
				}
				Static412.aClass51_25.method3509(0, 1, Static281.aClass3_Sub15_Sub1_4.aByteArray106);
				local165 = Static281.aClass3_Sub15_Sub1_4.aByteArray106[0] & 0xFF;
				if (local165 == 21) {
					Static621.anInt10311 = 7;
				} else if (local165 == 29) {
					Static621.anInt10311 = 13;
				} else if (local165 == 1) {
					Static621.anInt10311 = 5;
					Static142.method3164(local165);
					return;
				} else if (local165 == 2) {
					Static621.anInt10311 = 8;
				} else if (local165 == 15) {
					Static621.anInt10311 = 14;
					Static172.anInt4126 = -2;
				} else if (local165 == 23 && Static186.anInt4404 < 3) {
					Static621.anInt10311 = 1;
					Static186.anInt4404++;
					Static144.anInt3605 = 0;
					Static412.aClass51_25.method3508();
					Static412.aClass51_25 = null;
					return;
				} else {
					Static621.anInt10311 = 0;
					Static142.method3164(local165);
					Static412.aClass51_25.method3508();
					Static412.aClass51_25 = null;
					Static563.method7918();
					return;
				}
			}
			if (Static621.anInt10311 == 6) {
				Static415.method6511();
				local126 = Static588.method8070();
				@Pc(661) Class3_Sub15_Sub1 local661 = local126.aClass3_Sub15_Sub1_3;
				local661.method2436(Static403.aClass294_3);
				local661.method2441(Static577.aClass240_40.anInt7401);
				Static472.method5189(local126);
				Static388.method6125();
				Static621.anInt10311 = 4;
			} else if (Static621.anInt10311 == 7) {
				if (Static412.aClass51_25.method3507(1)) {
					Static412.aClass51_25.method3509(0, 1, Static281.aClass3_Sub15_Sub1_4.aByteArray106);
					local165 = Static281.aClass3_Sub15_Sub1_4.aByteArray106[0] & 0xFF;
					Static621.anInt10311 = 0;
					Static390.anInt7399 = (local165 + 3) * 60;
					Static142.method3164(21);
					Static412.aClass51_25.method3508();
					Static412.aClass51_25 = null;
					Static563.method7918();
				}
			} else if (Static621.anInt10311 == 13) {
				if (Static412.aClass51_25.method3507(1)) {
					Static412.aClass51_25.method3509(0, 1, Static281.aClass3_Sub15_Sub1_4.aByteArray106);
					Static126.anInt3178 = Static281.aClass3_Sub15_Sub1_4.aByteArray106[0] & 0xFF;
					Static621.anInt10311 = 0;
					Static142.method3164(29);
					Static412.aClass51_25.method3508();
					Static412.aClass51_25 = null;
					Static563.method7918();
				}
			} else if (Static621.anInt10311 != 8) {
				@Pc(792) Class3_Sub15_Sub1 local792;
				if (Static621.anInt10311 == 9) {
					local792 = Static281.aClass3_Sub15_Sub1_4;
					if (Static331.anInt6610 == 2) {
						if (!Static412.aClass51_25.method3507(Static570.anInt9678)) {
							return;
						}
						Static412.aClass51_25.method3509(0, Static570.anInt9678, local792.aByteArray106);
						local792.anInt10282 = 0;
						Static106.anInt2660 = local792.method8401();
						Static417.anInt7801 = local792.method8401();
						Static351.aBoolean592 = local792.method8401() == 1;
						Static201.aBoolean410 = local792.method8401() == 1;
						Static425.aBoolean751 = local792.method8401() == 1;
						Static535.aBoolean550 = local792.method8401() == 1;
						Static399.anInt7626 = local792.method8414();
						Static518.aBoolean849 = local792.method8401() == 1;
						Static611.anInt10103 = local792.method8450();
						Static87.aBoolean195 = local792.method8401() == 1;
						Static541.aClass349_4.method8113(Static87.aBoolean195);
						Static367.aClass281_1.method6974(Static87.aBoolean195);
						Static604.aClass139_2.method4347(Static87.aBoolean195);
					} else if (Static412.aClass51_25.method3507(Static570.anInt9678)) {
						Static412.aClass51_25.method3509(0, Static570.anInt9678, local792.aByteArray106);
						local792.anInt10282 = 0;
						Static106.anInt2660 = local792.method8401();
						Static417.anInt7801 = local792.method8401();
						Static351.aBoolean592 = local792.method8401() == 1;
						Static201.aBoolean410 = local792.method8401() == 1;
						Static425.aBoolean751 = local792.method8401() == 1;
						Static349.anInt6850 = local792.method8444();
						Static518.aBoolean849 = Static349.anInt6850 > 0;
						Static296.anInt6016 = local792.method8414();
						Static383.anInt7319 = local792.method8414();
						Static292.anInt5932 = local792.method8414();
						Static614.anInt10177 = local792.method8402();
						Static203.aClass376_15 = Static379.aClass228_6.method5943(Static614.anInt10177);
						Static144.anInt3606 = local792.method8401();
						Static611.anInt10114 = local792.method8414();
						Static377.anInt7134 = local792.method8414();
						Static47.aBoolean86 = local792.method8401() == 1;
						Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aString68 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aString67 = Static46.aString10 = local792.method8416();
						Static50.anInt1092 = local792.method8401();
						Static468.anInt8447 = local792.method8402();
						Static390.aClass278_4 = new Class278();
						Static390.aClass278_4.anInt8394 = local792.method8414();
						if (Static390.aClass278_4.anInt8394 == 65535) {
							Static390.aClass278_4.anInt8394 = -1;
						}
						Static390.aClass278_4.aString94 = local792.method8416();
						if (Static624.aClass107_7 != Static85.aClass107_2) {
							Static390.aClass278_4.anInt8398 = Static390.aClass278_4.anInt8394 + 40000;
							Static390.aClass278_4.anInt8395 = Static390.aClass278_4.anInt8394 + 50000;
						}
						if (Static109.aClass107_3 != Static85.aClass107_2 && (Static621.aClass278_5.method6938(Static300.aClass278_2) || Static621.aClass278_5.method6938(Static134.aClass278_1))) {
							Static389.method6145();
						}
					} else {
						return;
					}
					if (Static351.aBoolean592 && !Static425.aBoolean751 || Static518.aBoolean849) {
						try {
							Static653.method5390("zap", Static632.anApplet2);
						} catch (@Pc(1113) Throwable local1113) {
							if (Static614.aBoolean856) {
								try {
									Static632.anApplet2.getAppletContext().showDocument(new URL(Static632.anApplet2.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1127) Exception local1127) {
								}
							}
						}
					} else {
						try {
							Static653.method5390("unzap", Static632.anApplet2);
						} catch (@Pc(1104) Throwable local1104) {
						}
					}
					if (Static624.aClass107_7 == Static85.aClass107_2) {
						try {
							Static653.method5390("loggedin", Static632.anApplet2);
						} catch (@Pc(1138) Throwable local1138) {
						}
					}
					if (Static331.anInt6610 != 2) {
						Static621.anInt10311 = 0;
						Static142.method3164(2);
						Static359.method7954();
						Static182.method3694(7);
						Static17.aClass218_2 = null;
						return;
					}
					Static621.anInt10311 = 11;
				}
				if (Static621.anInt10311 == 11) {
					if (!Static412.aClass51_25.method3507(3)) {
						return;
					}
					Static412.aClass51_25.method3509(0, 3, Static281.aClass3_Sub15_Sub1_4.aByteArray106);
					Static621.anInt10311 = 12;
				}
				if (Static621.anInt10311 == 12) {
					local792 = Static281.aClass3_Sub15_Sub1_4;
					local792.anInt10282 = 0;
					if (local792.method2433()) {
						if (!Static412.aClass51_25.method3507(1)) {
							return;
						}
						Static412.aClass51_25.method3509(3, 1, local792.aByteArray106);
					}
					Static17.aClass218_2 = Static437.method6647()[local792.method2437()];
					Static172.anInt4126 = local792.method8414();
					Static621.anInt10311 = 10;
				}
				if (Static621.anInt10311 == 10) {
					if (Static412.aClass51_25.method3507(Static172.anInt4126)) {
						Static412.aClass51_25.method3509(0, Static172.anInt4126, Static281.aClass3_Sub15_Sub1_4.aByteArray106);
						Static281.aClass3_Sub15_Sub1_4.anInt10282 = 0;
						Static621.anInt10311 = 0;
						local165 = Static172.anInt4126;
						Static142.method3164(2);
						Static47.method1111();
						Static295.method5063(Static281.aClass3_Sub15_Sub1_4);
						Static472.anInt6106 = -1;
						if (Static17.aClass218_2 == Static524.aClass218_121) {
							Static348.method2698();
						} else {
							Static411.method6443();
						}
						if (Static281.aClass3_Sub15_Sub1_4.anInt10282 != local165) {
							throw new RuntimeException("lswp pos:" + Static281.aClass3_Sub15_Sub1_4.anInt10282 + " psize:" + local165);
						}
						Static17.aClass218_2 = null;
					}
				} else if (Static621.anInt10311 == 14) {
					if (Static172.anInt4126 == -2) {
						if (!Static412.aClass51_25.method3507(2)) {
							return;
						}
						Static412.aClass51_25.method3509(0, 2, Static281.aClass3_Sub15_Sub1_4.aByteArray106);
						Static281.aClass3_Sub15_Sub1_4.anInt10282 = 0;
						Static172.anInt4126 = Static281.aClass3_Sub15_Sub1_4.method8414();
					}
					if (Static412.aClass51_25.method3507(Static172.anInt4126)) {
						Static412.aClass51_25.method3509(0, Static172.anInt4126, Static281.aClass3_Sub15_Sub1_4.aByteArray106);
						Static281.aClass3_Sub15_Sub1_4.anInt10282 = 0;
						Static621.anInt10311 = 0;
						local165 = Static172.anInt4126;
						Static142.method3164(15);
						Static329.method5522();
						Static295.method5063(Static281.aClass3_Sub15_Sub1_4);
						if (local165 != Static281.aClass3_Sub15_Sub1_4.anInt10282) {
							throw new RuntimeException("lswpr pos:" + Static281.aClass3_Sub15_Sub1_4.anInt10282 + " psize:" + local165);
						}
						Static17.aClass218_2 = null;
					}
				}
			} else if (Static412.aClass51_25.method3507(1)) {
				Static412.aClass51_25.method3509(0, 1, Static281.aClass3_Sub15_Sub1_4.aByteArray106);
				Static621.anInt10311 = 9;
				Static570.anInt9678 = Static281.aClass3_Sub15_Sub1_4.aByteArray106[0] & 0xFF;
			}
		} catch (@Pc(1373) IOException local1373) {
			if (Static412.aClass51_25 != null) {
				Static412.aClass51_25.method3508();
				Static412.aClass51_25 = null;
			}
			if (Static186.anInt4404 < 3) {
				if (Static331.anInt6610 == 2) {
					Static621.aClass278_5.method6940();
				} else {
					Static303.aClass278_3.method6940();
				}
				Static144.anInt3605 = 0;
				Static621.anInt10311 = 1;
				Static186.anInt4404++;
			} else {
				Static621.anInt10311 = 0;
				Static142.method3164(-4);
				Static563.method7918();
			}
		}
	}
}
