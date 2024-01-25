import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public abstract class Class4_Sub14 extends Class4 {

	@OriginalMember(owner = "client!pba", name = "s", descriptor = "I")
	public int anInt3636;

	@OriginalMember(owner = "client!pba", name = "v", descriptor = "[I")
	public int[] anIntArray179;

	@OriginalMember(owner = "client!pba", name = "x", descriptor = "I")
	public int anInt3640;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	public abstract void method2875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public abstract void method2877(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
	public abstract void method2878(@OriginalArg(1) Graphics arg0);
}
