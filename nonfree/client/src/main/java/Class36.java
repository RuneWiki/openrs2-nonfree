import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public abstract class Class36 {

	static {
		new Class83("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
	public abstract void method2248();

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(B)J")
	public abstract long method2252();

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)I")
	public abstract int method2253(@OriginalArg(1) int arg0);
}
