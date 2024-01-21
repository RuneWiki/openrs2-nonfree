import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class3_Sub1_Sub30 extends Class3_Sub1 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZI)I")
	private int method2367(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 + arg0 * 57;
		@Pc(24) int local24 = local18 << 1 ^ local18;
		return 4096 - (Integer.MAX_VALUE & local24 * (local24 * 15731 * local24 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(19) int local19 = Static125.anIntArray336[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static141.anInt3261; local21++) {
				local11[local21] = this.method2367(local19, Static85.anIntArray47[local21]) % 4096;
			}
		}
		return local11;
	}
}
