import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class2_Sub3_Sub21 extends Class2_Sub3 {

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V", line = 19)
	public Class2_Sub3_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)[I", line = 22)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(24) int local24 = Static16.anIntArray322[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static211.anInt4031; local26++) {
				local16[local26] = this.method3589(local24, Static311.anIntArray424[local26]) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(III)I", line = 55)
	private int method3589(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 1 ^ local9;
		return 4096 - (local15 * (local15 * local15 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
