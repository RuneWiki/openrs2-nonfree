import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Class208 {

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
	public final int anInt5936;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
	public final int anInt5934;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
	public final int anInt5931;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
	public final int anInt5930;

	static {
		new Class256("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIII)V")
	public Class208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5936 = arg0;
		this.anInt5934 = arg1;
		this.anInt5931 = arg2;
		this.anInt5930 = arg3;
	}

	@OriginalMember(owner = "client!ra", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
