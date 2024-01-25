import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!fba", name = "h", descriptor = "Z")
	public static boolean aBoolean770;

	@OriginalMember(owner = "client!fba", name = "l", descriptor = "I")
	public static int anInt10675;

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_123 = new Class286(78, 4);

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "(B)V")
	public static void method8924() {
		if (Static319.anInt10907 == 0 || Static319.anInt10907 == 10) {
			return;
		}
		try {
			@Pc(20) short local20;
			if (Static356.anInt6026 == 0) {
				local20 = 250;
			} else {
				local20 = 2000;
			}
			if (Static392.aBoolean553 && Static319.anInt10907 >= 6) {
				local20 = 6000;
			}
			if (Static293.anInt5245 != 2 || Static319.anInt10907 != 20 && Static249.anInt8065 != 42) {
				Static291.anInt5230++;
			}
			if (Static291.anInt5230 > local20) {
				Static167.aClass400_1.method9229();
				if (Static356.anInt6026 >= 3) {
					Static319.anInt10907 = 0;
					Static422.method6222(-5);
					return;
				}
				if (Static293.anInt5245 == 2) {
					Static272.aClass314_7.method7592();
				} else {
					Static60.aClass314_1.method7592();
				}
				Static291.anInt5230 = 0;
				Static356.anInt6026++;
				Static319.anInt10907 = 1;
			}
			if (Static319.anInt10907 == 1) {
				if (Static293.anInt5245 == 2) {
					Static167.aClass400_1.aClass201_9 = Static272.aClass314_7.method7595(Static310.aClass47_4);
				} else {
					Static167.aClass400_1.aClass201_9 = Static60.aClass314_1.method7595(Static310.aClass47_4);
				}
				Static319.anInt10907 = 2;
			}
			@Pc(183) Class3_Sub48 local183;
			@Pc(200) int local200;
			@Pc(251) int local251;
			if (Static319.anInt10907 == 2) {
				if (Static167.aClass400_1.aClass201_9.anInt5729 == 2) {
					throw new IOException();
				}
				if (Static167.aClass400_1.aClass201_9.anInt5729 != 1) {
					return;
				}
				Static167.aClass400_1.aClass255_2 = Static557.method7807((Socket) Static167.aClass400_1.aClass201_9.anObject16);
				Static167.aClass400_1.aClass201_9 = null;
				Static167.aClass400_1.method9230();
				local183 = Static649.method8732();
				if (Static392.aBoolean553) {
					local183.aClass3_Sub28_Sub2_1.method5329(Static504.aClass309_12.anInt8976);
					local183.aClass3_Sub28_Sub2_1.method5282(0);
					local200 = local183.aClass3_Sub28_Sub2_1.anInt6241;
					local183.aClass3_Sub28_Sub2_1.method5311(663);
					if (Static293.anInt5245 == 2) {
						local183.aClass3_Sub28_Sub2_1.method5329(Static178.anInt3225 == 14 ? 1 : 0);
					}
					@Pc(230) Class3_Sub28 local230 = Static582.method8679();
					local230.method5329(Static478.anInt8342);
					local230.method5282((int) (Math.random() * 9.9999999E7D));
					local230.method5329(Static141.anInt2658);
					local230.method5311(Static721.anInt3580);
					for (local251 = 0; local251 < 6; local251++) {
						local230.method5311((int) (Math.random() * 9.9999999E7D));
					}
					local230.method5319(Static31.aLong261);
					local230.method5329(Static667.aClass169_8.anInt4889);
					local230.method5329((int) (Math.random() * 9.9999999E7D));
					local230.method5310(Static19.aBigInteger1, Static691.aBigInteger5);
					local183.aClass3_Sub28_Sub2_1.method5274(local230.anInt6241, local230.aByteArray50, 0);
					local183.aClass3_Sub28_Sub2_1.method5335(local183.aClass3_Sub28_Sub2_1.anInt6241 - local200);
				} else {
					local183.aClass3_Sub28_Sub2_1.method5329(Static504.aClass309_1.anInt8976);
				}
				Static167.aClass400_1.method9223(local183);
				Static167.aClass400_1.method9227();
				Static319.anInt10907 = 3;
			}
			@Pc(368) int local368;
			if (Static319.anInt10907 == 3) {
				if (!Static167.aClass400_1.aClass255_2.method6264(1)) {
					return;
				}
				Static167.aClass400_1.aClass255_2.method6260(1, Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50, 0);
				local368 = Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50[0] & 0xFF;
				if (local368 != 0) {
					Static319.anInt10907 = 0;
					Static422.method6222(local368);
					Static167.aClass400_1.method9229();
					Static483.method7051();
					return;
				}
				if (Static392.aBoolean553) {
					Static319.anInt10907 = 4;
				} else {
					Static319.anInt10907 = 8;
				}
			}
			if (Static319.anInt10907 == 4) {
				if (!Static167.aClass400_1.aClass255_2.method6264(2)) {
					return;
				}
				Static167.aClass400_1.aClass255_2.method6260(2, Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50, 0);
				Static167.aClass400_1.aClass3_Sub28_Sub2_2.anInt6241 = 0;
				Static167.aClass400_1.aClass3_Sub28_Sub2_2.anInt6241 = Static167.aClass400_1.aClass3_Sub28_Sub2_2.method5272();
				Static319.anInt10907 = 5;
			}
			if (Static319.anInt10907 == 5) {
				if (!Static167.aClass400_1.aClass255_2.method6264(Static167.aClass400_1.aClass3_Sub28_Sub2_2.anInt6241)) {
					return;
				}
				Static167.aClass400_1.aClass255_2.method6260(Static167.aClass400_1.aClass3_Sub28_Sub2_2.anInt6241, Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50, 0);
				Static167.aClass400_1.aClass3_Sub28_Sub2_2.method5290(Static415.anIntArray396);
				Static167.aClass400_1.aClass3_Sub28_Sub2_2.anInt6241 = 0;
				@Pc(471) String local471 = Static167.aClass400_1.aClass3_Sub28_Sub2_2.method5269();
				Static167.aClass400_1.aClass3_Sub28_Sub2_2.anInt6241 = 0;
				@Pc(479) String local479 = "opensn";
				if (!Static215.aBoolean348 || Static97.method1297(Static310.aClass47_4, local479, 1, local471).anInt5729 == 2) {
					Static177.method5465(local471, Static310.aClass47_4, Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() == 1, true, local479);
				}
				Static319.anInt10907 = 6;
			}
			if (Static319.anInt10907 == 6) {
				if (!Static167.aClass400_1.aClass255_2.method6264(1)) {
					return;
				}
				Static167.aClass400_1.aClass255_2.method6260(1, Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50, 0);
				if ((Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50[0] & 0xFF) == 1) {
					Static319.anInt10907 = 7;
				}
			}
			if (Static319.anInt10907 == 7) {
				if (!Static167.aClass400_1.aClass255_2.method6264(16)) {
					return;
				}
				Static167.aClass400_1.aClass255_2.method6260(16, Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50, 0);
				Static167.aClass400_1.aClass3_Sub28_Sub2_2.anInt6241 = 16;
				Static167.aClass400_1.aClass3_Sub28_Sub2_2.method5290(Static415.anIntArray396);
				Static167.aClass400_1.aClass3_Sub28_Sub2_2.anInt6241 = 0;
				Static715.aString107 = Static364.aString94 = Static479.method7005(Static167.aClass400_1.aClass3_Sub28_Sub2_2.method5287());
				Static669.aLong366 = Static167.aClass400_1.aClass3_Sub28_Sub2_2.method5287();
				Static319.anInt10907 = 8;
			}
			@Pc(628) Class3_Sub28_Sub2 local628;
			if (Static319.anInt10907 == 8) {
				Static167.aClass400_1.aClass3_Sub28_Sub2_2.anInt6241 = 0;
				Static167.aClass400_1.method9230();
				local183 = Static649.method8732();
				local628 = local183.aClass3_Sub28_Sub2_1;
				@Pc(658) int local658;
				@Pc(667) Class3_Sub28 local667;
				@Pc(639) Class309 local639;
				if (Static293.anInt5245 == 2) {
					if (Static392.aBoolean553) {
						local639 = Static504.aClass309_13;
					} else {
						local639 = Static504.aClass309_3;
					}
					local628.method5329(local639.anInt8976);
					local628.method5282(0);
					local251 = local628.anInt6241;
					local658 = local628.anInt6241;
					if (!Static392.aBoolean553) {
						local628.method5311(663);
						local628.method5329(Static178.anInt3225 == 14 ? 1 : 0);
						local658 = local628.anInt6241;
						local667 = Static386.method3990();
						local628.method5274(local667.anInt6241, local667.aByteArray50, 0);
						local658 = local628.anInt6241;
						local628.method5283(Static715.aString107);
					}
					local628.method5329(Static707.anInt11053);
					local628.method5329(Static502.method7210());
					local628.method5282(Static575.anInt9435);
					local628.method5282(Static272.anInt5005);
					local628.method5329(Static713.aClass3_Sub55_31.aClass15_Sub20_2.method7387());
					Static528.method7482(local628);
					local628.method5283(Static236.aString77);
					local628.method5311(Static721.anInt3580);
					local667 = Static713.aClass3_Sub55_31.method8890();
					local628.method5329(local667.anInt6241);
					local628.method5274(local667.anInt6241, local667.aByteArray50, 0);
					Static675.aBoolean771 = true;
					@Pc(861) Class3_Sub28 local861 = new Class3_Sub28(Static50.aClass3_Sub25_1.method3466());
					Static50.aClass3_Sub25_1.method3471(local861);
					local628.method5274(local861.aByteArray50.length, local861.aByteArray50, 0);
					local628.method5311(Static317.anInt5604);
					local628.method5319(Static184.aLong116);
					local628.method5329(Static252.aString81 == null ? 0 : 1);
					if (Static252.aString81 != null) {
						local628.method5283(Static252.aString81);
					}
					local628.method5329(Static258.method4012("jagtheora") ? 1 : 0);
					local628.method5329(Static215.aBoolean348 ? 1 : 0);
					Static334.method4985(local628);
					local628.method5320(local628.anInt6241, local658, Static415.anIntArray396);
					local628.method5335(local628.anInt6241 - local251);
				} else {
					if (Static392.aBoolean553) {
						local639 = Static504.aClass309_13;
					} else {
						local639 = Static504.aClass309_5;
					}
					local628.method5329(local639.anInt8976);
					local628.method5282(0);
					local251 = local628.anInt6241;
					local658 = local628.anInt6241;
					if (!Static392.aBoolean553) {
						local628.method5311(663);
						local667 = Static386.method3990();
						local628.method5274(local667.anInt6241, local667.aByteArray50, 0);
						local658 = local628.anInt6241;
						local628.method5283(Static715.aString107);
					}
					local628.method5329(Static667.aClass169_8.anInt4889);
					local628.method5329(Static141.anInt2658);
					Static528.method7482(local628);
					local628.method5283(Static236.aString77);
					local628.method5311(Static721.anInt3580);
					Static334.method4985(local628);
					local628.method5320(local628.anInt6241, local658, Static415.anIntArray396);
					local628.method5335(local628.anInt6241 - local251);
				}
				Static167.aClass400_1.method9223(local183);
				Static167.aClass400_1.method9227();
				Static167.aClass400_1.aClass399_2 = new Class399(Static415.anIntArray396);
				for (@Pc(956) int local956 = 0; local956 < 4; local956++) {
					Static415.anIntArray396[local956] += 50;
				}
				Static167.aClass400_1.aClass3_Sub28_Sub2_2.method5342(Static415.anIntArray396);
				Static415.anIntArray396 = null;
				Static319.anInt10907 = 9;
			}
			if (Static319.anInt10907 == 9) {
				if (!Static167.aClass400_1.aClass255_2.method6264(1)) {
					return;
				}
				Static167.aClass400_1.aClass255_2.method6260(1, Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50, 0);
				local368 = Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50[0] & 0xFF;
				if (local368 == 21) {
					Static319.anInt10907 = 12;
				} else if (local368 == 29 || local368 == 45) {
					Static328.anInt5741 = local368;
					Static319.anInt10907 = 18;
				} else if (local368 == 1) {
					Static319.anInt10907 = 10;
					Static422.method6222(local368);
					return;
				} else if (local368 == 2) {
					Static319.anInt10907 = 13;
				} else if (local368 == 15) {
					Static319.anInt10907 = 19;
					Static167.aClass400_1.anInt11061 = -2;
				} else if (local368 == 23 && Static356.anInt6026 < 3) {
					Static356.anInt6026++;
					Static319.anInt10907 = 1;
					Static291.anInt5230 = 0;
					Static167.aClass400_1.aClass255_2.method6265();
					Static167.aClass400_1.aClass255_2 = null;
					return;
				} else if (local368 == 42) {
					Static319.anInt10907 = 20;
					Static422.method6222(local368);
					return;
				} else if (!Static275.aBoolean434 || Static392.aBoolean553 || Static478.anInt8342 == -1 || local368 != 35) {
					Static319.anInt10907 = 0;
					Static422.method6222(local368);
					Static167.aClass400_1.aClass255_2.method6265();
					Static167.aClass400_1.aClass255_2 = null;
					Static483.method7051();
					return;
				} else {
					Static392.aBoolean553 = true;
					Static291.anInt5230 = 0;
					Static319.anInt10907 = 1;
					Static167.aClass400_1.aClass255_2.method6265();
					Static167.aClass400_1.aClass255_2 = null;
					return;
				}
			}
			if (Static319.anInt10907 == 11) {
				Static167.aClass400_1.method9230();
				local183 = Static649.method8732();
				local628 = local183.aClass3_Sub28_Sub2_1;
				local628.method5348(Static167.aClass400_1.aClass399_2);
				local628.method5340(Static504.aClass309_9.anInt8976);
				Static167.aClass400_1.method9223(local183);
				Static167.aClass400_1.method9227();
				Static319.anInt10907 = 9;
			} else if (Static319.anInt10907 == 12) {
				if (Static167.aClass400_1.aClass255_2.method6264(1)) {
					Static167.aClass400_1.aClass255_2.method6260(1, Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50, 0);
					local368 = Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50[0] & 0xFF;
					Static319.anInt10907 = 0;
					Static456.anInt8042 = local368 * 50;
					Static422.method6222(21);
					Static167.aClass400_1.aClass255_2.method6265();
					Static167.aClass400_1.aClass255_2 = null;
					Static483.method7051();
				}
			} else if (Static319.anInt10907 == 20) {
				if (Static167.aClass400_1.aClass255_2.method6264(2)) {
					Static167.aClass400_1.aClass255_2.method6260(2, Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50, 0);
					Static319.anInt10907 = 9;
					Static486.anInt8431 = (Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50[1] & 0xFF) + ((Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50[0] & 0xFF) << 8);
				}
			} else if (Static319.anInt10907 == 18) {
				if (Static328.anInt5741 == 29) {
					if (!Static167.aClass400_1.aClass255_2.method6264(1)) {
						return;
					}
					Static167.aClass400_1.aClass255_2.method6260(1, Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50, 0);
					Static486.anInt8432 = Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50[0] & 0xFF;
				} else if (Static328.anInt5741 == 45) {
					if (!Static167.aClass400_1.aClass255_2.method6264(3)) {
						return;
					}
					Static167.aClass400_1.aClass255_2.method6260(3, Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50, 0);
					Static486.anInt8432 = Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50[0] & 0xFF;
					Static628.anInt10152 = (Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50[2] & 0xFF) + ((Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50[1] & 0xFF) << 8);
				} else {
					throw new IllegalStateException("Login step 18 not valid for pendingResponse=" + Static328.anInt5741);
				}
				Static319.anInt10907 = 0;
				Static422.method6222(Static328.anInt5741);
				Static167.aClass400_1.aClass255_2.method6265();
				Static167.aClass400_1.aClass255_2 = null;
				Static483.method7051();
			} else if (Static319.anInt10907 != 13) {
				@Pc(1462) Class3_Sub28_Sub2 local1462;
				if (Static319.anInt10907 == 14) {
					local1462 = Static167.aClass400_1.aClass3_Sub28_Sub2_2;
					if (Static293.anInt5245 == 2) {
						if (!Static167.aClass400_1.aClass255_2.method6264(Static423.anInt7464)) {
							return;
						}
						Static167.aClass400_1.aClass255_2.method6260(Static423.anInt7464, local1462.aByteArray50, 0);
						local1462.anInt6241 = 0;
						Static651.anInt10450 = local1462.method5322(-21);
						Static78.anInt1225 = local1462.method5322(-61);
						Static125.aBoolean199 = local1462.method5322(-8) == 1;
						Static697.aBoolean790 = local1462.method5322(-97) == 1;
						Static599.aBoolean707 = local1462.method5322(-111) == 1;
						Static553.aBoolean677 = local1462.method5322(-32) == 1;
						Static584.anInt9539 = local1462.method5272();
						Static608.aBoolean714 = local1462.method5322(-119) == 1;
						Static189.anInt3335 = local1462.method5294();
						Static312.aBoolean458 = local1462.method5322(-38) == 1;
						Static46.aString15 = local1462.method5295();
						Static70.aClass323_1.method7795(Static312.aBoolean458);
						Static243.aClass406_2.method9397(Static312.aBoolean458);
						Static631.aClass85_2.method2220(Static312.aBoolean458);
					} else if (Static167.aClass400_1.aClass255_2.method6264(Static423.anInt7464)) {
						Static167.aClass400_1.aClass255_2.method6260(Static423.anInt7464, local1462.aByteArray50, 0);
						local1462.anInt6241 = 0;
						Static651.anInt10450 = local1462.method5322(-113);
						Static78.anInt1225 = local1462.method5322(-97);
						Static125.aBoolean199 = local1462.method5322(-127) == 1;
						Static697.aBoolean790 = local1462.method5322(-43) == 1;
						Static599.aBoolean707 = local1462.method5322(-31) == 1;
						Static590.aLong329 = local1462.method5287();
						Static705.aLong376 = Static590.aLong329 - Static626.method8479() - local1462.method5336();
						local200 = local1462.method5322(-73);
						Static96.aBoolean127 = (local200 & 0x2) != 0;
						Static608.aBoolean714 = (local200 & 0x1) != 0;
						Static543.anInt9107 = local1462.method5312();
						Static542.aBoolean669 = local1462.method5322(-21) == 1;
						Static59.anInt926 = local1462.method5312();
						Static715.anInt7772 = local1462.method5272();
						Static554.anInt9249 = local1462.method5272();
						Static681.anInt10762 = local1462.method5272();
						Static709.anInt11217 = local1462.method5312();
						Static183.aClass201_5 = Static310.aClass47_4.method949(Static709.anInt11217);
						Static666.anInt10604 = local1462.method5322(-117);
						Static513.anInt10412 = local1462.method5272();
						Static621.anInt10014 = local1462.method5272();
						Static626.aBoolean733 = local1462.method5322(-24) == 1;
						Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aString109 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aString108 = Static508.aString113 = local1462.method5269();
						Static496.anInt8520 = local1462.method5322(-75);
						Static277.anInt5059 = local1462.method5312();
						Static645.aBoolean754 = local1462.method5322(-23) == 1;
						Static131.aClass314_3 = new Class314();
						Static131.aClass314_3.anInt9072 = local1462.method5272();
						if (Static131.aClass314_3.anInt9072 == 65535) {
							Static131.aClass314_3.anInt9072 = -1;
						}
						Static131.aClass314_3.aString117 = local1462.method5269();
						if (Static487.aClass371_7 != Static364.aClass371_4) {
							Static131.aClass314_3.anInt9073 = Static131.aClass314_3.anInt9072 + 50000;
							Static131.aClass314_3.anInt9071 = Static131.aClass314_3.anInt9072 + 40000;
						}
						if (Static487.aClass371_7 != Static533.aClass371_8 && (Static487.aClass371_7 != Static541.aClass371_5 || Static651.anInt10450 < 2) && Static272.aClass314_7.method7594(Static87.aClass314_2)) {
							Static407.method6075();
						}
					} else {
						return;
					}
					if (Static125.aBoolean199 && !Static599.aBoolean707 || Static608.aBoolean714) {
						try {
							Static733.method8728(Static395.anApplet1, "zap");
						} catch (@Pc(1876) Throwable local1876) {
							if (Static202.aBoolean285) {
								try {
									Static395.anApplet1.getAppletContext().showDocument(new URL(Static395.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1894) Exception local1894) {
								}
							}
						}
					} else {
						try {
							Static733.method8728(Static395.anApplet1, "unzap");
						} catch (@Pc(1905) Throwable local1905) {
						}
					}
					if (Static487.aClass371_7 == Static364.aClass371_4) {
						try {
							Static733.method8728(Static395.anApplet1, "loggedin");
						} catch (@Pc(1918) Throwable local1918) {
						}
					}
					if (Static293.anInt5245 != 2) {
						Static319.anInt10907 = 0;
						Static422.method6222(2);
						Static186.method2833();
						Static638.method8657(7);
						Static167.aClass400_1.aClass186_196 = null;
						return;
					}
					Static319.anInt10907 = 16;
				}
				if (Static319.anInt10907 == 16) {
					if (!Static167.aClass400_1.aClass255_2.method6264(3)) {
						return;
					}
					Static167.aClass400_1.aClass255_2.method6260(3, Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50, 0);
					Static319.anInt10907 = 17;
				}
				if (Static319.anInt10907 == 17) {
					local1462 = Static167.aClass400_1.aClass3_Sub28_Sub2_2;
					local1462.anInt6241 = 0;
					if (local1462.method5339()) {
						if (!Static167.aClass400_1.aClass255_2.method6264(1)) {
							return;
						}
						Static167.aClass400_1.aClass255_2.method6260(1, local1462.aByteArray50, 3);
					}
					Static167.aClass400_1.aClass186_196 = Static710.method9253()[local1462.method5347()];
					Static167.aClass400_1.anInt11061 = local1462.method5272();
					Static319.anInt10907 = 15;
				}
				if (Static319.anInt10907 == 15) {
					if (Static167.aClass400_1.aClass255_2.method6264(Static167.aClass400_1.anInt11061)) {
						Static167.aClass400_1.aClass255_2.method6260(Static167.aClass400_1.anInt11061, Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50, 0);
						Static167.aClass400_1.aClass3_Sub28_Sub2_2.anInt6241 = 0;
						local368 = Static167.aClass400_1.anInt11061;
						Static319.anInt10907 = 0;
						Static422.method6222(2);
						Static434.method5150();
						Static89.method1197(Static167.aClass400_1.aClass3_Sub28_Sub2_2);
						Static82.anInt1266 = -1;
						if (Static167.aClass400_1.aClass186_196 == Static395.aClass186_124) {
							Static280.method4255();
						} else {
							Static79.method1031();
						}
						if (Static167.aClass400_1.aClass3_Sub28_Sub2_2.anInt6241 != local368) {
							throw new RuntimeException("lswp pos:" + Static167.aClass400_1.aClass3_Sub28_Sub2_2.anInt6241 + " psize:" + local368);
						}
						Static167.aClass400_1.aClass186_196 = null;
					}
				} else if (Static319.anInt10907 == 19) {
					if (Static167.aClass400_1.anInt11061 == -2) {
						if (!Static167.aClass400_1.aClass255_2.method6264(2)) {
							return;
						}
						Static167.aClass400_1.aClass255_2.method6260(2, Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50, 0);
						Static167.aClass400_1.aClass3_Sub28_Sub2_2.anInt6241 = 0;
						Static167.aClass400_1.anInt11061 = Static167.aClass400_1.aClass3_Sub28_Sub2_2.method5272();
					}
					if (Static167.aClass400_1.aClass255_2.method6264(Static167.aClass400_1.anInt11061)) {
						Static167.aClass400_1.aClass255_2.method6260(Static167.aClass400_1.anInt11061, Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50, 0);
						Static167.aClass400_1.aClass3_Sub28_Sub2_2.anInt6241 = 0;
						Static319.anInt10907 = 0;
						local368 = Static167.aClass400_1.anInt11061;
						Static422.method6222(15);
						Static103.method1356();
						Static89.method1197(Static167.aClass400_1.aClass3_Sub28_Sub2_2);
						if (local368 != Static167.aClass400_1.aClass3_Sub28_Sub2_2.anInt6241) {
							throw new RuntimeException("lswpr pos:" + Static167.aClass400_1.aClass3_Sub28_Sub2_2.anInt6241 + " psize:" + local368);
						}
						Static167.aClass400_1.aClass186_196 = null;
					}
				}
			} else if (Static167.aClass400_1.aClass255_2.method6264(1)) {
				Static167.aClass400_1.aClass255_2.method6260(1, Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50, 0);
				Static423.anInt7464 = Static167.aClass400_1.aClass3_Sub28_Sub2_2.aByteArray50[0] & 0xFF;
				Static319.anInt10907 = 14;
			}
		} catch (@Pc(2235) IOException local2235) {
			Static167.aClass400_1.method9229();
			if (Static356.anInt6026 >= 3) {
				Static319.anInt10907 = 0;
				Static422.method6222(-4);
				Static483.method7051();
			} else {
				if (Static293.anInt5245 == 2) {
					Static272.aClass314_7.method7592();
				} else {
					Static60.aClass314_1.method7592();
				}
				Static291.anInt5230 = 0;
				Static356.anInt6026++;
				Static319.anInt10907 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V")
	public static void method8925() {
		Static470.method6951();
		Static178.aBoolean264 = false;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!gja;I)I")
	public static int method8930(@OriginalArg(0) Class19_Sub1_Sub3_Sub2_Sub1 arg0) {
		@Pc(8) Class18 local8 = arg0.aClass18_1;
		if (local8.anIntArray23 != null) {
			local8 = local8.method407(Static577.aClass362_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(33) int local33 = local8.anInt462;
		@Pc(37) Class274 local37 = arg0.method6600();
		@Pc(44) int local44 = arg0.aClass100_8.method8976();
		if (local44 == -1 || arg0.aBoolean595) {
			local33 = local8.anInt447;
		} else if (local37.anInt8174 == local44 || local37.anInt8180 == local44 || local37.anInt8171 == local44 || local37.anInt8197 == local44) {
			local33 = local8.anInt455;
		} else if (local44 == local37.anInt8185 || local37.anInt8166 == local44 || local37.anInt8159 == local44 || local37.anInt8181 == local44) {
			local33 = local8.anInt434;
		}
		return local33;
	}
}
