import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public abstract class Class6_Sub7 extends Class6 {

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
	public int anInt5817;

	@OriginalMember(owner = "client!sr", name = "r", descriptor = "[I")
	public int[] anIntArray395;

	@OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
	public int anInt5821;

	static {
		new Class267(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
	public abstract void method4868(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
	public abstract void method4871(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public abstract void method4874(@OriginalArg(0) Canvas arg0);
}
