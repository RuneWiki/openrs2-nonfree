import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class Class6_Sub27 extends Class6 {

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
	public int anInt7917;

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
	public int anInt7918;

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "[I")
	public int[] anIntArray481;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
	public abstract void method6786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILjava/awt/Canvas;I)V")
	public abstract void method6791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2);
}
