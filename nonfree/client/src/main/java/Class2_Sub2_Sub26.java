import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class2_Sub2_Sub26 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub26() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(25) int[][] local25 = this.method5887(arg0, 0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			for (@Pc(39) int local39 = 0; local39 < Static339.anInt6735; local39++) {
				local15[local39] = (local29[local39] + local33[local39] + local37[local39]) / 3;
			}
		}
		return local15;
	}
}
