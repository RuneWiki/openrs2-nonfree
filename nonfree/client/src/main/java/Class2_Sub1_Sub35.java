import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class2_Sub1_Sub35 extends Class2_Sub1 {

	@OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
	private int anInt4306 = 1;

	@OriginalMember(owner = "client!td", name = "fb", descriptor = "I")
	private int anInt4310 = 204;

	@OriginalMember(owner = "client!td", name = "T", descriptor = "I")
	private int anInt4302 = 1;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			for (@Pc(22) int local22 = 0; local22 < Static62.anInt1675; local22++) {
				@Pc(28) int local28 = Static20.anIntArray45[local22];
				@Pc(32) int local32 = Static97.anIntArray240[arg0];
				@Pc(39) int local39 = local28 * this.anInt4302 >> 12;
				@Pc(46) int local46 = this.anInt4306 * local32 >> 12;
				@Pc(56) int local56 = this.anInt4302 * (local28 % (4096 / this.anInt4302));
				@Pc(66) int local66 = local32 % (4096 / this.anInt4306) * this.anInt4306;
				if (local66 < this.anInt4310) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (local56 < this.anInt4310) {
						local11[local22] = 0;
						continue;
					}
				}
				if (this.anInt4310 > local56) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 > 0) {
						local11[local22] = 0;
						continue;
					}
				}
				local11[local22] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4302 = arg0.method209();
		} else if (arg1 == 1) {
			this.anInt4306 = arg0.method209();
		} else if (arg1 == 2) {
			this.anInt4310 = arg0.method163();
		}
	}
}
