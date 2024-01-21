import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class Class12 {

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[I")
	public int[] anIntArray152;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	protected int anInt822;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
	protected int anInt824;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method671(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	public abstract void method673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2);

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	public final void method674() {
		Static95.method1323(this.anIntArray152, this.anInt824, this.anInt822);
	}
}
