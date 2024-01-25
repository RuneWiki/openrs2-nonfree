import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "J")
	public static long aLong83;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
	public static int anInt2360;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_45 = new Class216(62, 4);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZLclient!cf;Lclient!cf;I)I")
	public static int method2248(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class22_Sub1 arg1, @OriginalArg(3) Class22_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg3 == 1) {
			local9 = arg1.anInt1412;
			local12 = arg2.anInt1412;
			if (!arg0) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg3 == 2) {
			return Static59.method1324(Static164.anInt2984, arg1.method1434().aString99, arg2.method1434().aString99);
		} else if (arg3 == 3) {
			if (arg1.aString13.equals("-")) {
				if (arg2.aString13.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString13.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static59.method1324(Static164.anInt2984, arg1.aString13, arg2.aString13);
			}
		} else if (arg3 == 4) {
			if (arg1.method1430()) {
				return arg2.method1430() ? 0 : 1;
			} else if (arg2.method1430()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg1.method1428()) {
				return arg2.method1428() ? 0 : 1;
			} else if (arg2.method1428()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg1.method1427()) {
				return arg2.method1427() ? 0 : 1;
			} else if (arg2.method1427()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg1.method1431()) {
				return arg2.method1431() ? 0 : 1;
			} else if (arg2.method1431()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local9 = arg1.anInt1419;
			local12 = arg2.anInt1419;
			if (arg0) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local9 == 1000) {
					local9 = -1;
				}
			} else {
				if (local9 == -1) {
					local9 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg1.anInt1421 - arg2.anInt1421;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method2250(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static279.aClass179_33.method4066(Static164.anInt2984) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static279.aClass179_35.method4066(Static164.anInt2984) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
