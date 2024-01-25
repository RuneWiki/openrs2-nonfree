import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!mu", name = "i", descriptor = "Lclient!dga;")
	public static Class65 aClass65_142;

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "[I")
	public static final int[] anIntArray846 = new int[200];

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
	public static int anInt9799 = -1;

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "(I)[Lclient!bi;")
	public static Class34[] method8153() {
		if (Static116.aClass34Array1 == null) {
			@Pc(16) Class34[] local16 = Static465.method7169(Static414.aClass246_5);
			@Pc(20) Class34[] local20 = new Class34[local16.length];
			@Pc(22) int local22 = 0;
			@Pc(27) int local27 = Static104.aClass6_Sub6_Sub1_4.method1084(Static5.anInt145);
			@Pc(89) int local89;
			@Pc(95) Class34 local95;
			label69: for (@Pc(29) int local29 = 0; local29 < local16.length; local29++) {
				@Pc(35) Class34 local35 = local16[local29];
				if ((local35.anInt1203 <= 0 || local35.anInt1203 >= 24) && local35.anInt1205 >= 800 && local35.anInt1207 >= 600 && (local27 != 2 || local35.anInt1205 <= 800 && local35.anInt1207 <= 600) && (local27 != 1 || local35.anInt1205 <= 1024 && local35.anInt1207 <= 768)) {
					for (local89 = 0; local89 < local22; local89++) {
						local95 = local20[local89];
						if (local95.anInt1205 == local35.anInt1205 && local35.anInt1207 == local95.anInt1207) {
							if (local35.anInt1203 > local95.anInt1203) {
								local20[local89] = local35;
							}
							continue label69;
						}
					}
					local20[local22] = local35;
					local22++;
				}
			}
			Static116.aClass34Array1 = new Class34[local22];
			Static589.method5380(local20, 0, Static116.aClass34Array1, 0, local22);
			@Pc(155) int[] local155 = new int[Static116.aClass34Array1.length];
			for (local89 = 0; local89 < Static116.aClass34Array1.length; local89++) {
				local95 = Static116.aClass34Array1[local89];
				local155[local89] = local95.anInt1207 * local95.anInt1205;
			}
			Static77.method1702(Static116.aClass34Array1, local155);
		}
		return Static116.aClass34Array1;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(FIIIIFIIIF[FII)V")
	public static void method8154(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) float[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg4 - arg6;
		@Pc(9) int local9 = arg1 - arg10;
		@Pc(17) int local17 = arg3 - arg11;
		@Pc(38) float local38 = (float) local9 * arg9[0] + arg9[1] * (float) local5 + (float) local17 * arg9[2];
		@Pc(65) float local65 = arg9[5] * (float) local17 + (float) local9 * arg9[3] + (float) local5 * arg9[4];
		@Pc(86) float local86 = arg9[6] * (float) local9 + (float) local5 * arg9[7] + (float) local17 * arg9[8];
		@Pc(94) float local94;
		@Pc(101) float local101;
		if (arg7 == 0) {
			local94 = local38 + arg8 + 0.5F;
			local101 = arg0 + 0.5F - local86;
		} else if (arg7 == 1) {
			local94 = local38 + arg8 + 0.5F;
			local101 = local86 + arg0 + 0.5F;
		} else if (arg7 == 2) {
			local94 = arg8 + 0.5F - local38;
			local101 = arg5 + 0.5F - local65;
		} else if (arg7 == 3) {
			local94 = arg8 + local38 + 0.5F;
			local101 = arg5 + 0.5F - local65;
		} else if (arg7 == 4) {
			local101 = arg5 + 0.5F - local65;
			local94 = arg0 + local86 + 0.5F;
		} else {
			local101 = arg5 + 0.5F - local65;
			local94 = arg0 + 0.5F - local86;
		}
		@Pc(204) float local204;
		if (arg2 == 1) {
			local204 = local94;
			local94 = -local101;
			local101 = local204;
		} else if (arg2 == 2) {
			local94 = -local94;
			local101 = -local101;
		} else if (arg2 == 3) {
			local204 = local94;
			local94 = local101;
			local101 = -local204;
		}
		Static406.aFloat204 = local101;
		Static514.aFloat190 = local94;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)Z")
	public static boolean method8155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static151.method2917(arg0, arg1)) {
			return Static445.method6833(arg1, arg0) | (arg1 & 0x9000) != 0 | Static261.method4523(arg0, arg1) ? true : (arg0 & 0x37) == 0 & ((arg1 & 0x2000) != 0 | Static396.method6260(arg0, arg1) | Static393.method6186(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mu", name = "g", descriptor = "(I)V")
	public static void method8156() {
		Static302.aBoolean510 = false;
		Static64.aClipboard1 = null;
		Static101.method2148();
	}
}
