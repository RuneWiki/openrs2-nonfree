import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public abstract class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
	public int anInt3325;

	@OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
	public int anInt3326;

	@OriginalMember(owner = "client!hca", name = "p", descriptor = "[I")
	public int[] anIntArray309;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	public abstract void method2908(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method2909(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	public abstract void method2910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4);
}
