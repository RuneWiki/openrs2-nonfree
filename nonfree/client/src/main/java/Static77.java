import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!o", name = "b", descriptor = "Lclient!gf;")
	public static Class1_Sub1_Sub2_Sub2_Sub1 aClass1_Sub1_Sub2_Sub2_Sub1_1;

	@OriginalMember(owner = "client!o", name = "k", descriptor = "[Lclient!i;")
	public static Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array8;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "I")
	public static int anInt2146 = 0;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "I")
	public static int anInt2147 = 0;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1139 = Static106.method1849("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!o", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray6 = new byte[50][];

	@OriginalMember(owner = "client!o", name = "g", descriptor = "I")
	public static int anInt2149 = 0;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1140 = Static106.method1849(" <col=ffff00>");

	@OriginalMember(owner = "client!o", name = "j", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1141 = Static106.method1849(")2");

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II[BI)I")
	public static int method1473(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg2; local9 < arg0; local9++) {
			local7 = local7 >>> 8 ^ Class1_Sub4.anIntArray71[(arg1[local9] ^ local7) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	public static void method1474() {
		Static44.aClass60_46.method1747();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method1475(@OriginalArg(0) Class1_Sub1_Sub1_Sub5 arg0) {
		arg0.anInt1247 = arg0.anInt1288;
		if (arg0.anInt1237 == 0) {
			arg0.anInt1277 = 0;
			return;
		}
		if (arg0.anInt1266 != -1 && arg0.anInt1257 == 0) {
			@Pc(31) Class1_Sub1_Sub15 local31 = Static56.method1247(arg0.anInt1266);
			if (arg0.anInt1284 > 0 && local31.anInt2650 == 0) {
				arg0.anInt1277++;
				return;
			}
			if (arg0.anInt1284 <= 0 && local31.anInt2668 == 0) {
				arg0.anInt1277++;
				return;
			}
		}
		@Pc(78) int local78 = arg0.anIntArray191[arg0.anInt1237 - 1] * 128 + arg0.anInt1248 * 64;
		@Pc(93) int local93 = arg0.anIntArray189[arg0.anInt1237 - 1] * 128 + arg0.anInt1248 * 64;
		@Pc(96) int local96 = arg0.anInt1271;
		@Pc(99) int local99 = arg0.anInt1261;
		if (local93 - local99 > 256 || local93 - local99 < -256 || local78 - local96 > 256 || local78 - local96 < -256) {
			arg0.anInt1271 = local78;
			arg0.anInt1261 = local93;
			return;
		}
		if (local99 < local93) {
			if (local96 < local78) {
				arg0.anInt1269 = 1280;
			} else if (local96 <= local78) {
				arg0.anInt1269 = 1536;
			} else {
				arg0.anInt1269 = 1792;
			}
		} else if (local99 > local93) {
			if (local78 > local96) {
				arg0.anInt1269 = 768;
			} else if (local96 > local78) {
				arg0.anInt1269 = 256;
			} else {
				arg0.anInt1269 = 512;
			}
		} else if (local78 > local96) {
			arg0.anInt1269 = 1024;
		} else if (local96 > local78) {
			arg0.anInt1269 = 0;
		}
		@Pc(237) int local237 = arg0.anInt1269 - arg0.anInt1290 & 0x7FF;
		@Pc(239) boolean local239 = true;
		@Pc(241) int local241 = 4;
		@Pc(244) int local244 = arg0.anInt1296;
		if (local237 > 1024) {
			local237 -= 2048;
		}
		if (local237 >= -256 && local237 <= 256) {
			local244 = arg0.anInt1262;
		} else if (local237 >= 256 && local237 < 768) {
			local244 = arg0.anInt1291;
		} else if (local237 >= -768 && local237 <= -256) {
			local244 = arg0.anInt1250;
		}
		if (local244 == -1) {
			local244 = arg0.anInt1262;
		}
		arg0.anInt1247 = local244;
		if (arg0 instanceof Class1_Sub1_Sub1_Sub5_Sub1) {
			local239 = ((Class1_Sub1_Sub1_Sub5_Sub1) arg0).aClass1_Sub1_Sub5_1.aBoolean62;
		}
		if (local239) {
			if (arg0.anInt1290 != arg0.anInt1269 && arg0.anInt1241 == -1 && arg0.anInt1243 != 0) {
				local241 = 2;
			}
			if (arg0.anInt1237 > 2) {
				local241 = 6;
			}
			if (arg0.anInt1237 > 3) {
				local241 = 8;
			}
			if (arg0.anInt1277 > 0 && arg0.anInt1237 > 1) {
				arg0.anInt1277--;
				local241 = 8;
			}
		} else {
			if (arg0.anInt1237 > 1) {
				local241 = 6;
			}
			if (arg0.anInt1237 > 2) {
				local241 = 8;
			}
			if (arg0.anInt1277 > 0 && arg0.anInt1237 > 1) {
				arg0.anInt1277--;
				local241 = 8;
			}
		}
		if (arg0.aBooleanArray8[arg0.anInt1237 - 1]) {
			local241 <<= 0x1;
		}
		if (local78 > local96) {
			arg0.anInt1271 += local241;
			if (local78 < arg0.anInt1271) {
				arg0.anInt1271 = local78;
			}
		} else if (local96 > local78) {
			arg0.anInt1271 -= local241;
			if (local78 > arg0.anInt1271) {
				arg0.anInt1271 = local78;
			}
		}
		if (local99 < local93) {
			arg0.anInt1261 += local241;
			if (local93 < arg0.anInt1261) {
				arg0.anInt1261 = local93;
			}
		} else if (local93 < local99) {
			arg0.anInt1261 -= local241;
			if (arg0.anInt1261 < local93) {
				arg0.anInt1261 = local93;
			}
		}
		if (arg0.anInt1261 == local93 && arg0.anInt1271 == local78) {
			if (arg0.anInt1284 > 0) {
				arg0.anInt1284--;
			}
			arg0.anInt1237--;
		}
		if (local241 >= 8 && arg0.anInt1247 == arg0.anInt1262 && arg0.anInt1251 != -1) {
			arg0.anInt1247 = arg0.anInt1251;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)I")
	public static int method1476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 >> 7;
		@Pc(11) int local11 = arg2 >> 7;
		if (local11 < 0 || local7 < 0 || local11 > 103 || local7 > 103) {
			return 0;
		}
		@Pc(35) int local35 = arg2 & 0x7F;
		@Pc(37) int local37 = arg1;
		if (arg1 < 3 && (Static87.aByteArrayArrayArray15[1][local11][local7] & 0x2) == 2) {
			local37 = arg1 + 1;
		}
		@Pc(63) int local63 = arg0 & 0x7F;
		@Pc(94) int local94 = local35 * Static44.anIntArrayArrayArray3[local37][local11 + 1][local7 + 1] + (128 - local35) * Static44.anIntArrayArrayArray3[local37][local11][local7 - -1] >> 7;
		@Pc(120) int local120 = local35 * Static44.anIntArrayArrayArray3[local37][local11 + 1][local7] + (128 - local35) * Static44.anIntArrayArrayArray3[local37][local11][local7] >> 7;
		return local63 * local94 + local120 * (128 - local63) >> 7;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public static void method1477() {
		aClass66_1140 = null;
		aClass66_1141 = null;
		aClass66_1139 = null;
		aClass1_Sub1_Sub2_Sub2_Sub1_1 = null;
		aByteArrayArray6 = null;
		aClass1_Sub1_Sub2_Sub3Array8 = null;
	}
}
