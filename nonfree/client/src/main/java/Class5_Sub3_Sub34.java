import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class5_Sub3_Sub34 extends Class5_Sub3 {

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBI)I")
	private int method8420(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg1 * 57 + arg0;
		@Pc(23) int local23 = local17 << 1 ^ local17;
		return 4096 - (Integer.MAX_VALUE & local23 * (local23 * local23 * 15731 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(26) int local26 = Static458.anIntArray438[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static7.anInt102; local28++) {
				local11[local28] = this.method8420(Static382.anIntArray368[local28], local26) % 4096;
			}
		}
		return local11;
	}
}
