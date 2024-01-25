import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public static int anInt3665;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Lclient!mg;")
	public static final Class156 aClass156_27 = new Class156();

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "J")
	public static long aLong119 = 0L;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_86 = new Class211(43, 6);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
	public static void method2945() {
		Static276.anInt4560 = 0;
		@Pc(11) int local11 = Static26.aClass2_Sub13_Sub2_1.method3555();
		@Pc(15) int local15 = Static26.aClass2_Sub13_Sub2_1.method3593();
		@Pc(24) boolean local24 = Static26.aClass2_Sub13_Sub2_1.method3587() == 1;
		@Pc(28) int local28 = Static26.aClass2_Sub13_Sub2_1.method3587();
		Static108.method1679();
		Static419.method5306(local28);
		@Pc(40) int local40 = (Static209.anInt3493 - Static26.aClass2_Sub13_Sub2_1.anInt4347) / 16;
		Static278.anIntArrayArray33 = new int[local40][4];
		@Pc(50) int local50;
		for (@Pc(46) int local46 = 0; local46 < local40; local46++) {
			for (local50 = 0; local50 < 4; local50++) {
				Static278.anIntArrayArray33[local46][local50] = Static26.aClass2_Sub13_Sub2_1.method3574();
			}
		}
		Static128.anIntArray181 = new int[local40];
		Static142.aByteArrayArray19 = new byte[local40][];
		Static98.aByteArrayArray12 = new byte[local40][];
		Static319.anIntArray478 = new int[local40];
		Static228.aByteArrayArray31 = null;
		Static403.aByteArrayArray56 = new byte[local40][];
		Static27.anIntArray188 = null;
		Static225.anIntArray310 = new int[local40];
		Static388.anIntArray415 = new int[local40];
		Static378.aByteArrayArray51 = new byte[local40][];
		Static193.anIntArray266 = new int[local40];
		local40 = 0;
		for (local50 = (local15 - (Static166.anInt2852 >> 4)) / 8; local50 <= ((Static166.anInt2852 >> 4) + local15) / 8; local50++) {
			for (@Pc(131) int local131 = (local11 - (Static426.anInt6923 >> 4)) / 8; local131 <= (local11 + (Static426.anInt6923 >> 4)) / 8; local131++) {
				Static225.anIntArray310[local40] = local131 + (local50 << 8);
				Static128.anIntArray181[local40] = Static309.aClass54_84.method1102("m" + local50 + "_" + local131);
				Static193.anIntArray266[local40] = Static309.aClass54_84.method1102("l" + local50 + "_" + local131);
				Static388.anIntArray415[local40] = Static309.aClass54_84.method1102("um" + local50 + "_" + local131);
				Static319.anIntArray478[local40] = Static309.aClass54_84.method1102("ul" + local50 + "_" + local131);
				local40++;
			}
		}
		Static359.method4735(10, local15, local24, local11);
	}
}
