import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class5_Sub1_Sub37 extends Class5_Sub1 {

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub37() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(23) int[][] local23 = this.method9203(0, arg0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local23[2];
			for (@Pc(37) int local37 = 0; local37 < Static648.anInt9588; local37++) {
				local11[local37] = (local35[local37] + local27[local37] + local31[local37]) / 3;
			}
		}
		return local11;
	}
}
