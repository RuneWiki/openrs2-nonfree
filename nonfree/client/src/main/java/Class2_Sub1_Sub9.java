import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(BII)I")
	private int method660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 + arg0 * 57;
		@Pc(20) int local20 = local9 << 1 ^ local9;
		return 4096 - (Integer.MAX_VALUE & local20 * (local20 * 15731 * local20 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(15) int local15 = Static11.anIntArray8[arg0];
			for (@Pc(17) int local17 = 0; local17 < Static120.anInt2812; local17++) {
				local7[local17] = this.method660(local15, Static69.anIntArray117[local17]) % 4096;
			}
		}
		return local7;
	}
}
