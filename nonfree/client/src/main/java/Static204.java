import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
	public static int anInt3947;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method3630(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += local27 + 1 - 'A';
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += local27 + 1 - 97;
			} else if (local27 >= '0' && local27 <= '9') {
				local7 += local27 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)V")
	public static void method3633(@OriginalArg(0) int arg0) {
		Static280.anInt5433 = arg0;
		@Pc(7) Class66 local7 = Static244.aClass66_84;
		synchronized (Static244.aClass66_84) {
			Static244.aClass66_84.method1933();
		}
		local7 = Static37.aClass66_9;
		synchronized (Static37.aClass66_9) {
			Static37.aClass66_9.method1933();
		}
		local7 = Static203.aClass66_69;
		synchronized (Static203.aClass66_69) {
			Static203.aClass66_69.method1933();
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!lg;III[Z)V")
	public static void method3634(@OriginalArg(0) Class5_Sub9_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static130.aClass3Array2 == Static93.aClass3Array1) {
			return;
		}
		@Pc(9) int local9 = Static262.aClass3Array3[arg1].method5639(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class3 local22 = Static262.aClass3Array3[local11];
				if (local22 != null) {
					local22.method5631(arg0, arg2, local9 - local22.method5639(arg2, arg3), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!ra;II)Lclient!cp;")
	public static Class5_Sub7 method3635(@OriginalArg(0) Class170 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method4571(arg1);
		return local8 == null ? null : new Class5_Sub7(local8);
	}
}
