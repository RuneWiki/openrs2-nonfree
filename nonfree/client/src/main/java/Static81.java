import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
	public static int anInt2044;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
	public static int anInt2047;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
	public static int anInt2039 = 500;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Lclient!na;")
	public static Class53 aClass53_927 = Static109.method1737(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
	public static int anInt2040 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
	public static int anInt2042 = 0;

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "Lclient!na;")
	public static Class53 aClass53_928 = Static109.method1737("nav");

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "Lclient!i;")
	public static Class34 aClass34_2 = new Class34();

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
	public static int anInt2046 = -1;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Lclient!na;")
	public static Class53 aClass53_929 = Static109.method1737("sl_flags");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BII)I")
	public static int method1418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = 0;
		while (arg1 > 0) {
			local11 = arg0 & 0x1 | local11 << 1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local11;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)Lclient!sb;")
	public static Class3_Sub1_Sub13 method1419(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub13 local10 = (Class3_Sub1_Sub13) Static111.aClass75_72.method1728((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static22.aClass62_5.method1512(5, arg0);
		local10 = new Class3_Sub1_Sub13();
		if (local20 != null) {
			local10.method1695(new Class3_Sub7(local20));
		}
		Static111.aClass75_72.method1730(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method1420() {
		aClass53_929 = null;
		aClass53_928 = null;
		aClass34_2 = null;
		aClass53_927 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	public static void method1421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class3_Sub1_Sub15 local4 = Static38.method782(arg1, arg2);
		if (local4 != null && local4.anObjectArray18 != null) {
			Static12.method188(0, 0, local4, 0, null, local4.anObjectArray18);
		}
		Static77.anInt1947 = arg2;
		Static104.anInt2535 = arg0;
		Static117.aBoolean119 = true;
		Static113.anInt2603 = arg1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	public static void method1422() {
		Static114.aClass4_1.method1910();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static121.aLongArray6[local10] = 0L;
		}
		for (@Pc(31) int local31 = 0; local31 < 32; local31++) {
			Static21.aLongArray3[local31] = 0L;
		}
		Static90.anInt2120 = 0;
	}
}
