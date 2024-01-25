import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public abstract class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!sfa", name = "k", descriptor = "I")
	public int anInt6570;

	@OriginalMember(owner = "client!sfa", name = "l", descriptor = "I")
	public int anInt6571;

	@OriginalMember(owner = "client!sfa", name = "n", descriptor = "[I")
	public int[] anIntArray482;

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIBLjava/awt/Graphics;IIII)V")
	public abstract void method5617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILjava/awt/Canvas;IB)V")
	public abstract void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2);
}
