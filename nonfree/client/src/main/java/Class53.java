import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public abstract class Class53 {

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
	public int anInt1579;

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "[I")
	public int[] anIntArray73;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
	public int anInt1581;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	public abstract void method1384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public abstract void method1386(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
	public abstract void method1388(@OriginalArg(0) Graphics arg0);
}
