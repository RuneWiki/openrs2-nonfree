import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!e", name = "Q", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
	public static int anInt1259;

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "Lclient!wi;")
	public static Class108 aClass108_3 = new Class108();

	@OriginalMember(owner = "client!e", name = "mb", descriptor = "I")
	public static int anInt1265 = 0;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "(I)V")
	public static void method882() {
		if (Static189.aClass63_4 != null) {
			Static189.aClass63_4.method2043();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!nb;BLclient!nb;Lclient!nb;)V")
	public static void method883(@OriginalArg(0) Class15 arg0, @OriginalArg(2) Class15 arg1, @OriginalArg(3) Class15 arg2) {
		Static127.aClass15_25 = arg1;
		Static35.aClass15_8 = arg0;
		Static133.aClass15_26 = arg2;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)I")
	public static int method884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg2;
		@Pc(19) int local19 = arg1 - 1 & arg0;
		@Pc(23) int local23 = arg0 / arg1;
		@Pc(28) int local28 = Static8.method254(local23, local3);
		@Pc(35) int local35 = Static8.method254(local23, local3 + 1);
		@Pc(42) int local42 = Static8.method254(local23 + 1, local3);
		@Pc(51) int local51 = Static8.method254(local23 + 1, local3 + 1);
		@Pc(60) int local60 = Static52.method1010(arg1, local28, local13, local35);
		@Pc(67) int local67 = Static52.method1010(arg1, local42, local13, local51);
		return Static52.method1010(arg1, local60, local19, local67);
	}

	@OriginalMember(owner = "client!e", name = "g", descriptor = "(I)V")
	public static void method885() {
		while (true) {
			@Pc(10) Class108 local10 = Static201.aClass108_17;
			@Pc(17) Class2_Sub13 local17;
			synchronized (Static201.aClass108_17) {
				local17 = (Class2_Sub13) Static116.aClass108_10.method3325();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass15_Sub1_51.method426(local17.aByteArray27, (int) local17.aLong150, local17.aClass96_3, false);
		}
	}
}
