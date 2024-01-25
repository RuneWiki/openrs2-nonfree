import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[100];

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "Lclient!ku;")
	public static final Class139 aClass139_62 = new Class139(10);

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "Lclient!bc;")
	public static final Class22 aClass22_7 = new Class22();

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_71 = new Class244(39, -1);

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "Lclient!ba;")
	public static final Class21 aClass21_4 = new Class21(128);

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "[I")
	public static final int[] anIntArray566 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
	public static int anInt5095 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!dt;II)V")
	public static void method4557(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte25 == 0) {
			arg1.anInt1559 = arg1.anInt1532;
		} else if (arg1.aByte25 == 1) {
			arg1.anInt1559 = (arg2 - arg1.anInt1551) / 2 + arg1.anInt1532;
		} else if (arg1.aByte25 == 2) {
			arg1.anInt1559 = arg2 - arg1.anInt1532 - arg1.anInt1551;
		} else if (arg1.aByte25 == 3) {
			arg1.anInt1559 = arg1.anInt1532 * arg2 >> 14;
		} else if (arg1.aByte25 == 4) {
			arg1.anInt1559 = (arg2 - arg1.anInt1551) / 2 + (arg1.anInt1532 * arg2 >> 14);
		} else {
			arg1.anInt1559 = arg2 - arg1.anInt1551 - (arg1.anInt1532 * arg2 >> 14);
		}
		if (arg1.aByte23 == 0) {
			arg1.anInt1523 = arg1.anInt1529;
		} else if (arg1.aByte23 == 1) {
			arg1.anInt1523 = (arg0 - arg1.anInt1546) / 2 + arg1.anInt1529;
		} else if (arg1.aByte23 == 2) {
			arg1.anInt1523 = arg0 - arg1.anInt1546 - arg1.anInt1529;
		} else if (arg1.aByte23 == 3) {
			arg1.anInt1523 = arg0 * arg1.anInt1529 >> 14;
		} else if (arg1.aByte23 == 4) {
			arg1.anInt1523 = (arg0 - arg1.anInt1546) / 2 + (arg0 * arg1.anInt1529 >> 14);
		} else {
			arg1.anInt1523 = arg0 - arg1.anInt1546 - (arg0 * arg1.anInt1529 >> 14);
		}
		if (!Static75.aBoolean129 || Static48.method915(arg1).anInt6291 == 0 && arg1.anInt1575 != 0) {
			return;
		}
		if (arg1.anInt1523 < 0) {
			arg1.anInt1523 = 0;
		} else if (arg1.anInt1523 + arg1.anInt1546 > arg0) {
			arg1.anInt1523 = arg0 - arg1.anInt1546;
		}
		if (arg1.anInt1559 < 0) {
			arg1.anInt1559 = 0;
		} else if (arg1.anInt1559 + arg1.anInt1551 > arg2) {
			arg1.anInt1559 = arg2 - arg1.anInt1551;
			return;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)I")
	public static int method4558(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local18 * local32 >> 12;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method4560() {
		Static375.aClass62ArrayArray2 = new Class62[Static131.aClass20_37.method229()][];
		Static181.aClass62ArrayArray1 = new Class62[Static131.aClass20_37.method229()][];
		Static188.aBooleanArray82 = new boolean[Static131.aClass20_37.method229()];
	}
}
