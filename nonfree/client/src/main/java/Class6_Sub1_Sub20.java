import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class6_Sub1_Sub20 extends Class6_Sub1 {

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub20() {
		super(1, true);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(21) int[][] local21 = this.method5618(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			for (@Pc(35) int local35 = 0; local35 < Static299.anInt5659; local35++) {
				local11[local35] = (local29[local35] + local25[local35] + local33[local35]) / 3;
			}
		}
		return local11;
	}
}
