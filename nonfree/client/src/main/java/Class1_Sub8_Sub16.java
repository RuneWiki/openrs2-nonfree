import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class1_Sub8_Sub16 extends Class1_Sub8 {

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(19) int local19 = Static134.anIntArray308[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static18.anInt439; local21++) {
				local11[local21] = this.method3034(local19, Static198.anIntArray749[local21]) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(III)I")
	private int method3034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 << 1 ^ local14;
		return 4096 - (local20 * (local20 * 15731 * local20 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
