import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
	public static int anInt4041;

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_135 = new Class106("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
	public static int anInt4042 = 0;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLclient!ge;)V")
	public static void method3732(@OriginalArg(1) Class1_Sub7_Sub2 arg0) {
		arg0.method2166();
		@Pc(10) int local10 = Static352.anInt1802;
		@Pc(20) Class11_Sub2_Sub6_Sub1 local20 = Static191.aClass11_Sub2_Sub6_Sub1_4 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local10] = new Class11_Sub2_Sub6_Sub1();
		local20.anInt6792 = local10;
		@Pc(28) int local28 = arg0.method2169(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		local20.anIntArray505[0] = local39 - Static50.anInt1271;
		@Pc(51) int local51 = local28 & 0x3FFF;
		local20.anInt6729 = (local20.anIntArray505[0] << 7) + (local20.method5894() << 6);
		local20.anIntArray504[0] = local51 - Static299.anInt4036;
		local20.anInt6726 = (local20.anIntArray504[0] << 7) + (local20.method5894() << 6);
		Static284.anInt6477 = local20.aByte79 = local33;
		if (Static242.aClass1_Sub7Array1[local10] != null) {
			local20.method5859(Static242.aClass1_Sub7Array1[local10]);
		}
		Static99.anInt2276 = 0;
		Static238.anIntArray382[Static99.anInt2276++] = local10;
		Static25.aByteArray21[local10] = 0;
		Static331.anInt6245 = 0;
		for (@Pc(127) int local127 = 1; local127 < 2048; local127++) {
			if (local127 != local10) {
				@Pc(137) int local137 = arg0.method2169(18);
				@Pc(141) int local141 = local137 >> 16;
				@Pc(147) int local147 = local137 >> 8 & 0xFF;
				@Pc(151) int local151 = local137 & 0xFF;
				Static283.anIntArray422[local127] = (local141 << 28) - (-(local147 << 14) - local151);
				Static201.anIntArray312[local127] = 0;
				Static168.anIntArray260[local127] = -1;
				Static352.anIntArray142[Static331.anInt6245++] = local127;
				Static25.aByteArray21[local127] = 0;
			}
		}
		arg0.method2167();
	}
}
