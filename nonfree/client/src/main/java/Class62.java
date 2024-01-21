import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class Class62 {

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "I")
	protected int anInt3025;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "I")
	protected int anInt3026;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "[I")
	protected int[] anIntArray402;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public final void method1989() {
		Static110.method1720(this.anIntArray402, this.anInt3025, this.anInt3026);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method1990(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/awt/Component;IB)V")
	public abstract void method1991(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
	public abstract void method1992(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);
}
