import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "[I")
	public static int[] anIntArray587;

	@OriginalMember(owner = "client!vg", name = "r", descriptor = "[[I")
	public static int[][] anIntArrayArray176;

	@OriginalMember(owner = "client!vg", name = "t", descriptor = "[Lclient!gi;")
	public static Class93[] aClass93Array2;

	@OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
	public static final int anInt7254 = 50;

	@OriginalMember(owner = "client!vg", name = "w", descriptor = "[I")
	public static final int[] anIntArray588 = new int[anInt7254];

	@OriginalMember(owner = "client!vg", name = "x", descriptor = "[I")
	public static final int[] anIntArray589 = new int[anInt7254];

	@OriginalMember(owner = "client!vg", name = "y", descriptor = "[I")
	public static final int[] anIntArray590 = new int[anInt7254];

	@OriginalMember(owner = "client!vg", name = "z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray66 = new String[anInt7254];

	@OriginalMember(owner = "client!vg", name = "C", descriptor = "[I")
	public static final int[] anIntArray591 = new int[anInt7254];

	@OriginalMember(owner = "client!vg", name = "D", descriptor = "[I")
	public static final int[] anIntArray592 = new int[anInt7254];

	@OriginalMember(owner = "client!vg", name = "E", descriptor = "[I")
	public static final int[] anIntArray593 = new int[anInt7254];

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
	public static void method5825() {
		Static29.method475(Static434.aClass165_Sub1_1.anInt4200);
		@Pc(17) int local17 = (Static386.anInt7205 >> 3) + (Static263.anInt4619 >> 10);
		@Pc(25) int local25 = (Static153.anInt2798 >> 3) + (Static120.anInt2052 >> 10);
		Static204.anInt3498 = Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101 = 0;
		Static127.aClass11_Sub5_Sub2_Sub1_2.method2111(8, 8);
		Static59.anIntArray532 = new int[18];
		Static450.anIntArray635 = new int[18];
		Static222.aByteArrayArray12 = new byte[18][];
		Static414.anIntArray577 = new int[18];
		Static388.aByteArrayArray19 = new byte[18][];
		Static246.aByteArrayArray15 = new byte[18][];
		Static423.anIntArray585 = new int[18];
		Static83.anIntArrayArray38 = new int[18][4];
		Static428.aByteArrayArray21 = new byte[18][];
		Static437.anIntArray600 = new int[18];
		Static328.aByteArrayArray18 = new byte[18][];
		Static265.anIntArray391 = new int[18];
		@Pc(81) int local81 = 0;
		@Pc(99) int local99;
		for (@Pc(89) int local89 = (local17 - (Static234.anInt3949 >> 4)) / 8; local89 <= (local17 + (Static234.anInt3949 >> 4)) / 8; local89++) {
			for (local99 = (local25 - (Static371.anInt6492 >> 4)) / 8; local99 <= ((Static371.anInt6492 >> 4) + local25) / 8; local99++) {
				@Pc(107) int local107 = local99 + (local89 << 8);
				Static450.anIntArray635[local81] = local107;
				Static59.anIntArray532[local81] = Static11.aClass171_2.method3668("m" + local89 + "_" + local99);
				Static437.anIntArray600[local81] = Static11.aClass171_2.method3668("l" + local89 + "_" + local99);
				Static423.anIntArray585[local81] = Static11.aClass171_2.method3668("n" + local89 + "_" + local99);
				Static414.anIntArray577[local81] = Static11.aClass171_2.method3668("um" + local89 + "_" + local99);
				Static265.anIntArray391[local81] = Static11.aClass171_2.method3668("ul" + local89 + "_" + local99);
				if (Static423.anIntArray585[local81] == -1) {
					Static59.anIntArray532[local81] = -1;
					Static437.anIntArray600[local81] = -1;
					Static414.anIntArray577[local81] = -1;
					Static265.anIntArray391[local81] = -1;
				}
				local81++;
			}
		}
		for (local99 = local81; local99 < Static423.anIntArray585.length; local99++) {
			Static423.anIntArray585[local99] = -1;
			Static59.anIntArray532[local99] = -1;
			Static437.anIntArray600[local99] = -1;
			Static414.anIntArray577[local99] = -1;
			Static265.anIntArray391[local99] = -1;
		}
		@Pc(284) byte local284;
		if (Static433.anInt7309 == 1 || Static433.anInt7309 == 2) {
			local284 = 3;
		} else {
			local284 = 7;
		}
		Static144.method2216(false, local284, local25, local17);
	}
}
