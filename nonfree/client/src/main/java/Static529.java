import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!um", name = "t", descriptor = "I")
	public static int anInt9806 = 0;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(B)Lclient!ec;")
	public static Class6_Sub5_Sub2 method7816() {
		return Static490.aClass6_Sub5_Sub2_2;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!jr;I)Lclient!hu;")
	public static Class19_Sub2 method7817(@OriginalArg(0) Class6_Sub12 arg0) {
		return new Class19_Sub2(arg0.method6023(), arg0.method6023(), arg0.method6023(), arg0.method6023(), arg0.method6037(), arg0.method6037(), arg0.method6019());
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method7820(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(29) char local29 = arg0.charAt(local12);
			if (local29 >= 'A' && local29 <= 'Z') {
				local7 += local29 - 64;
			} else if (local29 >= 'a' && local29 <= 'z') {
				local7 += local29 - 96;
			} else if (local29 >= '0' && local29 <= '9') {
				local7 += local29 + 27 - 48;
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

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIBLjava/lang/String;ILjava/lang/String;Z)V")
	public static void method7821(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) boolean arg5) {
		Static572.aClass248_109.anInt7247 = 1;
		@Pc(11) String local11 = arg2.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg3 != -1) {
			@Pc(26) Class348 local26 = Static111.aClass259_1.method5915(arg3);
			if (local26 == null || local26.method7864() != arg5) {
				return;
			}
			if (local26.method7864()) {
				local18 = local26.aString92;
			} else {
				local16 = local26.anInt9885;
			}
		}
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < Static119.aClass244_4.anInt7168; local53++) {
			@Pc(60) Class236 local60 = Static119.aClass244_4.method5726(local53);
			if ((!arg0 || local60.aBoolean469) && local60.anInt6800 == -1 && local60.anInt6815 == -1 && local60.anInt6779 == 0 && local60.aString53.toLowerCase().indexOf(local11) != -1) {
				if (arg3 != -1) {
					if (arg5) {
						if (!arg4.equals(local60.method5486(arg3, local18))) {
							continue;
						}
					} else if (arg1 != local60.method5480(arg3, local16)) {
						continue;
					}
				}
				if (local51 >= 250) {
					Static173.aShortArray46 = null;
					Static391.anInt7133 = -1;
					return;
				}
				if (local14.length <= local51) {
					@Pc(129) short[] local129 = new short[local14.length * 2];
					for (@Pc(131) int local131 = 0; local131 < local51; local131++) {
						local129[local131] = local14[local131];
					}
					local14 = local129;
				}
				local14[local51++] = (short) local53;
			}
		}
		Static327.anInt6213 = 0;
		Static173.aShortArray46 = local14;
		Static391.anInt7133 = local51;
		@Pc(173) String[] local173 = new String[Static391.anInt7133];
		for (@Pc(179) int local179 = 0; local179 < Static391.anInt7133; local179++) {
			local173[local179] = Static119.aClass244_4.method5726(local14[local179]).aString53;
		}
		Static170.method2692(Static173.aShortArray46, local173);
		Static572.aClass248_109.method5775();
		Static572.aClass248_109.anInt7247 = 2;
	}
}
