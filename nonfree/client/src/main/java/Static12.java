import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
	public static int anInt1938;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "[Lclient!nd;")
	public static Class1_Sub1_Sub11[] aClass1_Sub1_Sub11Array3;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
	public static final int anInt1936 = 2301979;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1231 = Static69.method1153("as it was used to break our rules)3");

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1229 = aClass64_1231;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1230 = Static69.method1153("::qa_op_test");

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
	public static int anInt1939 = 0;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
	public static int anInt1940 = 500;

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
	public static int anInt1941 = 0;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
	public static int anInt1942 = -1;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Lclient!rd;")
	public static Class64 method1395(@OriginalArg(0) int arg0) {
		return Static108.method1805(false, arg0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
	public static void method1396() {
		aClass64_1229 = null;
		aClass1_Sub1_Sub11Array3 = null;
		aClass64_1231 = null;
		aClass64_1230 = null;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)Lclient!nd;")
	public static Class1_Sub1_Sub11 method1397(@OriginalArg(1) int arg0) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static65.aClass1_Sub1_Sub11ArrayArray1[local3] == null || Static65.aClass1_Sub1_Sub11ArrayArray1[local3][local11] == null) {
			@Pc(25) boolean local25 = Static1.method35(local3);
			if (!local25) {
				return null;
			}
		}
		return Static65.aClass1_Sub1_Sub11ArrayArray1[local3][local11];
	}
}
