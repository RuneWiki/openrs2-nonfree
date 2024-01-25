import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class3_Sub2_Sub13 extends Class3_Sub2 {

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub13() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(28) int[][] local28 = this.method9212(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			for (@Pc(42) int local42 = 0; local42 < Static636.anInt10302; local42++) {
				local18[local42] = (local40[local42] + local32[local42] + local36[local42]) / 3;
			}
		}
		return local18;
	}
}
