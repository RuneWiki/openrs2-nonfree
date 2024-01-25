import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!mh", name = "Z", descriptor = "Lclient!oa;")
	public static Class105 aClass105_4;

	@OriginalMember(owner = "client!mh", name = "K", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!mh", name = "bb", descriptor = "I")
	public static final int anInt4488 = 1401;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIFIIFIIII[FF)V")
	public static void method3380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float[] arg10, @OriginalArg(12) float arg11) {
		@Pc(5) int local5 = arg7 - arg0;
		@Pc(9) int local9 = arg8 - arg2;
		@Pc(13) int local13 = arg9 - arg4;
		@Pc(38) float local38 = arg10[0] * (float) local9 + (float) local5 * arg10[1] + arg10[2] * (float) local13;
		@Pc(59) float local59 = (float) local9 * arg10[3] + arg10[4] * (float) local5 + (float) local13 * arg10[5];
		@Pc(80) float local80 = arg10[7] * (float) local5 + arg10[6] * (float) local9 + (float) local13 * arg10[8];
		@Pc(108) float local108;
		@Pc(115) float local115;
		if (arg1 == 0) {
			local115 = arg6 + 0.5F - local80;
			local108 = local38 + arg11 + 0.5F;
		} else if (arg1 == 1) {
			local108 = local38 + arg11 + 0.5F;
			local115 = local80 + arg6 + 0.5F;
		} else if (arg1 == 2) {
			local108 = arg11 + 0.5F - local38;
			local115 = arg3 + 0.5F - local59;
		} else if (arg1 == 3) {
			local115 = arg3 + 0.5F - local59;
			local108 = local38 + arg11 + 0.5F;
		} else if (arg1 == 4) {
			local108 = arg6 + local80 + 0.5F;
			local115 = arg3 + 0.5F - local59;
		} else {
			local108 = arg6 + 0.5F - local80;
			local115 = arg3 + 0.5F - local59;
		}
		@Pc(211) float local211;
		if (arg5 == 1) {
			local211 = local108;
			local108 = -local115;
			local115 = local211;
		} else if (arg5 == 2) {
			local115 = -local115;
			local108 = -local108;
		} else if (arg5 == 3) {
			local211 = local108;
			local108 = local115;
			local115 = -local211;
		}
		Static249.aFloat126 = local108;
		Static43.aFloat7 = local115;
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(B)V")
	public static void method3381() {
		Static246.aClass200Array1 = new Class200[50];
		Static425.anInt7124 = 0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILclient!ap;IIII)V")
	public static void method3384(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub2_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		Static345.method4818(arg0, arg1.anInt6061, arg2, 0, arg3, arg1.anInt6062, arg1.aByte86);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static360.method5003(Static387.anInt6727, Static388.anInt6740, arg3);
		@Pc(17) int local17 = Static360.method5003(Static387.anInt6727, Static388.anInt6740, arg5);
		@Pc(40) int local40 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg1);
		@Pc(48) int local48 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg6);
		@Pc(56) int local56 = Static360.method5003(Static387.anInt6727, Static388.anInt6740, arg0 + arg3);
		@Pc(65) int local65 = Static360.method5003(Static387.anInt6727, Static388.anInt6740, arg5 - arg0);
		for (@Pc(67) int local67 = local11; local67 < local56; local67++) {
			Static335.method4533(local48, arg4, local40, Static162.anIntArrayArray58[local67]);
		}
		for (@Pc(89) int local89 = local17; local89 > local65; local89--) {
			Static335.method4533(local48, arg4, local40, Static162.anIntArrayArray58[local89]);
		}
		@Pc(114) int local114 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg1 + arg0);
		@Pc(123) int local123 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg6 - arg0);
		for (@Pc(125) int local125 = local56; local125 <= local65; local125++) {
			@Pc(131) int[] local131 = Static162.anIntArrayArray58[local125];
			Static335.method4533(local114, arg4, local40, local131);
			Static335.method4533(local123, arg2, local114, local131);
			Static335.method4533(local48, arg4, local123, local131);
		}
	}

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)V")
	public static void method3386() {
		if (Static78.aClass108_4 == null) {
			return;
		}
		if (Static78.aClass108_4.anInt2803 == 1) {
			Static78.aClass108_4 = null;
			return;
		}
		if (Static78.aClass108_4.anInt2803 == 2) {
			Static277.method3726(2, Static29.aClass114_2, Static67.aString19);
			Static78.aClass108_4 = null;
			return;
		}
	}
}
