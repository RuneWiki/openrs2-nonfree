import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class2_Sub4_Sub10 extends Class2_Sub4 {

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub10() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(21) int[][] local21 = this.method3130(arg0, 0);
			@Pc(25) int[] local25 = local21[1];
			@Pc(29) int[] local29 = local21[0];
			@Pc(33) int[] local33 = local21[2];
			for (@Pc(35) int local35 = 0; local35 < Static118.anInt2608; local35++) {
				local11[local35] = (local29[local35] + local25[local35] + local33[local35]) / 3;
			}
		}
		return local11;
	}
}
