import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!am", name = "k", descriptor = "Lclient!am;")
	public Class12_Sub1 aClass12_Sub1_7;

	@OriginalMember(owner = "client!am", name = "p", descriptor = "Lclient!am;")
	public Class12_Sub1 aClass12_Sub1_8;

	static {
		new Class57("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
		new Class57("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V")
	public final void method4661() {
		if (this.aClass12_Sub1_8 != null) {
			this.aClass12_Sub1_8.aClass12_Sub1_7 = this.aClass12_Sub1_7;
			this.aClass12_Sub1_7.aClass12_Sub1_8 = this.aClass12_Sub1_8;
			this.aClass12_Sub1_7 = null;
			this.aClass12_Sub1_8 = null;
		}
	}
}
