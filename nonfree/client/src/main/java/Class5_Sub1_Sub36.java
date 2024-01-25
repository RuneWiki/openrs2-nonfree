import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class5_Sub1_Sub36 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
	private int anInt5816 = 585;

	static {
		new Class198("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
		new Class198(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt5816 = arg1.method5598();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(27) int local27 = Static346.anIntArray401[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static148.anInt2666; local29++) {
				@Pc(35) int local35 = Static224.anIntArray234[local29];
				@Pc(65) int local65;
				if (local35 > this.anInt5816 && 4096 - this.anInt5816 > local35 && local27 > 2048 - this.anInt5816 && this.anInt5816 + 2048 > local27) {
					local65 = 2048 - local35;
					local65 = local65 >= 0 ? local65 : -local65;
					local65 <<= 0xC;
					local65 /= 2048 - this.anInt5816;
					local19[local29] = 4096 - local65;
				} else if (local35 > 2048 - this.anInt5816 && local35 < this.anInt5816 + 2048) {
					local65 = local27 - 2048;
					local65 = local65 < 0 ? -local65 : local65;
					local65 -= this.anInt5816;
					local65 <<= 0xC;
					local19[local29] = local65 / (2048 - this.anInt5816);
				} else if (local27 < this.anInt5816 || local27 > 4096 - this.anInt5816) {
					local65 = local35 - 2048;
					@Pc(173) int local173 = local65 < 0 ? -local65 : local65;
					@Pc(178) int local178 = local173 - this.anInt5816;
					@Pc(182) int local182 = local178 << 12;
					local19[local29] = local182 / (2048 - this.anInt5816);
				} else if (this.anInt5816 <= local35 && local35 <= 4096 - this.anInt5816) {
					local19[local29] = 0;
				} else {
					local65 = 2048 - local27;
					local65 = local65 >= 0 ? local65 : -local65;
					local65 <<= 0xC;
					local65 /= 2048 - this.anInt5816;
					local19[local29] = 4096 - local65;
				}
			}
		}
		return local19;
	}
}
