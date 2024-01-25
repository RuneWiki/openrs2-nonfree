import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class Class56 {

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "[I")
	public int[] anIntArray271;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
	public int anInt3197;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
	public int anInt3198;

	static {
		new Class93("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method2987(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZIILjava/awt/Graphics;)V")
	public abstract void method2989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public abstract void method2990(@OriginalArg(0) Canvas arg0);
}
