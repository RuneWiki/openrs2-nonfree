import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!be", name = "h", descriptor = "I")
	public static int anInt416;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "Lclient!kb;")
	private static Class46 aClass46_120 = Static65.method1172("Loaded interfaces");

	@OriginalMember(owner = "client!be", name = "c", descriptor = "Lclient!kb;")
	public static Class46 aClass46_116 = aClass46_120;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "I")
	public static int anInt413 = 0;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "Lclient!kb;")
	public static Class46 aClass46_117 = Static65.method1172("(Y");

	@OriginalMember(owner = "client!be", name = "k", descriptor = "I")
	public static int anInt418 = 0;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "Lclient!kb;")
	private static Class46 aClass46_118 = Static65.method1172("Continue");

	@OriginalMember(owner = "client!be", name = "m", descriptor = "Lclient!kb;")
	public static Class46 aClass46_119 = aClass46_118;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IBIIIIII)V")
	public static void method319(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 1 || arg0 < 1 || arg3 > 102 || arg0 > 102) {
			return;
		}
		if (Static71.aBoolean76 && arg5 != Static99.anInt2422) {
			return;
		}
		@Pc(31) int local31 = 0;
		if (arg1 == 0) {
			local31 = Static154.aClass62_1.method2008(arg5, arg3, arg0);
		}
		if (arg1 == 1) {
			local31 = Static154.aClass62_1.method1980(arg5, arg3, arg0);
		}
		if (arg1 == 2) {
			local31 = Static154.aClass62_1.method1996(arg5, arg3, arg0);
		}
		if (arg1 == 3) {
			local31 = Static154.aClass62_1.method1973(arg5, arg3, arg0);
		}
		@Pc(92) int local92;
		if (local31 != 0) {
			@Pc(85) int local85 = local31 >> 14 & 0x7FFF;
			local92 = Static154.aClass62_1.method1967(arg5, arg3, arg0, local31);
			@Pc(96) int local96 = local92 & 0x1F;
			@Pc(102) int local102 = local92 >> 6 & 0x3;
			@Pc(113) Class3_Sub2_Sub9 local113;
			if (arg1 == 0) {
				Static154.aClass62_1.method1987(arg5, arg3, arg0);
				local113 = Static136.method2319(local85);
				if (local113.anInt1820 != 0) {
					Static128.aClass69Array1[arg5].method2259(local96, arg0, local113.aBoolean69, arg3, local102);
				}
			}
			if (arg1 == 1) {
				Static154.aClass62_1.method1999(arg5, arg3, arg0);
			}
			if (arg1 == 2) {
				Static154.aClass62_1.method1990(arg5, arg3, arg0);
				local113 = Static136.method2319(local85);
				if (local113.anInt1795 + arg3 > 103 || local113.anInt1795 + arg0 > 103 || arg3 + local113.anInt1825 > 103 || arg0 + local113.anInt1825 > 103) {
					return;
				}
				if (local113.anInt1820 != 0) {
					Static128.aClass69Array1[arg5].method2248(local113.anInt1825, local113.anInt1795, arg3, local102, arg0, local113.aBoolean69);
				}
			}
			if (arg1 == 3) {
				Static154.aClass62_1.method1966(arg5, arg3, arg0);
				local113 = Static136.method2319(local85);
				if (local113.anInt1820 == 1) {
					Static128.aClass69Array1[arg5].method2250(arg0, arg3);
				}
			}
		}
		if (arg6 < 0) {
			return;
		}
		local92 = arg5;
		if (arg5 < 3 && (Static119.aByteArrayArrayArray5[1][arg3][arg0] & 0x2) == 2) {
			local92 = arg5 + 1;
		}
		Static3.method57(arg5, arg0, local92, arg3, Static128.aClass69Array1[arg5], arg2, Static154.aClass62_1, arg6, arg4);
		return;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public static void method320() {
		aClass46_119 = null;
		aClass46_120 = null;
		aClass46_117 = null;
		aClass46_116 = null;
		aClass46_118 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
	public static void method321(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub7 local15 = (Class3_Sub7) Static28.aClass54_2.method1602((long) arg0);
		if (local15 != null) {
			local15.method2900();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!jg;ILclient!jg;)V")
	public static void method322(@OriginalArg(0) Class44 arg0, @OriginalArg(2) Class44 arg1) {
		Static1.aClass44_1 = arg1;
		Static55.aClass44_9 = arg0;
		Static179.anInt3953 = Static1.aClass44_1.method1619(3);
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	public static void method323() {
		Static133.aClass3_Sub4_Sub1_3.method233(255);
		for (@Pc(15) Class3_Sub12 local15 = (Class3_Sub12) Static129.aClass54_10.method1598(); local15 != null; local15 = (Class3_Sub12) Static129.aClass54_10.method1609()) {
			if (local15.anInt1763 == 0) {
				Static18.method336(true, local15);
			}
		}
		if (Static71.aClass33_7 != null) {
			Static142.method2373(Static71.aClass33_7);
			Static71.aClass33_7 = null;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!na;I)V")
	public static void method324(@OriginalArg(0) Class3_Sub2_Sub3_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static2.anIntArray2.length; local7++) {
			Static2.anIntArray2[local7] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			local32 = (int) ((double) 256 * Math.random() * 128.0D);
			Static2.anIntArray2[local32] = (int) (Math.random() * 256.0D);
		}
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(61) int local61;
		for (local32 = 0; local32 < 20; local32++) {
			for (local49 = 1; local49 < 255; local49++) {
				for (local53 = 1; local53 < 127; local53++) {
					local61 = (local49 << 7) + local53;
					Static153.anIntArray398[local61] = (Static2.anIntArray2[local61 + 128] + Static2.anIntArray2[local61 + 1] + Static2.anIntArray2[local61 - 1] + Static2.anIntArray2[local61 + -128]) / 4;
				}
			}
			@Pc(101) int[] local101 = Static2.anIntArray2;
			Static2.anIntArray2 = Static153.anIntArray398;
			Static153.anIntArray398 = local101;
		}
		if (arg0 == null) {
			return;
		}
		local49 = 0;
		for (local53 = 0; local53 < arg0.anInt2495; local53++) {
			for (local61 = 0; local61 < arg0.anInt2494; local61++) {
				if (arg0.aByteArray20[local49++] != 0) {
					@Pc(136) int local136 = local61 + arg0.anInt2497 + 16;
					@Pc(144) int local144 = local53 + arg0.anInt2493 + 16;
					@Pc(150) int local150 = (local144 << 7) + local136;
					Static2.anIntArray2[local150] = 0;
				}
			}
		}
	}
}
