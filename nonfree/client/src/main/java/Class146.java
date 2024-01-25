import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class146 {

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	public int anInt4515;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
	public int anInt4520;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Lclient!ts;")
	public final Class232 aClass232_1 = new Class232();

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Z")
	public boolean aBoolean417 = false;

	static {
		new Class83("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}
}
