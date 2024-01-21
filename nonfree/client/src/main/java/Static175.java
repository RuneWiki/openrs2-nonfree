import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!th", name = "A", descriptor = "I")
	public static int anInt3951;

	@OriginalMember(owner = "client!th", name = "D", descriptor = "Lclient!lb;")
	public static Class53 aClass53_4;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1519 = Static120.method1824("jolt");

	@OriginalMember(owner = "client!th", name = "p", descriptor = "I")
	public static int anInt3942 = 0;

	@OriginalMember(owner = "client!th", name = "r", descriptor = "I")
	public static int anInt3944 = 0;

	@OriginalMember(owner = "client!th", name = "x", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1520 = Static120.method1824("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!th", name = "G", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1524 = Static120.method1824("Walk here");

	@OriginalMember(owner = "client!th", name = "z", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1521 = aClass80_1524;

	@OriginalMember(owner = "client!th", name = "C", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1522 = aClass80_1520;

	@OriginalMember(owner = "client!th", name = "E", descriptor = "I")
	public static int anInt3953 = 0;

	@OriginalMember(owner = "client!th", name = "F", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1523 = Static120.method1824("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!th", name = "J", descriptor = "I")
	public static int anInt3956 = -1;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
	public static void method2822() {
		Static146.aClass3_Sub17_Sub1_3.method2146(194);
		for (@Pc(18) Class3_Sub20 local18 = (Class3_Sub20) Static28.aClass54_4.method1503(); local18 != null; local18 = (Class3_Sub20) Static28.aClass54_4.method1497()) {
			if (local18.anInt2999 == 0) {
				Static157.method2500(true, local18);
			}
		}
		if (Static83.aClass77_4 != null) {
			Static186.method3014(Static83.aClass77_4);
			Static83.aClass77_4 = null;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!mb;)Lclient!rd;")
	public static Class80 method2824(@OriginalArg(1) Class3_Sub17 arg0) {
		return Static105.method1566(arg0);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BI[Lclient!rh;[BI)V")
	public static void method2825(@OriginalArg(1) int arg0, @OriginalArg(2) Class82[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class3_Sub17 local10 = new Class3_Sub17(arg2);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(21) int local21 = local10.method2093();
			if (local21 == 0) {
				return;
			}
			local12 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local10.method2090();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(50) int local50 = local29 >> 6 & 0x3F;
				@Pc(54) int local54 = local29 >> 12;
				@Pc(58) int local58 = local29 & 0x3F;
				@Pc(62) int local62 = local10.method2107();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = arg3 + local50;
				@Pc(74) int local74 = arg0 + local58;
				@Pc(78) int local78 = local62 & 0x3;
				if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
					@Pc(94) Class82 local94 = null;
					@Pc(96) int local96 = local54;
					if ((Static18.aByteArrayArrayArray1[1][local70][local74] & 0x2) == 2) {
						local96 = local54 - 1;
					}
					if (local96 >= 0) {
						local94 = arg1[local96];
					}
					Static79.method1199(local94, local66, local78, local74, local12, local54, local70);
				}
			}
		}
	}
}
