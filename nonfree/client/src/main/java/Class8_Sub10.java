import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public abstract class Class8_Sub10 extends Class8 {

	@OriginalMember(owner = "client!qca", name = "j", descriptor = "I")
	public int anInt4338;

	@OriginalMember(owner = "client!qca", name = "k", descriptor = "I")
	public int anInt4339;

	@OriginalMember(owner = "client!qca", name = "o", descriptor = "[I")
	public int[] anIntArray237;

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ljava/awt/Canvas;IZI)V")
	public abstract void method3520(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIIII)V")
	public abstract void method3523(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);
}
