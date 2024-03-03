import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public abstract class Class155 {

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
	public static int anInt5643 = 0;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "[I")
	public static final int[] anIntArray384 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
	public int anInt5642;

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "[I")
	public int[] anIntArray385;

	@OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
	public int anInt5646;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public abstract void method5151(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	public abstract void method5152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public abstract void method5153(@OriginalArg(0) Graphics arg0);
}
