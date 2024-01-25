import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public abstract class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!pca", name = "k", descriptor = "I")
	public int anInt10482;

	@OriginalMember(owner = "client!pca", name = "l", descriptor = "[I")
	public int[] anIntArray741;

	@OriginalMember(owner = "client!pca", name = "p", descriptor = "I")
	public int anInt10486;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIIIIILjava/awt/Graphics;I)V")
	public abstract void method8911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Graphics arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
	public abstract void method8913(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2);
}
