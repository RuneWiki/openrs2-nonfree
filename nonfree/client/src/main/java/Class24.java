import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public abstract class Class24 {

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
	protected int anInt3066;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
	protected int anInt3067;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "[I")
	protected int[] anIntArray329;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method2287(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIBILjava/awt/Graphics;I)V")
	public abstract void method2290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/awt/Component;III)V")
	public abstract void method2291(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
	public final void method2292() {
		Static42.method804(this.anIntArray329, this.anInt3067, this.anInt3066);
	}
}
