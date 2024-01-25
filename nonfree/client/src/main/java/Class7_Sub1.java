import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "Lclient!bw;")
	public Class7_Sub1 aClass7_Sub1_7;

	@OriginalMember(owner = "client!bw", name = "o", descriptor = "Lclient!bw;")
	public Class7_Sub1 aClass7_Sub1_8;

	static {
		new Class88("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)V")
	public final void method7360() {
		if (this.aClass7_Sub1_7 != null) {
			this.aClass7_Sub1_7.aClass7_Sub1_8 = this.aClass7_Sub1_8;
			this.aClass7_Sub1_8.aClass7_Sub1_7 = this.aClass7_Sub1_7;
			this.aClass7_Sub1_7 = null;
			this.aClass7_Sub1_8 = null;
		}
	}
}
