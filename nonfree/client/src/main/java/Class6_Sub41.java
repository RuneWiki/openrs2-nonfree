import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public abstract class Class6_Sub41 extends Class6 {

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "[I")
	public int[] anIntArray653;

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
	public int anInt9945;

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
	public int anInt9947;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
	public abstract void method8628(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
	public abstract void method8629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);
}
