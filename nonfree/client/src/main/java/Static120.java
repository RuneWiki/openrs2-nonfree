import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!he", name = "b", descriptor = "I")
	public static int anInt2343;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "Lclient!js;")
	public static Class105 aClass105_1;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Lclient!tc;")
	public static final Class195 aClass195_21 = new Class195();

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString97 = " from your friend list first.";

	@OriginalMember(owner = "client!he", name = "e", descriptor = "[I")
	public static final int[] anIntArray287 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!he", name = "f", descriptor = "I")
	public static int anInt2345 = 0;

	@OriginalMember(owner = "client!he", name = "j", descriptor = "I")
	public static int anInt2348 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!ek;III[Z)V")
	public static void method2164(@OriginalArg(0) Class1_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static7.aClass41Array1 == Static236.aClass41Array4) {
			return;
		}
		@Pc(9) int local9 = Static288.aClass41Array5[arg1].method5433(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class41 local22 = Static288.aClass41Array5[local11];
				if (local22 != null) {
					local22.method5417(arg0, arg2, local9 - local22.method5433(arg2, arg3), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!rg;BIILclient!lf;IILclient!tm;)V")
	public static void method2166(@OriginalArg(0) Class177 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class90 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class97 arg6) {
		if (arg3 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static81.anInt1609 == 4) {
			local16 = (int) Static304.aFloat110 & 0x3FFF;
		} else {
			local16 = (int) Static304.aFloat110 + Static277.anInt6206 & 0x3FFF;
		}
		@Pc(43) int local43 = Math.max(arg0.anInt5179 / 2, arg0.anInt5209 / 2) + 10;
		@Pc(51) int local51 = arg2 * arg2 + arg1 * arg1;
		if (local43 * local43 < local51) {
			return;
		}
		@Pc(65) int local65 = Class1_Sub1_Sub16.anIntArray587[local16];
		@Pc(69) int local69 = Class1_Sub1_Sub16.anIntArray586[local16];
		if (Static81.anInt1609 != 4) {
			local69 = local69 * 256 / (Static311.anInt5996 + 256);
			local65 = local65 * 256 / (Static311.anInt5996 + 256);
		}
		@Pc(98) int local98 = arg1 * local69 + arg2 * local65 >> 15;
		@Pc(109) int local109 = arg2 * local69 - local65 * arg1 >> 15;
		arg3.method5469(arg4 + arg0.anInt5179 / 2 + local98 - arg3.method5464() / 2, arg0.anInt5209 / 2 + arg5 - (local109 + arg3.method5467() / 2), arg6, arg4, arg5);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II[II[Ljava/lang/Object;)V")
	public static void method2167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg0) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) int local25 = arg2[local19];
		arg2[local19] = arg2[arg1];
		arg2[arg1] = local25;
		@Pc(39) Object local39 = arg3[local19];
		arg3[local19] = arg3[arg1];
		arg3[arg1] = local39;
		for (@Pc(51) int local51 = arg0; local51 < arg1; local51++) {
			if ((local51 & 0x1) + local25 > arg2[local51]) {
				@Pc(70) int local70 = arg2[local51];
				arg2[local51] = arg2[local21];
				arg2[local21] = local70;
				@Pc(84) Object local84 = arg3[local51];
				arg3[local51] = arg3[local21];
				arg3[local21++] = local84;
			}
		}
		arg2[arg1] = arg2[local21];
		arg2[local21] = local25;
		arg3[arg1] = arg3[local21];
		arg3[local21] = local39;
		method2167(arg0, local21 - 1, arg2, arg3);
		method2167(local21 + 1, arg1, arg2, arg3);
	}
}
