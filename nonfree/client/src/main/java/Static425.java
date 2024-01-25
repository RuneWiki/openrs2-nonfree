import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!vk", name = "F", descriptor = "Lclient!lq;")
	public static Class139 aClass139_5;

	@OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
	public static int anInt7000;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!rs;I)V")
	public static void method5429(@OriginalArg(0) Class16_Sub1_Sub5_Sub2 arg0) {
		for (@Pc(10) Class4_Sub8 local10 = (Class4_Sub8) Static143.aClass183_20.method4140(); local10 != null; local10 = (Class4_Sub8) Static143.aClass183_20.method4144()) {
			if (arg0 == local10.aClass16_Sub1_Sub5_Sub2_1) {
				if (local10.aClass4_Sub15_Sub3_2 != null) {
					Static360.aClass4_Sub15_Sub2_2.method2955(local10.aClass4_Sub15_Sub3_2);
					local10.aClass4_Sub15_Sub3_2 = null;
				}
				local10.method5684();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)V")
	public static void method5430() {
		if (Static238.anInt4506 == 0 || Static238.anInt4506 == 5) {
			return;
		}
		try {
			if (++Static64.anInt1366 > 2000) {
				if (Static125.aClass11_5 != null) {
					Static125.aClass11_5.method138();
					Static125.aClass11_5 = null;
				}
				if (Static212.anInt3932 >= 1) {
					Static238.anInt4506 = 0;
					Static296.anInt5302 = -5;
					return;
				}
				Static238.anInt4506 = 1;
				Static212.anInt3932++;
				if (Static313.anInt5436 == Static407.anInt6723) {
					Static407.anInt6723 = Static97.anInt1949;
				} else {
					Static407.anInt6723 = Static313.anInt5436;
				}
				Static64.anInt1366 = 0;
			}
			if (Static238.anInt4506 == 1) {
				Static36.aClass199_3 = Static206.aClass66_4.method1728(Static321.aString54, Static407.anInt6723);
				Static238.anInt4506 = 2;
			}
			@Pc(112) int local112;
			if (Static238.anInt4506 == 2) {
				if (Static36.aClass199_3.anInt5760 == 2) {
					throw new IOException();
				}
				if (Static36.aClass199_3.anInt5760 != 1) {
					return;
				}
				Static125.aClass11_5 = new Class11((Socket) Static36.aClass199_3.anObject29, Static206.aClass66_4);
				Static36.aClass199_3 = null;
				@Pc(102) long local102 = Static286.aLong174 = Static96.method1684(Static2.aString1);
				Static3.aClass4_Sub12_Sub1_5.anInt2997 = 0;
				local112 = (int) (local102 >> 16 & 0x1FL);
				Static3.aClass4_Sub12_Sub1_5.method2551(Static153.aClass60_1.anInt1812);
				Static3.aClass4_Sub12_Sub1_5.method2551(local112);
				Static125.aClass11_5.method142(2, Static3.aClass4_Sub12_Sub1_5.aByteArray36);
				Static329.method4427();
				@Pc(134) int local134 = Static125.aClass11_5.method139();
				Static329.method4427();
				if (local134 != 0) {
					Static238.anInt4506 = 0;
					Static296.anInt5302 = local134;
					Static125.aClass11_5.method138();
					Static125.aClass11_5 = null;
					return;
				}
				Static238.anInt4506 = 3;
			}
			if (Static238.anInt4506 == 3) {
				if (Static125.aClass11_5.method133() < 8) {
					return;
				}
				Static125.aClass11_5.method131(0, 8, Static146.aClass4_Sub12_Sub1_3.aByteArray36);
				Static146.aClass4_Sub12_Sub1_3.anInt2997 = 0;
				Static309.aLong183 = Static146.aClass4_Sub12_Sub1_3.method2501();
				@Pc(185) Class4_Sub12 local185 = new Class4_Sub12(70);
				@Pc(188) int[] local188 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static309.aLong183 >> 32), (int) Static309.aLong183 };
				local185.method2551(10);
				local185.method2531(local188[0]);
				local185.method2531(local188[1]);
				local185.method2531(local188[2]);
				local185.method2531(local188[3]);
				local185.method2504(Static96.method1684(Static2.aString1));
				local185.method2518(Static297.aString52);
				local185.method2522(Static85.aBigInteger1, Static309.aBigInteger2);
				Static3.aClass4_Sub12_Sub1_5.anInt2997 = 0;
				if (Static403.anInt6667 == 40) {
					Static3.aClass4_Sub12_Sub1_5.method2551(Static153.aClass60_5.anInt1812);
				} else {
					Static3.aClass4_Sub12_Sub1_5.method2551(Static153.aClass60_3.anInt1812);
				}
				Static3.aClass4_Sub12_Sub1_5.method2524(0);
				local112 = Static3.aClass4_Sub12_Sub1_5.anInt2997;
				Static3.aClass4_Sub12_Sub1_5.method2531(592);
				Static3.aClass4_Sub12_Sub1_5.method2551(Static161.anInt3177);
				Static3.aClass4_Sub12_Sub1_5.method2551(Static450.method5664());
				Static3.aClass4_Sub12_Sub1_5.method2524(Static141.anInt2881);
				Static3.aClass4_Sub12_Sub1_5.method2524(Static302.anInt5346);
				Static3.aClass4_Sub12_Sub1_5.method2551(Static323.aClass50_Sub1_1.anInt3440);
				Static82.method1471(Static3.aClass4_Sub12_Sub1_5);
				Static3.aClass4_Sub12_Sub1_5.method2518(Static34.aString13);
				Static3.aClass4_Sub12_Sub1_5.method2531(Static168.anInt3259);
				@Pc(323) Class4_Sub12 local323 = Static323.aClass50_Sub1_1.method2863();
				Static3.aClass4_Sub12_Sub1_5.method2551(local323.anInt2997);
				Static3.aClass4_Sub12_Sub1_5.method2519(local323.aByteArray36, local323.anInt2997);
				Static249.aBoolean425 = true;
				Static3.aClass4_Sub12_Sub1_5.method2524(Static183.anInt3512);
				Static3.aClass4_Sub12_Sub1_5.method2531(Static395.aClass76_92.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static324.aClass76_69.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static74.aClass76_20.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static256.aClass76_50.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static67.aClass76_19.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static49.aClass76_27.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static46.aClass76_54.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static357.aClass76_82.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static293.aClass76_60.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static196.aClass76_44.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static88.aClass76_23.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static284.aClass76_55.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static197.aClass76_45.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static209.aClass76_48.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static312.aClass76_66.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static350.aClass76_79.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static424.aClass76_99.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static208.aClass76_29.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static381.aClass76_87.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static391.aClass76_91.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static388.aClass76_90.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static55.aClass76_16.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static64.aClass76_17.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static163.aClass76_39.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static66.aClass76_70.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static154.aClass76_11.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static24.aClass76_61.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static417.aClass76_98.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static19.aClass76_2.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2531(Static366.aClass76_83.method2111());
				Static3.aClass4_Sub12_Sub1_5.method2519(local185.aByteArray36, local185.anInt2997);
				Static3.aClass4_Sub12_Sub1_5.method2547(Static3.aClass4_Sub12_Sub1_5.anInt2997 - local112);
				Static125.aClass11_5.method142(Static3.aClass4_Sub12_Sub1_5.anInt2997, Static3.aClass4_Sub12_Sub1_5.aByteArray36);
				Static3.aClass4_Sub12_Sub1_5.method1139(local188);
				for (@Pc(551) int local551 = 0; local551 < 4; local551++) {
					local188[local551] += 50;
				}
				Static146.aClass4_Sub12_Sub1_3.method1139(local188);
				Static238.anInt4506 = 4;
			}
			if (Static238.anInt4506 == 4) {
				if (Static125.aClass11_5.method133() < 1) {
					return;
				}
				@Pc(585) int local585 = Static125.aClass11_5.method139();
				if (local585 == 21) {
					Static238.anInt4506 = 7;
				} else if (local585 == 29) {
					Static238.anInt4506 = 11;
				} else if (local585 == 1) {
					Static238.anInt4506 = 5;
					Static296.anInt5302 = local585;
					return;
				} else if (local585 == 2) {
					Static238.anInt4506 = 8;
				} else if (local585 == 15) {
					Static454.anInt4075 = -2;
					Static238.anInt4506 = 12;
				} else if (local585 == 23 && Static212.anInt3932 < 1) {
					Static64.anInt1366 = 0;
					Static238.anInt4506 = 1;
					Static212.anInt3932++;
					Static125.aClass11_5.method138();
					Static125.aClass11_5 = null;
					return;
				} else {
					Static238.anInt4506 = 0;
					Static296.anInt5302 = local585;
					Static125.aClass11_5.method138();
					Static125.aClass11_5 = null;
					return;
				}
			}
			if (Static238.anInt4506 == 6) {
				Static3.aClass4_Sub12_Sub1_5.anInt2997 = 0;
				Static3.aClass4_Sub12_Sub1_5.method1133(Static153.aClass60_4.anInt1812);
				Static125.aClass11_5.method142(Static3.aClass4_Sub12_Sub1_5.anInt2997, Static3.aClass4_Sub12_Sub1_5.aByteArray36);
				Static238.anInt4506 = 4;
			} else if (Static238.anInt4506 == 7) {
				if (Static125.aClass11_5.method133() >= 1) {
					Static175.anInt3398 = (Static125.aClass11_5.method139() + 3) * 60;
					Static296.anInt5302 = 21;
					Static238.anInt4506 = 0;
					Static125.aClass11_5.method138();
					Static125.aClass11_5 = null;
				}
			} else if (Static238.anInt4506 != 11) {
				if (Static238.anInt4506 == 8) {
					if (Static125.aClass11_5.method133() < 13) {
						return;
					}
					Static125.aClass11_5.method131(0, 13, Static146.aClass4_Sub12_Sub1_3.aByteArray36);
					Static146.aClass4_Sub12_Sub1_3.anInt2997 = 0;
					Static104.anInt2252 = Static146.aClass4_Sub12_Sub1_3.method2490();
					Static123.anInt6262 = Static146.aClass4_Sub12_Sub1_3.method2490();
					Static109.aBoolean628 = Static146.aClass4_Sub12_Sub1_3.method2490() == 1;
					Static396.aBoolean443 = Static146.aClass4_Sub12_Sub1_3.method2490() == 1;
					Static436.aBoolean668 = Static146.aClass4_Sub12_Sub1_3.method2490() == 1;
					Static308.aBoolean486 = Static146.aClass4_Sub12_Sub1_3.method2490() == 1;
					Static207.anInt5452 = Static146.aClass4_Sub12_Sub1_3.method2536();
					Static246.aBoolean423 = Static146.aClass4_Sub12_Sub1_3.method2490() == 1;
					Static325.aBoolean506 = Static146.aClass4_Sub12_Sub1_3.method2490() == 1;
					Static267.aClass262_2.method5564(Static325.aBoolean506);
					Static444.aClass206_3.method4704(Static325.aBoolean506);
					Static329.aClass240_1.method5230(Static325.aBoolean506);
					if (Static109.aBoolean628 && !Static436.aBoolean668 || Static246.aBoolean423) {
						try {
							Static458.method2593(Static206.aClass66_4.anApplet1, "zap");
						} catch (@Pc(880) Throwable local880) {
							if (Static306.aBoolean484) {
								try {
									Static206.aClass66_4.anApplet1.getAppletContext().showDocument(new URL(Static206.aClass66_4.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(896) Exception local896) {
								}
							}
						}
					} else {
						try {
							Static458.method2593(Static206.aClass66_4.anApplet1, "unzap");
						} catch (@Pc(870) Throwable local870) {
						}
					}
					if (Static373.aClass219_6 == Static104.aClass219_2) {
						try {
							Static458.method2593(Static206.aClass66_4.anApplet1, "loggedin");
						} catch (@Pc(908) Throwable local908) {
						}
					}
					Static238.anInt4506 = 10;
				}
				if (Static238.anInt4506 == 10) {
					if (Static146.aClass4_Sub12_Sub1_3.method1141()) {
						if (Static125.aClass11_5.method133() < 1) {
							return;
						}
						Static125.aClass11_5.method131(Static146.aClass4_Sub12_Sub1_3.anInt2997 + 2, 1, Static146.aClass4_Sub12_Sub1_3.aByteArray36);
					}
					Static300.aClass22_246 = Static149.method2553()[Static146.aClass4_Sub12_Sub1_3.method1140()];
					Static454.anInt4075 = Static146.aClass4_Sub12_Sub1_3.method2536();
					Static238.anInt4506 = 9;
				}
				@Pc(970) int local970;
				if (Static238.anInt4506 == 9) {
					if (Static125.aClass11_5.method133() >= Static454.anInt4075) {
						Static125.aClass11_5.method131(0, Static454.anInt4075, Static146.aClass4_Sub12_Sub1_3.aByteArray36);
						Static146.aClass4_Sub12_Sub1_3.anInt2997 = 0;
						local970 = Static454.anInt4075;
						Static238.anInt4506 = 0;
						Static296.anInt5302 = 2;
						Static167.method2736();
						Static391.method5117(Static146.aClass4_Sub12_Sub1_3);
						Static169.anInt3265 = -1;
						Static230.method3470();
						if (local970 != Static146.aClass4_Sub12_Sub1_3.anInt2997) {
							throw new RuntimeException("lswp pos:" + Static146.aClass4_Sub12_Sub1_3.anInt2997 + " psize:" + local970);
						}
						Static300.aClass22_246 = null;
					}
				} else if (Static238.anInt4506 == 12) {
					if (Static454.anInt4075 == -2) {
						if (Static125.aClass11_5.method133() < 2) {
							return;
						}
						Static125.aClass11_5.method131(0, 2, Static146.aClass4_Sub12_Sub1_3.aByteArray36);
						Static146.aClass4_Sub12_Sub1_3.anInt2997 = 0;
						Static454.anInt4075 = Static146.aClass4_Sub12_Sub1_3.method2536();
					}
					if (Static125.aClass11_5.method133() >= Static454.anInt4075) {
						Static125.aClass11_5.method131(0, Static454.anInt4075, Static146.aClass4_Sub12_Sub1_3.aByteArray36);
						Static146.aClass4_Sub12_Sub1_3.anInt2997 = 0;
						local970 = Static454.anInt4075;
						Static238.anInt4506 = 0;
						Static296.anInt5302 = 15;
						Static297.method4069();
						Static391.method5117(Static146.aClass4_Sub12_Sub1_3);
						if (local970 != Static146.aClass4_Sub12_Sub1_3.anInt2997) {
							throw new RuntimeException("lswpr pos:" + Static146.aClass4_Sub12_Sub1_3.anInt2997 + " psize:" + local970);
						}
						Static300.aClass22_246 = null;
					}
				}
			} else if (Static125.aClass11_5.method133() >= 1) {
				Static299.anInt5328 = Static125.aClass11_5.method139();
				Static238.anInt4506 = 0;
				Static296.anInt5302 = 29;
				Static125.aClass11_5.method138();
				Static125.aClass11_5 = null;
			}
		} catch (@Pc(1095) IOException local1095) {
			if (Static125.aClass11_5 != null) {
				Static125.aClass11_5.method138();
				Static125.aClass11_5 = null;
			}
			if (Static212.anInt3932 >= 1) {
				Static296.anInt5302 = -4;
				Static238.anInt4506 = 0;
			} else {
				if (Static313.anInt5436 == Static407.anInt6723) {
					Static407.anInt6723 = Static97.anInt1949;
				} else {
					Static407.anInt6723 = Static313.anInt5436;
				}
				Static238.anInt4506 = 1;
				Static212.anInt3932++;
				Static64.anInt1366 = 0;
			}
		}
	}
}
