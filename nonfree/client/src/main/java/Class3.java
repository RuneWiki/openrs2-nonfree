import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class Class3 {

	@OriginalMember(owner = "client!v", name = "b", descriptor = "I")
	protected int anInt5627;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "[I")
	protected int[] anIntArray536;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "I")
	protected int anInt5629;

	@OriginalMember(owner = "client!v", name = "f", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
	public abstract void method4440(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	public final void method4441() {
		Static77.method1460(this.anIntArray536, this.anInt5627, this.anInt5629);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	public abstract void method4444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	public abstract void method4447(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);
}
