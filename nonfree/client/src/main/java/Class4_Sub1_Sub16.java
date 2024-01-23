import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class4_Sub1_Sub16 extends Class4_Sub1 {

	@OriginalMember(owner = "client!lf", name = "eb", descriptor = "I")
	private int anInt3124 = 585;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3124 = arg0.method4653();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(27) int local27 = Static237.anIntArray478[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static73.anInt1626; local29++) {
				@Pc(40) int local40 = Static138.anIntArray231[local29];
				@Pc(78) int local78;
				if (this.anInt3124 < local40 && 4096 - this.anInt3124 > local40 && local27 > 2048 - this.anInt3124 && this.anInt3124 + 2048 > local27) {
					local78 = 2048 - local40;
					local78 = local78 < 0 ? -local78 : local78;
					local78 <<= 0xC;
					local78 /= 2048 - this.anInt3124;
					local18[local29] = 4096 - local78;
				} else if (2048 - this.anInt3124 < local40 && this.anInt3124 + 2048 > local40) {
					local78 = local27 - 2048;
					local78 = local78 >= 0 ? local78 : -local78;
					local78 -= this.anInt3124;
					local78 <<= 0xC;
					local18[local29] = local78 / (2048 - this.anInt3124);
				} else if (local27 < this.anInt3124 || local27 > 4096 - this.anInt3124) {
					local78 = local40 - 2048;
					@Pc(190) int local190 = local78 < 0 ? -local78 : local78;
					@Pc(195) int local195 = local190 - this.anInt3124;
					@Pc(199) int local199 = local195 << 12;
					local18[local29] = local199 / (2048 - this.anInt3124);
				} else if (this.anInt3124 <= local40 && local40 <= 4096 - this.anInt3124) {
					local18[local29] = 0;
				} else {
					local78 = 2048 - local27;
					local78 = local78 < 0 ? -local78 : local78;
					local78 <<= 0xC;
					local78 /= 2048 - this.anInt3124;
					local18[local29] = 4096 - local78;
				}
			}
		}
		return local18;
	}
}
