import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public abstract class Class2_Sub21 extends Class2 {

	@OriginalMember(owner = "client!fea", name = "i", descriptor = "I")
	public int anInt9341;

	@OriginalMember(owner = "client!fea", name = "j", descriptor = "I")
	public int anInt9342;

	@OriginalMember(owner = "client!fea", name = "k", descriptor = "[I")
	public int[] anIntArray761;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method7764(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method7766(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	public abstract void method7767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Graphics arg4);
}
