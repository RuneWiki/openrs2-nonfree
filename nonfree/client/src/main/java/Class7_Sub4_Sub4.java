import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class7_Sub4_Sub4 extends Class7_Sub4 {

	@OriginalMember(owner = "client!e", name = "O", descriptor = "I")
	private int anInt1663 = 585;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(19) int local19 = Static314.anIntArray756[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static201.anInt4174; local21++) {
				@Pc(27) int local27 = Static129.anIntArray375[local21];
				@Pc(63) int local63;
				if (local27 > this.anInt1663 && local27 < 4096 - this.anInt1663 && local19 > 2048 - this.anInt1663 && this.anInt1663 + 2048 > local19) {
					local63 = 2048 - local27;
					local63 = local63 >= 0 ? local63 : -local63;
					local63 <<= 0xC;
					local63 /= 2048 - this.anInt1663;
					local11[local21] = 4096 - local63;
				} else if (2048 - this.anInt1663 < local27 && local27 < this.anInt1663 + 2048) {
					local63 = local19 - 2048;
					local63 = local63 < 0 ? -local63 : local63;
					local63 -= this.anInt1663;
					local63 <<= 0xC;
					local11[local21] = local63 / (2048 - this.anInt1663);
				} else if (this.anInt1663 > local19 || 4096 - this.anInt1663 < local19) {
					local63 = local27 - 2048;
					@Pc(167) int local167 = local63 >= 0 ? local63 : -local63;
					@Pc(172) int local172 = local167 - this.anInt1663;
					@Pc(176) int local176 = local172 << 12;
					local11[local21] = local176 / (2048 - this.anInt1663);
				} else if (local27 >= this.anInt1663 && 4096 - this.anInt1663 >= local27) {
					local11[local21] = 0;
				} else {
					local63 = 2048 - local19;
					local63 = local63 < 0 ? -local63 : local63;
					local63 <<= 0xC;
					local63 /= 2048 - this.anInt1663;
					local11[local21] = 4096 - local63;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1663 = arg0.method2764();
		}
	}
}
