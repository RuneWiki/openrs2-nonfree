import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!ug", name = "V", descriptor = "I")
	public static int anInt4593;

	@OriginalMember(owner = "client!ug", name = "Y", descriptor = "I")
	public static int anInt4596;

	@OriginalMember(owner = "client!ug", name = "Z", descriptor = "Lclient!o;")
	public static Class86 aClass86_15;

	@OriginalMember(owner = "client!ug", name = "db", descriptor = "Lclient!ab;")
	public static Class2 aClass2_1;

	@OriginalMember(owner = "client!ug", name = "hb", descriptor = "Lclient!jb;")
	public static Class28 aClass28_75;

	@OriginalMember(owner = "client!ug", name = "ib", descriptor = "I")
	public static int anInt4601;

	@OriginalMember(owner = "client!ug", name = "jb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ug", name = "lb", descriptor = "Lclient!tg;")
	public static Class1_Sub2_Sub2 aClass1_Sub2_Sub2_93;

	@OriginalMember(owner = "client!ug", name = "mb", descriptor = "[Lclient!ka;")
	public static Class64_Sub1[] aClass64_Sub1Array10;

	@OriginalMember(owner = "client!ug", name = "fb", descriptor = "Lclient!ob;")
	public static Class87 aClass87_1 = new Class87();

	@OriginalMember(owner = "client!ug", name = "gb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1247 = Static231.method3737("_labels");

	@OriginalMember(owner = "client!ug", name = "nb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1248 = Static231.method3737("Spielwelt erstellt)3");

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!o;)Lclient!sc;")
	public static Class107 method3436(@OriginalArg(1) Class86 arg0) {
		if (Static65.method1211(Static34.method676(arg0)) == 0) {
			return null;
		} else if (arg0.aClass107_868 == null || arg0.aClass107_868.method3101().method3095() == 0) {
			return Static219.aBoolean426 ? Static228.aClass107_1342 : null;
		} else {
			return arg0.aClass107_868;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZIIIB)V")
	public static void method3437(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static159.anInt3504 = (short) arg0;
		Static110.anInt2435 = (short) arg1;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!jb;Lclient!jb;Lclient!jb;ZLclient!hj;)Z")
	public static boolean method3439(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(4) Class1_Sub6_Sub2 arg3) {
		Static218.aClass1_Sub6_Sub2_3 = arg3;
		Static133.aClass28_52 = arg1;
		Static54.aClass28_25 = arg0;
		Static117.aClass28_47 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)V")
	public static void method3440() {
		if (Static25.anInt497 == 0 || Static25.anInt497 == 5) {
			return;
		}
		try {
			if (++Static75.anInt1699 > 2000) {
				if (Static167.aClass82_3 != null) {
					Static167.aClass82_3.method2395();
					Static167.aClass82_3 = null;
				}
				if (Static133.anInt2878 >= 1) {
					Static25.anInt497 = 0;
					Static207.anInt4429 = -5;
					return;
				}
				Static133.anInt2878++;
				Static75.anInt1699 = 0;
				Static25.anInt497 = 1;
				if (Static90.anInt1964 == Static211.anInt4553) {
					Static211.anInt4553 = Static155.anInt434;
				} else {
					Static211.anInt4553 = Static90.anInt1964;
				}
			}
			if (Static25.anInt497 == 1) {
				Static110.aClass84_5 = Static117.aClass34_2.method1065(Static211.anInt4553, Static91.aString10);
				Static25.anInt497 = 2;
			}
			if (Static25.anInt497 == 2) {
				if (Static110.aClass84_5.anInt3171 == 2) {
					throw new IOException();
				}
				if (Static110.aClass84_5.anInt3171 != 1) {
					return;
				}
				Static167.aClass82_3 = new Class82((Socket) Static110.aClass84_5.anObject4, Static117.aClass34_2);
				Static110.aClass84_5 = null;
				@Pc(118) long local118 = Static189.aLong149 = Static63.aClass107_430.method3066();
				@Pc(125) int local125 = (int) (local118 >> 16 & 0x1FL);
				Static193.aClass1_Sub26_Sub1_2.anInt4021 = 0;
				Static193.aClass1_Sub26_Sub1_2.method2967(14);
				Static193.aClass1_Sub26_Sub1_2.method2967(local125);
				Static167.aClass82_3.method2399(2, Static193.aClass1_Sub26_Sub1_2.aByteArray52);
				if (Static186.aClass62_2 != null) {
					Static186.aClass62_2.method2412();
				}
				if (Static100.aClass62_1 != null) {
					Static100.aClass62_1.method2412();
				}
				@Pc(159) int local159 = Static167.aClass82_3.method2394();
				if (Static186.aClass62_2 != null) {
					Static186.aClass62_2.method2412();
				}
				if (Static100.aClass62_1 != null) {
					Static100.aClass62_1.method2412();
				}
				if (local159 != 0) {
					Static25.anInt497 = 0;
					Static207.anInt4429 = local159;
					Static167.aClass82_3.method2395();
					Static167.aClass82_3 = null;
					return;
				}
				Static25.anInt497 = 3;
			}
			if (Static25.anInt497 == 3) {
				if (Static167.aClass82_3.method2397() < 8) {
					return;
				}
				@Pc(204) int[] local204 = new int[4];
				Static167.aClass82_3.method2398(0, Static194.aClass1_Sub26_Sub1_3.aByteArray52, 8);
				Static194.aClass1_Sub26_Sub1_3.anInt4021 = 0;
				Static225.aLong172 = Static194.aClass1_Sub26_Sub1_3.method2943();
				local204[1] = (int) (Math.random() * 9.9999999E7D);
				local204[2] = (int) (Static225.aLong172 >> 32);
				Static193.aClass1_Sub26_Sub1_2.anInt4021 = 0;
				local204[3] = (int) Static225.aLong172;
				local204[0] = (int) (Math.random() * 9.9999999E7D);
				Static193.aClass1_Sub26_Sub1_2.method2967(10);
				Static193.aClass1_Sub26_Sub1_2.method2973(local204[0]);
				Static193.aClass1_Sub26_Sub1_2.method2973(local204[1]);
				Static193.aClass1_Sub26_Sub1_2.method2973(local204[2]);
				Static193.aClass1_Sub26_Sub1_2.method2973(local204[3]);
				Static193.aClass1_Sub26_Sub1_2.method2940(Static63.aClass107_430.method3066());
				Static193.aClass1_Sub26_Sub1_2.method2979(Static63.aClass107_431);
				Static193.aClass1_Sub26_Sub1_2.method2991(Static148.aBigInteger3, Static179.aBigInteger4);
				Static113.aClass1_Sub26_Sub1_1.anInt4021 = 0;
				if (Static178.anInt3884 == 40) {
					Static113.aClass1_Sub26_Sub1_1.method2967(18);
				} else {
					Static113.aClass1_Sub26_Sub1_1.method2967(16);
				}
				Static113.aClass1_Sub26_Sub1_1.method2963(Static193.aClass1_Sub26_Sub1_2.anInt4021 + Static182.method2998(Static30.aClass107_204) + 151);
				Static113.aClass1_Sub26_Sub1_1.method2973(507);
				Static113.aClass1_Sub26_Sub1_1.method2967(Static98.anInt2134);
				Static113.aClass1_Sub26_Sub1_1.method2967(0);
				Static113.aClass1_Sub26_Sub1_1.method2967(Static194.method3157());
				Static113.aClass1_Sub26_Sub1_1.method2963(Static158.anInt3484);
				Static113.aClass1_Sub26_Sub1_1.method2963(Static180.anInt4990);
				Static201.method3223(Static113.aClass1_Sub26_Sub1_1);
				Static113.aClass1_Sub26_Sub1_1.method2979(Static30.aClass107_204);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static156.anInt3410);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static163.method2613());
				Static195.aBoolean382 = true;
				Static113.aClass1_Sub26_Sub1_1.method2973(Static55.aClass28_Sub1_33.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static126.aClass28_Sub1_73.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static104.aClass28_Sub1_86.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static165.aClass28_Sub1_64.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static156.aClass28_Sub1_90.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static42.aClass28_Sub1_24.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static80.aClass28_Sub1_47.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static15.aClass28_Sub1_14.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static169.aClass28_Sub1_97.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static63.aClass28_Sub1_37.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static141.aClass28_Sub1_85.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static195.aClass28_Sub1_111.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static65.aClass28_Sub1_38.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static225.aClass28_Sub1_130.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static86.aClass28_Sub1_51.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static199.aClass28_Sub1_112.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static80.aClass28_Sub1_46.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static174.aClass28_Sub1_102.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static44.aClass28_Sub1_25.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static204.aClass28_Sub1_68.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static17.aClass28_Sub1_15.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static92.aClass28_Sub1_54.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static1.aClass28_Sub1_4.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static217.aClass28_Sub1_126.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static180.aClass28_Sub1_133.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static211.aClass28_Sub1_120.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2973(Static7.aClass28_Sub1_10.anInt906);
				Static113.aClass1_Sub26_Sub1_1.method2993(Static193.aClass1_Sub26_Sub1_2.anInt4021, Static193.aClass1_Sub26_Sub1_2.aByteArray52);
				Static167.aClass82_3.method2399(Static113.aClass1_Sub26_Sub1_1.anInt4021, Static113.aClass1_Sub26_Sub1_1.aByteArray52);
				Static193.aClass1_Sub26_Sub1_2.method3011(local204);
				for (@Pc(535) int local535 = 0; local535 < 4; local535++) {
					local204[local535] += 50;
				}
				Static194.aClass1_Sub26_Sub1_3.method3011(local204);
				Static25.anInt497 = 4;
			}
			if (Static25.anInt497 == 4) {
				if (Static167.aClass82_3.method2397() < 1) {
					return;
				}
				@Pc(571) int local571 = Static167.aClass82_3.method2394();
				if (local571 == 21) {
					Static25.anInt497 = 7;
				} else if (local571 == 1) {
					Static25.anInt497 = 5;
					Static207.anInt4429 = local571;
					return;
				} else if (local571 == 2) {
					Static25.anInt497 = 8;
				} else if (local571 == 15) {
					Static207.anInt4429 = local571;
					Static25.anInt497 = 0;
					return;
				} else if (local571 == 23 && Static133.anInt2878 < 1) {
					Static133.anInt2878++;
					Static75.anInt1699 = 0;
					Static25.anInt497 = 1;
					Static167.aClass82_3.method2395();
					Static167.aClass82_3 = null;
					return;
				} else {
					Static25.anInt497 = 0;
					Static207.anInt4429 = local571;
					Static167.aClass82_3.method2395();
					Static167.aClass82_3 = null;
					return;
				}
			}
			if (Static25.anInt497 == 6) {
				Static193.aClass1_Sub26_Sub1_2.anInt4021 = 0;
				Static193.aClass1_Sub26_Sub1_2.method3000(17);
				Static167.aClass82_3.method2399(Static193.aClass1_Sub26_Sub1_2.anInt4021, Static193.aClass1_Sub26_Sub1_2.aByteArray52);
				Static25.anInt497 = 4;
			} else if (Static25.anInt497 != 7) {
				if (Static25.anInt497 == 8) {
					if (Static167.aClass82_3.method2397() < 11) {
						return;
					}
					Static167.aClass82_3.method2398(0, Static194.aClass1_Sub26_Sub1_3.aByteArray52, 11);
					Static194.aClass1_Sub26_Sub1_3.anInt4021 = 0;
					Static156.anInt3417 = Static194.aClass1_Sub26_Sub1_3.method2945();
					Static128.anInt2799 = Static194.aClass1_Sub26_Sub1_3.method2945();
					Static49.anInt1281 = Static194.aClass1_Sub26_Sub1_3.method2945();
					if (Static49.anInt1281 == 1) {
						try {
							Static26.aClass107_180.method3113(Static117.aClass34_2.anApplet1);
						} catch (@Pc(731) Throwable local731) {
						}
					} else {
						try {
							Static114.aClass107_678.method3113(Static117.aClass34_2.anApplet1);
						} catch (@Pc(741) Throwable local741) {
						}
					}
					Static99.anInt929 = Static194.aClass1_Sub26_Sub1_3.method2945();
					Static20.aBoolean199 = Static194.aClass1_Sub26_Sub1_3.method2945() == 1;
					Static137.anInt2980 = Static194.aClass1_Sub26_Sub1_3.method2964();
					Static130.anInt2837 = Static194.aClass1_Sub26_Sub1_3.method2945();
					Static176.anInt3812 = Static194.aClass1_Sub26_Sub1_3.method3003();
					Static24.anInt450 = Static194.aClass1_Sub26_Sub1_3.method2964();
					Static25.anInt497 = 9;
				}
				if (Static25.anInt497 == 9 && Static167.aClass82_3.method2397() >= Static24.anInt450) {
					Static194.aClass1_Sub26_Sub1_3.anInt4021 = 0;
					Static167.aClass82_3.method2398(0, Static194.aClass1_Sub26_Sub1_3.aByteArray52, Static24.anInt450);
					Static207.anInt4429 = 2;
					Static25.anInt497 = 0;
					Static106.method1854();
					Static123.anInt2686 = -1;
					Static165.method1868(false);
					Static176.anInt3812 = -1;
				}
			} else if (Static167.aClass82_3.method2397() >= 1) {
				Static176.anInt3816 = Static167.aClass82_3.method2394() * 60 + 180;
				Static25.anInt497 = 0;
				Static207.anInt4429 = 21;
				Static167.aClass82_3.method2395();
				Static167.aClass82_3 = null;
			}
		} catch (@Pc(813) IOException local813) {
			if (Static167.aClass82_3 != null) {
				Static167.aClass82_3.method2395();
				Static167.aClass82_3 = null;
			}
			if (Static133.anInt2878 < 1) {
				Static133.anInt2878++;
				if (Static90.anInt1964 == Static211.anInt4553) {
					Static211.anInt4553 = Static155.anInt434;
				} else {
					Static211.anInt4553 = Static90.anInt1964;
				}
				Static25.anInt497 = 1;
				Static75.anInt1699 = 0;
			} else {
				Static207.anInt4429 = -4;
				Static25.anInt497 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!sc;ILclient!sc;B)V")
	public static void method3441(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class107 arg2) {
		Static191.aBoolean371 = false;
		Static63.aClass107_430 = arg0;
		Static98.anInt2134 = arg1;
		Static176.anInt3816 = 0;
		Static63.aClass107_431 = arg2;
		if (Static63.aClass107_430.method3071(Static63.aClass107_427) || Static63.aClass107_431.method3071(Static63.aClass107_427)) {
			Static207.anInt4429 = 3;
			Static25.anInt497 = 0;
		} else {
			Static133.anInt2878 = 0;
			Static75.anInt1699 = 0;
			Static25.anInt497 = 1;
			Static207.anInt4429 = -3;
		}
	}
}
