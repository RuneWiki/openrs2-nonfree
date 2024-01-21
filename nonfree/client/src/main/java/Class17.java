import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public abstract class Class17 {

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
	protected int anInt1881;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
	protected int anInt1883;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "[I")
	protected int[] anIntArray158;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
	public abstract void method1247(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
	public abstract void method1250(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public final void method1251() {
		Static63.method1999(this.anIntArray158, this.anInt1883, this.anInt1881);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	public abstract void method1252(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4);
}
