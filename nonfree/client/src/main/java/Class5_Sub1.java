import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public abstract class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!rha", name = "i", descriptor = "I")
	public int anInt4128;

	@OriginalMember(owner = "client!rha", name = "k", descriptor = "[I")
	public int[] anIntArray350;

	@OriginalMember(owner = "client!rha", name = "l", descriptor = "I")
	public int anInt4129;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
	public abstract void method3750(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IZIIIIILjava/awt/Graphics;)V")
	public abstract void method3751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Graphics arg6);
}
