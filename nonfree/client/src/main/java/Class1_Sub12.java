import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public abstract class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "[I")
	public int[] anIntArray237;

	@OriginalMember(owner = "client!vs", name = "q", descriptor = "I")
	public int anInt3186;

	@OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
	public int anInt3188;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	public abstract void method2580(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public abstract void method2584(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V")
	public abstract void method2585(@OriginalArg(0) Graphics arg0);
}
