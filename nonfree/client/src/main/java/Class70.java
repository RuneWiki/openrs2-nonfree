import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class Class70 {

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "[I")
	protected int[] anIntArray619;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
	protected int anInt3670;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
	protected int anInt3671;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public abstract void method2797(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
	public final void method2798() {
		Static147.method1780(this.anIntArray619, this.anInt3671, this.anInt3670);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	public abstract void method2800(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
	public abstract void method2802(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);
}
