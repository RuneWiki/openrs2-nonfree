import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class4_Sub2_Sub32 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(III)I")
	private int method7865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 + arg1 * 57;
		@Pc(24) int local24 = local18 << 1 ^ local18;
		return 4096 - (local24 * (local24 * local24 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(23) int local23 = Static429.anIntArray465[arg0];
			for (@Pc(25) int local25 = 0; local25 < Static269.anInt4330; local25++) {
				local11[local25] = this.method7865(Static312.anIntArray370[local25], local23) % 4096;
			}
		}
		return local11;
	}
}
