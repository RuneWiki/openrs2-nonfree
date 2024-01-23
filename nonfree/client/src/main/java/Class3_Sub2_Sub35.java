import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class3_Sub2_Sub35 extends Class3_Sub2 {

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub35() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(18) int[][] local18 = this.method4965(arg0, 0);
			@Pc(22) int[] local22 = local18[2];
			@Pc(26) int[] local26 = local18[1];
			@Pc(30) int[] local30 = local18[0];
			for (@Pc(32) int local32 = 0; local32 < Static22.anInt421; local32++) {
				local7[local32] = (local26[local32] + local30[local32] + local22[local32]) / 3;
			}
		}
		return local7;
	}
}
