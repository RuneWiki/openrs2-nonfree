import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static390 {

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "Lclient!ae;")
	public static Class9 aClass9_20;

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "Lclient!ae;")
	public static Class9 aClass9_21;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_214 = new Class150(92, 12);

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
	public static final int anInt8665 = 0;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_215 = new Class150(46, -1);

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_216 = new Class150(82, 7);

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_217 = new Class150(77, 12);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	public static void method7043() {
		Static257.anInt5147 = 0;
		Static521.aClass99_78.method2524();
		Static521.aClass99_78.method2513(Static319.aClass5_Sub47_2);
		Static257.anInt5147++;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILclient!n;ILjava/awt/Canvas;Lclient!gp;)Lclient!qa;")
	public static synchronized Class62 method7056(@OriginalArg(1) int arg0, @OriginalArg(2) Interface8 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) Class117 arg4) {
		if (arg2 == 0) {
			return Static538.method7317(false, arg1, arg3);
		} else if (arg2 == 2) {
			return Static425.method6100(arg3, arg1);
		} else if (arg2 == 4) {
			return Static538.method7317(true, arg1, arg3);
		} else if (arg2 == 1) {
			return Static131.method2418(arg0, arg3, arg1);
		} else if (arg2 == 5) {
			return Static234.method3852(arg0, arg4, arg1, arg3);
		} else if (arg2 == 3) {
			return Static549.method1358(arg4, arg1, arg3, arg0);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
