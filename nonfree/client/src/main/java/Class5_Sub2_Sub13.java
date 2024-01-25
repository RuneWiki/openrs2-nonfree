import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class5_Sub2_Sub13 extends Class5_Sub2 {

	@OriginalMember(owner = "client!pg", name = "C", descriptor = "Lclient!gu;")
	public final Class2_Sub1_Sub1 aClass2_Sub1_Sub1_1;

	static {
		new Class198("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!gu;)V")
	public Class5_Sub2_Sub13(@OriginalArg(0) Class2_Sub1_Sub1 arg0) {
		this.aClass2_Sub1_Sub1_1 = arg0;
	}
}
