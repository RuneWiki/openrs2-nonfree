import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
	protected int anInt5212;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
	protected final int anInt5213;

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
	protected int anInt5218;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
	public final int anInt5215;

	static {
		new Class15("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIII)V")
	protected Class8_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5212 = arg0;
		this.anInt5213 = arg1;
		this.anInt5218 = arg2;
		this.anInt5215 = arg3;
	}
}
