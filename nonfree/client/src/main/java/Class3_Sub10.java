import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public abstract class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
	public int anInt2898;

	@OriginalMember(owner = "client!qr", name = "o", descriptor = "[I")
	public int[] anIntArray176;

	@OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
	public int anInt2900;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method2181(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method2182(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	public abstract void method2183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Graphics arg4);
}
