import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public abstract class Class15 {

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "I")
	protected int anInt992;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "[I")
	public int[] anIntArray113;

	@OriginalMember(owner = "client!w", name = "q", descriptor = "I")
	protected int anInt996;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Component;IIZ)V")
	public abstract void method590(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method594(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	public final void method597() {
		Static45.method1529(this.anIntArray113, this.anInt992, this.anInt996);
	}
}
