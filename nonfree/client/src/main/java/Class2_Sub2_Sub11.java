import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class2_Sub2_Sub11 extends Class2_Sub2 {

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub11() {
		super(1, true);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(26) int[][] local26 = this.method3557(arg0, 0);
			@Pc(30) int[] local30 = local26[1];
			@Pc(34) int[] local34 = local26[0];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static106.anInt3045; local40++) {
				local11[local40] = (local34[local40] + local30[local40] + local38[local40]) / 3;
			}
		}
		return local11;
	}
}
