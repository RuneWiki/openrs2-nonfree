import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
	public static int anInt5262 = -1;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!wo;I)V")
	public static void method4602(@OriginalArg(0) Class216 arg0) {
		Static252.aClass216_82 = arg0;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)V")
	public static void method4603() {
		@Pc(1) Class18 local1 = Static357.aClass18_3;
		synchronized (Static357.aClass18_3) {
			Static357.aClass18_3.method568();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIII)V")
	public static void method4604(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 0; local11 < Static47.anInt1510; local11++) {
			@Pc(17) Rectangle local17 = Class1_Sub4_Sub13.aRectangleArray5[local11];
			if (arg0 < local17.width + local17.x && local17.x < arg2 + arg0 && arg1 < local17.height + local17.y && arg1 + arg3 > local17.y) {
				Static161.aBooleanArray16[local11] = true;
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)Lclient!na;")
	public static Class139 method4606(@OriginalArg(1) int arg0) {
		@Pc(10) Class139 local10 = (Class139) Static68.aClass87_15.method2482((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static195.aClass216_66.method5648(36, arg0);
		local10 = new Class139();
		local10.anInt4238 = arg0;
		if (local25 != null) {
			local10.method3819(new Class1_Sub8(local25));
		}
		local10.method3816();
		Static68.aClass87_15.method2481(local10, (long) arg0);
		return local10;
	}
}
