import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class4_Sub2_Sub6 extends Class4_Sub2 {

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(21) int local21 = Static217.anIntArray501[arg0];
			for (@Pc(23) int local23 = 0; local23 < Static417.anInt5248; local23++) {
				local13[local23] = this.method1401(local21, Static579.anIntArray585[local23]) % 4096;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIB)I")
	private int method1401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = arg0 * 57 + arg1;
		@Pc(23) int local23 = local17 ^ local17 << 1;
		return 4096 - (local23 * (local23 * local23 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
