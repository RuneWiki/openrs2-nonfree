import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class Class6 {

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "[I")
	public int[] anIntArray90;

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
	protected int anInt805;

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
	protected int anInt807;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
	public abstract void method531(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	public abstract void method533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4);

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
	public final void method536() {
		Static17.method1675(this.anIntArray90, this.anInt805, this.anInt807);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	public abstract void method538(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2);
}
