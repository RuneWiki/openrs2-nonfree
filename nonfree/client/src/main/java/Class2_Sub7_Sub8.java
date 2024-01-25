import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class2_Sub7_Sub8 extends Class2_Sub7 {

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(21) int[][] local21 = this.method7589(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			for (@Pc(35) int local35 = 0; local35 < Static352.anInt6485; local35++) {
				local11[local35] = (local33[local35] + local25[local35] + local29[local35]) / 3;
			}
		}
		return local11;
	}
}
