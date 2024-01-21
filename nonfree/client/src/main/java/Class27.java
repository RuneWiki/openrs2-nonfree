import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class Class27 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
	protected int anInt2210;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "[I")
	public int[] anIntArray299;

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
	protected int anInt2212;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
	public abstract void method1536(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
	public abstract void method1538(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public final void method1540() {
		Static84.method1312(this.anIntArray299, this.anInt2210, this.anInt2212);
	}
}
