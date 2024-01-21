import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class5_Sub1_Sub11 extends Class5_Sub1 {

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZII)I")
	private int method1092(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 + arg1 * 57;
		@Pc(21) int local21 = local15 << 1 ^ local15;
		return 4096 - ((local21 * 15731 * local21 + 789221) * local21 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(19) int local19 = Static147.anIntArray321[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static174.anInt3489; local21++) {
				local7[local21] = this.method1092(Static117.anIntArray274[local21], local19) % 4096;
			}
		}
		return local7;
	}
}
