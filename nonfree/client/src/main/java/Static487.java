import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
	public static int anInt7837 = 0;

	@OriginalMember(owner = "client!rb", name = "ab", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_184 = new Class200(108, 4);

	@OriginalMember(owner = "client!rb", name = "hb", descriptor = "[I")
	public static final int[] anIntArray558 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!rb", name = "mb", descriptor = "[I")
	public static final int[] anIntArray559 = new int[5];

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)V")
	public static void method6854(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub7_Sub2 local14 = Static188.method3210(2, arg0);
		local14.method923();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBI)Z")
	public static boolean method6855(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "(I)V")
	public static void method6857() {
		if (Static360.anInt6253 == 0 || Static360.anInt6253 == 5) {
			return;
		}
		try {
			@Pc(18) short local18;
			if (Static467.anInt10427 == 0) {
				local18 = 250;
			} else {
				local18 = 2000;
			}
			if (local18 < ++Static140.anInt2975) {
				if (Static341.aClass22_4 != null) {
					Static341.aClass22_4.method7460();
					Static341.aClass22_4 = null;
				}
				if (Static467.anInt10427 >= 3) {
					Static360.anInt6253 = 0;
					Static520.method7232(-5);
					return;
				}
				if (Static639.anInt10307 == 2) {
					Static262.aClass155_9.method3615();
				} else {
					Static381.aClass155_15.method3615();
				}
				Static140.anInt2975 = 0;
				Static360.anInt6253 = 1;
				Static467.anInt10427++;
			}
			if (Static360.anInt6253 == 1) {
				if (Static639.anInt10307 == 2) {
					Static175.aClass319_2 = Static262.aClass155_9.method3617(Static265.aClass286_3);
				} else {
					Static175.aClass319_2 = Static381.aClass155_15.method3617(Static265.aClass286_3);
				}
				Static360.anInt6253 = 2;
			}
			@Pc(137) Class2_Sub31 local137;
			if (Static360.anInt6253 == 2) {
				if (Static175.aClass319_2.anInt8562 == 2) {
					throw new IOException();
				}
				if (Static175.aClass319_2.anInt8562 != 1) {
					return;
				}
				Static341.aClass22_4 = Static393.method5805((Socket) Static175.aClass319_2.anObject19);
				Static175.aClass319_2 = null;
				Static210.method8324();
				local137 = Static51.method726();
				local137.aClass2_Sub17_Sub1_2.method2837(Static150.aClass34_1.anInt808);
				Static526.method7309(local137);
				Static255.method4268();
				Static360.anInt6253 = 3;
			}
			@Pc(178) int local178;
			if (Static360.anInt6253 == 3) {
				if (!Static341.aClass22_4.method7464(1)) {
					return;
				}
				Static341.aClass22_4.method7461(1, Static327.aClass2_Sub17_Sub1_1.aByteArray26, 0);
				local178 = Static327.aClass2_Sub17_Sub1_1.aByteArray26[0] & 0xFF;
				if (local178 != 0) {
					Static360.anInt6253 = 0;
					Static520.method7232(local178);
					Static341.aClass22_4.method7460();
					Static341.aClass22_4 = null;
					Static262.method4325();
					return;
				}
				Static327.aClass2_Sub17_Sub1_1.anInt3378 = 0;
				@Pc(206) Class2_Sub17 local206 = new Class2_Sub17(518);
				@Pc(209) int[] local209 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				local206.method2837(10);
				local206.method2827(local209[0]);
				local206.method2827(local209[1]);
				local206.method2827(local209[2]);
				local206.method2827(local209[3]);
				local206.method2845(0L);
				local206.method2856(Static272.aString43);
				local206.method2845(Static593.aLong250);
				local206.method2845(Static114.aLong68);
				local206.method2858(Static43.aBigInteger1, Static154.aBigInteger4);
				Static210.method8324();
				@Pc(293) Class2_Sub31 local293 = Static51.method726();
				@Pc(296) Class2_Sub17_Sub1 local296 = local293.aClass2_Sub17_Sub1_2;
				@Pc(325) int local325;
				@Pc(342) int local342;
				if (Static639.anInt10307 == 2) {
					if (Static454.anInt7416 == 13) {
						local296.method2837(Static150.aClass34_5.anInt808);
					} else {
						local296.method2837(Static150.aClass34_3.anInt808);
					}
					local296.method2879(0);
					local325 = local296.anInt3378;
					local296.method2827(638);
					local296.method2873(0, local206.aByteArray26, local206.anInt3378);
					local342 = local296.anInt3378;
					local296.method2856(Static55.aString12);
					local296.method2837(Static297.anInt5356);
					local296.method2837(Static402.method6006());
					local296.method2879(Class16_Sub1_Sub5_Sub1.lb);
					local296.method2879(Static71.anInt1925);
					local296.method2837(Static305.aClass2_Sub49_15.aClass33_Sub7_2.method2924());
					Static27.method628(local296);
					local296.method2856(Static112.aString22);
					local296.method2827(Static65.anInt1744);
					@Pc(391) Class2_Sub17 local391 = Static305.aClass2_Sub49_15.method8842();
					local296.method2837(local391.anInt3378);
					local296.method2873(0, local391.aByteArray26, local391.anInt3378);
					Static406.aBoolean496 = true;
					@Pc(417) Class2_Sub17 local417 = new Class2_Sub17(Static153.aClass2_Sub42_1.method7907());
					Static153.aClass2_Sub42_1.method7906(local417);
					local296.method2873(0, local417.aByteArray26, local417.aByteArray26.length);
					local296.method2879(Static406.anInt6903);
					local296.method2845(Static272.aLong122);
					local296.method2837(Static2.aString1 == null ? 0 : 1);
					if (Static2.aString1 != null) {
						local296.method2856(Static2.aString1);
					}
					local296.method2837(Static642.method8834("jagtheora") ? 1 : 0);
					Static144.method2590(local296);
					local296.method2874(local209, local342, local296.anInt3378);
					local296.method2861(local296.anInt3378 - local325);
				} else {
					local296.method2837(Static150.aClass34_6.anInt808);
					local296.method2879(0);
					local325 = local296.anInt3378;
					local296.method2827(638);
					local296.method2873(0, local206.aByteArray26, local206.anInt3378);
					local342 = local296.anInt3378;
					local296.method2856(Static55.aString12);
					local296.method2837(Static51.aClass17_2.anInt420);
					local296.method2837(Static496.anInt7407);
					Static27.method628(local296);
					local296.method2856(Static112.aString22);
					local296.method2827(Static65.anInt1744);
					Static144.method2590(local296);
					local296.method2874(local209, local342, local296.anInt3378);
					local296.method2861(local296.anInt3378 - local325);
				}
				Static526.method7309(local293);
				Static255.method4268();
				Static640.aClass314_2 = new Class314(local209);
				for (local325 = 0; local325 < 4; local325++) {
					local209[local325] += 50;
				}
				Static327.aClass2_Sub17_Sub1_1.method2457(local209);
				Static360.anInt6253 = 4;
			}
			if (Static360.anInt6253 == 4) {
				if (!Static341.aClass22_4.method7464(1)) {
					return;
				}
				Static341.aClass22_4.method7461(1, Static327.aClass2_Sub17_Sub1_1.aByteArray26, 0);
				local178 = Static327.aClass2_Sub17_Sub1_1.aByteArray26[0] & 0xFF;
				if (local178 == 21) {
					Static360.anInt6253 = 7;
				} else if (local178 == 29) {
					Static360.anInt6253 = 13;
				} else if (local178 == 1) {
					Static360.anInt6253 = 5;
					Static520.method7232(local178);
					return;
				} else if (local178 == 2) {
					Static360.anInt6253 = 8;
				} else if (local178 == 15) {
					Static245.anInt4755 = -2;
					Static360.anInt6253 = 14;
				} else if (local178 == 23 && Static467.anInt10427 < 3) {
					Static467.anInt10427++;
					Static360.anInt6253 = 1;
					Static140.anInt2975 = 0;
					Static341.aClass22_4.method7460();
					Static341.aClass22_4 = null;
					return;
				} else {
					Static360.anInt6253 = 0;
					Static520.method7232(local178);
					Static341.aClass22_4.method7460();
					Static341.aClass22_4 = null;
					Static262.method4325();
					return;
				}
			}
			if (Static360.anInt6253 == 6) {
				Static210.method8324();
				local137 = Static51.method726();
				@Pc(703) Class2_Sub17_Sub1 local703 = local137.aClass2_Sub17_Sub1_2;
				local703.method2452(Static640.aClass314_2);
				local703.method2454(Static150.aClass34_10.anInt808);
				Static526.method7309(local137);
				Static255.method4268();
				Static360.anInt6253 = 4;
			} else if (Static360.anInt6253 == 7) {
				if (Static341.aClass22_4.method7464(1)) {
					Static341.aClass22_4.method7461(1, Static327.aClass2_Sub17_Sub1_1.aByteArray26, 0);
					local178 = Static327.aClass2_Sub17_Sub1_1.aByteArray26[0] & 0xFF;
					Static279.anInt5112 = local178 * 60 + 180;
					Static360.anInt6253 = 0;
					Static520.method7232(21);
					Static341.aClass22_4.method7460();
					Static341.aClass22_4 = null;
					Static262.method4325();
				}
			} else if (Static360.anInt6253 == 13) {
				if (Static341.aClass22_4.method7464(1)) {
					Static341.aClass22_4.method7461(1, Static327.aClass2_Sub17_Sub1_1.aByteArray26, 0);
					Static110.anInt2384 = Static327.aClass2_Sub17_Sub1_1.aByteArray26[0] & 0xFF;
					Static360.anInt6253 = 0;
					Static520.method7232(29);
					Static341.aClass22_4.method7460();
					Static341.aClass22_4 = null;
					Static262.method4325();
				}
			} else if (Static360.anInt6253 != 8) {
				@Pc(840) Class2_Sub17_Sub1 local840;
				if (Static360.anInt6253 == 9) {
					local840 = Static327.aClass2_Sub17_Sub1_1;
					if (Static639.anInt10307 == 2) {
						if (!Static341.aClass22_4.method7464(Static247.anInt4761)) {
							return;
						}
						Static341.aClass22_4.method7461(Static247.anInt4761, local840.aByteArray26, 0);
						local840.anInt3378 = 0;
						Static463.anInt7496 = local840.method2859();
						Static316.anInt5591 = local840.method2859();
						Static279.aBoolean378 = local840.method2859() == 1;
						Static318.aBoolean410 = local840.method2859() == 1;
						Static194.aBoolean290 = local840.method2859() == 1;
						Static539.aBoolean620 = local840.method2859() == 1;
						Static608.anInt10056 = local840.method2825();
						Static9.aBoolean20 = local840.method2859() == 1;
						Static378.anInt8485 = local840.method2841();
						Static158.aBoolean257 = local840.method2859() == 1;
						Static79.aClass304_2.method6954(Static158.aBoolean257);
						Static470.aClass250_1.method5961(Static158.aBoolean257);
						Static137.aClass366_1.method8554(Static158.aBoolean257);
					} else if (Static341.aClass22_4.method7464(Static247.anInt4761)) {
						Static341.aClass22_4.method7461(Static247.anInt4761, local840.aByteArray26, 0);
						local840.anInt3378 = 0;
						Static463.anInt7496 = local840.method2859();
						Static316.anInt5591 = local840.method2859();
						Static279.aBoolean378 = local840.method2859() == 1;
						Static318.aBoolean410 = local840.method2859() == 1;
						Static194.aBoolean290 = local840.method2859() == 1;
						Static632.anInt8265 = local840.method2836();
						Static9.aBoolean20 = Static632.anInt8265 > 0;
						Static163.anInt3309 = local840.method2825();
						Static213.anInt4074 = local840.method2825();
						Static557.anInt9216 = local840.method2825();
						Static604.anInt9994 = local840.method2881();
						Static55.aClass319_1 = Static265.aClass286_3.method6572(Static604.anInt9994);
						Static583.anInt9502 = local840.method2859();
						Static429.anInt10489 = local840.method2825();
						Static602.anInt9965 = local840.method2825();
						Static187.aBoolean282 = local840.method2859() == 1;
						Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aString82 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aString83 = Static191.aString34 = local840.method2884();
						Static598.anInt4419 = local840.method2859();
						Static326.anInt5714 = local840.method2881();
						Static583.aClass155_14 = new Class155();
						Static583.aClass155_14.anInt4152 = local840.method2825();
						if (Static583.aClass155_14.anInt4152 == 65535) {
							Static583.aClass155_14.anInt4152 = -1;
						}
						Static583.aClass155_14.aString38 = local840.method2884();
						if (Static242.aClass373_4 != Static392.aClass373_6) {
							Static583.aClass155_14.anInt4155 = Static583.aClass155_14.anInt4152 + 40000;
							Static583.aClass155_14.anInt4150 = Static583.aClass155_14.anInt4152 + 50000;
						}
						if (Static392.aClass373_6 != Static472.aClass373_7 && (Static262.aClass155_9.method3616(Static412.aClass155_10) || Static262.aClass155_9.method3616(Static408.aClass155_2))) {
							Static18.method521();
						}
					} else {
						return;
					}
					if (Static279.aBoolean378 && !Static194.aBoolean290 || Static9.aBoolean20) {
						try {
							Static655.method4698("zap", Static107.anApplet1);
						} catch (@Pc(1171) Throwable local1171) {
							if (Static160.aBoolean258) {
								try {
									Static107.anApplet1.getAppletContext().showDocument(new URL(Static107.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1185) Exception local1185) {
								}
							}
						}
					} else {
						try {
							Static655.method4698("unzap", Static107.anApplet1);
						} catch (@Pc(1194) Throwable local1194) {
						}
					}
					if (Static242.aClass373_4 == Static392.aClass373_6) {
						try {
							Static655.method4698("loggedin", Static107.anApplet1);
						} catch (@Pc(1205) Throwable local1205) {
						}
					}
					if (Static639.anInt10307 != 2) {
						Static360.anInt6253 = 0;
						Static520.method7232(2);
						Static219.method3588();
						Static213.method3541(7);
						Static346.aClass200_117 = null;
						return;
					}
					Static360.anInt6253 = 11;
				}
				if (Static360.anInt6253 == 11) {
					if (!Static341.aClass22_4.method7464(3)) {
						return;
					}
					Static341.aClass22_4.method7461(3, Static327.aClass2_Sub17_Sub1_1.aByteArray26, 0);
					Static360.anInt6253 = 12;
				}
				if (Static360.anInt6253 == 12) {
					local840 = Static327.aClass2_Sub17_Sub1_1;
					local840.anInt3378 = 0;
					if (local840.method2451()) {
						if (!Static341.aClass22_4.method7464(1)) {
							return;
						}
						Static341.aClass22_4.method7461(1, local840.aByteArray26, 3);
					}
					Static346.aClass200_117 = Static79.method1721()[local840.method2459()];
					Static245.anInt4755 = local840.method2825();
					Static360.anInt6253 = 10;
				}
				if (Static360.anInt6253 == 10) {
					if (Static341.aClass22_4.method7464(Static245.anInt4755)) {
						Static341.aClass22_4.method7461(Static245.anInt4755, Static327.aClass2_Sub17_Sub1_1.aByteArray26, 0);
						Static327.aClass2_Sub17_Sub1_1.anInt3378 = 0;
						local178 = Static245.anInt4755;
						Static360.anInt6253 = 0;
						Static520.method7232(2);
						Static407.method6028();
						Static376.method5579(Static327.aClass2_Sub17_Sub1_1);
						Static470.anInt7589 = -1;
						if (Static346.aClass200_117 == Static2.aClass200_1) {
							Static596.method8399();
						} else {
							Static309.method6851();
						}
						if (local178 != Static327.aClass2_Sub17_Sub1_1.anInt3378) {
							throw new RuntimeException("lswp pos:" + Static327.aClass2_Sub17_Sub1_1.anInt3378 + " psize:" + local178);
						}
						Static346.aClass200_117 = null;
					}
				} else if (Static360.anInt6253 == 14) {
					if (Static245.anInt4755 == -2) {
						if (!Static341.aClass22_4.method7464(2)) {
							return;
						}
						Static341.aClass22_4.method7461(2, Static327.aClass2_Sub17_Sub1_1.aByteArray26, 0);
						Static327.aClass2_Sub17_Sub1_1.anInt3378 = 0;
						Static245.anInt4755 = Static327.aClass2_Sub17_Sub1_1.method2825();
					}
					if (Static341.aClass22_4.method7464(Static245.anInt4755)) {
						Static341.aClass22_4.method7461(Static245.anInt4755, Static327.aClass2_Sub17_Sub1_1.aByteArray26, 0);
						Static327.aClass2_Sub17_Sub1_1.anInt3378 = 0;
						Static360.anInt6253 = 0;
						local178 = Static245.anInt4755;
						Static520.method7232(15);
						Static240.method8291();
						Static376.method5579(Static327.aClass2_Sub17_Sub1_1);
						if (local178 != Static327.aClass2_Sub17_Sub1_1.anInt3378) {
							throw new RuntimeException("lswpr pos:" + Static327.aClass2_Sub17_Sub1_1.anInt3378 + " psize:" + local178);
						}
						Static346.aClass200_117 = null;
					}
				}
			} else if (Static341.aClass22_4.method7464(1)) {
				Static341.aClass22_4.method7461(1, Static327.aClass2_Sub17_Sub1_1.aByteArray26, 0);
				Static247.anInt4761 = Static327.aClass2_Sub17_Sub1_1.aByteArray26[0] & 0xFF;
				Static360.anInt6253 = 9;
			}
		} catch (@Pc(1444) IOException local1444) {
			if (Static341.aClass22_4 != null) {
				Static341.aClass22_4.method7460();
				Static341.aClass22_4 = null;
			}
			if (Static467.anInt10427 < 3) {
				if (Static639.anInt10307 == 2) {
					Static262.aClass155_9.method3615();
				} else {
					Static381.aClass155_15.method3615();
				}
				Static360.anInt6253 = 1;
				Static140.anInt2975 = 0;
				Static467.anInt10427++;
			} else {
				Static360.anInt6253 = 0;
				Static520.method7232(-4);
				Static262.method4325();
			}
		}
	}
}
