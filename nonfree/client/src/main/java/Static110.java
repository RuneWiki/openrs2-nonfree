import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
	public static int anInt2509;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1093 = Static51.method932("Members object");

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1092 = aClass10_1093;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "[I")
	public static int[] anIntArray256 = new int[50];

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1094 = Static51.method932("null");

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
	public static void method1754() {
		if (Static98.aClass34_5 != null) {
			Static98.aClass34_5.method1136();
			Static98.aClass34_5 = null;
		}
		Static22.method342();
		Static180.aClass60_1.method1821();
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			Static59.aClass27Array1[local22].method943();
		}
		System.gc();
		Static109.method1751();
		Static27.anInt757 = -1;
		Static24.aBoolean22 = false;
		Static60.method1089();
		Static45.method870(10);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
	public static void method1755() {
		aClass10_1092 = null;
		aClass10_1094 = null;
		aClass10_1093 = null;
		anIntArray256 = null;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Lclient!rh;")
	public static Class2_Sub1_Sub17 method1756(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub17 local10 = (Class2_Sub1_Sub17) Static47.aClass72_11.method2259((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static36.aClass29_20.method1030(arg0, 16);
		local10 = new Class2_Sub1_Sub17();
		if (local20 != null) {
			local10.method2247(new Class2_Sub11(local20));
		}
		Static47.aClass72_11.method2254(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
	public static void method1757(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class2_Sub1_Sub14 local7 = Static15.method243(arg0);
		@Pc(10) int local10 = local7.anInt2948;
		@Pc(13) int local13 = local7.anInt2940;
		@Pc(16) int local16 = local7.anInt2945;
		@Pc(31) int local31 = Applet_Sub1.anIntArray59[local13 - local16];
		if (arg1 < 0 || arg1 > local31) {
			arg1 = 0;
		}
		local31 <<= local16;
		Static51.anIntArray143[local10] = arg1 << local16 & local31 | ~local31 & Static51.anIntArray143[local10];
	}
}
