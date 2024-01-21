import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class Class14 {

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
	protected int anInt2029;

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "[I")
	public int[] anIntArray242;

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
	protected int anInt2036;

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "Ljava/awt/Image;")
	protected Image anImage23;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method1470(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
	public final void method1472() {
		Static54.method1585(this.anIntArray242, this.anInt2036, this.anInt2029);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	public abstract void method1474(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);
}
