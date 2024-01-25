import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class6_Sub1_Sub14 extends Class6_Sub1 {

	@OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
	private int anInt3720 = 1;

	@OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
	private int anInt3722 = 1;

	@OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
	private int anInt3726 = 204;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			for (@Pc(22) int local22 = 0; local22 < Static479.anInt8231; local22++) {
				@Pc(28) int local28 = Static205.anIntArray199[local22];
				@Pc(32) int local32 = Static230.anIntArray222[arg0];
				@Pc(39) int local39 = this.anInt3722 * local28 >> 12;
				@Pc(46) int local46 = local32 * this.anInt3720 >> 12;
				@Pc(56) int local56 = this.anInt3722 * (local28 % (4096 / this.anInt3722));
				@Pc(66) int local66 = local32 % (4096 / this.anInt3720) * this.anInt3720;
				if (local66 < this.anInt3726) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (this.anInt3726 > local56) {
						local11[local22] = 0;
						continue;
					}
				}
				if (this.anInt3726 > local56) {
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

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3722 = arg0.method8374();
		} else if (arg1 == 1) {
			this.anInt3720 = arg0.method8374();
		} else if (arg1 == 2) {
			this.anInt3726 = arg0.method8363();
		}
	}
}
