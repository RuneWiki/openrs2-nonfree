import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public abstract class Class3 {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
	public int anInt605;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
	public int anInt608;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIILjava/awt/Graphics;B)V")
	public abstract void method545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	public abstract void method548(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method551(@OriginalArg(2) Graphics arg0);
}
