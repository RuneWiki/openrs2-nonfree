import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class6_Sub1_Sub22 extends Class6_Sub1 {

	@OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
	private int anInt3637 = 204;

	@OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
	private int anInt3634 = 1;

	@OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
	private int anInt3641 = 1;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			for (@Pc(23) int local23 = 0; local23 < Static299.anInt5659; local23++) {
				@Pc(29) int local29 = Static18.anIntArray32[local23];
				@Pc(33) int local33 = Static273.anIntArray703[arg0];
				@Pc(40) int local40 = local29 * this.anInt3634 >> 12;
				@Pc(47) int local47 = this.anInt3641 * local33 >> 12;
				@Pc(57) int local57 = local29 % (4096 / this.anInt3634) * this.anInt3634;
				@Pc(67) int local67 = this.anInt3641 * (local33 % (4096 / this.anInt3641));
				if (this.anInt3637 > local67) {
					for (local40 -= local47; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 != 1) {
						local17[local23] = 0;
						continue;
					}
					if (local57 < this.anInt3637) {
						local17[local23] = 0;
						continue;
					}
				}
				if (local57 < this.anInt3637) {
					for (local40 -= local47; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 > 0) {
						local17[local23] = 0;
						continue;
					}
				}
				local17[local23] = 4096;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3634 = arg0.method3972();
		} else if (arg1 == 1) {
			this.anInt3641 = arg0.method3972();
		} else if (arg1 == 2) {
			this.anInt3637 = arg0.method4021();
		}
	}
}
