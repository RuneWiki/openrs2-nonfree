import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class5_Sub1_Sub8 extends Class5_Sub1 {

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(21) int[][] local21 = this.method3191(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			for (@Pc(35) int local35 = 0; local35 < Static174.anInt3489; local35++) {
				local11[local35] = (local33[local35] + local29[local35] + local25[local35]) / 3;
			}
		}
		return local11;
	}
}
