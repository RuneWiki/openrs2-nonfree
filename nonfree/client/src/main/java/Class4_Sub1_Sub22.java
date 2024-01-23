import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class4_Sub1_Sub22 extends Class4_Sub1 {

	@OriginalMember(owner = "client!mm", name = "K", descriptor = "I")
	private int anInt3432 = 204;

	@OriginalMember(owner = "client!mm", name = "N", descriptor = "I")
	private int anInt3435 = 1;

	@OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
	private int anInt3436 = 1;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt3436 = arg1.method3110();
		} else if (arg0 == 1) {
			this.anInt3435 = arg1.method3110();
		} else if (arg0 == 2) {
			this.anInt3432 = arg1.method3085();
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			for (@Pc(14) int local14 = 0; local14 < Static68.anInt1753; local14++) {
				@Pc(25) int local25 = Static10.anIntArray7[arg0];
				@Pc(29) int local29 = Static94.anIntArray163[local14];
				@Pc(36) int local36 = this.anInt3436 * local29 >> 12;
				@Pc(43) int local43 = local25 * this.anInt3435 >> 12;
				@Pc(53) int local53 = this.anInt3436 * (local29 % (4096 / this.anInt3436));
				@Pc(63) int local63 = this.anInt3435 * (local25 % (4096 / this.anInt3435));
				if (this.anInt3432 > local63) {
					for (local36 -= local43; local36 < 0; local36 += 4) {
					}
					while (local36 > 3) {
						local36 -= 4;
					}
					if (local36 != 1) {
						local7[local14] = 0;
						continue;
					}
					if (local53 < this.anInt3432) {
						local7[local14] = 0;
						continue;
					}
				}
				if (local53 < this.anInt3432) {
					for (local36 -= local43; local36 < 0; local36 += 4) {
					}
					while (local36 > 3) {
						local36 -= 4;
					}
					if (local36 > 0) {
						local7[local14] = 0;
						continue;
					}
				}
				local7[local14] = 4096;
			}
		}
		return local7;
	}
}
