import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public abstract class Class2_Sub5_Sub9 extends Class2_Sub5 {

	@OriginalMember(owner = "client!po", name = "u", descriptor = "I")
	public final int anInt6695;

	static {
		new Class134("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
		new Class134("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(I)V")
	protected Class2_Sub5_Sub9(@OriginalArg(0) int arg0) {
		this.anInt6695 = arg0;
	}

	@OriginalMember(owner = "client!po", name = "f", descriptor = "(I)Z")
	public abstract boolean method5190();

	@OriginalMember(owner = "client!po", name = "g", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5193();
}
