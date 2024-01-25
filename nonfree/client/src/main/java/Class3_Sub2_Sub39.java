import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class3_Sub2_Sub39 extends Class3_Sub2 {

	@OriginalMember(owner = "client!vr", name = "L", descriptor = "I")
	private int anInt10160 = 585;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt10160 = arg1.method8414();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(27) int local27 = Static328.anIntArray387[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static164.anInt8839; local29++) {
				@Pc(35) int local35 = Static352.anIntArray400[local29];
				@Pc(72) int local72;
				if (local35 > this.anInt10160 && local35 < 4096 - this.anInt10160 && 2048 - this.anInt10160 < local27 && this.anInt10160 + 2048 > local27) {
					local72 = 2048 - local35;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt10160;
					local19[local29] = 4096 - local72;
				} else if (local35 > 2048 - this.anInt10160 && this.anInt10160 + 2048 > local35) {
					local72 = local27 - 2048;
					local72 = local72 < 0 ? -local72 : local72;
					local72 -= this.anInt10160;
					local72 <<= 0xC;
					local19[local29] = local72 / (2048 - this.anInt10160);
				} else if (this.anInt10160 > local27 || local27 > 4096 - this.anInt10160) {
					local72 = local35 - 2048;
					@Pc(185) int local185 = local72 >= 0 ? local72 : -local72;
					@Pc(190) int local190 = local185 - this.anInt10160;
					@Pc(194) int local194 = local190 << 12;
					local19[local29] = local194 / (2048 - this.anInt10160);
				} else if (this.anInt10160 <= local35 && local35 <= 4096 - this.anInt10160) {
					local19[local29] = 0;
				} else {
					local72 = 2048 - local27;
					local72 = local72 < 0 ? -local72 : local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt10160;
					local19[local29] = 4096 - local72;
				}
			}
		}
		return local19;
	}
}
