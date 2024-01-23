import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public abstract class Class42 {

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "[I")
	protected int[] anIntArray391;

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
	protected int anInt4983;

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
	protected int anInt4984;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/awt/Graphics;IZII)V")
	public abstract void method3930(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	public abstract void method3931(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BIILjava/awt/Component;)V")
	public abstract void method3933(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	public final void method3934() {
		Static258.method4016(this.anIntArray391, this.anInt4984, this.anInt4983);
	}
}
