import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class Class34 {

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
	protected int anInt1832;

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
	protected int anInt1833;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	public final void method1138() {
		Static24.method1584(this.anIntArray210, this.anInt1832, this.anInt1833);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILjava/awt/Component;B)V")
	public abstract void method1140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method1144(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2);
}
