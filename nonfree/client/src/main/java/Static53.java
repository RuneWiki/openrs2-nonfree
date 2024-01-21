import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!jf", name = "X", descriptor = "[Z")
	public static boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!jf", name = "S", descriptor = "I")
	public static int anInt2368 = 0;

	@OriginalMember(owner = "client!jf", name = "T", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1001 = null;

	@OriginalMember(owner = "client!jf", name = "U", descriptor = "I")
	public static volatile int anInt2369 = 0;

	@OriginalMember(owner = "client!jf", name = "ob", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1008 = Static63.method1251("No reply from loginserver)3");

	@OriginalMember(owner = "client!jf", name = "V", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1002 = aClass45_1008;

	@OriginalMember(owner = "client!jf", name = "W", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1003 = Static63.method1251("p11_full");

	@OriginalMember(owner = "client!jf", name = "ab", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1004 = Static63.method1251("::errortest");

	@OriginalMember(owner = "client!jf", name = "bb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1005 = Static63.method1251(")1");

	@OriginalMember(owner = "client!jf", name = "cb", descriptor = "I")
	public static int anInt2372 = 3;

	@OriginalMember(owner = "client!jf", name = "eb", descriptor = "[I")
	public static int[] anIntArray347 = new int[100];

	@OriginalMember(owner = "client!jf", name = "fb", descriptor = "I")
	public static int anInt2374 = 0;

	@OriginalMember(owner = "client!jf", name = "gb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1006 = null;

	@OriginalMember(owner = "client!jf", name = "ib", descriptor = "I")
	public static final int anInt2376 = 50;

	@OriginalMember(owner = "client!jf", name = "jb", descriptor = "[I")
	public static int[] anIntArray348 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!jf", name = "mb", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1007 = Static63.method1251("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!jf", name = "nb", descriptor = "Z")
	public static boolean aBoolean108 = true;

	@OriginalMember(owner = "client!jf", name = "pb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1009 = aClass45_1007;

	@OriginalMember(owner = "client!jf", name = "rb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1010 = Static63.method1251("Name eingeben:");

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(Z)V")
	public static void method1607() {
		if (Static16.anInt502 == 0 && !Static13.aBoolean12) {
			Static108.method1945(Static14.anInt425, 48, Static78.aClass45_929, Static47.anInt1354, 0, Static46.aClass45_564);
		}
		@Pc(21) int local21 = -1;
		for (@Pc(23) int local23 = 0; local23 < Static20.anInt691; local23++) {
			@Pc(28) int local28 = Static20.anIntArray101[local23];
			@Pc(32) int local32 = local28 & 0x7F;
			@Pc(38) int local38 = local28 >> 7 & 0x7F;
			@Pc(44) int local44 = local28 >> 29 & 0x3;
			@Pc(50) int local50 = local28 >> 14 & 0x7FFF;
			if (local28 != local21) {
				local21 = local28;
				@Pc(104) int local104;
				if (local44 == 2 && Static110.aClass34_1.method928(Static8.anInt262, local32, local38, local28) >= 0) {
					@Pc(73) Class5_Sub2_Sub7 local73 = Static62.method1232(local50);
					if (local73.anIntArray143 != null) {
						local73 = local73.method606();
					}
					if (local73 == null) {
						continue;
					}
					if (Static16.anInt502 == 1) {
						Static108.method1945(local32, 30, Static39.method1443(new Class45[] { Static12.aClass45_1357, Static40.aClass45_528, local73.aClass45_418 }), local38, local28, Static117.aClass45_1345);
					} else if (!Static13.aBoolean12) {
						@Pc(94) Class45[] local94 = local73.aClass45Array9;
						if (Static23.aBoolean34) {
							local94 = Static119.method2136(local94);
						}
						if (local94 != null) {
							for (local104 = 4; local104 >= 0; local104--) {
								if (local94[local104] != null) {
									@Pc(115) short local115 = 0;
									if (local104 == 0) {
										local115 = 40;
									}
									if (local104 == 1) {
										local115 = 43;
									}
									if (local104 == 2) {
										local115 = 16;
									}
									if (local104 == 3) {
										local115 = 58;
									}
									if (local104 == 4) {
										local115 = 1005;
									}
									Static108.method1945(local32, local115, Static39.method1443(new Class45[] { Static114.aClass45_1307, local73.aClass45_418 }), local38, local28, local94[local104]);
								}
							}
						}
						Static108.method1945(local32, 1006, Static39.method1443(new Class45[] { Static114.aClass45_1307, local73.aClass45_418 }), local38, local73.anInt836 << 14, Static6.aClass45_77);
					} else if ((Static101.anInt1044 & 0x4) == 4) {
						Static108.method1945(local32, 7, Static39.method1443(new Class45[] { Static3.aClass45_32, Static40.aClass45_528, local73.aClass45_418 }), local38, local28, Static31.aClass45_445);
					}
				}
				@Pc(285) int local285;
				@Pc(292) Class5_Sub2_Sub4_Sub3_Sub2 local292;
				@Pc(344) Class5_Sub2_Sub4_Sub3_Sub1 local344;
				if (local44 == 1) {
					@Pc(260) Class5_Sub2_Sub4_Sub3_Sub2 local260 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local50];
					if (local260.aClass5_Sub2_Sub17_1.anInt3057 == 1 && (local260.anInt2428 & 0x7F) == 64 && (local260.anInt2417 & 0x7F) == 64) {
						for (local285 = 0; local285 < Static62.anInt1819; local285++) {
							local292 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[Static70.anIntArray297[local285]];
							if (local292 != null && local260 != local292 && local292.aClass5_Sub2_Sub17_1.anInt3057 == 1 && local260.anInt2428 == local292.anInt2428 && local260.anInt2417 == local292.anInt2417) {
								Static37.method793(local32, local38, Static70.anIntArray297[local285], local292.aClass5_Sub2_Sub17_1);
							}
						}
						for (local104 = 0; local104 < Static56.anInt1694; local104++) {
							local344 = Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[Static64.anIntArray283[local104]];
							if (local344 != null && local344.anInt2428 == local260.anInt2428 && local344.anInt2417 == local260.anInt2417) {
								Static29.method629(local344, Static64.anIntArray283[local104], local38, local32);
							}
						}
					}
					Static37.method793(local32, local38, local50, local260.aClass5_Sub2_Sub17_1);
				}
				if (local44 == 0) {
					@Pc(392) Class5_Sub2_Sub4_Sub3_Sub1 local392 = Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[local50];
					if ((local392.anInt2428 & 0x7F) == 64 && (local392.anInt2417 & 0x7F) == 64) {
						for (local285 = 0; local285 < Static62.anInt1819; local285++) {
							local292 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[Static70.anIntArray297[local285]];
							if (local292 != null && local292.aClass5_Sub2_Sub17_1.anInt3057 == 1 && local292.anInt2428 == local392.anInt2428 && local292.anInt2417 == local392.anInt2417) {
								Static37.method793(local32, local38, Static70.anIntArray297[local285], local292.aClass5_Sub2_Sub17_1);
							}
						}
						for (local104 = 0; local104 < Static56.anInt1694; local104++) {
							local344 = Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[Static64.anIntArray283[local104]];
							if (local344 != null && local392 != local344 && local392.anInt2428 == local344.anInt2428 && local392.anInt2417 == local344.anInt2417) {
								Static29.method629(local344, Static64.anIntArray283[local104], local38, local32);
							}
						}
					}
					Static29.method629(local392, local50, local38, local32);
				}
				if (local44 == 3) {
					@Pc(514) Class10 local514 = Static30.aClass10ArrayArrayArray2[Static8.anInt262][local32][local38];
					if (local514 != null) {
						for (@Pc(521) Class5_Sub2_Sub4_Sub1 local521 = (Class5_Sub2_Sub4_Sub1) local514.method227(); local521 != null; local521 = (Class5_Sub2_Sub4_Sub1) local514.method239()) {
							@Pc(527) Class5_Sub2_Sub3 local527 = Static81.method1515(local521.anInt339);
							if (Static16.anInt502 == 1) {
								Static108.method1945(local32, 32, Static39.method1443(new Class45[] { Static12.aClass45_1357, Static1.aClass45_7, local527.aClass45_108 }), local38, local521.anInt339, Static117.aClass45_1345);
							} else if (!Static13.aBoolean12) {
								@Pc(535) Class45[] local535 = local527.aClass45Array2;
								if (Static23.aBoolean34) {
									local535 = Static119.method2136(local535);
								}
								for (@Pc(547) int local547 = 4; local547 >= 0; local547--) {
									if (local535 != null && local535[local547] != null) {
										@Pc(587) byte local587 = 0;
										if (local547 == 0) {
											local587 = 15;
										}
										if (local547 == 1) {
											local587 = 51;
										}
										if (local547 == 2) {
											local587 = 45;
										}
										if (local547 == 3) {
											local587 = 3;
										}
										if (local547 == 4) {
											local587 = 33;
										}
										Static108.method1945(local32, local587, Static39.method1443(new Class45[] { Static68.aClass45_830, local527.aClass45_108 }), local38, local521.anInt339, local535[local547]);
									} else if (local547 == 2) {
										Static108.method1945(local32, 45, Static39.method1443(new Class45[] { Static68.aClass45_830, local527.aClass45_108 }), local38, local521.anInt339, Static112.aClass45_1290);
									}
								}
								Static108.method1945(local32, 1002, Static39.method1443(new Class45[] { Static68.aClass45_830, local527.aClass45_108 }), local38, local521.anInt339, Static6.aClass45_77);
							} else if ((Static101.anInt1044 & 0x1) == 1) {
								Static108.method1945(local32, 34, Static39.method1443(new Class45[] { Static3.aClass45_32, Static1.aClass45_7, local527.aClass45_108 }), local38, local521.anInt339, Static31.aClass45_445);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
	public static void method1608() {
		aClass45_1001 = null;
		aClass45_1003 = null;
		aClass45_1008 = null;
		aClass45_1006 = null;
		aClass45_1002 = null;
		aClass45_1010 = null;
		aBooleanArray21 = null;
		anIntArray347 = null;
		aClass45_1007 = null;
		anIntArray348 = null;
		aClass45_1009 = null;
		aClass45_1004 = null;
		aClass45_1005 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method1609(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static54.method1129(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static60.aClass77_2.anApplet1 != null) {
				@Pc(101) Class46 local101 = Static60.aClass77_2.method2165(new URL(Static60.aClass77_2.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static105.anInt2779 + "&u=" + Static112.aLong137 + "&v1=" + Static123.aString2 + "&v2=" + Static123.aString3 + "&e=" + local7));
				while (local101.anInt1964 == 0) {
					Static17.method318(1L);
				}
				if (local101.anInt1964 == 1) {
					@Pc(124) DataInputStream local124 = (DataInputStream) local101.anObject4;
					local124.read();
					local124.close();
				}
			}
		} catch (@Pc(131) Exception local131) {
		}
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)V")
	public static void method1610() {
		Static12.aClass11_137.method2152();
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(Z)V")
	public static void method1613() {
		Static4.anInt106 = 0;
		Static79.anInt2240 = 0;
		Static97.method1806();
		Static1.method4();
		Static10.method220();
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static4.anInt106; local22++) {
			local28 = Static79.anIntArray313[local22];
			if (Static3.anInt94 != Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local28].anInt2406) {
				Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local28].aClass5_Sub2_Sub17_1 = null;
				Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local28] = null;
			}
		}
		if (Static69.anInt1989 != Static70.aClass5_Sub9_Sub1_3.anInt2140) {
			throw new RuntimeException("gnp1 pos:" + Static70.aClass5_Sub9_Sub1_3.anInt2140 + " psize:" + Static69.anInt1989);
		}
		for (local28 = 0; local28 < Static62.anInt1819; local28++) {
			if (Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[Static70.anIntArray297[local28]] == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static62.anInt1819);
			}
		}
	}
}
