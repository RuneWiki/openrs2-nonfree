import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public abstract class Class94 {

	@OriginalMember(owner = "client!up", name = "a", descriptor = "I")
	public int anInt6579;

	@OriginalMember(owner = "client!up", name = "c", descriptor = "I")
	public int anInt6580;

	@OriginalMember(owner = "client!up", name = "f", descriptor = "[I")
	public int[] anIntArray521;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	public abstract void method5462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4);

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method5463(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public abstract void method5464(@OriginalArg(0) Canvas arg0);
}
