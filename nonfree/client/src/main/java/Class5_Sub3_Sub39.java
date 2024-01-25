import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class5_Sub3_Sub39 extends Class5_Sub3 {

	@OriginalMember(owner = "client!wm", name = "O", descriptor = "I")
	private int anInt6811 = 204;

	@OriginalMember(owner = "client!wm", name = "T", descriptor = "I")
	private int anInt6815 = 1;

	@OriginalMember(owner = "client!wm", name = "Q", descriptor = "I")
	private int anInt6813 = 1;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			for (@Pc(22) int local22 = 0; local22 < Static7.anInt129; local22++) {
				@Pc(28) int local28 = Static164.anIntArray337[local22];
				@Pc(32) int local32 = Static345.anIntArray627[arg0];
				@Pc(39) int local39 = local28 * this.anInt6813 >> 12;
				@Pc(46) int local46 = local32 * this.anInt6815 >> 12;
				@Pc(56) int local56 = local28 % (4096 / this.anInt6813) * this.anInt6813;
				@Pc(66) int local66 = local32 % (4096 / this.anInt6815) * this.anInt6815;
				if (local66 < this.anInt6811) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (this.anInt6811 > local56) {
						local16[local22] = 0;
						continue;
					}
				}
				if (local56 < this.anInt6811) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
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

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6813 = arg0.method5115();
		} else if (arg1 == 1) {
			this.anInt6815 = arg0.method5115();
		} else if (arg1 == 2) {
			this.anInt6811 = arg0.method5106();
		}
	}
}
