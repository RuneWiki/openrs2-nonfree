import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
	public static int anInt7339 = 0;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!za;IIIIII)Lclient!e;")
	public static Class17 method5579(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg3;
		@Pc(19) Class17 local19 = (Class17) Static149.aClass91_45.method1988(local6);
		if (local19 == null) {
			@Pc(29) Class147 local29 = Static354.method5036(Static227.aClass211_59, arg3);
			if (local29 == null) {
				return null;
			}
			if (local29.anInt4358 < 13) {
				local29.method3372();
			}
			local19 = arg0.method5922(local29, 2055, Static441.anInt7760, 64, 768);
			Static149.aClass91_45.method1990(local19, local6);
		}
		local19 = local19.method6202((byte) 2, 2055, true);
		if (arg1 != 0) {
			local19.ma(arg1);
		}
		if (arg4 != 0) {
			local19.W(arg4);
		}
		if (arg5 != 0) {
			local19.K(arg5);
		}
		if (arg2 != 0) {
			local19.a(0, arg2, 0);
		}
		return local19;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLclient!jg;)Z")
	public static boolean method5580(@OriginalArg(1) Interface5 arg0) {
		@Pc(10) Class192 local10 = Static455.aClass161_4.method3628(arg0.method5730());
		if (local10.anInt5683 == -1) {
			return true;
		} else {
			@Pc(23) Class231 local23 = Static420.aClass84_2.method1802(local10.anInt5683);
			return local23.anInt6725 == -1 ? true : local23.method5126();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)I")
	public static int method5581(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(CI)C")
	public static char method5582(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
