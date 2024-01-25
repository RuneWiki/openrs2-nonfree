import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class3_Sub1_Sub39 extends Class3_Sub1 {

	static {
		new Class67("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(IIB)I")
	private int method7791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = arg0 * 57 + arg1;
		@Pc(23) int local23 = local17 << 1 ^ local17;
		return 4096 - (local23 * (local23 * 15731 * local23 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(28) int local28 = Static402.anIntArray741[arg0];
			for (@Pc(30) int local30 = 0; local30 < Static307.anInt4846; local30++) {
				local11[local30] = this.method7791(local28, Static241.anIntArray759[local30]) % 4096;
			}
		}
		return local11;
	}
}
