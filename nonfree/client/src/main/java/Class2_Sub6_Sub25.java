import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class2_Sub6_Sub25 extends Class2_Sub6 {

	@OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
	private int anInt7497 = 585;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt7497 = arg1.method8546();
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(19) int local19 = Static564.anIntArray630[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static51.anInt1085; local21++) {
				@Pc(27) int local27 = Static586.anIntArray653[local21];
				@Pc(60) int local60;
				if (this.anInt7497 < local27 && local27 < 4096 - this.anInt7497 && local19 > 2048 - this.anInt7497 && this.anInt7497 + 2048 > local19) {
					local60 = 2048 - local27;
					local60 = local60 >= 0 ? local60 : -local60;
					local60 <<= 0xC;
					local60 /= 2048 - this.anInt7497;
					local11[local21] = 4096 - local60;
				} else if (2048 - this.anInt7497 < local27 && local27 < this.anInt7497 + 2048) {
					local60 = local19 - 2048;
					local60 = local60 < 0 ? -local60 : local60;
					local60 -= this.anInt7497;
					local60 <<= 0xC;
					local11[local21] = local60 / (2048 - this.anInt7497);
				} else if (this.anInt7497 > local19 || 4096 - this.anInt7497 < local19) {
					local60 = local27 - 2048;
					@Pc(161) int local161 = local60 >= 0 ? local60 : -local60;
					@Pc(166) int local166 = local161 - this.anInt7497;
					@Pc(170) int local170 = local166 << 12;
					local11[local21] = local170 / (2048 - this.anInt7497);
				} else if (local27 >= this.anInt7497 && 4096 - this.anInt7497 >= local27) {
					local11[local21] = 0;
				} else {
					local60 = 2048 - local19;
					local60 = local60 >= 0 ? local60 : -local60;
					local60 <<= 0xC;
					local60 /= 2048 - this.anInt7497;
					local11[local21] = 4096 - local60;
				}
			}
		}
		return local11;
	}
}
