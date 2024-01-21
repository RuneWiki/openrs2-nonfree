import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public abstract class Class4 {

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
	protected int anInt2232;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
	protected int anInt2234;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "[I")
	public int[] anIntArray283;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	public abstract void method1522(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method1525(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public final void method1527() {
		Static92.method1133(this.anIntArray283, this.anInt2234, this.anInt2232);
	}
}
