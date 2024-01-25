import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class Class5_Sub18 extends Class5 {

	@OriginalMember(owner = "client!or", name = "m", descriptor = "I")
	public int anInt6326;

	@OriginalMember(owner = "client!or", name = "n", descriptor = "[I")
	public int[] anIntArray346;

	@OriginalMember(owner = "client!or", name = "l", descriptor = "I")
	public int anInt6328;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
	public abstract void method5405(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIILjava/awt/Graphics;IIII)V")
	public abstract void method5406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);
}
