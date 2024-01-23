import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class1_Sub1_Sub30 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub30() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(27) int[][] local27 = this.method4715(arg0, 0);
			@Pc(31) int[] local31 = local27[1];
			@Pc(35) int[] local35 = local27[0];
			@Pc(39) int[] local39 = local27[2];
			for (@Pc(41) int local41 = 0; local41 < Static62.anInt1350; local41++) {
				local7[local41] = (local39[local41] + local31[local41] + local35[local41]) / 3;
			}
		}
		return local7;
	}
}
