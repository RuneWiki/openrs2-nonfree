import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public abstract class Class3_Sub31 extends Class3 {

	@OriginalMember(owner = "client!no", name = "m", descriptor = "I")
	public int anInt6047;

	@OriginalMember(owner = "client!no", name = "l", descriptor = "[I")
	public int[] anIntArray346;

	@OriginalMember(owner = "client!no", name = "o", descriptor = "I")
	public int anInt6048;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILjava/awt/Graphics;IIIIII)V")
	public abstract void method5148(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IILjava/awt/Canvas;I)V")
	public abstract void method5152(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2);
}
