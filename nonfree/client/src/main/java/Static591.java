import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!wm", name = "F", descriptor = "I")
	public static int anInt9706;

	@OriginalMember(owner = "client!wm", name = "G", descriptor = "Lclient!o;")
	public static Class4_Sub7_Sub13 aClass4_Sub7_Sub13_3;

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "Lclient!lt;")
	public static final Class215 aClass215_4 = new Class215("WIP", 2);

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(B)V")
	public static void method7950() {
		Static33.method600(11);
		Static514.method7262();
		System.gc();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIBI)I")
	public static int method7951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg2;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method7952(@OriginalArg(0) long arg0) {
		Static140.aCalendar1.setTime(new Date(arg0));
		@Pc(18) int local18 = Static140.aCalendar1.get(7);
		@Pc(22) int local22 = Static140.aCalendar1.get(5);
		@Pc(26) int local26 = Static140.aCalendar1.get(2);
		@Pc(30) int local30 = Static140.aCalendar1.get(1);
		@Pc(34) int local34 = Static140.aCalendar1.get(11);
		@Pc(38) int local38 = Static140.aCalendar1.get(12);
		@Pc(42) int local42 = Static140.aCalendar1.get(13);
		return Static454.aStringArray34[local18 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static463.aStringArray35[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZBLclient!gba;II)V")
	public static void method7953(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class115 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg1.anInt3474;
		@Pc(16) int local16 = arg1.anInt3481;
		if (arg1.aByte42 == 0) {
			arg1.anInt3474 = arg1.anInt3528;
		} else if (arg1.aByte42 == 1) {
			arg1.anInt3474 = arg3 - arg1.anInt3528;
		} else if (arg1.aByte42 == 2) {
			arg1.anInt3474 = arg1.anInt3528 * arg3 >> 14;
		}
		if (arg1.aByte43 == 0) {
			arg1.anInt3481 = arg1.anInt3500;
		} else if (arg1.aByte43 == 1) {
			arg1.anInt3481 = arg2 - arg1.anInt3500;
		} else if (arg1.aByte43 == 2) {
			arg1.anInt3481 = arg1.anInt3500 * arg2 >> 14;
		}
		if (arg1.aByte42 == 4) {
			arg1.anInt3474 = arg1.anInt3434 * arg1.anInt3481 / arg1.anInt3461;
		}
		if (arg1.aByte43 == 4) {
			arg1.anInt3481 = arg1.anInt3461 * arg1.anInt3474 / arg1.anInt3434;
		}
		if (Static126.aBoolean235 && (Static69.method1233(arg1).anInt5878 != 0 || arg1.anInt3519 == 0)) {
			if (arg1.anInt3481 < 5 && arg1.anInt3474 < 5) {
				arg1.anInt3481 = 5;
				arg1.anInt3474 = 5;
			} else {
				if (arg1.anInt3481 <= 0) {
					arg1.anInt3481 = 5;
				}
				if (arg1.anInt3474 <= 0) {
					arg1.anInt3474 = 5;
				}
			}
		}
		if (arg1.anInt3509 == Static413.anInt7159) {
			Static92.aClass115_3 = arg1;
		}
		if (arg0 && arg1.anObjectArray8 != null && (local8 != arg1.anInt3474 || local16 != arg1.anInt3481)) {
			@Pc(192) Class4_Sub12 local192 = new Class4_Sub12();
			local192.aClass115_5 = arg1;
			local192.anObjectArray3 = arg1.anObjectArray8;
			Static577.aClass124_67.method3275(local192);
		}
	}
}
