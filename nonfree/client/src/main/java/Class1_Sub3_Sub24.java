import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class1_Sub3_Sub24 extends Class1_Sub3 {

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(26) int[][] local26 = this.method7910(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static236.anInt4609; local40++) {
				local16[local40] = (local38[local40] + local34[local40] + local30[local40]) / 3;
			}
		}
		return local16;
	}
}
