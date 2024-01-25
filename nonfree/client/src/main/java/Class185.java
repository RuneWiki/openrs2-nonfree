import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class185 {

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	public int anInt5595;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
	public int anInt5596;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Lclient!se;")
	public final Class212 aClass212_1 = new Class212();

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "Z")
	public boolean aBoolean365 = false;

	static {
		new Class84("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
		new Class84("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}
}
