import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!ta", name = "F", descriptor = "[[[[Z")
	public static boolean[][][][] aBooleanArrayArrayArrayArray1;

	@OriginalMember(owner = "client!ta", name = "C", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1272 = Static120.method2057("Spieler");

	@OriginalMember(owner = "client!ta", name = "E", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!ta", name = "M", descriptor = "Lclient!nd;")
	public static Class59 aClass59_25 = new Class59(100);

	@OriginalMember(owner = "client!ta", name = "O", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1273 = Static120.method2057("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
	public static void method2704() {
		aCalendar1 = null;
		aBooleanArrayArrayArrayArray1 = null;
		aClass81_1273 = null;
		aClass81_1272 = null;
		aClass59_25 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ud;ILclient!pb;I)V")
	public static void method2705(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2) {
		@Pc(3) byte[] local3 = null;
		@Pc(5) Class30 local5 = Static139.aClass30_14;
		synchronized (Static139.aClass30_14) {
			for (@Pc(12) Class1_Sub7 local12 = (Class1_Sub7) Static139.aClass30_14.method1115(); local12 != null; local12 = (Class1_Sub7) Static139.aClass30_14.method1125()) {
				if ((long) arg1 == local12.aLong148 && local12.aClass66_1 == arg2 && local12.anInt307 == 0) {
					local3 = local12.aByteArray1;
					break;
				}
			}
		}
		if (local3 == null) {
			@Pc(75) byte[] local75 = arg2.method2161(arg1);
			arg0.method2974(arg1, local75, arg2, true);
		} else {
			arg0.method2974(arg1, local3, arg2, true);
		}
	}
}
