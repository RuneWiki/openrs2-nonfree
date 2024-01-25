import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static451 {

	@OriginalMember(owner = "client!r", name = "i", descriptor = "I")
	public static int anInt8490;

	@OriginalMember(owner = "client!r", name = "j", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_141 = new Class349(80, 8);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Z")
	public static boolean method6826(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(JJ)J")
	public static long method6871(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!mv;Lclient!fa;Ljava/awt/Canvas;III)Lclient!r;")
	public static synchronized Class162 method6877(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return Static594.method7733(arg2, arg1);
		} else if (arg3 == 2) {
			return Static472.method6122(arg2, arg1);
		} else if (arg3 == 1) {
			return Static301.method4360(arg2, arg4, arg1);
		} else if (arg3 == 5) {
			return Static488.method6258(arg4, arg1, arg2, arg0);
		} else if (arg3 == 3) {
			return Static600.method4362(arg2, arg0, arg4, arg1);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
