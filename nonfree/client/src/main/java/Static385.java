import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_106 = new Class349(102, 7);

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString89 = null;

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
	public static int anInt6376 = 0;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_107 = new Class349(39, 7);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
	public static void method5331() {
		Static12.anInt296 = 0;
		@Pc(12) int local12 = Static485.anInt7725 + (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374 >> 9);
		@Pc(19) int local19 = (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375 >> 9) + Static310.anInt5129;
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static12.anInt296 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static12.anInt296 = 1;
		}
		if (Static12.anInt296 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static12.anInt296 = 0;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIII)V")
	public static void method5332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1002) {
			Static566.method7391(Static69.aClass222_9, arg0, arg1);
		} else if (arg2 == 1012) {
			Static566.method7391(Static388.aClass222_11, arg0, arg1);
		} else if (arg2 == 1009) {
			Static566.method7391(Static258.aClass222_7, arg0, arg1);
		} else if (arg2 == 1004) {
			Static566.method7391(Static316.aClass222_10, arg0, arg1);
		} else if (arg2 == 1011) {
			Static566.method7391(Static349.aClass222_12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIII)Lclient!rs;")
	public static Class17 method5333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg5 * 32147369L ^ (long) arg2 * 986053L ^ (long) arg3 * 475427L ^ (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg4 * 76724863L;
		@Pc(39) Class17 local39 = (Class17) Static48.aClass21_12.method324(local33);
		if (local39 == null) {
			local39 = Static15.aClass162_1.method6815(arg0, arg1, arg3, arg2, arg5, arg4);
			Static48.aClass21_12.method317(local39, local33);
			return local39;
		} else {
			return local39;
		}
	}
}
