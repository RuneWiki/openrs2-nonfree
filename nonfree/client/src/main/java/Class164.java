import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class164 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
	public int anInt4968 = 0;

	static {
		new Class34("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
		new Class34("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILclient!bg;B)V")
	private void method4372(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		if (arg0 == 5) {
			this.anInt4968 = arg1.method4556();
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!bg;B)V")
	public void method4375(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4532();
			if (local11 == 0) {
				return;
			}
			this.method4372(local11, arg0);
		}
	}
}
