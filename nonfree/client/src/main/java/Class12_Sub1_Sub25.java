import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class12_Sub1_Sub25 extends Class12_Sub1 {

	@OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
	private int anInt7546 = 1;

	@OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
	private int anInt7547 = 1;

	@OriginalMember(owner = "client!qi", name = "S", descriptor = "I")
	private int anInt7551 = 204;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7547 = arg0.method5216();
		} else if (arg1 == 1) {
			this.anInt7546 = arg0.method5216();
		} else if (arg1 == 2) {
			this.anInt7551 = arg0.method5199();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			for (@Pc(22) int local22 = 0; local22 < Static357.anInt6670; local22++) {
				@Pc(28) int local28 = Static347.anIntArray455[local22];
				@Pc(32) int local32 = Static353.anIntArray458[arg0];
				@Pc(39) int local39 = this.anInt7547 * local28 >> 12;
				@Pc(46) int local46 = local32 * this.anInt7546 >> 12;
				@Pc(56) int local56 = local28 % (4096 / this.anInt7547) * this.anInt7547;
				@Pc(66) int local66 = local32 % (4096 / this.anInt7546) * this.anInt7546;
				if (local66 < this.anInt7551) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (this.anInt7551 > local56) {
						local11[local22] = 0;
						continue;
					}
				}
				if (this.anInt7551 > local56) {
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
