import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public abstract class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
	public int anInt4831;

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
	public int anInt4833;

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "[I")
	public int[] anIntArray476;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public abstract void method3890(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method3891(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
	public abstract void method3893(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);
}
