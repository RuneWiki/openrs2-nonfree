import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public final class Class212 {

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "Lclient!ag;")
	private final Class9_Sub1_Sub1 aClass9_Sub1_Sub1_6;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "I")
	public final int anInt6305;

	static {
		new Class114("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Lclient!ag;II)V")
	public Class212(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass9_Sub1_Sub1_6 = arg0;
		this.anInt6305 = arg2;
	}

	@OriginalMember(owner = "client!oba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass9_Sub1_Sub1_6.method677(this.anInt6305);
		super.finalize();
	}
}
