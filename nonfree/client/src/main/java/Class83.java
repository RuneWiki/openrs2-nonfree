import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class83 {

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "Lclient!rs;")
	private Class2 aClass2_89;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "Lclient!cf;")
	private Class30 aClass30_16;

	static {
		new Class32("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class83() {
	}

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!cf;)V")
	public Class83(@OriginalArg(0) Class30 arg0) {
		this.aClass30_16 = arg0;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)Lclient!rs;")
	public Class2 method2274() {
		@Pc(8) Class2 local8 = this.aClass30_16.aClass2_41.aClass2_243;
		if (local8 == this.aClass30_16.aClass2_41) {
			this.aClass2_89 = null;
			return null;
		} else {
			this.aClass2_89 = local8.aClass2_243;
			return local8;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZLclient!cf;)V")
	public void method2275(@OriginalArg(1) Class30 arg0) {
		this.aClass30_16 = arg0;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)Lclient!rs;")
	public Class2 method2277() {
		@Pc(6) Class2 local6 = this.aClass2_89;
		if (local6 == this.aClass30_16.aClass2_41) {
			this.aClass2_89 = null;
			return null;
		} else {
			this.aClass2_89 = local6.aClass2_243;
			return local6;
		}
	}
}
