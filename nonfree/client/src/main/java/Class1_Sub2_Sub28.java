import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class1_Sub2_Sub28 extends Class1_Sub2 {

	static {
		new Class142("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub28() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(26) int[][] local26 = this.method5968(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static218.anInt3990; local40++) {
				local11[local40] = (local38[local40] + local34[local40] + local30[local40]) / 3;
			}
		}
		return local11;
	}
}
