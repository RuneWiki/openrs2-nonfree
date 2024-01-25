import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public abstract class Class5_Sub24 extends Class5 {

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	public int anInt4053;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
	public int anInt4055;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "[I")
	public int[] anIntArray204;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILjava/awt/Graphics;IIIIII)V")
	public abstract void method3658(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILjava/awt/Canvas;I)V")
	public abstract void method3659(@OriginalArg(0) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2);
}
