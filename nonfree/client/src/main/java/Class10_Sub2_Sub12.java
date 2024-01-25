import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class10_Sub2_Sub12 extends Class10_Sub2 {

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
	private int anInt2160 = 585;

	static {
		new Class182("Player ", "Spieler ", "Joueur ", "Jogador ");
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2160 = arg1.method2485();
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(27) int local27 = Static67.anIntArray106[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static121.anInt2458; local29++) {
				@Pc(35) int local35 = Static182.anIntArray374[local29];
				@Pc(71) int local71;
				if (this.anInt2160 < local35 && 4096 - this.anInt2160 > local35 && local27 > 2048 - this.anInt2160 && local27 < this.anInt2160 + 2048) {
					local71 = 2048 - local35;
					local71 = local71 >= 0 ? local71 : -local71;
					local71 <<= 0xC;
					local71 /= 2048 - this.anInt2160;
					local19[local29] = 4096 - local71;
				} else if (2048 - this.anInt2160 < local35 && local35 < this.anInt2160 + 2048) {
					local71 = local27 - 2048;
					local71 = local71 >= 0 ? local71 : -local71;
					local71 -= this.anInt2160;
					local71 <<= 0xC;
					local19[local29] = local71 / (2048 - this.anInt2160);
				} else if (local27 < this.anInt2160 || local27 > 4096 - this.anInt2160) {
					local71 = local35 - 2048;
					@Pc(171) int local171 = local71 < 0 ? -local71 : local71;
					@Pc(176) int local176 = local171 - this.anInt2160;
					@Pc(180) int local180 = local176 << 12;
					local19[local29] = local180 / (2048 - this.anInt2160);
				} else if (local35 >= this.anInt2160 && 4096 - this.anInt2160 >= local35) {
					local19[local29] = 0;
				} else {
					local71 = 2048 - local27;
					local71 = local71 < 0 ? -local71 : local71;
					local71 <<= 0xC;
					local71 /= 2048 - this.anInt2160;
					local19[local29] = 4096 - local71;
				}
			}
		}
		return local19;
	}
}
