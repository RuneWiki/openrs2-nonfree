import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
	public int anInt3250;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "[I")
	public int[] anIntArray117;

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
	public int anInt3251;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	public abstract void method2648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
	public abstract void method2650(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public abstract void method2651(@OriginalArg(0) Canvas arg0);
}
