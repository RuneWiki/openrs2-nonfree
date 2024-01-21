import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class Class15 {

	@OriginalMember(owner = "client!da", name = "d", descriptor = "I")
	protected int anInt1881;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "I")
	protected int anInt1887;

	@OriginalMember(owner = "client!da", name = "t", descriptor = "[I")
	public int[] anIntArray257;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public final void method1098() {
		Static43.method1817(this.anIntArray257, this.anInt1887, this.anInt1881);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method1104(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/awt/Component;II)V")
	public abstract void method1105(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2);
}
