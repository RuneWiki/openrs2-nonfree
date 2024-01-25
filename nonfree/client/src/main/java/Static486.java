import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_100 = new Class208(40, 5);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZIII)Lclient!sea;")
	public static Class308 method6700(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class313 local9 = null;
		if (Static535.aClass302_7 != null) {
			local9 = new Class313(arg1, Static535.aClass302_7, Static588.aClass302Array1[arg1], 1000000);
		}
		Static578.aClass156_Sub1Array2[arg1] = Static10.aClass65_1.method1457(arg1, local9, Static111.aClass313_2);
		Static578.aClass156_Sub1Array2[arg1].method4695();
		return new Class308(Static578.aClass156_Sub1Array2[arg1], arg0, 1);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([[BLclient!wca;B)V")
	public static void method6701(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class234_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(41) int local41;
		for (@Pc(22) int local22 = 0; local22 < local15; local22++) {
			@Pc(28) byte[] local28 = arg0[local22];
			if (local28 != null) {
				@Pc(35) Class1_Sub3 local35 = new Class1_Sub3(local28);
				local41 = Static91.anIntArray519[local22] >> 8;
				@Pc(47) int local47 = Static91.anIntArray519[local22] & 0xFF;
				@Pc(54) int local54 = local41 * 64 - Static539.anInt9045;
				@Pc(61) int local61 = local47 * 64 - Static311.anInt5708;
				Static275.method4012();
				arg1.method7736(local35, local61, local54, Static590.aClass240Array1, Static311.anInt5708, Static539.anInt9045);
				arg1.method7753(local12, local54, local61, local35, Static31.aClass78_18);
				if (!arg1.aBoolean709 && local41 == Static276.anInt5046 / 8 && local47 == Static518.anInt9329 / 8 && local12[0] != -1) {
					Static242.aClass289_1 = Static544.aClass237_1.method5206(local12[0], local12[1], local12[3], local12[2], Static40.aClass164_1);
					Static100.anInt1765 = local12[4];
				}
			}
		}
		for (@Pc(135) int local135 = 0; local135 < local15; local135++) {
			@Pc(148) int local148 = (Static91.anIntArray519[local135] >> 8) * 64 - Static539.anInt9045;
			local41 = (Static91.anIntArray519[local135] & 0xFF) * 64 - Static311.anInt5708;
			@Pc(163) byte[] local163 = arg0[local135];
			if (local163 == null && Static518.anInt9329 < 800) {
				Static275.method4012();
				arg1.method7744(local148, local41);
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BJ)V")
	public static void method6702(@OriginalArg(1) long arg0) {
		@Pc(11) int local11 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902 + Static439.anInt8378;
		@Pc(16) int local16 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906 + Static324.anInt5952;
		if (Static183.anInt3630 - local11 < -2000 || Static183.anInt3630 - local11 > 2000 || Static173.anInt3244 - local16 < -2000 || Static173.anInt3244 - local16 > 2000) {
			Static183.anInt3630 = local11;
			Static173.anInt3244 = local16;
		}
		@Pc(55) int local55;
		@Pc(63) int local63;
		if (local11 != Static183.anInt3630) {
			local55 = local11 - Static183.anInt3630;
			local63 = (int) (arg0 * (long) local55 / 320L);
			if (local55 > 0) {
				if (local63 == 0) {
					local63 = 1;
				} else if (local63 > local55) {
					local63 = local55;
				}
			} else if (local63 == 0) {
				local63 = -1;
			} else if (local55 > local63) {
				local63 = local55;
			}
			Static183.anInt3630 += local63;
		}
		if (local16 != Static173.anInt3244) {
			local55 = local16 - Static173.anInt3244;
			local63 = (int) (arg0 * (long) local55 / 320L);
			if (local55 > 0) {
				if (local63 == 0) {
					local63 = 1;
				} else if (local55 < local63) {
					local63 = local55;
				}
			} else if (local63 == 0) {
				local63 = -1;
			} else if (local63 < local55) {
				local63 = local55;
			}
			Static173.anInt3244 += local63;
		}
		if (!Static86.aClass1_Sub30_Sub1_1.aBoolean485) {
			Static487.aFloat206 += Static372.aFloat179 * (float) arg0 / 6.0F;
			Static331.aFloat172 += (float) arg0 * Static240.aFloat125 / 6.0F;
		}
		Static220.method4685();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
	public static void method6703() {
		@Pc(7) Class268 local7 = null;
		try {
			@Pc(13) Class191 local13 = Static361.aClass198_3.method4291(true, "2");
			while (local13.anInt5014 == 0) {
				Static408.method5841(1L);
			}
			if (local13.anInt5014 == 1) {
				local7 = (Class268) local13.anObject11;
				@Pc(37) byte[] local37 = new byte[(int) local7.method5812()];
				@Pc(52) int local52;
				for (@Pc(39) int local39 = 0; local39 < local37.length; local39 += local52) {
					local52 = local7.method5813(local37, local37.length - local39, local39);
					if (local52 == -1) {
						throw new IOException("EOF");
					}
				}
				Static481.method6670(new Class1_Sub3(local37));
			}
		} catch (@Pc(81) Exception local81) {
		}
		try {
			if (local7 != null) {
				local7.method5816();
			}
		} catch (@Pc(95) Exception local95) {
		}
	}
}
