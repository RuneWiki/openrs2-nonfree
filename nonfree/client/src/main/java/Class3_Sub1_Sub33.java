import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class3_Sub1_Sub33 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(22) int[] local22 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(30) int local30 = Static121.anIntArray145[arg0];
			for (@Pc(32) int local32 = 0; local32 < Static379.anInt5859; local32++) {
				local22[local32] = this.method8440(Static497.anIntArray579[local32], local30) % 4096;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(III)I")
	private int method8440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(16) int local16 = local10 << 1 ^ local10;
		return 4096 - (local16 * (local16 * 15731 * local16 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
