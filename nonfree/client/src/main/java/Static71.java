import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!co", name = "c", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray2 = new int[2][][];

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)[Lclient!ft;")
	public static Class110[] method1745() {
		return new Class110[] { Static251.aClass110_26, Static167.aClass110_19, Static375.aClass110_29, Static107.aClass110_14, Static146.aClass110_39, Static391.aClass110_30, Static553.aClass110_38, Static399.aClass110_32, Static239.aClass110_24, Static488.aClass110_9, Static172.aClass110_35, Static237.aClass110_23, Static497.aClass110_37, Static5.aClass110_3, Static550.aClass110_36, Static570.aClass110_31 };
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(B)V")
	public static void method1746() {
		if (Static353.anInt7069 == 0 || Static353.anInt7069 == 6) {
			return;
		}
		try {
			if (++Static13.anInt401 > 2000) {
				if (Static393.aClass8_2 != null) {
					Static393.aClass8_2.method362();
					Static393.aClass8_2 = null;
				}
				if (Static486.anInt9078 >= 2) {
					Static353.anInt7069 = 0;
					Static395.method3918(-5);
					return;
				}
				if (Static377.anInt7322 == 2 || Static377.anInt7322 == 3) {
					Static461.aClass329_6.method7876();
				} else {
					Static369.aClass329_4.method7876();
				}
				Static486.anInt9078++;
				Static353.anInt7069 = 1;
				Static13.anInt401 = 0;
			}
			if (Static353.anInt7069 == 1) {
				if (Static377.anInt7322 == 2 || Static377.anInt7322 == 3) {
					Static475.aClass66_6 = Static461.aClass329_6.method7877(Static480.aClass326_3);
				} else {
					Static475.aClass66_6 = Static369.aClass329_4.method7877(Static480.aClass326_3);
				}
				Static353.anInt7069 = 2;
			}
			if (Static353.anInt7069 == 2) {
				if (Static475.aClass66_6.anInt2308 == 2) {
					throw new IOException();
				}
				if (Static475.aClass66_6.anInt2308 != 1) {
					return;
				}
				Static393.aClass8_2 = Static27.method952((Socket) Static475.aClass66_6.anObject4);
				Static475.aClass66_6 = null;
				@Pc(131) long local131 = Static148.aLong101 = Static490.method7465(Static492.aString107);
				@Pc(138) int local138 = (int) (local131 >> 16 & 0x1FL);
				Static578.method8268();
				@Pc(145) Class3_Sub9 local145 = Static464.method7107();
				local145.aClass3_Sub7_Sub1_1.method6494(Static261.aClass33_29.anInt1080);
				local145.aClass3_Sub7_Sub1_1.method6494(local138);
				Static230.method3933(local145);
				Static326.method5661();
				Static353.anInt7069 = 3;
			}
			@Pc(189) int local189;
			if (Static353.anInt7069 == 3) {
				if (!Static393.aClass8_2.method359(1)) {
					return;
				}
				Static393.aClass8_2.method360(Static89.aClass3_Sub7_Sub1_2.aByteArray86, 0, 1);
				local189 = Static89.aClass3_Sub7_Sub1_2.aByteArray86[0] & 0xFF;
				if (local189 != 0) {
					Static353.anInt7069 = 0;
					Static395.method3918(local189);
					Static393.aClass8_2.method362();
					Static393.aClass8_2 = null;
					Static441.method6901();
					return;
				}
				Static353.anInt7069 = 4;
			}
			if (Static353.anInt7069 == 4) {
				if (!Static393.aClass8_2.method359(8)) {
					return;
				}
				Static393.aClass8_2.method360(Static89.aClass3_Sub7_Sub1_2.aByteArray86, 0, 8);
				Static89.aClass3_Sub7_Sub1_2.anInt7869 = 0;
				Static13.aLong18 = Static89.aClass3_Sub7_Sub1_2.method6519();
				@Pc(235) Class3_Sub7 local235 = new Class3_Sub7(518);
				@Pc(238) int[] local238 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static13.aLong18 >> 32), (int) Static13.aLong18 };
				local235.method6494(10);
				local235.method6495(local238[0]);
				local235.method6495(local238[1]);
				local235.method6495(local238[2]);
				local235.method6495(local238[3]);
				local235.method6533(Static490.method7465(Static492.aString107));
				local235.method6516(Static239.aString52);
				local235.method6533(Static490.aLong226);
				local235.method6533(Static355.aLong157);
				local235.method6545(Static269.aBigInteger6, Static163.aBigInteger4);
				Static578.method8268();
				@Pc(320) Class3_Sub9 local320 = Static464.method7107();
				@Pc(323) Class3_Sub7_Sub1 local323 = local320.aClass3_Sub7_Sub1_1;
				@Pc(343) int local343;
				if (Static377.anInt7322 == 2 || Static377.anInt7322 == 3) {
					if (Static75.anInt1880 == 13) {
						local323.method6494(Static261.aClass33_33.anInt1080);
					} else {
						local323.method6494(Static261.aClass33_31.anInt1080);
					}
					local323.method6528(0);
					local343 = local323.anInt7869;
					local323.method6495(615);
					local323.method6494(Static400.anInt7816);
					local323.method6494(Static216.method3759());
					local323.method6528(Static582.anInt10234);
					local323.method6528(Static294.anInt10217);
					local323.method6494(Static455.aClass3_Sub27_Sub1_1.anInt4798);
					Static488.method2079(local323);
					local323.method6516(Static64.aString16);
					local323.method6495(Static32.anInt2893);
					@Pc(463) Class3_Sub7 local463 = new Class3_Sub7(Static90.method2064());
					Static455.aClass3_Sub27_Sub1_1.method4038(local463);
					local323.method6494(local463.anInt7869);
					local323.method6500(local463.anInt7869, local463.aByteArray86);
					Static11.aBoolean30 = true;
					@Pc(490) Class3_Sub7 local490 = new Class3_Sub7(Static372.method6073());
					(new Class3_Sub42(true, Static480.aClass326_3)).method6912(local490);
					local323.method6500(local490.aByteArray86.length, local490.aByteArray86);
					local323.method6528(Static445.anInt8469);
					local323.method6533(Static339.aLong179);
					Static345.method5841(local323);
					local323.method6500(local235.anInt7869, local235.aByteArray86);
					local323.method6549(local323.anInt7869 - local343);
				} else {
					local323.method6494(Static261.aClass33_34.anInt1080);
					local323.method6528(0);
					local343 = local323.anInt7869;
					local323.method6495(615);
					local323.method6494(Static581.aClass335_4.anInt9905);
					local323.method6494(Static126.anInt2904);
					Static488.method2079(local323);
					local323.method6516(Static64.aString16);
					local323.method6495(Static32.anInt2893);
					Static345.method5841(local323);
					local323.method6500(local235.anInt7869, local235.aByteArray86);
					local323.method6549(local323.anInt7869 - local343);
				}
				Static230.method3933(local320);
				Static326.method5661();
				Static187.aClass40_2 = new Class40(local238);
				for (local343 = 0; local343 < 4; local343++) {
					local238[local343] += 50;
				}
				Static89.aClass3_Sub7_Sub1_2.method1496(local238);
				Static353.anInt7069 = 5;
			}
			if (Static353.anInt7069 == 5) {
				if (!Static393.aClass8_2.method359(1)) {
					return;
				}
				Static393.aClass8_2.method360(Static89.aClass3_Sub7_Sub1_2.aByteArray86, 0, 1);
				local189 = Static89.aClass3_Sub7_Sub1_2.aByteArray86[0] & 0xFF;
				if (local189 == 21) {
					Static353.anInt7069 = 8;
				} else if (local189 == 29) {
					Static353.anInt7069 = 14;
				} else if (local189 == 1) {
					Static353.anInt7069 = 6;
					Static395.method3918(local189);
					return;
				} else if (local189 == 2) {
					Static353.anInt7069 = 9;
				} else if (local189 == 15) {
					Static79.anInt10464 = -2;
					Static353.anInt7069 = 15;
				} else if (local189 == 23 && Static486.anInt9078 < 2) {
					Static353.anInt7069 = 1;
					Static486.anInt9078++;
					Static13.anInt401 = 0;
					Static393.aClass8_2.method362();
					Static393.aClass8_2 = null;
					return;
				} else {
					Static353.anInt7069 = 0;
					Static395.method3918(local189);
					Static393.aClass8_2.method362();
					Static393.aClass8_2 = null;
					Static441.method6901();
					return;
				}
			}
			if (Static353.anInt7069 == 7) {
				Static578.method8268();
				@Pc(686) Class3_Sub9 local686 = Static464.method7107();
				@Pc(689) Class3_Sub7_Sub1 local689 = local686.aClass3_Sub7_Sub1_1;
				local689.method1497(Static187.aClass40_2);
				local689.method1489(Static261.aClass33_41.anInt1080);
				Static230.method3933(local686);
				Static326.method5661();
				Static353.anInt7069 = 5;
			} else if (Static353.anInt7069 == 8) {
				if (Static393.aClass8_2.method359(1)) {
					Static393.aClass8_2.method360(Static89.aClass3_Sub7_Sub1_2.aByteArray86, 0, 1);
					local189 = Static89.aClass3_Sub7_Sub1_2.aByteArray86[0] & 0xFF;
					Static353.anInt7069 = 0;
					Static131.anInt2942 = local189 * 60 + 180;
					Static395.method3918(21);
					Static393.aClass8_2.method362();
					Static393.aClass8_2 = null;
					Static441.method6901();
				}
			} else if (Static353.anInt7069 == 14) {
				if (Static393.aClass8_2.method359(1)) {
					Static393.aClass8_2.method360(Static89.aClass3_Sub7_Sub1_2.aByteArray86, 0, 1);
					Static353.anInt7069 = 0;
					Static65.anInt1700 = Static89.aClass3_Sub7_Sub1_2.aByteArray86[0] & 0xFF;
					Static395.method3918(29);
					Static393.aClass8_2.method362();
					Static393.aClass8_2 = null;
					Static441.method6901();
				}
			} else if (Static353.anInt7069 != 9) {
				@Pc(828) Class3_Sub7_Sub1 local828;
				if (Static353.anInt7069 == 10) {
					local828 = Static89.aClass3_Sub7_Sub1_2;
					if (Static377.anInt7322 == 3) {
						Static23.aBoolean715 = true;
					} else {
						Static23.aBoolean715 = false;
					}
					if (Static377.anInt7322 == 2 || Static377.anInt7322 == 3) {
						if (!Static393.aClass8_2.method359(Static595.anInt10420)) {
							return;
						}
						Static393.aClass8_2.method360(local828.aByteArray86, 0, Static595.anInt10420);
						local828.anInt7869 = 0;
						Static158.anInt3421 = local828.method6538();
						Static242.anInt5064 = local828.method6538();
						Static397.aBoolean649 = local828.method6538() == 1;
						Static438.aBoolean691 = local828.method6538() == 1;
						Static378.aBoolean844 = local828.method6538() == 1;
						Static491.aBoolean666 = local828.method6538() == 1;
						Static381.anInt1560 = local828.method6535();
						Static10.aBoolean29 = local828.method6538() == 1;
						Static581.anInt10231 = local828.method6507();
						Static584.aBoolean846 = local828.method6538() == 1;
						if (Static377.anInt7322 == 3) {
							@Pc(1157) boolean local1157 = local828.method6538() == 1;
							if (local1157) {
								@Pc(1163) long local1163 = local828.method6519();
								@Pc(1167) String local1167 = Static482.method7394(local1163);
								@Pc(1173) int local1173 = local828.method6538();
								@Pc(1176) byte[] local1176 = new byte[local1173];
								local828.method1490(local1176, local1173);
								@Pc(1186) String local1186 = Static562.method8113(local1176);
								@Pc(1188) Class148 local1188 = null;
								try {
									@Pc(1194) Class66 local1194 = Static480.aClass326_3.method7783("3", false);
									while (local1194.anInt2308 == 0) {
										Static1.method125(1L);
									}
									if (local1194.anInt2308 == 1) {
										local1188 = (Class148) local1194.anObject4;
										@Pc(1223) int local1223 = local1167.length() + local1186.length() + 14 + 3 + 2;
										if (local1223 > 60) {
											throw new RuntimeException(">60");
										}
										@Pc(1238) Class3_Sub7 local1238 = new Class3_Sub7(local1223 + 1);
										local1238.method6494(local1223);
										local1238.method6494(2);
										local1238.method6496(local1167);
										local1238.method6496(local1186);
										local1238.method6528(Static32.anInt2893);
										local1238.method6533(Static339.aLong179);
										local1238.method6551();
										local1188.method3373(local1238.anInt7869, local1238.aByteArray86, 0);
									}
								} catch (@Pc(1276) Exception local1276) {
								}
								try {
									if (local1188 != null) {
										local1188.method3377();
									}
								} catch (@Pc(1283) Exception local1283) {
								}
								try {
									Static603.method4977("demoaccountcreated", Static253.anApplet3);
								} catch (@Pc(1290) Throwable local1290) {
								}
							}
						}
						Static253.aClass146_2.method3352(Static584.aBoolean846);
						Static517.aClass23_2.method908(Static584.aBoolean846);
						Static121.aClass118_2.method3031(Static584.aBoolean846);
					} else if (Static393.aClass8_2.method359(Static595.anInt10420)) {
						Static393.aClass8_2.method360(local828.aByteArray86, 0, Static595.anInt10420);
						local828.anInt7869 = 0;
						Static158.anInt3421 = local828.method6538();
						Static242.anInt5064 = local828.method6538();
						Static397.aBoolean649 = local828.method6538() == 1;
						Static438.aBoolean691 = local828.method6538() == 1;
						Static378.aBoolean844 = local828.method6538() == 1;
						Static524.anInt9578 = local828.method6535();
						Static10.aBoolean29 = Static524.anInt9578 > 0;
						Static468.anInt8751 = local828.method6535();
						Static329.anInt6823 = local828.method6535();
						Static131.anInt2940 = local828.method6535();
						Static66.anInt1705 = local828.method6497();
						Static230.aClass66_4 = Static480.aClass326_3.method7787(Static66.anInt1705);
						Static165.anInt3515 = local828.method6538();
						Static29.anInt856 = local828.method6535();
						Static201.anInt3913 = local828.method6535();
						Static522.aBoolean796 = local828.method6538() == 1;
						Static443.aClass2_Sub2_Sub1_Sub1_2.aString23 = Static443.aClass2_Sub2_Sub1_Sub1_2.aString22 = local828.method6514();
						Static181.anInt3660 = local828.method6538();
						Static131.anInt2941 = local828.method6497();
						Static528.aClass329_7 = new Class329();
						Static528.aClass329_7.anInt9698 = local828.method6535();
						if (Static528.aClass329_7.anInt9698 == 65535) {
							Static528.aClass329_7.anInt9698 = -1;
						}
						Static528.aClass329_7.aString124 = local828.method6514();
						if (Static51.aClass109_2 != Static508.aClass109_7) {
							Static528.aClass329_7.anInt9689 = Static528.aClass329_7.anInt9698 + 50000;
							Static528.aClass329_7.anInt9687 = Static528.aClass329_7.anInt9698 + 40000;
						}
						if (Static219.aClass109_4 != Static51.aClass109_2 && (Static461.aClass329_6.method7874(Static516.aClass329_3) || Static461.aClass329_6.method7874(Static460.aClass329_5))) {
							Static491.method6678();
						}
					} else {
						return;
					}
					if (Static397.aBoolean649 && !Static378.aBoolean844 || Static10.aBoolean29) {
						try {
							Static603.method4977("zap", Static253.anApplet3);
						} catch (@Pc(1318) Throwable local1318) {
							if (Static440.aBoolean398) {
								try {
									Static253.anApplet3.getAppletContext().showDocument(new URL(Static253.anApplet3.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1332) Exception local1332) {
								}
							}
						}
					} else {
						try {
							Static603.method4977("unzap", Static253.anApplet3);
						} catch (@Pc(1341) Throwable local1341) {
						}
					}
					if (Static508.aClass109_7 == Static51.aClass109_2) {
						try {
							Static603.method4977("loggedin", Static253.anApplet3);
						} catch (@Pc(1352) Throwable local1352) {
						}
					}
					if (Static377.anInt7322 != 2 && Static377.anInt7322 != 3) {
						Static353.anInt7069 = 0;
						Static395.method3918(2);
						Static209.method3673();
						Static168.method3104(7);
						Static576.aClass276_150 = null;
						return;
					}
					Static353.anInt7069 = 12;
				}
				if (Static353.anInt7069 == 12) {
					if (!Static393.aClass8_2.method359(3)) {
						return;
					}
					Static393.aClass8_2.method360(Static89.aClass3_Sub7_Sub1_2.aByteArray86, 0, 3);
					Static353.anInt7069 = 13;
				}
				if (Static353.anInt7069 == 13) {
					local828 = Static89.aClass3_Sub7_Sub1_2;
					local828.anInt7869 = 0;
					if (local828.method1493()) {
						if (!Static393.aClass8_2.method359(1)) {
							return;
						}
						Static393.aClass8_2.method360(local828.aByteArray86, 3, 1);
					}
					Static576.aClass276_150 = Static46.method1200()[local828.method1494()];
					Static79.anInt10464 = local828.method6535();
					Static353.anInt7069 = 11;
				}
				if (Static353.anInt7069 == 11) {
					if (Static393.aClass8_2.method359(Static79.anInt10464)) {
						Static393.aClass8_2.method360(Static89.aClass3_Sub7_Sub1_2.aByteArray86, 0, Static79.anInt10464);
						Static89.aClass3_Sub7_Sub1_2.anInt7869 = 0;
						local189 = Static79.anInt10464;
						Static353.anInt7069 = 0;
						Static395.method3918(2);
						Static575.method8211();
						Static467.method7184(Static89.aClass3_Sub7_Sub1_2);
						Static368.anInt7248 = -1;
						if (Static576.aClass276_150 == Static296.aClass276_75) {
							Static397.method6330();
						} else {
							Static126.method2518();
						}
						if (local189 != Static89.aClass3_Sub7_Sub1_2.anInt7869) {
							throw new RuntimeException("lswp pos:" + Static89.aClass3_Sub7_Sub1_2.anInt7869 + " psize:" + local189);
						}
						Static576.aClass276_150 = null;
					}
				} else if (Static353.anInt7069 == 15) {
					if (Static79.anInt10464 == -2) {
						if (!Static393.aClass8_2.method359(2)) {
							return;
						}
						Static393.aClass8_2.method360(Static89.aClass3_Sub7_Sub1_2.aByteArray86, 0, 2);
						Static89.aClass3_Sub7_Sub1_2.anInt7869 = 0;
						Static79.anInt10464 = Static89.aClass3_Sub7_Sub1_2.method6535();
					}
					if (Static393.aClass8_2.method359(Static79.anInt10464)) {
						Static393.aClass8_2.method360(Static89.aClass3_Sub7_Sub1_2.aByteArray86, 0, Static79.anInt10464);
						Static89.aClass3_Sub7_Sub1_2.anInt7869 = 0;
						Static353.anInt7069 = 0;
						local189 = Static79.anInt10464;
						Static395.method3918(15);
						Static305.method5050();
						Static467.method7184(Static89.aClass3_Sub7_Sub1_2);
						if (Static89.aClass3_Sub7_Sub1_2.anInt7869 != local189) {
							throw new RuntimeException("lswpr pos:" + Static89.aClass3_Sub7_Sub1_2.anInt7869 + " psize:" + local189);
						}
						Static576.aClass276_150 = null;
					}
				}
			} else if (Static393.aClass8_2.method359(1)) {
				Static393.aClass8_2.method360(Static89.aClass3_Sub7_Sub1_2.aByteArray86, 0, 1);
				Static353.anInt7069 = 10;
				Static595.anInt10420 = Static89.aClass3_Sub7_Sub1_2.aByteArray86[0] & 0xFF;
			}
		} catch (@Pc(1603) IOException local1603) {
			if (Static393.aClass8_2 != null) {
				Static393.aClass8_2.method362();
				Static393.aClass8_2 = null;
			}
			if (Static486.anInt9078 >= 2) {
				Static353.anInt7069 = 0;
				Static395.method3918(-4);
				Static441.method6901();
			} else {
				if (Static377.anInt7322 == 2 || Static377.anInt7322 == 3) {
					Static461.aClass329_6.method7876();
				} else {
					Static369.aClass329_4.method7876();
				}
				Static353.anInt7069 = 1;
				Static13.anInt401 = 0;
				Static486.anInt9078++;
			}
		}
	}
}
