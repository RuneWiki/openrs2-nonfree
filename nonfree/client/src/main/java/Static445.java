import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "[I")
	public static int[] anIntArray590;

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
	public static int anInt7693 = 0;

	@OriginalMember(owner = "client!rca", name = "f", descriptor = "[I")
	public static final int[] anIntArray591 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method6126(@OriginalArg(0) Class134 arg0) {
		@Pc(7) int local7 = Static330.anInt5532;
		@Pc(9) int local9 = Static518.anInt8770;
		@Pc(11) int local11 = Static274.anInt307;
		@Pc(13) int local13 = Static110.anInt2169;
		arg0.method6929(local11, local9, local7, -10660793, local13);
		arg0.method6929(local11 - 2, local9 + 1, local7 + 1, -16777216, 16);
		arg0.method6927(local11 - 2, -16777216, local9 + 18, local13 - 19, local7 + 1);
		Static418.aClass64_11.method6602(-10660793, Static568.aClass351_28.method7651(Static307.anInt5279), local7 + 3, -1, local9 - -14);
		@Pc(74) int local74 = Static166.aClass25_1.method4783();
		@Pc(78) int local78 = Static166.aClass25_1.method4788();
		@Pc(80) int local80 = 0;
		for (@Pc(85) Class1_Sub51 local85 = (Class1_Sub51) Static310.aClass353_32.method7677(); local85 != null; local85 = (Class1_Sub51) Static310.aClass353_32.method7687()) {
			@Pc(105) int local105 = (Static337.anInt8004 - local80 - 1) * 16 + local9 + 31;
			@Pc(107) short local107 = -1;
			if (local74 > local7 && local74 < local11 + local7 && local78 > local105 - 13 && local78 < local105 + 3 && local85.aBoolean754) {
				local107 = -256;
			}
			@Pc(136) int[] local136 = null;
			if (Static195.method2977(local85.anInt9638)) {
				local136 = Static175.aClass114_4.method2217((int) local85.aLong302).anIntArray503;
			} else if (local85.anInt9643 != -1) {
				local136 = Static175.aClass114_4.method2217(local85.anInt9643).anIntArray503;
			} else if (Static416.method5728(local85.anInt9638)) {
				@Pc(213) Class1_Sub42 local213 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local85.aLong302);
				if (local213 != null) {
					@Pc(218) Class8_Sub3_Sub3_Sub1_Sub2 local218 = local213.aClass8_Sub3_Sub3_Sub1_Sub2_2;
					@Pc(221) Class20 local221 = local218.aClass20_1;
					if (local221.anIntArray40 != null) {
						local221 = local221.method284(Static430.aClass321_1);
					}
					if (local221 != null) {
						local136 = local221.anIntArray39;
					}
				}
			} else if (Static270.method3853(local85.anInt9638)) {
				@Pc(182) Class95 local182;
				if (local85.anInt9638 == 1001) {
					local182 = Static518.aClass96_4.method1925((int) local85.aLong302);
				} else {
					local182 = Static518.aClass96_4.method1925((int) (local85.aLong302 >>> 32 & 0x7FFFFFFFL));
				}
				if (local182.anIntArray208 != null) {
					local182 = local182.method1922(Static430.aClass321_1);
				}
				if (local182 != null) {
					local136 = local182.anIntArray207;
				}
			}
			@Pc(249) String local249 = Static243.method3634(local85);
			if (local136 != null) {
				local249 = local249 + Static31.method424(local136);
			}
			Static418.aClass64_11.method6600(local7 + 3, local249, local107, local105, Static550.anIntArray689, Static104.aClass22Array5);
			if (local85.aBoolean753) {
				Static200.aClass22_20.method7662(local7 + Static373.aClass334_13.method7354(local249) + 5, local105 + -12);
			}
			local80++;
		}
		Static315.method4378(Static110.anInt2169, Static518.anInt8770, Static330.anInt5532, Static274.anInt307);
	}
}
