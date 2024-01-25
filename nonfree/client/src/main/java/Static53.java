import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "J")
	public static long aLong37 = 20000000L;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "Lclient!ej;")
	public static final Class103 aClass103_1 = Static59.method1095();

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(FIFFIFFF)F")
	public static float method1020(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(11) float local11 = arg0 - arg6;
		@Pc(15) float local15 = arg5 - arg4;
		@Pc(20) float local20 = arg2 - arg3;
		@Pc(22) float local22 = 0.0F;
		@Pc(24) float local24 = 0.0F;
		@Pc(27) float local27 = (float) 0;
		while (local7 < 1.1F) {
			@Pc(35) float local35 = arg6 + local7 * local11;
			@Pc(41) float local41 = local15 * local7 + arg4;
			@Pc(47) float local47 = arg3 + local7 * local20;
			@Pc(52) int local52 = (int) local35 >> 9;
			@Pc(57) int local57 = (int) local47 >> 9;
			if (local52 > 0 && local57 > 0 && Static98.anInt361 > local52 && Static438.anInt7120 > local57) {
				@Pc(73) int local73 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132;
				if (local73 < 3 && (Static315.aByteArrayArrayArray13[1][local52][local57] & 0x2) != 0) {
					local73++;
				}
				@Pc(97) int local97 = Static556.aClass35Array2[local73].method7452((int) local35, (int) local47);
				if ((float) local97 < local41) {
					if (arg1 < 2) {
						return local7;
					}
					return method1020(local35, arg1 - 1, local47, local27, local24, local41, local22) * 0.1F + local7 - 0.1F;
				}
			}
			local7 += 0.1F;
			local22 = local35;
			local27 = local47;
			local24 = local41;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
	public static void method1022(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class3_Sub5_Sub20 local19 = Static447.method6065((long) arg0 | (long) arg1 << 32, 18);
		local19.method8834();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "()V")
	public static void method1025() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static433.aClass298Array6.length; local3++) {
				if (Static433.aClass298Array6[local3].method6531()) {
					Static613.aLongArray20[local3] = Static433.aClass298Array6[local3].method6533();
				} else {
					synchronized (Static433.aClass298Array6[local3]) {
						Static433.aClass298Array6[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static433.aClass298Array6[Static433.aClass298Array6.length - 1].method6527();
				Static345.method5023(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static433.aClass298Array6.length - 1; local3++) {
						if (!Static433.aClass298Array6[local3].method6531()) {
							synchronized (Static433.aClass298Array6[local3]) {
								Static433.aClass298Array6[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static433.aClass298Array6.length - 2; local102++) {
							Static433.aClass298Array6[local102].method6527();
						}
						Static345.method5023(2);
						while (!Static433.aClass298Array6[0].method6531()) {
							synchronized (Static433.aClass298Array6[0]) {
								Static433.aClass298Array6[0].notify();
							}
							try {
								Static26.method592(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static433.aClass298Array6[0].method6527();
						return;
					}
					try {
						Static26.method592(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static26.method592(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}
}
