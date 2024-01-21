import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Lclient!d;")
	public static Class14 aClass14_5;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	public static int anInt2526;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "Lclient!k;")
	public static Canvas_Sub1 aCanvas_Sub1_1;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Lclient!o;")
	public static Class40 aClass40_725 = Static13.method257("backleft1");

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Lclient!o;")
	public static Class40 aClass40_726 = Static13.method257("p12_full");

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Lclient!ba;")
	public static Class6 aClass6_7 = new Class6(4096);

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	public static volatile int anInt2520 = 0;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!o;")
	public static Class40 aClass40_727 = Static13.method257("mapdots");

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "Lclient!o;")
	public static Class40 aClass40_728 = Static13.method257(":tradereq:");

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "Lclient!o;")
	public static Class40 aClass40_729 = Static13.method257("attack");

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZZI)I")
	public static int method1668() {
		return Static96.anInt2333 + Static2.anInt34;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Lclient!hb;")
	public static Class2_Sub2_Sub8 method1669(@OriginalArg(1) int arg0) {
		@Pc(18) Class2_Sub2_Sub8 local18 = (Class2_Sub2_Sub8) Static81.aClass47_16.method1325((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static41.aClass5_13.method68(arg0, 10);
		local18 = new Class2_Sub2_Sub8();
		local18.anInt954 = arg0;
		if (local28 != null) {
			local18.method724(new Class2_Sub3(local28));
		}
		local18.method716();
		if (local18.anInt932 != -1) {
			local18.method721(method1669(local18.anInt956), method1669(local18.anInt932));
		}
		if (!Static43.aBoolean150 && local18.aBoolean66) {
			local18.aClass40Array16 = null;
			local18.aClass40Array17 = null;
			local18.aClass40_290 = Static10.aClass40_65;
			local18.aClass40_289 = Static24.aClass40_181;
			local18.anInt951 = 0;
		}
		Static81.aClass47_16.method1332((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public static void method1670() {
		aCanvas_Sub1_1 = null;
		aClass40_726 = null;
		aClass6_7 = null;
		aClass40_728 = null;
		aClass40_725 = null;
		aClass40_727 = null;
		aClass40_729 = null;
		aByteArrayArray12 = null;
		aClass14_5 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public static void method1671() {
		Static12.aBoolean27 = true;
		Static5.aLong12 = 0L;
		Static63.anInt1612 = 0;
		Static97.aBoolean174 = true;
		Static44.aClass52_1.anInt1982 = 0;
		Static100.method1584();
		Static7.anInt231 = 0;
		Static85.anInt1986 = -1;
		Static80.aClass2_Sub3_Sub1_4.anInt2546 = 0;
		Static88.anInt2083 = -1;
		Static56.aClass2_Sub3_Sub1_5.anInt2546 = 0;
		Static97.aBoolean175 = false;
		Static97.anInt2352 = -1;
		Static84.anInt1973 = 0;
		Static67.anInt1672 = 0;
		Static34.anInt797 = 0;
		Static33.anInt788 = -1;
		Static91.anInt2139 = 0;
		Static37.method722(0);
		for (@Pc(1645) int local1645 = 0; local1645 < 100; local1645++) {
			Static63.aClass40Array30[local1645] = null;
		}
		Static22.anInt2590 = -1;
		Static104.anInt2518 = (int) (Math.random() * 100.0D) - 50;
		Static73.anInt1800 = 0;
		Static96.anInt2328 = 0;
		Static38.anInt986 = 0;
		Static80.anInt1919 = 0;
		Static10.anInt262 = (int) (Math.random() * 80.0D) - 40;
		Static67.anInt1669 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static15.anInt1857 = (int) (Math.random() * 30.0D) - 20;
		Static79.anInt1874 = 0;
		Static4.anInt131 = 0;
		Static88.anInt2067 = 0;
		Static24.anInt641 = 0;
		Static98.anInt2371 = (int) (Math.random() * 110.0D) - 55;
		Static84.anInt1978 = (int) (Math.random() * 120.0D) - 60;
		for (@Pc(1726) int local1726 = 0; local1726 < 2048; local1726++) {
			Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local1726] = null;
			Static59.aClass2_Sub3Array1[local1726] = null;
		}
		for (@Pc(1744) int local1744 = 0; local1744 < 16384; local1744++) {
			Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local1744] = null;
		}
		Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[2047] = new Class2_Sub2_Sub12_Sub1_Sub1();
		Static24.aClass44_4.method1222();
		Static96.aClass44_8.method1222();
		@Pc(1776) int local1776;
		for (@Pc(1772) int local1772 = 0; local1772 < 4; local1772++) {
			for (local1776 = 0; local1776 < 104; local1776++) {
				for (@Pc(1780) int local1780 = 0; local1780 < 104; local1780++) {
					Static91.aClass44ArrayArrayArray1[local1772][local1776][local1780] = null;
				}
			}
		}
		Static92.aClass44_7 = new Class44();
		Static22.anInt2594 = 0;
		Static42.anInt1038 = 0;
		Static83.method1350(Static38.anInt980);
		Static38.anInt980 = -1;
		Static83.method1350(Static85.anInt1994);
		Static85.anInt1994 = -1;
		Static83.method1350(Static22.anInt2585);
		Static22.anInt2585 = -1;
		Static83.method1350(Static84.anInt1971);
		Static84.anInt1971 = -1;
		Static83.method1350(Static93.anInt2175);
		Static93.anInt2175 = -1;
		Static83.method1350(Static66.anInt1654);
		Static66.anInt1654 = -1;
		Static83.method1350(Static3.anInt51);
		Static62.anInt1551 = 3;
		Static101.anInt2399 = 0;
		Static20.aBoolean40 = false;
		Static103.anInt2492 = -1;
		Static107.anInt2505 = 0;
		Static74.aBoolean146 = false;
		Static17.aClass40_112 = null;
		Static97.aBoolean175 = false;
		Static3.anInt51 = -1;
		Static38.aClass33_1.method1001(false, new int[5], -1, null);
		for (local1776 = 0; local1776 < 5; local1776++) {
			Static13.aClass40Array6[local1776] = null;
			Static46.aBooleanArray41[local1776] = false;
		}
		Static75.aBoolean147 = true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(JI)V")
	public static void method1672(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
	public static void method1673() {
		@Pc(9) int local9;
		if (Static87.anInt2061 > 0) {
			for (local9 = 0; local9 < 256; local9++) {
				if (Static87.anInt2061 > 768) {
					Static92.anIntArray472[local9] = Static49.method1534(Static37.anIntArray182[local9], 1024 - Static87.anInt2061, Static70.anIntArray355[local9]);
				} else if (Static87.anInt2061 <= 256) {
					Static92.anIntArray472[local9] = Static49.method1534(Static70.anIntArray355[local9], 256 - Static87.anInt2061, Static37.anIntArray182[local9]);
				} else {
					Static92.anIntArray472[local9] = Static70.anIntArray355[local9];
				}
			}
		} else if (Static49.anInt2254 <= 0) {
			for (local9 = 0; local9 < 256; local9++) {
				Static92.anIntArray472[local9] = Static37.anIntArray182[local9];
			}
		} else {
			for (local9 = 0; local9 < 256; local9++) {
				if (Static49.anInt2254 > 768) {
					Static92.anIntArray472[local9] = Static49.method1534(Static37.anIntArray182[local9], 1024 - Static49.anInt2254, Static72.anIntArray406[local9]);
				} else if (Static49.anInt2254 > 256) {
					Static92.anIntArray472[local9] = Static72.anIntArray406[local9];
				} else {
					Static92.anIntArray472[local9] = Static49.method1534(Static72.anIntArray406[local9], 256 - Static49.anInt2254, Static37.anIntArray182[local9]);
				}
			}
		}
		for (local9 = 0; local9 < 33920; local9++) {
			Static61.aClass45_24.anIntArray471[local9] = Static11.aClass2_Sub2_Sub2_Sub4_1.anIntArray534[local9];
		}
		@Pc(164) int local164 = 0;
		@Pc(166) int local166 = 1152;
		@Pc(181) int local181;
		@Pc(185) int local185;
		@Pc(198) int local198;
		@Pc(205) int local205;
		@Pc(215) int local215;
		@Pc(219) int local219;
		@Pc(228) int local228;
		for (@Pc(168) int local168 = 1; local168 < 255; local168++) {
			local181 = (256 - local168) * Static33.anIntArray152[local168] / 256;
			local185 = local181 + 22;
			if (local185 < 0) {
				local185 = 0;
			}
			local164 += local185;
			for (local198 = local185; local198 < 128; local198++) {
				local205 = Static103.anIntArray547[local164++];
				if (local205 == 0) {
					local166++;
				} else {
					local215 = local205;
					local219 = 256 - local205;
					local205 = Static92.anIntArray472[local205];
					local228 = Static61.aClass45_24.anIntArray471[local166];
					Static61.aClass45_24.anIntArray471[local166++] = (local215 * (local205 & 0xFF00FF) + (local228 & 0xFF00FF) * local219 & 0xFF00FF00) + ((local228 & 0xFF00) * local219 + local215 * (local205 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local166 += local185;
		}
		local166 = 1176;
		for (local181 = 0; local181 < 33920; local181++) {
			Static98.aClass45_30.anIntArray471[local181] = Static96.aClass2_Sub2_Sub2_Sub4_9.anIntArray534[local181];
		}
		local164 = 0;
		for (local185 = 1; local185 < 255; local185++) {
			local198 = (256 - local185) * Static33.anIntArray152[local185] / 256;
			local166 += local198;
			local205 = 103 - local198;
			for (local215 = 0; local215 < local205; local215++) {
				local219 = Static103.anIntArray547[local164++];
				if (local219 == 0) {
					local166++;
				} else {
					local228 = local219;
					@Pc(357) int local357 = 256 - local219;
					local219 = Static92.anIntArray472[local219];
					@Pc(366) int local366 = Static98.aClass45_30.anIntArray471[local166];
					Static98.aClass45_30.anIntArray471[local166++] = (local228 * (local219 & 0xFF00) + local357 * (local366 & 0xFF00) & 0xFF0000) + (local228 * (local219 & 0xFF00FF) + ((local366 & 0xFF00FF) * local357) & 0xFF00FF00) >> 8;
				}
			}
			local164 += 128 - local205;
			local166 += 128 - local198 - local205;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIBIII)V")
	public static void method1674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = Static93.aClass55_1.method1459(arg0, arg4, arg3);
		@Pc(40) int local40;
		@Pc(46) int local46;
		@Pc(53) int local53;
		@Pc(11) int local11;
		@Pc(33) int local33;
		@Pc(59) int local59;
		if (local7 != 0) {
			local11 = arg1;
			if (local7 > 0) {
				local11 = arg2;
			}
			local33 = (103 - arg3) * 4 * 512 + arg4 * 4 + 24624;
			local40 = Static93.aClass55_1.method1449(arg0, arg4, arg3, local7);
			local46 = local40 >> 6 & 0x3;
			@Pc(49) int[] local49 = Static93.aClass2_Sub2_Sub2_Sub4_8.anIntArray534;
			local53 = local40 & 0x1F;
			local59 = local7 >> 14 & 0x7FFF;
			@Pc(63) Class2_Sub2_Sub10 local63 = Static91.method1470(local59);
			if (local63.anInt1039 == -1) {
				if (local53 == 0 || local53 == 2) {
					if (local46 == 0) {
						local49[local33] = local11;
						local49[local33 + 512] = local11;
						local49[local33 + 1024] = local11;
						local49[local33 + 1536] = local11;
					} else if (local46 == 1) {
						local49[local33] = local11;
						local49[local33 + 1] = local11;
						local49[local33 + 2] = local11;
						local49[local33 + 3] = local11;
					} else if (local46 == 2) {
						local49[local33 + 3] = local11;
						local49[local33 + 515] = local11;
						local49[local33 + 1027] = local11;
						local49[local33 + 1536 + 3] = local11;
					} else if (local46 == 3) {
						local49[local33 + 1536] = local11;
						local49[local33 + 1 + 1536] = local11;
						local49[local33 + 2 + 1536] = local11;
						local49[local33 + 3 + 1536] = local11;
					}
				}
				if (local53 == 3) {
					if (local46 == 0) {
						local49[local33] = local11;
					} else if (local46 == 1) {
						local49[local33 + 3] = local11;
					} else if (local46 == 2) {
						local49[local33 + 3 + 1536] = local11;
					} else if (local46 == 3) {
						local49[local33 + 1536] = local11;
					}
				}
				if (local53 == 2) {
					if (local46 == 3) {
						local49[local33] = local11;
						local49[local33 + 512] = local11;
						local49[local33 + 1024] = local11;
						local49[local33 + 1536] = local11;
					} else if (local46 == 0) {
						local49[local33] = local11;
						local49[local33 + 1] = local11;
						local49[local33 + 2] = local11;
						local49[local33 + 3] = local11;
					} else if (local46 == 1) {
						local49[local33 + 3] = local11;
						local49[local33 + 515] = local11;
						local49[local33 + 1024 + 3] = local11;
						local49[local33 + 1536 + 3] = local11;
					} else if (local46 == 2) {
						local49[local33 + 1536] = local11;
						local49[local33 + 1536 + 1] = local11;
						local49[local33 + 1538] = local11;
						local49[local33 + 1536 + 3] = local11;
					}
				}
			} else {
				@Pc(73) Class2_Sub2_Sub2_Sub3 local73 = Static56.aClass2_Sub2_Sub2_Sub3Array15[local63.anInt1039];
				if (local73 != null) {
					@Pc(85) int local85 = (local63.anInt1036 * 4 - local73.anInt1905) / 2;
					@Pc(95) int local95 = (local63.anInt1040 * 4 - local73.anInt1910) / 2;
					local73.method1320(local85 + arg4 * 4 + 48, local95 + (-local63.anInt1040 + -arg3 + 104) * 4 + 48);
				}
			}
		}
		local7 = Static93.aClass55_1.method1429(arg0, arg4, arg3);
		if (local7 != 0) {
			local40 = Static93.aClass55_1.method1449(arg0, arg4, arg3, local7);
			local53 = local40 & 0x1F;
			local46 = local40 >> 6 & 0x3;
			local11 = local7 >> 14 & 0x7FFF;
			@Pc(457) Class2_Sub2_Sub10 local457 = Static91.method1470(local11);
			@Pc(492) int local492;
			if (local457.anInt1039 != -1) {
				@Pc(565) Class2_Sub2_Sub2_Sub3 local565 = Static56.aClass2_Sub2_Sub2_Sub3Array15[local457.anInt1039];
				if (local565 != null) {
					local59 = (local457.anInt1036 * 4 - local565.anInt1905) / 2;
					local492 = (local457.anInt1040 * 4 - local565.anInt1910) / 2;
					local565.method1320(arg4 * 4 + local59 + 48, local492 + (104 - arg3 - local457.anInt1040) * 4 + 48);
				}
			} else if (local53 == 9) {
				local33 = 15658734;
				if (local7 > 0) {
					local33 = 15597568;
				}
				@Pc(477) int[] local477 = Static93.aClass2_Sub2_Sub2_Sub4_8.anIntArray534;
				local492 = arg4 * 4 + (-arg3 + 103) * 512 * 4 + 24624;
				if (local46 == 0 || local46 == 2) {
					local477[local492 + 1536] = local33;
					local477[local492 + 1024 + 1] = local33;
					local477[local492 + 2 + 512] = local33;
					local477[local492 + 3] = local33;
				} else {
					local477[local492] = local33;
					local477[local492 + 513] = local33;
					local477[local492 + 1024 + 2] = local33;
					local477[local492 + 3 + 1536] = local33;
				}
			}
		}
		local7 = Static93.aClass55_1.method1458(arg0, arg4, arg3);
		if (local7 == 0) {
			return;
		}
		local40 = local7 >> 14 & 0x7FFF;
		@Pc(633) Class2_Sub2_Sub10 local633 = Static91.method1470(local40);
		if (local633.anInt1039 == -1) {
			return;
		}
		@Pc(642) Class2_Sub2_Sub2_Sub3 local642 = Static56.aClass2_Sub2_Sub2_Sub3Array15[local633.anInt1039];
		if (local642 != null) {
			local11 = (local633.anInt1036 * 4 - local642.anInt1905) / 2;
			@Pc(665) int local665 = (local633.anInt1040 * 4 - local642.anInt1910) / 2;
			local642.method1320(local11 + arg4 * 4 + 48, local665 + (-local633.anInt1040 + 104 - arg3) * 4 + 48);
			return;
		}
	}
}
