import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class2_Sub10_Sub14 extends Class2_Sub10 {

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(26) int[][] local26 = this.method8408(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static93.anInt1862; local40++) {
				local16[local40] = (local38[local40] + local34[local40] + local30[local40]) / 3;
			}
		}
		return local16;
	}
}
