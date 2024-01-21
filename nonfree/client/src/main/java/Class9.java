import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public abstract class Class9 {

	@OriginalMember(owner = "client!re", name = "e", descriptor = "[I")
	public int[] anIntArray326;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "I")
	protected int anInt2306;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "I")
	protected int anInt2308;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method1585(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
	public final void method1589() {
		Static58.method696(this.anIntArray326, this.anInt2308, this.anInt2306);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	public abstract void method1590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2);
}
