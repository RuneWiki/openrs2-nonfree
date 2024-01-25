import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public abstract class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!bda", name = "m", descriptor = "I")
	public int anInt2586;

	@OriginalMember(owner = "client!bda", name = "p", descriptor = "[I")
	public int[] anIntArray259;

	@OriginalMember(owner = "client!bda", name = "r", descriptor = "I")
	public int anInt2588;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
	public abstract void method2204(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZIIIILjava/awt/Graphics;)V")
	public abstract void method2206(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4);

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method2207(@OriginalArg(1) Canvas arg0);
}
