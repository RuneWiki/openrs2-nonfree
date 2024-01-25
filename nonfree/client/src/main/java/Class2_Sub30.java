import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class Class2_Sub30 extends Class2 {

	@OriginalMember(owner = "client!s", name = "i", descriptor = "[I")
	public int[] anIntArray502;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "I")
	public int anInt5719;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "I")
	public int anInt5721;

	static {
		new Class134("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
		new Class134(null, "der Spieler ist momentan nicht verfügbar.", null, null);
		new Class240("", 73);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method4495(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method4498(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	public abstract void method4500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Graphics arg4);
}
