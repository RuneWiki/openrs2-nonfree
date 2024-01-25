import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!vea", name = "wb", descriptor = "I")
	public static int anInt9318;

	@OriginalMember(owner = "client!vea", name = "xb", descriptor = "I")
	public static int anInt9319;

	@OriginalMember(owner = "client!vea", name = "Ab", descriptor = "[I")
	public static final int[] anIntArray701 = new int[6];

	@OriginalMember(owner = "client!vea", name = "Eb", descriptor = "[F")
	public static final float[] aFloatArray67 = new float[4];

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method7654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static112.aClass16Array3 == null) {
			return;
		}
		@Pc(8) Class10_Sub1_Sub2 local8 = null;
		@Pc(14) int local14;
		if (arg5 >= 0) {
			local14 = arg5 - 1;
			@Pc(21) Class4_Sub50 local21 = (Class4_Sub50) Static106.aClass183_8.method4289((long) local14);
			if (local21 != null) {
				local8 = local21.aClass10_Sub1_Sub2_Sub1_1;
			}
		} else {
			local14 = -arg5 - 1;
			if (local14 == Static416.anInt7186) {
				local8 = Static129.aClass10_Sub1_Sub2_Sub2_1;
			} else {
				local8 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local14];
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(54) Class25 local54 = Static553.aClass288_4.method6419(arg4);
		@Pc(67) int local67;
		@Pc(70) int local70;
		if (arg0 == 1 || arg0 == 3) {
			local67 = local54.anInt612;
			local70 = local54.anInt638;
		} else {
			local70 = local54.anInt612;
			local67 = local54.anInt638;
		}
		@Pc(84) int local84 = (local70 >> 1) + arg8;
		@Pc(92) int local92 = arg8 + (local70 + 1 >> 1);
		@Pc(98) int local98 = (local67 >> 1) + arg2;
		@Pc(106) int local106 = arg2 + (local67 + 1 >> 1);
		@Pc(110) Class16 local110 = Static112.aClass16Array3[arg1];
		@Pc(133) int local133 = local110.JA(local84, local98) + local110.JA(local92, local98) + local110.JA(local84, local106) + local110.JA(local92, local106) >> 2;
		@Pc(137) Class4_Sub44 local137 = new Class4_Sub44();
		local137.anInt8032 = arg9;
		local137.anInt8041 = arg0;
		local137.anInt8040 = arg3 + Static237.anInt7561;
		local137.anInt8042 = arg8;
		local137.anInt8044 = local8.aByte101;
		@Pc(164) int local164;
		if (arg7 > arg11) {
			local164 = arg7;
			arg7 = arg11;
			arg11 = local164;
		}
		local137.anInt8043 = arg4;
		local137.anInt8047 = arg2;
		local137.anInt8046 = Static237.anInt7561 + arg6;
		local137.anInt8045 = arg8 + arg7;
		if (arg10 > arg12) {
			local164 = arg10;
			arg10 = arg12;
			arg12 = local164;
		}
		local137.anInt8036 = arg11 + arg8;
		local137.anInt8037 = arg12 + arg2;
		local137.anInt8030 = arg10 + arg2;
		local137.anInt8031 = local133;
		local137.anInt8035 = (local137.anInt8042 << 9) + (local70 << 8);
		local137.anInt8038 = (local137.anInt8047 << 9) + (local67 << 8);
		Static565.aClass124_65.method3275(local137);
		local8.aClass4_Sub44_3 = local137;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(III)Z")
	public static boolean method7655(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
