import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!we", name = "v", descriptor = "Lclient!gh;")
	public static Class26 aClass26_1;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "I")
	public static int anInt4125;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1435 = Static161.method2971(")1p");

	@OriginalMember(owner = "client!we", name = "s", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1436 = Static161.method2971("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!we", name = "t", descriptor = "[I")
	public static int[] anIntArray454 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!we", name = "u", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1437 = Static161.method2971("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!we", name = "w", descriptor = "I")
	public static int anInt4123 = 0;

	@OriginalMember(owner = "client!we", name = "x", descriptor = "I")
	public static int anInt4124 = -1;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
	public static void method3027() {
		if (Static99.aClass23_1 != null) {
			@Pc(12) Class23 local12 = Static99.aClass23_1;
			synchronized (Static99.aClass23_1) {
				Static99.aClass23_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
	public static void method3028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub10 local7 = Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass56_1 = null;
		}
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
	public static void method3029() {
		aClass13_1435 = null;
		aClass26_1 = null;
		anIntArray454 = null;
		aCalendar2 = null;
		aClass13_1437 = null;
		aClass13_1436 = null;
	}
}
