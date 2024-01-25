import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
	public int anInt3342;

	@OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
	public int anInt3346;

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "[I")
	public int[] anIntArray197;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method2872(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	public abstract void method2875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method2876(@OriginalArg(1) Canvas arg0);
}
