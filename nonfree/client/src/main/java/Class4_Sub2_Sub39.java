import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class4_Sub2_Sub39 extends Class4_Sub2 {

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub39() {
		super(3, false);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			super.aBoolean501 = arg1.method4864() == 1;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5842(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4800(arg0);
		if (super.aClass207_41.aBoolean426) {
			@Pc(26) int[] local26 = this.method5847(2, arg0);
			@Pc(32) int[][] local32 = this.method5848(0, arg0);
			@Pc(38) int[][] local38 = this.method5848(1, arg0);
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static350.anInt6330; local76++) {
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
					local46[local76] = local58[local76] * local82 + local70[local76] * local95 >> 12;
					local50[local76] = local62[local76] * local82 + local95 * local74[local76] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(21) int[] local21 = this.method5847(0, arg0);
			@Pc(29) int[] local29 = this.method5847(1, arg0);
			@Pc(35) int[] local35 = this.method5847(2, arg0);
			for (@Pc(37) int local37 = 0; local37 < Static350.anInt6330; local37++) {
				@Pc(43) int local43 = local35[local37];
				if (local43 == 4096) {
					local11[local37] = local21[local37];
				} else if (local43 == 0) {
					local11[local37] = local29[local37];
				} else {
					local11[local37] = (4096 - local43) * local29[local37] + local43 * local21[local37] >> 12;
				}
			}
		}
		return local11;
	}
}
