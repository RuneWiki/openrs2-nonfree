import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class2_Sub1_Sub28 extends Class2_Sub1 {

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(BII)I")
	private int method4826(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 << 1 ^ local14;
		return 4096 - (local20 * (local20 * local20 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(24) int local24 = Static373.anIntArray55[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static131.anInt2581; local26++) {
				local11[local26] = this.method4826(local24, Static252.anIntArray323[local26]) % 4096;
			}
		}
		return local11;
	}
}
