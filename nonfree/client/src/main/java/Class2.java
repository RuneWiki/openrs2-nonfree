import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class Class2 {

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
	protected int anInt1355;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
	protected int anInt1357;

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "[I")
	public int[] anIntArray145;

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method989(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
	public abstract void method990(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public final void method993() {
		Static80.method1710(this.anIntArray145, this.anInt1355, this.anInt1357);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
	public abstract void method994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4);
}
