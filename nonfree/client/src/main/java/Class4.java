import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public abstract class Class4 {

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
	protected int anInt4964;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
	protected int anInt4965;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "[I")
	protected int[] anIntArray375;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLjava/awt/Component;II)V")
	public abstract void method3759(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	public final void method3760() {
		Static103.method1675(this.anIntArray375, this.anInt4964, this.anInt4965);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	public abstract void method3762(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method3763(@OriginalArg(1) Graphics arg0);
}
