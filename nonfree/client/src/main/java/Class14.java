import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class Class14 {

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[I")
	public int[] anIntArray124;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
	protected int anInt1209;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	protected int anInt1213;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public final void method687() {
		Static34.method1655(this.anIntArray124, this.anInt1209, this.anInt1213);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public abstract void method690(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	public abstract void method691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
	public abstract void method692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);
}
