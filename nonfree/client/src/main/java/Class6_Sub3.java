import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public abstract class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
	public int anInt4194;

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "[I")
	public int[] anIntArray384;

	@OriginalMember(owner = "client!pr", name = "q", descriptor = "I")
	public int anInt4195;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method3816(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public abstract void method3818(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILjava/awt/Graphics;IIBI)V")
	public abstract void method3819(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4);
}
