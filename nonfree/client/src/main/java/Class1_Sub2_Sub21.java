import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class1_Sub2_Sub21 extends Class1_Sub2 {

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub21() {
		super(1, true);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(17) int[][] local17 = this.method3501(arg0, 0);
			@Pc(21) int[] local21 = local17[2];
			@Pc(25) int[] local25 = local17[1];
			@Pc(29) int[] local29 = local17[0];
			for (@Pc(31) int local31 = 0; local31 < Static105.anInt2391; local31++) {
				local7[local31] = (local21[local31] + local25[local31] + local29[local31]) / 3;
			}
		}
		return local7;
	}
}
