import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public abstract class Class3 {

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "[I")
	protected int[] anIntArray307;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
	protected int anInt3335;

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
	protected int anInt3337;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
	public abstract void method2410(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Component;III)V")
	public abstract void method2412(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	public final void method2413() {
		Static231.method3639(this.anIntArray307, this.anInt3335, this.anInt3337);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIB)V")
	public abstract void method2414(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
