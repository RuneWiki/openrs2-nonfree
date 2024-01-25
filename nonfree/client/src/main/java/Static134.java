import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
	public static int anInt2868;

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
	public static int anInt2875;

	@OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
	public static int anInt2876;

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "[I")
	public static int[] anIntArray230;

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
	public static int anInt2877;

	@OriginalMember(owner = "client!ic", name = "G", descriptor = "Z")
	public static boolean aBoolean271 = true;

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_97 = new Class157(29, 3);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!jk;)V")
	public static void method2607(@OriginalArg(1) Class2_Sub12_Sub2 arg0) {
		arg0.method3165();
		@Pc(10) int local10 = Static217.anInt4819;
		@Pc(20) Class1_Sub2_Sub3_Sub1 local20 = Static177.aClass1_Sub2_Sub3_Sub1_1 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local10] = new Class1_Sub2_Sub3_Sub1();
		local20.anInt6896 = local10;
		@Pc(28) int local28 = arg0.method3172(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		local20.anIntArray535[0] = local39 - Static150.anInt3453;
		@Pc(51) int local51 = local28 & 0x3FFF;
		local20.anInt6893 = (local20.anIntArray535[0] << 7) + (local20.method5787() << 6);
		local20.anIntArray534[0] = local51 - Static287.anInt5776;
		local20.anInt6888 = (local20.anIntArray534[0] << 7) + (local20.method5787() << 6);
		Static291.anInt5263 = local20.aByte77 = local33;
		if (Static165.aClass2_Sub12Array1[local10] != null) {
			local20.method2969(Static165.aClass2_Sub12Array1[local10]);
		}
		Static9.anInt173 = 0;
		Static195.anIntArray322[Static9.anInt173++] = local10;
		Static157.aByteArray31[local10] = 0;
		Static132.anInt2839 = 0;
		for (@Pc(125) int local125 = 1; local125 < 2048; local125++) {
			if (local125 != local10) {
				@Pc(139) int local139 = arg0.method3172(18);
				@Pc(143) int local143 = local139 >> 16;
				@Pc(149) int local149 = local139 >> 8 & 0xFF;
				@Pc(153) int local153 = local139 & 0xFF;
				Static120.anIntArray4[local125] = (local143 << 28) + (local149 << 14) + local153;
				Static251.anIntArray407[local125] = 0;
				Static151.anIntArray270[local125] = -1;
				Static228.anIntArray389[Static132.anInt2839++] = local125;
				Static157.aByteArray31[local125] = 0;
			}
		}
		arg0.method3164();
	}
}
