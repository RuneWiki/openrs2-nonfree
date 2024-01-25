import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
	public int anInt7027;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
	public int anInt7029;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "[I")
	public int[] anIntArray667;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	public abstract void method5360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZLjava/awt/Graphics;)V")
	public abstract void method5361(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method5363(@OriginalArg(1) Canvas arg0);
}
