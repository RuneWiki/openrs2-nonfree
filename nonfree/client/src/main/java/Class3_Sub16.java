import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public abstract class Class3_Sub16 extends Class3 {

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
	public int anInt9294;

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "[I")
	public int[] anIntArray582;

	@OriginalMember(owner = "client!ev", name = "n", descriptor = "I")
	public int anInt9296;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIBLjava/awt/Canvas;)V")
	public abstract void method7950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Canvas arg2);

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIILjava/awt/Graphics;I)V")
	public abstract void method7952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Graphics arg5, @OriginalArg(7) int arg6);
}
