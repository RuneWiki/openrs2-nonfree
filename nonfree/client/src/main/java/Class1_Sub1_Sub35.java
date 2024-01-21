import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class1_Sub1_Sub35 extends Class1_Sub1 {

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub35() {
		super(1, true);
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(26) int[][] local26 = this.method3579(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static115.anInt2578; local40++) {
				local16[local40] = (local30[local40] + local34[local40] + local38[local40]) / 3;
			}
		}
		return local16;
	}
}
