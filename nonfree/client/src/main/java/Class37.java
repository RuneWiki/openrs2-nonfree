import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class Class37 {

	@OriginalMember(owner = "client!se", name = "d", descriptor = "[I")
	protected int[] anIntArray228;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "I")
	protected int anInt2037;

	@OriginalMember(owner = "client!se", name = "f", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "I")
	protected int anInt2040;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method1446(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IILjava/awt/Component;B)V")
	public abstract void method1448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public final void method1451() {
		Static194.method3101(this.anIntArray228, this.anInt2037, this.anInt2040);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	public abstract void method1452(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);
}
