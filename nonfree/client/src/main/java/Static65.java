import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "[[Lclient!nd;")
	public static Class1_Sub1_Sub11[][] aClass1_Sub1_Sub11ArrayArray1;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
	public static int anInt1495;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
	public static int anInt1490 = 0;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "Lclient!rd;")
	private static Class64 aClass64_926 = Static69.method1153("World");

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "Lclient!rd;")
	public static Class64 aClass64_924 = aClass64_926;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "Lclient!rd;")
	public static Class64 aClass64_925 = Static69.method1153("sideicons");

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "[I")
	public static int[] anIntArray230 = new int[5];

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public static void method1102() {
		anIntArray230 = null;
		aClass64_926 = null;
		aClass64_925 = null;
		aClass1_Sub1_Sub11ArrayArray1 = null;
		aClass64_924 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZLclient!pb;IIB)V")
	public static synchronized void method1103(@OriginalArg(1) int arg0, @OriginalArg(3) Class41 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!Static109.method1872()) {
			return;
		}
		Static28.aBoolean147 = true;
		Static42.anInt931 = arg2;
		Static21.aClass41_14 = arg1;
		Static11.anInt424 = arg3;
		Static42.anInt935 = -1;
		Static46.anInt1083 = arg0;
		Static28.anInt2387 = -1;
		Static82.anInt1909 = 0;
		Static94.aBoolean131 = false;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!pb;IZIILclient!rd;Lclient!rd;)V")
	public static synchronized void method1104(@OriginalArg(1) Class41 arg0, @OriginalArg(2) int arg1, @OriginalArg(6) Class64 arg2, @OriginalArg(7) Class64 arg3) {
		if (Static109.method1872()) {
			@Pc(17) int local17 = arg0.method1066(arg2);
			@Pc(23) int local23 = arg0.method1050(arg3, local17);
			method1105(arg1, local23, arg0, local17);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZIIIILclient!pb;I)V")
	public static synchronized void method1105(@OriginalArg(0) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) Class41 arg2, @OriginalArg(7) int arg3) {
		if (!Static109.method1872()) {
			return;
		}
		Static94.aBoolean131 = false;
		Static42.anInt935 = 10;
		Static11.anInt424 = arg0;
		Static46.anInt1083 = arg3;
		Static28.anInt2387 = -1;
		Static82.anInt1909 = arg1;
		Static28.aBoolean147 = true;
		Static21.aClass41_14 = arg2;
		Static42.anInt931 = 0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static synchronized void method1106() {
		if (Static109.method1872()) {
			Static15.method299();
			Static28.aBoolean147 = false;
			Static21.aClass41_14 = null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)V")
	public static synchronized void method1107() {
		if (Static109.method1872()) {
			Static98.method1596();
			Static21.aClass41_14 = null;
			Static28.aBoolean147 = false;
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
	public static synchronized void method1108() {
		Static94.method1542();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!ke;I)V")
	public static void method1109(@OriginalArg(1) Class41_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static72.aClass1_Sub6_2 == null) {
			Static106.method1740(null, 255, 0, 255, (byte) 0, true);
			Static104.aClass41_Sub1Array1[arg1] = arg0;
		} else {
			Static72.aClass1_Sub6_2.anInt2574 = arg1 * 4 + 5;
			@Pc(16) int local16 = Static72.aClass1_Sub6_2.method1817();
			arg0.method1079(local16);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BILclient!he;I)V")
	public static void method1110(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub5_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		@Pc(12) int local12 = Static57.anInt1289 + Static75.anInt1770 & 0x7FF;
		@Pc(20) int local20 = arg2 * arg2 + arg0 * arg0;
		if (local20 > 6400) {
			return;
		}
		@Pc(35) int local35 = Class1_Sub1_Sub5_Sub4.anIntArray427[local12];
		@Pc(43) int local43 = local35 * 256 / (Static39.anInt912 + 256);
		@Pc(47) int local47 = Class1_Sub1_Sub5_Sub4.anIntArray429[local12];
		@Pc(55) int local55 = local47 * 256 / (Static39.anInt912 + 256);
		@Pc(65) int local65 = local43 * arg0 + arg2 * local55 >> 16;
		@Pc(76) int local76 = arg0 * local55 - local43 * arg2 >> 16;
		if (local20 <= 2500) {
			arg1.method778(local65 + 4 + 94 - arg1.anInt1022 / 2, -local76 + 83 + (-(arg1.anInt1021 / 2) - 4));
		} else {
			arg1.method777(Static40.aClass1_Sub1_Sub5_Sub3_6, local65 + 4 + 94 - arg1.anInt1022 / 2, 83 - (local76 + arg1.anInt1021 / 2) + -4);
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V")
	public static synchronized void method1111() {
		if (!Static109.method1872()) {
			return;
		}
		if (Static28.aBoolean147) {
			@Pc(18) byte[] local18 = Static26.method514(Static21.aClass41_14, Static46.anInt1083, Static82.anInt1909, Static42.anInt931);
			if (local18 != null) {
				if (Static42.anInt935 >= 0) {
					Static118.method2087(Static11.anInt424, local18, Static42.anInt935, Static94.aBoolean131);
				} else if (Static28.anInt2387 < 0) {
					Static51.method917(Static11.anInt424, local18, Static94.aBoolean131);
				} else {
					Static64.method1099(Static11.anInt424, local18, Static94.aBoolean131, Static28.anInt2387);
				}
				Static21.aClass41_14 = null;
				Static28.aBoolean147 = false;
			}
		}
		Static30.method545();
	}
}
