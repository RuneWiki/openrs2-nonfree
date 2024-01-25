import java.awt.Color;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
	public static int anInt1843 = 100;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_40 = new Class263(53, 3);

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_41 = new Class263(15, 16);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIBII)V")
	public static void method1336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static127.method2086(0, arg4, arg1, arg3, arg0, arg5, arg2);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIILclient!f;Lclient!f;)V")
	public static void method1337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30_Sub2 arg3, @OriginalArg(4) Class30_Sub2 arg4) {
		@Pc(4) Class252 local4 = Static412.method5598(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass30_Sub2_2 = arg3;
			local4.aClass30_Sub2_3 = arg4;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/util/Random;IZ)I")
	public static int method1340(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static25.method518(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(34) int local34 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(37) int local37;
			do {
				local37 = arg0.nextInt();
			} while (local34 <= local37);
			return Static94.method1626(local37, arg1);
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public static void method1342() {
		if (Static97.anInt2331 == 0 || Static97.anInt2331 == 5) {
			return;
		}
		try {
			if (++Static36.anInt7167 > 2000) {
				if (Static388.aClass236_13 != null) {
					Static388.aClass236_13.method5236();
					Static388.aClass236_13 = null;
				}
				if (Static168.anInt1662 >= 1) {
					Static97.anInt2331 = 0;
					Static53.method992(-5);
					return;
				}
				if (Static165.anInt3454 == 2 || Static165.anInt3454 == 3) {
					Static156.aClass35_9.aBoolean65 = !Static156.aClass35_9.aBoolean65;
				} else {
					Static283.aClass35_11.aBoolean65 = !Static283.aClass35_11.aBoolean65;
				}
				Static36.anInt7167 = 0;
				Static97.anInt2331 = 1;
				Static168.anInt1662++;
			}
			if (Static97.anInt2331 == 1) {
				if (Static165.anInt3454 == 2 || Static165.anInt3454 == 3) {
					Static184.aClass157_2 = Static150.aClass183_3.method4154(Static156.aClass35_9.method735(), Static156.aClass35_9.aString6);
				} else {
					Static184.aClass157_2 = Static150.aClass183_3.method4154(Static283.aClass35_11.method735(), Static283.aClass35_11.aString6);
				}
				Static97.anInt2331 = 2;
			}
			@Pc(171) int local171;
			if (Static97.anInt2331 == 2) {
				if (Static184.aClass157_2.anInt4667 == 2) {
					throw new IOException();
				}
				if (Static184.aClass157_2.anInt4667 != 1) {
					return;
				}
				Static388.aClass236_13 = new Class236((Socket) Static184.aClass157_2.anObject13, Static150.aClass183_3);
				Static184.aClass157_2 = null;
				@Pc(139) long local139 = Static385.aLong199 = Static26.method555(Static92.aString19);
				Static433.aClass1_Sub3_Sub1_11.anInt1710 = 0;
				@Pc(149) int local149 = (int) (local139 >> 16 & 0x1FL);
				Static433.aClass1_Sub3_Sub1_11.method1208(Static168.aClass247_25.anInt7273);
				Static433.aClass1_Sub3_Sub1_11.method1208(local149);
				Static388.aClass236_13.method5227(2, Static433.aClass1_Sub3_Sub1_11.aByteArray14);
				Static360.method5075();
				local171 = Static388.aClass236_13.method5231();
				Static360.method5075();
				if (local171 != 0) {
					Static97.anInt2331 = 0;
					Static53.method992(local171);
					Static388.aClass236_13.method5236();
					Static388.aClass236_13 = null;
					Static182.method3057();
					return;
				}
				Static97.anInt2331 = 3;
			}
			if (Static97.anInt2331 == 3) {
				if (Static388.aClass236_13.method5235() < 8) {
					return;
				}
				Static388.aClass236_13.method5226(0, Static5.aClass1_Sub3_Sub1_1.aByteArray14, 8);
				Static5.aClass1_Sub3_Sub1_1.anInt1710 = 0;
				Static108.aLong72 = Static5.aClass1_Sub3_Sub1_1.method1162();
				@Pc(227) Class1_Sub3 local227 = new Class1_Sub3(70);
				@Pc(230) int[] local230 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static108.aLong72 >> 32), (int) Static108.aLong72 };
				local227.method1208(10);
				local227.method1197(local230[0]);
				local227.method1197(local230[1]);
				local227.method1197(local230[2]);
				local227.method1197(local230[3]);
				local227.method1180(Static26.method555(Static92.aString19));
				local227.method1190(Static194.aString35);
				local227.method1183(Static194.aBigInteger2, Static77.aBigInteger1);
				@Pc(303) Class1_Sub3_Sub1 local303 = Static433.aClass1_Sub3_Sub1_11;
				local303.anInt1710 = 0;
				if (Static165.anInt3454 == 2 || Static165.anInt3454 == 3) {
					if (Static170.anInt3494 == 12) {
						local303.method1208(Static168.aClass247_29.anInt7273);
					} else {
						local303.method1208(Static168.aClass247_27.anInt7273);
					}
					local303.method1227(0);
					local171 = local303.anInt1710;
					local303.method1197(598);
					local303.method1208(Static39.anInt1015);
					local303.method1208(Static86.method1531());
					local303.method1227(Static152.anInt3234);
					local303.method1227(Static342.anInt6292);
					local303.method1208(Static12.aClass34_Sub1_1.anInt7161);
					Static346.method4897(local303);
					local303.method1190(Static325.aString57);
					local303.method1197(Static2.anInt47);
					@Pc(379) Class1_Sub3 local379 = Static12.aClass34_Sub1_1.method5476();
					local303.method1208(local379.anInt1710);
					local303.method1181(local379.aByteArray14, local379.anInt1710);
					Static399.aBoolean22 = true;
					local303.method1227(Static155.anInt3339);
					local303.method1227(Static20.anInt524);
					Static87.method1551();
					local303.method1181(local227.aByteArray14, local227.anInt1710);
					local303.method1196(local303.anInt1710 - local171);
				} else {
					local303.method1208(Static168.aClass247_30.anInt7273);
					local303.method1227(0);
					local171 = local303.anInt1710;
					local303.method1197(598);
					local303.method1208(Static268.aClass272_4.anInt7964);
					local303.method1208(Static365.anInt6682);
					Static346.method4897(local303);
					local303.method1190(Static325.aString57);
					local303.method1197(Static2.anInt47);
					Static87.method1551();
					local303.method1181(local227.aByteArray14, local227.anInt1710);
					local303.method1196(local303.anInt1710 - local171);
				}
				Static388.aClass236_13.method5227(local303.anInt1710, local303.aByteArray14);
				local303.method314(local230);
				for (local171 = 0; local171 < 4; local171++) {
					local230[local171] += 50;
				}
				Static5.aClass1_Sub3_Sub1_1.method314(local230);
				Static97.anInt2331 = 4;
			}
			@Pc(536) int local536;
			if (Static97.anInt2331 == 4) {
				if (Static388.aClass236_13.method5235() < 1) {
					return;
				}
				local536 = Static388.aClass236_13.method5231();
				if (local536 == 21) {
					Static97.anInt2331 = 7;
				} else if (local536 == 29) {
					Static97.anInt2331 = 13;
				} else if (local536 == 1) {
					Static97.anInt2331 = 5;
					Static53.method992(local536);
					return;
				} else if (local536 == 2) {
					Static97.anInt2331 = 8;
				} else if (local536 == 15) {
					Static350.anInt6510 = -2;
					Static97.anInt2331 = 14;
				} else if (local536 == 23 && Static168.anInt1662 < 1) {
					Static36.anInt7167 = 0;
					Static97.anInt2331 = 1;
					Static168.anInt1662++;
					Static388.aClass236_13.method5236();
					Static388.aClass236_13 = null;
					return;
				} else {
					Static97.anInt2331 = 0;
					Static53.method992(local536);
					Static388.aClass236_13.method5236();
					Static388.aClass236_13 = null;
					Static182.method3057();
					return;
				}
			}
			if (Static97.anInt2331 == 6) {
				Static433.aClass1_Sub3_Sub1_11.anInt1710 = 0;
				Static433.aClass1_Sub3_Sub1_11.method322(Static168.aClass247_28.anInt7273);
				Static388.aClass236_13.method5227(Static433.aClass1_Sub3_Sub1_11.anInt1710, Static433.aClass1_Sub3_Sub1_11.aByteArray14);
				Static97.anInt2331 = 4;
			} else if (Static97.anInt2331 == 7) {
				if (Static388.aClass236_13.method5235() >= 1) {
					Static305.anInt5745 = Static388.aClass236_13.method5231() * 60 + 180;
					Static97.anInt2331 = 0;
					Static53.method992(21);
					Static388.aClass236_13.method5236();
					Static388.aClass236_13 = null;
					Static182.method3057();
				}
			} else if (Static97.anInt2331 == 13) {
				if (Static388.aClass236_13.method5235() >= 1) {
					Static432.anInt7626 = Static388.aClass236_13.method5231();
					Static97.anInt2331 = 0;
					Static53.method992(29);
					Static388.aClass236_13.method5236();
					Static388.aClass236_13 = null;
					Static182.method3057();
				}
			} else if (Static97.anInt2331 != 8) {
				@Pc(735) Class1_Sub3_Sub1 local735;
				if (Static97.anInt2331 == 9) {
					if (Static165.anInt3454 == 3) {
						Static341.aBoolean397 = true;
					} else {
						Static341.aBoolean397 = false;
					}
					local735 = Static5.aClass1_Sub3_Sub1_1;
					if (Static165.anInt3454 == 2 || Static165.anInt3454 == 3) {
						if (Static388.aClass236_13.method5235() < Static7.anInt88) {
							return;
						}
						Static388.aClass236_13.method5226(0, local735.aByteArray14, Static7.anInt88);
						local735.anInt1710 = 0;
						Static41.anInt1052 = local735.method1171();
						Static387.anInt7074 = local735.method1171();
						Static400.aBoolean463 = local735.method1171() == 1;
						Static223.aBoolean279 = local735.method1171() == 1;
						Static225.aBoolean280 = local735.method1171() == 1;
						Static11.aBoolean7 = local735.method1171() == 1;
						Static32.anInt894 = local735.method1177();
						Static346.aBoolean406 = local735.method1171() == 1;
						Static125.anInt2786 = local735.method1203();
						Static94.aBoolean149 = local735.method1171() == 1;
						if (Static165.anInt3454 == 3) {
							@Pc(845) boolean local845 = local735.method1171() == 1;
							if (local845) {
								@Pc(851) long local851 = local735.method1162();
								@Pc(855) String local855 = Static434.method5788(local851);
								@Pc(859) int local859 = local735.method1171();
								@Pc(862) byte[] local862 = new byte[local859];
								local735.method316(local862, local859);
								@Pc(874) String local874 = Static410.method5578(local862);
								@Pc(876) Class128 local876 = null;
								try {
									@Pc(882) Class157 local882 = Static150.aClass183_3.method4157("3", false);
									while (local882.anInt4667 == 0) {
										Static289.method4249(1L);
									}
									if (local882.anInt4667 == 1) {
										local876 = (Class128) local882.anObject13;
										@Pc(915) int local915 = local855.length() + local874.length() + 3 + 2 + 4;
										if (local915 > 50) {
											throw new RuntimeException(">50");
										}
										@Pc(930) Class1_Sub3 local930 = new Class1_Sub3(local915 + 1);
										local930.method1208(local915);
										local930.method1208(0);
										local930.method1194(local855);
										local930.method1194(local874);
										local930.method1198();
										local876.method3089(local930.anInt1710, 0, local930.aByteArray14);
									}
								} catch (@Pc(960) Exception local960) {
								}
								try {
									if (local876 != null) {
										local876.method3091();
									}
								} catch (@Pc(967) Exception local967) {
								}
							}
						}
						Static455.aClass161_4.method3631(Static94.aBoolean149);
						Static43.aClass57_1.method1412(Static94.aBoolean149);
						Static300.aClass44_2.method1001(Static94.aBoolean149);
					} else if (Static388.aClass236_13.method5235() >= Static7.anInt88) {
						Static388.aClass236_13.method5226(0, local735.aByteArray14, Static7.anInt88);
						local735.anInt1710 = 0;
						Static41.anInt1052 = local735.method1171();
						Static387.anInt7074 = local735.method1171();
						Static400.aBoolean463 = local735.method1171() == 1;
						Static223.aBoolean279 = local735.method1171() == 1;
						Static225.aBoolean280 = local735.method1171() == 1;
						Static139.anInt3046 = local735.method1177();
						Static346.aBoolean406 = Static139.anInt3046 > 0;
						Static201.anInt4190 = local735.method1177();
						Static435.anInt7683 = local735.method1177();
						Static278.anInt5378 = local735.method1177();
						Static105.anInt2416 = local735.method1188();
						Static228.aClass157_3 = Static150.aClass183_3.method4153(Static105.anInt2416);
						Static222.anInt4445 = local735.method1171();
						Static292.anInt5519 = local735.method1177();
						Static50.anInt1226 = local735.method1177();
						Static199.aBoolean250 = local735.method1171() == 1;
						Static429.aClass30_Sub1_Sub1_Sub2_2.aString9 = Static429.aClass30_Sub1_Sub1_Sub2_2.aString8 = local735.method1178();
						Static142.aClass35_7 = new Class35();
						Static142.aClass35_7.anInt1006 = local735.method1177();
						if (Static142.aClass35_7.anInt1006 == 65535) {
							Static142.aClass35_7.anInt1006 = -1;
						}
						Static142.aClass35_7.aString6 = local735.method1178();
						if (Static314.aClass248_7 != Static59.aClass248_1) {
							Static142.aClass35_7.anInt1005 = Static142.aClass35_7.anInt1006 + 40000;
							Static142.aClass35_7.anInt1004 = Static142.aClass35_7.anInt1006 + 50000;
						}
						if (Static314.aClass248_7 != Static366.aClass248_8 && (Static156.aClass35_9.method737(Static156.aClass35_8) || Static156.aClass35_9.method737(Static214.aClass35_16))) {
							Static156.aClass35_9 = Static142.aClass35_7;
						}
					} else {
						return;
					}
					if (Static400.aBoolean463 && !Static225.aBoolean280 || Static346.aBoolean406) {
						try {
							Static466.method4995("zap", Static150.aClass183_3.anApplet1);
						} catch (@Pc(1190) Throwable local1190) {
							if (Static237.aBoolean302) {
								try {
									Static150.aClass183_3.anApplet1.getAppletContext().showDocument(new URL(Static150.aClass183_3.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1206) Exception local1206) {
								}
							}
						}
					} else {
						try {
							Static466.method4995("unzap", Static150.aClass183_3.anApplet1);
						} catch (@Pc(1180) Throwable local1180) {
						}
					}
					if (Static59.aClass248_1 == Static314.aClass248_7) {
						try {
							Static466.method4995("loggedin", Static150.aClass183_3.anApplet1);
						} catch (@Pc(1218) Throwable local1218) {
						}
					}
					if (Static165.anInt3454 != 2 && Static165.anInt3454 != 3) {
						Static97.anInt2331 = 0;
						Static53.method992(2);
						Static188.method3084();
						Static118.method2017(6);
						Static102.aClass263_56 = null;
						return;
					}
					Static97.anInt2331 = 11;
				}
				if (Static97.anInt2331 == 11) {
					if (Static388.aClass236_13.method5235() < 3) {
						return;
					}
					Static388.aClass236_13.method5226(0, Static5.aClass1_Sub3_Sub1_1.aByteArray14, 3);
					Static97.anInt2331 = 12;
				}
				if (Static97.anInt2331 == 12) {
					local735 = Static5.aClass1_Sub3_Sub1_1;
					local735.anInt1710 = 0;
					if (local735.method317()) {
						if (Static388.aClass236_13.method5235() < 1) {
							return;
						}
						Static388.aClass236_13.method5226(3, local735.aByteArray14, 1);
					}
					Static102.aClass263_56 = Static417.method5675()[local735.method319()];
					Static350.anInt6510 = local735.method1177();
					Static97.anInt2331 = 10;
				}
				if (Static97.anInt2331 == 10) {
					if (Static388.aClass236_13.method5235() >= Static350.anInt6510) {
						Static388.aClass236_13.method5226(0, Static5.aClass1_Sub3_Sub1_1.aByteArray14, Static350.anInt6510);
						Static5.aClass1_Sub3_Sub1_1.anInt1710 = 0;
						Static97.anInt2331 = 0;
						local536 = Static350.anInt6510;
						Static53.method992(2);
						Static301.method4362();
						Static65.method1283(Static5.aClass1_Sub3_Sub1_1);
						Static150.anInt3209 = -1;
						Static359.method5066();
						if (Static5.aClass1_Sub3_Sub1_1.anInt1710 != local536) {
							throw new RuntimeException("lswp pos:" + Static5.aClass1_Sub3_Sub1_1.anInt1710 + " psize:" + local536);
						}
						Static102.aClass263_56 = null;
					}
				} else if (Static97.anInt2331 == 14) {
					if (Static350.anInt6510 == -2) {
						if (Static388.aClass236_13.method5235() < 2) {
							return;
						}
						Static388.aClass236_13.method5226(0, Static5.aClass1_Sub3_Sub1_1.aByteArray14, 2);
						Static5.aClass1_Sub3_Sub1_1.anInt1710 = 0;
						Static350.anInt6510 = Static5.aClass1_Sub3_Sub1_1.method1177();
					}
					if (Static388.aClass236_13.method5235() >= Static350.anInt6510) {
						Static388.aClass236_13.method5226(0, Static5.aClass1_Sub3_Sub1_1.aByteArray14, Static350.anInt6510);
						Static5.aClass1_Sub3_Sub1_1.anInt1710 = 0;
						Static97.anInt2331 = 0;
						local536 = Static350.anInt6510;
						Static53.method992(15);
						Static283.method4170();
						Static65.method1283(Static5.aClass1_Sub3_Sub1_1);
						if (local536 != Static5.aClass1_Sub3_Sub1_1.anInt1710) {
							throw new RuntimeException("lswpr pos:" + Static5.aClass1_Sub3_Sub1_1.anInt1710 + " psize:" + local536);
						}
						Static102.aClass263_56 = null;
					}
				}
			} else if (Static388.aClass236_13.method5235() >= 1) {
				Static7.anInt88 = Static388.aClass236_13.method5231();
				Static97.anInt2331 = 9;
			}
		} catch (@Pc(1462) IOException local1462) {
			if (Static388.aClass236_13 != null) {
				Static388.aClass236_13.method5236();
				Static388.aClass236_13 = null;
			}
			if (Static168.anInt1662 >= 1) {
				Static97.anInt2331 = 0;
				Static53.method992(-4);
				Static182.method3057();
			} else {
				Static97.anInt2331 = 1;
				Static36.anInt7167 = 0;
				if (Static165.anInt3454 == 2 || Static165.anInt3454 == 3) {
					Static156.aClass35_9.aBoolean65 = !Static156.aClass35_9.aBoolean65;
				} else {
					Static283.aClass35_11.aBoolean65 = !Static283.aClass35_11.aBoolean65;
				}
				Static168.anInt1662++;
			}
		}
	}
}
