import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class Class6 {

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "[I")
	public int[] anIntArray241;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
	protected int anInt2068;

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
	protected int anInt2071;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	public final void method1350() {
		Static111.method1764(this.anIntArray241, this.anInt2071, this.anInt2068);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
	public abstract void method1352(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method1355(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILjava/awt/Component;IB)V")
	public abstract void method1356(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2);
}
