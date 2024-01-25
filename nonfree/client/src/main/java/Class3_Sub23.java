import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public abstract class Class3_Sub23 extends Class3 {

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
	public int anInt8162;

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
	public int anInt8164;

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "[I")
	public int[] anIntArray504;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/awt/Graphics;IIIIII)V")
	public abstract void method6869(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
	public abstract void method6871(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2);
}
