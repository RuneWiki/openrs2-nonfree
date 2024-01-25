import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public abstract class Class2_Sub40 extends Class2 {

	@OriginalMember(owner = "client!us", name = "p", descriptor = "I")
	public int anInt8471;

	@OriginalMember(owner = "client!us", name = "s", descriptor = "I")
	public int anInt8472;

	@OriginalMember(owner = "client!us", name = "n", descriptor = "[I")
	public int[] anIntArray602;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
	public abstract void method7508(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIIII)V")
	public abstract void method7509(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);
}
