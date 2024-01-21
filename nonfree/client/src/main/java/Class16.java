import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class Class16 {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "[I")
	public int[] anIntArray269;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "I")
	protected int anInt2578;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "I")
	protected int anInt2582;

	@OriginalMember(owner = "client!df", name = "r", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
	public abstract void method1664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2);

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public final void method1668() {
		Static40.method1897(this.anIntArray269, this.anInt2578, this.anInt2582);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/awt/Component;II)V")
	public abstract void method1669(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);
}
