import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class Class94 {

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
	public int anInt4354;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "[I")
	public int[] anIntArray350;

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
	public int anInt4359;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public abstract void method4039(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
	public abstract void method4040(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIBILjava/awt/Graphics;I)V")
	public abstract void method4041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);
}
