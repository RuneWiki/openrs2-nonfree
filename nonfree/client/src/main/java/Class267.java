import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class267 {

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "[Lclient!ed;")
	public static final Class77[] aClass77Array1 = new Class77[5];

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
	public int anInt7821;

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
	public int anInt7822;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "Lclient!jn;")
	public final Class161 aClass161_1 = new Class161();

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "Z")
	public boolean aBoolean555 = false;

	static {
		for (@Pc(17) int local17 = 0; local17 < aClass77Array1.length; local17++) {
			aClass77Array1[local17] = new Class77();
		}
		new Class40("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}
}
