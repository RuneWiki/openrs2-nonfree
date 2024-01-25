import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static589 {

	@OriginalMember(owner = "client!v", name = "d", descriptor = "I")
	public static int anInt9580;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "I")
	public static int anInt9581;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "Lclient!bh;")
	public static final Class32 aClass32_84 = new Class32(4);

	@OriginalMember(owner = "client!v", name = "c", descriptor = "Lclient!mha;")
	public static final Class222 aClass222_18 = new Class222(2, 4, 4, 0);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!ec;Lclient!ig;Z)V")
	public static void method8022(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) Class13_Sub1 arg2) {
		if (Static270.anInt4355 >= 50 || (arg1 == null || arg1.anIntArrayArray7 == null || arg1.anIntArrayArray7.length <= arg0 || arg1.anIntArrayArray7[arg0] == null)) {
			return;
		}
		@Pc(34) int local34 = arg1.anIntArrayArray7[arg0][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(48) int local48 = local34 & 0x1F;
		@Pc(67) int local67;
		if (arg1.anIntArrayArray7[arg0].length > 1) {
			local67 = (int) ((double) arg1.anIntArrayArray7[arg0].length * Math.random());
			if (local67 > 0) {
				local38 = arg1.anIntArrayArray7[arg0][local67];
			}
		}
		local67 = 256;
		if (arg1.anIntArray150 != null && arg1.anIntArray148 != null) {
			local67 = (int) (Math.random() * (double) (arg1.anIntArray148[arg0] - arg1.anIntArray150[arg0])) + arg1.anIntArray150[arg0];
		}
		@Pc(118) int local118 = arg1.anIntArray147 == null ? 255 : arg1.anIntArray147[arg0];
		if (local48 == 0) {
			if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1 == arg2) {
				if (arg1.aBoolean157) {
					Static305.method4186(0, false, local38, local67, local44, local118);
					return;
				}
				Static245.method3378(local118, local44, local38, local67, 0);
			}
		} else if (Static234.aClass2_Sub5_48.aClass6_Sub22_2.method7291() != 0) {
			@Pc(159) int local159 = arg2.anInt10090 - 256 >> 9;
			@Pc(166) int local166 = arg2.anInt10089 - 256 >> 9;
			@Pc(188) int local188 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1 == arg2 ? 0 : (arg2.aByte127 << 24) + (local159 << 16) + (local166 << 8) + local48;
			Static81.aClass105Array1[Static270.anInt4355++] = new Class105((byte) (arg1.aBoolean157 ? 2 : 1), local38, local44, 0, local118, local188, local67, arg2);
		}
	}
}
