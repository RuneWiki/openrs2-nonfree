import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!sc", name = "kb", descriptor = "Lclient!fd;")
	public static Class7_Sub1 aClass7_Sub1_7;

	@OriginalMember(owner = "client!sc", name = "Z", descriptor = "Lclient!eh;")
	private static Class28 aClass28_527 = Static170.method3101("flash1:");

	@OriginalMember(owner = "client!sc", name = "db", descriptor = "Lclient!eh;")
	private static Class28 aClass28_530 = Static170.method3101("white:");

	@OriginalMember(owner = "client!sc", name = "ab", descriptor = "Lclient!eh;")
	public static Class28 aClass28_528 = aClass28_530;

	@OriginalMember(owner = "client!sc", name = "gb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_533 = Static170.method3101("This world is full)3");

	@OriginalMember(owner = "client!sc", name = "bb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_529 = aClass28_533;

	@OriginalMember(owner = "client!sc", name = "eb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_531 = Static170.method3101(":duelstake:");

	@OriginalMember(owner = "client!sc", name = "fb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_532 = aClass28_530;

	@OriginalMember(owner = "client!sc", name = "hb", descriptor = "Lclient!pa;")
	public static Class63 aClass63_8 = new Class63(64);

	@OriginalMember(owner = "client!sc", name = "ib", descriptor = "Lclient!eh;")
	public static Class28 aClass28_534 = aClass28_527;

	@OriginalMember(owner = "client!sc", name = "pb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_535 = aClass28_527;

	@OriginalMember(owner = "client!sc", name = "ub", descriptor = "Lclient!eh;")
	public static Class28 aClass28_536 = Static170.method3101(")3");

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Lclient!he;")
	public static Class3_Sub2_Sub9 method1395(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub2_Sub9 local10 = (Class3_Sub2_Sub9) Static104.aClass63_18.method2337((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static17.aClass7_10.method1021(4, arg0);
		local10 = new Class3_Sub2_Sub9();
		if (local20 != null) {
			local10.method1338(arg0, new Class3_Sub8(local20));
		}
		Static104.aClass63_18.method2338((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([Lclient!eh;Z[S)V")
	public static void method1397(@OriginalArg(0) Class28[] arg0, @OriginalArg(2) short[] arg1) {
		Static22.method609(0, arg0.length - 1, arg1, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIII)Lclient!gh;")
	public static Class3_Sub7 method1398(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub7 local12 = new Class3_Sub7();
		local12.anInt1547 = arg1;
		local12.anInt1548 = arg0;
		Static119.aClass87_11.method3200((long) arg2, local12);
		Static126.method2500(arg0);
		Static5.method103(arg0);
		@Pc(34) Class33 local34 = Static19.method576(arg2);
		if (local34 != null) {
			Static16.method534(local34);
		}
		if (Static175.aClass33_15 != null) {
			Static16.method534(Static175.aClass33_15);
			Static175.aClass33_15 = null;
		}
		Static82.anInt2400 = 0;
		Static69.aBoolean112 = false;
		Static23.method618(Static65.anInt2018, Static132.anInt3333, Static68.anInt2102, Static91.anInt4119);
		if (Static177.anInt4207 != -1) {
			Static65.method1570(Static177.anInt4207, 1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(Z)V")
	public static void method1399() {
		aClass7_Sub1_7 = null;
		aClass28_536 = null;
		aClass28_535 = null;
		aClass28_528 = null;
		aClass63_8 = null;
		aClass28_529 = null;
		aClass28_533 = null;
		aClass28_534 = null;
		aClass28_532 = null;
		aClass28_527 = null;
		aClass28_531 = null;
		aClass28_530 = null;
	}
}
