import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "[Lclient!rc;")
	public static Class55[] aClass55Array27;

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_25;

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "Lclient!fc;")
	public static Class21 aClass21_27;

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1330 = Static34.method846("Service unavailable)3");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1326 = aClass55_1330;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
	public static int anInt3169 = 0;

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1327 = Static34.method846("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
	public static int anInt3171 = 78;

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1328 = Static34.method846("runes");

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1329 = Static34.method846("null");

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
	public static int anInt3172 = 0;

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	public static int anInt3173 = 0;

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1331 = Static34.method846("overlay_multiway");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZLclient!pb;Lclient!pb;I)Lclient!ka;")
	public static Class6_Sub2_Sub7 method2041(@OriginalArg(0) int arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) Class40 arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(12) int[] local12 = arg1.method1240(arg0);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(26) byte[] local26 = arg1.method1228(local12[local14], arg0);
			if (local26 == null) {
				local3 = false;
			} else {
				@Pc(46) int local46 = local26[1] & 0xFF | (local26[0] & 0xFF) << 8;
				@Pc(62) byte[] local62 = arg2.method1228(0, local46);
				if (local62 == null) {
					local3 = false;
				}
			}
		}
		if (!local3) {
			return null;
		}
		try {
			return new Class6_Sub2_Sub7(arg1, arg2, arg0, false);
		} catch (@Pc(88) Exception local88) {
			return null;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	public static void method2042() {
		aClass55Array27 = null;
		aClass55_1328 = null;
		aClass55_1327 = null;
		aClass55_1326 = null;
		aClass55_1331 = null;
		aClass55_1329 = null;
		aClass21_27 = null;
		aClass55_1330 = null;
		aClass6_Sub2_Sub2_Sub1_25 = null;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V")
	public static void method2044() {
		for (@Pc(7) int local7 = -1; local7 < Static78.anInt2246; local7++) {
			@Pc(23) int local23;
			if (local7 == -1) {
				local23 = 2047;
			} else {
				local23 = Static101.anIntArray283[local7];
			}
			@Pc(31) Class6_Sub2_Sub3_Sub1_Sub1 local31 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local23];
			if (local31 != null) {
				Static107.method2004(1, local31);
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!jd;Z)V")
	public static void method2045(@OriginalArg(0) Class6_Sub2_Sub3_Sub1 arg0) {
		arg0.aBoolean126 = false;
		@Pc(17) Class6_Sub2_Sub13 local17;
		if (arg0.anInt2741 != -1) {
			local17 = Static4.method1608(arg0.anInt2741);
			if (local17 == null || local17.anIntArray264 == null) {
				arg0.anInt2741 = -1;
			} else {
				arg0.anInt2715++;
				if (arg0.anInt2738 < local17.anIntArray264.length && arg0.anInt2715 > local17.anIntArray261[arg0.anInt2738]) {
					arg0.anInt2738++;
					arg0.anInt2715 = 1;
				}
				if (arg0.anInt2738 >= local17.anIntArray264.length) {
					arg0.anInt2738 = 0;
					arg0.anInt2715 = 0;
				}
			}
		}
		if (arg0.anInt2722 != -1 && arg0.anInt2750 <= Static85.anInt2389) {
			if (arg0.anInt2699 < 0) {
				arg0.anInt2699 = 0;
			}
			@Pc(103) int local103 = Static98.method1873(arg0.anInt2722).anInt2066;
			if (local103 == -1) {
				arg0.anInt2722 = -1;
			} else {
				@Pc(115) Class6_Sub2_Sub13 local115 = Static4.method1608(local103);
				if (local115 == null || local115.anIntArray264 == null) {
					arg0.anInt2722 = -1;
				} else {
					arg0.anInt2714++;
					if (local115.anIntArray264.length > arg0.anInt2699 && local115.anIntArray261[arg0.anInt2699] < arg0.anInt2714) {
						arg0.anInt2699++;
						arg0.anInt2714 = 1;
					}
					if (local115.anIntArray264.length <= arg0.anInt2699 && (arg0.anInt2699 < 0 || arg0.anInt2699 >= local115.anIntArray264.length)) {
						arg0.anInt2722 = -1;
					}
				}
			}
		}
		if (arg0.anInt2717 != -1 && arg0.anInt2711 <= 1) {
			local17 = Static4.method1608(arg0.anInt2717);
			if (local17.anInt2803 == 1 && arg0.anInt2740 > 0 && Static85.anInt2389 >= arg0.anInt2742 && Static85.anInt2389 > arg0.anInt2754) {
				arg0.anInt2711 = 1;
				return;
			}
		}
		if (arg0.anInt2717 != -1 && arg0.anInt2711 == 0) {
			local17 = Static4.method1608(arg0.anInt2717);
			if (local17 == null || local17.anIntArray264 == null) {
				arg0.anInt2717 = -1;
			} else {
				arg0.anInt2721++;
				if (arg0.anInt2734 < local17.anIntArray264.length && arg0.anInt2721 > local17.anIntArray261[arg0.anInt2734]) {
					arg0.anInt2734++;
					arg0.anInt2721 = 1;
				}
				if (local17.anIntArray264.length <= arg0.anInt2734) {
					arg0.anInt2731++;
					arg0.anInt2734 -= local17.anInt2804;
					if (arg0.anInt2731 >= local17.anInt2818) {
						arg0.anInt2717 = -1;
					}
					if (arg0.anInt2734 < 0 || local17.anIntArray264.length <= arg0.anInt2734) {
						arg0.anInt2717 = -1;
					}
				}
				arg0.aBoolean126 = local17.aBoolean128;
			}
		}
		if (arg0.anInt2711 > 0) {
			arg0.anInt2711--;
		}
	}
}
