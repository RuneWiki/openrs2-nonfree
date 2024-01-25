import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class5_Sub2_Sub12 extends Class5_Sub2 {

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(24) int local24 = Static493.anIntArray476[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static597.anInt10025; local26++) {
				local16[local26] = this.method2081(Static352.anIntArray331[local26], local24) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "(BII)I")
	private int method2081(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 + arg1 * 57;
		@Pc(21) int local21 = local15 << 1 ^ local15;
		return 4096 - ((local21 * local21 * 15731 + 789221) * local21 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
