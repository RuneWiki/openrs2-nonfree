import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public abstract class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
	public int anInt9558;

	@OriginalMember(owner = "client!ll", name = "o", descriptor = "[I")
	public int[] anIntArray602;

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
	public int anInt9561;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method7777(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	public abstract void method7778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V")
	public abstract void method7779(@OriginalArg(0) Graphics arg0);
}
