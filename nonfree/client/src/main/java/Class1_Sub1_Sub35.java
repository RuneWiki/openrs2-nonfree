import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class1_Sub1_Sub35 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub35() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(26) int[][] local26 = this.method3737(0, arg0);
			@Pc(30) int[] local30 = local26[2];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[0];
			for (@Pc(40) int local40 = 0; local40 < Static157.anInt3431; local40++) {
				local11[local40] = (local30[local40] + local38[local40] + local34[local40]) / 3;
			}
		}
		return local11;
	}
}
