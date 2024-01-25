import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class3_Sub4_Sub16 extends Class3_Sub4 {

	@OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
	private int anInt3801 = 585;

	static {
		new Class175("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3801 = arg1.method6004();
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(19) int local19 = Static285.anIntArray401[arg0];
			for (@Pc(21) int local21 = 0; local21 < Static106.anInt2356; local21++) {
				@Pc(27) int local27 = Static382.anIntArray476[local21];
				@Pc(64) int local64;
				if (this.anInt3801 < local27 && local27 < 4096 - this.anInt3801 && local19 > 2048 - this.anInt3801 && this.anInt3801 + 2048 > local19) {
					local64 = 2048 - local27;
					local64 = local64 < 0 ? -local64 : local64;
					local64 <<= 0xC;
					local64 /= 2048 - this.anInt3801;
					local11[local21] = 4096 - local64;
				} else if (local27 > 2048 - this.anInt3801 && local27 < this.anInt3801 + 2048) {
					local64 = local19 - 2048;
					local64 = local64 < 0 ? -local64 : local64;
					local64 -= this.anInt3801;
					local64 <<= 0xC;
					local11[local21] = local64 / (2048 - this.anInt3801);
				} else if (local19 < this.anInt3801 || local19 > 4096 - this.anInt3801) {
					local64 = local27 - 2048;
					@Pc(176) int local176 = local64 < 0 ? -local64 : local64;
					@Pc(181) int local181 = local176 - this.anInt3801;
					@Pc(185) int local185 = local181 << 12;
					local11[local21] = local185 / (2048 - this.anInt3801);
				} else if (local27 >= this.anInt3801 && local27 <= 4096 - this.anInt3801) {
					local11[local21] = 0;
				} else {
					local64 = 2048 - local19;
					local64 = local64 < 0 ? -local64 : local64;
					local64 <<= 0xC;
					local64 /= 2048 - this.anInt3801;
					local11[local21] = 4096 - local64;
				}
			}
		}
		return local11;
	}
}
