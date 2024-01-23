import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class Class10 {

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
	protected int anInt3437;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
	protected int anInt3438;

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "[I")
	protected int[] anIntArray563;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method2687(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/awt/Component;II)V")
	public abstract void method2688(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/awt/Graphics;IIBII)V")
	public abstract void method2691(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	public final void method2692() {
		Static217.method3765(this.anIntArray563, this.anInt3437, this.anInt3438);
	}
}
