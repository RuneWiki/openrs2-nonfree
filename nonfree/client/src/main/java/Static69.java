import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Lclient!rf;")
	private static Class70 aClass70_663 = Static49.method1293("yellow:");

	@OriginalMember(owner = "client!he", name = "e", descriptor = "I")
	public static int anInt2126 = 0;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "Lclient!rf;")
	public static Class70 aClass70_664 = Static49.method1293("l");

	@OriginalMember(owner = "client!he", name = "g", descriptor = "Lclient!rf;")
	public static Class70 aClass70_665 = Static49.method1293("Benutzen");

	@OriginalMember(owner = "client!he", name = "h", descriptor = "[I")
	public static int[] anIntArray205 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Lclient!rf;")
	public static Class70 aClass70_666 = aClass70_663;

	@OriginalMember(owner = "client!he", name = "j", descriptor = "Lclient!rf;")
	public static Class70 aClass70_667 = aClass70_663;

	@OriginalMember(owner = "client!he", name = "k", descriptor = "I")
	public static int anInt2127 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZI)I")
	public static int method1571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub16 local13 = (Class1_Sub16) Static61.aClass30_8.method1467((long) arg1);
		if (local13 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(28) int local28 = 0;
			for (@Pc(30) int local30 = 0; local30 < local13.anIntArray251.length; local30++) {
				if (arg0 == local13.anIntArray250[local30]) {
					local28 += local13.anIntArray251[local30];
				}
			}
			return local28;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!be;Lclient!ue;BI)V")
	public static void method1572(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class76_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class1_Sub13 local3 = new Class1_Sub13();
		local3.aLong147 = arg2;
		local3.aClass9_1 = arg0;
		local3.aClass76_Sub1_7 = arg1;
		local3.anInt2284 = 1;
		@Pc(27) Class4 local27 = Static89.aClass4_9;
		synchronized (Static89.aClass4_9) {
			Static89.aClass4_9.method179(local3);
		}
		Static21.method466();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)J")
	public static long method1573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass54_1 == null ? 0L : local7.aClass54_1.aLong100;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	public static void method1574() {
		aClass70_664 = null;
		aClass70_663 = null;
		anIntArray205 = null;
		aClass70_665 = null;
		aClass70_666 = null;
		aClass70_667 = null;
	}
}
