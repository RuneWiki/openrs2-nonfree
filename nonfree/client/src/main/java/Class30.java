import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class Class30 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	protected int anInt2716;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	protected int anInt2721;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "[I")
	protected int[] anIntArray301;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public final void method2023() {
		Static15.method2295(this.anIntArray301, this.anInt2716, this.anInt2721);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
	public abstract void method2024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method2026(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	public abstract void method2027(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);
}
