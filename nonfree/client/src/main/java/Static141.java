import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "F")
	public static float aFloat52 = 0.0F;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIII)V")
	public static void method2400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg1; local12 <= arg2; local12++) {
			Static212.method3267(arg0, arg3, arg4, Class10_Sub10_Sub1.lb[local12]);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
	public static void method2401() {
		Static246.method3591();
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!pb;BI)V")
	public static void method2402(@OriginalArg(0) Class184 arg0, @OriginalArg(2) int arg1) {
		if (Static245.aBoolean299) {
			Static245.aBoolean299 = false;
			arg1 = 0;
		}
		if (Static292.aClass184_1 != null && Static292.aClass184_1.method4243(arg0)) {
			return;
		}
		Static292.aClass184_1 = arg0;
		Static351.aLong207 = Static220.method3314();
		Static274.anInt4796 = arg1;
		Static380.anInt6537 = arg1;
		if (Static380.anInt6537 == 0) {
			Static63.method1059();
			return;
		}
		Static23.aFloat124 = Static349.aFloat105;
		Static310.aFloat99 = Static227.aFloat63;
		Static419.aFloat120 = Static238.aFloat71;
		Static114.anInt2296 = Static137.anInt2872;
		Static164.aFloat67 = Static61.aFloat15;
		Static17.anInt314 = Static446.anInt7495;
		Static429.aClass30_8 = Static447.aClass30_7;
		Static447.anInt6544 = Static386.anInt6594;
		Static40.aFloat11 = Static119.aFloat43;
		Static384.aFloat110 = Static322.aFloat102;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIILclient!da;IZ[BI)Lclient!al;")
	public static Class4_Sub1_Sub1 method2403(@OriginalArg(1) int arg0, @OriginalArg(3) Class50_Sub1 arg1, @OriginalArg(6) byte[] arg2, @OriginalArg(7) int arg3) {
		if (arg1.aBoolean88 || Static131.method2284(arg0) && Static131.method2284(arg3)) {
			return new Class4_Sub1_Sub1(arg1, 3553, 6406, arg0, arg3, false, arg2, 6406);
		} else if (arg1.aBoolean92) {
			return new Class4_Sub1_Sub1(arg1, 34037, 6406, arg0, arg3, false, arg2, 6406);
		} else {
			return new Class4_Sub1_Sub1(arg1, 6406, arg0, arg3, Static186.method3002(arg0), Static186.method3002(arg3), arg2, 6406);
		}
	}
}
