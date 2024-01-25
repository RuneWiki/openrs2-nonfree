import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class177 {

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "Lclient!h;")
	private final Class125 aClass125_38 = new Class125(64);

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "Lclient!an;")
	private final Class16 aClass16_71;

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
	public final int anInt5289;

	static {
		new Class88("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;)V")
	public Class177(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		this.aClass16_71 = arg2;
		this.anInt5289 = this.aClass16_71.method399(19);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)Lclient!wca;")
	public Class312 method4424(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_38;
		@Pc(16) Class312 local16;
		synchronized (this.aClass125_38) {
			local16 = (Class312) this.aClass125_38.method3446((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class16 local29 = this.aClass16_71;
		@Pc(38) byte[] local38;
		synchronized (this.aClass16_71) {
			local38 = this.aClass16_71.method408(19, arg0);
		}
		local16 = new Class312();
		if (local38 != null) {
			local16.method7865(new Class12_Sub8(local38));
		}
		@Pc(60) Class125 local60 = this.aClass125_38;
		synchronized (this.aClass125_38) {
			this.aClass125_38.method3437(local16, (long) arg0);
			return local16;
		}
	}
}
