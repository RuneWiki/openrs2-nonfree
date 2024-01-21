import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!f", name = "Xb", descriptor = "I")
	public static int anInt1655;

	@OriginalMember(owner = "client!f", name = "Ib", descriptor = "Lclient!rf;")
	public static Class70 aClass70_525 = Static49.method1293(" loggt sich ein)3");

	@OriginalMember(owner = "client!f", name = "Ub", descriptor = "Lclient!ad;")
	public static Class4 aClass4_7 = new Class4();

	@OriginalMember(owner = "client!f", name = "Wb", descriptor = "I")
	public static int anInt1654 = 0;

	@OriginalMember(owner = "client!f", name = "Yb", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!rf;II)V")
	public static void method1282(@OriginalArg(1) int arg0, @OriginalArg(2) Class70 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class39 local8 = Static44.method1103(arg0, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray15 != null) {
			@Pc(18) Class1_Sub19 local18 = new Class1_Sub19();
			local18.aClass39_31 = local8;
			local18.anInt3086 = arg2;
			local18.anObjectArray27 = local8.anObjectArray15;
			local18.aClass70_1009 = arg1;
			Static60.method1460(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local8.anInt2381 > 0) {
			local36 = Static90.method1967(local8);
		}
		if (!local36 || !Static37.method957(arg2 - 1, Static20.method439(local8))) {
			return;
		}
		if (arg2 == 1) {
			Static131.aClass1_Sub9_Sub1_3.method1283(136);
			Static131.aClass1_Sub9_Sub1_3.method1259(arg0);
			Static131.aClass1_Sub9_Sub1_3.method1236(arg3);
		}
		if (arg2 == 2) {
			Static131.aClass1_Sub9_Sub1_3.method1283(106);
			Static131.aClass1_Sub9_Sub1_3.method1259(arg0);
			Static131.aClass1_Sub9_Sub1_3.method1236(arg3);
		}
		if (arg2 == 3) {
			Static131.aClass1_Sub9_Sub1_3.method1283(102);
			Static131.aClass1_Sub9_Sub1_3.method1259(arg0);
			Static131.aClass1_Sub9_Sub1_3.method1236(arg3);
		}
		if (arg2 == 4) {
			Static131.aClass1_Sub9_Sub1_3.method1283(32);
			Static131.aClass1_Sub9_Sub1_3.method1259(arg0);
			Static131.aClass1_Sub9_Sub1_3.method1236(arg3);
		}
		if (arg2 == 5) {
			Static131.aClass1_Sub9_Sub1_3.method1283(112);
			Static131.aClass1_Sub9_Sub1_3.method1259(arg0);
			Static131.aClass1_Sub9_Sub1_3.method1236(arg3);
		}
		if (arg2 == 6) {
			Static131.aClass1_Sub9_Sub1_3.method1283(115);
			Static131.aClass1_Sub9_Sub1_3.method1259(arg0);
			Static131.aClass1_Sub9_Sub1_3.method1236(arg3);
		}
		if (arg2 == 7) {
			Static131.aClass1_Sub9_Sub1_3.method1283(31);
			Static131.aClass1_Sub9_Sub1_3.method1259(arg0);
			Static131.aClass1_Sub9_Sub1_3.method1236(arg3);
		}
		if (arg2 == 8) {
			Static131.aClass1_Sub9_Sub1_3.method1283(35);
			Static131.aClass1_Sub9_Sub1_3.method1259(arg0);
			Static131.aClass1_Sub9_Sub1_3.method1236(arg3);
		}
		if (arg2 == 9) {
			Static131.aClass1_Sub9_Sub1_3.method1283(113);
			Static131.aClass1_Sub9_Sub1_3.method1259(arg0);
			Static131.aClass1_Sub9_Sub1_3.method1236(arg3);
		}
		if (arg2 == 10) {
			Static131.aClass1_Sub9_Sub1_3.method1283(218);
			Static131.aClass1_Sub9_Sub1_3.method1259(arg0);
			Static131.aClass1_Sub9_Sub1_3.method1236(arg3);
		}
	}

	@OriginalMember(owner = "client!f", name = "l", descriptor = "(B)V")
	public static void method1284() {
		aCalendar1 = null;
		aClass4_7 = null;
		aClass70_525 = null;
	}

	@OriginalMember(owner = "client!f", name = "m", descriptor = "(B)I")
	public static int method1286() {
		return 6;
	}

	@OriginalMember(owner = "client!f", name = "n", descriptor = "(B)V")
	public static void method1287() {
		Static96.anIntArray259 = new int[104];
		Static95.aByteArrayArrayArray6 = new byte[4][104][104];
		Static35.anIntArray198 = new int[104];
		Static134.anIntArray331 = new int[104];
		Static25.aByteArrayArrayArray2 = new byte[4][104][104];
		Static37.anIntArray122 = new int[104];
		Static60.aByteArrayArrayArray4 = new byte[4][104][104];
		Static39.anIntArrayArrayArray3 = new int[4][105][105];
		Static41.aByteArrayArrayArray3 = new byte[4][104][104];
		Static65.aByteArrayArrayArray5 = new byte[4][105][105];
		Static49.anIntArray169 = new int[104];
		Static122.anInt3337 = 99;
	}
}
