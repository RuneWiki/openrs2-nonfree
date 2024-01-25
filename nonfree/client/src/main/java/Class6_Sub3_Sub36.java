import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class6_Sub3_Sub36 extends Class6_Sub3 {

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(20) int[] local20 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(28) int local28 = Static77.anIntArray116[arg0];
			for (@Pc(30) int local30 = 0; local30 < Static35.anInt670; local30++) {
				local20[local30] = this.method7031(Static372.anIntArray481[local30], local28) % 4096;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(III)I")
	private int method7031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = arg1 * 57 + arg0;
		@Pc(23) int local23 = local17 << 1 ^ local17;
		return 4096 - (Integer.MAX_VALUE & local23 * (local23 * 15731 * local23 + 789221) + 1376312589) / 262144;
	}
}
