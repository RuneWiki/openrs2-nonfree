import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
	public static int anInt1603;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
	public static int anInt1607;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "Lclient!bf;")
	public static Class11 aClass11_35;

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
	public static int anInt1613;

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "Lclient!da;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "Lclient!bd;")
	public static Class9 aClass9_16 = new Class9(50);

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "Lclient!ae;")
	private static Class5 aClass5_772 = Static56.method972("K");

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "Lclient!ae;")
	public static Class5 aClass5_773 = aClass5_772;

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "Lclient!ae;")
	public static Class5 aClass5_774 = aClass5_772;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "Lclient!ae;")
	public static Class5 aClass5_775 = Static56.method972("@cr1@");

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
	public static int anInt1612 = 1;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!ae;Lclient!ae;Lclient!ae;)V")
	public static void method1005(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) Class5 arg2) {
		Static88.aClass5_1014 = arg0;
		Static88.aClass5_1024 = arg2;
		Static88.aClass5_1017 = arg1;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public static void method1006() {
		aClass18_1 = null;
		aClass9_16 = null;
		aClass5_773 = null;
		aClass5_775 = null;
		aClass5_774 = null;
		aClass5_772 = null;
		aClass11_35 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
	public static void method1007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static68.anInt1575 != 0 && arg1 != -1) {
			Static62.method1073(1, Static54.aClass11_Sub1_53, Static68.anInt1575, arg1);
			Static18.anInt633 = arg0;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)Z")
	public static boolean method1008(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(BI)Lclient!te;")
	public static Class3_Sub1_Sub17 method1009(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 & 0xFFFF;
		@Pc(16) int local16 = arg0 >> 16;
		if (Static31.aClass3_Sub1_Sub17ArrayArray3[local16] == null || Static31.aClass3_Sub1_Sub17ArrayArray3[local16][local12] == null) {
			@Pc(30) boolean local30 = Static18.method406(local16);
			if (!local30) {
				return null;
			}
		}
		return Static31.aClass3_Sub1_Sub17ArrayArray3[local16][local12];
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	public static void method1010() {
		if (Static27.anInt810 > 0) {
			Static100.method1671();
		} else {
			Static116.method1971(40);
			Static90.aClass18_3 = aClass18_1;
			aClass18_1 = null;
		}
	}
}
