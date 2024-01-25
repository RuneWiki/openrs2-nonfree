import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class4_Sub1_Sub11 extends Class4_Sub1 {

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(27) int local27 = Static442.anIntArray449[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static376.anInt7260; local29++) {
				local19[local29] = this.method2936(local27, Static292.anIntArray394[local29]) % 4096;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(BII)I")
	private int method2936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 + arg0 * 57;
		@Pc(23) int local23 = local9 ^ local9 << 1;
		return 4096 - (local23 * (local23 * 15731 * local23 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
