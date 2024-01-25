import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class63 {

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "[I")
	public int[] anIntArray119;

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
	public int anInt1462 = -1;

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
	public int anInt1468 = -1;

	static {
		new Class85("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!rg;III)V")
	private void method1408(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt1468 = arg0.method5106();
		} else if (arg1 == 2) {
			this.anIntArray119 = new int[arg0.method5115()];
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray119.length; local29++) {
				this.anIntArray119[local29] = arg0.method5106();
			}
		} else if (arg1 == 3) {
			this.anInt1462 = arg0.method5115();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILclient!rg;)V")
	public void method1409(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.method5115();
			if (local13 == 0) {
				return;
			}
			this.method1408(arg1, local13, arg0);
		}
	}
}
