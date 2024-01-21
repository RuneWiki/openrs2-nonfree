import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class Class45 {

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Ljava/awt/Image;")
	protected Image anImage5;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "I")
	protected int anInt2148;

	@OriginalMember(owner = "client!p", name = "k", descriptor = "I")
	protected int anInt2152;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "[I")
	public int[] anIntArray471;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	public abstract void method1473(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method1474(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public final void method1476() {
		Static26.method1604(this.anIntArray471, this.anInt2148, this.anInt2152);
	}
}
