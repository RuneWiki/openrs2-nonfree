import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class Class14 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
	protected int anInt1362;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "[I")
	protected int[] anIntArray102;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
	protected int anInt1364;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBIILjava/awt/Graphics;I)V")
	public abstract void method1190(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public final void method1192() {
		Static160.method2787(this.anIntArray102, this.anInt1362, this.anInt1364);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method1194(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
	public abstract void method1195(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2);
}
