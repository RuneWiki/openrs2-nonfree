import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public abstract class Class77 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
	public int anInt5685;

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "[I")
	public int[] anIntArray499;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
	public int anInt5690;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public abstract void method5040(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	public abstract void method5043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method5044(@OriginalArg(3) Graphics arg0);
}
