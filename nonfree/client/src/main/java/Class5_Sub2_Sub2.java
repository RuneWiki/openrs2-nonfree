import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class5_Sub2_Sub2 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub2() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(26) int[][] local26 = this.method8823(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static314.anInt6320; local40++) {
				local16[local40] = (local38[local40] + local34[local40] + local30[local40]) / 3;
			}
		}
		return local16;
	}
}
