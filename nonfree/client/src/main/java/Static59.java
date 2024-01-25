import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!dq", name = "k", descriptor = "J")
	public static long aLong54 = 0L;

	@OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
	public static int anInt1745 = 0;

	@OriginalMember(owner = "client!dq", name = "p", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_47 = new Class34("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
	public static int anInt1751 = 0;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZILclient!oo;ILclient!oo;)I")
	public static int method1510(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class104_Sub1 arg2, @OriginalArg(4) Class104_Sub1 arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg1 == 1) {
			local9 = arg3.anInt4706;
			local12 = arg2.anInt4706;
			if (!arg0) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg1 == 2) {
			return Static341.method5495(Static259.anInt2907, arg3.method4234().aString20, arg2.method4234().aString20);
		} else if (arg1 == 3) {
			if (arg3.aString48.equals("-")) {
				if (arg2.aString48.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString48.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static341.method5495(Static259.anInt2907, arg3.aString48, arg2.aString48);
			}
		} else if (arg1 == 4) {
			if (arg3.method4226()) {
				return arg2.method4226() ? 0 : 1;
			} else if (arg2.method4226()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 5) {
			if (arg3.method4230()) {
				return arg2.method4230() ? 0 : 1;
			} else if (arg2.method4230()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 6) {
			if (arg3.method4224()) {
				return arg2.method4224() ? 0 : 1;
			} else if (arg2.method4224()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 7) {
			if (arg3.method4225()) {
				return arg2.method4225() ? 0 : 1;
			} else if (arg2.method4225()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 8) {
			local9 = arg3.anInt4717;
			local12 = arg2.anInt4717;
			if (arg0) {
				if (local9 == 1000) {
					local9 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
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
			return arg3.anInt4715 - arg2.anInt4715;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!wo;IIZLclient!wo;)V")
	public static void method1511(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class216 arg2) {
		Static357.aBoolean413 = true;
		Static17.aClass216_5 = arg2;
		Static166.aClass216_59 = arg0;
		Static2.anInt73 = arg1;
		@Pc(19) int local19 = Static166.aClass216_59.method5647() - 1;
		Static345.anInt6609 = local19 * 256 + Static166.aClass216_59.method5675(local19);
		Static39.aStringArray12 = new String[] { null, null, Static17.aClass34_14.method1285(Static2.anInt73), null, null };
		Static194.aStringArray40 = new String[] { null, null, null, null, Static190.aClass34_122.method1285(Static2.anInt73) };
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIII)I")
	public static int method1513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(20) int local20 = 65536 - Class1_Sub3_Sub8.anIntArray156[arg3 * 8192 / arg2] >> 1;
		return ((65536 - local20) * arg0 >> 16) + (arg1 * local20 >> 16);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZI)Z")
	public static boolean method1514(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}
}
