import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public abstract class Class6_Sub18 extends Class6 {

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
	public int anInt4857;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public int anInt4861;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "[I")
	public int[] anIntArray278;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIBIILjava/awt/Graphics;)V")
	public abstract void method4129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Graphics arg6);

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Canvas;IIB)V")
	public abstract void method4130(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
