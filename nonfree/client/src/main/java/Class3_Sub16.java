import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public abstract class Class3_Sub16 extends Class3 {

	@OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
	public int anInt7442;

	@OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
	public int anInt7443;

	@OriginalMember(owner = "client!rm", name = "x", descriptor = "[I")
	public int[] anIntArray562;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
	public abstract void method5825(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	public abstract void method5830(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method5831(@OriginalArg(1) Canvas arg0);
}
