import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class2_Sub3_Sub22 extends Class2_Sub3 {

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(24) int local24 = Static76.anIntArray121[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static263.anInt5504; local26++) {
				local16[local26] = this.method4154(Static269.anIntArray507[local26], local24) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BII)I")
	private int method4154(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 + arg1 * 57;
		@Pc(21) int local21 = local15 ^ local15 << 1;
		return 4096 - ((local21 * 15731 * local21 + 789221) * local21 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
