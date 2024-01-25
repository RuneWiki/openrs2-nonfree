import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public abstract class Class4_Sub12 extends Class4 {

	@OriginalMember(owner = "client!nda", name = "h", descriptor = "I")
	public int anInt10264;

	@OriginalMember(owner = "client!nda", name = "i", descriptor = "[I")
	public int[] anIntArray710;

	@OriginalMember(owner = "client!nda", name = "j", descriptor = "I")
	public int anInt10265;

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Ljava/awt/Canvas;BII)V")
	public abstract void method8686(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIBLjava/awt/Graphics;III)V")
	public abstract void method8687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);
}
