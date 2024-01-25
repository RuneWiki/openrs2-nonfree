import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public abstract class Class14_Sub32 extends Class14 {

	@OriginalMember(owner = "client!nt", name = "n", descriptor = "I")
	public int anInt10670;

	@OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
	public int anInt10672;

	@OriginalMember(owner = "client!nt", name = "r", descriptor = "[I")
	public int[] anIntArray568;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/awt/Canvas;ZII)V")
	public abstract void method9117(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILjava/awt/Graphics;IIIBII)V")
	public abstract void method9118(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);
}
