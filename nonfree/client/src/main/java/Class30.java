import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class Class30 {

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "[I")
	public int[] anIntArray411;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt5276;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
	public int anInt5277;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	public abstract void method4460(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public abstract void method4462(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
	public abstract void method4463(@OriginalArg(0) Graphics arg0);
}
