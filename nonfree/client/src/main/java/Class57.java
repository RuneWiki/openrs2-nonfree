import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class Class57 {

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "[I")
	protected int[] anIntArray454;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	protected int anInt3060;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "Ljava/awt/Image;")
	protected Image anImage4;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
	protected int anInt3063;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method2169(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	public final void method2170() {
		Static113.method1234(this.anIntArray454, this.anInt3063, this.anInt3060);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	public abstract void method2171(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BILjava/awt/Component;I)V")
	public abstract void method2173(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2);
}
