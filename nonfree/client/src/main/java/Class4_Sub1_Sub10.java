import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class4_Sub1_Sub10 extends Class4_Sub1 {

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub10() {
		super(1, true);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(27) int[][] local27 = this.method4549(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			for (@Pc(41) int local41 = 0; local41 < Static68.anInt1753; local41++) {
				local17[local41] = (local39[local41] + local31[local41] + local35[local41]) / 3;
			}
		}
		return local17;
	}
}
