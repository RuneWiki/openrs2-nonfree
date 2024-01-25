import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class3_Sub9_Sub10 extends Class3_Sub9 {

	@OriginalMember(owner = "client!eaa", name = "C", descriptor = "I")
	private int anInt2520 = 204;

	@OriginalMember(owner = "client!eaa", name = "E", descriptor = "I")
	private int anInt2521 = 1;

	@OriginalMember(owner = "client!eaa", name = "H", descriptor = "I")
	private int anInt2524 = 1;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			for (@Pc(17) int local17 = 0; local17 < Static62.anInt1251; local17++) {
				@Pc(23) int local23 = Static239.anIntArray394[local17];
				@Pc(27) int local27 = Static147.anIntArray259[arg0];
				@Pc(34) int local34 = local23 * this.anInt2521 >> 12;
				@Pc(41) int local41 = local27 * this.anInt2524 >> 12;
				@Pc(51) int local51 = this.anInt2521 * (local23 % (4096 / this.anInt2521));
				@Pc(61) int local61 = this.anInt2524 * (local27 % (4096 / this.anInt2524));
				if (this.anInt2520 > local61) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (local51 < this.anInt2520) {
						local11[local17] = 0;
						continue;
					}
				}
				if (this.anInt2520 > local51) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 > 0) {
						local11[local17] = 0;
						continue;
					}
				}
				local11[local17] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2521 = arg0.method8632();
		} else if (arg1 == 1) {
			this.anInt2524 = arg0.method8632();
		} else if (arg1 == 2) {
			this.anInt2520 = arg0.method8593();
		}
	}
}
