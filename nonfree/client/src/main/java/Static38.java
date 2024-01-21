import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ed", name = "ub", descriptor = "Lclient!sg;")
	private static Class77 aClass77_438 = Static146.method2172("No reply from loginserver)3");

	@OriginalMember(owner = "client!ed", name = "bb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_432 = aClass77_438;

	@OriginalMember(owner = "client!ed", name = "kb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_436 = Static146.method2172("Error connecting to server)3");

	@OriginalMember(owner = "client!ed", name = "cb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_433 = aClass77_436;

	@OriginalMember(owner = "client!ed", name = "db", descriptor = "Lclient!sg;")
	public static Class77 aClass77_434 = Static146.method2172("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!ed", name = "gb", descriptor = "I")
	public static int anInt1105 = 0;

	@OriginalMember(owner = "client!ed", name = "ib", descriptor = "Lclient!sg;")
	public static Class77 aClass77_435 = Static146.method2172("null");

	@OriginalMember(owner = "client!ed", name = "mb", descriptor = "I")
	public static int anInt1109 = 0;

	@OriginalMember(owner = "client!ed", name = "ob", descriptor = "Lclient!sg;")
	public static Class77 aClass77_437 = Static146.method2172("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!ed", name = "rb", descriptor = "I")
	public static int anInt1113 = 0;

	@OriginalMember(owner = "client!ed", name = "tb", descriptor = "[Lclient!sg;")
	public static Class77[] aClass77Array8 = new Class77[8];

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "(I)V")
	public static void method768() {
		aClass77_437 = null;
		aClass77Array8 = null;
		aClass77_433 = null;
		aClass77_435 = null;
		aClass77_434 = null;
		aClass77_436 = null;
		aClass77_432 = null;
		aClass77_438 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
	public static void method769(@OriginalArg(1) int arg0) {
		if (Static40.method798(arg0)) {
			Static156.method2668(Static125.aClass66ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!v;)V")
	public static void method770(@OriginalArg(1) Class2_Sub2_Sub1_Sub6 arg0) {
		arg0.anInt4389 = arg0.anInt4413;
		if (arg0.anInt4403 == 0) {
			arg0.anInt4378 = 0;
			return;
		}
		if (arg0.anInt4399 != -1 && arg0.anInt4376 == 0) {
			@Pc(31) Class2_Sub2_Sub15 local31 = Static140.method2333(arg0.anInt4399);
			if (arg0.anInt4421 > 0 && local31.anInt3727 == 0) {
				arg0.anInt4378++;
				return;
			}
			if (arg0.anInt4421 <= 0 && local31.anInt3731 == 0) {
				arg0.anInt4378++;
				return;
			}
		}
		@Pc(63) int local63 = arg0.anInt4400;
		@Pc(66) int local66 = arg0.anInt4385;
		@Pc(81) int local81 = arg0.anIntArray620[arg0.anInt4403 - 1] * 128 + arg0.anInt4409 * 64;
		@Pc(96) int local96 = arg0.anInt4409 * 64 + arg0.anIntArray622[arg0.anInt4403 - 1] * 128;
		if (local96 - local63 > 256 || local96 - local63 < -256 || local81 - local66 > 256 || local81 - local66 < -256) {
			arg0.anInt4400 = local96;
			arg0.anInt4385 = local81;
			return;
		}
		if (local96 <= local63) {
			if (local96 < local63) {
				if (local81 > local66) {
					arg0.anInt4387 = 768;
				} else if (local66 > local81) {
					arg0.anInt4387 = 256;
				} else {
					arg0.anInt4387 = 512;
				}
			} else if (local66 < local81) {
				arg0.anInt4387 = 1024;
			} else if (local81 < local66) {
				arg0.anInt4387 = 0;
			}
		} else if (local66 < local81) {
			arg0.anInt4387 = 1280;
		} else if (local66 > local81) {
			arg0.anInt4387 = 1792;
		} else {
			arg0.anInt4387 = 1536;
		}
		@Pc(217) int local217 = arg0.anInt4388;
		@Pc(226) int local226 = arg0.anInt4387 - arg0.anInt4415 & 0x7FF;
		if (local226 > 1024) {
			local226 -= 2048;
		}
		if (local226 >= -256 && local226 <= 256) {
			local217 = arg0.anInt4380;
		} else if (local226 >= 256 && local226 < 768) {
			local217 = arg0.anInt4425;
		} else if (local226 >= -768 && local226 <= -256) {
			local217 = arg0.anInt4407;
		}
		@Pc(273) int local273 = 4;
		if (local217 == -1) {
			local217 = arg0.anInt4380;
		}
		arg0.anInt4389 = local217;
		@Pc(284) boolean local284 = true;
		if (arg0 instanceof Class2_Sub2_Sub1_Sub6_Sub2) {
			local284 = ((Class2_Sub2_Sub1_Sub6_Sub2) arg0).aClass2_Sub2_Sub16_1.aBoolean153;
		}
		if (local284) {
			if (arg0.anInt4415 != arg0.anInt4387 && arg0.anInt4402 == -1 && arg0.anInt4397 != 0) {
				local273 = 2;
			}
			if (arg0.anInt4403 > 2) {
				local273 = 6;
			}
			if (arg0.anInt4403 > 3) {
				local273 = 8;
			}
			if (arg0.anInt4378 > 0 && arg0.anInt4403 > 1) {
				arg0.anInt4378--;
				local273 = 8;
			}
		} else {
			if (arg0.anInt4403 > 1) {
				local273 = 6;
			}
			if (arg0.anInt4403 > 2) {
				local273 = 8;
			}
			if (arg0.anInt4378 > 0 && arg0.anInt4403 > 1) {
				local273 = 8;
				arg0.anInt4378--;
			}
		}
		if (arg0.aBooleanArray20[arg0.anInt4403 - 1]) {
			local273 <<= 0x1;
		}
		if (local63 < local96) {
			arg0.anInt4400 += local273;
			if (arg0.anInt4400 > local96) {
				arg0.anInt4400 = local96;
			}
		} else if (local63 > local96) {
			arg0.anInt4400 -= local273;
			if (arg0.anInt4400 < local96) {
				arg0.anInt4400 = local96;
			}
		}
		if (local66 < local81) {
			arg0.anInt4385 += local273;
			if (local81 < arg0.anInt4385) {
				arg0.anInt4385 = local81;
			}
		} else if (local81 < local66) {
			arg0.anInt4385 -= local273;
			if (arg0.anInt4385 < local81) {
				arg0.anInt4385 = local81;
			}
		}
		if (arg0.anInt4400 == local96 && arg0.anInt4385 == local81) {
			arg0.anInt4403--;
			if (arg0.anInt4421 > 0) {
				arg0.anInt4421--;
			}
		}
		if (local273 >= 8 && arg0.anInt4380 == arg0.anInt4389 && arg0.anInt4395 != -1) {
			arg0.anInt4389 = arg0.anInt4395;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(BI)Z")
	public static boolean method771(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}
}
