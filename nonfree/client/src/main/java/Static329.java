import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "F")
	public static float aFloat141;

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "Lclient!st;")
	public static final Class314 aClass314_94 = new Class314(30, 3);

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_188 = new Class194(40, 2);

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
	public static int anInt6246 = 0;

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
	public static final int anInt6248 = 328;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)V")
	public static void method5389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class351 local7 = Static567.aClass351ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static214.method3762(local7.aClass9_Sub2_Sub3_2);
		Static214.method3762(local7.aClass9_Sub2_Sub3_1);
		if (local7.aClass9_Sub2_Sub3_2 != null) {
			local7.aClass9_Sub2_Sub3_2 = null;
		}
		if (local7.aClass9_Sub2_Sub3_1 != null) {
			local7.aClass9_Sub2_Sub3_1 = null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V")
	public static void method5393() {
		if (Static71.anInt1424 == 0 || Static71.anInt1424 == 5) {
			return;
		}
		try {
			@Pc(26) short local26;
			if (Static312.anInt6050 == 0) {
				local26 = 250;
			} else {
				local26 = 2000;
			}
			if (++Static268.anInt5233 > local26) {
				if (Static547.aClass197_1 != null) {
					Static547.aClass197_1.method5188();
					Static547.aClass197_1 = null;
				}
				if (Static312.anInt6050 >= 3) {
					Static71.anInt1424 = 0;
					Static191.method3070(-5);
					return;
				}
				if (Static201.anInt3739 == 2) {
					Static28.aClass157_1.method3977();
				} else {
					Static627.aClass157_6.method3977();
				}
				Static71.anInt1424 = 1;
				Static268.anInt5233 = 0;
				Static312.anInt6050++;
			}
			if (Static71.anInt1424 == 1) {
				if (Static201.anInt3739 == 2) {
					Static64.aClass174_1 = Static28.aClass157_1.method3979(Static48.aClass298_12);
				} else {
					Static64.aClass174_1 = Static627.aClass157_6.method3979(Static48.aClass298_12);
				}
				Static71.anInt1424 = 2;
			}
			@Pc(132) Class3_Sub27 local132;
			if (Static71.anInt1424 == 2) {
				if (Static64.aClass174_1.anInt5121 == 2) {
					throw new IOException();
				}
				if (Static64.aClass174_1.anInt5121 != 1) {
					return;
				}
				Static547.aClass197_1 = Static92.method1554((Socket) Static64.aClass174_1.anObject12);
				Static64.aClass174_1 = null;
				Static357.method5760();
				local132 = Static458.method6779();
				local132.aClass3_Sub9_Sub2_2.method5572(Static284.aClass126_1.anInt3445);
				Static148.method2572(local132);
				Static263.method4385();
				Static71.anInt1424 = 3;
			}
			@Pc(171) int local171;
			if (Static71.anInt1424 == 3) {
				if (!Static547.aClass197_1.method5195(1)) {
					return;
				}
				Static547.aClass197_1.method5194(Static47.aClass3_Sub9_Sub2_1.aByteArray51, 1, 0);
				local171 = Static47.aClass3_Sub9_Sub2_1.aByteArray51[0] & 0xFF;
				if (local171 != 0) {
					Static71.anInt1424 = 0;
					Static191.method3070(local171);
					Static547.aClass197_1.method5188();
					Static547.aClass197_1 = null;
					Static270.method4511();
					return;
				}
				Static47.aClass3_Sub9_Sub2_1.anInt6453 = 0;
				@Pc(197) Class3_Sub9 local197 = new Class3_Sub9(518);
				@Pc(200) int[] local200 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				local197.method5572(10);
				local197.method5601(local200[0]);
				local197.method5601(local200[1]);
				local197.method5601(local200[2]);
				local197.method5601(local200[3]);
				local197.method5579(0L);
				local197.method5638(Static465.aString71);
				local197.method5579(Static248.aLong127);
				local197.method5579(Static231.aLong117);
				local197.method5582(Static105.aBigInteger1, Static239.aBigInteger2);
				Static357.method5760();
				@Pc(282) Class3_Sub27 local282 = Static458.method6779();
				@Pc(285) Class3_Sub9_Sub2 local285 = local282.aClass3_Sub9_Sub2_2;
				@Pc(300) int local300;
				@Pc(315) int local315;
				if (Static201.anInt3739 == 2) {
					if (Static82.anInt1653 == 13) {
						local285.method5572(Static284.aClass126_5.anInt3445);
					} else {
						local285.method5572(Static284.aClass126_3.anInt3445);
					}
					local285.method5620(0);
					local300 = local285.anInt6453;
					local285.method5601(641);
					local285.method5625(local197.aByteArray51, local197.anInt6453, 0);
					local315 = local285.anInt6453;
					local285.method5638(Static265.aString40);
					local285.method5572(Static550.anInt9147);
					local285.method5572(Static339.method917());
					local285.method5620(Static330.anInt6254);
					local285.method5620(Static190.anInt3576);
					local285.method5572(Static32.aClass3_Sub41_3.aClass7_Sub26_2.method8128());
					Static620.method8442(local285);
					local285.method5638(Static587.aString90);
					local285.method5601(Static541.anInt9077);
					@Pc(441) Class3_Sub9 local441 = Static32.aClass3_Sub41_3.method6770();
					local285.method5572(local441.anInt6453);
					local285.method5625(local441.aByteArray51, local441.anInt6453, 0);
					Static576.aBoolean708 = true;
					@Pc(463) Class3_Sub9 local463 = new Class3_Sub9(Static545.aClass3_Sub38_1.method6359());
					Static545.aClass3_Sub38_1.method6361(local463);
					local285.method5625(local463.aByteArray51, local463.aByteArray51.length, 0);
					local285.method5620(Static322.anInt6148);
					local285.method5579(Static145.aLong103);
					local285.method5572(Static451.aString66 == null ? 0 : 1);
					if (Static451.aString66 != null) {
						local285.method5638(Static451.aString66);
					}
					local285.method5572(Static420.method6469("jagtheora") ? 1 : 0);
					local285.method5572(Static543.aBoolean676 ? 1 : 0);
					Static172.method2844(local285);
					local285.method5576(local285.anInt6453, local200, local315);
					local285.method5629(local285.anInt6453 - local300);
				} else {
					local285.method5572(Static284.aClass126_6.anInt3445);
					local285.method5620(0);
					local300 = local285.anInt6453;
					local285.method5601(641);
					local285.method5625(local197.aByteArray51, local197.anInt6453, 0);
					local315 = local285.anInt6453;
					local285.method5638(Static265.aString40);
					local285.method5572(Static431.aClass133_11.anInt3574);
					local285.method5572(Static455.anInt7738);
					Static620.method8442(local285);
					local285.method5638(Static587.aString90);
					local285.method5601(Static541.anInt9077);
					Static172.method2844(local285);
					local285.method5576(local285.anInt6453, local200, local315);
					local285.method5629(local285.anInt6453 - local300);
				}
				Static148.method2572(local282);
				Static263.method4385();
				Static325.aClass20_2 = new Class20(local200);
				for (local300 = 0; local300 < 4; local300++) {
					local200[local300] += 50;
				}
				Static47.aClass3_Sub9_Sub2_1.method5643(local200);
				Static71.anInt1424 = 4;
			}
			if (Static71.anInt1424 == 4) {
				if (!Static547.aClass197_1.method5195(1)) {
					return;
				}
				Static547.aClass197_1.method5194(Static47.aClass3_Sub9_Sub2_1.aByteArray51, 1, 0);
				local171 = Static47.aClass3_Sub9_Sub2_1.aByteArray51[0] & 0xFF;
				if (local171 == 21) {
					Static71.anInt1424 = 7;
				} else if (local171 == 29) {
					Static71.anInt1424 = 13;
				} else if (local171 == 1) {
					Static71.anInt1424 = 5;
					Static191.method3070(local171);
					return;
				} else if (local171 == 2) {
					Static71.anInt1424 = 8;
				} else if (local171 == 15) {
					Static94.anInt1852 = -2;
					Static71.anInt1424 = 14;
				} else if (local171 == 23 && Static312.anInt6050 < 3) {
					Static312.anInt6050++;
					Static268.anInt5233 = 0;
					Static71.anInt1424 = 1;
					Static547.aClass197_1.method5188();
					Static547.aClass197_1 = null;
					return;
				} else {
					Static71.anInt1424 = 0;
					Static191.method3070(local171);
					Static547.aClass197_1.method5188();
					Static547.aClass197_1 = null;
					Static270.method4511();
					return;
				}
			}
			if (Static71.anInt1424 == 6) {
				Static357.method5760();
				local132 = Static458.method6779();
				@Pc(679) Class3_Sub9_Sub2 local679 = local132.aClass3_Sub9_Sub2_2;
				local679.method5650(Static325.aClass20_2);
				local679.method5652(Static284.aClass126_10.anInt3445);
				Static148.method2572(local132);
				Static263.method4385();
				Static71.anInt1424 = 4;
			} else if (Static71.anInt1424 == 7) {
				if (Static547.aClass197_1.method5195(1)) {
					Static547.aClass197_1.method5194(Static47.aClass3_Sub9_Sub2_1.aByteArray51, 1, 0);
					local171 = Static47.aClass3_Sub9_Sub2_1.aByteArray51[0] & 0xFF;
					Static607.anInt9800 = local171 * 50;
					Static71.anInt1424 = 0;
					Static191.method3070(21);
					Static547.aClass197_1.method5188();
					Static547.aClass197_1 = null;
					Static270.method4511();
				}
			} else if (Static71.anInt1424 == 13) {
				if (Static547.aClass197_1.method5195(1)) {
					Static547.aClass197_1.method5194(Static47.aClass3_Sub9_Sub2_1.aByteArray51, 1, 0);
					Static167.anInt3261 = Static47.aClass3_Sub9_Sub2_1.aByteArray51[0] & 0xFF;
					Static71.anInt1424 = 0;
					Static191.method3070(29);
					Static547.aClass197_1.method5188();
					Static547.aClass197_1 = null;
					Static270.method4511();
				}
			} else if (Static71.anInt1424 != 8) {
				@Pc(812) Class3_Sub9_Sub2 local812;
				if (Static71.anInt1424 == 9) {
					local812 = Static47.aClass3_Sub9_Sub2_1;
					if (Static201.anInt3739 == 2) {
						if (!Static547.aClass197_1.method5195(Static392.anInt7039)) {
							return;
						}
						Static547.aClass197_1.method5194(local812.aByteArray51, Static392.anInt7039, 0);
						local812.anInt6453 = 0;
						Static544.anInt9130 = local812.method5633();
						Static124.anInt2654 = local812.method5633();
						Static11.aBoolean13 = local812.method5633() == 1;
						Static317.aBoolean446 = local812.method5633() == 1;
						Static220.aBoolean333 = local812.method5633() == 1;
						Static61.aBoolean57 = local812.method5633() == 1;
						Static54.anInt1032 = local812.method5610();
						Static367.aBoolean486 = local812.method5633() == 1;
						Static279.anInt5376 = local812.method5596();
						Static166.aBoolean243 = local812.method5633() == 1;
						Static370.aClass284_3.method6913(Static166.aBoolean243);
						Static298.aClass132_1.method3058(Static166.aBoolean243);
						Static153.aClass2_1.method26(Static166.aBoolean243);
					} else if (Static547.aClass197_1.method5195(Static392.anInt7039)) {
						Static547.aClass197_1.method5194(local812.aByteArray51, Static392.anInt7039, 0);
						local812.anInt6453 = 0;
						Static544.anInt9130 = local812.method5633();
						Static124.anInt2654 = local812.method5633();
						Static11.aBoolean13 = local812.method5633() == 1;
						Static317.aBoolean446 = local812.method5633() == 1;
						Static220.aBoolean333 = local812.method5633() == 1;
						Static81.aLong53 = local812.method5603();
						@Pc(879) int local879 = local812.method5633();
						Static367.aBoolean486 = (local879 & 0x1) != 0;
						Static445.aBoolean551 = (local879 & 0x2) != 0;
						Static198.anInt7015 = local812.method5585();
						Static545.anInt9138 = local812.method5610();
						Static167.anInt3259 = local812.method5610();
						Static268.anInt5234 = local812.method5610();
						Static576.anInt9419 = local812.method5585();
						Static170.aClass174_4 = Static48.aClass298_12.method7273(Static576.anInt9419);
						Static192.anInt3595 = local812.method5633();
						Static590.anInt9672 = local812.method5610();
						Static431.anInt7512 = local812.method5610();
						Static67.aBoolean86 = local812.method5633() == 1;
						Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aString5 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aString6 = Static69.aString7 = local812.method5605();
						Static240.anInt4751 = local812.method5633();
						Static429.anInt7484 = local812.method5585();
						Static387.aBoolean503 = local812.method5633() == 1;
						Static57.aClass157_5 = new Class157();
						Static57.aClass157_5.anInt4641 = local812.method5610();
						if (Static57.aClass157_5.anInt4641 == 65535) {
							Static57.aClass157_5.anInt4641 = -1;
						}
						Static57.aClass157_5.aString34 = local812.method5605();
						if (Static38.aClass220_2 != Static508.aClass220_11) {
							Static57.aClass157_5.anInt4640 = Static57.aClass157_5.anInt4641 + 50000;
							Static57.aClass157_5.anInt4643 = Static57.aClass157_5.anInt4641 + 40000;
						}
						if (Static38.aClass220_2 != Static242.aClass220_6 && (Static28.aClass157_1.method3976(Static319.aClass157_4) || Static28.aClass157_1.method3976(Static132.aClass157_3))) {
							Static145.method3123();
						}
					} else {
						return;
					}
					if (Static11.aBoolean13 && !Static220.aBoolean333 || Static367.aBoolean486) {
						try {
							Static652.method1818("zap", Static303.anApplet3);
						} catch (@Pc(1146) Throwable local1146) {
							if (Static98.aBoolean157) {
								try {
									Static303.anApplet3.getAppletContext().showDocument(new URL(Static303.anApplet3.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1160) Exception local1160) {
								}
							}
						}
					} else {
						try {
							Static652.method1818("unzap", Static303.anApplet3);
						} catch (@Pc(1169) Throwable local1169) {
						}
					}
					if (Static508.aClass220_11 == Static38.aClass220_2) {
						try {
							Static652.method1818("loggedin", Static303.anApplet3);
						} catch (@Pc(1180) Throwable local1180) {
						}
					}
					if (Static201.anInt3739 != 2) {
						Static71.anInt1424 = 0;
						Static191.method3070(2);
						Static109.method1809();
						Static206.method3226(7);
						Static180.aClass194_100 = null;
						return;
					}
					Static71.anInt1424 = 11;
				}
				if (Static71.anInt1424 == 11) {
					if (!Static547.aClass197_1.method5195(3)) {
						return;
					}
					Static547.aClass197_1.method5194(Static47.aClass3_Sub9_Sub2_1.aByteArray51, 3, 0);
					Static71.anInt1424 = 12;
				}
				if (Static71.anInt1424 == 12) {
					local812 = Static47.aClass3_Sub9_Sub2_1;
					local812.anInt6453 = 0;
					if (local812.method5641()) {
						if (!Static547.aClass197_1.method5195(1)) {
							return;
						}
						Static547.aClass197_1.method5194(local812.aByteArray51, 1, 3);
					}
					Static180.aClass194_100 = Static85.method1427()[local812.method5651()];
					Static94.anInt1852 = local812.method5610();
					Static71.anInt1424 = 10;
				}
				if (Static71.anInt1424 == 10) {
					if (Static547.aClass197_1.method5195(Static94.anInt1852)) {
						Static547.aClass197_1.method5194(Static47.aClass3_Sub9_Sub2_1.aByteArray51, Static94.anInt1852, 0);
						Static47.aClass3_Sub9_Sub2_1.anInt6453 = 0;
						local171 = Static94.anInt1852;
						Static71.anInt1424 = 0;
						Static191.method3070(2);
						Static488.method7190();
						Static320.method7565(Static47.aClass3_Sub9_Sub2_1);
						Static270.anInt5273 = -1;
						if (Static180.aClass194_100 == Static117.aClass194_76) {
							Static243.method4100();
						} else {
							Static132.method2343();
						}
						if (Static47.aClass3_Sub9_Sub2_1.anInt6453 != local171) {
							throw new RuntimeException("lswp pos:" + Static47.aClass3_Sub9_Sub2_1.anInt6453 + " psize:" + local171);
						}
						Static180.aClass194_100 = null;
					}
				} else if (Static71.anInt1424 == 14) {
					if (Static94.anInt1852 == -2) {
						if (!Static547.aClass197_1.method5195(2)) {
							return;
						}
						Static547.aClass197_1.method5194(Static47.aClass3_Sub9_Sub2_1.aByteArray51, 2, 0);
						Static47.aClass3_Sub9_Sub2_1.anInt6453 = 0;
						Static94.anInt1852 = Static47.aClass3_Sub9_Sub2_1.method5610();
					}
					if (Static547.aClass197_1.method5195(Static94.anInt1852)) {
						Static547.aClass197_1.method5194(Static47.aClass3_Sub9_Sub2_1.aByteArray51, Static94.anInt1852, 0);
						Static47.aClass3_Sub9_Sub2_1.anInt6453 = 0;
						local171 = Static94.anInt1852;
						Static71.anInt1424 = 0;
						Static191.method3070(15);
						Static579.method8099();
						Static320.method7565(Static47.aClass3_Sub9_Sub2_1);
						if (Static47.aClass3_Sub9_Sub2_1.anInt6453 != local171) {
							throw new RuntimeException("lswpr pos:" + Static47.aClass3_Sub9_Sub2_1.anInt6453 + " psize:" + local171);
						}
						Static180.aClass194_100 = null;
					}
				}
			} else if (Static547.aClass197_1.method5195(1)) {
				Static547.aClass197_1.method5194(Static47.aClass3_Sub9_Sub2_1.aByteArray51, 1, 0);
				Static71.anInt1424 = 9;
				Static392.anInt7039 = Static47.aClass3_Sub9_Sub2_1.aByteArray51[0] & 0xFF;
			}
		} catch (@Pc(1417) IOException local1417) {
			if (Static547.aClass197_1 != null) {
				Static547.aClass197_1.method5188();
				Static547.aClass197_1 = null;
			}
			if (Static312.anInt6050 < 3) {
				if (Static201.anInt3739 == 2) {
					Static28.aClass157_1.method3977();
				} else {
					Static627.aClass157_6.method3977();
				}
				Static268.anInt5233 = 0;
				Static71.anInt1424 = 1;
				Static312.anInt6050++;
			} else {
				Static71.anInt1424 = 0;
				Static191.method3070(-4);
				Static270.method4511();
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V")
	public static void method5394(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static256.method4306(arg1, arg4, arg5, -1, arg0, arg3, arg2, (String) null);
	}
}
