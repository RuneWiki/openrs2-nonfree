import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class Class6 {

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
	protected int anInt1208;

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "[I")
	public int[] anIntArray182;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "Ljava/awt/Image;")
	protected Image anImage3;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
	protected int anInt1211;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
	public abstract void method906(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	public final void method907() {
		Static115.method1674(this.anIntArray182, this.anInt1208, this.anInt1211);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/awt/Graphics;ZIIII)V")
	public abstract void method908(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	public abstract void method910(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2);
}
