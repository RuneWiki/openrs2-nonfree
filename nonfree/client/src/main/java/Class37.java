import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class Class37 {

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
	public int[] anIntArray304;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
	protected int anInt2052;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
	protected int anInt2053;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "Ljava/awt/Image;")
	protected Image anImage5;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method1457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public final void method1459() {
		Static47.method1960(this.anIntArray304, this.anInt2053, this.anInt2052);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	public abstract void method1464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);
}
