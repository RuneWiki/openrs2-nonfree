import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public abstract class Class5_Sub8 extends Class5 {

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "[I")
	public int[] anIntArray507;

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
	public int anInt9181;

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
	public int anInt9183;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
	public abstract void method7711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILjava/awt/Canvas;BI)V")
	public abstract void method7712(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2);
}
