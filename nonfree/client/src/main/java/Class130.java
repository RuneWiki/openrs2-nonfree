import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class Class130 {

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "[I")
	protected int[] anIntArray591;

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
	protected int anInt5391;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
	protected int anInt5393;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public final void method4485() {
		Static77.method1594(this.anIntArray591, this.anInt5391, this.anInt5393);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZIILjava/awt/Graphics;)V")
	public abstract void method4486(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	public abstract void method4487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	public abstract void method4489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);
}
