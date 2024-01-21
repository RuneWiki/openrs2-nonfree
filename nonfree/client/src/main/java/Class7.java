import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class Class7 {

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "[I")
	public int[] anIntArray116;

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
	protected int anInt950;

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
	protected int anInt953;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Component;III)V")
	public abstract void method695(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
	public abstract void method697(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public final void method699() {
		Static52.method2015(this.anIntArray116, this.anInt950, this.anInt953);
	}
}
