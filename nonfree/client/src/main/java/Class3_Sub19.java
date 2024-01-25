import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class Class3_Sub19 extends Class3 {

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
	public int anInt8143;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "[I")
	public int[] anIntArray623;

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
	public int anInt8145;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
	public abstract void method6858(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	public abstract void method6860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public abstract void method6861(@OriginalArg(0) Canvas arg0);
}
