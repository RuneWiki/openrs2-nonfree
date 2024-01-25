import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public abstract class Class65 {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
	public int anInt2988;

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "[I")
	public int[] anIntArray199;

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
	public int anInt2990;

	static {
		new Class117("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
		new Class117("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method2523(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method2525(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
	public abstract void method2526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4);
}
