import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "Lclient!we;")
	public static Class62 aClass62_26;

	@OriginalMember(owner = "client!wb", name = "S", descriptor = "Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3 aClass3_Sub1_Sub5_Sub3_26;

	@OriginalMember(owner = "client!wb", name = "Z", descriptor = "Lclient!we;")
	public static Class62 aClass62_27;

	@OriginalMember(owner = "client!wb", name = "gb", descriptor = "Lclient!we;")
	public static Class62 aClass62_28;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "Z")
	public static volatile boolean aBoolean128 = true;

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
	public static int anInt2858 = -1;

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "Lclient!na;")
	public static Class53 aClass53_1425 = Static109.method1737(")1p");

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "Lclient!na;")
	private static Class53 aClass53_1426 = Static109.method1737("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!wb", name = "Y", descriptor = "Lclient!na;")
	private static Class53 aClass53_1429 = Static109.method1737("Free world");

	@OriginalMember(owner = "client!wb", name = "R", descriptor = "Lclient!na;")
	public static Class53 aClass53_1427 = aClass53_1429;

	@OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
	public static int anInt2862 = 0;

	@OriginalMember(owner = "client!wb", name = "db", descriptor = "Lclient!na;")
	private static Class53 aClass53_1431 = Static109.method1737("Loading textures )2 ");

	@OriginalMember(owner = "client!wb", name = "V", descriptor = "Lclient!na;")
	public static Class53 aClass53_1428 = aClass53_1431;

	@OriginalMember(owner = "client!wb", name = "X", descriptor = "Z")
	public static boolean aBoolean129 = false;

	@OriginalMember(owner = "client!wb", name = "ab", descriptor = "Lclient!na;")
	public static Class53 aClass53_1430 = aClass53_1426;

	@OriginalMember(owner = "client!wb", name = "bb", descriptor = "[I")
	public static int[] anIntArray414 = new int[] { 0, 0, -1, 0, 0, 0, 15, 0, 0, 0, 1, 0, 0, 0, 1, 6, 0, 0, 0, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, 4, 6, 8, 0, 6, 0, 10, 0, 0, 10, 0, 0, 0, 1, 0, 0, 4, 0, -1, 0, 0, 0, 7, 0, 2, 0, 0, 0, 0, 6, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 6, 0, 2, 0, 3, 0, 0, 0, 0, 0, -2, 2, 0, 0, 0, 0, 0, -1, 0, 0, 0, 2, 0, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 7, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2, 1, 0, 6, 3, 0, 8, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 3, 2, 0, 0, 0, 4, 2, 0, 5, 0, 0, 0, 4, 0, 0, -2, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 4, 0, 0, 0, 4, 0, -1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 10, 0, 0, 5, 11, 5, 0, 0, 0, -2, 0, 4, 14, 0, 2, 0, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, -2, 5, 0, 0, 0, 0, 0, 0, 0, 6, 4, 0, 0, 6, -2, 0, -1, 0, 0, 0, 0, 3, 0, 0, 0, 0, -2, 6, 0, 0, 0, 0, 0, 0, 0, -2, 0, 6, 0, 0, -2, 6 };

	@OriginalMember(owner = "client!wb", name = "eb", descriptor = "Lclient!na;")
	public static Class53 aClass53_1432 = Static109.method1737("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!wb", name = "fb", descriptor = "I")
	public static int anInt2865 = -1;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!qe;I)V")
	public static void method1959(@OriginalArg(0) Class3_Sub1_Sub4_Sub1 arg0) {
		if (arg0.anInt1438 == 0) {
			return;
		}
		@Pc(38) int local38;
		@Pc(45) int local45;
		if (arg0.anInt1417 != -1 && arg0.anInt1417 < 32768) {
			@Pc(29) Class3_Sub1_Sub4_Sub1_Sub1 local29 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[arg0.anInt1417];
			if (local29 != null) {
				local38 = arg0.anInt1424 - local29.anInt1424;
				local45 = arg0.anInt1427 - local29.anInt1427;
				if (local38 != 0 || local45 != 0) {
					arg0.anInt1430 = (int) (Math.atan2((double) local38, (double) local45) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(73) int local73;
		if (arg0.anInt1417 >= 32768) {
			local73 = arg0.anInt1417 - 32768;
			if (Static78.anInt1959 == local73) {
				local73 = 2047;
			}
			@Pc(86) Class3_Sub1_Sub4_Sub1_Sub2 local86 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local73];
			if (local86 != null) {
				local45 = arg0.anInt1424 - local86.anInt1424;
				@Pc(101) int local101 = arg0.anInt1427 - local86.anInt1427;
				if (local45 != 0 || local101 != 0) {
					arg0.anInt1430 = (int) (Math.atan2((double) local45, (double) local101) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt1451 != 0 || arg0.anInt1423 != 0) && (arg0.anInt1418 == 0 || arg0.anInt1476 > 0)) {
			local73 = arg0.anInt1424 - (arg0.anInt1451 - Static80.anInt2029 - Static80.anInt2029) * 64;
			local38 = arg0.anInt1427 - (arg0.anInt1423 - Static4.anInt145 - Static4.anInt145) * 64;
			if (local73 != 0 || local38 != 0) {
				arg0.anInt1430 = (int) (Math.atan2((double) local73, (double) local38) * 325.949D) & 0x7FF;
			}
			arg0.anInt1451 = 0;
			arg0.anInt1423 = 0;
		}
		local73 = arg0.anInt1430 - arg0.anInt1426 & 0x7FF;
		if (local73 == 0) {
			arg0.anInt1435 = 0;
			return;
		}
		arg0.anInt1435++;
		@Pc(230) boolean local230;
		if (local73 > 1024) {
			arg0.anInt1426 -= arg0.anInt1438;
			local230 = true;
			if (local73 < arg0.anInt1438 || local73 > 2048 - arg0.anInt1438) {
				local230 = false;
				arg0.anInt1426 = arg0.anInt1430;
			}
			if (arg0.anInt1436 == arg0.anInt1449 && (arg0.anInt1435 > 25 || local230)) {
				if (arg0.anInt1446 == -1) {
					arg0.anInt1436 = arg0.anInt1437;
				} else {
					arg0.anInt1436 = arg0.anInt1446;
				}
			}
		} else {
			arg0.anInt1426 += arg0.anInt1438;
			local230 = true;
			if (local73 < arg0.anInt1438 || 2048 - arg0.anInt1438 < local73) {
				arg0.anInt1426 = arg0.anInt1430;
				local230 = false;
			}
			if (arg0.anInt1449 == arg0.anInt1436 && (arg0.anInt1435 > 25 || local230)) {
				if (arg0.anInt1428 == -1) {
					arg0.anInt1436 = arg0.anInt1437;
				} else {
					arg0.anInt1436 = arg0.anInt1428;
				}
			}
		}
		arg0.anInt1426 &= 0x7FF;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)Z")
	public static boolean method1960(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
	public static void method1961() {
		aClass53_1428 = null;
		anIntArray414 = null;
		aClass53_1429 = null;
		aClass53_1432 = null;
		aClass62_26 = null;
		aClass53_1431 = null;
		aClass62_28 = null;
		aClass53_1426 = null;
		aClass53_1430 = null;
		aClass53_1425 = null;
		aClass53_1427 = null;
		aClass62_27 = null;
		aClass3_Sub1_Sub5_Sub3_26 = null;
	}
}
