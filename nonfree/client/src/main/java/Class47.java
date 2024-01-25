import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public abstract class Class47 {

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
	public int anInt4082;

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
	public int anInt4083;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "[I")
	public int[] anIntArray370;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
	public abstract void method3696(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	public abstract void method3697(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	public abstract void method3702(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4);
}
