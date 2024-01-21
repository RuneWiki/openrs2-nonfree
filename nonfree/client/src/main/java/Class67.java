import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class Class67 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "I")
	protected int anInt3998;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "I")
	protected int anInt4000;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "[I")
	protected int[] anIntArray387;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method2705(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/awt/Component;II)V")
	public abstract void method2708(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	public final void method2710() {
		Static53.method2492(this.anIntArray387, this.anInt3998, this.anInt4000);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	public abstract void method2711(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4);
}
