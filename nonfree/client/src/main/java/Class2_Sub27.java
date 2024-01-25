import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class Class2_Sub27 extends Class2 {

	@OriginalMember(owner = "client!id", name = "k", descriptor = "I")
	public int anInt7426;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "I")
	public int anInt7427;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "[I")
	public int[] anIntArray501;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIZILjava/awt/Graphics;I)V")
	public abstract void method6242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Graphics arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILjava/awt/Canvas;IB)V")
	public abstract void method6243(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2);
}
