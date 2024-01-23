import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public abstract class Class58 {

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
	protected int anInt3438;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "[I")
	protected int[] anIntArray289;

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
	protected int anInt3446;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method2967(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	public final void method2968() {
		Static25.method388(this.anIntArray289, this.anInt3438, this.anInt3446);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIZILjava/awt/Graphics;I)V")
	public abstract void method2973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLjava/awt/Component;II)V")
	public abstract void method2974(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);
}
