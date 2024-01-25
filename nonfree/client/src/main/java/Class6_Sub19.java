import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public abstract class Class6_Sub19 extends Class6 {

	@OriginalMember(owner = "client!nca", name = "k", descriptor = "I")
	public int anInt9382;

	@OriginalMember(owner = "client!nca", name = "p", descriptor = "[I")
	public int[] anIntArray495;

	@OriginalMember(owner = "client!nca", name = "u", descriptor = "I")
	public int anInt9388;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/awt/Graphics;IBIIIII)V")
	public abstract void method7652(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
	public abstract void method7659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Canvas arg2);
}
