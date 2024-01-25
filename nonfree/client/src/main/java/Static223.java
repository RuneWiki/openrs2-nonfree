import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
	public static int anInt4250;

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "Lclient!ak;")
	public static final Class15 aClass15_7 = new Class15();

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
	public static int anInt4249 = 0;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!cs;I)V")
	public static void method3719(@OriginalArg(0) Class4_Sub1_Sub2_Sub1 arg0) {
		if (arg0.anIntArray307 == null && arg0.anIntArray305 == null) {
			return;
		}
		@Pc(22) boolean local22 = true;
		for (@Pc(24) int local24 = 0; local24 < arg0.anIntArray307.length; local24++) {
			@Pc(28) int local28 = -1;
			if (arg0.anIntArray307 != null) {
				local28 = arg0.anIntArray307[local24];
			}
			if (local28 != -1) {
				local22 = false;
				@Pc(84) int local84;
				@Pc(101) int local101;
				@Pc(67) int local67;
				if ((local28 & 0xC0000000) == -1073741824) {
					local67 = local28 & 0xFFFFFFF;
					@Pc(71) int local71 = local67 >> 14;
					local84 = arg0.anInt8916 - (local71 - Static299.anInt5307) * 512 - 256;
					@Pc(88) int local88 = local67 & 0x3FFF;
					local101 = arg0.anInt8911 - (local88 - Static171.anInt3340) * 512 - 256;
				} else if ((local28 & 0x8000) == 0) {
					@Pc(114) Class3_Sub28 local114 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local28);
					if (local114 == null) {
						arg0.method5066(-1, local24);
						continue;
					}
					@Pc(119) Class4_Sub1_Sub2_Sub1_Sub1 local119 = local114.aClass4_Sub1_Sub2_Sub1_Sub1_2;
					local101 = arg0.anInt8911 - local119.anInt8911;
					local84 = arg0.anInt8916 - local119.anInt8916;
				} else {
					local67 = local28 & 0x7FFF;
					@Pc(151) Class4_Sub1_Sub2_Sub1_Sub2 local151 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local67];
					if (local151 == null) {
						arg0.method5066(-1, local24);
						continue;
					}
					local101 = arg0.anInt8911 - local151.anInt8911;
					local84 = arg0.anInt8916 - local151.anInt8916;
				}
				if (local84 != 0 || local101 != 0) {
					arg0.method5066((int) (Math.atan2((double) local84, (double) local101) * 2607.5945876176133D) & 0x3FFF, local24);
				}
			} else if (!arg0.method5066(-1, local24)) {
				local22 = false;
			}
		}
		if (local22) {
			arg0.anIntArray307 = null;
			arg0.anIntArray305 = null;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)I")
	public static int method3721(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(22) int local22 = (arg0 & 0x7F) * 96 >> 7;
		if (local22 < 2) {
			local22 = 2;
		} else if (local22 > 126) {
			local22 = 126;
		}
		return local22 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IBI)V")
	public static void method3722(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static107.anInt2317 = arg1;
		Static245.anInt4546 = arg0;
		if (Static234.anInt4427 == 0) {
			Static476.anInt8315 = Static39.anInt1252 * 2 + Static245.anInt4546;
			Static430.anInt7728 = Static107.anInt2317 + Static505.anInt8728 * 2;
		} else if (Static234.anInt4427 == 1) {
			Static592.anInt9706 = Static150.anInt2968 + Static107.anInt2317 / Static159.anInt3138 + 2;
			Static330.anInt6169 = Static245.anInt4546 / Static153.anInt3029 + Static578.anInt9504 + 2;
			Static476.anInt8315 = Static330.anInt6169 * Static153.anInt3029;
			Static430.anInt7728 = Static159.anInt3138 * Static592.anInt9706;
			Static505.anInt8728 = Static430.anInt7728 - Static107.anInt2317 >> 1;
			Static39.anInt1252 = Static476.anInt8315 - Static245.anInt4546 >> 1;
		} else if (Static234.anInt4427 == 2) {
			Static476.anInt8315 = Static245.anInt4546;
			Static430.anInt7728 = Static107.anInt2317;
			return;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "([Lclient!qk;BI)V")
	public static void method3723(@OriginalArg(0) Class279[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class279 local13 = arg0[local7];
			if (local13 != null && arg1 == local13.anInt8203 && !Static76.method1836(local13)) {
				if (local13.anInt8204 == 0) {
					method3723(arg0, local13.anInt8185);
					if (local13.aClass279Array2 != null) {
						method3723(local13.aClass279Array2, local13.anInt8185);
					}
					@Pc(51) Class3_Sub29 local51 = (Class3_Sub29) Static356.aClass280_29.method7107((long) local13.anInt8185);
					if (local51 != null) {
						Static507.method7838(local51.anInt4601);
					}
				}
				if (local13.anInt8204 == 6 && local13.anInt8175 != -1) {
					@Pc(74) Class361 local74 = Static115.aClass227_1.method5968(local13.anInt8175);
					if (local74 != null) {
						local13.anInt8145 += Static354.anInt6785;
						@Pc(85) int local85 = local13.anInt8135;
						while (local13.anInt8145 > local74.anIntArray642[local13.anInt8135]) {
							local13.anInt8145 -= local74.anIntArray642[local13.anInt8135];
							local13.anInt8135++;
							if (local74.anIntArray638.length <= local13.anInt8135) {
								local13.anInt8135 -= local74.anInt9863;
								if (local13.anInt8135 < 0 || local13.anInt8135 >= local74.anIntArray638.length) {
									local13.anInt8135 = 0;
								}
							}
							local13.anInt8179 = local13.anInt8135 + 1;
							if (local13.anInt8179 >= local74.anIntArray638.length) {
								local13.anInt8179 -= local74.anInt9863;
								if (local13.anInt8179 < 0 || local13.anInt8179 >= local74.anIntArray638.length) {
									local13.anInt8179 = -1;
								}
							}
							Static482.method7193(local13);
						}
						if (local85 != local13.anInt8135) {
							Static146.method2678(local74, local13.anInt8135);
						}
					}
				}
			}
		}
	}
}
