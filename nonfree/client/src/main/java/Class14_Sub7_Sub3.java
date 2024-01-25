import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class14_Sub7_Sub3 extends Class14_Sub7 {

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub3() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(21) int[][] local21 = this.method9384(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			for (@Pc(35) int local35 = 0; local35 < Static613.anInt10114; local35++) {
				local11[local35] = (local33[local35] + local29[local35] + local25[local35]) / 3;
			}
		}
		return local11;
	}
}
