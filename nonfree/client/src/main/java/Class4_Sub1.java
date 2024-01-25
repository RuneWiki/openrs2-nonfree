import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
	public int anInt8905;

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "[I")
	public int[] anIntArray680;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
	public int anInt8906;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	public abstract void method7318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Graphics arg4);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method7319(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method7320(@OriginalArg(1) Canvas arg0);
}
