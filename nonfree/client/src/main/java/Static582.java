import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!up", name = "a", descriptor = "Lclient!se;")
	public static final Class314 aClass314_1 = new Class314(14, 0);

	@OriginalMember(owner = "client!up", name = "d", descriptor = "Lclient!se;")
	public static final Class314 aClass314_2 = new Class314(15, 4);

	@OriginalMember(owner = "client!up", name = "e", descriptor = "Lclient!se;")
	public static final Class314 aClass314_3 = new Class314(16, -2);

	@OriginalMember(owner = "client!up", name = "f", descriptor = "Lclient!se;")
	public static final Class314 aClass314_4 = new Class314(17, 0);

	@OriginalMember(owner = "client!up", name = "g", descriptor = "Lclient!se;")
	public static final Class314 aClass314_5 = new Class314(18, -2);

	@OriginalMember(owner = "client!up", name = "h", descriptor = "Lclient!se;")
	public static final Class314 aClass314_6 = new Class314(19, -2);

	@OriginalMember(owner = "client!up", name = "i", descriptor = "Lclient!se;")
	public static final Class314 aClass314_7 = new Class314(20, 6);

	@OriginalMember(owner = "client!up", name = "j", descriptor = "Lclient!se;")
	public static final Class314 aClass314_8 = new Class314(21, 9);

	@OriginalMember(owner = "client!up", name = "k", descriptor = "Lclient!se;")
	public static final Class314 aClass314_9 = new Class314(22, -2);

	@OriginalMember(owner = "client!up", name = "l", descriptor = "Lclient!se;")
	public static final Class314 aClass314_10 = new Class314(23, 4);

	@OriginalMember(owner = "client!up", name = "m", descriptor = "Lclient!se;")
	public static final Class314 aClass314_11 = new Class314(24, -1);

	@OriginalMember(owner = "client!up", name = "n", descriptor = "Lclient!se;")
	public static final Class314 aClass314_12 = new Class314(26, 0);

	@OriginalMember(owner = "client!up", name = "o", descriptor = "Lclient!se;")
	public static final Class314 aClass314_13 = new Class314(27, 0);

	@OriginalMember(owner = "client!up", name = "p", descriptor = "Lclient!se;")
	public static final Class314 aClass314_14 = new Class314(28, -2);

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)V")
	public static void method7926() {
		if (Static324.anInt5145 == 9) {
			Static158.method2370(5);
		} else if (Static324.anInt5145 == 5 || Static324.anInt5145 == 6) {
			Static158.method2370(3);
		} else if (Static324.anInt5145 == 12) {
			Static158.method2370(3);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IZIIII)V")
	public static void method7927(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - arg4;
		@Pc(15) int local15 = arg0 - arg1;
		if (local10 == 0) {
			if (local15 != 0) {
				Static223.method3044(arg2, arg1, arg4, arg0);
			}
		} else if (local15 == 0) {
			Static574.method7875(arg3, arg2, arg1, arg4);
		} else {
			@Pc(41) int local41 = (local15 << 12) / local10;
			@Pc(55) int local55 = arg1 - (local41 * arg4 >> 12);
			@Pc(67) int local67;
			@Pc(75) int local75;
			if (Static379.anInt5914 > arg3) {
				local67 = Static379.anInt5914;
				local75 = (Static379.anInt5914 * local41 >> 12) + local55;
			} else if (Static624.anInt10032 < arg3) {
				local67 = Static624.anInt10032;
				local75 = local55 + (local41 * Static624.anInt10032 >> 12);
			} else {
				local75 = arg0;
				local67 = arg3;
			}
			@Pc(98) int local98;
			@Pc(106) int local106;
			if (Static379.anInt5914 > arg4) {
				local98 = Static379.anInt5914;
				local106 = (Static379.anInt5914 * local41 >> 12) + local55;
			} else if (arg4 > Static624.anInt10032) {
				local106 = local55 + (local41 * Static624.anInt10032 >> 12);
				local98 = Static624.anInt10032;
			} else {
				local106 = arg1;
				local98 = arg4;
			}
			if (local75 < Static257.anInt4068) {
				local67 = (Static257.anInt4068 - local55 << 12) / local41;
				local75 = Static257.anInt4068;
			} else if (local75 > Static67.anInt1214) {
				local75 = Static67.anInt1214;
				local67 = (Static67.anInt1214 - local55 << 12) / local41;
			}
			if (Static257.anInt4068 > local106) {
				local106 = Static257.anInt4068;
				local98 = (Static257.anInt4068 - local55 << 12) / local41;
			} else if (local106 > Static67.anInt1214) {
				local106 = Static67.anInt1214;
				local98 = (Static67.anInt1214 - local55 << 12) / local41;
			}
			Static263.method3704(local98, local106, local75, arg2, local67);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "()V")
	public static void method7928() {
		Static83.method1183(Static10.anInt139);
	}
}
