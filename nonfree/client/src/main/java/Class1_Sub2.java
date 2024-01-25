import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "[I")
	public int[] anIntArray489;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
	public int anInt7368;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
	public int anInt7369;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLjava/awt/Graphics;II)V")
	public abstract void method5563(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V")
	public abstract void method5564(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	public abstract void method5565(@OriginalArg(0) Canvas arg0);
}
