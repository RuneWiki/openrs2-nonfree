import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4 aClass5_Sub2_Sub6_Sub4_27;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "Lclient!we;")
	public static Class77 aClass77_2;

	@OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
	public static int anInt1802;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "J")
	public static volatile long aLong87 = 0L;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "Lclient!mb;")
	public static Class45 aClass45_715 = Static63.method1251("@red@");

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "Lclient!mb;")
	private static Class45 aClass45_719 = Static63.method1251("slide:");

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Lclient!mb;")
	public static Class45 aClass45_716 = aClass45_719;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "Lclient!mb;")
	private static Class45 aClass45_718 = Static63.method1251("Loading title screen )2 ");

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "Lclient!mb;")
	public static Class45 aClass45_717 = aClass45_718;

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "Lclient!mb;")
	public static Class45 aClass45_720 = Static63.method1251("@cr1@");

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "Lclient!mb;")
	public static Class45 aClass45_721 = Static63.method1251("Nehmen");

	@OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
	public static int anInt1800 = 0;

	@OriginalMember(owner = "client!kf", name = "C", descriptor = "[J")
	public static long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLclient!ia;)Z")
	public static boolean method1218(@OriginalArg(1) Class5_Sub2_Sub8 arg0) {
		if (Static110.aBoolean123) {
			if (Static74.method1700(arg0) != 0) {
				return false;
			}
			if (arg0.anInt1269 == 0) {
				return false;
			}
		}
		return arg0.aBoolean68;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!wc;)V")
	public static void method1219(@OriginalArg(1) Class5_Sub2_Sub4_Sub3 arg0) {
		if (arg0.anInt2415 == 0) {
			return;
		}
		@Pc(33) int local33;
		@Pc(40) int local40;
		if (arg0.anInt2411 != -1 && arg0.anInt2411 < 32768) {
			@Pc(24) Class5_Sub2_Sub4_Sub3_Sub2 local24 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[arg0.anInt2411];
			if (local24 != null) {
				local33 = arg0.anInt2428 - local24.anInt2428;
				local40 = arg0.anInt2417 - local24.anInt2417;
				if (local33 != 0 || local40 != 0) {
					arg0.anInt2393 = (int) (Math.atan2((double) local33, (double) local40) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(67) int local67;
		if (arg0.anInt2411 >= 32768) {
			local67 = arg0.anInt2411 - 32768;
			if (local67 == Static73.anInt2175) {
				local67 = 2047;
			}
			@Pc(76) Class5_Sub2_Sub4_Sub3_Sub1 local76 = Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[local67];
			if (local76 != null) {
				local40 = arg0.anInt2428 - local76.anInt2428;
				@Pc(92) int local92 = arg0.anInt2417 - local76.anInt2417;
				if (local40 != 0 || local92 != 0) {
					arg0.anInt2393 = (int) (Math.atan2((double) local40, (double) local92) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2384 != 0 || arg0.anInt2430 != 0) && (arg0.anInt2433 == 0 || arg0.anInt2443 > 0)) {
			local67 = arg0.anInt2428 - (arg0.anInt2384 - Static78.anInt2210 - Static78.anInt2210) * 64;
			local33 = arg0.anInt2417 - (arg0.anInt2430 - Static6.anInt162 - Static6.anInt162) * 64;
			if (local67 != 0 || local33 != 0) {
				arg0.anInt2393 = (int) (Math.atan2((double) local67, (double) local33) * 325.949D) & 0x7FF;
			}
			arg0.anInt2384 = 0;
			arg0.anInt2430 = 0;
		}
		local67 = arg0.anInt2393 - arg0.anInt2407 & 0x7FF;
		if (local67 == 0) {
			arg0.anInt2381 = 0;
			return;
		}
		arg0.anInt2381++;
		@Pc(228) boolean local228;
		if (local67 > 1024) {
			arg0.anInt2407 -= arg0.anInt2415;
			local228 = true;
			if (local67 < arg0.anInt2415 || 2048 - arg0.anInt2415 < local67) {
				local228 = false;
				arg0.anInt2407 = arg0.anInt2393;
			}
			if (arg0.anInt2426 == arg0.anInt2419 && (arg0.anInt2381 > 25 || local228)) {
				if (arg0.anInt2412 == -1) {
					arg0.anInt2419 = arg0.anInt2435;
				} else {
					arg0.anInt2419 = arg0.anInt2412;
				}
			}
		} else {
			arg0.anInt2407 += arg0.anInt2415;
			local228 = true;
			if (local67 < arg0.anInt2415 || 2048 - arg0.anInt2415 < local67) {
				local228 = false;
				arg0.anInt2407 = arg0.anInt2393;
			}
			if (arg0.anInt2419 == arg0.anInt2426 && (arg0.anInt2381 > 25 || local228)) {
				if (arg0.anInt2413 == -1) {
					arg0.anInt2419 = arg0.anInt2435;
				} else {
					arg0.anInt2419 = arg0.anInt2413;
				}
			}
		}
		arg0.anInt2407 &= 0x7FF;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method1220() {
		aClass45_715 = null;
		aLongArray4 = null;
		aClass45_716 = null;
		aClass77_2 = null;
		aClass45_717 = null;
		aClass45_720 = null;
		aClass45_719 = null;
		aClass5_Sub2_Sub6_Sub4_27 = null;
		aClass45_721 = null;
		aClass45_718 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
	public static void method1221() {
		if (Static51.anInt1621 != 0 && Static51.anInt1621 != 3 || Static28.anInt881 != 1) {
			return;
		}
		@Pc(27) int local27 = Static67.anInt1906 - 25 - 550;
		@Pc(31) int local31 = Static36.anInt1063 - 9;
		if (local27 < 0 || local31 < 0 || local27 >= 146 || local31 >= 151) {
			return;
		}
		local27 -= 73;
		@Pc(52) int local52 = Static100.anInt2699 + Static112.anInt2981 & 0x7FF;
		@Pc(56) int local56 = Class5_Sub2_Sub6_Sub2.anIntArray360[local52];
		@Pc(64) int local64 = (Static4.anInt98 + 256) * local56 >> 8;
		local31 -= 75;
		@Pc(69) int local69 = Class5_Sub2_Sub6_Sub2.anIntArray362[local52];
		@Pc(77) int local77 = (Static4.anInt98 + 256) * local69 >> 8;
		@Pc(87) int local87 = local77 * local27 + local64 * local31 >> 11;
		@Pc(97) int local97 = local77 * local31 - local64 * local27 >> 11;
		@Pc(104) int local104 = Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428 + local87 >> 7;
		@Pc(112) int local112 = Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417 - local97 >> 7;
		@Pc(132) boolean local132 = Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 0, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local104, 1, 0, 0, local112, true);
		if (!local132) {
			return;
		}
		Static64.aClass5_Sub9_Sub1_2.method1428(local27);
		Static64.aClass5_Sub9_Sub1_2.method1428(local31);
		Static64.aClass5_Sub9_Sub1_2.method1455(Static112.anInt2981);
		Static64.aClass5_Sub9_Sub1_2.method1428(57);
		Static64.aClass5_Sub9_Sub1_2.method1428(Static100.anInt2699);
		Static64.aClass5_Sub9_Sub1_2.method1428(Static4.anInt98);
		Static64.aClass5_Sub9_Sub1_2.method1428(89);
		Static64.aClass5_Sub9_Sub1_2.method1455(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428);
		Static64.aClass5_Sub9_Sub1_2.method1455(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417);
		Static64.aClass5_Sub9_Sub1_2.method1428(Static71.anInt2070);
		Static64.aClass5_Sub9_Sub1_2.method1428(63);
		return;
	}
}
