import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!r", name = "o", descriptor = "Lclient!gba;")
	public static Class112 aClass112_8;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_83 = new Class173(33, 2);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!fa;ILjava/awt/Canvas;ILclient!jn;)Lclient!r;")
	public static synchronized Class44 method4987(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class176 arg4) {
		if (arg0 == 0) {
			return Static236.method3800(arg2, arg1);
		} else if (arg0 == 2) {
			return Static39.method490(arg2, arg1);
		} else if (arg0 == 1) {
			return Static20.method228(arg2, arg3, arg1);
		} else if (arg0 == 5) {
			return Static179.method3232(arg1, arg3, arg4, arg2);
		} else if (arg0 == 3) {
			return Static599.method6326(arg4, arg3, arg1, arg2);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Lclient!og;")
	public static Class247 method5002(@OriginalArg(1) int arg0) {
		@Pc(8) Class247[] local8 = Static580.method2690();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class247 local16 = local8[local10];
			if (arg0 == local16.anInt7261) {
				return local16;
			}
		}
		return null;
	}
}
