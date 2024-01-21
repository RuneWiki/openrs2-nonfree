import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class2_Sub1_Sub26 extends Class2_Sub1 {

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(IBI)I")
	private int method2045(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 1 ^ local9;
		return 4096 - (Integer.MAX_VALUE & local15 * (local15 * 15731 * local15 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(25) int local25 = Static166.anIntArray619[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static129.anInt3118; local27++) {
				local17[local27] = this.method2045(local25, Static163.anIntArray577[local27]) % 4096;
			}
		}
		return local17;
	}
}
