import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!eg", name = "Q", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_783 = Static118.method2249("b12_full");

	@OriginalMember(owner = "client!eg", name = "T", descriptor = "Z")
	public static final boolean aBoolean53 = false;

	@OriginalMember(owner = "client!eg", name = "eb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_787 = Static118.method2249("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!eg", name = "V", descriptor = "Lclient!oc;")
	public static Class65 aClass65_784 = aClass65_787;

	@OriginalMember(owner = "client!eg", name = "Z", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_785 = Static118.method2249("Bitte geben Sie Ihren Benutzernamen ein)3");

	@OriginalMember(owner = "client!eg", name = "ab", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_786 = Static118.method2249("<col=ff9040>");

	@OriginalMember(owner = "client!eg", name = "bb", descriptor = "I")
	public static int anInt1264 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!wd;BI)V")
	public static void method824(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(3) int arg2) {
		if (Static31.anInt933 != 0 && Static31.anInt933 != 3) {
			return;
		}
		@Pc(18) int local18 = arg0 - arg1.anInt4354 / 2;
		@Pc(25) int local25 = arg2 - arg1.anInt4353 / 2;
		@Pc(32) int local32 = Static82.anInt2025 + Static105.anInt2597 & 0x7FF;
		@Pc(36) int local36 = Class1_Sub2_Sub5_Sub2.anIntArray142[local32];
		@Pc(40) int local40 = Class1_Sub2_Sub5_Sub2.anIntArray138[local32];
		@Pc(48) int local48 = local40 * (Static130.anInt3193 + 256) >> 8;
		@Pc(56) int local56 = (Static130.anInt3193 + 256) * local36 >> 8;
		@Pc(67) int local67 = local48 * local18 + local56 * local25 >> 11;
		@Pc(75) int local75 = Static201.aClass6_Sub4_Sub1_3.anInt3934 + local67 >> 7;
		@Pc(86) int local86 = local18 * local56 - local48 * local25 >> 11;
		@Pc(94) int local94 = Static201.aClass6_Sub4_Sub1_3.anInt3976 - local86 >> 7;
		@Pc(119) boolean local119 = Static198.method3220(0, 0, local94, true, 0, 0, 1, local75, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
		if (!local119) {
			return;
		}
		Static45.aClass1_Sub14_Sub1_8.method1710(local25);
		Static45.aClass1_Sub14_Sub1_8.method1710(local18);
		Static45.aClass1_Sub14_Sub1_8.method1726(Static82.anInt2025);
		Static45.aClass1_Sub14_Sub1_8.method1710(57);
		Static45.aClass1_Sub14_Sub1_8.method1710(Static105.anInt2597);
		Static45.aClass1_Sub14_Sub1_8.method1710(Static130.anInt3193);
		Static45.aClass1_Sub14_Sub1_8.method1710(89);
		Static45.aClass1_Sub14_Sub1_8.method1726(Static201.aClass6_Sub4_Sub1_3.anInt3934);
		Static45.aClass1_Sub14_Sub1_8.method1726(Static201.aClass6_Sub4_Sub1_3.anInt3976);
		Static45.aClass1_Sub14_Sub1_8.method1710(Static200.anInt4298);
		Static45.aClass1_Sub14_Sub1_8.method1710(63);
	}

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "(B)V")
	public static void method826() {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = -1; local1 < Static44.anInt1123; local1++) {
			if (local1 == -1) {
				local7 = 2047;
			} else {
				local7 = Static138.anIntArray385[local1];
			}
			@Pc(16) Class6_Sub4_Sub1 local16 = Static158.aClass6_Sub4_Sub1Array1[local7];
			if (local16 != null && local16.anInt3973 > 0) {
				local16.anInt3973--;
				if (local16.anInt3973 == 0) {
					local16.aClass65_2377 = null;
				}
			}
		}
		for (local7 = 0; local7 < Static22.anInt659; local7++) {
			@Pc(55) int local55 = Static72.anIntArray197[local7];
			@Pc(59) Class6_Sub4_Sub2 local59 = Static106.aClass6_Sub4_Sub2Array1[local55];
			if (local59 != null && local59.anInt3973 > 0) {
				local59.anInt3973--;
				if (local59.anInt3973 == 0) {
					local59.aClass65_2377 = null;
				}
			}
		}
	}
}
