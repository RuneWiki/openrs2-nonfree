import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class142 {

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "[I")
	public static final int[] anIntArray703;

	static {
		new Class32("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
		anIntArray703 = new int[4096];
		for (@Pc(21) int local21 = 0; local21 < 4096; local21++) {
			anIntArray703[local21] = Static209.method3517(local21);
		}
	}
}
