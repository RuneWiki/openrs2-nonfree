import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!efa")
public final class Class3_Sub6_Sub9 extends Class3_Sub6 {

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(24) int local24 = Static525.anIntArray553[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static521.anInt8383; local26++) {
				local16[local26] = this.method2466(Static73.anIntArray76[local26], local24) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IBI)I")
	private int method2466(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 << 1 ^ local14;
		return 4096 - (local20 * (local20 * local20 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
