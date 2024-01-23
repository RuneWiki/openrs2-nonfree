import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!og", name = "h", descriptor = "I")
	public static int anInt3896;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray38;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "I")
	public static int anInt3897;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "Lclient!lh;")
	public static Class1_Sub11_Sub1 aClass1_Sub11_Sub1_2 = new Class1_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!og", name = "l", descriptor = "Lclient!fm;")
	public static Class49 aClass49_8 = new Class49(64);

	@OriginalMember(owner = "client!og", name = "n", descriptor = "[[S")
	public static short[][] aShortArrayArray4 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Lclient!fd;")
	public static Class44 method3137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub26 local7 = Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class44 local14 = local7.aClass44_1;
			local7.aClass44_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII)I")
	public static int method3138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 1023 - arg1;
		} else if (local7 == 2) {
			return 1023 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZLclient!fj;)V")
	public static void method3139(@OriginalArg(1) Class14_Sub2_Sub1 arg0) {
		@Pc(8) Class1_Sub8 local8 = (Class1_Sub8) Static179.aClass70_12.method2075(Static93.method1658(arg0.aString99));
		if (local8 == null) {
			return;
		}
		if (local8.aClass1_Sub5_Sub1_1 != null) {
			Static141.aClass1_Sub5_Sub4_1.method4380(local8.aClass1_Sub5_Sub1_1);
			local8.aClass1_Sub5_Sub1_1 = null;
		}
		local8.method4441();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IILclient!km;I)Lclient!kn;")
	public static Class1_Sub2_Sub11_Sub2 method3141(@OriginalArg(1) int arg0, @OriginalArg(2) Class91 arg1) {
		return Static240.method3698(0, arg0, arg1) ? Static278.method4234() : null;
	}
}
