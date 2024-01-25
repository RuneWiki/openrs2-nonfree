import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public final class Class143 {

	@OriginalMember(owner = "client!km", name = "d", descriptor = "Lclient!ef;")
	private final Class49_Sub2 aClass49_Sub2_21;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "I")
	public final int anInt3983;

	static {
		new Class209("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
		new Class209("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!ef;II)V")
	public Class143(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass49_Sub2_21 = arg0;
		this.anInt3983 = arg2;
	}

	@OriginalMember(owner = "client!km", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass49_Sub2_21.method1616(this.anInt3983);
		super.finalize();
	}
}
