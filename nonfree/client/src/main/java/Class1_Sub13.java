import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public abstract class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
	public int anInt9491;

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
	public int anInt9492;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "[I")
	public int[] anIntArray833;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
	public abstract void method8177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
	public abstract void method8178(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	public abstract void method8181(@OriginalArg(1) Canvas arg0);
}
