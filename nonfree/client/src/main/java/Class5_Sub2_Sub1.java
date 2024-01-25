import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class5_Sub2_Sub1 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
	private int anInt244 = 1;

	@OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
	private int anInt248 = 204;

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
	private int anInt249 = 1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			for (@Pc(22) int local22 = 0; local22 < Static15.anInt493; local22++) {
				@Pc(28) int local28 = Static257.anIntArray386[local22];
				@Pc(32) int local32 = Static287.anIntArray413[arg0];
				@Pc(39) int local39 = this.anInt244 * local28 >> 12;
				@Pc(46) int local46 = local32 * this.anInt249 >> 12;
				@Pc(56) int local56 = local28 % (4096 / this.anInt244) * this.anInt244;
				@Pc(66) int local66 = local32 % (4096 / this.anInt249) * this.anInt249;
				if (this.anInt248 > local66) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (this.anInt248 > local56) {
						local16[local22] = 0;
						continue;
					}
				}
				if (local56 < this.anInt248) {
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

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt244 = arg0.method1832();
		} else if (arg1 == 1) {
			this.anInt249 = arg0.method1832();
		} else if (arg1 == 2) {
			this.anInt248 = arg0.method1845();
		}
	}
}
