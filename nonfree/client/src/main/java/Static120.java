import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ud", name = "W", descriptor = "[I")
	public static int[] anIntArray314;

	@OriginalMember(owner = "client!ud", name = "X", descriptor = "Lclient!b;")
	public static Class6 aClass6_4;

	@OriginalMember(owner = "client!ud", name = "H", descriptor = "Lclient!ec;")
	public static Class22 aClass22_904 = Static60.method1113("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!ud", name = "L", descriptor = "[Lclient!jd;")
	public static Class4_Sub11[] aClass4_Sub11Array1 = new Class4_Sub11[2048];

	@OriginalMember(owner = "client!ud", name = "T", descriptor = "Lclient!ja;")
	public static Class33 aClass33_32 = new Class33(50);

	@OriginalMember(owner = "client!ud", name = "V", descriptor = "Lclient!ec;")
	public static Class22 aClass22_906 = Static60.method1113("Lade Texturen )2 ");

	@OriginalMember(owner = "client!ud", name = "Y", descriptor = "Lclient!ec;")
	public static Class22 aClass22_907 = Static60.method1113("scrollbar");

	@OriginalMember(owner = "client!ud", name = "Z", descriptor = "I")
	public static final int anInt2928 = 7759444;

	@OriginalMember(owner = "client!ud", name = "ab", descriptor = "Lclient!ec;")
	public static Class22 aClass22_908 = Static60.method1113("::qa_op_test");

	@OriginalMember(owner = "client!ud", name = "bb", descriptor = "I")
	public static int anInt2929 = 0;

	@OriginalMember(owner = "client!ud", name = "cb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_909 = Static60.method1113("<img=0>");

	@OriginalMember(owner = "client!ud", name = "db", descriptor = "[I")
	public static int[] anIntArray315 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIII)V")
	public static void method1872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = 2048 - arg4 & 0x7FF;
		@Pc(17) int local17 = arg2;
		@Pc(24) int local24 = 2048 - arg0 & 0x7FF;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(51) int local51;
		if (local15 != 0) {
			local37 = Class4_Sub1_Sub2_Sub1.anIntArray9[local15];
			local41 = Class4_Sub1_Sub2_Sub1.anIntArray12[local15];
			local51 = local41 * 0 - arg2 * local37 >> 16;
			local17 = local37 * 0 + arg2 * local41 >> 16;
			local26 = local51;
		}
		if (local24 != 0) {
			local37 = Class4_Sub1_Sub2_Sub1.anIntArray9[local24];
			local41 = Class4_Sub1_Sub2_Sub1.anIntArray12[local24];
			local51 = local41 * 0 + local37 * local17 >> 16;
			local17 = local41 * local17 - local37 * 0 >> 16;
			local28 = local51;
		}
		Static60.anInt1788 = arg1 - local26;
		Static87.anInt2318 = arg3 - local28;
		Static42.anInt885 = arg5 - local17;
		Static96.anInt2480 = arg0;
		Static39.anInt957 = arg4;
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V")
	public static void method1873() {
		aClass22_906 = null;
		aClass22_904 = null;
		anIntArray314 = null;
		aClass22_907 = null;
		anIntArray315 = null;
		aClass6_4 = null;
		aClass4_Sub11Array1 = null;
		aClass33_32 = null;
		aClass22_908 = null;
		aClass22_909 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIBI)I")
	public static int method1874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg5 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(12) int local12 = arg3;
			arg3 = arg1;
			arg1 = local12;
		}
		if (local3 == 0) {
			return arg4;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 1 + 7 - arg3 - arg4;
		} else {
			return 1 + 7 - arg1 - arg0;
		}
	}
}
