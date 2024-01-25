import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class4_Sub4_Sub9 extends Class4_Sub4 {

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub9() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(26) int[][] local26 = this.method5384(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static124.anInt3576; local40++) {
				local16[local40] = (local30[local40] + local34[local40] + local38[local40]) / 3;
			}
		}
		return local16;
	}
}
