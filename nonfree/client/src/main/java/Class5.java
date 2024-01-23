import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public abstract class Class5 {

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "[I")
	protected int[] anIntArray332;

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
	protected int anInt2632;

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
	protected int anInt2633;

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "Ljava/awt/Image;")
	protected Image anImage25;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	public abstract void method1976(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
	public final void method1979() {
		Static76.method1359(this.anIntArray332, this.anInt2632, this.anInt2633);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	public abstract void method1980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Graphics arg4);

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
	public abstract void method1981(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);
}
