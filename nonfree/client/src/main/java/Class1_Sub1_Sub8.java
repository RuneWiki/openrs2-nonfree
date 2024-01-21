import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(20) int local20 = Static18.anIntArray101[arg0];
			for (@Pc(22) int local22 = 0; local22 < Static65.anInt1933; local22++) {
				local12[local22] = this.method1046(local20, Static106.anIntArray284[local22]) % 4096;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIB)I")
	private int method1046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 ^ local9 << 1;
		return 4096 - ((local15 * local15 * 15731 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
