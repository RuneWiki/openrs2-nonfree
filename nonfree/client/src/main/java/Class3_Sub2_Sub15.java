import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class3_Sub2_Sub15 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lc", name = "tb", descriptor = "I")
	private int anInt2021;

	@OriginalMember(owner = "client!lc", name = "X", descriptor = "I")
	private int anInt2020;

	@OriginalMember(owner = "client!lc", name = "vb", descriptor = "I")
	private int anInt2022;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method2796(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass28_39.method997(arg0);
		if (super.aClass28_39.aBoolean89) {
			@Pc(26) int[][] local26 = this.method2785(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local16[0];
			@Pc(42) int[] local42 = local26[2];
			@Pc(46) int[] local46 = local16[2];
			@Pc(50) int[] local50 = local16[1];
			for (@Pc(52) int local52 = 0; local52 < Static86.anInt1942; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local42[local52];
				@Pc(66) int local66 = local34[local52];
				if (local62 == local58 && local62 == local66) {
					local38[local52] = this.anInt2021 * local58 >> 12;
					local50[local52] = this.anInt2020 * local62 >> 12;
					local46[local52] = this.anInt2022 * local66 >> 12;
				} else {
					local38[local52] = this.anInt2021;
					local50[local52] = this.anInt2020;
					local46[local52] = this.anInt2022;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2021 = arg0.method1359();
		} else if (arg1 == 1) {
			this.anInt2020 = arg0.method1359();
		} else if (arg1 == 2) {
			this.anInt2022 = arg0.method1359();
		}
	}
}
