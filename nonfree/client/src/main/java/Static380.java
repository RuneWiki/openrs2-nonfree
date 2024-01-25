import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "[Lclient!aq;")
	public static Class5[] aClass5Array19;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
	public static int anInt6629 = 0;

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_203 = new Class41(80, 3);

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "Lclient!ms;")
	public static Class155 aClass155_38 = null;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIB)V")
	public static void method5676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(16) int local16 = 0; local16 < Static318.anInt4651; local16++) {
			@Pc(22) Rectangle local22 = Class2.aRectangleArray120[local16];
			if (local22.x + local22.width > arg1 && arg0 + arg1 > local22.x && arg2 < local22.height + local22.y && arg3 + arg2 > local22.y) {
				Static185.aBooleanArray73[local16] = true;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!bc;ILjava/awt/Canvas;)Lclient!km;")
	public static Class82 method5677(@OriginalArg(0) int arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(3) Canvas arg2) {
		return new Class82_Sub1(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!fc;B)Lclient!ss;")
	public static Class216 method5678(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1) {
		@Pc(13) byte[] local13 = arg1.method1564(arg0);
		return local13 == null ? null : new Class216(local13);
	}
}
