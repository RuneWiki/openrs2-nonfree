import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class2_Sub1_Sub33 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(24) int local24 = Static272.anIntArray521[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static281.anInt5558; local26++) {
				local7[local26] = this.method3800(Static234.anIntArray462[local26], local24) % 4096;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(III)I")
	private int method3800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = arg0 + arg1 * 57;
		@Pc(23) int local23 = local17 ^ local17 << 1;
		return 4096 - ((local23 * local23 * 15731 + 789221) * local23 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
