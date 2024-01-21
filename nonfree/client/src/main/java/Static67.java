import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!lc", name = "qb", descriptor = "[I")
	public static int[] anIntArray232;

	@OriginalMember(owner = "client!lc", name = "tb", descriptor = "[I")
	public static int[] anIntArray233;

	@OriginalMember(owner = "client!lc", name = "vb", descriptor = "Lclient!dc;")
	public static Class17_Sub1 aClass17_Sub1_15;

	@OriginalMember(owner = "client!lc", name = "ib", descriptor = "Lclient!ua;")
	public static Class72 aClass72_18 = new Class72(128);

	@OriginalMember(owner = "client!lc", name = "rb", descriptor = "Lclient!vf;")
	public static Class78 aClass78_7 = new Class78();

	@OriginalMember(owner = "client!lc", name = "ub", descriptor = "Lclient!v;")
	private static Class76 aClass76_717 = Static134.method2017("Your account is already logged in)3");

	@OriginalMember(owner = "client!lc", name = "wb", descriptor = "Lclient!v;")
	public static Class76 aClass76_718 = aClass76_717;

	@OriginalMember(owner = "client!lc", name = "Hb", descriptor = "Lclient!v;")
	private static Class76 aClass76_722 = Static134.method2017("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!lc", name = "Cb", descriptor = "Lclient!v;")
	public static Class76 aClass76_719 = aClass76_722;

	@OriginalMember(owner = "client!lc", name = "Db", descriptor = "I")
	public static int anInt1720 = 0;

	@OriginalMember(owner = "client!lc", name = "Eb", descriptor = "Lclient!v;")
	public static Class76 aClass76_720 = Static134.method2017("mapedge");

	@OriginalMember(owner = "client!lc", name = "Fb", descriptor = "[I")
	public static int[] anIntArray235 = new int[1000];

	@OriginalMember(owner = "client!lc", name = "Gb", descriptor = "Lclient!v;")
	public static Class76 aClass76_721 = Static134.method2017("(U4");

	@OriginalMember(owner = "client!lc", name = "Ib", descriptor = "Lclient!v;")
	public static Class76 aClass76_723 = Static134.method2017("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)I")
	public static int method1125(@OriginalArg(0) int arg0) {
		@Pc(7) Class4_Sub4_Sub15 local7 = method1134(arg0);
		@Pc(10) int local10 = local7.anInt2272;
		@Pc(13) int local13 = local7.anInt2273;
		@Pc(23) int local23 = local7.anInt2274;
		@Pc(30) int local30 = Class1.anIntArray1[local23 - local13];
		return Static124.anIntArray393[local10] >> local13 & local30;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIZ)I")
	public static int method1133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 >> 7;
		@Pc(7) int local7 = arg1 >> 7;
		if (local7 < 0 || local3 < 0 || local7 > 103 || local3 > 103) {
			return 0;
		}
		@Pc(37) int local37 = arg0;
		if (arg0 < 3 && (Static62.aByteArrayArrayArray4[1][local7][local3] & 0x2) == 2) {
			local37 = arg0 + 1;
		}
		@Pc(58) int local58 = arg1 & 0x7F;
		@Pc(85) int local85 = local58 * Static66.anIntArrayArrayArray3[local37][local7 + 1][local3] + Static66.anIntArrayArrayArray3[local37][local7][local3] * (128 - local58) >> 7;
		@Pc(116) int local116 = Static66.anIntArrayArrayArray3[local37][local7][local3 + 1] * (128 - local58) + local58 * Static66.anIntArrayArrayArray3[local37][local7 + 1][local3 + 1] >> 7;
		@Pc(120) int local120 = arg2 & 0x7F;
		return local85 * (128 - local120) + local116 * local120 >> 7;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)Lclient!r;")
	public static Class4_Sub4_Sub15 method1134(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub4_Sub15 local10 = (Class4_Sub4_Sub15) Static26.aClass72_10.method1781((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static103.aClass17_32.method290(14, arg0);
		local10 = new Class4_Sub4_Sub15();
		if (local25 != null) {
			local10.method1574(new Class4_Sub10(local25));
		}
		Static26.aClass72_10.method1783(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
	public static void method1135() {
		anIntArray233 = null;
		aClass78_7 = null;
		aClass76_723 = null;
		aClass76_719 = null;
		anIntArray232 = null;
		aClass76_722 = null;
		aClass76_720 = null;
		aClass76_721 = null;
		aClass17_Sub1_15 = null;
		aClass76_717 = null;
		aClass76_718 = null;
		aClass72_18 = null;
		anIntArray235 = null;
	}
}
