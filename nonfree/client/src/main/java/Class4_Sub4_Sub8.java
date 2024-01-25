import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fga")
public final class Class4_Sub4_Sub8 extends Class4_Sub4 {

	@OriginalMember(owner = "client!fga", name = "H", descriptor = "I")
	private int anInt3183 = 204;

	@OriginalMember(owner = "client!fga", name = "K", descriptor = "I")
	private int anInt3185 = 1;

	@OriginalMember(owner = "client!fga", name = "O", descriptor = "I")
	private int anInt3189 = 1;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			for (@Pc(19) int local19 = 0; local19 < Static560.anInt9394; local19++) {
				@Pc(25) int local25 = Static80.anIntArray212[local19];
				@Pc(29) int local29 = Static450.anIntArray619[arg0];
				@Pc(36) int local36 = this.anInt3189 * local25 >> 12;
				@Pc(43) int local43 = local29 * this.anInt3185 >> 12;
				@Pc(53) int local53 = local25 % (4096 / this.anInt3189) * this.anInt3189;
				@Pc(63) int local63 = this.anInt3185 * (local29 % (4096 / this.anInt3185));
				if (this.anInt3183 > local63) {
					for (local36 -= local43; local36 < 0; local36 += 4) {
					}
					while (local36 > 3) {
						local36 -= 4;
					}
					if (local36 != 1) {
						local13[local19] = 0;
						continue;
					}
					if (this.anInt3183 > local53) {
						local13[local19] = 0;
						continue;
					}
				}
				if (this.anInt3183 > local53) {
					for (local36 -= local43; local36 < 0; local36 += 4) {
					}
					while (local36 > 3) {
						local36 -= 4;
					}
					if (local36 > 0) {
						local13[local19] = 0;
						continue;
					}
				}
				local13[local19] = 4096;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt3189 = arg1.method6015();
		} else if (arg0 == 1) {
			this.anInt3185 = arg1.method6015();
		} else if (arg0 == 2) {
			this.anInt3183 = arg1.method5982();
		}
	}
}
