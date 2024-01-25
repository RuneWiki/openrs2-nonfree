import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!tba", name = "A", descriptor = "[[Lclient!gfa;")
	public static Class9_Sub1[][] aClass9_Sub1ArrayArray3;

	@OriginalMember(owner = "client!tba", name = "F", descriptor = "I")
	public static int anInt7950;

	@OriginalMember(owner = "client!tba", name = "h", descriptor = "(I)V")
	public static void method6733() {
		Static583.anImage13 = null;
		Static307.aFont2 = null;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z[[BLclient!dw;)V")
	public static void method6735(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class70_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt2459; local14++) {
			Static66.method1526();
			for (@Pc(20) int local20 = 0; local20 < Static400.anInt6818 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static271.anInt5050 >> 3; local24++) {
					@Pc(34) int local34 = Static73.anIntArrayArrayArray3[local14][local20][local24];
					if (local34 != -1) {
						@Pc(44) int local44 = local34 >> 24 & 0x3;
						if (!arg1.aBoolean202 || local44 == 0) {
							@Pc(58) int local58 = local34 >> 1 & 0x3;
							@Pc(64) int local64 = local34 >> 14 & 0x3FF;
							@Pc(70) int local70 = local34 >> 3 & 0x7FF;
							@Pc(80) int local80 = local70 / 8 + (local64 / 8 << 8);
							for (@Pc(82) int local82 = 0; local82 < Static548.anIntArray650.length; local82++) {
								if (Static548.anIntArray650[local82] == local80 && arg0[local82] != null) {
									@Pc(100) Class3_Sub11 local100 = new Class3_Sub11(arg0[local82]);
									arg1.method2201(Static221.aClass95Array2, local24 * 8, local100, local44, local58, local70, local64, local14, local20 * 8);
									arg1.method2217(local24 * 8, local64, local44, Static4.aClass43_1, local12[0] == -1 ? local12 : null, local70, local100, local20 * 8, local58, local14);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static461.aClass242_1 = Static257.aClass182_1.method4391(local12[3], local12[2], local12[1], local12[0], Static125.aClass349_1);
			Static150.anInt3121 = local12[4];
		}
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(B)V")
	public static void method6736() {
		@Pc(1) Class10 local1 = Static220.aClass10_20;
		synchronized (Static220.aClass10_20) {
			Static220.aClass10_20.method262();
		}
		local1 = Static391.aClass10_41;
		synchronized (Static391.aClass10_41) {
			Static391.aClass10_41.method262();
		}
	}
}
