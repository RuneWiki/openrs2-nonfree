import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!tb", name = "fb", descriptor = "Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1 aClass1_Sub3_Sub1_Sub1_5;

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
	public static int anInt3777 = 0;

	@OriginalMember(owner = "client!tb", name = "X", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1799 = Static187.method3089("null");

	@OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
	public static int anInt3779 = 0;

	@OriginalMember(owner = "client!tb", name = "bb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1800 = Static187.method3089("gelb:");

	@OriginalMember(owner = "client!tb", name = "cb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1801 = Static187.method3089("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!tb", name = "db", descriptor = "I")
	public static int anInt3781 = 2;

	@OriginalMember(owner = "client!tb", name = "gb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1802 = Static187.method3089("This computers address has been blocked");

	@OriginalMember(owner = "client!tb", name = "ib", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1803 = Static187.method3089(")1p");

	@OriginalMember(owner = "client!tb", name = "nb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1804 = Static187.method3089("labels)3dat");

	@OriginalMember(owner = "client!tb", name = "pb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1805 = Static187.method3089("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!tb", name = "qb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1806 = aClass92_1802;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(BII)I")
	public static int method2874(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = local12 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local12;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
	public static void method2875() {
		Static32.method582(Static22.anInt555, Static63.anInt3568, Static111.anInt2396);
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)J")
	public static long method2876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2380; local13++) {
			@Pc(19) Class16 local19 = local7.aClass16Array3[local13];
			if ((local19.aLong30 >> 29 & 0x3L) == 2L && local19.anInt536 == arg1 && local19.anInt540 == arg2) {
				return local19.aLong30;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)Lclient!jh;")
	public static Class1_Sub3_Sub12 method2877(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub3_Sub12 local10 = (Class1_Sub3_Sub12) Static48.aClass47_9.method1281((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static74.aClass3_13.method3265(4, arg0);
		local10 = new Class1_Sub3_Sub12();
		if (local20 != null) {
			local10.method1384(new Class1_Sub14(local20), arg0);
		}
		Static48.aClass47_9.method1273((long) arg0, local10);
		return local10;
	}
}
