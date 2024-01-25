import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class106 {

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "Lclient!um;")
	private Class1 aClass1_111;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "Lclient!bv;")
	private Class37 aClass37_38;

	static {
		new Class306("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	public Class106() {
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!bv;)V")
	public Class106(@OriginalArg(0) Class37 arg0) {
		this.aClass37_38 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!bv;I)V")
	public void method2483(@OriginalArg(0) Class37 arg0) {
		this.aClass37_38 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Lclient!um;")
	public Class1 method2484() {
		@Pc(8) Class1 local8 = this.aClass37_38.aClass1_47.aClass1_284;
		if (this.aClass37_38.aClass1_47 == local8) {
			this.aClass1_111 = null;
			return null;
		} else {
			this.aClass1_111 = local8.aClass1_284;
			return local8;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)Lclient!um;")
	public Class1 method2485() {
		@Pc(14) Class1 local14 = this.aClass1_111;
		if (this.aClass37_38.aClass1_47 == local14) {
			this.aClass1_111 = null;
			return null;
		} else {
			this.aClass1_111 = local14.aClass1_284;
			return local14;
		}
	}
}
