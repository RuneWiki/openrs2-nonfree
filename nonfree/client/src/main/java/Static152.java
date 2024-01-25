import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!hg", name = "x", descriptor = "Lclient!qs;")
	public static Class211 aClass211_40;

	@OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
	public static int anInt3234;

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "[I")
	public static final int[] anIntArray332 = new int[200];

	@OriginalMember(owner = "client!hg", name = "A", descriptor = "Lclient!fb;")
	public static final Class82 aClass82_1 = Static94.method1627();

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!qs;B)V")
	public static void method2398(@OriginalArg(0) Class211 arg0) {
		Static14.aClass211_7 = arg0;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIBII)V")
	public static void method2399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(5) int local5 = 0; local5 < Static316.anInt5918; local5++) {
			@Pc(10) Rectangle local10 = Class30_Sub1_Sub1_Sub2.aRectangleArray2[local5];
			if (local10.width + local10.x > arg3 && local10.x < arg1 + arg3 && local10.height + local10.y > arg0 && local10.y < arg0 + arg2) {
				Static58.aBooleanArray8[local5] = true;
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V")
	public static void method2400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class1_Sub1_Sub11 local16 = Static248.method3707(arg0, 13);
		local16.method2957();
		local16.anInt3820 = arg1;
	}
}
