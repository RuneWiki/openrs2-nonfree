import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class159 {

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "Lclient!wi;")
	private final Class268 aClass268_39 = new Class268(64);

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Lclient!uu;")
	private final Class250 aClass250_68;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
	public final int anInt4532;

	static {
		new Class174("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;)V")
	public Class159(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_68 = arg2;
		if (this.aClass250_68 == null) {
			this.anInt4532 = 0;
		} else {
			this.anInt4532 = this.aClass250_68.method5815(16);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)V")
	public void method3762() {
		@Pc(10) Class268 local10 = this.aClass268_39;
		synchronized (this.aClass268_39) {
			this.aClass268_39.method6173(5);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Lclient!uk;")
	public Class247 method3765(@OriginalArg(0) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_39;
		@Pc(16) Class247 local16;
		synchronized (this.aClass268_39) {
			local16 = (Class247) this.aClass268_39.method6166((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class250 local29 = this.aClass250_68;
		@Pc(38) byte[] local38;
		synchronized (this.aClass250_68) {
			local38 = this.aClass250_68.method5806(16, arg0);
		}
		local16 = new Class247();
		if (local38 != null) {
			local16.method5699(new Class3_Sub25(local38));
		}
		@Pc(60) Class268 local60 = this.aClass268_39;
		synchronized (this.aClass268_39) {
			this.aClass268_39.method6164(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	public void method3767() {
		@Pc(2) Class268 local2 = this.aClass268_39;
		synchronized (this.aClass268_39) {
			this.aClass268_39.method6168();
		}
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
	public void method3768() {
		@Pc(6) Class268 local6 = this.aClass268_39;
		synchronized (this.aClass268_39) {
			this.aClass268_39.method6160();
		}
	}
}
