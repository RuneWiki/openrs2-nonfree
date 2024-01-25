import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public final class Class157 {

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "Lclient!eea;")
	private Class71 aClass71_42;

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "Lclient!uj;")
	private Class3 aClass3_129;

	static {
		new Class67("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "()V")
	public Class157() {
	}

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lclient!eea;)V")
	public Class157(@OriginalArg(0) Class71 arg0) {
		this.aClass71_42 = arg0;
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)Lclient!uj;")
	public Class3 method4203() {
		@Pc(8) Class3 local8 = this.aClass71_42.aClass3_73.aClass3_284;
		if (this.aClass71_42.aClass3_73 == local8) {
			this.aClass3_129 = null;
			return null;
		} else {
			this.aClass3_129 = local8.aClass3_284;
			return local8;
		}
	}

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "(I)Lclient!uj;")
	public Class3 method4206() {
		@Pc(6) Class3 local6 = this.aClass3_129;
		if (local6 == this.aClass71_42.aClass3_73) {
			this.aClass3_129 = null;
			return null;
		} else {
			this.aClass3_129 = local6.aClass3_284;
			return local6;
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(BLclient!eea;)V")
	public void method4207(@OriginalArg(1) Class71 arg0) {
		this.aClass71_42 = arg0;
	}
}
