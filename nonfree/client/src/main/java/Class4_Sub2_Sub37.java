import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class4_Sub2_Sub37 extends Class4_Sub2 {

	@OriginalMember(owner = "client!wd", name = "O", descriptor = "I")
	private int anInt10387 = 1;

	@OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
	private int anInt10388 = 204;

	@OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
	private int anInt10385 = 1;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			for (@Pc(22) int local22 = 0; local22 < Static417.anInt5248; local22++) {
				@Pc(28) int local28 = Static579.anIntArray585[local22];
				@Pc(32) int local32 = Static217.anIntArray501[arg0];
				@Pc(39) int local39 = this.anInt10385 * local28 >> 12;
				@Pc(46) int local46 = this.anInt10387 * local32 >> 12;
				@Pc(56) int local56 = this.anInt10385 * (local28 % (4096 / this.anInt10385));
				@Pc(66) int local66 = local32 % (4096 / this.anInt10387) * this.anInt10387;
				if (local66 < this.anInt10388) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (local56 < this.anInt10388) {
						local11[local22] = 0;
						continue;
					}
				}
				if (this.anInt10388 > local56) {
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

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10385 = arg0.method7004();
		} else if (arg1 == 1) {
			this.anInt10387 = arg0.method7004();
		} else if (arg1 == 2) {
			this.anInt10388 = arg0.method7054();
		}
	}
}
