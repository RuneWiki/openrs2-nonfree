import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!ks", name = "o", descriptor = "I")
	public final int anInt3949;

	@OriginalMember(owner = "client!ks", name = "n", descriptor = "I")
	public final int anInt3948;

	static {
		new Class84("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
		new Class84("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(II)V")
	public Class1_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3949 = arg0;
		this.anInt3948 = arg1;
	}
}
