import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class2_Sub2_Sub19 extends Class2_Sub2 {

	@OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
	private int anInt3412 = 585;

	static {
		new Class93("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt3412 = arg1.method4464();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(23) int local23 = Class208.lb[arg0];
			for (@Pc(25) int local25 = 0; local25 < Static339.anInt6735; local25++) {
				@Pc(31) int local31 = Static212.anIntArray325[local25];
				@Pc(72) int local72;
				if (this.anInt3412 < local31 && local31 < 4096 - this.anInt3412 && local23 > 2048 - this.anInt3412 && this.anInt3412 + 2048 > local23) {
					local72 = 2048 - local31;
					local72 = local72 < 0 ? -local72 : local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt3412;
					local11[local25] = 4096 - local72;
				} else if (local31 > 2048 - this.anInt3412 && this.anInt3412 + 2048 > local31) {
					local72 = local23 - 2048;
					local72 = local72 < 0 ? -local72 : local72;
					local72 -= this.anInt3412;
					local72 <<= 0xC;
					local11[local25] = local72 / (2048 - this.anInt3412);
				} else if (this.anInt3412 > local23 || local23 > 4096 - this.anInt3412) {
					local72 = local31 - 2048;
					@Pc(176) int local176 = local72 < 0 ? -local72 : local72;
					@Pc(181) int local181 = local176 - this.anInt3412;
					@Pc(185) int local185 = local181 << 12;
					local11[local25] = local185 / (2048 - this.anInt3412);
				} else if (local31 >= this.anInt3412 && 4096 - this.anInt3412 >= local31) {
					local11[local25] = 0;
				} else {
					local72 = 2048 - local23;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt3412;
					local11[local25] = 4096 - local72;
				}
			}
		}
		return local11;
	}
}
