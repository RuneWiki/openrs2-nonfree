import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "J")
	public static long aLong109;

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "Lclient!cq;")
	public static final Class63 aClass63_21 = new Class63(9, 0, 4, 1);

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "[I")
	public static final int[] anIntArray303 = new int[4096];

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!cea;B[[B)V")
	public static void method3606(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt1101; local14++) {
			Static574.method7450();
			for (@Pc(20) int local20 = 0; local20 < Static281.anInt4822 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static29.anInt491 >> 3; local24++) {
					@Pc(34) int local34 = Static55.anIntArrayArrayArray1[local14][local20][local24];
					if (local34 != -1) {
						@Pc(44) int local44 = local34 >> 24 & 0x3;
						if (!arg0.aBoolean61 || local44 == 0) {
							@Pc(58) int local58 = local34 >> 1 & 0x3;
							@Pc(64) int local64 = local34 >> 14 & 0x3FF;
							@Pc(70) int local70 = local34 >> 3 & 0x7FF;
							@Pc(81) int local81 = (local64 / 8 << 8) + (local70 / 8);
							for (@Pc(83) int local83 = 0; local83 < Static301.anIntArray349.length; local83++) {
								if (local81 == Static301.anIntArray349[local83] && arg1[local83] != null) {
									@Pc(101) Class2_Sub7 local101 = new Class2_Sub7(arg1[local83]);
									arg0.method1050(local58, local44, local101, local20 * 8, local64, local14, local24 * 8, local70, Static87.aClass362Array3);
									arg0.method1065(local14, local12[0] == -1 ? local12 : null, local101, local24 * 8, Static417.aClass162_17, local58, local70, local20 * 8, local64, local44);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static320.aClass358_1 = Static403.aClass123_2.method2205(local12[2], local12[0], local12[3], local12[1], Static496.aClass39_1);
			Static189.anInt2779 = local12[4];
		}
	}
}
