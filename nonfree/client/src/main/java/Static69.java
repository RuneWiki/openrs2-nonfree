import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	public static int anInt1879;

	@OriginalMember(owner = "client!m", name = "S", descriptor = "Lclient!c;")
	public static Class4_Sub4_Sub1 aClass4_Sub4_Sub1_2;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "Lclient!ec;")
	public static Class22 aClass22_508 = Static60.method1113("(U0a )2 via: ");

	@OriginalMember(owner = "client!m", name = "f", descriptor = "[I")
	public static int[] anIntArray190 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!m", name = "j", descriptor = "Lclient!ec;")
	public static Class22 aClass22_509 = Static60.method1113("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!m", name = "l", descriptor = "I")
	public static int anInt1882 = 0;

	@OriginalMember(owner = "client!m", name = "B", descriptor = "Lclient!ec;")
	private static Class22 aClass22_511 = Static60.method1113("Prepared visibility map");

	@OriginalMember(owner = "client!m", name = "r", descriptor = "Lclient!ec;")
	public static Class22 aClass22_510 = aClass22_511;

	@OriginalMember(owner = "client!m", name = "u", descriptor = "[S")
	public static short[] aShortArray18 = new short[] { -1, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!m", name = "J", descriptor = "[I")
	public static int[] anIntArray192 = new int[1000];

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method1170() {
		Static93.aClass82_9 = new Class82();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
	public static void method1171() {
		aClass22_510 = null;
		aClass22_508 = null;
		anIntArray190 = null;
		aClass4_Sub4_Sub1_2 = null;
		anIntArray192 = null;
		aShortArray18 = null;
		aClass22_509 = null;
		aClass22_511 = null;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	public static void method1172() {
		try {
			if (Static67.aClass9_1 == null) {
				Static67.aClass9_1 = new Class9(Static130.aClass17_4, Static44.method856(new Class22[] { Static38.aClass22_270, Static64.aClass22_484, Static119.aClass22_900 }).method487());
			} else {
				@Pc(36) byte[] local36 = Static67.aClass9_1.method155();
				if (local36 != null) {
					@Pc(43) Class4_Sub11 local43 = new Class4_Sub11(local36);
					Static62.anInt1802 = local43.method718();
					Static79.aClass54Array1 = new Class54[Static62.anInt1802];
					for (@Pc(52) int local52 = 0; local52 < Static62.anInt1802; local52++) {
						@Pc(62) Class54 local62 = Static79.aClass54Array1[local52] = new Class54();
						@Pc(66) int local66 = local43.method718();
						local62.anInt2254 = local66 & 0x7FFF;
						local62.aBoolean201 = (local66 & 0x8000) != 0;
						local62.aClass22_637 = local43.method742();
						local62.anInt2251 = local43.method738();
						local62.anInt2256 = local52;
						local62.anInt2249 = Static16.method284(local62.aClass22_637);
					}
					Static43.method820(0, Static79.aClass54Array1.length - 1, Static80.anIntArray223, Static130.anIntArray339, Static79.aClass54Array1);
					Static97.aBoolean228 = true;
					Static67.aClass9_1 = null;
				}
			}
		} catch (@Pc(119) Exception local119) {
			local119.printStackTrace();
			Static67.aClass9_1 = null;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)I")
	public static int method1173(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 >> 7;
		@Pc(11) int local11 = arg2 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(38) int local38 = arg0;
		@Pc(42) int local42 = arg1 & 0x7F;
		if (arg0 < 3 && (Static3.aByteArrayArrayArray1[1][local7][local11] & 0x2) == 2) {
			local38 = arg0 + 1;
		}
		@Pc(63) int local63 = arg2 & 0x7F;
		@Pc(90) int local90 = local42 * Static57.anIntArrayArrayArray4[local38][local7 + 1][local11] + Static57.anIntArrayArrayArray4[local38][local7][local11] * (128 - local42) >> 7;
		@Pc(122) int local122 = Static57.anIntArrayArrayArray4[local38][local7][local11 + 1] * (128 - local42) + Static57.anIntArrayArrayArray4[local38][local7 + 1][local11 + 1] * local42 >> 7;
		return local90 * (128 - local63) + local122 * local63 >> 7;
	}
}
