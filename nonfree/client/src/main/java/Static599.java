import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!vea", name = "e", descriptor = "Lclient!jn;")
	public static Class176 aClass176_3;

	@OriginalMember(owner = "client!vea", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString137;

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "I")
	public static int anInt9774 = -1;

	@OriginalMember(owner = "client!vea", name = "f", descriptor = "S")
	public static short aShort123 = 1;

	@OriginalMember(owner = "client!vea", name = "g", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_91 = new Class181(12, 7);

	@OriginalMember(owner = "client!vea", name = "j", descriptor = "Lclient!bw;")
	public static final Class43 aClass43_2 = new Class43(false);

	@OriginalMember(owner = "client!vea", name = "k", descriptor = "Lclient!bw;")
	public static Class43 aClass43_3 = aClass43_2;

	@OriginalMember(owner = "client!vea", name = "m", descriptor = "Lclient!mha;")
	public static final Class228 aClass228_11 = new Class228(6, 1);

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(II)Lclient!fga;")
	public static Class107 method8374(@OriginalArg(0) int arg0) {
		@Pc(12) Class107 local12 = (Class107) Static437.aClass293_50.method6921((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static253.aClass384_62.method8885(0, arg0);
		local12 = new Class107();
		if (local22 != null) {
			local12.method2238(new Class5_Sub12(local22));
		}
		local12.method2239();
		Static437.aClass293_50.method6925((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(BLclient!vfa;)Lclient!vfa;")
	public static Class357 method8375(@OriginalArg(1) Class357 arg0) {
		@Pc(6) Class357 local6 = Static74.method1223(arg0);
		if (local6 == null) {
			local6 = arg0.aClass357_13;
		}
		return local6;
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(I)Lclient!pf;")
	public static Class5_Sub40 method8376() {
		@Pc(6) Class5_Sub40 local6 = Static240.method3662();
		local6.aClass181_61 = null;
		local6.anInt7281 = 0;
		local6.aClass5_Sub12_Sub2_2 = new Class5_Sub12_Sub2(5000);
		return local6;
	}

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "(I)V")
	public static void method8377() {
		if (Static548.anInt9084 == 0 || Static548.anInt9084 == 5) {
			return;
		}
		try {
			@Pc(17) short local17;
			if (Static100.anInt1576 == 0) {
				local17 = 250;
			} else {
				local17 = 2000;
			}
			if (++Static334.anInt5792 > local17) {
				if (Static487.aClass30_2 != null) {
					Static487.aClass30_2.method671();
					Static487.aClass30_2 = null;
				}
				if (Static100.anInt1576 >= 3) {
					Static548.anInt9084 = 0;
					Static43.method745(-5);
					return;
				}
				if (Static264.anInt4388 == 2) {
					Static282.aClass109_2.method2382();
				} else {
					Static398.aClass109_3.method2382();
				}
				Static548.anInt9084 = 1;
				Static334.anInt5792 = 0;
				Static100.anInt1576++;
			}
			if (Static548.anInt9084 == 1) {
				if (Static264.anInt4388 == 2) {
					Static26.aClass330_1 = Static282.aClass109_2.method2383(Static214.aClass192_1);
				} else {
					Static26.aClass330_1 = Static398.aClass109_3.method2383(Static214.aClass192_1);
				}
				Static548.anInt9084 = 2;
			}
			@Pc(125) Class5_Sub40 local125;
			if (Static548.anInt9084 == 2) {
				if (Static26.aClass330_1.anInt9132 == 2) {
					throw new IOException();
				}
				if (Static26.aClass330_1.anInt9132 != 1) {
					return;
				}
				Static487.aClass30_2 = Static159.method2412((Socket) Static26.aClass330_1.anObject19);
				Static26.aClass330_1 = null;
				Static436.method6507();
				local125 = method8376();
				local125.aClass5_Sub12_Sub2_2.method8647(Static603.aClass244_1.anInt6597);
				Static612.method8496(local125);
				Static483.method6971();
				Static548.anInt9084 = 3;
			}
			@Pc(166) int local166;
			if (Static548.anInt9084 == 3) {
				if (!Static487.aClass30_2.method669(1)) {
					return;
				}
				Static487.aClass30_2.method677(Static167.aClass5_Sub12_Sub2_1.aByteArray104, 1, 0);
				local166 = Static167.aClass5_Sub12_Sub2_1.aByteArray104[0] & 0xFF;
				if (local166 != 0) {
					Static548.anInt9084 = 0;
					Static43.method745(local166);
					Static487.aClass30_2.method671();
					Static487.aClass30_2 = null;
					Static166.method2528();
					return;
				}
				Static167.aClass5_Sub12_Sub2_1.anInt10154 = 0;
				@Pc(194) Class5_Sub12 local194 = new Class5_Sub12(518);
				@Pc(197) int[] local197 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				local194.method8647(10);
				local194.method8622(local197[0]);
				local194.method8622(local197[1]);
				local194.method8622(local197[2]);
				local194.method8622(local197[3]);
				local194.method8653(0L);
				local194.method8619(Static94.aString145);
				local194.method8653(Static271.aLong139);
				local194.method8653(Static2.aLong1);
				local194.method8630(Static36.aBigInteger3, Static5.aBigInteger1);
				Static436.method6507();
				@Pc(285) Class5_Sub40 local285 = method8376();
				@Pc(288) Class5_Sub12_Sub2 local288 = local285.aClass5_Sub12_Sub2_2;
				@Pc(315) int local315;
				@Pc(330) int local330;
				if (Static264.anInt4388 == 2) {
					if (Static469.anInt7883 == 13) {
						local288.method8647(Static603.aClass244_5.anInt6597);
					} else {
						local288.method8647(Static603.aClass244_3.anInt6597);
					}
					local288.method8655(0);
					local315 = local288.anInt10154;
					local288.method8622(640);
					local288.method8651(0, local194.aByteArray104, local194.anInt10154);
					local330 = local288.anInt10154;
					local288.method8619(Static358.aString114);
					local288.method8647(Static536.anInt8899);
					local288.method8647(Static259.method1979());
					local288.method8655(Static254.anInt4283);
					local288.method8655(Static438.anInt7403);
					local288.method8647(Static627.aClass5_Sub46_31.aClass11_Sub6_2.method1369());
					Static403.method6186(local288);
					local288.method8619(Static604.aString143);
					local288.method8622(Static141.anInt2321);
					@Pc(375) Class5_Sub12 local375 = Static627.aClass5_Sub46_31.method8189();
					local288.method8647(local375.anInt10154);
					local288.method8651(0, local375.aByteArray104, local375.anInt10154);
					Static71.aBoolean80 = true;
					@Pc(397) Class5_Sub12 local397 = new Class5_Sub12(Static343.aClass5_Sub28_1.method4945());
					Static343.aClass5_Sub28_1.method4943(local397);
					local288.method8651(0, local397.aByteArray104, local397.aByteArray104.length);
					local288.method8655(Static115.anInt1789);
					local288.method8653(Static55.aLong30);
					local288.method8647(Static19.aString5 == null ? 0 : 1);
					if (Static19.aString5 != null) {
						local288.method8619(Static19.aString5);
					}
					local288.method8647(Static3.method38("jagtheora") ? 1 : 0);
					local288.method8647(Static297.aBoolean391 ? 1 : 0);
					Static154.method2236(local288);
					local288.method8620(local197, local288.anInt10154, local330);
					local288.method8642(local288.anInt10154 - local315);
				} else {
					local288.method8647(Static603.aClass244_6.anInt6597);
					local288.method8655(0);
					local315 = local288.anInt10154;
					local288.method8622(640);
					local288.method8651(0, local194.aByteArray104, local194.anInt10154);
					local330 = local288.anInt10154;
					local288.method8619(Static358.aString114);
					local288.method8647(Static24.aClass235_1.anInt6378);
					local288.method8647(Static321.anInt5554);
					Static403.method6186(local288);
					local288.method8619(Static604.aString143);
					local288.method8622(Static141.anInt2321);
					Static154.method2236(local288);
					local288.method8620(local197, local288.anInt10154, local330);
					local288.method8642(local288.anInt10154 - local315);
				}
				Static612.method8496(local285);
				Static483.method6971();
				Static98.aClass208_2 = new Class208(local197);
				for (local315 = 0; local315 < 4; local315++) {
					local197[local315] += 50;
				}
				Static167.aClass5_Sub12_Sub2_1.method8660(local197);
				Static548.anInt9084 = 4;
			}
			if (Static548.anInt9084 == 4) {
				if (!Static487.aClass30_2.method669(1)) {
					return;
				}
				Static487.aClass30_2.method677(Static167.aClass5_Sub12_Sub2_1.aByteArray104, 1, 0);
				local166 = Static167.aClass5_Sub12_Sub2_1.aByteArray104[0] & 0xFF;
				if (local166 == 21) {
					Static548.anInt9084 = 7;
				} else if (local166 == 29) {
					Static548.anInt9084 = 13;
				} else if (local166 == 1) {
					Static548.anInt9084 = 5;
					Static43.method745(local166);
					return;
				} else if (local166 == 2) {
					Static548.anInt9084 = 8;
				} else if (local166 == 15) {
					Static60.anInt3115 = -2;
					Static548.anInt9084 = 14;
				} else if (local166 == 23 && Static100.anInt1576 < 3) {
					Static334.anInt5792 = 0;
					Static100.anInt1576++;
					Static548.anInt9084 = 1;
					Static487.aClass30_2.method671();
					Static487.aClass30_2 = null;
					return;
				} else {
					Static548.anInt9084 = 0;
					Static43.method745(local166);
					Static487.aClass30_2.method671();
					Static487.aClass30_2 = null;
					Static166.method2528();
					return;
				}
			}
			if (Static548.anInt9084 == 6) {
				Static436.method6507();
				local125 = method8376();
				@Pc(699) Class5_Sub12_Sub2 local699 = local125.aClass5_Sub12_Sub2_2;
				local699.method8669(Static98.aClass208_2);
				local699.method8662(Static603.aClass244_10.anInt6597);
				Static612.method8496(local125);
				Static483.method6971();
				Static548.anInt9084 = 4;
			} else if (Static548.anInt9084 == 7) {
				if (Static487.aClass30_2.method669(1)) {
					Static487.aClass30_2.method677(Static167.aClass5_Sub12_Sub2_1.aByteArray104, 1, 0);
					local166 = Static167.aClass5_Sub12_Sub2_1.aByteArray104[0] & 0xFF;
					Static596.anInt9738 = local166 * 50;
					Static548.anInt9084 = 0;
					Static43.method745(21);
					Static487.aClass30_2.method671();
					Static487.aClass30_2 = null;
					Static166.method2528();
				}
			} else if (Static548.anInt9084 == 13) {
				if (Static487.aClass30_2.method669(1)) {
					Static487.aClass30_2.method677(Static167.aClass5_Sub12_Sub2_1.aByteArray104, 1, 0);
					Static133.anInt3877 = Static167.aClass5_Sub12_Sub2_1.aByteArray104[0] & 0xFF;
					Static548.anInt9084 = 0;
					Static43.method745(29);
					Static487.aClass30_2.method671();
					Static487.aClass30_2 = null;
					Static166.method2528();
				}
			} else if (Static548.anInt9084 != 8) {
				@Pc(838) Class5_Sub12_Sub2 local838;
				if (Static548.anInt9084 == 9) {
					local838 = Static167.aClass5_Sub12_Sub2_1;
					if (Static264.anInt4388 == 2) {
						if (!Static487.aClass30_2.method669(Static367.anInt6486)) {
							return;
						}
						Static487.aClass30_2.method677(local838.aByteArray104, Static367.anInt6486, 0);
						local838.anInt10154 = 0;
						Static408.anInt7025 = local838.method8645();
						Static17.anInt401 = local838.method8645();
						Static205.aBoolean296 = local838.method8645() == 1;
						Static33.aBoolean54 = local838.method8645() == 1;
						Static647.aBoolean839 = local838.method8645() == 1;
						Static324.aBoolean473 = local838.method8645() == 1;
						Static620.anInt10055 = local838.method8631();
						Static386.aBoolean562 = local838.method8645() == 1;
						Static211.anInt3647 = local838.method8626();
						Static202.aBoolean294 = local838.method8645() == 1;
						Static525.aClass371_4.method8553(Static202.aBoolean294);
						Static479.aClass348_1.method8209(Static202.aBoolean294);
						Static258.aClass138_1.method3192(Static202.aBoolean294);
					} else if (Static487.aClass30_2.method669(Static367.anInt6486)) {
						Static487.aClass30_2.method677(local838.aByteArray104, Static367.anInt6486, 0);
						local838.anInt10154 = 0;
						Static408.anInt7025 = local838.method8645();
						Static17.anInt401 = local838.method8645();
						Static205.aBoolean296 = local838.method8645() == 1;
						Static33.aBoolean54 = local838.method8645() == 1;
						Static647.aBoolean839 = local838.method8645() == 1;
						Static200.aLong97 = local838.method8644();
						@Pc(1020) int local1020 = local838.method8645();
						Static172.aBoolean264 = (local1020 & 0x2) != 0;
						Static386.aBoolean562 = (local1020 & 0x1) != 0;
						Static430.anInt7294 = local838.method8623();
						Static630.anInt10265 = local838.method8631();
						Static437.anInt7394 = local838.method8631();
						Static228.anInt3956 = local838.method8631();
						Static619.anInt10045 = local838.method8623();
						Static271.aClass330_3 = Static214.aClass192_1.method4322(Static619.anInt10045);
						Static280.anInt4575 = local838.method8645();
						Static544.anInt9018 = local838.method8631();
						Static111.anInt1759 = local838.method8631();
						Static390.aBoolean564 = local838.method8645() == 1;
						Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aString42 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aString43 = Static195.aString54 = local838.method8648();
						Static445.anInt7505 = local838.method8645();
						Static554.anInt9158 = local838.method8623();
						Static539.aBoolean735 = local838.method8645() == 1;
						Static526.aClass109_5 = new Class109();
						Static526.aClass109_5.anInt2756 = local838.method8631();
						if (Static526.aClass109_5.anInt2756 == 65535) {
							Static526.aClass109_5.anInt2756 = -1;
						}
						Static526.aClass109_5.aString44 = local838.method8648();
						if (Static363.aClass346_4 != Static34.aClass346_2) {
							Static526.aClass109_5.anInt2758 = Static526.aClass109_5.anInt2756 + 50000;
							Static526.aClass109_5.anInt2759 = Static526.aClass109_5.anInt2756 + 40000;
						}
						if (Static28.aClass346_1 != Static34.aClass346_2 && (Static282.aClass109_2.method2380(Static518.aClass109_4) || Static282.aClass109_2.method2380(Static187.aClass109_1))) {
							Static427.method6425();
						}
					} else {
						return;
					}
					if (Static205.aBoolean296 && !Static647.aBoolean839 || Static386.aBoolean562) {
						try {
							Static652.method1918("zap", Static270.anApplet5);
						} catch (@Pc(1185) Throwable local1185) {
							if (Static115.aBoolean134) {
								try {
									Static270.anApplet5.getAppletContext().showDocument(new URL(Static270.anApplet5.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1199) Exception local1199) {
								}
							}
						}
					} else {
						try {
							Static652.method1918("unzap", Static270.anApplet5);
						} catch (@Pc(1208) Throwable local1208) {
						}
					}
					if (Static34.aClass346_2 == Static363.aClass346_4) {
						try {
							Static652.method1918("loggedin", Static270.anApplet5);
						} catch (@Pc(1221) Throwable local1221) {
						}
					}
					if (Static264.anInt4388 != 2) {
						Static548.anInt9084 = 0;
						Static43.method745(2);
						Static165.method2477();
						Static214.method3254(7);
						Static86.aClass136_37 = null;
						return;
					}
					Static548.anInt9084 = 11;
				}
				if (Static548.anInt9084 == 11) {
					if (!Static487.aClass30_2.method669(3)) {
						return;
					}
					Static487.aClass30_2.method677(Static167.aClass5_Sub12_Sub2_1.aByteArray104, 3, 0);
					Static548.anInt9084 = 12;
				}
				if (Static548.anInt9084 == 12) {
					local838 = Static167.aClass5_Sub12_Sub2_1;
					local838.anInt10154 = 0;
					if (local838.method8668()) {
						if (!Static487.aClass30_2.method669(1)) {
							return;
						}
						Static487.aClass30_2.method677(local838.aByteArray104, 1, 3);
					}
					Static86.aClass136_37 = Static488.method7159()[local838.method8663()];
					Static60.anInt3115 = local838.method8631();
					Static548.anInt9084 = 10;
				}
				if (Static548.anInt9084 == 10) {
					if (Static487.aClass30_2.method669(Static60.anInt3115)) {
						Static487.aClass30_2.method677(Static167.aClass5_Sub12_Sub2_1.aByteArray104, Static60.anInt3115, 0);
						Static167.aClass5_Sub12_Sub2_1.anInt10154 = 0;
						local166 = Static60.anInt3115;
						Static548.anInt9084 = 0;
						Static43.method745(2);
						Static326.method5074();
						Static463.method6867(Static167.aClass5_Sub12_Sub2_1);
						Static261.anInt4343 = -1;
						if (Static283.aClass136_109 == Static86.aClass136_37) {
							Static645.method8845();
						} else {
							Static478.method8536();
						}
						if (Static167.aClass5_Sub12_Sub2_1.anInt10154 != local166) {
							throw new RuntimeException("lswp pos:" + Static167.aClass5_Sub12_Sub2_1.anInt10154 + " psize:" + local166);
						}
						Static86.aClass136_37 = null;
					}
				} else if (Static548.anInt9084 == 14) {
					if (Static60.anInt3115 == -2) {
						if (!Static487.aClass30_2.method669(2)) {
							return;
						}
						Static487.aClass30_2.method677(Static167.aClass5_Sub12_Sub2_1.aByteArray104, 2, 0);
						Static167.aClass5_Sub12_Sub2_1.anInt10154 = 0;
						Static60.anInt3115 = Static167.aClass5_Sub12_Sub2_1.method8631();
					}
					if (Static487.aClass30_2.method669(Static60.anInt3115)) {
						Static487.aClass30_2.method677(Static167.aClass5_Sub12_Sub2_1.aByteArray104, Static60.anInt3115, 0);
						Static167.aClass5_Sub12_Sub2_1.anInt10154 = 0;
						local166 = Static60.anInt3115;
						Static548.anInt9084 = 0;
						Static43.method745(15);
						Static568.method8025();
						Static463.method6867(Static167.aClass5_Sub12_Sub2_1);
						if (local166 != Static167.aClass5_Sub12_Sub2_1.anInt10154) {
							throw new RuntimeException("lswpr pos:" + Static167.aClass5_Sub12_Sub2_1.anInt10154 + " psize:" + local166);
						}
						Static86.aClass136_37 = null;
					}
				}
			} else if (Static487.aClass30_2.method669(1)) {
				Static487.aClass30_2.method677(Static167.aClass5_Sub12_Sub2_1.aByteArray104, 1, 0);
				Static548.anInt9084 = 9;
				Static367.anInt6486 = Static167.aClass5_Sub12_Sub2_1.aByteArray104[0] & 0xFF;
			}
		} catch (@Pc(1462) IOException local1462) {
			if (Static487.aClass30_2 != null) {
				Static487.aClass30_2.method671();
				Static487.aClass30_2 = null;
			}
			if (Static100.anInt1576 < 3) {
				if (Static264.anInt4388 == 2) {
					Static282.aClass109_2.method2382();
				} else {
					Static398.aClass109_3.method2382();
				}
				Static334.anInt5792 = 0;
				Static548.anInt9084 = 1;
				Static100.anInt1576++;
			} else {
				Static548.anInt9084 = 0;
				Static43.method745(-4);
				Static166.method2528();
			}
		}
	}
}
