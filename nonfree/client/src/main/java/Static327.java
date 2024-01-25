import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
	public static int anInt5631;

	@OriginalMember(owner = "client!qp", name = "C", descriptor = "[I")
	public static int[] anIntArray385;

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
	public static int anInt5630 = -1;

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "Z")
	public static boolean aBoolean352 = false;

	@OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
	public static int anInt5632 = 0;

	@OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
	public static int anInt5634 = -1;

	@OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
	public static int anInt5636 = -1;

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "(I)V")
	public static void method4728() {
		@Pc(9) int local9 = Static294.anInt5207 * 128 + 64;
		@Pc(15) int local15 = Static315.anInt5489 * 128 + 64;
		@Pc(24) int local24 = Static221.method3331(Static388.anInt6870, local15, local9) - Static84.anInt2036;
		if (Static90.anInt2074 < 100) {
			if (local9 > Static157.anInt3220) {
				Static157.anInt3220 += Static430.anInt7677 + Static90.anInt2074 * (local9 - Static157.anInt3220) / 1000;
				if (local9 < Static157.anInt3220) {
					Static157.anInt3220 = local9;
				}
			}
			if (Static157.anInt3220 > local9) {
				Static157.anInt3220 -= Static430.anInt7677 + (Static157.anInt3220 - local9) * Static90.anInt2074 / 1000;
				if (local9 > Static157.anInt3220) {
					Static157.anInt3220 = local9;
				}
			}
			if (local24 > Static367.anInt6653) {
				Static367.anInt6653 += Static430.anInt7677 + Static90.anInt2074 * (local24 - Static367.anInt6653) / 1000;
				if (Static367.anInt6653 > local24) {
					Static367.anInt6653 = local24;
				}
			}
			if (Static229.anInt4187 < local15) {
				Static229.anInt4187 += Static430.anInt7677 + Static90.anInt2074 * (local15 - Static229.anInt4187) / 1000;
				if (local15 < Static229.anInt4187) {
					Static229.anInt4187 = local15;
				}
			}
			if (local24 < Static367.anInt6653) {
				Static367.anInt6653 -= Static90.anInt2074 * (Static367.anInt6653 - local24) / 1000 + Static430.anInt7677;
				if (local24 > Static367.anInt6653) {
					Static367.anInt6653 = local24;
				}
			}
			if (Static229.anInt4187 > local15) {
				Static229.anInt4187 -= (Static229.anInt4187 - local15) * Static90.anInt2074 / 1000 + Static430.anInt7677;
				if (Static229.anInt4187 < local15) {
					Static229.anInt4187 = local15;
				}
			}
		} else {
			Static229.anInt4187 = Static315.anInt5489 * 128 + 64;
			Static157.anInt3220 = Static294.anInt5207 * 128 + 64;
			Static367.anInt6653 = Static221.method3331(Static388.anInt6870, Static229.anInt4187, Static157.anInt3220) - Static84.anInt2036;
		}
		local9 = Static345.anInt6218 * 128 + 64;
		local15 = Static106.anInt2294 * 128 + 64;
		local24 = Static221.method3331(Static388.anInt6870, local15, local9) - Static159.anInt5733;
		@Pc(224) int local224 = local9 - Static157.anInt3220;
		@Pc(229) int local229 = local24 - Static367.anInt6653;
		@Pc(238) int local238 = local15 - Static229.anInt4187;
		@Pc(249) int local249 = (int) Math.sqrt((double) (local238 * local238 + local224 * local224));
		@Pc(260) int local260 = (int) (Math.atan2((double) local229, (double) local249) * 2607.5945876176133D) & 0x3FFF;
		if (local260 < 1024) {
			local260 = 1024;
		}
		@Pc(278) int local278 = (int) (-2607.5945876176133D * Math.atan2((double) local224, (double) local238)) & 0x3FFF;
		if (local260 > 3072) {
			local260 = 3072;
		}
		if (Static328.anInt5668 < local260) {
			Static328.anInt5668 += Static405.anInt7262 * (local260 - Static328.anInt5668 >> 3) / 1000 + Static413.anInt7423 << 3;
			if (Static328.anInt5668 > local260) {
				Static328.anInt5668 = local260;
			}
		}
		if (local260 < Static328.anInt5668) {
			Static328.anInt5668 -= Static413.anInt7423 + Static405.anInt7262 * (Static328.anInt5668 - local260 >> 3) / 1000 << 3;
			if (Static328.anInt5668 < local260) {
				Static328.anInt5668 = local260;
			}
		}
		@Pc(347) int local347 = local278 - Static260.anInt4728;
		if (local347 > 8192) {
			local347 -= 16384;
		}
		if (local347 < -8192) {
			local347 += 16384;
		}
		local347 >>= 0x3;
		if (local347 > 0) {
			Static260.anInt4728 += Static405.anInt7262 * local347 / 1000 + Static413.anInt7423 << 3;
			Static260.anInt4728 &= 0x3FFF;
		}
		if (local347 < 0) {
			Static260.anInt4728 -= Static405.anInt7262 * -local347 / 1000 + Static413.anInt7423 << 3;
			Static260.anInt4728 &= 0x3FFF;
		}
		@Pc(408) int local408 = local278 - Static260.anInt4728;
		if (local408 > 8192) {
			local408 -= 16384;
		}
		if (local408 < -8192) {
			local408 += 16384;
		}
		if (local408 < 0 && local347 > 0 || local408 > 0 && local347 < 0) {
			Static260.anInt4728 = local278;
		}
		Static251.anInt6446 = 0;
	}

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "(I)V")
	public static void method4731() {
		@Pc(12) Class46 local12 = null;
		try {
			@Pc(17) Class122 local17 = Static45.aClass209_127.method4698("2");
			while (local17.anInt3557 == 0) {
				Static88.method4161(1L);
			}
			if (local17.anInt3557 == 1) {
				local12 = (Class46) local17.anObject7;
				@Pc(45) Class6_Sub1 local45 = new Class6_Sub1(Static304.anInt5382 * 6 + 3);
				local45.method6439(1);
				local45.method6453(Static304.anInt5382);
				for (@Pc(57) int local57 = 0; local57 < Static331.anIntArray389.length; local57++) {
					if (Static384.aBooleanArray25[local57]) {
						local45.method6453(local57);
						local45.method6461(Static331.anIntArray389[local57]);
					}
				}
				local12.method1366(local45.anInt7898, 0, local45.aByteArray96);
			}
		} catch (@Pc(90) Exception local90) {
		}
		try {
			if (local12 != null) {
				local12.method1367();
			}
		} catch (@Pc(97) Exception local97) {
		}
		Static43.aLong45 = Static449.method6552();
		Static304.aBoolean346 = false;
	}
}
