import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public abstract class Class123 {

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
	public int anInt5985;

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "[I")
	public int[] anIntArray643;

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
	public int anInt5987;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method5332(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	public abstract void method5335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4);

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
	public abstract void method5336(@OriginalArg(3) Graphics arg0);
}
