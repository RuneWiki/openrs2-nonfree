import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public abstract class Class2_Sub31 extends Class2 {

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "[I")
	public int[] anIntArray340;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
	public int anInt5956;

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
	public int anInt5959;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
	public abstract void method5139(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIILjava/awt/Graphics;IIII)V")
	public abstract void method5142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);
}
