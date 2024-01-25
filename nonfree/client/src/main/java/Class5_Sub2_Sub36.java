import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class5_Sub2_Sub36 extends Class5_Sub2 {

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub36() {
		super(3, false);
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8943(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass180_41.method4548(arg0);
		if (super.aClass180_41.aBoolean464) {
			@Pc(26) int[] local26 = this.method8945(arg0, 2);
			@Pc(32) int[][] local32 = this.method8952(0, arg0);
			@Pc(38) int[][] local38 = this.method8952(1, arg0);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static195.anInt3759; local76++) {
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
					@Pc(116) int local116 = 4096 - local82;
					local42[local76] = local82 * local54[local76] + local116 * local66[local76] >> 12;
					local46[local76] = local116 * local70[local76] + local58[local76] * local82 >> 12;
					local50[local76] = local116 * local74[local76] + local82 * local62[local76] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(26) int[] local26 = this.method8945(arg0, 0);
			@Pc(32) int[] local32 = this.method8945(arg0, 1);
			@Pc(38) int[] local38 = this.method8945(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static195.anInt3759; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = local26[local40] * local46 + (4096 - local46) * local32[local40] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean910 = arg0.method7816() == 1;
		}
	}
}
