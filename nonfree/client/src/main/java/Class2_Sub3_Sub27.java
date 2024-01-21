import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class2_Sub3_Sub27 extends Class2_Sub3 {

	@OriginalMember(owner = "client!t", name = "kb", descriptor = "I")
	private int anInt3475;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(19) int local19 = Static21.anIntArray50[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static54.anInt1423; local21++) {
				@Pc(27) int local27 = Static36.anIntArray74[local21];
				@Pc(71) int local71;
				if (local27 > this.anInt3475 && local27 < 4096 - this.anInt3475 && local19 > 2048 - this.anInt3475 && local19 < this.anInt3475 + 2048) {
					local71 = 2048 - local27;
					local71 = local71 >= 0 ? local71 : -local71;
					local71 <<= 0xC;
					local71 /= 2048 - this.anInt3475;
					local11[local21] = 4096 - local71;
				} else if (local27 > 2048 - this.anInt3475 && this.anInt3475 + 2048 > local27) {
					local71 = local19 - 2048;
					local71 = local71 >= 0 ? local71 : -local71;
					local71 -= this.anInt3475;
					local71 <<= 0xC;
					local11[local21] = local71 / (2048 - this.anInt3475);
				} else if (this.anInt3475 > local19 || local19 > 4096 - this.anInt3475) {
					local71 = local27 - 2048;
					@Pc(179) int local179 = local71 < 0 ? -local71 : local71;
					@Pc(184) int local184 = local179 - this.anInt3475;
					@Pc(188) int local188 = local184 << 12;
					local11[local21] = local188 / (2048 - this.anInt3475);
				} else if (local27 >= this.anInt3475 && 4096 - this.anInt3475 >= local27) {
					local11[local21] = 0;
				} else {
					local71 = 2048 - local19;
					local71 = local71 >= 0 ? local71 : -local71;
					local71 <<= 0xC;
					local71 /= 2048 - this.anInt3475;
					local11[local21] = 4096 - local71;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3475 = arg1.method1680();
		}
	}
}
