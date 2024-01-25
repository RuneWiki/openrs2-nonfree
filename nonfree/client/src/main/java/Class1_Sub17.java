import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
	public int anInt7726;

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
	public int anInt7727;

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "[I")
	public int[] anIntArray581;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public abstract void method5953(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	public abstract void method5956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
	public abstract void method5957(@OriginalArg(0) Graphics arg0);
}
