import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class2_Sub10_Sub12 extends Class2_Sub10 {

	@OriginalMember(owner = "client!hf", name = "E", descriptor = "I")
	private int anInt4329 = 585;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4329 = arg0.method6884();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(19) int local19 = Static353.anIntArray424[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static93.anInt1862; local21++) {
				@Pc(27) int local27 = Static561.anIntArray649[local21];
				@Pc(60) int local60;
				if (this.anInt4329 < local27 && local27 < 4096 - this.anInt4329 && local19 > 2048 - this.anInt4329 && this.anInt4329 + 2048 > local19) {
					local60 = 2048 - local27;
					local60 = local60 >= 0 ? local60 : -local60;
					local60 <<= 0xC;
					local60 /= 2048 - this.anInt4329;
					local11[local21] = 4096 - local60;
				} else if (2048 - this.anInt4329 < local27 && local27 < this.anInt4329 + 2048) {
					local60 = local19 - 2048;
					local60 = local60 >= 0 ? local60 : -local60;
					local60 -= this.anInt4329;
					local60 <<= 0xC;
					local11[local21] = local60 / (2048 - this.anInt4329);
				} else if (this.anInt4329 > local19 || 4096 - this.anInt4329 < local19) {
					local60 = local27 - 2048;
					@Pc(168) int local168 = local60 >= 0 ? local60 : -local60;
					@Pc(173) int local173 = local168 - this.anInt4329;
					@Pc(177) int local177 = local173 << 12;
					local11[local21] = local177 / (2048 - this.anInt4329);
				} else if (this.anInt4329 <= local27 && local27 <= 4096 - this.anInt4329) {
					local11[local21] = 0;
				} else {
					local60 = 2048 - local19;
					local60 = local60 < 0 ? -local60 : local60;
					local60 <<= 0xC;
					local60 /= 2048 - this.anInt4329;
					local11[local21] = 4096 - local60;
				}
			}
		}
		return local11;
	}
}
