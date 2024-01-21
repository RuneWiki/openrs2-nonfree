import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!vh", name = "x", descriptor = "Z")
	public static boolean aBoolean237;

	@OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
	public static int anInt4360;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "Lclient!ph;")
	public static final Class77 aClass77_10 = new Class77(5);

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1993 = Static187.method3089("Lade Sprites )2 ");

	@OriginalMember(owner = "client!vh", name = "r", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1994 = Static187.method3089("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1995 = aClass92_1994;

	@OriginalMember(owner = "client!vh", name = "y", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1996 = Static187.method3089(" )2> ");

	@OriginalMember(owner = "client!vh", name = "A", descriptor = "[I")
	public static final int[] anIntArray355 = new int[128];

	@OriginalMember(owner = "client!vh", name = "B", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1997 = Static187.method3089("<br>(X");

	@OriginalMember(owner = "client!vh", name = "C", descriptor = "[I")
	public static final int[] anIntArray356 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ab;II)Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1 method3295(@OriginalArg(0) Class3 arg0, @OriginalArg(2) int arg1) {
		return Static163.method2693(arg0, arg1) ? Static61.method999() : null;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIBII)V")
	public static void method3296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static110.anInt2386 = -1;
		Static193.anInt3062 = -1;
		Static155.anInt2984 = arg1 * Static90.anInt1950 / arg2;
		Static111.anInt2402 = Static35.anInt988 * arg0 / arg3;
		Static18.method408();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI[Lclient!ba;)V")
	public static void method3300(@OriginalArg(1) int arg0, @OriginalArg(2) Class11[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			@Pc(18) Class11 local18 = arg1[local12];
			if (local18 != null && local18.anInt256 == arg0 && (!local18.aBoolean28 || !Static141.method2093(local18))) {
				if (local18.anInt326 == 0) {
					if (!local18.aBoolean28 && Static141.method2093(local18) && Static139.aClass11_10 != local18) {
						continue;
					}
					method3300(local18.anInt275, arg1);
					if (local18.aClass11Array1 != null) {
						method3300(local18.anInt275, local18.aClass11Array1);
					}
					@Pc(70) Class1_Sub4 local70 = (Class1_Sub4) Static183.aClass97_21.method3375((long) local18.anInt275);
					if (local70 != null) {
						Static59.method975(local70.anInt490);
					}
				}
				if (local18.anInt326 == 6) {
					@Pc(100) int local100;
					if (local18.anInt311 != -1 || local18.anInt279 != -1) {
						@Pc(95) boolean local95 = Static47.method837(local18);
						if (local95) {
							local100 = local18.anInt279;
						} else {
							local100 = local18.anInt311;
						}
						if (local100 != -1) {
							@Pc(112) Class1_Sub3_Sub20 local112 = Static84.method1279(local100);
							if (local112 != null) {
								local18.anInt271 += Static110.anInt2383;
								while (local18.anInt271 > local112.anIntArray298[local18.anInt276]) {
									local18.anInt271 -= local112.anIntArray298[local18.anInt276];
									local18.anInt276++;
									if (local18.anInt276 >= local112.anIntArray300.length) {
										local18.anInt276 -= local112.anInt3390;
										if (local18.anInt276 < 0 || local18.anInt276 >= local112.anIntArray300.length) {
											local18.anInt276 = 0;
										}
									}
									Static73.method1118(local18);
								}
							}
						}
					}
					if (local18.anInt261 != 0 && !local18.aBoolean28) {
						@Pc(192) int local192 = local18.anInt261 >> 16;
						@Pc(196) int local196 = local192 * Static110.anInt2383;
						local100 = local18.anInt261 << 16 >> 16;
						local18.anInt258 = local18.anInt258 + local196 & 0x7FF;
						local100 *= Static110.anInt2383;
						local18.anInt317 = local100 + local18.anInt317 & 0x7FF;
						Static73.method1118(local18);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public static void method3301() {
		if (Static104.aClass92_1016 == null) {
			return;
		}
		if (Static131.anInt2743 < 10) {
			if (!Static5.aClass3_Sub1_2.method3255(Static104.aClass92_1016)) {
				Static131.anInt2743 = Static5.aClass3_Sub1_2.method3250(Static104.aClass92_1016) / 10;
				return;
			}
			Static131.anInt2743 = 10;
		}
		if (Static131.anInt2743 == 10) {
			@Pc(43) Class1_Sub14 local43 = new Class1_Sub14(Static5.aClass3_Sub1_2.method3252(Static153.aClass92_1524, Static104.aClass92_1016));
			@Pc(47) int local47 = local43.method3023();
			@Pc(51) int local51 = local43.method3023();
			@Pc(57) int local57 = local43.method3023();
			@Pc(61) int local61 = local43.method3023();
			@Pc(65) int local65 = local43.method3023();
			@Pc(71) int local71 = local43.method3023();
			Static35.anInt988 = (local61 - local51) * 64 + 64;
			Static203.aDouble11 = 8.0D;
			Static94.aDouble10 = 8.0D;
			Static90.anInt1950 = (local57 - local47) * 64 + 64;
			Static77.anIntArray136 = new int[Static86.anInt1860 + 1];
			Static52.anInt1305 = local51 * 64;
			@Pc(105) int local105 = Static90.anInt1950 >> 6;
			@Pc(115) int local115 = Static138.anInt2800 + (Static15.aClass8_Sub3_Sub1_1.anInt3606 >> 7) - Static52.anInt1305;
			@Pc(124) int local124 = local115 + (int) (Math.random() * 10.0D) - 5;
			@Pc(130) int local130 = Static203.anInt4429 >> 2 << 10;
			Static150.anInt3065 = local47 * 64;
			@Pc(144) int local144 = Static100.anInt2141 + (Static15.aClass8_Sub3_Sub1_1.anInt3600 >> 7) - Static150.anInt3065;
			@Pc(148) int local148 = Static35.anInt988 >> 6;
			@Pc(157) int local157 = local144 + (int) (Math.random() * 10.0D) - 5;
			Static158.aByteArrayArrayArray37 = new byte[local105][local148][];
			Static119.aByteArrayArrayArray28 = new byte[local105][local148][];
			Static104.anIntArrayArrayArray4 = new int[local105][local148][];
			Static157.anIntArrayArrayArray7 = new int[local105][local148][];
			@Pc(177) int local177 = Static61.anInt1464 >> 1;
			if (local157 >= 0 && local157 < Static90.anInt1950 && local124 >= 0 && Static35.anInt988 > local124) {
				Static111.anInt2402 = Static35.anInt988 - local124;
				Static155.anInt2984 = local157;
			} else {
				Static111.anInt2402 = Static52.anInt1305 + Static35.anInt988 - local71 * 64;
				Static155.anInt2984 = local65 * 64 - Static150.anInt3065;
			}
			Static62.aByteArrayArrayArray15 = new byte[local105][local148][];
			Static64.aByteArrayArrayArray17 = new byte[local105][local148][];
			Static164.aByteArrayArrayArray40 = new byte[local105][local148][];
			Static180.aByteArrayArrayArray52 = new byte[local105][local148][];
			for (@Pc(236) int local236 = 0; local236 < Static86.anInt1860; local236++) {
				@Pc(242) Class1_Sub3_Sub12 local242 = Static175.method2877(local236);
				if (local242 != null) {
					@Pc(247) int local247 = local242.anInt2005;
					if (local247 >= 0 && !Static174.anInterface3_2.method2593(local247)) {
						local247 = -1;
					}
					@Pc(277) int local277;
					@Pc(290) int local290;
					@Pc(296) int local296;
					@Pc(324) int local324;
					if (local242.anInt2002 >= 0) {
						local290 = local242.anInt2002;
						local296 = local177 + (local290 & 0x7F);
						if (local296 < 0) {
							local296 = 0;
						} else if (local296 > 127) {
							local296 = 127;
						}
						local324 = (local290 & 0x380) + (local290 + local130 & 0xFC00) + local296;
						local277 = Static174.anIntArray319[Static187.method3088(local324, 96)];
					} else if (local247 >= 0) {
						local277 = Static174.anIntArray319[Static187.method3088(Static174.anInterface3_2.method2592(local247), 96)];
					} else if (local242.anInt2006 == -1) {
						local277 = -1;
					} else {
						local290 = local242.anInt2006;
						local296 = local177 + (local290 & 0x7F);
						if (local296 < 0) {
							local296 = 0;
						} else if (local296 > 127) {
							local296 = 127;
						}
						local324 = local296 + (local130 + local290 & 0xFC00) + (local290 & 0x380);
						local277 = Static174.anIntArray319[Static187.method3088(local324, 96)];
					}
					Static77.anIntArray136[local236 + 1] = local277;
				}
			}
			Static131.anInt2743 = 20;
		} else if (Static131.anInt2743 == 20) {
			Static171.method2686(Static5.aClass3_Sub1_2.method3252(Static138.aClass92_1351, Static104.aClass92_1016));
			Static131.anInt2743 = 30;
			Static88.method1302();
		} else if (Static131.anInt2743 == 30) {
			Static39.method717(Static5.aClass3_Sub1_2.method3252(Static3.aClass92_1988, Static104.aClass92_1016));
			Static131.anInt2743 = 50;
			Static88.method1302();
		} else if (Static131.anInt2743 == 50) {
			Static172.method2718(Static5.aClass3_Sub1_2.method3252(Static195.aClass92_1979, Static104.aClass92_1016));
			Static131.anInt2743 = 70;
			Static88.method1302();
		} else if (Static131.anInt2743 == 70) {
			Static9.method2345(Static5.aClass3_Sub1_2.method3252(Static27.aClass92_275, Static104.aClass92_1016));
			Static131.anInt2743 = 90;
			Static88.method1302();
		} else {
			Static146.method2178(Static5.aClass3_Sub1_2.method3252(Static175.aClass92_1804, Static104.aClass92_1016));
			if (Static131.anInt2743 == 90) {
				Static184.aClass1_Sub3_Sub1_Sub2_10 = new Class1_Sub3_Sub1_Sub2(11, true, Static119.aCanvas1);
				Static124.aClass1_Sub3_Sub1_Sub2_6 = new Class1_Sub3_Sub1_Sub2(12, true, Static119.aCanvas1);
				Static167.aClass1_Sub3_Sub1_Sub2_7 = new Class1_Sub3_Sub1_Sub2(14, true, Static119.aCanvas1);
				Static93.aClass1_Sub3_Sub1_Sub2_4 = new Class1_Sub3_Sub1_Sub2(17, true, Static119.aCanvas1);
				Static17.aClass1_Sub3_Sub1_Sub2_8 = new Class1_Sub3_Sub1_Sub2(19, true, Static119.aCanvas1);
				Static173.aClass1_Sub3_Sub1_Sub2_9 = new Class1_Sub3_Sub1_Sub2(22, true, Static119.aCanvas1);
				Static84.aClass1_Sub3_Sub1_Sub2_3 = new Class1_Sub3_Sub1_Sub2(26, true, Static119.aCanvas1);
				Static123.aClass1_Sub3_Sub1_Sub2_5 = new Class1_Sub3_Sub1_Sub2(30, true, Static119.aCanvas1);
				Static131.anInt2743 = 100;
			}
			Static131.anInt2743 = 100;
			Static110.anInt2386 = -1;
			Static193.anInt3062 = -1;
			Static88.method1302();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)I")
	public static int method3307(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class1_Sub25 local18 = (Class1_Sub25) Static71.aClass97_7.method3375((long) arg1);
		if (local18 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local18.anIntArray325.length) {
			return local18.anIntArray325[arg0];
		} else {
			return 0;
		}
	}
}
