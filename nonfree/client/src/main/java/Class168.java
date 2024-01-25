import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class Class168 {

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
	public int anInt6161;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "[I")
	public int[] anIntArray619;

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
	public int anInt6167;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIBLjava/awt/Graphics;II)V")
	public abstract void method5328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method5329(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method5332(@OriginalArg(3) Graphics arg0);
}
