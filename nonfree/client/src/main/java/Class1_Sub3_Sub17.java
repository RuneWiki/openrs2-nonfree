import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class1_Sub3_Sub17 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(26) int local26 = Static132.anIntArray265[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static227.anInt4511; local28++) {
				local17[local28] = this.method1983(Static209.anIntArray377[local28], local26) % 4096;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(III)I")
	private int method1983(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 ^ local14 << 1;
		return 4096 - ((local20 * local20 * 15731 + 789221) * local20 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
