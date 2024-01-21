import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!bb", name = "kb", descriptor = "Lclient!fe;")
	public static Class17 aClass17_12 = new Class17(200);

	@OriginalMember(owner = "client!bb", name = "wb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_95 = Static56.method1206(":");

	@OriginalMember(owner = "client!bb", name = "jc", descriptor = "Lclient!lc;")
	public static Class31 aClass31_98 = Static56.method1206("Please try using a different world)3");

	@OriginalMember(owner = "client!bb", name = "mc", descriptor = "Lclient!lc;")
	public static Class31 aClass31_99 = Static56.method1206("Last password change:*6n@gre@Never changed");

	@OriginalMember(owner = "client!bb", name = "nc", descriptor = "Lclient!lc;")
	public static Class31 aClass31_100 = Static56.method1206("Examine @yel@");

	@OriginalMember(owner = "client!bb", name = "qc", descriptor = "Lclient!lc;")
	public static Class31 aClass31_102 = Static56.method1206("@cr2@");

	@OriginalMember(owner = "client!bb", name = "rc", descriptor = "Lclient!lc;")
	public static Class31 aClass31_103 = Static56.method1206("Unexpected server response: ");

	@OriginalMember(owner = "client!bb", name = "sc", descriptor = "Lclient!lc;")
	public static Class31 aClass31_104 = Static56.method1206("title)3jpg");

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V")
	public static void method177() {
		for (@Pc(12) int local12 = 0; local12 < Static64.anInt624; local12++) {
			@Pc(18) int local18 = Static91.anIntArray352[local12];
			@Pc(22) Class2_Sub1_Sub4_Sub6_Sub1 local22 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local18];
			@Pc(26) int local26 = Static3.aClass2_Sub6_Sub1_1.method665();
			if ((local26 & 0x4) != 0) {
				local26 += Static3.aClass2_Sub6_Sub1_1.method665() << 8;
			}
			Static75.method1410(local26, local18, local22);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Lclient!sc;")
	public static Class2_Sub1_Sub13 method178(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub13 local10 = (Class2_Sub1_Sub13) Static98.aClass17_45.method786((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static77.aClass11_15.method338(10, arg0);
		local10 = new Class2_Sub1_Sub13();
		local10.anInt2481 = arg0;
		if (local20 != null) {
			local10.method1538(new Class2_Sub6(local20));
		}
		local10.method1545();
		if (local10.anInt2461 != -1) {
			local10.method1549(method178(local10.anInt2461), method178(local10.anInt2450));
		}
		if (!Static3.aBoolean9 && local10.aBoolean126) {
			local10.aClass31_856 = Static28.aClass31_388;
			local10.aClass31Array11 = null;
			local10.aClass31Array12 = null;
			local10.aClass31_861 = Static10.aClass31_134;
			local10.anInt2476 = 0;
		}
		Static98.aClass17_45.method783(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "(I)V")
	public static void method179() {
		aClass17_12 = null;
		aClass31_102 = null;
		aClass31_95 = null;
		aClass31_99 = null;
		aClass31_103 = null;
		aClass31_98 = null;
		aClass31_100 = null;
		aClass31_104 = null;
	}

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "(I)V")
	public static void method181() {
		Static67.aClass17_81.method782();
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(Z)Lclient!hc;")
	public static Class2_Sub1_Sub3_Sub3 method184() {
		@Pc(12) Class2_Sub1_Sub3_Sub3 local12 = new Class2_Sub1_Sub3_Sub3(Static76.anIntArray316, Static50.anIntArray74, Static91.anIntArray346, Static67.anIntArray301, Static77.aByteArrayArray10);
		Static4.method95();
		return local12;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)Lclient!bb;")
	public static Class2_Sub1_Sub2 method187(@OriginalArg(1) int arg0) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(7) int local7 = arg0 & 0xFFFF;
		if (Static89.aClass2_Sub1_Sub2ArrayArray1[local3] == null || Static89.aClass2_Sub1_Sub2ArrayArray1[local3][local7] == null) {
			@Pc(30) boolean local30 = Static40.method1277(local3);
			if (!local30) {
				return null;
			}
		}
		return Static89.aClass2_Sub1_Sub2ArrayArray1[local3][local7];
	}
}
