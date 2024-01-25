import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class4_Sub2_Sub7 extends Class4_Sub2 {

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub7() {
		super(1, true);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(26) int[][] local26 = this.method5848(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static350.anInt6330; local40++) {
				local11[local40] = (local34[local40] + local30[local40] + local38[local40]) / 3;
			}
		}
		return local11;
	}
}
