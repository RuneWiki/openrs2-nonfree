import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class Class8 {

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "[I")
	protected int[] anIntArray349;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
	protected int anInt3712;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
	protected int anInt3714;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
	public abstract void method2590(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	public abstract void method2591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4);

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
	public final void method2593() {
		Static161.method2807(this.anIntArray349, this.anInt3714, this.anInt3712);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	public abstract void method2595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2);
}
