import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "Lclient!ml;")
	public static Class1_Sub3_Sub13 aClass1_Sub3_Sub13_6;

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
	public static int anInt2392;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "Z")
	public static boolean aBoolean150 = false;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V")
	public static void method1773(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class147 local3 = Static117.method3397(arg0);
		@Pc(10) int local10 = local3.anInt4982;
		@Pc(13) int local13 = local3.anInt4988;
		@Pc(16) int local16 = local3.anInt4983;
		@Pc(23) int local23 = Class2_Sub2.anIntArray50[local13 - local10];
		if (arg1 < 0 || arg1 > local23) {
			arg1 = 0;
		}
		local23 <<= local10;
		Static101.method202(~local23 & Static90.anIntArray207[local16] | local23 & arg1 << local10, local16);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILclient!na;)V")
	public static void method1774(@OriginalArg(1) Class112 arg0) {
		@Pc(3) Class5 local3 = null;
		Static166.anInt3743 = 3;
		Static19.method426(true);
		Static202.aBoolean276 = true;
		Static153.anInt3412 = 0;
		Static35.aBoolean65 = true;
		Static255.aBoolean321 = true;
		Static125.aBoolean164 = true;
		Static286.anInt5742 = 127;
		Static65.aBoolean96 = true;
		Static72.aBoolean118 = true;
		Static309.anInt6196 = 0;
		Static57.anInt6309 = 127;
		Static124.anInt2706 = 0;
		Static87.anInt2035 = 255;
		Static41.aBoolean72 = true;
		Static11.aBoolean17 = true;
		Static139.anInt3176 = 0;
		Static280.aBoolean353 = true;
		Static282.aBoolean355 = true;
		Static293.aBoolean364 = true;
		Static208.anInt4490 = 2;
		if (Static196.anInt4274 >= 96) {
			Static42.method854(2);
		} else {
			Static42.method854(0);
		}
		Static236.anInt1713 = 0;
		Static266.anInt5317 = 0;
		Static283.aBoolean357 = false;
		Static309.anInt6184 = 0;
		Static210.aBoolean284 = true;
		Static198.aBoolean269 = false;
		Static211.aBoolean285 = false;
		try {
			@Pc(88) Class47 local88 = arg0.method2899("runescape");
			while (local88.anInt1417 == 0) {
				Static312.method4734(1L);
			}
			if (local88.anInt1417 == 1) {
				local3 = (Class5) local88.anObject2;
				@Pc(113) byte[] local113 = new byte[(int) local3.method208()];
				@Pc(130) int local130;
				for (@Pc(115) int local115 = 0; local115 < local113.length; local115 += local130) {
					local130 = local3.method211(local113, local115, local113.length - local115);
					if (local130 == -1) {
						throw new IOException("EOF");
					}
				}
				Static125.method2043(new Class1_Sub14(local113));
			}
		} catch (@Pc(153) Exception local153) {
		}
		try {
			if (local3 != null) {
				local3.method209();
			}
		} catch (@Pc(161) Exception local161) {
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I[[IBIII)I")
	public static int method1779(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(34) int local34 = (128 - arg2) * arg1[arg4][arg0] + arg2 * arg1[arg4 + 1][arg0] >> 7;
		@Pc(61) int local61 = arg1[arg4][arg0 + 1] * (128 - arg2) + arg2 * arg1[arg4 + 1][arg0 + 1] >> 7;
		return local34 * (128 - arg3) + arg3 * local61 >> 7;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)V")
	public static void method1780(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static270.anIntArray485[arg0];
		@Pc(17) int local17 = Static256.anIntArray475[arg0];
		@Pc(21) long local21 = Static171.aLongArray6[arg0];
		@Pc(25) int local25 = Static86.aShortArray64[arg0];
		@Pc(30) int local30 = (int) Static171.aLongArray6[arg0];
		if (local25 >= 2000) {
			local25 -= 2000;
		}
		@Pc(45) Class2_Sub4_Sub1 local45;
		if (local25 == 40) {
			local45 = Static105.aClass2_Sub4_Sub1Array1[local30];
			if (local45 != null) {
				Static95.anInt2197 = Static89.anInt5976;
				Static173.anInt3891 = 0;
				Static188.anInt4166 = 2;
				Static77.anInt1763 = Static94.anInt2165;
				Static2.aClass1_Sub14_Sub1_1.method2252(158);
				Static2.aClass1_Sub14_Sub1_1.method2198(local30);
				Static2.aClass1_Sub14_Sub1_1.method2246(Static23.aBooleanArray3[82] ? 1 : 0);
				Static72.method1264(local17, local13, local45.method2088(), 0, local45.method2088(), Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
			}
		}
		if (local25 == 11) {
			Static2.aClass1_Sub14_Sub1_1.method2252(112);
			Static2.aClass1_Sub14_Sub1_1.method2208(Static174.anInt5576);
			Static2.aClass1_Sub14_Sub1_1.method2220(local17);
			Static2.aClass1_Sub14_Sub1_1.method2198(Static104.anInt2338);
			Static2.aClass1_Sub14_Sub1_1.method2228(Static289.anInt5818);
			Static2.aClass1_Sub14_Sub1_1.method2208(local13);
			Static2.aClass1_Sub14_Sub1_1.method2240(local30);
			Static34.anInt790 = 0;
			Static270.aClass191_15 = Static171.method2789(local17);
			Static215.anInt4656 = local13;
		}
		if (local25 == 22) {
			Static2.aClass1_Sub14_Sub1_1.method2252(107);
			Static2.aClass1_Sub14_Sub1_1.method2250(local17);
			Static2.aClass1_Sub14_Sub1_1.method2240(local30);
			Static2.aClass1_Sub14_Sub1_1.method2210(local13);
			Static34.anInt790 = 0;
			Static270.aClass191_15 = Static171.method2789(local17);
			Static215.anInt4656 = local13;
		}
		if (local25 == 59) {
			Static188.anInt4166 = 2;
			Static173.anInt3891 = 0;
			Static95.anInt2197 = Static89.anInt5976;
			Static77.anInt1763 = Static94.anInt2165;
			Static2.aClass1_Sub14_Sub1_1.method2252(83);
			Static2.aClass1_Sub14_Sub1_1.method2240(local13 + Static159.anInt3527);
			Static2.aClass1_Sub14_Sub1_1.method2210(local30);
			Static2.aClass1_Sub14_Sub1_1.method2200(Static23.aBooleanArray3[82] ? 1 : 0);
			Static2.aClass1_Sub14_Sub1_1.method2240(local17 + Static217.anInt4673);
			Static72.method1264(local17, local13, 0, 0, 0, Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
		}
		if (local25 == 48) {
			if (local30 == 0) {
				Static6.method216(Static185.anInt4085, local13, local17);
			} else if (local30 == 1) {
				if (Static77.anInt1764 > 0 && Static23.aBooleanArray3[82] && Static23.aBooleanArray3[81]) {
					Static50.method278(Static185.anInt4085, local17 + Static217.anInt4673, Static159.anInt3527 + local13);
				} else {
					Static58.method1055(local13, local17, 1);
					Static2.aClass1_Sub14_Sub1_1.method2191(Static208.anInt4494);
					Static2.aClass1_Sub14_Sub1_1.method2191(Static107.anInt1669);
					Static2.aClass1_Sub14_Sub1_1.method2208((int) Static62.aFloat16);
					Static2.aClass1_Sub14_Sub1_1.method2191(57);
					if (Static106.anInt2378 == 4) {
						Static2.aClass1_Sub14_Sub1_1.method2191(0);
						Static2.aClass1_Sub14_Sub1_1.method2191(0);
					} else {
						Static2.aClass1_Sub14_Sub1_1.method2191(Static220.anInt4691);
						Static2.aClass1_Sub14_Sub1_1.method2191(Static253.anInt5117);
					}
					Static2.aClass1_Sub14_Sub1_1.method2191(89);
					Static2.aClass1_Sub14_Sub1_1.method2208(Static56.aClass2_Sub4_Sub2_1.anInt2846);
					Static2.aClass1_Sub14_Sub1_1.method2208(Static56.aClass2_Sub4_Sub2_1.anInt2794);
					Static2.aClass1_Sub14_Sub1_1.method2191(Static127.anInt2721);
					Static2.aClass1_Sub14_Sub1_1.method2191(63);
					Static72.method1264(local17, local13, 0, 0, 0, Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
				}
			}
		}
		if (local25 == 13) {
			Static173.anInt3891 = 0;
			Static95.anInt2197 = Static89.anInt5976;
			Static188.anInt4166 = 2;
			Static77.anInt1763 = Static94.anInt2165;
			Static2.aClass1_Sub14_Sub1_1.method2252(43);
			Static2.aClass1_Sub14_Sub1_1.method2208(Static217.anInt4673 + local17);
			Static2.aClass1_Sub14_Sub1_1.method2210(Integer.MAX_VALUE & (int) (local21 >>> 32));
			Static2.aClass1_Sub14_Sub1_1.method2246(Static23.aBooleanArray3[82] ? 1 : 0);
			Static2.aClass1_Sub14_Sub1_1.method2240(local13 + Static159.anInt3527);
			Static31.method671(local17, local21, local13);
		}
		if (local25 == 7) {
			local45 = Static105.aClass2_Sub4_Sub1Array1[local30];
			if (local45 != null) {
				Static77.anInt1763 = Static94.anInt2165;
				Static173.anInt3891 = 0;
				Static95.anInt2197 = Static89.anInt5976;
				Static188.anInt4166 = 2;
				Static2.aClass1_Sub14_Sub1_1.method2252(139);
				Static2.aClass1_Sub14_Sub1_1.method2200(Static23.aBooleanArray3[82] ? 1 : 0);
				Static2.aClass1_Sub14_Sub1_1.method2240(local30);
				Static72.method1264(local17, local13, local45.method2088(), 0, local45.method2088(), Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
			}
		}
		@Pc(518) Class2_Sub4_Sub2 local518;
		if (local25 == 3) {
			local518 = Static155.aClass2_Sub4_Sub2Array1[local30];
			if (local518 != null) {
				Static173.anInt3891 = 0;
				Static95.anInt2197 = Static89.anInt5976;
				Static77.anInt1763 = Static94.anInt2165;
				Static188.anInt4166 = 2;
				Static2.aClass1_Sub14_Sub1_1.method2252(126);
				Static2.aClass1_Sub14_Sub1_1.method2191(Static23.aBooleanArray3[82] ? 1 : 0);
				Static2.aClass1_Sub14_Sub1_1.method2208(local30);
				Static72.method1264(local17, local13, local518.method2088(), 0, local518.method2088(), Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
			}
		}
		if (local25 == 60) {
			Static2.aClass1_Sub14_Sub1_1.method2252(41);
			Static2.aClass1_Sub14_Sub1_1.method2198(local13);
			Static2.aClass1_Sub14_Sub1_1.method2236(local17);
			Static2.aClass1_Sub14_Sub1_1.method2240(local30);
			Static34.anInt790 = 0;
			Static270.aClass191_15 = Static171.method2789(local17);
			Static215.anInt4656 = local13;
		}
		if (local25 == 30) {
			Static95.anInt2197 = Static89.anInt5976;
			Static173.anInt3891 = 0;
			Static188.anInt4166 = 2;
			Static77.anInt1763 = Static94.anInt2165;
			Static2.aClass1_Sub14_Sub1_1.method2252(254);
			Static2.aClass1_Sub14_Sub1_1.method2200(Static23.aBooleanArray3[82] ? 1 : 0);
			Static2.aClass1_Sub14_Sub1_1.method2240(Static8.anInt225);
			Static2.aClass1_Sub14_Sub1_1.method2236(Static217.anInt4676);
			Static2.aClass1_Sub14_Sub1_1.method2198(local30);
			Static2.aClass1_Sub14_Sub1_1.method2208(Static217.anInt4673 + local17);
			Static2.aClass1_Sub14_Sub1_1.method2208(Static159.anInt3527 + local13);
			Static72.method1264(local17, local13, 0, 0, 0, Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
		}
		if (local25 == 1009) {
			Static188.anInt4166 = 2;
			Static77.anInt1763 = Static94.anInt2165;
			Static173.anInt3891 = 0;
			Static95.anInt2197 = Static89.anInt5976;
			Static2.aClass1_Sub14_Sub1_1.method2252(223);
			Static2.aClass1_Sub14_Sub1_1.method2198(local30);
		}
		@Pc(729) Class191 local729;
		if (local25 == 1001) {
			local729 = Static171.method2789(local17);
			if (local729 == null || local729.anIntArray553[local13] < 100000) {
				Static2.aClass1_Sub14_Sub1_1.method2252(223);
				Static2.aClass1_Sub14_Sub1_1.method2198(local30);
			} else {
				Static116.method1877(local729.anIntArray553[local13] + " x " + Static56.method1050(local30).aString102);
			}
			Static34.anInt790 = 0;
			Static270.aClass191_15 = Static171.method2789(local17);
			Static215.anInt4656 = local13;
		}
		if (local25 == 4) {
			Static2.aClass1_Sub14_Sub1_1.method2252(102);
			Static2.aClass1_Sub14_Sub1_1.method2228(local17);
			Static2.aClass1_Sub14_Sub1_1.method2198(local13);
			Static2.aClass1_Sub14_Sub1_1.method2240(local30);
			Static34.anInt790 = 0;
			Static270.aClass191_15 = Static171.method2789(local17);
			Static215.anInt4656 = local13;
		}
		if (local25 == 31 && Static290.aClass191_16 == null) {
			Static220.method3470(local13, local17);
			Static290.aClass191_16 = Static205.method3267(local13, local17);
			Static40.method817(Static290.aClass191_16);
		}
		if (local25 == 1005) {
			Static188.anInt4166 = 2;
			Static77.anInt1763 = Static94.anInt2165;
			Static173.anInt3891 = 0;
			Static95.anInt2197 = Static89.anInt5976;
			Static2.aClass1_Sub14_Sub1_1.method2252(32);
			Static2.aClass1_Sub14_Sub1_1.method2207(Static23.aBooleanArray3[82] ? 1 : 0);
			Static2.aClass1_Sub14_Sub1_1.method2208(Static217.anInt4673 + local17);
			Static2.aClass1_Sub14_Sub1_1.method2208(Integer.MAX_VALUE & (int) (local21 >>> 32));
			Static2.aClass1_Sub14_Sub1_1.method2240(Static159.anInt3527 + local13);
			Static31.method671(local17, local21, local13);
		}
		if (local25 == 46) {
			local518 = Static155.aClass2_Sub4_Sub2Array1[local30];
			if (local518 != null) {
				Static188.anInt4166 = 2;
				Static173.anInt3891 = 0;
				Static77.anInt1763 = Static94.anInt2165;
				Static95.anInt2197 = Static89.anInt5976;
				Static2.aClass1_Sub14_Sub1_1.method2252(141);
				Static2.aClass1_Sub14_Sub1_1.method2191(Static23.aBooleanArray3[82] ? 1 : 0);
				Static2.aClass1_Sub14_Sub1_1.method2198(Static174.anInt5576);
				Static2.aClass1_Sub14_Sub1_1.method2250(Static289.anInt5818);
				Static2.aClass1_Sub14_Sub1_1.method2210(Static104.anInt2338);
				Static2.aClass1_Sub14_Sub1_1.method2208(local30);
				Static72.method1264(local17, local13, local518.method2088(), 0, local518.method2088(), Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
			}
		}
		if (local25 == 34) {
			Static173.anInt3891 = 0;
			Static95.anInt2197 = Static89.anInt5976;
			Static77.anInt1763 = Static94.anInt2165;
			Static188.anInt4166 = 2;
			Static2.aClass1_Sub14_Sub1_1.method2252(192);
			Static2.aClass1_Sub14_Sub1_1.method2208(Static159.anInt3527 + local13);
			Static2.aClass1_Sub14_Sub1_1.method2198(Static217.anInt4673 + local17);
			Static2.aClass1_Sub14_Sub1_1.method2246(Static23.aBooleanArray3[82] ? 1 : 0);
			Static2.aClass1_Sub14_Sub1_1.method2240(local30);
			Static72.method1264(local17, local13, 0, 0, 0, Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
		}
		if (local25 == 42) {
			Static2.aClass1_Sub14_Sub1_1.method2252(219);
			Static2.aClass1_Sub14_Sub1_1.method2210(local30);
			Static2.aClass1_Sub14_Sub1_1.method2210(local13);
			Static2.aClass1_Sub14_Sub1_1.method2250(local17);
			Static34.anInt790 = 0;
			Static270.aClass191_15 = Static171.method2789(local17);
			Static215.anInt4656 = local13;
		}
		if (local25 == 29) {
			local45 = Static105.aClass2_Sub4_Sub1Array1[local30];
			if (local45 != null) {
				Static95.anInt2197 = Static89.anInt5976;
				Static173.anInt3891 = 0;
				Static77.anInt1763 = Static94.anInt2165;
				Static188.anInt4166 = 2;
				Static2.aClass1_Sub14_Sub1_1.method2252(79);
				Static2.aClass1_Sub14_Sub1_1.method2198(Static104.anInt2338);
				Static2.aClass1_Sub14_Sub1_1.method2240(local30);
				Static2.aClass1_Sub14_Sub1_1.method2191(Static23.aBooleanArray3[82] ? 1 : 0);
				Static2.aClass1_Sub14_Sub1_1.method2208(Static174.anInt5576);
				Static2.aClass1_Sub14_Sub1_1.method2236(Static289.anInt5818);
				Static72.method1264(local17, local13, local45.method2088(), 0, local45.method2088(), Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
			}
		}
		if (local25 == 36) {
			Static77.anInt1763 = Static94.anInt2165;
			Static95.anInt2197 = Static89.anInt5976;
			Static173.anInt3891 = 0;
			Static188.anInt4166 = 2;
			Static2.aClass1_Sub14_Sub1_1.method2252(137);
			Static2.aClass1_Sub14_Sub1_1.method2191(Static23.aBooleanArray3[82] ? 1 : 0);
			Static2.aClass1_Sub14_Sub1_1.method2208((int) (local21 >>> 32) & Integer.MAX_VALUE);
			Static2.aClass1_Sub14_Sub1_1.method2208(local13 + Static159.anInt3527);
			Static2.aClass1_Sub14_Sub1_1.method2198(Static217.anInt4673 + local17);
			Static31.method671(local17, local21, local13);
		}
		if (local25 == 26) {
			local518 = Static155.aClass2_Sub4_Sub2Array1[local30];
			if (local518 != null) {
				Static173.anInt3891 = 0;
				Static188.anInt4166 = 2;
				Static95.anInt2197 = Static89.anInt5976;
				Static77.anInt1763 = Static94.anInt2165;
				Static2.aClass1_Sub14_Sub1_1.method2252(100);
				Static2.aClass1_Sub14_Sub1_1.method2207(Static23.aBooleanArray3[82] ? 1 : 0);
				Static2.aClass1_Sub14_Sub1_1.method2198(local30);
				Static72.method1264(local17, local13, local518.method2088(), 0, local518.method2088(), Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
			}
		}
		if (local25 == 8) {
			local518 = Static155.aClass2_Sub4_Sub2Array1[local30];
			if (local518 != null) {
				Static77.anInt1763 = Static94.anInt2165;
				Static173.anInt3891 = 0;
				Static188.anInt4166 = 2;
				Static95.anInt2197 = Static89.anInt5976;
				Static2.aClass1_Sub14_Sub1_1.method2252(111);
				Static2.aClass1_Sub14_Sub1_1.method2207(Static23.aBooleanArray3[82] ? 1 : 0);
				Static2.aClass1_Sub14_Sub1_1.method2208(local30);
				Static72.method1264(local17, local13, local518.method2088(), 0, local518.method2088(), Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
			}
		}
		if (local25 == 28) {
			local45 = Static105.aClass2_Sub4_Sub1Array1[local30];
			if (local45 != null) {
				Static95.anInt2197 = Static89.anInt5976;
				Static77.anInt1763 = Static94.anInt2165;
				Static173.anInt3891 = 0;
				Static188.anInt4166 = 2;
				Static2.aClass1_Sub14_Sub1_1.method2252(183);
				Static2.aClass1_Sub14_Sub1_1.method2191(Static23.aBooleanArray3[82] ? 1 : 0);
				Static2.aClass1_Sub14_Sub1_1.method2240(local30);
				Static72.method1264(local17, local13, local45.method2088(), 0, local45.method2088(), Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
			}
		}
		if (local25 == 45) {
			Static77.anInt1763 = Static94.anInt2165;
			Static173.anInt3891 = 0;
			Static95.anInt2197 = Static89.anInt5976;
			Static188.anInt4166 = 2;
			Static2.aClass1_Sub14_Sub1_1.method2252(105);
			Static2.aClass1_Sub14_Sub1_1.method2198(Static217.anInt4673 + local17);
			Static2.aClass1_Sub14_Sub1_1.method2210((int) (local21 >>> 32) & Integer.MAX_VALUE);
			Static2.aClass1_Sub14_Sub1_1.method2191(Static23.aBooleanArray3[82] ? 1 : 0);
			Static2.aClass1_Sub14_Sub1_1.method2240(Static159.anInt3527 + local13);
			Static2.aClass1_Sub14_Sub1_1.method2198(Static8.anInt225);
			Static2.aClass1_Sub14_Sub1_1.method2228(Static217.anInt4676);
			Static31.method671(local17, local21, local13);
		}
		if (local25 == 6) {
			local729 = Static171.method2789(local17);
			@Pc(1483) boolean local1483 = true;
			if (local729.anInt6115 > 0) {
				local1483 = Static209.method3349(local729);
			}
			if (local1483) {
				Static2.aClass1_Sub14_Sub1_1.method2252(177);
				Static2.aClass1_Sub14_Sub1_1.method2236(local17);
			}
		}
		if (local25 == 5) {
			Static95.anInt2197 = Static89.anInt5976;
			Static173.anInt3891 = 0;
			Static188.anInt4166 = 2;
			Static77.anInt1763 = Static94.anInt2165;
			Static2.aClass1_Sub14_Sub1_1.method2252(251);
			Static2.aClass1_Sub14_Sub1_1.method2191(Static23.aBooleanArray3[82] ? 1 : 0);
			Static2.aClass1_Sub14_Sub1_1.method2198(Static174.anInt5576);
			Static2.aClass1_Sub14_Sub1_1.method2208(Static217.anInt4673 + local17);
			Static2.aClass1_Sub14_Sub1_1.method2250(Static289.anInt5818);
			Static2.aClass1_Sub14_Sub1_1.method2208(Static104.anInt2338);
			Static2.aClass1_Sub14_Sub1_1.method2240(Integer.MAX_VALUE & (int) (local21 >>> 32));
			Static2.aClass1_Sub14_Sub1_1.method2240(local13 + Static159.anInt3527);
			Static31.method671(local17, local21, local13);
		}
		if (local25 == 23) {
			Static173.anInt3891 = 0;
			Static188.anInt4166 = 2;
			Static77.anInt1763 = Static94.anInt2165;
			Static95.anInt2197 = Static89.anInt5976;
			Static2.aClass1_Sub14_Sub1_1.method2252(25);
			Static2.aClass1_Sub14_Sub1_1.method2210(Static174.anInt5576);
			Static2.aClass1_Sub14_Sub1_1.method2208(local30);
			Static2.aClass1_Sub14_Sub1_1.method2208(local13 + Static159.anInt3527);
			Static2.aClass1_Sub14_Sub1_1.method2191(Static23.aBooleanArray3[82] ? 1 : 0);
			Static2.aClass1_Sub14_Sub1_1.method2208(local17 + Static217.anInt4673);
			Static2.aClass1_Sub14_Sub1_1.method2228(Static289.anInt5818);
			Static2.aClass1_Sub14_Sub1_1.method2240(Static104.anInt2338);
			Static72.method1264(local17, local13, 0, 0, 0, Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
		}
		if (local25 == 51) {
			local518 = Static155.aClass2_Sub4_Sub2Array1[local30];
			if (local518 != null) {
				Static77.anInt1763 = Static94.anInt2165;
				Static95.anInt2197 = Static89.anInt5976;
				Static188.anInt4166 = 2;
				Static173.anInt3891 = 0;
				Static2.aClass1_Sub14_Sub1_1.method2252(5);
				Static2.aClass1_Sub14_Sub1_1.method2207(Static23.aBooleanArray3[82] ? 1 : 0);
				Static2.aClass1_Sub14_Sub1_1.method2208(local30);
				Static72.method1264(local17, local13, local518.method2088(), 0, local518.method2088(), Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
			}
		}
		if (local25 == 44) {
			if (local30 == 0) {
				Static38.anInt957 = 1;
				Static6.method216(Static185.anInt4085, local13, local17);
			} else if (Static77.anInt1764 > 0 && Static23.aBooleanArray3[82] && Static23.aBooleanArray3[81]) {
				Static50.method278(Static185.anInt4085, local17 + Static217.anInt4673, local13 + Static159.anInt3527);
			} else {
				Static2.aClass1_Sub14_Sub1_1.method2252(125);
				Static2.aClass1_Sub14_Sub1_1.method2210(Static159.anInt3527 + local13);
				Static2.aClass1_Sub14_Sub1_1.method2208(Static217.anInt4673 + local17);
			}
		}
		if (local25 == 25) {
			Static2.aClass1_Sub14_Sub1_1.method2252(145);
			Static2.aClass1_Sub14_Sub1_1.method2210(local13);
			Static2.aClass1_Sub14_Sub1_1.method2240(local30);
			Static2.aClass1_Sub14_Sub1_1.method2220(local17);
			Static34.anInt790 = 0;
			Static270.aClass191_15 = Static171.method2789(local17);
			Static215.anInt4656 = local13;
		}
		if (local25 == 19) {
			local518 = Static155.aClass2_Sub4_Sub2Array1[local30];
			if (local518 != null) {
				Static77.anInt1763 = Static94.anInt2165;
				Static95.anInt2197 = Static89.anInt5976;
				Static173.anInt3891 = 0;
				Static188.anInt4166 = 2;
				Static2.aClass1_Sub14_Sub1_1.method2252(135);
				Static2.aClass1_Sub14_Sub1_1.method2191(Static23.aBooleanArray3[82] ? 1 : 0);
				Static2.aClass1_Sub14_Sub1_1.method2210(local30);
				Static72.method1264(local17, local13, local518.method2088(), 0, local518.method2088(), Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
			}
		}
		if (local25 == 50) {
			Static188.anInt4166 = 2;
			Static95.anInt2197 = Static89.anInt5976;
			Static77.anInt1763 = Static94.anInt2165;
			Static173.anInt3891 = 0;
			Static2.aClass1_Sub14_Sub1_1.method2252(244);
			Static2.aClass1_Sub14_Sub1_1.method2198(Static159.anInt3527 + local13);
			Static2.aClass1_Sub14_Sub1_1.method2246(Static23.aBooleanArray3[82] ? 1 : 0);
			Static2.aClass1_Sub14_Sub1_1.method2210(local17 + Static217.anInt4673);
			Static2.aClass1_Sub14_Sub1_1.method2198(local30);
			Static72.method1264(local17, local13, 0, 0, 0, Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
		}
		if (local25 == 2) {
			local45 = Static105.aClass2_Sub4_Sub1Array1[local30];
			if (local45 != null) {
				Static188.anInt4166 = 2;
				Static77.anInt1763 = Static94.anInt2165;
				Static173.anInt3891 = 0;
				Static95.anInt2197 = Static89.anInt5976;
				Static2.aClass1_Sub14_Sub1_1.method2252(208);
				Static2.aClass1_Sub14_Sub1_1.method2200(Static23.aBooleanArray3[82] ? 1 : 0);
				Static2.aClass1_Sub14_Sub1_1.method2198(local30);
				Static72.method1264(local17, local13, local45.method2088(), 0, local45.method2088(), Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
			}
		}
		if (local25 == 49) {
			if (local30 == 0) {
				Static65.anInt1391 = 1;
				Static6.method216(Static185.anInt4085, local13, local17);
			} else if (local30 == 1) {
				Static2.aClass1_Sub14_Sub1_1.method2252(216);
				Static2.aClass1_Sub14_Sub1_1.method2240(Static8.anInt225);
				Static2.aClass1_Sub14_Sub1_1.method2198(Static159.anInt3527 + local13);
				Static2.aClass1_Sub14_Sub1_1.method2236(Static217.anInt4676);
				Static2.aClass1_Sub14_Sub1_1.method2210(Static217.anInt4673 + local17);
			}
		}
		if (local25 == 15) {
			local518 = Static155.aClass2_Sub4_Sub2Array1[local30];
			if (local518 != null) {
				Static77.anInt1763 = Static94.anInt2165;
				Static95.anInt2197 = Static89.anInt5976;
				Static173.anInt3891 = 0;
				Static188.anInt4166 = 2;
				Static2.aClass1_Sub14_Sub1_1.method2252(12);
				Static2.aClass1_Sub14_Sub1_1.method2210(local30);
				Static2.aClass1_Sub14_Sub1_1.method2207(Static23.aBooleanArray3[82] ? 1 : 0);
				Static72.method1264(local17, local13, local518.method2088(), 0, local518.method2088(), Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
			}
		}
		if (local25 == 24) {
			local729 = Static205.method3267(local13, local17);
			if (local729 != null) {
				Static269.method4059();
				@Pc(2145) Class1_Sub30 local2145 = Static35.method737(local729);
				Static187.method3024(local729.anInt6174, local13, local2145.method4556(), local2145.anInt5928, local17, local729.anInt6117);
				Static24.anInt662 = 0;
				Static244.aString290 = Static12.method2958(local729);
				if (Static244.aString290 == null) {
					Static244.aString290 = "Null";
				}
				if (local729.aBoolean408) {
					Static303.aString426 = local729.aString433 + "<col=ffffff>";
				} else {
					Static303.aString426 = "<col=00ff00>" + local729.aString435 + "<col=ffffff>";
				}
			}
			return;
		}
		if (local25 == 57) {
			Static2.aClass1_Sub14_Sub1_1.method2252(119);
			Static2.aClass1_Sub14_Sub1_1.method2220(local17);
			Static2.aClass1_Sub14_Sub1_1.method2210(local30);
			Static2.aClass1_Sub14_Sub1_1.method2208(local13);
			Static34.anInt790 = 0;
			Static270.aClass191_15 = Static171.method2789(local17);
			Static215.anInt4656 = local13;
		}
		if (local25 == 12) {
			local518 = Static155.aClass2_Sub4_Sub2Array1[local30];
			if (local518 != null) {
				Static173.anInt3891 = 0;
				Static95.anInt2197 = Static89.anInt5976;
				Static188.anInt4166 = 2;
				Static77.anInt1763 = Static94.anInt2165;
				Static2.aClass1_Sub14_Sub1_1.method2252(249);
				Static2.aClass1_Sub14_Sub1_1.method2198(Static8.anInt225);
				Static2.aClass1_Sub14_Sub1_1.method2228(Static217.anInt4676);
				Static2.aClass1_Sub14_Sub1_1.method2210(local30);
				Static2.aClass1_Sub14_Sub1_1.method2207(Static23.aBooleanArray3[82] ? 1 : 0);
				Static72.method1264(local17, local13, local518.method2088(), 0, local518.method2088(), Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
			}
		}
		if (local25 == 21) {
			Static2.aClass1_Sub14_Sub1_1.method2252(242);
			Static2.aClass1_Sub14_Sub1_1.method2236(local17);
			Static2.aClass1_Sub14_Sub1_1.method2210(local13);
			Static2.aClass1_Sub14_Sub1_1.method2210(local30);
			Static34.anInt790 = 0;
			Static270.aClass191_15 = Static171.method2789(local17);
			Static215.anInt4656 = local13;
		}
		if (local25 == 17) {
			Static2.aClass1_Sub14_Sub1_1.method2252(173);
			Static2.aClass1_Sub14_Sub1_1.method2208(local30);
			Static2.aClass1_Sub14_Sub1_1.method2220(local17);
			Static2.aClass1_Sub14_Sub1_1.method2198(local13);
			Static34.anInt790 = 0;
			Static270.aClass191_15 = Static171.method2789(local17);
			Static215.anInt4656 = local13;
		}
		if (local25 == 1) {
			local518 = Static155.aClass2_Sub4_Sub2Array1[local30];
			if (local518 != null) {
				Static173.anInt3891 = 0;
				Static188.anInt4166 = 2;
				Static77.anInt1763 = Static94.anInt2165;
				Static95.anInt2197 = Static89.anInt5976;
				Static2.aClass1_Sub14_Sub1_1.method2252(101);
				Static2.aClass1_Sub14_Sub1_1.method2200(Static23.aBooleanArray3[82] ? 1 : 0);
				Static2.aClass1_Sub14_Sub1_1.method2240(local30);
				Static72.method1264(local17, local13, local518.method2088(), 0, local518.method2088(), Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
			}
		}
		if (local25 == 38) {
			Static2.aClass1_Sub14_Sub1_1.method2252(94);
			Static2.aClass1_Sub14_Sub1_1.method2250(local17);
			Static2.aClass1_Sub14_Sub1_1.method2240(local13);
			Static2.aClass1_Sub14_Sub1_1.method2210(local30);
			Static34.anInt790 = 0;
			Static270.aClass191_15 = Static171.method2789(local17);
			Static215.anInt4656 = local13;
		}
		if (local25 == 9) {
			Static10.method301();
		}
		if (local25 == 39) {
			local518 = Static155.aClass2_Sub4_Sub2Array1[local30];
			if (local518 != null) {
				Static95.anInt2197 = Static89.anInt5976;
				Static77.anInt1763 = Static94.anInt2165;
				Static188.anInt4166 = 2;
				Static173.anInt3891 = 0;
				Static2.aClass1_Sub14_Sub1_1.method2252(136);
				Static2.aClass1_Sub14_Sub1_1.method2246(Static23.aBooleanArray3[82] ? 1 : 0);
				Static2.aClass1_Sub14_Sub1_1.method2210(local30);
				Static72.method1264(local17, local13, local518.method2088(), 0, local518.method2088(), Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
			}
		}
		if (local25 == 10) {
			Static95.anInt2197 = Static89.anInt5976;
			Static173.anInt3891 = 0;
			Static188.anInt4166 = 2;
			Static77.anInt1763 = Static94.anInt2165;
			Static2.aClass1_Sub14_Sub1_1.method2252(138);
			Static2.aClass1_Sub14_Sub1_1.method2246(Static23.aBooleanArray3[82] ? 1 : 0);
			Static2.aClass1_Sub14_Sub1_1.method2198(Static217.anInt4673 + local17);
			Static2.aClass1_Sub14_Sub1_1.method2198(Static159.anInt3527 + local13);
			Static2.aClass1_Sub14_Sub1_1.method2210(local30);
			Static72.method1264(local17, local13, 0, 0, 0, Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
		}
		if (local25 == 18) {
			local45 = Static105.aClass2_Sub4_Sub1Array1[local30];
			if (local45 != null) {
				Static77.anInt1763 = Static94.anInt2165;
				Static95.anInt2197 = Static89.anInt5976;
				Static173.anInt3891 = 0;
				Static188.anInt4166 = 2;
				Static2.aClass1_Sub14_Sub1_1.method2252(253);
				Static2.aClass1_Sub14_Sub1_1.method2228(Static217.anInt4676);
				Static2.aClass1_Sub14_Sub1_1.method2200(Static23.aBooleanArray3[82] ? 1 : 0);
				Static2.aClass1_Sub14_Sub1_1.method2210(local30);
				Static2.aClass1_Sub14_Sub1_1.method2210(Static8.anInt225);
				Static72.method1264(local17, local13, local45.method2088(), 0, local45.method2088(), Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
			}
		}
		@Pc(2738) int local2738;
		if (local25 == 47) {
			Static2.aClass1_Sub14_Sub1_1.method2252(177);
			Static2.aClass1_Sub14_Sub1_1.method2236(local17);
			local729 = Static171.method2789(local17);
			if (local729.anIntArrayArray78 != null && local729.anIntArrayArray78[0][0] == 5) {
				local2738 = local729.anIntArrayArray78[0][1];
				if (local729.anIntArray560[0] != Static296.anIntArray530[local2738]) {
					Static296.anIntArray530[local2738] = local729.anIntArray560[0];
					Static146.method3260(local2738);
				}
			}
		}
		if (local25 == 35) {
			Static95.anInt2197 = Static89.anInt5976;
			Static188.anInt4166 = 2;
			Static77.anInt1763 = Static94.anInt2165;
			Static173.anInt3891 = 0;
			Static2.aClass1_Sub14_Sub1_1.method2252(63);
			Static2.aClass1_Sub14_Sub1_1.method2208((int) (local21 >>> 32) & Integer.MAX_VALUE);
			Static2.aClass1_Sub14_Sub1_1.method2240(local17 + Static217.anInt4673);
			Static2.aClass1_Sub14_Sub1_1.method2207(Static23.aBooleanArray3[82] ? 1 : 0);
			Static2.aClass1_Sub14_Sub1_1.method2210(local13 + Static159.anInt3527);
			Static31.method671(local17, local21, local13);
		}
		if (local25 == 37) {
			Static188.anInt4166 = 2;
			Static173.anInt3891 = 0;
			Static77.anInt1763 = Static94.anInt2165;
			Static95.anInt2197 = Static89.anInt5976;
			Static2.aClass1_Sub14_Sub1_1.method2252(227);
			Static2.aClass1_Sub14_Sub1_1.method2207(Static23.aBooleanArray3[82] ? 1 : 0);
			Static2.aClass1_Sub14_Sub1_1.method2210((int) (local21 >>> 32) & Integer.MAX_VALUE);
			Static2.aClass1_Sub14_Sub1_1.method2240(local13 + Static159.anInt3527);
			Static2.aClass1_Sub14_Sub1_1.method2240(local17 + Static217.anInt4673);
			Static31.method671(local17, local21, local13);
		}
		if (local25 == 1008) {
			Static188.anInt4166 = 2;
			Static77.anInt1763 = Static94.anInt2165;
			Static173.anInt3891 = 0;
			Static95.anInt2197 = Static89.anInt5976;
			local45 = Static105.aClass2_Sub4_Sub1Array1[local30];
			if (local45 != null) {
				@Pc(2902) Class145 local2902 = local45.aClass145_1;
				if (local2902.anIntArray455 != null) {
					local2902 = local2902.method3711();
				}
				if (local2902 != null) {
					Static2.aClass1_Sub14_Sub1_1.method2252(59);
					Static2.aClass1_Sub14_Sub1_1.method2198(local2902.anInt4945);
				}
			}
		}
		if (local25 == 16) {
			Static2.aClass1_Sub14_Sub1_1.method2252(89);
			Static2.aClass1_Sub14_Sub1_1.method2220(local17);
			Static2.aClass1_Sub14_Sub1_1.method2198(local13);
			Static2.aClass1_Sub14_Sub1_1.method2228(Static217.anInt4676);
			Static2.aClass1_Sub14_Sub1_1.method2208(Static8.anInt225);
		}
		if (local25 == 43 || local25 == 1010) {
			Static299.method4566(local30, Static190.aStringArray34[arg0], local17, local13);
		}
		if (local25 == 58) {
			Static173.anInt3891 = 0;
			Static77.anInt1763 = Static94.anInt2165;
			Static188.anInt4166 = 2;
			Static95.anInt2197 = Static89.anInt5976;
			Static2.aClass1_Sub14_Sub1_1.method2252(204);
			Static2.aClass1_Sub14_Sub1_1.method2210(local30);
			Static2.aClass1_Sub14_Sub1_1.method2210(Static159.anInt3527 + local13);
			Static2.aClass1_Sub14_Sub1_1.method2198(local17 + Static217.anInt4673);
			Static2.aClass1_Sub14_Sub1_1.method2191(Static23.aBooleanArray3[82] ? 1 : 0);
			Static72.method1264(local17, local13, 0, 0, 0, Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
		}
		if (local25 == 1004) {
			Static173.anInt3891 = 0;
			Static188.anInt4166 = 2;
			Static77.anInt1763 = Static94.anInt2165;
			Static95.anInt2197 = Static89.anInt5976;
			Static2.aClass1_Sub14_Sub1_1.method2252(46);
			Static2.aClass1_Sub14_Sub1_1.method2198(local30);
		}
		if (local25 == 1002 || local25 == 1006 || local25 == 1007 || local25 == 1012 || local25 == 1011) {
			Static184.method2983(local30, local13, local25);
		}
		if (local25 == 32) {
			local45 = Static105.aClass2_Sub4_Sub1Array1[local30];
			if (local45 != null) {
				Static95.anInt2197 = Static89.anInt5976;
				Static77.anInt1763 = Static94.anInt2165;
				Static188.anInt4166 = 2;
				Static173.anInt3891 = 0;
				Static2.aClass1_Sub14_Sub1_1.method2252(45);
				Static2.aClass1_Sub14_Sub1_1.method2246(Static23.aBooleanArray3[82] ? 1 : 0);
				Static2.aClass1_Sub14_Sub1_1.method2208(local30);
				Static72.method1264(local17, local13, local45.method2088(), 0, local45.method2088(), Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
			}
		}
		if (local25 == 33) {
			Static269.method4059();
			local729 = Static171.method2789(local17);
			Static104.anInt2338 = local30;
			Static24.anInt662 = 1;
			Static289.anInt5818 = local17;
			Static174.anInt5576 = local13;
			Static40.method817(local729);
			Static311.aString444 = "<col=ff9040>" + Static56.method1050(local30).aString102 + "<col=ffffff>";
			if (Static311.aString444 == null) {
				Static311.aString444 = "null";
			}
			return;
		}
		if (local25 == 20) {
			Static2.aClass1_Sub14_Sub1_1.method2252(179);
			Static2.aClass1_Sub14_Sub1_1.method2228(local17);
			Static2.aClass1_Sub14_Sub1_1.method2198(local30);
			Static2.aClass1_Sub14_Sub1_1.method2236(Static217.anInt4676);
			Static2.aClass1_Sub14_Sub1_1.method2240(Static8.anInt225);
			Static2.aClass1_Sub14_Sub1_1.method2240(local13);
			Static34.anInt790 = 0;
			Static270.aClass191_15 = Static171.method2789(local17);
			Static215.anInt4656 = local13;
		}
		if (local25 == 14) {
			Static2.aClass1_Sub14_Sub1_1.method2252(177);
			Static2.aClass1_Sub14_Sub1_1.method2236(local17);
			local729 = Static171.method2789(local17);
			if (local729.anIntArrayArray78 != null && local729.anIntArrayArray78[0][0] == 5) {
				local2738 = local729.anIntArrayArray78[0][1];
				Static296.anIntArray530[local2738] = 1 - Static296.anIntArray530[local2738];
				Static146.method3260(local2738);
			}
		}
		if (local25 == 41) {
			Static2.aClass1_Sub14_Sub1_1.method2252(121);
			Static2.aClass1_Sub14_Sub1_1.method2198(local30);
			Static2.aClass1_Sub14_Sub1_1.method2210(local13);
			Static2.aClass1_Sub14_Sub1_1.method2250(local17);
			Static34.anInt790 = 0;
			Static270.aClass191_15 = Static171.method2789(local17);
			Static215.anInt4656 = local13;
		}
		if (Static24.anInt662 != 0) {
			Static24.anInt662 = 0;
			Static40.method817(Static171.method2789(Static289.anInt5818));
		}
		if (Static230.aBoolean185) {
			Static269.method4059();
		}
		if (Static270.aClass191_15 != null && Static34.anInt790 == 0) {
			Static40.method817(Static270.aClass191_15);
		}
	}
}
