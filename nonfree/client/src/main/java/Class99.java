import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class Class99 {

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
	protected int anInt4427;

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "[I")
	protected int[] anIntArray395;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
	protected int anInt4431;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBLjava/awt/Component;)V")
	public abstract void method3510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method3514(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
	public abstract void method3515(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V")
	public final void method3516() {
		Static50.method958(this.anIntArray395, this.anInt4427, this.anInt4431);
	}
}
