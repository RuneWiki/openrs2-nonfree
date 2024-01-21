import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
	public static int anInt3233;

	@OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
	public static int anInt3240;

	@OriginalMember(owner = "client!oc", name = "E", descriptor = "Lclient!o;")
	public static Class4_Sub1 aClass4_Sub1_41;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
	public static final int anInt3235 = 4;

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "[I")
	public static int[] anIntArray309 = new int[anInt3235];

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
	public static int anInt3234 = 0;

	@OriginalMember(owner = "client!oc", name = "z", descriptor = "[[Lclient!hi;")
	public static Class35[][] aClass35ArrayArray1 = new Class35[anInt3235][500];

	@OriginalMember(owner = "client!oc", name = "B", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1077 = Static161.method2971("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

	@OriginalMember(owner = "client!oc", name = "C", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1078 = Static161.method2971("p12_full");

	@OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
	public static int anInt3241 = 0;

	@OriginalMember(owner = "client!oc", name = "F", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1079 = Static161.method2971("Loaded config");

	@OriginalMember(owner = "client!oc", name = "G", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1080 = aClass13_1079;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
	public static void method2297() {
		if (Static176.aBooleanArray53[96]) {
			Static32.anInt4101 += (-Static32.anInt4101 - 24) / 2;
		} else if (Static176.aBooleanArray53[97]) {
			Static32.anInt4101 += (24 - Static32.anInt4101) / 2;
		} else {
			Static32.anInt4101 /= 2;
		}
		@Pc(40) int local40 = Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596 + Static109.anInt2977;
		Static2.anInt101 = Static32.anInt4101 / 2 + Static2.anInt101 & 0x7FF;
		@Pc(61) int local61 = Static133.anInt3344 + Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606;
		if (Static176.aBooleanArray53[98]) {
			Static5.anInt147 += (12 - Static5.anInt147) / 2;
		} else if (Static176.aBooleanArray53[99]) {
			Static5.anInt147 += (-Static5.anInt147 - 12) / 2;
		} else {
			Static5.anInt147 /= 2;
		}
		Static30.anInt1075 += Static5.anInt147 / 2;
		if (Static30.anInt1075 < 128) {
			Static30.anInt1075 = 128;
		}
		if (Static75.anInt2136 - local40 < -500 || Static75.anInt2136 - local40 > 500 || Static147.anInt3572 - local61 < -500 || Static147.anInt3572 - local61 > 500) {
			Static147.anInt3572 = local61;
			Static75.anInt2136 = local40;
		}
		if (Static147.anInt3572 != local61) {
			Static147.anInt3572 += (local61 - Static147.anInt3572) / 16;
		}
		@Pc(158) int local158 = Static147.anInt3572 >> 7;
		if (Static30.anInt1075 > 383) {
			Static30.anInt1075 = 383;
		}
		if (Static75.anInt2136 != local40) {
			Static75.anInt2136 += (local40 - Static75.anInt2136) / 16;
		}
		@Pc(179) int local179 = 0;
		@Pc(183) int local183 = Static75.anInt2136 >> 7;
		@Pc(189) int local189 = Static66.method1449(Static156.anInt3696, Static147.anInt3572, Static75.anInt2136);
		@Pc(209) int local209;
		if (local183 > 3 && local158 > 3 && local183 < 100 && local158 < 100) {
			for (local209 = local183 - 4; local209 <= local183 + 4; local209++) {
				for (@Pc(215) int local215 = local158 - 4; local215 <= local158 + 4; local215++) {
					@Pc(219) int local219 = Static156.anInt3696;
					if (local219 < 3 && (Static35.aByteArrayArrayArray20[1][local209][local215] & 0x2) == 2) {
						local219++;
					}
					@Pc(248) int local248 = local189 - Static183.anIntArrayArrayArray8[local219][local209][local215];
					if (local248 > local179) {
						local179 = local248;
					}
				}
			}
		}
		local209 = local179 * 192;
		if (local209 > 98048) {
			local209 = 98048;
		}
		if (local209 < 32768) {
			local209 = 32768;
		}
		if (Static75.anInt2130 < local209) {
			Static75.anInt2130 += (local209 - Static75.anInt2130) / 24;
		} else if (local209 < Static75.anInt2130) {
			Static75.anInt2130 += (local209 - Static75.anInt2130) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
	public static void method2298() {
		anIntArray309 = null;
		aClass4_Sub1_41 = null;
		aClass13_1080 = null;
		aClass13_1079 = null;
		aClass13_1077 = null;
		aClass35ArrayArray1 = null;
		aClass13_1078 = null;
		aCalendar1 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!fd;ILclient!dd;)Lclient!dd;")
	public static Class13 method2299(@OriginalArg(0) Class20 arg0, @OriginalArg(2) Class13 arg1) {
		if (arg1.method884(Static89.aClass13_831) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(14) int local14 = arg1.method884(Static11.aClass13_175);
			if (local14 == -1) {
				while (true) {
					local14 = arg1.method884(Static103.aClass13_954);
					if (local14 == -1) {
						while (true) {
							local14 = arg1.method884(Static142.aClass13_1206);
							if (local14 == -1) {
								while (true) {
									local14 = arg1.method884(Static119.aClass13_1050);
									if (local14 == -1) {
										while (true) {
											local14 = arg1.method884(Static53.aClass13_586);
											if (local14 == -1) {
												while (true) {
													local14 = arg1.method884(Static118.aClass13_1042);
													if (local14 == -1) {
														return arg1;
													}
													@Pc(232) Class13 local232 = Static16.aClass13_253;
													if (Static150.aClass32_8 != null) {
														local232 = Static46.method1200(Static150.aClass32_8.anInt1975);
														try {
															if (Static150.aClass32_8.anObject2 != null) {
																@Pc(248) byte[] local248 = ((String) Static150.aClass32_8.anObject2).getBytes("ISO-8859-1");
																local232 = Static135.method2423(0, local248.length, local248);
															}
														} catch (@Pc(259) UnsupportedEncodingException local259) {
														}
													}
													arg1 = Static57.method1349(new Class13[] { arg1.method883(0, local14), local232, arg1.method901(local14 + 4) });
												}
											}
											arg1 = Static57.method1349(new Class13[] { arg1.method883(0, local14), Static165.method2826(Static61.method1407(4, arg0)), arg1.method901(local14 + 2) });
										}
									}
									arg1 = Static57.method1349(new Class13[] { arg1.method883(0, local14), Static165.method2826(Static61.method1407(3, arg0)), arg1.method901(local14 + 2) });
								}
							}
							arg1 = Static57.method1349(new Class13[] { arg1.method883(0, local14), Static165.method2826(Static61.method1407(2, arg0)), arg1.method901(local14 + 2) });
						}
					}
					arg1 = Static57.method1349(new Class13[] { arg1.method883(0, local14), Static165.method2826(Static61.method1407(1, arg0)), arg1.method901(local14 + 2) });
				}
			}
			arg1 = Static57.method1349(new Class13[] { arg1.method883(0, local14), Static165.method2826(Static61.method1407(0, arg0)), arg1.method901(local14 + 2) });
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!fd;B)V")
	public static void method2300(@OriginalArg(0) Class20 arg0) {
		if (Static69.anInt1980 == arg0.anInt1561) {
			Static140.aBooleanArray45[arg0.anInt1618] = true;
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
	public static void method2301() {
		Static173.aClass47_31.method1995();
		Static129.aClass47_26.method1995();
	}
}
