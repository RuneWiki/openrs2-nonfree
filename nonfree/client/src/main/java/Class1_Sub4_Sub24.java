import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class1_Sub4_Sub24 extends Class1_Sub4 {

	@OriginalMember(owner = "client!qh", name = "Z", descriptor = "I")
	private int anInt3749;

	@OriginalMember(owner = "client!qh", name = "ib", descriptor = "I")
	private int anInt3756;

	@OriginalMember(owner = "client!qh", name = "gb", descriptor = "I")
	private int anInt3754;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3754 = arg0.method544();
		} else if (arg1 == 1) {
			this.anInt3749 = arg0.method544();
		} else if (arg1 == 2) {
			this.anInt3756 = arg0.method546();
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			for (@Pc(19) int local19 = 0; local19 < Static73.anInt1888; local19++) {
				@Pc(25) int local25 = Static150.anIntArray383[arg0];
				@Pc(29) int local29 = Static171.anIntArray421[local19];
				@Pc(36) int local36 = local25 * this.anInt3749 >> 12;
				@Pc(46) int local46 = local29 % (4096 / this.anInt3754) * this.anInt3754;
				@Pc(53) int local53 = this.anInt3754 * local29 >> 12;
				@Pc(63) int local63 = local25 % (4096 / this.anInt3749) * this.anInt3749;
				if (local63 < this.anInt3756) {
					for (local53 -= local36; local53 < 0; local53 += 4) {
					}
					while (local53 > 3) {
						local53 -= 4;
					}
					if (local53 != 1) {
						local13[local19] = 0;
						continue;
					}
					if (this.anInt3756 > local46) {
						local13[local19] = 0;
						continue;
					}
				}
				if (this.anInt3756 > local46) {
					for (local53 -= local36; local53 < 0; local53 += 4) {
					}
					while (local53 > 3) {
						local53 -= 4;
					}
					if (local53 > 0) {
						local13[local19] = 0;
						continue;
					}
				}
				local13[local19] = 4096;
			}
		}
		return local13;
	}
}
