import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class1_Sub1_Sub33 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(21) int[][] local21 = this.method3013(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			for (@Pc(35) int local35 = 0; local35 < Static65.anInt1933; local35++) {
				local11[local35] = (local33[local35] + local29[local35] + local25[local35]) / 3;
			}
		}
		return local11;
	}
}
