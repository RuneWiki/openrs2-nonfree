import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!db", name = "db", descriptor = "Lclient!sg;")
	public static Class2_Sub2_Sub3 aClass2_Sub2_Sub3_1;

	@OriginalMember(owner = "client!db", name = "kb", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!db", name = "T", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_244 = Static151.method2243("scroll:");

	@OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
	public static int anInt773 = 0;

	@OriginalMember(owner = "client!db", name = "pb", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_248 = Static151.method2243("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!db", name = "eb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_245 = aClass62_248;

	@OriginalMember(owner = "client!db", name = "fb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_246 = aClass62_244;

	@OriginalMember(owner = "client!db", name = "hb", descriptor = "Lclient!q;")
	public static final Class79 aClass79_2 = new Class79(260);

	@OriginalMember(owner = "client!db", name = "ib", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_247 = Static151.method2243("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!db", name = "tb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_249 = aClass62_244;

	@OriginalMember(owner = "client!db", name = "ub", descriptor = "[Z")
	public static final boolean[] aBooleanArray3 = new boolean[100];

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(B)Lclient!hh;")
	public static Class42 method560() {
		@Pc(30) Class42_Sub1 local30 = new Class42_Sub1(Static138.anInt2900, Static127.anInt2808, Static19.anIntArray38[0], Static25.anIntArray57[0], Static86.anIntArray298[0], Static138.anIntArray256[0], Static8.aByteArrayArray1[0], Static108.anIntArray222);
		Static169.method2456();
		return local30;
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(B)V")
	public static void method563() {
		if (Static9.aClass62_68 == null) {
			return;
		}
		if (Static64.anInt1343 < 10) {
			if (!Static203.aClass71_Sub1_27.method2120(Static9.aClass62_68)) {
				Static64.anInt1343 = Static203.aClass71_Sub1_27.method2136(Static9.aClass62_68) / 10;
				return;
			}
			Static64.anInt1343 = 10;
		}
		if (Static64.anInt1343 == 10) {
			@Pc(42) Class2_Sub11 local42 = new Class2_Sub11(Static203.aClass71_Sub1_27.method2139(Static9.aClass62_68, Static209.aClass62_1505));
			@Pc(46) int local46 = local42.method1557();
			@Pc(50) int local50 = local42.method1557();
			@Pc(54) int local54 = local42.method1557();
			@Pc(58) int local58 = local42.method1557();
			@Pc(62) int local62 = local42.method1557();
			@Pc(66) int local66 = local42.method1557();
			Static191.anIntArray364 = new int[Static66.anInt1399 + 1];
			Static128.anInt142 = local50 * 64;
			Static173.anInt3686 = (local54 + 1 - local46) * 64;
			@Pc(93) int local93 = (Static186.aClass7_Sub2_Sub2_1.anInt3085 >> 7) + Static153.anInt3278 - Static128.anInt142;
			@Pc(97) int local97 = Static173.anInt3686 >> 6;
			@Pc(106) int local106 = local93 + (int) (Math.random() * 10.0D) - 5;
			Static24.anInt573 = local46 * 64;
			Static104.anInt2340 = (local58 - local50) * 64 + 64;
			@Pc(122) int local122 = Static104.anInt2340 >> 6;
			Static178.aByteArrayArrayArray15 = new byte[local97][local122][];
			Static139.aByteArrayArrayArray12 = new byte[local97][local122][];
			Static20.aByteArrayArrayArray3 = new byte[local97][local122][];
			Static197.anIntArrayArrayArray10 = new int[local97][local122][];
			Static29.aByteArrayArrayArray4 = new byte[local97][local122][];
			Static68.aByteArrayArrayArray10 = new byte[local97][local122][];
			Static46.anIntArrayArrayArray2 = new int[local97][local122][];
			Static42.aByteArrayArrayArray18 = new byte[local97][local122][];
			Static136.aDouble113 = 8.0D;
			Static47.aDouble31 = 8.0D;
			@Pc(169) int local169 = Static116.anInt2535 + (Static186.aClass7_Sub2_Sub2_1.anInt3046 >> 7) - Static24.anInt573;
			@Pc(178) int local178 = local169 + (int) (Math.random() * 10.0D) - 5;
			@Pc(182) int local182 = Static41.anInt4503 >> 1;
			if (local178 >= 0 && local178 < Static173.anInt3686 && local106 >= 0 && local106 < Static104.anInt2340) {
				Static142.anInt3025 = local178;
				Static50.anInt1085 = Static104.anInt2340 - local106;
			} else {
				Static142.anInt3025 = local62 * 64 - Static24.anInt573;
				Static50.anInt1085 = Static104.anInt2340 + Static128.anInt142 - local66 * 64;
			}
			@Pc(223) int local223 = Static111.anInt2426 >> 2 << 10;
			for (@Pc(225) int local225 = 0; local225 < Static66.anInt1399; local225++) {
				@Pc(231) Class2_Sub1_Sub7 local231 = Static61.method856(local225);
				if (local231 != null) {
					@Pc(236) int local236 = local231.anInt861;
					if (local236 >= 0 && !Static45.anInterface3_1.method2300(local236)) {
						local236 = -1;
					}
					@Pc(259) int local259;
					@Pc(264) int local264;
					@Pc(270) int local270;
					@Pc(295) int local295;
					if (local231.anInt865 >= 0) {
						local264 = local231.anInt865;
						local270 = local182 + (local264 & 0x7F);
						if (local270 < 0) {
							local270 = 0;
						} else if (local270 > 127) {
							local270 = 127;
						}
						local295 = local270 + (local264 & 0x380) + (local223 + local264 & 0xFC00);
						local259 = Static45.anIntArray79[Static146.method2193(local295, 96)];
					} else if (local236 >= 0) {
						local259 = Static45.anIntArray79[Static146.method2193(Static45.anInterface3_1.method2298(local236), 96)];
					} else if (local231.anInt859 == -1) {
						local259 = -1;
					} else {
						local264 = local231.anInt859;
						local270 = (local264 & 0x7F) + local182;
						if (local270 < 0) {
							local270 = 0;
						} else if (local270 > 127) {
							local270 = 127;
						}
						local295 = local270 + (local264 & 0x380) + (local223 + local264 & 0xFC00);
						local259 = Static45.anIntArray79[Static146.method2193(local295, 96)];
					}
					Static191.anIntArray364[local225 + 1] = local259;
				}
			}
			Static64.anInt1343 = 20;
		} else if (Static64.anInt1343 == 20) {
			Static123.method3149(Static203.aClass71_Sub1_27.method2139(Static9.aClass62_68, Static193.aClass62_1391));
			Static64.anInt1343 = 30;
			Static120.method1887();
		} else if (Static64.anInt1343 == 30) {
			Static171.method2524(Static203.aClass71_Sub1_27.method2139(Static9.aClass62_68, Static157.aClass62_1194));
			Static64.anInt1343 = 50;
			Static120.method1887();
		} else if (Static64.anInt1343 == 50) {
			Static112.method1718(Static203.aClass71_Sub1_27.method2139(Static9.aClass62_68, Static74.aClass62_529));
			Static64.anInt1343 = 70;
			Static120.method1887();
		} else if (Static64.anInt1343 == 70) {
			Static170.method2501(Static203.aClass71_Sub1_27.method2139(Static9.aClass62_68, Static49.aClass62_340));
			Static64.anInt1343 = 90;
			Static120.method1887();
		} else {
			Static62.method861(Static203.aClass71_Sub1_27.method2139(Static9.aClass62_68, Static197.aClass62_1420));
			if (Static64.anInt1343 == 90) {
				Static144.aClass66_7 = new Class66(11, true, Static139.aCanvas1);
				Static124.aClass66_5 = new Class66(12, true, Static139.aCanvas1);
				Static138.aClass66_6 = new Class66(14, true, Static139.aCanvas1);
				Static74.aClass66_4 = new Class66(17, true, Static139.aCanvas1);
				Static27.aClass66_2 = new Class66(19, true, Static139.aCanvas1);
				Static193.aClass66_8 = new Class66(22, true, Static139.aCanvas1);
				Static20.aClass66_1 = new Class66(26, true, Static139.aCanvas1);
				Static67.aClass66_3 = new Class66(30, true, Static139.aCanvas1);
				Static64.anInt1343 = 100;
			}
			Static64.anInt1343 = 100;
			Static176.anInt3717 = -1;
			Static186.anInt3885 = -1;
			Static120.method1887();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZIIIII)I")
	public static int method564(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg3 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(14) int local14 = arg4;
			arg4 = arg2;
			arg2 = local14;
		}
		if (local3 == 0) {
			return arg5;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 + 1 - arg5 - arg4;
		} else {
			return 7 + 1 - arg0 - arg2;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLclient!mb;Z)V")
	public static void method566(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class62 arg1) {
		@Pc(9) Class62 local9 = arg1.method1872();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static77.anInt3590; local16++) {
			@Pc(22) Class2_Sub1_Sub26 local22 = Static52.method774(local16);
			if ((!arg0 || local22.aBoolean193) && local22.anInt4538 == -1 && local22.anInt4542 == -1 && local22.anInt4544 == 0 && local22.aClass62_1540.method1872().method1869(local9) != -1) {
				if (local14 >= 250) {
					Static71.anInt1469 = -1;
					Static187.aShortArray135 = null;
					return;
				}
				if (local12.length <= local14) {
					@Pc(76) short[] local76 = new short[local12.length * 2];
					for (@Pc(78) int local78 = 0; local78 < local14; local78++) {
						local76[local78] = local12[local78];
					}
					local12 = local76;
				}
				local12[local14++] = (short) local16;
			}
		}
		Static158.anInt3377 = 0;
		Static71.anInt1469 = local14;
		Static187.aShortArray135 = local12;
		@Pc(115) Class62[] local115 = new Class62[Static71.anInt1469];
		for (@Pc(121) int local121 = 0; local121 < Static71.anInt1469; local121++) {
			local115[local121] = Static52.method774(local12[local121]).aClass62_1540;
		}
		Static203.method2964(local115, Static187.aShortArray135);
	}
}
