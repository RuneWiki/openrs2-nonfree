import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
	public static int anInt6240;

	@OriginalMember(owner = "client!tk", name = "K", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_184 = new Class208(37, 7);

	@OriginalMember(owner = "client!tk", name = "N", descriptor = "Lclient!wb;")
	public static final Class243 aClass243_30 = new Class243(16);

	@OriginalMember(owner = "client!tk", name = "T", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[100];

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method5435(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) String local4 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(28) int local28 = local19 + (arg1 ? Static137.anInt1376 : Static230.anInt4628);
		for (@Pc(30) int local30 = local19; local30 < local28; local30++) {
			@Pc(36) Class2_Sub7_Sub4 local36 = Static116.method2078(local30);
			if (local36.aBoolean160 && local36.method1716().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static323.aShortArray111 = null;
					Static274.anInt5131 = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(69) short[] local69 = new short[local11.length * 2];
					for (@Pc(71) int local71 = 0; local71 < local13; local71++) {
						local69[local71] = local11[local71];
					}
					local11 = local69;
				}
				local11[local13++] = (short) local30;
			}
		}
		Static274.anInt5131 = local13;
		Static369.anInt6786 = 0;
		Static323.aShortArray111 = local11;
		@Pc(112) String[] local112 = new String[Static274.anInt5131];
		for (@Pc(114) int local114 = 0; local114 < Static274.anInt5131; local114++) {
			local112[local114] = Static116.method2078(local11[local114]).method1716();
		}
		Static294.method4829(Static323.aShortArray111, local112);
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V")
	public static void method5437() {
		if (Static147.anInt3137 == 0 || Static147.anInt3137 == 5) {
			return;
		}
		try {
			if (++Static333.anInt6170 > 2000) {
				if (Static386.aClass226_4 != null) {
					Static386.aClass226_4.method5543();
					Static386.aClass226_4 = null;
				}
				if (Static243.anInt4781 >= 1) {
					Static228.anInt4595 = -5;
					Static147.anInt3137 = 0;
					return;
				}
				Static243.anInt4781++;
				Static333.anInt6170 = 0;
				Static147.anInt3137 = 1;
				if (Static384.anInt6975 == Static114.anInt2525) {
					Static384.anInt6975 = Static167.anInt3451;
				} else {
					Static384.anInt6975 = Static114.anInt2525;
				}
			}
			if (Static147.anInt3137 == 1) {
				Static228.aClass86_7 = Static154.aClass123_2.method3269(Static384.anInt6975, Static283.aString49);
				Static147.anInt3137 = 2;
			}
			if (Static147.anInt3137 == 2) {
				if (Static228.aClass86_7.anInt2590 == 2) {
					throw new IOException();
				}
				if (Static228.aClass86_7.anInt2590 != 1) {
					return;
				}
				Static386.aClass226_4 = new Class226((Socket) Static228.aClass86_7.anObject2, Static154.aClass123_2);
				Static228.aClass86_7 = null;
				@Pc(110) long local110 = Static320.aLong210 = Static115.method2052(Static215.aString36);
				@Pc(117) int local117 = (int) (local110 >> 16 & 0x1FL);
				Static76.aClass2_Sub24_Sub2_7.anInt6669 = 0;
				Static76.aClass2_Sub24_Sub2_7.method5746(Static290.aClass15_1.anInt268);
				Static76.aClass2_Sub24_Sub2_7.method5746(local117);
				Static386.aClass226_4.method5549(2, Static76.aClass2_Sub24_Sub2_7.aByteArray100);
				if (Static42.aClass89_1 != null) {
					Static42.aClass89_1.method5867();
				}
				if (Static157.aClass89_2 != null) {
					Static157.aClass89_2.method5867();
				}
				@Pc(154) int local154 = Static386.aClass226_4.method5547();
				if (Static42.aClass89_1 != null) {
					Static42.aClass89_1.method5867();
				}
				if (Static157.aClass89_2 != null) {
					Static157.aClass89_2.method5867();
				}
				if (local154 != 0) {
					Static147.anInt3137 = 0;
					Static228.anInt4595 = local154;
					Static386.aClass226_4.method5543();
					Static386.aClass226_4 = null;
					return;
				}
				Static147.anInt3137 = 3;
			}
			if (Static147.anInt3137 == 3) {
				if (Static386.aClass226_4.method5550() < 8) {
					return;
				}
				Static386.aClass226_4.method5546(Static321.aClass2_Sub24_Sub2_34.aByteArray100, 0, 8);
				Static321.aClass2_Sub24_Sub2_34.anInt6669 = 0;
				Static98.aLong49 = Static321.aClass2_Sub24_Sub2_34.method5740();
				@Pc(209) int[] local209 = new int[] { (int) (Math.random() * 9.9999999E7D), 0, (int) (Static98.aLong49 >> 32), (int) Static98.aLong49 };
				Static76.aClass2_Sub24_Sub2_7.anInt6669 = 0;
				local209[1] = (int) (Math.random() * 9.9999999E7D);
				Static76.aClass2_Sub24_Sub2_7.method5746(10);
				Static76.aClass2_Sub24_Sub2_7.method5734(local209[0]);
				Static76.aClass2_Sub24_Sub2_7.method5734(local209[1]);
				Static76.aClass2_Sub24_Sub2_7.method5734(local209[2]);
				Static76.aClass2_Sub24_Sub2_7.method5734(local209[3]);
				Static76.aClass2_Sub24_Sub2_7.method5766(Static115.method2052(Static215.aString36));
				Static76.aClass2_Sub24_Sub2_7.method5772(Static375.aString62);
				Static76.aClass2_Sub24_Sub2_7.method5751(Static203.aBigInteger2, Static359.aBigInteger3);
				Static2.aClass2_Sub24_Sub2_43.anInt6669 = 0;
				if (Static121.anInt6774 == 40) {
					Static2.aClass2_Sub24_Sub2_43.method5746(Static290.aClass15_5.anInt268);
				} else {
					Static2.aClass2_Sub24_Sub2_43.method5746(Static290.aClass15_3.anInt268);
				}
				Static2.aClass2_Sub24_Sub2_43.method5721(Static76.aClass2_Sub24_Sub2_7.anInt6669 + Static305.method6026(Static60.aString14) + 161);
				Static2.aClass2_Sub24_Sub2_43.method5734(574);
				Static2.aClass2_Sub24_Sub2_43.method5746(Static32.anInt483);
				Static2.aClass2_Sub24_Sub2_43.method5746(Static195.method3553());
				Static2.aClass2_Sub24_Sub2_43.method5721(Static7.anInt157);
				Static2.aClass2_Sub24_Sub2_43.method5721(Static336.anInt6217);
				Static2.aClass2_Sub24_Sub2_43.method5746(Static87.anInt1875);
				Static370.method4290(Static2.aClass2_Sub24_Sub2_43);
				Static2.aClass2_Sub24_Sub2_43.method5772(Static60.aString14);
				Static2.aClass2_Sub24_Sub2_43.method5734(Static369.anInt6788);
				Static2.aClass2_Sub24_Sub2_43.method5734(Static49.method728());
				Static383.aBoolean489 = true;
				Static2.aClass2_Sub24_Sub2_43.method5721(Static91.anInt1960);
				Static2.aClass2_Sub24_Sub2_43.method5734(Static45.aClass83_117.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static235.aClass83_85.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static48.aClass83_29.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static208.aClass83_76.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static141.aClass83_59.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static90.aClass83_42.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static279.aClass83_95.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static88.aClass83_41.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static324.aClass83_116.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static169.aClass83_110.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static130.aClass83_119.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static311.aClass83_61.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static51.aClass83_30.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static381.aClass83_125.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static316.aClass83_113.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static280.aClass83_98.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static221.aClass83_129.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static350.aClass83_122.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static97.aClass83_46.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static1.aClass83_131.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static281.aClass83_99.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static210.aClass83_127.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static33.aClass83_5.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static86.aClass83_38.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static235.aClass83_84.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static12.aClass83_6.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static48.aClass83_28.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static301.aClass83_108.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5734(Static222.aClass83_79.method1970());
				Static2.aClass2_Sub24_Sub2_43.method5771(Static76.aClass2_Sub24_Sub2_7.aByteArray100, Static76.aClass2_Sub24_Sub2_7.anInt6669);
				Static386.aClass226_4.method5549(Static2.aClass2_Sub24_Sub2_43.anInt6669, Static2.aClass2_Sub24_Sub2_43.aByteArray100);
				Static76.aClass2_Sub24_Sub2_7.method5789(local209);
				for (@Pc(595) int local595 = 0; local595 < 4; local595++) {
					local209[local595] += 50;
				}
				Static321.aClass2_Sub24_Sub2_34.method5789(local209);
				Static147.anInt3137 = 4;
			}
			@Pc(631) int local631;
			if (Static147.anInt3137 == 4) {
				if (Static386.aClass226_4.method5550() < 1) {
					return;
				}
				local631 = Static386.aClass226_4.method5547();
				if (local631 == 21) {
					Static147.anInt3137 = 7;
				} else if (local631 == 29) {
					Static147.anInt3137 = 11;
				} else if (local631 == 1) {
					Static147.anInt3137 = 5;
					Static228.anInt4595 = local631;
					return;
				} else if (local631 == 2) {
					Static147.anInt3137 = 8;
				} else if (local631 == 15) {
					Static147.anInt3137 = 12;
					Static248.anInt4821 = -2;
				} else if (local631 == 23 && Static243.anInt4781 < 1) {
					Static147.anInt3137 = 1;
					Static243.anInt4781++;
					Static333.anInt6170 = 0;
					Static386.aClass226_4.method5543();
					Static386.aClass226_4 = null;
					return;
				} else {
					Static147.anInt3137 = 0;
					Static228.anInt4595 = local631;
					Static386.aClass226_4.method5543();
					Static386.aClass226_4 = null;
					return;
				}
			}
			if (Static147.anInt3137 == 6) {
				Static76.aClass2_Sub24_Sub2_7.anInt6669 = 0;
				Static76.aClass2_Sub24_Sub2_7.method5784(Static290.aClass15_4.anInt268);
				Static386.aClass226_4.method5549(Static76.aClass2_Sub24_Sub2_7.anInt6669, Static76.aClass2_Sub24_Sub2_7.aByteArray100);
				Static147.anInt3137 = 4;
			} else if (Static147.anInt3137 == 7) {
				if (Static386.aClass226_4.method5550() >= 1) {
					Static302.anInt5607 = (Static386.aClass226_4.method5547() + 3) * 60;
					Static228.anInt4595 = 21;
					Static147.anInt3137 = 0;
					Static386.aClass226_4.method5543();
					Static386.aClass226_4 = null;
				}
			} else if (Static147.anInt3137 != 11) {
				if (Static147.anInt3137 == 8) {
					if (Static386.aClass226_4.method5550() < 13) {
						return;
					}
					Static386.aClass226_4.method5546(Static321.aClass2_Sub24_Sub2_34.aByteArray100, 0, 13);
					Static321.aClass2_Sub24_Sub2_34.anInt6669 = 0;
					Static273.anInt5130 = Static321.aClass2_Sub24_Sub2_34.method5732();
					Static145.anInt5340 = Static321.aClass2_Sub24_Sub2_34.method5732();
					Static243.aBoolean352 = Static321.aClass2_Sub24_Sub2_34.method5732() == 1;
					Static184.aBoolean280 = Static321.aClass2_Sub24_Sub2_34.method5732() == 1;
					Static131.aBoolean198 = Static321.aClass2_Sub24_Sub2_34.method5732() == 1;
					Static142.aBoolean215 = Static321.aClass2_Sub24_Sub2_34.method5732() == 1;
					Static93.anInt1976 = Static321.aClass2_Sub24_Sub2_34.method5753();
					Static294.aBoolean401 = Static321.aClass2_Sub24_Sub2_34.method5732() == 1;
					Static180.aBoolean272 = Static321.aClass2_Sub24_Sub2_34.method5732() == 1;
					Static230.aClass96_4.method2302(Static180.aBoolean272);
					Static57.aClass196_1.method4822(Static180.aBoolean272);
					Static207.aClass32_1.method578(Static180.aBoolean272);
					if (Static243.aBoolean352 && !Static131.aBoolean198 || Static294.aBoolean401) {
						try {
							Static406.method5995(Static154.aClass123_2.anApplet1, "zap");
						} catch (@Pc(906) Throwable local906) {
							if (Static217.aBoolean315) {
								try {
									Static154.aClass123_2.anApplet1.getAppletContext().showDocument(new URL(Static154.aClass123_2.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(922) Exception local922) {
								}
							}
						}
					} else {
						try {
							Static406.method5995(Static154.aClass123_2.anApplet1, "unzap");
						} catch (@Pc(896) Throwable local896) {
						}
					}
					if (Static306.aClass49_7 == Static158.aClass49_3) {
						try {
							Static406.method5995(Static154.aClass123_2.anApplet1, "loggedin");
						} catch (@Pc(934) Throwable local934) {
						}
					}
					Static147.anInt3137 = 10;
				}
				if (Static147.anInt3137 == 10) {
					if (Static321.aClass2_Sub24_Sub2_34.method5785()) {
						if (Static386.aClass226_4.method5550() < 1) {
							return;
						}
						Static386.aClass226_4.method5546(Static321.aClass2_Sub24_Sub2_34.aByteArray100, Static321.aClass2_Sub24_Sub2_34.anInt6669 + 2, 1);
					}
					Static178.aClass208_103 = Static195.method3548()[Static321.aClass2_Sub24_Sub2_34.method5786()];
					Static248.anInt4821 = Static321.aClass2_Sub24_Sub2_34.method5753();
					Static147.anInt3137 = 9;
				}
				if (Static147.anInt3137 == 9) {
					if (Static386.aClass226_4.method5550() >= Static248.anInt4821) {
						Static386.aClass226_4.method5546(Static321.aClass2_Sub24_Sub2_34.aByteArray100, 0, Static248.anInt4821);
						Static321.aClass2_Sub24_Sub2_34.anInt6669 = 0;
						local631 = Static248.anInt4821;
						Static147.anInt3137 = 0;
						Static228.anInt4595 = 2;
						Static144.method2631();
						Static78.method1355(Static321.aClass2_Sub24_Sub2_34);
						Static196.anInt2477 = -1;
						Static82.method1414(false);
						if (Static321.aClass2_Sub24_Sub2_34.anInt6669 != local631) {
							throw new RuntimeException("lswp pos:" + Static321.aClass2_Sub24_Sub2_34.anInt6669 + " psize:" + local631);
						}
						Static178.aClass208_103 = null;
					}
				} else if (Static147.anInt3137 == 12) {
					if (Static248.anInt4821 == -2) {
						if (Static386.aClass226_4.method5550() < 2) {
							return;
						}
						Static386.aClass226_4.method5546(Static321.aClass2_Sub24_Sub2_34.aByteArray100, 0, 2);
						Static321.aClass2_Sub24_Sub2_34.anInt6669 = 0;
						Static248.anInt4821 = Static321.aClass2_Sub24_Sub2_34.method5753();
					}
					if (Static386.aClass226_4.method5550() >= Static248.anInt4821) {
						Static386.aClass226_4.method5546(Static321.aClass2_Sub24_Sub2_34.aByteArray100, 0, Static248.anInt4821);
						Static321.aClass2_Sub24_Sub2_34.anInt6669 = 0;
						Static228.anInt4595 = 15;
						Static147.anInt3137 = 0;
						local631 = Static248.anInt4821;
						Static50.method735();
						Static78.method1355(Static321.aClass2_Sub24_Sub2_34);
						if (local631 != Static321.aClass2_Sub24_Sub2_34.anInt6669) {
							throw new RuntimeException("lswpr pos:" + Static321.aClass2_Sub24_Sub2_34.anInt6669 + " psize:" + local631);
						}
						Static178.aClass208_103 = null;
					}
				}
			} else if (Static386.aClass226_4.method5550() >= 1) {
				Static7.anInt170 = Static386.aClass226_4.method5547();
				Static147.anInt3137 = 0;
				Static228.anInt4595 = 29;
				Static386.aClass226_4.method5543();
				Static386.aClass226_4 = null;
			}
		} catch (@Pc(1133) IOException local1133) {
			if (Static386.aClass226_4 != null) {
				Static386.aClass226_4.method5543();
				Static386.aClass226_4 = null;
			}
			if (Static243.anInt4781 < 1) {
				Static243.anInt4781++;
				if (Static384.anInt6975 == Static114.anInt2525) {
					Static384.anInt6975 = Static167.anInt3451;
				} else {
					Static384.anInt6975 = Static114.anInt2525;
				}
				Static147.anInt3137 = 1;
				Static333.anInt6170 = 0;
			} else {
				Static147.anInt3137 = 0;
				Static228.anInt4595 = -4;
			}
		}
	}
}
