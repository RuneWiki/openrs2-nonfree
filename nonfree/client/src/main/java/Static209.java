import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!wm;IILclient!on;III[[[B[I[I[I[I[IIBIIZ)V", line = 137)
	public static void method3955(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class14 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static16.aClass19_10 = arg0;
		Static269.anInt5500 = arg1;
		Static48.aClass14_2 = arg3;
		Static151.aBoolean208 = Static16.aClass19_10.method2888() > 0;
		Static229.anInt4641 = arg4 >> Static299.anInt6017;
		Static197.anInt3776 = arg6 >> Static299.anInt6017;
		Static328.anInt6520 = arg4;
		Static334.anInt6684 = arg6;
		Static110.anInt2372 = arg5;
		Static152.anInt2957 = Static229.anInt4641 - Static198.anInt3784;
		if (Static152.anInt2957 < 0) {
			Static73.anInt1754 = -Static152.anInt2957;
			Static152.anInt2957 = 0;
		} else {
			Static73.anInt1754 = 0;
		}
		Static207.anInt3944 = Static197.anInt3776 - Static198.anInt3784;
		if (Static207.anInt3944 < 0) {
			Static306.anInt6155 = -Static207.anInt3944;
			Static207.anInt3944 = 0;
		} else {
			Static306.anInt6155 = 0;
		}
		Static206.anInt4628 = Static229.anInt4641 + Static198.anInt3784;
		if (Static206.anInt4628 > Static68.anInt1682) {
			Static206.anInt4628 = Static68.anInt1682;
		}
		Static28.anInt722 = Static197.anInt3776 + Static198.anInt3784;
		if (Static28.anInt722 > Static196.anInt3769) {
			Static28.anInt722 = Static196.anInt3769;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static198.anInt3784 + Static198.anInt3784 + 2; local74++) {
			for (local77 = 0; local77 < Static198.anInt3784 + Static198.anInt3784 + 2; local77++) {
				local84 = Static229.anInt4641 + local74 - Static198.anInt3784;
				local90 = Static197.anInt3776 + local77 - Static198.anInt3784;
				if (local84 >= 0 && local90 >= 0 && local84 < Static68.anInt1682 && local90 < Static196.anInt3769) {
					@Pc(104) int local104 = local84 << Static299.anInt6017;
					@Pc(108) int local108 = local90 << Static299.anInt6017;
					@Pc(120) int local120 = Static307.aClass6Array3[Static307.aClass6Array3.length - 1].method5720(local84, local90) - 1000;
					@Pc(140) int local140 = Static174.aClass6Array2 == null ? Static307.aClass6Array3[0].method5720(local84, local90) + Class11_Sub5_Sub3.anInt4707 : Static174.aClass6Array2[0].method5720(local84, local90) + Class11_Sub5_Sub3.anInt4707;
					Static339.aBooleanArrayArray5[local74][local77] = Static16.aClass19_10.method2843(local104, local120, local108, local104, local140, local108);
				} else {
					Static339.aBooleanArrayArray5[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static198.anInt3784 + Static198.anInt3784 + 1; local77++) {
			for (local84 = 0; local84 < Static198.anInt3784 + Static198.anInt3784 + 1; local84++) {
				Static6.aBooleanArrayArray1[local77][local84] = Static339.aBooleanArrayArray5[local77][local84] || Static339.aBooleanArrayArray5[local77 + 1][local84] || Static339.aBooleanArrayArray5[local77][local84 + 1] || Static339.aBooleanArrayArray5[local77 + 1][local84 + 1];
			}
		}
		Static170.anIntArray205 = arg8;
		Static150.anIntArray185 = arg9;
		Static350.anIntArray483 = arg10;
		Static89.anIntArray126 = arg11;
		Static331.anIntArray462 = arg12;
		Static75.method1871();
		Static263.method4921();
		for (@Pc(256) Class12_Sub4 local256 = (Class12_Sub4) Class2_Sub4.aClass36_6.method1417(); local256 != null; local256 = (Class12_Sub4) Class2_Sub4.aClass36_6.method1422()) {
			local256.method5685();
			Static69.method1824(local256);
		}
		if (Static151.aBoolean208) {
			for (local90 = 0; local90 < Static154.anInt3135; local90++) {
				Static283.aClass2_Sub26_Sub1Array2[local90].method4154(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static16.aClass19_10.method2867(0);
			if (Static153.aClass15_1 == null || Static153.aClass15_1 instanceof Class15_Sub2) {
				Static153.aClass15_1 = new Class15_Sub1();
			}
		} else if (Static153.aClass15_1 == null || Static153.aClass15_1 instanceof Class15_Sub1) {
			Static153.aClass15_1 = new Class15_Sub2();
		}
		Static153.aClass15_1.method1584(arg2);
		Static153.aClass15_1.method1588();
		if (Static84.aClass67ArrayArrayArray4 != null) {
			Static318.method5768(true);
			Static153.aClass15_1.method1580(22);
			Static365.method6459(arg2, null, 0, (byte) 0, arg15, arg16);
			Static153.aClass15_1.method1588();
			Static153.aClass15_1.method1580(23);
			Static318.method5768(false);
		}
		Static365.method6459(arg2, arg7, arg13, arg14, arg15, arg16);
		Static153.aClass15_1.method1588();
		Static153.aClass15_1.method1587();
		Static153.aClass15_1.method1588();
		if (arg2 > 1) {
			Static16.aClass19_10.method2895(0);
		}
		Static16.aClass19_10.method2836(0, null);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V", line = 292)
	public static void method3956(@OriginalArg(0) int arg0) {
		Class11_Sub4_Sub1.anInt3974 = arg0;
		Class161.anInt4294 = -1;
		Static84.anInt6624 = 100;
		Static226.anInt4488 = 3;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZIIIFII)[[I", line = 322)
	public static int[][] method3957(@OriginalArg(6) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub3_Sub6 local13 = new Class2_Sub3_Sub6();
		local13.anInt1050 = 8;
		local13.anInt1042 = 3;
		local13.aBoolean85 = false;
		local13.anInt1048 = (int) (arg0 * 4096.0F);
		local13.anInt1049 = 4;
		local13.method6481();
		Static146.method2791(64, 256);
		for (@Pc(40) int local40 = 0; local40 < 256; local40++) {
			local13.method1308(local9[local40], local40);
		}
		return local9;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 358)
	public static void method3958() {
		@Pc(1) Class98 local1 = Class68.aClass98_9;
		synchronized (Class68.aClass98_9) {
			Class68.aClass98_9.method2623();
		}
		local1 = Class230.aClass98_58;
		synchronized (Class230.aClass98_58) {
			Class230.aClass98_58.method2623();
		}
	}
}
