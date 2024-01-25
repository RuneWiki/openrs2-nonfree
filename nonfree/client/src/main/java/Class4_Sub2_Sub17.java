import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class4_Sub2_Sub17 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ip", name = "I", descriptor = "I")
	private int anInt3260 = 204;

	@OriginalMember(owner = "client!ip", name = "L", descriptor = "I")
	private int anInt3262 = 1;

	@OriginalMember(owner = "client!ip", name = "M", descriptor = "I")
	private int anInt3263 = 1;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt3262 = arg1.method4864();
		} else if (arg0 == 1) {
			this.anInt3263 = arg1.method4864();
		} else if (arg0 == 2) {
			this.anInt3260 = arg1.method4877();
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			for (@Pc(22) int local22 = 0; local22 < Static350.anInt6330; local22++) {
				@Pc(28) int local28 = Static197.anIntArray566[local22];
				@Pc(32) int local32 = Static293.anIntArray461[arg0];
				@Pc(39) int local39 = local28 * this.anInt3262 >> 12;
				@Pc(46) int local46 = this.anInt3263 * local32 >> 12;
				@Pc(56) int local56 = local28 % (4096 / this.anInt3262) * this.anInt3262;
				@Pc(66) int local66 = this.anInt3263 * (local32 % (4096 / this.anInt3263));
				if (local66 < this.anInt3260) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (this.anInt3260 > local56) {
						local16[local22] = 0;
						continue;
					}
				}
				if (this.anInt3260 > local56) {
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
