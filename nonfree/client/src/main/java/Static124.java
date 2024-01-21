import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!va", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!va", name = "v", descriptor = "Lclient!ga;")
	public static Class20_Sub1 aClass20_Sub1_77;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "Lclient!ec;")
	private static Class22 aClass22_913 = Static60.method1113("Jun");

	@OriginalMember(owner = "client!va", name = "c", descriptor = "Lclient!ec;")
	private static Class22 aClass22_914 = Static60.method1113("Oct");

	@OriginalMember(owner = "client!va", name = "d", descriptor = "Lclient!ec;")
	private static Class22 aClass22_915 = Static60.method1113("Nov");

	@OriginalMember(owner = "client!va", name = "f", descriptor = "Lclient!ec;")
	private static Class22 aClass22_916 = Static60.method1113("May");

	@OriginalMember(owner = "client!va", name = "h", descriptor = "Lclient!ec;")
	private static Class22 aClass22_917 = Static60.method1113("Sep");

	@OriginalMember(owner = "client!va", name = "A", descriptor = "Lclient!ec;")
	private static Class22 aClass22_925 = Static60.method1113("Jan");

	@OriginalMember(owner = "client!va", name = "n", descriptor = "Lclient!ec;")
	private static Class22 aClass22_920 = Static60.method1113("Feb");

	@OriginalMember(owner = "client!va", name = "z", descriptor = "Lclient!ec;")
	private static Class22 aClass22_924 = Static60.method1113("Mar");

	@OriginalMember(owner = "client!va", name = "p", descriptor = "Lclient!ec;")
	private static Class22 aClass22_922 = Static60.method1113("Apr");

	@OriginalMember(owner = "client!va", name = "m", descriptor = "Lclient!ec;")
	private static Class22 aClass22_919 = Static60.method1113("Jul");

	@OriginalMember(owner = "client!va", name = "j", descriptor = "Lclient!ec;")
	private static Class22 aClass22_918 = Static60.method1113("Aug");

	@OriginalMember(owner = "client!va", name = "B", descriptor = "Lclient!ec;")
	private static Class22 aClass22_926 = Static60.method1113("Dec");

	@OriginalMember(owner = "client!va", name = "i", descriptor = "[Lclient!ec;")
	public static Class22[] aClass22Array23 = new Class22[] { aClass22_925, aClass22_920, aClass22_924, aClass22_922, aClass22_916, aClass22_913, aClass22_919, aClass22_918, aClass22_917, aClass22_914, aClass22_915, aClass22_926 };

	@OriginalMember(owner = "client!va", name = "o", descriptor = "Lclient!ec;")
	private static Class22 aClass22_921 = Static60.method1113("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!va", name = "q", descriptor = "[S")
	public static short[] aShortArray40 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!va", name = "x", descriptor = "Lclient!ec;")
	public static Class22 aClass22_923 = aClass22_921;

	@OriginalMember(owner = "client!va", name = "C", descriptor = "Lclient!ec;")
	public static Class22 aClass22_927 = null;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	public static void method1888() {
		aClass22_920 = null;
		aClass22_927 = null;
		aClass22_918 = null;
		aClass22Array23 = null;
		aShortArray40 = null;
		aClass22_922 = null;
		aByteArrayArray9 = null;
		aClass22_915 = null;
		aClass22_923 = null;
		aClass22_914 = null;
		aClass22_913 = null;
		aClass22_917 = null;
		aClass22_919 = null;
		aClass22_916 = null;
		aClass22_925 = null;
		aClass22_921 = null;
		aClass22_924 = null;
		aClass20_Sub1_77 = null;
		aClass22_926 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)I")
	public static int method1889(@OriginalArg(1) int arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local1 += 16;
		}
		if (arg0 >= 256) {
			local1 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local1 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local1 += 2;
		}
		if (arg0 >= 1) {
			local1++;
			arg0 >>>= 0x1;
		}
		return local1 + arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!f;)I")
	public static int method1890(@OriginalArg(1) Class4_Sub7 arg0) {
		@Pc(23) Class4_Sub9 local23 = (Class4_Sub9) Static96.aClass81_12.method2010(((long) arg0.anInt738 << 32) + ((long) arg0.anInt784));
		return local23 == null ? arg0.anInt750 : local23.anInt837;
	}
}
