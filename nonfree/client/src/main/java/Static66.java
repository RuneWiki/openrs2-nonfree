import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "[I")
	public static int[] anIntArray215;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "Lclient!ha;")
	public static Class25_Sub1 aClass25_Sub1_10;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "Lclient!jb;")
	public static Class25 aClass25_21;

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Lclient!qf;")
	private static Class60 aClass60_899 = Static59.method1195("Loading friend list");

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Lclient!qf;")
	public static Class60 aClass60_895 = aClass60_899;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!qf;")
	public static Class60 aClass60_896 = Static59.method1195("<col=ff0000>");

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "Lclient!qf;")
	public static Class60 aClass60_897 = Static59.method1195("backvmid1");

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "Lclient!qf;")
	public static Class60 aClass60_898 = Static59.method1195("welle2:");

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "[I")
	public static int[] anIntArray216 = new int[4000];

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "Lclient!qf;")
	public static Class60 aClass60_900 = Static59.method1195("Freie Welt");

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "Lclient!qf;")
	public static Class60 aClass60_901 = Static59.method1195("blaugr-Un:");

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!md;I)V")
	public static void method1352(@OriginalArg(0) Class3_Sub1_Sub1_Sub3 arg0) {
		@Pc(9) int local9 = arg0.anInt1535 - Static34.anInt1183;
		if (arg0.anInt1541 == 0) {
			arg0.anInt1501 = 1024;
		}
		@Pc(25) int local25 = arg0.anInt1532 * 64 + arg0.anInt1526 * 128;
		arg0.anInt1498 = 0;
		arg0.anInt1494 += (local25 - arg0.anInt1494) / local9;
		@Pc(55) int local55 = arg0.anInt1532 * 64 + arg0.anInt1528 * 128;
		if (arg0.anInt1541 == 1) {
			arg0.anInt1501 = 1536;
		}
		if (arg0.anInt1541 == 2) {
			arg0.anInt1501 = 0;
		}
		if (arg0.anInt1541 == 3) {
			arg0.anInt1501 = 512;
		}
		arg0.anInt1524 += (local55 - arg0.anInt1524) / local9;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)I")
	public static int method1353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(11) int local11 = arg0 >> 7;
		if (local11 < 0 || local7 < 0 || local11 > 103 || local7 > 103) {
			return 0;
		}
		@Pc(40) int local40 = arg1;
		if (arg1 < 3 && (Static60.aByteArrayArrayArray4[1][local11][local7] & 0x2) == 2) {
			local40 = arg1 + 1;
		}
		@Pc(59) int local59 = arg0 & 0x7F;
		@Pc(63) int local63 = arg2 & 0x7F;
		@Pc(90) int local90 = Static51.anIntArrayArrayArray3[local40][local11][local7] * (128 - local59) + Static51.anIntArrayArrayArray3[local40][local11 + 1][local7] * local59 >> 7;
		@Pc(121) int local121 = Static51.anIntArrayArrayArray3[local40][local11 + 1][local7 + 1] * local59 + Static51.anIntArrayArrayArray3[local40][local11][local7 + 1] * (128 - local59) >> 7;
		return local121 * local63 + local90 * (128 - local63) >> 7;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)I")
	public static int method1354(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(31) int local31 = local16 | local16 >>> 4;
		@Pc(37) int local37 = local31 | local31 >>> 8;
		@Pc(43) int local43 = local37 | local37 >>> 16;
		return local43 + 1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public static void method1355() {
		aClass60_899 = null;
		aClass60_901 = null;
		aClass60_897 = null;
		aClass25_21 = null;
		aClass60_900 = null;
		aShortArrayArray1 = null;
		aClass60_896 = null;
		aClass60_898 = null;
		anIntArray215 = null;
		anIntArray216 = null;
		aClass60_895 = null;
		aClass25_Sub1_10 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZLclient!mf;)[I")
	public static int[] method1356(@OriginalArg(1) Class3_Sub15 arg0) {
		@Pc(6) int local6 = arg0.anInt2286 >> 16;
		if (!Static21.method563(local6)) {
			return null;
		}
		@Pc(24) int local24 = arg0.anInt2243;
		@Pc(27) int local27 = arg0.anInt2291;
		@Pc(30) int local30 = arg0.anInt2306;
		while (local30 != -1) {
			@Pc(40) Class3_Sub15 local40 = Static120.aClass3_Sub15ArrayArray1[local6][local30 & 0xFFFF];
			local27 += local40.anInt2291 - local40.anInt2273;
			local30 = local40.anInt2306;
			local24 += local40.anInt2243 - local40.anInt2241;
		}
		return new int[] { local27, local24 };
	}
}
