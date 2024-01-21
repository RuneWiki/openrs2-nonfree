import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class1_Sub1_Sub25 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
	private int anInt2658;

	@OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
	private int anInt2663;

	@OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
	private int anInt2661;

	@OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
	private int anInt2664;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2663 = arg1.method1642();
		} else if (arg0 == 1) {
			this.anInt2658 = arg1.method1642();
		} else if (arg0 == 2) {
			this.anInt2664 = arg1.method1642();
		} else if (arg0 == 3) {
			this.anInt2661 = arg1.method1642();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			for (@Pc(24) int local24 = 0; local24 < Static65.anInt1933; local24++) {
				@Pc(38) int local38 = this.anInt2661 + (Static18.anIntArray101[arg0] << 12) / this.anInt2663;
				@Pc(50) int local50 = this.anInt2664 + (Static106.anIntArray284[local24] << 12) / this.anInt2663;
				@Pc(56) int local56 = local50;
				@Pc(58) int local58 = local38;
				@Pc(64) int local64 = local50 * local50 >> 12;
				@Pc(70) int local70 = local38 * local38 >> 12;
				@Pc(72) int local72 = 0;
				while (local70 + local64 < 16384 && local72 < this.anInt2658) {
					local58 = local38 + (local56 * local58 >> 12) * 2;
					local72++;
					local56 = local64 + local50 - local70;
					local64 = local56 * local56 >> 12;
					local70 = local58 * local58 >> 12;
				}
				local7[local24] = this.anInt2658 - 1 > local72 ? (local72 << 12) / this.anInt2658 : 0;
			}
		}
		return local7;
	}
}
