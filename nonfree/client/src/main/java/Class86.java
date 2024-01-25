import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public abstract class Class86 {

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
	public int anInt5409;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "[I")
	public int[] anIntArray683;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
	public int anInt5411;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
	public abstract void method4806(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	public abstract void method4811(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public abstract void method4813(@OriginalArg(0) Canvas arg0);
}
