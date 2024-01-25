import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class5_Sub2_Sub3 extends Class5_Sub2 {

	@OriginalMember(owner = "client!bm", name = "F", descriptor = "Z")
	private boolean aBoolean54 = true;

	@OriginalMember(owner = "client!bm", name = "H", descriptor = "Z")
	private boolean aBoolean55 = true;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(34) int[] local34 = this.method8945(this.aBoolean54 ? Static115.anInt2379 - arg0 : arg0, 0);
			if (this.aBoolean55) {
				for (@Pc(47) int local47 = 0; local47 < Static195.anInt3759; local47++) {
					local16[local47] = local34[Static388.anInt6925 - local47];
				}
			} else {
				Static686.method4967(local34, 0, local16, 0, Static195.anInt3759);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean55 = arg0.method7816() == 1;
		} else if (arg1 == 1) {
			this.aBoolean54 = arg0.method7816() == 1;
		} else if (arg1 == 2) {
			super.aBoolean910 = arg0.method7816() == 1;
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8943(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass180_41.method4548(arg0);
		if (super.aClass180_41.aBoolean464) {
			@Pc(34) int[][] local34 = this.method8952(0, this.aBoolean54 ? Static115.anInt2379 - arg0 : arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			@Pc(63) int local63;
			if (this.aBoolean55) {
				for (local63 = 0; local63 < Static195.anInt3759; local63++) {
					local50[local63] = local38[Static388.anInt6925 - local63];
					local54[local63] = local42[Static388.anInt6925 - local63];
					local58[local63] = local46[Static388.anInt6925 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static195.anInt3759; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local16;
	}
}
