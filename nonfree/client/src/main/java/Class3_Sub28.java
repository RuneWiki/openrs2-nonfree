import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public abstract class Class3_Sub28 extends Class3 {

	@OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
	public int anInt8302;

	@OriginalMember(owner = "client!sca", name = "m", descriptor = "I")
	public int anInt8304;

	@OriginalMember(owner = "client!sca", name = "o", descriptor = "[I")
	public int[] anIntArray531;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
	public abstract void method6898(@OriginalArg(1) Graphics arg0);

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public abstract void method6899(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
	public abstract void method6900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4);
}
