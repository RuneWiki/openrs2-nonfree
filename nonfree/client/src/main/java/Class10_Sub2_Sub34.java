import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class10_Sub2_Sub34 extends Class10_Sub2 {

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub34() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(23) int[][] local23 = this.method6045(0, arg0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local23[2];
			for (@Pc(37) int local37 = 0; local37 < Static121.anInt2458; local37++) {
				local11[local37] = (local35[local37] + local31[local37] + local27[local37]) / 3;
			}
		}
		return local11;
	}
}
