import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public abstract class Class24 {

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "[I")
	protected int[] anIntArray207;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
	protected int anInt2152;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
	protected int anInt2155;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
	public final void method1745() {
		Static10.method1847(this.anIntArray207, this.anInt2155, this.anInt2152);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	public abstract void method1747(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
	public abstract void method1748(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	public abstract void method1749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);
}
