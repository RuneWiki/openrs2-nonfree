import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "[I")
	public int[] anIntArray406;

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
	public int anInt6770;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
	public int anInt6771;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIIII)V")
	public abstract void method5830(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
	public abstract void method5831(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2);
}
