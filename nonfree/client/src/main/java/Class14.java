import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class Class14 {

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
	protected int anInt4217;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
	protected int anInt4220;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "[I")
	protected int[] anIntArray401;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public abstract void method3221(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	public final void method3223() {
		Static155.method3000(this.anIntArray401, this.anInt4220, this.anInt4217);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/awt/Component;III)V")
	public abstract void method3224(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/awt/Graphics;IIIBI)V")
	public abstract void method3226(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4);
}
