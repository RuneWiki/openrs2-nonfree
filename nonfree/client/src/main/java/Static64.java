import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!le", name = "o", descriptor = "Lclient!m;")
	public static Class3_Sub6 aClass3_Sub6_5;

	@OriginalMember(owner = "client!le", name = "u", descriptor = "I")
	public static int anInt1695;

	@OriginalMember(owner = "client!le", name = "y", descriptor = "[Lclient!ae;")
	public static Class5[] aClass5Array12;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "Z")
	public static boolean aBoolean79 = false;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!le", name = "n", descriptor = "I")
	public static int anInt1692 = 0;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "Lclient!ae;")
	private static Class5 aClass5_794 = Static56.method972("green:");

	@OriginalMember(owner = "client!le", name = "q", descriptor = "Lclient!ae;")
	public static Class5 aClass5_795 = Static56.method972("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!le", name = "s", descriptor = "I")
	public static volatile int anInt1694 = 0;

	@OriginalMember(owner = "client!le", name = "t", descriptor = "Lclient!ae;")
	public static Class5 aClass5_796 = Static56.method972(":chalreq:");

	@OriginalMember(owner = "client!le", name = "v", descriptor = "Lclient!ae;")
	public static Class5 aClass5_797 = Static56.method972("@gr2@");

	@OriginalMember(owner = "client!le", name = "x", descriptor = "Lclient!ae;")
	public static Class5 aClass5_798 = aClass5_794;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIZ)I")
	public static int method1083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!ae;Lclient!ae;ZI)V")
	public static void method1084(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0 && Static100.anInt2515 != -1) {
			Static30.aClass5_396 = arg1;
			Static76.anInt2563 = 0;
		}
		if (Static88.anInt2255 == -1) {
			Static15.aBoolean22 = true;
		}
		for (@Pc(31) int local31 = 99; local31 > 0; local31--) {
			Static16.anIntArray64[local31] = Static16.anIntArray64[local31 - 1];
			Static89.aClass5Array15[local31] = Static89.aClass5Array15[local31 - 1];
			Static3.aClass5Array2[local31] = Static3.aClass5Array2[local31 - 1];
		}
		Static16.anIntArray64[0] = arg2;
		Static89.aClass5Array15[0] = arg0;
		Static3.aClass5Array2[0] = arg1;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public static void method1085() {
		aClass5_798 = null;
		aClass5_797 = null;
		aClass5_794 = null;
		aClass5_796 = null;
		aClass3_Sub6_5 = null;
		aCalendar1 = null;
		aClass5Array12 = null;
		aClass5_795 = null;
	}
}
