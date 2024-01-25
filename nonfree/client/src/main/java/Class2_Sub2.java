import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
	public int anInt8383;

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
	public int anInt8384;

	@OriginalMember(owner = "client!ag", name = "w", descriptor = "[I")
	public int[] anIntArray422;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILjava/awt/Canvas;B)V")
	public abstract void method7470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIILjava/awt/Graphics;)V")
	public abstract void method7474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Graphics arg6);
}
