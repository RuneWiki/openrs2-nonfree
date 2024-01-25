import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public abstract class Class5_Sub13 extends Class5 {

	@OriginalMember(owner = "client!wga", name = "s", descriptor = "[I")
	public int[] anIntArray271;

	@OriginalMember(owner = "client!wga", name = "p", descriptor = "I")
	public int anInt4955;

	@OriginalMember(owner = "client!wga", name = "o", descriptor = "I")
	public int anInt4957;

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILjava/awt/Graphics;IBIIII)V")
	public abstract void method4489(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
	public abstract void method4490(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2);
}
