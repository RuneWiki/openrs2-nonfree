import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	public static int anInt4860;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "[S")
	public static final short[] aShortArray68 = new short[] { 20, 46, 9, 2, 47, 58, 59, 12 };

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	public static int anInt4858 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
	public static void method4094(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub4_Sub6 local8 = Static367.method6025(16, arg0);
		local8.method1896();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!iaa;[[BB)V")
	public static void method4095(@OriginalArg(0) Class152_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.anInt4295; local3++) {
			Static129.method8413();
			for (@Pc(9) int local9 = 0; local9 < Static460.anInt8640 >> 3; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static292.anInt7682 >> 3; local13++) {
					@Pc(23) int local23 = Static270.anIntArrayArrayArray7[local3][local9][local13];
					if (local23 != -1) {
						@Pc(33) int local33 = local23 >> 24 & 0x3;
						if (!arg0.aBoolean335 || local33 == 0) {
							@Pc(47) int local47 = local23 >> 1 & 0x3;
							@Pc(53) int local53 = local23 >> 14 & 0x3FF;
							@Pc(59) int local59 = local23 >> 3 & 0x7FF;
							@Pc(69) int local69 = (local53 / 8 << 8) + local59 / 8;
							for (@Pc(71) int local71 = 0; local71 < Static478.anIntArray584.length; local71++) {
								if (Static478.anIntArray584[local71] == local69 && arg1[local71] != null) {
									arg0.method3662(local13 * 8, local33, (local53 & 0x7) * 8, local47, (local59 & 0x7) * 8, local9 * 8, Static403.aClass350Array1, arg1[local71], Static546.aClass15_16, local3);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
