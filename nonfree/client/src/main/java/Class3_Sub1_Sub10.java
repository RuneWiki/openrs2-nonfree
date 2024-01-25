import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class3_Sub1_Sub10 extends Class3_Sub1 {

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub10() {
		super(3, false);
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7773(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass144_41.method3782(arg0);
		if (super.aClass144_41.aBoolean326) {
			@Pc(26) int[] local26 = this.method7765(2, arg0);
			@Pc(32) int[][] local32 = this.method7766(0, arg0);
			@Pc(38) int[][] local38 = this.method7766(1, arg0);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static206.anInt4182; local76++) {
				@Pc(82) int local82 = local26[local76];
				if (local82 == 4096) {
					local42[local76] = local54[local76];
					local46[local76] = local58[local76];
					local50[local76] = local62[local76];
				} else if (local82 == 0) {
					local42[local76] = local66[local76];
					local46[local76] = local70[local76];
					local50[local76] = local74[local76];
				} else {
					@Pc(95) int local95 = 4096 - local82;
					local42[local76] = local54[local76] * local82 + local66[local76] * local95 >> 12;
					local46[local76] = local70[local76] * local95 + local58[local76] * local82 >> 12;
					local50[local76] = local95 * local74[local76] + local82 * local62[local76] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean728 = arg0.method3118() == 1;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(28) int[] local28 = this.method7765(0, arg0);
			@Pc(34) int[] local34 = this.method7765(1, arg0);
			@Pc(40) int[] local40 = this.method7765(2, arg0);
			for (@Pc(42) int local42 = 0; local42 < Static206.anInt4182; local42++) {
				@Pc(48) int local48 = local40[local42];
				if (local48 == 4096) {
					local11[local42] = local28[local42];
				} else if (local48 == 0) {
					local11[local42] = local34[local42];
				} else {
					local11[local42] = local48 * local28[local42] + (4096 - local48) * local34[local42] >> 12;
				}
			}
		}
		return local11;
	}
}
