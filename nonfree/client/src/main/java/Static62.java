import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Lclient!r;")
	public static Class41_Sub1 aClass41_Sub1_17;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
	public static int anInt2471 = 0;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "Lclient!af;")
	public static Class5 aClass5_1180 = Static45.method1937("headicons_hint");

	@OriginalMember(owner = "client!kb", name = "T", descriptor = "Lclient!af;")
	private static Class5 aClass5_1184 = Static45.method1937("skill)2");

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "Lclient!af;")
	public static Class5 aClass5_1181 = aClass5_1184;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "Lclient!af;")
	private static Class5 aClass5_1182 = Static45.method1937(" from your friend list first");

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "Lclient!af;")
	public static Class5 aClass5_1183 = aClass5_1182;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method1699() {
		Static74.anImage2 = null;
		Static129.aFontMetrics1 = null;
		Static91.aFont1 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)V")
	public static void method1707(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static28.anInt860 == 1) {
			Static46.aClass1_Sub3_Sub1_Sub2Array3[Static36.anInt950 / 100].method735(Static45.anInt2753 - 8, Static120.anInt1841 + -8);
		}
		if (Static28.anInt860 == 2) {
			Static46.aClass1_Sub3_Sub1_Sub2Array3[Static36.anInt950 / 100 + 4].method735(Static45.anInt2753 - 8, Static120.anInt1841 + -8);
		}
		Static121.method2168();
		if (!Static63.aBoolean60) {
			return;
		}
		@Pc(50) int local50 = arg1 + 507;
		@Pc(54) int local54 = arg2 + 20;
		Static124.aClass1_Sub3_Sub1_Sub1_4.method173(Static100.method1696(new Class5[] { Static125.aClass5_1419, Static48.method838(Static123.anInt3139) }), local50, local54, 16776960, -1);
		@Pc(75) int local75 = local54 + 15;
		@Pc(77) Runtime local77 = Runtime.getRuntime();
		@Pc(86) int local86 = (int) ((local77.totalMemory() - local77.freeMemory()) / 1024L);
		@Pc(88) int local88 = 16776960;
		if (local86 > 32768 && Static79.aBoolean64) {
			local88 = 16711680;
		}
		if (local86 > 65536 && !Static79.aBoolean64) {
			local88 = 16711680;
		}
		Static124.aClass1_Sub3_Sub1_Sub1_4.method173(Static100.method1696(new Class5[] { Static42.aClass5_508, Static48.method838(local86), Static7.aClass5_115 }), local50, local75, local88, -1);
		local54 = local75 + 15;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!kb;II)Lclient!ad;")
	public static Class1_Sub3_Sub1_Sub1 method1715(@OriginalArg(1) Class41 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static58.method1055(arg1, arg2, arg0) ? Static92.method1585() : null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
	public static void method1717() {
		aClass5_1180 = null;
		aClass5_1183 = null;
		aClass41_Sub1_17 = null;
		aClass5_1182 = null;
		aClass5_1184 = null;
		aClass5_1181 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)I")
	public static int method1718(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub2 local12 = (Class1_Sub2) Static59.aClass7_6.method287((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(23) int local23 = 0;
			for (@Pc(25) int local25 = 0; local25 < local12.anIntArray11.length; local25++) {
				if (arg0 == local12.anIntArray10[local25]) {
					local23 += local12.anIntArray11[local25];
				}
			}
			return local23;
		}
	}
}
