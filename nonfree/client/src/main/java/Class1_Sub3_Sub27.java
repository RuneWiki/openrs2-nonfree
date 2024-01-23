import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class1_Sub3_Sub27 extends Class1_Sub3 {

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub27() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(26) int[][] local26 = this.method4129(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static110.anInt2934; local40++) {
				local7[local40] = (local38[local40] + local34[local40] + local30[local40]) / 3;
			}
		}
		return local7;
	}
}
