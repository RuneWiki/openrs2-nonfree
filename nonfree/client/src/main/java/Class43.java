import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public abstract class Class43 {

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
	protected int anInt2724;

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "[I")
	public int[] anIntArray395;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
	protected int anInt2728;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	public abstract void method1904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2);

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	public final void method1906() {
		Static46.method1830(this.anIntArray395, this.anInt2728, this.anInt2724);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBIIILjava/awt/Graphics;)V")
	public abstract void method1907(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4);

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method1908(@OriginalArg(2) Graphics arg0);
}
