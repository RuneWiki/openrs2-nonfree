import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(III)I")
	private int method535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 << 1 ^ local14;
		return 4096 - (local20 * (local20 * 15731 * local20 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(26) int local26 = Static256.anIntArray474[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static62.anInt1350; local28++) {
				local17[local28] = this.method535(Static3.anIntArray3[local28], local26) % 4096;
			}
		}
		return local17;
	}
}
