import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public abstract class Class193 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
	public int anInt5585;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
	public int anInt5586;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "[I")
	public int[] anIntArray645;

	static {
		new Class169("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V")
	public abstract void method4805(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method4807(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
	public abstract void method4808(@OriginalArg(3) Graphics arg0);
}
