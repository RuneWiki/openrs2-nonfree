import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "Lclient!ns;")
	public static Class166 aClass166_264;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "()V")
	public static void method5210() {
		for (@Pc(1) int local1 = 0; local1 < Static332.anInt5825; local1++) {
			@Pc(6) Class6_Sub2 local6 = Static69.aClass6_Sub2Array2[local1];
			Static1.method30(local6);
			Static69.aClass6_Sub2Array2[local1] = null;
		}
		Static332.anInt5825 = 0;
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V")
	public static void method5214() {
		Static310.method4278(Static126.aClass67_Sub1_1.anInt5854);
		@Pc(17) int local17 = (Static254.anInt4614 >> 10) + (Static381.anInt6688 >> 3);
		@Pc(26) int local26 = (Static30.anInt696 >> 10) + (Static285.anInt5187 >> 3);
		Static221.anInt4855 = Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86 = 0;
		Static375.aClass6_Sub2_Sub1_Sub1_3.method715(8, 8);
		Static80.anIntArray115 = new int[18];
		Static205.anIntArrayArray33 = new int[18][4];
		Static389.anIntArray592 = new int[18];
		Static104.aByteArrayArray1 = new byte[18][];
		Static435.aByteArrayArray20 = new byte[18][];
		Static325.aByteArrayArray16 = new byte[18][];
		Static310.anIntArray475 = new int[18];
		Static196.aByteArrayArray6 = new byte[18][];
		Static66.anIntArray102 = new int[18];
		Static100.anIntArray134 = new int[18];
		Static70.anIntArray647 = new int[18];
		Static288.aByteArrayArray13 = new byte[18][];
		@Pc(83) int local83 = 0;
		@Pc(102) int local102;
		for (@Pc(91) int local91 = (local17 - (Static126.anInt2569 >> 4)) / 8; local91 <= ((Static126.anInt2569 >> 4) + local17) / 8; local91++) {
			for (local102 = (local26 - (Static190.anInt3697 >> 4)) / 8; local102 <= (local26 + (Static190.anInt3697 >> 4)) / 8; local102++) {
				@Pc(110) int local110 = local102 + (local91 << 8);
				Static100.anIntArray134[local83] = local110;
				Static70.anIntArray647[local83] = Static193.aClass166_291.method3698("m" + local91 + "_" + local102);
				Static66.anIntArray102[local83] = Static193.aClass166_291.method3698("l" + local91 + "_" + local102);
				Static389.anIntArray592[local83] = Static193.aClass166_291.method3698("n" + local91 + "_" + local102);
				Static310.anIntArray475[local83] = Static193.aClass166_291.method3698("um" + local91 + "_" + local102);
				Static80.anIntArray115[local83] = Static193.aClass166_291.method3698("ul" + local91 + "_" + local102);
				if (Static389.anIntArray592[local83] == -1) {
					Static70.anIntArray647[local83] = -1;
					Static66.anIntArray102[local83] = -1;
					Static310.anIntArray475[local83] = -1;
					Static80.anIntArray115[local83] = -1;
				}
				local83++;
			}
		}
		for (local102 = local83; local102 < Static389.anIntArray592.length; local102++) {
			Static389.anIntArray592[local102] = -1;
			Static70.anIntArray647[local102] = -1;
			Static66.anIntArray102[local102] = -1;
			Static310.anIntArray475[local102] = -1;
			Static80.anIntArray115[local102] = -1;
		}
		Static5.method158(local26, true, false, local17);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)V")
	public static void method5215(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static13.anInt399 = arg0;
	}
}
