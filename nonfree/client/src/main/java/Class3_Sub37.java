import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class Class3_Sub37 extends Class3 {

	@OriginalMember(owner = "client!si", name = "m", descriptor = "I")
	public int anInt10098;

	@OriginalMember(owner = "client!si", name = "q", descriptor = "[I")
	public int[] anIntArray613;

	@OriginalMember(owner = "client!si", name = "r", descriptor = "I")
	public int anInt10101;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
	public abstract void method8299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
	public abstract void method8300(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
