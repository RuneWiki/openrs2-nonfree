import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!o", name = "O", descriptor = "[Lclient!at;")
	public static Class15[] aClass15Array2;

	@OriginalMember(owner = "client!o", name = "Q", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!o", name = "S", descriptor = "I")
	private static int anInt972;

	@OriginalMember(owner = "client!o", name = "T", descriptor = "I")
	private static int anInt973;

	@OriginalMember(owner = "client!o", name = "U", descriptor = "Z")
	private static boolean aBoolean90;

	@OriginalMember(owner = "client!o", name = "V", descriptor = "Z")
	private static boolean aBoolean91;

	@OriginalMember(owner = "client!o", name = "x", descriptor = "Lclient!gn;")
	public static final Class84 aClass84_4 = new Class84();

	@OriginalMember(owner = "client!o", name = "N", descriptor = "Lclient!pn;")
	public static final Class186 aClass186_3 = new Class186("", 14);

	@OriginalMember(owner = "client!o", name = "P", descriptor = "I")
	public static int anInt970 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "()V")
	public static void method873() {
		for (@Pc(1) int local1 = 0; local1 < Static1.anInt6; local1++) {
			@Pc(6) Class16_Sub1 local6 = Static427.aClass16_Sub1Array3[local1];
			Static190.method2978(local6);
			Static427.aClass16_Sub1Array3[local1] = null;
		}
		Static1.anInt6 = 0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IFIII[FIIFII)V")
	public static void method875(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg3 - arg2;
		@Pc(13) int local13 = arg5 - arg6;
		@Pc(17) int local17 = arg0 - arg9;
		@Pc(38) float local38 = (float) local17 * arg4[2] + (float) local5 * arg4[1] + arg4[0] * (float) local13;
		@Pc(59) float local59 = arg4[3] * (float) local13 + (float) local5 * arg4[4] + arg4[5] * (float) local17;
		@Pc(80) float local80 = arg4[7] * (float) local5 + (float) local13 * arg4[6] + arg4[8] * (float) local17;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local91 *= arg7;
		}
		@Pc(105) float local105 = arg1 + local59 + 0.5F;
		@Pc(112) float local112;
		if (arg8 == 1) {
			local112 = local91;
			local91 = -local105;
			local105 = local112;
		} else if (arg8 == 2) {
			local91 = -local91;
			local105 = -local105;
		} else if (arg8 == 3) {
			local112 = local91;
			local91 = local105;
			local105 = -local112;
		}
		Static244.aFloat102 = local105;
		Static403.aFloat211 = local91;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIBIZI)V")
	public static void method878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		@Pc(21) int local21 = arg4 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(43) int local43 = (Static128.aShort24 - Static298.aShort67) * local21 / 100 + Static298.aShort67;
		if (Static291.aShort66 > local43) {
			local43 = Static291.aShort66;
		} else if (local43 > Static110.aShort18) {
			local43 = Static110.aShort18;
		}
		@Pc(69) int local69 = arg4 * 512 * local43 / (arg1 * 334);
		@Pc(106) int local106;
		@Pc(112) int local112;
		@Pc(81) short local81;
		if (Static113.aShort19 > local69) {
			local81 = Static113.aShort19;
			local43 = arg1 * local81 * 334 / (arg4 * 512);
			if (local43 > Static110.aShort18) {
				local43 = Static110.aShort18;
				local106 = arg4 * local43 * 512 / (local81 * 334);
				local112 = (arg1 - local106) / 2;
				if (arg3) {
					Static122.aClass19_16.e();
					Static122.aClass19_16.method4293(arg2, local112, arg0, -16777216, arg4);
					Static122.aClass19_16.method4293(arg2 + arg1 - local112, local112, arg0, -16777216, arg4);
				}
				arg2 += local112;
				arg1 -= local112 * 2;
			}
		} else if (Static409.aShort100 < local69) {
			local81 = Static409.aShort100;
			local43 = local81 * 334 * arg1 / (arg4 * 512);
			if (local43 < Static291.aShort66) {
				local43 = Static291.aShort66;
				local106 = local81 * 334 * arg1 / (local43 * 512);
				local112 = (arg4 - local106) / 2;
				if (arg3) {
					Static122.aClass19_16.e();
					Static122.aClass19_16.method4293(arg2, arg1, arg0, -16777216, local112);
					Static122.aClass19_16.method4293(arg2, arg1, arg4 + arg0 - local112, -16777216, local112);
				}
				arg4 -= local112 * 2;
				arg0 += local112;
			}
		}
		Static219.anInt6458 = local43 * arg4 / 334;
		Static120.anInt2574 = arg0;
		Static119.anInt2527 = (short) arg4;
		Static329.anInt5685 = (short) arg1;
		Static120.anInt2600 = arg2;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI[B)I")
	public static int method879(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static179.method2846(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
	public static void method882(@OriginalArg(0) int arg0) {
		Static358.anInt6251 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static422.anInt6945; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static171.anInt3361; local6++) {
				if (Static202.aClass164ArrayArrayArray5[arg0][local3][local6] == null) {
					Static202.aClass164ArrayArrayArray5[arg0][local3][local6] = new Class164(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
	public static void method884() {
		for (@Pc(11) int local11 = 0; local11 < Static12.anInt163; local11++) {
			@Pc(17) int local17 = Static342.anIntArray412[local11];
			@Pc(21) Class16_Sub1_Sub5_Sub2 local21 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local17];
			if (local21 != null) {
				Static44.method761(local21.aClass264_1.anInt7201, local21);
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "providesignlink", descriptor = "(Lclient!et;)V")
	private static void method888(@OriginalArg(0) Class66 arg0) {
		Static206.aClass66_4 = arg0;
		Static386.aClass66_5 = arg0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)V")
	public static void method889(@OriginalArg(0) int arg0) {
		Static314.anInt5475 = arg0;
		Static182.aClass68_19.method1777();
	}
}
