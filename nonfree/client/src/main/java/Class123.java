import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class Class123 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "I")
	public int anInt4906;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "[I")
	public int[] anIntArray969;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "I")
	public int anInt4907;

	static {
		new Class32("Use", "Benutzen", "Utiliser", "Usar");
		new Class32("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method4318(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method4319(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/awt/Graphics;IIBI)V")
	public abstract void method4320(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4);
}
