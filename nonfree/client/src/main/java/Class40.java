import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class Class40 {

	@OriginalMember(owner = "client!j", name = "b", descriptor = "I")
	protected int anInt2920;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "I")
	protected int anInt2923;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "[I")
	protected int[] anIntArray321;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "Ljava/awt/Image;")
	protected Image anImage81;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public final void method2103() {
		Static172.method2019(this.anIntArray321, this.anInt2920, this.anInt2923);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/awt/Graphics;IIBII)V")
	public abstract void method2105(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
	public abstract void method2106(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IILjava/awt/Component;B)V")
	public abstract void method2107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2);
}
