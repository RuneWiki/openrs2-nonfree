import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "Lclient!fe;")
	public static final Class74 aClass74_19 = new Class74(16);

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "Z")
	public static boolean aBoolean230 = false;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIIII)Lclient!oi;")
	public static Class82 method2948(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(41) long local41 = (long) arg3 * 986053L ^ (long) arg2 * 67481L ^ (long) arg0 * 97549L ^ (long) arg5 * 475427L ^ (long) arg4 * 32147369L ^ (long) arg1 * 76724863L;
		@Pc(47) Class82 local47 = (Class82) Static330.aClass44_45.method1353(local41);
		if (local47 == null) {
			local47 = Static47.aClass66_3.method5063(arg2, arg0, arg5, arg3, arg4, arg1);
			Static330.aClass44_45.method1349(local47, local41);
			return local47;
		} else {
			return local47;
		}
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(IIIIIII)I")
	public static int method2949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg3 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(16) int local16 = arg1;
			arg1 = arg2;
			arg2 = local16;
		}
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg4;
		} else if (local7 == 2) {
			return 7 + 1 - arg0 - arg1;
		} else {
			return 1 + 7 - arg2 - arg4;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIB)V")
	public static void method2950(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(7) int local7 = arg1 << 3;
		Static165.aFloat28 = local7;
		if (Static429.anInt7656 == 2) {
			Static260.anInt4728 = local3;
			Static328.anInt5668 = local7;
			Static251.anInt6446 = 0;
		}
		Static265.aFloat51 = local3;
		Static42.method964();
		Static65.aBoolean151 = true;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)V")
	public static void method2951(@OriginalArg(0) int arg0) {
		Static259.anInt4722 = arg0;
		@Pc(7) Class44 local7 = Static320.aClass44_43;
		synchronized (Static320.aClass44_43) {
			Static320.aClass44_43.method1351();
		}
	}
}
