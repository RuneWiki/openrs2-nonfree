import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class Class86 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
	public int anInt5892;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
	public int anInt5895;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "[I")
	public int[] anIntArray480;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public abstract void method5026(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
	public abstract void method5027(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	public abstract void method5028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4);
}
