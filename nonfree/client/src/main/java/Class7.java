import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public abstract class Class7 {

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
	protected int anInt1397;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
	protected int anInt1401;

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "[I")
	public int[] anIntArray269;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	public abstract void method1095(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public final void method1096() {
		Static128.method1932(this.anIntArray269, this.anInt1401, this.anInt1397);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	public abstract void method1097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2);
}
