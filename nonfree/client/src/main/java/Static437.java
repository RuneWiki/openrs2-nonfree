import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
	public static final int[] anIntArray679 = new int[25];

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
	public static int anInt7994 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!kea;BLclient!tq;)V")
	public static void method6619(@OriginalArg(0) Class161 arg0, @OriginalArg(2) Class285 arg1) {
		Static256.aString39 = "";
		Static403.aClass285_12 = arg1;
		Static333.aClass161_67 = arg0;
		if (Static472.aString75.startsWith("win")) {
			Static256.aString39 = Static256.aString39 + "windows/";
		} else if (Static472.aString75.startsWith("linux")) {
			Static256.aString39 = Static256.aString39 + "linux/";
		} else if (Static472.aString75.startsWith("mac")) {
			Static256.aString39 = Static256.aString39 + "macos/";
		}
		if (Static403.aClass285_12.aBoolean624) {
			Static256.aString39 = Static256.aString39 + "msjava/";
		} else if (Static472.aString79.startsWith("amd64") || Static472.aString79.startsWith("x86_64")) {
			Static256.aString39 = Static256.aString39 + "x86_64/";
		} else if (Static472.aString79.startsWith("i386") || Static472.aString79.startsWith("i486") || Static472.aString79.startsWith("i586") || Static472.aString79.startsWith("x86")) {
			Static256.aString39 = Static256.aString39 + "x86/";
		} else if (Static472.aString79.startsWith("ppc")) {
			Static256.aString39 = Static256.aString39 + "ppc/";
		} else {
			Static256.aString39 = Static256.aString39 + "universal/";
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method6620() {
		@Pc(9) int local9 = Static192.anInt4400 * 512 + 256;
		@Pc(15) int local15 = Static346.anInt6595 * 512 + 256;
		@Pc(23) int local23 = Static58.method1166(local15, local9, Static420.anInt7829) - Static400.anInt7395;
		if (Static205.anInt4557 >= 100) {
			Static329.anInt6297 = Static346.anInt6595 * 512 + 256;
			Static311.anInt6050 = Static192.anInt4400 * 512 + 256;
			Static347.anInt6620 = Static58.method1166(Static329.anInt6297, Static311.anInt6050, Static420.anInt7829) - Static400.anInt7395;
		} else {
			if (local9 > Static311.anInt6050) {
				Static311.anInt6050 += Static205.anInt4557 * (local9 - Static311.anInt6050) / 1000 + Static49.anInt1109;
				if (Static311.anInt6050 > local9) {
					Static311.anInt6050 = local9;
				}
			}
			if (local9 < Static311.anInt6050) {
				Static311.anInt6050 -= Static205.anInt4557 * (Static311.anInt6050 - local9) / 1000 + Static49.anInt1109;
				if (Static311.anInt6050 < local9) {
					Static311.anInt6050 = local9;
				}
			}
			if (Static347.anInt6620 < local23) {
				Static347.anInt6620 += Static49.anInt1109 + (local23 - Static347.anInt6620) * Static205.anInt4557 / 1000;
				if (local23 < Static347.anInt6620) {
					Static347.anInt6620 = local23;
				}
			}
			if (local23 < Static347.anInt6620) {
				Static347.anInt6620 -= (Static347.anInt6620 - local23) * Static205.anInt4557 / 1000 + Static49.anInt1109;
				if (local23 > Static347.anInt6620) {
					Static347.anInt6620 = local23;
				}
			}
			if (local15 > Static329.anInt6297) {
				Static329.anInt6297 += Static49.anInt1109 + Static205.anInt4557 * (local15 - Static329.anInt6297) / 1000;
				if (local15 < Static329.anInt6297) {
					Static329.anInt6297 = local15;
				}
			}
			if (Static329.anInt6297 > local15) {
				Static329.anInt6297 -= Static205.anInt4557 * (Static329.anInt6297 - local15) / 1000 + Static49.anInt1109;
				if (Static329.anInt6297 < local15) {
					Static329.anInt6297 = local15;
				}
			}
		}
		local9 = Static22.anInt8153 * 512 + 256;
		local15 = Static347.anInt6621 * 512 + 256;
		local23 = Static58.method1166(local15, local9, Static420.anInt7829) - Static236.anInt1380;
		@Pc(220) int local220 = local9 - Static311.anInt6050;
		@Pc(225) int local225 = local23 - Static347.anInt6620;
		@Pc(230) int local230 = local15 - Static329.anInt6297;
		@Pc(241) int local241 = (int) Math.sqrt((double) (local230 * local230 + local220 * local220));
		@Pc(252) int local252 = (int) (Math.atan2((double) local225, (double) local241) * 2607.5945876176133D) & 0x3FFF;
		if (local252 < 1024) {
			local252 = 1024;
		}
		@Pc(270) int local270 = (int) (-2607.5945876176133D * Math.atan2((double) local220, (double) local230)) & 0x3FFF;
		if (local252 > 3072) {
			local252 = 3072;
		}
		if (local252 > Static27.anInt778) {
			Static27.anInt778 += Static515.anInt8982 * (local252 - Static27.anInt778 >> 3) / 1000 + Static99.anInt6726 << 3;
			if (local252 < Static27.anInt778) {
				Static27.anInt778 = local252;
			}
		}
		if (local252 < Static27.anInt778) {
			Static27.anInt778 -= Static99.anInt6726 + (Static27.anInt778 - local252 >> 3) * Static515.anInt8982 / 1000 << 3;
			if (Static27.anInt778 < local252) {
				Static27.anInt778 = local252;
			}
		}
		@Pc(344) int local344 = local270 - Static262.anInt5491;
		if (local344 > 8192) {
			local344 -= 16384;
		}
		if (local344 < -8192) {
			local344 += 16384;
		}
		local344 >>= 0x3;
		if (local344 > 0) {
			Static262.anInt5491 += Static99.anInt6726 + local344 * Static515.anInt8982 / 1000 << 3;
			Static262.anInt5491 &= 0x3FFF;
		}
		if (local344 < 0) {
			Static262.anInt5491 -= Static99.anInt6726 + Static515.anInt8982 * -local344 / 1000 << 3;
			Static262.anInt5491 &= 0x3FFF;
		}
		@Pc(406) int local406 = local270 - Static262.anInt5491;
		if (local406 > 8192) {
			local406 -= 16384;
		}
		if (local406 < -8192) {
			local406 += 16384;
		}
		Static100.anInt2054 = 0;
		if (local406 < 0 && local344 > 0 || local406 > 0 && local344 < 0) {
			Static262.anInt5491 = local270;
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	public static void method6623() {
		for (@Pc(3) int local3 = 0; local3 < Static232.aByteArrayArrayArray18.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static232.aByteArrayArrayArray18[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static232.aByteArrayArrayArray18[0][0].length; local11++) {
					Static232.aByteArrayArrayArray18[local3][local7][local11] = 0;
				}
			}
		}
	}
}
