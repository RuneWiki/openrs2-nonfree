import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!id", name = "j", descriptor = "Lclient!pl;")
	public static Class259 aClass259_65;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Z")
	public static boolean aBoolean339 = false;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "I")
	public static int anInt4141 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIZI[B)V")
	public static void method3473(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(15) int local15 = arg0 - arg2 >> 2;
		arg1 += arg2;
		while (true) {
			local15--;
			if (local15 < 0) {
				local15 = arg0 - arg2 & 0x3;
				while (true) {
					local15--;
					if (local15 < 0) {
						return;
					}
					arg3[arg1++] = 1;
				}
			}
			@Pc(29) int local29 = arg1 + 1;
			arg3[arg1] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg3[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg3[local34] = 1;
			arg1 = local39 + 1;
			arg3[local39] = 1;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method3475() {
		Static109.aClass59_4.method1142();
		Static116.aClass173_4.method3821();
		Static8.aClass57_1.method1130();
		Static541.aClass97_4.method1789();
		Static254.aClass202_2.method4489();
		Static296.aClass218_1.method5059();
		Static116.aClass140_2.method3283();
		Static215.aClass33_1.method581();
		Static49.aClass282_1.method6476();
		Static146.aClass7_1.method166();
		Static207.aClass354_1.method7799();
		Static205.aClass25_3.method439();
		Static165.aClass306_3.method6833();
		Static241.aClass82_1.method1499();
		Static590.aClass158_1.method3497();
		Static197.aClass147_1.method3351();
		Static416.aClass232_1.method5410();
		Static317.aClass41_1.method789();
		Static156.aClass273_6.method6377();
		Static23.aClass24_1.method429();
		Static156.method7060();
		Static211.method6706();
		Static515.method7131();
		Static16.method313();
		Static422.method6079();
		Static333.aClass313_36.method6982(5);
		Static162.aClass313_20.method6982(5);
		Static46.aClass313_12.method6982(5);
		Static574.aClass313_60.method6982(5);
		Static552.aClass313_58.method6982(5);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IBILjava/lang/Object;)[B")
	public static byte[] method3476(@OriginalArg(2) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static94.method1468(local13, arg0);
		} else if (arg1 instanceof Class195) {
			@Pc(25) Class195 local25 = (Class195) arg1;
			return local25.method5285(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIB)V")
	public static void method3478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 - arg3 >= Static553.anInt9074 && arg3 + arg0 <= Static249.anInt4668 && Static326.anInt6028 <= arg1 - arg3 && Static80.anInt1738 >= arg3 + arg1) {
			Static524.method7219(arg3, arg1, arg2, arg0);
		} else {
			Static366.method5437(arg3, arg1, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZII)V")
	public static void method3479(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(16, arg0);
		local8.method6098();
		local8.anInt7258 = arg1;
	}
}
