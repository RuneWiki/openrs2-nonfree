import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class Class34 {

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
	protected int anInt3433;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "[I")
	protected int[] anIntArray324;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
	protected int anInt3437;

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	public final void method2581() {
		Static126.method2131(this.anIntArray324, this.anInt3437, this.anInt3433);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
	public abstract void method2582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/awt/Component;II)V")
	public abstract void method2584(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
	public abstract void method2585(@OriginalArg(2) Graphics arg0);
}
