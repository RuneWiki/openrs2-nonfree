import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class Class6 {

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
	public int[] anIntArray288;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
	protected int anInt2220;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
	protected int anInt2222;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public final void method1597() {
		Static118.method2064(this.anIntArray288, this.anInt2222, this.anInt2220);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
	public abstract void method1598(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	public abstract void method1599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public abstract void method1601(@OriginalArg(0) Graphics arg0);
}
