import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public abstract class Class7_Sub5 extends Class7 {

	@OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
	public int anInt6466;

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "I")
	public int anInt6469;

	@OriginalMember(owner = "client!gw", name = "m", descriptor = "[I")
	public int[] anIntArray577;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method5130(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	public abstract void method5132(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method5134(@OriginalArg(1) Canvas arg0);
}
