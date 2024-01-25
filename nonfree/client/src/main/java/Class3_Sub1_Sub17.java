import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class3_Sub1_Sub17 extends Class3_Sub1 {

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub17() {
		super(1, true);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(26) int[][] local26 = this.method7779(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static307.anInt4846; local40++) {
				local11[local40] = (local38[local40] + local30[local40] + local34[local40]) / 3;
			}
		}
		return local11;
	}
}
