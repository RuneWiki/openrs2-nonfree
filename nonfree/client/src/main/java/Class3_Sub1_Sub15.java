import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class3_Sub1_Sub15 extends Class3_Sub1 {

	@OriginalMember(owner = "client!jf", name = "V", descriptor = "I")
	private int anInt1929;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(19) int local19 = Static125.anIntArray336[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static141.anInt3261; local21++) {
				@Pc(27) int local27 = Static85.anIntArray47[local21];
				@Pc(67) int local67;
				if (this.anInt1929 < local27 && 4096 - this.anInt1929 > local27 && local19 > 2048 - this.anInt1929 && this.anInt1929 + 2048 > local19) {
					local67 = 2048 - local27;
					local67 = local67 < 0 ? -local67 : local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt1929;
					local11[local21] = 4096 - local67;
				} else if (2048 - this.anInt1929 < local27 && this.anInt1929 + 2048 > local27) {
					local67 = local19 - 2048;
					local67 = local67 >= 0 ? local67 : -local67;
					local67 -= this.anInt1929;
					local67 <<= 0xC;
					local11[local21] = local67 / (2048 - this.anInt1929);
				} else if (local19 < this.anInt1929 || 4096 - this.anInt1929 < local19) {
					local67 = local27 - 2048;
					@Pc(167) int local167 = local67 < 0 ? -local67 : local67;
					@Pc(172) int local172 = local167 - this.anInt1929;
					@Pc(176) int local176 = local172 << 12;
					local11[local21] = local176 / (2048 - this.anInt1929);
				} else if (this.anInt1929 <= local27 && 4096 - this.anInt1929 >= local27) {
					local11[local21] = 0;
				} else {
					local67 = 2048 - local19;
					local67 = local67 < 0 ? -local67 : local67;
					local67 <<= 0xC;
					local67 /= 2048 - this.anInt1929;
					local11[local21] = 4096 - local67;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt1929 = arg1.method208();
		}
	}
}
