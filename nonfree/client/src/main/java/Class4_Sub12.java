import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public abstract class Class4_Sub12 extends Class4 {

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
	public int anInt7426;

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
	public int anInt7429;

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "[I")
	public int[] anIntArray376;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	public abstract void method6129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	public abstract void method6130(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method6131(@OriginalArg(1) Canvas arg0);
}
