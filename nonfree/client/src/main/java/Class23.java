import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public abstract class Class23 {

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
	protected int anInt2866;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
	protected int anInt2868;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "[I")
	protected int[] anIntArray249;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLjava/awt/Component;II)V")
	public abstract void method2198(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZLjava/awt/Graphics;II)V")
	public abstract void method2200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	public final void method2204() {
		Static205.method3242(this.anIntArray249, this.anInt2868, this.anInt2866);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public abstract void method2205(@OriginalArg(0) Graphics arg0);
}
