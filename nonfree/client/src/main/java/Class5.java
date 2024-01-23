import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public abstract class Class5 {

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "[I")
	protected int[] anIntArray230;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
	protected int anInt2263;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
	protected int anInt2266;

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
	public abstract void method1710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLjava/awt/Component;II)V")
	public abstract void method1712(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public abstract void method1713(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
	public final void method1716() {
		Static203.method3591(this.anIntArray230, this.anInt2266, this.anInt2263);
	}
}
