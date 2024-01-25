import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class Class4_Sub13 extends Class4 {

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
	public int anInt4694;

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
	public int anInt4695;

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "[I")
	public int[] anIntArray380;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method3731(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public abstract void method3733(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	public abstract void method3735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);
}
