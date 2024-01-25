import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class1_Sub1_Sub25 extends Class1_Sub1 {

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(19) int local19 = Static60.anIntArray122[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static85.anInt1910; local21++) {
				local11[local21] = this.method4161(Static273.anIntArray414[local21], local19) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(III)I")
	private int method4161(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(23) int local23 = local9 ^ local9 << 1;
		return 4096 - (local23 * (local23 * local23 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
