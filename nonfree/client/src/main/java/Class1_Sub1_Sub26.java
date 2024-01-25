import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class1_Sub1_Sub26 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pw", name = "D", descriptor = "I")
	private int anInt7119 = 585;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt7119 = arg1.method4426();
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			@Pc(19) int local19 = Static337.anIntArray406[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static87.anInt1964; local21++) {
				@Pc(27) int local27 = Static436.anIntArray506[local21];
				@Pc(60) int local60;
				if (this.anInt7119 < local27 && 4096 - this.anInt7119 > local27 && 2048 - this.anInt7119 < local19 && this.anInt7119 + 2048 > local19) {
					local60 = 2048 - local27;
					local60 = local60 >= 0 ? local60 : -local60;
					local60 <<= 0xC;
					local60 /= 2048 - this.anInt7119;
					local11[local21] = 4096 - local60;
				} else if (local27 > 2048 - this.anInt7119 && local27 < this.anInt7119 + 2048) {
					local60 = local19 - 2048;
					local60 = local60 >= 0 ? local60 : -local60;
					local60 -= this.anInt7119;
					local60 <<= 0xC;
					local11[local21] = local60 / (2048 - this.anInt7119);
				} else if (local19 < this.anInt7119 || local19 > 4096 - this.anInt7119) {
					local60 = local27 - 2048;
					@Pc(166) int local166 = local60 < 0 ? -local60 : local60;
					@Pc(171) int local171 = local166 - this.anInt7119;
					@Pc(175) int local175 = local171 << 12;
					local11[local21] = local175 / (2048 - this.anInt7119);
				} else if (local27 >= this.anInt7119 && 4096 - this.anInt7119 >= local27) {
					local11[local21] = 0;
				} else {
					local60 = 2048 - local19;
					local60 = local60 >= 0 ? local60 : -local60;
					local60 <<= 0xC;
					local60 /= 2048 - this.anInt7119;
					local11[local21] = 4096 - local60;
				}
			}
		}
		return local11;
	}
}
