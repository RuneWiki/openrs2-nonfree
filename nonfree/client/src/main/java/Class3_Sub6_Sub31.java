import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class3_Sub6_Sub31 extends Class3_Sub6 {

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(24) int local24 = Static231.anIntArray217[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static481.anInt8358; local26++) {
				local16[local26] = this.method6919(local24, Static595.anIntArray600[local26]) % 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ZII)I")
	private int method6919(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 ^ local9 << 1;
		return 4096 - (local15 * (local15 * 15731 * local15 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
