import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class3_Sub3_Sub34 extends Class3_Sub3 {

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub34() {
		super(1, true);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(26) int[][] local26 = this.method5729(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static131.anInt2755; local40++) {
				local11[local40] = (local38[local40] + local30[local40] + local34[local40]) / 3;
			}
		}
		return local11;
	}
}
