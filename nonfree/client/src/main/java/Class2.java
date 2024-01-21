import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class Class2 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
	protected int anInt2031;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
	protected int anInt2034;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	public abstract void method1317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public final void method1318() {
		Static66.method1838(this.anIntArray228, this.anInt2031, this.anInt2034);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method1322(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);
}
