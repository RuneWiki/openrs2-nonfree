import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public abstract class Class44 {

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
	protected int anInt3102;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
	protected int anInt3105;

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "[I")
	protected int[] anIntArray356;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
	public final void method2448() {
		Static133.method2121(this.anIntArray356, this.anInt3102, this.anInt3105);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method2450(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	public abstract void method2451(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	public abstract void method2453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);
}
