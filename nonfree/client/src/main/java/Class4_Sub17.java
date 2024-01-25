import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public abstract class Class4_Sub17 extends Class4 {

	@OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
	public int anInt5253;

	@OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
	public int anInt5254;

	@OriginalMember(owner = "client!mu", name = "s", descriptor = "[I")
	public int[] anIntArray452;

	static {
		new Class242("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIB)V")
	public abstract void method4038(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
	public abstract void method4041(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	public abstract void method4042(@OriginalArg(1) Canvas arg0);
}
