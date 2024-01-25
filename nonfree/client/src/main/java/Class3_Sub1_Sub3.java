import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public final class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub3() {
		super(1, true);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(21) int[][] local21 = this.method8360(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			for (@Pc(35) int local35 = 0; local35 < Static131.anInt2935; local35++) {
				local11[local35] = (local33[local35] + local29[local35] + local25[local35]) / 3;
			}
		}
		return local11;
	}
}
