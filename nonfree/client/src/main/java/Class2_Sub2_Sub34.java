import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class2_Sub2_Sub34 extends Class2_Sub2 {

	@OriginalMember(owner = "client!th", name = "S", descriptor = "I")
	private int anInt4294 = 1;

	@OriginalMember(owner = "client!th", name = "W", descriptor = "I")
	private int anInt4296 = 204;

	@OriginalMember(owner = "client!th", name = "Z", descriptor = "I")
	private int anInt4299 = 1;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt4294 = arg1.method218();
		} else if (arg0 == 1) {
			this.anInt4299 = arg1.method218();
		} else if (arg0 == 2) {
			this.anInt4296 = arg1.method234();
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			for (@Pc(22) int local22 = 0; local22 < Static106.anInt3045; local22++) {
				@Pc(28) int local28 = Static160.anIntArray187[arg0];
				@Pc(32) int local32 = Static15.anIntArray41[local22];
				@Pc(39) int local39 = local32 * this.anInt4294 >> 12;
				@Pc(46) int local46 = this.anInt4299 * local28 >> 12;
				@Pc(56) int local56 = local32 % (4096 / this.anInt4294) * this.anInt4294;
				@Pc(66) int local66 = local28 % (4096 / this.anInt4299) * this.anInt4299;
				if (this.anInt4296 > local66) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local7[local22] = 0;
						continue;
					}
					if (local56 < this.anInt4296) {
						local7[local22] = 0;
						continue;
					}
				}
				if (this.anInt4296 > local56) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 > 0) {
						local7[local22] = 0;
						continue;
					}
				}
				local7[local22] = 4096;
			}
		}
		return local7;
	}
}
