import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cha")
public final class Class5_Sub3_Sub3 extends Class5_Sub3 {

	@OriginalMember(owner = "client!cha", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub3() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(21) int[][] local21 = this.method9207(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			for (@Pc(35) int local35 = 0; local35 < Static7.anInt102; local35++) {
				local11[local35] = (local33[local35] + local25[local35] + local29[local35]) / 3;
			}
		}
		return local11;
	}
}
