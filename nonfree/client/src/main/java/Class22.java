import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public abstract class Class22 {

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "[I")
	public int[] anIntArray223;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	protected int anInt1797;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	protected int anInt1799;

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V")
	public abstract void method1065(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	public abstract void method1067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public final void method1068() {
		Static99.method1901(this.anIntArray223, this.anInt1799, this.anInt1797);
	}
}
