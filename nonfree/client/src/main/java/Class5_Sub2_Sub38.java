import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class5_Sub2_Sub38 extends Class5_Sub2 {

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(29) int[] local29 = this.method8945(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static195.anInt3759; local31++) {
				local11[local31] = 4096 - local29[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8943(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass180_41.method4548(arg0);
		if (super.aClass180_41.aBoolean464) {
			@Pc(26) int[][] local26 = this.method8952(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static195.anInt3759; local52++) {
				local42[local52] = 4096 - local30[local52];
				local46[local52] = 4096 - local34[local52];
				local50[local52] = 4096 - local38[local52];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean910 = arg0.method7816() == 1;
		}
	}
}
