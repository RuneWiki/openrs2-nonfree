import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
	public static int anInt5645;

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
	public static int anInt5650;

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "[I")
	public static final int[] anIntArray459 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
	public static int anInt5648 = 0;

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString207 = "Loaded sprites";

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
	public static int anInt5651 = 0;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Z")
	public static boolean method4782() {
		return Static166.aBoolean306;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIII)V")
	public static void method4783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg2) {
			Static260.method4433(arg3, arg4, arg0, arg1);
		} else if (arg0 - arg3 >= Static338.anInt5369 && arg0 + arg3 <= Static295.anInt5964 && Static229.anInt4777 <= arg1 - arg2 && arg2 + arg1 <= Static165.anInt3366) {
			Static343.method5583(arg0, arg4, arg3, arg1, arg2);
		} else {
			Static306.method5192(arg4, arg1, arg2, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILclient!fd;I)V")
	public static void method4784(@OriginalArg(0) int arg0, @OriginalArg(2) Class72 arg1, @OriginalArg(3) int arg2) {
		Static116.aClass72_3 = arg1;
		Static150.anInt6595 = arg0;
		Static29.anInt465 = arg2;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIBI)V")
	public static void method4786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 > Static165.anInt3366 || arg3 < Static229.anInt4777) {
			return;
		}
		@Pc(36) boolean local36;
		if (arg1 < Static338.anInt5369) {
			arg1 = Static338.anInt5369;
			local36 = false;
		} else if (Static295.anInt5964 >= arg1) {
			local36 = true;
		} else {
			arg1 = Static295.anInt5964;
			local36 = false;
		}
		@Pc(66) boolean local66;
		if (arg2 < Static338.anInt5369) {
			local66 = false;
			arg2 = Static338.anInt5369;
		} else if (Static295.anInt5964 < arg2) {
			arg2 = Static295.anInt5964;
			local66 = false;
		} else {
			local66 = true;
		}
		if (arg0 >= Static229.anInt4777) {
			Static182.method3394(arg1, Static30.anIntArrayArray10[arg0++], arg4, arg2);
		} else {
			arg0 = Static229.anInt4777;
		}
		if (arg3 > Static165.anInt3366) {
			arg3 = Static165.anInt3366;
		} else {
			Static182.method3394(arg1, Static30.anIntArrayArray10[arg3--], arg4, arg2);
		}
		@Pc(116) int local116;
		if (local36 && local66) {
			for (local116 = arg0; local116 <= arg3; local116++) {
				@Pc(154) int[] local154 = Static30.anIntArrayArray10[local116];
				local154[arg1] = local154[arg2] = arg4;
			}
			return;
		}
		if (local36) {
			for (local116 = arg0; local116 <= arg3; local116++) {
				Static30.anIntArrayArray10[local116][arg1] = arg4;
			}
			return;
		}
		if (local66) {
			for (local116 = arg0; local116 <= arg3; local116++) {
				Static30.anIntArrayArray10[local116][arg2] = arg4;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
	public static void method4787() {
		if (anInt5648 == 0 || anInt5648 == 5) {
			return;
		}
		try {
			if (++Static40.anInt912 > 2000) {
				if (Static131.aClass171_3 != null) {
					Static131.aClass171_3.method4637();
					Static131.aClass171_3 = null;
				}
				if (Static17.anInt360 >= 1) {
					anInt5648 = 0;
					Static68.anInt1533 = -5;
					return;
				}
				Static17.anInt360++;
				Static40.anInt912 = 0;
				if (Static47.anInt1066 == Static120.anInt2720) {
					Static47.anInt1066 = Static73.anInt1645;
				} else {
					Static47.anInt1066 = Static120.anInt2720;
				}
				anInt5648 = 1;
			}
			if (anInt5648 == 1) {
				Static195.aClass51_7 = Static212.aClass120_3.method3227(Static47.anInt1066, Static124.aString117);
				anInt5648 = 2;
			}
			if (anInt5648 == 2) {
				if (Static195.aClass51_7.anInt1229 == 2) {
					throw new IOException();
				}
				if (Static195.aClass51_7.anInt1229 != 1) {
					return;
				}
				Static131.aClass171_3 = new Class171((Socket) Static195.aClass51_7.anObject1, Static212.aClass120_3);
				Static195.aClass51_7 = null;
				@Pc(101) long local101 = Static324.aLong237 = Static327.method5371(Static131.aString96);
				@Pc(108) int local108 = (int) (local101 >> 16 & 0x1FL);
				Static320.aClass4_Sub7_Sub1_3.anInt2667 = 0;
				Static320.aClass4_Sub7_Sub1_3.method2416(14);
				Static320.aClass4_Sub7_Sub1_3.method2416(local108);
				Static131.aClass171_3.method4636(Static320.aClass4_Sub7_Sub1_3.aByteArray42, 2);
				if (Static320.aClass39_2 != null) {
					Static320.aClass39_2.method4801();
				}
				if (Static36.aClass39_1 != null) {
					Static36.aClass39_1.method4801();
				}
				@Pc(142) int local142 = Static131.aClass171_3.method4639();
				if (Static320.aClass39_2 != null) {
					Static320.aClass39_2.method4801();
				}
				if (Static36.aClass39_1 != null) {
					Static36.aClass39_1.method4801();
				}
				if (local142 != 0) {
					anInt5648 = 0;
					Static68.anInt1533 = local142;
					Static131.aClass171_3.method4637();
					Static131.aClass171_3 = null;
					return;
				}
				anInt5648 = 3;
			}
			if (anInt5648 == 3) {
				if (Static131.aClass171_3.method4638() < 8) {
					return;
				}
				Static131.aClass171_3.method4628(Static200.aClass4_Sub7_Sub1_2.aByteArray42, 8, 0);
				Static200.aClass4_Sub7_Sub1_2.anInt2667 = 0;
				Static59.aLong51 = Static200.aClass4_Sub7_Sub1_2.method2409();
				@Pc(199) int[] local199 = new int[4];
				Static320.aClass4_Sub7_Sub1_3.anInt2667 = 0;
				local199[0] = (int) (Math.random() * 9.9999999E7D);
				local199[3] = (int) Static59.aLong51;
				local199[1] = (int) (Math.random() * 9.9999999E7D);
				local199[2] = (int) (Static59.aLong51 >> 32);
				Static320.aClass4_Sub7_Sub1_3.method2416(10);
				Static320.aClass4_Sub7_Sub1_3.method2387(local199[0]);
				Static320.aClass4_Sub7_Sub1_3.method2387(local199[1]);
				Static320.aClass4_Sub7_Sub1_3.method2387(local199[2]);
				Static320.aClass4_Sub7_Sub1_3.method2387(local199[3]);
				Static320.aClass4_Sub7_Sub1_3.method2385(Static327.method5371(Static131.aString96));
				Static320.aClass4_Sub7_Sub1_3.method2373(Static213.aString164);
				Static320.aClass4_Sub7_Sub1_3.method2369(Static195.aBigInteger2, Static78.aBigInteger1);
				Static174.aClass4_Sub7_Sub1_1.anInt2667 = 0;
				if (Static139.anInt3135 == 40) {
					Static174.aClass4_Sub7_Sub1_1.method2416(18);
				} else {
					Static174.aClass4_Sub7_Sub1_1.method2416(16);
				}
				Static174.aClass4_Sub7_Sub1_1.method2376(Static320.aClass4_Sub7_Sub1_3.anInt2667 + Static204.method3620(Static153.aString115) + 161);
				Static174.aClass4_Sub7_Sub1_1.method2387(559);
				Static174.aClass4_Sub7_Sub1_1.method2416(Static114.anInt2467);
				Static174.aClass4_Sub7_Sub1_1.method2416(Static11.method265());
				Static174.aClass4_Sub7_Sub1_1.method2376(Static202.anInt4258);
				Static174.aClass4_Sub7_Sub1_1.method2376(Static38.anInt832);
				Static174.aClass4_Sub7_Sub1_1.method2416(Static339.anInt6679);
				Static188.method3428(Static174.aClass4_Sub7_Sub1_1);
				Static174.aClass4_Sub7_Sub1_1.method2373(Static153.aString115);
				Static174.aClass4_Sub7_Sub1_1.method2387(Static145.anInt3255);
				Static174.aClass4_Sub7_Sub1_1.method2387(Static163.method3130());
				Static243.aBoolean429 = true;
				Static174.aClass4_Sub7_Sub1_1.method2376(Static191.anInt4118);
				Static174.aClass4_Sub7_Sub1_1.method2387(Static16.aClass11_3.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static114.aClass11_52.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static266.aClass11_113.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static52.aClass11_19.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static60.aClass11_28.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static159.aClass11_72.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static20.aClass11_9.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static67.aClass11_31.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static292.aClass11_130.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static5.aClass11_2.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static316.aClass11_114.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static203.aClass11_84.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static54.aClass11_21.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static58.aClass11_24.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static234.aClass11_97.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static292.aClass11_129.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static191.aClass11_80.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static112.aClass11_51.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static150.aClass11_148.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static54.aClass11_20.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static144.aClass11_68.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static78.aClass11_39.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static55.aClass11_22.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static150.aClass11_147.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static237.aClass11_98.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static19.aClass11_150.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static349.aClass11_154.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static309.aClass11_138.method295());
				Static174.aClass4_Sub7_Sub1_1.method2387(Static230.aClass11_94.method295());
				Static174.aClass4_Sub7_Sub1_1.method2398(Static320.aClass4_Sub7_Sub1_3.anInt2667, Static320.aClass4_Sub7_Sub1_3.aByteArray42);
				Static131.aClass171_3.method4636(Static174.aClass4_Sub7_Sub1_1.aByteArray42, Static174.aClass4_Sub7_Sub1_1.anInt2667);
				Static320.aClass4_Sub7_Sub1_3.method1236(local199);
				for (@Pc(599) int local599 = 0; local599 < 4; local599++) {
					local199[local599] += 50;
				}
				Static200.aClass4_Sub7_Sub1_2.method1236(local199);
				anInt5648 = 4;
			}
			if (anInt5648 == 4) {
				if (Static131.aClass171_3.method4638() < 1) {
					return;
				}
				@Pc(635) int local635 = Static131.aClass171_3.method4639();
				if (local635 == 21) {
					anInt5648 = 7;
				} else if (local635 == 29) {
					anInt5648 = 10;
				} else if (local635 == 1) {
					anInt5648 = 5;
					Static68.anInt1533 = local635;
					return;
				} else if (local635 == 2) {
					anInt5648 = 8;
				} else if (local635 == 15) {
					Static68.anInt1533 = local635;
					anInt5648 = 0;
					return;
				} else if (local635 == 23 && Static17.anInt360 < 1) {
					anInt5648 = 1;
					Static40.anInt912 = 0;
					Static17.anInt360++;
					Static131.aClass171_3.method4637();
					Static131.aClass171_3 = null;
					return;
				} else {
					Static68.anInt1533 = local635;
					anInt5648 = 0;
					Static131.aClass171_3.method4637();
					Static131.aClass171_3 = null;
					return;
				}
			}
			if (anInt5648 == 6) {
				Static320.aClass4_Sub7_Sub1_3.anInt2667 = 0;
				Static320.aClass4_Sub7_Sub1_3.method1237(17);
				Static131.aClass171_3.method4636(Static320.aClass4_Sub7_Sub1_3.aByteArray42, Static320.aClass4_Sub7_Sub1_3.anInt2667);
				anInt5648 = 4;
			} else if (anInt5648 == 7) {
				if (Static131.aClass171_3.method4638() >= 1) {
					Static287.anInt5821 = (Static131.aClass171_3.method4639() + 3) * 60;
					anInt5648 = 0;
					Static68.anInt1533 = 21;
					Static131.aClass171_3.method4637();
					Static131.aClass171_3 = null;
				}
			} else if (anInt5648 != 10) {
				if (anInt5648 == 8) {
					if (Static131.aClass171_3.method4638() < 14) {
						return;
					}
					Static131.aClass171_3.method4628(Static200.aClass4_Sub7_Sub1_2.aByteArray42, 14, 0);
					Static200.aClass4_Sub7_Sub1_2.anInt2667 = 0;
					Static98.anInt6644 = Static200.aClass4_Sub7_Sub1_2.method2380();
					Static336.anInt6659 = Static200.aClass4_Sub7_Sub1_2.method2380();
					Static289.aBoolean516 = Static200.aClass4_Sub7_Sub1_2.method2380() == 1;
					Static248.aBoolean439 = Static200.aClass4_Sub7_Sub1_2.method2380() == 1;
					Static233.aBoolean406 = Static200.aClass4_Sub7_Sub1_2.method2380() == 1;
					Static337.aBoolean514 = Static200.aClass4_Sub7_Sub1_2.method2380() == 1;
					Static153.aBoolean285 = Static200.aClass4_Sub7_Sub1_2.method2380() == 1;
					Static321.anInt6343 = Static200.aClass4_Sub7_Sub1_2.method2404();
					Static282.aBoolean504 = Static200.aClass4_Sub7_Sub1_2.method2380() == 1;
					Static197.aBoolean352 = Static200.aClass4_Sub7_Sub1_2.method2380() == 1;
					Static2.method4190(Static197.aBoolean352);
					Static230.method3941(Static197.aBoolean352);
					Static316.method4687(Static197.aBoolean352);
					if (Static289.aBoolean516 && !Static233.aBoolean406 || Static282.aBoolean504) {
						try {
							Static369.method5674(Static212.aClass120_3.anApplet1, "zap");
						} catch (@Pc(912) Throwable local912) {
						}
					} else {
						try {
							Static369.method5674(Static212.aClass120_3.anApplet1, "unzap");
						} catch (@Pc(922) Throwable local922) {
						}
					}
					if (Static306.anInt6192 == 0) {
						try {
							Static369.method5674(Static212.aClass120_3.anApplet1, "loggedin");
						} catch (@Pc(936) Throwable local936) {
						}
					}
					Static94.anInt2092 = Static200.aClass4_Sub7_Sub1_2.method1238();
					Static302.anInt6099 = Static200.aClass4_Sub7_Sub1_2.method2404();
					anInt5648 = 9;
				}
				if (anInt5648 == 9 && Static131.aClass171_3.method4638() >= Static302.anInt6099) {
					Static200.aClass4_Sub7_Sub1_2.anInt2667 = 0;
					Static131.aClass171_3.method4628(Static200.aClass4_Sub7_Sub1_2.aByteArray42, Static302.anInt6099, 0);
					anInt5648 = 0;
					Static68.anInt1533 = 2;
					Static159.method3071();
					Static182.anInt4006 = -1;
					Static253.method4357(false);
					Static94.anInt2092 = -1;
				}
			} else if (Static131.aClass171_3.method4638() >= 1) {
				Static148.anInt4857 = Static131.aClass171_3.method4639();
				Static68.anInt1533 = 29;
				anInt5648 = 0;
				Static131.aClass171_3.method4637();
				Static131.aClass171_3 = null;
			}
		} catch (@Pc(989) IOException local989) {
			if (Static131.aClass171_3 != null) {
				Static131.aClass171_3.method4637();
				Static131.aClass171_3 = null;
			}
			if (Static17.anInt360 < 1) {
				anInt5648 = 1;
				Static40.anInt912 = 0;
				if (Static47.anInt1066 == Static120.anInt2720) {
					Static47.anInt1066 = Static73.anInt1645;
				} else {
					Static47.anInt1066 = Static120.anInt2720;
				}
				Static17.anInt360++;
			} else {
				anInt5648 = 0;
				Static68.anInt1533 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZI)V")
	public static void method4788() {
		@Pc(5) Class154 local5 = Static133.aClass154_44;
		synchronized (Static133.aClass154_44) {
			Static133.aClass154_44.method4220(5);
		}
		local5 = Static199.aClass154_102;
		synchronized (Static199.aClass154_102) {
			Static199.aClass154_102.method4220(5);
		}
		local5 = Static310.aClass154_95;
		synchronized (Static310.aClass154_95) {
			Static310.aClass154_95.method4220(5);
		}
	}
}
