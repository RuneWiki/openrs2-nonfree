import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class8_Sub2_Sub27 extends Class8_Sub2 {

	@OriginalMember(owner = "client!nn", name = "F", descriptor = "I")
	private int anInt7075 = 585;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt7075 = arg1.method8578();
		}
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(27) int local27 = Static426.anIntArray424[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static538.anInt9297; local29++) {
				@Pc(35) int local35 = Static93.anIntArray111[local29];
				@Pc(70) int local70;
				if (this.anInt7075 < local35 && 4096 - this.anInt7075 > local35 && local27 > 2048 - this.anInt7075 && local27 < this.anInt7075 + 2048) {
					local70 = 2048 - local35;
					local70 = local70 >= 0 ? local70 : -local70;
					local70 <<= 0xC;
					local70 /= 2048 - this.anInt7075;
					local19[local29] = 4096 - local70;
				} else if (local35 > 2048 - this.anInt7075 && local35 < this.anInt7075 + 2048) {
					local70 = local27 - 2048;
					local70 = local70 >= 0 ? local70 : -local70;
					local70 -= this.anInt7075;
					local70 <<= 0xC;
					local19[local29] = local70 / (2048 - this.anInt7075);
				} else if (local27 < this.anInt7075 || 4096 - this.anInt7075 < local27) {
					local70 = local35 - 2048;
					@Pc(172) int local172 = local70 < 0 ? -local70 : local70;
					@Pc(177) int local177 = local172 - this.anInt7075;
					@Pc(181) int local181 = local177 << 12;
					local19[local29] = local181 / (2048 - this.anInt7075);
				} else if (this.anInt7075 <= local35 && local35 <= 4096 - this.anInt7075) {
					local19[local29] = 0;
				} else {
					local70 = 2048 - local27;
					local70 = local70 < 0 ? -local70 : local70;
					local70 <<= 0xC;
					local70 /= 2048 - this.anInt7075;
					local19[local29] = 4096 - local70;
				}
			}
		}
		return local19;
	}
}
