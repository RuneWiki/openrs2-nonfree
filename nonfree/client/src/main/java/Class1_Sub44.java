import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class Class1_Sub44 extends Class1 {

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
	public final int anInt7736;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
	public int anInt7735;

	static {
		new Class96("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(II)V")
	public Class1_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7736 = arg0;
		this.anInt7735 = arg1;
	}
}
