import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public abstract class Class8 {

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
	protected int anInt735;

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
	protected int anInt738;

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "[I")
	protected int[] anIntArray51;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
	public abstract void method519(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILjava/awt/Graphics;IZII)V")
	public abstract void method520(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
	public final void method523() {
		Static103.method2226(this.anIntArray51, this.anInt738, this.anInt735);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
	public abstract void method524(@OriginalArg(2) Graphics arg0);
}
