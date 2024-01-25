import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class1_Sub1_Sub23 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
	private int anInt4254 = 585;

	static {
		new Class106("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt4254 = arg1.method2161();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(19) int local19 = Static60.anIntArray122[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static85.anInt1910; local21++) {
				@Pc(27) int local27 = Static273.anIntArray414[local21];
				@Pc(66) int local66;
				if (this.anInt4254 < local27 && 4096 - this.anInt4254 > local27 && local19 > 2048 - this.anInt4254 && local19 < this.anInt4254 + 2048) {
					local66 = 2048 - local27;
					local66 = local66 >= 0 ? local66 : -local66;
					local66 <<= 0xC;
					local66 /= 2048 - this.anInt4254;
					local11[local21] = 4096 - local66;
				} else if (2048 - this.anInt4254 < local27 && local27 < this.anInt4254 + 2048) {
					local66 = local19 - 2048;
					local66 = local66 < 0 ? -local66 : local66;
					local66 -= this.anInt4254;
					local66 <<= 0xC;
					local11[local21] = local66 / (2048 - this.anInt4254);
				} else if (local19 < this.anInt4254 || local19 > 4096 - this.anInt4254) {
					local66 = local27 - 2048;
					@Pc(164) int local164 = local66 < 0 ? -local66 : local66;
					@Pc(169) int local169 = local164 - this.anInt4254;
					@Pc(173) int local173 = local169 << 12;
					local11[local21] = local173 / (2048 - this.anInt4254);
				} else if (local27 >= this.anInt4254 && local27 <= 4096 - this.anInt4254) {
					local11[local21] = 0;
				} else {
					local66 = 2048 - local19;
					local66 = local66 < 0 ? -local66 : local66;
					local66 <<= 0xC;
					local66 /= 2048 - this.anInt4254;
					local11[local21] = 4096 - local66;
				}
			}
		}
		return local11;
	}
}
