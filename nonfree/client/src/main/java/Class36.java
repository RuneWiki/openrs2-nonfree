import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class Class36 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
	protected int anInt2723;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
	protected int anInt2729;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "[I")
	protected int[] anIntArray332;

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public final void method1758() {
		Static46.method2003(this.anIntArray332, this.anInt2729, this.anInt2723);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBILjava/awt/Component;)V")
	public abstract void method1761(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIBLjava/awt/Graphics;)V")
	public abstract void method1763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Graphics arg4);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method1765(@OriginalArg(1) Graphics arg0);
}
