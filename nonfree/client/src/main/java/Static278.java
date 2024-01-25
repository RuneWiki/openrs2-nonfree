import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "Lclient!im;")
	public static Class147 aClass147_5;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
	public static int anInt7456 = -2;

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "Lclient!dh;")
	public static final Class62 aClass62_9 = new Class62("game4", 3);

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
	public static int anInt7461 = 2;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)Z")
	public static boolean method6285(@OriginalArg(0) boolean arg0) {
		@Pc(11) boolean local11 = Static47.aClass33_3.method6185();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static47.aClass33_3.method6177();
		} else if (!Static47.aClass33_3.method6216()) {
			arg0 = false;
		}
		if (local11 == arg0) {
			return false;
		} else {
			Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub19_1, arg0 ? 1 : 0);
			Static152.method3314();
			return true;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public static void method6286() {
		Static224.anInt5125 = 0;
		Static620.aClass208Array1 = new Class208[50];
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)C")
	public static char method6290(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(41) char local41 = Static565.aCharArray7[local7 - 128];
			if (local41 == '\u0000') {
				local41 = '?';
			}
			local7 = local41;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIII)I")
	public static int method6292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 4095 - arg1;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return arg1;
		}
	}
}
