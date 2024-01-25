import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!nia", name = "i", descriptor = "Lclient!nba;")
	public static Class226 aClass226_1;

	@OriginalMember(owner = "client!nia", name = "j", descriptor = "I")
	public static int anInt7091;

	@OriginalMember(owner = "client!nia", name = "e", descriptor = "[I")
	public static final int[] anIntArray423 = new int[32];

	@OriginalMember(owner = "client!nia", name = "k", descriptor = "Z")
	public static final boolean aBoolean513 = false;

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "(I)V")
	public static void method6104() {
		if (Static251.anInt4607 == 0 || Static251.anInt4607 == 5) {
			return;
		}
		try {
			@Pc(18) short local18;
			if (Static51.anInt1427 == 0) {
				local18 = 250;
			} else {
				local18 = 2000;
			}
			if (local18 < ++Static547.anInt1286) {
				if (Static413.aClass230_1 != null) {
					Static413.aClass230_1.method6028();
					Static413.aClass230_1 = null;
				}
				if (Static51.anInt1427 >= 3) {
					Static251.anInt4607 = 0;
					Static329.method5383(-5);
					return;
				}
				if (Static435.anInt7845 == 2) {
					Static4.aClass363_1.method8469();
				} else {
					Static44.aClass363_2.method8469();
				}
				Static51.anInt1427++;
				Static251.anInt4607 = 1;
				Static547.anInt1286 = 0;
			}
			if (Static251.anInt4607 == 1) {
				if (Static435.anInt7845 == 2) {
					Static422.aClass304_4 = Static4.aClass363_1.method8471(Static205.aClass138_2);
				} else {
					Static422.aClass304_4 = Static44.aClass363_2.method8471(Static205.aClass138_2);
				}
				Static251.anInt4607 = 2;
			}
			@Pc(122) Class3_Sub14 local122;
			if (Static251.anInt4607 == 2) {
				if (Static422.aClass304_4.anInt8838 == 2) {
					throw new IOException();
				}
				if (Static422.aClass304_4.anInt8838 != 1) {
					return;
				}
				Static413.aClass230_1 = Static343.method5748((Socket) Static422.aClass304_4.anObject16);
				Static422.aClass304_4 = null;
				Static422.method6617();
				local122 = Static91.method2068();
				local122.aClass3_Sub3_Sub2_2.method4220(Static624.aClass136_1.anInt4034);
				Static562.method8096(local122);
				Static154.method2812();
				Static251.anInt4607 = 3;
			}
			@Pc(161) int local161;
			if (Static251.anInt4607 == 3) {
				if (!Static413.aClass230_1.method6031(1)) {
					return;
				}
				Static413.aClass230_1.method6029(Static30.aClass3_Sub3_Sub2_1.aByteArray54, 1, 0);
				local161 = Static30.aClass3_Sub3_Sub2_1.aByteArray54[0] & 0xFF;
				if (local161 != 0) {
					Static251.anInt4607 = 0;
					Static329.method5383(local161);
					Static413.aClass230_1.method6028();
					Static413.aClass230_1 = null;
					Static131.method2523();
					return;
				}
				Static30.aClass3_Sub3_Sub2_1.anInt4736 = 0;
				@Pc(184) Class3_Sub3 local184 = new Class3_Sub3(518);
				@Pc(187) int[] local187 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				local184.method4220(10);
				local184.method4265(local187[0]);
				local184.method4265(local187[1]);
				local184.method4265(local187[2]);
				local184.method4265(local187[3]);
				local184.method4251(0L);
				local184.method4241(Static446.aString85);
				local184.method4251(Static368.aLong190);
				local184.method4251(Static278.aLong159);
				local184.method4234(Static16.aBigInteger6, Static56.aBigInteger2);
				Static422.method6617();
				@Pc(271) Class3_Sub14 local271 = Static91.method2068();
				@Pc(274) Class3_Sub3_Sub2 local274 = local271.aClass3_Sub3_Sub2_2;
				@Pc(301) int local301;
				@Pc(316) int local316;
				if (Static435.anInt7845 == 2) {
					if (Static485.anInt8420 == 13) {
						local274.method4220(Static624.aClass136_5.anInt4034);
					} else {
						local274.method4220(Static624.aClass136_3.anInt4034);
					}
					local274.method4201(0);
					local301 = local274.anInt4736;
					local274.method4265(630);
					local274.method4237(0, local184.aByteArray54, local184.anInt4736);
					local316 = local274.anInt4736;
					local274.method4241(Static336.aString67);
					local274.method4220(Static90.anInt2169);
					local274.method4220(Static634.method8682());
					local274.method4201(Static109.anInt2357);
					local274.method4201(Static330.anInt6165);
					local274.method4220(Static262.aClass3_Sub27_12.aClass21_Sub26_2.method8162());
					Static21.method970(local274);
					local274.method4241(Static330.aString66);
					local274.method4265(Static58.anInt1583);
					@Pc(359) Class3_Sub3 local359 = Static262.aClass3_Sub27_12.method3238();
					local274.method4220(local359.anInt4736);
					local274.method4237(0, local359.aByteArray54, local359.anInt4736);
					Static168.aBoolean272 = true;
					@Pc(381) Class3_Sub3 local381 = new Class3_Sub3(Static17.aClass3_Sub23_1.method3051());
					Static17.aClass3_Sub23_1.method3050(local381);
					local274.method4237(0, local381.aByteArray54, local381.aByteArray54.length);
					local274.method4201(Static591.anInt9687);
					local274.method4251(Static151.aLong77);
					local274.method4220(Static279.aString58 == null ? 0 : 1);
					if (Static279.aString58 != null) {
						local274.method4241(Static279.aString58);
					}
					local274.method4220(Static352.method5817("jagtheora") ? 1 : 0);
					Static520.method8070(local274);
					local274.method4200(local187, local274.anInt4736, local316);
					local274.method4208(local274.anInt4736 - local301);
				} else {
					local274.method4220(Static624.aClass136_6.anInt4034);
					local274.method4201(0);
					local301 = local274.anInt4736;
					local274.method4265(630);
					local274.method4237(0, local184.aByteArray54, local184.anInt4736);
					local316 = local274.anInt4736;
					local274.method4241(Static336.aString67);
					local274.method4220(Static212.aClass222_2.anInt6790);
					local274.method4220(Static325.anInt6083);
					Static21.method970(local274);
					local274.method4241(Static330.aString66);
					local274.method4265(Static58.anInt1583);
					Static520.method8070(local274);
					local274.method4200(local187, local274.anInt4736, local316);
					local274.method4208(local274.anInt4736 - local301);
				}
				Static562.method8096(local271);
				Static154.method2812();
				Static24.aClass233_1 = new Class233(local187);
				for (local301 = 0; local301 < 4; local301++) {
					local187[local301] += 50;
				}
				Static30.aClass3_Sub3_Sub2_1.method4271(local187);
				Static251.anInt4607 = 4;
			}
			if (Static251.anInt4607 == 4) {
				if (!Static413.aClass230_1.method6031(1)) {
					return;
				}
				Static413.aClass230_1.method6029(Static30.aClass3_Sub3_Sub2_1.aByteArray54, 1, 0);
				local161 = Static30.aClass3_Sub3_Sub2_1.aByteArray54[0] & 0xFF;
				if (local161 == 21) {
					Static251.anInt4607 = 7;
				} else if (local161 == 29) {
					Static251.anInt4607 = 13;
				} else if (local161 == 1) {
					Static251.anInt4607 = 5;
					Static329.method5383(local161);
					return;
				} else if (local161 == 2) {
					Static251.anInt4607 = 8;
				} else if (local161 == 15) {
					Static251.anInt4607 = 14;
					Static272.anInt4948 = -2;
				} else if (local161 == 23 && Static51.anInt1427 < 3) {
					Static251.anInt4607 = 1;
					Static51.anInt1427++;
					Static547.anInt1286 = 0;
					Static413.aClass230_1.method6028();
					Static413.aClass230_1 = null;
					return;
				} else {
					Static251.anInt4607 = 0;
					Static329.method5383(local161);
					Static413.aClass230_1.method6028();
					Static413.aClass230_1 = null;
					Static131.method2523();
					return;
				}
			}
			if (Static251.anInt4607 == 6) {
				Static422.method6617();
				local122 = Static91.method2068();
				@Pc(671) Class3_Sub3_Sub2 local671 = local122.aClass3_Sub3_Sub2_2;
				local671.method4274(Static24.aClass233_1);
				local671.method4270(Static624.aClass136_12.anInt4034);
				Static562.method8096(local122);
				Static154.method2812();
				Static251.anInt4607 = 4;
			} else if (Static251.anInt4607 == 7) {
				if (Static413.aClass230_1.method6031(1)) {
					Static413.aClass230_1.method6029(Static30.aClass3_Sub3_Sub2_1.aByteArray54, 1, 0);
					local161 = Static30.aClass3_Sub3_Sub2_1.aByteArray54[0] & 0xFF;
					Static251.anInt4607 = 0;
					Static416.anInt7573 = (local161 + 3) * 60;
					Static329.method5383(21);
					Static413.aClass230_1.method6028();
					Static413.aClass230_1 = null;
					Static131.method2523();
				}
			} else if (Static251.anInt4607 == 13) {
				if (Static413.aClass230_1.method6031(1)) {
					Static413.aClass230_1.method6029(Static30.aClass3_Sub3_Sub2_1.aByteArray54, 1, 0);
					Static36.anInt1187 = Static30.aClass3_Sub3_Sub2_1.aByteArray54[0] & 0xFF;
					Static251.anInt4607 = 0;
					Static329.method5383(29);
					Static413.aClass230_1.method6028();
					Static413.aClass230_1 = null;
					Static131.method2523();
				}
			} else if (Static251.anInt4607 != 8) {
				@Pc(810) Class3_Sub3_Sub2 local810;
				if (Static251.anInt4607 == 9) {
					local810 = Static30.aClass3_Sub3_Sub2_1;
					if (Static435.anInt7845 == 2) {
						if (!Static413.aClass230_1.method6031(Static515.anInt8907)) {
							return;
						}
						Static413.aClass230_1.method6029(local810.aByteArray54, Static515.anInt8907, 0);
						local810.anInt4736 = 0;
						Static302.anInt5364 = local810.method4225();
						Static2.anInt5 = local810.method4225();
						Static134.aBoolean181 = local810.method4225() == 1;
						Static12.aBoolean56 = local810.method4225() == 1;
						Static431.aBoolean546 = local810.method4225() == 1;
						Static512.aBoolean628 = local810.method4225() == 1;
						Static97.anInt2234 = local810.method4221();
						Static136.aBoolean182 = local810.method4225() == 1;
						Static382.anInt7176 = local810.method4247();
						Static475.aBoolean582 = local810.method4225() == 1;
						Static105.aClass302_1.method7470(Static475.aBoolean582);
						Static320.aClass53_2.method1767(Static475.aBoolean582);
						Static547.aClass177_2.method4475(Static475.aBoolean582);
					} else if (Static413.aClass230_1.method6031(Static515.anInt8907)) {
						Static413.aClass230_1.method6029(local810.aByteArray54, Static515.anInt8907, 0);
						local810.anInt4736 = 0;
						Static302.anInt5364 = local810.method4225();
						Static2.anInt5 = local810.method4225();
						Static134.aBoolean181 = local810.method4225() == 1;
						Static12.aBoolean56 = local810.method4225() == 1;
						Static431.aBoolean546 = local810.method4225() == 1;
						Static563.anInt9403 = local810.method4209();
						Static136.aBoolean182 = Static563.anInt9403 > 0;
						Static329.anInt6159 = local810.method4221();
						Static491.anInt8521 = local810.method4221();
						Static469.anInt8232 = local810.method4221();
						Static157.anInt3102 = local810.method4207();
						Static465.aClass304_5 = Static205.aClass138_2.method3586(Static157.anInt3102);
						Static637.anInt10168 = local810.method4225();
						Static597.anInt9778 = local810.method4221();
						Static223.anInt4250 = local810.method4221();
						Static557.aBoolean670 = local810.method4225() == 1;
						Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aString63 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aString64 = local810.method4215();
						Static585.anInt9590 = local810.method4225();
						Static363.anInt1643 = local810.method4207();
						Static148.aClass363_3 = new Class363();
						Static148.aClass363_3.anInt9891 = local810.method4221();
						if (Static148.aClass363_3.anInt9891 == 65535) {
							Static148.aClass363_3.anInt9891 = -1;
						}
						Static148.aClass363_3.aString109 = local810.method4215();
						if (Static2.aClass135_1 != Static42.aClass135_2) {
							Static148.aClass363_3.anInt9890 = Static148.aClass363_3.anInt9891 + 50000;
							Static148.aClass363_3.anInt9884 = Static148.aClass363_3.anInt9891 + 40000;
						}
						if (Static2.aClass135_1 != Static407.aClass135_14 && (Static4.aClass363_1.method8467(Static495.aClass363_5) || Static4.aClass363_1.method8467(Static181.aClass363_4))) {
							Static128.method2510();
						}
					} else {
						return;
					}
					if (Static134.aBoolean181 && !Static431.aBoolean546 || Static136.aBoolean182) {
						try {
							Static646.method3052(Static504.anApplet2, "zap");
						} catch (@Pc(1117) Throwable local1117) {
							if (Static595.aBoolean728) {
								try {
									Static504.anApplet2.getAppletContext().showDocument(new URL(Static504.anApplet2.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1131) Exception local1131) {
								}
							}
						}
					} else {
						try {
							Static646.method3052(Static504.anApplet2, "unzap");
						} catch (@Pc(1140) Throwable local1140) {
						}
					}
					if (Static42.aClass135_2 == Static2.aClass135_1) {
						try {
							Static646.method3052(Static504.anApplet2, "loggedin");
						} catch (@Pc(1151) Throwable local1151) {
						}
					}
					if (Static435.anInt7845 != 2) {
						Static251.anInt4607 = 0;
						Static329.method5383(2);
						Static203.method3501();
						Static256.method4279(7);
						Static61.aClass200_15 = null;
						return;
					}
					Static251.anInt4607 = 11;
				}
				if (Static251.anInt4607 == 11) {
					if (!Static413.aClass230_1.method6031(3)) {
						return;
					}
					Static413.aClass230_1.method6029(Static30.aClass3_Sub3_Sub2_1.aByteArray54, 3, 0);
					Static251.anInt4607 = 12;
				}
				if (Static251.anInt4607 == 12) {
					local810 = Static30.aClass3_Sub3_Sub2_1;
					local810.anInt4736 = 0;
					if (local810.method4267()) {
						if (!Static413.aClass230_1.method6031(1)) {
							return;
						}
						Static413.aClass230_1.method6029(local810.aByteArray54, 1, 3);
					}
					Static61.aClass200_15 = Static81.method5057()[local810.method4277()];
					Static272.anInt4948 = local810.method4221();
					Static251.anInt4607 = 10;
				}
				if (Static251.anInt4607 == 10) {
					if (Static413.aClass230_1.method6031(Static272.anInt4948)) {
						Static413.aClass230_1.method6029(Static30.aClass3_Sub3_Sub2_1.aByteArray54, Static272.anInt4948, 0);
						Static30.aClass3_Sub3_Sub2_1.anInt4736 = 0;
						local161 = Static272.anInt4948;
						Static251.anInt4607 = 0;
						Static329.method5383(2);
						Static524.method7251();
						Static297.method4711(Static30.aClass3_Sub3_Sub2_1);
						Static482.anInt8390 = -1;
						if (Static61.aClass200_15 == Static158.aClass200_34) {
							Static266.method4392();
						} else {
							Static443.method6906();
						}
						if (local161 != Static30.aClass3_Sub3_Sub2_1.anInt4736) {
							throw new RuntimeException("lswp pos:" + Static30.aClass3_Sub3_Sub2_1.anInt4736 + " psize:" + local161);
						}
						Static61.aClass200_15 = null;
					}
				} else if (Static251.anInt4607 == 14) {
					if (Static272.anInt4948 == -2) {
						if (!Static413.aClass230_1.method6031(2)) {
							return;
						}
						Static413.aClass230_1.method6029(Static30.aClass3_Sub3_Sub2_1.aByteArray54, 2, 0);
						Static30.aClass3_Sub3_Sub2_1.anInt4736 = 0;
						Static272.anInt4948 = Static30.aClass3_Sub3_Sub2_1.method4221();
					}
					if (Static413.aClass230_1.method6031(Static272.anInt4948)) {
						Static413.aClass230_1.method6029(Static30.aClass3_Sub3_Sub2_1.aByteArray54, Static272.anInt4948, 0);
						Static30.aClass3_Sub3_Sub2_1.anInt4736 = 0;
						Static251.anInt4607 = 0;
						local161 = Static272.anInt4948;
						Static329.method5383(15);
						Static356.method5858();
						Static297.method4711(Static30.aClass3_Sub3_Sub2_1);
						if (Static30.aClass3_Sub3_Sub2_1.anInt4736 != local161) {
							throw new RuntimeException("lswpr pos:" + Static30.aClass3_Sub3_Sub2_1.anInt4736 + " psize:" + local161);
						}
						Static61.aClass200_15 = null;
					}
				}
			} else if (Static413.aClass230_1.method6031(1)) {
				Static413.aClass230_1.method6029(Static30.aClass3_Sub3_Sub2_1.aByteArray54, 1, 0);
				Static251.anInt4607 = 9;
				Static515.anInt8907 = Static30.aClass3_Sub3_Sub2_1.aByteArray54[0] & 0xFF;
			}
		} catch (@Pc(1394) IOException local1394) {
			if (Static413.aClass230_1 != null) {
				Static413.aClass230_1.method6028();
				Static413.aClass230_1 = null;
			}
			if (Static51.anInt1427 >= 3) {
				Static251.anInt4607 = 0;
				Static329.method5383(-4);
				Static131.method2523();
			} else {
				if (Static435.anInt7845 == 2) {
					Static4.aClass363_1.method8469();
				} else {
					Static44.aClass363_2.method8469();
				}
				Static51.anInt1427++;
				Static251.anInt4607 = 1;
				Static547.anInt1286 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(BIII)I")
	public static int method6105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg2 & 0x3;
		if (local8 == 0) {
			return arg1;
		} else if (local8 == 1) {
			return arg0;
		} else if (local8 == 2) {
			return 4095 - arg1;
		} else {
			return 4095 - arg0;
		}
	}
}
