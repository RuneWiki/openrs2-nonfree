import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class Class119 {

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "[I")
	protected int[] anIntArray437;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
	protected int anInt4946;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
	protected int anInt4949;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	public final void method3926() {
		Static166.method2623(this.anIntArray437, this.anInt4949, this.anInt4946);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILjava/awt/Component;II)V")
	public abstract void method3927(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIZLjava/awt/Graphics;II)V")
	public abstract void method3928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	public abstract void method3931(@OriginalArg(0) Graphics arg0);
}
