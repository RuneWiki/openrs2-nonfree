import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class Class6 {

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
	protected int anInt1387;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	protected int anInt1390;

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "[I")
	public int[] anIntArray147;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBLjava/awt/Graphics;III)V")
	public abstract void method874(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/awt/Component;III)V")
	public abstract void method880(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/awt/Graphics;IIZ)V")
	public abstract void method881(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public final void method883() {
		Static77.method2219(this.anIntArray147, this.anInt1390, this.anInt1387);
	}
}
