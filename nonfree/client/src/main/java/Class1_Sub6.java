import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!va", name = "k", descriptor = "[I")
	public int[] anIntArray169;

	@OriginalMember(owner = "client!va", name = "n", descriptor = "I")
	public int anInt2078;

	@OriginalMember(owner = "client!va", name = "o", descriptor = "I")
	public int anInt2079;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	public abstract void method1795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method1800(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	public abstract void method1801(@OriginalArg(0) Canvas arg0);
}
