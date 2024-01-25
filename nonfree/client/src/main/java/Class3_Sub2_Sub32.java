import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class3_Sub2_Sub32 extends Class3_Sub2 {

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZII)I")
	private int method7890(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(15) int local15 = local9 << 1 ^ local9;
		return 4096 - ((local15 * local15 * 15731 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(25) int local25 = Static123.anIntArray113[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static636.anInt10302; local27++) {
				local17[local27] = this.method7890(Static508.anIntArray472[local27], local25) % 4096;
			}
		}
		return local17;
	}
}
