import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class8_Sub2_Sub8 extends Class8_Sub2 {

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(26) int[][] local26 = this.method8510(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static538.anInt9297; local40++) {
				local16[local40] = (local34[local40] + local30[local40] + local38[local40]) / 3;
			}
		}
		return local16;
	}
}
