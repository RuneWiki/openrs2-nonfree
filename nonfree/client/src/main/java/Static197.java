import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "I")
	public static int anInt2335;

	@OriginalMember(owner = "client!ql", name = "Cb", descriptor = "Lclient!hc;")
	public static Class51 aClass51_28;

	@OriginalMember(owner = "client!ql", name = "Ib", descriptor = "I")
	public static int anInt2398;

	@OriginalMember(owner = "client!ql", name = "T", descriptor = "[I")
	public static int[] anIntArray175 = new int[4096];

	@OriginalMember(owner = "client!ql", name = "gb", descriptor = "Ljava/lang/String;")
	public static String aString145 = "Loading defaults - ";

	@OriginalMember(owner = "client!ql", name = "mb", descriptor = "[I")
	public static int[] anIntArray176 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!ql", name = "yb", descriptor = "Lclient!lc;")
	public static Class79 aClass79_12 = new Class79(64);

	@OriginalMember(owner = "client!ql", name = "Ab", descriptor = "I")
	public static volatile int anInt2392 = 0;

	@OriginalMember(owner = "client!ql", name = "Hb", descriptor = "Ljava/lang/String;")
	public static String aString146 = "Use";

	@OriginalMember(owner = "client!ql", name = "Jb", descriptor = "I")
	public static int anInt2399 = 0;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZZ)Ljava/lang/String;")
	public static String method1758(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static68.method978(arg0);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method1777(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) short[] local8 = new short[16];
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(17) int local17 = arg0 ? 32768 : 0;
		@Pc(19) int local19 = 0;
		@Pc(31) int local31 = (arg0 ? Static71.anInt1924 : Static244.anInt5254) + local17;
		for (@Pc(33) int local33 = local17; local33 < local31; local33++) {
			@Pc(39) Class1_Sub2_Sub12 local39 = Static224.method3732(local33);
			if (local39.aBoolean193 && local39.method2902().toLowerCase().indexOf(local11) != -1) {
				if (local19 >= 50) {
					Static147.anInt3575 = -1;
					Static82.aShortArray32 = null;
					return;
				}
				if (local19 >= local8.length) {
					@Pc(74) short[] local74 = new short[local8.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local19; local76++) {
						local74[local76] = local8[local76];
					}
					local8 = local74;
				}
				local8[local19++] = (short) local33;
			}
		}
		Static147.anInt3575 = local19;
		Static82.aShortArray32 = local8;
		Static187.anInt4203 = 0;
		@Pc(113) String[] local113 = new String[Static147.anInt3575];
		for (@Pc(115) int local115 = 0; local115 < Static147.anInt3575; local115++) {
			local113[local115] = Static224.method3732(local8[local115]).method2902();
		}
		Static42.method789(local113, Static82.aShortArray32);
	}

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "(I)V")
	public static void method1805() {
		if (Static122.aClass1_Sub2_Sub11_2 == null) {
			return;
		}
		if (Static265.anInt5546 < 10) {
			if (!Static227.aClass51_75.method1851(Static122.aClass1_Sub2_Sub11_2.aString250)) {
				Static265.anInt5546 = Static5.aClass51_1.method1857(Static122.aClass1_Sub2_Sub11_2.aString250) / 10;
				return;
			}
			Static198.method3472();
			Static265.anInt5546 = 10;
		}
		if (Static265.anInt5546 == 10) {
			Static46.anInt1376 = Static122.aClass1_Sub2_Sub11_2.anInt3848 >> 6 << 6;
			Static209.anInt4574 = Static122.aClass1_Sub2_Sub11_2.anInt3839 >> 6 << 6;
			Static174.anInt3997 = (Static122.aClass1_Sub2_Sub11_2.anInt3846 >> 6 << 6) + 64 - Static46.anInt1376;
			Static124.anInt3160 = (Static122.aClass1_Sub2_Sub11_2.anInt3854 >> 6 << 6) + 64 - Static209.anInt4574;
			@Pc(90) int[] local90 = Static122.aClass1_Sub2_Sub11_2.method2860(Static137.anInt3321, (Static83.aClass9_Sub1_Sub1_1.anInt479 >> 7) + Static29.anInt907, (Static83.aClass9_Sub1_Sub1_1.anInt427 >> 7) + Static64.anInt1786);
			@Pc(92) int local92 = -1;
			@Pc(94) int local94 = -1;
			if (local90 != null) {
				local94 = Static46.anInt1376 + Static174.anInt3997 - local90[2] - 1;
				local92 = local90[1] - Static209.anInt4574;
			}
			if (local92 >= 0 && local92 < Static124.anInt3160 && local94 >= 0 && Static174.anInt3997 > local94) {
				local94 += (int) (Math.random() * 10.0D) - 5;
				local92 += (int) (Math.random() * 10.0D) - 5;
				Static239.anInt5151 = local94;
				Static39.anInt1086 = local92;
			} else {
				@Pc(173) int[] local173;
				if (Static87.anInt2459 == -1 || Static96.anInt2665 == -1) {
					local173 = Static122.aClass1_Sub2_Sub11_2.method2861(Static122.aClass1_Sub2_Sub11_2.anInt3843 >> 14 & 0x3FFF, Static122.aClass1_Sub2_Sub11_2.anInt3843 & 0x3FFF);
					Static39.anInt1086 = local173[1] - Static209.anInt4574;
					Static239.anInt5151 = Static174.anInt3997 + Static46.anInt1376 - local173[2] - 1;
				} else {
					local173 = Static122.aClass1_Sub2_Sub11_2.method2861(Static87.anInt2459, Static96.anInt2665);
					if (local173 != null) {
						Static39.anInt1086 = local173[1] - Static209.anInt4574;
						Static239.anInt5151 = Static174.anInt3997 + Static46.anInt1376 - local173[2] - 1;
					}
					Static96.anInt2665 = -1;
					Static87.anInt2459 = -1;
				}
			}
			if (Static122.aClass1_Sub2_Sub11_2.anInt3842 == 37) {
				Static57.aFloat12 = 3.0F;
				Static17.aFloat3 = 3.0F;
			} else if (Static122.aClass1_Sub2_Sub11_2.anInt3842 == 50) {
				Static57.aFloat12 = 4.0F;
				Static17.aFloat3 = 4.0F;
			} else if (Static122.aClass1_Sub2_Sub11_2.anInt3842 == 75) {
				Static57.aFloat12 = 6.0F;
				Static17.aFloat3 = 6.0F;
			} else if (Static122.aClass1_Sub2_Sub11_2.anInt3842 == 100) {
				Static57.aFloat12 = 8.0F;
				Static17.aFloat3 = 8.0F;
			} else if (Static122.aClass1_Sub2_Sub11_2.anInt3842 == 200) {
				Static57.aFloat12 = 16.0F;
				Static17.aFloat3 = 16.0F;
			} else {
				Static57.aFloat12 = 8.0F;
				Static17.aFloat3 = 8.0F;
			}
			Static99.method2088();
			Static93.anIntArray191 = new int[Static128.anInt3212 + 1];
			@Pc(295) int local295 = Static174.anInt3997 >> 6;
			@Pc(299) int local299 = Static124.anInt3160 >> 6;
			Static25.anIntArrayArrayArray3 = new int[local299][local295][];
			Static138.aByteArrayArrayArray11 = new byte[local299][local295][];
			Static67.aByteArrayArrayArray6 = new byte[local299][local295][];
			@Pc(315) int local315 = Static228.anInt5018 >> 1;
			Static45.aByteArrayArrayArray5 = new byte[local299][local295][];
			@Pc(325) int local325 = Static38.anInt1016 >> 2 << 10;
			Static117.aByteArrayArrayArray8 = new byte[local299][local295][];
			Static5.anIntArrayArrayArray2 = new int[local299][local295][];
			Static228.anIntArrayArrayArray12 = new int[local299][local295][];
			Static191.aByteArrayArrayArray14 = new byte[local299][local295][];
			Static82.method1654(local325, local315);
			Static265.anInt5546 = 20;
		} else if (Static265.anInt5546 == 20) {
			Static129.method2456(new Class1_Sub13(Static227.aClass51_75.method1850("underlay", Static122.aClass1_Sub2_Sub11_2.aString250)));
			Static265.anInt5546 = 30;
			Static241.method3957(true);
			Static90.method1901();
		} else if (Static265.anInt5546 == 30) {
			Static89.method1895(new Class1_Sub13(Static227.aClass51_75.method1850("overlay", Static122.aClass1_Sub2_Sub11_2.aString250)));
			Static265.anInt5546 = 40;
			Static90.method1901();
		} else if (Static265.anInt5546 == 40) {
			Static222.method3672(new Class1_Sub13(Static227.aClass51_75.method1850("overlay2", Static122.aClass1_Sub2_Sub11_2.aString250)));
			Static265.anInt5546 = 50;
			Static90.method1901();
		} else if (Static265.anInt5546 == 50) {
			Static86.method1842(new Class1_Sub13(Static227.aClass51_75.method1850("loc", Static122.aClass1_Sub2_Sub11_2.aString250)));
			Static265.anInt5546 = 60;
			Static241.method3957(true);
			Static90.method1901();
		} else if (Static265.anInt5546 == 60) {
			if (Static227.aClass51_75.method1854(Static122.aClass1_Sub2_Sub11_2.aString250 + "_labels")) {
				if (!Static227.aClass51_75.method1851(Static122.aClass1_Sub2_Sub11_2.aString250 + "_labels")) {
					return;
				}
				Static254.aClass151_2 = Static67.method1311(Static227.aClass51_75, Static122.aClass1_Sub2_Sub11_2.aString250 + "_labels");
			} else {
				Static254.aClass151_2 = new Class151(0);
			}
			Static265.anInt5546 = 70;
			Static90.method1901();
		} else if (Static265.anInt5546 == 70) {
			Static57.aClass103_2 = new Class103(11, true, Static98.aCanvas1);
			Static265.anInt5546 = 73;
			Static241.method3957(true);
			Static90.method1901();
		} else if (Static265.anInt5546 == 73) {
			Static251.aClass103_8 = new Class103(12, true, Static98.aCanvas1);
			Static265.anInt5546 = 76;
			Static241.method3957(true);
			Static90.method1901();
		} else if (Static265.anInt5546 == 76) {
			Static84.aClass103_4 = new Class103(14, true, Static98.aCanvas1);
			Static265.anInt5546 = 79;
			Static241.method3957(true);
			Static90.method1901();
		} else if (Static265.anInt5546 == 79) {
			Static240.aClass103_7 = new Class103(17, true, Static98.aCanvas1);
			Static265.anInt5546 = 82;
			Static241.method3957(true);
			Static90.method1901();
		} else if (Static265.anInt5546 == 82) {
			Static125.aClass103_5 = new Class103(19, true, Static98.aCanvas1);
			Static265.anInt5546 = 85;
			Static241.method3957(true);
			Static90.method1901();
		} else if (Static265.anInt5546 == 85) {
			Static221.aClass103_6 = new Class103(22, true, Static98.aCanvas1);
			Static265.anInt5546 = 88;
			Static241.method3957(true);
			Static90.method1901();
		} else if (Static265.anInt5546 == 88) {
			Static77.aClass103_3 = new Class103(26, true, Static98.aCanvas1);
			Static265.anInt5546 = 91;
			Static241.method3957(true);
			Static90.method1901();
		} else {
			Static28.aClass103_1 = new Class103(30, true, Static98.aCanvas1);
			Static265.anInt5546 = 100;
			Static241.method3957(true);
			Static90.method1901();
			System.gc();
		}
	}
}
