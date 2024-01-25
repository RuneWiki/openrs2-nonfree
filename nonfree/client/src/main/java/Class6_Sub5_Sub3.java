import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class6_Sub5_Sub3 extends Class6_Sub5 {

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub3() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(26) int[][] local26 = this.method6544(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static240.anInt4386; local40++) {
				local11[local40] = (local30[local40] + local34[local40] + local38[local40]) / 3;
			}
		}
		return local11;
	}
}
