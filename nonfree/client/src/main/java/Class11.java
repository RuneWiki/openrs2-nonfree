import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class Class11 {

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "[I")
	public int[] anIntArray487;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
	public int anInt3134;

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
	public int anInt3140;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public abstract void method2148(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	public abstract void method2150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public final void method2152() {
		Static118.method1859(this.anIntArray487, this.anInt3140, this.anInt3134);
	}
}
