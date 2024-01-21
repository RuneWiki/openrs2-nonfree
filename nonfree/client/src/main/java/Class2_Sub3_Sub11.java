import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class2_Sub3_Sub11 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!ee", name = "bb", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt1027 = arg1.method2962();
		} else if (arg0 == 1) {
			this.anInt1032 = arg1.method2962();
		} else if (arg0 == 2) {
			this.anInt1031 = arg1.method2933();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			for (@Pc(22) int local22 = 0; local22 < Static53.anInt1184; local22++) {
				@Pc(28) int local28 = Static43.anIntArray102[local22];
				@Pc(32) int local32 = Static50.anIntArray106[arg0];
				@Pc(39) int local39 = this.anInt1027 * local28 >> 12;
				@Pc(46) int local46 = this.anInt1032 * local32 >> 12;
				@Pc(56) int local56 = this.anInt1027 * (local28 % (4096 / this.anInt1027));
				@Pc(66) int local66 = this.anInt1032 * (local32 % (4096 / this.anInt1032));
				if (this.anInt1031 > local66) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (this.anInt1031 > local56) {
						local11[local22] = 0;
						continue;
					}
				}
				if (this.anInt1031 > local56) {
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
}
