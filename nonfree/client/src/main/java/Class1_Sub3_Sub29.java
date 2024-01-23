import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class1_Sub3_Sub29 extends Class1_Sub3 {

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub29() {
		super(1, true);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(26) int[][] local26 = this.method3465(arg0, 0);
			@Pc(30) int[] local30 = local26[2];
			@Pc(34) int[] local34 = local26[0];
			@Pc(38) int[] local38 = local26[1];
			for (@Pc(40) int local40 = 0; local40 < Static76.anInt1531; local40++) {
				local11[local40] = (local30[local40] + local38[local40] + local34[local40]) / 3;
			}
		}
		return local11;
	}
}
