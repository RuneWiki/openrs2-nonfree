import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "Lclient!hr;")
	public static Class29 aClass29_2;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!ss;III[Z)V")
	public static void method3640(@OriginalArg(0) Class6_Sub2_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static55.aClass86Array1 == Static288.aClass86Array3) {
			return;
		}
		@Pc(9) int local9 = Static87.aClass86Array2[arg1].method6590(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class86 local22 = Static87.aClass86Array2[local11];
				if (local22 != null) {
					local22.method6588(arg0, arg2, local9 - local22.method6590(arg2, arg3), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(B[I[J)V")
	public static void method3642(@OriginalArg(1) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static431.method6284(0, arg0, arg1, arg1.length - 1);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
	public static void method3643() {
		Static233.method3616(Static291.aClass28_Sub1_1.anInt1037);
		@Pc(22) int local22 = (Static157.anInt3220 >> 10) + (Static2.anInt6396 >> 3);
		@Pc(30) int local30 = (Static348.anInt6273 >> 3) + (Static229.anInt4187 >> 10);
		Static388.anInt6870 = Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103 = 0;
		Static302.aClass3_Sub2_Sub1_Sub2_2.method5537(8, 8);
		Static188.anIntArray230 = new int[18];
		Static39.aByteArrayArray6 = new byte[18][];
		Static174.anIntArray219 = new int[18];
		Static344.anIntArray411 = new int[18];
		Static298.aByteArrayArray20 = new byte[18][];
		Static386.anIntArrayArray46 = new int[18][4];
		Static137.aByteArrayArray11 = new byte[18][];
		Static426.anIntArray519 = new int[18];
		Static213.aByteArrayArray23 = new byte[18][];
		Static372.anIntArray460 = new int[18];
		Static411.anIntArray508 = new int[18];
		Static269.aByteArrayArray17 = new byte[18][];
		@Pc(81) int local81 = 0;
		@Pc(100) int local100;
		for (@Pc(90) int local90 = (local22 - (Static181.anInt3574 >> 4)) / 8; local90 <= ((Static181.anInt3574 >> 4) + local22) / 8; local90++) {
			for (local100 = (local30 - (Static117.anInt2450 >> 4)) / 8; local100 <= ((Static117.anInt2450 >> 4) + local30) / 8; local100++) {
				@Pc(108) int local108 = (local90 << 8) + local100;
				Static411.anIntArray508[local81] = local108;
				Static344.anIntArray411[local81] = Static332.aClass100_63.method2494("m" + local90 + "_" + local100);
				Static426.anIntArray519[local81] = Static332.aClass100_63.method2494("l" + local90 + "_" + local100);
				Static174.anIntArray219[local81] = Static332.aClass100_63.method2494("n" + local90 + "_" + local100);
				Static188.anIntArray230[local81] = Static332.aClass100_63.method2494("um" + local90 + "_" + local100);
				Static372.anIntArray460[local81] = Static332.aClass100_63.method2494("ul" + local90 + "_" + local100);
				if (Static174.anIntArray219[local81] == -1) {
					Static344.anIntArray411[local81] = -1;
					Static426.anIntArray519[local81] = -1;
					Static188.anIntArray230[local81] = -1;
					Static372.anIntArray460[local81] = -1;
				}
				local81++;
			}
		}
		for (local100 = local81; local100 < Static174.anIntArray219.length; local100++) {
			Static174.anIntArray219[local100] = -1;
			Static344.anIntArray411[local100] = -1;
			Static426.anIntArray519[local100] = -1;
			Static188.anIntArray230[local100] = -1;
			Static372.anIntArray460[local100] = -1;
		}
		Static86.method821(false, true, local30, local22);
	}
}
