import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class1_Sub1_Sub29 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(28) int local28 = Static10.anIntArray604[arg0];
			for (@Pc(30) int local30 = 0; local30 < Static6.anInt4960; local30++) {
				local19[local30] = this.method3823(local28, Static298.anIntArray589[local30]) % 4096;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(III)I")
	private int method3823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local15 << 1 ^ local15;
		return 4096 - (local21 * (local21 * 15731 * local21 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
