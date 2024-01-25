import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class3_Sub2_Sub29 extends Class3_Sub2 {

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub29() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(21) int[][] local21 = this.method8337(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			for (@Pc(35) int local35 = 0; local35 < Static164.anInt8839; local35++) {
				local11[local35] = (local25[local35] + local29[local35] + local33[local35]) / 3;
			}
		}
		return local11;
	}
}
