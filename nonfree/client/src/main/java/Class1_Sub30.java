import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public abstract class Class1_Sub30 extends Class1 {

	@OriginalMember(owner = "client!we", name = "m", descriptor = "I")
	public int anInt5157;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "I")
	public int anInt5159;

	@OriginalMember(owner = "client!we", name = "t", descriptor = "[I")
	public int[] anIntArray338;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	public abstract void method4039(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
	public abstract void method4040(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
	public abstract void method4041(@OriginalArg(0) Graphics arg0);
}
