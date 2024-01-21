import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub2() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(21) int[][] local21 = this.method3259(arg0, 0);
			@Pc(25) int[] local25 = local21[1];
			@Pc(29) int[] local29 = local21[2];
			@Pc(33) int[] local33 = local21[0];
			for (@Pc(35) int local35 = 0; local35 < Static135.anInt2897; local35++) {
				local11[local35] = (local29[local35] + local25[local35] + local33[local35]) / 3;
			}
		}
		return local11;
	}
}
