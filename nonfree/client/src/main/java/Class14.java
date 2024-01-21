import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class Class14 {

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "I")
	protected int anInt4129;

	@OriginalMember(owner = "client!s", name = "m", descriptor = "I")
	protected int anInt4130;

	@OriginalMember(owner = "client!s", name = "q", descriptor = "[I")
	protected int[] anIntArray455;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IBIILjava/awt/Graphics;I)V")
	public abstract void method3031(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
	public abstract void method3032(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
	public abstract void method3033(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
	public final void method3036() {
		Static128.method567(this.anIntArray455, this.anInt4129, this.anInt4130);
	}
}
