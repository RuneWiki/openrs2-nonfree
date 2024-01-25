import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class4_Sub6_Sub32 extends Class4_Sub6 {

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(26) int[][] local26 = this.method5693(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static31.anInt797; local40++) {
				local16[local40] = (local34[local40] + local30[local40] + local38[local40]) / 3;
			}
		}
		return local16;
	}
}
