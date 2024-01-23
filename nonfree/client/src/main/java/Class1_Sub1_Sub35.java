import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class1_Sub1_Sub35 extends Class1_Sub1 {

	@OriginalMember(owner = "client!va", name = "U", descriptor = "I")
	private int anInt4734 = 1;

	@OriginalMember(owner = "client!va", name = "bb", descriptor = "I")
	private int anInt4739 = 204;

	@OriginalMember(owner = "client!va", name = "fb", descriptor = "I")
	private int anInt4742 = 1;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			for (@Pc(22) int local22 = 0; local22 < Static11.anInt294; local22++) {
				@Pc(28) int local28 = Static36.anIntArray81[local22];
				@Pc(35) int local35 = this.anInt4734 * local28 >> 12;
				@Pc(39) int local39 = Static187.anIntArray345[arg0];
				@Pc(46) int local46 = this.anInt4742 * local39 >> 12;
				@Pc(56) int local56 = local39 % (4096 / this.anInt4742) * this.anInt4742;
				@Pc(66) int local66 = local28 % (4096 / this.anInt4734) * this.anInt4734;
				if (local56 < this.anInt4739) {
					for (local35 -= local46; local35 < 0; local35 += 4) {
					}
					while (local35 > 3) {
						local35 -= 4;
					}
					if (local35 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (this.anInt4739 > local66) {
						local16[local22] = 0;
						continue;
					}
				}
				if (this.anInt4739 > local66) {
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

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4734 = arg0.method2945();
		} else if (arg1 == 1) {
			this.anInt4742 = arg0.method2945();
		} else if (arg1 == 2) {
			this.anInt4739 = arg0.method2964();
		}
	}
}
