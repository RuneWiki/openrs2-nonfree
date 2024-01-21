import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class3_Sub5_Sub20 extends Class3_Sub5 {

	@OriginalMember(owner = "client!od", name = "M", descriptor = "I")
	private int anInt2776;

	@OriginalMember(owner = "client!od", name = "P", descriptor = "I")
	private int anInt2779;

	@OriginalMember(owner = "client!od", name = "T", descriptor = "I")
	private int anInt2783;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt2776 = arg1.method2107();
		} else if (arg0 == 1) {
			this.anInt2779 = arg1.method2107();
		} else if (arg0 == 2) {
			this.anInt2783 = arg1.method2111();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			for (@Pc(25) int local25 = 0; local25 < Static104.anInt2195; local25++) {
				@Pc(31) int local31 = Static124.anIntArray355[local25];
				@Pc(35) int local35 = Static94.anIntArray277[arg0];
				@Pc(42) int local42 = this.anInt2776 * local31 >> 12;
				@Pc(49) int local49 = local35 * this.anInt2779 >> 12;
				@Pc(59) int local59 = this.anInt2776 * (local31 % (4096 / this.anInt2776));
				@Pc(69) int local69 = local35 % (4096 / this.anInt2779) * this.anInt2779;
				if (local69 < this.anInt2783) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local11[local25] = 0;
						continue;
					}
					if (local59 < this.anInt2783) {
						local11[local25] = 0;
						continue;
					}
				}
				if (this.anInt2783 > local59) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 > 0) {
						local11[local25] = 0;
						continue;
					}
				}
				local11[local25] = 4096;
			}
		}
		return local11;
	}
}
