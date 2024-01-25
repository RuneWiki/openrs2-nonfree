import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class Class85 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "[I")
	public int[] anIntArray311;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	public int anInt2369;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	public int anInt2372;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public abstract void method2520(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method2521(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
	public abstract void method2524(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);
}
