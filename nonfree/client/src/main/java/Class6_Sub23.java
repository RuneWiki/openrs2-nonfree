import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public abstract class Class6_Sub23 extends Class6 {

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "I")
	public int anInt7481;

	@OriginalMember(owner = "client!mv", name = "l", descriptor = "[I")
	public int[] anIntArray539;

	@OriginalMember(owner = "client!mv", name = "m", descriptor = "I")
	public int anInt7484;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public abstract void method6170(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	public abstract void method6171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	public abstract void method6173(@OriginalArg(1) Graphics arg0);
}
