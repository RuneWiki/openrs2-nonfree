import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString6;

	@OriginalMember(owner = "client!kg", name = "fb", descriptor = "I")
	public static int anInt2492;

	@OriginalMember(owner = "client!kg", name = "gb", descriptor = "[I")
	public static int[] anIntArray423;

	@OriginalMember(owner = "client!kg", name = "D", descriptor = "Lclient!ui;")
	public static Class103 aClass103_15 = new Class103(16);

	@OriginalMember(owner = "client!kg", name = "W", descriptor = "I")
	public static int anInt2487 = 0;

	@OriginalMember(owner = "client!kg", name = "X", descriptor = "I")
	public static int anInt2488 = 0;

	@OriginalMember(owner = "client!kg", name = "cb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_532 = Static199.method3560("<col=ff9040>");

	@OriginalMember(owner = "client!kg", name = "ib", descriptor = "I")
	public static int anInt2494 = 0;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
	public static void method1927() {
		Static199.method3558();
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			Static202.aClass90Array1[local13].method3523();
		}
		System.gc();
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(IIIII)V")
	public static void method1928(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static65.method1058();
		Static161.aClass2_Sub23_Sub1_5.anInt2703 = 0;
		Static161.aClass2_Sub23_Sub1_5.method2132(140);
		Static161.aClass2_Sub23_Sub1_5.method2132(arg0);
		Static161.aClass2_Sub23_Sub1_5.method2132(arg2);
		Static161.aClass2_Sub23_Sub1_5.method2117(arg3);
		Static161.aClass2_Sub23_Sub1_5.method2117(arg1);
		Static203.anInt4536 = 1;
		Static104.anInt2284 = 1;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!nh;I)Lclient!jf;")
	public static Class14_Sub3 method1929(@OriginalArg(0) Class2_Sub23 arg0) {
		return new Class14_Sub3(arg0.method2104(), arg0.method2104(), arg0.method2104(), arg0.method2104(), arg0.method2091(), arg0.method2091(), arg0.method2122());
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!oe;IIIIZI)V")
	public static void method1932(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static142.aBoolean143 = false;
		Static129.anInt2911 = arg1;
		Static170.anInt3939 = 2;
		Static126.anInt2869 = 0;
		Static9.anInt274 = 1;
		Static81.anInt1743 = arg2;
		Static41.aClass72_52 = arg0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZI)V")
	public static void method1935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub3_Sub15 local8 = Static103.method1787(1, arg1);
		local8.method1647();
		local8.anInt2073 = arg0;
	}
}
