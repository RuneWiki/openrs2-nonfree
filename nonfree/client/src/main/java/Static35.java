import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bfa", name = "v", descriptor = "Lclient!uo;")
	public static Class343 aClass343_1;

	@OriginalMember(owner = "client!bfa", name = "x", descriptor = "Lclient!kha;")
	public static Class181 aClass181_3;

	@OriginalMember(owner = "client!bfa", name = "y", descriptor = "Lclient!kha;")
	public static Class181 aClass181_4;

	@OriginalMember(owner = "client!bfa", name = "s", descriptor = "Lclient!an;")
	public static final Class20 aClass20_4 = new Class20(6, 2);

	@OriginalMember(owner = "client!bfa", name = "w", descriptor = "Lclient!us;")
	public static final Class344 aClass344_13 = new Class344(22, 7);

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "([Ljava/lang/Object;[JI)V")
	public static void method696(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1) {
		Static100.method2542(arg1.length - 1, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method697(@OriginalArg(1) String arg0) {
		if (!Static82.aBoolean192 || (Static607.anInt10027 & 0x18) == 0) {
			return;
		}
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = Static385.anInt10557;
		@Pc(21) int[] local21 = Static493.anIntArray555;
		for (@Pc(27) int local27 = 0; local27 < local19; local27++) {
			@Pc(35) Class2_Sub3_Sub1_Sub2_Sub2 local35 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local21[local27]];
			if (local35.aString68 != null && local35.aString68.equalsIgnoreCase(arg0) && (local35 == Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2 && (Static607.anInt10027 & 0x10) != 0 || local35 != null && (Static607.anInt10027 & 0x8) != 0)) {
				@Pc(68) Class3_Sub26 local68 = Static640.method8636(Static125.aClass344_53, Static403.aClass294_3);
				local68.aClass3_Sub15_Sub1_3.method8408(Static60.anInt1272);
				local68.aClass3_Sub15_Sub1_3.method8441(0);
				local68.aClass3_Sub15_Sub1_3.method8408(local21[local27]);
				local68.aClass3_Sub15_Sub1_3.method8419(Static461.anInt8388);
				local68.aClass3_Sub15_Sub1_3.method8423(Static33.anInt612);
				Static472.method5189(local68);
				local17 = true;
				Static167.method3514(0, 0, true, local35.method5308(), -2, local35.anIntArray377[0], local35.method5308(), local35.anIntArray378[0]);
				break;
			}
		}
		if (!local17) {
			Static496.method7251(Static287.aClass176_21.method4986(Static380.anInt7247) + arg0);
		}
		if (Static82.aBoolean192) {
			Static32.method596();
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "([FII[FBFIIIII)V")
	public static void method700(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg8 - arg7;
		@Pc(13) int local13 = arg6 - arg9;
		@Pc(17) int local17 = arg1 - arg5;
		@Pc(38) float local38 = (float) local5 * arg3[0] + arg3[1] * (float) local17 + arg3[2] * (float) local13;
		@Pc(59) float local59 = (float) local13 * arg3[5] + (float) local17 * arg3[4] + (float) local5 * arg3[3];
		@Pc(80) float local80 = (float) local13 * arg3[8] + arg3[7] * (float) local17 + arg3[6] * (float) local5;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(127) float local127 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg4 + 0.5F;
		@Pc(134) float local134;
		if (arg2 == 1) {
			local134 = local106;
			local106 = -local127;
			local127 = local134;
		} else if (arg2 == 2) {
			local127 = -local127;
			local106 = -local106;
		} else if (arg2 == 3) {
			local134 = local106;
			local106 = local127;
			local127 = -local134;
		}
		arg0[1] = local127;
		arg0[0] = local106;
	}
}
