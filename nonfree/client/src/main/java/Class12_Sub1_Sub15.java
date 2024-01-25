import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class12_Sub1_Sub15 extends Class12_Sub1 {

	@OriginalMember(owner = "client!he", name = "E", descriptor = "I")
	private int anInt4070 = 585;

	static {
		new Class88("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
		new Class88("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4070 = arg0.method5199();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(23) int local23 = Static353.anIntArray458[arg0];
			for (@Pc(25) int local25 = 0; local25 < Static357.anInt6670; local25++) {
				@Pc(31) int local31 = Static347.anIntArray455[local25];
				@Pc(75) int local75;
				if (local31 > this.anInt4070 && local31 < 4096 - this.anInt4070 && local23 > 2048 - this.anInt4070 && this.anInt4070 + 2048 > local23) {
					local75 = 2048 - local31;
					local75 = local75 >= 0 ? local75 : -local75;
					local75 <<= 0xC;
					local75 /= 2048 - this.anInt4070;
					local15[local25] = 4096 - local75;
				} else if (local31 > 2048 - this.anInt4070 && this.anInt4070 + 2048 > local31) {
					local75 = local23 - 2048;
					local75 = local75 >= 0 ? local75 : -local75;
					local75 -= this.anInt4070;
					local75 <<= 0xC;
					local15[local25] = local75 / (2048 - this.anInt4070);
				} else if (local23 < this.anInt4070 || 4096 - this.anInt4070 < local23) {
					local75 = local31 - 2048;
					@Pc(189) int local189 = local75 >= 0 ? local75 : -local75;
					@Pc(194) int local194 = local189 - this.anInt4070;
					@Pc(198) int local198 = local194 << 12;
					local15[local25] = local198 / (2048 - this.anInt4070);
				} else if (local31 >= this.anInt4070 && 4096 - this.anInt4070 >= local31) {
					local15[local25] = 0;
				} else {
					local75 = 2048 - local23;
					local75 = local75 < 0 ? -local75 : local75;
					local75 <<= 0xC;
					local75 /= 2048 - this.anInt4070;
					local15[local25] = 4096 - local75;
				}
			}
		}
		return local15;
	}
}
