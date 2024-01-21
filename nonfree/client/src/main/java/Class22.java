import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class Class22 {

	@OriginalMember(owner = "client!df", name = "i", descriptor = "I")
	protected int anInt3227;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "[I")
	protected int[] anIntArray236;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!df", name = "s", descriptor = "I")
	protected int anInt3234;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	public abstract void method2337(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method2338(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public final void method2341() {
		Static104.method3085(this.anIntArray236, this.anInt3227, this.anInt3234);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	public abstract void method2342(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);
}
