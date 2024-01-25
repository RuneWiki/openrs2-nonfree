import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class Class2_Sub17 extends Class2 {

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "[I")
	public int[] anIntArray302;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public int anInt4543;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public int anInt4544;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method3774(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
	public abstract void method3777(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIILjava/awt/Graphics;BI)V")
	public abstract void method3778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(5) int arg4);
}
