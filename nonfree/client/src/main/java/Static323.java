import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!kt", name = "H", descriptor = "I")
	public static int anInt5795 = 0;

	@OriginalMember(owner = "client!kt", name = "E", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[6][];

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIB)I")
	public static int method4943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)V")
	public static void method4944() {
		if (Static566.anInt9503 == 0 || Static566.anInt9503 == 10) {
			return;
		}
		try {
			@Pc(23) short local23;
			if (Static499.anInt8314 == 0) {
				local23 = 250;
			} else {
				local23 = 2000;
			}
			if (Static504.aBoolean656 && Static566.anInt9503 >= 6) {
				local23 = 6000;
			}
			if (++Static370.anInt10364 > local23) {
				if (Static492.aClass295_1 != null) {
					Static492.aClass295_1.method7023();
					Static492.aClass295_1 = null;
				}
				if (Static499.anInt8314 >= 3) {
					Static566.anInt9503 = 0;
					Static326.method4967(-5);
					return;
				}
				if (Static670.anInt10721 == 2) {
					Static197.aClass54_35.method825();
				} else {
					Static71.aClass54_5.method825();
				}
				Static499.anInt8314++;
				Static566.anInt9503 = 1;
				Static370.anInt10364 = 0;
			}
			if (Static566.anInt9503 == 1) {
				if (Static670.anInt10721 == 2) {
					Static186.aClass366_2 = Static197.aClass54_35.method826(Static294.aClass230_3);
				} else {
					Static186.aClass366_2 = Static71.aClass54_5.method826(Static294.aClass230_3);
				}
				Static566.anInt9503 = 2;
			}
			@Pc(165) Class5_Sub50 local165;
			@Pc(182) int local182;
			@Pc(233) int local233;
			if (Static566.anInt9503 == 2) {
				if (Static186.aClass366_2.anInt10206 == 2) {
					throw new IOException();
				}
				if (Static186.aClass366_2.anInt10206 != 1) {
					return;
				}
				Static492.aClass295_1 = Static95.method1405((Socket) Static186.aClass366_2.anObject18);
				Static186.aClass366_2 = null;
				Static131.method1898();
				local165 = Static552.method7994();
				if (Static504.aBoolean656) {
					local165.aClass5_Sub23_Sub2_2.method8502(Static157.aClass45_12.anInt829);
					local165.aClass5_Sub23_Sub2_2.method8480(0);
					local182 = local165.aClass5_Sub23_Sub2_2.anInt9869;
					local165.aClass5_Sub23_Sub2_2.method8486(652);
					if (Static670.anInt10721 == 2) {
						local165.aClass5_Sub23_Sub2_2.method8502(Static107.anInt1746 == 13 ? 1 : 0);
					}
					@Pc(210) Class5_Sub23 local210 = Static555.method8020();
					local210.method8502(Static471.anInt7980);
					local210.method8480((int) (Math.random() * 9.9999999E7D));
					local210.method8502(anInt5795);
					local210.method8486(Static456.anInt7813);
					for (local233 = 0; local233 < 6; local233++) {
						local210.method8486((int) (Math.random() * 9.9999999E7D));
					}
					local210.method8517(Static58.aLong26);
					local210.method8502(Static256.aClass333_3.anInt9710);
					local210.method8502((int) (Math.random() * 9.9999999E7D));
					local210.method8494(Static538.aBigInteger6, Static546.aBigInteger10);
					local165.aClass5_Sub23_Sub2_2.method8528(local210.anInt9869, 0, local210.aByteArray102);
					local165.aClass5_Sub23_Sub2_2.method8533(local165.aClass5_Sub23_Sub2_2.anInt9869 - local182);
				} else {
					local165.aClass5_Sub23_Sub2_2.method8502(Static157.aClass45_1.anInt829);
				}
				Static494.method7120(local165);
				Static253.method3720();
				Static566.anInt9503 = 3;
			}
			@Pc(342) int local342;
			if (Static566.anInt9503 == 3) {
				if (!Static492.aClass295_1.method7021(1)) {
					return;
				}
				Static492.aClass295_1.method7020(0, 1, Static515.aClass5_Sub23_Sub2_1.aByteArray102);
				local342 = Static515.aClass5_Sub23_Sub2_1.aByteArray102[0] & 0xFF;
				if (local342 != 0) {
					Static566.anInt9503 = 0;
					Static326.method4967(local342);
					Static492.aClass295_1.method7023();
					Static492.aClass295_1 = null;
					Static678.method9304();
					return;
				}
				if (Static504.aBoolean656) {
					Static566.anInt9503 = 4;
				} else {
					Static566.anInt9503 = 8;
				}
			}
			if (Static566.anInt9503 == 4) {
				if (!Static492.aClass295_1.method7021(2)) {
					return;
				}
				Static492.aClass295_1.method7020(0, 2, Static515.aClass5_Sub23_Sub2_1.aByteArray102);
				Static515.aClass5_Sub23_Sub2_1.anInt9869 = 0;
				Static515.aClass5_Sub23_Sub2_1.anInt9869 = Static515.aClass5_Sub23_Sub2_1.method8519();
				Static566.anInt9503 = 5;
			}
			if (Static566.anInt9503 == 5) {
				if (!Static492.aClass295_1.method7021(Static515.aClass5_Sub23_Sub2_1.anInt9869)) {
					return;
				}
				Static492.aClass295_1.method7020(0, Static515.aClass5_Sub23_Sub2_1.anInt9869, Static515.aClass5_Sub23_Sub2_1.aByteArray102);
				Static515.aClass5_Sub23_Sub2_1.method8491(Static109.anIntArray96);
				Static515.aClass5_Sub23_Sub2_1.anInt9869 = 0;
				@Pc(439) String local439 = Static515.aClass5_Sub23_Sub2_1.method8473();
				Static515.aClass5_Sub23_Sub2_1.anInt9869 = 0;
				@Pc(446) String local446 = "opensn";
				if (!Static301.aBoolean679 || Static606.method8454(local439, Static294.aClass230_3, 1, local446).anInt10206 == 2) {
					Static166.method2390(local439, true, local446, Static294.aClass230_3, Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() == 1);
				}
				Static566.anInt9503 = 6;
			}
			if (Static566.anInt9503 == 6) {
				if (!Static492.aClass295_1.method7021(1)) {
					return;
				}
				Static492.aClass295_1.method7020(0, 1, Static515.aClass5_Sub23_Sub2_1.aByteArray102);
				if ((Static515.aClass5_Sub23_Sub2_1.aByteArray102[0] & 0xFF) == 1) {
					Static566.anInt9503 = 7;
				}
			}
			if (Static566.anInt9503 == 7) {
				if (!Static492.aClass295_1.method7021(16)) {
					return;
				}
				Static492.aClass295_1.method7020(0, 16, Static515.aClass5_Sub23_Sub2_1.aByteArray102);
				Static515.aClass5_Sub23_Sub2_1.anInt9869 = 16;
				Static515.aClass5_Sub23_Sub2_1.method8491(Static109.anIntArray96);
				Static515.aClass5_Sub23_Sub2_1.anInt9869 = 0;
				Static289.aString139 = Static537.aString57 = Static447.method6658(Static515.aClass5_Sub23_Sub2_1.method8509());
				Static183.aLong91 = Static515.aClass5_Sub23_Sub2_1.method8509();
				Static566.anInt9503 = 8;
			}
			@Pc(585) Class5_Sub23_Sub2 local585;
			if (Static566.anInt9503 == 8) {
				Static515.aClass5_Sub23_Sub2_1.anInt9869 = 0;
				Static131.method1898();
				local165 = Static552.method7994();
				local585 = local165.aClass5_Sub23_Sub2_2;
				@Pc(613) int local613;
				@Pc(622) Class5_Sub23 local622;
				@Pc(594) Class45 local594;
				if (Static670.anInt10721 == 2) {
					if (Static504.aBoolean656) {
						local594 = Static157.aClass45_13;
					} else {
						local594 = Static157.aClass45_3;
					}
					local585.method8502(local594.anInt829);
					local585.method8480(0);
					local233 = local585.anInt9869;
					local613 = local585.anInt9869;
					if (!Static504.aBoolean656) {
						local585.method8486(652);
						local585.method8502(Static107.anInt1746 == 13 ? 1 : 0);
						local613 = local585.anInt9869;
						local622 = Static184.method2692();
						local585.method8528(local622.anInt9869, 0, local622.aByteArray102);
						local613 = local585.anInt9869;
						local585.method8538(Static289.aString139);
					}
					local585.method8502(Static295.anInt5127);
					local585.method8502(Static341.method5176());
					local585.method8480(Static70.anInt1125);
					local585.method8480(Static631.anInt10283);
					local585.method8502(Static637.aClass5_Sub20_31.aClass24_Sub11_1.method3217());
					Static335.method5112(local585);
					local585.method8538(Static625.aString132);
					local585.method8486(Static456.anInt7813);
					local622 = Static637.aClass5_Sub20_31.method3197();
					local585.method8502(local622.anInt9869);
					local585.method8528(local622.anInt9869, 0, local622.aByteArray102);
					Static261.aBoolean355 = true;
					@Pc(810) Class5_Sub23 local810 = new Class5_Sub23(Static528.aClass5_Sub19_1.method3042());
					Static528.aClass5_Sub19_1.method3044(local810);
					local585.method8528(local810.aByteArray102.length, 0, local810.aByteArray102);
					local585.method8480(Static237.anInt1804);
					local585.method8517(Static294.aLong158);
					local585.method8502(Static461.aString125 == null ? 0 : 1);
					if (Static461.aString125 != null) {
						local585.method8538(Static461.aString125);
					}
					local585.method8502(Static382.method8437("jagtheora") ? 1 : 0);
					local585.method8502(Static301.aBoolean679 ? 1 : 0);
					Static169.method2463(local585);
					local585.method8534(local613, local585.anInt9869, Static109.anIntArray96);
					local585.method8533(local585.anInt9869 - local233);
				} else {
					if (Static504.aBoolean656) {
						local594 = Static157.aClass45_13;
					} else {
						local594 = Static157.aClass45_5;
					}
					local585.method8502(local594.anInt829);
					local585.method8480(0);
					local233 = local585.anInt9869;
					local613 = local585.anInt9869;
					if (!Static504.aBoolean656) {
						local585.method8486(652);
						local622 = Static184.method2692();
						local585.method8528(local622.anInt9869, 0, local622.aByteArray102);
						local613 = local585.anInt9869;
						local585.method8538(Static289.aString139);
					}
					local585.method8502(Static256.aClass333_3.anInt9710);
					local585.method8502(anInt5795);
					Static335.method5112(local585);
					local585.method8538(Static625.aString132);
					local585.method8486(Static456.anInt7813);
					Static169.method2463(local585);
					local585.method8534(local613, local585.anInt9869, Static109.anIntArray96);
					local585.method8533(local585.anInt9869 - local233);
				}
				Static494.method7120(local165);
				Static253.method3720();
				Static80.aClass313_1 = new Class313(Static109.anIntArray96);
				for (@Pc(903) int local903 = 0; local903 < 4; local903++) {
					Static109.anIntArray96[local903] += 50;
				}
				Static515.aClass5_Sub23_Sub2_1.method8546(Static109.anIntArray96);
				Static109.anIntArray96 = null;
				Static566.anInt9503 = 9;
			}
			if (Static566.anInt9503 == 9) {
				if (!Static492.aClass295_1.method7021(1)) {
					return;
				}
				Static492.aClass295_1.method7020(0, 1, Static515.aClass5_Sub23_Sub2_1.aByteArray102);
				local342 = Static515.aClass5_Sub23_Sub2_1.aByteArray102[0] & 0xFF;
				if (local342 == 21) {
					Static566.anInt9503 = 12;
				} else if (local342 == 29) {
					Static566.anInt9503 = 18;
				} else if (local342 == 1) {
					Static566.anInt9503 = 10;
					Static326.method4967(local342);
					return;
				} else if (local342 == 2) {
					Static566.anInt9503 = 13;
				} else if (local342 == 15) {
					Static327.anInt5853 = -2;
					Static566.anInt9503 = 19;
				} else if (local342 == 23 && Static499.anInt8314 < 3) {
					Static499.anInt8314++;
					Static566.anInt9503 = 1;
					Static370.anInt10364 = 0;
					Static492.aClass295_1.method7023();
					Static492.aClass295_1 = null;
					return;
				} else if (!Static121.aBoolean173 || Static504.aBoolean656 || Static471.anInt7980 == -1 || local342 != 35) {
					Static566.anInt9503 = 0;
					Static326.method4967(local342);
					Static492.aClass295_1.method7023();
					Static492.aClass295_1 = null;
					Static678.method9304();
					return;
				} else {
					Static566.anInt9503 = 1;
					Static370.anInt10364 = 0;
					Static504.aBoolean656 = true;
					Static492.aClass295_1.method7023();
					Static492.aClass295_1 = null;
					return;
				}
			}
			if (Static566.anInt9503 == 11) {
				Static131.method1898();
				local165 = Static552.method7994();
				local585 = local165.aClass5_Sub23_Sub2_2;
				local585.method8551(Static80.aClass313_1);
				local585.method8547(Static157.aClass45_9.anInt829);
				Static494.method7120(local165);
				Static253.method3720();
				Static566.anInt9503 = 9;
			} else if (Static566.anInt9503 == 12) {
				if (Static492.aClass295_1.method7021(1)) {
					Static492.aClass295_1.method7020(0, 1, Static515.aClass5_Sub23_Sub2_1.aByteArray102);
					local342 = Static515.aClass5_Sub23_Sub2_1.aByteArray102[0] & 0xFF;
					Static566.anInt9503 = 0;
					Static41.anInt727 = local342 * 50;
					Static326.method4967(21);
					Static492.aClass295_1.method7023();
					Static492.aClass295_1 = null;
					Static678.method9304();
				}
			} else if (Static566.anInt9503 == 18) {
				if (Static492.aClass295_1.method7021(1)) {
					Static492.aClass295_1.method7020(0, 1, Static515.aClass5_Sub23_Sub2_1.aByteArray102);
					Static462.anInt7858 = Static515.aClass5_Sub23_Sub2_1.aByteArray102[0] & 0xFF;
					Static566.anInt9503 = 0;
					Static326.method4967(29);
					Static492.aClass295_1.method7023();
					Static492.aClass295_1 = null;
					Static678.method9304();
				}
			} else if (Static566.anInt9503 != 13) {
				@Pc(1243) Class5_Sub23_Sub2 local1243;
				if (Static566.anInt9503 == 14) {
					local1243 = Static515.aClass5_Sub23_Sub2_1;
					if (Static670.anInt10721 == 2) {
						if (!Static492.aClass295_1.method7021(Static511.anInt7225)) {
							return;
						}
						Static492.aClass295_1.method7020(0, Static511.anInt7225, local1243.aByteArray102);
						local1243.anInt9869 = 0;
						Static539.anInt9221 = local1243.method8529();
						Static328.anInt5869 = local1243.method8529();
						Static31.aBoolean46 = local1243.method8529() == 1;
						Static361.aBoolean474 = local1243.method8529() == 1;
						Static285.aBoolean388 = local1243.method8529() == 1;
						Static558.aBoolean721 = local1243.method8529() == 1;
						Static279.anInt4838 = local1243.method8519();
						Static510.aBoolean660 = local1243.method8529() == 1;
						Static620.anInt10173 = local1243.method8511();
						Static475.aBoolean605 = local1243.method8529() == 1;
						Static536.aClass392_2.method9289(Static475.aBoolean605);
						Static201.aClass127_1.method2497(Static475.aBoolean605);
						Static325.aClass231_1.method5364(Static475.aBoolean605);
					} else if (Static492.aClass295_1.method7021(Static511.anInt7225)) {
						Static492.aClass295_1.method7020(0, Static511.anInt7225, local1243.aByteArray102);
						local1243.anInt9869 = 0;
						Static539.anInt9221 = local1243.method8529();
						Static328.anInt5869 = local1243.method8529();
						Static31.aBoolean46 = local1243.method8529() == 1;
						Static361.aBoolean474 = local1243.method8529() == 1;
						Static285.aBoolean388 = local1243.method8529() == 1;
						Static379.aLong201 = local1243.method8509();
						Static398.aLong211 = Static379.aLong201 - Static515.method7499(106) - local1243.method8524();
						local182 = local1243.method8529();
						Static578.aBoolean742 = (local182 & 0x2) != 0;
						Static510.aBoolean660 = (local182 & 0x1) != 0;
						Static202.anInt3291 = local1243.method8527();
						Static54.anInt843 = local1243.method8519();
						Static78.anInt9555 = local1243.method8519();
						Static504.anInt8676 = local1243.method8519();
						Static79.anInt1214 = local1243.method8527();
						Static596.aClass366_8 = Static294.aClass230_3.method5342(Static79.anInt1214);
						Static160.anInt2501 = local1243.method8529();
						Static106.anInt1729 = local1243.method8519();
						Static584.anInt9791 = local1243.method8519();
						Static581.aBoolean745 = local1243.method8529() == 1;
						Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aString62 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aString61 = Static183.aString47 = local1243.method8473();
						Static120.anInt1894 = local1243.method8529();
						Static615.anInt10150 = local1243.method8527();
						Static473.aBoolean599 = local1243.method8529() == 1;
						Static271.aClass54_16 = new Class54();
						Static271.aClass54_16.anInt869 = local1243.method8519();
						if (Static271.aClass54_16.anInt869 == 65535) {
							Static271.aClass54_16.anInt869 = -1;
						}
						Static271.aClass54_16.aString15 = local1243.method8473();
						if (Static408.aClass201_8 != Static570.aClass201_10) {
							Static271.aClass54_16.anInt868 = Static271.aClass54_16.anInt869 + 40000;
							Static271.aClass54_16.anInt872 = Static271.aClass54_16.anInt869 + 50000;
						}
						if (Static570.aClass201_10 != Static116.aClass201_5 && (Static570.aClass201_10 != Static375.aClass201_7 || Static539.anInt9221 < 2) && (Static197.aClass54_35.method824(Static63.aClass54_4) || Static197.aClass54_35.method824(Static511.aClass54_23))) {
							Static373.method5464();
						}
					} else {
						return;
					}
					if (Static31.aBoolean46 && !Static285.aBoolean388 || Static510.aBoolean660) {
						try {
							Static681.method743(Static492.anApplet2, "zap");
						} catch (@Pc(1639) Throwable local1639) {
							if (Static586.aBoolean749) {
								try {
									Static492.anApplet2.getAppletContext().showDocument(new URL(Static492.anApplet2.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1657) Exception local1657) {
								}
							}
						}
					} else {
						try {
							Static681.method743(Static492.anApplet2, "unzap");
						} catch (@Pc(1668) Throwable local1668) {
						}
					}
					if (Static570.aClass201_10 == Static408.aClass201_8) {
						try {
							Static681.method743(Static492.anApplet2, "loggedin");
						} catch (@Pc(1681) Throwable local1681) {
						}
					}
					if (Static670.anInt10721 != 2) {
						Static566.anInt9503 = 0;
						Static326.method4967(2);
						Static69.method1117();
						Static21.method316(7);
						Static493.aClass109_175 = null;
						return;
					}
					Static566.anInt9503 = 16;
				}
				if (Static566.anInt9503 == 16) {
					if (!Static492.aClass295_1.method7021(3)) {
						return;
					}
					Static492.aClass295_1.method7020(0, 3, Static515.aClass5_Sub23_Sub2_1.aByteArray102);
					Static566.anInt9503 = 17;
				}
				if (Static566.anInt9503 == 17) {
					local1243 = Static515.aClass5_Sub23_Sub2_1;
					local1243.anInt9869 = 0;
					if (local1243.method8544()) {
						if (!Static492.aClass295_1.method7021(1)) {
							return;
						}
						Static492.aClass295_1.method7020(3, 1, local1243.aByteArray102);
					}
					Static493.aClass109_175 = Static89.method1344()[local1243.method8545()];
					Static327.anInt5853 = local1243.method8519();
					Static566.anInt9503 = 15;
				}
				if (Static566.anInt9503 == 15) {
					if (Static492.aClass295_1.method7021(Static327.anInt5853)) {
						Static492.aClass295_1.method7020(0, Static327.anInt5853, Static515.aClass5_Sub23_Sub2_1.aByteArray102);
						Static515.aClass5_Sub23_Sub2_1.anInt9869 = 0;
						Static566.anInt9503 = 0;
						local342 = Static327.anInt5853;
						Static326.method4967(2);
						Static405.method5932();
						Static87.method1317(Static515.aClass5_Sub23_Sub2_1);
						Static128.anInt6986 = -1;
						if (Static493.aClass109_175 == Static452.aClass109_160) {
							Static208.method7710();
						} else {
							Static481.method6997((byte) -76);
						}
						if (local342 != Static515.aClass5_Sub23_Sub2_1.anInt9869) {
							throw new RuntimeException("lswp pos:" + Static515.aClass5_Sub23_Sub2_1.anInt9869 + " psize:" + local342);
						}
						Static493.aClass109_175 = null;
					}
				} else if (Static566.anInt9503 == 19) {
					if (Static327.anInt5853 == -2) {
						if (!Static492.aClass295_1.method7021(2)) {
							return;
						}
						Static492.aClass295_1.method7020(0, 2, Static515.aClass5_Sub23_Sub2_1.aByteArray102);
						Static515.aClass5_Sub23_Sub2_1.anInt9869 = 0;
						Static327.anInt5853 = Static515.aClass5_Sub23_Sub2_1.method8519();
					}
					if (Static492.aClass295_1.method7021(Static327.anInt5853)) {
						Static492.aClass295_1.method7020(0, Static327.anInt5853, Static515.aClass5_Sub23_Sub2_1.aByteArray102);
						Static515.aClass5_Sub23_Sub2_1.anInt9869 = 0;
						local342 = Static327.anInt5853;
						Static566.anInt9503 = 0;
						Static326.method4967(15);
						Static414.method6220();
						Static87.method1317(Static515.aClass5_Sub23_Sub2_1);
						if (local342 != Static515.aClass5_Sub23_Sub2_1.anInt9869) {
							throw new RuntimeException("lswpr pos:" + Static515.aClass5_Sub23_Sub2_1.anInt9869 + " psize:" + local342);
						}
						Static493.aClass109_175 = null;
					}
				}
			} else if (Static492.aClass295_1.method7021(1)) {
				Static492.aClass295_1.method7020(0, 1, Static515.aClass5_Sub23_Sub2_1.aByteArray102);
				Static566.anInt9503 = 14;
				Static511.anInt7225 = Static515.aClass5_Sub23_Sub2_1.aByteArray102[0] & 0xFF;
			}
		} catch (@Pc(1952) IOException local1952) {
			if (Static492.aClass295_1 != null) {
				Static492.aClass295_1.method7023();
				Static492.aClass295_1 = null;
			}
			if (Static499.anInt8314 >= 3) {
				Static566.anInt9503 = 0;
				Static326.method4967(-4);
				Static678.method9304();
			} else {
				if (Static670.anInt10721 == 2) {
					Static197.aClass54_35.method825();
				} else {
					Static71.aClass54_5.method825();
				}
				Static566.anInt9503 = 1;
				Static370.anInt10364 = 0;
				Static499.anInt8314++;
			}
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(JLclient!ha;I)V")
	public static void method4945(@OriginalArg(0) long arg0, @OriginalArg(1) Class57 arg1) {
		Static546.anInt9786 = 0;
		Static87.anInt1455 = Static35.anInt9303;
		Static94.anInt1546 = 0;
		Static35.anInt9303 = 0;
		@Pc(18) long local18 = Static515.method7499(69);
		for (@Pc(23) Class8_Sub5 local23 = (Class8_Sub5) Static120.aClass98_2.method1777(); local23 != null; local23 = (Class8_Sub5) Static120.aClass98_2.method1782()) {
			if (local23.method4910(arg1, arg0)) {
				Static546.anInt9786++;
			}
		}
		if (Static374.aBoolean489 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static120.aClass98_2.method1776() + ", running: " + Static546.anInt9786);
			System.out.println("Emitters: " + Static94.anInt1546 + " Particles: " + Static35.anInt9303 + ". Time taken: " + (Static515.method7499(120) - local18) + "ms");
		}
	}
}
