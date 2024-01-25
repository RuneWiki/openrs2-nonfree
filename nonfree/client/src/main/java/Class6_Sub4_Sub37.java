import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class6_Sub4_Sub37 extends Class6_Sub4 {

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			@Pc(19) int local19 = Static501.anIntArray637[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static408.anInt7209; local21++) {
				local11[local21] = this.method7516(local19, Static398.anIntArray514[local21]) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(BII)I")
	private int method7516(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg1 + arg0 * 57;
		@Pc(23) int local23 = local17 << 1 ^ local17;
		return 4096 - ((local23 * 15731 * local23 + 789221) * local23 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
