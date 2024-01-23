import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
	public static int anInt2853;

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "[I")
	public static int[] anIntArray240 = new int[50];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIBLclient!fg;ILclient!hi;IILjava/lang/String;)V")
	public static void method2454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class1_Sub2_Sub6 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class66 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) String arg8) {
		@Pc(12) int local12 = Static189.anInt3613 + (int) Static49.aFloat32 & 0x7FF;
		@Pc(24) int local24 = Math.max(arg5.anInt2204 / 2, arg5.anInt2207 / 2) + 10;
		@Pc(33) int local33 = arg1 * arg1 + arg6 * arg6;
		if (local33 > local24 * local24) {
			return;
		}
		@Pc(47) int local47 = Class135.anIntArray335[local12];
		@Pc(55) int local55 = local47 * 256 / (Static309.anInt5618 + 256);
		@Pc(59) int local59 = Class135.anIntArray338[local12];
		@Pc(67) int local67 = local59 * 256 / (Static309.anInt5618 + 256);
		@Pc(78) int local78 = arg6 * local67 - local55 * arg1 >> 16;
		@Pc(83) int local83 = arg3.method4020(arg8, 100);
		@Pc(99) int local99 = arg6 * local55 + local67 * arg1 >> 16;
		@Pc(105) int local105 = arg3.method4009(arg8);
		@Pc(111) int local111 = local99 - local83 / 2;
		if (-arg5.anInt2204 > local111 || local111 > arg5.anInt2204 || local78 < -arg5.anInt2207 || local78 > arg5.anInt2207) {
			return;
		}
		if (Static156.aBoolean211) {
			Static119.method2128((Class1_Sub2_Sub1_Sub1) arg5.method1920(false));
		} else {
			Static25.method403(arg5.anIntArray198, arg5.anIntArray190);
		}
		arg3.method4015(arg8, arg7 + local111 + arg5.anInt2204 / 2, -local105 + -arg0 + -local78 + arg4 + arg5.anInt2207 / 2, local83, 50, arg2, 0, 1, 0, 0);
		if (Static156.aBoolean211) {
			Static119.method2133();
		} else {
			Static25.method390();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B[I)[I")
	public static int[] method2456(@OriginalArg(1) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(17) int[] local17 = new int[arg0.length];
			Static319.method1771(arg0, 0, local17, 0, arg0.length);
			return local17;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ICBLjava/lang/StringBuffer;)Ljava/lang/StringBuffer;")
	public static StringBuffer method2459(@OriginalArg(3) StringBuffer arg0) {
		@Pc(8) int local8 = arg0.length();
		arg0.setLength(0);
		for (@Pc(13) int local13 = local8; local13 < 0; local13++) {
			arg0.setCharAt(local13, ' ');
		}
		return arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILclient!nk;Lclient!nk;I)Lclient!jh;")
	public static Class1_Sub2_Sub6_Sub1 method2461(@OriginalArg(1) int arg0, @OriginalArg(2) Class121 arg1, @OriginalArg(3) Class121 arg2) {
		return Static313.method2575(arg0, 0, arg2) ? Static248.method3930(arg1.method3115(arg0, 0)) : null;
	}
}
