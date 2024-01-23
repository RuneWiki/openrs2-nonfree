import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public abstract class Class35 {

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "[I")
	protected int[] anIntArray468;

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
	protected int anInt4130;

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
	protected int anInt4132;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method3257(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBIILjava/awt/Graphics;I)V")
	public abstract void method3258(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	public abstract void method3261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)V")
	public final void method3264() {
		Static29.method408(this.anIntArray468, this.anInt4130, this.anInt4132);
	}
}
