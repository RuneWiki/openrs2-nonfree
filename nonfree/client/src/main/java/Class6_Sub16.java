import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class Class6_Sub16 extends Class6 {

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "[I")
	public int[] anIntArray574;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
	public int anInt7173;

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
	public int anInt7174;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	public abstract void method5951(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
	public abstract void method5952(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public abstract void method5956(@OriginalArg(0) Canvas arg0);
}
