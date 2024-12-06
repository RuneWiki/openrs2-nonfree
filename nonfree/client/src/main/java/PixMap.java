import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class Class11 {

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
	protected int anInt883;

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
	protected int anInt884;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "[I")
	public int[] anIntArray104;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public final void method577() {
		Static118.method1372(this.anIntArray104, this.anInt883, this.anInt884);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public abstract void method578(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	public abstract void method580(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
	public abstract void method582(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);
}
