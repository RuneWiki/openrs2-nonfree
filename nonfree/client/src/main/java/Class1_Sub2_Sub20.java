import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class1_Sub2_Sub20 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
	private int anInt2263;

	@OriginalMember(owner = "client!kb", name = "kb", descriptor = "I")
	private int anInt2270;

	@OriginalMember(owner = "client!kb", name = "mb", descriptor = "I")
	private int anInt2271;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			for (@Pc(22) int local22 = 0; local22 < Static110.anInt2825; local22++) {
				@Pc(28) int local28 = Static86.anIntArray294[local22];
				@Pc(35) int local35 = local28 * this.anInt2263 >> 12;
				@Pc(39) int local39 = Static37.anIntArray125[arg0];
				@Pc(46) int local46 = local39 * this.anInt2270 >> 12;
				@Pc(56) int local56 = this.anInt2270 * (local39 % (4096 / this.anInt2270));
				@Pc(66) int local66 = local28 % (4096 / this.anInt2263) * this.anInt2263;
				if (local56 < this.anInt2271) {
					for (local35 -= local46; local35 < 0; local35 += 4) {
					}
					while (local35 > 3) {
						local35 -= 4;
					}
					if (local35 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (this.anInt2271 > local66) {
						local16[local22] = 0;
						continue;
					}
				}
				if (local66 < this.anInt2271) {
					for (local35 -= local46; local35 < 0; local35 += 4) {
					}
					while (local35 > 3) {
						local35 -= 4;
					}
					if (local35 > 0) {
						local16[local22] = 0;
						continue;
					}
				}
				local16[local22] = 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2263 = arg0.method861();
		} else if (arg1 == 1) {
			this.anInt2270 = arg0.method861();
		} else if (arg1 == 2) {
			this.anInt2271 = arg0.method878();
		}
	}
}
