import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class1_Sub1_Sub28 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub28() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(22) int[][] local22 = this.method4758(0, arg0);
			@Pc(26) int[] local26 = local22[0];
			@Pc(30) int[] local30 = local22[2];
			@Pc(34) int[] local34 = local22[1];
			for (@Pc(36) int local36 = 0; local36 < Static75.anInt1848; local36++) {
				local11[local36] = (local26[local36] + local34[local36] + local30[local36]) / 3;
			}
		}
		return local11;
	}
}
