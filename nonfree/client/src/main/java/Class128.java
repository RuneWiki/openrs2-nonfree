import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class Class128 {

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
	protected int anInt5227;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
	protected int anInt5230;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "[I")
	protected int[] anIntArray549;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
	public abstract void method4291(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public final void method4293() {
		Static143.method2446(this.anIntArray549, this.anInt5227, this.anInt5230);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Component;III)V")
	public abstract void method4294(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	public abstract void method4295(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4);
}
