import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public abstract class Class6_Sub13 extends Class6 {

	@OriginalMember(owner = "client!cs", name = "m", descriptor = "[I")
	public int[] anIntArray729;

	@OriginalMember(owner = "client!cs", name = "r", descriptor = "I")
	public int anInt8669;

	@OriginalMember(owner = "client!cs", name = "s", descriptor = "I")
	public int anInt8670;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method7241(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjava/awt/Graphics;IIIB)V")
	public abstract void method7245(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method7246(@OriginalArg(1) Graphics arg0);
}
