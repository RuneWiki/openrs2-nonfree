import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public abstract class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!lea", name = "k", descriptor = "I")
	public int anInt8241;

	@OriginalMember(owner = "client!lea", name = "l", descriptor = "I")
	public int anInt8242;

	@OriginalMember(owner = "client!lea", name = "n", descriptor = "[I")
	public int[] anIntArray439;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
	public abstract void method6778(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2);

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIILjava/awt/Graphics;II)V")
	public abstract void method6780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);
}
