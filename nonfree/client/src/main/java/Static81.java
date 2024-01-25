import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!dea", name = "l", descriptor = "I")
	public static int anInt1883;

	@OriginalMember(owner = "client!dea", name = "o", descriptor = "I")
	public static int anInt1884;

	@OriginalMember(owner = "client!dea", name = "g", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_82 = new Class305(71, 12);

	@OriginalMember(owner = "client!dea", name = "n", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_83 = new Class305(32, 4);

	@OriginalMember(owner = "client!dea", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString35 = null;

	@OriginalMember(owner = "client!dea", name = "s", descriptor = "[I")
	public static final int[] anIntArray124 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(III)Z")
	public static boolean method1805(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IC)Z")
	public static boolean method1807(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIIIIIII[[[BILclient!qa;II)V")
	public static void method1808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[][][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class4 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg3 == 0 || arg5 == 0) {
			return;
		}
		if (arg3 == 9) {
			arg8 = arg8 + 1 & 0x3;
			arg3 = 1;
		}
		if (arg3 == 10) {
			arg3 = 1;
			arg8 = arg8 + 3 & 0x3;
		}
		if (arg3 == 11) {
			arg3 = 8;
			arg8 = arg8 + 3 & 0x3;
		}
		arg9.za(arg0, arg4, arg10, arg1, arg2, arg11, arg7[arg3 - 1][arg8], arg5, arg6);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)V")
	public static void method1809() {
		@Pc(9) int local9 = Static241.anInt4647 * 128 + 64;
		@Pc(15) int local15 = Static460.anInt7959 * 128 + 64;
		@Pc(26) int local26 = Static508.method7754(local15, local9, Static322.anInt6113) - Static481.anInt6918;
		if (Static44.anInt9296 < 100) {
			if (local9 > Static321.anInt6064) {
				Static321.anInt6064 += (local9 - Static321.anInt6064) * Static44.anInt9296 / 1000 + Static154.anInt3014;
				if (Static321.anInt6064 > local9) {
					Static321.anInt6064 = local9;
				}
			}
			if (Static276.anInt8653 < local26) {
				Static276.anInt8653 += Static44.anInt9296 * (local26 - Static276.anInt8653) / 1000 + Static154.anInt3014;
				if (Static276.anInt8653 > local26) {
					Static276.anInt8653 = local26;
				}
			}
			if (Static321.anInt6064 > local9) {
				Static321.anInt6064 -= Static44.anInt9296 * (Static321.anInt6064 - local9) / 1000 + Static154.anInt3014;
				if (Static321.anInt6064 < local9) {
					Static321.anInt6064 = local9;
				}
			}
			if (Static276.anInt8653 > local26) {
				Static276.anInt8653 -= Static44.anInt9296 * (Static276.anInt8653 - local26) / 1000 + Static154.anInt3014;
				if (local26 > Static276.anInt8653) {
					Static276.anInt8653 = local26;
				}
			}
			if (Static46.anInt1256 < local15) {
				Static46.anInt1256 += Static154.anInt3014 + (local15 - Static46.anInt1256) * Static44.anInt9296 / 1000;
				if (local15 < Static46.anInt1256) {
					Static46.anInt1256 = local15;
				}
			}
			if (Static46.anInt1256 > local15) {
				Static46.anInt1256 -= Static154.anInt3014 + (Static46.anInt1256 - local15) * Static44.anInt9296 / 1000;
				if (local15 > Static46.anInt1256) {
					Static46.anInt1256 = local15;
				}
			}
		} else {
			Static321.anInt6064 = Static241.anInt4647 * 128 + 64;
			Static46.anInt1256 = Static460.anInt7959 * 128 + 64;
			Static276.anInt8653 = Static508.method7754(Static46.anInt1256, Static321.anInt6064, Static322.anInt6113) - Static481.anInt6918;
		}
		local15 = Static28.anInt771 * 128 + 64;
		local9 = Static526.anInt9307 * 128 + 64;
		local26 = Static508.method7754(local15, local9, Static322.anInt6113) - Static113.anInt2324;
		@Pc(226) int local226 = local9 - Static321.anInt6064;
		@Pc(230) int local230 = local26 - Static276.anInt8653;
		@Pc(235) int local235 = local15 - Static46.anInt1256;
		@Pc(246) int local246 = (int) Math.sqrt((double) (local226 * local226 + local235 * local235));
		@Pc(257) int local257 = (int) (Math.atan2((double) local230, (double) local246) * 2607.5945876176133D) & 0x3FFF;
		if (local257 < 1024) {
			local257 = 1024;
		}
		@Pc(275) int local275 = (int) (-2607.5945876176133D * Math.atan2((double) local226, (double) local235)) & 0x3FFF;
		if (local257 > 3072) {
			local257 = 3072;
		}
		if (local257 > Static536.anInt9434) {
			Static536.anInt9434 += Static387.anInt6848 + (local257 - Static536.anInt9434 >> 3) * Static230.anInt4474 / 1000 << 3;
			if (Static536.anInt9434 > local257) {
				Static536.anInt9434 = local257;
			}
		}
		if (local257 < Static536.anInt9434) {
			Static536.anInt9434 -= (Static536.anInt9434 - local257 >> 3) * Static230.anInt4474 / 1000 + Static387.anInt6848 << 3;
			if (Static536.anInt9434 < local257) {
				Static536.anInt9434 = local257;
			}
		}
		@Pc(341) int local341 = local275 - Static469.anInt8096;
		if (local341 > 8192) {
			local341 -= 16384;
		}
		if (local341 < -8192) {
			local341 += 16384;
		}
		local341 >>= 0x3;
		if (local341 > 0) {
			Static469.anInt8096 += Static387.anInt6848 + Static230.anInt4474 * local341 / 1000 << 3;
			Static469.anInt8096 &= 0x3FFF;
		}
		if (local341 < 0) {
			Static469.anInt8096 -= -local341 * Static230.anInt4474 / 1000 + Static387.anInt6848 << 3;
			Static469.anInt8096 &= 0x3FFF;
		}
		@Pc(398) int local398 = local275 - Static469.anInt8096;
		if (local398 > 8192) {
			local398 -= 16384;
		}
		if (local398 < -8192) {
			local398 += 16384;
		}
		if (local398 < 0 && local341 > 0 || local398 > 0 && local341 < 0) {
			Static469.anInt8096 = local275;
		}
		Static505.anInt6155 = 0;
	}
}
