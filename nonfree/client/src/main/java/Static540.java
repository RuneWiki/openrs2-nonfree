import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!un", name = "wb", descriptor = "I")
	public static int anInt5854;

	@OriginalMember(owner = "client!un", name = "Bb", descriptor = "I")
	public static int anInt5859;

	@OriginalMember(owner = "client!un", name = "U", descriptor = "Lclient!iv;")
	public static final Class162 aClass162_16 = new Class162(13, 16);

	@OriginalMember(owner = "client!un", name = "t", descriptor = "(I)V")
	public static void method4935() {
		Static319.aClass4_Sub11_Sub1_2.method1531();
		@Pc(13) int local13 = Static319.aClass4_Sub11_Sub1_2.method1530(8);
		@Pc(22) int local22;
		if (Static418.anInt7866 > local13) {
			for (local22 = local13; local22 < Static418.anInt7866; local22++) {
				Static271.anIntArray268[Static124.anInt9777++] = Static43.anIntArray23[local22];
			}
		}
		if (local13 > Static418.anInt7866) {
			throw new RuntimeException("gnpov1");
		}
		Static418.anInt7866 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(60) int local60 = Static43.anIntArray23[local22];
			@Pc(68) Class1_Sub4_Sub2_Sub1_Sub1 local68 = ((Class4_Sub4) Static585.aClass350_41.method8207((long) local60)).aClass1_Sub4_Sub2_Sub1_Sub1_1;
			@Pc(73) int local73 = Static319.aClass4_Sub11_Sub1_2.method1530(1);
			if (local73 == 0) {
				Static43.anIntArray23[Static418.anInt7866++] = local60;
				local68.anInt8384 = Static106.anInt2418;
			} else {
				@Pc(93) int local93 = Static319.aClass4_Sub11_Sub1_2.method1530(2);
				if (local93 == 0) {
					Static43.anIntArray23[Static418.anInt7866++] = local60;
					local68.anInt8384 = Static106.anInt2418;
					Static452.anIntArray465[Static70.anInt1217++] = local60;
				} else {
					@Pc(137) int local137;
					@Pc(147) int local147;
					if (local93 == 1) {
						Static43.anIntArray23[Static418.anInt7866++] = local60;
						local68.anInt8384 = Static106.anInt2418;
						local137 = Static319.aClass4_Sub11_Sub1_2.method1530(3);
						local68.method4514(1, local137);
						local147 = Static319.aClass4_Sub11_Sub1_2.method1530(1);
						if (local147 == 1) {
							Static452.anIntArray465[Static70.anInt1217++] = local60;
						}
					} else if (local93 == 2) {
						Static43.anIntArray23[Static418.anInt7866++] = local60;
						local68.anInt8384 = Static106.anInt2418;
						if (Static319.aClass4_Sub11_Sub1_2.method1530(1) == 1) {
							local137 = Static319.aClass4_Sub11_Sub1_2.method1530(3);
							local68.method4514(2, local137);
							local147 = Static319.aClass4_Sub11_Sub1_2.method1530(3);
							local68.method4514(2, local147);
						} else {
							local137 = Static319.aClass4_Sub11_Sub1_2.method1530(3);
							local68.method4514(0, local137);
						}
						local137 = Static319.aClass4_Sub11_Sub1_2.method1530(1);
						if (local137 == 1) {
							Static452.anIntArray465[Static70.anInt1217++] = local60;
						}
					} else if (local93 == 3) {
						Static271.anIntArray268[Static124.anInt9777++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIII)I")
	public static int method4951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static312.anInt6205 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(20) int local20 = arg0 - Static455.anInt3448;
		@Pc(25) int local25 = arg2 - Static455.anInt3450;
		for (@Pc(35) Class4_Sub17 local35 = (Class4_Sub17) Static455.aClass244_24.method5963(); local35 != null; local35 = (Class4_Sub17) Static455.aClass244_24.method5965()) {
			if (local35.anInt2866 == arg1) {
				@Pc(44) int local44 = local35.anInt2870;
				@Pc(47) int local47 = local35.anInt2869;
				@Pc(58) int local58 = local47 + Static455.anInt3450 | Static455.anInt3448 + local44 << 14;
				@Pc(77) int local77 = (local20 - local44) * (-local44 + local20) + (local25 - local47) * (local25 - local47);
				if (local14 < 0 || local16 > local77) {
					local14 = local58;
					local16 = local77;
				}
			}
		}
		return local14;
	}
}
