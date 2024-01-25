import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
	public static int anInt1784;

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
	public static int anInt1790;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "()V")
	public static void method1768() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static597.aClass33Array1.length; local3++) {
				if (Static597.aClass33Array1[local3].method1376()) {
					Static390.aLongArray17[local3] = Static597.aClass33Array1[local3].method1372();
				} else {
					synchronized (Static597.aClass33Array1[local3]) {
						Static597.aClass33Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static597.aClass33Array1[Static597.aClass33Array1.length - 1].method1371();
				Static568.method8122(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static597.aClass33Array1.length - 1; local3++) {
						if (!Static597.aClass33Array1[local3].method1376()) {
							synchronized (Static597.aClass33Array1[local3]) {
								Static597.aClass33Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static597.aClass33Array1.length - 2; local102++) {
							Static597.aClass33Array1[local102].method1371();
						}
						Static568.method8122(2);
						while (!Static597.aClass33Array1[0].method1376()) {
							synchronized (Static597.aClass33Array1[0]) {
								Static597.aClass33Array1[0].notify();
							}
							try {
								Static258.method4293(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static597.aClass33Array1[0].method1371();
						return;
					}
					try {
						Static258.method4293(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static258.method4293(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method1771(@OriginalArg(0) long arg0) {
		Static82.aCalendar1.setTime(new Date(arg0));
		@Pc(18) int local18 = Static82.aCalendar1.get(7);
		@Pc(22) int local22 = Static82.aCalendar1.get(5);
		@Pc(26) int local26 = Static82.aCalendar1.get(2);
		@Pc(30) int local30 = Static82.aCalendar1.get(1);
		@Pc(34) int local34 = Static82.aCalendar1.get(11);
		@Pc(38) int local38 = Static82.aCalendar1.get(12);
		@Pc(42) int local42 = Static82.aCalendar1.get(13);
		return Static141.aStringArray8[local18 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static409.aStringArray28[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method1773() {
		@Pc(12) String local12 = "www";
		if (Static2.aClass135_1 == Static252.aClass135_5) {
			local12 = "www-wtrc";
		} else if (Static310.aClass135_6 == Static2.aClass135_1) {
			local12 = "www-wtqa";
		} else if (Static2.aClass135_1 == Static350.aClass135_12) {
			local12 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static330.aString66 != null) {
			local33 = "/p=" + Static330.aString66;
		}
		return "http://" + local12 + "." + Static212.aClass222_2.aString72 + ".com/l=" + Static325.anInt6083 + "/a=" + Static58.anInt1583 + local33 + "/";
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIBIII)I")
	public static int method1778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(10) int local10 = arg4;
			arg4 = arg1;
			arg1 = local10;
		}
		@Pc(18) int local18 = arg0 & 0x3;
		if (local18 == 0) {
			return arg2;
		} else if (local18 == 1) {
			return 7 + 1 - arg3 - arg4;
		} else if (local18 == 2) {
			return 7 + 1 - arg2 - arg1;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!sl;B)Lclient!bba;")
	public static Class25 method1779(@OriginalArg(0) Class3_Sub3 arg0) {
		@Pc(7) int local7 = arg0.method4221();
		@Pc(14) Class83 local14 = Static352.method5820()[arg0.method4225()];
		@Pc(26) Class50 local26 = Static496.method2282()[arg0.method4225()];
		@Pc(30) int local30 = arg0.method4209();
		@Pc(34) int local34 = arg0.method4209();
		return new Class25(local7, local14, local26, local30, local34);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIII)I")
	public static int method1781(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 & 0x3;
		if (local15 == 0) {
			return arg2;
		} else if (local15 == 1) {
			return 4095 - arg0;
		} else if (local15 == 2) {
			return 4095 - arg2;
		} else {
			return arg0;
		}
	}
}
