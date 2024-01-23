import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!mo", name = "Z", descriptor = "Lclient!pm;")
	public static Class139 aClass139_3;

	@OriginalMember(owner = "client!mo", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString210 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!mo", name = "db", descriptor = "[I")
	public static int[] anIntArray336 = new int[32];

	@OriginalMember(owner = "client!mo", name = "eb", descriptor = "Z")
	public static boolean aBoolean241 = false;

	@OriginalMember(owner = "client!mo", name = "gb", descriptor = "I")
	public static int anInt3403 = 0;

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(B)I")
	public static int method2819() {
		return ((Static208.anInt4120 == 0 ? 0 : 1) << 22) + ((Static24.anInt344 == 0 ? 0 : 1) << 21) + ((Static171.anInt3315 == 0 ? 0 : 1) << 20) + ((Static279.aBoolean363 ? 1 : 0) << 16) + ((Static56.aBoolean66 ? 1 : 0) << 13) + ((Static114.anInt2298 & 0x3) << 11) + ((Static27.aBoolean27 ? 1 : 0) << 9) + ((Static312.aBoolean422 ? 1 : 0) << 8) + ((Static82.aBoolean117 ? 1 : 0) << 7) + ((Static141.aBoolean399 ? 1 : 0) << 4) + ((Static98.aBoolean144 ? 1 : 0) << 3) + (Static10.anInt185 & 0x7) + ((Static117.aBoolean159 ? 1 : 0) << 5) + ((Static233.aBoolean227 ? 1 : 0) << 6) + ((Static66.aBoolean75 ? 1 : 0) << 10) + ((Static303.aBoolean394 ? 1 : 0) << 15) - (-(Static222.anInt4292 << 17) - ((Static273.aBoolean122 ? 1 : 0) << 19)) + (Static184.method2967() << 23);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/awt/Component;BILclient!pm;I)Lclient!tj;")
	public static Class103 method2820(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class139 arg2, @OriginalArg(4) int arg3) {
		if (Static288.anInt5395 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(38) Class103 local38 = (Class103) Class.forName("Class103_Sub1").getDeclaredConstructor().newInstance();
			local38.anInt3595 = arg1;
			local38.anIntArray393 = new int[(Static138.aBoolean183 ? 2 : 1) * 256];
			local38.method3019(arg0);
			local38.anInt3596 = (arg1 & 0xFFFFFC00) + 1024;
			if (local38.anInt3596 > 16384) {
				local38.anInt3596 = 16384;
			}
			local38.method3012(local38.anInt3596);
			if (Static164.anInt3257 > 0 && Static138.aClass92_1 == null) {
				Static138.aClass92_1 = new Class92();
				Static138.aClass92_1.aClass139_2 = arg2;
				arg2.method3494(Static164.anInt3257, Static138.aClass92_1);
			}
			if (Static138.aClass92_1 != null) {
				if (Static138.aClass92_1.aClass103Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static138.aClass92_1.aClass103Array1[arg3] = local38;
			}
			return local38;
		} catch (@Pc(123) Throwable local123) {
			try {
				@Pc(129) Class103_Sub2 local129 = new Class103_Sub2(arg2, arg3);
				local129.anInt3595 = arg1;
				local129.anIntArray393 = new int[(Static138.aBoolean183 ? 2 : 1) * 256];
				local129.method3019(arg0);
				local129.anInt3596 = 16384;
				local129.method3012(local129.anInt3596);
				if (Static164.anInt3257 > 0 && Static138.aClass92_1 == null) {
					Static138.aClass92_1 = new Class92();
					Static138.aClass92_1.aClass139_2 = arg2;
					arg2.method3494(Static164.anInt3257, Static138.aClass92_1);
				}
				if (Static138.aClass92_1 != null) {
					if (Static138.aClass92_1.aClass103Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static138.aClass92_1.aClass103Array1[arg3] = local129;
				}
				return local129;
			} catch (@Pc(192) Throwable local192) {
				return new Class103();
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(II)I")
	public static int method2821(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)V")
	public static void method2822() {
		Static189.aClass26_35.method511();
		Static51.aClass26_7.method511();
		Static193.aClass26_37.method511();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
	public static void method2824() {
		@Pc(3) int local3 = Static201.anInt3890;
		@Pc(5) int local5 = Static181.anInt3455;
		@Pc(13) int local13 = Static122.anInt2394 - 3;
		@Pc(21) int local21 = Static234.anInt4441;
		if (Static254.aClass4_Sub3_Sub14_5 == null || Static82.aClass4_Sub3_Sub14_2 == null) {
			if (Static7.aClass58_4.method1359(Static41.anInt771) && Static7.aClass58_4.method1359(Static174.anInt3336)) {
				Static254.aClass4_Sub3_Sub14_5 = Static239.method3728(Static7.aClass58_4, Static41.anInt771);
				Static82.aClass4_Sub3_Sub14_2 = Static239.method3728(Static7.aClass58_4, Static174.anInt3336);
				if (Static94.aBoolean138) {
					if (Static254.aClass4_Sub3_Sub14_5 instanceof Class4_Sub3_Sub14_Sub1_Sub1) {
						Static254.aClass4_Sub3_Sub14_5 = new Class4_Sub3_Sub14_Sub2_Sub1((Class4_Sub3_Sub14_Sub1) Static254.aClass4_Sub3_Sub14_5);
					} else {
						Static254.aClass4_Sub3_Sub14_5 = new Class4_Sub3_Sub14_Sub2((Class4_Sub3_Sub14_Sub1) Static254.aClass4_Sub3_Sub14_5);
					}
					if (Static82.aClass4_Sub3_Sub14_2 instanceof Class4_Sub3_Sub14_Sub1_Sub1) {
						Static82.aClass4_Sub3_Sub14_2 = new Class4_Sub3_Sub14_Sub2_Sub1((Class4_Sub3_Sub14_Sub1) Static82.aClass4_Sub3_Sub14_2);
					} else {
						Static82.aClass4_Sub3_Sub14_2 = new Class4_Sub3_Sub14_Sub2((Class4_Sub3_Sub14_Sub1) Static82.aClass4_Sub3_Sub14_2);
					}
				}
			} else if (Static94.aBoolean138) {
				Static104.method1692(local3, local5, local21, 20, Static222.anInt4294, 256 - Static136.anInt2587);
			} else {
				Static270.method4250(local3, local5, local21, 20, Static222.anInt4294, 256 - Static136.anInt2587);
			}
		}
		@Pc(128) int local128;
		@Pc(130) int local130;
		if (Static254.aClass4_Sub3_Sub14_5 != null && Static82.aClass4_Sub3_Sub14_2 != null) {
			local128 = (local21 - Static82.aClass4_Sub3_Sub14_2.anInt5610 * 2) / Static254.aClass4_Sub3_Sub14_5.anInt5610;
			for (local130 = 0; local130 < local128; local130++) {
				Static254.aClass4_Sub3_Sub14_5.method4543(local130 * Static254.aClass4_Sub3_Sub14_5.anInt5610 + local3 + Static82.aClass4_Sub3_Sub14_2.anInt5610, local5);
			}
			Static82.aClass4_Sub3_Sub14_2.method4543(local3, local5);
			Static82.aClass4_Sub3_Sub14_2.method4548(local21 + local3 - Static82.aClass4_Sub3_Sub14_2.anInt5610, local5);
		}
		Static211.aClass4_Sub3_Sub5_3.method2266(Static171.aString202, local3 + 3, local5 + 14, Static30.anInt504, -1);
		if (Static94.aBoolean138) {
			Static104.method1692(local3, local5 + 20, local21, local13 - 20, Static222.anInt4294, 256 - Static136.anInt2587);
		} else {
			Static270.method4250(local3, local5 + 20, local21, local13 - 20, Static222.anInt4294, 256 - Static136.anInt2587);
		}
		local128 = Static286.anInt5358;
		local130 = Static312.anInt6042;
		@Pc(215) int local215;
		@Pc(233) int local233;
		for (local215 = 0; local215 < Static300.anInt5638; local215++) {
			local233 = (Static300.anInt5638 - local215 - 1) * 15 + local5 + 20 + 13;
			if (local3 < local128 && local21 + local3 > local128 && local233 - 13 < local130 && local233 + 3 > local130) {
				if (Static94.aBoolean138) {
					Static104.method1692(local3, local233 - 12, local21, 15, Static30.anInt497, 256 - Static135.anInt2586);
				} else {
					Static270.method4250(local3, local233 - 12, local21, 15, Static30.anInt497, 256 - Static135.anInt2586);
				}
			}
		}
		if ((Static281.aClass4_Sub3_Sub14_9 == null || Static266.aClass4_Sub3_Sub14_8 == null || Static24.aClass4_Sub3_Sub14_1 == null) && Static7.aClass58_4.method1359(Static36.anInt593) && Static7.aClass58_4.method1359(Static142.anInt2741) && Static7.aClass58_4.method1359(Static47.anInt881)) {
			Static281.aClass4_Sub3_Sub14_9 = Static239.method3728(Static7.aClass58_4, Static36.anInt593);
			Static266.aClass4_Sub3_Sub14_8 = Static239.method3728(Static7.aClass58_4, Static142.anInt2741);
			Static24.aClass4_Sub3_Sub14_1 = Static239.method3728(Static7.aClass58_4, Static47.anInt881);
			if (Static94.aBoolean138) {
				if (Static281.aClass4_Sub3_Sub14_9 instanceof Class4_Sub3_Sub14_Sub1_Sub1) {
					Static281.aClass4_Sub3_Sub14_9 = new Class4_Sub3_Sub14_Sub2_Sub1((Class4_Sub3_Sub14_Sub1) Static281.aClass4_Sub3_Sub14_9);
				} else {
					Static281.aClass4_Sub3_Sub14_9 = new Class4_Sub3_Sub14_Sub2((Class4_Sub3_Sub14_Sub1) Static281.aClass4_Sub3_Sub14_9);
				}
				if (Static266.aClass4_Sub3_Sub14_8 instanceof Class4_Sub3_Sub14_Sub1_Sub1) {
					Static266.aClass4_Sub3_Sub14_8 = new Class4_Sub3_Sub14_Sub2_Sub1((Class4_Sub3_Sub14_Sub1) Static266.aClass4_Sub3_Sub14_8);
				} else {
					Static266.aClass4_Sub3_Sub14_8 = new Class4_Sub3_Sub14_Sub2((Class4_Sub3_Sub14_Sub1) Static266.aClass4_Sub3_Sub14_8);
				}
				if (Static24.aClass4_Sub3_Sub14_1 instanceof Class4_Sub3_Sub14_Sub1_Sub1) {
					Static24.aClass4_Sub3_Sub14_1 = new Class4_Sub3_Sub14_Sub2_Sub1((Class4_Sub3_Sub14_Sub1) Static24.aClass4_Sub3_Sub14_1);
				} else {
					Static24.aClass4_Sub3_Sub14_1 = new Class4_Sub3_Sub14_Sub2((Class4_Sub3_Sub14_Sub1) Static24.aClass4_Sub3_Sub14_1);
				}
			}
		}
		@Pc(457) int local457;
		if (Static281.aClass4_Sub3_Sub14_9 != null && Static266.aClass4_Sub3_Sub14_8 != null && Static24.aClass4_Sub3_Sub14_1 != null) {
			local215 = (local21 - Static24.aClass4_Sub3_Sub14_1.anInt5610 * 2) / Static281.aClass4_Sub3_Sub14_9.anInt5610;
			for (local233 = 0; local233 < local215; local233++) {
				Static281.aClass4_Sub3_Sub14_9.method4543(Static24.aClass4_Sub3_Sub14_1.anInt5610 + local3 + Static281.aClass4_Sub3_Sub14_9.anInt5610 * local233, local13 + (local5 - Static281.aClass4_Sub3_Sub14_9.anInt5609));
			}
			local233 = (local13 - Static24.aClass4_Sub3_Sub14_1.anInt5609 - 20) / Static266.aClass4_Sub3_Sub14_8.anInt5609;
			for (local457 = 0; local457 < local233; local457++) {
				Static266.aClass4_Sub3_Sub14_8.method4543(local3, local5 + Static266.aClass4_Sub3_Sub14_8.anInt5609 * local457 + 20);
				Static266.aClass4_Sub3_Sub14_8.method4548(local3 + local21 - Static266.aClass4_Sub3_Sub14_8.anInt5610, local457 * Static266.aClass4_Sub3_Sub14_8.anInt5609 + 20 + local5);
			}
			Static24.aClass4_Sub3_Sub14_1.method4543(local3, local13 + local5 - Static24.aClass4_Sub3_Sub14_1.anInt5609);
			Static24.aClass4_Sub3_Sub14_1.method4548(local21 + local3 - Static24.aClass4_Sub3_Sub14_1.anInt5610, local13 + local5 + -Static24.aClass4_Sub3_Sub14_1.anInt5609);
		}
		for (local215 = 0; local215 < Static300.anInt5638; local215++) {
			local233 = local5 + (Static300.anInt5638 - 1 - local215) * 15 + 13 + 20;
			local457 = Static30.anInt504;
			if (local128 > local3 && local21 + local3 > local128 && local233 - 13 < local130 && local233 + 3 > local130) {
				local457 = Static148.anInt2920;
			}
			Static211.aClass4_Sub3_Sub5_3.method2266(Static190.method3005(local215), local3 + 3, local233, local457, 0);
		}
		Static89.method1559(Static201.anInt3890, Static181.anInt3455, Static122.anInt2394, Static234.anInt4441);
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(II)I")
	public static int method2825(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
