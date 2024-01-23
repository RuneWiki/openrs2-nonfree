import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "Lclient!nm;")
	public static Class119 aClass119_92;

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "Lclient!d;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "[I")
	public static int[] anIntArray590 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
	public static int anInt5384 = 0;

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "J")
	public static long aLong205 = 0L;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLclient!nm;Lclient!nm;Lclient!nm;)V")
	public static void method4471(@OriginalArg(1) Class119 arg0, @OriginalArg(2) Class119 arg1, @OriginalArg(3) Class119 arg2) {
		Static188.aClass119_64 = arg0;
		Static300.aClass119_93 = arg2;
		Static11.aClass119_2 = arg1;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4473(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(19) int local19 = 0; local19 < Static144.anInt2798; local19++) {
			if (arg0.equalsIgnoreCase(Static19.aStringArray4[local19])) {
				return local19;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
	public static void method4474() {
		@Pc(5) int local5 = Static108.anInt2261 * 128 + 64;
		@Pc(15) int local15 = Static13.anInt277 * 128 + 64;
		@Pc(23) int local23 = Static42.method768(local15, Static132.anInt2608, local5) - Static261.anInt4825;
		if (Static54.anInt1168 < 100) {
			if (local23 > Static283.anInt5144) {
				Static283.anInt5144 += Static2.anInt94 + Static54.anInt1168 * (local23 - Static283.anInt5144) / 1000;
				if (Static283.anInt5144 > local23) {
					Static283.anInt5144 = local23;
				}
			}
			if (local15 > Static273.anInt5035) {
				Static273.anInt5035 += Static54.anInt1168 * (local15 - Static273.anInt5035) / 1000 + Static2.anInt94;
				if (local15 < Static273.anInt5035) {
					Static273.anInt5035 = local15;
				}
			}
			if (Static273.anInt5035 > local15) {
				Static273.anInt5035 -= (Static273.anInt5035 - local15) * Static54.anInt1168 / 1000 + Static2.anInt94;
				if (local15 > Static273.anInt5035) {
					Static273.anInt5035 = local15;
				}
			}
			if (local5 > Static87.anInt1875) {
				Static87.anInt1875 += (local5 - Static87.anInt1875) * Static54.anInt1168 / 1000 + Static2.anInt94;
				if (Static87.anInt1875 > local5) {
					Static87.anInt1875 = local5;
				}
			}
			if (Static87.anInt1875 > local5) {
				Static87.anInt1875 -= Static2.anInt94 + Static54.anInt1168 * (Static87.anInt1875 - local5) / 1000;
				if (Static87.anInt1875 < local5) {
					Static87.anInt1875 = local5;
				}
			}
			if (Static283.anInt5144 > local23) {
				Static283.anInt5144 -= Static2.anInt94 + (Static283.anInt5144 - local23) * Static54.anInt1168 / 1000;
				if (local23 > Static283.anInt5144) {
					Static283.anInt5144 = local23;
				}
			}
		} else {
			Static273.anInt5035 = Static13.anInt277 * 128 + 64;
			Static87.anInt1875 = Static108.anInt2261 * 128 + 64;
			Static283.anInt5144 = Static42.method768(Static273.anInt5035, Static132.anInt2608, Static87.anInt1875) - Static261.anInt4825;
		}
		local5 = Static148.anInt3027 * 128 + 64;
		local15 = Static99.anInt2122 * 128 + 64;
		local23 = Static42.method768(local15, Static132.anInt2608, local5) - Static246.anInt4521;
		@Pc(231) int local231 = local23 - Static283.anInt5144;
		@Pc(236) int local236 = local5 - Static87.anInt1875;
		@Pc(241) int local241 = local15 - Static273.anInt5035;
		@Pc(252) int local252 = (int) Math.sqrt((double) (local236 * local236 + local241 * local241));
		@Pc(263) int local263 = (int) (Math.atan2((double) local231, (double) local252) * 325.949D) & 0x7FF;
		@Pc(274) int local274 = (int) (-325.949D * Math.atan2((double) local241, (double) local236)) & 0x7FF;
		@Pc(278) int local278 = local274 - Static305.anInt5484;
		if (local278 > 1024) {
			local278 -= 2048;
		}
		if (local278 < -1024) {
			local278 += 2048;
		}
		if (local263 < 128) {
			local263 = 128;
		}
		if (local263 > 383) {
			local263 = 383;
		}
		if (local263 > Static53.anInt1161) {
			Static53.anInt1161 += Static146.anInt3024 + Static29.anInt555 * (local263 - Static53.anInt1161) / 1000;
			if (Static53.anInt1161 > local263) {
				Static53.anInt1161 = local263;
			}
		}
		if (local278 > 0) {
			Static305.anInt5484 += Static29.anInt555 * local278 / 1000 + Static146.anInt3024;
			Static305.anInt5484 &= 0x7FF;
		}
		if (local278 < 0) {
			Static305.anInt5484 -= Static146.anInt3024 + Static29.anInt555 * -local278 / 1000;
			Static305.anInt5484 &= 0x7FF;
		}
		if (Static53.anInt1161 > local263) {
			Static53.anInt1161 -= (Static53.anInt1161 - local263) * Static29.anInt555 / 1000 + Static146.anInt3024;
			if (local263 > Static53.anInt1161) {
				Static53.anInt1161 = local263;
			}
		}
		@Pc(396) int local396 = local274 - Static305.anInt5484;
		if (local396 > 1024) {
			local396 -= 2048;
		}
		if (local396 < -1024) {
			local396 += 2048;
		}
		if (local396 < 0 && local278 > 0 || local396 > 0 && local278 < 0) {
			Static305.anInt5484 = local274;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BI)I")
	public static int method4475(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V")
	public static void method4476() {
		if (Static54.aClass43ArrayArray1 == null) {
			return;
		}
		@Pc(17) Class43 local17 = new Class43();
		for (@Pc(19) int local19 = 0; local19 < 13; local19++) {
			for (@Pc(26) int local26 = 0; local26 < 13; local26++) {
				Static54.aClass43ArrayArray1[local19][local26] = local17;
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)I")
	public static int method4477(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 >>> 31;
		return (arg0 + local8) / arg1 - local8;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)V")
	public static void method4478(@OriginalArg(0) int arg0) {
		if (Static22.anIntArray49 == null || Static22.anIntArray49.length < arg0) {
			Static22.anIntArray49 = new int[arg0];
		}
	}
}
