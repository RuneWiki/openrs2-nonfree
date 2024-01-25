import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class1_Sub3_Sub36 extends Class1_Sub3 {

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub36() {
		super(1, true);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(26) int[][] local26 = this.method7130(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static452.anInt7734; local40++) {
				local16[local40] = (local34[local40] + local30[local40] + local38[local40]) / 3;
			}
		}
		return local16;
	}
}
