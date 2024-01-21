import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!de", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Lclient!ec;")
	private static Class22 aClass22_159 = Static60.method1113(" seconds)3");

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Lclient!ec;")
	public static Class22 aClass22_155 = aClass22_159;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean55 = true;

	@OriginalMember(owner = "client!de", name = "p", descriptor = "Lclient!ec;")
	private static Class22 aClass22_160 = Static60.method1113("flash1:");

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Lclient!ec;")
	public static Class22 aClass22_156 = aClass22_160;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "Lclient!ec;")
	public static Class22 aClass22_157 = aClass22_160;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "Lclient!ec;")
	public static Class22 aClass22_158 = Static60.method1113(")4lang)4de");

	@OriginalMember(owner = "client!de", name = "m", descriptor = "I")
	public static int anInt552 = 0;

	@OriginalMember(owner = "client!de", name = "o", descriptor = "[I")
	public static int[] anIntArray60 = new int[1000];

	@OriginalMember(owner = "client!de", name = "s", descriptor = "I")
	public static int anInt555 = 0;

	@OriginalMember(owner = "client!de", name = "t", descriptor = "Z")
	public static boolean aBoolean57 = false;

	@OriginalMember(owner = "client!de", name = "v", descriptor = "Lclient!ec;")
	public static Class22 aClass22_161 = Static60.method1113(":clan:");

	@OriginalMember(owner = "client!de", name = "x", descriptor = "[I")
	public static int[] anIntArray61 = new int[2000];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)Lclient!ec;")
	public static Class22 method391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - arg0;
		if (local4 < -9) {
			return Static85.aClass22_643;
		} else if (local4 < -6) {
			return Static113.aClass22_871;
		} else if (local4 < -3) {
			return Static39.aClass22_271;
		} else if (local4 < 0) {
			return Static19.aClass22_149;
		} else if (local4 > 9) {
			return Static112.aClass22_865;
		} else if (local4 > 6) {
			return Static48.aClass22_323;
		} else if (local4 > 3) {
			return Static5.aClass22_35;
		} else if (local4 > 0) {
			return Static53.aClass22_381;
		} else {
			return Static115.aClass22_884;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	public static void method392() {
		aClass22_157 = null;
		aClass22_160 = null;
		aClass22_158 = null;
		anIntArray60 = null;
		aByteArrayArray1 = null;
		aClass22_155 = null;
		aClass22_161 = null;
		aClass22_159 = null;
		anIntArray61 = null;
		aClass22_156 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IJ)V")
	public static void method393(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static88.anInt2348; local12++) {
			if (arg0 == Static85.aLongArray5[local12]) {
				Static88.anInt2348--;
				for (@Pc(30) int local30 = local12; local30 < Static88.anInt2348; local30++) {
					Static85.aLongArray5[local30] = Static85.aLongArray5[local30 + 1];
					Static58.aClass22Array14[local30] = Static58.aClass22Array14[local30 + 1];
				}
				Static2.anInt14 = Static96.anInt2513;
				Static38.aClass4_Sub11_Sub1_1.method752(239);
				Static38.aClass4_Sub11_Sub1_1.method728(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!tb;I[BI)V")
	public static void method394(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(12) Class4_Sub20 local12 = new Class4_Sub20();
		local12.aByteArray42 = arg2;
		local12.aLong99 = arg1;
		local12.aClass71_4 = arg0;
		local12.anInt2897 = 0;
		@Pc(27) Class82 local27 = Static2.aClass82_1;
		synchronized (Static2.aClass82_1) {
			Static2.aClass82_1.method2028(local12);
		}
		Static92.method1617();
	}
}
