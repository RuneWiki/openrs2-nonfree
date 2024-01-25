import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class Class46 {

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public int anInt2297;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "[I")
	public int[] anIntArray262;

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
	public int anInt2302;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method2194(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	public abstract void method2196(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	public abstract void method2198(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);
}
