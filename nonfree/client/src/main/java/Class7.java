import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public abstract class Class7 {

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
	protected int anInt1518;

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "[I")
	protected int[] anIntArray130;

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
	protected int anInt1520;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjava/awt/Component;II)V")
	public abstract void method1182(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	public abstract void method1184(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
	public final void method1185() {
		Static90.method3499(this.anIntArray130, this.anInt1518, this.anInt1520);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
	public abstract void method1186(@OriginalArg(0) Graphics arg0);
}
