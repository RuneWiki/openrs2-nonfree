import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public final class Class142 {

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
	public final int anInt3974;

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
	public final int anInt3979;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
	public final int anInt3978;

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
	public final int anInt3976;

	static {
		new Class209("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(IIII)V")
	public Class142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3974 = arg0;
		this.anInt3979 = arg3;
		this.anInt3978 = arg1;
		this.anInt3976 = arg2;
	}

	@OriginalMember(owner = "client!kl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
