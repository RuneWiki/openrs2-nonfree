import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "Lclient!dn;")
	public static Class5_Sub10 aClass5_Sub10_2;

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_145 = new Class129(86, 2);

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	public static void method4112() {
		Static148.anInt2668 = 0;
		@Pc(20) boolean local20 = Static76.aClass5_Sub15_Sub2_1.method5585() == 1;
		@Pc(24) int local24 = Static76.aClass5_Sub15_Sub2_1.method5578();
		@Pc(30) int local30 = Static76.aClass5_Sub15_Sub2_1.method5591();
		@Pc(34) int local34 = Static76.aClass5_Sub15_Sub2_1.method5591();
		Static267.method3706();
		Static82.method1222(local24);
		@Pc(47) int local47 = (Static128.anInt2223 - Static76.aClass5_Sub15_Sub2_1.anInt7013) / 16;
		Static113.anIntArrayArray11 = new int[local47][4];
		@Pc(57) int local57;
		for (@Pc(53) int local53 = 0; local53 < local47; local53++) {
			for (local57 = 0; local57 < 4; local57++) {
				Static113.anIntArrayArray11[local53][local57] = Static76.aClass5_Sub15_Sub2_1.method5603();
			}
		}
		Static319.anIntArray372 = null;
		Static149.anIntArray139 = new int[local47];
		Static362.anIntArray418 = new int[local47];
		Static191.aByteArrayArray9 = new byte[local47][];
		Static393.anIntArray330 = new int[local47];
		Static415.aByteArrayArray18 = null;
		Static48.aByteArrayArray3 = new byte[local47][];
		Static398.anIntArray459 = new int[local47];
		Static415.aByteArrayArray19 = new byte[local47][];
		Static404.anIntArray465 = new int[local47];
		Static160.aByteArrayArray7 = new byte[local47][];
		local47 = 0;
		for (local57 = (local34 - (Static433.anInt7210 >> 4)) / 8; local57 <= (local34 + (Static433.anInt7210 >> 4)) / 8; local57++) {
			for (@Pc(132) int local132 = (local30 - (Static418.anInt6969 >> 4)) / 8; local132 <= ((Static418.anInt6969 >> 4) + local30) / 8; local132++) {
				Static362.anIntArray418[local47] = local132 + (local57 << 8);
				Static149.anIntArray139[local47] = Static71.aClass243_255.method5461("m" + local57 + "_" + local132);
				Static393.anIntArray330[local47] = Static71.aClass243_255.method5461("l" + local57 + "_" + local132);
				Static398.anIntArray459[local47] = Static71.aClass243_255.method5461("um" + local57 + "_" + local132);
				Static404.anIntArray465[local47] = Static71.aClass243_255.method5461("ul" + local57 + "_" + local132);
				local47++;
			}
		}
		Static36.method615(local20, 10, local30, local34);
	}
}
