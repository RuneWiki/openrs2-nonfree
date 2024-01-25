import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class5_Sub1_Sub10 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub10() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(21) int[][] local21 = this.method7154(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			for (@Pc(35) int local35 = 0; local35 < Static147.anInt3075; local35++) {
				local11[local35] = (local25[local35] + local29[local35] + local33[local35]) / 3;
			}
		}
		return local11;
	}
}
