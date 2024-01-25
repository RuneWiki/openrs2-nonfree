import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!ms", name = "F", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_94 = new Class100(27, 7);

	@OriginalMember(owner = "client!ms", name = "L", descriptor = "Z")
	public static boolean aBoolean495 = false;

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "(B)V")
	public static void method5610() {
		if (Static499.anInt8832 == 0 || Static499.anInt8832 == 10) {
			return;
		}
		try {
			@Pc(24) short local24;
			if (Static88.anInt10791 == 0) {
				local24 = 250;
			} else {
				local24 = 2000;
			}
			if (Static459.aBoolean556 && Static499.anInt8832 >= 6) {
				local24 = 6000;
			}
			if (local24 < ++Static511.anInt3031) {
				if (Static258.aClass97_2 != null) {
					Static258.aClass97_2.method2286();
					Static258.aClass97_2 = null;
				}
				if (Static88.anInt10791 >= 3) {
					Static499.anInt8832 = 0;
					Static5.method6556(-5);
					return;
				}
				if (Static494.anInt8821 == 2) {
					Static92.aClass337_1.method8199();
				} else {
					Static368.aClass337_5.method8199();
				}
				Static499.anInt8832 = 1;
				Static511.anInt3031 = 0;
				Static88.anInt10791++;
			}
			if (Static499.anInt8832 == 1) {
				if (Static494.anInt8821 == 2) {
					Static120.aClass150_7 = Static92.aClass337_1.method8198(Static234.aClass333_5);
				} else {
					Static120.aClass150_7 = Static368.aClass337_5.method8198(Static234.aClass333_5);
				}
				Static499.anInt8832 = 2;
			}
			@Pc(135) Class14_Sub19 local135;
			@Pc(160) int local160;
			@Pc(204) int local204;
			if (Static499.anInt8832 == 2) {
				if (Static120.aClass150_7.anInt4247 == 2) {
					throw new IOException();
				}
				if (Static120.aClass150_7.anInt4247 != 1) {
					return;
				}
				Static258.aClass97_2 = Static243.method3621((Socket) Static120.aClass150_7.anObject8);
				Static120.aClass150_7 = null;
				Static5.method6557();
				local135 = Static621.method8714();
				if (Static459.aBoolean556) {
					local135.aClass14_Sub29_Sub1_1.method5854(Static453.aClass174_12.anInt4603);
					local135.aClass14_Sub29_Sub1_1.method5859(0);
					local160 = local135.aClass14_Sub29_Sub1_1.anInt7264;
					local135.aClass14_Sub29_Sub1_1.method5861(650);
					if (Static494.anInt8821 == 2) {
						local135.aClass14_Sub29_Sub1_1.method5854(Static430.anInt7691 == 13 ? 1 : 0);
					}
					@Pc(181) Class14_Sub29 local181 = Static244.method3635();
					local181.method5854(Static242.anInt4374);
					local181.method5859((int) (Math.random() * 9.9999999E7D));
					local181.method5854(Static232.anInt4258);
					local181.method5861(Static349.anInt6487);
					for (local204 = 0; local204 < 6; local204++) {
						local181.method5861((int) (Math.random() * 9.9999999E7D));
					}
					local181.method5905(Static385.aLong199);
					local181.method5854(Static630.aClass77_8.anInt2295);
					local181.method5854((int) (Math.random() * 9.9999999E7D));
					local181.method5851(Static604.aBigInteger11, Static315.aBigInteger6);
					local135.aClass14_Sub29_Sub1_1.method5838(0, local181.aByteArray84, local181.anInt7264);
					local135.aClass14_Sub29_Sub1_1.method5839(local135.aClass14_Sub29_Sub1_1.anInt7264 - local160);
				} else {
					local135.aClass14_Sub29_Sub1_1.method5854(Static453.aClass174_1.anInt4603);
				}
				Static576.method8234(local135);
				Static363.method47();
				Static499.anInt8832 = 3;
			}
			@Pc(296) int local296;
			if (Static499.anInt8832 == 3) {
				if (!Static258.aClass97_2.method2290(1)) {
					return;
				}
				Static258.aClass97_2.method2294(0, Static481.aClass14_Sub29_Sub1_2.aByteArray84, 1);
				local296 = Static481.aClass14_Sub29_Sub1_2.aByteArray84[0] & 0xFF;
				if (local296 != 0) {
					Static499.anInt8832 = 0;
					Static5.method6556(local296);
					Static258.aClass97_2.method2286();
					Static258.aClass97_2 = null;
					Static20.method9251();
					return;
				}
				if (Static459.aBoolean556) {
					Static499.anInt8832 = 4;
				} else {
					Static499.anInt8832 = 8;
				}
			}
			if (Static499.anInt8832 == 4) {
				if (!Static258.aClass97_2.method2290(2)) {
					return;
				}
				Static258.aClass97_2.method2294(0, Static481.aClass14_Sub29_Sub1_2.aByteArray84, 2);
				Static481.aClass14_Sub29_Sub1_2.anInt7264 = 0;
				Static481.aClass14_Sub29_Sub1_2.anInt7264 = Static481.aClass14_Sub29_Sub1_2.method5900();
				Static499.anInt8832 = 5;
			}
			if (Static499.anInt8832 == 5) {
				if (!Static258.aClass97_2.method2290(Static481.aClass14_Sub29_Sub1_2.anInt7264)) {
					return;
				}
				Static258.aClass97_2.method2294(0, Static481.aClass14_Sub29_Sub1_2.aByteArray84, Static481.aClass14_Sub29_Sub1_2.anInt7264);
				Static481.aClass14_Sub29_Sub1_2.method5841(Static647.anIntArray809);
				Static481.aClass14_Sub29_Sub1_2.anInt7264 = 0;
				@Pc(380) String local380 = Static481.aClass14_Sub29_Sub1_2.method5903();
				Static481.aClass14_Sub29_Sub1_2.anInt7264 = 0;
				@Pc(385) String local385 = "opensn";
				if (!Static116.aBoolean192 || Static209.method3279(Static234.aClass333_5, local385, local380, 1).anInt4247 == 2) {
					Static630.method8817(true, local385, Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() == 1, Static234.aClass333_5, local380);
				}
				Static499.anInt8832 = 6;
			}
			if (Static499.anInt8832 == 6) {
				if (!Static258.aClass97_2.method2290(1)) {
					return;
				}
				Static258.aClass97_2.method2294(0, Static481.aClass14_Sub29_Sub1_2.aByteArray84, 1);
				if ((Static481.aClass14_Sub29_Sub1_2.aByteArray84[0] & 0xFF) == 1) {
					Static499.anInt8832 = 7;
				}
			}
			if (Static499.anInt8832 == 7) {
				if (!Static258.aClass97_2.method2290(16)) {
					return;
				}
				Static258.aClass97_2.method2294(0, Static481.aClass14_Sub29_Sub1_2.aByteArray84, 16);
				Static481.aClass14_Sub29_Sub1_2.anInt7264 = 16;
				Static481.aClass14_Sub29_Sub1_2.method5841(Static647.anIntArray809);
				Static481.aClass14_Sub29_Sub1_2.anInt7264 = 0;
				Static238.aString49 = Static521.aString85 = Static627.method8803(Static481.aClass14_Sub29_Sub1_2.method5907());
				Static133.aLong67 = Static481.aClass14_Sub29_Sub1_2.method5907();
				Static499.anInt8832 = 8;
			}
			@Pc(503) Class14_Sub29_Sub1 local503;
			if (Static499.anInt8832 == 8) {
				Static481.aClass14_Sub29_Sub1_2.anInt7264 = 0;
				Static5.method6557();
				local135 = Static621.method8714();
				local503 = local135.aClass14_Sub29_Sub1_1;
				@Pc(529) int local529;
				@Pc(552) Class14_Sub29 local552;
				@Pc(510) Class174 local510;
				if (Static494.anInt8821 == 2) {
					if (Static459.aBoolean556) {
						local510 = Static453.aClass174_13;
					} else {
						local510 = Static453.aClass174_3;
					}
					local503.method5854(local510.anInt4603);
					local503.method5859(0);
					local204 = local503.anInt7264;
					local529 = local503.anInt7264;
					if (!Static459.aBoolean556) {
						local503.method5861(650);
						local503.method5854(Static430.anInt7691 == 13 ? 1 : 0);
						local529 = local503.anInt7264;
						local552 = Static231.method3508();
						local503.method5838(0, local552.aByteArray84, local552.anInt7264);
						local529 = local503.anInt7264;
						local503.method5855(Static238.aString49);
					}
					local503.method5854(Static652.anInt10896);
					local503.method5854(Static482.method7137());
					local503.method5859(Static561.anInt9759);
					local503.method5859(Static639.anInt10685);
					local503.method5854(Static56.aClass14_Sub22_5.aClass21_Sub9_1.method2372());
					Static555.method7802(local503);
					local503.method5855(Static273.aString55);
					local503.method5861(Static349.anInt6487);
					local552 = Static56.aClass14_Sub22_5.method3007();
					local503.method5854(local552.anInt7264);
					local503.method5838(0, local552.aByteArray84, local552.anInt7264);
					Static26.aBoolean36 = true;
					@Pc(634) Class14_Sub29 local634 = new Class14_Sub29(Static58.aClass14_Sub11_1.method1686());
					Static58.aClass14_Sub11_1.method1688(local634);
					local503.method5838(0, local634.aByteArray84, local634.aByteArray84.length);
					local503.method5859(Static37.anInt981);
					local503.method5905(Static598.aLong266);
					local503.method5854(Static89.aString23 == null ? 0 : 1);
					if (Static89.aString23 != null) {
						local503.method5855(Static89.aString23);
					}
					local503.method5854(Static189.method2976("jagtheora") ? 1 : 0);
					local503.method5854(Static116.aBoolean192 ? 1 : 0);
					Static541.method8225(local503);
					local503.method5865(Static647.anIntArray809, local529, local503.anInt7264);
					local503.method5839(local503.anInt7264 - local204);
				} else {
					if (Static459.aBoolean556) {
						local510 = Static453.aClass174_13;
					} else {
						local510 = Static453.aClass174_5;
					}
					local503.method5854(local510.anInt4603);
					local503.method5859(0);
					local204 = local503.anInt7264;
					local529 = local503.anInt7264;
					if (!Static459.aBoolean556) {
						local503.method5861(650);
						local552 = Static231.method3508();
						local503.method5838(0, local552.aByteArray84, local552.anInt7264);
						local529 = local503.anInt7264;
						local503.method5855(Static238.aString49);
					}
					local503.method5854(Static630.aClass77_8.anInt2295);
					local503.method5854(Static232.anInt4258);
					Static555.method7802(local503);
					local503.method5855(Static273.aString55);
					local503.method5861(Static349.anInt6487);
					Static541.method8225(local503);
					local503.method5865(Static647.anIntArray809, local529, local503.anInt7264);
					local503.method5839(local503.anInt7264 - local204);
				}
				Static576.method8234(local135);
				Static363.method47();
				Static205.aClass394_1 = new Class394(Static647.anIntArray809);
				for (@Pc(814) int local814 = 0; local814 < 4; local814++) {
					Static647.anIntArray809[local814] += 50;
				}
				Static481.aClass14_Sub29_Sub1_2.method4281(Static647.anIntArray809);
				Static647.anIntArray809 = null;
				Static499.anInt8832 = 9;
			}
			if (Static499.anInt8832 == 9) {
				if (!Static258.aClass97_2.method2290(1)) {
					return;
				}
				Static258.aClass97_2.method2294(0, Static481.aClass14_Sub29_Sub1_2.aByteArray84, 1);
				local296 = Static481.aClass14_Sub29_Sub1_2.aByteArray84[0] & 0xFF;
				if (local296 == 21) {
					Static499.anInt8832 = 12;
				} else if (local296 == 29) {
					Static499.anInt8832 = 18;
				} else if (local296 == 1) {
					Static499.anInt8832 = 10;
					Static5.method6556(local296);
					return;
				} else if (local296 == 2) {
					Static499.anInt8832 = 13;
				} else if (local296 == 15) {
					Static638.anInt10676 = -2;
					Static499.anInt8832 = 19;
				} else if (local296 == 23 && Static88.anInt10791 < 3) {
					Static511.anInt3031 = 0;
					Static88.anInt10791++;
					Static499.anInt8832 = 1;
					Static258.aClass97_2.method2286();
					Static258.aClass97_2 = null;
					return;
				} else if (!Static121.aBoolean201 || Static459.aBoolean556 || Static242.anInt4374 == -1 || local296 != 35) {
					Static499.anInt8832 = 0;
					Static5.method6556(local296);
					Static258.aClass97_2.method2286();
					Static258.aClass97_2 = null;
					Static20.method9251();
					return;
				} else {
					Static499.anInt8832 = 1;
					Static459.aBoolean556 = true;
					Static511.anInt3031 = 0;
					Static258.aClass97_2.method2286();
					Static258.aClass97_2 = null;
					return;
				}
			}
			if (Static499.anInt8832 == 11) {
				Static5.method6557();
				local135 = Static621.method8714();
				local503 = local135.aClass14_Sub29_Sub1_1;
				local503.method4286(Static205.aClass394_1);
				local503.method4283(Static453.aClass174_9.anInt4603);
				Static576.method8234(local135);
				Static363.method47();
				Static499.anInt8832 = 9;
			} else if (Static499.anInt8832 == 12) {
				if (Static258.aClass97_2.method2290(1)) {
					Static258.aClass97_2.method2294(0, Static481.aClass14_Sub29_Sub1_2.aByteArray84, 1);
					local296 = Static481.aClass14_Sub29_Sub1_2.aByteArray84[0] & 0xFF;
					Static499.anInt8832 = 0;
					Static54.anInt1375 = local296 * 50;
					Static5.method6556(21);
					Static258.aClass97_2.method2286();
					Static258.aClass97_2 = null;
					Static20.method9251();
				}
			} else if (Static499.anInt8832 == 18) {
				if (Static258.aClass97_2.method2290(1)) {
					Static258.aClass97_2.method2294(0, Static481.aClass14_Sub29_Sub1_2.aByteArray84, 1);
					Static252.anInt4470 = Static481.aClass14_Sub29_Sub1_2.aByteArray84[0] & 0xFF;
					Static499.anInt8832 = 0;
					Static5.method6556(29);
					Static258.aClass97_2.method2286();
					Static258.aClass97_2 = null;
					Static20.method9251();
				}
			} else if (Static499.anInt8832 != 13) {
				@Pc(1112) Class14_Sub29_Sub1 local1112;
				if (Static499.anInt8832 == 14) {
					local1112 = Static481.aClass14_Sub29_Sub1_2;
					if (Static494.anInt8821 == 2) {
						if (!Static258.aClass97_2.method2290(Static259.anInt10742)) {
							return;
						}
						Static258.aClass97_2.method2294(0, local1112.aByteArray84, Static259.anInt10742);
						local1112.anInt7264 = 0;
						Static447.anInt10238 = local1112.method5866();
						Static320.anInt6102 = local1112.method5866();
						Static13.aBoolean12 = local1112.method5866() == 1;
						Static47.aBoolean97 = local1112.method5866() == 1;
						Static116.aBoolean191 = local1112.method5866() == 1;
						Static154.aBoolean234 = local1112.method5866() == 1;
						Static568.anInt9800 = local1112.method5900();
						Static524.aBoolean638 = local1112.method5866() == 1;
						Static537.anInt9244 = local1112.method5858();
						aBoolean495 = local1112.method5866() == 1;
						Static511.aClass13_2.method79(aBoolean495);
						Static175.aClass247_2.method5956(aBoolean495);
						Static63.aClass37_1.method979(aBoolean495);
					} else if (Static258.aClass97_2.method2290(Static259.anInt10742)) {
						Static258.aClass97_2.method2294(0, local1112.aByteArray84, Static259.anInt10742);
						local1112.anInt7264 = 0;
						Static447.anInt10238 = local1112.method5866();
						Static320.anInt6102 = local1112.method5866();
						Static13.aBoolean12 = local1112.method5866() == 1;
						Static47.aBoolean97 = local1112.method5866() == 1;
						Static116.aBoolean191 = local1112.method5866() == 1;
						Static343.aLong176 = local1112.method5907();
						Static635.aLong288 = Static343.aLong176 - Static521.method7499() - local1112.method5904();
						local160 = local1112.method5866();
						Static598.aBoolean714 = (local160 & 0x2) != 0;
						Static524.aBoolean638 = (local160 & 0x1) != 0;
						Static583.anInt10018 = local1112.method5878();
						Static198.anInt3673 = local1112.method5900();
						Static553.anInt9425 = local1112.method5900();
						Static291.anInt5167 = local1112.method5900();
						Static193.anInt3593 = local1112.method5878();
						Static651.aClass150_11 = Static234.aClass333_5.method8132(Static193.anInt3593);
						Static336.anInt6340 = local1112.method5866();
						Static607.anInt4031 = local1112.method5900();
						Static425.anInt7659 = local1112.method5900();
						Static167.aBoolean250 = local1112.method5866() == 1;
						Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aString35 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aString34 = Static219.aString46 = local1112.method5903();
						Static7.anInt54 = local1112.method5866();
						Static109.anInt2258 = local1112.method5878();
						Static573.aBoolean698 = local1112.method5866() == 1;
						Static96.aClass337_2 = new Class337();
						Static96.aClass337_2.anInt9843 = local1112.method5900();
						if (Static96.aClass337_2.anInt9843 == 65535) {
							Static96.aClass337_2.anInt9843 = -1;
						}
						Static96.aClass337_2.aString103 = local1112.method5903();
						if (Static420.aClass240_5 != Static513.aClass240_7) {
							Static96.aClass337_2.anInt9846 = Static96.aClass337_2.anInt9843 + 40000;
							Static96.aClass337_2.anInt9845 = Static96.aClass337_2.anInt9843 + 50000;
						}
						if (Static12.aClass240_1 != Static513.aClass240_7 && (Static513.aClass240_7 != Static380.aClass240_4 || Static447.anInt10238 < 2) && (Static92.aClass337_1.method8203(Static511.aClass337_4) || Static92.aClass337_1.method8203(Static373.aClass337_6))) {
							Static634.method8859();
						}
					} else {
						return;
					}
					if (Static13.aBoolean12 && !Static116.aBoolean191 || Static524.aBoolean638) {
						try {
							Static682.method5126("zap", Static645.anApplet2);
						} catch (@Pc(1468) Throwable local1468) {
							if (Static107.aBoolean186) {
								try {
									Static645.anApplet2.getAppletContext().showDocument(new URL(Static645.anApplet2.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1482) Exception local1482) {
								}
							}
						}
					} else {
						try {
							Static682.method5126("unzap", Static645.anApplet2);
						} catch (@Pc(1491) Throwable local1491) {
						}
					}
					if (Static513.aClass240_7 == Static420.aClass240_5) {
						try {
							Static682.method5126("loggedin", Static645.anApplet2);
						} catch (@Pc(1502) Throwable local1502) {
						}
					}
					if (Static494.anInt8821 != 2) {
						Static499.anInt8832 = 0;
						Static5.method6556(2);
						Static310.method4524();
						Static67.method1345(7);
						Static156.aClass44_62 = null;
						return;
					}
					Static499.anInt8832 = 16;
				}
				if (Static499.anInt8832 == 16) {
					if (!Static258.aClass97_2.method2290(3)) {
						return;
					}
					Static258.aClass97_2.method2294(0, Static481.aClass14_Sub29_Sub1_2.aByteArray84, 3);
					Static499.anInt8832 = 17;
				}
				if (Static499.anInt8832 == 17) {
					local1112 = Static481.aClass14_Sub29_Sub1_2;
					local1112.anInt7264 = 0;
					if (local1112.method4287()) {
						if (!Static258.aClass97_2.method2290(1)) {
							return;
						}
						Static258.aClass97_2.method2294(3, local1112.aByteArray84, 1);
					}
					Static156.aClass44_62 = Static97.method1774()[local1112.method4288()];
					Static638.anInt10676 = local1112.method5900();
					Static499.anInt8832 = 15;
				}
				if (Static499.anInt8832 == 15) {
					if (Static258.aClass97_2.method2290(Static638.anInt10676)) {
						Static258.aClass97_2.method2294(0, Static481.aClass14_Sub29_Sub1_2.aByteArray84, Static638.anInt10676);
						Static481.aClass14_Sub29_Sub1_2.anInt7264 = 0;
						Static499.anInt8832 = 0;
						local296 = Static638.anInt10676;
						Static5.method6556(2);
						Static110.method1915();
						Static197.method3025(Static481.aClass14_Sub29_Sub1_2);
						Static100.anInt2131 = -1;
						if (Static176.aClass44_67 == Static156.aClass44_62) {
							Static443.method6485();
						} else {
							Static639.method8914();
						}
						if (local296 != Static481.aClass14_Sub29_Sub1_2.anInt7264) {
							throw new RuntimeException("lswp pos:" + Static481.aClass14_Sub29_Sub1_2.anInt7264 + " psize:" + local296);
						}
						Static156.aClass44_62 = null;
					}
				} else if (Static499.anInt8832 == 19) {
					if (Static638.anInt10676 == -2) {
						if (!Static258.aClass97_2.method2290(2)) {
							return;
						}
						Static258.aClass97_2.method2294(0, Static481.aClass14_Sub29_Sub1_2.aByteArray84, 2);
						Static481.aClass14_Sub29_Sub1_2.anInt7264 = 0;
						Static638.anInt10676 = Static481.aClass14_Sub29_Sub1_2.method5900();
					}
					if (Static258.aClass97_2.method2290(Static638.anInt10676)) {
						Static258.aClass97_2.method2294(0, Static481.aClass14_Sub29_Sub1_2.aByteArray84, Static638.anInt10676);
						Static481.aClass14_Sub29_Sub1_2.anInt7264 = 0;
						local296 = Static638.anInt10676;
						Static499.anInt8832 = 0;
						Static5.method6556(15);
						Static132.method2136();
						Static197.method3025(Static481.aClass14_Sub29_Sub1_2);
						if (local296 != Static481.aClass14_Sub29_Sub1_2.anInt7264) {
							throw new RuntimeException("lswpr pos:" + Static481.aClass14_Sub29_Sub1_2.anInt7264 + " psize:" + local296);
						}
						Static156.aClass44_62 = null;
					}
				}
			} else if (Static258.aClass97_2.method2290(1)) {
				Static258.aClass97_2.method2294(0, Static481.aClass14_Sub29_Sub1_2.aByteArray84, 1);
				Static499.anInt8832 = 14;
				Static259.anInt10742 = Static481.aClass14_Sub29_Sub1_2.aByteArray84[0] & 0xFF;
			}
		} catch (@Pc(1747) IOException local1747) {
			if (Static258.aClass97_2 != null) {
				Static258.aClass97_2.method2286();
				Static258.aClass97_2 = null;
			}
			if (Static88.anInt10791 >= 3) {
				Static499.anInt8832 = 0;
				Static5.method6556(-4);
				Static20.method9251();
			} else {
				if (Static494.anInt8821 == 2) {
					Static92.aClass337_1.method8199();
				} else {
					Static368.aClass337_5.method8199();
				}
				Static88.anInt10791++;
				Static499.anInt8832 = 1;
				Static511.anInt3031 = 0;
			}
		}
	}
}
