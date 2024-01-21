import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class Class30 {

	@OriginalMember(owner = "client!md", name = "e", descriptor = "I")
	protected int anInt1164;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "[I")
	public int[] anIntArray80;

	@OriginalMember(owner = "client!md", name = "o", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "I")
	protected int anInt1168;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method811(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2);

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public final void method813() {
		Static6.method1499(this.anIntArray80, this.anInt1168, this.anInt1164);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/awt/Component;III)V")
	public abstract void method814(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);
}
