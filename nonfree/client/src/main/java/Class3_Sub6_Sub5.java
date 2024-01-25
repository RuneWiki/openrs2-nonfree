import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class3_Sub6_Sub5 extends Class3_Sub6 {

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub5() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(26) int[][] local26 = this.method7773(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static521.anInt8383; local40++) {
				local16[local40] = (local38[local40] + local30[local40] + local34[local40]) / 3;
			}
		}
		return local16;
	}
}
