import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class Class51 {

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
	protected int anInt2763;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "[I")
	public int[] anIntArray334;

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
	protected int anInt2765;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	public abstract void method1966(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method1967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2);

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
	public final void method1970() {
		Static91.method2016(this.anIntArray334, this.anInt2765, this.anInt2763);
	}
}
