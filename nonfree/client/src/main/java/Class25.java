import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class Class25 {

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
	public int[] anIntArray233;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
	protected int anInt1728;

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
	protected int anInt1730;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public final void method1157() {
		Static50.method1844(this.anIntArray233, this.anInt1730, this.anInt1728);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZILjava/awt/Component;)V")
	public abstract void method1160(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/awt/Graphics;ZI)V")
	public abstract void method1161(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2);
}
