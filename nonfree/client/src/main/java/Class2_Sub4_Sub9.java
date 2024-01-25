import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class2_Sub4_Sub9 extends Class2_Sub4 {

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub9() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(26) int[][] local26 = this.method7567(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static143.anInt7434; local40++) {
				local11[local40] = (local38[local40] + local34[local40] + local30[local40]) / 3;
			}
		}
		return local11;
	}
}
