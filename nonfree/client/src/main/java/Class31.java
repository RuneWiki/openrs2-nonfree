import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class Class31 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
	protected int anInt1411;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
	protected int anInt1417;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
	public abstract void method993(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V")
	public final void method996() {
		Static55.method1141(this.anIntArray212, this.anInt1411, this.anInt1417);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	public abstract void method997(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);
}
