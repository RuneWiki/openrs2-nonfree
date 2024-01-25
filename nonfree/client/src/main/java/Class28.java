import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public abstract class Class28 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "[I")
	public int[] anIntArray356;

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
	public int anInt4116;

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
	public int anInt4118;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method3787(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public abstract void method3789(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	public abstract void method3790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4);
}
