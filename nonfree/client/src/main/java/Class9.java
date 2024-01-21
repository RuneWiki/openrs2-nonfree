import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class Class9 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
	protected int anInt1140;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "[I")
	public int[] anIntArray81;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
	protected int anInt1147;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public final void method682() {
		Static97.method1736(this.anIntArray81, this.anInt1140, this.anInt1147);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/awt/Component;IBI)V")
	public abstract void method685(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void method686(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);
}
