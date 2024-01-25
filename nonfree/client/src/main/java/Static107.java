import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Lclient!dl;")
	public static final Class49 aClass49_3 = new Class49(2);

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Z")
	public static boolean aBoolean174 = false;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Lclient!jb;")
	public static Class126 aClass126_4 = null;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	public static int anInt2257 = 0;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_29 = new Class242("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
	public static int anInt2258 = -1;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIILclient!qa;IIIIIZII[[[B)V")
	public static void method1672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][][] arg11) {
		if (arg5 == 0 || arg1 == 0) {
			return;
		}
		if (arg5 == 9) {
			arg9 = arg9 + 1 & 0x3;
			arg5 = 1;
		}
		if (arg5 == 10) {
			arg9 = arg9 + 3 & 0x3;
			arg5 = 1;
		}
		if (arg5 == 11) {
			arg9 = arg9 + 3 & 0x3;
			arg5 = 8;
		}
		arg3.aa(arg0, arg4, arg2, arg6, arg7, arg10, arg11[arg5 - 1][arg9], arg1, arg8);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BB)V")
	public static void method1676(@OriginalArg(1) byte arg0) {
		if (Static275.aByteArrayArrayArray8 == null) {
			Static275.aByteArrayArrayArray8 = new byte[4][Static126.anInt2569][Static190.anInt3697];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static126.anInt2569; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static190.anInt3697; local22++) {
					Static275.aByteArrayArrayArray8[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII)Z")
	public static boolean method1679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static169.method2493(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static372.anInt7558;
			@Pc(14) int local14 = arg2 << Static372.anInt7558;
			return Static48.method1023(local10 + 1, Static346.aClass146Array2[arg0].I(arg1, arg2) + arg3, local14 + 1) && Static48.method1023(local10 + Static205.anInt3908 - 1, Static346.aClass146Array2[arg0].I(arg1 + 1, arg2) + arg3, local14 + 1) && Static48.method1023(local10 + Static205.anInt3908 - 1, Static346.aClass146Array2[arg0].I(arg1 + 1, arg2 + 1) + arg3, local14 + Static205.anInt3908 - 1) && Static48.method1023(local10 + 1, Static346.aClass146Array2[arg0].I(arg1, arg2 + 1) + arg3, local14 + Static205.anInt3908 - 1);
		} else {
			return false;
		}
	}
}
