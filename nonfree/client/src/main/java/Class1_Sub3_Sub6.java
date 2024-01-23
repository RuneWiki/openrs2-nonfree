import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class1_Sub3_Sub6 extends Class1_Sub3 {

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(26) int[][] local26 = this.method4455(0, arg0);
			@Pc(30) int[] local30 = local26[1];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local26[0];
			for (@Pc(40) int local40 = 0; local40 < Static227.anInt4511; local40++) {
				local16[local40] = (local30[local40] + local38[local40] + local34[local40]) / 3;
			}
		}
		return local16;
	}
}
