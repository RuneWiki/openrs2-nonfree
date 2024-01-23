import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class Class19 {

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "[I")
	protected int[] anIntArray71;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	protected int anInt1216;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
	protected int anInt1218;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZIIILjava/awt/Graphics;)V")
	public abstract void method882(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
	public abstract void method883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public final void method885() {
		Static96.method1625(this.anIntArray71, this.anInt1218, this.anInt1216);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method888(@OriginalArg(3) Graphics arg0);
}
