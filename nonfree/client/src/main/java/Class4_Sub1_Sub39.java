import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class4_Sub1_Sub39 extends Class4_Sub1 {

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BII)I")
	private int method4553(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg0 + arg1 * 57;
		@Pc(23) int local23 = local17 ^ local17 << 1;
		return 4096 - (Integer.MAX_VALUE & (local23 * local23 * 15731 + 789221) * local23 + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(24) int local24 = Static10.anIntArray7[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static68.anInt1753; local26++) {
				local7[local26] = this.method4553(Static94.anIntArray163[local26], local24) % 4096;
			}
		}
		return local7;
	}
}
