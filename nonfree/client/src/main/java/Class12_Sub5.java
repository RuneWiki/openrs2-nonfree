import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public abstract class Class12_Sub5 extends Class12 {

	@OriginalMember(owner = "client!at", name = "m", descriptor = "[I")
	public int[] anIntArray674;

	@OriginalMember(owner = "client!at", name = "n", descriptor = "I")
	public int anInt9178;

	@OriginalMember(owner = "client!at", name = "s", descriptor = "I")
	public int anInt9182;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
	public abstract void method7565(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method7567(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/awt/Graphics;IIZII)V")
	public abstract void method7570(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);
}
