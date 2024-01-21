import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class Class42 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "[I")
	protected int[] anIntArray423;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "I")
	protected int anInt3931;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "I")
	protected int anInt3932;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public final void method3015() {
		Static145.method2936(this.anIntArray423, this.anInt3931, this.anInt3932);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	public abstract void method3017(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method3018(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
	public abstract void method3021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4);
}
