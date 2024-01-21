import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class Class25 {

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
	protected int anInt3967;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
	protected int anInt3969;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "[I")
	protected int[] anIntArray543;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	public final void method2789() {
		Static150.method3025(this.anIntArray543, this.anInt3969, this.anInt3967);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	public abstract void method2790(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	public abstract void method2791(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public abstract void method2795(@OriginalArg(0) Graphics arg0);
}
