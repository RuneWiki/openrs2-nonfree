import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public abstract class Class5_Sub26 extends Class5 {

	@OriginalMember(owner = "client!hca", name = "l", descriptor = "[I")
	public int[] anIntArray230;

	@OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
	public int anInt4454;

	@OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
	public int anInt4455;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IILjava/awt/Graphics;IIIII)V")
	public abstract void method3763(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
	public abstract void method3764(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2);
}
