import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class3_Sub9_Sub20 extends Class3_Sub9 {

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(24) int local24 = Static147.anIntArray259[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static62.anInt1251; local26++) {
				local11[local26] = this.method4232(local24, Static239.anIntArray394[local26]) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "(III)I")
	private int method4232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 1 ^ local9;
		return 4096 - (Integer.MAX_VALUE & (local15 * local15 * 15731 + 789221) * local15 + 1376312589) / 262144;
	}
}
