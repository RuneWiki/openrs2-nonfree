import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public abstract class Class1_Sub26 extends Class1 {

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "[I")
	public int[] anIntArray683;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
	public int anInt8988;

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
	public int anInt8991;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method7342(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method7344(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZIILjava/awt/Graphics;II)V")
	public abstract void method7345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);
}
