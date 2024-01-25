import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public abstract class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!an", name = "o", descriptor = "I")
	public int anInt5666;

	@OriginalMember(owner = "client!an", name = "q", descriptor = "[I")
	public int[] anIntArray458;

	@OriginalMember(owner = "client!an", name = "t", descriptor = "I")
	public int anInt5670;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIBILjava/awt/Graphics;)V")
	public abstract void method4704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	public abstract void method4705(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BIILjava/awt/Graphics;)V")
	public abstract void method4707(@OriginalArg(3) Graphics arg0);
}
