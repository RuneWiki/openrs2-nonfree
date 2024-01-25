import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class2_Sub11_Sub19 extends Class2_Sub11 {

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub19() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(21) int[][] local21 = this.method9538(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			for (@Pc(35) int local35 = 0; local35 < Static301.anInt10214; local35++) {
				local11[local35] = (local33[local35] + local25[local35] + local29[local35]) / 3;
			}
		}
		return local11;
	}
}
