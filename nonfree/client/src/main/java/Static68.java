import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "[I")
	public static int[] anIntArray251;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
	public static int anInt1692;

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "Lclient!ff;")
	public static Class26 aClass26_10;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Lclient!r;")
	public static Class61 aClass61_513 = Static129.method2060("jolt");

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "[Lclient!r;")
	public static Class61[] aClass61Array11 = new Class61[100];

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "[J")
	public static long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "Lclient!r;")
	private static Class61 aClass61_514 = Static129.method2060(" seconds)3");

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "Lclient!r;")
	public static Class61 aClass61_515 = aClass61_514;

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "Lclient!ke;")
	public static Class5_Sub11 aClass5_Sub11_6 = null;

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
	public static int anInt1695 = 0;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "[Lclient!cb;")
	public static Class5_Sub2_Sub2_Sub1[] aClass5_Sub2_Sub2_Sub1Array1 = new Class5_Sub2_Sub2_Sub1[4];

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Lclient!gd;")
	public static Class5_Sub2_Sub6 method1131(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub2_Sub6 local10 = (Class5_Sub2_Sub6) Static112.aClass29_24.method766((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static109.aClass26_27.method1038(14, arg0);
		local10 = new Class5_Sub2_Sub6();
		if (local28 != null) {
			local10.method758(new Class5_Sub14(local28));
		}
		Static112.aClass29_24.method762(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)V")
	public static void method1132(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static21.method461(arg0)) {
			return;
		}
		@Pc(18) Class5_Sub11[] local18 = Static56.aClass5_Sub11ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(31) Class5_Sub11 local31 = local18[local20];
			if (local31.anObjectArray19 != null) {
				@Pc(38) Class5_Sub22 local38 = new Class5_Sub22();
				local38.aClass5_Sub11_12 = local31;
				local38.anObjectArray28 = local31.anObjectArray19;
				Static76.method1228(local38);
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
	public static void method1133() {
		aLongArray3 = null;
		aClass26_10 = null;
		aClass5_Sub2_Sub2_Sub1Array1 = null;
		aClass61_515 = null;
		Class44.anIntArray250 = null;
		aClass61Array11 = null;
		aClass61_514 = null;
		aClass5_Sub11_6 = null;
		aClass61_513 = null;
		anIntArray251 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I")
	public static int method1134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!r;Lclient!ff;Lclient!r;I)Lclient!n;")
	public static Class5_Sub2_Sub1_Sub3 method1135(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class61 arg2) {
		@Pc(10) int local10 = arg1.method1044(arg2);
		@Pc(16) int local16 = arg1.method1039(arg0, local10);
		return Static52.method965(arg1, local10, local16);
	}
}
