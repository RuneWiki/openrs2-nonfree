import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class Class62 {

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
	protected int anInt5648;

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "[I")
	protected int[] anIntArray519;

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
	protected int anInt5651;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BILjava/awt/Component;I)V")
	public abstract void method4463(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method4466(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
	public final void method4468() {
		Static41.method738(this.anIntArray519, this.anInt5648, this.anInt5651);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	public abstract void method4469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(5) int arg4);
}
