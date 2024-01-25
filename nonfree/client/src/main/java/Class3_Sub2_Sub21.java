import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class3_Sub2_Sub21 extends Class3_Sub2 {

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BII)I")
	private int method6611(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 + arg0 * 57;
		@Pc(24) int local24 = local18 ^ local18 << 1;
		return 4096 - ((local24 * 15731 * local24 + 789221) * local24 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(19) int local19 = Static372.anIntArray207[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static491.anInt8519; local21++) {
				local11[local21] = this.method6611(local19, Static546.anIntArray582[local21]) % 4096;
			}
		}
		return local11;
	}
}
