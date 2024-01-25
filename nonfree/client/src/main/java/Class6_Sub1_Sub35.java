import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uda")
public final class Class6_Sub1_Sub35 extends Class6_Sub1 {

	@OriginalMember(owner = "client!uda", name = "D", descriptor = "I")
	private int anInt9685 = 585;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(27) int local27 = Static230.anIntArray222[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static479.anInt8231; local29++) {
				@Pc(35) int local35 = Static205.anIntArray199[local29];
				@Pc(77) int local77;
				if (this.anInt9685 < local35 && 4096 - this.anInt9685 > local35 && local27 > 2048 - this.anInt9685 && this.anInt9685 + 2048 > local27) {
					local77 = 2048 - local35;
					local77 = local77 < 0 ? -local77 : local77;
					local77 <<= 0xC;
					local77 /= 2048 - this.anInt9685;
					local19[local29] = 4096 - local77;
				} else if (local35 > 2048 - this.anInt9685 && this.anInt9685 + 2048 > local35) {
					local77 = local27 - 2048;
					local77 = local77 < 0 ? -local77 : local77;
					local77 -= this.anInt9685;
					local77 <<= 0xC;
					local19[local29] = local77 / (2048 - this.anInt9685);
				} else if (local27 < this.anInt9685 || local27 > 4096 - this.anInt9685) {
					local77 = local35 - 2048;
					@Pc(182) int local182 = local77 < 0 ? -local77 : local77;
					@Pc(187) int local187 = local182 - this.anInt9685;
					@Pc(191) int local191 = local187 << 12;
					local19[local29] = local191 / (2048 - this.anInt9685);
				} else if (local35 >= this.anInt9685 && local35 <= 4096 - this.anInt9685) {
					local19[local29] = 0;
				} else {
					local77 = 2048 - local27;
					local77 = local77 >= 0 ? local77 : -local77;
					local77 <<= 0xC;
					local77 /= 2048 - this.anInt9685;
					local19[local29] = 4096 - local77;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9685 = arg0.method8363();
		}
	}
}
