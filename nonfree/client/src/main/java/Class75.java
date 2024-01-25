import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public abstract class Class75 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
	public int anInt3950;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
	public int anInt3952;

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "[I")
	public int[] anIntArray549;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method3579(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILjava/awt/Graphics;IIIB)V")
	public abstract void method3581(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public abstract void method3582(@OriginalArg(0) Canvas arg0);
}
