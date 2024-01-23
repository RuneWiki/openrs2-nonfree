import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class1_Sub3_Sub31 extends Class1_Sub3 {

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BII)I")
	private int method3420(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(23) int local23 = local9 << 1 ^ local9;
		return 4096 - (Integer.MAX_VALUE & (local23 * local23 * 15731 + 789221) * local23 + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(24) int local24 = Static94.anIntArray321[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static110.anInt2934; local26++) {
				local16[local26] = this.method3420(Static175.anIntArray302[local26], local24) % 4096;
			}
		}
		return local16;
	}
}
