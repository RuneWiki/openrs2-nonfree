import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class Class29 {

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
	public int anInt2115;

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
	public int anInt2116;

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "[I")
	public int[] anIntArray239;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method1428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
	public abstract void method1429(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public final void method1431() {
		Static121.method1977(this.anIntArray239, this.anInt2115, this.anInt2116);
	}
}
