import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
	public static int anInt2018;

	@OriginalMember(owner = "client!ic", name = "E", descriptor = "Lclient!ah;")
	public static Class7 aClass7_30;

	@OriginalMember(owner = "client!ic", name = "B", descriptor = "Lclient!eh;")
	private static Class28 aClass28_594 = Static170.method3101("New User");

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "Lclient!eh;")
	public static Class28 aClass28_592 = aClass28_594;

	@OriginalMember(owner = "client!ic", name = "u", descriptor = "Lclient!eh;")
	public static Class28 aClass28_593 = Static170.method3101("<col=ffffff>");

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "[[I")
	public static int[][] anIntArrayArray20 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!ic", name = "G", descriptor = "Lclient!eh;")
	public static Class28 aClass28_595 = Static170.method3101("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!ic", name = "H", descriptor = "Lclient!eh;")
	public static Class28 aClass28_596 = Static170.method3101(":tradereq:");

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
	public static int anInt2024 = 0;

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "[I")
	public static int[] anIntArray337 = new int[2000];

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BII)V")
	public static void method1570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static48.method1149(arg0)) {
			Static124.method2461(arg1, Static42.aClass33ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Lclient!rf;")
	public static Class3_Sub2_Sub16 method1571(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub2_Sub16 local10 = (Class3_Sub2_Sub16) Static110.aClass63_19.method2337((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static161.aClass7_63.method1021(1, arg0);
		local10 = new Class3_Sub2_Sub16();
		if (local20 != null) {
			local10.method2707(new Class3_Sub8(local20), arg0);
		}
		Static110.aClass63_19.method2338((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIB)V")
	public static void method1572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class3_Sub2_Sub11 local12 = Static107.method2179(arg1);
		@Pc(15) int local15 = local12.anInt2398;
		@Pc(18) int local18 = local12.anInt2392;
		@Pc(21) int local21 = local12.anInt2393;
		@Pc(28) int local28 = RuntimeException_Sub1.anIntArray544[local21 - local18];
		if (arg0 < 0 || arg0 > local28) {
			arg0 = 0;
		}
		local28 <<= local18;
		Static72.anIntArray354[local15] = ~local28 & Static72.anIntArray354[local15] | local28 & arg0 << local18;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!ch;)V")
	public static void method1573(@OriginalArg(1) Class3_Sub3 arg0) {
		if (arg0.aClass3_Sub13_5 != null) {
			arg0.aClass3_Sub13_5.anInt2594 = 0;
		}
		arg0.aBoolean175 = false;
		for (@Pc(16) Class3_Sub3 local16 = arg0.method2844(); local16 != null; local16 = arg0.method2843()) {
			method1573(local16);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(JI)V")
	public static void method1574(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static169.method658(arg0 - 1L);
			Static169.method658(1L);
		} else {
			Static169.method658(arg0);
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
	public static void method1575() {
		aClass28_594 = null;
		aClass28_592 = null;
		aClass28_595 = null;
		aClass7_30 = null;
		anIntArray337 = null;
		aClass28_596 = null;
		anIntArrayArray20 = null;
		aClass28_593 = null;
	}
}
