import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public abstract class Class3_Sub15 extends Class3 {

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
	public int anInt6369;

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
	public int anInt6370;

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "[I")
	public int[] anIntArray488;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILjava/awt/Canvas;I)V")
	public abstract void method5519(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BIILjava/awt/Graphics;IIII)V")
	public abstract void method5522(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);
}
