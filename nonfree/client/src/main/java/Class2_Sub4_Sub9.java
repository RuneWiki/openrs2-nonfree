import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class2_Sub4_Sub9 extends Class2_Sub4 {

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub9() {
		super(3, false);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(23) int[] local23 = this.method3129(0, arg0);
			@Pc(29) int[] local29 = this.method3129(1, arg0);
			@Pc(35) int[] local35 = this.method3129(2, arg0);
			for (@Pc(37) int local37 = 0; local37 < Static118.anInt2608; local37++) {
				@Pc(43) int local43 = local35[local37];
				if (local43 == 4096) {
					local13[local37] = local23[local37];
				} else if (local43 == 0) {
					local13[local37] = local29[local37];
				} else {
					local13[local37] = (4096 - local43) * local29[local37] + local43 * local23[local37] >> 12;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			super.aBoolean190 = arg1.method1534() == 1;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176) {
			@Pc(22) int[] local22 = this.method3129(2, arg0);
			@Pc(28) int[][] local28 = this.method3130(arg0, 0);
			@Pc(34) int[][] local34 = this.method3130(arg0, 1);
			@Pc(38) int[] local38 = local7[0];
			@Pc(42) int[] local42 = local7[1];
			@Pc(46) int[] local46 = local7[2];
			@Pc(50) int[] local50 = local28[0];
			@Pc(54) int[] local54 = local28[2];
			@Pc(58) int[] local58 = local28[1];
			@Pc(62) int[] local62 = local34[0];
			@Pc(66) int[] local66 = local34[1];
			@Pc(70) int[] local70 = local34[2];
			for (@Pc(72) int local72 = 0; local72 < Static118.anInt2608; local72++) {
				@Pc(78) int local78 = local22[local72];
				if (local78 == 4096) {
					local38[local72] = local50[local72];
					local42[local72] = local58[local72];
					local46[local72] = local54[local72];
				} else if (local78 == 0) {
					local38[local72] = local62[local72];
					local42[local72] = local66[local72];
					local46[local72] = local70[local72];
				} else {
					@Pc(110) int local110 = 4096 - local78;
					local38[local72] = local110 * local62[local72] + local78 * local50[local72] >> 12;
					local42[local72] = local78 * local58[local72] + local66[local72] * local110 >> 12;
					local46[local72] = local54[local72] * local78 + local70[local72] * local110 >> 12;
				}
			}
		}
		return local7;
	}
}
