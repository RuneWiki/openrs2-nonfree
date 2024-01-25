import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aia")
public final class Class2_Sub4_Sub1 extends Class2_Sub4 {

	@OriginalMember(owner = "client!aia", name = "E", descriptor = "I")
	private int anInt315 = 204;

	@OriginalMember(owner = "client!aia", name = "H", descriptor = "I")
	private int anInt317 = 1;

	@OriginalMember(owner = "client!aia", name = "K", descriptor = "I")
	private int anInt319 = 1;

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			for (@Pc(22) int local22 = 0; local22 < Static395.anInt6816; local22++) {
				@Pc(28) int local28 = Static20.anIntArray40[local22];
				@Pc(32) int local32 = Static415.anIntArray482[arg0];
				@Pc(39) int local39 = local28 * this.anInt317 >> 12;
				@Pc(46) int local46 = local32 * this.anInt319 >> 12;
				@Pc(56) int local56 = this.anInt317 * (local28 % (4096 / this.anInt317));
				@Pc(66) int local66 = local32 % (4096 / this.anInt319) * this.anInt319;
				if (this.anInt315 > local66) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (this.anInt315 > local56) {
						local16[local22] = 0;
						continue;
					}
				}
				if (local56 < this.anInt315) {
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

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt317 = arg0.method2859();
		} else if (arg1 == 1) {
			this.anInt319 = arg0.method2859();
		} else if (arg1 == 2) {
			this.anInt315 = arg0.method2825();
		}
	}
}
