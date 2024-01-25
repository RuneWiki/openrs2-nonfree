import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public abstract class Class4_Sub22 extends Class4 {

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "[I")
	public int[] anIntArray409;

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
	public int anInt5856;

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
	public int anInt5857;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILjava/awt/Graphics;BI)V")
	public abstract void method4601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	public abstract void method4606(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method4608(@OriginalArg(3) Graphics arg0);
}
