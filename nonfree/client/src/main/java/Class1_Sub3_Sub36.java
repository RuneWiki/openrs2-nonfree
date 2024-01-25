import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class1_Sub3_Sub36 extends Class1_Sub3 {

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(III)I")
	private int method5328(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local9 << 1 ^ local9;
		return 4096 - ((local20 * 15731 * local20 + 789221) * local20 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(27) int local27 = Static266.anIntArray454[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static153.anInt3378; local29++) {
				local11[local29] = this.method5328(Static107.anIntArray234[local29], local27) % 4096;
			}
		}
		return local11;
	}
}
