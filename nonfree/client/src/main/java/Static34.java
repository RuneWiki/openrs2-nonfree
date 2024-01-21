import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!g", name = "y", descriptor = "Lclient!wb;")
	public static Class65 aClass65_483 = Static24.method441("backleft2");

	@OriginalMember(owner = "client!g", name = "E", descriptor = "Lclient!wb;")
	private static Class65 aClass65_484 = Static24.method441("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!g", name = "G", descriptor = "I")
	public static int anInt1140 = 0;

	@OriginalMember(owner = "client!g", name = "I", descriptor = "[Lclient!wb;")
	public static Class65[] aClass65Array5 = new Class65[100];

	@OriginalMember(owner = "client!g", name = "J", descriptor = "I")
	public static final int anInt1141 = 2301979;

	@OriginalMember(owner = "client!g", name = "K", descriptor = "Lclient!wb;")
	public static Class65 aClass65_485 = Static24.method441("Hierhin gehen");

	@OriginalMember(owner = "client!g", name = "M", descriptor = "Lclient!wb;")
	public static Class65 aClass65_486 = aClass65_484;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V")
	public static void method697() {
		aClass65_483 = null;
		aClass65_484 = null;
		aClass65Array5 = null;
		aClass65_485 = null;
		aClass65_486 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IJ)V")
	public static void method698(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static106.method1748(arg0 - 1L);
			Static106.method1748(1L);
		} else {
			Static106.method1748(arg0);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIII)I")
	public static int method699(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return 7 - arg2;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(B)I")
	public static int method700() {
		return 19;
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
	public static void method701() {
		Static48.aClass21_18.method743();
		Static46.aClass21_16.method743();
		Static63.aClass21_27.method743();
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(B)V")
	public static void method702() {
		Static4.aBoolean16 = true;
		Static31.aBoolean65 = true;
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
	public static void method703() {
		Static89.aClass15_60.method1098();
		Static46.aClass2_Sub1_Sub4_Sub3_12.method1479(0, 0);
		Static3.anIntArray27 = Static10.method243(Static3.anIntArray27);
	}
}
