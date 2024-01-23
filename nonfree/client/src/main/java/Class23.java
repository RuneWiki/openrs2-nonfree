import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class Class23 {

	@OriginalMember(owner = "client!si", name = "c", descriptor = "I")
	protected int anInt1238;

	@OriginalMember(owner = "client!si", name = "d", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "I")
	protected int anInt1239;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "[I")
	protected int[] anIntArray144;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
	public abstract void method1010(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
	public final void method1012() {
		Static213.method3381(this.anIntArray144, this.anInt1238, this.anInt1239);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIZILjava/awt/Graphics;I)V")
	public abstract void method1013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method1016(@OriginalArg(2) Graphics arg0);
}
