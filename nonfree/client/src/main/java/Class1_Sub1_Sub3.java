import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
	private int anInt154 = 1;

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
	private int anInt153 = 1;

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
	private int anInt149 = 204;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			for (@Pc(22) int local22 = 0; local22 < Static85.anInt1910; local22++) {
				@Pc(28) int local28 = Static273.anIntArray414[local22];
				@Pc(32) int local32 = Static60.anIntArray122[arg0];
				@Pc(39) int local39 = this.anInt153 * local28 >> 12;
				@Pc(46) int local46 = this.anInt154 * local32 >> 12;
				@Pc(56) int local56 = local28 % (4096 / this.anInt153) * this.anInt153;
				@Pc(66) int local66 = local32 % (4096 / this.anInt154) * this.anInt154;
				if (this.anInt149 > local66) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (local56 < this.anInt149) {
						local11[local22] = 0;
						continue;
					}
				}
				if (this.anInt149 > local56) {
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

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt153 = arg1.method2132();
		} else if (arg0 == 1) {
			this.anInt154 = arg1.method2132();
		} else if (arg0 == 2) {
			this.anInt149 = arg1.method2161();
		}
	}
}
