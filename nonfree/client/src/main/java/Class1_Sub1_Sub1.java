import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1() {
		super(3, false);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean231 = arg0.method2771() == 1;
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(28) int[] local28 = this.method3580(arg0, 0);
			@Pc(34) int[] local34 = this.method3580(arg0, 1);
			@Pc(40) int[] local40 = this.method3580(arg0, 2);
			for (@Pc(42) int local42 = 0; local42 < Static115.anInt2578; local42++) {
				@Pc(48) int local48 = local40[local42];
				if (local48 == 4096) {
					local16[local42] = local28[local42];
				} else if (local48 == 0) {
					local16[local42] = local34[local42];
				} else {
					local16[local42] = (4096 - local48) * local34[local42] + local48 * local28[local42] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80) {
			@Pc(26) int[] local26 = this.method3580(arg0, 2);
			@Pc(32) int[][] local32 = this.method3579(arg0, 0);
			@Pc(38) int[][] local38 = this.method3579(arg0, 1);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local38[0];
			@Pc(66) int[] local66 = local32[2];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static115.anInt2578; local76++) {
				@Pc(82) int local82 = local26[local76];
				if (local82 == 4096) {
					local42[local76] = local54[local76];
					local46[local76] = local58[local76];
					local50[local76] = local66[local76];
				} else if (local82 == 0) {
					local42[local76] = local62[local76];
					local46[local76] = local70[local76];
					local50[local76] = local74[local76];
				} else {
					@Pc(93) int local93 = 4096 - local82;
					local42[local76] = local93 * local62[local76] + local54[local76] * local82 >> 12;
					local46[local76] = local70[local76] * local93 + local58[local76] * local82 >> 12;
					local50[local76] = local74[local76] * local93 + local82 * local66[local76] >> 12;
				}
			}
		}
		return local16;
	}
}
