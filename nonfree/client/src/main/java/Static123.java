import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!va", name = "f", descriptor = "[Lclient!t;")
	public static Class8_Sub1_Sub3_Sub3[] aClass8_Sub1_Sub3_Sub3Array38;

	@OriginalMember(owner = "client!va", name = "i", descriptor = "Lclient!wf;")
	public static Class8_Sub24 aClass8_Sub24_14;

	@OriginalMember(owner = "client!va", name = "q", descriptor = "Lclient!wf;")
	public static Class8_Sub24 aClass8_Sub24_15;

	@OriginalMember(owner = "client!va", name = "r", descriptor = "Lclient!t;")
	public static Class8_Sub1_Sub3_Sub3 aClass8_Sub1_Sub3_Sub3_7;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1339 = Static56.method816("<col=ffff00>*V");

	@OriginalMember(owner = "client!va", name = "j", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1340 = Static56.method816("Lade Sprites )2 ");

	@OriginalMember(owner = "client!va", name = "m", descriptor = "I")
	public static volatile int anInt2931 = 0;

	@OriginalMember(owner = "client!va", name = "u", descriptor = "Lclient!lf;")
	public static Class48 aClass48_55 = new Class48(128);

	@OriginalMember(owner = "client!va", name = "v", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1341 = Static56.method816("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!va", name = "w", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1342 = Static56.method816("Schlie-8en");

	@OriginalMember(owner = "client!va", name = "x", descriptor = "J")
	public static volatile long aLong97 = 0L;

	@OriginalMember(owner = "client!va", name = "y", descriptor = "J")
	public static long aLong98 = 0L;

	@OriginalMember(owner = "client!va", name = "z", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1343 = Static56.method816("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
	public static void method1940() {
		if (Static125.aClass36_1 != null) {
			@Pc(9) Class36 local9 = Static125.aClass36_1;
			synchronized (Static125.aClass36_1) {
				Static125.aClass36_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!wd;I)Lclient!ic;")
	public static Class34 method1941(@OriginalArg(1) Class8_Sub20 arg0) {
		try {
			@Pc(12) Class34 local12 = new Class34();
			local12.anInt1418 = arg0.method1849();
			if (local12.anInt1418 > 32767) {
				local12.anInt1418 = 32767;
			}
			local12.aByteArray20 = new byte[local12.anInt1418];
			arg0.anInt2853 += Static126.aClass21_3.method552(arg0.anInt2853, arg0.aByteArray44, 0, local12.anInt1418, local12.aByteArray20);
			return local12;
		} catch (@Pc(49) Exception local49) {
			return Static129.aClass34_1405;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V")
	public static void method1942(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = Static41.aClass8_Sub1_Sub3_Sub3_1.anIntArray342;
		@Pc(19) int local19 = local16.length;
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			local16[local21] = 0;
		}
		@Pc(47) int local47;
		@Pc(49) int local49;
		for (@Pc(33) int local33 = 1; local33 < 103; local33++) {
			local47 = 4 * 512 * (103 - local33) + 24628;
			for (local49 = 1; local49 < 103; local49++) {
				if ((Static105.aByteArrayArrayArray5[arg0][local49][local33] & 0x18) == 0) {
					Static3.aClass64_1.method1393(local16, local47, arg0, local49, local33);
				}
				if (arg0 < 3 && (Static105.aByteArrayArrayArray5[arg0 + 1][local49][local33] & 0x8) != 0) {
					Static3.aClass64_1.method1393(local16, local47, arg0 + 1, local49, local33);
				}
				local47 += 4;
			}
		}
		Static41.aClass8_Sub1_Sub3_Sub3_1.method1576();
		local49 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		local47 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
		@Pc(159) int local159;
		for (@Pc(155) int local155 = 1; local155 < 103; local155++) {
			for (local159 = 1; local159 < 103; local159++) {
				if ((Static105.aByteArrayArrayArray5[arg0][local159][local155] & 0x18) == 0) {
					Static108.method1531(local49, local47, local155, arg0, local159);
				}
				if (arg0 < 3 && (Static105.aByteArrayArrayArray5[arg0 + 1][local159][local155] & 0x8) != 0) {
					Static108.method1531(local49, local47, local155, arg0 + 1, local159);
				}
			}
		}
		Static109.anInt2503 = 0;
		for (local159 = 0; local159 < 104; local159++) {
			for (@Pc(223) int local223 = 0; local223 < 104; local223++) {
				@Pc(231) int local231 = Static3.aClass64_1.method1427(Static42.anInt1024, local159, local223);
				if (local231 != 0) {
					local231 = local231 >> 14 & 0x7FFF;
					@Pc(244) int local244 = Static50.method752(local231).anInt422;
					if (local244 >= 0) {
						@Pc(248) int local248 = local159;
						@Pc(250) int local250 = local223;
						if (local244 != 22 && local244 != 29 && local244 != 34 && local244 != 36 && local244 != 46 && local244 != 47 && local244 != 48) {
							@Pc(286) int[][] local286 = Static97.aClass42Array1[Static42.anInt1024].anIntArrayArray12;
							for (@Pc(288) int local288 = 0; local288 < 10; local288++) {
								@Pc(295) int local295 = (int) (Math.random() * 4.0D);
								if (local295 == 0 && local248 > 0 && local248 > local159 - 3 && (local286[local248 - 1][local250] & 0x12C0108) == 0) {
									local248--;
								}
								if (local295 == 1 && local248 < 103 && local159 + 3 > local248 && (local286[local248 + 1][local250] & 0x12C0180) == 0) {
									local248++;
								}
								if (local295 == 2 && local250 > 0 && local250 > local223 - 3 && (local286[local248][local250 - 1] & 0x12C0102) == 0) {
									local250--;
								}
								if (local295 == 3 && local250 < 103 && local250 < local223 + 3 && (local286[local248][local250 + 1] & 0x12C0120) == 0) {
									local250++;
								}
							}
						}
						Static28.aClass8_Sub1_Sub3_Sub3Array14[Static109.anInt2503] = Static134.aClass8_Sub1_Sub3_Sub3Array41[local244];
						Static64.anIntArray265[Static109.anInt2503] = local248;
						Static70.anIntArray210[Static109.anInt2503] = local250;
						Static109.anInt2503++;
					}
				}
			}
		}
		Static31.aClass62_1.method1989();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(JI)V")
	public static void method1943(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static69.anInt1679 >= 100) {
			Static108.method1530(Static69.aClass34_785, Static36.aClass34_504, 0);
			return;
		}
		@Pc(29) Class34 local29 = Static83.method1229(arg0).method842();
		for (@Pc(31) int local31 = 0; local31 < Static69.anInt1679; local31++) {
			if (arg0 == Static5.aLongArray2[local31]) {
				Static108.method1530(Static44.method669(new Class34[] { local29, Static20.aClass34_309 }), Static36.aClass34_504, 0);
				return;
			}
		}
		for (@Pc(66) int local66 = 0; local66 < Static62.anInt1593; local66++) {
			if (arg0 == Static77.aLongArray3[local66]) {
				Static108.method1530(Static44.method669(new Class34[] { Static88.aClass34_1101, local29, Static133.aClass34_1424 }), Static36.aClass34_504, 0);
				return;
			}
		}
		if (local29.method804(Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.aClass34_638)) {
			Static108.method1530(Static133.aClass34_1421, Static36.aClass34_504, 0);
			return;
		}
		Static5.aLongArray2[Static69.anInt1679] = arg0;
		Static80.aClass34Array15[Static69.anInt1679++] = Static83.method1229(arg0);
		Static108.anInt2491 = Static86.anInt2177;
		Static106.aClass8_Sub20_Sub1_3.method1907(252);
		Static106.aClass8_Sub20_Sub1_3.method1879(arg0);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V")
	public static void method1944() {
		aClass34_1339 = null;
		aClass8_Sub24_14 = null;
		aClass34_1343 = null;
		aClass34_1341 = null;
		aClass34_1342 = null;
		aClass8_Sub1_Sub3_Sub3_7 = null;
		aClass8_Sub1_Sub3_Sub3Array38 = null;
		aClass8_Sub24_15 = null;
		aClass48_55 = null;
		aClass34_1340 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BIII)I")
	public static int method1945(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(11) int local11 = arg0 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(32) int local32 = arg1;
		if (arg1 < 3 && (Static105.aByteArrayArrayArray5[1][local7][local11] & 0x2) == 2) {
			local32 = arg1 + 1;
		}
		@Pc(55) int local55 = arg2 & 0x7F;
		@Pc(82) int local82 = Static24.anIntArrayArrayArray4[local32][local7 + 1][local11] * local55 + Static24.anIntArrayArrayArray4[local32][local7][local11] * (128 - local55) >> 7;
		@Pc(113) int local113 = Static24.anIntArrayArrayArray4[local32][local7 + 1][local11 + 1] * local55 + Static24.anIntArrayArrayArray4[local32][local7][local11 + 1] * (128 - local55) >> 7;
		@Pc(117) int local117 = arg0 & 0x7F;
		return local82 * (128 - local117) + local113 * local117 >> 7;
	}
}
