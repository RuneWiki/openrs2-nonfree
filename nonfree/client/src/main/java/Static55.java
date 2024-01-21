import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!l", name = "hb", descriptor = "Lclient!m;")
	public static Class41 aClass41_2;

	@OriginalMember(owner = "client!l", name = "pb", descriptor = "Lclient!kb;")
	public static Class9 aClass9_29;

	@OriginalMember(owner = "client!l", name = "sb", descriptor = "Lclient!uc;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!l", name = "wb", descriptor = "I")
	public static int anInt1541;

	@OriginalMember(owner = "client!l", name = "zb", descriptor = "Lclient!v;")
	private static Class62 aClass62_657 = Static45.method753("Enter name of friend to add to list");

	@OriginalMember(owner = "client!l", name = "gb", descriptor = "Lclient!v;")
	public static Class62 aClass62_653 = aClass62_657;

	@OriginalMember(owner = "client!l", name = "tb", descriptor = "Lclient!v;")
	private static Class62 aClass62_656 = Static45.method753("Hide");

	@OriginalMember(owner = "client!l", name = "ib", descriptor = "Lclient!v;")
	public static Class62 aClass62_654 = aClass62_656;

	@OriginalMember(owner = "client!l", name = "kb", descriptor = "Lclient!v;")
	public static Class62 aClass62_655 = Static45.method753("Einloggen");

	@OriginalMember(owner = "client!l", name = "ub", descriptor = "I")
	public static int anInt1539 = 0;

	@OriginalMember(owner = "client!l", name = "Db", descriptor = "I")
	public static int anInt1546 = 0;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
	public static void method911() {
		aClass62_653 = null;
		aClass62_657 = null;
		aClass9_29 = null;
		aClass62_654 = null;
		aClass62_656 = null;
		aClass41_2 = null;
		aClass38_1 = null;
		aClass62_655 = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZLclient!m;I)V")
	public static void method912(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class41 arg1) {
		if (Static94.aClass41_4 != null) {
			try {
				Static94.aClass41_4.method1025();
			} catch (@Pc(12) Exception local12) {
			}
			Static94.aClass41_4 = null;
		}
		Static94.aClass41_4 = arg1;
		Static45.method752(arg0);
		Static109.aClass3_Sub8_6.anInt2704 = 0;
		Static54.aClass3_Sub8_5 = null;
		Static18.anInt683 = 0;
		Static64.aClass3_Sub1_Sub10_1 = null;
		while (true) {
			@Pc(38) Class3_Sub1_Sub10 local38 = (Class3_Sub1_Sub10) Static41.aClass43_4.method1087();
			if (local38 == null) {
				while (true) {
					local38 = (Class3_Sub1_Sub10) Static17.aClass43_10.method1087();
					if (local38 == null) {
						if (Static102.aByte3 != 0) {
							try {
								@Pc(90) Class3_Sub8 local90 = new Class3_Sub8(4);
								local90.method1806(4);
								local90.method1806(Static102.aByte3);
								local90.method1762(0);
								Static94.aClass41_4.method1033(local90.aByteArray26, 4);
							} catch (@Pc(113) IOException local113) {
								try {
									Static94.aClass41_4.method1025();
								} catch (@Pc(118) Exception local118) {
								}
								Static94.aClass41_4 = null;
								Static17.anInt2844++;
							}
						}
						Static28.anInt889 = 0;
						Static90.aLong72 = System.currentTimeMillis();
						return;
					}
					Static22.aClass40_1.method981(local38);
					Static13.aClass43_1.method1081(local38.aLong81, local38);
					Static7.anInt228--;
					Static62.anInt1716++;
				}
			}
			Static46.aClass43_6.method1081(local38.aLong81, local38);
			Static98.anInt2584++;
			Static102.anInt2650--;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZIZIZ)Lclient!rd;")
	public static Class42_Sub1 method913(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(13) Class46 local13 = null;
		if (Static70.aClass13_2 != null) {
			local13 = new Class46(arg2, Static70.aClass13_2, Static96.aClass13Array1[arg2], 1000000);
		}
		return new Class42_Sub1(local13, Static52.aClass46_3, arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IBI)I")
	public static int method914(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg0 * 57 + arg1;
		@Pc(23) int local23 = local17 ^ local17 << 13;
		@Pc(37) int local37 = (local23 * 15731 * local23 + 789221) * local23 + 1376312589 & Integer.MAX_VALUE;
		return local37 >> 19 & 0xFF;
	}
}
