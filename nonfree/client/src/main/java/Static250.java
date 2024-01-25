import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!mm", name = "U", descriptor = "Z")
	public static boolean aBoolean294 = false;

	@OriginalMember(owner = "client!mm", name = "W", descriptor = "Z")
	public static boolean aBoolean295 = false;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "(III)V")
	public static void method3879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class101 local7 = Static409.aClass101ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null && local7.aClass3_Sub5_1 != null) {
			local7.aClass3_Sub5_1 = null;
		}
	}

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)V")
	public static void method3880() {
		if (Static149.anInt3065 == 0 || Static149.anInt3065 == 5) {
			return;
		}
		try {
			if (++Static311.anInt5426 > 2000) {
				if (Static177.aClass73_6 != null) {
					Static177.aClass73_6.method1875();
					Static177.aClass73_6 = null;
				}
				if (Static65.anInt2233 >= 1) {
					Static149.anInt3065 = 0;
					Static107.anInt2300 = -5;
					return;
				}
				if (Static154.anInt3148 == Static263.anInt4756) {
					Static154.anInt3148 = Static124.anInt2566;
				} else {
					Static154.anInt3148 = Static263.anInt4756;
				}
				Static65.anInt2233++;
				Static149.anInt3065 = 1;
				Static311.anInt5426 = 0;
			}
			if (Static149.anInt3065 == 1) {
				Static294.aClass122_6 = Static45.aClass209_127.method4688(Static154.anInt3148, Static207.aString29);
				Static149.anInt3065 = 2;
			}
			@Pc(120) int local120;
			if (Static149.anInt3065 == 2) {
				if (Static294.aClass122_6.anInt3557 == 2) {
					throw new IOException();
				}
				if (Static294.aClass122_6.anInt3557 != 1) {
					return;
				}
				Static177.aClass73_6 = new Class73((Socket) Static294.aClass122_6.anObject7, Static45.aClass209_127);
				Static294.aClass122_6 = null;
				@Pc(110) long local110 = Static403.aLong204 = Static362.method5353(Static383.aString57);
				Static109.aClass6_Sub1_Sub1_5.anInt7898 = 0;
				local120 = (int) (local110 >> 16 & 0x1FL);
				Static109.aClass6_Sub1_Sub1_5.method6439(Static356.aClass223_1.anInt6416);
				Static109.aClass6_Sub1_Sub1_5.method6439(local120);
				Static177.aClass73_6.method1873(2, Static109.aClass6_Sub1_Sub1_5.aByteArray96);
				Static141.method1127();
				@Pc(144) int local144 = Static177.aClass73_6.method1874();
				Static141.method1127();
				if (local144 != 0) {
					Static107.anInt2300 = local144;
					Static149.anInt3065 = 0;
					Static177.aClass73_6.method1875();
					Static177.aClass73_6 = null;
					return;
				}
				Static149.anInt3065 = 3;
			}
			if (Static149.anInt3065 == 3) {
				if (Static177.aClass73_6.method1872() < 8) {
					return;
				}
				Static177.aClass73_6.method1877(8, Static232.aClass6_Sub1_Sub1_4.aByteArray96, 0);
				Static232.aClass6_Sub1_Sub1_4.anInt7898 = 0;
				Static206.aLong115 = Static232.aClass6_Sub1_Sub1_4.method6467();
				@Pc(192) Class6_Sub1 local192 = new Class6_Sub1(70);
				@Pc(195) int[] local195 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static206.aLong115 >> 32), (int) Static206.aLong115 };
				local192.method6439(10);
				local192.method6461(local195[0]);
				local192.method6461(local195[1]);
				local192.method6461(local195[2]);
				local192.method6461(local195[3]);
				local192.method6475(Static362.method5353(Static383.aString57));
				local192.method6448(Static392.aString35);
				local192.method6432(Static370.aBigInteger2, Static292.aBigInteger1);
				Static109.aClass6_Sub1_Sub1_5.anInt7898 = 0;
				if (Static217.anInt3941 == 40) {
					Static109.aClass6_Sub1_Sub1_5.method6439(Static356.aClass223_5.anInt6416);
				} else {
					Static109.aClass6_Sub1_Sub1_5.method6439(Static356.aClass223_3.anInt6416);
				}
				Static109.aClass6_Sub1_Sub1_5.method6453(0);
				local120 = Static109.aClass6_Sub1_Sub1_5.anInt7898;
				Static109.aClass6_Sub1_Sub1_5.method6461(582);
				Static109.aClass6_Sub1_Sub1_5.method6439(Static436.anInt7722);
				Static109.aClass6_Sub1_Sub1_5.method6439(Static374.method5599());
				Static109.aClass6_Sub1_Sub1_5.method6453(Static348.anInt6272);
				Static109.aClass6_Sub1_Sub1_5.method6453(Static199.anInt3767);
				Static109.aClass6_Sub1_Sub1_5.method6439(Static291.aClass28_Sub1_1.anInt1038);
				Static19.method500(Static109.aClass6_Sub1_Sub1_5);
				Static109.aClass6_Sub1_Sub1_5.method6448(Static65.aString14);
				Static109.aClass6_Sub1_Sub1_5.method6461(Static128.anInt2737);
				@Pc(340) Class6_Sub1 local340 = Static291.aClass28_Sub1_1.method833();
				Static109.aClass6_Sub1_Sub1_5.method6439(local340.anInt7898);
				Static109.aClass6_Sub1_Sub1_5.method6440(local340.aByteArray96, local340.anInt7898);
				Static38.aBoolean93 = true;
				Static109.aClass6_Sub1_Sub1_5.method6453(Static206.anInt3849);
				Static109.aClass6_Sub1_Sub1_5.method6461(Static214.aClass100_41.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static243.aClass100_47.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static22.aClass100_4.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static137.aClass100_23.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static298.aClass100_55.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static332.aClass100_63.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static263.aClass100_51.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static335.aClass100_66.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static350.aClass100_69.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static71.aClass100_11.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static300.aClass100_56.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static208.aClass100_39.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static321.aClass100_60.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static410.aClass100_89.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static101.aClass100_13.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static212.aClass100_40.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static289.aClass100_53.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static31.aClass100_6.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static226.aClass100_61.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static387.aClass100_85.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static340.aClass100_68.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static75.aClass100_12.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static119.aClass100_84.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static173.aClass100_34.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static328.aClass100_62.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static441.aClass100_94.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static110.aClass100_88.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static248.aClass100_91.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static378.aClass100_81.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6461(Static44.aClass100_9.method2517());
				Static109.aClass6_Sub1_Sub1_5.method6440(local192.aByteArray96, local192.anInt7898);
				Static109.aClass6_Sub1_Sub1_5.method6443(Static109.aClass6_Sub1_Sub1_5.anInt7898 - local120);
				Static177.aClass73_6.method1873(Static109.aClass6_Sub1_Sub1_5.anInt7898, Static109.aClass6_Sub1_Sub1_5.aByteArray96);
				Static109.aClass6_Sub1_Sub1_5.method3795(local195);
				for (@Pc(599) int local599 = 0; local599 < 4; local599++) {
					local195[local599] += 50;
				}
				Static232.aClass6_Sub1_Sub1_4.method3795(local195);
				Static149.anInt3065 = 4;
			}
			@Pc(635) int local635;
			if (Static149.anInt3065 == 4) {
				if (Static177.aClass73_6.method1872() < 1) {
					return;
				}
				local635 = Static177.aClass73_6.method1874();
				if (local635 == 21) {
					Static149.anInt3065 = 7;
				} else if (local635 == 29) {
					Static149.anInt3065 = 11;
				} else if (local635 == 1) {
					Static149.anInt3065 = 5;
					Static107.anInt2300 = local635;
					return;
				} else if (local635 == 2) {
					Static149.anInt3065 = 8;
				} else if (local635 == 15) {
					Static149.anInt3065 = 12;
					Static334.anInt5833 = -2;
				} else if (local635 == 23 && Static65.anInt2233 < 1) {
					Static311.anInt5426 = 0;
					Static65.anInt2233++;
					Static149.anInt3065 = 1;
					Static177.aClass73_6.method1875();
					Static177.aClass73_6 = null;
					return;
				} else {
					Static107.anInt2300 = local635;
					Static149.anInt3065 = 0;
					Static177.aClass73_6.method1875();
					Static177.aClass73_6 = null;
					return;
				}
			}
			if (Static149.anInt3065 == 6) {
				Static109.aClass6_Sub1_Sub1_5.anInt7898 = 0;
				Static109.aClass6_Sub1_Sub1_5.method3804(Static356.aClass223_4.anInt6416);
				Static177.aClass73_6.method1873(Static109.aClass6_Sub1_Sub1_5.anInt7898, Static109.aClass6_Sub1_Sub1_5.aByteArray96);
				Static149.anInt3065 = 4;
			} else if (Static149.anInt3065 == 7) {
				if (Static177.aClass73_6.method1872() >= 1) {
					Static164.anInt3282 = (Static177.aClass73_6.method1874() + 3) * 60;
					Static107.anInt2300 = 21;
					Static149.anInt3065 = 0;
					Static177.aClass73_6.method1875();
					Static177.aClass73_6 = null;
				}
			} else if (Static149.anInt3065 != 11) {
				if (Static149.anInt3065 == 8) {
					if (Static177.aClass73_6.method1872() < 13) {
						return;
					}
					Static177.aClass73_6.method1877(13, Static232.aClass6_Sub1_Sub1_4.aByteArray96, 0);
					Static232.aClass6_Sub1_Sub1_4.anInt7898 = 0;
					Static291.anInt5199 = Static232.aClass6_Sub1_Sub1_4.method6433();
					Static384.anInt6849 = Static232.aClass6_Sub1_Sub1_4.method6433();
					Static18.aBoolean26 = Static232.aClass6_Sub1_Sub1_4.method6433() == 1;
					Static225.aBoolean270 = Static232.aClass6_Sub1_Sub1_4.method6433() == 1;
					Static451.aBoolean496 = Static232.aClass6_Sub1_Sub1_4.method6433() == 1;
					Static421.aBoolean475 = Static232.aClass6_Sub1_Sub1_4.method6433() == 1;
					Static4.anInt7923 = Static232.aClass6_Sub1_Sub1_4.method6485();
					Static130.aBoolean183 = Static232.aClass6_Sub1_Sub1_4.method6433() == 1;
					Static48.aBoolean101 = Static232.aClass6_Sub1_Sub1_4.method6433() == 1;
					Static448.aClass104_4.method2617(Static48.aBoolean101);
					Static380.aClass231_2.method5640(Static48.aBoolean101);
					Static235.aClass263_2.method6415(Static48.aBoolean101);
					if (Static18.aBoolean26 && !Static451.aBoolean496 || Static130.aBoolean183) {
						try {
							Static456.method3806("zap", Static45.aClass209_127.anApplet1);
						} catch (@Pc(927) Throwable local927) {
							if (Static287.aBoolean318) {
								try {
									Static45.aClass209_127.anApplet1.getAppletContext().showDocument(new URL(Static45.aClass209_127.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(943) Exception local943) {
								}
							}
						}
					} else {
						try {
							Static456.method3806("unzap", Static45.aClass209_127.anApplet1);
						} catch (@Pc(917) Throwable local917) {
						}
					}
					if (Static136.aClass193_3 == Static170.aClass193_5) {
						try {
							Static456.method3806("loggedin", Static45.aClass209_127.anApplet1);
						} catch (@Pc(955) Throwable local955) {
						}
					}
					Static149.anInt3065 = 10;
				}
				if (Static149.anInt3065 == 10) {
					if (Static232.aClass6_Sub1_Sub1_4.method3793()) {
						if (Static177.aClass73_6.method1872() < 1) {
							return;
						}
						Static177.aClass73_6.method1877(1, Static232.aClass6_Sub1_Sub1_4.aByteArray96, Static232.aClass6_Sub1_Sub1_4.anInt7898 + 2);
					}
					Static73.aClass123_88 = Static368.method4873()[Static232.aClass6_Sub1_Sub1_4.method3796()];
					Static334.anInt5833 = Static232.aClass6_Sub1_Sub1_4.method6485();
					Static149.anInt3065 = 9;
				}
				if (Static149.anInt3065 == 9) {
					if (Static177.aClass73_6.method1872() >= Static334.anInt5833) {
						Static177.aClass73_6.method1877(Static334.anInt5833, Static232.aClass6_Sub1_Sub1_4.aByteArray96, 0);
						Static232.aClass6_Sub1_Sub1_4.anInt7898 = 0;
						local635 = Static334.anInt5833;
						Static107.anInt2300 = 2;
						Static149.anInt3065 = 0;
						Static193.method3052();
						Static206.method3168(Static232.aClass6_Sub1_Sub1_4);
						Static96.anInt5953 = -1;
						Static63.method1343();
						if (local635 != Static232.aClass6_Sub1_Sub1_4.anInt7898) {
							throw new RuntimeException("lswp pos:" + Static232.aClass6_Sub1_Sub1_4.anInt7898 + " psize:" + local635);
						}
						Static73.aClass123_88 = null;
					}
				} else if (Static149.anInt3065 == 12) {
					if (Static334.anInt5833 == -2) {
						if (Static177.aClass73_6.method1872() < 2) {
							return;
						}
						Static177.aClass73_6.method1877(2, Static232.aClass6_Sub1_Sub1_4.aByteArray96, 0);
						Static232.aClass6_Sub1_Sub1_4.anInt7898 = 0;
						Static334.anInt5833 = Static232.aClass6_Sub1_Sub1_4.method6485();
					}
					if (Static177.aClass73_6.method1872() >= Static334.anInt5833) {
						Static177.aClass73_6.method1877(Static334.anInt5833, Static232.aClass6_Sub1_Sub1_4.aByteArray96, 0);
						Static232.aClass6_Sub1_Sub1_4.anInt7898 = 0;
						local635 = Static334.anInt5833;
						Static107.anInt2300 = 15;
						Static149.anInt3065 = 0;
						Static174.method2883();
						Static206.method3168(Static232.aClass6_Sub1_Sub1_4);
						if (local635 != Static232.aClass6_Sub1_Sub1_4.anInt7898) {
							throw new RuntimeException("lswpr pos:" + Static232.aClass6_Sub1_Sub1_4.anInt7898 + " psize:" + local635);
						}
						Static73.aClass123_88 = null;
					}
				}
			} else if (Static177.aClass73_6.method1872() >= 1) {
				Static317.anInt2331 = Static177.aClass73_6.method1874();
				Static107.anInt2300 = 29;
				Static149.anInt3065 = 0;
				Static177.aClass73_6.method1875();
				Static177.aClass73_6 = null;
			}
		} catch (@Pc(1144) IOException local1144) {
			if (Static177.aClass73_6 != null) {
				Static177.aClass73_6.method1875();
				Static177.aClass73_6 = null;
			}
			if (Static65.anInt2233 >= 1) {
				Static149.anInt3065 = 0;
				Static107.anInt2300 = -4;
			} else {
				Static65.anInt2233++;
				Static149.anInt3065 = 1;
				if (Static154.anInt3148 == Static263.anInt4756) {
					Static154.anInt3148 = Static124.anInt2566;
				} else {
					Static154.anInt3148 = Static263.anInt4756;
				}
				Static311.anInt5426 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!eq;)V")
	public static void method3881(@OriginalArg(1) Class66 arg0) {
		@Pc(7) int local7 = Static187.anInt3647;
		@Pc(9) int local9 = Static200.anInt3772;
		@Pc(11) int local11 = Static382.anInt4224;
		@Pc(13) int local13 = Static230.anInt4199;
		arg0.method5035(local11, local9, -10660793, local7, local13);
		arg0.method5035(local11 - 2, local9 - -1, -16777216, local7 + 1, 16);
		arg0.method5040(-16777216, local11 - 2, local9 + 18, local7 + 1, local13 + -19);
		Static236.aClass29_2.method4804(-10660793, -1, local7 + 3, local9 + 14, Static214.aClass267_55.method6581(Static161.anInt3239));
		@Pc(72) int local72 = Static186.aClass50_1.method1436();
		@Pc(83) int local83 = Static186.aClass50_1.method1446();
		@Pc(85) int local85 = 0;
		for (@Pc(90) Class6_Sub40 local90 = (Class6_Sub40) Static292.aClass244_25.method5976(); local90 != null; local90 = (Class6_Sub40) Static292.aClass244_25.method5964()) {
			@Pc(106) int local106 = local9 + (Static151.anInt3129 - local85 - 1) * 16 + 31;
			@Pc(108) short local108 = -1;
			if (local72 > local7 && local7 + local11 > local72 && local106 - 13 < local83 && local83 < local106 + 3 && local90.aBoolean428) {
				local108 = -256;
			}
			@Pc(145) int[] local145 = null;
			if (Static49.method1093(local90.anInt6722)) {
				local145 = Static380.aClass231_2.method5648((int) local90.aLong192).anIntArray8;
			} else if (local90.anInt6721 != -1) {
				local145 = Static380.aClass231_2.method5648(local90.anInt6721).anIntArray8;
			} else if (Static428.method6233(local90.anInt6722)) {
				@Pc(175) Class3_Sub2_Sub1_Sub1 local175 = Static308.aClass3_Sub2_Sub1_Sub1Array1[(int) local90.aLong192];
				if (local175 != null) {
					@Pc(180) Class48 local180 = local175.aClass48_1;
					if (local180.anIntArray103 != null) {
						local180 = local180.method1378(Static393.aClass207_1);
					}
					if (local180 != null) {
						local145 = local180.anIntArray104;
					}
				}
			} else if (Static86.method822(local90.anInt6722)) {
				@Pc(214) Class106 local214;
				if (local90.anInt6722 == 1002) {
					local214 = Static448.aClass104_4.method2616((int) local90.aLong192);
				} else {
					local214 = Static448.aClass104_4.method2616((int) (local90.aLong192 >>> 32 & 0x7FFFFFFFL));
				}
				if (local214.anIntArray188 != null) {
					local214 = local214.method2625(Static393.aClass207_1);
				}
				if (local214 != null) {
					local145 = local214.anIntArray191;
				}
			}
			@Pc(251) String local251 = Static105.method1871(local90);
			if (local145 != null) {
				local251 = local251 + Static221.method3327(local145);
			}
			Static236.aClass29_2.method4805(local108, local251, local7 + 3, local106, Static58.aClass87Array8, Static108.anIntArray138);
			local85++;
			if (local90.aBoolean429) {
				Static172.aClass87_11.method6567(local7 + Static237.aClass166_8.method3892(local251) + 5, local106 + -12);
			}
		}
		Static407.method6009(Static200.anInt3772, Static187.anInt3647, Static382.anInt4224, Static230.anInt4199);
	}
}
