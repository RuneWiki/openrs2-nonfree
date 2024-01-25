import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class4_Sub3_Sub22 extends Class4_Sub3 {

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub22() {
		super(1, true);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(21) int[][] local21 = this.method6331(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			for (@Pc(35) int local35 = 0; local35 < Static304.anInt5637; local35++) {
				local11[local35] = (local25[local35] + local29[local35] + local33[local35]) / 3;
			}
		}
		return local11;
	}
}
