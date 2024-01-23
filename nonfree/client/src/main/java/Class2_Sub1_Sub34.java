import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class2_Sub1_Sub34 extends Class2_Sub1 {

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub34() {
		super(1, true);
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(27) int[][] local27 = this.method4600(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			for (@Pc(41) int local41 = 0; local41 < Static281.anInt5558; local41++) {
				local17[local41] = (local39[local41] + local31[local41] + local35[local41]) / 3;
			}
		}
		return local17;
	}
}
