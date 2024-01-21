import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!od", name = "Q", descriptor = "Z")
	public static boolean aBoolean113;

	@OriginalMember(owner = "client!od", name = "P", descriptor = "I")
	public static int anInt2715 = 0;

	@OriginalMember(owner = "client!od", name = "ob", descriptor = "Lclient!kb;")
	private static Class46 aClass46_937 = Static65.method1172("Hidden");

	@OriginalMember(owner = "client!od", name = "T", descriptor = "Lclient!kb;")
	public static Class46 aClass46_932 = aClass46_937;

	@OriginalMember(owner = "client!od", name = "V", descriptor = "Z")
	public static boolean aBoolean114 = false;

	@OriginalMember(owner = "client!od", name = "eb", descriptor = "Lclient!kb;")
	private static Class46 aClass46_935 = Static65.method1172("wishes to trade with you)3");

	@OriginalMember(owner = "client!od", name = "Y", descriptor = "Lclient!kb;")
	public static Class46 aClass46_933 = aClass46_935;

	@OriginalMember(owner = "client!od", name = "ab", descriptor = "Lclient!kb;")
	private static Class46 aClass46_934 = Static65.method1172(" more options");

	@OriginalMember(owner = "client!od", name = "jb", descriptor = "[Lclient!rd;")
	public static Class3_Sub4[] aClass3_Sub4Array1 = new Class3_Sub4[2048];

	@OriginalMember(owner = "client!od", name = "mb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_936 = aClass46_934;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIB)I")
	public static int method1915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = arg0 * (arg1 & 0x7F) >> 7;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0 + (arg1 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	public static void method1916() {
		for (@Pc(7) int local7 = 0; local7 < Static174.anInt3804; local7++) {
			@Pc(13) int local13 = Static42.anIntArray106[local7];
			@Pc(17) Class3_Sub2_Sub1_Sub1_Sub2 local17 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local13];
			if (local17 != null) {
				Static172.method2724(local17, local17.aClass3_Sub2_Sub16_1.anInt3814);
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!h;I)Z")
	public static boolean method1917(@OriginalArg(0) Class33 arg0) {
		if (Static118.aBoolean118) {
			if (Static157.method2541(arg0) != 0) {
				return false;
			}
			if (arg0.anInt1441 == 0) {
				return false;
			}
		}
		return arg0.aBoolean46;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)Lclient!we;")
	public static Class3_Sub2_Sub17 method1918(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub2_Sub17 local10 = (Class3_Sub2_Sub17) Static44.aClass57_11.method1719((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static80.aClass44_14.method1624(16, arg0);
		local10 = new Class3_Sub2_Sub17();
		if (local27 != null) {
			local10.method2872(new Class3_Sub4(local27));
		}
		Static44.aClass57_11.method1717(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(B)V")
	public static void method1919() {
		aClass46_935 = null;
		aClass46_934 = null;
		aClass46_937 = null;
		aClass3_Sub4Array1 = null;
		aClass46_936 = null;
		aClass46_933 = null;
		aClass46_932 = null;
	}
}
