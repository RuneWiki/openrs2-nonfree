import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public abstract class Class6_Sub13 extends Class6 {

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
	public int anInt5409;

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
	public int anInt5412;

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "[I")
	public int[] anIntArray420;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIILjava/awt/Graphics;BI)V")
	public abstract void method4477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	public abstract void method4478(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public abstract void method4479(@OriginalArg(0) Graphics arg0);
}
