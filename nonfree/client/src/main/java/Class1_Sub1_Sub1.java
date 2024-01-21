import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!a", name = "S", descriptor = "I")
	private int anInt56;

	@OriginalMember(owner = "client!a", name = "R", descriptor = "I")
	private int anInt55;

	@OriginalMember(owner = "client!a", name = "W", descriptor = "I")
	private int anInt60;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt56 = arg1.method1607();
		} else if (arg0 == 1) {
			this.anInt60 = arg1.method1607();
		} else if (arg0 == 2) {
			this.anInt55 = arg1.method1642();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			for (@Pc(22) int local22 = 0; local22 < Static65.anInt1933; local22++) {
				@Pc(28) int local28 = Static18.anIntArray101[arg0];
				@Pc(32) int local32 = Static106.anIntArray284[local22];
				@Pc(39) int local39 = this.anInt56 * local32 >> 12;
				@Pc(49) int local49 = local28 % (4096 / this.anInt60) * this.anInt60;
				@Pc(56) int local56 = local28 * this.anInt60 >> 12;
				@Pc(66) int local66 = this.anInt56 * (local32 % (4096 / this.anInt56));
				if (this.anInt55 > local49) {
					for (local39 -= local56; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (this.anInt55 > local66) {
						local16[local22] = 0;
						continue;
					}
				}
				if (local66 < this.anInt55) {
					for (local39 -= local56; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 > 0) {
						local16[local22] = 0;
						continue;
					}
				}
				local16[local22] = 4096;
			}
		}
		return local16;
	}
}
