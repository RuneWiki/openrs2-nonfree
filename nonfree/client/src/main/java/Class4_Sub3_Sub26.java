import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class4_Sub3_Sub26 extends Class4_Sub3 {

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(BII)I")
	private int method4103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(21) int local21 = local10 << 1 ^ local10;
		return 4096 - ((local21 * 15731 * local21 + 789221) * local21 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(24) int local24 = Static376.anIntArray531[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static304.anInt5637; local26++) {
				local11[local26] = this.method4103(Static231.anIntArray368[local26], local24) % 4096;
			}
		}
		return local11;
	}
}
