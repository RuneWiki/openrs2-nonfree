import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!h", name = "cb", descriptor = "[Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1[] aClass1_Sub1_Sub6_Sub1Array2;

	@OriginalMember(owner = "client!h", name = "nb", descriptor = "Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3 aClass1_Sub1_Sub6_Sub3_10;

	@OriginalMember(owner = "client!h", name = "ob", descriptor = "Lclient!rc;")
	public static Class1_Sub5 aClass1_Sub5_4;

	@OriginalMember(owner = "client!h", name = "qb", descriptor = "[I")
	public static int[] anIntArray145;

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "[I")
	public static int[] anIntArray142 = new int[500];

	@OriginalMember(owner = "client!h", name = "ab", descriptor = "Z")
	public static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!h", name = "fb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_597 = Static15.method178("Loading title screen )2 ");

	@OriginalMember(owner = "client!h", name = "gb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_598 = Static15.method178("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!h", name = "jb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_599 = aClass23_597;

	@OriginalMember(owner = "client!h", name = "pb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_600 = aClass23_598;

	@OriginalMember(owner = "client!h", name = "rb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_601 = Static15.method178(":");

	@OriginalMember(owner = "client!h", name = "Lb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_604 = Static15.method178("slide:");

	@OriginalMember(owner = "client!h", name = "tb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_602 = aClass23_604;

	@OriginalMember(owner = "client!h", name = "vb", descriptor = "I")
	public static int anInt1076 = 0;

	@OriginalMember(owner = "client!h", name = "Cb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_603 = Static15.method178("mapfunction");

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
	public static void method581() {
		aClass23_602 = null;
		aClass23_603 = null;
		aClass23_601 = null;
		aClass23_597 = null;
		aClass23_598 = null;
		aClass1_Sub1_Sub6_Sub1Array2 = null;
		anIntArray145 = null;
		aClass1_Sub1_Sub6_Sub3_10 = null;
		aClass23_604 = null;
		anIntArray142 = null;
		aClass23_600 = null;
		aClass1_Sub5_4 = null;
		aClass23_599 = null;
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
	public static void method583() {
		while (Static21.method344()) {
			if (Static109.anInt2824 != -1 && Static109.anInt2824 == Static57.anInt1779) {
				if (Static115.anInt2953 == 85 && Static104.aClass23_1520.method525() > 0) {
					Static104.aClass23_1520 = Static104.aClass23_1520.method512(0, Static104.aClass23_1520.method525() - 1);
				}
				if ((Static62.method1210(Static15.anInt324) || Static15.anInt324 == 32) && Static104.aClass23_1520.method525() < 12) {
					Static104.aClass23_1520 = Static104.aClass23_1520.method545(Static15.anInt324);
				}
			} else {
				@Pc(121) int local121;
				if (Static68.aBoolean27) {
					if (Static115.anInt2953 == 85 && Static104.aClass23_1525.method525() > 0) {
						Static104.aClass23_1525 = Static104.aClass23_1525.method512(0, Static104.aClass23_1525.method525() - 1);
						Static102.aBoolean123 = true;
					}
					if (Static67.method1267(Static15.anInt324) && Static104.aClass23_1525.method525() < 80) {
						Static104.aClass23_1525 = Static104.aClass23_1525.method545(Static15.anInt324);
						Static102.aBoolean123 = true;
					}
					if (Static115.anInt2953 == 84) {
						Static68.aBoolean27 = false;
						Static102.aBoolean123 = true;
						@Pc(76) long local76;
						if (Static17.anInt429 == 1) {
							local76 = Static104.aClass23_1525.method516();
							Static66.method1261(local76);
						}
						if (Static17.anInt429 == 2 && Static8.anInt186 > 0) {
							local76 = Static104.aClass23_1525.method516();
							Static61.method1203(local76);
						}
						if (Static17.anInt429 == 3 && Static104.aClass23_1525.method525() > 0) {
							Static76.aClass1_Sub5_Sub1_2.method731(79);
							Static76.aClass1_Sub5_Sub1_2.method674(0);
							local121 = Static76.aClass1_Sub5_Sub1_2.anInt1266;
							Static76.aClass1_Sub5_Sub1_2.method711(Static67.aLong51);
							Static60.method1127(Static76.aClass1_Sub5_Sub1_2, Static104.aClass23_1525);
							Static76.aClass1_Sub5_Sub1_2.method684(Static76.aClass1_Sub5_Sub1_2.anInt1266 - local121);
							if (Static77.anInt2097 == 2) {
								Static74.aBoolean89 = true;
								Static77.anInt2097 = 1;
								Static76.aClass1_Sub5_Sub1_2.method731(96);
								Static76.aClass1_Sub5_Sub1_2.method674(Static2.anInt2292);
								Static76.aClass1_Sub5_Sub1_2.method674(Static77.anInt2097);
								Static76.aClass1_Sub5_Sub1_2.method674(Static62.anInt1905);
							}
						}
						if (Static17.anInt429 == 4 && Static35.anInt1118 < 100) {
							local76 = Static104.aClass23_1525.method516();
							Static21.method346(local76);
						}
						if (Static17.anInt429 == 5 && Static35.anInt1118 > 0) {
							local76 = Static104.aClass23_1525.method516();
							Static20.method337(local76);
						}
					}
				} else if (Static44.anInt1485 == 1) {
					if (Static115.anInt2953 == 85 && Static104.aClass23_1522.method525() > 0) {
						Static104.aClass23_1522 = Static104.aClass23_1522.method512(0, Static104.aClass23_1522.method525() - 1);
						Static102.aBoolean123 = true;
					}
					if (Static87.method1873(Static15.anInt324) && Static104.aClass23_1522.method525() < 10) {
						Static104.aClass23_1522 = Static104.aClass23_1522.method545(Static15.anInt324);
						Static102.aBoolean123 = true;
					}
					if (Static115.anInt2953 == 84) {
						if (Static104.aClass23_1522.method525() > 0) {
							local121 = 0;
							if (Static104.aClass23_1522.method544()) {
								local121 = Static104.aClass23_1522.method509();
							}
							Static76.aClass1_Sub5_Sub1_2.method731(111);
							Static76.aClass1_Sub5_Sub1_2.method679(local121);
						}
						Static102.aBoolean123 = true;
						Static44.anInt1485 = 0;
					}
				} else if (Static44.anInt1485 == 2) {
					if (Static115.anInt2953 == 85 && Static104.aClass23_1522.method525() > 0) {
						Static104.aClass23_1522 = Static104.aClass23_1522.method512(0, Static104.aClass23_1522.method525() - 1);
						Static102.aBoolean123 = true;
					}
					if ((Static62.method1210(Static15.anInt324) || Static15.anInt324 == 32) && Static104.aClass23_1522.method525() < 12) {
						Static104.aClass23_1522 = Static104.aClass23_1522.method545(Static15.anInt324);
						Static102.aBoolean123 = true;
					}
					if (Static115.anInt2953 == 84) {
						if (Static104.aClass23_1522.method525() > 0) {
							Static76.aClass1_Sub5_Sub1_2.method731(225);
							Static76.aClass1_Sub5_Sub1_2.method711(Static104.aClass23_1522.method516());
						}
						Static102.aBoolean123 = true;
						Static44.anInt1485 = 0;
					}
				} else if (Static44.anInt1485 == 3) {
					if (Static115.anInt2953 == 85 && Static104.aClass23_1522.method525() > 0) {
						Static104.aClass23_1522 = Static104.aClass23_1522.method512(0, Static104.aClass23_1522.method525() - 1);
						Static102.aBoolean123 = true;
					}
					if (Static67.method1267(Static15.anInt324) && Static104.aClass23_1522.method525() < 40) {
						Static104.aClass23_1522 = Static104.aClass23_1522.method545(Static15.anInt324);
						Static102.aBoolean123 = true;
					}
				} else if (Static92.anInt2913 == -1 && Static77.anInt2096 == -1) {
					if (Static115.anInt2953 == 85 && Static104.aClass23_1529.method525() > 0) {
						Static104.aClass23_1529 = Static104.aClass23_1529.method512(0, Static104.aClass23_1529.method525() - 1);
						Static102.aBoolean123 = true;
					}
					if (Static67.method1267(Static15.anInt324) && Static104.aClass23_1529.method525() < 80) {
						Static104.aClass23_1529 = Static104.aClass23_1529.method545(Static15.anInt324);
						Static102.aBoolean123 = true;
					}
					if (Static115.anInt2953 == 84 && Static104.aClass23_1529.method525() > 0) {
						if (Static90.anInt2422 == 2) {
							if (Static104.aClass23_1529.method539(Static8.aClass23_153)) {
								Static1.method42();
							}
							if (Static104.aClass23_1529.method539(Static16.aClass23_240)) {
								Static102.aBoolean122 = true;
							}
							if (Static104.aClass23_1529.method539(Static7.aClass23_136)) {
								Static102.aBoolean122 = false;
							}
							if (Static104.aClass23_1529.method539(Static115.aClass23_1731)) {
								for (local121 = 0; local121 < 4; local121++) {
									for (@Pc(355) int local355 = 1; local355 < 103; local355++) {
										for (@Pc(358) int local358 = 1; local358 < 103; local358++) {
											Static45.aClass50Array1[local121].anIntArrayArray44[local355][local358] = 0;
										}
									}
								}
							}
							if (Static104.aClass23_1529.method539(Static98.aClass23_1434) && Static42.anInt1457 == 2) {
								throw new RuntimeException();
							}
							if (Static104.aClass23_1529.method539(Static25.aClass23_433)) {
								Static82.aBoolean109 = true;
							}
						}
						if (Static104.aClass23_1529.method546(Static71.aClass23_1183)) {
							Static76.aClass1_Sub5_Sub1_2.method731(220);
							Static76.aClass1_Sub5_Sub1_2.method674(Static104.aClass23_1529.method525() - 1);
							Static76.aClass1_Sub5_Sub1_2.method707(Static104.aClass23_1529.method510(2));
						} else {
							@Pc(438) byte local438 = 0;
							@Pc(442) Class23 local442 = Static104.aClass23_1529.method537();
							if (local442.method546(Static13.aClass23_189)) {
								local438 = 0;
								Static104.aClass23_1529 = Static104.aClass23_1529.method510(Static13.aClass23_189.method525());
							} else if (local442.method546(Static55.aClass23_926)) {
								local438 = 1;
								Static104.aClass23_1529 = Static104.aClass23_1529.method510(Static55.aClass23_926.method525());
							} else if (local442.method546(Static8.aClass23_155)) {
								Static104.aClass23_1529 = Static104.aClass23_1529.method510(Static8.aClass23_155.method525());
								local438 = 2;
							} else if (local442.method546(Static82.aClass23_1296)) {
								local438 = 3;
								Static104.aClass23_1529 = Static104.aClass23_1529.method510(Static82.aClass23_1296.method525());
							} else if (local442.method546(Static15.aClass23_234)) {
								local438 = 4;
								Static104.aClass23_1529 = Static104.aClass23_1529.method510(Static15.aClass23_234.method525());
							} else if (local442.method546(Static108.aClass23_1645)) {
								Static104.aClass23_1529 = Static104.aClass23_1529.method510(Static108.aClass23_1645.method525());
								local438 = 5;
							} else if (local442.method546(Static29.aClass23_476)) {
								Static104.aClass23_1529 = Static104.aClass23_1529.method510(Static29.aClass23_476.method525());
								local438 = 6;
							} else if (local442.method546(Static106.aClass23_1559)) {
								local438 = 7;
								Static104.aClass23_1529 = Static104.aClass23_1529.method510(Static106.aClass23_1559.method525());
							} else if (local442.method546(Static47.aClass23_860)) {
								local438 = 8;
								Static104.aClass23_1529 = Static104.aClass23_1529.method510(Static47.aClass23_860.method525());
							} else if (local442.method546(Static36.aClass23_638)) {
								local438 = 9;
								Static104.aClass23_1529 = Static104.aClass23_1529.method510(Static36.aClass23_638.method525());
							} else if (local442.method546(Static11.aClass23_180)) {
								local438 = 10;
								Static104.aClass23_1529 = Static104.aClass23_1529.method510(Static11.aClass23_180.method525());
							} else if (local442.method546(Static45.aClass23_818)) {
								Static104.aClass23_1529 = Static104.aClass23_1529.method510(Static45.aClass23_818.method525());
								local438 = 11;
							}
							@Pc(641) byte local641 = 0;
							local442 = Static104.aClass23_1529.method537();
							if (local442.method546(Static1.aClass23_56)) {
								local641 = 1;
								Static104.aClass23_1529 = Static104.aClass23_1529.method510(Static1.aClass23_56.method525());
							} else if (local442.method546(Static114.aClass23_1726)) {
								local641 = 2;
								Static104.aClass23_1529 = Static104.aClass23_1529.method510(Static114.aClass23_1726.method525());
							} else if (local442.method546(Static47.aClass23_856)) {
								Static104.aClass23_1529 = Static104.aClass23_1529.method510(Static47.aClass23_856.method525());
								local641 = 3;
							} else if (local442.method546(Static70.aClass23_1009)) {
								local641 = 4;
								Static104.aClass23_1529 = Static104.aClass23_1529.method510(Static70.aClass23_1009.method525());
							} else if (local442.method546(aClass23_602)) {
								local641 = 5;
								Static104.aClass23_1529 = Static104.aClass23_1529.method510(aClass23_602.method525());
							}
							Static76.aClass1_Sub5_Sub1_2.method731(161);
							Static76.aClass1_Sub5_Sub1_2.method674(0);
							@Pc(744) int local744 = Static76.aClass1_Sub5_Sub1_2.anInt1266;
							Static76.aClass1_Sub5_Sub1_2.method674(local438);
							Static76.aClass1_Sub5_Sub1_2.method674(local641);
							Static60.method1127(Static76.aClass1_Sub5_Sub1_2, Static104.aClass23_1529);
							Static76.aClass1_Sub5_Sub1_2.method684(Static76.aClass1_Sub5_Sub1_2.anInt1266 - local744);
							if (Static2.anInt2292 == 2) {
								Static2.anInt2292 = 3;
								Static74.aBoolean89 = true;
								Static76.aClass1_Sub5_Sub1_2.method731(96);
								Static76.aClass1_Sub5_Sub1_2.method674(Static2.anInt2292);
								Static76.aClass1_Sub5_Sub1_2.method674(Static77.anInt2097);
								Static76.aClass1_Sub5_Sub1_2.method674(Static62.anInt1905);
							}
						}
						Static102.aBoolean123 = true;
						Static104.aClass23_1529 = Static104.aClass23_1523;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!we;ZI)V")
	public static void method584(@OriginalArg(0) Class68 arg0, @OriginalArg(1) boolean arg1) {
		if (Static13.aClass68_1 != null) {
			try {
				Static13.aClass68_1.method1935();
			} catch (@Pc(12) Exception local12) {
			}
			Static13.aClass68_1 = null;
		}
		Static13.aClass68_1 = arg0;
		Static94.method1611(arg1);
		Static7.anInt178 = 0;
		Static105.aClass1_Sub1_Sub11_1 = null;
		aClass1_Sub5_4 = null;
		Static96.aClass1_Sub5_9.anInt1266 = 0;
		while (true) {
			@Pc(33) Class1_Sub1_Sub11 local33 = (Class1_Sub1_Sub11) Static31.aClass14_6.method340();
			if (local33 == null) {
				while (true) {
					local33 = (Class1_Sub1_Sub11) Static29.aClass14_5.method340();
					if (local33 == null) {
						if (Static105.aByte2 != 0) {
							try {
								@Pc(90) Class1_Sub5 local90 = new Class1_Sub5(4);
								local90.method674(4);
								local90.method674(Static105.aByte2);
								local90.method686(0);
								Static13.aClass68_1.method1942(local90.aByteArray6, 4);
							} catch (@Pc(115) IOException local115) {
								try {
									Static13.aClass68_1.method1935();
								} catch (@Pc(120) Exception local120) {
								}
								Static13.aClass68_1 = null;
								Static95.anInt2504++;
							}
						}
						Static17.anInt428 = 0;
						Static48.aLong41 = Static82.method1454();
						return;
					}
					Static75.aClass38_2.method1206(local33);
					Static107.aClass14_7.method345(local33, local33.aLong85);
					Static88.anInt1218++;
					Static42.anInt1444--;
				}
			}
			Static29.aClass14_4.method345(local33, local33.aLong85);
			Static94.anInt2484--;
			Static52.anInt1630++;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Ljava/lang/Object;IILclient!ee;II)V")
	public static void method585(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub7 arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = (Integer) arg0[0];
		@Pc(13) Class1_Sub1_Sub12 local13 = Static70.method1139(local5);
		if (local13 == null) {
			return;
		}
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		@Pc(32) int local32 = -1;
		@Pc(37) int[] local37 = local13.anIntArray324;
		@Pc(40) int[] local40 = local13.anIntArray326;
		try {
			@Pc(42) int local42 = 0;
			@Pc(44) int local44 = 0;
			Static39.anIntArray163 = new int[local13.anInt2418];
			Static69.aClass23Array14 = new Class23[local13.anInt2424];
			@Pc(66) int local66;
			for (@Pc(54) int local54 = 1; local54 < arg0.length; local54++) {
				if (arg0[local54] instanceof Integer) {
					local66 = (Integer) arg0[local54];
					if (local66 == -2147483647) {
						local66 = arg2;
					}
					if (local66 == -2147483646) {
						local66 = arg1;
					}
					if (local66 == -2147483645) {
						if (arg3.anInt826 < 0) {
							local66 = arg3.anInt833;
						} else {
							local66 = arg3.anInt826;
						}
					}
					if (local66 == -2147483644) {
						local66 = arg4;
					}
					if (local66 == -2147483643) {
						if (arg3.anInt826 >= 0) {
							local66 = -1;
						} else {
							local66 = arg3.anInt826 & 0x7FFF;
						}
					}
					Static39.anIntArray163[local42++] = local66;
				} else if (arg0[local54] instanceof Class23) {
					Static69.aClass23Array14[local44++] = (Class23) arg0[local54];
				}
			}
			label1187: while (true) {
				local32++;
				@Pc(150) int local150 = local40[local32];
				@Pc(684) int local684;
				@Pc(546) Class23[] local546;
				@Pc(548) int local548;
				@Pc(568) int local568;
				@Pc(673) int local673;
				@Pc(509) Class23 local509;
				if (local150 < 100) {
					if (local150 == 0) {
						Static55.anIntArray201[local18++] = local37[local32];
						continue;
					}
					if (local150 == 1) {
						local66 = local37[local32];
						Static55.anIntArray201[local18++] = Static40.anIntArray164[local66];
						continue;
					}
					if (local150 == 2) {
						local66 = local37[local32];
						local18--;
						Static40.anIntArray164[local66] = Static55.anIntArray201[local18];
						continue;
					}
					if (local150 == 3) {
						Static110.aClass23Array19[local20++] = local13.aClass23Array16[local32];
						continue;
					}
					if (local150 == 6) {
						local32 += local37[local32];
						continue;
					}
					if (local150 == 7) {
						local18 -= 2;
						if (Static55.anIntArray201[local18] != Static55.anIntArray201[local18 + 1]) {
							local32 += local37[local32];
						}
						continue;
					}
					if (local150 == 8) {
						local18 -= 2;
						if (Static55.anIntArray201[local18 + 1] == Static55.anIntArray201[local18]) {
							local32 += local37[local32];
						}
						continue;
					}
					if (local150 == 9) {
						local18 -= 2;
						if (Static55.anIntArray201[local18] < Static55.anIntArray201[local18 + 1]) {
							local32 += local37[local32];
						}
						continue;
					}
					if (local150 == 10) {
						local18 -= 2;
						if (Static55.anIntArray201[local18] > Static55.anIntArray201[local18 + 1]) {
							local32 += local37[local32];
						}
						continue;
					}
					if (local150 == 21) {
						if (Static44.anInt1482 == 0) {
							return;
						}
						@Pc(335) Class56 local335 = Static31.aClass56Array1[--Static44.anInt1482];
						local32 = local335.anInt2392;
						local13 = local335.aClass1_Sub1_Sub12_1;
						Static69.aClass23Array14 = local335.aClass23Array15;
						local37 = local13.anIntArray324;
						Static39.anIntArray163 = local335.anIntArray321;
						local40 = local13.anIntArray326;
						continue;
					}
					if (local150 == 25) {
						local66 = local37[local32];
						Static55.anIntArray201[local18++] = Static1.method44(local66);
						continue;
					}
					if (local150 == 27) {
						local66 = local37[local32];
						local18--;
						Static21.method342(local66, Static55.anIntArray201[local18]);
						continue;
					}
					if (local150 == 31) {
						local18 -= 2;
						if (Static55.anIntArray201[local18] <= Static55.anIntArray201[local18 + 1]) {
							local32 += local37[local32];
						}
						continue;
					}
					if (local150 == 32) {
						local18 -= 2;
						if (Static55.anIntArray201[local18 + 1] <= Static55.anIntArray201[local18]) {
							local32 += local37[local32];
						}
						continue;
					}
					if (local150 == 33) {
						Static55.anIntArray201[local18++] = Static39.anIntArray163[local37[local32]];
						continue;
					}
					@Pc(456) int local456;
					if (local150 == 34) {
						local456 = local37[local32];
						local18--;
						Static39.anIntArray163[local456] = Static55.anIntArray201[local18];
						continue;
					}
					if (local150 == 35) {
						Static110.aClass23Array19[local20++] = Static69.aClass23Array14[local37[local32]];
						continue;
					}
					if (local150 == 36) {
						local456 = local37[local32];
						local20--;
						Static69.aClass23Array14[local456] = Static110.aClass23Array19[local20];
						continue;
					}
					if (local150 == 37) {
						local66 = local37[local32];
						local20 -= local66;
						local509 = Static109.method1861(local20, local66, Static110.aClass23Array19);
						Static110.aClass23Array19[local20++] = local509;
						continue;
					}
					if (local150 == 38) {
						local18--;
						continue;
					}
					if (local150 == 39) {
						local20--;
						continue;
					}
					if (local150 == 40) {
						local66 = local37[local32];
						@Pc(538) Class1_Sub1_Sub12 local538 = Static70.method1139(local66);
						@Pc(542) int[] local542 = new int[local538.anInt2418];
						local546 = new Class23[local538.anInt2424];
						for (local548 = 0; local548 < local538.anInt2426; local548++) {
							local542[local548] = Static55.anIntArray201[local18 + local548 - local538.anInt2426];
						}
						for (local568 = 0; local568 < local538.anInt2421; local568++) {
							local546[local568] = Static110.aClass23Array19[local20 + local568 - local538.anInt2421];
						}
						local20 -= local538.anInt2421;
						local18 -= local538.anInt2426;
						@Pc(599) Class56 local599 = new Class56();
						local599.anIntArray321 = Static39.anIntArray163;
						local599.anInt2392 = local32;
						local32 = -1;
						local599.aClass23Array15 = Static69.aClass23Array14;
						local599.aClass1_Sub1_Sub12_1 = local13;
						Static31.aClass56Array1[Static44.anInt1482++] = local599;
						Static69.aClass23Array14 = local546;
						local13 = local538;
						local40 = local538.anIntArray326;
						Static39.anIntArray163 = local542;
						local37 = local538.anIntArray324;
						continue;
					}
					if (local150 == 42) {
						Static55.anIntArray201[local18++] = Static48.anIntArray184[local37[local32]];
						continue;
					}
					if (local150 == 43) {
						local456 = local37[local32];
						local18--;
						Static48.anIntArray184[local456] = Static55.anIntArray201[local18];
						continue;
					}
					if (local150 == 44) {
						local673 = local37[local32] & 0xFFFF;
						local66 = local37[local32] >> 16;
						local18--;
						local684 = Static55.anIntArray201[local18];
						if (local684 >= 0 && local684 <= 5000) {
							Static106.anIntArray375[local66] = local684;
							@Pc(704) byte local704 = -1;
							if (local673 == 105) {
								local704 = 0;
							}
							local548 = 0;
							while (true) {
								if (local684 <= local548) {
									continue label1187;
								}
								Static102.anIntArrayArray60[local66][local548] = local704;
								local548++;
							}
						}
						throw new RuntimeException();
					}
					if (local150 == 45) {
						local18--;
						local673 = Static55.anIntArray201[local18];
						local66 = local37[local32];
						if (local673 >= 0 && local673 < Static106.anIntArray375[local66]) {
							Static55.anIntArray201[local18++] = Static102.anIntArrayArray60[local66][local673];
							continue;
						}
						throw new RuntimeException();
					}
					if (local150 == 46) {
						local18 -= 2;
						local66 = local37[local32];
						local673 = Static55.anIntArray201[local18];
						if (local673 >= 0 && Static106.anIntArray375[local66] > local673) {
							Static102.anIntArrayArray60[local66][local673] = Static55.anIntArray201[local18 + 1];
							continue;
						}
						throw new RuntimeException();
					}
				}
				@Pc(815) boolean local815;
				if (local37[local32] == 1) {
					local815 = true;
				} else {
					local815 = false;
				}
				@Pc(851) Class1_Sub1_Sub7 local851;
				@Pc(2399) int local2399;
				@Pc(1331) int local1331;
				@Pc(3162) Class1_Sub1_Sub7 local3162;
				@Pc(1377) Class1_Sub1_Sub7 local1377;
				if (local150 < 1000) {
					if (local150 == 100) {
						local18 -= 3;
						local684 = Static55.anIntArray201[local18 + 1];
						local673 = Static55.anIntArray201[local18];
						local1331 = Static55.anIntArray201[local18 + 2];
						@Pc(3927) Class1_Sub1_Sub7 local3927 = Static15.method174(local673);
						if (local3927.aClass1_Sub1_Sub7Array1 == null) {
							local3927.aClass1_Sub1_Sub7Array1 = new Class1_Sub1_Sub7[local1331 + 1];
						}
						if (local1331 >= local3927.aClass1_Sub1_Sub7Array1.length) {
							@Pc(3946) Class1_Sub1_Sub7[] local3946 = new Class1_Sub1_Sub7[local1331 + 1];
							for (local2399 = 0; local2399 < local3927.aClass1_Sub1_Sub7Array1.length; local2399++) {
								local3946[local2399] = local3927.aClass1_Sub1_Sub7Array1[local2399];
							}
							local3927.aClass1_Sub1_Sub7Array1 = local3946;
						}
						local3162 = new Class1_Sub1_Sub7();
						local3162.anInt833 = local3927.anInt826;
						local3162.aBoolean39 = true;
						local3162.anInt826 = Integer.MIN_VALUE + ((local3927.anInt826 & 0xFFFF) << 15) + local1331;
						local3162.anInt802 = local684;
						local3927.aClass1_Sub1_Sub7Array1[local1331] = local3162;
						if (local815) {
							Static71.aClass1_Sub1_Sub7_4 = local3162;
						} else {
							Static51.aClass1_Sub1_Sub7_3 = local3162;
						}
						Static96.method1108(local3927);
						continue;
					}
					if (local150 == 101) {
						local851 = local815 ? Static71.aClass1_Sub1_Sub7_4 : Static51.aClass1_Sub1_Sub7_3;
						local1377 = Static15.method174(local851.anInt833);
						local1377.aClass1_Sub1_Sub7Array1[local851.anInt826 & 0x7FFF] = null;
						Static96.method1108(local1377);
						continue;
					}
					if (local150 == 102) {
						local18--;
						local851 = Static15.method174(Static55.anIntArray201[local18]);
						local851.aClass1_Sub1_Sub7Array1 = null;
						Static96.method1108(local851);
						continue;
					}
				} else if (local150 >= 1000 && local150 < 1100 || local150 >= 2000 && local150 < 2100) {
					if (local150 >= 2000) {
						local18--;
						local851 = Static15.method174(Static55.anIntArray201[local18]);
						local150 -= 1000;
					} else {
						local851 = local815 ? Static71.aClass1_Sub1_Sub7_4 : Static51.aClass1_Sub1_Sub7_3;
					}
					Static96.method1108(local851);
					if (local150 == 1000) {
						local18 -= 2;
						local851.anInt816 = Static55.anIntArray201[local18];
						local851.anInt820 = Static55.anIntArray201[local18 + 1];
						continue;
					}
					if (local150 == 1001) {
						local18 -= 2;
						local851.anInt823 = Static55.anIntArray201[local18];
						local851.anInt817 = Static55.anIntArray201[local18 + 1];
						continue;
					}
					if (local150 == 1003) {
						local18--;
						local851.aBoolean36 = Static55.anIntArray201[local18] == 1;
						continue;
					}
					if (local150 == 1004) {
						local18--;
						local851.aBoolean41 = Static55.anIntArray201[local18] == 1;
						continue;
					}
				} else if (local150 >= 1100 && local150 < 1200 || local150 >= 2100 && local150 < 2200) {
					if (local150 < 2000) {
						local851 = local815 ? Static71.aClass1_Sub1_Sub7_4 : Static51.aClass1_Sub1_Sub7_3;
					} else {
						local150 -= 1000;
						local18--;
						local851 = Static15.method174(Static55.anIntArray201[local18]);
					}
					Static96.method1108(local851);
					if (local150 == 1100) {
						local18 -= 2;
						local851.anInt832 = Static55.anIntArray201[local18];
						local851.anInt822 = Static55.anIntArray201[local18 + 1];
						continue;
					}
					if (local150 == 1101) {
						local18--;
						local851.anInt798 = Static55.anIntArray201[local18];
						continue;
					}
					if (local150 == 1102) {
						local18--;
						local851.aBoolean53 = Static55.anIntArray201[local18] == 1;
						continue;
					}
					if (local150 == 1103) {
						local18--;
						local851.anInt834 = Static55.anIntArray201[local18];
						continue;
					}
					if (local150 == 1104) {
						local18--;
						local851.anInt794 = Static55.anIntArray201[local18];
						continue;
					}
					if (local150 == 1105) {
						local18--;
						local851.anInt812 = Static55.anIntArray201[local18];
						continue;
					}
					if (local150 == 1106) {
						local18--;
						local851.anInt819 = Static55.anIntArray201[local18];
						continue;
					}
					if (local150 == 1107) {
						local18--;
						local851.aBoolean49 = Static55.anIntArray201[local18] == 1;
						continue;
					}
					if (local150 == 1108) {
						local851.anInt793 = 1;
						local18--;
						local851.anInt824 = Static55.anIntArray201[local18];
						continue;
					}
					if (local150 == 1109) {
						local18 -= 6;
						local851.anInt814 = Static55.anIntArray201[local18];
						local851.anInt838 = Static55.anIntArray201[local18 + 1];
						local851.anInt801 = Static55.anIntArray201[local18 + 2];
						local851.anInt792 = Static55.anIntArray201[local18 + 3];
						local851.anInt843 = Static55.anIntArray201[local18 + 4];
						local851.anInt791 = Static55.anIntArray201[local18 + 5];
						continue;
					}
					if (local150 == 1110) {
						local18--;
						local851.anInt846 = Static55.anIntArray201[local18];
						continue;
					}
					if (local150 == 1111) {
						local18--;
						local851.aBoolean42 = Static55.anIntArray201[local18] == 1;
						continue;
					}
					if (local150 == 1112) {
						local20--;
						local851.aClass23_461 = Static110.aClass23Array19[local20];
						continue;
					}
					if (local150 == 1113) {
						local18--;
						local851.anInt815 = Static55.anIntArray201[local18];
						continue;
					}
					if (local150 == 1114) {
						local18 -= 3;
						local851.anInt790 = Static55.anIntArray201[local18];
						local851.anInt831 = Static55.anIntArray201[local18 + 1];
						local851.anInt836 = Static55.anIntArray201[local18 + 2];
						continue;
					}
					if (local150 == 1115) {
						local18--;
						local851.aBoolean52 = Static55.anIntArray201[local18] == 1;
						continue;
					}
					if (local150 == 1116) {
						local18--;
						local851.anInt804 = Static55.anIntArray201[local18];
						continue;
					}
					if (local150 == 1117) {
						local18--;
						local851.anInt796 = Static55.anIntArray201[local18];
						continue;
					}
					if (local150 == 1118) {
						local18--;
						local851.aBoolean45 = Static55.anIntArray201[local18] == 1;
						continue;
					}
					if (local150 == 1119) {
						local18--;
						local851.aBoolean44 = Static55.anIntArray201[local18] == 1;
						continue;
					}
				} else if (local150 >= 1200 && local150 < 1300 || local150 >= 2200 && local150 < 2300) {
					if (local150 >= 2000) {
						local18--;
						local851 = Static15.method174(Static55.anIntArray201[local18]);
						local150 -= 1000;
					} else {
						local851 = local815 ? Static71.aClass1_Sub1_Sub7_4 : Static51.aClass1_Sub1_Sub7_3;
					}
					Static96.method1108(local851);
					if (local150 == 1200) {
						local18 -= 2;
						local684 = Static55.anIntArray201[local18];
						local1331 = Static55.anIntArray201[local18 + 1];
						local851.anInt848 = local1331;
						local851.anInt811 = local684;
						continue;
					}
					if (local150 == 1201) {
						local851.anInt793 = 2;
						local18--;
						local851.anInt824 = Static55.anIntArray201[local18];
						continue;
					}
					if (local150 == 1202) {
						local851.anInt793 = 3;
						local851.anInt824 = Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass58_2.method1613();
						continue;
					}
					if (local150 == 1203) {
						local1377 = local815 ? Static51.aClass1_Sub1_Sub7_3 : Static71.aClass1_Sub1_Sub7_4;
						local851.anInt850 = local1377.anInt826;
						continue;
					}
				} else {
					@Pc(2300) Class23 local2300;
					if ((local150 < 1300 || local150 >= 1400) && (local150 < 2300 || local150 >= 2400)) {
						@Pc(3149) boolean local3149;
						if (local150 < 1500) {
							if (local150 == 1400) {
								local18 -= 2;
								local673 = Static55.anIntArray201[local18];
								local684 = Static55.anIntArray201[local18 + 1];
								@Pc(3302) Class1_Sub1_Sub7 local3302 = Static15.method174(local673);
								if (local3302.aClass1_Sub1_Sub7Array1 != null && local684 < local3302.aClass1_Sub1_Sub7Array1.length && local3302.aClass1_Sub1_Sub7Array1[local684] != null) {
									Static55.anIntArray201[local18++] = 1;
									if (local815) {
										Static71.aClass1_Sub1_Sub7_4 = local3302.aClass1_Sub1_Sub7Array1[local684];
									} else {
										Static51.aClass1_Sub1_Sub7_3 = local3302.aClass1_Sub1_Sub7Array1[local684];
									}
									continue;
								}
								Static55.anIntArray201[local18++] = 0;
								continue;
							}
							if (local150 == 1401) {
								local18 -= 4;
								local673 = Static55.anIntArray201[local18];
								local1331 = Static55.anIntArray201[local18 + 2];
								local684 = Static55.anIntArray201[local18 + 1];
								local3149 = Static55.anIntArray201[local18 + 3] == 1;
								local3162 = Static63.method1227(local3149, local1331, -1, Static105.aClass1_Sub1_Sub7ArrayArray1[local673], local684, 0, true, 0);
								if (local3162 == null) {
									Static55.anIntArray201[local18++] = 0;
								} else {
									Static55.anIntArray201[local18++] = 1;
									if (local815) {
										Static71.aClass1_Sub1_Sub7_4 = local3162;
									} else {
										Static51.aClass1_Sub1_Sub7_3 = local3162;
									}
								}
								continue;
							}
							if (local150 == 1402) {
								local18 -= 4;
								local851 = Static15.method174(Static55.anIntArray201[local18]);
								local1331 = Static55.anIntArray201[local18 + 2];
								local684 = Static55.anIntArray201[local18 + 1];
								local3149 = Static55.anIntArray201[local18 + 3] == 1;
								local3162 = Static63.method1227(local3149, local1331, local851.anInt826, local851.aClass1_Sub1_Sub7Array1, local684, local851.anInt822, true, local851.anInt832);
								if (local3162 == null) {
									Static55.anIntArray201[local18++] = 0;
								} else {
									Static55.anIntArray201[local18++] = 1;
									if (local815) {
										Static71.aClass1_Sub1_Sub7_4 = local3162;
									} else {
										Static51.aClass1_Sub1_Sub7_3 = local3162;
									}
								}
								continue;
							}
						} else if (local150 < 1600) {
							local851 = local815 ? Static71.aClass1_Sub1_Sub7_4 : Static51.aClass1_Sub1_Sub7_3;
							if (local150 == 1500) {
								Static55.anIntArray201[local18++] = local851.anInt816;
								continue;
							}
							if (local150 == 1501) {
								Static55.anIntArray201[local18++] = local851.anInt820;
								continue;
							}
							if (local150 == 1502) {
								Static55.anIntArray201[local18++] = local851.anInt823;
								continue;
							}
							if (local150 == 1503) {
								Static55.anIntArray201[local18++] = local851.anInt817;
								continue;
							}
							if (local150 == 1504) {
								Static55.anIntArray201[local18++] = local851.aBoolean36 ? 1 : 0;
								continue;
							}
							if (local150 == 1505) {
								Static55.anIntArray201[local18++] = local851.anInt833;
								continue;
							}
						} else if (local150 < 1700) {
							local851 = local815 ? Static71.aClass1_Sub1_Sub7_4 : Static51.aClass1_Sub1_Sub7_3;
							if (local150 == 1600) {
								Static55.anIntArray201[local18++] = local851.anInt832;
								continue;
							}
							if (local150 == 1601) {
								Static55.anIntArray201[local18++] = local851.anInt822;
								continue;
							}
							if (local150 == 1602) {
								Static110.aClass23Array19[local20++] = local851.aClass23_461;
								continue;
							}
						} else if (local150 < 1800) {
							local851 = local815 ? Static71.aClass1_Sub1_Sub7_4 : Static51.aClass1_Sub1_Sub7_3;
							if (local150 == 1700) {
								Static55.anIntArray201[local18++] = local851.anInt811;
								continue;
							}
							if (local150 == 1701) {
								if (local851.anInt811 == -1) {
									Static55.anIntArray201[local18++] = 0;
								} else {
									Static55.anIntArray201[local18++] = local851.anInt848;
								}
								continue;
							}
							if (local150 == 1702) {
								Static55.anIntArray201[local18++] = local851.anInt826 & 0x7FFF;
								continue;
							}
						} else if (local150 < 2500) {
							if (local150 == 2401) {
								local18 -= 4;
								local673 = Static55.anIntArray201[local18];
								local684 = Static55.anIntArray201[local18 + 1];
								local1331 = Static55.anIntArray201[local18 + 2];
								local3149 = Static55.anIntArray201[local18 + 3] == 1;
								local3162 = Static63.method1227(local3149, local1331, -1, Static105.aClass1_Sub1_Sub7ArrayArray1[local673], local684, 0, false, 0);
								if (local3162 == null) {
									Static55.anIntArray201[local18++] = -1;
								} else {
									Static55.anIntArray201[local18++] = local3162.anInt826;
								}
								continue;
							}
							if (local150 == 2402) {
								local18 -= 4;
								local851 = Static15.method174(Static55.anIntArray201[local18]);
								local684 = Static55.anIntArray201[local18 + 1];
								local1331 = Static55.anIntArray201[local18 + 2];
								local3149 = Static55.anIntArray201[local18 + 3] == 1;
								local3162 = Static63.method1227(local3149, local1331, local851.anInt826, Static105.aClass1_Sub1_Sub7ArrayArray1[local851.anInt826 >> 16], local684, local851.anInt822, false, local851.anInt832);
								if (local3162 == null) {
									Static55.anIntArray201[local18++] = -1;
								} else {
									Static55.anIntArray201[local18++] = local3162.anInt826;
								}
								continue;
							}
						} else if (local150 < 2600) {
							local18--;
							local851 = Static15.method174(Static55.anIntArray201[local18]);
							if (local150 == 2500) {
								Static55.anIntArray201[local18++] = local851.anInt816;
								continue;
							}
							if (local150 == 2501) {
								Static55.anIntArray201[local18++] = local851.anInt820;
								continue;
							}
							if (local150 == 2502) {
								Static55.anIntArray201[local18++] = local851.anInt823;
								continue;
							}
							if (local150 == 2503) {
								Static55.anIntArray201[local18++] = local851.anInt817;
								continue;
							}
							if (local150 == 2504) {
								Static55.anIntArray201[local18++] = local851.aBoolean36 ? 1 : 0;
								continue;
							}
							if (local150 == 2505) {
								Static55.anIntArray201[local18++] = local851.anInt833;
								continue;
							}
						} else if (local150 < 2700) {
							local18--;
							local851 = Static15.method174(Static55.anIntArray201[local18]);
							if (local150 == 2600) {
								Static55.anIntArray201[local18++] = local851.anInt832;
								continue;
							}
							if (local150 == 2601) {
								Static55.anIntArray201[local18++] = local851.anInt822;
								continue;
							}
							if (local150 == 2602) {
								Static110.aClass23Array19[local20++] = local851.aClass23_461;
								continue;
							}
						} else if (local150 < 2800) {
							local18--;
							local851 = Static15.method174(Static55.anIntArray201[local18]);
							if (local150 == 2700) {
								Static55.anIntArray201[local18++] = local851.anInt811;
								continue;
							}
							if (local150 == 2701) {
								if (local851.anInt811 == -1) {
									Static55.anIntArray201[local18++] = 0;
								} else {
									Static55.anIntArray201[local18++] = local851.anInt848;
								}
								continue;
							}
						} else if (local150 < 3100) {
							if (local150 == 3000) {
								local18--;
								local673 = Static55.anIntArray201[local18];
								if (Static47.anInt1599 == -1) {
									Static40.method869(local673, -1);
									Static47.anInt1599 = local673;
								}
								continue;
							}
							if (local150 == 3001) {
								local18 -= 2;
								local684 = Static55.anIntArray201[local18 + 1];
								local673 = Static55.anIntArray201[local18];
								Static57.method1099(local684, -1, local673);
								continue;
							}
							if (local150 == 3002) {
								local851 = local815 ? Static71.aClass1_Sub1_Sub7_4 : Static51.aClass1_Sub1_Sub7_3;
								if (Static47.anInt1599 == -1) {
									Static40.method869(local851.anInt833, local851.anInt826 & 0x7FFF);
									Static47.anInt1599 = local851.anInt826;
								}
								continue;
							}
							if (local150 == 3003) {
								local851 = local815 ? Static71.aClass1_Sub1_Sub7_4 : Static51.aClass1_Sub1_Sub7_3;
								local18--;
								local684 = Static55.anIntArray201[local18];
								Static57.method1099(local684, local851.anInt826 & 0x7FFF, local851.anInt833);
								continue;
							}
						} else if (local150 < 3200) {
							if (local150 == 3100) {
								local20--;
								local509 = Static110.aClass23Array19[local20];
								Static63.method1229(Static31.aClass23_528, local509, 0);
								continue;
							}
							if (local150 == 3101) {
								local18 -= 2;
								Static52.method995(Static55.anIntArray201[local18 + 1], Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1, Static55.anIntArray201[local18]);
								continue;
							}
							if (local150 == 3102) {
								local18--;
								local673 = Static55.anIntArray201[local18];
								if (local673 >= 0 && local673 < Static90.anIntArray325.length && Static90.anIntArray325[local673] != -1) {
									aBoolean60 = true;
									Static106.anInt2723 = local673;
									Static64.aBoolean98 = true;
								}
								continue;
							}
							if (local150 == 3103) {
								Static42.method906();
								continue;
							}
						} else if (local150 < 3300) {
							if (local150 == 3200) {
								local18 -= 3;
								Static99.method1663(Static55.anIntArray201[local18], Static55.anIntArray201[local18 + 1], Static55.anIntArray201[local18 + 2]);
								continue;
							}
							if (local150 == 3201) {
								local18--;
								Static84.method1473(Static55.anIntArray201[local18]);
								continue;
							}
							if (local150 == 3202) {
								local18 -= 2;
								Static114.method1927(Static55.anIntArray201[local18 + 1], Static55.anIntArray201[local18]);
								continue;
							}
						} else if (local150 < 3400) {
							if (local150 == 3300) {
								Static55.anIntArray201[local18++] = Static7.anInt176;
								continue;
							}
							if (local150 == 3301) {
								local18 -= 2;
								local673 = Static55.anIntArray201[local18];
								local684 = Static55.anIntArray201[local18 + 1];
								Static55.anIntArray201[local18++] = Static11.method117(local673, local684);
								continue;
							}
							if (local150 == 3302) {
								local18 -= 2;
								local673 = Static55.anIntArray201[local18];
								local684 = Static55.anIntArray201[local18 + 1];
								Static55.anIntArray201[local18++] = Static68.method222(local673, local684);
								continue;
							}
							if (local150 == 3303) {
								local18 -= 2;
								local673 = Static55.anIntArray201[local18];
								local684 = Static55.anIntArray201[local18 + 1];
								Static55.anIntArray201[local18++] = Static104.method1781(local673, local684);
								continue;
							}
							if (local150 == 3304) {
								local18--;
								local673 = Static55.anIntArray201[local18];
								Static55.anIntArray201[local18++] = Static2.method1421(local673).anInt1931;
								continue;
							}
							if (local150 == 3305) {
								local18--;
								local673 = Static55.anIntArray201[local18];
								Static55.anIntArray201[local18++] = Static109.anIntArray395[local673];
								continue;
							}
							if (local150 == 3306) {
								local18--;
								local673 = Static55.anIntArray201[local18];
								Static55.anIntArray201[local18++] = Static63.anIntArray225[local673];
								continue;
							}
						} else if (local150 < 4100) {
							if (local150 == 4000) {
								local18 -= 2;
								local673 = Static55.anIntArray201[local18];
								local684 = Static55.anIntArray201[local18 + 1];
								Static55.anIntArray201[local18++] = local684 + local673;
								continue;
							}
							if (local150 == 4001) {
								local18 -= 2;
								local673 = Static55.anIntArray201[local18];
								local684 = Static55.anIntArray201[local18 + 1];
								Static55.anIntArray201[local18++] = local673 - local684;
								continue;
							}
							if (local150 == 4002) {
								local18 -= 2;
								local673 = Static55.anIntArray201[local18];
								local684 = Static55.anIntArray201[local18 + 1];
								Static55.anIntArray201[local18++] = local673 * local684;
								continue;
							}
							if (local150 == 4003) {
								local18 -= 2;
								local684 = Static55.anIntArray201[local18 + 1];
								local673 = Static55.anIntArray201[local18];
								Static55.anIntArray201[local18++] = local673 / local684;
								continue;
							}
							if (local150 == 4004) {
								local18--;
								local673 = Static55.anIntArray201[local18];
								Static55.anIntArray201[local18++] = (int) ((double) local673 * Math.random());
								continue;
							}
							if (local150 == 4005) {
								local18--;
								local673 = Static55.anIntArray201[local18];
								Static55.anIntArray201[local18++] = (int) (Math.random() * (double) (local673 + 1));
								continue;
							}
							if (local150 == 4006) {
								local18 -= 5;
								local673 = Static55.anIntArray201[local18];
								local684 = Static55.anIntArray201[local18 + 1];
								local1331 = Static55.anIntArray201[local18 + 2];
								local548 = Static55.anIntArray201[local18 + 3];
								local568 = Static55.anIntArray201[local18 + 4];
								Static55.anIntArray201[local18++] = local673 + (local684 - local673) * (local568 + -local1331) / (local548 - local1331);
								continue;
							}
							if (local150 == 4007) {
								local18 -= 2;
								local684 = Static55.anIntArray201[local18 + 1];
								local673 = Static55.anIntArray201[local18];
								Static55.anIntArray201[local18++] = local673 + local673 * local684 / 100;
								continue;
							}
							if (local150 == 4008) {
								local18 -= 2;
								local673 = Static55.anIntArray201[local18];
								local684 = Static55.anIntArray201[local18 + 1];
								Static55.anIntArray201[local18++] = 0x1 << local684 | local673;
								continue;
							}
							if (local150 == 4009) {
								local18 -= 2;
								local684 = Static55.anIntArray201[local18 + 1];
								local673 = Static55.anIntArray201[local18];
								Static55.anIntArray201[local18++] = -(0x1 << local684) - 1 & local673;
								continue;
							}
							if (local150 == 4010) {
								local18 -= 2;
								local684 = Static55.anIntArray201[local18 + 1];
								local673 = Static55.anIntArray201[local18];
								Static55.anIntArray201[local18++] = (0x1 << local684 & local673) == 0 ? 0 : 1;
								continue;
							}
							if (local150 == 4011) {
								local18 -= 2;
								local684 = Static55.anIntArray201[local18 + 1];
								local673 = Static55.anIntArray201[local18];
								Static55.anIntArray201[local18++] = local673 % local684;
								continue;
							}
							if (local150 == 4012) {
								local18 -= 2;
								local673 = Static55.anIntArray201[local18];
								local684 = Static55.anIntArray201[local18 + 1];
								if (local673 == 0) {
									Static55.anIntArray201[local18++] = 0;
								} else {
									Static55.anIntArray201[local18++] = (int) Math.pow((double) local673, (double) local684);
								}
								continue;
							}
							if (local150 == 4013) {
								local18 -= 2;
								local684 = Static55.anIntArray201[local18 + 1];
								local673 = Static55.anIntArray201[local18];
								if (local673 == 0) {
									Static55.anIntArray201[local18++] = 0;
								} else if (local684 == 0) {
									Static55.anIntArray201[local18++] = Integer.MAX_VALUE;
								} else {
									Static55.anIntArray201[local18++] = (int) Math.pow((double) local673, 1.0D / (double) local684);
								}
								continue;
							}
							if (local150 == 4014) {
								local18 -= 2;
								local673 = Static55.anIntArray201[local18];
								local684 = Static55.anIntArray201[local18 + 1];
								Static55.anIntArray201[local18++] = local684 & local673;
								continue;
							}
							if (local150 == 4015) {
								local18 -= 2;
								local673 = Static55.anIntArray201[local18];
								local684 = Static55.anIntArray201[local18 + 1];
								Static55.anIntArray201[local18++] = local673 | local684;
								continue;
							}
						} else if (local150 < 4200) {
							if (local150 == 4100) {
								local20--;
								local509 = Static110.aClass23Array19[local20];
								local18--;
								local684 = Static55.anIntArray201[local18];
								Static110.aClass23Array19[local20++] = Static17.method233(new Class23[] { local509, Static19.method274(local684) });
								continue;
							}
							if (local150 == 4101) {
								local20 -= 2;
								local509 = Static110.aClass23Array19[local20];
								local2300 = Static110.aClass23Array19[local20 + 1];
								Static110.aClass23Array19[local20++] = Static17.method233(new Class23[] { local509, local2300 });
								continue;
							}
							if (local150 == 4102) {
								local20--;
								local509 = Static110.aClass23Array19[local20];
								local18--;
								local684 = Static55.anIntArray201[local18];
								Static110.aClass23Array19[local20++] = Static17.method233(new Class23[] { local509, Static11.method118(local684) });
								continue;
							}
							if (local150 == 4103) {
								local20--;
								local509 = Static110.aClass23Array19[local20];
								Static110.aClass23Array19[local20++] = local509.method537();
								continue;
							}
							if (local150 == 4104) {
								local18--;
								local673 = Static55.anIntArray201[local18];
								@Pc(2381) long local2381 = (long) local673 * 86400000L + 1014768000000L;
								Static68.aCalendar2.setTime(new Date(local2381));
								local548 = Static68.aCalendar2.get(5);
								local568 = Static68.aCalendar2.get(2);
								local2399 = Static68.aCalendar2.get(1);
								Static110.aClass23Array19[local20++] = Static17.method233(new Class23[] { Static19.method274(local548), Static41.aClass23_760, Static62.aClass23Array13[local568], Static41.aClass23_760, Static19.method274(local2399) });
								continue;
							}
							if (local150 == 4105) {
								local20 -= 2;
								local2300 = Static110.aClass23Array19[local20 + 1];
								local509 = Static110.aClass23Array19[local20];
								if (Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass58_2 != null && Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass58_2.aBoolean119) {
									Static110.aClass23Array19[local20++] = local2300;
									continue;
								}
								Static110.aClass23Array19[local20++] = local509;
								continue;
							}
							if (local150 == 4106) {
								local18--;
								local673 = Static55.anIntArray201[local18];
								Static110.aClass23Array19[local20++] = Static19.method274(local673);
								continue;
							}
							if (local150 == 4107) {
								local20 -= 2;
								Static55.anIntArray201[local18++] = Static110.aClass23Array19[local20].method543(Static110.aClass23Array19[local20 + 1]);
								continue;
							}
							@Pc(2536) Class1_Sub1_Sub6_Sub2 local2536;
							@Pc(2531) byte[] local2531;
							if (local150 == 4108) {
								local18 -= 2;
								local20--;
								local509 = Static110.aClass23Array19[local20];
								local684 = Static55.anIntArray201[local18];
								local1331 = Static55.anIntArray201[local18 + 1];
								local2531 = Static74.aClass55_Sub1_11.method1867(0, local1331);
								local2536 = new Class1_Sub1_Sub6_Sub2(local2531);
								Static55.anIntArray201[local18++] = local2536.method830(local509, local684);
								continue;
							}
							if (local150 == 4109) {
								local18 -= 2;
								local20--;
								local509 = Static110.aClass23Array19[local20];
								local684 = Static55.anIntArray201[local18];
								local1331 = Static55.anIntArray201[local18 + 1];
								local2531 = Static74.aClass55_Sub1_11.method1867(0, local1331);
								local2536 = new Class1_Sub1_Sub6_Sub2(local2531);
								Static55.anIntArray201[local18++] = local2536.method839(local509, local684);
								continue;
							}
						} else if (local150 < 4300) {
							if (local150 == 4200) {
								local18--;
								local673 = Static55.anIntArray201[local18];
								Static110.aClass23Array19[local20++] = Static111.method1907(local673).aClass23_58;
								continue;
							}
							@Pc(2628) Class1_Sub1_Sub1 local2628;
							if (local150 == 4201) {
								local18 -= 2;
								local673 = Static55.anIntArray201[local18];
								local684 = Static55.anIntArray201[local18 + 1];
								local2628 = Static111.method1907(local673);
								if (local684 >= 1 && local684 <= 5 && local2628.aClass23Array1[local684 - 1] != null) {
									Static110.aClass23Array19[local20++] = local2628.aClass23Array1[local684 - 1];
									continue;
								}
								Static110.aClass23Array19[local20++] = Static31.aClass23_528;
								continue;
							}
							if (local150 == 4202) {
								local18 -= 2;
								local684 = Static55.anIntArray201[local18 + 1];
								local673 = Static55.anIntArray201[local18];
								local2628 = Static111.method1907(local673);
								if (local684 >= 1 && local684 <= 5 && local2628.aClass23Array2[local684 - 1] != null) {
									Static110.aClass23Array19[local20++] = local2628.aClass23Array2[local684 - 1];
									continue;
								}
								Static110.aClass23Array19[local20++] = Static31.aClass23_528;
								continue;
							}
							if (local150 == 4203) {
								local18--;
								local673 = Static55.anIntArray201[local18];
								Static55.anIntArray201[local18++] = Static111.method1907(local673).anInt66;
								continue;
							}
							if (local150 == 4204) {
								local18--;
								local673 = Static55.anIntArray201[local18];
								Static55.anIntArray201[local18++] = Static111.method1907(local673).anInt62 == 1 ? 1 : 0;
								continue;
							}
							@Pc(2765) Class1_Sub1_Sub1 local2765;
							if (local150 == 4205) {
								local18--;
								local673 = Static55.anIntArray201[local18];
								local2765 = Static111.method1907(local673);
								if (local2765.anInt53 == -1 && local2765.anInt67 >= 0) {
									Static55.anIntArray201[local18++] = local2765.anInt67;
									continue;
								}
								Static55.anIntArray201[local18++] = local673;
								continue;
							}
							if (local150 == 4206) {
								local18--;
								local673 = Static55.anIntArray201[local18];
								local2765 = Static111.method1907(local673);
								if (local2765.anInt53 >= 0 && local2765.anInt67 >= 0) {
									Static55.anIntArray201[local18++] = local2765.anInt67;
									continue;
								}
								Static55.anIntArray201[local18++] = local673;
								continue;
							}
							if (local150 == 4207) {
								local18--;
								local673 = Static55.anIntArray201[local18];
								Static55.anIntArray201[local18++] = Static111.method1907(local673).aBoolean1 ? 1 : 0;
								continue;
							}
						}
					} else {
						if (local150 >= 2000) {
							local18--;
							local851 = Static15.method174(Static55.anIntArray201[local18]);
							local150 -= 1000;
						} else {
							local851 = local815 ? Static71.aClass1_Sub1_Sub7_4 : Static51.aClass1_Sub1_Sub7_3;
						}
						if (local150 >= 1300 && local150 <= 1309 || local150 >= 1314 && local150 <= 1318 || local150 == 1320 || local150 == 1324) {
							local20--;
							local2300 = Static110.aClass23Array19[local20];
							@Pc(3530) Object[] local3530 = new Object[local2300.method525() + 1];
							for (local548 = local3530.length - 1; local548 >= 1; local548--) {
								if (local2300.method519(local548 - 1) == 115) {
									local20--;
									local3530[local548] = Static110.aClass23Array19[local20];
								} else {
									local18--;
									local3530[local548] = Integer.valueOf(Static55.anIntArray201[local18]);
								}
							}
							local18--;
							local3530[0] = Integer.valueOf(Static55.anIntArray201[local18]);
							if (local150 == 1324) {
								local851.anObjectArray6 = local3530;
							}
							if (local150 == 1315) {
								local851.anObjectArray10 = local3530;
							}
							if (local150 == 1307) {
								local851.anObjectArray2 = local3530;
							}
							if (local150 == 1301) {
								local851.anObjectArray4 = local3530;
							}
							if (local150 == 1309) {
								local851.anObjectArray9 = local3530;
							}
							if (local150 == 1305) {
								local851.anObjectArray3 = local3530;
							}
							if (local150 == 1306) {
								local851.anObjectArray14 = local3530;
							}
							if (local150 == 1314) {
								local851.anObjectArray11 = local3530;
							}
							if (local150 == 1302) {
								local851.anObjectArray17 = local3530;
							}
							if (local150 == 1308) {
								local851.anObjectArray1 = local3530;
							}
							if (local150 == 1317) {
								local851.anObjectArray16 = local3530;
							}
							if (local150 == 1316) {
								local851.anObjectArray15 = local3530;
							}
							if (local150 == 1304) {
								local851.anObjectArray8 = local3530;
							}
							if (local150 == 1320) {
								local851.anObjectArray5 = local3530;
							}
							if (local150 == 1303) {
								local851.anObjectArray12 = local3530;
							}
							if (local150 == 1318) {
								local851.anObjectArray7 = local3530;
							}
							continue;
						}
						if (local150 == 1310) {
							local18--;
							local684 = Static55.anIntArray201[local18] - 1;
							if (local684 >= 0 && local684 <= 9) {
								if (local851.aClass23Array10 == null || local851.aClass23Array10.length <= local684) {
									local546 = new Class23[local684 + 1];
									if (local851.aClass23Array10 != null) {
										for (local548 = 0; local548 < local851.aClass23Array10.length; local548++) {
											local546[local548] = local851.aClass23Array10[local548];
										}
									}
									local851.aClass23Array10 = local546;
								}
								local20--;
								@Pc(3758) Class23 local3758 = Static110.aClass23Array19[local20];
								if (local3758.method525() == 0) {
									local3758 = null;
								}
								local851.aClass23Array10[local684] = local3758;
								continue;
							}
							local20--;
							continue;
						}
						if (local150 == 1311) {
							local18--;
							local851.anInt850 = Static55.anIntArray201[local18];
							continue;
						}
						if (local150 == 1312) {
							local18--;
							local851.aBoolean40 = Static55.anIntArray201[local18] == 1;
							continue;
						}
						if (local150 == 1313) {
							local18--;
							local851.anInt800 = Static55.anIntArray201[local18];
							continue;
						}
						if (local150 == 1319) {
							local18--;
							local851.anInt806 = Static55.anIntArray201[local18];
							continue;
						}
						if (local150 == 1321) {
							Static75.method1323();
							local18--;
							Static90.anInt2427 = Static55.anIntArray201[local18];
							local20--;
							Static3.aClass23_96 = Static110.aClass23Array19[local20];
							Static1.aClass23_53 = Static17.method233(new Class23[] { local851.aClass23_458, Static25.aClass23_434 });
							Static115.anInt2955 = 0;
							Static94.anInt2487 = 1;
							if (local851.anInt826 < 0) {
								Static106.anInt2713 = local851.anInt833;
								Static48.anInt1609 = local851.anInt826 & 0x7FFF;
							} else {
								Static106.anInt2713 = local851.anInt826;
								Static48.anInt1609 = -1;
							}
							aBoolean60 = true;
							continue;
						}
						if (local150 == 1322) {
							local20--;
							local851.aClass23_458 = Static110.aClass23Array19[local20];
							continue;
						}
						if (local150 == 1323) {
							local18--;
							local851.aBoolean43 = Static55.anIntArray201[local18] == 1;
							continue;
						}
					}
				}
				return;
			}
		} catch (@Pc(4056) Exception local4056) {
		}
	}
}
