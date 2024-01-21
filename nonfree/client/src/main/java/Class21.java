import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class Class21 {

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
	protected int anInt2141;

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
	protected int anInt2143;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	public abstract void method1442(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	public abstract void method1443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2);

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	public final void method1445() {
		Static53.method1278(this.anIntArray212, this.anInt2143, this.anInt2141);
	}
}
