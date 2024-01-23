import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class2_Sub1_Sub34 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(19) int local19 = Static97.anIntArray240[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static62.anInt1675; local21++) {
				local11[local21] = this.method2926(local19, Static20.anIntArray45[local21]) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIB)I")
	private int method2926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 + arg0 * 57;
		@Pc(20) int local20 = local14 ^ local14 << 1;
		return 4096 - ((local20 * 15731 * local20 + 789221) * local20 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
