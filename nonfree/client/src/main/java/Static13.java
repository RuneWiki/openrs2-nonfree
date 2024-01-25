import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_200 = new Class359(72, 6);

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "[I")
	public static final int[] anIntArray484 = new int[1];

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!wm;B)V")
	public static void method7326(@OriginalArg(0) Class390 arg0) {
		Static163.aClass390_36 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
	public static void method7330() {
		Static240.method3769(Static172.aClass5_Sub50_14.aClass12_Sub1_1.method191());
		@Pc(20) int local20 = (Static332.anInt6132 >> 12) + (Static153.anInt3147 >> 3);
		@Pc(28) int local28 = (Static201.anInt3839 >> 3) + (Static407.anInt7215 >> 12);
		Static481.anInt8082 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145 = 0;
		Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.method4609(8, 8);
		Static278.anIntArrayArray25 = new int[18][4];
		Static72.aByteArrayArray3 = new byte[18][];
		Static220.aByteArrayArray13 = new byte[18][];
		Static62.aByteArrayArray2 = new byte[18][];
		Static367.aByteArrayArray20 = new byte[18][];
		Static611.anIntArray552 = new int[18];
		Static267.anIntArray285 = new int[18];
		Static457.aByteArrayArray25 = new byte[18][];
		Static51.anIntArray37 = new int[18];
		Static592.anIntArray537 = new int[18];
		Static200.anIntArray188 = new int[18];
		Static490.anIntArray460 = new int[18];
		@Pc(79) int local79 = 0;
		@Pc(99) int local99;
		for (@Pc(88) int local88 = (local20 - (Static201.anInt3834 >> 4)) / 8; local88 <= (local20 + (Static201.anInt3834 >> 4)) / 8; local88++) {
			for (local99 = (local28 - (Static626.anInt10238 >> 4)) / 8; local99 <= (local28 + (Static626.anInt10238 >> 4)) / 8; local99++) {
				@Pc(108) int local108 = (local88 << 8) + local99;
				Static611.anIntArray552[local79] = local108;
				Static267.anIntArray285[local79] = Static260.aClass390_61.method8910("m" + local88 + "_" + local99);
				Static592.anIntArray537[local79] = Static260.aClass390_61.method8910("l" + local88 + "_" + local99);
				Static200.anIntArray188[local79] = Static260.aClass390_61.method8910("n" + local88 + "_" + local99);
				Static490.anIntArray460[local79] = Static260.aClass390_61.method8910("um" + local88 + "_" + local99);
				Static51.anIntArray37[local79] = Static260.aClass390_61.method8910("ul" + local88 + "_" + local99);
				if (Static200.anIntArray188[local79] == -1) {
					Static267.anIntArray285[local79] = -1;
					Static592.anIntArray537[local79] = -1;
					Static490.anIntArray460[local79] = -1;
					Static51.anIntArray37[local79] = -1;
				}
				local79++;
			}
		}
		for (local99 = local79; local99 < Static200.anIntArray188.length; local99++) {
			Static200.anIntArray188[local99] = -1;
			Static267.anIntArray285[local99] = -1;
			Static592.anIntArray537[local99] = -1;
			Static490.anIntArray460[local99] = -1;
			Static51.anIntArray37[local99] = -1;
		}
		@Pc(282) byte local282;
		if (Static173.anInt3397 == 3) {
			local282 = 4;
		} else {
			local282 = 8;
		}
		Static393.method5767(local20, false, local28, local282);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIII)V")
	public static void method7331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10 = Static359.anInt6497;
		if (local10 == 0) {
			return;
		}
		if (local10 == 1) {
			Static359.anInt6497 = 2;
			Static30.anInt407 = arg0;
			Static122.anInt9901 = arg3;
			Static642.anInt10417 = arg2;
			Static73.anInt1061 = arg1;
		} else if (local10 == 2) {
			if (arg2 > Static642.anInt10417) {
				Static642.anInt10417 = arg2;
			}
			if (arg3 < Static122.anInt9901) {
				Static122.anInt9901 = arg3;
			}
			if (Static73.anInt1061 < arg1) {
				Static73.anInt1061 = arg1;
			}
			if (Static30.anInt407 > arg0) {
				Static30.anInt407 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
	public static void method7332(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static635.aClass226ArrayArrayArray3 = Static413.aClass226ArrayArrayArray1;
			Static495.aClass109Array4 = Static111.aClass109Array3;
		} else {
			Static635.aClass226ArrayArrayArray3 = Static606.aClass226ArrayArrayArray2;
			Static495.aClass109Array4 = Static605.aClass109Array5;
		}
		Static219.anInt4088 = Static635.aClass226ArrayArrayArray3.length;
	}
}
