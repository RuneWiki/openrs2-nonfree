import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
	public static int anInt501;

	@OriginalMember(owner = "client!cc", name = "X", descriptor = "[[I")
	public static int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
	public static int anInt507;

	@OriginalMember(owner = "client!cc", name = "gb", descriptor = "Lclient!bg;")
	public static Class11 aClass11_25;

	@OriginalMember(owner = "client!cc", name = "U", descriptor = "[I")
	public static int[] anIntArray43 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!cc", name = "Z", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!cc", name = "bb", descriptor = "[I")
	public static int[] anIntArray44 = new int[128];

	@OriginalMember(owner = "client!cc", name = "eb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_296 = Static32.method683("ams");

	@OriginalMember(owner = "client!cc", name = "fb", descriptor = "I")
	public static int anInt509 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!vg;BI)Lclient!lf;")
	public static Class49 method426(@OriginalArg(0) Class85 arg0, @OriginalArg(2) int arg1) {
		if (!Static132.method2214(Static111.method1895(arg0), arg1) && arg0.anObjectArray10 == null) {
			return null;
		} else if (arg0.aClass49Array22 == null || arg1 >= arg0.aClass49Array22.length || arg0.aClass49Array22[arg1] == null || arg0.aClass49Array22[arg1].method1641().method1653() == 0) {
			return Static140.aBoolean127 ? Static33.method692(new Class49[] { Static162.aClass49_1604, Static48.method882(arg1) }) : null;
		} else {
			return arg0.aClass49Array22[arg1];
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!lf;Lclient!lf;ZLclient!bg;I)V")
	public static void method427(@OriginalArg(1) Class49 arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(4) Class11 arg2) {
		@Pc(12) int local12 = arg2.method2053(arg0);
		@Pc(18) int local18 = arg2.method2056(arg1, local12);
		Static15.method217(local18, 255, local12, arg2);
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)V")
	public static void method428() {
		anIntArrayArray3 = null;
		aCalendar1 = null;
		anIntArray43 = null;
		anIntArray44 = null;
		aClass11_25 = null;
		aClass49_296 = null;
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)V")
	public static void method429() {
		Static117.aClass74_69.method2347();
		Static70.aClass74_46.method2347();
		Static104.aClass74_62.method2347();
		Static104.aClass74_63.method2347();
		Static185.aClass74_95.method2347();
	}
}
