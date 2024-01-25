import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class Class55_Sub8 extends Class55 {

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!td;")
	public Class55_Sub8 aClass55_Sub8_7;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "Lclient!td;")
	public Class55_Sub8 aClass55_Sub8_8;

	static {
		new Class93("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
	public final void method4602() {
		if (this.aClass55_Sub8_8 != null) {
			this.aClass55_Sub8_8.aClass55_Sub8_7 = this.aClass55_Sub8_7;
			this.aClass55_Sub8_7.aClass55_Sub8_8 = this.aClass55_Sub8_8;
			this.aClass55_Sub8_7 = null;
			this.aClass55_Sub8_8 = null;
		}
	}
}
