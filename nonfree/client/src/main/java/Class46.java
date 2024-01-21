import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public abstract class Class46 {

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "[I")
	protected int[] anIntArray297;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
	protected int anInt3423;

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
	protected int anInt3426;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public final void method2377() {
		Static212.method3111(this.anIntArray297, this.anInt3426, this.anInt3423);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method2380(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIBLjava/awt/Graphics;II)V")
	public abstract void method2381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILjava/awt/Component;B)V")
	public abstract void method2382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2);
}
