import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class1_Sub3_Sub37 extends Class1_Sub3 {

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub37() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(23) int[][] local23 = this.method8199(0, arg0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local23[2];
			for (@Pc(37) int local37 = 0; local37 < Static254.anInt4973; local37++) {
				local11[local37] = (local35[local37] + local27[local37] + local31[local37]) / 3;
			}
		}
		return local11;
	}
}
