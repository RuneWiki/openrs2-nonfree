import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString45 = null;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "[I")
	public static final int[] anIntArray122 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
	public static int anInt1457 = 0;

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_54 = new Class102(67, 3);

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
	public static int anInt1460 = 0;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(JB)V")
	public static void method1136(@OriginalArg(0) long arg0) {
		if (Static309.aClass270ArrayArrayArray3 != null) {
			if (Static414.anInt6776 == 1 || Static414.anInt6776 == 5) {
				Static451.method5659(arg0);
			} else if (Static414.anInt6776 == 4) {
				Static409.method5177(arg0);
			}
		}
		Static277.method3722(Static82.aClass163_1, (long) Static266.anInt4392);
		if (Static142.anInt2523 != -1) {
			Static98.method1507(Static142.anInt2523);
		}
		for (@Pc(37) int local37 = 0; local37 < Static398.anInt6535; local37++) {
			if (Static101.aBooleanArray9[local37]) {
				Static442.aBooleanArray27[local37] = true;
			}
			Static263.aBooleanArray14[local37] = Static101.aBooleanArray9[local37];
			Static101.aBooleanArray9[local37] = false;
		}
		Static182.anInt3111 = Static266.anInt4392;
		if (Static82.aClass163_1.method5538()) {
			Static457.aBoolean533 = true;
		}
		if (Static142.anInt2523 != -1) {
			Static398.anInt6535 = 0;
			Static243.method476();
		}
		Static82.aClass163_1.va();
		Static365.method4803(Static82.aClass163_1);
		@Pc(88) int local88 = Static302.method3977();
		if (local88 == -1) {
			local88 = Static96.anInt1855;
		}
		if (local88 == -1) {
			local88 = Static82.anInt1523;
		}
		Static166.method2337(local88);
		Static146.method2136(Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833, Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835, Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91, Static233.anInt6983);
		Static233.anInt6983 = 0;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!za;Lclient!lb;III)V")
	public static void method1138(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class270 local12;
		if (arg3 < Static169.anInt2876) {
			local12 = Static309.aClass270ArrayArrayArray3[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass3_Sub5_2 != null && local12.aClass3_Sub5_2.method5277()) {
				arg1.method5281(local12.aClass3_Sub5_2, Static67.anInt1221, true, 0, 0, arg0);
			}
		}
		if (arg4 < Static169.anInt2876) {
			local12 = Static309.aClass270ArrayArrayArray3[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass3_Sub5_2 != null && local12.aClass3_Sub5_2.method5277()) {
				arg1.method5281(local12.aClass3_Sub5_2, 0, true, Static67.anInt1221, 0, arg0);
			}
		}
		if (arg3 < Static169.anInt2876 && arg4 < Static316.anInt5459) {
			local12 = Static309.aClass270ArrayArrayArray3[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass3_Sub5_2 != null && local12.aClass3_Sub5_2.method5277()) {
				arg1.method5281(local12.aClass3_Sub5_2, Static67.anInt1221, true, Static67.anInt1221, 0, arg0);
			}
		}
		if (arg3 < Static169.anInt2876 && arg4 > 0) {
			local12 = Static309.aClass270ArrayArrayArray3[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass3_Sub5_2 != null && local12.aClass3_Sub5_2.method5277()) {
				arg1.method5281(local12.aClass3_Sub5_2, Static67.anInt1221, true, -Static67.anInt1221, 0, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
	public static void method1139(@OriginalArg(0) int arg0) {
		Static162.anInt2742 = 3;
		Static120.anInt2210 = -1;
		Static47.anInt838 = arg0;
		Static237.anInt3819 = 100;
	}
}
