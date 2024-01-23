import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public abstract class Class73 {

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
	protected int anInt3856;

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "[I")
	protected int[] anIntArray283;

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
	protected int anInt3858;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
	public final void method2864() {
		Static189.method3199(this.anIntArray283, this.anInt3858, this.anInt3856);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
	public abstract void method2867(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	public abstract void method2868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2);

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	public abstract void method2870(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);
}
