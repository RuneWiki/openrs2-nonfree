import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public int anInt9524;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "[I")
	public int[] anIntArray632;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
	public int anInt9526;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method7866(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	public abstract void method7867(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
	public abstract void method7870(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);
}
