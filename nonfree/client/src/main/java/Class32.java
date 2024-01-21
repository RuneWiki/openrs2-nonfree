import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class Class32 {

	@OriginalMember(owner = "client!id", name = "c", descriptor = "I")
	protected int anInt1825;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "I")
	protected int anInt1828;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "[I")
	protected int[] anIntArray222;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	public abstract void method1274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V")
	public abstract void method1275(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method1278(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
	public final void method1279() {
		Static24.method2578(this.anIntArray222, this.anInt1825, this.anInt1828);
	}
}
