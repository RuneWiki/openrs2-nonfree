import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class Class6 {

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "[I")
	public int[] anIntArray467;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
	protected int anInt2986;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	protected int anInt2987;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILjava/awt/Component;BI)V")
	public abstract void method2065(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method2067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	public final void method2069() {
		Static15.method1502(this.anIntArray467, this.anInt2987, this.anInt2986);
	}
}
