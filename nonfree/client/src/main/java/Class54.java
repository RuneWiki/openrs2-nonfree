import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public abstract class Class54 {

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
	public int anInt2043;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
	public int anInt2044;

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "[I")
	public int[] anIntArray119;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	public abstract void method1855(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLjava/awt/Graphics;II)V")
	public abstract void method1857(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	public abstract void method1858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4);
}
