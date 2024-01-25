import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public abstract class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!mu", name = "n", descriptor = "[I")
	public int[] anIntArray512;

	@OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
	public int anInt6233;

	@OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
	public int anInt6235;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public abstract void method5036(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method5037(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	public abstract void method5038(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
