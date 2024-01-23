import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub9() {
		super(1, true);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(30) int[][] local30 = this.method4575(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			for (@Pc(44) int local44 = 0; local44 < Static299.anInt5670; local44++) {
				local11[local44] = (local34[local44] + local38[local44] + local42[local44]) / 3;
			}
		}
		return local11;
	}
}
