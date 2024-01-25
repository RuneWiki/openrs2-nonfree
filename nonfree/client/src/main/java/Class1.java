import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class Class1 {

	static {
		new Class159("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method11(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)I")
	public abstract int method12();

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public abstract void method14(@OriginalArg(0) Component arg0);
}
