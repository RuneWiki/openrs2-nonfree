import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class Class9 {

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
	protected int anInt1285;

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
	protected int anInt1292;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "[I")
	public int[] anIntArray169;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	public final void method861() {
		Static81.method1645(this.anIntArray169, this.anInt1285, this.anInt1292);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Graphics;IZI)V")
	public abstract void method863(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	public abstract void method866(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);
}
