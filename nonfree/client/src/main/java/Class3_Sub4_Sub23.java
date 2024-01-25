import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class3_Sub4_Sub23 extends Class3_Sub4 {

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(24) int local24 = Static285.anIntArray401[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static106.anInt2356; local26++) {
				local11[local26] = this.method4158(Static382.anIntArray476[local26], local24) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(III)I")
	private int method4158(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(15) int local15 = local9 << 1 ^ local9;
		return 4096 - (local15 * (local15 * local15 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
