import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public abstract class Class3_Sub13 extends Class3 {

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
	public int anInt5275;

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "[I")
	public int[] anIntArray475;

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
	public int anInt5276;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
	public abstract void method4822(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIILjava/awt/Graphics;II)V")
	public abstract void method4824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Graphics arg5, @OriginalArg(6) int arg6);
}
