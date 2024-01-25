import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class11_Sub2_Sub4 extends Class11_Sub2 {

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub4() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(30) int[][] local30 = this.method5715(arg0, 0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			for (@Pc(44) int local44 = 0; local44 < Static339.anInt6549; local44++) {
				local11[local44] = (local34[local44] + local38[local44] + local42[local44]) / 3;
			}
		}
		return local11;
	}
}
