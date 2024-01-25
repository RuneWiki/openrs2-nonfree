import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public abstract class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
	public int anInt9943;

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "[I")
	public int[] anIntArray656;

	@OriginalMember(owner = "client!fr", name = "t", descriptor = "I")
	public int anInt9945;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	public abstract void method8074(@OriginalArg(0) Graphics arg0);

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	public abstract void method8076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public abstract void method8080(@OriginalArg(0) Canvas arg0);
}
