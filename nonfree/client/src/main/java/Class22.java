import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class Class22 {

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
	protected int anInt2388;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	protected int anInt2390;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "[I")
	protected int[] anIntArray180;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
	public abstract void method1657(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	public abstract void method1658(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
	public final void method1659() {
		Static46.method3164(this.anIntArray180, this.anInt2390, this.anInt2388);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	public abstract void method1662(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2);
}
