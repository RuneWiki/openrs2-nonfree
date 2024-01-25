import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class Class88_Sub1 extends Class88 {

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "Lclient!sr;")
	public Class88_Sub1 aClass88_Sub1_7;

	@OriginalMember(owner = "client!sr", name = "k", descriptor = "Lclient!sr;")
	public Class88_Sub1 aClass88_Sub1_8;

	static {
		new Class198("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V")
	public final void method3065() {
		if (this.aClass88_Sub1_8 != null) {
			this.aClass88_Sub1_8.aClass88_Sub1_7 = this.aClass88_Sub1_7;
			this.aClass88_Sub1_7.aClass88_Sub1_8 = this.aClass88_Sub1_8;
			this.aClass88_Sub1_7 = null;
			this.aClass88_Sub1_8 = null;
		}
	}
}
