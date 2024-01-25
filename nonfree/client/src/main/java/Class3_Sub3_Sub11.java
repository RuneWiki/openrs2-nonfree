import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class3_Sub3_Sub11 extends Class3_Sub3 {

	@OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
	private int anInt1788 = 204;

	@OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
	private int anInt1793 = 1;

	@OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
	private int anInt1792 = 1;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1793 = arg0.method3643();
		} else if (arg1 == 1) {
			this.anInt1792 = arg0.method3643();
		} else if (arg1 == 2) {
			this.anInt1788 = arg0.method3649();
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			for (@Pc(22) int local22 = 0; local22 < Static131.anInt2755; local22++) {
				@Pc(28) int local28 = Static151.anIntArray211[local22];
				@Pc(32) int local32 = Static269.anIntArray433[arg0];
				@Pc(39) int local39 = this.anInt1793 * local28 >> 12;
				@Pc(46) int local46 = local32 * this.anInt1792 >> 12;
				@Pc(56) int local56 = this.anInt1793 * (local28 % (4096 / this.anInt1793));
				@Pc(66) int local66 = this.anInt1792 * (local32 % (4096 / this.anInt1792));
				if (local66 < this.anInt1788) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (local56 < this.anInt1788) {
						local16[local22] = 0;
						continue;
					}
				}
				if (this.anInt1788 > local56) {
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
}
