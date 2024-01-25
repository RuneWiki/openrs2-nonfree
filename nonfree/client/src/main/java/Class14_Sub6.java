import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public abstract class Class14_Sub6 extends Class14 {

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "[I")
	public int[] anIntArray136;

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
	public int anInt1867;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
	public int anInt1869;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIBILjava/awt/Graphics;II)V")
	public abstract void method1597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILjava/awt/Canvas;I)V")
	public abstract void method1601(@OriginalArg(0) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2);
}
