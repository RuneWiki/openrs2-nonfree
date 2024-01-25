import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class191 {

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "[I")
	public int[] anIntArray595;

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
	public int anInt4936 = -1;

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
	public int anInt4939 = -1;

	static {
		new Class169("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
		new Class169("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBLclient!re;)V")
	private void method4350(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 1) {
			this.anInt4939 = arg1.method5177();
		} else if (arg0 == 2) {
			this.anIntArray595 = new int[arg1.method5174()];
			for (@Pc(34) int local34 = 0; local34 < this.anIntArray595.length; local34++) {
				this.anIntArray595[local34] = arg1.method5177();
			}
		} else if (arg0 == 3) {
			this.anInt4936 = arg1.method5174();
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!re;Z)V")
	public void method4352(@OriginalArg(0) Class1_Sub33 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5174();
			if (local9 == 0) {
				return;
			}
			this.method4350(local9, arg0);
		}
	}
}
