import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "[I")
	public static final int[] anIntArray693 = new int[3];

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "Z")
	public static boolean aBoolean725 = false;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)Lclient!kb;")
	public static Class177 method7731(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static252.aClass177Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method7734(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += local27 + 1 - 65;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += local27 - 96;
			} else if (local27 >= '0' && local27 <= '9') {
				local7 += local27 - 21;
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

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ[Lclient!lk;)V")
	public static void method7738(@OriginalArg(0) int arg0, @OriginalArg(2) Class203[] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
			@Pc(20) Class203 local20 = arg1[local14];
			if (local20 != null && local20.anInt5518 == arg0 && !Static69.method1646(local20)) {
				if (local20.anInt5473 == 0) {
					method7738(local20.anInt5531, arg1);
					if (local20.aClass203Array2 != null) {
						method7738(local20.anInt5531, local20.aClass203Array2);
					}
					@Pc(57) Class3_Sub28 local57 = (Class3_Sub28) Static227.aClass310_15.method6601((long) local20.anInt5531);
					if (local57 != null) {
						Static550.method6450(local57.anInt5333);
					}
				}
				if (local20.anInt5473 == 6 && local20.anInt5505 != -1) {
					@Pc(77) Class17 local77 = Static330.aClass279_2.method6216(local20.anInt5505);
					if (local77 != null) {
						local20.anInt5511 += Static14.anInt217;
						@Pc(88) int local88 = local20.anInt5458;
						while (local20.anInt5511 > local77.anIntArray54[local20.anInt5458]) {
							local20.anInt5511 -= local77.anIntArray54[local20.anInt5458];
							local20.anInt5458++;
							if (local77.anIntArray55.length <= local20.anInt5458) {
								local20.anInt5458 -= local77.anInt551;
								if (local20.anInt5458 < 0 || local77.anIntArray55.length <= local20.anInt5458) {
									local20.anInt5458 = 0;
								}
							}
							local20.anInt5481 = local20.anInt5458 + 1;
							if (local77.anIntArray55.length <= local20.anInt5481) {
								local20.anInt5481 -= local77.anInt551;
								if (local20.anInt5481 < 0 || local77.anIntArray55.length <= local20.anInt5481) {
									local20.anInt5481 = -1;
								}
							}
							Static138.method2656(local20);
						}
						if (local20.anInt5458 != local88) {
							Static435.method6109(local20.anInt5458, local77);
						}
					}
				}
			}
		}
	}
}
