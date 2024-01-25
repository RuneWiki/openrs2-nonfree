import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class1_Sub3_Sub23 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ng", name = "N", descriptor = "I")
	private int anInt6063 = 585;

	static {
		new Class45("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(27) int local27 = Static392.anIntArray673[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static254.anInt4973; local29++) {
				@Pc(35) int local35 = Static457.anIntArray732[local29];
				@Pc(72) int local72;
				if (local35 > this.anInt6063 && local35 < 4096 - this.anInt6063 && local27 > 2048 - this.anInt6063 && this.anInt6063 + 2048 > local27) {
					local72 = 2048 - local35;
					local72 = local72 < 0 ? -local72 : local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt6063;
					local19[local29] = 4096 - local72;
				} else if (2048 - this.anInt6063 < local35 && local35 < this.anInt6063 + 2048) {
					local72 = local27 - 2048;
					local72 = local72 < 0 ? -local72 : local72;
					local72 -= this.anInt6063;
					local72 <<= 0xC;
					local19[local29] = local72 / (2048 - this.anInt6063);
				} else if (local27 < this.anInt6063 || local27 > 4096 - this.anInt6063) {
					local72 = local35 - 2048;
					@Pc(187) int local187 = local72 < 0 ? -local72 : local72;
					@Pc(192) int local192 = local187 - this.anInt6063;
					@Pc(196) int local196 = local192 << 12;
					local19[local29] = local196 / (2048 - this.anInt6063);
				} else if (local35 >= this.anInt6063 && 4096 - this.anInt6063 >= local35) {
					local19[local29] = 0;
				} else {
					local72 = 2048 - local27;
					local72 = local72 < 0 ? -local72 : local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt6063;
					local19[local29] = 4096 - local72;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt6063 = arg1.method4494();
		}
	}
}
