import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class2_Sub6_Sub14 extends Class2_Sub6 {

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(26) int[][] local26 = this.method5640(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static151.anInt2711; local40++) {
				local16[local40] = (local38[local40] + local30[local40] + local34[local40]) / 3;
			}
		}
		return local16;
	}
}
