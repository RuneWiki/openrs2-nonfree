import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class Class22 {

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "[I")
	protected int[] anIntArray166;

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
	protected int anInt1734;

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
	protected int anInt1736;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
	public final void method1213() {
		Static64.method1182(this.anIntArray166, this.anInt1736, this.anInt1734);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
	public abstract void method1214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BIIIILjava/awt/Graphics;)V")
	public abstract void method1216(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method1219(@OriginalArg(3) Graphics arg0);
}
