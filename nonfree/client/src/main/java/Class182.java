import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public final class Class182 implements Interface7 {

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
	public final int anInt5135;

	static {
		new Class209("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class182(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5135 = arg1;
	}

	@OriginalMember(owner = "client!ol", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
