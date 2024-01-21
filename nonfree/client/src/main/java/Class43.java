import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class Class43 {

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	protected int anInt3160;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "[I")
	public int[] anIntArray452;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
	protected int anInt3162;

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	public abstract void method2192(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public final void method2194() {
		Static33.method1975(this.anIntArray452, this.anInt3160, this.anInt3162);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	public abstract void method2198(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	public abstract void method2199(@OriginalArg(0) Graphics arg0);
}
