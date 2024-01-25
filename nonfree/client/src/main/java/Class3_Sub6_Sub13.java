import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class3_Sub6_Sub13 extends Class3_Sub6 {

	@OriginalMember(owner = "client!gaa", name = "D", descriptor = "I")
	private int anInt3314 = 1;

	@OriginalMember(owner = "client!gaa", name = "B", descriptor = "I")
	private int anInt3312 = 204;

	@OriginalMember(owner = "client!gaa", name = "C", descriptor = "I")
	private int anInt3313 = 1;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			for (@Pc(22) int local22 = 0; local22 < Static521.anInt8383; local22++) {
				@Pc(28) int local28 = Static73.anIntArray76[local22];
				@Pc(32) int local32 = Static525.anIntArray553[arg0];
				@Pc(39) int local39 = local28 * this.anInt3314 >> 12;
				@Pc(46) int local46 = local32 * this.anInt3313 >> 12;
				@Pc(56) int local56 = local28 % (4096 / this.anInt3314) * this.anInt3314;
				@Pc(66) int local66 = this.anInt3313 * (local32 % (4096 / this.anInt3313));
				if (local66 < this.anInt3312) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (this.anInt3312 > local56) {
						local16[local22] = 0;
						continue;
					}
				}
				if (this.anInt3312 > local56) {
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

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3314 = arg0.method5175();
		} else if (arg1 == 1) {
			this.anInt3313 = arg0.method5175();
		} else if (arg1 == 2) {
			this.anInt3312 = arg0.method5198();
		}
	}
}
