import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public abstract class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!nca", name = "i", descriptor = "[I")
	public int[] anIntArray433;

	@OriginalMember(owner = "client!nca", name = "l", descriptor = "I")
	public int anInt6743;

	@OriginalMember(owner = "client!nca", name = "m", descriptor = "I")
	public int anInt6744;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	public abstract void method5585(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public abstract void method5586(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
	public abstract void method5587(@OriginalArg(1) Graphics arg0);
}
