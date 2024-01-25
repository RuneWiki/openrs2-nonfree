import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class6_Sub3_Sub34 extends Class6_Sub3 {

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub34() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(26) int[][] local26 = this.method7961(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static35.anInt670; local40++) {
				local16[local40] = (local38[local40] + local30[local40] + local34[local40]) / 3;
			}
		}
		return local16;
	}
}
