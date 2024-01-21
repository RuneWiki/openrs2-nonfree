import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!md", name = "x", descriptor = "Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_17;

	@OriginalMember(owner = "client!md", name = "L", descriptor = "Lclient!wb;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!md", name = "Q", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "Lclient!kc;")
	public static Class36 aClass36_794 = Static14.method2017("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!md", name = "i", descriptor = "Lclient!kc;")
	public static Class36 aClass36_795 = Static14.method2017("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!md", name = "m", descriptor = "Lclient!kc;")
	public static Class36 aClass36_796 = Static14.method2017("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!md", name = "r", descriptor = "Lclient!kc;")
	private static Class36 aClass36_798 = Static14.method2017("Password: ");

	@OriginalMember(owner = "client!md", name = "n", descriptor = "Lclient!kc;")
	public static Class36 aClass36_797 = aClass36_798;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "I")
	public static int anInt1640 = 0;

	@OriginalMember(owner = "client!md", name = "A", descriptor = "I")
	public static int anInt1641 = 0;

	@OriginalMember(owner = "client!md", name = "D", descriptor = "Lclient!kc;")
	public static Class36 aClass36_799 = Static14.method2017("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!md", name = "M", descriptor = "Lclient!kc;")
	public static Class36 aClass36_800 = Static14.method2017("redstone2");

	@OriginalMember(owner = "client!md", name = "R", descriptor = "[J")
	public static long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BILclient!nd;I)V")
	public static void method1132(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub3 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		@Pc(12) int local12 = Static65.anInt1672 + Static14.anInt2903 & 0x7FF;
		@Pc(20) int local20 = arg0 * arg0 + arg2 * arg2;
		if (local20 > 6400) {
			return;
		}
		@Pc(30) int local30 = Static30.anIntArray105[local12];
		@Pc(38) int local38 = local30 * 256 / (Static7.anInt194 + 256);
		@Pc(42) int local42 = Static30.anIntArray96[local12];
		@Pc(50) int local50 = local42 * 256 / (Static7.anInt194 + 256);
		@Pc(61) int local61 = arg0 * local50 - local38 * arg2 >> 16;
		@Pc(72) int local72 = local38 * arg0 + local50 * arg2 >> 16;
		if (local20 > 2500) {
			arg1.method1248(aClass2_Sub1_Sub1_Sub1_17, local72 + 4 + 94 - arg1.anInt1784 / 2, -(arg1.anInt1785 / 2) + (83 - (local61 - -4)));
		} else {
			arg1.method1234(local72 + 94 + 4 - arg1.anInt1784 / 2, -(arg1.anInt1785 / 2) + 83 - local61 + -4);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public static void method1133() {
		for (@Pc(11) Class2_Sub8 local11 = (Class2_Sub8) Static39.aClass8_2.method175(); local11 != null; local11 = (Class2_Sub8) Static39.aClass8_2.method173()) {
			if (local11.anInt1108 > 0) {
				local11.anInt1108--;
			}
			if (local11.anInt1108 != 0) {
				if (local11.anInt1113 > 0) {
					local11.anInt1113--;
				}
				if (local11.anInt1113 == 0 && local11.anInt1109 >= 1 && local11.anInt1114 >= 1 && local11.anInt1109 <= 102 && local11.anInt1114 <= 102 && (local11.anInt1118 < 0 || Static69.method1201(local11.anInt1119, local11.anInt1118))) {
					Static89.method1642(local11.anInt1109, local11.anInt1110, local11.anInt1124, local11.anInt1114, local11.anInt1119, local11.anInt1118, local11.anInt1117);
					local11.anInt1113 = -1;
					if (local11.anInt1123 == local11.anInt1118 && local11.anInt1123 == -1) {
						local11.method2073();
					} else if (local11.anInt1118 == local11.anInt1123 && local11.anInt1120 == local11.anInt1110 && local11.anInt1119 == local11.anInt1115) {
						local11.method2073();
					}
				}
			} else if (local11.anInt1123 < 0 || Static69.method1201(local11.anInt1115, local11.anInt1123)) {
				Static89.method1642(local11.anInt1109, local11.anInt1120, local11.anInt1124, local11.anInt1114, local11.anInt1115, local11.anInt1123, local11.anInt1117);
				local11.method2073();
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
	public static void method1134() {
		aClass36_794 = null;
		aLongArray5 = null;
		aClass36_800 = null;
		aClass36_797 = null;
		aClass36_795 = null;
		aClass36_796 = null;
		aClass2_Sub1_Sub1_Sub1_17 = null;
		aClass19_1 = null;
		anIntArray204 = null;
		aClass36_798 = null;
		aClass36_799 = null;
	}
}
