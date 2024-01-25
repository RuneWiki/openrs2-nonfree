import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class1_Sub4_Sub2 extends Class1_Sub4 {

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub2() {
		super(1, true);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(21) int[][] local21 = this.method5956(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			for (@Pc(35) int local35 = 0; local35 < Static66.anInt1511; local35++) {
				local11[local35] = (local29[local35] + local25[local35] + local33[local35]) / 3;
			}
		}
		return local11;
	}
}
