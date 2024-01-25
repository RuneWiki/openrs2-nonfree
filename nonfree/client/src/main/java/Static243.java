import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!pk", name = "W", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!pk", name = "bb", descriptor = "Lclient!wj;")
	public static Class220 aClass220_2;

	@OriginalMember(owner = "client!pk", name = "cb", descriptor = "Lclient!fp;")
	public static Class63 aClass63_6;

	@OriginalMember(owner = "client!pk", name = "db", descriptor = "F")
	public static float aFloat53;

	@OriginalMember(owner = "client!pk", name = "B", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_168 = new Class18(49, 8);

	@OriginalMember(owner = "client!pk", name = "V", descriptor = "Lclient!kg;")
	public static Class112 aClass112_15 = null;

	@OriginalMember(owner = "client!pk", name = "X", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_169 = new Class18(54, -1);

	@OriginalMember(owner = "client!pk", name = "Y", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_170 = new Class18(74, 1);

	@OriginalMember(owner = "client!pk", name = "Z", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[128][128];

	@OriginalMember(owner = "client!pk", name = "ab", descriptor = "Z")
	public static boolean aBoolean373 = false;

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "(B)V")
	public static void method4537() {
		@Pc(3) Class195[] local3 = Class118_Sub2.aClass195Array1;
		synchronized (Class118_Sub2.aClass195Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class118_Sub2.aClass195Array1.length; local7++) {
				Class118_Sub2.aClass195Array1[local7] = new Class195();
				Static43.anIntArray413[local7] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLclient!wc;I)V")
	public static void method4538(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class11_Sub2_Sub6_Sub1 arg1) {
		if (Static224.anInt4512 >= 400 || Static191.aClass11_Sub2_Sub6_Sub1_4 == arg1) {
			return;
		}
		@Pc(136) String local136;
		@Pc(68) int local68;
		if (arg1.anInt6708 == 0) {
			@Pc(22) boolean local22 = true;
			if (Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6710 != -1 && arg1.anInt6710 != -1) {
				@Pc(42) int local42 = Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6685 > arg1.anInt6685 ? Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6685 : arg1.anInt6685;
				@Pc(57) int local57 = Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6710 < arg1.anInt6710 ? Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6710 : arg1.anInt6710;
				local68 = local57 + local42 * 10 / 100 + 5;
				@Pc(74) int local74 = Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6685 - arg1.anInt6685;
				if (local74 < 0) {
					local74 = -local74;
				}
				if (local74 > local68) {
					local22 = false;
				}
			}
			@Pc(101) String local101 = Static215.aClass81_2 == Static285.aClass81_4 ? Static127.aClass106_100.method2927(Static254.anInt5172) : Static230.aClass106_70.method2927(Static254.anInt5172);
			if (arg1.anInt6685 >= arg1.anInt6695) {
				local136 = arg1.method5853() + (local22 ? Static363.method6018(Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6685, arg1.anInt6685) : "<col=ffffff>") + " (" + local101 + arg1.anInt6685 + ")";
			} else {
				local136 = arg1.method5853() + (local22 ? Static363.method6018(Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6685, arg1.anInt6685) : "<col=ffffff>") + " (" + local101 + arg1.anInt6685 + "+" + (arg1.anInt6695 - arg1.anInt6685) + ")";
			}
		} else {
			local136 = arg1.method5853() + " (" + Static255.aClass106_179.method2927(Static254.anInt5172) + arg1.anInt6708 + ")";
		}
		if (Static77.aBoolean119) {
			if (!arg0 && (Static127.anInt2772 & 0x8) != 0) {
				Static295.method5151(Static62.anInt1506, 0, false, true, Static365.aString65, (long) arg1.anInt6792, Static196.aString39 + " -> <col=ffffff>" + local136, 44, 0);
			}
		} else if (arg0) {
			Static295.method5151(-1, 0, true, false, "<col=cccccc>" + local136, 0L, "", 0, 0);
		} else {
			for (@Pc(207) int local207 = 7; local207 >= 0; local207--) {
				if (Static19.aStringArray2[local207] != null) {
					@Pc(215) short local215 = 0;
					if (Static171.aClass81_1 == Static285.aClass81_4 && Static19.aStringArray2[local207].equalsIgnoreCase(Static312.aClass106_207.method2927(Static254.anInt5172))) {
						if (arg1.anInt6685 > Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6685) {
							local215 = 2000;
						}
						if (Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6707 != 0 && arg1.anInt6707 != 0) {
							if (arg1.anInt6707 == Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6707) {
								local215 = 2000;
							} else {
								local215 = 0;
							}
						}
					} else if (Static135.aBooleanArray15[local207]) {
						local215 = 2000;
					}
					@Pc(273) short local273 = (short) (local215 + Static185.aShortArray46[local207]);
					local68 = Static182.anIntArray283[local207] == -1 ? Static324.anInt6150 : Static182.anIntArray283[local207];
					Static295.method5151(local68, 0, false, true, Static19.aStringArray2[local207], (long) arg1.anInt6792, "<col=ffffff>" + local136, local273, 0);
				}
			}
		}
		if (arg0) {
			return;
		}
		for (@Pc(378) Class1_Sub22 local378 = (Class1_Sub22) Static317.aClass42_43.method1543(); local378 != null; local378 = (Class1_Sub22) Static317.aClass42_43.method1551()) {
			if (local378.anInt2822 == 18) {
				local378.aString22 = "<col=ffffff>" + local136;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(CB)Z")
	public static boolean method4540(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "(B)V")
	public static void method4544() {
		Static247.anIntArray387 = null;
		Static16.anIntArray34 = null;
		Static287.aBoolean425 = false;
		Static12.anIntArray25 = null;
		Static162.aBooleanArray17 = null;
		Static96.aClipboard1 = null;
		Static113.method2415();
	}
}
