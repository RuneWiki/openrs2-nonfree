import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!rg", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString340;

	@OriginalMember(owner = "client!rg", name = "P", descriptor = "Lclient!aq;")
	public static Class15 aClass15_2;

	@OriginalMember(owner = "client!rg", name = "M", descriptor = "[Lclient!u;")
	public static Class187_Sub1[] aClass187_Sub1Array2 = new Class187_Sub1[0];

	@OriginalMember(owner = "client!rg", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString341 = "Walk here";

	@OriginalMember(owner = "client!rg", name = "O", descriptor = "[I")
	public static int[] anIntArray689 = new int[2];

	@OriginalMember(owner = "client!rg", name = "Q", descriptor = "[I")
	public static final int[] anIntArray690 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V")
	public static void method4539() {
		@Pc(9) int local9 = Static198.anInt3898 * 128 + 64;
		@Pc(15) int local15 = Static318.anInt614 * 128 + 64;
		@Pc(23) int local23 = Static341.method5540(Static168.anInt3508, local15, local9) - Static52.anInt1396;
		if (Static109.anInt60 >= 100) {
			Static24.anInt478 = Static318.anInt614 * 128 + 64;
			Static203.anInt4014 = Static198.anInt3898 * 128 + 64;
			Static271.anInt5361 = Static341.method5540(Static168.anInt3508, Static24.anInt478, Static203.anInt4014) - Static52.anInt1396;
		} else {
			if (local9 > Static203.anInt4014) {
				Static203.anInt4014 += Static42.anInt1095 + (local9 - Static203.anInt4014) * Static109.anInt60 / 1000;
				if (local9 < Static203.anInt4014) {
					Static203.anInt4014 = local9;
				}
			}
			if (Static271.anInt5361 < local23) {
				Static271.anInt5361 += (local23 - Static271.anInt5361) * Static109.anInt60 / 1000 + Static42.anInt1095;
				if (Static271.anInt5361 > local23) {
					Static271.anInt5361 = local23;
				}
			}
			if (Static203.anInt4014 > local9) {
				Static203.anInt4014 -= Static109.anInt60 * (Static203.anInt4014 - local9) / 1000 + Static42.anInt1095;
				if (local9 > Static203.anInt4014) {
					Static203.anInt4014 = local9;
				}
			}
			if (Static271.anInt5361 > local23) {
				Static271.anInt5361 -= Static109.anInt60 * (Static271.anInt5361 - local23) / 1000 + Static42.anInt1095;
				if (Static271.anInt5361 < local23) {
					Static271.anInt5361 = local23;
				}
			}
			if (Static24.anInt478 < local15) {
				Static24.anInt478 += Static42.anInt1095 + Static109.anInt60 * (local15 - Static24.anInt478) / 1000;
				if (local15 < Static24.anInt478) {
					Static24.anInt478 = local15;
				}
			}
			if (Static24.anInt478 > local15) {
				Static24.anInt478 -= Static42.anInt1095 + Static109.anInt60 * (Static24.anInt478 - local15) / 1000;
				if (Static24.anInt478 < local15) {
					Static24.anInt478 = local15;
				}
			}
		}
		local15 = Static175.anInt3621 * 128 + 64;
		local9 = Static121.anInt2750 * 128 + 64;
		local23 = Static341.method5540(Static168.anInt3508, local15, local9) - Static42.anInt1100;
		@Pc(216) int local216 = local9 - Static203.anInt4014;
		@Pc(221) int local221 = local23 - Static271.anInt5361;
		@Pc(226) int local226 = local15 - Static24.anInt478;
		@Pc(237) int local237 = (int) Math.sqrt((double) (local226 * local226 + local216 * local216));
		@Pc(248) int local248 = (int) (Math.atan2((double) local221, (double) local237) * 2607.5945876176133D) & 0x3FFF;
		@Pc(259) int local259 = (int) (Math.atan2((double) local216, (double) local226) * -2607.5945876176133D) & 0x3FFF;
		if (local248 < 1024) {
			local248 = 1024;
		}
		if (local248 > 3072) {
			local248 = 3072;
		}
		if (Static179.anInt3660 < local248) {
			Static179.anInt3660 += Static136.anInt2916 + (local248 - Static179.anInt3660 >> 3) * Static126.anInt2791 / 1000 << 3;
			if (Static179.anInt3660 > local248) {
				Static179.anInt3660 = local248;
			}
		}
		if (local248 < Static179.anInt3660) {
			Static179.anInt3660 -= Static126.anInt2791 * (Static179.anInt3660 - local248 >> 3) / 1000 + Static136.anInt2916 << 3;
			if (Static179.anInt3660 < local248) {
				Static179.anInt3660 = local248;
			}
		}
		@Pc(326) int local326 = local259 - Static138.anInt3022;
		if (local326 > 8192) {
			local326 -= 16384;
		}
		if (local326 < -8192) {
			local326 += 16384;
		}
		local326 >>= 0x3;
		if (local326 > 0) {
			Static138.anInt3022 += Static136.anInt2916 + Static126.anInt2791 * local326 / 1000 << 3;
			Static138.anInt3022 &= 0x3FFF;
		}
		if (local326 < 0) {
			Static138.anInt3022 -= Static136.anInt2916 + -local326 * Static126.anInt2791 / 1000 << 3;
			Static138.anInt3022 &= 0x3FFF;
		}
		@Pc(381) int local381 = local259 - Static138.anInt3022;
		if (local381 > 8192) {
			local381 -= 16384;
		}
		if (local381 < -8192) {
			local381 += 16384;
		}
		if (local381 < 0 && local326 > 0 || local381 > 0 && local326 < 0) {
			Static138.anInt3022 = local259;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method4541(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		Static284.aClass180_76.anInt5411 = 1;
		@Pc(9) String local9 = arg0.toLowerCase();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static233.anInt4645; local16++) {
			@Pc(21) Class138 local21 = Static17.method4472(local16);
			if ((!arg1 || local21.aBoolean312) && local21.anInt3962 == -1 && local21.anInt4007 == -1 && local21.anInt4011 == 0 && local21.aString261.toLowerCase().indexOf(local9) != -1) {
				if (local14 >= 250) {
					Static197.aShortArray62 = null;
					Static66.anInt1665 = -1;
					return;
				}
				if (local12.length <= local14) {
					@Pc(68) short[] local68 = new short[local12.length * 2];
					for (@Pc(70) int local70 = 0; local70 < local14; local70++) {
						local68[local70] = local12[local70];
					}
					local12 = local68;
				}
				local12[local14++] = (short) local16;
			}
		}
		Static66.anInt1665 = local14;
		Static197.aShortArray62 = local12;
		Static11.anInt3202 = 0;
		@Pc(115) String[] local115 = new String[Static66.anInt1665];
		for (@Pc(117) int local117 = 0; local117 < Static66.anInt1665; local117++) {
			local115[local117] = Static17.method4472(local12[local117]).aString261;
		}
		Static349.method5611(local115, Static197.aShortArray62);
		Static284.aClass180_76.method4558();
		Static284.aClass180_76.anInt5411 = 2;
	}
}
