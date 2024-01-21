import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class Class7 {

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
	protected int anInt2976;

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "[I")
	public int[] anIntArray353;

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
	protected int anInt2978;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/awt/Graphics;ZIIII)V")
	public abstract void method2127(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	public abstract void method2130(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
	public abstract void method2132(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V")
	public final void method2133() {
		Static6.method1698(this.anIntArray353, this.anInt2978, this.anInt2976);
	}
}
